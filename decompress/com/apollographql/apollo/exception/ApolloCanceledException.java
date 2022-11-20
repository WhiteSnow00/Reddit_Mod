// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.exception;

public final class ApolloCanceledException extends ApolloException
{
    public ApolloCanceledException() {
        super("Call is cancelled");
    }
    
    public ApolloCanceledException(final String s, final Throwable t) {
        super(s, t);
    }
}
