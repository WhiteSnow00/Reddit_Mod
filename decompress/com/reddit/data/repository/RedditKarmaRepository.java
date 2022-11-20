// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import q20.d;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.Karma;
import java.util.List;
import af2.c0;
import javax.inject.Inject;
import ng2.e;
import cg2.f;
import y50.d0;
import q20.a;
import xd0.i;

public final class RedditKarmaRepository implements i
{
    public final a a;
    public final d0 b;
    public final x40.d0 c;
    public final f d;
    
    @Inject
    public RedditKarmaRepository(final a a, final d0 b, final x40.d0 c) {
        e.f((Object)a, "backgroundThread");
        e.f((Object)b, "remote");
        e.f((Object)c, "local");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((mg2.a)new RedditKarmaRepository$store$2(this));
    }
    
    @Override
    public final c0<List<Karma>> a(final String s) {
        e.f((Object)s, "username");
        final Object value = this.d.getValue();
        e.e(value, "<get-store>(...)");
        final c0 value2 = ((Store)value).get((Object)s);
        e.e((Object)value2, "store.get(username)");
        return px1.a.K0(value2, (d)this.a);
    }
}
