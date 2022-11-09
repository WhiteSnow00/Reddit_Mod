// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import z0.d$a$a;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.draw.DrawModifierKt;
import q1.e;
import zg2.p;
import z0.s;
import pj2.o;
import pj2.u;
import kotlinx.coroutines.channels.BufferOverflow;
import a80.a;
import z0.d$a;
import androidx.compose.ui.platform.CompositionLocalsKt;
import z0.o0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import android.view.View;
import z0.e1;
import z0.h0;
import m0.n;
import m0.t;
import pg2.j;
import u2.f;
import n1.c;
import u2.b;
import zg2.l;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class MagnifierKt$magnifier$4 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ l<b, c> $magnifierCenter;
    public final /* synthetic */ l<f, j> $onSizeChanged;
    public final /* synthetic */ t $platformMagnifierFactory;
    public final /* synthetic */ l<b, c> $sourceCenter;
    public final /* synthetic */ n $style;
    public final /* synthetic */ float $zoom;
    
    public MagnifierKt$magnifier$4(final l<? super b, c> $sourceCenter, final l<? super b, c> $magnifierCenter, final float $zoom, final l<? super f, j> $onSizeChanged, final t $platformMagnifierFactory, final n $style) {
        this.$sourceCenter = (l<b, c>)$sourceCenter;
        this.$magnifierCenter = (l<b, c>)$magnifierCenter;
        this.$zoom = $zoom;
        this.$onSizeChanged = (l<f, j>)$onSizeChanged;
        this.$platformMagnifierFactory = $platformMagnifierFactory;
        this.$style = $style;
        super(3);
    }
    
    public static final long access$invoke$lambda-1(final h0 h0) {
        return ((c)h0.getValue()).a;
    }
    
    public static final boolean access$invoke$lambda-10(final e1 e1) {
        return e1.getValue();
    }
    
    public static final void access$invoke$lambda-2(final h0 h0, final long n) {
        h0.setValue(new c(n));
    }
    
    public static final l access$invoke$lambda-3(final e1 e1) {
        return e1.getValue();
    }
    
    public static final l access$invoke$lambda-4(final e1 e1) {
        return e1.getValue();
    }
    
    public static final float access$invoke$lambda-5(final e1 e1) {
        return e1.getValue().floatValue();
    }
    
    public static final l access$invoke$lambda-6(final e1 e1) {
        return e1.getValue();
    }
    
    public static final long access$invoke$lambda-8(final e1 e1) {
        return e1.getValue().a;
    }
    
    public final d invoke(d b, final z0.d d, final int n) {
        ah2.f.f((Object)b, "$this$composed");
        d.A(-454877003);
        final View view = (View)d.t(AndroidCompositionLocals_androidKt.f);
        final b b2 = (b)d.t(CompositionLocalsKt.e);
        d.A(-492369756);
        final Object b3 = d.B();
        final d$a$a a = d$a.a;
        Object n2 = b3;
        if (b3 == a) {
            n2 = a80.a.n0(new c(c.d));
            d.v(n2);
        }
        d.I();
        final h0 h0 = (h0)n2;
        final h0 v0 = a80.a.v0(this.$sourceCenter, d);
        final h0 v2 = a80.a.v0(this.$magnifierCenter, d);
        final h0 v3 = a80.a.v0(this.$zoom, d);
        final h0 v4 = a80.a.v0(this.$onSizeChanged, d);
        d.A(-492369756);
        Object o;
        if ((o = d.B()) == a) {
            o = a80.a.D((zg2.a)new MagnifierKt$magnifier$4$sourceCenterInRoot$2.MagnifierKt$magnifier$4$sourceCenterInRoot$2$1(b2, (e1)v0, h0));
            d.v(o);
        }
        d.I();
        final e1 e1 = (e1)o;
        d.A(-492369756);
        Object o2;
        if ((o2 = d.B()) == a) {
            o2 = a80.a.D((zg2.a)new MagnifierKt$magnifier$4$isMagnifierShown$2.MagnifierKt$magnifier$4$isMagnifierShown$2$1(e1));
            d.v(o2);
        }
        d.I();
        final e1 e2 = (e1)o2;
        d.A(-492369756);
        Object o3;
        if ((o3 = d.B()) == a) {
            o3 = u.g(1, 0, BufferOverflow.DROP_OLDEST, 2);
            d.v(o3);
        }
        d.I();
        final o o4 = (o)o3;
        float $zoom;
        if (this.$platformMagnifierFactory.b()) {
            $zoom = 0.0f;
        }
        else {
            $zoom = this.$zoom;
        }
        final n $style = this.$style;
        s.g(new Object[] { view, b2, $zoom, $style, ah2.f.a((Object)$style, (Object)n.h) }, (p)new MagnifierKt$magnifier$4$1(this.$platformMagnifierFactory, this.$style, view, b2, this.$zoom, o4, (e1)v4, e2, e1, (e1)v2, h0, (e1)v3, (tg2.c)null), d);
        b = SemanticsModifierKt.b(DrawModifierKt.a(at1.a.n1(b, (l)new l<c2.l, j>() {
            public final void invoke(final c2.l l) {
                ah2.f.f((Object)l, "it");
                MagnifierKt$magnifier$4.access$invoke$lambda-2(h0, gn.a.Q1(l));
            }
        }), (l)new l<e, j>() {
            public final void invoke(final e e) {
                ah2.f.f((Object)e, "$this$drawBehind");
                o4.d((Object)j.a);
            }
        }), false, (l<? super h2.q, j>)new l<h2.q, j>() {
            public final void invoke(final h2.q q) {
                ah2.f.f((Object)q, "$this$semantics");
                q.a((androidx.compose.ui.semantics.a)androidx.compose.foundation.f.a, (Object)new zg2.a<c>() {
                    public final long invoke-F1C5BW0() {
                        return MagnifierKt$magnifier$4.access$invoke$lambda-8(e1);
                    }
                });
            }
        });
        d.I();
        return b;
    }
}
