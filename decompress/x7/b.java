// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import com.apollographql.apollo.ApolloSubscriptionCall$a;
import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.internal.subscription.ApolloSubscriptionException;
import a8.c;
import java.util.UUID;
import com.apollographql.apollo.subscription.SubscriptionManagerState;
import com.apollographql.apollo.internal.d$b;
import h7.p;

public final class b implements Runnable
{
    public final /* synthetic */ p f;
    public final /* synthetic */ i.a g;
    public final /* synthetic */ a h;
    
    public b(final a h, final p f, final d$b g) {
        this.h = h;
        this.f = f;
        this.g = (i.a)g;
    }
    
    @Override
    public final void run() {
        final a h = this.h;
        final p f = this.f;
        final i.a g = this.g;
        synchronized (h) {
            final SubscriptionManagerState b = h.b;
            final SubscriptionManagerState b2 = h.b;
            final SubscriptionManagerState stopping = SubscriptionManagerState.STOPPING;
            if (b2 != stopping && h.b != SubscriptionManagerState.STOPPED) {
                h.c.a(2);
                final UUID randomUUID = UUID.randomUUID();
                h.a.put(randomUUID, new a.f(randomUUID, (p<?, ?, ?>)f, g));
                if (h.b == SubscriptionManagerState.DISCONNECTED) {
                    h.b = SubscriptionManagerState.CONNECTING;
                    h.e.a();
                }
                else if (h.b == SubscriptionManagerState.ACTIVE) {
                    h.e.c(new c.b(randomUUID.toString(), (p<?, ?, ?>)f, h.d, h.n, false));
                }
            }
            monitorexit(h);
            if (b != stopping && b != SubscriptionManagerState.STOPPED) {
                if (b == SubscriptionManagerState.CONNECTED) {
                    final ApolloSubscriptionCall$a a = ((d$b)g).a;
                    if (a != null) {
                        a.b();
                    }
                }
            }
            else {
                final StringBuilder r = a.r("Illegal state: ");
                r.append(((Enum)h.b).name());
                r.append(" for subscriptions to be created. SubscriptionManager.start() must be called to re-enable subscriptions.");
                final ApolloSubscriptionException ex = new ApolloSubscriptionException(r.toString());
                final d$b d$b = (d$b)g;
                final ApolloSubscriptionCall$a a2 = d$b.a;
                if (a2 != null) {
                    a2.a((ApolloException)ex);
                }
                d$b.a();
            }
            h.d(b, h.b);
        }
    }
}
