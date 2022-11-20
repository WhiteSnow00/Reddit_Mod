// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import ng2.e;
import java.util.Locale;
import java.text.BreakIterator;

public final class b extends a
{
    public static b d;
    public BreakIterator c;
    
    public b(final Locale locale) {
        final BreakIterator characterInstance = BreakIterator.getCharacterInstance(locale);
        e.e((Object)characterInstance, "getCharacterInstance(locale)");
        this.c = characterInstance;
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
        do {
            final BreakIterator c = this.c;
            if (c == null) {
                e.n("impl");
                throw null;
            }
            if (!c.isBoundary(n2)) {
                final BreakIterator c2 = this.c;
                if (c2 == null) {
                    e.n("impl");
                    throw null;
                }
                n = c2.following(n2);
            }
            else {
                final BreakIterator c3 = this.c;
                if (c3 == null) {
                    e.n("impl");
                    throw null;
                }
                n = c3.following(n2);
                if (n == -1) {
                    return null;
                }
                return this.c(n2, n);
            }
        } while ((n2 = n) != -1);
        return null;
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
        int n2;
        if ((n2 = n) > length) {
            n2 = length;
        }
        do {
            final BreakIterator c = this.c;
            if (c == null) {
                e.n("impl");
                throw null;
            }
            if (!c.isBoundary(n2)) {
                final BreakIterator c2 = this.c;
                if (c2 == null) {
                    e.n("impl");
                    throw null;
                }
                n = c2.preceding(n2);
            }
            else {
                final BreakIterator c3 = this.c;
                if (c3 == null) {
                    e.n("impl");
                    throw null;
                }
                n = c3.preceding(n2);
                if (n == -1) {
                    return null;
                }
                return this.c(n, n2);
            }
        } while ((n2 = n) != -1);
        return null;
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
}
