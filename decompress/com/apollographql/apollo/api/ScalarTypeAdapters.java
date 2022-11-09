// 
// Decompiled by Procyon v0.6.0
// 

package com.apollographql.apollo.api;

import java.util.Iterator;
import ah2.f;
import a4.u1;
import kotlin.Pair;
import zg2.l;
import kotlin.collections.c;
import h7.b;
import h7.o;
import java.util.Map;
import java.util.LinkedHashMap;

public final class ScalarTypeAdapters
{
    public static final ScalarTypeAdapters c;
    public static final LinkedHashMap d;
    public final Map<o, h7.b<?>> a;
    public final LinkedHashMap b;
    
    static {
        final b b = new b();
        c = new ScalarTypeAdapters(kotlin.collections.c.N1());
        d = kotlin.collections.c.T1((Map)kotlin.collections.c.T1((Map)kotlin.collections.c.T1((Map)kotlin.collections.c.T1((Map)kotlin.collections.c.T1((Map)kotlin.collections.c.T1((Map)kotlin.collections.c.T1((Map)kotlin.collections.c.T1((Map)kotlin.collections.c.T1((Map)kotlin.collections.c.T1(kotlin.collections.c.N1(), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.lang.String", "kotlin.String" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$1.INSTANCE)), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.lang.Boolean", "kotlin.Boolean", "boolean" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$2.INSTANCE)), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.lang.Integer", "kotlin.Int", "int" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$3.INSTANCE)), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.lang.Long", "kotlin.Long", "long" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$4.INSTANCE)), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.lang.Float", "kotlin.Float", "float" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$5.INSTANCE)), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.lang.Double", "kotlin.Double", "double" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$6.INSTANCE)), u1.B0(new Pair((Object)"com.apollographql.apollo.api.FileUpload", (Object)new ScalarTypeAdapters$a()))), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.util.Map", "kotlin.collections.Map" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$8.INSTANCE)), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.util.List", "kotlin.collections.List" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$9.INSTANCE)), (Map)ScalarTypeAdapters.b.a(b, new String[] { "java.lang.Object", "kotlin.Any" }, (l)ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS.ScalarTypeAdapters$Companion$DEFAULT_ADAPTERS$10.INSTANCE));
    }
    
    public ScalarTypeAdapters(final Map<o, ? extends h7.b<?>> a) {
        f.g((Object)a, "customAdapters");
        this.a = (Map<o, h7.b<?>>)a;
        final LinkedHashMap b = new LinkedHashMap(u1.A0(a.size()));
        for (final Map.Entry<o, V> entry : a.entrySet()) {
            b.put(entry.getKey().typeName(), entry.getValue());
        }
        this.b = b;
    }
    
    public final <T> h7.b<T> a(final o o) {
        f.g((Object)o, "scalarType");
        h7.b b;
        if ((b = this.b.get(o.typeName())) == null) {
            b = ScalarTypeAdapters.d.get(o.className());
        }
        if (b != null) {
            return (h7.b<T>)b;
        }
        final StringBuilder k = a.k("Can't map GraphQL type: `");
        k.append(o.typeName());
        k.append("` to: `");
        k.append(o.className());
        k.append("`. Did you forget to add a custom type adapter?");
        throw new IllegalArgumentException(k.toString().toString());
    }
    
    public static final class b
    {
        public static final LinkedHashMap a(final b b, final String[] array, final l l) {
            final com.apollographql.apollo.api.b b2 = new com.apollographql.apollo.api.b(l);
            int a0;
            if ((a0 = u1.A0(array.length)) < 16) {
                a0 = 16;
            }
            final LinkedHashMap linkedHashMap = new LinkedHashMap(a0);
            for (int length = array.length, i = 0; i < length; ++i) {
                final Pair pair = new Pair((Object)array[i], (Object)b2);
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return linkedHashMap;
        }
    }
}
