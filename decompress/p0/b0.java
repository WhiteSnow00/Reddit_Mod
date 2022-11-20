// 
// Decompiled by Procyon v0.6.0
// 

package p0;

import ng2.e;

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
        return e.a((Object)this.a, (Object)b0.a) && this.b == b0.b && e.a((Object)this.c, (Object)b0.c);
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
        final StringBuilder t = a.t("RowColumnParentData(weight=");
        t.append(this.a);
        t.append(", fill=");
        t.append(this.b);
        t.append(", crossAxisAlignment=");
        t.append(this.c);
        t.append(')');
        return t.toString();
    }
}
