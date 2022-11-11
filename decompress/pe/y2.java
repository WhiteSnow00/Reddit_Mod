// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import java.util.Iterator;
import java.util.ArrayList;
import android.os.Bundle;
import lw0.b;
import h.t;
import java.util.concurrent.atomic.AtomicReference;

public final class y2
{
    public static final AtomicReference b;
    public static final AtomicReference c;
    public static final AtomicReference d;
    public final t a;
    
    static {
        b = new AtomicReference();
        c = new AtomicReference();
        d = new AtomicReference();
    }
    
    public y2(final t a) {
        this.a = a;
    }
    
    public static final String g(final String s, final String[] array, final String[] array2, final AtomicReference atomicReference) {
        lw0.b.R((Object)atomicReference);
        final int length = array.length;
        final int length2 = array2.length;
        int i = 0;
        lw0.b.H(length == length2);
        while (i < array.length) {
            final String s2 = array[i];
            if (s == s2 || s.equals(s2)) {
                synchronized (atomicReference) {
                    String[] array3;
                    if ((array3 = atomicReference.get()) == null) {
                        array3 = new String[array2.length];
                        atomicReference.set(array3);
                    }
                    String string;
                    if ((string = array3[i]) == null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(array2[i]);
                        sb.append("(");
                        sb.append(array[i]);
                        sb.append(")");
                        string = sb.toString();
                        array3[i] = string;
                    }
                    return string;
                }
                break;
            }
            ++i;
        }
        return s;
    }
    
    public final String a(final Object[] array) {
        if (array == null) {
            return "[]";
        }
        final StringBuilder r = a.r("[");
        for (final Object o : array) {
            String s;
            if (o instanceof Bundle) {
                s = this.b((Bundle)o);
            }
            else {
                s = String.valueOf(o);
            }
            if (s != null) {
                if (r.length() != 1) {
                    r.append(", ");
                }
                r.append(s);
            }
        }
        r.append("]");
        return r.toString();
    }
    
    public final String b(final Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.a.k()) {
            return bundle.toString();
        }
        final StringBuilder r = a.r("Bundle[{");
        for (final String s : ((BaseBundle)bundle).keySet()) {
            if (r.length() != 8) {
                r.append(", ");
            }
            r.append(this.e(s));
            r.append("=");
            final Object value = ((BaseBundle)bundle).get(s);
            String s2;
            if (value instanceof Bundle) {
                s2 = this.a(new Object[] { value });
            }
            else if (value instanceof Object[]) {
                s2 = this.a((Object[])value);
            }
            else if (value instanceof ArrayList) {
                s2 = this.a(((ArrayList)value).toArray());
            }
            else {
                s2 = String.valueOf(value);
            }
            r.append(s2);
        }
        r.append("}]");
        return r.toString();
    }
    
    public final String c(final pe.t t) {
        if (!this.a.k()) {
            return t.toString();
        }
        final StringBuilder r = a.r("origin=");
        r.append(t.h);
        r.append(",name=");
        r.append(this.d(t.f));
        r.append(",params=");
        final r g = t.g;
        String s;
        if (g == null) {
            s = null;
        }
        else if (!this.a.k()) {
            s = g.toString();
        }
        else {
            s = this.b(g.q());
        }
        r.append(s);
        return r.toString();
    }
    
    public final String d(final String s) {
        if (s == null) {
            return null;
        }
        if (!this.a.k()) {
            return s;
        }
        return g(s, pd.r.i, pd.r.g, y2.b);
    }
    
    public final String e(final String s) {
        if (s == null) {
            return null;
        }
        if (!this.a.k()) {
            return s;
        }
        return g(s, np.a.l, np.a.k, y2.c);
    }
    
    public final String f(final String s) {
        if (s == null) {
            return null;
        }
        if (!this.a.k()) {
            return s;
        }
        if (s.startsWith("_exp_")) {
            return a.k("experiment_id(", s, ")");
        }
        return g(s, lw0.b.L0, lw0.b.K0, y2.d);
    }
}
