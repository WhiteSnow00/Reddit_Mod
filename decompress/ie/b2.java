// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

public abstract class b2
{
    public final Unsafe a;
    
    public b2(final Unsafe a) {
        this.a = a;
    }
    
    public abstract double a(final long p0, final Object p1);
    
    public abstract float b(final long p0, final Object p1);
    
    public abstract void c(final Object p0, final long p1, final boolean p2);
    
    public abstract void d(final Object p0, final long p1, final byte p2);
    
    public abstract void e(final Object p0, final long p1, final double p2);
    
    public abstract void f(final Object p0, final long p1, final float p2);
    
    public abstract boolean g(final long p0, final Object p1);
    
    public final int h(final Class clazz) {
        return this.a.arrayBaseOffset(clazz);
    }
    
    public final int i(final Class clazz) {
        return this.a.arrayIndexScale(clazz);
    }
    
    public final int j(final long n, final Object o) {
        return this.a.getInt(o, n);
    }
    
    public final long k(final long n, final Object o) {
        return this.a.getLong(o, n);
    }
    
    public final void l(final Field field) {
        this.a.objectFieldOffset(field);
    }
    
    public final Object m(final long n, final Object o) {
        return this.a.getObject(o, n);
    }
    
    public final void n(final Object o, final int n, final long n2) {
        this.a.putInt(o, n2, n);
    }
    
    public final void o(final Object o, final long n, final long n2) {
        this.a.putLong(o, n, n2);
    }
    
    public final void p(final Object o, final long n, final Object o2) {
        this.a.putObject(o, n, o2);
    }
}
