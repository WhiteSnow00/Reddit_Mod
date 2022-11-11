// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import rg2.p;
import lg2.c;
import hj2.v;
import javax.inject.Inject;
import mr0.g;

public final class a implements db0.a
{
    public final g a;
    
    @Inject
    public a(final g a) {
        this.a = a;
    }
    
    public final v a(final String s) {
        return new v((p)new RedditGraphqlCreatorStatsDataSource$loadStats$1(this, s, (c)null));
    }
}
