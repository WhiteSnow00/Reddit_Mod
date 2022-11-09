// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import ah2.f;

public final class b0
{
    public float a;
    public boolean b;
    public k c;
    
    public b0() {
        this(0);
    }
    
    public b0(final int n) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b0)) {
            return false;
        }
        final b0 b0 = (b0)o;
        return f.a((Object)this.a, (Object)b0.a) && this.b == b0.b && f.a((Object)this.c, (Object)b0.c);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = Float.hashCode(this.a);
        int b;
        if ((b = (this.b ? 1 : 0)) != 0) {
            b = 1;
        }
        final k c = this.c;
        int hashCode2;
        if (c == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = c.hashCode();
        }
        return (hashCode * 31 + b) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("RowColumnParentData(weight=");
        k.append(this.a);
        k.append(", fill=");
        k.append(this.b);
        k.append(", crossAxisAlignment=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
