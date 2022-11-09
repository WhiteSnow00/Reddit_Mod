// 
// Decompiled by Procyon v0.6.0
// 

package u2;

import ah2.f;

public final class d implements Comparable<d>
{
    public final float f = f;
    
    public static final boolean a(final float n, final float n2) {
        return f.a((Object)n, (Object)n2);
    }
    
    public static String b(final float n) {
        String string;
        if (Float.isNaN(n)) {
            string = "Dp.Unspecified";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append(n);
            sb.append(".dp");
            string = sb.toString();
        }
        return string;
    }
    
    @Override
    public final int compareTo(final Object o) {
        return Float.compare(this.f, ((d)o).f);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final float f = this.f;
        final boolean b = o instanceof d;
        boolean b2 = false;
        if (b) {
            if (ah2.f.a((Object)f, (Object)((d)o).f)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Float.hashCode(this.f);
    }
    
    @Override
    public final String toString() {
        return b(this.f);
    }
}
