// 
// Decompiled by Procyon v0.6.0
// 

package ug2;

import kotlin.NoWhenBranchMatchedException;
import ng2.e;
import kotlin.reflect.KVariance;

public final class p
{
    public static final p c;
    public final KVariance a;
    public final n b;
    
    static {
        c = new p(null, null);
    }
    
    public p(final KVariance a, final n b) {
        this.a = a;
        this.b = b;
        final int n = 1;
        int n2;
        if (a == null == (b == null)) {
            n2 = n;
        }
        else {
            n2 = 0;
        }
        if (n2 == 0) {
            String string;
            if (a == null) {
                string = "Star projection must have no type specified.";
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append("The projection variance ");
                sb.append(a);
                sb.append(" requires type to be specified.");
                string = sb.toString();
            }
            throw new IllegalArgumentException(string.toString());
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        return this.a == p.a && e.a((Object)this.b, (Object)p.b);
    }
    
    @Override
    public final int hashCode() {
        final KVariance a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final n b = this.b;
        if (b != null) {
            hashCode = b.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final KVariance a = this.a;
        int n;
        if (a == null) {
            n = -1;
        }
        else {
            n = p.a.a[((Enum)a).ordinal()];
        }
        String s;
        if (n != -1) {
            if (n != 1) {
                if (n != 2) {
                    if (n != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final StringBuilder t = a.t("out ");
                    t.append(this.b);
                    s = t.toString();
                }
                else {
                    final StringBuilder t2 = a.t("in ");
                    t2.append(this.b);
                    s = t2.toString();
                }
            }
            else {
                s = String.valueOf(this.b);
            }
        }
        else {
            s = "*";
        }
        return s;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[KVariance.values().length];
            a2[((Enum)KVariance.INVARIANT).ordinal()] = 1;
            a2[((Enum)KVariance.IN).ordinal()] = 2;
            a2[((Enum)KVariance.OUT).ordinal()] = 3;
            a = a2;
        }
    }
}
