// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import com.reddit.queries.tb$g;
import com.reddit.queries.tb$a;
import com.reddit.queries.tb$i;
import kotlin.collections.EmptyList;
import com.reddit.queries.tb$c;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import ur0.e;
import h7.k;
import ur0.e$a;
import com.reddit.queries.tb;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.queries.tb$f;
import java.util.List;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ur0.g;

public final class RemoteGqlPowerupMediaDataSource
{
    public final g a;
    
    @Inject
    public RemoteGqlPowerupMediaDataSource(final g a) {
        f.f((Object)a, "graphQlClient");
        this.a = a;
    }
    
    public final Object a(final String s, final c<? super List<tb$f>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof RemoteGqlPowerupMediaDataSource$getPowerupsEmojis.RemoteGqlPowerupMediaDataSource$getPowerupsEmojis$1) {
                final RemoteGqlPowerupMediaDataSource$getPowerupsEmojis.RemoteGqlPowerupMediaDataSource$getPowerupsEmojis$1 remoteGqlPowerupMediaDataSource$getPowerupsEmojis$1 = (RemoteGqlPowerupMediaDataSource$getPowerupsEmojis.RemoteGqlPowerupMediaDataSource$getPowerupsEmojis$1)c;
                final int label = remoteGqlPowerupMediaDataSource$getPowerupsEmojis$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    remoteGqlPowerupMediaDataSource$getPowerupsEmojis$1.label = label + Integer.MIN_VALUE;
                    o = remoteGqlPowerupMediaDataSource$getPowerupsEmojis$1;
                    break Label_0050;
                }
            }
            o = new RemoteGqlPowerupMediaDataSource$getPowerupsEmojis.RemoteGqlPowerupMediaDataSource$getPowerupsEmojis$1(this, (c)c);
        }
        final Object result = ((RemoteGqlPowerupMediaDataSource$getPowerupsEmojis.RemoteGqlPowerupMediaDataSource$getPowerupsEmojis$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((RemoteGqlPowerupMediaDataSource$getPowerupsEmojis.RemoteGqlPowerupMediaDataSource$getPowerupsEmojis$1)o).label;
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
            final g a = this.a;
            final tb tb = new tb(s);
            ((RemoteGqlPowerupMediaDataSource$getPowerupsEmojis.RemoteGqlPowerupMediaDataSource$getPowerupsEmojis$1)o).label = 1;
            if ((b = e$a.b(14, (k)tb, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final tb$i a2 = ((tb$c)b).a;
        if (a2 != null) {
            final tb$a d = a2.d;
            if (d != null) {
                final tb$g d2 = d.d;
                Object o2;
                if (d2 != null) {
                    o2 = d2.b;
                }
                else {
                    o2 = null;
                }
                if (o2 != null) {
                    return o2;
                }
            }
        }
        return EmptyList.INSTANCE;
    }
}
