// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Metadata;
import cg2.j;
import gg2.c;
import fo2.a$a;
import mg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@hg2.c(c = "com.reddit.matrix.data.repository.UserSessionRepositoryImpl$setupSessionObservers$1", f = "UserSessionRepositoryImpl.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {}, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@" }, d2 = { "Lfo2/a$a;", "it", "Lcg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
final class UserSessionRepositoryImpl$setupSessionObservers$1 extends SuspendLambda implements p<a$a, c<? super j>, Object>
{
    public Object L$0;
    public int label;
    public final UserSessionRepositoryImpl this$0;
    
    public UserSessionRepositoryImpl$setupSessionObservers$1(final UserSessionRepositoryImpl this$0, final c<? super UserSessionRepositoryImpl$setupSessionObservers$1> c) {
        this.this$0 = this$0;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final UserSessionRepositoryImpl$setupSessionObservers$1 userSessionRepositoryImpl$setupSessionObservers$1 = new UserSessionRepositoryImpl$setupSessionObservers$1(this.this$0, (c<? super UserSessionRepositoryImpl$setupSessionObservers$1>)c);
        userSessionRepositoryImpl$setupSessionObservers$1.L$0 = l$0;
        return (c<j>)userSessionRepositoryImpl$setupSessionObservers$1;
    }
    
    public final Object invoke(final a$a a$a, final c<? super j> c) {
        return ((UserSessionRepositoryImpl$setupSessionObservers$1)this.create(a$a, c)).invokeSuspend(j.a);
    }
    
    public /* bridge */ Object invoke(final Object o, final Object o2) {
        return this.invoke((a$a)o, (c<? super j>)o2);
    }
    
    public final Object invokeSuspend(final Object o) {
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            d.b4(o);
            this.this$0.k.setValue((Object)this.L$0);
            return j.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
