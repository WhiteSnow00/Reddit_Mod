// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools.remote;

import com.reddit.fragment.WelcomeMessageFragment$a;
import com.reddit.fragment.WelcomeMessageFragment$b;
import com.reddit.queries.c6$a;
import com.reddit.queries.c6$d;
import com.reddit.queries.c6$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.c6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.welcomemessage.WelcomeMessage;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteWelcomeMessageDataSource
{
    public final g a;
    
    @Inject
    public RemoteWelcomeMessageDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(String s, final c<? super WelcomeMessage> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteWelcomeMessageDataSource$getWelcomeMessage.RemoteWelcomeMessageDataSource$getWelcomeMessage$1) {
                final RemoteWelcomeMessageDataSource$getWelcomeMessage.RemoteWelcomeMessageDataSource$getWelcomeMessage$1 remoteWelcomeMessageDataSource$getWelcomeMessage$1 = (RemoteWelcomeMessageDataSource$getWelcomeMessage.RemoteWelcomeMessageDataSource$getWelcomeMessage$1)c;
                final int label = remoteWelcomeMessageDataSource$getWelcomeMessage$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteWelcomeMessageDataSource$getWelcomeMessage$1.label = label + Integer.MIN_VALUE;
                    o = remoteWelcomeMessageDataSource$getWelcomeMessage$1;
                    break Label_0050;
                }
            }
            o = new RemoteWelcomeMessageDataSource$getWelcomeMessage.RemoteWelcomeMessageDataSource$getWelcomeMessage$1(this, (c)c);
        }
        final Object result = ((RemoteWelcomeMessageDataSource$getWelcomeMessage.RemoteWelcomeMessageDataSource$getWelcomeMessage$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteWelcomeMessageDataSource$getWelcomeMessage.RemoteWelcomeMessageDataSource$getWelcomeMessage$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            b = result;
        }
        else {
            aj2.c.Q0(result);
            final c6 c2 = new c6(s);
            final g a = this.a;
            ((RemoteWelcomeMessageDataSource$getWelcomeMessage.RemoteWelcomeMessageDataSource$getWelcomeMessage$1)o).label = 1;
            if ((b = e$a.b(14, (k)c2, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final c6$d a2 = ((c6$c)b).a;
        f.c((Object)a2);
        final c6$a b2 = a2.b;
        f.c((Object)b2);
        final WelcomeMessageFragment$b b3 = b2.b.a.b;
        Object o2 = null;
        final Object o3 = null;
        if (b3 != null) {
            final WelcomeMessageFragment$a b4 = b3.b;
            if (b4 != null) {
                s = b4.b;
            }
            else {
                s = null;
            }
            String s2 = s;
            if (s == null) {
                s2 = "";
            }
            Object c3 = o3;
            if (b4 != null) {
                c3 = b4.c;
            }
            final String value = String.valueOf(c3);
            s = b3.c;
            if (s == null) {
                s = "";
            }
            o2 = new WelcomeMessage(s2, value, s, b3.d, b3.e);
        }
        return o2;
    }
}
