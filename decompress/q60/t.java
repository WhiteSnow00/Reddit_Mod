// 
// Decompiled by Procyon v0.6.0
// 

package q60;

import com.reddit.domain.snoovatar.model.SubscriptionState;
import javax.inject.Inject;

public final class t implements x
{
    @Inject
    public t() {
    }
    
    public final SubscriptionState a(final boolean b, final boolean b2) {
        SubscriptionState subscriptionState;
        if (b && b2) {
            subscriptionState = SubscriptionState.PAYING_PREMIUM;
        }
        else if (b) {
            subscriptionState = SubscriptionState.PREMIUM;
        }
        else {
            subscriptionState = SubscriptionState.FREE;
        }
        return subscriptionState;
    }
}
