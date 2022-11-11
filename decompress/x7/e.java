// 
// Decompiled by Procyon v0.6.0
// 

package x7;

import com.apollographql.apollo.ApolloSubscriptionCall$a;
import java.util.Iterator;
import com.apollographql.apollo.internal.d$b;
import a8.c;
import java.util.Collection;
import com.apollographql.apollo.subscription.SubscriptionManagerState;
import java.util.ArrayList;

public final class e implements Runnable
{
    public final /* synthetic */ a$g f;
    
    public e(final a$g f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        final a a = this.f.a;
        a.getClass();
        final ArrayList list = new ArrayList();
        monitorenter(a);
        Label_0098: {
            try {
                final SubscriptionManagerState b = a.b;
                if (a.b == SubscriptionManagerState.CONNECTING) {
                    list.addAll(a.a.values());
                    a.b = SubscriptionManagerState.CONNECTED;
                    a.e.c(new c.a(a.f.a()));
                }
                break Label_0098;
            }
            finally {
                monitorexit(a);
            Block_7_Outer:
                while (true) {
                    while (true) {
                        Iterator iterator = null;
                    Block_6:
                        while (true) {
                            iftrue(Label_0177:)(!iterator.hasNext());
                            break Block_6;
                            monitorexit(a);
                            iterator = list.iterator();
                            continue Block_7_Outer;
                            final ApolloSubscriptionCall$a a2;
                            a2.b();
                            continue Block_7_Outer;
                        }
                        final ApolloSubscriptionCall$a a2 = ((d$b)((a.f)iterator.next()).c).a;
                        iftrue(Label_0131:)(a2 == null);
                        continue;
                    }
                    iftrue(Label_0123:)(a.b != SubscriptionManagerState.CONNECTED);
                    Block_5: {
                        break Block_5;
                        Label_0177: {
                            final SubscriptionManagerState b;
                            a.d(b, a.b);
                        }
                        return;
                    }
                    a.c.b(1, a.j, x7.a.o);
                    continue Block_7_Outer;
                }
            }
        }
    }
}
