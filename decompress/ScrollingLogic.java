// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.gestures;

import yd.a;
import zg2.p;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import u2.l;
import n1.c;
import n0.j;
import ah2.f;
import z0.h0;
import m0.q;
import n0.d;
import n0.k;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import z0.e1;

public final class ScrollingLogic
{
    public final Orientation a;
    public final boolean b;
    public final e1<NestedScrollDispatcher> c;
    public final k d;
    public final d e;
    public final q f;
    
    public ScrollingLogic(final Orientation a, final boolean b, final h0 c, final k d, final d e, final q f) {
        ah2.f.f((Object)a, "orientation");
        ah2.f.f((Object)c, "nestedScrollDispatcher");
        ah2.f.f((Object)d, "scrollableState");
        ah2.f.f((Object)e, "flingBehavior");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final long a(final j j, long n, final c c, final int n2) {
        ah2.f.f((Object)j, "$this$dispatchScroll");
        final q f = this.f;
        long n3;
        if (f != null && f.isEnabled()) {
            n3 = this.f.d(n, c);
        }
        else {
            n3 = c.b;
        }
        n = c.e(n, n3);
        final NestedScrollDispatcher nestedScrollDispatcher = this.c.getValue();
        final long e = c.e(n, nestedScrollDispatcher.d(n2, n));
        if (this.b) {
            n = c.g(-1.0f, e);
        }
        else {
            n = e;
        }
        final long n4 = n = this.e(j.a(this.d(n)));
        if (this.b) {
            n = c.g(-1.0f, n4);
        }
        final long e2 = c.e(e, n);
        n = nestedScrollDispatcher.b(n2, n, e2);
        final q f2 = this.f;
        if (f2 != null && f2.isEnabled()) {
            this.f.f(e, c.e(e2, n), c, n2);
        }
        return e2;
    }
    
    public final Object b(final long element, final tg2.c<? super l> c) {
        ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$2 = null;
        Label_0054: {
            if (c instanceof ScrollingLogic$doFlingAnimation$1) {
                final ScrollingLogic$doFlingAnimation$1 scrollingLogic$doFlingAnimation$1 = (ScrollingLogic$doFlingAnimation$1)c;
                final int label = scrollingLogic$doFlingAnimation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    scrollingLogic$doFlingAnimation$1.label = label + Integer.MIN_VALUE;
                    scrollingLogic$doFlingAnimation$2 = scrollingLogic$doFlingAnimation$1;
                    break Label_0054;
                }
            }
            scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$1(this, (tg2.c)c);
        }
        final Object result = scrollingLogic$doFlingAnimation$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = scrollingLogic$doFlingAnimation$2.label;
        Object o;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o = scrollingLogic$doFlingAnimation$2.L$0;
            aj2.c.Q0(result);
        }
        else {
            aj2.c.Q0(result);
            final Ref$LongRef l$0 = new Ref$LongRef();
            l$0.element = element;
            final k d = this.d;
            final ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$3 = new ScrollingLogic$doFlingAnimation$2(this, l$0, element, (tg2.c)null);
            scrollingLogic$doFlingAnimation$2.L$0 = l$0;
            scrollingLogic$doFlingAnimation$2.label = 1;
            if (k.d(d, (p)scrollingLogic$doFlingAnimation$3, (tg2.c)scrollingLogic$doFlingAnimation$2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o = l$0;
        }
        return new l(((Ref$LongRef)o).element);
    }
    
    public final Object c(float f$0, final tg2.c<? super pg2.j> c) {
        ScrollingLogic$onDragStopped$1 scrollingLogic$onDragStopped$1 = null;
        Label_0048: {
            if (c instanceof ScrollingLogic$onDragStopped$1) {
                scrollingLogic$onDragStopped$1 = (ScrollingLogic$onDragStopped$1)c;
                final int label = scrollingLogic$onDragStopped$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    scrollingLogic$onDragStopped$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            scrollingLogic$onDragStopped$1 = new ScrollingLogic$onDragStopped$1(this, (tg2.c)c);
        }
        final Object result = scrollingLogic$onDragStopped$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = scrollingLogic$onDragStopped$1.label;
        ScrollingLogic l$0 = null;
        long j$3 = 0L;
        Object a = null;
        Label_0560: {
            long j$2 = 0L;
            Object b = null;
            Label_0485: {
                long j$0 = 0L;
                Object c2 = null;
                Label_0435: {
                    float n = 0.0f;
                    Label_0370: {
                        ScrollingLogic scrollingLogic4;
                        Object o;
                        if (label2 != 0) {
                            if (label2 != 1) {
                                if (label2 == 2) {
                                    j$0 = scrollingLogic$onDragStopped$1.J$0;
                                    final ScrollingLogic scrollingLogic = (ScrollingLogic)scrollingLogic$onDragStopped$1.L$0;
                                    aj2.c.Q0(result);
                                    c2 = result;
                                    l$0 = scrollingLogic;
                                    break Label_0435;
                                }
                                if (label2 == 3) {
                                    j$2 = scrollingLogic$onDragStopped$1.J$0;
                                    final ScrollingLogic scrollingLogic2 = (ScrollingLogic)scrollingLogic$onDragStopped$1.L$0;
                                    aj2.c.Q0(result);
                                    b = result;
                                    l$0 = scrollingLogic2;
                                    break Label_0485;
                                }
                                if (label2 == 4) {
                                    j$3 = scrollingLogic$onDragStopped$1.J$0;
                                    final ScrollingLogic scrollingLogic3 = (ScrollingLogic)scrollingLogic$onDragStopped$1.L$0;
                                    aj2.c.Q0(result);
                                    a = result;
                                    l$0 = scrollingLogic3;
                                    break Label_0560;
                                }
                                if (label2 == 5) {
                                    aj2.c.Q0(result);
                                    return pg2.j.a;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            else {
                                f$0 = scrollingLogic$onDragStopped$1.F$0;
                                scrollingLogic4 = (ScrollingLogic)scrollingLogic$onDragStopped$1.L$1;
                                final ScrollingLogic scrollingLogic5 = (ScrollingLogic)scrollingLogic$onDragStopped$1.L$0;
                                aj2.c.Q0(result);
                                o = result;
                                l$0 = scrollingLogic5;
                            }
                        }
                        else {
                            aj2.c.Q0(result);
                            final q f = this.f;
                            if (f == null || !f.isEnabled()) {
                                n = 0.0f;
                                l$0 = this;
                                break Label_0370;
                            }
                            final q f2 = this.f;
                            final long f3 = this.f(f$0);
                            scrollingLogic$onDragStopped$1.L$0 = this;
                            scrollingLogic$onDragStopped$1.L$1 = this;
                            scrollingLogic$onDragStopped$1.F$0 = f$0;
                            scrollingLogic$onDragStopped$1.label = 1;
                            final l e = f2.e(f3);
                            if (e == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            l$0 = this;
                            scrollingLogic4 = this;
                            o = e;
                        }
                        final long a2 = ((l)o).a;
                        if (scrollingLogic4.a == Orientation.Horizontal) {
                            n = l.b(a2);
                        }
                        else {
                            n = l.c(a2);
                        }
                    }
                    j$0 = l$0.f(f$0 - n);
                    final NestedScrollDispatcher nestedScrollDispatcher = l$0.c.getValue();
                    scrollingLogic$onDragStopped$1.L$0 = l$0;
                    scrollingLogic$onDragStopped$1.L$1 = null;
                    scrollingLogic$onDragStopped$1.J$0 = j$0;
                    scrollingLogic$onDragStopped$1.label = 2;
                    c2 = nestedScrollDispatcher.c(j$0, (tg2.c)scrollingLogic$onDragStopped$1);
                    if (c2 == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                j$2 = l.d(j$0, ((l)c2).a);
                scrollingLogic$onDragStopped$1.L$0 = l$0;
                scrollingLogic$onDragStopped$1.J$0 = j$2;
                scrollingLogic$onDragStopped$1.label = 3;
                b = l$0.b(j$2, (tg2.c<? super l>)scrollingLogic$onDragStopped$1);
                if (b == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final long a3 = ((l)b).a;
            final NestedScrollDispatcher nestedScrollDispatcher2 = l$0.c.getValue();
            final long d = l.d(j$2, a3);
            scrollingLogic$onDragStopped$1.L$0 = l$0;
            scrollingLogic$onDragStopped$1.J$0 = a3;
            scrollingLogic$onDragStopped$1.label = 4;
            a = nestedScrollDispatcher2.a(d, a3, (tg2.c)scrollingLogic$onDragStopped$1);
            if (a == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            j$3 = a3;
        }
        final long d2 = l.d(j$3, ((l)a).a);
        final q f4 = l$0.f;
        if (f4 == null || !f4.isEnabled()) {
            return pg2.j.a;
        }
        final q f5 = l$0.f;
        if (l$0.a == Orientation.Horizontal) {
            f$0 = l.b(d2);
        }
        else {
            f$0 = l.c(d2);
        }
        final long f6 = l$0.f(f$0);
        scrollingLogic$onDragStopped$1.L$0 = null;
        scrollingLogic$onDragStopped$1.label = 5;
        if (f5.b(f6) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return pg2.j.a;
    }
    
    public final float d(final long n) {
        float n2;
        if (this.a == Orientation.Horizontal) {
            n2 = n1.c.c(n);
        }
        else {
            n2 = n1.c.d(n);
        }
        return n2;
    }
    
    public final long e(final float n) {
        long n2;
        if (n == 0.0f) {
            final int e = n1.c.e;
            n2 = n1.c.b;
        }
        else if (this.a == Orientation.Horizontal) {
            n2 = yd.a.y0(n, 0.0f);
        }
        else {
            n2 = yd.a.y0(0.0f, n);
        }
        return n2;
    }
    
    public final long f(final float n) {
        long n2;
        if (this.a == Orientation.Horizontal) {
            n2 = aj2.c.g(n, 0.0f);
        }
        else {
            n2 = aj2.c.g(0.0f, n);
        }
        return n2;
    }
}
