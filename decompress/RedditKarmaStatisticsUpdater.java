// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.karma_statistics;

import kotlinx.coroutines.JobSupport;
import zg2.p;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.b0;
import mj2.g;
import tg2.c;
import java.util.concurrent.CancellationException;
import javax.inject.Inject;
import mj2.p1;
import rj2.f;
import ge0.b;
import com.reddit.session.Session;
import ac0.a;

public final class RedditKarmaStatisticsUpdater implements a
{
    public final cm0.a a;
    public final Session b;
    public final b c;
    public final e20.a d;
    public f e;
    public p1 f;
    
    @Inject
    public RedditKarmaStatisticsUpdater(final cm0.a a, final Session b, final b c, final e20.a d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final void a(final String s) {
        final p1 f = this.f;
        p1 i = null;
        if (f != null) {
            ((JobSupport)f).a((CancellationException)null);
        }
        final f e = this.e;
        if (e != null) {
            i = g.i((b0)e, (CoroutineContext)null, (CoroutineStart)null, (p)new RedditKarmaStatisticsUpdater$startForUser$1(this, s, (c)null), 3);
        }
        this.f = i;
    }
    
    public final void end() {
        final f e = this.e;
        if (e != null) {
            g.d((b0)e, (CancellationException)null);
        }
        this.e = null;
    }
    
    public final void start() {
        this.e = g.a(((JobSupport)ah2.c.e()).plus((CoroutineContext)this.d.b()).plus((CoroutineContext)h30.a.a));
        if (!this.b.isLoggedIn()) {
            return;
        }
        final String username = this.b.getUsername();
        if (username == null) {
            return;
        }
        this.a(username);
    }
}
