// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.repository;

import r20.d;
import a4.u1;
import com.nytimes.android.external.store3.base.impl.Store;
import com.reddit.domain.model.Karma;
import java.util.List;
import nf2.c0;
import javax.inject.Inject;
import pg2.f;
import c50.h0;
import d60.b0;
import r20.a;
import ge0.q;

public final class RedditKarmaRepository implements q
{
    public final a a;
    public final b0 b;
    public final h0 c;
    public final f d;
    
    @Inject
    public RedditKarmaRepository(final a a, final b0 b, final h0 c) {
        ah2.f.f((Object)a, "backgroundThread");
        ah2.f.f((Object)b, "remote");
        ah2.f.f((Object)c, "local");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((zg2.a)new RedditKarmaRepository$store.RedditKarmaRepository$store$2(this));
    }
    
    public final c0<List<Karma>> a(final String s) {
        ah2.f.f((Object)s, "username");
        final Object value = this.d.getValue();
        ah2.f.e(value, "<get-store>(...)");
        final c0 value2 = ((Store)value).get((Object)s);
        ah2.f.e((Object)value2, "store.get(username)");
        return (c0<List<Karma>>)u1.j1(value2, (d)this.a);
    }
}
