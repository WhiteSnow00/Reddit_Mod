// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.node;

import cg2.j;
import mg2.p;
import mg2.a;
import c2.v;
import u2.b;
import androidx.compose.ui.platform.k1;
import androidx.compose.ui.unit.LayoutDirection;
import j1.d;

public interface ComposeUiNode
{
    public static final Companion M2 = Companion.a;
    
    void d(final d p0);
    
    void e(final LayoutDirection p0);
    
    void i(final k1 p0);
    
    void k(final b p0);
    
    void l(final v p0);
    
    public static final class Companion
    {
        public static final Companion a;
        public static final a<ComposeUiNode> b;
        public static final p<ComposeUiNode, d, j> c;
        public static final p<ComposeUiNode, b, j> d;
        public static final p<ComposeUiNode, v, j> e;
        public static final p<ComposeUiNode, LayoutDirection, j> f;
        public static final p<ComposeUiNode, k1, j> g;
        
        static {
            a = new Companion();
            final LayoutNode$c r = LayoutNode.R;
            b = LayoutNode.S;
            final ComposeUiNode$Companion$VirtualConstructor$1 instance = ComposeUiNode$Companion$VirtualConstructor$1.INSTANCE;
            c = (p)ComposeUiNode$Companion$SetModifier$1.INSTANCE;
            d = (p)ComposeUiNode$Companion$SetDensity$1.INSTANCE;
            e = (p)ComposeUiNode$Companion$SetMeasurePolicy$1.INSTANCE;
            f = (p)ComposeUiNode$Companion$SetLayoutDirection$1.INSTANCE;
            g = (p)ComposeUiNode$Companion$SetViewConfiguration$1.INSTANCE;
        }
    }
}
