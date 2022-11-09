// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api.internal;

import j7.c;
import java.util.Set;
import j7.a;
import java.io.Serializable;

public abstract class Optional<T> implements Serializable
{
    private static final long serialVersionUID = 0L;
    
    public static <T> Optional<T> absent() {
        return Absent.withType();
    }
    
    public static <T> Optional<T> fromNullable(final T t) {
        Object absent;
        if (t == null) {
            absent = absent();
        }
        else {
            absent = new Present((Object)t);
        }
        return (Optional<T>)absent;
    }
    
    public static <T> Optional<T> of(final T t) {
        t.getClass();
        return (Optional<T>)new Present((Object)t);
    }
    
    public abstract Optional<T> apply(final a<T> p0);
    
    public abstract Set<T> asSet();
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract <V> Optional<V> flatMap(final c<? super T, Optional<V>> p0);
    
    public abstract T get();
    
    @Override
    public abstract int hashCode();
    
    public abstract boolean isPresent();
    
    public abstract <V> Optional<V> map(final c<? super T, V> p0);
    
    public abstract Optional<T> or(final Optional<? extends T> p0);
    
    public abstract T or(final T p0);
    
    public abstract T orNull();
    
    @Override
    public abstract String toString();
    
    public abstract <V> Optional<V> transform(final c<? super T, V> p0);
}
