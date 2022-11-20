// 
// Decompiled by Procyon v0.6.0
// 

package he;

import com.google.android.gms.internal.firebase-auth-api.h;

public final class jd extends u0
{
    public jd(final h h, final CharSequence charSequence) {
        super(h, charSequence);
    }
    
    public final int d(final int n) {
        return n + 1;
    }
    
    public final int e(int n) {
        final CharSequence h = super.h;
        final int length = h.length();
        int i;
        if (n >= 0 && (i = n) <= length) {
            while (i < length) {
                n = i;
                if (h.charAt(i) == '.') {
                    return n;
                }
                ++i;
            }
            n = -1;
            return n;
        }
        String s;
        if (n >= 0) {
            if (length < 0) {
                throw new IllegalArgumentException(d.h("negative size: ", length));
            }
            s = fa.f("%s (%s) must not be greater than size (%s)", new Object[] { "index", n, length });
        }
        else {
            s = fa.f("%s (%s) must not be negative", new Object[] { "index", n });
        }
        throw new IndexOutOfBoundsException(s);
    }
}
