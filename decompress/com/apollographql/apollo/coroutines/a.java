// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.coroutines;

import com.apollographql.apollo.ApolloSubscriptionCall;
import com.apollographql.apollo.internal.d;
import zg2.p;
import pj2.u;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.apollographql.apollo.ApolloCall;
import mj2.l;
import com.apollographql.apollo.internal.c;

public final class a
{
    public static final Object a(final c c, final tg2.c c2) {
        final l l = new l(1, a80.a.a0(c2));
        l.o();
        l.I((zg2.l)new CoroutinesExtensionsKt$await$2$1((ApolloCall<Object>)c));
        c.c((ApolloCall.b<Object>)new o7.a(l));
        final Object n = l.n();
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
    
    public static final CallbackFlowBuilder b(final c c) {
        return u.m((p)new CoroutinesExtensionsKt$toFlow$1((ApolloCall)c, (tg2.c)null));
    }
    
    public static final CallbackFlowBuilder c(final d d) {
        return u.m((p)new CoroutinesExtensionsKt$toFlow$3((ApolloSubscriptionCall)d, (tg2.c)null));
    }
}
