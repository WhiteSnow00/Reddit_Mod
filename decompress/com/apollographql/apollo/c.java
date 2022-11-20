// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo;

public interface c<T> extends ApolloCall<T>
{
    default /* bridge */ ApolloCall$a toBuilder() {
        return (ApolloCall$a)this.toBuilder();
    }
    
    com.apollographql.apollo.internal.c.c toBuilder();
}
