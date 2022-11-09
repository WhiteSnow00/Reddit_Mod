// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api;

import zg2.p;
import h7.d;
import ah2.f;

public interface a
{
    a a(final c<?> p0);
    
    a b(final a p0);
    
    public static final class a
    {
        public static com.apollographql.apollo.api.a a(com.apollographql.apollo.api.a a, final q7.a a2) {
            f.g((Object)a, "this");
            if (a2 != d.b) {
                a = a2.d(a, (zg2.p<? super com.apollographql.apollo.api.a, ? super a$b, ? extends com.apollographql.apollo.api.a>)ExecutionContext$plus$1.INSTANCE);
            }
            return a;
        }
    }
    
    public interface c<E extends a$b>
    {
    }
}
