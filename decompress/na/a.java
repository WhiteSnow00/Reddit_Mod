// 
// Decompiled by Procyon v0.6.0
// 

package na;

import javax.inject.Provider;

public final class a<T> implements Provider<T>, ma.a<T>
{
    public static final Object c;
    public volatile Provider<T> a;
    public volatile Object b;
    
    static {
        c = new Object();
    }
    
    public a(final Provider<T> a) {
        this.b = na.a.c;
        this.a = a;
    }
    
    public static Provider a(final b b) {
        if (b instanceof a) {
            return (Provider)b;
        }
        return (Provider)new a((javax.inject.Provider<Object>)b);
    }
    
    public static void b(final Object o, final Object o2) {
        if (o != a.c && o != o2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Scoped provider was invoked recursively returning different results: ");
            sb.append(o);
            sb.append(" & ");
            sb.append(o2);
            sb.append(". This is likely due to a circular dependency.");
            throw new IllegalStateException(sb.toString());
        }
    }
    
    public final T get() {
        final Object b = this.b;
        final Object c = na.a.c;
        final T t = (T)b;
        if (b == c) {
            synchronized (this) {
                if (this.b == c) {
                    final Object value = this.a.get();
                    b(this.b, value);
                    this.b = value;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
