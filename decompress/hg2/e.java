// 
// Decompiled by Procyon v0.6.0
// 

package hg2;

import yg2.i;

public final class e implements Comparable<e>
{
    public static final e j;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    
    static {
        j = new e(7, 10);
    }
    
    public e() {
        throw null;
    }
    
    public e(final int g, final int h) {
        this.f = 1;
        this.g = g;
        this.h = h;
        int n2;
        final int n = n2 = 0;
        if (new i(0, 255).k(1)) {
            n2 = n;
            if (new i(0, 255).k(g)) {
                n2 = n;
                if (new i(0, 255).k(h)) {
                    n2 = 1;
                }
            }
        }
        if (n2 != 0) {
            this.i = 65536 + (g << 8) + h;
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Version components are out of range: ");
        sb.append(1);
        sb.append('.');
        sb.append(g);
        sb.append('.');
        sb.append(h);
        throw new IllegalArgumentException(sb.toString().toString());
    }
    
    @Override
    public final int compareTo(final Object o) {
        final e e = (e)o;
        sg2.e.f((Object)e, "other");
        return this.i - e.i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        e e;
        if (o instanceof e) {
            e = (e)o;
        }
        else {
            e = null;
        }
        if (e == null) {
            return false;
        }
        if (this.i != e.i) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final int hashCode() {
        return this.i;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('.');
        sb.append(this.g);
        sb.append('.');
        sb.append(this.h);
        return sb.toString();
    }
}
