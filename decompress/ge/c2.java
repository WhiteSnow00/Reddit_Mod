// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.security.PrivilegedExceptionAction;
import java.security.AccessController;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.lang.reflect.Field;
import sun.misc.Unsafe;

public final class c2
{
    public static final Unsafe a;
    public static final Class b;
    public static final b2 c;
    public static final boolean d;
    public static final boolean e;
    public static final long f;
    public static final boolean g;
    
    static {
        final Unsafe unsafe = a = k();
        b = ge.d.a();
        final Class<Long> type = Long.TYPE;
        boolean t = t(type);
        final boolean t2 = t(Integer.TYPE);
        Object c2 = null;
        Label_0071: {
            if (unsafe != null) {
                if (t) {
                    c2 = new a2(unsafe);
                    break Label_0071;
                }
                if (t2) {
                    c2 = new z1(unsafe);
                    break Label_0071;
                }
            }
            c2 = null;
        }
        c = (b2)c2;
        final boolean b2 = true;
        Label_0153: {
            if (c2 != null) {
                final Unsafe a2 = ((b2)c2).a;
                try {
                    final Class<? extends Unsafe> class1 = a2.getClass();
                    class1.getMethod("objectFieldOffset", Field.class);
                    class1.getMethod("getLong", Object.class, type);
                    if (b() != null) {
                        t = true;
                        break Label_0153;
                    }
                }
                finally {
                    final Throwable t3;
                    l(t3);
                }
            }
            t = false;
        }
        d = t;
        final b2 c3 = ge.c2.c;
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
                    t = true;
                    break Label_0377;
                }
                finally {
                    final Throwable t4;
                    l(t4);
                }
            }
            t = false;
        }
        e = t;
        f = v(byte[].class);
        v(boolean[].class);
        a(boolean[].class);
        v(int[].class);
        a(int[].class);
        v(long[].class);
        a(long[].class);
        v(float[].class);
        a(float[].class);
        v(double[].class);
        a(double[].class);
        v(Object[].class);
        a(Object[].class);
        final Field b3 = b();
        if (b3 != null) {
            final b2 c4 = ge.c2.c;
            if (c4 != null) {
                c4.l(b3);
            }
        }
        g = (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN && b2);
    }
    
    public static void a(final Class clazz) {
        if (c2.e) {
            c2.c.i(clazz);
        }
    }
    
    public static Field b() {
        final int a = ge.d.a;
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
        final b2 c = c2.c;
        final int j = c.j(n2, o);
        final int n3 = (~(int)n & 0x3) << 3;
        c.n(o, (0xFF & b) << n3 | (j & ~(255 << n3)), n2);
    }
    
    public static void d(final Object o, final long n, final byte b) {
        final long n2 = 0xFFFFFFFFFFFFFFFCL & n;
        final b2 c = c2.c;
        final int j = c.j(n2, o);
        final int n3 = ((int)n & 0x3) << 3;
        c.n(o, (0xFF & b) << n3 | (j & ~(255 << n3)), n2);
    }
    
    public static double e(final long n, final Object o) {
        return c2.c.a(n, o);
    }
    
    public static float f(final long n, final Object o) {
        return c2.c.b(n, o);
    }
    
    public static int g(final long n, final Object o) {
        return c2.c.j(n, o);
    }
    
    public static long h(final long n, final Object o) {
        return c2.c.k(n, o);
    }
    
    public static Object i(final Class clazz) {
        try {
            return c2.a.allocateInstance(clazz);
        }
        catch (final InstantiationException ex) {
            throw new IllegalStateException(ex);
        }
    }
    
    public static Object j(final long n, final Object o) {
        return c2.c.m(n, o);
    }
    
    public static Unsafe k() {
        Unsafe unsafe2;
        try {
            final Unsafe unsafe = AccessController.doPrivileged((PrivilegedExceptionAction<Unsafe>)new y1());
        }
        finally {
            unsafe2 = null;
        }
        return unsafe2;
    }
    
    public static void m(final Object o, final long n, final boolean b) {
        c2.c.c(o, n, b);
    }
    
    public static void n(final byte[] array, final long n, final byte b) {
        c2.c.d(array, c2.f + n, b);
    }
    
    public static void o(final Object o, final long n, final double n2) {
        c2.c.e(o, n, n2);
    }
    
    public static void p(final Object o, final long n, final float n2) {
        c2.c.f(o, n, n2);
    }
    
    public static void q(final Object o, final int n, final long n2) {
        c2.c.n(o, n, n2);
    }
    
    public static void r(final Object o, final long n, final long n2) {
        c2.c.o(o, n, n2);
    }
    
    public static void s(final Object o, final long n, final Object o2) {
        c2.c.p(o, n, o2);
    }
    
    public static boolean t(final Class clazz) {
        final int a = ge.d.a;
        try {
            final Class b = c2.b;
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
    
    public static boolean u(final long n, final Object o) {
        return c2.c.g(n, o);
    }
    
    public static int v(final Class clazz) {
        if (c2.e) {
            return c2.c.h(clazz);
        }
        return -1;
    }
}
