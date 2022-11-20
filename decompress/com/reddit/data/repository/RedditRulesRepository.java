// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import mg2.p;
import ah0.b;
import gg2.c;
import ng2.e;
import com.reddit.domain.model.streaming.RemovalReasons;
import af2.c0;
import q20.a;
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
    
    @Override
    public final c0<RemovalReasons> a(final String s) {
        e.f((Object)s, "subreddit");
        return ah0.b.m1((p)new RedditRulesRepository$getRemovalReasons$1(this, s, (c)null));
    }
}
