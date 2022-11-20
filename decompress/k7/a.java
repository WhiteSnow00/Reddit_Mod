// 
// Decompiled by Procyon v0.6.0
// 

package k7;

import fk2.g0;
import com.apollographql.apollo.api.internal.json.JsonEncodingException;
import com.apollographql.apollo.api.internal.json.JsonReader$Token;
import java.io.EOFException;
import java.io.IOException;
import com.apollographql.apollo.api.internal.json.JsonDataException;
import cg2.j;
import ng2.e;
import okio.ByteString$a;
import fk2.c;
import fk2.f;
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
        e.g((Object)f, "source");
        this.f = f;
        this.g = f.getBuffer();
        final int[] l = new int[256];
        l[0] = 6;
        final j a = cg2.j.a;
        this.l = l;
        this.m = 1;
        this.n = new String[256];
        this.o = new int[256];
    }
    
    public final void C1() throws IOException {
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
        final StringBuilder t = a.t("Expected null but was ");
        t.append(this.peek());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
    
    public final void G1() throws IOException {
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
            Label_0276: {
                Label_0272: {
                    switch (n2) {
                        default: {
                            i = n;
                            break Label_0276;
                        }
                        case 16: {
                            this.g.skip((long)this.j);
                            i = n;
                            break Label_0276;
                        }
                        case 10:
                        case 14: {
                            long n3 = this.f.k1(a.r);
                            final c g = this.g;
                            if (n3 == -1L) {
                                n3 = g.g;
                            }
                            g.skip(n3);
                            i = n;
                            break Label_0276;
                        }
                        case 9:
                        case 13: {
                            this.r(a.q);
                            i = n;
                            break Label_0276;
                        }
                        case 8:
                        case 12: {
                            this.r(a.p);
                            i = n;
                            break Label_0276;
                        }
                        case 4: {
                            --this.m;
                            break;
                        }
                        case 3: {
                            this.n(1);
                            break Label_0272;
                        }
                        case 2: {
                            --this.m;
                            break;
                        }
                        case 1: {
                            this.n(3);
                            break Label_0272;
                        }
                    }
                    i = n - 1;
                    break Label_0276;
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
    
    public final String N1() throws IOException {
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
                final StringBuilder t = a.t("Expected a name but was ");
                t.append(this.peek());
                t.append(" at path ");
                t.append(this.T0());
                throw new JsonDataException(t.toString());
            }
            case 14: {
                final long k1 = this.f.k1(a.r);
                if (k1 != -1L) {
                    s = this.g.F(k1);
                    break;
                }
                s = this.g.E();
                break;
            }
            case 13: {
                s = this.l(a.q);
                break;
            }
            case 12: {
                s = this.l(a.p);
                break;
            }
        }
        this.h = 0;
        return this.n[this.m - 1] = s;
    }
    
    public final a R1() throws IOException {
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
            this.n(3);
            this.h = 0;
            return this;
        }
        final StringBuilder t = a.t("Expected BEGIN_OBJECT but was ");
        t.append(this.peek());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
    
    public final String T0() {
        return vl.a.Y1(this.m, this.l, this.n, this.o);
    }
    
    public final boolean X1() throws IOException {
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
                final StringBuilder t = a.t("Expected a boolean but was ");
                t.append(this.peek());
                t.append(" at path ");
                t.append(this.T0());
                throw new JsonDataException(t.toString());
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
    
    public final String Z1() throws IOException {
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
                        final StringBuilder t = a.t("Expected a string but was ");
                        t.append(this.peek());
                        t.append(" at path ");
                        t.append(this.T0());
                        throw new JsonDataException(t.toString());
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
                        final long k1 = this.f.k1(a.r);
                        if (k1 != -1L) {
                            s2 = this.g.F(k1);
                            break;
                        }
                        s2 = this.g.E();
                        break;
                    }
                    case 9: {
                        s2 = this.l(a.q);
                        break;
                    }
                    case 8: {
                        s2 = this.l(a.p);
                        break;
                    }
                }
            }
            else {
                s2 = this.g.F((long)this.j);
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
    
    public final void b() throws IOException {
        throw this.s("Use JsonReader.setLenient(true) to accept malformed JSON");
    }
    
    public final void close() throws IOException {
        this.h = 0;
        this.l[0] = 8;
        this.m = 1;
        this.g.b();
        ((g0)this.f).close();
    }
    
    public final a g2() throws IOException {
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
        final StringBuilder t = a.t("Expected END_OBJECT but was ");
        t.append(this.peek());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
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
                if (this.k(false) == -1) {
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
                final int k = this.k(true);
                this.g.readByte();
                final char c = (char)k;
                if (c == ':') {
                    break;
                }
                if (c == '=') {
                    this.b();
                    throw null;
                }
                throw this.s("Expected ':'");
            }
            case 3:
            case 5: {
                l[m - 1] = 4;
                if (n == 5) {
                    final int i = this.k(true);
                    this.g.readByte();
                    final char c2 = (char)i;
                    if (c2 == '}') {
                        return this.h = 2;
                    }
                    if (c2 == ';') {
                        this.b();
                        throw null;
                    }
                    if (c2 != ',') {
                        throw this.s("Unterminated object");
                    }
                }
                final char c3 = (char)this.k(true);
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
                        throw this.s("Expected name");
                    }
                    this.g.readByte();
                    this.h = 2;
                }
                return n2;
            }
            case 2: {
                final int j = this.k(true);
                this.g.readByte();
                final char c4 = (char)j;
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
                throw this.s("Unterminated array");
            }
            case 1: {
                l[m - 1] = 2;
                break;
            }
        }
        final char c5 = (char)this.k(true);
        if (c5 == ']') {
            if (n == 1) {
                this.g.readByte();
                return this.h = 4;
            }
            if (n != 1 && n != 2) {
                throw this.s("Unexpected value");
            }
            this.b();
            throw null;
        }
        else if (c5 == ';' || c5 == ',') {
            if (n != 1 && n != 2) {
                throw this.s("Unexpected value");
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
            final byte s = this.g.s(0L);
            boolean b = false;
            Label_0627: {
                if (s != 116) {
                    if (s != 84) {
                        b = false;
                        break Label_0627;
                    }
                }
                b = true;
            }
            int h = 0;
            Label_0886: {
                Label_0768: {
                    String s2;
                    String s3;
                    if (b) {
                        s2 = "true";
                        s3 = "TRUE";
                        h = 5;
                    }
                    else {
                        boolean b2 = false;
                        Label_0666: {
                            if (s != 102) {
                                if (s != 70) {
                                    b2 = false;
                                    break Label_0666;
                                }
                            }
                            b2 = true;
                        }
                        if (b2) {
                            s2 = "false";
                            s3 = "FALSE";
                            h = 6;
                        }
                        else {
                            boolean b3 = false;
                            Label_0708: {
                                if (s != 110) {
                                    if (s != 78) {
                                        b3 = false;
                                        break Label_0708;
                                    }
                                }
                                b3 = true;
                            }
                            if (!b3) {
                                break Label_0768;
                            }
                            s2 = "null";
                            s3 = "NULL";
                            h = 7;
                        }
                    }
                    final int length = s2.length();
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
                                final byte s4 = this.g.s(n5);
                                if (s4 != (byte)s2.charAt(n3) && s4 != (byte)s3.charAt(n3)) {
                                    break;
                                }
                                if (n4 >= length) {
                                    break Block_37;
                                }
                                n3 = n4;
                            }
                            break Label_0768;
                        }
                    }
                    final f f2 = this.f;
                    final long n6 = length;
                    if (!f2.request(1L + n6) || !this.j((char)this.g.s(n6))) {
                        this.g.skip(n6);
                        this.h = h;
                        break Label_0886;
                    }
                }
                h = 0;
            }
            if (h != 0) {
                return h;
            }
            boolean b4 = true;
            int j2 = 0;
            int n7 = 0;
            long i2 = 0L;
            boolean b5 = false;
            int n11 = 0;
            Label_1324: {
                Label_1304: {
                    long n8;
                    while (true) {
                        final f f3 = this.f;
                        n8 = j2;
                        if (!f3.request(n8 + 1L)) {
                            break;
                        }
                        final byte s5 = this.g.s(n8);
                        final char c6 = (char)s5;
                        Label_1209: {
                            Label_0981: {
                                if (c6 == '-') {
                                    if (n7 != 0) {
                                        if (n7 != 5) {
                                            break Label_1304;
                                        }
                                        break Label_0981;
                                    }
                                    else {
                                        n7 = 1;
                                        b5 = true;
                                    }
                                }
                                else if (c6 == '+') {
                                    if (n7 == 5) {
                                        break Label_0981;
                                    }
                                    break Label_1304;
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
                                            break Label_1304;
                                        }
                                        n7 = 5;
                                    }
                                    else if (c6 == '.') {
                                        if (n7 != 2) {
                                            break Label_1304;
                                        }
                                        n7 = 3;
                                    }
                                    else if (s5 >= 48 && s5 <= 57) {
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
                                                if (i2 == 0L) {
                                                    break Label_1304;
                                                }
                                                final long n9 = 10 * i2 - (s5 - 48);
                                                final long n10 = lcmp(i2, -922337203685477580L);
                                                b4 = ((n10 > 0 & b4) || (n10 == 0 && n9 < i2));
                                                i2 = n9;
                                            }
                                        }
                                        else {
                                            i2 = -(s5 - 48);
                                            n7 = 2;
                                        }
                                    }
                                    else {
                                        if (!this.j(c6)) {
                                            break;
                                        }
                                        break Label_1304;
                                    }
                                }
                                break Label_1209;
                            }
                            n7 = 6;
                        }
                        ++j2;
                    }
                    if (n7 == 2 && b4 && (i2 != Long.MIN_VALUE || b5)) {
                        if (!b5) {
                            i2 = -i2;
                        }
                        this.i = i2;
                        this.g.skip(n8);
                        n11 = 15;
                        this.h = 15;
                        break Label_1324;
                    }
                    if (n7 == 2 || n7 == 4 || n7 == 7) {
                        this.j = j2;
                        n11 = 16;
                        this.h = 16;
                        break Label_1324;
                    }
                }
                n11 = 0;
            }
            if (n11 != 0) {
                return n11;
            }
            if (!this.j((char)this.g.s(0L))) {
                throw this.s("Expected value");
            }
            this.b();
            throw null;
        }
    }
    
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
    
    public final boolean j(final char c) throws IOException {
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
    
    public final int k(final boolean b) throws IOException {
        int n = 0;
        while (true) {
            final f f = this.f;
            final long n2 = n;
            if (f.request(n2 + 1L)) {
                final c g = this.g;
                final int n3 = n + 1;
                final byte s = g.s(n2);
                n = n3;
                if (s == 9) {
                    continue;
                }
                n = n3;
                if (s == 10) {
                    continue;
                }
                n = n3;
                if (s == 13) {
                    continue;
                }
                n = n3;
                if (s == 32) {
                    continue;
                }
                this.g.skip(n3 - 1L);
                if (s == 35) {
                    this.b();
                    throw null;
                }
                if (s != 47) {
                    return s;
                }
                if (!this.f.request(2L)) {
                    return s;
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
    
    public final String l(final ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            final long k1 = this.f.k1(byteString);
            if (k1 == -1L) {
                throw this.s("Unterminated string");
            }
            if (this.g.s(k1) != 92) {
                String s;
                if (sb == null) {
                    s = this.g.F(k1);
                    this.g.readByte();
                }
                else {
                    sb.append(this.g.F(k1));
                    this.g.readByte();
                    s = sb.toString();
                    e.b((Object)s, "{\n        builder.append\u2026uilder.toString()\n      }");
                }
                return s;
            }
            StringBuilder sb2;
            if ((sb2 = sb) == null) {
                sb2 = new StringBuilder();
            }
            sb2.append(this.g.F(k1));
            this.g.readByte();
            sb2.append(this.q());
            sb = sb2;
        }
    }
    
    public final void n(final int n) {
        final int m = this.m;
        final int[] l = this.l;
        if (m != l.length) {
            this.m = m + 1;
            l[m] = n;
            return;
        }
        throw new JsonDataException(e.l((Object)this.T0(), "Nesting too deep at "));
    }
    
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
                this.k = this.g.F((long)this.j);
                break Label_0261;
            }
            ByteString byteString;
            if (n != 9 && n != 8) {
                if (n == 11) {
                    break Label_0261;
                }
                final StringBuilder t = a.t("Expected a long but was ");
                t.append(this.peek());
                t.append(" at path ");
                t.append(this.T0());
                throw new JsonDataException(t.toString());
            }
            else if (n == 9) {
                byteString = a.q;
            }
            else {
                byteString = a.p;
            }
            final String l = this.l(byteString);
            this.k = l;
            try {
                final long long1 = Long.parseLong(l);
                this.h = 0;
                final int[] o2 = this.o;
                final int n3 = this.m - 1;
                ++o2[n3];
                return long1;
                this.h = 11;
                try {
                    final String k = this.k;
                    if (k == null) {
                        e.m();
                        throw null;
                    }
                    final double double1 = Double.parseDouble(k);
                    final long n4 = (long)double1;
                    if (n4 == double1) {
                        this.k = null;
                        this.h = 0;
                        final int[] o3 = this.o;
                        final int n5 = this.m - 1;
                        ++o3[n5];
                        return n4;
                    }
                    final StringBuilder t2 = a.t("Expected a long but was ");
                    t2.append((Object)this.k);
                    t2.append(" at path ");
                    t2.append(this.T0());
                    throw new JsonDataException(t2.toString());
                }
                catch (final NumberFormatException ex) {
                    final StringBuilder t3 = a.t("Expected a long but was ");
                    t3.append((Object)this.k);
                    t3.append(" at path ");
                    t3.append(this.T0());
                    throw new JsonDataException(t3.toString());
                }
            }
            catch (final NumberFormatException ex2) {
                continue;
            }
            break;
        }
    }
    
    public final JsonReader$Token peek() throws IOException {
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
        JsonReader$Token jsonReader$Token = null;
        switch (n) {
            default: {
                throw new AssertionError();
            }
            case 17: {
                jsonReader$Token = JsonReader$Token.END_DOCUMENT;
                break;
            }
            case 16: {
                jsonReader$Token = JsonReader$Token.NUMBER;
                break;
            }
            case 15: {
                jsonReader$Token = JsonReader$Token.LONG;
                break;
            }
            case 12:
            case 13:
            case 14: {
                jsonReader$Token = JsonReader$Token.NAME;
                break;
            }
            case 8:
            case 9:
            case 10:
            case 11: {
                jsonReader$Token = JsonReader$Token.STRING;
                break;
            }
            case 7: {
                jsonReader$Token = JsonReader$Token.NULL;
                break;
            }
            case 5:
            case 6: {
                jsonReader$Token = JsonReader$Token.BOOLEAN;
                break;
            }
            case 4: {
                jsonReader$Token = JsonReader$Token.END_ARRAY;
                break;
            }
            case 3: {
                jsonReader$Token = JsonReader$Token.BEGIN_ARRAY;
                break;
            }
            case 2: {
                jsonReader$Token = JsonReader$Token.END_OBJECT;
                break;
            }
            case 1: {
                jsonReader$Token = JsonReader$Token.BEGIN_OBJECT;
                break;
            }
        }
        return jsonReader$Token;
    }
    
    public final char q() throws IOException {
        if (this.f.request(1L)) {
            char c = (char)this.g.readByte();
            final int n = 0;
            int i = 0;
            if (c == 'u') {
                if (!this.f.request(4L)) {
                    throw new EOFException(e.l((Object)this.T0(), "Unterminated escape sequence at path "));
                }
                c = '\0';
                while (i < 4) {
                    int s = this.g.s((long)i);
                    final char c2 = (char)(c << 4);
                    if (s >= 48 && s <= 57) {
                        s -= 48;
                    }
                    else {
                        if (s >= 97 && s <= 102) {
                            s -= 97;
                        }
                        else {
                            if (s < 65 || s > 70) {
                                throw this.s(e.l((Object)this.g.F(4L), "\\u"));
                            }
                            s -= 65;
                        }
                        s += 10;
                    }
                    c = (char)(c2 + s);
                    ++i;
                }
                this.g.skip(4L);
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
                int n2 = 0;
                Label_0333: {
                    if (c != '\n' && c != '\'' && c != '\"' && c != '\\') {
                        n2 = n;
                        if (c != '/') {
                            break Label_0333;
                        }
                    }
                    n2 = 1;
                }
                if (n2 == 0) {
                    throw this.s(e.l((Object)c, "Invalid escape sequence: \\"));
                }
            }
            return c;
        }
        throw this.s("Unterminated escape sequence");
    }
    
    public final void r(final ByteString byteString) throws IOException {
        while (true) {
            final long k1 = this.f.k1(byteString);
            if (k1 == -1L) {
                throw this.s("Unterminated string");
            }
            if (this.g.s(k1) != 92) {
                this.g.skip(k1 + 1L);
                return;
            }
            this.g.skip(k1 + 1L);
            this.q();
        }
    }
    
    public final a r1() throws IOException {
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
        final StringBuilder t = a.t("Expected END_ARRAY but was ");
        t.append(this.peek());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
    
    public final JsonEncodingException s(final String s) {
        final StringBuilder q = android.support.v4.media.a.q(s, " at path ");
        q.append(this.T0());
        return new JsonEncodingException(q.toString());
    }
    
    public final a s1() throws IOException {
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
            this.n(1);
            this.o[this.m - 1] = 0;
            this.h = 0;
            return this;
        }
        final StringBuilder t = a.t("Expected BEGIN_ARRAY but was ");
        t.append(this.peek());
        t.append(" at path ");
        t.append(this.T0());
        throw new JsonDataException(t.toString());
    }
}
