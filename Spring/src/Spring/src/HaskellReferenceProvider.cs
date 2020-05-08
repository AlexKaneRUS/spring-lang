using System.Collections.Generic;
using System.Linq;
using Antlr4.Runtime.Misc;
using JetBrains.Lifetimes;
using JetBrains.ReSharper.Plugins.Haskell;
using JetBrains.ReSharper.Psi;
using JetBrains.ReSharper.Psi.Caches;
using JetBrains.ReSharper.Psi.Resolve;
using JetBrains.ReSharper.Psi.Tree;

namespace JetBrains.ReSharper.Plugins.Spring
{
    [ReferenceProviderFactory]
    public class HaskellReferenceProvider : IReferenceProviderFactory
    {
        public HaskellReferenceProvider(Lifetime lifetime)
        {
            Changed = new DataFlow.Signal<IReferenceProviderFactory>(lifetime, GetType().FullName);
        }

        public IReferenceFactory CreateFactory(IPsiSourceFile sourceFile, IFile file, IWordIndex wordIndexForChecks)
        {
            if (sourceFile.PrimaryPsiLanguage is SpringLanguage)
            {
                return new HaskellReferenceFactory();
            }

            return null;
        }

        public DataFlow.ISignal<IReferenceProviderFactory> Changed { get; }
    }

    public class HaskellReferenceFactory : IReferenceFactory
    {
        public ReferenceCollection GetReferences(ITreeNode element, ReferenceCollection oldReferences)
        {
            if (!(element is VarNode))
            {
                return ReferenceCollection.Empty;
            }

            return new ReferenceCollection(new List<IReference> {new VarReference((VarNode) element)});
        }

        public bool HasReference(ITreeNode element, IReferenceNameContainer names)
        {
            if (!(element is VarNode && element.Parent is FDecl))
            {
                return false;
            }

            return names.Contains(((VarNode) element).GetText());
        }
    }
}