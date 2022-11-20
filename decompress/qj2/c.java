// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import cg.d;
import kotlin.Result;
import xi2.i;
import ng2.e;
import dg2.h;

public final class c
{
    public static final c a;
    public static final h<char[]> b;
    public static int c;
    public static final int d;
    
    static {
        a = new c();
        b = new h();
        Object constructor-impl = null;
        try {
            final String property = System.getProperty("kotlinx.serialization.json.pool.size");
            e.e((Object)property, "getProperty(\"kotlinx.ser\u2026lization.json.pool.size\")");
            Result.constructor-impl((Object)i.u0(property));
        }
        finally {
            final Throwable t;
            constructor-impl = Result.constructor-impl((Object)cg.d.B1(t));
        }
        Object o = constructor-impl;
        if (Result.isFailure-impl(constructor-impl)) {
            o = null;
        }
        final Integer n = (Integer)o;
        int intValue;
        if (n != null) {
            intValue = n;
        }
        else {
            intValue = 1048576;
        }
        d = intValue;
    }
}
