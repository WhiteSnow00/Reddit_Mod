// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import ng2.e;
import dg.l0;

public abstract class a
{
    public int a;
    public final h b;
    public String c;
    public StringBuilder d;
    
    public a() {
        this.b = new h();
        this.d = new StringBuilder();
    }
    
    public static void p(final a a, final String s, int a2, String s2, final int n) {
        if ((n & 0x2) != 0x0) {
            a2 = a.a;
        }
        if ((n & 0x4) != 0x0) {
            s2 = "";
        }
        a.o(a2, s, s2);
        throw null;
    }
    
    public final int a(final int a, final CharSequence charSequence) {
        final int n = a + 4;
        if (n < charSequence.length()) {
            this.d.append((char)(this.r(a + 3, charSequence) + ((this.r(a, charSequence) << 12) + (this.r(a + 1, charSequence) << 8) + (this.r(a + 2, charSequence) << 4))));
            return n;
        }
        this.a = a;
        if (n < charSequence.length()) {
            return this.a(this.a, charSequence);
        }
        p(this, "Unexpected EOF during unicode escape", 0, null, 6);
        throw null;
    }
    
    public abstract boolean b();
    
    public final boolean c(int length) {
        final int u = this.u(length);
        length = this.s().length();
        boolean b = false;
        if (u < length && u != -1) {
            final String s = this.s();
            length = u + 1;
            final int n = s.charAt(u) | ' ';
            if (n == 116) {
                this.d(length, "rue");
                b = true;
            }
            else {
                if (n != 102) {
                    final StringBuilder t = a.t("Expected valid boolean literal prefix, but had '");
                    t.append(this.l());
                    t.append('\'');
                    p(this, t.toString(), 0, null, 6);
                    throw null;
                }
                this.d(length, "alse");
            }
            return b;
        }
        p(this, "EOF", 0, null, 6);
        throw null;
    }
    
    public final void d(final int n, final String s) {
        if (this.s().length() - n >= s.length()) {
            for (int length = s.length(), i = 0; i < length; ++i) {
                if (s.charAt(i) != (this.s().charAt(n + i) | ' ')) {
                    final StringBuilder t = a.t("Expected valid boolean literal prefix, but had '");
                    t.append(this.l());
                    t.append('\'');
                    p(this, t.toString(), 0, null, 6);
                    throw null;
                }
            }
            this.a = s.length() + n;
            return;
        }
        p(this, "Unexpected end of boolean literal", 0, null, 6);
        throw null;
    }
    
    public abstract String e();
    
    public abstract String f(final String p0, final boolean p1);
    
    public abstract byte g();
    
    public final byte h(final byte b) {
        final byte g = this.g();
        if (g == b) {
            return g;
        }
        this.q(b);
        throw null;
    }
    
    public abstract void i(final char p0);
    
    public final long j() {
        int u = this.u(this.v());
        final int length = this.s().length();
        boolean b = false;
        if (u >= length || u == -1) {
            p(this, "EOF", 0, null, 6);
            throw null;
        }
        boolean b2;
        if (this.s().charAt(u) == '\"') {
            if (++u == this.s().length()) {
                p(this, "EOF", 0, null, 6);
                throw null;
            }
            b2 = true;
        }
        else {
            b2 = false;
        }
        int n = u;
        long n2 = 0L;
        int i = 1;
        while (i != 0) {
            final char char1 = this.s().charAt(n);
            if (char1 == '-') {
                if (n != u) {
                    p(this, "Unexpected symbol '-' in numeric literal", 0, null, 6);
                    throw null;
                }
                ++n;
                b = true;
            }
            else {
                if (l0.H(char1) != 0) {
                    break;
                }
                final int n3 = n + 1;
                final boolean b3 = n3 != this.s().length();
                final int n4 = char1 - '0';
                if (n4 < 0 || n4 >= 10) {
                    p(this, b.h("Unexpected symbol '", char1, "' in numeric literal"), 0, null, 6);
                    throw null;
                }
                n2 = n2 * 10 - n4;
                if (n2 > 0L) {
                    p(this, "Numeric value overflow", 0, null, 6);
                    throw null;
                }
                i = (b3 ? 1 : 0);
                n = n3;
            }
        }
        if (u != n && (!b || u != n - 1)) {
            int a = n;
            if (b2) {
                if (i == 0) {
                    p(this, "EOF", 0, null, 6);
                    throw null;
                }
                if (this.s().charAt(n) != '\"') {
                    p(this, "Expected closing quotation mark", 0, null, 6);
                    throw null;
                }
                a = n + 1;
            }
            this.a = a;
            if (!b) {
                if (n2 == Long.MIN_VALUE) {
                    p(this, "Numeric value overflow", 0, null, 6);
                    throw null;
                }
                n2 = -n2;
            }
            return n2;
        }
        p(this, "Expected numeric literal", 0, null, 6);
        throw null;
    }
    
    public final String k() {
        final String c = this.c;
        if (c != null) {
            e.c((Object)c);
            this.c = null;
            return c;
        }
        return this.e();
    }
    
    public final String l() {
        final String c = this.c;
        if (c != null) {
            e.c((Object)c);
            this.c = null;
            return c;
        }
        int a = this.v();
        if (a >= this.s().length() || a == -1) {
            p(this, "EOF", a, null, 4);
            throw null;
        }
        final byte h = l0.H(this.s().charAt(a));
        if (h == 1) {
            return this.k();
        }
        if (h == 0) {
            boolean b = false;
            while (l0.H(this.s().charAt(a)) == 0) {
                final int a2 = a + 1;
                if ((a = a2) >= this.s().length()) {
                    this.d.append(this.s(), this.a, a2);
                    a = this.u(a2);
                    if (a == -1) {
                        this.a = a2;
                        return this.n(0, 0);
                    }
                    b = true;
                }
            }
            String s;
            if (!b) {
                s = this.s().subSequence(this.a, a).toString();
            }
            else {
                s = this.n(this.a, a);
            }
            this.a = a;
            return s;
        }
        final StringBuilder t = a.t("Expected beginning of the string, but got ");
        t.append(this.s().charAt(a));
        p(this, t.toString(), 0, null, 6);
        throw null;
    }
    
    public final String m() {
        final String l = this.l();
        if (e.a((Object)l, (Object)"null")) {
            final String s = this.s();
            final int a = this.a;
            boolean b = true;
            if (s.charAt(a - 1) == '\"') {
                b = false;
            }
            if (b) {
                p(this, "Unexpected 'null' value instead of string literal", 0, null, 6);
                throw null;
            }
        }
        return l;
    }
    
    public final String n(final int n, final int n2) {
        this.d.append(this.s(), n, n2);
        final String string = this.d.toString();
        e.e((Object)string, "escapedString.toString()");
        this.d.setLength(0);
        return string;
    }
    
    public final void o(final int n, String string, String string2) {
        e.f((Object)string, "message");
        e.f((Object)string2, "hint");
        if (string2.length() == 0) {
            string2 = "";
        }
        else {
            final StringBuilder sb = new StringBuilder();
            sb.append('\n');
            sb.append(string2);
            string2 = sb.toString();
        }
        final StringBuilder q = android.support.v4.media.a.q(string, " at path: ");
        q.append(this.b.a());
        q.append(string2);
        string = q.toString();
        throw kotlinx.coroutines.channels.a.f(this.s(), n, string);
    }
    
    public final void q(final byte b) {
        String s;
        if (b == 1) {
            s = "quotation mark '\"'";
        }
        else if (b == 4) {
            s = "comma ','";
        }
        else if (b == 5) {
            s = "colon ':'";
        }
        else if (b == 6) {
            s = "start of the object '{'";
        }
        else if (b == 7) {
            s = "end of the object '}'";
        }
        else if (b == 8) {
            s = "start of the array '['";
        }
        else if (b == 9) {
            s = "end of the array ']'";
        }
        else {
            s = "valid token";
        }
        String value;
        if (this.a != this.s().length() && this.a > 0) {
            value = String.valueOf(this.s().charAt(this.a - 1));
        }
        else {
            value = "EOF";
        }
        p(this, a.o("Expected ", s, ", but had '", value, "' instead"), this.a - 1, null, 4);
        throw null;
    }
    
    public final int r(int n, final CharSequence charSequence) {
        final char char1 = charSequence.charAt(n);
        final int n2 = 1;
        if ('0' <= char1 && char1 < ':') {
            n = 1;
        }
        else {
            n = 0;
        }
        if (n != 0) {
            n = char1 - '0';
        }
        else {
            final int n3 = 97;
            if ('a' <= char1 && char1 < 'g') {
                n = 1;
            }
            else {
                n = 0;
            }
            if (n != 0) {
                n = n3;
            }
            else {
                final int n4 = 65;
                if ('A' <= char1 && char1 < 'G') {
                    n = n2;
                }
                else {
                    n = 0;
                }
                if (n == 0) {
                    p(this, b.h("Invalid toHexChar char '", char1, "' in unicode escape"), 0, null, 6);
                    throw null;
                }
                n = n4;
            }
            n = char1 - n + 10;
        }
        return n;
    }
    
    public abstract String s();
    
    public final byte t() {
        final String s = this.s();
        int n = this.a;
        while (true) {
            n = this.u(n);
            if (n == -1) {
                this.a = n;
                return 10;
            }
            final char char1 = s.charAt(n);
            if (char1 != ' ' && char1 != '\n' && char1 != '\r' && char1 != '\t') {
                this.a = n;
                return l0.H(char1);
            }
            ++n;
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("JsonReader(source='");
        t.append((Object)this.s());
        t.append("', currentPosition=");
        return d.j(t, this.a, ')');
    }
    
    public abstract int u(final int p0);
    
    public abstract int v();
    
    public abstract boolean w();
    
    public final boolean x() {
        final int u = this.u(this.v());
        final int n = this.s().length() - u;
        if (n < 4 || u == -1) {
            return true;
        }
        for (int i = 0; i < 4; ++i) {
            if ("null".charAt(i) != this.s().charAt(u + i)) {
                return true;
            }
        }
        if (n > 4 && l0.H(this.s().charAt(u + 4)) == 0) {
            return true;
        }
        this.a = u + 4;
        return false;
    }
    
    public final void y(final char c) {
        final int a = this.a - 1;
        this.a = a;
        if (a >= 0 && c == '\"' && e.a((Object)this.l(), (Object)"null")) {
            this.o(this.a - 4, "Expected string literal but 'null' literal was found", "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw null;
        }
        this.q(l0.H(c));
        throw null;
    }
}
