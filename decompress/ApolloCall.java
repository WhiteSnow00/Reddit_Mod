// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo;

import h7.n;
import com.apollographql.apollo.exception.ApolloException;
import h7.k;

public interface ApolloCall<T>
{
    void cancel();
    
    k operation();
    
    a<T> toBuilder();
    
    public enum StatusEvent
    {
        COMPLETED, 
        FETCH_CACHE, 
        FETCH_NETWORK, 
        SCHEDULED;
    }
    
    public interface a<T>
    {
    }
    
    public abstract static class b<T>
    {
        public abstract void a(final ApolloException p0);
        
        public abstract void b(final n<T> p0);
        
        public void c(final StatusEvent statusEvent) {
        }
    }
}
