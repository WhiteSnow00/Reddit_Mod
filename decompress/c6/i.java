// 
// Decompiled by Procyon v0.6.0
// 

package c6;

import android.util.Log;

public abstract class i
{
    public static i a;
    
    public static i c() {
        synchronized (i.class) {
            if (i.a == null) {
                i.a = new a(3);
            }
            return i.a;
        }
    }
    
    public static String e(final String s) {
        final int length = s.length();
        final StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(s.substring(0, 20));
        }
        else {
            sb.append(s);
        }
        return sb.toString();
    }
    
    public abstract void a(final String p0, final String p1, final Throwable... p2);
    
    public abstract void b(final String p0, final String p1, final Throwable... p2);
    
    public abstract void d(final String p0, final String p1, final Throwable... p2);
    
    public abstract void f(final String p0, final String p1, final Throwable... p2);
    
    public static final class a extends i
    {
        public int b;
        
        public a(final int b) {
            this.b = b;
        }
        
        @Override
        public final void a(final String s, final String s2, final Throwable... array) {
            if (this.b <= 3) {
                if (array.length >= 1) {
                    Log.d(s, s2, array[0]);
                }
                else {
                    Log.d(s, s2);
                }
            }
        }
        
        @Override
        public final void b(final String s, final String s2, final Throwable... array) {
            if (this.b <= 6) {
                if (array.length >= 1) {
                    Log.e(s, s2, array[0]);
                }
                else {
                    Log.e(s, s2);
                }
            }
        }
        
        @Override
        public final void d(final String s, final String s2, final Throwable... array) {
            if (this.b <= 4) {
                if (array.length >= 1) {
                    Log.i(s, s2, array[0]);
                }
                else {
                    Log.i(s, s2);
                }
            }
        }
        
        @Override
        public final void f(final String s, final String s2, final Throwable... array) {
            if (this.b <= 5) {
                if (array.length >= 1) {
                    Log.w(s, s2, array[0]);
                }
                else {
                    Log.w(s, s2);
                }
            }
        }
    }
}
