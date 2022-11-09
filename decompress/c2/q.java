// 
// Decompiled by Procyon v0.6.0
// 

package c2;

import aj2.c;
import a1.e;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.layout.b;
import androidx.compose.ui.layout.SubcomposeLayoutState$a;

public final class q implements SubcomposeLayoutState$a
{
    public final /* synthetic */ b a;
    public final /* synthetic */ Object b;
    
    public q(final b a, final Object b) {
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        final LayoutNode layoutNode = this.a.h.get(this.b);
        if (layoutNode != null) {
            final e v = layoutNode.v();
            if (v != null) {
                return v.h;
            }
        }
        return 0;
    }
    
    public final void b(final int n, final long n2) {
        final LayoutNode layoutNode = this.a.h.get(this.b);
        if (layoutNode != null && layoutNode.B()) {
            final int h = layoutNode.v().h;
            if (n < 0 || n >= h) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Index (");
                sb.append(n);
                sb.append(") is out of bound of [0, ");
                sb.append(h);
                sb.append(')');
                throw new IndexOutOfBoundsException(sb.toString());
            }
            if (!(layoutNode.z ^ true)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            final LayoutNode a = this.a.a;
            a.p = true;
            c.H0(layoutNode).j((LayoutNode)layoutNode.v().f[n], n2);
            a.p = false;
        }
    }
    
    public final void dispose() {
        this.a.b();
        final LayoutNode layoutNode = (LayoutNode)this.a.h.remove(this.b);
        if (layoutNode != null) {
            final b a = this.a;
            if (a.k <= 0) {
                throw new IllegalStateException("Check failed.".toString());
            }
            final int index = ((e.a)a.a.r()).indexOf(layoutNode);
            final int h = ((e.a)this.a.a.r()).f.h;
            final b a2 = this.a;
            final int k = a2.k;
            if (index < h - k) {
                throw new IllegalStateException("Check failed.".toString());
            }
            ++a2.j;
            a2.k = k - 1;
            final int h2 = ((e.a)a2.a.r()).f.h;
            final b a3 = this.a;
            final int n = h2 - a3.k - a3.j;
            final LayoutNode a4 = a3.a;
            a4.p = true;
            a4.J(index, n, 1);
            a4.p = false;
            this.a.a(n);
        }
    }
}
