// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import zg2.p;
import tg2.c;
import pj2.s;
import javax.inject.Inject;
import ur0.g;

public final class a implements lb0.a
{
    public final g a;
    
    @Inject
    public a(final g a) {
        this.a = a;
    }
    
    public final s a(final String s) {
        return new s((p)new RedditGraphqlCreatorStatsDataSource$loadStats$1(this, s, (c)null));
    }
}
