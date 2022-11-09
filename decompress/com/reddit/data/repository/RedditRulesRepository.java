// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import zg2.p;
import a4.u1;
import tg2.c;
import ah2.f;
import com.reddit.domain.model.streaming.RemovalReasons;
import nf2.c0;
import r20.a;
import com.reddit.data.remote.RemoteRulesDataSource;
import ge0.h0;

public final class RedditRulesRepository implements h0
{
    public final RemoteRulesDataSource a;
    public final a b;
    
    public RedditRulesRepository(final RemoteRulesDataSource a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    public final c0<RemovalReasons> a(final String s) {
        f.f((Object)s, "subreddit");
        return (c0<RemovalReasons>)u1.W0((p)new RedditRulesRepository$getRemovalReasons$1(this, s, (c)null));
    }
}
