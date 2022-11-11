// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.external.vaultbanner;

import kotlinx.coroutines.JobSupport;
import java.util.concurrent.CancellationException;
import java.util.Iterator;
import java.util.List;
import mj2.b;
import ej2.r1;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import jj2.m;
import ej2.j0;
import lg.e0;
import ej2.b0;
import ej2.g;
import com.reddit.domain.model.Subreddit;
import x82.h0;
import ab2.i$a;
import x82.p;
import x82.o$f;
import x82.q0$a;
import com.reddit.vault.external.VaultBannerAction;
import javax.inject.Inject;
import sg2.e;
import jj2.f;
import com.reddit.listing.model.Listable;
import ym0.l;
import vh0.h;
import ab2.i;
import r82.c;
import com.reddit.session.o;
import xd0.g0;
import d92.d;

public final class a implements d
{
    public final g0 a;
    public final o b;
    public final cb2.a c;
    public final c d;
    public final i e;
    public final h f;
    public final l<Listable> g;
    public final gu0.c h;
    public f i;
    
    @Inject
    public a(final g0 a, final o b, final cb2.a c, final c d, final i e, final h f, final l<? super Listable> g, final gu0.c h) {
        sg2.e.f((Object)a, "subredditRepository");
        sg2.e.f((Object)b, "sessionManager");
        sg2.e.f((Object)c, "vaultSettings");
        sg2.e.f((Object)d, "vaultRepository");
        sg2.e.f((Object)e, "vaultNavigator");
        sg2.e.f((Object)f, "metaAnalytics");
        sg2.e.f((Object)g, "listingView");
        sg2.e.f((Object)h, "listingScreenData");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = (l<Listable>)g;
        this.h = h;
    }
    
    public final void a(final d92.e e, final VaultBannerAction vaultBannerAction, final com.reddit.vault.h h) {
        e.f((Object)vaultBannerAction, "action");
        e.f((Object)h, "listener");
        final h0 k = e.k;
        final int n = com.reddit.vault.external.vaultbanner.a.a$a.a[((Enum)vaultBannerAction).ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    this.c();
                }
            }
            else {
                this.c.o1(e.k.f.w);
                this.c();
                final h f = this.f;
                final x82.h f2 = k.f;
                f.m((vh0.i)new vh0.a(f2.f, f2.w));
            }
        }
        else {
            i$a.a(this.e, (x82.o)new o$f((p)q0$a.g, k), (String)null, h, 2);
            final h f3 = this.f;
            final x82.h f4 = k.f;
            f3.m((vh0.i)new vh0.d(f4.f, f4.w));
        }
    }
    
    public final void b(final Subreddit subreddit, final boolean b) {
        if (b) {
            final f i = this.i;
            int n = 0;
            if (i != null) {
                n = n;
                if (ej2.g.g((b0)i)) {
                    n = 1;
                }
            }
            if (n == 0) {
                final r1 g = e0.g();
                final b a = j0.a;
                ej2.g.i((b0)(this.i = ej2.g.a(((JobSupport)g).plus((CoroutineContext)m.a.V()).plus((CoroutineContext)c30.a.a))), (CoroutineContext)null, (CoroutineStart)null, (rg2.p)new RedditVaultBannerDataPresenterDelegate$requestVaultBanner$1(this, subreddit, null), 3);
            }
        }
    }
    
    public final void c() {
        final List lc = this.h.Lc();
        final Iterator iterator = lc.iterator();
        int n = 0;
        while (true) {
            while (iterator.hasNext()) {
                if (((Listable)iterator.next()) instanceof d92.e) {
                    if (n >= 0) {
                        lc.remove(n);
                        this.g.e1(lc);
                        this.g.sq(n, 1);
                    }
                    return;
                }
                ++n;
            }
            n = -1;
            continue;
        }
    }
    
    public final void destroy() {
        final f i = this.i;
        if (i != null) {
            ej2.g.d((b0)i, (CancellationException)null);
        }
    }
}
