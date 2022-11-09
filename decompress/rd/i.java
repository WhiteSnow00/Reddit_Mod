// 
// Decompiled by Procyon v0.6.0
// 

package rd;

import ah2.f;

public final class i
{
    public final String a;
    public final String b;
    
    public i(final String s, final String s2, int n) {
        if (n == 1) {
            f.f((Object)s2, "subTitle");
            this.a = s;
            this.b = s2;
            return;
        }
        if (s.length() <= 23) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            this.a = s;
            if (s2 != null && s2.length() > 0) {
                this.b = s2;
            }
            else {
                this.b = null;
            }
            return;
        }
        throw new IllegalArgumentException(String.format("tag \"%s\" is longer than the %d character maximum", s, 23));
    }
}
