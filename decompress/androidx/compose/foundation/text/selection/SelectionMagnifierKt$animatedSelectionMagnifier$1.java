// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text.selection;

import l0.e;
import z0.d$a$a;
import zg2.p;
import z0.s;
import l0.g;
import pg2.j;
import l0.g0;
import androidx.compose.animation.core.Animatable;
import z0.d$a;
import ak0.m;
import ah2.f;
import z0.e1;
import zg2.l;
import n1.c;
import zg2.a;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class SelectionMagnifierKt$animatedSelectionMagnifier$1 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ a<c> $magnifierCenter;
    public final /* synthetic */ l<a<c>, d> $platformMagnifier;
    
    public SelectionMagnifierKt$animatedSelectionMagnifier$1(final a<c> $magnifierCenter, final l<? super a<c>, ? extends d> $platformMagnifier) {
        this.$magnifierCenter = $magnifierCenter;
        this.$platformMagnifier = (l<a<c>, d>)$platformMagnifier;
        super(3);
    }
    
    public static final long access$invoke$lambda-0(final e1 e1) {
        return e1.getValue().a;
    }
    
    public final d invoke(d d, final z0.d d2, final int n) {
        f.f((Object)d, "$this$composed");
        d2.A(759876635);
        final a<c> $magnifierCenter = this.$magnifierCenter;
        final g a = SelectionMagnifierKt.a;
        final Object i = m.i(d2, -1589795249, -492369756);
        final d$a$a a2 = d$a.a;
        Object d3 = i;
        if (i == a2) {
            d3 = a80.a.D($magnifierCenter);
            d2.v(d3);
        }
        d2.I();
        final e1 e1 = (e1)d3;
        d2.A(-492369756);
        Object b;
        if ((b = d2.B()) == a2) {
            b = new Animatable((Object)new c(e1.getValue().a), (g0)SelectionMagnifierKt.b, (Object)new c(SelectionMagnifierKt.c));
            d2.v(b);
        }
        d2.I();
        final Animatable animatable = (Animatable)b;
        s.f(j.a, (p)new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1(e1, (Animatable<c, g>)animatable, null), d2);
        final e c = animatable.c;
        d2.I();
        d = (d)this.$platformMagnifier.invoke((Object)new a<c>() {
            public final long invoke-F1C5BW0() {
                return SelectionMagnifierKt$animatedSelectionMagnifier$1.access$invoke$lambda-0(c);
            }
        });
        d2.I();
        return d;
    }
}
