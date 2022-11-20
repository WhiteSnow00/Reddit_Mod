// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo;

import com.apollographql.apollo.internal.c;

public interface d<T> extends ApolloCall<T>
{
    c.c a();
    
    default /* bridge */ ApolloCall$a toBuilder() {
        return (ApolloCall$a)this.a();
    }
}
