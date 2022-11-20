// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.debug.storage;

import javax.inject.Inject;
import cg2.f;
import i40.a;
import android.content.Context;

public final class RedditFileDebugOptionsRepository
{
    public final Context a;
    public final a b;
    public final f c;
    
    @Inject
    public RedditFileDebugOptionsRepository(final Context a, final a b) {
        this.a = a;
        this.b = b;
        this.c = kotlin.a.b((mg2.a)new RedditFileDebugOptionsRepository$options$2(this));
    }
}
