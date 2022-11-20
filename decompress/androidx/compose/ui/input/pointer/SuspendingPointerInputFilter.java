// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.input.pointer;

import zi2.z0;
import u2.i;
import n1.f;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import kotlin.coroutines.EmptyCoroutineContext;
import com.reddit.news.ui.composables.RecommendationContextSection;
import kotlin.Result;
import cg2.j;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import zi2.m;
import a01.a;
import java.util.List;
import n1.c;
import java.util.ArrayList;
import z1.p;
import zi2.s0;
import ng2.e;
import zi2.c0;
import a1.d;
import z1.l;
import androidx.compose.ui.platform.k1;
import u2.b;
import z1.w;
import z1.v;
import z1.u;

public final class SuspendingPointerInputFilter extends u implements v, w, b
{
    public final k1 g;
    public final b h;
    public l i;
    public final d<PointerEventHandlerCoroutine<?>> j;
    public final d<PointerEventHandlerCoroutine<?>> k;
    public l l;
    public long m;
    public c0 n;
    
    public SuspendingPointerInputFilter(final k1 g, final b h) {
        e.f((Object)g, "viewConfiguration");
        e.f((Object)h, "density");
        this.g = g;
        this.h = h;
        this.i = SuspendingPointerInputFilterKt.a;
        this.j = (d<PointerEventHandlerCoroutine<?>>)new d((Object[])new PointerEventHandlerCoroutine[16]);
        this.k = (d<PointerEventHandlerCoroutine<?>>)new d((Object[])new PointerEventHandlerCoroutine[16]);
        this.m = 0L;
        this.n = (c0)s0.f;
    }
    
    public final u I0() {
        return this;
    }
    
    public final float M0(final float n) {
        return this.h.M0(n);
    }
    
    @Override
    public final void S0() {
        final l l = this.l;
        if (l == null) {
            return;
        }
        final List<p> a = l.a;
        final int size = a.size();
        final int n = 0;
        int n2 = 0;
        boolean b;
        while (true) {
            b = true;
            if (n2 >= size) {
                break;
            }
            if (!(true ^ ((p)a.get(n2)).d)) {
                b = false;
                break;
            }
            ++n2;
        }
        if (b) {
            return;
        }
        final List<p> a2 = l.a;
        final ArrayList list = new ArrayList<p>(a2.size());
        for (int size2 = a2.size(), i = n; i < size2; ++i) {
            final p p = a2.get(i);
            final long a3 = p.a;
            final long c = p.c;
            final long b2 = p.b;
            final Float j = p.j;
            float floatValue;
            if (j != null) {
                floatValue = j;
            }
            else {
                floatValue = 0.0f;
            }
            final long c2 = p.c;
            final long b3 = p.b;
            final boolean d = p.d;
            list.add(new p(a3, b2, c, false, floatValue, b3, c2, d, d, 1, n1.c.b));
        }
        final l k = new l((List<p>)list);
        this.U0(this.i = k, PointerEventPass.Initial);
        this.U0(k, PointerEventPass.Main);
        this.U0(k, PointerEventPass.Final);
        this.l = null;
    }
    
    @Override
    public final void T0(l l, final PointerEventPass pointerEventPass, final long m) {
        e.f((Object)pointerEventPass, "pass");
        this.m = m;
        if (pointerEventPass == PointerEventPass.Initial) {
            this.i = l;
        }
        this.U0(l, pointerEventPass);
        final List<p> a = l.a;
        final int size = a.size();
        final int n = 0;
        while (true) {
            for (int i = 0; i < size; ++i) {
                if (!a01.a.v((p)a.get(i))) {
                    final int n2 = n;
                    if ((n2 ^ 0x1) == 0x0) {
                        l = null;
                    }
                    this.l = l;
                    return;
                }
            }
            final int n2 = 1;
            continue;
        }
    }
    
    public final void U0(final l l, final PointerEventPass pointerEventPass) {
        Object o = this.j;
        synchronized (o) {
            final d<PointerEventHandlerCoroutine<?>> k = this.k;
            k.c(k.h, (d)this.j);
            monitorexit(o);
            try {
                final int n = a.a[pointerEventPass.ordinal()];
                if (n != 1 && n != 2) {
                    if (n == 3) {
                        o = this.k;
                        int h = ((d)o).h;
                        if (h > 0) {
                            --h;
                            o = ((d)o).f;
                            e.d(o, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                            do {
                                ((PointerEventHandlerCoroutine)o[h]).c(l, pointerEventPass);
                            } while (--h >= 0);
                        }
                    }
                }
                else {
                    o = this.k;
                    final int h2 = ((d)o).h;
                    if (h2 > 0) {
                        int n2 = 0;
                        o = ((d)o).f;
                        e.d(o, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                        do {
                            ((PointerEventHandlerCoroutine)o[n2]).c(l, pointerEventPass);
                        } while (++n2 < h2);
                    }
                }
            }
            finally {
                this.k.f();
            }
        }
    }
    
    public final float Y(final int n) {
        return this.h.Y(n);
    }
    
    public final <R> Object d0(final mg2.p<? super z1.c, ? super gg2.c<? super R>, ?> p, final gg2.c<? super R> c) {
        final m m = new m(1, cg.d.e3((gg2.c)c));
        m.r();
        final PointerEventHandlerCoroutine pointerEventHandlerCoroutine = new PointerEventHandlerCoroutine(m);
        synchronized (this.j) {
            this.j.b((Object)pointerEventHandlerCoroutine);
            new gg2.e(CoroutineSingletons.COROUTINE_SUSPENDED, cg.d.e3(cg.d.A1((mg2.p)p, (Object)pointerEventHandlerCoroutine, (gg2.c)pointerEventHandlerCoroutine))).resumeWith(Result.constructor-impl((Object)cg2.j.a));
            monitorexit(this.j);
            m.Z((mg2.l)new SuspendingPointerInputFilter$awaitPointerEventScope$2.SuspendingPointerInputFilter$awaitPointerEventScope$2$2(pointerEventHandlerCoroutine));
            return m.q();
        }
    }
    
    public final long g0(final long n) {
        return this.h.g0(n);
    }
    
    public final float getDensity() {
        return this.h.getDensity();
    }
    
    public final float getFontScale() {
        return this.h.getFontScale();
    }
    
    public final long i(final long n) {
        return this.h.i(n);
    }
    
    public final float k(final long n) {
        return this.h.k(n);
    }
    
    public final long l(final float n) {
        return this.h.l(n);
    }
    
    public final float u(final float n) {
        return this.h.u(n);
    }
    
    public final long w() {
        final float f = RecommendationContextSection.f;
        return this.h.w();
    }
    
    public final int w0(final float n) {
        return this.h.w0(n);
    }
    
    public final float z0(final long n) {
        return this.h.z0(n);
    }
    
    public final class PointerEventHandlerCoroutine<R> implements z1.c, b, c<R>
    {
        public final c<R> f;
        public final SuspendingPointerInputFilter g;
        public zi2.l<? super l> h;
        public PointerEventPass i;
        public final EmptyCoroutineContext j;
        public final SuspendingPointerInputFilter k;
        
        public PointerEventHandlerCoroutine(final SuspendingPointerInputFilter suspendingPointerInputFilter, final m f) {
            this.k = suspendingPointerInputFilter;
            this.f = (c<R>)f;
            this.g = suspendingPointerInputFilter;
            this.i = PointerEventPass.Main;
            this.j = EmptyCoroutineContext.INSTANCE;
        }
        
        public final l D0() {
            return this.k.i;
        }
        
        public final <T> Object H(final long n, final mg2.p<? super z1.c, ? super c<? super T>, ?> p2, c<? super T> o) {
            SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = null;
            Label_0055: {
                if (o instanceof SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1) {
                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1)o;
                    final int label = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label;
                    if ((label & Integer.MIN_VALUE) != 0x0) {
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label = label + Integer.MIN_VALUE;
                        break Label_0055;
                    }
                }
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1(this, (c)o);
            }
            final Object result = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.result;
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            final int label2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label;
            Label_0120: {
                if (label2 == 0) {
                    break Label_0120;
                }
                Label_0110: {
                    if (label2 != 1) {
                        break Label_0110;
                    }
                    Object l$0 = o = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.L$0;
                    try {
                        cg.d.b4(result);
                        Object invoke = result;
                        Label_0237: {
                            return invoke;
                        }
                    Label_0163_Outer:
                        while (true) {
                            o = this.h;
                            iftrue(Label_0163:)(o == null);
                            while (true) {
                                Block_8: {
                                    break Block_8;
                                    l$0 = (o = zi2.g.g(this.k.n, null, null, (mg2.p)new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$job$1(n, this, (c)null), 3));
                                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.L$0 = l$0;
                                    o = l$0;
                                    suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1.label = 1;
                                    o = l$0;
                                    iftrue(Label_0237:)((invoke = p2.invoke((Object)this, (Object)suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeout$1)) != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ((c)o).resumeWith(Result.constructor-impl((Object)cg.d.B1((Throwable)new PointerEventTimeoutCancellationException(n))));
                                continue;
                            }
                            cg.d.b4(result);
                            iftrue(Label_0163:)(n > 0L);
                            continue Label_0163_Outer;
                        }
                    }
                    finally {
                        ((z0)o).a(null);
                    }
                }
            }
        }
        
        public final float M0(final float n) {
            return this.g.M0(n);
        }
        
        public final Object T(final PointerEventPass i, final BaseContinuationImpl baseContinuationImpl) {
            final m<Object> h = new m<Object>(1, cg.d.e3((c)baseContinuationImpl));
            h.r();
            this.i = i;
            this.h = (zi2.l<? super l>)h;
            final Object q = h.q();
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            return q;
        }
        
        public final float Y(final int n) {
            return this.g.Y(n);
        }
        
        public final long a() {
            return this.k.m;
        }
        
        public final void c(final l l, final PointerEventPass pointerEventPass) {
            e.f((Object)pointerEventPass, "pass");
            if (pointerEventPass == this.i) {
                final zi2.l<? super l> h = this.h;
                if (h != null) {
                    this.h = null;
                    ((c)h).resumeWith(Result.constructor-impl((Object)l));
                }
            }
        }
        
        public final long g0(final long n) {
            return this.g.g0(n);
        }
        
        public final CoroutineContext getContext() {
            return (CoroutineContext)this.j;
        }
        
        public final float getDensity() {
            return this.g.getDensity();
        }
        
        public final float getFontScale() {
            return this.g.getFontScale();
        }
        
        public final k1 getViewConfiguration() {
            return this.k.g;
        }
        
        public final <T> Object h0(final long n, final mg2.p<? super z1.c, ? super c<? super T>, ?> p3, final c<? super T> c) {
            SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$2 = null;
            Label_0059: {
                if (c instanceof SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1) {
                    final SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1 = (SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1)c;
                    final int label = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label;
                    if ((label & Integer.MIN_VALUE) != 0x0) {
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1.label = label + Integer.MIN_VALUE;
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1;
                        break Label_0059;
                    }
                }
                suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$2 = new SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull.SuspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$1(this, (c)c);
            }
            final Object result = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$2.result;
            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
            final int label2 = suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$2.label;
            Object h = null;
            Label_0110: {
                if (label2 == 0) {
                    break Label_0110;
                }
                Label_0100: {
                    if (label2 != 1) {
                        break Label_0100;
                    }
                    try {
                        cg.d.b4(result);
                        h = result;
                        return h;
                        cg.d.b4(result);
                        suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$2.label = 1;
                        iftrue(Label_0147:)((h = this.H(n, (mg2.p<? super z1.c, ? super c<? super Object>, ?>)p3, (c<? super Object>)suspendingPointerInputFilter$PointerEventHandlerCoroutine$withTimeoutOrNull$2)) != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catch (final PointerEventTimeoutCancellationException ex) {
                        h = null;
                    }
                }
            }
            Label_0147: {
                return h;
            }
        }
        
        public final long i(final long n) {
            return this.g.i(n);
        }
        
        public final float k(final long n) {
            return this.g.k(n);
        }
        
        public final long l(final float n) {
            return this.g.l(n);
        }
        
        public final void resumeWith(final Object o) {
            final SuspendingPointerInputFilter k = this.k;
            synchronized (k.j) {
                k.j.l((Object)this);
                final j a = cg2.j.a;
                monitorexit(k.j);
                this.f.resumeWith(o);
            }
        }
        
        public final float u(final float n) {
            return this.g.u(n);
        }
        
        public final long v0() {
            final SuspendingPointerInputFilter k = this.k;
            final long g0 = k.g0(k.g.e());
            final long a = k.a();
            return vl.a.d0(Math.max(0.0f, n1.f.f(g0) - (int)(a >> 32)) / 2.0f, Math.max(0.0f, n1.f.d(g0) - u2.i.b(a)) / 2.0f);
        }
        
        public final long w() {
            final float f = RecommendationContextSection.f;
            return this.g.w();
        }
        
        public final int w0(final float n) {
            return this.g.w0(n);
        }
        
        public final float z0(final long n) {
            return this.g.z0(n);
        }
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[PointerEventPass.values().length];
            a2[PointerEventPass.Initial.ordinal()] = 1;
            a2[PointerEventPass.Final.ordinal()] = 2;
            a2[PointerEventPass.Main.ordinal()] = 3;
            a = a2;
        }
    }
}
