// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import rg2.p;
import yd.b;
import lg2.c;
import sg2.e;
import com.reddit.domain.model.streaming.RemovalReasons;
import ff2.c0;
import n20.a;
import com.reddit.data.remote.RemoteRulesDataSource;
import xd0.z;

public final class RedditRulesRepository implements z
{
    public final RemoteRulesDataSource a;
    public final a b;
    
    public RedditRulesRepository(final RemoteRulesDataSource a, final a b) {
        this.a = a;
        this.b = b;
    }
    
    public final c0<RemovalReasons> a(final String s) {
        e.f((Object)s, "subreddit");
        return yd.b.b0((p)new RedditRulesRepository$getRemovalReasons$1(this, s, (c)null));
    }
}
