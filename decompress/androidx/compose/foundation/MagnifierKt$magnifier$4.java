// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import z0.d$a$a;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import rg2.p;
import hj2.r;
import kotlinx.coroutines.channels.BufferOverflow;
import rg2.a;
import z0.d$a;
import androidx.compose.ui.platform.CompositionLocalsKt;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.view.View;
import sg2.e;
import z0.e1;
import z0.h0;
import m0.m;
import m0.s;
import hg2.j;
import u2.f;
import n1.c;
import u2.b;
import rg2.l;
import kotlin.Metadata;
import j1.d;
import rg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class MagnifierKt$magnifier$4 extends Lambda implements q<j1.d, z0.d, Integer, j1.d>
{
    public final /* synthetic */ l<b, c> $magnifierCenter;
    public final /* synthetic */ l<f, j> $onSizeChanged;
    public final /* synthetic */ s $platformMagnifierFactory;
    public final /* synthetic */ l<b, c> $sourceCenter;
    public final /* synthetic */ m $style;
    public final /* synthetic */ float $zoom;
    
    public MagnifierKt$magnifier$4(final l<? super b, c> $sourceCenter, final l<? super b, c> $magnifierCenter, final float $zoom, final l<? super f, j> $onSizeChanged, final s $platformMagnifierFactory, final m $style) {
        this.$sourceCenter = (l<b, c>)$sourceCenter;
        this.$magnifierCenter = (l<b, c>)$magnifierCenter;
        this.$zoom = $zoom;
        this.$onSizeChanged = (l<f, j>)$onSizeChanged;
        this.$platformMagnifierFactory = $platformMagnifierFactory;
        this.$style = $style;
        super(3);
    }
    
    public static final long access$invoke$lambda-1(final h0 h0) {
        return ((c)((e1)h0).getValue()).a;
    }
    
    public static final boolean access$invoke$lambda-10(final e1 e1) {
        return (boolean)e1.getValue();
    }
    
    public static final void access$invoke$lambda-2(final h0 h0, final long n) {
        h0.setValue((Object)new c(n));
    }
    
    public static final l access$invoke$lambda-3(final e1 e1) {
        return (l)e1.getValue();
    }
    
    public static final l access$invoke$lambda-4(final e1 e1) {
        return (l)e1.getValue();
    }
    
    public static final float access$invoke$lambda-5(final e1 e1) {
        return ((Number)e1.getValue()).floatValue();
    }
    
    public static final l access$invoke$lambda-6(final e1 e1) {
        return (l)e1.getValue();
    }
    
    public static final long access$invoke$lambda-8(final e1 e1) {
        return ((c)e1.getValue()).a;
    }
    
    public final j1.d invoke(j1.d b, final z0.d d, final int n) {
        e.f((Object)b, "$this$composed");
        d.A(-454877003);
        final View view = (View)d.u((o0)AndroidCompositionLocals_androidKt.f);
        final b b2 = (b)d.u((o0)CompositionLocalsKt.e);
        d.A(-492369756);
        final Object b3 = d.B();
        final d$a$a a = d$a.a;
        Object t0 = b3;
        if (b3 == a) {
            t0 = bg.d.t0((Object)new c(c.d));
            d.w(t0);
        }
        d.I();
        final h0 h0 = (h0)t0;
        final h0 x0 = bg.d.x0((Object)this.$sourceCenter, d);
        final h0 x2 = bg.d.x0((Object)this.$magnifierCenter, d);
        final h0 x3 = bg.d.x0((Object)this.$zoom, d);
        final h0 x4 = bg.d.x0((Object)this.$onSizeChanged, d);
        d.A(-492369756);
        Object o;
        if ((o = d.B()) == a) {
            o = bg.d.V((a)new MagnifierKt$magnifier$4$sourceCenterInRoot$2.MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(b2, (e1)x0, h0));
            d.w(o);
        }
        d.I();
        final e1 e1 = (e1)o;
        d.A(-492369756);
        Object o2;
        if ((o2 = d.B()) == a) {
            o2 = bg.d.V((a)new MagnifierKt$magnifier$4$isMagnifierShown$2.MagnifierKt$magnifier$4$isMagnifierShown$2$1(e1));
            d.w(o2);
        }
        d.I();
        final e1 e2 = (e1)o2;
        d.A(-492369756);
        Object o3;
        if ((o3 = d.B()) == a) {
            o3 = a92.b.l(1, 0, BufferOverflow.DROP_OLDEST, 2);
            d.w(o3);
        }
        d.I();
        final r r = (r)o3;
        float $zoom;
        if (this.$platformMagnifierFactory.b()) {
            $zoom = 0.0f;
        }
        else {
            $zoom = this.$zoom;
        }
        final m $style = this.$style;
        z0.s.g(new Object[] { view, b2, $zoom, $style, e.a((Object)$style, (Object)m.h) }, (p)new MagnifierKt$magnifier$4$1(this.$platformMagnifierFactory, this.$style, view, b2, this.$zoom, r, (e1)x4, e2, e1, (e1)x2, h0, (e1)x3, (lg2.c)null), d);
        b = SemanticsModifierKt.b(DrawModifierKt.a(aa1.a.K0(b, (l)new MagnifierKt$magnifier$4$2(h0)), (l)new MagnifierKt$magnifier$4$3(r)), false, new l<h2.q, j>() {
            public final void invoke(final h2.q q) {
                e.f((Object)q, "$this$semantics");
                q.a(androidx.compose.foundation.f.a, new MagnifierKt$magnifier$4$4$1((e1)e1));
            }
        });
        d.I();
        return b;
    }
}
