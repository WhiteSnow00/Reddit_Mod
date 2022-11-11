// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import n20.d;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.Karma;
import java.util.List;
import ff2.c0;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import v40.f0;
import w50.b0;
import n20.a;
import xd0.i;

public final class RedditKarmaRepository implements i
{
    public final a a;
    public final b0 b;
    public final f0 c;
    public final f d;
    
    @Inject
    public RedditKarmaRepository(final a a, final b0 b, final f0 c) {
        e.f((Object)a, "backgroundThread");
        e.f((Object)b, "remote");
        e.f((Object)c, "local");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((rg2.a)new RedditKarmaRepository$store$2(this));
    }
    
    public final c0<List<Karma>> a(final String s) {
        e.f((Object)s, "username");
        final Store value = this.d.getValue();
        e.e((Object)value, "<get-store>(...)");
        final c0 value2 = value.get((Object)s);
        e.e((Object)value2, "store.get(username)");
        return nn0.a.V(value2, (d)this.a);
    }
}
