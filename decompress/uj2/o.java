// 
// Decompiled by Procyon v0.6.0
// 

package uj2;

import kotlin.text.b;
import sg2.e;

public final class o extends a
{
    public final String e;
    
    public o(final String e) {
        sg2.e.f((Object)e, "source");
        this.e = e;
    }
    
    public final boolean b() {
        final int a = super.a;
        final int n = 0;
        int i = a;
        if (a == -1) {
            return false;
        }
        while (i < this.e.length()) {
            final char char1 = this.e.charAt(i);
            if (char1 != ' ' && char1 != '\n' && char1 != '\r' && char1 != '\t') {
                super.a = i;
                boolean b = false;
                Label_0090: {
                    if (char1 != '}') {
                        if (char1 != ']') {
                            b = false;
                            break Label_0090;
                        }
                    }
                    b = true;
                }
                boolean b2 = false;
                Label_0110: {
                    if (!b) {
                        if (char1 != ':') {
                            b2 = false;
                            break Label_0110;
                        }
                    }
                    b2 = true;
                }
                if (!b2) {
                    final int n2 = n;
                    if (char1 != ',') {
                        return (n2 ^ 0x1) != 0x0;
                    }
                }
                final int n2 = 1;
                return (n2 ^ 0x1) != 0x0;
            }
            ++i;
        }
        super.a = i;
        return false;
    }
    
    public final String e() {
        this.i('\"');
        final int a = super.a;
        final int y0 = b.Y0((CharSequence)this.e, '\"', a, false, 4);
        if (y0 != -1) {
            for (int i = a; i < y0; ++i) {
                if (this.e.charAt(i) == '\\') {
                    final String e = this.e;
                    int a2 = super.a;
                    sg2.e.f((Object)e, "source");
                    int j = e.charAt(i);
                    int n = 0;
                    while (j != 34) {
                        int n4 = 0;
                        Label_0355: {
                            int n2;
                            if (j == 92) {
                                super.d.append(this.s(), a2, i);
                                final int u = this.u(i + 1);
                                if (u == -1) {
                                    uj2.a.p((a)this, "Expected escape sequence to continue, got EOF", 0, (String)null, 6);
                                    throw null;
                                }
                                final String e2 = this.e;
                                int a3 = u + 1;
                                final char char1 = e2.charAt(u);
                                if (char1 == 'u') {
                                    a3 = this.a(a3, (CharSequence)this.e);
                                }
                                else {
                                    char c;
                                    if (char1 < 'u') {
                                        c = d.a[char1];
                                    }
                                    else {
                                        c = '\0';
                                    }
                                    if (c == '\0') {
                                        final StringBuilder sb = new StringBuilder();
                                        sb.append("Invalid escaped char '");
                                        sb.append(char1);
                                        sb.append('\'');
                                        uj2.a.p((a)this, sb.toString(), 0, (String)null, 6);
                                        throw null;
                                    }
                                    super.d.append(c);
                                }
                                n2 = this.u(a3);
                                if (n2 == -1) {
                                    uj2.a.p((a)this, "EOF", n2, (String)null, 4);
                                    throw null;
                                }
                            }
                            else {
                                final int n3 = i + 1;
                                n4 = a2;
                                if ((i = n3) < e.length()) {
                                    break Label_0355;
                                }
                                super.d.append(this.s(), a2, n3);
                                n2 = this.u(n3);
                                if (n2 == -1) {
                                    uj2.a.p((a)this, "EOF", n2, (String)null, 4);
                                    throw null;
                                }
                            }
                            final int n5 = n2;
                            final int n6 = 1;
                            n4 = n2;
                            i = n5;
                            n = n6;
                        }
                        final char char2 = e.charAt(i);
                        a2 = n4;
                        j = char2;
                    }
                    String s;
                    if (n == 0) {
                        s = this.s().subSequence(a2, i).toString();
                    }
                    else {
                        s = this.n(a2, i);
                    }
                    super.a = i + 1;
                    return s;
                }
            }
            super.a = y0 + 1;
            final String substring = this.e.substring(a, y0);
            sg2.e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
            return substring;
        }
        this.q((byte)1);
        throw null;
    }
    
    public final String f(String s, final boolean b) {
        sg2.e.f((Object)s, "keyToMatch");
        final int a = super.a;
        try {
            if (this.g() != 6) {
                return null;
            }
            String s2;
            if (b) {
                s2 = this.e();
            }
            else {
                s2 = this.m();
            }
            if (!sg2.e.a((Object)s2, (Object)s)) {
                return null;
            }
            if (this.g() != 5) {
                return null;
            }
            if (b) {
                s = this.k();
            }
            else {
                s = this.m();
            }
            return s;
        }
        finally {
            super.a = a;
        }
    }
    
    public final byte g() {
        final String e = this.e;
        byte w;
        do {
            final int a = super.a;
            if (a == -1 || a >= e.length()) {
                return 10;
            }
            w = vl.a.w(e.charAt(super.a++));
        } while (w == 3);
        return w;
    }
    
    public final void i(final char c) {
        if (super.a != -1) {
            final String e = this.e;
            while (super.a < e.length()) {
                final char char1 = e.charAt(super.a++);
                if (char1 != ' ' && char1 != '\n' && char1 != '\r') {
                    if (char1 == '\t') {
                        continue;
                    }
                    if (char1 == c) {
                        return;
                    }
                    this.y(c);
                    throw null;
                }
            }
            this.y(c);
            throw null;
        }
        this.y(c);
        throw null;
    }
    
    public final String s() {
        return this.e;
    }
    
    public final int u(int n) {
        if (n >= this.e.length()) {
            n = -1;
        }
        return n;
    }
    
    public final int v() {
        int i;
        final int n = i = super.a;
        if (n == -1) {
            return n;
        }
        while (i < this.e.length()) {
            final char char1 = this.e.charAt(i);
            if (char1 != ' ' && char1 != '\n' && char1 != '\r' && char1 != '\t') {
                break;
            }
            ++i;
        }
        return super.a = i;
    }
    
    public final boolean w() {
        final int v = this.v();
        if (v != this.e.length()) {
            if (v != -1) {
                if (this.e.charAt(v) == ',') {
                    ++super.a;
                    return true;
                }
            }
        }
        return false;
    }
}
