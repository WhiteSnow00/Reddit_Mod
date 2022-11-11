// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import com.apollographql.apollo.ApolloSubscriptionCall$a;
import java.util.Iterator;
import java.util.Collection;
import com.apollographql.apollo.internal.d$b;
import java.util.LinkedHashMap;
import com.apollographql.apollo.subscription.SubscriptionManagerState;

public final class h implements Runnable
{
    public final /* synthetic */ a$g f;
    
    public h(final a$g f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        final a a = this.f.a;
        synchronized (a) {
            final SubscriptionManagerState b = a.b;
            final Collection values = a.a.values();
            a.b = SubscriptionManagerState.DISCONNECTED;
            a.a = new LinkedHashMap();
            monitorexit(a);
            final Iterator iterator = values.iterator();
            while (iterator.hasNext()) {
                final d$b d$b = (d$b)((a.f)iterator.next()).c;
                final ApolloSubscriptionCall$a a2 = d$b.a;
                if (a2 != null) {
                    a2.d();
                }
                d$b.a();
            }
            a.d(b, a.b);
        }
    }
}
