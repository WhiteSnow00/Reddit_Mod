// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class d8
{
    public static final Unsafe a;
    public static final Class b;
    public static final c8 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;
    
    static {
        final Unsafe unsafe = a = k();
        b = e5.a();
        final Class<Long> type = Long.TYPE;
        boolean r = r(type);
        final boolean r2 = r(Integer.TYPE);
        Object c2 = null;
        Label_0071: {
            if (unsafe != null) {
                if (r) {
                    c2 = new b8(unsafe);
                    break Label_0071;
                }
                if (r2) {
                    c2 = new a8(unsafe);
                    break Label_0071;
                }
            }
            c2 = null;
        }
        c = (c8)c2;
        final boolean b2 = true;
        Label_0153: {
            if (c2 != null) {
                final Unsafe a2 = ((c8)c2).a;
                try {
                    final Class<? extends Unsafe> class1 = a2.getClass();
                    class1.getMethod("objectFieldOffset", Field.class);
                    class1.getMethod("getLong", Object.class, type);
                    if (b() != null) {
                        r = true;
                        break Label_0153;
                    }
                }
                finally {
                    final Throwable t;
                    l(t);
                }
            }
            r = false;
        }
        d = r;
        final c8 c3 = d8.c;
        Label_0377: {
            if (c3 != null) {
                final Unsafe a3 = c3.a;
                try {
                    final Class<? extends Unsafe> class2 = a3.getClass();
                    class2.getMethod("objectFieldOffset", Field.class);
                    class2.getMethod("arrayBaseOffset", Class.class);
                    class2.getMethod("arrayIndexScale", Class.class);
                    final Class<Long> type2 = Long.TYPE;
                    class2.getMethod("getInt", Object.class, type2);
                    class2.getMethod("putInt", Object.class, type2, Integer.TYPE);
                    class2.getMethod("getLong", Object.class, type2);
                    class2.getMethod("putLong", Object.class, type2, type2);
                    class2.getMethod("getObject", Object.class, type2);
                    class2.getMethod("putObject", Object.class, type2, Object.class);
                    r = true;
                    break Label_0377;
                }
                finally {
                    final Throwable t2;
                    l(t2);
                }
            }
            r = false;
        }
        e = r;
        f = t(byte[].class);
        t(boolean[].class);
        a(boolean[].class);
        t(int[].class);
        a(int[].class);
        t(long[].class);
        a(long[].class);
        t(float[].class);
        a(float[].class);
        t(double[].class);
        a(double[].class);
        t(Object[].class);
        a(Object[].class);
        final Field b3 = b();
        if (b3 != null) {
            final c8 c4 = d8.c;
            if (c4 != null) {
                c4.l(b3);
            }
        }
        g = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN && b2);
    }
    
    public static void a(final Class clazz) {
        if (d8.e) {
            d8.c.i(clazz);
        }
    }
    
    public static Field b() {
        final int a = e5.a;
        final Field field = null;
        Field field2;
        try {
            Buffer.class.getDeclaredField("effectiveDirectAddress");
        }
        finally {
            field2 = null;
        }
        Field field4;
        if (field2 == null) {
            Field field3;
            try {
                Buffer.class.getDeclaredField("address");
            }
            finally {
                field3 = null;
            }
            field4 = field;
            if (field3 != null) {
                field4 = field;
                if (field3.getType() == Long.TYPE) {
                    return field3;
                }
            }
        }
        else {
            field4 = field2;
        }
        return field4;
    }
    
    public static void c(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final c8 c = d8.c;
        final int j = c.j(n2, o);
        final int n3 = (~(int)n & 0x3) << 3;
        c.n(o, (0xFF & b) << n3 | (j & ~(255 << n3)), n2);
    }
    
    public static void d(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final c8 c = d8.c;
        final int j = c.j(n2, o);
        final int n3 = ((int)n & 0x3) << 3;
        c.n(o, (0xFF & b) << n3 | (j & ~(255 << n3)), n2);
    }
    
    public static double e(final long n, final Object o) {
        return d8.c.a(n, o);
    }
    
    public static float f(final long n, final Object o) {
        return d8.c.b(n, o);
    }
    
    public static int g(final long n, final Object o) {
        return d8.c.j(n, o);
    }
    
    public static long h(final long n, final Object o) {
        return d8.c.k(n, o);
    }
    
    public static Object i(final Class clazz) {
        try {
            return d8.a.allocateInstance(clazz);
        }
        catch (final InstantiationException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public static Object j(final long n, final Object o) {
        return d8.c.m(n, o);
    }
    
    public static Unsafe k() {
        Unsafe unsafe2;
        try {
            final Unsafe unsafe = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new z7());
        }
        finally {
            unsafe2 = null;
        }
        return unsafe2;
    }
    
    public static void m(final Object o, final long n, final boolean b) {
        d8.c.c(o, n, b);
    }
    
    public static void n(final Object o, final long n, final double n2) {
        d8.c.e(o, n, n2);
    }
    
    public static void o(final Object o, final long n, final float n2) {
        d8.c.f(o, n, n2);
    }
    
    public static void p(final Object o, final int n, final long n2) {
        d8.c.n(o, n, n2);
    }
    
    public static void q(final Object o, final long n, final Object o2) {
        d8.c.p(o, n, o2);
    }
    
    public static boolean r(final Class clazz) {
        final int a = e5.a;
        try {
            final Class b = d8.b;
            final Class<Boolean> type = Boolean.TYPE;
            b.getMethod("peekLong", clazz, type);
            b.getMethod("pokeLong", clazz, Long.TYPE, type);
            final Class<Integer> type2 = Integer.TYPE;
            b.getMethod("pokeInt", clazz, type2, type);
            b.getMethod("peekInt", clazz, type);
            b.getMethod("pokeByte", clazz, Byte.TYPE);
            b.getMethod("peekByte", clazz);
            b.getMethod("pokeByteArray", clazz, byte[].class, type2, type2);
            b.getMethod("peekByteArray", clazz, byte[].class, type2, type2);
            return true;
        }
        finally {
            return false;
        }
    }
    
    public static boolean s(final long n, final Object o) {
        return d8.c.g(n, o);
    }
    
    public static int t(final Class clazz) {
        if (d8.e) {
            return d8.c.h(clazz);
        }
        return -1;
    }
}
