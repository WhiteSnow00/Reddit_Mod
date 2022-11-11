// 
// Decompiled by Procyon v0.6.0
// 

package t2;

import sg2.e;

public final class a
{
    public final float a = a;
    
    @Override
    public final boolean equals(final Object o) {
        final float a = this.a;
        final boolean b = o instanceof a;
        boolean b2 = false;
        if (b) {
            if (e.a((Object)a, (Object)((a)o).a)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final StringBuilder sb = new StringBuilder();
        sb.append("BaselineShift(multiplier=");
        sb.append(a);
        sb.append(')');
        return sb.toString();
    }
}
