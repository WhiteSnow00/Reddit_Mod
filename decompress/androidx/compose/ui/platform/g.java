// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import java.util.Locale;
import java.text.BreakIterator;

public final class g extends a
{
    public static g d;
    public BreakIterator c;
    
    public g(final Locale locale) {
        final BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        e.e((Object)wordInstance, "getWordInstance(locale)");
        this.c = wordInstance;
    }
    
    @Override
    public final int[] a(int n) {
        if (this.d().length() <= 0) {
            return null;
        }
        if (n >= this.d().length()) {
            return null;
        }
        int n2;
        if ((n2 = n) < 0) {
            n2 = 0;
        }
        while (!this.g(n2)) {
            final boolean g = this.g(n2);
            final int n3 = 1;
            Label_0078: {
                if (g) {
                    n = n3;
                    if (n2 == 0) {
                        break Label_0078;
                    }
                    if (!this.g(n2 - 1)) {
                        n = n3;
                        break Label_0078;
                    }
                }
                n = 0;
            }
            if (n != 0) {
                break;
            }
            final BreakIterator c = this.c;
            if (c == null) {
                e.n("impl");
                throw null;
            }
            n = c.following(n2);
            if ((n2 = n) == -1) {
                return null;
            }
        }
        final BreakIterator c2 = this.c;
        if (c2 == null) {
            e.n("impl");
            throw null;
        }
        n = c2.following(n2);
        if (n != -1 && this.f(n)) {
            return this.c(n2, n);
        }
        return null;
    }
    
    @Override
    public final int[] b(int preceding) {
        final int length = this.d().length();
        if (length <= 0) {
            return null;
        }
        if (preceding <= 0) {
            return null;
        }
        int n;
        if ((n = preceding) > length) {
            n = length;
        }
        while (n > 0 && !this.g(n - 1) && !this.f(n)) {
            final BreakIterator c = this.c;
            if (c == null) {
                e.n("impl");
                throw null;
            }
            preceding = c.preceding(n);
            if ((n = preceding) == -1) {
                return null;
            }
        }
        final BreakIterator c2 = this.c;
        if (c2 != null) {
            final int preceding2 = c2.preceding(n);
            if (preceding2 != -1) {
                final boolean g = this.g(preceding2);
                final int n2 = 1;
                Label_0150: {
                    if (g) {
                        preceding = n2;
                        if (preceding2 == 0) {
                            break Label_0150;
                        }
                        if (!this.g(preceding2 - 1)) {
                            preceding = n2;
                            break Label_0150;
                        }
                    }
                    preceding = 0;
                }
                if (preceding != 0) {
                    return this.c(preceding2, n);
                }
            }
            return null;
        }
        e.n("impl");
        throw null;
    }
    
    public final void e(final String s) {
        e.f((Object)s, "text");
        super.a = s;
        final BreakIterator c = this.c;
        if (c != null) {
            c.setText(s);
            return;
        }
        e.n("impl");
        throw null;
    }
    
    public final boolean f(final int n) {
        return n > 0 && this.g(n - 1) && (n == this.d().length() || !this.g(n));
    }
    
    public final boolean g(final int n) {
        return n >= 0 && n < this.d().length() && Character.isLetterOrDigit(this.d().codePointAt(n));
    }
}
