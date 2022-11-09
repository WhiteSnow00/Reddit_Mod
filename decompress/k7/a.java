// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import rk2.g0;
import com.apollographql.apollo.api.internal.json.JsonEncodingException;
import java.io.EOFException;
import ae.b;
import java.io.IOException;
import com.apollographql.apollo.api.internal.json.JsonDataException;
import pg2.j;
import okio.ByteString$a;
import rk2.c;
import rk2.f;
import okio.ByteString;
import com.apollographql.apollo.api.internal.json.JsonReader;

public final class a implements JsonReader
{
    public static final ByteString p;
    public static final ByteString q;
    public static final ByteString r;
    public final f f;
    public final c g;
    public int h;
    public long i;
    public int j;
    public String k;
    public final int[] l;
    public int m;
    public final String[] n;
    public final int[] o;
    
    static {
        ByteString.Companion.getClass();
        p = ByteString$a.c("'\\");
        q = ByteString$a.c("\"\\");
        r = ByteString$a.c("{}[]:, \n\t\r/\\;#=");
        ByteString$a.c("\n\r");
    }
    
    public a(final f f) {
        ah2.f.g((Object)f, "source");
        this.f = f;
        this.g = f.getBuffer();
        final int[] l = new int[256];
        l[0] = 6;
        final j a = pg2.j.a;
        this.l = l;
        this.m = 1;
        this.n = new String[256];
        this.o = new int[256];
    }
    
    @Override
    public final String G1() throws IOException {
        Integer value = this.h;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        String s = null;
        switch (n) {
            default: {
                final StringBuilder k = a.k("Expected a name but was ");
                k.append(this.peek());
                k.append(" at path ");
                k.append(this.q());
                throw new JsonDataException(k.toString());
            }
            case 14: {
                final long e = this.f.e(a.r);
                if (e != -1L) {
                    s = this.g.H(e);
                    break;
                }
                s = this.g.F();
                break;
            }
            case 13: {
                s = this.t(a.q);
                break;
            }
            case 12: {
                s = this.t(a.p);
                break;
            }
        }
        this.h = 0;
        return this.n[this.m - 1] = s;
    }
    
    @Override
    public final a J1() throws IOException {
        Integer value = this.h;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        if (n == 1) {
            this.v(3);
            this.h = 0;
            return this;
        }
        final StringBuilder k = a.k("Expected BEGIN_OBJECT but was ");
        k.append(this.peek());
        k.append(" at path ");
        k.append(this.q());
        throw new JsonDataException(k.toString());
    }
    
    @Override
    public final boolean O1() throws IOException {
        Integer value = this.h;
        final int intValue = value.intValue();
        boolean b = false;
        if (intValue == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        if (n != 5) {
            if (n != 6) {
                final StringBuilder k = a.k("Expected a boolean but was ");
                k.append(this.peek());
                k.append(" at path ");
                k.append(this.q());
                throw new JsonDataException(k.toString());
            }
            this.h = 0;
            final int[] o = this.o;
            final int n2 = this.m - 1;
            ++o[n2];
        }
        else {
            this.h = 0;
            final int[] o2 = this.o;
            final int n3 = this.m - 1;
            ++o2[n3];
            b = true;
        }
        return b;
    }
    
    @Override
    public final String Q1() throws IOException {
        Integer value = this.h;
        final boolean b = value.intValue() == 0;
        final String s = null;
        if (b) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        String s2;
        if (n != 15) {
            if (n != 16) {
                switch (n) {
                    default: {
                        final StringBuilder k = a.k("Expected a string but was ");
                        k.append(this.peek());
                        k.append(" at path ");
                        k.append(this.q());
                        throw new JsonDataException(k.toString());
                    }
                    case 11: {
                        s2 = this.k;
                        if (s2 == null) {
                            s2 = s;
                            break;
                        }
                        this.k = null;
                        break;
                    }
                    case 10: {
                        final long e = this.f.e(a.r);
                        if (e != -1L) {
                            s2 = this.g.H(e);
                            break;
                        }
                        s2 = this.g.F();
                        break;
                    }
                    case 9: {
                        s2 = this.t(a.q);
                        break;
                    }
                    case 8: {
                        s2 = this.t(a.p);
                        break;
                    }
                }
            }
            else {
                s2 = this.g.H((long)this.j);
            }
        }
        else {
            s2 = String.valueOf(this.i);
        }
        this.h = 0;
        final int[] o = this.o;
        final int n2 = this.m - 1;
        ++o[n2];
        return s2;
    }
    
    @Override
    public final a W1() throws IOException {
        Integer value = this.h;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        if (n == 2) {
            int m = this.m - 1;
            this.m = m;
            this.n[m] = null;
            final int[] o = this.o;
            --m;
            ++o[m];
            this.h = 0;
            return this;
        }
        final StringBuilder k = a.k("Expected END_OBJECT but was ");
        k.append(this.peek());
        k.append(" at path ");
        k.append(this.q());
        throw new JsonDataException(k.toString());
    }
    
    public final void b() throws IOException {
        throw this.y("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
    
    @Override
    public final void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.g.h();
        ((g0)this.f).close();
    }
    
    public final int h() throws IOException {
        final int[] l = this.l;
        final int m = this.m;
        final int n = l[m - 1];
        int n2 = 2;
        switch (n) {
            default: {
                if (n != 8) {
                    break;
                }
                throw new IllegalStateException("JsonReader is closed".toString());
            }
            case 7: {
                if (this.s(false) == -1) {
                    return this.h = 17;
                }
                this.b();
                throw null;
            }
            case 6: {
                l[m - 1] = 7;
                break;
            }
            case 4: {
                l[m - 1] = 5;
                final int s = this.s(true);
                this.g.readByte();
                final char c = (char)s;
                if (c == ':') {
                    break;
                }
                if (c == '=') {
                    this.b();
                    throw null;
                }
                throw this.y("Expected ':'");
            }
            case 3:
            case 5: {
                l[m - 1] = 4;
                if (n == 5) {
                    final int s2 = this.s(true);
                    this.g.readByte();
                    final char c2 = (char)s2;
                    if (c2 == '}') {
                        return this.h = 2;
                    }
                    if (c2 == ';') {
                        this.b();
                        throw null;
                    }
                    if (c2 != ',') {
                        throw this.y("Unterminated object");
                    }
                }
                final char c3 = (char)this.s(true);
                if (c3 == '\"') {
                    this.g.readByte();
                    n2 = 13;
                    this.h = 13;
                }
                else {
                    if (c3 == '\'') {
                        this.g.readByte();
                        this.b();
                        throw null;
                    }
                    if (c3 != '}') {
                        this.b();
                        throw null;
                    }
                    if (n == 5) {
                        throw this.y("Expected name");
                    }
                    this.g.readByte();
                    this.h = 2;
                }
                return n2;
            }
            case 2: {
                final int s3 = this.s(true);
                this.g.readByte();
                final char c4 = (char)s3;
                if (c4 == ']') {
                    return this.h = 4;
                }
                if (c4 == ';') {
                    this.b();
                    throw null;
                }
                if (c4 == ',') {
                    break;
                }
                throw this.y("Unterminated array");
            }
            case 1: {
                l[m - 1] = 2;
                break;
            }
        }
        final char c5 = (char)this.s(true);
        if (c5 == ']') {
            if (n == 1) {
                this.g.readByte();
                return this.h = 4;
            }
            if (n != 1 && n != 2) {
                throw this.y("Unexpected value");
            }
            this.b();
            throw null;
        }
        else if (c5 == ';' || c5 == ',') {
            if (n != 1 && n != 2) {
                throw this.y("Unexpected value");
            }
            this.b();
            throw null;
        }
        else {
            if (c5 == '\'') {
                this.b();
                throw null;
            }
            if (c5 == '\"') {
                this.g.readByte();
                return this.h = 9;
            }
            if (c5 == '[') {
                this.g.readByte();
                return this.h = 3;
            }
            if (c5 == '{') {
                this.g.readByte();
                return this.h = 1;
            }
            final byte t = this.g.t(0L);
            boolean b = false;
            Label_0622: {
                if (t != 116) {
                    if (t != 84) {
                        b = false;
                        break Label_0622;
                    }
                }
                b = true;
            }
            int h = 0;
            Label_0880: {
                Label_0765: {
                    String s4;
                    String s5;
                    if (b) {
                        s4 = "true";
                        s5 = "TRUE";
                        h = 5;
                    }
                    else {
                        boolean b2 = false;
                        Label_0664: {
                            if (t != 102) {
                                if (t != 70) {
                                    b2 = false;
                                    break Label_0664;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            s4 = "false";
                            s5 = "FALSE";
                            h = 6;
                        }
                        else {
                            boolean b3 = false;
                            Label_0707: {
                                if (t != 110) {
                                    if (t != 78) {
                                        b3 = false;
                                        break Label_0707;
                                    }
                                }
                                b3 = true;
                            }
                            if (!b3) {
                                break Label_0765;
                            }
                            s4 = "null";
                            s5 = "NULL";
                            h = 7;
                        }
                    }
                    final int length = s4.length();
                    if (1 < length) {
                        int n3 = 1;
                        Block_37: {
                            while (true) {
                                final int n4 = n3 + 1;
                                final f f = this.f;
                                final long n5 = n3;
                                if (!f.request(n5 + 1L)) {
                                    break;
                                }
                                final byte t2 = this.g.t(n5);
                                if (t2 != (byte)s4.charAt(n3) && t2 != (byte)s5.charAt(n3)) {
                                    break;
                                }
                                if (n4 >= length) {
                                    break Block_37;
                                }
                                n3 = n4;
                            }
                            break Label_0765;
                        }
                    }
                    final f f2 = this.f;
                    final long n6 = length;
                    if (!f2.request(1L + n6) || !this.r((char)this.g.t(n6))) {
                        this.g.skip(n6);
                        this.h = h;
                        break Label_0880;
                    }
                }
                h = 0;
            }
            if (h != 0) {
                return h;
            }
            boolean b4 = true;
            int j = 0;
            int n7 = 0;
            long i = 0L;
            boolean b5 = false;
            int n11 = 0;
            Label_1327: {
                Label_1305: {
                    long n8;
                    while (true) {
                        final f f3 = this.f;
                        n8 = j;
                        if (!f3.request(n8 + 1L)) {
                            break;
                        }
                        final byte t3 = this.g.t(n8);
                        final char c6 = (char)t3;
                        Label_1207: {
                            Label_0979: {
                                if (c6 == '-') {
                                    if (n7 != 0) {
                                        if (n7 != 5) {
                                            break Label_1305;
                                        }
                                        break Label_0979;
                                    }
                                    else {
                                        n7 = ((b5 = true) ? 1 : 0);
                                    }
                                }
                                else if (c6 == '+') {
                                    if (n7 == 5) {
                                        break Label_0979;
                                    }
                                    break Label_1305;
                                }
                                else {
                                    boolean b6 = false;
                                    Label_1011: {
                                        if (c6 != 'e') {
                                            if (c6 != 'E') {
                                                b6 = false;
                                                break Label_1011;
                                            }
                                        }
                                        b6 = true;
                                    }
                                    if (b6) {
                                        if (n7 != 2 && n7 != 4) {
                                            break Label_1305;
                                        }
                                        n7 = 5;
                                    }
                                    else if (c6 == '.') {
                                        if (n7 != 2) {
                                            break Label_1305;
                                        }
                                        n7 = 3;
                                    }
                                    else if (t3 >= 48 && t3 <= 57) {
                                        if (n7 != 0 && n7 != 1) {
                                            if (n7 != 2) {
                                                if (n7 != 3) {
                                                    if (n7 == 5 || n7 == 6) {
                                                        n7 = 7;
                                                    }
                                                }
                                                else {
                                                    n7 = 4;
                                                }
                                            }
                                            else {
                                                if (i == 0L) {
                                                    break Label_1305;
                                                }
                                                final long n9 = 10 * i - (t3 - 48);
                                                final long n10 = lcmp(i, -922337203685477580L);
                                                b4 = ((n10 > 0 & b4) || (n10 == 0 && n9 < i));
                                                i = n9;
                                            }
                                        }
                                        else {
                                            i = -(t3 - 48);
                                            n7 = 2;
                                        }
                                    }
                                    else {
                                        if (!this.r(c6)) {
                                            break;
                                        }
                                        break Label_1305;
                                    }
                                }
                                break Label_1207;
                            }
                            n7 = 6;
                        }
                        ++j;
                    }
                    if (n7 == 2 && b4 && (i != Long.MIN_VALUE || b5)) {
                        if (!b5) {
                            i = -i;
                        }
                        this.i = i;
                        this.g.skip(n8);
                        n11 = 15;
                        this.h = 15;
                        break Label_1327;
                    }
                    if (n7 == 2 || n7 == 4 || n7 == 7) {
                        this.j = j;
                        n11 = 16;
                        this.h = 16;
                        break Label_1327;
                    }
                }
                n11 = 0;
            }
            if (n11 != 0) {
                return n11;
            }
            if (!this.r((char)this.g.t(0L))) {
                throw this.y("Expected value");
            }
            this.b();
            throw null;
        }
    }
    
    @Override
    public final boolean hasNext() throws IOException {
        Integer value = this.h;
        final int intValue = value.intValue();
        boolean b = true;
        if (intValue == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        if (n == 2 || n == 4) {
            b = false;
        }
        return b;
    }
    
    @Override
    public final a l1() throws IOException {
        Integer value = this.h;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        if (n == 4) {
            int m = this.m - 1;
            this.m = m;
            final int[] o = this.o;
            --m;
            ++o[m];
            this.h = 0;
            return this;
        }
        final StringBuilder k = a.k("Expected END_ARRAY but was ");
        k.append(this.peek());
        k.append(" at path ");
        k.append(this.q());
        throw new JsonDataException(k.toString());
    }
    
    @Override
    public final a m1() throws IOException {
        Integer value = this.h;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        if (n == 3) {
            this.v(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
            return this;
        }
        final StringBuilder k = a.k("Expected BEGIN_ARRAY but was ");
        k.append(this.peek());
        k.append(" at path ");
        k.append(this.q());
        throw new JsonDataException(k.toString());
    }
    
    @Override
    public final long nextLong() throws IOException {
        Integer value = this.h;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        if (n == 15) {
            this.h = 0;
            final int[] o = this.o;
            final int n2 = this.m - 1;
            ++o[n2];
            return this.i;
        }
        while (true) {
            if (n == 16) {
                this.k = this.g.H((long)this.j);
                break Label_0237;
            }
            ByteString byteString;
            if (n != 9 && n != 8) {
                if (n == 11) {
                    break Label_0237;
                }
                final StringBuilder k = a.k("Expected a long but was ");
                k.append(this.peek());
                k.append(" at path ");
                k.append(this.q());
                throw new JsonDataException(k.toString());
            }
            else if (n == 9) {
                byteString = a.q;
            }
            else {
                byteString = a.p;
            }
            final String t = this.t(byteString);
            this.k = t;
            try {
                final long long1 = Long.parseLong(t);
                this.h = 0;
                final int[] o2 = this.o;
                final int n3 = this.m - 1;
                ++o2[n3];
                return long1;
                this.h = 11;
                try {
                    final String i = this.k;
                    if (i == null) {
                        ah2.f.m();
                        throw null;
                    }
                    final double double1 = Double.parseDouble(i);
                    final long n4 = (long)double1;
                    if (n4 == double1) {
                        this.k = null;
                        this.h = 0;
                        final int[] o3 = this.o;
                        final int n5 = this.m - 1;
                        ++o3[n5];
                        return n4;
                    }
                    final StringBuilder j = a.k("Expected a long but was ");
                    j.append((Object)this.k);
                    j.append(" at path ");
                    j.append(this.q());
                    throw new JsonDataException(j.toString());
                }
                catch (final NumberFormatException ex) {
                    final StringBuilder l = a.k("Expected a long but was ");
                    l.append((Object)this.k);
                    l.append(" at path ");
                    l.append(this.q());
                    throw new JsonDataException(l.toString());
                }
            }
            catch (final NumberFormatException ex2) {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final Token peek() throws IOException {
        Integer value = this.h;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        Token token = null;
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 17: {
                token = Token.END_DOCUMENT;
                break;
            }
            case 16: {
                token = Token.NUMBER;
                break;
            }
            case 15: {
                token = Token.LONG;
                break;
            }
            case 12:
            case 13:
            case 14: {
                token = Token.NAME;
                break;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                token = Token.STRING;
                break;
            }
            case 7: {
                token = Token.NULL;
                break;
            }
            case 5:
            case 6: {
                token = Token.BOOLEAN;
                break;
            }
            case 4: {
                token = Token.END_ARRAY;
                break;
            }
            case 3: {
                token = Token.BEGIN_ARRAY;
                break;
            }
            case 2: {
                token = Token.END_OBJECT;
                break;
            }
            case 1: {
                token = Token.BEGIN_OBJECT;
                break;
            }
        }
        return token;
    }
    
    public final String q() {
        return b.E(this.m, this.l, this.n, this.o);
    }
    
    public final boolean r(final char c) throws IOException {
        final int n = 0;
        if (c != '/' && c != '\\' && c != ';' && c != '#' && c != '=') {
            if (c != '{' && c != '}' && c != '[' && c != ']' && c != ':' && c != ',' && c != ' ' && c != '\t' && c != '\r') {
                final int n2 = n;
                if (c != '\n') {
                    return (n2 ^ 0x1) != 0x0;
                }
            }
            final int n2 = 1;
            return (n2 ^ 0x1) != 0x0;
        }
        this.b();
        throw null;
    }
    
    public final int s(final boolean b) throws IOException {
        int n = 0;
        while (true) {
            final f f = this.f;
            final long n2 = n;
            if (f.request(n2 + 1L)) {
                final c g = this.g;
                final int n3 = n + 1;
                final byte t = g.t(n2);
                n = n3;
                if (t == 9) {
                    continue;
                }
                n = n3;
                if (t == 10) {
                    continue;
                }
                n = n3;
                if (t == 13) {
                    continue;
                }
                n = n3;
                if (t == 32) {
                    continue;
                }
                this.g.skip(n3 - 1L);
                if (t == 35) {
                    this.b();
                    throw null;
                }
                if (t != 47) {
                    return t;
                }
                if (!this.f.request(2L)) {
                    return t;
                }
                this.b();
                throw null;
            }
            else {
                if (!b) {
                    return -1;
                }
                throw new EOFException("End of input");
            }
        }
    }
    
    public final String t(final ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            final long e = this.f.e(byteString);
            if (e == -1L) {
                throw this.y("Unterminated string");
            }
            if (this.g.t(e) != 92) {
                String s;
                if (sb == null) {
                    s = this.g.H(e);
                    this.g.readByte();
                }
                else {
                    sb.append(this.g.H(e));
                    this.g.readByte();
                    s = sb.toString();
                    ah2.f.b((Object)s, "{\n        builder.append\u2026uilder.toString()\n      }");
                }
                return s;
            }
            StringBuilder sb2;
            if ((sb2 = sb) == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.g.H(e));
            this.g.readByte();
            sb2.append(this.w());
            sb = sb2;
        }
    }
    
    public final void v(final int n) {
        final int m = this.m;
        final int[] l = this.l;
        if (m != l.length) {
            this.m = m + 1;
            l[m] = n;
            return;
        }
        throw new JsonDataException(ah2.f.l((Object)this.q(), "Nesting too deep at "));
    }
    
    public final char w() throws IOException {
        if (this.f.request(1L)) {
            char c = (char)this.g.readByte();
            final int n = 0;
            int i = 0;
            if (c == 'u') {
                if (!this.f.request(4L)) {
                    throw new EOFException(ah2.f.l((Object)this.q(), "Unterminated escape sequence at path "));
                }
                char c2 = '\0';
                while (i < 4) {
                    final byte t = this.g.t((long)i);
                    final char c3 = (char)(c2 << 4);
                    int n2;
                    if (t >= 48 && t <= 57) {
                        n2 = t - 48;
                    }
                    else {
                        if (t >= 97 && t <= 102) {
                            n2 = t - 97;
                        }
                        else {
                            if (t < 65 || t > 70) {
                                throw this.y(ah2.f.l((Object)this.g.H(4L), "\\u"));
                            }
                            n2 = t - 65;
                        }
                        n2 += 10;
                    }
                    c2 = (char)(c3 + n2);
                    ++i;
                }
                this.g.skip(4L);
                c = c2;
            }
            else if (c == 't') {
                c = '\t';
            }
            else if (c == 'b') {
                c = '\b';
            }
            else if (c == 'n') {
                c = '\n';
            }
            else if (c == 'r') {
                c = '\r';
            }
            else if (c == 'f') {
                c = '\f';
            }
            else {
                int n3 = 0;
                Label_0361: {
                    if (c != '\n' && c != '\'' && c != '\"' && c != '\\') {
                        n3 = n;
                        if (c != '/') {
                            break Label_0361;
                        }
                    }
                    n3 = 1;
                }
                if (n3 == 0) {
                    throw this.y(ah2.f.l((Object)c, "Invalid escape sequence: \\"));
                }
            }
            return c;
        }
        throw this.y("Unterminated escape sequence");
    }
    
    @Override
    public final void w1() throws IOException {
        Integer value = this.h;
        if (value.intValue() == 0) {
            value = null;
        }
        int n;
        if (value == null) {
            n = this.h();
        }
        else {
            n = value;
        }
        if (n == 7) {
            this.h = 0;
            final int[] o = this.o;
            final int n2 = this.m - 1;
            ++o[n2];
            return;
        }
        final StringBuilder k = a.k("Expected null but was ");
        k.append(this.peek());
        k.append(" at path ");
        k.append(this.q());
        throw new JsonDataException(k.toString());
    }
    
    public final void x(final ByteString byteString) throws IOException {
        while (true) {
            final long e = this.f.e(byteString);
            if (e == -1L) {
                throw this.y("Unterminated string");
            }
            if (this.g.t(e) != 92) {
                this.g.skip(e + 1L);
                return;
            }
            this.g.skip(e + 1L);
            this.w();
        }
    }
    
    public final JsonEncodingException y(final String s) {
        final StringBuilder q = d.q(s, " at path ");
        q.append(this.q());
        return new JsonEncodingException(q.toString());
    }
    
    @Override
    public final void z1() throws IOException {
        int n = 0;
        int i = 0;
        do {
            Integer value = this.h;
            if (value.intValue() == 0) {
                value = null;
            }
            int n2;
            if (value == null) {
                n2 = this.h();
            }
            else {
                n2 = value;
            }
            Label_0269: {
                Label_0265: {
                    switch (n2) {
                        default: {
                            i = n;
                            break Label_0269;
                        }
                        case 16: {
                            this.g.skip((long)this.j);
                            i = n;
                            break Label_0269;
                        }
                        case 10:
                        case 14: {
                            long n3 = this.f.e(a.r);
                            final c g = this.g;
                            if (n3 == -1L) {
                                n3 = g.g;
                            }
                            g.skip(n3);
                            i = n;
                            break Label_0269;
                        }
                        case 9:
                        case 13: {
                            this.x(a.q);
                            i = n;
                            break Label_0269;
                        }
                        case 8:
                        case 12: {
                            this.x(a.p);
                            i = n;
                            break Label_0269;
                        }
                        case 4: {
                            --this.m;
                            break;
                        }
                        case 3: {
                            this.v(1);
                            break Label_0265;
                        }
                        case 2: {
                            --this.m;
                            break;
                        }
                        case 1: {
                            this.v(3);
                            break Label_0265;
                        }
                    }
                    i = n - 1;
                    break Label_0269;
                }
                i = n + 1;
            }
            this.h = 0;
            n = i;
        } while (i != 0);
        final int[] o = this.o;
        final int m = this.m;
        final int n4 = m - 1;
        ++o[n4];
        this.n[m - 1] = "null";
    }
}
