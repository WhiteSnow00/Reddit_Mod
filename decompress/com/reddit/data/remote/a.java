// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import cg2.j;
import cj2.f;
import mg2.p;
import gg2.c;
import cj2.s;
import javax.inject.Inject;
import mr0.g;

public final class a implements eb0.a
{
    public final g a;
    
    @Inject
    public a(final g a) {
        this.a = a;
    }
    
    public final s a(final String s) {
        return new s((p<? super f<? super T>, ? super c<? super j>, ?>)new RedditGraphqlCreatorStatsDataSource$loadStats$1(this, s, (c)null));
    }
}
