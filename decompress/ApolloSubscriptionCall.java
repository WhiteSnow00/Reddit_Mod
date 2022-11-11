// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo;

import h7.n;
import com.apollographql.apollo.exception.ApolloException;

public interface ApolloSubscriptionCall<T>
{
    public enum CachePolicy
    {
        CACHE_AND_NETWORK, 
        NETWORK_ONLY, 
        NO_CACHE;
    }
    
    public interface a<T>
    {
        void a(final ApolloException p0);
        
        void b();
        
        void c(final n<T> p0);
        
        void d();
        
        void onCompleted();
    }
}
