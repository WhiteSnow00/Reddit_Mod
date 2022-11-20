// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.powerups;

import mg2.p;
import gg2.c;
import ng2.e;
import af2.c0;
import pt.b;

public final class a implements b
{
    public final RedditPowerupsRepository f;
    
    public a(final RedditPowerupsRepository f) {
        this.f = f;
    }
    
    public final c0 m(final Object o) {
        final RedditPowerupsRepository f = this.f;
        final String s = (String)o;
        e.f((Object)f, "this$0");
        e.f((Object)s, "subredditName");
        return ah0.b.m1((p)new RedditPowerupsRepository$subredditAchievementFlairStore$2$1$1(f, s, (c)null));
    }
}
