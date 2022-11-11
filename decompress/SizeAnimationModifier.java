// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.animation;

import androidx.compose.runtime.SnapshotMutableStateImpl;
import c2.e0;
import l0.g0;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import lg2.c;
import lw0.b;
import c2.t;
import c2.r;
import c2.u;
import sg2.e;
import l0.s;
import hg2.j;
import rg2.p;
import ej2.b0;
import u2.i;
import l0.d;
import k0.l;

public final class SizeAnimationModifier extends l
{
    public final d<i> f;
    public final b0 g;
    public p<? super i, ? super i, j> h;
    public SizeAnimationModifier.SizeAnimationModifier$a i;
    
    public SizeAnimationModifier(final s f, final b0 g) {
        e.f((Object)f, "animSpec");
        e.f((Object)g, "scope");
        this.f = (d<i>)f;
        this.g = g;
    }
    
    public final t v(final u u, final r r, long n) {
        e.f((Object)u, "$this$measure");
        e.f((Object)r, "measurable");
        final e0 h = r.H(n);
        n = b.l(h.f, h.g);
        final SizeAnimationModifier.SizeAnimationModifier$a i = this.i;
        SizeAnimationModifier.SizeAnimationModifier$a j;
        if (i != null) {
            j = i;
            if (!u2.i.a(n, ((i)((SnapshotMutableStateImpl)i.a.e).getValue()).a)) {
                i.b = ((i)i.a.d()).a;
                ej2.g.i(this.g, (CoroutineContext)null, (CoroutineStart)null, (p)new SizeAnimationModifier$animateTo$data$1$1(i, n, this, null), 3);
                j = i;
            }
        }
        else {
            j = new SizeAnimationModifier.SizeAnimationModifier$a(new Animatable((Object)new i(n), (g0)VectorConvertersKt.h, (Object)new i(b.l(1, 1))), n);
        }
        this.i = j;
        n = ((i)j.a.d()).a;
        return u.U(u, (int)(n >> 32), u2.i.b(n), (rg2.l)new SizeAnimationModifier$measure$1(h));
    }
}
