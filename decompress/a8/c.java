// 
// Decompiled by Procyon v0.6.0
// 

package a8;

import com.apollographql.apollo.api.ScalarTypeAdapters;
import h7.p;
import sg2.e;
import com.apollographql.apollo.subscription.SubscriptionConnectionParams;
import java.util.Map;

public abstract class c
{
    public static final class a extends c
    {
        public final Map<String, Object> a;
        
        public a(final SubscriptionConnectionParams a) {
            e.g((Object)a, "connectionParams");
            this.a = (Map<String, Object>)a;
        }
    }
    
    public static final class b extends c
    {
        public final String a;
        public final p<?, ?, ?> b;
        public final ScalarTypeAdapters c;
        public final boolean d;
        public final boolean e;
        
        public b(final String a, final p<?, ?, ?> b, final ScalarTypeAdapters c, final boolean d, final boolean e) {
            e.g((Object)a, "subscriptionId");
            e.g((Object)b, "subscription");
            e.g((Object)c, "scalarTypeAdapters");
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
    
    public static final class c extends a8.c
    {
        public final String a;
        
        public c(final String a) {
            e.g((Object)a, "subscriptionId");
            this.a = a;
        }
    }
    
    public static final class d extends c
    {
    }
}
