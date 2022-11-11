// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.als;

import X.0Bq;
import java.util.Iterator;
import X.CTM;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import X.0QI;
import X.5u3;
import kotlin.jvm.internal.n;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;
import java.util.Map;

public final class ApiCenter
{
    public static final ApiCenter.a LIZIZ;
    public boolean LIZ;
    public final Map<Class<?>, Object> LIZJ;
    public ApiCenter LIZLLL;
    
    static {
        Covode.recordClassIndex(4270);
        LIZIZ = new ApiCenter.a((byte)0);
    }
    
    public ApiCenter() {
        this.LIZLLL = null;
        this.LIZJ = new HashMap<Class<?>, Object>();
    }
    
    private final boolean LIZ(final Class<?> clazz, final Class<?> clazz2) {
        Class<?> superclass = clazz2;
        if (clazz.isInterface()) {
            final Class[] interfaces = clazz2.getInterfaces();
            n.LIZ((Object)interfaces, "");
            for (final Class clazz3 : interfaces) {
                if (n.LIZ((Object)clazz3, (Object)clazz)) {
                    return true;
                }
                n.LIZ((Object)clazz3, "");
                if (this.LIZ(clazz, clazz3)) {
                    return true;
                }
            }
            return false;
        }
        while (n.LIZ((Object)superclass, (Object)Object.class) ^ true) {
            if (n.LIZ((Object)superclass, (Object)clazz)) {
                return true;
            }
            superclass = superclass.getSuperclass();
            if (superclass != null) {
                continue;
            }
            throw new 5u3("null cannot be cast to non-null type java.lang.Class<*>");
        }
        return false;
    }
    
    public final <T extends 0QI> T LIZ(final Class<T> clazz) {
        synchronized (this) {
            MethodCollector.i(4586);
            CTM.LIZ((Object)clazz);
            final Object value = this.LIZJ.get(clazz);
            if (value != null) {
                final 0QI 0qi = (T)value;
                MethodCollector.o(4586);
                return (T)0qi;
            }
            while (true) {
                for (final Class<?> next : this.LIZJ.keySet()) {
                    if (this.LIZ(clazz, next)) {
                        final Class<?> clazz2 = next;
                        final ApiCenter lizlll = this.LIZLLL;
                        if (clazz2 != null) {
                            final Object value2 = this.LIZJ.get(clazz2);
                            if (value2 != null) {
                                final 0QI 0qi2 = (T)value2;
                                MethodCollector.o(4586);
                                return (T)0qi2;
                            }
                            final 5u3 5u3 = new 5u3("null cannot be cast to non-null type T");
                            MethodCollector.o(4586);
                            throw 5u3;
                        }
                        else {
                            if (lizlll != null) {
                                final 0QI liz = lizlll.LIZ((Class<0QI>)clazz);
                                MethodCollector.o(4586);
                                return (T)liz;
                            }
                            final IllegalStateException ex = new IllegalStateException("not found ".concat(String.valueOf(clazz)));
                            MethodCollector.o(4586);
                            throw ex;
                        }
                    }
                }
                Class<?> next = null;
                continue;
            }
        }
    }
    
    public final <T extends 0QI> void LIZ(final T t) {
        CTM.LIZ((Object)t);
        if (this.LIZ) {
            return;
        }
        final Class<? extends 0QI> class1 = t.getClass();
        if (!n.LIZ((Object)class1, (Object)0QI.class)) {
            for (final Class clazz : this.LIZJ.keySet()) {
                if (n.LIZ((Object)class1, (Object)clazz)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append(class1);
                    sb.append(" already register");
                    throw new IllegalStateException(sb.toString());
                }
                if (this.LIZ(class1, clazz)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append(class1);
                    sb2.append(" child found ");
                    sb2.append(clazz);
                    throw new IllegalStateException(sb2.toString());
                }
                if (!this.LIZ(clazz, class1)) {
                    continue;
                }
                final StringBuilder sb3 = new StringBuilder();
                sb3.append(class1);
                sb3.append(" parent found ");
                sb3.append(clazz);
                throw new IllegalStateException(sb3.toString());
            }
            this.LIZJ.put(class1, t);
            return;
        }
        throw new IllegalArgumentException("ApiComponent can't register, use subclass instead");
    }
    
    public final <T extends 0QI> T LIZIZ(final Class<T> clazz) {
        synchronized (this) {
            MethodCollector.i(4682);
            CTM.LIZ((Object)clazz);
            final Object value = this.LIZJ.get(clazz);
            if (value != null) {
                final 0QI 0qi = (T)value;
                MethodCollector.o(4682);
                return (T)0qi;
            }
            while (true) {
                for (final Class<?> next : this.LIZJ.keySet()) {
                    if (this.LIZ(clazz, next)) {
                        final Class<?> clazz2 = next;
                        final ApiCenter lizlll = this.LIZLLL;
                        if (clazz2 != null) {
                            final Object value2 = this.LIZJ.get(clazz2);
                            if (value2 != null) {
                                final 0QI 0qi2 = (T)value2;
                                MethodCollector.o(4682);
                                return (T)0qi2;
                            }
                            final 5u3 5u3 = new 5u3("null cannot be cast to non-null type T");
                            MethodCollector.o(4682);
                            throw 5u3;
                        }
                        else {
                            if (lizlll != null) {
                                final 0QI liziz = lizlll.LIZIZ((Class<0QI>)clazz);
                                MethodCollector.o(4682);
                                return (T)liziz;
                            }
                            MethodCollector.o(4682);
                            return null;
                        }
                    }
                }
                Class<?> next = null;
                continue;
            }
        }
    }
    
    public final <T extends 0QI> void LIZIZ(final T t) {
        CTM.LIZ((Object)t);
        if (this.LIZ) {
            return;
        }
        this.LIZJ.remove(t.getClass());
    }
    
    public static final class ApiCenterCompatViewModel extends 0Bq
    {
        public final ApiCenter LIZ;
        
        static {
            Covode.recordClassIndex(4271);
        }
        
        public ApiCenterCompatViewModel() {
            this.LIZ = new ApiCenter((byte)0);
        }
    }
}
