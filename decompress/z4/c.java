// 
// Decompiled by Procyon v0.6.0
// 

package z4;

import z3.b;
import android.text.TextUtils;

public class c
{
    public String a;
    public int b;
    public int c;
    
    public c(final String a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = true;
        boolean b2 = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof c)) {
            return false;
        }
        final c c = (c)o;
        if (this.b >= 0 && c.b >= 0) {
            if (!TextUtils.equals((CharSequence)this.a, (CharSequence)c.a) || this.b != c.b || this.c != c.c) {
                b2 = false;
            }
            return b2;
        }
        return TextUtils.equals((CharSequence)this.a, (CharSequence)c.a) && this.c == c.c && b;
    }
    
    @Override
    public final int hashCode() {
        return z3.b.b(this.a, this.c);
    }
}
