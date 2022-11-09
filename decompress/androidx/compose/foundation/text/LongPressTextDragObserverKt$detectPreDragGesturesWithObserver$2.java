// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import java.util.List;
import z1.n;
import z1.k;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import z1.o;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import v0.l;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import z1.v;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lz1/v;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = { 98 }, m = "invokeSuspend")
final class LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 extends SuspendLambda implements p<v, c<? super j>, Object>
{
    public final /* synthetic */ l $observer;
    private /* synthetic */ Object L$0;
    public int label;
    
    public LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(final l $observer, final c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2> c) {
        this.$observer = $observer;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(this.$observer, (c<? super LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2>)c);
        longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2.L$0 = l$0;
        return (c<j>)longPressTextDragObserverKt$detectPreDragGesturesWithObserver$2;
    }
    
    public final Object invoke(final v v, final c<? super j> c) {
        return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2)this.create(v, c)).invokeSuspend(j.a);
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
            final v v = (v)this.L$0;
            final p<z1.c, c<? super j>, Object> p = (p<z1.c, c<? super j>, Object>)new p<z1.c, c<? super j>, Object>() {
                public final /* synthetic */ l $observer;
                private /* synthetic */ Object L$0;
                public Object L$1;
                public int label;
                
                public final c<j> create(final Object l$0, final c<?> c) {
                    final p<z1.c, c<? super j>, Object> p2 = (p<z1.c, c<? super j>, Object>)new p<z1.c, c<? super j>, Object>() {
                        public final /* synthetic */ l $observer = this.$observer;
                        private /* synthetic */ Object L$0;
                        public Object L$1;
                        public int label;
                    };
                    p2.L$0 = l$0;
                    return (c<j>)p2;
                }
                
                public final Object invoke(final z1.c c, final c<? super j> c2) {
                    return ((LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1)this.create(c, c2)).invokeSuspend(j.a);
                }
                
                public final Object invokeSuspend(final Object o) {
                    final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                    final int label = this.label;
                    while (true) {
                        Object o3 = null;
                        p<z1.c, c<? super j>, Object> p = null;
                        o l$2 = null;
                        Label_0211: {
                            Object b;
                            z1.c l$3;
                            if (label != 0) {
                                if (label != 1) {
                                    if (label == 2) {
                                        final o o2 = (o)this.L$1;
                                        final z1.c l$0 = (z1.c)this.L$0;
                                        aj2.c.Q0(o);
                                        o3 = o;
                                        p = this;
                                        l$2 = o2;
                                        break Label_0211;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                else {
                                    final z1.c c = (z1.c)this.L$0;
                                    aj2.c.Q0(o);
                                    b = o;
                                    l$3 = c;
                                }
                            }
                            else {
                                aj2.c.Q0(o);
                                l$3 = (z1.c)this.L$0;
                                this.L$0 = l$3;
                                this.label = 1;
                                if ((b = TapGestureDetectorKt.b(l$3, true, (c<? super o>)this)) == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                            }
                            final o o4 = (o)b;
                            final l $observer = this.$observer;
                            final long c2 = o4.c;
                            $observer.a();
                            final p<z1.c, c<? super j>, Object> p2 = (p<z1.c, c<? super j>, Object>)this;
                            final z1.c l$0 = l$3;
                            l$2 = o4;
                            p2.L$0 = l$0;
                            p2.L$1 = l$2;
                            p2.label = 2;
                            final Object o5 = z1.c.O0(l$0, (BaseContinuationImpl)p2);
                            p = p2;
                            if ((o3 = o5) == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                        final int n = 0;
                        final List<o> a = ((k)o3).a;
                        final int size = a.size();
                        int n2 = 0;
                        int n3;
                        while (true) {
                            n3 = n;
                            if (n2 >= size) {
                                break;
                            }
                            final o o6 = a.get(n2);
                            if (z1.n.a(o6.a, l$2.a) && o6.d) {
                                n3 = 1;
                                break;
                            }
                            ++n2;
                        }
                        final p<z1.c, c<? super j>, Object> p2 = (p<z1.c, c<? super j>, Object>)p;
                        if (n3 == 0) {
                            p.$observer.d();
                            return j.a;
                        }
                        continue;
                    }
                }
            };
            this.label = 1;
            if (v.F0((zg2.p<? super z1.c, ? super tg2.c<? super Object>, ?>)p, (tg2.c<? super Object>)this) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return j.a;
    }
}
