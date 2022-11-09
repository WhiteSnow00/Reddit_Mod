// 
// Decompiled by Procyon v0.6.0
// 

package re;

import u5.w;
import android.util.Log;
import yd.a;
import android.text.TextUtils;

public final class c3 extends t4
{
    public char h;
    public long i;
    public String j;
    public final a3 k;
    public final a3 l;
    public final a3 m;
    public final a3 n;
    public final a3 o;
    public final a3 p;
    public final a3 q;
    public final a3 r;
    public final a3 s;
    
    public c3(final h4 h4) {
        super(h4);
        this.h = 0;
        this.i = -1L;
        this.k = new a3(this, 6, false, false);
        this.l = new a3(this, 6, true, false);
        this.m = new a3(this, 6, false, true);
        this.n = new a3(this, 5, false, false);
        this.o = new a3(this, 5, true, false);
        this.p = new a3(this, 5, false, true);
        this.q = new a3(this, 4, false, false);
        this.r = new a3(this, 3, false, false);
        this.s = new a3(this, 2, false, false);
    }
    
    public static b3 H(final String s) {
        if (s == null) {
            return null;
        }
        return new b3(s);
    }
    
    public static String I(final boolean b, String s, final Object o, final Object o2, final Object o3) {
        final String s2 = "";
        String s3 = s;
        if (s == null) {
            s3 = "";
        }
        final String j = J(o, b);
        final String i = J(o2, b);
        final String k = J(o3, b);
        final StringBuilder sb = new StringBuilder();
        s = s2;
        if (!TextUtils.isEmpty((CharSequence)s3)) {
            sb.append(s3);
            s = ": ";
        }
        final boolean empty = TextUtils.isEmpty((CharSequence)j);
        final String s4 = ", ";
        String s5 = s;
        if (!empty) {
            sb.append(s);
            sb.append(j);
            s5 = ", ";
        }
        if (!TextUtils.isEmpty((CharSequence)i)) {
            sb.append(s5);
            sb.append(i);
            s5 = s4;
        }
        if (!TextUtils.isEmpty((CharSequence)k)) {
            sb.append(s5);
            sb.append(k);
        }
        return sb.toString();
    }
    
    public static String J(final Object o, final boolean b) {
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
            if (value instanceof b3) {
                return ((b3)value).a;
            }
            if (b) {
                return "-";
            }
            return value.toString();
        }
    }
    
    public final a3 C() {
        return this.r;
    }
    
    public final a3 D() {
        return this.k;
    }
    
    public final a3 E() {
        return this.s;
    }
    
    public final a3 F() {
        return this.n;
    }
    
    public final a3 G() {
        return this.p;
    }
    
    public final String K() {
        monitorenter(this);
        Label_0068: {
            try {
                if (this.j != null) {
                    break Label_0068;
                }
                final Object f = ((w)this).f;
                if (((h4)f).i != null) {
                    this.j = ((h4)f).i;
                    break Label_0068;
                }
                ((w)((h4)f).l).f.getClass();
                this.j = "FA";
                break Label_0068;
            }
            finally {
                monitorexit(this);
                a.S0((Object)this.j);
                final String j = this.j;
                monitorexit(this);
                return j;
            }
        }
    }
    
    public final void L(final int n, final boolean b, final boolean b2, final String s, final Object o, final Object o2, final Object o3) {
        if (!b && Log.isLoggable(this.K(), n)) {
            Log.println(n, this.K(), I(false, s, o, o2, o3));
        }
        if (!b2 && n >= 5) {
            a.S0((Object)s);
            final g4 o4 = ((h4)((w)this).f).o;
            if (o4 == null) {
                Log.println(6, this.K(), "Scheduler not set. Not logging error/warn");
                return;
            }
            if (!o4.g) {
                Log.println(6, this.K(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            int n2;
            if ((n2 = n) >= 9) {
                n2 = 8;
            }
            o4.G((Runnable)new z2(this, n2, s, o, o2, o3));
        }
    }
    
    public final boolean z() {
        return false;
    }
}
