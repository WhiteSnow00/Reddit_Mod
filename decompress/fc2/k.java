// 
// Decompiled by Procyon v0.6.0
// 

package fc2;

import java.math.BigDecimal;
import ml0.a;
import com.sendbird.android.shadow.com.google.gson.internal.LazilyParsedNumber;
import java.math.BigInteger;

public final class k extends g
{
    public static final Class<?>[] g;
    public Object f;
    
    static {
        g = new Class[] { Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class };
    }
    
    public k(final Boolean b) {
        this.J(b);
    }
    
    public k(final Character c) {
        this.J(c);
    }
    
    public k(final Number n) {
        this.J(n);
    }
    
    public k(final Object o) {
        this.J(o);
    }
    
    public k(final String s) {
        this.J(s);
    }
    
    public static boolean I(final k k) {
        final Object f = k.f;
        final boolean b = f instanceof Number;
        boolean b2 = false;
        if (b) {
            final Number n = (Number)f;
            if (!(n instanceof BigInteger) && !(n instanceof Long) && !(n instanceof Integer) && !(n instanceof Short)) {
                b2 = b2;
                if (!(n instanceof Byte)) {
                    return b2;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    public final String C() {
        final Object f = this.f;
        if (f instanceof Number) {
            return this.F().toString();
        }
        if (f instanceof Boolean) {
            return ((Boolean)f).toString();
        }
        return (String)f;
    }
    
    public final Number F() {
        final Object f = this.f;
        Number n;
        if (f instanceof String) {
            n = new LazilyParsedNumber((String)f);
        }
        else {
            n = (Number)f;
        }
        return n;
    }
    
    public final void J(final Object f) {
        if (f instanceof Character) {
            this.f = String.valueOf((char)f);
        }
        else {
            final boolean b = f instanceof Number;
            boolean b2 = false;
            Label_0101: {
                if (!b) {
                    boolean b3 = false;
                    Label_0094: {
                        Label_0042: {
                            if (!(f instanceof String)) {
                                final Class<?> class1 = f.getClass();
                                final Class<?>[] g = k.g;
                                for (int i = 0; i < 16; ++i) {
                                    if (g[i].isAssignableFrom(class1)) {
                                        break Label_0042;
                                    }
                                }
                                b3 = false;
                                break Label_0094;
                            }
                        }
                        b3 = true;
                    }
                    if (!b3) {
                        break Label_0101;
                    }
                }
                b2 = true;
            }
            a.h(b2);
            this.f = f;
        }
    }
    
    public final BigDecimal a() {
        final Object f = this.f;
        BigDecimal bigDecimal;
        if (f instanceof BigDecimal) {
            bigDecimal = (BigDecimal)f;
        }
        else {
            bigDecimal = new BigDecimal(this.f.toString());
        }
        return bigDecimal;
    }
    
    public final BigInteger c() {
        final Object f = this.f;
        BigInteger bigInteger;
        if (f instanceof BigInteger) {
            bigInteger = (BigInteger)f;
        }
        else {
            bigInteger = new BigInteger(this.f.toString());
        }
        return bigInteger;
    }
    
    public final boolean d() {
        final Object f = this.f;
        if (f instanceof Boolean) {
            return (boolean)f;
        }
        return Boolean.parseBoolean(this.C());
    }
    
    public final byte e() {
        byte b;
        if (this.f instanceof Number) {
            b = this.F().byteValue();
        }
        else {
            b = Byte.parseByte(this.C());
        }
        return b;
    }
    
    public final boolean equals(Object f) {
        final boolean b = true;
        final boolean b2 = true;
        boolean b3 = true;
        if (this == f) {
            return true;
        }
        if (f == null || k.class != f.getClass()) {
            return false;
        }
        final k k = (k)f;
        if (this.f == null) {
            if (k.f != null) {
                b3 = false;
            }
            return b3;
        }
        if (I(this) && I(k)) {
            return this.F().longValue() == k.F().longValue() && b;
        }
        f = this.f;
        if (f instanceof Number && k.f instanceof Number) {
            final double doubleValue = this.F().doubleValue();
            final double doubleValue2 = k.F().doubleValue();
            boolean b4 = b2;
            if (doubleValue != doubleValue2) {
                b4 = (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2) && b2);
            }
            return b4;
        }
        return f.equals(k.f);
    }
    
    public final int hashCode() {
        if (this.f == null) {
            return 31;
        }
        long n;
        if (I(this)) {
            n = this.F().longValue();
        }
        else {
            final Object f = this.f;
            if (!(f instanceof Number)) {
                return f.hashCode();
            }
            n = Double.doubleToLongBits(this.F().doubleValue());
        }
        return (int)(n >>> 32 ^ n);
    }
    
    public final char i() {
        return this.C().charAt(0);
    }
    
    public final double k() {
        double n;
        if (this.f instanceof Number) {
            n = this.F().doubleValue();
        }
        else {
            n = Double.parseDouble(this.C());
        }
        return n;
    }
    
    public final float l() {
        float n;
        if (this.f instanceof Number) {
            n = this.F().floatValue();
        }
        else {
            n = Float.parseFloat(this.C());
        }
        return n;
    }
    
    public final int m() {
        int n;
        if (this.f instanceof Number) {
            n = this.F().intValue();
        }
        else {
            n = Integer.parseInt(this.C());
        }
        return n;
    }
    
    public final long x() {
        long n;
        if (this.f instanceof Number) {
            n = this.F().longValue();
        }
        else {
            n = Long.parseLong(this.C());
        }
        return n;
    }
    
    public final short z() {
        short n;
        if (this.f instanceof Number) {
            n = this.F().shortValue();
        }
        else {
            n = Short.parseShort(this.C());
        }
        return n;
    }
}
