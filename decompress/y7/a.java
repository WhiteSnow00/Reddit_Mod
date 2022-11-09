// 
// Decompiled by Procyon v0.6.0
// 

package y7;

import java.util.UUID;
import com.apollographql.apollo.ApolloSubscriptionCall;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import java.util.Iterator;
import b8.c;
import java.util.Collection;
import com.apollographql.apollo.internal.d$b;
import h7.p;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Map;
import java.util.concurrent.Executor;
import b8.f;
import b8.g;
import com.apollographql.apollo.api.ScalarTypeAdapters;
import com.apollographql.apollo.subscription.SubscriptionManagerState;
import java.util.LinkedHashMap;

public final class a implements i
{
    public static final long o;
    public static final long p;
    public LinkedHashMap a;
    public volatile SubscriptionManagerState b;
    public final a.a$e c;
    public final ScalarTypeAdapters d;
    public final b8.g e;
    public final f f;
    public final Executor g;
    public final long h;
    public final zg2.a<n7.f<Map<String, Object>>> i;
    public final a$a j;
    public final a$b k;
    public final a$c l;
    public final CopyOnWriteArrayList m;
    public final boolean n;
    
    static {
        final TimeUnit seconds = TimeUnit.SECONDS;
        o = seconds.toMillis(5L);
        p = seconds.toMillis(10L);
    }
    
    public a(final ScalarTypeAdapters d, final b8.g.b b, final f.a f, final Executor g, final long h, final com.apollographql.apollo.a.a.a$a$a i) {
        this.a = new LinkedHashMap();
        this.b = SubscriptionManagerState.DISCONNECTED;
        this.c = new a.a$e();
        this.j = new a$a(this);
        this.k = new a$b(this);
        this.l = new a$c(this);
        this.m = new CopyOnWriteArrayList();
        if (b == null) {
            throw new NullPointerException("transportFactory == null");
        }
        this.d = d;
        if (f != null) {
            this.f = f;
            this.e = b.a(new g(this, g));
            this.g = g;
            this.h = h;
            this.i = (zg2.a<n7.f<Map<String, Object>>>)i;
            this.n = false;
            return;
        }
        throw new NullPointerException("connectionParams == null");
    }
    
    public final void a(final p p2, final d$b d$b) {
        if (p2 != null) {
            this.g.execute((Runnable)new b(this, p2, d$b));
            return;
        }
        throw new NullPointerException("subscription == null");
    }
    
    public final void b(final p p) {
        if (p != null) {
            this.g.execute((Runnable)new a$d(this, p));
            return;
        }
        throw new NullPointerException("subscription == null");
    }
    
    public final Collection<a.a$f> c(final boolean b) {
        synchronized (this) {
            final SubscriptionManagerState b2 = this.b;
            final Collection values = this.a.values();
            if (b || this.a.isEmpty()) {
                this.e.c(new c.d());
                SubscriptionManagerState b3;
                if (this.b == SubscriptionManagerState.STOPPING) {
                    b3 = SubscriptionManagerState.STOPPED;
                }
                else {
                    b3 = SubscriptionManagerState.DISCONNECTED;
                }
                this.b = b3;
                this.a = new LinkedHashMap();
            }
            monitorexit(this);
            this.d(b2, this.b);
            return values;
        }
    }
    
    public final void d(final SubscriptionManagerState subscriptionManagerState, final SubscriptionManagerState subscriptionManagerState2) {
        if (subscriptionManagerState == subscriptionManagerState2) {
            return;
        }
        final Iterator iterator = this.m.iterator();
        while (iterator.hasNext()) {
            ((b8.b)iterator.next()).onStateChange();
        }
    }
    
    public final void e(final Throwable t) {
        final Iterator<a.a$f> iterator = this.c(true).iterator();
        while (iterator.hasNext()) {
            final d$b d$b = (d$b)iterator.next().c;
            final ApolloSubscriptionCall.a a = d$b.a;
            if (a != null) {
                a.a((ApolloException)new ApolloNetworkException("Subscription failed", t));
            }
            d$b.a();
        }
    }
    
    public final a.a$f f(final String s) {
        monitorenter(this);
        Label_0059: {
            try {
                try {
                    final a.a$f a$f = (a.a$f)this.a.remove(UUID.fromString(s));
                }
                catch (final IllegalArgumentException ex) {
                    final a.a$f a$f = null;
                }
                if (this.a.isEmpty()) {
                    this.c.b(2, (Runnable)this.k, y7.a.p);
                }
                break Label_0059;
            }
            finally {
                monitorexit(this);
                monitorexit(this);
                return;
            }
        }
    }
    
    public static final class g implements b8.g.a
    {
        public final a a;
        public final Executor b;
        
        public g(final a a, final Executor b) {
            this.a = a;
            this.b = b;
        }
    }
}
