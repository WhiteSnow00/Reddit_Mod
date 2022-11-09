// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.modtools;

import ak0.m;
import java.util.List;
import nf2.c0;
import sf2.g;
import io.reactivex.internal.functions.Functions;
import sf2.o;
import zg2.p;
import a4.u1;
import pj2.e;
import javax.inject.Inject;
import com.reddit.domain.repository.ModQueueContentType;
import ah2.f;
import kotlinx.coroutines.flow.StateFlowImpl;
import com.reddit.domain.model.Link;
import android.content.SharedPreferences;
import r20.c;
import of0.n0;
import com.reddit.domain.modtools.queuebadging.ModQueueBadgingRepository;

public final class RedditModQueueBadgingRepository implements ModQueueBadgingRepository
{
    public final n0 a;
    public final c b;
    public final SharedPreferences c;
    public Link d;
    public final StateFlowImpl e;
    public boolean f;
    
    @Inject
    public RedditModQueueBadgingRepository(final n0 a, final c b, final SharedPreferences c) {
        ah2.f.f((Object)a, "modQueueLoadData");
        ah2.f.f((Object)b, "postExecutionThread");
        ah2.f.f((Object)c, "userPreferences");
        this.a = a;
        this.b = b;
        this.c = c;
        final ModQueueContentType links = ModQueueContentType.LINKS;
        this.e = o72.f.f((Object)null);
    }
    
    @Override
    public final e getPendingQueueCount() {
        return (e)this.e;
    }
    
    @Override
    public final boolean getReadyForUpdate() {
        return this.f;
    }
    
    @Override
    public final void markViewed() {
        this.e.setValue((Object)null);
        final Link d = this.d;
        if (d != null) {
            d.v(this.c, "com.reddit.data.modtools.last_viewed_link_id", d.getKindWithId());
        }
    }
    
    @Override
    public final void setLastViewedLink(final Link d) {
        if (d != null) {
            final Link d2 = this.d;
            long createdUtc;
            if (d2 != null) {
                createdUtc = d2.getCreatedUtc();
            }
            else {
                createdUtc = 0L;
            }
            if (createdUtc < d.getCreatedUtc()) {
                this.d = d;
            }
        }
    }
    
    @Override
    public final void setReadyForUpdate(final boolean f) {
        this.f = f;
    }
    
    @Override
    public final void triggerUpdate(final boolean b) {
        if (this.f && b) {
            this.f = false;
            final c0 b2 = u1.W0((p)new RedditModQueueBadgingRepository$triggerUpdate$1(this, (tg2.c)null)).w((o)new qw.d(8)).B((o)new wu.e(4));
            ah2.f.e((Object)b2, "override fun triggerUpda\u2026      }\n      }\n    }\n  }");
            u1.H0(b2, (r20.d)this.b).F((g)new e40.f((Object)this, 1), (g)Functions.e);
            return;
        }
        this.e.setValue((Object)null);
    }
    
    public abstract static class a
    {
        public static final class a extends RedditModQueueBadgingRepository.a
        {
            public static final a a;
            
            static {
                a = new a();
            }
        }
        
        public static final class b extends RedditModQueueBadgingRepository.a
        {
            public final List<Link> a;
            
            public b(final List<Link> a) {
                f.f((Object)a, "links");
                this.a = a;
            }
            
            @Override
            public final boolean equals(final Object o) {
                return this == o || (o instanceof b && ah2.f.a((Object)this.a, (Object)((b)o).a));
            }
            
            @Override
            public final int hashCode() {
                return this.a.hashCode();
            }
            
            @Override
            public final String toString() {
                return m.n(a.k("Success(links="), (List)this.a, ')');
            }
        }
    }
}
