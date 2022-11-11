// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import com.reddit.news.ui.composables.RecommendationContextSection;
import java.util.List;
import java.util.ArrayList;
import z1.o;
import kotlin.Result;
import pg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mj2.l;
import a80.a;
import z1.c;
import zg2.p;
import mj2.s0;
import ah2.f;
import mj2.b0;
import a1.e;
import z1.k;
import androidx.compose.ui.platform.k1;
import u2.b;
import z1.v;
import z1.u;
import z1.t;

public final class SuspendingPointerInputFilter extends t implements u, v, b
{
    public final k1 h;
    public final /* synthetic */ b i;
    public k j;
    public final e<SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<?>> k;
    public final e<SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<?>> l;
    public k m;
    public long n;
    public b0 o;
    
    public SuspendingPointerInputFilter(final k1 h, final b i) {
        ah2.f.f((Object)h, "viewConfiguration");
        ah2.f.f((Object)i, "density");
        this.h = h;
        this.i = i;
        this.j = SuspendingPointerInputFilterKt.a;
        this.k = new e<SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<?>>(new SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine[16]);
        this.l = new e<SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<?>>(new SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine[16]);
        this.n = 0L;
        this.o = (b0)s0.f;
    }
    
    @Override
    public final <R> Object F0(final p<? super c, ? super tg2.c<? super R>, ?> p, final tg2.c<? super R> c) {
        final l l = new l(1, a.a0(c));
        l.o();
        final SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine suspendingPointerInputFilter$PointerEventHandlerCoroutine = new SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine(this, l);
        synchronized (this.k) {
            this.k.b(suspendingPointerInputFilter$PointerEventHandlerCoroutine);
            new tg2.e(CoroutineSingletons.COROUTINE_SUSPENDED, a.a0(a.B(p, suspendingPointerInputFilter$PointerEventHandlerCoroutine, (tg2.c)suspendingPointerInputFilter$PointerEventHandlerCoroutine))).resumeWith(Result.constructor-impl((Object)pg2.j.a));
            monitorexit(this.k);
            l.I((zg2.l)new SuspendingPointerInputFilter$awaitPointerEventScope$2.SuspendingPointerInputFilter$awaitPointerEventScope$2$2(suspendingPointerInputFilter$PointerEventHandlerCoroutine));
            return l.n();
        }
    }
    
    @Override
    public final t H0() {
        return this;
    }
    
    @Override
    public final float M0(final float n) {
        return this.i.M0(n);
    }
    
    @Override
    public final void S0() {
        final k m = this.m;
        if (m == null) {
            return;
        }
        final List<o> a = m.a;
        final int size = a.size();
        final int n = 0;
        int n2 = 0;
        boolean b;
        while (true) {
            b = true;
            if (n2 >= size) {
                break;
            }
            if (!(true ^ ((o)a.get(n2)).d)) {
                b = false;
                break;
            }
            ++n2;
        }
        if (b) {
            return;
        }
        final List<o> a2 = m.a;
        final ArrayList list = new ArrayList<o>(a2.size());
        for (int size2 = a2.size(), i = n; i < size2; ++i) {
            final o o = a2.get(i);
            final long a3 = o.a;
            final long c = o.c;
            final long b2 = o.b;
            final boolean d = o.d;
            list.add(new o(a3, b2, c, false, b2, c, d, d, 1, n1.c.b));
        }
        final k j = new k((List<o>)list);
        this.U0(this.j = j, PointerEventPass.Initial);
        this.U0(j, PointerEventPass.Main);
        this.U0(j, PointerEventPass.Final);
        this.m = null;
    }
    
    @Override
    public final void T0(k k, final PointerEventPass pointerEventPass, final long n) {
        ah2.f.f((Object)pointerEventPass, "pass");
        this.n = n;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.j = k;
        }
        this.U0(k, pointerEventPass);
        final List<o> a = k.a;
        final int size = a.size();
        final int n2 = 0;
        while (true) {
            for (int i = 0; i < size; ++i) {
                if (!yd.a.I0((o)a.get(i))) {
                    final int n3 = n2;
                    if ((n3 ^ 0x1) == 0x0) {
                        k = null;
                    }
                    this.m = k;
                    return;
                }
            }
            final int n3 = 1;
            continue;
        }
    }
    
    public final void U0(final k k, final PointerEventPass pointerEventPass) {
        Object o = this.k;
        synchronized (o) {
            final e<SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine<?>> l = this.l;
            l.c(l.h, this.k);
            monitorexit(o);
            try {
                final int n = SuspendingPointerInputFilter.SuspendingPointerInputFilter$a.a[((Enum)pointerEventPass).ordinal()];
                if (n != 1 && n != 2) {
                    if (n == 3) {
                        o = this.l;
                        int h = ((e)o).h;
                        if (h > 0) {
                            --h;
                            o = ((e)o).f;
                            do {
                                ((SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine)o[h]).c(k, pointerEventPass);
                            } while (--h >= 0);
                        }
                    }
                }
                else {
                    o = this.l;
                    final int h2 = ((e)o).h;
                    if (h2 > 0) {
                        int n2 = 0;
                        o = ((e)o).f;
                        do {
                            ((SuspendingPointerInputFilter.SuspendingPointerInputFilter$PointerEventHandlerCoroutine)o[n2]).c(k, pointerEventPass);
                        } while (++n2 < h2);
                    }
                }
            }
            finally {
                this.l.e();
            }
        }
    }
    
    @Override
    public final long b0(final long n) {
        return this.i.b0(n);
    }
    
    @Override
    public final long f(final long n) {
        return this.i.f(n);
    }
    
    @Override
    public final float getDensity() {
        return this.i.getDensity();
    }
    
    @Override
    public final float getFontScale() {
        return this.i.getFontScale();
    }
    
    @Override
    public final k1 getViewConfiguration() {
        return this.h;
    }
    
    @Override
    public final float i(final long n) {
        return this.i.i(n);
    }
    
    @Override
    public final long j(final float n) {
        return this.i.j(n);
    }
    
    @Override
    public final float q(final int n) {
        return this.i.q(n);
    }
    
    @Override
    public final float r(final float n) {
        return this.i.r(n);
    }
    
    @Override
    public final long s() {
        final float f = RecommendationContextSection.f;
        return this.i.s();
    }
    
    @Override
    public final int s0(final float n) {
        return this.i.s0(n);
    }
    
    @Override
    public final float x0(final long n) {
        return this.i.x0(n);
    }
}
