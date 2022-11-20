// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api.internal;

import j7.c;
import java.util.Collections;
import java.util.Set;
import j7.a;

final class Absent<T> extends Optional<T>
{
    public static final Absent<Object> INSTANCE;
    private static final long serialVersionUID = 0L;
    
    static {
        INSTANCE = new Absent<Object>();
    }
    
    private Absent() {
    }
    
    private Object readResolve() {
        return Absent.INSTANCE;
    }
    
    public static <T> Optional<T> withType() {
        return (Optional<T>)Absent.INSTANCE;
    }
    
    public Optional<T> apply(final a<T> a) {
        a.getClass();
        return (Optional<T>)Optional.absent();
    }
    
    public Set<T> asSet() {
        return Collections.emptySet();
    }
    
    public boolean equals(final Object o) {
        return o == this;
    }
    
    public <V> Optional<V> flatMap(final c<? super T, Optional<V>> c) {
        c.getClass();
        return (Optional<V>)Optional.absent();
    }
    
    public T get() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }
    
    public int hashCode() {
        return 2040732332;
    }
    
    public boolean isPresent() {
        return false;
    }
    
    public <V> Optional<V> map(final c<? super T, V> c) {
        c.getClass();
        return (Optional<V>)Optional.absent();
    }
    
    public Optional<T> or(final Optional<? extends T> optional) {
        optional.getClass();
        return (Optional<T>)optional;
    }
    
    public T or(final T t) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }
    
    public T orNull() {
        return null;
    }
    
    public String toString() {
        return "Optional.absent()";
    }
    
    public <V> Optional<V> transform(final c<? super T, V> c) {
        c.getClass();
        return (Optional<V>)Optional.absent();
    }
}
