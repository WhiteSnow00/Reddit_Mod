// 
// Decompiled by Procyon v0.6.0
// 

package p1;

import ah2.f;
import ah2.i;

public abstract class c
{
    public final String a;
    public final long b;
    public final int c;
    
    public c(final int c, final long b, final String a) {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (c >= -1 && c <= 63) {
            return;
        }
        throw new IllegalArgumentException("The id must be between -1 and 63");
    }
    
    public abstract float[] a(final float[] p0);
    
    public abstract float b(final int p0);
    
    public abstract float c(final int p0);
    
    public boolean d() {
        return false;
    }
    
    public abstract float[] e(final float[] p0);
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        boolean a;
        final boolean b = a = false;
        if (o != null) {
            if (!f.a((Object)i.a((Class)this.getClass()), (Object)i.a((Class)o.getClass()))) {
                a = b;
            }
            else {
                final c c = (c)o;
                if (this.c != c.c) {
                    return false;
                }
                if (!f.a((Object)this.a, (Object)c.a)) {
                    a = b;
                }
                else {
                    a = p1.b.a(this.b, c.b);
                }
            }
        }
        return a;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final long b = this.b;
        final int e = p1.b.e;
        return b.c(b, hashCode * 31, 31) + this.c;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(" (id=");
        sb.append(this.c);
        sb.append(", model=");
        sb.append((Object)p1.b.b(this.b));
        sb.append(')');
        return sb.toString();
    }
}
