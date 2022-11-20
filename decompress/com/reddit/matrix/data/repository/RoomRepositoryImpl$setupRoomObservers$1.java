// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import java.util.List;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import zi2.g;
import java.util.Set;
import kotlinx.coroutines.flow.StateFlowImpl;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import zi2.c0;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import cg2.j;
import gg2.c;
import ro2.h;
import mg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@hg2.c(c = "com.reddit.matrix.data.repository.RoomRepositoryImpl$setupRoomObservers$1", f = "RoomRepositoryImpl.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@" }, d2 = { "Lro2/h;", "summary", "Lcg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class RoomRepositoryImpl$setupRoomObservers$1 extends SuspendLambda implements p<h, c<? super j>, Object>
{
    public Object L$0;
    public int label;
    public final RoomRepositoryImpl this$0;
    
    public RoomRepositoryImpl$setupRoomObservers$1(final RoomRepositoryImpl this$0, final c<? super RoomRepositoryImpl$setupRoomObservers$1> c) {
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final RoomRepositoryImpl$setupRoomObservers$1 roomRepositoryImpl$setupRoomObservers$1 = new RoomRepositoryImpl$setupRoomObservers$1(this.this$0, (c<? super RoomRepositoryImpl$setupRoomObservers$1>)c);
        roomRepositoryImpl$setupRoomObservers$1.L$0 = l$0;
        return (c<j>)roomRepositoryImpl$setupRoomObservers$1;
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        return this.invoke((h)o, (c<? super j>)o2);
    }
    
    public final Object invoke(final h h, final c<? super j> c) {
        return ((RoomRepositoryImpl$setupRoomObservers$1)this.create(h, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b4(o);
        final h value = (h)this.L$0;
        if (value == null) {
            return j.a;
        }
        this.this$0.h.setValue((Object)value);
        final RoomRepositoryImpl this$0 = this.this$0;
        g.g((c0)this$0.g, null, null, (p)new p<c0, c<? super j>, Object>(this$0, value, null) {
            public final h $summary;
            public Object L$0;
            public int label;
            public final RoomRepositoryImpl this$0;
            
            public final c<j> create(final Object o, final c<?> c) {
                return (c<j>)new p<c0, c<? super j>, Object>(this.this$0, this.$summary, c) {
                    public final h $summary;
                    public Object L$0;
                    public int label;
                    public final RoomRepositoryImpl this$0;
                };
            }
            
            public /* bridge */ Object invoke(final Object o, final Object o2) {
                return this.invoke((c0)o, (c<? super j>)o2);
            }
            
            public final Object invoke(final c0 c0, final c<? super j> c2) {
                return ((RoomRepositoryImpl$setupRoomObservers$1$1)this.create(c0, c2)).invokeSuspend(j.a);
            }
            
            public final Object invokeSuspend(final Object o) {
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label = this.label;
                Object o2;
                Object a;
                if (label != 0) {
                    if (label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o2 = this.L$0;
                    d.b4(o);
                    a = o;
                }
                else {
                    d.b4(o);
                    final RoomRepositoryImpl this$0 = this.this$0;
                    final StateFlowImpl k = this$0.k;
                    final fy0.c e = this$0.e;
                    final Set m5 = CollectionsKt___CollectionsKt.M5((Iterable)this.$summary.o);
                    this.L$0 = k;
                    this.label = 1;
                    a = e.a(m5, (c)this);
                    if (a == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    o2 = k;
                }
                ((cj2.p<List>)o2).setValue(CollectionsKt___CollectionsKt.I5((Iterable)((Map)a).values()));
                return j.a;
            }
        }, 3);
        return j.a;
    }
}
