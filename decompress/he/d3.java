// 
// Decompiled by Procyon v0.6.0
// 

package he;

public final class d3 extends u9
{
    public final String a;
    public final int b;
    
    public d3(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final int n = this.b - 2;
        String s;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        s = "UNKNOWN";
                    }
                    else {
                        s = "CRUNCHY";
                    }
                }
                else {
                    s = "RAW";
                }
            }
            else {
                s = "LEGACY";
            }
        }
        else {
            s = "TINK";
        }
        return String.format("(typeUrl=%s, outputPrefixType=%s)", a, s);
    }
}
