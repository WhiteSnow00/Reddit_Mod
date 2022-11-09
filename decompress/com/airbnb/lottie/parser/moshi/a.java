// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.parser.moshi;

import rk2.g0;
import java.io.EOFException;
import java.io.IOException;
import rk2.b0;
import rk2.c;
import rk2.f;
import okio.ByteString;

public final class a extends JsonReader
{
    public static final ByteString q;
    public static final ByteString r;
    public static final ByteString s;
    public final f k;
    public final c l;
    public int m;
    public long n;
    public int o;
    public String p;
    
    static {
        q = ByteString.encodeUtf8("'\\");
        r = ByteString.encodeUtf8("\"\\");
        s = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
        ByteString.encodeUtf8("\n\r");
        ByteString.encodeUtf8("*/");
    }
    
    public a(final b0 k) {
        this.m = 0;
        this.k = (f)k;
        this.l = k.g;
        this.x(6);
    }
    
    public final void A() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n == 14) {
            long n2 = this.k.e(a.s);
            final c l = this.l;
            if (n2 == -1L) {
                n2 = l.g;
            }
            l.skip(n2);
        }
        else if (n == 13) {
            this.P(a.r);
        }
        else if (n == 12) {
            this.P(a.q);
        }
        else if (n != 15) {
            final StringBuilder k = a.k("Expected a name but was ");
            k.append(this.w());
            k.append(" at path ");
            k.append(this.s());
            throw new JsonDataException(k.toString());
        }
        this.m = 0;
        super.h[super.f - 1] = "null";
    }
    
    public final void D() throws IOException {
        this.B("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
    
    public final int F() throws IOException {
        final int[] g = super.g;
        final int f = super.f;
        final int n = g[f - 1];
        if (n == 1) {
            g[f - 1] = 2;
        }
        else if (n == 2) {
            final int k = this.K(true);
            this.l.readByte();
            if (k != 44) {
                if (k == 59) {
                    this.D();
                    throw null;
                }
                if (k == 93) {
                    return this.m = 4;
                }
                this.B("Unterminated array");
                throw null;
            }
        }
        else if (n != 3 && n != 5) {
            if (n == 4) {
                g[f - 1] = 5;
                final int i = this.K(true);
                this.l.readByte();
                if (i != 58) {
                    if (i != 61) {
                        this.B("Expected ':'");
                        throw null;
                    }
                    this.D();
                    throw null;
                }
            }
            else if (n == 6) {
                g[f - 1] = 7;
            }
            else if (n == 7) {
                if (this.K(false) == -1) {
                    return this.m = 18;
                }
                this.D();
                throw null;
            }
            else if (n == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        else {
            g[f - 1] = 4;
            if (n == 5) {
                final int j = this.K(true);
                this.l.readByte();
                if (j != 44) {
                    if (j == 59) {
                        this.D();
                        throw null;
                    }
                    if (j == 125) {
                        return this.m = 2;
                    }
                    this.B("Unterminated object");
                    throw null;
                }
            }
            final int l = this.K(true);
            if (l == 34) {
                this.l.readByte();
                return this.m = 13;
            }
            if (l == 39) {
                this.l.readByte();
                this.D();
                throw null;
            }
            if (l != 125) {
                this.D();
                throw null;
            }
            if (n != 5) {
                this.l.readByte();
                return this.m = 2;
            }
            this.B("Expected name");
            throw null;
        }
        final int m = this.K(true);
        if (m == 34) {
            this.l.readByte();
            return this.m = 9;
        }
        if (m == 39) {
            this.D();
            throw null;
        }
        if (m != 44 && m != 59) {
            if (m == 91) {
                this.l.readByte();
                return this.m = 3;
            }
            if (m != 93) {
                if (m == 123) {
                    this.l.readByte();
                    return this.m = 1;
                }
                final byte t = this.l.t(0L);
                int m2 = 0;
                Label_0482: {
                    String s;
                    String s2;
                    if (t != 116 && t != 84) {
                        if (t != 102 && t != 70) {
                            if (t != 110 && t != 78) {
                                m2 = 0;
                                break Label_0482;
                            }
                            s = "null";
                            s2 = "NULL";
                            m2 = 7;
                        }
                        else {
                            s = "false";
                            s2 = "FALSE";
                            m2 = 6;
                        }
                    }
                    else {
                        s = "true";
                        s2 = "TRUE";
                        m2 = 5;
                    }
                    final int length = s.length();
                    int n2 = 1;
                    while (true) {
                        while (n2 < length) {
                            final f k2 = this.k;
                            final int n3 = n2 + 1;
                            if (k2.request((long)n3)) {
                                final byte t2 = this.l.t((long)n2);
                                if (t2 == s.charAt(n2) || t2 == s2.charAt(n2)) {
                                    n2 = n3;
                                    continue;
                                }
                            }
                            m2 = 0;
                            break Label_0482;
                        }
                        if (this.k.request((long)(length + 1)) && this.J(this.l.t((long)length))) {
                            continue;
                        }
                        break;
                    }
                    this.l.skip((long)length);
                    this.m = m2;
                }
                if (m2 != 0) {
                    return m2;
                }
                int n4 = 1;
                int o = 0;
                int n5 = 0;
                long n6 = 0L;
                int n7 = 0;
                int n14 = 0;
                Label_0944: {
                    while (true) {
                        final f k3 = this.k;
                        final int n8 = o + 1;
                        int n13 = 0;
                        Label_0754: {
                            if (k3.request((long)n8)) {
                                final byte t3 = this.l.t((long)o);
                                int n12 = 0;
                                Label_0932: {
                                    if (t3 != 43) {
                                        if (t3 != 69 && t3 != 101) {
                                            if (t3 != 45) {
                                                if (t3 != 46) {
                                                    if (t3 >= 48 && t3 <= 57) {
                                                        long n9 = 0L;
                                                        int n11 = 0;
                                                        Label_0734: {
                                                            if (n5 != 1 && n5 != 0) {
                                                                if (n5 == 2) {
                                                                    if (n6 == 0L) {
                                                                        break;
                                                                    }
                                                                    n9 = 10L * n6 - (t3 - 48);
                                                                    final long n10 = lcmp(n6, -922337203685477580L);
                                                                    n11 = (((n10 > 0 || (n10 == 0 && n9 < n6)) ? 1 : 0) & n4);
                                                                    n12 = n5;
                                                                }
                                                                else {
                                                                    if (n5 == 3) {
                                                                        n12 = 4;
                                                                        break Label_0932;
                                                                    }
                                                                    if (n5 != 5) {
                                                                        n12 = n5;
                                                                        n11 = n4;
                                                                        n9 = n6;
                                                                        if (n5 != 6) {
                                                                            break Label_0734;
                                                                        }
                                                                    }
                                                                    n12 = 7;
                                                                    n11 = n4;
                                                                    n9 = n6;
                                                                }
                                                            }
                                                            else {
                                                                n9 = -(t3 - 48);
                                                                n12 = 2;
                                                                n11 = n4;
                                                            }
                                                        }
                                                        n4 = n11;
                                                        n6 = n9;
                                                        break Label_0932;
                                                    }
                                                    if (!this.J(t3)) {
                                                        n13 = 2;
                                                        break Label_0754;
                                                    }
                                                    break;
                                                }
                                                else {
                                                    if (n5 == 2) {
                                                        n12 = 3;
                                                        break Label_0932;
                                                    }
                                                    break;
                                                }
                                            }
                                            else {
                                                if (n5 == 0) {
                                                    n12 = (n7 = 1);
                                                    break Label_0932;
                                                }
                                                if (n5 != 5) {
                                                    break;
                                                }
                                            }
                                        }
                                        else {
                                            if (n5 == 2 || n5 == 4) {
                                                n12 = 5;
                                                break Label_0932;
                                            }
                                            break;
                                        }
                                    }
                                    else if (n5 != 5) {
                                        break;
                                    }
                                    n12 = 6;
                                }
                                o = n8;
                                n5 = n12;
                                continue;
                            }
                            n13 = 2;
                        }
                        if (n5 == n13) {
                            if (n4 && (n6 != Long.MIN_VALUE || n7 != 0) && (n6 != 0L || n7 == 0)) {
                                if (n7 == 0) {
                                    n6 = -n6;
                                }
                                this.n = n6;
                                this.l.skip((long)o);
                                n14 = 16;
                                this.m = 16;
                                break Label_0944;
                            }
                            n13 = 2;
                        }
                        if (n5 == n13 || n5 == 4 || n5 == 7) {
                            this.o = o;
                            n14 = 17;
                            this.m = 17;
                            break Label_0944;
                        }
                        break;
                    }
                    n14 = 0;
                }
                if (n14 != 0) {
                    return n14;
                }
                if (!this.J(this.l.t(0L))) {
                    this.B("Expected value");
                    throw null;
                }
                this.D();
                throw null;
            }
            else if (n == 1) {
                this.l.readByte();
                return this.m = 4;
            }
        }
        if (n != 1 && n != 2) {
            this.B("Unexpected value");
            throw null;
        }
        this.D();
        throw null;
    }
    
    public final String G1() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        String s;
        if (n == 14) {
            s = this.N();
        }
        else if (n == 13) {
            s = this.L(a.r);
        }
        else if (n == 12) {
            s = this.L(a.q);
        }
        else {
            if (n != 15) {
                final StringBuilder k = a.k("Expected a name but was ");
                k.append(this.w());
                k.append(" at path ");
                k.append(this.s());
                throw new JsonDataException(k.toString());
            }
            s = this.p;
        }
        this.m = 0;
        return super.h[super.f - 1] = s;
    }
    
    public final int H(final String s, final JsonReader$a jsonReader$a) {
        for (int length = jsonReader$a.a.length, i = 0; i < length; ++i) {
            if (s.equals(jsonReader$a.a[i])) {
                this.m = 0;
                super.h[super.f - 1] = s;
                return i;
            }
        }
        return -1;
    }
    
    public final boolean J(final int n) throws IOException {
        if (n != 9 && n != 10 && n != 12 && n != 13 && n != 32) {
            if (n != 35) {
                if (n == 44) {
                    return false;
                }
                if (n != 47 && n != 61) {
                    if (n == 123 || n == 125 || n == 58) {
                        return false;
                    }
                    if (n != 59) {
                        switch (n) {
                            default: {
                                return true;
                            }
                            case 92: {
                                break;
                            }
                            case 91:
                            case 93: {
                                return false;
                            }
                        }
                    }
                }
            }
            this.D();
            throw null;
        }
        return false;
    }
    
    public final int K(final boolean b) throws IOException {
        int n = 0;
        while (true) {
            final f k = this.k;
            final int n2 = n + 1;
            if (k.request((long)n2)) {
                final byte t = this.l.t((long)n);
                if (t != 10 && t != 32 && t != 13 && t != 9) {
                    this.l.skip((long)(n2 - 1));
                    if (t == 47) {
                        if (!this.k.request(2L)) {
                            return t;
                        }
                        this.D();
                        throw null;
                    }
                    else {
                        if (t != 35) {
                            return t;
                        }
                        this.D();
                        throw null;
                    }
                }
                else {
                    n = n2;
                }
            }
            else {
                if (!b) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }
    
    public final String L(final ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            final long e = this.k.e(byteString);
            if (e == -1L) {
                this.B("Unterminated string");
                throw null;
            }
            if (this.l.t(e) == 92) {
                StringBuilder sb2;
                if ((sb2 = sb) == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.l.H(e));
                this.l.readByte();
                sb2.append(this.O());
                sb = sb2;
            }
            else {
                if (sb == null) {
                    final String h = this.l.H(e);
                    this.l.readByte();
                    return h;
                }
                sb.append(this.l.H(e));
                this.l.readByte();
                return sb.toString();
            }
        }
    }
    
    public final String N() throws IOException {
        final long e = this.k.e(a.s);
        String s;
        if (e != -1L) {
            s = this.l.H(e);
        }
        else {
            s = this.l.F();
        }
        return s;
    }
    
    public final char O() throws IOException {
        if (!this.k.request(1L)) {
            this.B("Unterminated escape sequence");
            throw null;
        }
        final byte byte1 = this.l.readByte();
        if (byte1 == 10 || byte1 == 34 || byte1 == 39 || byte1 == 47 || byte1 == 92) {
            return (char)byte1;
        }
        if (byte1 == 98) {
            return '\b';
        }
        if (byte1 == 102) {
            return '\f';
        }
        if (byte1 == 110) {
            return '\n';
        }
        if (byte1 == 114) {
            return '\r';
        }
        if (byte1 == 116) {
            return '\t';
        }
        if (byte1 != 117) {
            final StringBuilder k = a.k("Invalid escape sequence: \\");
            k.append((char)byte1);
            this.B(k.toString());
            throw null;
        }
        if (this.k.request(4L)) {
            int i = 0;
            char c = '\0';
            while (i < 4) {
                int t = this.l.t((long)i);
                final char c2 = (char)(c << 4);
                if (t >= 48 && t <= 57) {
                    t -= 48;
                }
                else {
                    if (t >= 97 && t <= 102) {
                        t -= 97;
                    }
                    else {
                        if (t < 65 || t > 70) {
                            final StringBuilder j = a.k("\\u");
                            j.append(this.l.H(4L));
                            this.B(j.toString());
                            throw null;
                        }
                        t -= 65;
                    }
                    t += 10;
                }
                final char c3 = (char)(t + c2);
                ++i;
                c = c3;
            }
            this.l.skip(4L);
            return c;
        }
        final StringBuilder l = a.k("Unterminated escape sequence at path ");
        l.append(this.s());
        throw new EOFException(l.toString());
    }
    
    public final boolean O1() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n == 5) {
            this.m = 0;
            final int[] i = super.i;
            final int n2 = super.f - 1;
            ++i[n2];
            return true;
        }
        if (n == 6) {
            this.m = 0;
            final int[] j = super.i;
            final int n3 = super.f - 1;
            ++j[n3];
            return false;
        }
        final StringBuilder k = a.k("Expected a boolean but was ");
        k.append(this.w());
        k.append(" at path ");
        k.append(this.s());
        throw new JsonDataException(k.toString());
    }
    
    public final void P(final ByteString byteString) throws IOException {
        while (true) {
            final long e = this.k.e(byteString);
            if (e == -1L) {
                this.B("Unterminated string");
                throw null;
            }
            if (this.l.t(e) != 92) {
                this.l.skip(e + 1L);
                return;
            }
            this.l.skip(e + 1L);
            this.O();
        }
    }
    
    public final String Q1() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        String s;
        if (n == 10) {
            s = this.N();
        }
        else if (n == 9) {
            s = this.L(a.r);
        }
        else if (n == 8) {
            s = this.L(a.q);
        }
        else if (n == 11) {
            s = this.p;
            this.p = null;
        }
        else if (n == 16) {
            s = Long.toString(this.n);
        }
        else {
            if (n != 17) {
                final StringBuilder k = a.k("Expected a string but was ");
                k.append(this.w());
                k.append(" at path ");
                k.append(this.s());
                throw new JsonDataException(k.toString());
            }
            s = this.l.H((long)this.o);
        }
        this.m = 0;
        final int[] i = super.i;
        final int n2 = super.f - 1;
        ++i[n2];
        return s;
    }
    
    public final void b() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n == 3) {
            this.x(1);
            super.i[super.f - 1] = 0;
            this.m = 0;
            return;
        }
        final StringBuilder k = a.k("Expected BEGIN_ARRAY but was ");
        k.append(this.w());
        k.append(" at path ");
        k.append(this.s());
        throw new JsonDataException(k.toString());
    }
    
    public final void close() throws IOException {
        this.m = 0;
        super.g[0] = 8;
        super.f = 1;
        this.l.h();
        ((g0)this.k).close();
    }
    
    public final void h() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n == 1) {
            this.x(3);
            this.m = 0;
            return;
        }
        final StringBuilder k = a.k("Expected BEGIN_OBJECT but was ");
        k.append(this.w());
        k.append(" at path ");
        k.append(this.s());
        throw new JsonDataException(k.toString());
    }
    
    public final boolean hasNext() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        return n != 2 && n != 4 && n != 18;
    }
    
    public final void q() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n == 4) {
            int f = super.f - 1;
            super.f = f;
            final int[] i = super.i;
            --f;
            ++i[f];
            this.m = 0;
            return;
        }
        final StringBuilder k = a.k("Expected END_ARRAY but was ");
        k.append(this.w());
        k.append(" at path ");
        k.append(this.s());
        throw new JsonDataException(k.toString());
    }
    
    public final void r() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n == 2) {
            int f = super.f - 1;
            super.f = f;
            super.h[f] = null;
            final int[] i = super.i;
            --f;
            ++i[f];
            this.m = 0;
            return;
        }
        final StringBuilder k = a.k("Expected END_OBJECT but was ");
        k.append(this.w());
        k.append(" at path ");
        k.append(this.s());
        throw new JsonDataException(k.toString());
    }
    
    public final double t() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n == 16) {
            this.m = 0;
            final int[] i = super.i;
            final int n2 = super.f - 1;
            ++i[n2];
            return (double)this.n;
        }
        Label_0301: {
            if (n == 17) {
                this.p = this.l.H((long)this.o);
            }
            else if (n == 9) {
                this.p = this.L(a.r);
            }
            else if (n == 8) {
                this.p = this.L(a.q);
            }
            else if (n == 10) {
                this.p = this.N();
            }
            else if (n != 11) {
                break Label_0301;
            }
            this.m = 11;
            try {
                final double double1 = Double.parseDouble(this.p);
                if (!Double.isNaN(double1) && !Double.isInfinite(double1)) {
                    this.p = null;
                    this.m = 0;
                    final int[] j = super.i;
                    final int n3 = super.f - 1;
                    ++j[n3];
                    return double1;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("JSON forbids NaN and infinities: ");
                sb.append(double1);
                sb.append(" at path ");
                sb.append(this.s());
                throw new JsonEncodingException(sb.toString());
            }
            catch (final NumberFormatException ex) {
                final StringBuilder k = a.k("Expected a double but was ");
                k.append(this.p);
                k.append(" at path ");
                k.append(this.s());
                throw new JsonDataException(k.toString());
            }
        }
        final StringBuilder l = a.k("Expected a double but was ");
        l.append(this.w());
        l.append(" at path ");
        l.append(this.s());
        throw new JsonDataException(l.toString());
    }
    
    public final String toString() {
        final StringBuilder k = a.k("JsonReader(");
        k.append(this.k);
        k.append(")");
        return k.toString();
    }
    
    public final int v() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n == 16) {
            final long n2 = this.n;
            final int n3 = (int)n2;
            if (n2 == n3) {
                this.m = 0;
                final int[] i = super.i;
                final int n4 = super.f - 1;
                ++i[n4];
                return n3;
            }
            final StringBuilder k = a.k("Expected an int but was ");
            k.append(this.n);
            k.append(" at path ");
            k.append(this.s());
            throw new JsonDataException(k.toString());
        }
        else {
            while (true) {
                if (n == 17) {
                    this.p = this.l.H((long)this.o);
                    break Label_0283;
                }
                String p;
                if (n != 9 && n != 8) {
                    if (n == 11) {
                        break Label_0283;
                    }
                    final StringBuilder j = a.k("Expected an int but was ");
                    j.append(this.w());
                    j.append(" at path ");
                    j.append(this.s());
                    throw new JsonDataException(j.toString());
                }
                else if (n == 9) {
                    p = this.L(a.r);
                }
                else {
                    p = this.L(a.q);
                }
                this.p = p;
                try {
                    final int int1 = Integer.parseInt(p);
                    this.m = 0;
                    final int[] l = super.i;
                    final int n5 = super.f - 1;
                    ++l[n5];
                    return int1;
                    this.m = 11;
                    try {
                        final double double1 = Double.parseDouble(this.p);
                        final int n6 = (int)double1;
                        if (n6 == double1) {
                            this.p = null;
                            this.m = 0;
                            final int[] m = super.i;
                            final int n7 = super.f - 1;
                            ++m[n7];
                            return n6;
                        }
                        final StringBuilder k2 = a.k("Expected an int but was ");
                        k2.append(this.p);
                        k2.append(" at path ");
                        k2.append(this.s());
                        throw new JsonDataException(k2.toString());
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder k3 = a.k("Expected an int but was ");
                        k3.append(this.p);
                        k3.append(" at path ");
                        k3.append(this.s());
                        throw new JsonDataException(k3.toString());
                    }
                }
                catch (final NumberFormatException ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final JsonReader$Token w() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 18: {
                return JsonReader$Token.END_DOCUMENT;
            }
            case 16:
            case 17: {
                return JsonReader$Token.NUMBER;
            }
            case 12:
            case 13:
            case 14:
            case 15: {
                return JsonReader$Token.NAME;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                return JsonReader$Token.STRING;
            }
            case 7: {
                return JsonReader$Token.NULL;
            }
            case 5:
            case 6: {
                return JsonReader$Token.BOOLEAN;
            }
            case 4: {
                return JsonReader$Token.END_ARRAY;
            }
            case 3: {
                return JsonReader$Token.BEGIN_ARRAY;
            }
            case 2: {
                return JsonReader$Token.END_OBJECT;
            }
            case 1: {
                return JsonReader$Token.BEGIN_OBJECT;
            }
        }
    }
    
    public final int y(final JsonReader$a jsonReader$a) throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.F();
        }
        if (n < 12 || n > 15) {
            return -1;
        }
        if (n == 15) {
            return this.H(this.p, jsonReader$a);
        }
        final int i1 = this.k.I1(jsonReader$a.b);
        if (i1 != -1) {
            this.m = 0;
            super.h[super.f - 1] = jsonReader$a.a[i1];
            return i1;
        }
        final String s = super.h[super.f - 1];
        final String g1 = this.G1();
        final int h = this.H(g1, jsonReader$a);
        if (h == -1) {
            this.m = 15;
            this.p = g1;
            super.h[super.f - 1] = s;
        }
        return h;
    }
    
    public final void z1() throws IOException {
        int n = 0;
        int i = 0;
        do {
            int n2;
            if ((n2 = this.m) == 0) {
                n2 = this.F();
            }
            Label_0398: {
                if (n2 == 3) {
                    this.x(1);
                }
                else if (n2 == 1) {
                    this.x(3);
                }
                else if (n2 == 4) {
                    i = n - 1;
                    if (i >= 0) {
                        --super.f;
                        break Label_0398;
                    }
                    final StringBuilder k = a.k("Expected a value but was ");
                    k.append(this.w());
                    k.append(" at path ");
                    k.append(this.s());
                    throw new JsonDataException(k.toString());
                }
                else if (n2 == 2) {
                    i = n - 1;
                    if (i >= 0) {
                        --super.f;
                        break Label_0398;
                    }
                    final StringBuilder j = a.k("Expected a value but was ");
                    j.append(this.w());
                    j.append(" at path ");
                    j.append(this.s());
                    throw new JsonDataException(j.toString());
                }
                else {
                    if (n2 == 14 || n2 == 10) {
                        long n3 = this.k.e(a.s);
                        final c l = this.l;
                        if (n3 == -1L) {
                            n3 = l.g;
                        }
                        l.skip(n3);
                        i = n;
                        break Label_0398;
                    }
                    if (n2 == 9 || n2 == 13) {
                        this.P(a.r);
                        i = n;
                        break Label_0398;
                    }
                    if (n2 == 8 || n2 == 12) {
                        this.P(a.q);
                        i = n;
                        break Label_0398;
                    }
                    if (n2 == 17) {
                        this.l.skip((long)this.o);
                        i = n;
                        break Label_0398;
                    }
                    if (n2 != 18) {
                        i = n;
                        break Label_0398;
                    }
                    final StringBuilder m = a.k("Expected a value but was ");
                    m.append(this.w());
                    m.append(" at path ");
                    m.append(this.s());
                    throw new JsonDataException(m.toString());
                }
                i = n + 1;
            }
            this.m = 0;
            n = i;
        } while (i != 0);
        final int[] i2 = super.i;
        final int f = super.f;
        final int n4 = f - 1;
        ++i2[n4];
        super.h[f - 1] = "null";
    }
}
