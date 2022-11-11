// 
// Decompiled by Procyon v0.6.0
// 

package s7;

import m7.c;
import h7.n;
import h7.k;
import l7.a;
import com.apollographql.apollo.coroutines.CoroutinesExtensionsKt$toFlow$3$a;
import com.apollographql.apollo.internal.d;
import com.apollographql.apollo.ApolloSubscriptionCall$a;

public final class h implements Runnable
{
    public final /* synthetic */ ApolloSubscriptionCall$a f;
    public final /* synthetic */ d g;
    
    public h(final CoroutinesExtensionsKt$toFlow$3$a f, final d g) {
        this.g = g;
        this.f = (ApolloSubscriptionCall$a)f;
    }
    
    @Override
    public final void run() {
        final d g = this.g;
        final c a = g.c.a((k)g.a, (j7.h)((k<k.a, Object, k.b>)g.a).g(), g.c.d(), l7.a.b);
        final n n = null;
        n n2;
        try {
            n2 = (n)a.a();
        }
        catch (final Exception ex) {
            g.f.H(ex, "Failed to fetch subscription `%s` from the store", g.a);
            n2 = null;
        }
        if (n2 != null && n2.b != null) {
            g.f.B("Cache HIT for subscription `%s`", g.a);
        }
        else {
            g.f.B("Cache MISS for subscription `%s`", g.a);
            n2 = n;
        }
        if (n2 != null) {
            this.f.c(n2);
        }
    }
}
