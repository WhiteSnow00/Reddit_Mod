// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.util.Log;
import lw0.b;
import android.text.TextUtils;

public final class d3 extends v4
{
    public char h;
    public long i;
    public String j;
    public final b3 k;
    public final b3 l;
    public final b3 m;
    public final b3 n;
    public final b3 o;
    public final b3 p;
    public final b3 q;
    public final b3 r;
    public final b3 s;
    
    public d3(final h4 h4) {
        super(h4);
        this.h = 0;
        this.i = -1L;
        this.k = new b3(this, 6, false, false);
        this.l = new b3(this, 6, true, false);
        this.m = new b3(this, 6, false, true);
        this.n = new b3(this, 5, false, false);
        this.o = new b3(this, 5, true, false);
        this.p = new b3(this, 5, false, true);
        this.q = new b3(this, 4, false, false);
        this.r = new b3(this, 3, false, false);
        this.s = new b3(this, 2, false, false);
    }
    
    public static c3 V(final String s) {
        if (s == null) {
            return null;
        }
        return new c3(s);
    }
    
    public static String W(final boolean b, String s, final Object o, final Object o2, Object o3) {
        final String s2 = "";
        String s3 = s;
        if (s == null) {
            s3 = "";
        }
        final String x = X(o, b);
        final String x2 = X(o2, b);
        final String x3 = X(o3, b);
        o3 = new StringBuilder();
        s = s2;
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            ((StringBuilder)o3).append(s3);
            s = ": ";
        }
        final boolean empty = TextUtils.isEmpty((CharSequence)x);
        final String s4 = ", ";
        String s5 = s;
        if (!empty) {
            ((StringBuilder)o3).append(s);
            ((StringBuilder)o3).append(x);
            s5 = ", ";
        }
        if (!TextUtils.isEmpty((CharSequence)x2)) {
            ((StringBuilder)o3).append(s5);
            ((StringBuilder)o3).append(x2);
            s5 = s4;
        }
        if (!TextUtils.isEmpty((CharSequence)x3)) {
            ((StringBuilder)o3).append(s5);
            ((StringBuilder)o3).append(x3);
        }
        return ((StringBuilder)o3).toString();
    }
    
    public static String X(final Object o, final boolean b) {
        final String s = "";
        if (o == null) {
            return "";
        }
        Object value = o;
        if (o instanceof Integer) {
            value = o;
        }
        if (value instanceof Long) {
            if (!b) {
                return value.toString();
            }
            final Long n = (Long)value;
            if (Math.abs(n) < 100L) {
                return value.toString();
            }
            String s2 = s;
            if (value.toString().charAt(0) == '-') {
                s2 = "-";
            }
            final String value2 = String.valueOf(Math.abs(n));
            final long round = Math.round(Math.pow(10.0, value2.length() - 1));
            final long round2 = Math.round(Math.pow(10.0, value2.length()) - 1.0);
            final StringBuilder sb = new StringBuilder();
            sb.append(s2);
            sb.append(round);
            sb.append("...");
            sb.append(s2);
            sb.append(round2);
            return sb.toString();
        }
        else {
            if (value instanceof Boolean) {
                return value.toString();
            }
            if (value instanceof Throwable) {
                final Throwable t = (Throwable)value;
                String s3;
                if (b) {
                    s3 = t.getClass().getName();
                }
                else {
                    s3 = t.toString();
                }
                final StringBuilder sb2 = new StringBuilder(s3);
                String s4 = h4.class.getCanonicalName();
                if (TextUtils.isEmpty((CharSequence)s4)) {
                    s4 = "";
                }
                else {
                    final int lastIndex = s4.lastIndexOf(46);
                    if (lastIndex != -1) {
                        s4 = s4.substring(0, lastIndex);
                    }
                }
                for (final StackTraceElement stackTraceElement : t.getStackTrace()) {
                    if (!stackTraceElement.isNativeMethod()) {
                        String s5 = stackTraceElement.getClassName();
                        if (s5 != null) {
                            if (TextUtils.isEmpty((CharSequence)s5)) {
                                s5 = "";
                            }
                            else {
                                final int lastIndex2 = s5.lastIndexOf(46);
                                if (lastIndex2 != -1) {
                                    s5 = s5.substring(0, lastIndex2);
                                }
                            }
                            if (s5.equals(s4)) {
                                sb2.append(": ");
                                sb2.append(stackTraceElement);
                                break;
                            }
                        }
                    }
                }
                return sb2.toString();
            }
            if (value instanceof c3) {
                return ((c3)value).a;
            }
            if (b) {
                return "-";
            }
            return value.toString();
        }
    }
    
    @Override
    public final boolean N() {
        return false;
    }
    
    public final b3 Q() {
        return this.r;
    }
    
    public final b3 R() {
        return this.k;
    }
    
    public final b3 S() {
        return this.s;
    }
    
    public final b3 T() {
        return this.n;
    }
    
    public final b3 U() {
        return this.p;
    }
    
    public final String Y() {
        monitorenter(this);
        Label_0068: {
            try {
                if (this.j != null) {
                    break Label_0068;
                }
                final Object f = super.f;
                if (((h4)f).i != null) {
                    this.j = ((h4)f).i;
                    break Label_0068;
                }
                ((h4)f).l.f.getClass();
                this.j = "FA";
                break Label_0068;
            }
            finally {
                monitorexit(this);
                b.R((Object)this.j);
                final String j = this.j;
                monitorexit(this);
                return j;
            }
        }
    }
    
    public final void Z(final int n, final boolean b, final boolean b2, final String s, final Object o, final Object o2, final Object o3) {
        if (!b && Log.isLoggable(this.Y(), n)) {
            Log.println(n, this.Y(), W(false, s, o, o2, o3));
        }
        if (!b2 && n >= 5) {
            b.R((Object)s);
            final g4 o4 = ((h4)super.f).o;
            if (o4 == null) {
                Log.println(6, this.Y(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!o4.g) {
                Log.println(6, this.Y(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            int n2;
            if ((n2 = n) >= 9) {
                n2 = 8;
            }
            o4.U((Runnable)new a3(this, n2, s, o, o2, o3));
        }
    }
}
