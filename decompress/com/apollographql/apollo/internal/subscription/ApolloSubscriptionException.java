// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.internal.subscription;

import com.apollographql.apollo.exception.ApolloException;

public class ApolloSubscriptionException extends ApolloException
{
    public ApolloSubscriptionException(final String s) {
        super(s);
    }
    
    public ApolloSubscriptionException(final String s, final Throwable t) {
        super(s, t);
    }
}
