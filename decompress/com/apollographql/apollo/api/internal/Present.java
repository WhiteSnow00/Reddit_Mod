// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api.internal;

import java.util.Collections;
import java.util.Set;
import j7.c;
import j7.a;

final class Present<T> extends Optional<T>
{
    private static final long serialVersionUID = 0L;
    private final T reference;
    
    public Present(final T reference) {
        this.reference = reference;
    }
    
    public Optional<T> apply(final a<T> a) {
        a.getClass();
        return this.map((j7.c<? super T, T>)new c<T, T>(a) {
            public final a a;
            
            public final T apply(final T t) {
                this.a.apply((Object)t);
                return t;
            }
        });
    }
    
    public Set<T> asSet() {
        return Collections.singleton(this.reference);
    }
    
    public boolean equals(final Object o) {
        return o instanceof Present && this.reference.equals(((Present)o).reference);
    }
    
    public <V> Optional<V> flatMap(final c<? super T, Optional<V>> c) {
        c.getClass();
        final Object apply = c.apply((Object)this.reference);
        if0.a.j(apply, "the Function passed to Optional.flatMap() must not return null.");
        return (Optional<V>)apply;
    }
    
    public T get() {
        return this.reference;
    }
    
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }
    
    public boolean isPresent() {
        return true;
    }
    
    public <V> Optional<V> map(final c<? super T, V> c) {
        final Object apply = c.apply((Object)this.reference);
        if0.a.j(apply, "the Function passed to Optional.map() must not return null.");
        return new Present<V>((V)apply);
    }
    
    public Optional<T> or(final Optional<? extends T> optional) {
        optional.getClass();
        return this;
    }
    
    public T or(final T t) {
        if (t != null) {
            return this.reference;
        }
        throw new NullPointerException("use Optional.orNull() instead of Optional.or(null)");
    }
    
    public T orNull() {
        return this.reference;
    }
    
    public String toString() {
        final StringBuilder t = a.t("Optional.of(");
        t.append(this.reference);
        t.append(")");
        return t.toString();
    }
    
    public <V> Optional<V> transform(final c<? super T, V> c) {
        final Object apply = c.apply((Object)this.reference);
        if0.a.j(apply, "the Function passed to Optional.transform() must not return null.");
        return new Present<V>((V)apply);
    }
}
