// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import java.util.List;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.google.android.gms.internal.measurement.b;

public abstract class e6<MessageType extends e6<MessageType, BuilderType>, BuilderType extends b6<MessageType, BuilderType>> extends b<MessageType, BuilderType>
{
    private static final Map zza;
    public x7 zzc;
    public int zzd;
    
    static {
        zza = new ConcurrentHashMap();
    }
    
    public e6() {
        this.zzc = x7.f;
        this.zzd = -1;
    }
    
    public static s6 j(final i6 i6) {
        final s6 s6 = (s6)i6;
        final int h = s6.h;
        int n;
        if (h == 0) {
            n = 10;
        }
        else {
            n = h + h;
        }
        if (n >= h) {
            return new s6(Arrays.copyOf(s6.g, n), s6.h);
        }
        throw new IllegalArgumentException();
    }
    
    public static j6 k(final j6 j6) {
        final int size = ((List)j6).size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return j6.h(n);
    }
    
    public static Object l(final Method method, final Object o, final Object... array) {
        try {
            return method.invoke(o, array);
        }
        catch (final InvocationTargetException ex) {
            final Throwable cause = ex.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            if (cause instanceof Error) {
                throw (Error)cause;
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
        catch (final IllegalAccessException ex2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", ex2);
        }
    }
    
    public static void m(final Class clazz, final e6 e6) {
        e6.zza.put(clazz, e6);
    }
    
    public static e6 p(final Class clazz) {
        final Map zza = e6.zza;
        e6 e6;
        if ((e6 = zza.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                e6 = zza.get(clazz);
            }
            catch (final ClassNotFoundException ex) {
                throw new IllegalStateException("Class initialization cannot fail.", ex);
            }
        }
        e6 e7;
        if ((e7 = e6) == null) {
            e7 = (e6)((e6)f8.i(clazz)).q(6);
            if (e7 == null) {
                throw new IllegalStateException();
            }
            zza.put(clazz, e7);
        }
        return e7;
    }
    
    public final int a() {
        return this.zzd;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && j7.c.a((Class)this.getClass()).e((Object)this, (Object)o));
    }
    
    public final int f() {
        int zzd;
        if ((zzd = this.zzd) == -1) {
            zzd = j7.c.a((Class)this.getClass()).c((Object)this);
            this.zzd = zzd;
        }
        return zzd;
    }
    
    public final void h(final int zzd) {
        this.zzd = zzd;
    }
    
    public final int hashCode() {
        final int zzb = super.zzb;
        if (zzb != 0) {
            return zzb;
        }
        return super.zzb = j7.c.a((Class)this.getClass()).b((Object)this);
    }
    
    public final b6 n() {
        return (b6)this.q(5);
    }
    
    public final b6 o() {
        final b6 b6 = (b6)this.q(5);
        b6.h(this);
        return b6;
    }
    
    public abstract Object q(final int p0);
    
    public final String toString() {
        final String string = super.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        d7.c((b7)this, sb, 0);
        return sb.toString();
    }
}
