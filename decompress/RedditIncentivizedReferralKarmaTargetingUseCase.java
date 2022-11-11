// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.incentivizedinvites;

import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import javax.inject.Inject;
import ah2.f;
import db0.a0;
import cm0.a;
import zb0.c;
import com.reddit.session.Session;
import zb0.d;

public final class RedditIncentivizedReferralKarmaTargetingUseCase implements d
{
    public final Session a;
    public final c b;
    public final a c;
    public final a0 d;
    public final e20.a e;
    
    @Inject
    public RedditIncentivizedReferralKarmaTargetingUseCase(final Session a, final x40.c b, final a c, final a0 d, final e20.a e) {
        f.f((Object)a, "session");
        f.f((Object)c, "karmaStatisticsRepository");
        f.f((Object)d, "sharingFeatures");
        this.a = a;
        this.b = (c)b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final Object a(final boolean b, final tg2.c<? super String> c) {
        return g.l((CoroutineContext)this.e.c(), (p)new RedditIncentivizedReferralKarmaTargetingUseCase$isEligibleForIncentivizedKarmaTargeting$2(this, b, (tg2.c)null), (tg2.c)c);
    }
}
