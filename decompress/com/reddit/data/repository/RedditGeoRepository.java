// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import java.io.Serializable;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import com.reddit.domain.model.UserLocation;
import com.reddit.data.remote.RemoteGqlGeoDataSource;
import ge0.k;

public final class RedditGeoRepository implements k
{
    public final RemoteGqlGeoDataSource a;
    public UserLocation b;
    
    @Inject
    public RedditGeoRepository(final RemoteGqlGeoDataSource a) {
        f.f((Object)a, "dataSource");
        this.a = a;
    }
    
    public final UserLocation a() {
        return this.b;
    }
    
    public final Object b(final boolean b, final c<? super UserLocation> c) {
        RedditGeoRepository$getUserLocation.RedditGeoRepository$getUserLocation$1 redditGeoRepository$getUserLocation$2 = null;
        Label_0050: {
            if (c instanceof RedditGeoRepository$getUserLocation.RedditGeoRepository$getUserLocation$1) {
                final RedditGeoRepository$getUserLocation.RedditGeoRepository$getUserLocation$1 redditGeoRepository$getUserLocation$1 = (RedditGeoRepository$getUserLocation.RedditGeoRepository$getUserLocation$1)c;
                final int label = redditGeoRepository$getUserLocation$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    redditGeoRepository$getUserLocation$1.label = label + Integer.MIN_VALUE;
                    redditGeoRepository$getUserLocation$2 = redditGeoRepository$getUserLocation$1;
                    break Label_0050;
                }
            }
            redditGeoRepository$getUserLocation$2 = new RedditGeoRepository$getUserLocation.RedditGeoRepository$getUserLocation$1(this, (c)c);
        }
        final Object result = redditGeoRepository$getUserLocation$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = redditGeoRepository$getUserLocation$2.label;
        RedditGeoRepository redditGeoRepository;
        Object b2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            redditGeoRepository = (RedditGeoRepository)redditGeoRepository$getUserLocation$2.L$0;
            aj2.c.Q0(result);
            b2 = result;
        }
        else {
            aj2.c.Q0(result);
            if (!b) {
                final UserLocation b3 = this.b;
                if (b3 != null) {
                    return b3;
                }
            }
            final RemoteGqlGeoDataSource a = this.a;
            redditGeoRepository$getUserLocation$2.L$0 = this;
            redditGeoRepository$getUserLocation$2.label = 1;
            b2 = a.b((c<? super UserLocation>)redditGeoRepository$getUserLocation$2);
            if (b2 == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            redditGeoRepository = this;
        }
        redditGeoRepository.b = (UserLocation)b2;
        return b2;
    }
    
    public final Serializable c(final String s, final String s2, final c c) {
        return this.a.a(s, s2, c);
    }
}
