// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import com.squareup.moshi.JsonAdapter;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlowImpl;
import ng2.e;
import pu2.a;
import org.matrix.android.sdk.api.session.room.model.PowerLevelsContent;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import cg2.j;
import gg2.c;
import org.matrix.android.sdk.api.session.events.model.Event;
import mg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@hg2.c(c = "com.reddit.matrix.data.repository.RoomRepositoryImpl$setupRoomObservers$2", f = "RoomRepositoryImpl.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@" }, d2 = { "Lorg/matrix/android/sdk/api/session/events/model/Event;", "event", "Lcg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class RoomRepositoryImpl$setupRoomObservers$2 extends SuspendLambda implements p<Event, c<? super j>, Object>
{
    public Object L$0;
    public int label;
    public final RoomRepositoryImpl this$0;
    
    public RoomRepositoryImpl$setupRoomObservers$2(final RoomRepositoryImpl this$0, final c<? super RoomRepositoryImpl$setupRoomObservers$2> c) {
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final RoomRepositoryImpl$setupRoomObservers$2 roomRepositoryImpl$setupRoomObservers$2 = new RoomRepositoryImpl$setupRoomObservers$2(this.this$0, (c<? super RoomRepositoryImpl$setupRoomObservers$2>)c);
        roomRepositoryImpl$setupRoomObservers$2.L$0 = l$0;
        return (c<j>)roomRepositoryImpl$setupRoomObservers$2;
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        return this.invoke((Event)o, (c<? super j>)o2);
    }
    
    public final Object invoke(final Event event, final c<? super j> c) {
        return ((RoomRepositoryImpl$setupRoomObservers$2)this.create(event, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object fromJsonValue) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b4(fromJsonValue);
        final Event event = (Event)this.L$0;
        if (event == null) {
            return j.a;
        }
        final StateFlowImpl i = this.this$0.i;
        final Map c = event.c;
        final JsonAdapter a = hq2.d.a.a((Class)PowerLevelsContent.class);
        try {
            fromJsonValue = a.fromJsonValue((Object)c);
        }
        catch (final Exception ex) {
            pu2.a.a.f((Throwable)ex, d.i("To model failed : ", ex), new Object[0]);
            fromJsonValue = null;
        }
        e.c(fromJsonValue);
        i.setValue((Object)new zo2.a((PowerLevelsContent)fromJsonValue));
        return j.a;
    }
}
