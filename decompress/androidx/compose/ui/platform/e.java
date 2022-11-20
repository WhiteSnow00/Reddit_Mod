// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

public final class e extends a
{
    public static e c;
    
    public e(final int n) {
    }
    
    @Override
    public final int[] a(int n) {
        final int length = this.d().length();
        if (length <= 0) {
            return null;
        }
        if (n >= length) {
            return null;
        }
        int n2;
        if ((n2 = n) < 0) {
            n2 = 0;
        }
        while (n2 < length && this.d().charAt(n2) == '\n' && !this.f(n2)) {
            ++n2;
        }
        if (n2 >= length) {
            return null;
        }
        for (n = n2 + 1; n < length && !this.e(n); ++n) {}
        return this.c(n2, n);
    }
    
    @Override
    public final int[] b(int n) {
        final int length = this.d().length();
        if (length <= 0) {
            return null;
        }
        if (n <= 0) {
            return null;
        }
        int i;
        if ((i = n) > length) {
            i = length;
        }
        while (i > 0) {
            final String d = this.d();
            n = i - 1;
            if (d.charAt(n) != '\n' || this.e(i)) {
                break;
            }
            i = n;
        }
        if (i <= 0) {
            return null;
        }
        for (n = i - 1; n > 0 && !this.f(n); --n) {}
        return this.c(n, i);
    }
    
    public final boolean e(final int n) {
        return n > 0 && this.d().charAt(n - 1) != '\n' && (n == this.d().length() || this.d().charAt(n) == '\n');
    }
    
    public final boolean f(final int n) {
        final char char1 = this.d().charAt(n);
        final boolean b = true;
        if (char1 != '\n') {
            boolean b2 = b;
            if (n == 0) {
                return b2;
            }
            if (this.d().charAt(n - 1) == '\n') {
                b2 = b;
                return b2;
            }
        }
        return false;
    }
}
