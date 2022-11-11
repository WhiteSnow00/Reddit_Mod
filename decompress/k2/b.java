// 
// Decompiled by Procyon v0.6.0
// 

package k2;

import java.text.CharacterIterator;
import j2.a;
import sg2.e;
import java.util.Locale;
import java.text.BreakIterator;

public final class b
{
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;
    
    public b(final CharSequence a, final int n, final Locale locale) {
        this.a = a;
        final int length = a.length();
        final int n2 = 1;
        if (length < 0) {
            throw new IllegalArgumentException("input start index is outside the CharSequence".toString());
        }
        int n3;
        if (n >= 0 && n <= a.length()) {
            n3 = n2;
        }
        else {
            n3 = 0;
        }
        if (n3 != 0) {
            final BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
            e.e((Object)wordInstance, "getWordInstance(locale)");
            this.d = wordInstance;
            this.b = Math.max(0, -50);
            this.c = Math.min(a.length(), n + 50);
            wordInstance.setText((CharacterIterator)new j2.a(a, n));
            return;
        }
        throw new IllegalArgumentException("input end index is outside the CharSequence".toString());
    }
    
    public final void a(final int n) {
        final int b = this.b;
        final int c = this.c;
        int n2 = 0;
        if (n <= c) {
            n2 = n2;
            if (b <= n) {
                n2 = 1;
            }
        }
        if (n2 != 0) {
            return;
        }
        final StringBuilder i = al0.b.i("Invalid offset: ", n, ". Valid range is [");
        i.append(this.b);
        i.append(" , ");
        throw new IllegalArgumentException(d.l(i, this.c, ']').toString());
    }
    
    public final boolean b(final int n) {
        final int b = this.b;
        return n <= this.c && b + 1 <= n && Character.isLetterOrDigit(Character.codePointBefore(this.a, n));
    }
    
    public final boolean c(final int n) {
        final int b = this.b;
        boolean b2 = true;
        if (n > this.c || b + 1 > n) {
            b2 = false;
        }
        return b2 && k2.b.a.a(Character.codePointBefore(this.a, n));
    }
    
    public final boolean d(final int n) {
        final int b = this.b;
        return n < this.c && b <= n && Character.isLetterOrDigit(Character.codePointAt(this.a, n));
    }
    
    public final boolean e(final int n) {
        final int b = this.b;
        return n < this.c && b <= n && k2.b.a.a(Character.codePointAt(this.a, n));
    }
    
    public static final class a
    {
        public static boolean a(int type) {
            type = Character.getType(type);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }
    }
}
