// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.models;

import hj.r;
import hj.h;
import oj.a;
import kj.f;
import kj.o$a;
import hj.q;
import com.google.gson.JsonParseException;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import hj.p;
import hj.l;
import java.lang.reflect.Type;
import hj.n;
import hj.m;
import hj.s;

public class BindingValuesAdapter implements s<BindingValues>, m<BindingValues>
{
    private static final String BOOLEAN_MEMBER = "boolean_value";
    private static final String BOOLEAN_TYPE = "BOOLEAN";
    private static final String IMAGE_TYPE = "IMAGE";
    private static final String IMAGE_VALUE_MEMBER = "image_value";
    private static final String STRING_TYPE = "STRING";
    private static final String TYPE_MEMBER = "type";
    private static final String TYPE_VALUE_MEMBER = "string_value";
    private static final String USER_TYPE = "USER";
    private static final String USER_VALUE_MEMBER = "user_value";
    
    public BindingValues deserialize(final n n, final Type type, final l l) throws JsonParseException {
        n.getClass();
        if (!(n instanceof p)) {
            return new BindingValues();
        }
        final Set entrySet = n.a().f.entrySet();
        final HashMap hashMap = new HashMap(32);
        for (final Map.Entry<String, V> entry : entrySet) {
            hashMap.put(entry.getKey(), this.getValue(((n)entry.getValue()).a(), l));
        }
        return new BindingValues((Map)hashMap);
    }
    
    public /* bridge */ Object deserialize(final n n, final Type type, final l l) throws JsonParseException {
        return this.deserialize(n, type, l);
    }
    
    public Object getValue(final p p2, final l l) {
        final n f = p2.f("type");
        final Object o = null;
        final Object o2 = null;
        final Object o3 = null;
        final Object o4 = null;
        Object c = o3;
        if (f != null) {
            if (!(f instanceof q)) {
                c = o3;
            }
            else {
                final String d = f.d();
                d.getClass();
                int n = -1;
                switch (d) {
                    case "BOOLEAN": {
                        n = 3;
                        break;
                    }
                    case "IMAGE": {
                        n = 2;
                        break;
                    }
                    case "USER": {
                        n = 1;
                        break;
                    }
                    case "STRING": {
                        n = 0;
                        break;
                    }
                    default:
                        break;
                }
                switch (n) {
                    default: {
                        return null;
                    }
                    case 3: {
                        final n f2 = p2.f("boolean_value");
                        final h c2 = ((o$a)l).a.c;
                        c2.getClass();
                        Object c3;
                        if (f2 == null) {
                            c3 = o4;
                        }
                        else {
                            c3 = c2.c((a)new f(f2), (Type)Boolean.class);
                        }
                        return c3;
                    }
                    case 2: {
                        final n f3 = p2.f("image_value");
                        final h c4 = ((o$a)l).a.c;
                        c4.getClass();
                        Object c5;
                        if (f3 == null) {
                            c5 = o;
                        }
                        else {
                            c5 = c4.c((a)new f(f3), (Type)ImageValue.class);
                        }
                        return c5;
                    }
                    case 1: {
                        final n f4 = p2.f("user_value");
                        final h c6 = ((o$a)l).a.c;
                        c6.getClass();
                        Object c7;
                        if (f4 == null) {
                            c7 = o2;
                        }
                        else {
                            c7 = c6.c((a)new f(f4), (Type)UserValue.class);
                        }
                        return c7;
                    }
                    case 0: {
                        final n f5 = p2.f("string_value");
                        final h c8 = ((o$a)l).a.c;
                        c8.getClass();
                        if (f5 == null) {
                            c = o3;
                            break;
                        }
                        c = c8.c((a)new f(f5), (Type)String.class);
                        break;
                    }
                }
            }
        }
        return c;
    }
    
    public n serialize(final BindingValues bindingValues, final Type type, final r r) {
        return null;
    }
    
    public /* bridge */ n serialize(final Object o, final Type type, final r r) {
        return this.serialize((BindingValues)o, type, r);
    }
}
