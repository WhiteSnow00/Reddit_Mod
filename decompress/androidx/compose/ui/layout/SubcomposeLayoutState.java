// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.layout;

import java.util.LinkedHashMap;
import z0.d;
import ng2.e;
import c2.r;
import c2.w;
import u2.a;
import c2.l0;
import z0.g;
import cg2.j;
import androidx.compose.ui.node.LayoutNode;
import mg2.p;
import c2.m0;

public final class SubcomposeLayoutState
{
    public final m0 a;
    public b b;
    public final p<LayoutNode, SubcomposeLayoutState, j> c;
    public final p<LayoutNode, g, j> d;
    public final p<LayoutNode, p<? super l0, ? super u2.a, ? extends w>, j> e;
    
    public SubcomposeLayoutState() {
        this((m0)dg.l0.r);
    }
    
    public SubcomposeLayoutState(final m0 a) {
        this.a = a;
        this.c = (p<LayoutNode, SubcomposeLayoutState, j>)new SubcomposeLayoutState$setRoot$1(this);
        this.d = (p<LayoutNode, g, j>)new SubcomposeLayoutState$setCompositionContext$1(this);
        this.e = (p<LayoutNode, p<? super l0, ? super u2.a, ? extends w>, j>)new SubcomposeLayoutState$setMeasurePolicy$1(this);
    }
    
    public final b a() {
        final b b = this.b;
        if (b != null) {
            return b;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout".toString());
    }
    
    public final r b(final Object o, final p p2) {
        ng2.e.f((Object)p2, "content");
        final b a = this.a();
        a.b();
        if (!a.f.containsKey(o)) {
            final LinkedHashMap h = a.h;
            Object o2;
            if ((o2 = h.get(o)) == null) {
                o2 = a.d(o);
                if (o2 != null) {
                    final int index = a.a.w().indexOf(o2);
                    final int size = a.a.w().size();
                    final LayoutNode a2 = a.a;
                    a2.o = true;
                    a2.L(index, size, 1);
                    a2.o = false;
                    ++a.k;
                }
                else {
                    final int size2 = a.a.w().size();
                    o2 = new LayoutNode(2, true);
                    final LayoutNode a3 = a.a;
                    a3.o = true;
                    a3.B(size2, (LayoutNode)o2);
                    a3.o = false;
                    ++a.k;
                }
                h.put(o, o2);
            }
            a.c((LayoutNode)o2, o, (p<? super d, ? super Integer, j>)p2);
        }
        return new r(a, o);
    }
    
    public interface a
    {
        default int a() {
            return 0;
        }
        
        default void b(final int n, final long n2) {
        }
        
        void dispose();
    }
}
