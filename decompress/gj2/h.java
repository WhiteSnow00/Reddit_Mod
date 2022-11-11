// 
// Decompiled by Procyon v0.6.0
// 

package gj2;

import a81.e;

public final class h<T>
{
    public static final b b;
    public final Object a = a;
    
    static {
        b = new b();
    }
    
    public static final Throwable a(final Object o) {
        final boolean b = o instanceof h.h$a;
        Throwable a = null;
        h.h$a h$a;
        if (b) {
            h$a = (h.h$a)o;
        }
        else {
            h$a = null;
        }
        if (h$a != null) {
            a = h$a.a;
        }
        return a;
    }
    
    public static final void b(final Object o) {
        if (!(o instanceof b)) {
            return;
        }
        if (o instanceof h.h$a) {
            final Throwable a = ((h.h$a)o).a;
            if (a != null) {
                throw a;
            }
        }
        throw new IllegalStateException(e.n("Trying to call 'getOrThrow' on a failed channel result: ", o));
    }
    
    @Override
    public final boolean equals(final Object o) {
        final Object a = this.a;
        final boolean b = o instanceof h;
        boolean b2 = false;
        if (b) {
            if (sg2.e.a(a, ((h)o).a)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        final Object a = this.a;
        String s;
        if (a instanceof h.h$a) {
            s = ((h.h$a)a).toString();
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append("Value(");
            sb.append(a);
            sb.append(')');
            s = sb.toString();
        }
        return s;
    }
    
    public static class b
    {
        @Override
        public String toString() {
            return "Failed";
        }
    }
}
