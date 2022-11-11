// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation;

import androidx.compose.ui.platform.o0;
import z0.d$a$a;
import androidx.compose.ui.focus.FocusModifierKt;
import androidx.compose.ui.focus.FocusChangedModifierKt;
import androidx.compose.ui.focus.FocusRequesterModifierKt;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import m0.r;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import h2.o;
import m0.i;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import tg2.c;
import mj2.b0;
import o0.h;
import o0.e;
import z0.p;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import m1.m;
import a80.a;
import z0.l;
import a2.b;
import z0.s;
import kotlin.coroutines.EmptyCoroutineContext;
import z0.d$a;
import ah2.f;
import s0.k;
import z0.h0;
import o0.j;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class FocusableKt$focusable$2 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ j $interactionSource;
    
    public FocusableKt$focusable$2(final j $interactionSource, final boolean $enabled) {
        this.$interactionSource = $interactionSource;
        this.$enabled = $enabled;
        super(3);
    }
    
    public static final k access$invoke$lambda-2(final h0 h0) {
        return (k)h0.getValue();
    }
    
    public static final void access$invoke$lambda-3(final h0 h0, final k value) {
        h0.setValue(value);
    }
    
    public static final boolean access$invoke$lambda-5(final h0 h0) {
        return (boolean)h0.getValue();
    }
    
    public static final void access$invoke$lambda-6(final h0 h0, final boolean b) {
        h0.setValue(b);
    }
    
    public final d invoke(d d, final z0.d d2, final int n) {
        f.f((Object)d, "$this$composed");
        d2.A(1871352361);
        d2.A(773894976);
        d2.A(-492369756);
        final Object b = d2.B();
        final d$a$a a = d$a.a;
        Object p3 = b;
        if (b == a) {
            p3 = a2.b.p(s.i(EmptyCoroutineContext.INSTANCE, d2), d2);
        }
        d2.I();
        final b0 f = ((l)p3).f;
        d2.I();
        d2.A(-492369756);
        Object o;
        if ((o = d2.B()) == a) {
            o = a80.a.n0(null);
            d2.v(o);
        }
        d2.I();
        final h0 h0 = (h0)o;
        d2.A(-492369756);
        Object o2;
        if ((o2 = d2.B()) == a) {
            o2 = a80.a.n0(null);
            d2.v(o2);
        }
        d2.I();
        final h0 h2 = (h0)o2;
        d2.A(-492369756);
        Object o3;
        if ((o3 = d2.B()) == a) {
            o3 = a80.a.n0(Boolean.FALSE);
            d2.v(o3);
        }
        d2.I();
        final h0 h3 = (h0)o3;
        d2.A(-492369756);
        Object b2;
        if ((b2 = d2.B()) == a) {
            b2 = new m();
            d2.v(b2);
        }
        d2.I();
        final m m = (m)b2;
        d2.A(-492369756);
        Object b3;
        if ((b3 = d2.B()) == a) {
            b3 = new BringIntoViewRequesterImpl();
            d2.v(b3);
        }
        d2.I();
        final t0.d d3 = (t0.d)b3;
        final j $interactionSource = this.$interactionSource;
        s.c($interactionSource, (zg2.l)new zg2.l<z0.q, p>() {
            public final p invoke(final z0.q q) {
                ah2.f.f((Object)q, "$this$DisposableEffect");
                return new p() {
                    @Override
                    public final void dispose() {
                        final o0.d d = h0.getValue();
                        if (d != null) {
                            final e e = new e(d);
                            final j b = $interactionSource;
                            if (b != null) {
                                b.b((h)e);
                            }
                            h0.setValue(null);
                        }
                    }
                };
            }
        }, d2);
        s.c(this.$enabled, (zg2.l)new zg2.l<z0.q, p>() {
            public final /* synthetic */ boolean $enabled = FocusableKt$focusable$2.this.$enabled;
            public final /* synthetic */ j $interactionSource = FocusableKt$focusable$2.this.$interactionSource;
            
            public final p invoke(final z0.q q) {
                ah2.f.f((Object)q, "$this$DisposableEffect");
                if (!this.$enabled) {
                    g.i(f, (CoroutineContext)null, (CoroutineStart)null, (zg2.p)new FocusableKt$focusable$2$2$1((h0)h0, this.$interactionSource, (c)null), 3);
                }
                return new p() {
                    @Override
                    public final void dispose() {
                    }
                };
            }
        }, d2);
        if (this.$enabled) {
            if (h3.getValue()) {
                d2.A(-492369756);
                Object b4;
                if ((b4 = d2.B()) == a) {
                    b4 = new i();
                    d2.v(b4);
                }
                d2.I();
                d = (d)b4;
            }
            else {
                d = (d)j1.d.a.f;
            }
            final d b5 = SemanticsModifierKt.b((d)j1.d.a.f, false, (zg2.l<? super h2.q, pg2.j>)new zg2.l<h2.q, pg2.j>() {
                public final void invoke(final h2.q q) {
                    ah2.f.f((Object)q, "$this$semantics");
                    final boolean access$invoke$lambda-5 = FocusableKt$focusable$2.access$invoke$lambda-5(h3);
                    final hh2.k[] a = h2.o.a;
                    h2.o.c.a(q, h2.o.a[4], access$invoke$lambda-5);
                    q.a(h2.i.o, (Object)new h2.a((String)null, (pg2.d)new zg2.a<Boolean>() {
                        public final Boolean invoke() {
                            m.a();
                            return FocusableKt$focusable$2.access$invoke$lambda-5(h3);
                        }
                    }));
                }
            });
            final zg2.l<k, pg2.j> l = (zg2.l<k, pg2.j>)new zg2.l<k, pg2.j>() {
                public final void invoke(final k k) {
                    FocusableKt$focusable$2.access$invoke$lambda-3(h2, k);
                }
            };
            final o0 a2 = d.a;
            d = FocusModifierKt.a(FocusChangedModifierKt.a(FocusRequesterModifierKt.a(BringIntoViewRequesterKt.a(InspectableValueKt.a(b5, InspectableValueKt.a, (d)new r((zg2.l<? super k, pg2.j>)l)), d3), m).f0(d), (zg2.l)new zg2.l<m1.p, pg2.j>() {
                public final /* synthetic */ j $interactionSource = FocusableKt$focusable$2.this.$interactionSource;
                
                public final void invoke(final m1.p p) {
                    ah2.f.f((Object)p, "it");
                    FocusableKt$focusable$2.access$invoke$lambda-6(h3, p.isFocused());
                    if (FocusableKt$focusable$2.access$invoke$lambda-5(h3)) {
                        g.i(f, (CoroutineContext)null, CoroutineStart.UNDISPATCHED, (zg2.p)new FocusableKt$focusable$2$5$1(d3, (h0)h2, (c)null), 1);
                        g.i(f, (CoroutineContext)null, (CoroutineStart)null, (zg2.p)new FocusableKt$focusable$2$5$2((h0)h0, this.$interactionSource, (c)null), 3);
                    }
                    else {
                        g.i(f, (CoroutineContext)null, (CoroutineStart)null, (zg2.p)new FocusableKt$focusable$2$5$3((h0)h0, this.$interactionSource, (c)null), 3);
                    }
                }
            }));
        }
        else {
            d = (d)j1.d.a.f;
        }
        d2.I();
        return d;
    }
}
