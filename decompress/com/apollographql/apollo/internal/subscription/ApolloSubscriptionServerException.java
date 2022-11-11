// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal.subscription;

import java.util.Collections;
import java.util.Map;

public class ApolloSubscriptionServerException extends ApolloSubscriptionException
{
    public final Map<String, Object> errorPayload;
    
    public ApolloSubscriptionServerException(final Map<String, Object> map) {
        super("Subscription failed. Check errorPayload for more details.");
        if (map != null) {
            this.errorPayload = Collections.unmodifiableMap((Map<? extends String, ?>)map);
            return;
        }
        throw new NullPointerException("errorPayload == null");
    }
}
