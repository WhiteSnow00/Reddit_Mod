// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api;

import h7.c$a;
import ng2.e;
import h7.c;
import mg2.l;

public final class b implements h7.b<Object>
{
    public final l<c<?>, Object> a;
    
    public b(final l<? super c<?>, ?> a) {
        this.a = (l<c<?>, Object>)a;
    }
    
    public final Object a(final c<?> c) {
        return this.a.invoke((Object)c);
    }
    
    public final c<?> b(final Object o) {
        e.g(o, "value");
        return (c<?>)c$a.a(o);
    }
}
