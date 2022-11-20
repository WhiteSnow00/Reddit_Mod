// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import java.util.Iterator;
import java.util.ArrayList;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.matrix.android.sdk.api.session.room.model.Membership;
import kotlin.Metadata;
import cg2.j;
import gg2.c;
import ro2.h;
import java.util.List;
import mg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@hg2.c(c = "com.reddit.matrix.data.repository.UserSessionRepositoryImpl$setupSessionObservers$3", f = "UserSessionRepositoryImpl.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@" }, d2 = { "", "Lro2/h;", "list", "Lcg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class UserSessionRepositoryImpl$setupSessionObservers$3 extends SuspendLambda implements p<List<? extends h>, c<? super j>, Object>
{
    public final Membership $membership;
    public Object L$0;
    public int label;
    public final UserSessionRepositoryImpl this$0;
    
    public UserSessionRepositoryImpl$setupSessionObservers$3(final Membership $membership, final UserSessionRepositoryImpl this$0, final c<? super UserSessionRepositoryImpl$setupSessionObservers$3> c) {
        this.$membership = $membership;
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final UserSessionRepositoryImpl$setupSessionObservers$3 userSessionRepositoryImpl$setupSessionObservers$3 = new UserSessionRepositoryImpl$setupSessionObservers$3(this.$membership, this.this$0, (c<? super UserSessionRepositoryImpl$setupSessionObservers$3>)c);
        userSessionRepositoryImpl$setupSessionObservers$3.L$0 = l$0;
        return (c<j>)userSessionRepositoryImpl$setupSessionObservers$3;
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        return this.invoke((List<h>)o, (c<? super j>)o2);
    }
    
    public final Object invoke(final List<h> list, final c<? super j> c) {
        return ((UserSessionRepositoryImpl$setupSessionObservers$3)this.create(list, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            d.b4(o);
            final List list = (List)this.L$0;
            final ArrayList list2 = new ArrayList();
            for (final Object next : list) {
                if (((h)next).x ^ true) {
                    list2.add(next);
                }
            }
            if (this.$membership == Membership.JOIN) {
                this.this$0.l.setValue((Object)list2);
            }
            else {
                this.this$0.m.setValue((Object)list2);
            }
            return j.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
