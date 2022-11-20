// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.predictions;

import mg2.p;
import gg2.c;
import ng2.e;
import af2.c0;

public final class b implements pt.b
{
    public final RedditPredictionsRepository f;
    
    public b(final RedditPredictionsRepository f) {
        this.f = f;
    }
    
    public final c0 m(final Object o) {
        final RedditPredictionsRepository f = this.f;
        final RedditPredictionsRepository$b redditPredictionsRepository$b = (RedditPredictionsRepository$b)o;
        e.f((Object)f, "this$0");
        e.f((Object)redditPredictionsRepository$b, "it");
        return ah0.b.m1((p)new RedditPredictionsRepository$subredditPredictionTournamentsStore$2$1$1(f, redditPredictionsRepository$b, (c)null));
    }
}
