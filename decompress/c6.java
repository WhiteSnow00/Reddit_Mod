// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import com.google.android.gms.internal.measurement.b;

public abstract class c6<MessageType extends c6<MessageType, BuilderType>, BuilderType extends z5<MessageType, BuilderType>> extends b<MessageType, BuilderType>
{
    private static final Map zza;
    public v7 zzc;
    public int zzd;
    
    static {
        zza = new ConcurrentHashMap();
    }
    
    public c6() {
        this.zzc = v7.f;
        this.zzd = -1;
    }
    
    public static q6 j(final g6 g6) {
        final q6 q6 = (q6)g6;
        final int h = q6.h;
        int n;
        if (h == 0) {
            n = 10;
        }
        else {
            n = h + h;
        }
        if (n >= h) {
            return new q6(Arrays.copyOf(q6.g, n), q6.h);
        }
        throw new IllegalArgumentException();
    }
    
    public static h6 k(final h6 h6) {
        final int size = h6.size();
        int n;
        if (size == 0) {
            n = 10;
        }
        else {
            n = size + size;
        }
        return h6.h(n);
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
    
    public static void m(final Class clazz, final c6 c6) {
        c6.zza.put(clazz, c6);
    }
    
    public static c6 p(final Class clazz) {
        final Map zza = c6.zza;
        c6 c6;
        if ((c6 = zza.get(clazz)) == null) {
            try {
                Class.forName(clazz.getName(), true, clazz.getClassLoader());
                c6 = zza.get(clazz);
            }
            catch (final ClassNotFoundException ex) {
                throw new IllegalStateException("Class initialization cannot fail.", ex);
            }
        }
        c6 c7;
        if ((c7 = c6) == null) {
            c7 = (c6)((c6)d8.i(clazz)).q(6);
            if (c7 == null) {
                throw new IllegalStateException();
            }
            zza.put(clazz, c7);
        }
        return c7;
    }
    
    public final int b() {
        return this.zzd;
    }
    
    public final boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass() && h7.c.a(this.getClass()).e(this, o));
    }
    
    public final int f() {
        int zzd;
        if ((zzd = this.zzd) == -1) {
            zzd = h7.c.a(this.getClass()).c(this);
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
        return super.zzb = h7.c.a(this.getClass()).b(this);
    }
    
    public final z5 n() {
        return (z5)this.q(5);
    }
    
    public final z5 o() {
        final z5 z5 = (z5)this.q(5);
        z5.h(this);
        return z5;
    }
    
    public abstract Object q(final int p0);
    
    public final String toString() {
        final String string = super.toString();
        final StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        b7.c((z6)this, sb, 0);
        return sb.toString();
    }
}
