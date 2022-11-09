// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api;

import java.util.Arrays;
import h7.o;
import kotlin.collections.EmptyList;
import kotlin.collections.c;
import kotlin.Metadata;
import ak0.n;
import ag0.a;
import ah2.f;
import java.util.List;
import java.util.Map;

public class ResponseField
{
    public final Type a;
    public final String b;
    public final String c;
    public final Map<String, Object> d;
    public final boolean e;
    public final List<c> f;
    
    public ResponseField(final Type a, final String b, final String c, final Map<String, ?> d, final boolean e, final List<? extends c> f) {
        ah2.f.g((Object)a, "type");
        ah2.f.g((Object)f, "conditions");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (Map<String, Object>)d;
        this.e = e;
        this.f = (List<c>)f;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponseField)) {
            return false;
        }
        final Type a = this.a;
        final ResponseField responseField = (ResponseField)o;
        return a == responseField.a && ah2.f.a((Object)this.b, (Object)responseField.b) && ah2.f.a((Object)this.c, (Object)responseField.c) && ah2.f.a((Object)this.d, (Object)responseField.d) && this.e == responseField.e && ah2.f.a((Object)this.f, (Object)responseField.f);
    }
    
    @Override
    public int hashCode() {
        return this.f.hashCode() + (Boolean.hashCode(this.e) + n.g((Map)this.d, ag0.a.f(this.c, ag0.a.f(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31;
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e" }, d2 = { "Lcom/apollographql/apollo/api/ResponseField$Type;", "", "(Ljava/lang/String;I)V", "STRING", "INT", "LONG", "DOUBLE", "BOOLEAN", "ENUM", "OBJECT", "LIST", "CUSTOM", "FRAGMENT", "FRAGMENTS", "apollo-api" }, k = 1, mv = { 1, 5, 1 }, xi = 48)
    public enum Type
    {
        BOOLEAN, 
        CUSTOM, 
        DOUBLE, 
        ENUM, 
        FRAGMENT, 
        FRAGMENTS, 
        INT, 
        LIST, 
        LONG, 
        OBJECT, 
        STRING;
    }
    
    public static final class b
    {
        public static ResponseField a(Map n1, final String s, final boolean b, final String s2) {
            final Type boolean1 = Type.BOOLEAN;
            if (n1 == null) {
                n1 = kotlin.collections.c.N1();
            }
            return new ResponseField(boolean1, s, s2, n1, b, (List<? extends c>)EmptyList.INSTANCE);
        }
        
        public static ResponseField$d b(final o o, final String s, final String s2, Map n1, final boolean b) {
            f.g((Object)o, "scalarType");
            if (n1 == null) {
                n1 = kotlin.collections.c.N1();
            }
            return new ResponseField$d(o, s, s2, (List)EmptyList.INSTANCE, n1, b);
        }
        
        public static ResponseField c(final String s, final boolean b, final String s2) {
            return new ResponseField(Type.DOUBLE, s, s2, kotlin.collections.c.N1(), b, (List<? extends c>)EmptyList.INSTANCE);
        }
        
        public static ResponseField d(final String s, final boolean b, final String s2) {
            return new ResponseField(Type.ENUM, s, s2, kotlin.collections.c.N1(), b, (List<? extends c>)EmptyList.INSTANCE);
        }
        
        public static ResponseField e(List instance) {
            final Type fragment = Type.FRAGMENT;
            final Map n1 = kotlin.collections.c.N1();
            if (instance == null) {
                instance = EmptyList.INSTANCE;
            }
            return new ResponseField(fragment, "__typename", "__typename", n1, false, (List<? extends c>)instance);
        }
        
        public static ResponseField f(Map n1, final String s, final boolean b, final String s2) {
            final Type int1 = Type.INT;
            if (n1 == null) {
                n1 = kotlin.collections.c.N1();
            }
            return new ResponseField(int1, s, s2, n1, b, (List<? extends c>)EmptyList.INSTANCE);
        }
        
        public static ResponseField g(List instance, Map n1, final String s, final boolean b, final String s2) {
            final Type list = Type.LIST;
            if (n1 == null) {
                n1 = kotlin.collections.c.N1();
            }
            if (instance == null) {
                instance = EmptyList.INSTANCE;
            }
            return new ResponseField(list, s, s2, n1, b, (List<? extends c>)instance);
        }
        
        public static ResponseField h(List instance, Map n1, final String s, final boolean b, final String s2) {
            final Type object = Type.OBJECT;
            if (n1 == null) {
                n1 = kotlin.collections.c.N1();
            }
            if (instance == null) {
                instance = EmptyList.INSTANCE;
            }
            return new ResponseField(object, s, s2, n1, b, (List<? extends c>)instance);
        }
        
        public static ResponseField i(Map n1, final String s, final boolean b, final String s2) {
            final Type string = Type.STRING;
            if (n1 == null) {
                n1 = kotlin.collections.c.N1();
            }
            return new ResponseField(string, s, s2, n1, b, (List<? extends c>)EmptyList.INSTANCE);
        }
    }
    
    public static class c
    {
        public static final class a
        {
            public static ResponseField$e a(final String[] array) {
                return new ResponseField$e(ah2.c.Y((Object[])Arrays.copyOf(array, array.length)));
            }
        }
    }
}
