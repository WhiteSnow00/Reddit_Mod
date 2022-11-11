// 
// Decompiled by Procyon v0.6.0
// 

package androidx.constraintlayout.compose;

import yg.a;
import sg2.e;
import c3.d;
import kotlin.Metadata;
import hg2.j;
import o1.u;
import rg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n" }, d2 = { "Lo1/u;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 5, 1 })
final class Measurer$performLayout$1$layerBlock$1 extends Lambda implements l<u, j>
{
    public final /* synthetic */ c3.d $frame;
    
    public Measurer$performLayout$1$layerBlock$1(final c3.d $frame) {
        this.$frame = $frame;
        super(1);
    }
    
    public final void invoke(final u u) {
        e.f((Object)u, "$this$null");
        if (!Float.isNaN(this.$frame.f) || !Float.isNaN(this.$frame.g)) {
            final boolean naN = Float.isNaN(this.$frame.f);
            float g = 0.5f;
            float f;
            if (naN) {
                f = 0.5f;
            }
            else {
                f = this.$frame.f;
            }
            if (!Float.isNaN(this.$frame.g)) {
                g = this.$frame.g;
            }
            u.M(a.x(f, g));
        }
        if (!Float.isNaN(this.$frame.h)) {
            u.m(this.$frame.h);
        }
        if (!Float.isNaN(this.$frame.i)) {
            u.n(this.$frame.i);
        }
        if (!Float.isNaN(this.$frame.j)) {
            u.p(this.$frame.j);
        }
        if (!Float.isNaN(this.$frame.k)) {
            u.x(this.$frame.k);
        }
        if (!Float.isNaN(this.$frame.l)) {
            u.g(this.$frame.l);
        }
        if (!Float.isNaN(this.$frame.m)) {
            u.P(this.$frame.m);
        }
        if (!Float.isNaN(this.$frame.n) || !Float.isNaN(this.$frame.o)) {
            final boolean naN2 = Float.isNaN(this.$frame.n);
            final float n = 1.0f;
            float n2;
            if (naN2) {
                n2 = 1.0f;
            }
            else {
                n2 = this.$frame.n;
            }
            u.u(n2);
            float o;
            if (Float.isNaN(this.$frame.o)) {
                o = n;
            }
            else {
                o = this.$frame.o;
            }
            u.w(o);
        }
        if (!Float.isNaN(this.$frame.p)) {
            u.d(this.$frame.p);
        }
    }
}
