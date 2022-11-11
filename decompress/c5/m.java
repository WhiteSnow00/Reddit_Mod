// 
// Decompiled by Procyon v0.6.0
// 

package c5;

import java.util.Iterator;
import hj2.e;
import bg.d;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.StateFlowImpl;
import hg2.j;
import rg2.l;
import java.util.concurrent.CopyOnWriteArrayList;

public final class m
{
    public boolean a;
    public final CopyOnWriteArrayList<l<b, j>> b;
    public k c;
    public k d;
    public k e;
    public c5.l f;
    public c5.l g;
    public final StateFlowImpl h;
    public final FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 i;
    
    public m() {
        this.b = new CopyOnWriteArrayList<l<b, j>>();
        final k.c c = k.c.c;
        this.c = c;
        this.d = c;
        this.e = c;
        this.f = c5.l.d;
        final StateFlowImpl n = bg.d.n((Object)null);
        this.h = n;
        this.i = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1((e)n);
    }
    
    public static k a(k k, final k i, final k j, final k l) {
        if (l == null) {
            return j;
        }
        if (k instanceof k.b) {
            if (!(i instanceof k.c) || !(l instanceof k.c)) {
                if (!(l instanceof k.a)) {
                    return k;
                }
            }
        }
        k = l;
        return k;
    }
    
    public final void b() {
        final k c = this.c;
        final k a = this.f.a;
        final c5.l g = this.g;
        final b b = null;
        k a2;
        if (g == null) {
            a2 = null;
        }
        else {
            a2 = g.a;
        }
        this.c = a(c, a, a, a2);
        final k d = this.d;
        final c5.l f = this.f;
        final k a3 = f.a;
        final k b2 = f.b;
        final c5.l g2 = this.g;
        k b3;
        if (g2 == null) {
            b3 = null;
        }
        else {
            b3 = g2.b;
        }
        this.d = a(d, a3, b2, b3);
        final k e = this.e;
        final c5.l f2 = this.f;
        final k a4 = f2.a;
        final k c2 = f2.c;
        final c5.l g3 = this.g;
        k c3;
        if (g3 == null) {
            c3 = null;
        }
        else {
            c3 = g3.c;
        }
        final k a5 = a(e, a4, c2, c3);
        this.e = a5;
        b value;
        if (!this.a) {
            value = b;
        }
        else {
            value = new b(this.c, this.d, a5, this.f, this.g);
        }
        if (value != null) {
            this.h.setValue((Object)value);
            final Iterator<l<b, j>> iterator = this.b.iterator();
            while (iterator.hasNext()) {
                ((l<b, Object>)iterator.next()).invoke(value);
            }
        }
    }
}
