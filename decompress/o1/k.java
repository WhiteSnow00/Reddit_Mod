// 
// Decompiled by Procyon v0.6.0
// 

package o1;

public final class k
{
    public final int a = a;
    
    @Override
    public final boolean equals(final Object o) {
        final int a = this.a;
        final boolean b = o instanceof k;
        boolean b2 = false;
        if (b) {
            if (a == ((k)o).a) {
                b2 = true;
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int n = 0;
        String s;
        if (a == 0) {
            s = "Clear";
        }
        else if (a == 1) {
            s = "Src";
        }
        else if (a == 2) {
            s = "Dst";
        }
        else if (a == 3) {
            s = "SrcOver";
        }
        else if (a == 4) {
            s = "DstOver";
        }
        else if (a == 5) {
            s = "SrcIn";
        }
        else if (a == 6) {
            s = "DstIn";
        }
        else if (a == 7) {
            s = "SrcOut";
        }
        else if (a == 8) {
            s = "DstOut";
        }
        else if (a == 9) {
            s = "SrcAtop";
        }
        else if (a == 10) {
            s = "DstAtop";
        }
        else if (a == 11) {
            s = "Xor";
        }
        else if (a == 12) {
            s = "Plus";
        }
        else if (a == 13) {
            s = "Modulate";
        }
        else if (a == 14) {
            s = "Screen";
        }
        else if (a == 15) {
            s = "Overlay";
        }
        else if (a == 16) {
            s = "Darken";
        }
        else if (a == 17) {
            s = "Lighten";
        }
        else if (a == 18) {
            s = "ColorDodge";
        }
        else if (a == 19) {
            s = "ColorBurn";
        }
        else if (a == 20) {
            s = "HardLight";
        }
        else if (a == 21) {
            s = "Softlight";
        }
        else if (a == 22) {
            s = "Difference";
        }
        else if (a == 23) {
            s = "Exclusion";
        }
        else if (a == 24) {
            s = "Multiply";
        }
        else if (a == 25) {
            s = "Hue";
        }
        else if (a == 26) {
            s = "Saturation";
        }
        else if (a == 27) {
            s = "Color";
        }
        else {
            int n2 = n;
            if (a == 28) {
                n2 = 1;
            }
            if (n2 != 0) {
                s = "Luminosity";
            }
            else {
                s = "Unknown";
            }
        }
        return s;
    }
}
