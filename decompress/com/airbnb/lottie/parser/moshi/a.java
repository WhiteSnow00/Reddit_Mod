// 
// Decompiled by Procyon v0.6.0
// 

package com.airbnb.lottie.parser.moshi;

import fk2.g0;
import java.io.EOFException;
import java.io.IOException;
import fk2.b0;
import fk2.c;
import fk2.f;
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
        this.w(6);
    }
    
    public final void B() throws IOException {
        this.A("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }
    
    public final int E() throws IOException {
        final int[] g = super.g;
        final int f = super.f;
        final int n = g[f - 1];
        if (n == 1) {
            g[f - 1] = 2;
        }
        else if (n == 2) {
            final int i = this.I(true);
            this.l.readByte();
            if (i != 44) {
                if (i == 59) {
                    this.B();
                    throw null;
                }
                if (i == 93) {
                    return this.m = 4;
                }
                this.A("Unterminated array");
                throw null;
            }
        }
        else if (n != 3 && n != 5) {
            if (n == 4) {
                g[f - 1] = 5;
                final int j = this.I(true);
                this.l.readByte();
                if (j != 58) {
                    if (j != 61) {
                        this.A("Expected ':'");
                        throw null;
                    }
                    this.B();
                    throw null;
                }
            }
            else if (n == 6) {
                g[f - 1] = 7;
            }
            else if (n == 7) {
                if (this.I(false) == -1) {
                    return this.m = 18;
                }
                this.B();
                throw null;
            }
            else if (n == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        else {
            g[f - 1] = 4;
            if (n == 5) {
                final int k = this.I(true);
                this.l.readByte();
                if (k != 44) {
                    if (k == 59) {
                        this.B();
                        throw null;
                    }
                    if (k == 125) {
                        return this.m = 2;
                    }
                    this.A("Unterminated object");
                    throw null;
                }
            }
            final int l = this.I(true);
            if (l == 34) {
                this.l.readByte();
                return this.m = 13;
            }
            if (l == 39) {
                this.l.readByte();
                this.B();
                throw null;
            }
            if (l != 125) {
                this.B();
                throw null;
            }
            if (n != 5) {
                this.l.readByte();
                return this.m = 2;
            }
            this.A("Expected name");
            throw null;
        }
        final int m = this.I(true);
        if (m == 34) {
            this.l.readByte();
            return this.m = 9;
        }
        if (m == 39) {
            this.B();
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
                final byte s = this.l.s(0L);
                int m2 = 0;
                Label_0489: {
                    String s2;
                    String s3;
                    if (s != 116 && s != 84) {
                        if (s != 102 && s != 70) {
                            if (s != 110 && s != 78) {
                                m2 = 0;
                                break Label_0489;
                            }
                            s2 = "null";
                            s3 = "NULL";
                            m2 = 7;
                        }
                        else {
                            s2 = "false";
                            s3 = "FALSE";
                            m2 = 6;
                        }
                    }
                    else {
                        s2 = "true";
                        s3 = "TRUE";
                        m2 = 5;
                    }
                    final int length = s2.length();
                    int n2 = 1;
                    while (true) {
                        while (n2 < length) {
                            final f k2 = this.k;
                            final int n3 = n2 + 1;
                            if (k2.request((long)n3)) {
                                final byte s4 = this.l.s((long)n2);
                                if (s4 == s2.charAt(n2) || s4 == s3.charAt(n2)) {
                                    n2 = n3;
                                    continue;
                                }
                            }
                            m2 = 0;
                            break Label_0489;
                        }
                        if (this.k.request((long)(length + 1)) && this.H(this.l.s((long)length))) {
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
                int n13 = 0;
                Label_0931: {
                    while (true) {
                        final f k3 = this.k;
                        final int n8 = o + 1;
                        Label_0750: {
                            if (k3.request((long)n8)) {
                                final byte s5 = this.l.s((long)o);
                                int n12 = 0;
                                Label_0920: {
                                    if (s5 != 43) {
                                        if (s5 != 69 && s5 != 101) {
                                            if (s5 != 45) {
                                                if (s5 != 46) {
                                                    if (s5 >= 48 && s5 <= 57) {
                                                        long n9 = 0L;
                                                        int n11 = 0;
                                                        Label_0732: {
                                                            if (n5 != 1 && n5 != 0) {
                                                                if (n5 == 2) {
                                                                    if (n6 == 0L) {
                                                                        break;
                                                                    }
                                                                    n9 = 10L * n6 - (s5 - 48);
                                                                    final long n10 = lcmp(n6, -922337203685477580L);
                                                                    n11 = (((n10 > 0 || (n10 == 0 && n9 < n6)) ? 1 : 0) & n4);
                                                                    n12 = n5;
                                                                }
                                                                else {
                                                                    if (n5 == 3) {
                                                                        n12 = 4;
                                                                        break Label_0920;
                                                                    }
                                                                    if (n5 != 5) {
                                                                        n12 = n5;
                                                                        n11 = n4;
                                                                        n9 = n6;
                                                                        if (n5 != 6) {
                                                                            break Label_0732;
                                                                        }
                                                                    }
                                                                    n12 = 7;
                                                                    n11 = n4;
                                                                    n9 = n6;
                                                                }
                                                            }
                                                            else {
                                                                n9 = -(s5 - 48);
                                                                n12 = 2;
                                                                n11 = n4;
                                                            }
                                                        }
                                                        n4 = n11;
                                                        n6 = n9;
                                                        break Label_0920;
                                                    }
                                                    if (!this.H(s5)) {
                                                        break Label_0750;
                                                    }
                                                    break;
                                                }
                                                else {
                                                    if (n5 == 2) {
                                                        n12 = 3;
                                                        break Label_0920;
                                                    }
                                                    break;
                                                }
                                            }
                                            else {
                                                if (n5 == 0) {
                                                    n12 = 1;
                                                    n7 = 1;
                                                    break Label_0920;
                                                }
                                                if (n5 != 5) {
                                                    break;
                                                }
                                            }
                                        }
                                        else {
                                            if (n5 == 2 || n5 == 4) {
                                                n12 = 5;
                                                break Label_0920;
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
                        }
                        int n14;
                        if (n5 == 2) {
                            if (n4 && (n6 != Long.MIN_VALUE || n7 != 0) && (n6 != 0L || n7 == 0)) {
                                if (n7 == 0) {
                                    n6 = -n6;
                                }
                                this.n = n6;
                                this.l.skip((long)o);
                                n13 = 16;
                                this.m = 16;
                                break Label_0931;
                            }
                            n14 = 2;
                        }
                        else {
                            n14 = 2;
                        }
                        if (n5 == n14 || n5 == 4 || n5 == 7) {
                            this.o = o;
                            n13 = 17;
                            this.m = 17;
                            break Label_0931;
                        }
                        break;
                    }
                    n13 = 0;
                }
                if (n13 != 0) {
                    return n13;
                }
                if (!this.H(this.l.s(0L))) {
                    this.A("Expected value");
                    throw null;
                }
                this.B();
                throw null;
            }
            else if (n == 1) {
                this.l.readByte();
                return this.m = 4;
            }
        }
        if (n != 1 && n != 2) {
            this.A("Unexpected value");
            throw null;
        }
        this.B();
        throw null;
    }
    
    public final int F(final String s, final JsonReader$a jsonReader$a) {
        for (int length = jsonReader$a.a.length, i = 0; i < length; ++i) {
            if (s.equals(jsonReader$a.a[i])) {
                this.m = 0;
                super.h[super.f - 1] = s;
                return i;
            }
        }
        return -1;
    }
    
    public final void G1() throws IOException {
        int n = 0;
        int i = 0;
        do {
            int n2;
            if ((n2 = this.m) == 0) {
                n2 = this.E();
            }
            Label_0395: {
                if (n2 == 3) {
                    this.w(1);
                }
                else if (n2 == 1) {
                    this.w(3);
                }
                else if (n2 == 4) {
                    i = n - 1;
                    if (i >= 0) {
                        --super.f;
                        break Label_0395;
                    }
                    final StringBuilder t = a.t("Expected a value but was ");
                    t.append(this.v());
                    t.append(" at path ");
                    t.append(this.T0());
                    throw new JsonDataException(t.toString());
                }
                else if (n2 == 2) {
                    i = n - 1;
                    if (i >= 0) {
                        --super.f;
                        break Label_0395;
                    }
                    final StringBuilder t2 = a.t("Expected a value but was ");
                    t2.append(this.v());
                    t2.append(" at path ");
                    t2.append(this.T0());
                    throw new JsonDataException(t2.toString());
                }
                else {
                    if (n2 == 14 || n2 == 10) {
                        long n3 = this.k.k1(a.s);
                        final c l = this.l;
                        if (n3 == -1L) {
                            n3 = l.g;
                        }
                        l.skip(n3);
                        i = n;
                        break Label_0395;
                    }
                    if (n2 == 9 || n2 == 13) {
                        this.P(a.r);
                        i = n;
                        break Label_0395;
                    }
                    if (n2 == 8 || n2 == 12) {
                        this.P(a.q);
                        i = n;
                        break Label_0395;
                    }
                    if (n2 == 17) {
                        this.l.skip((long)this.o);
                        i = n;
                        break Label_0395;
                    }
                    if (n2 != 18) {
                        i = n;
                        break Label_0395;
                    }
                    final StringBuilder t3 = a.t("Expected a value but was ");
                    t3.append(this.v());
                    t3.append(" at path ");
                    t3.append(this.T0());
                    throw new JsonDataException(t3.toString());
                }
                i = n + 1;
            }
            this.m = 0;
            n = i;
        } while (i != 0);
        final int[] j = super.i;
        final int f = super.f;
        final int n4 = f - 1;
        ++j[n4];
        super.h[f - 1] = "null";
    }
    
    public final boolean H(final int n) throws IOException {
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
            this.B();
            throw null;
        }
        return false;
    }
    
    public final int I(final boolean b) throws IOException {
        int n = 0;
        while (true) {
            final f k = this.k;
            final int n2 = n + 1;
            if (k.request((long)n2)) {
                final byte s = this.l.s((long)n);
                if (s != 10 && s != 32 && s != 13 && s != 9) {
                    this.l.skip((long)(n2 - 1));
                    if (s == 47) {
                        if (!this.k.request(2L)) {
                            return s;
                        }
                        this.B();
                        throw null;
                    }
                    else {
                        if (s != 35) {
                            return s;
                        }
                        this.B();
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
    
    public final String J(final ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            final long k1 = this.k.k1(byteString);
            if (k1 == -1L) {
                this.A("Unterminated string");
                throw null;
            }
            if (this.l.s(k1) == 92) {
                StringBuilder sb2;
                if ((sb2 = sb) == null) {
                    sb2 = new StringBuilder();
                }
                sb2.append(this.l.F(k1));
                this.l.readByte();
                sb2.append(this.O());
                sb = sb2;
            }
            else {
                if (sb == null) {
                    final String f = this.l.F(k1);
                    this.l.readByte();
                    return f;
                }
                sb.append(this.l.F(k1));
                this.l.readByte();
                return sb.toString();
            }
        }
    }
    
    public final String M() throws IOException {
        final long k1 = this.k.k1(a.s);
        String s;
        if (k1 != -1L) {
            s = this.l.F(k1);
        }
        else {
            s = this.l.E();
        }
        return s;
    }
    
    public final String N1() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
        }
        String s;
        if (n == 14) {
            s = this.M();
        }
        else if (n == 13) {
            s = this.J(a.r);
        }
        else if (n == 12) {
            s = this.J(a.q);
        }
        else {
            if (n != 15) {
                final StringBuilder t = a.t("Expected a name but was ");
                t.append(this.v());
                t.append(" at path ");
                t.append(this.T0());
                throw new JsonDataException(t.toString());
            }
            s = this.p;
        }
        this.m = 0;
        return super.h[super.f - 1] = s;
    }
    
    public final char O() throws IOException {
        if (!this.k.request(1L)) {
            this.A("Unterminated escape sequence");
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
            final StringBuilder t = a.t("Invalid escape sequence: \\");
            t.append((char)byte1);
            this.A(t.toString());
            throw null;
        }
        if (this.k.request(4L)) {
            int i = 0;
            char c = '\0';
            while (i < 4) {
                int s = this.l.s((long)i);
                final char c2 = (char)(c << 4);
                if (s >= '0' && s <= '9') {
                    s -= 48;
                }
                else {
                    if (s >= 'a' && s <= 'f') {
                        s -= 97;
                    }
                    else {
                        if (s < 'A' || s > 'F') {
                            final StringBuilder t2 = a.t("\\u");
                            t2.append(this.l.F(4L));
                            this.A(t2.toString());
                            throw null;
                        }
                        s -= 65;
                    }
                    s += '\n';
                }
                c = (char)(s + c2);
                ++i;
            }
            this.l.skip(4L);
            return c;
        }
        final StringBuilder t3 = a.t("Unterminated escape sequence at path ");
        t3.append(this.T0());
        throw new EOFException(t3.toString());
    }
    
    public final void P(final ByteString byteString) throws IOException {
        while (true) {
            final long k1 = this.k.k1(byteString);
            if (k1 == -1L) {
                this.A("Unterminated string");
                throw null;
            }
            if (this.l.s(k1) != 92) {
                this.l.skip(k1 + 1L);
                return;
            }
            this.l.skip(k1 + 1L);
            this.O();
        }
    }
    
    public final boolean X1() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
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
        final StringBuilder t = a.t("Expected a boolean but was ");
        t.append(this.v());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
    
    public final String Z1() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
        }
        String s;
        if (n == 10) {
            s = this.M();
        }
        else if (n == 9) {
            s = this.J(a.r);
        }
        else if (n == 8) {
            s = this.J(a.q);
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
                final StringBuilder t = a.t("Expected a string but was ");
                t.append(this.v());
                t.append(" at path ");
                t.append(this.T0());
                throw new JsonDataException(t.toString());
            }
            s = this.l.F((long)this.o);
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
            n = this.E();
        }
        if (n == 3) {
            this.w(1);
            super.i[super.f - 1] = 0;
            this.m = 0;
            return;
        }
        final StringBuilder t = a.t("Expected BEGIN_ARRAY but was ");
        t.append(this.v());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
    
    public final void close() throws IOException {
        this.m = 0;
        super.g[0] = 8;
        super.f = 1;
        this.l.b();
        ((g0)this.k).close();
    }
    
    public final void h() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
        }
        if (n == 1) {
            this.w(3);
            this.m = 0;
            return;
        }
        final StringBuilder t = a.t("Expected BEGIN_OBJECT but was ");
        t.append(this.v());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
    
    public final boolean hasNext() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
        }
        return n != 2 && n != 4 && n != 18;
    }
    
    public final void q() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
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
        final StringBuilder t = a.t("Expected END_ARRAY but was ");
        t.append(this.v());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
    
    public final void r() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
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
        final StringBuilder t = a.t("Expected END_OBJECT but was ");
        t.append(this.v());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
    
    public final double s() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
        }
        if (n == 16) {
            this.m = 0;
            final int[] i = super.i;
            final int n2 = super.f - 1;
            ++i[n2];
            return (double)this.n;
        }
        Label_0317: {
            if (n == 17) {
                this.p = this.l.F((long)this.o);
            }
            else if (n == 9) {
                this.p = this.J(a.r);
            }
            else if (n == 8) {
                this.p = this.J(a.q);
            }
            else if (n == 10) {
                this.p = this.M();
            }
            else if (n != 11) {
                break Label_0317;
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
                sb.append(this.T0());
                throw new JsonEncodingException(sb.toString());
            }
            catch (final NumberFormatException ex) {
                final StringBuilder t = a.t("Expected a double but was ");
                t.append(this.p);
                t.append(" at path ");
                t.append(this.T0());
                throw new JsonDataException(t.toString());
            }
        }
        final StringBuilder t2 = a.t("Expected a double but was ");
        t2.append(this.v());
        t2.append(" at path ");
        t2.append(this.T0());
        throw new JsonDataException(t2.toString());
    }
    
    public final int t() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
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
            final StringBuilder t = a.t("Expected an int but was ");
            t.append(this.n);
            t.append(" at path ");
            t.append(this.T0());
            throw new JsonDataException(t.toString());
        }
        else {
            while (true) {
                if (n == 17) {
                    this.p = this.l.F((long)this.o);
                    break Label_0295;
                }
                String p;
                if (n != 9 && n != 8) {
                    if (n == 11) {
                        break Label_0295;
                    }
                    final StringBuilder t2 = a.t("Expected an int but was ");
                    t2.append(this.v());
                    t2.append(" at path ");
                    t2.append(this.T0());
                    throw new JsonDataException(t2.toString());
                }
                else if (n == 9) {
                    p = this.J(a.r);
                }
                else {
                    p = this.J(a.q);
                }
                this.p = p;
                try {
                    final int int1 = Integer.parseInt(p);
                    this.m = 0;
                    final int[] j = super.i;
                    final int n5 = super.f - 1;
                    ++j[n5];
                    return int1;
                    this.m = 11;
                    try {
                        final double double1 = Double.parseDouble(this.p);
                        final int n6 = (int)double1;
                        if (n6 == double1) {
                            this.p = null;
                            this.m = 0;
                            final int[] k = super.i;
                            final int n7 = super.f - 1;
                            ++k[n7];
                            return n6;
                        }
                        final StringBuilder t3 = a.t("Expected an int but was ");
                        t3.append(this.p);
                        t3.append(" at path ");
                        t3.append(this.T0());
                        throw new JsonDataException(t3.toString());
                    }
                    catch (final NumberFormatException ex) {
                        final StringBuilder t4 = a.t("Expected an int but was ");
                        t4.append(this.p);
                        t4.append(" at path ");
                        t4.append(this.T0());
                        throw new JsonDataException(t4.toString());
                    }
                }
                catch (final NumberFormatException ex2) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final String toString() {
        final StringBuilder t = a.t("JsonReader(");
        t.append(this.k);
        t.append(")");
        return t.toString();
    }
    
    public final JsonReader$Token v() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
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
    
    public final int x(final JsonReader$a jsonReader$a) throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
        }
        if (n < 12 || n > 15) {
            return -1;
        }
        if (n == 15) {
            return this.F(this.p, jsonReader$a);
        }
        final int q1 = this.k.Q1(jsonReader$a.b);
        if (q1 != -1) {
            this.m = 0;
            super.h[super.f - 1] = jsonReader$a.a[q1];
            return q1;
        }
        final String s = super.h[super.f - 1];
        final String n2 = this.N1();
        final int f = this.F(n2, jsonReader$a);
        if (f == -1) {
            this.m = 15;
            this.p = n2;
            super.h[super.f - 1] = s;
        }
        return f;
    }
    
    public final void y() throws IOException {
        int n;
        if ((n = this.m) == 0) {
            n = this.E();
        }
        if (n == 14) {
            long n2 = this.k.k1(a.s);
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
            final StringBuilder t = a.t("Expected a name but was ");
            t.append(this.v());
            t.append(" at path ");
            t.append(this.T0());
            throw new JsonDataException(t.toString());
        }
        this.m = 0;
        super.h[super.f - 1] = "null";
    }
}
