// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import mg2.p;
import gg2.c;
import ng2.e;
import af2.c0;
import pt.b;

public final class a implements b
{
    public final RedditPredictionsRepository f;
    
    public a(final RedditPredictionsRepository f) {
        this.f = f;
    }
    
    public final c0 m(final Object o) {
        final RedditPredictionsRepository f = this.f;
        final RedditPredictionsRepository$a redditPredictionsRepository$a = (RedditPredictionsRepository$a)o;
        e.f((Object)f, "this$0");
        e.f((Object)redditPredictionsRepository$a, "it");
        return ah0.b.m1((p)new RedditPredictionsRepository$predictorsLeaderboardStore$2$1$1(f, redditPredictionsRepository$a, (c)null));
    }
}
