// 
// Decompiled by Procyon v0.6.0
// 

package b8;

import com.apollographql.apollo.subscription.SubscriptionConnectionParams;

public interface f
{
    SubscriptionConnectionParams a();
    
    public static final class a implements f
    {
        public final SubscriptionConnectionParams a;
        
        public a(final SubscriptionConnectionParams a) {
            this.a = a;
        }
        
        @Override
        public final SubscriptionConnectionParams a() {
            return this.a;
        }
    }
}
