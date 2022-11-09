// 
// Decompiled by Procyon v0.6.0
// 

package a3;

import ak0.m;

public final class a
{
    public String a;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    
    public a(final a a) {
        this.c = Integer.MIN_VALUE;
        this.d = Float.NaN;
        this.e = null;
        this.a = a.a;
        this.b = a.b;
        this.c = a.c;
        this.d = a.d;
        this.e = a.e;
        this.f = a.f;
    }
    
    public a(final String a, final float d) {
        this.c = Integer.MIN_VALUE;
        this.e = null;
        this.a = a;
        this.b = 901;
        this.d = d;
    }
    
    public a(final String a, final int c) {
        this.d = Float.NaN;
        this.e = null;
        this.a = a;
        this.b = 902;
        this.c = c;
    }
    
    public static String a(final int n) {
        final StringBuilder k = a.k("00000000");
        k.append(Integer.toHexString(n));
        final String string = k.toString();
        final StringBuilder i = a.k("#");
        i.append(string.substring(string.length() - 8));
        return i.toString();
    }
    
    @Override
    public final String toString() {
        final String k = b.k(new StringBuilder(), this.a, ':');
        switch (this.b) {
            default: {
                return m.l(k, "????");
            }
            case 905: {
                final StringBuilder i = a.k(k);
                i.append(this.d);
                return i.toString();
            }
            case 904: {
                final StringBuilder j = a.k(k);
                j.append((Object)this.f);
                return j.toString();
            }
            case 903: {
                final StringBuilder l = a.k(k);
                l.append(this.e);
                return l.toString();
            }
            case 902: {
                final StringBuilder m = a.k(k);
                m.append(a(this.c));
                return m.toString();
            }
            case 901: {
                final StringBuilder k2 = a.k(k);
                k2.append(this.d);
                return k2.toString();
            }
            case 900: {
                final StringBuilder k3 = a.k(k);
                k3.append(this.c);
                return k3.toString();
            }
        }
    }
}
