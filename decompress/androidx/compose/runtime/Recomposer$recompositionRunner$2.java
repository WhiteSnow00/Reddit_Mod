// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.runtime;

import java.util.ArrayList;
import e1.b;
import kotlinx.coroutines.flow.StateFlowImpl;
import mj2.g;
import z0.m;
import b1.e;
import i1.f$a;
import at1.a;
import mj2.z0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import z0.d0;
import zg2.q;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", l = { 744 }, m = "invokeSuspend")
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ q<b0, d0, c<? super j>, Object> $block;
    public final /* synthetic */ d0 $parentFrameClock;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Recomposer this$0;
    
    public Recomposer$recompositionRunner$2(final Recomposer this$0, final q<? super b0, ? super d0, ? super c<? super j>, ?> $block, final d0 $parentFrameClock, final c<? super Recomposer$recompositionRunner$2> c) {
        this.this$0 = this$0;
        this.$block = (q<b0, d0, c<? super j>, Object>)$block;
        this.$parentFrameClock = $parentFrameClock;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, (c<? super Recomposer$recompositionRunner$2>)c);
        recomposer$recompositionRunner$2.L$0 = l$0;
        return (c<j>)recomposer$recompositionRunner$2;
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((Recomposer$recompositionRunner$2)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object c0) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Label_0477: {
            if (label != 0) {
                if (label == 1) {
                    final Object o = this.L$1;
                    final z0 z0 = (z0)this.L$0;
                    try {
                        aj2.c.Q0(c0);
                        break Label_0477;
                    }
                    finally {
                        c0 = z0;
                        final Throwable t;
                        final Object l$1 = t;
                        break Label_0477;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(c0);
            c0 = a.C0(((b0)this.L$0).Kx());
            final Recomposer this$0 = this.this$0;
            Object l$1 = this$0.d;
            synchronized (l$1) {
                final Throwable f = this$0.f;
                if (f != null) {
                    throw f;
                }
                if (((Enum<Recomposer$State>)this$0.o.getValue()).compareTo(Recomposer$State.ShuttingDown) > 0) {
                    if (this$0.e == null) {
                        this$0.e = (z0)c0;
                        this$0.v();
                        monitorexit(l$1);
                        l$1 = f$a.c((p)new Recomposer$recompositionRunner$2$unregisterApplyObserver.Recomposer$recompositionRunner$2$unregisterApplyObserver$1(this.this$0));
                        final StateFlowImpl q = Recomposer.q;
                        final Recomposer$b p = this.this$0.p;
                        StateFlowImpl q2;
                        e e;
                        b r;
                        do {
                            q2 = Recomposer.q;
                            e = (e)q2.getValue();
                            r = e.R(p);
                            if (e != r) {
                                continue;
                            }
                            break;
                        } while (!q2.k((Object)e, (Object)r));
                        try {
                            final Recomposer this$2 = this.this$0;
                            Object o = this$2.d;
                            synchronized (o) {
                                final ArrayList g = this$2.g;
                                for (int i = 0; i < g.size(); ++i) {
                                    ((m)g.get(i)).invalidateAll();
                                }
                                final j a = j.a;
                                monitorexit(o);
                                o = new p<b0, c<? super j>, Object>() {
                                    public final /* synthetic */ q<b0, d0, c<? super j>, Object> $block;
                                    public final /* synthetic */ d0 $parentFrameClock;
                                    private /* synthetic */ Object L$0;
                                    public int label;
                                    
                                    public final c<j> create(final Object l$0, final c<?> c) {
                                        final p<b0, c<? super j>, Object> p2 = (p<b0, c<? super j>, Object>)new p<b0, c<? super j>, Object>() {
                                            public final /* synthetic */ q<b0, d0, c<? super j>, Object> $block = this.$block;
                                            public final /* synthetic */ d0 $parentFrameClock = this.$parentFrameClock;
                                            private /* synthetic */ Object L$0;
                                            public int label;
                                        };
                                        p2.L$0 = l$0;
                                        return (c<j>)p2;
                                    }
                                    
                                    public final Object invoke(final b0 b0, final c<? super j> c) {
                                        return ((Recomposer$recompositionRunner$2$2)this.create(b0, c)).invokeSuspend(j.a);
                                    }
                                    
                                    public final Object invokeSuspend(final Object o) {
                                        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        final int label = this.label;
                                        if (label != 0) {
                                            if (label != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            aj2.c.Q0(o);
                                        }
                                        else {
                                            aj2.c.Q0(o);
                                            final b0 b0 = (b0)this.L$0;
                                            final q<b0, d0, c<? super j>, Object> $block = this.$block;
                                            final d0 $parentFrameClock = this.$parentFrameClock;
                                            this.label = 1;
                                            if ($block.invoke((Object)b0, (Object)$parentFrameClock, (Object)this) == coroutine_SUSPENDED) {
                                                return coroutine_SUSPENDED;
                                            }
                                        }
                                        return j.a;
                                    }
                                };
                                this.L$0 = c0;
                                this.L$1 = l$1;
                                this.label = 1;
                                o = mj2.g.e((p)o, (c)this);
                                if (o == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                                o = l$1;
                                ((i1.c)l$1).dispose();
                                final Recomposer this$3 = this.this$0;
                                l$1 = this$3.d;
                                synchronized (l$1) {
                                    if (this$3.e == c0) {
                                        this$3.e = null;
                                    }
                                    this$3.v();
                                    monitorexit(l$1);
                                    final StateFlowImpl q3 = Recomposer.q;
                                    l$1 = this.this$0.p;
                                    b remove;
                                    StateFlowImpl q4;
                                    do {
                                        q4 = Recomposer.q;
                                        o = q4.getValue();
                                        remove = ((e)l$1).remove(l$1);
                                    } while (l$1 != remove && !q4.k(l$1, (Object)remove));
                                    return j.a;
                                }
                            }
                        }
                        finally {
                            final Object o;
                            final p p2;
                            l$1 = (o = p2);
                        }
                        ((i1.c)l$1).dispose();
                        final Recomposer this$4 = this.this$0;
                        Object d = this$4.d;
                        synchronized (d) {
                            if (this$4.e == c0) {
                                this$4.e = null;
                            }
                            this$4.v();
                            monitorexit(d);
                            final StateFlowImpl q5 = Recomposer.q;
                            final Recomposer$b p3 = this.this$0.p;
                            StateFlowImpl q6;
                            b remove2;
                            do {
                                q6 = Recomposer.q;
                                d = q6.getValue();
                                remove2 = ((e)d).remove((Object)p3);
                            } while (d != remove2 && !q6.k(d, (Object)remove2));
                            throw l$1;
                        }
                    }
                    c0 = new IllegalStateException("Recomposer already running".toString());
                    throw c0;
                }
                c0 = new IllegalStateException("Recomposer shut down".toString());
                throw c0;
            }
        }
    }
}
