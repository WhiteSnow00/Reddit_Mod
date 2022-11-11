// 
// Decompiled by Procyon v0.6.0
// 

package uj2;

import kotlinx.serialization.MissingFieldException;
import a4.a0;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import sj2.v;
import ig2.o;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import bg.d;
import tj2.g;
import kotlinx.serialization.json.internal.JsonElementMarker;
import tj2.e;
import android.support.v4.media.b;
import kotlinx.serialization.json.internal.WriteMode;
import tj2.a;
import tj2.f;
import android.support.v4.media.c;

public final class m extends c implements f
{
    public final a a;
    public final WriteMode b;
    public final uj2.a c;
    public final b d;
    public int e;
    public m.m$a f;
    public final e g;
    public final JsonElementMarker h;
    
    public m(final a a, final WriteMode b, final uj2.a c, final qj2.e e, final m.m$a f) {
        sg2.e.f((Object)a, "json");
        sg2.e.f((Object)b, "mode");
        sg2.e.f((Object)c, "lexer");
        sg2.e.f((Object)e, "descriptor");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = a.b;
        this.e = -1;
        this.f = f;
        final e a2 = a.a;
        this.g = a2;
        JsonElementMarker h;
        if (a2.f) {
            h = null;
        }
        else {
            h = new JsonElementMarker(e);
        }
        this.h = h;
    }
    
    public final g A() {
        return new kotlinx.serialization.json.internal.a(this.a.a, this.c).b();
    }
    
    public final int B() {
        final long j = this.c.j();
        final int n = (int)j;
        if (j == n) {
            return n;
        }
        final uj2.a c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse int for input '");
        sb.append(j);
        sb.append('\'');
        uj2.a.p(c, sb.toString(), 0, (String)null, 6);
        throw null;
    }
    
    public final float F() {
        final uj2.a c = this.c;
        final String l = c.l();
        final boolean b = false;
        try {
            final float float1 = Float.parseFloat(l);
            if (!this.a.a.k) {
                int n = b ? 1 : 0;
                if (!Float.isInfinite(float1)) {
                    n = (b ? 1 : 0);
                    if (!Float.isNaN(float1)) {
                        n = 1;
                    }
                }
                if (n == 0) {
                    bg.d.L0(this.c, (Number)float1);
                    throw null;
                }
            }
            return float1;
        }
        catch (final IllegalArgumentException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse type '");
            sb.append("float");
            sb.append("' for input '");
            sb.append(l);
            sb.append('\'');
            uj2.a.p(c, sb.toString(), 0, (String)null, 6);
            throw null;
        }
    }
    
    public final boolean I() {
        boolean b2;
        if (this.g.c) {
            final uj2.a c = this.c;
            int v = c.v();
            if (v == c.s().length()) {
                uj2.a.p(c, "EOF", 0, (String)null, 6);
                throw null;
            }
            boolean b;
            if (c.s().charAt(v) == '\"') {
                ++v;
                b = true;
            }
            else {
                b = false;
            }
            b2 = c.c(v);
            if (b) {
                if (c.a == c.s().length()) {
                    uj2.a.p(c, "EOF", 0, (String)null, 6);
                    throw null;
                }
                if (c.s().charAt(c.a) != '\"') {
                    uj2.a.p(c, "Expected closing quotation mark", 0, (String)null, 6);
                    throw null;
                }
                ++c.a;
                b2 = b2;
            }
        }
        else {
            final uj2.a c2 = this.c;
            b2 = c2.c(c2.v());
        }
        return b2;
    }
    
    public final boolean K() {
        final JsonElementMarker h = this.h;
        final boolean b = false;
        final boolean b2 = h != null && h.b;
        boolean b3 = b;
        if (!b2) {
            b3 = b;
            if (this.c.x()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final a L() {
        return this.a;
    }
    
    public final byte M() {
        final long j = this.c.j();
        final byte b = (byte)j;
        if (j == b) {
            return b;
        }
        final uj2.a c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse byte for input '");
        sb.append(j);
        sb.append('\'');
        uj2.a.p(c, sb.toString(), 0, (String)null, 6);
        throw null;
    }
    
    public final rj2.a a(final qj2.e e) {
        sg2.e.f((Object)e, "descriptor");
        final WriteMode c0 = vl.a.C0(e, this.a);
        final h b = this.c.b;
        b.getClass();
        final int c2 = b.c + 1;
        b.c = c2;
        if (c2 == b.a.length) {
            b.b();
        }
        b.a[c2] = e;
        this.c.i(c0.begin);
        if (this.c.t() != 4) {
            final int n = m.m$b.a[((Enum)c0).ordinal()];
            m m;
            if (n != 1 && n != 2 && n != 3) {
                if (this.b == c0 && this.a.a.f) {
                    m = this;
                }
                else {
                    m = new m(this.a, c0, this.c, e, this.f);
                }
            }
            else {
                m = new m(this.a, c0, this.c, e, this.f);
            }
            return (rj2.a)m;
        }
        uj2.a.p(this.c, "Unexpected leading comma", 0, (String)null, 6);
        throw null;
    }
    
    public final b c() {
        return this.d;
    }
    
    public final void d(final qj2.e e) {
        sg2.e.f((Object)e, "descriptor");
        if (this.a.a.b && e.e() == 0) {
            while (this.e(e) != -1) {}
        }
        this.c.i(this.b.end);
        final h b = this.c.b;
        final int c = b.c;
        final int[] b2 = b.b;
        if (b2[c] == -2) {
            b2[c] = -1;
            b.c = c - 1;
        }
        final int c2 = b.c;
        if (c2 != -1) {
            b.c = c2 - 1;
        }
    }
    
    public final int e(final qj2.e e) {
        sg2.e.f((Object)e, "descriptor");
        final int n = m.m$b.a[((Enum)this.b).ordinal()];
        final int n2 = -1;
        int n3 = 0;
        Label_1313: {
            if (n != 2) {
                if (n != 4) {
                    final boolean w = this.c.w();
                    if (this.c.b()) {
                        n3 = this.e;
                        if (n3 != -1 && !w) {
                            uj2.a.p(this.c, "Expected end of the array or comma", 0, (String)null, 6);
                            throw null;
                        }
                        ++n3;
                        this.e = n3;
                    }
                    else {
                        if (w) {
                            uj2.a.p(this.c, "Unexpected trailing comma", 0, (String)null, 6);
                            throw null;
                        }
                        n3 = n2;
                    }
                }
                else {
                    boolean b = this.c.w();
                    while (this.c.b()) {
                        String s;
                        if (this.g.c) {
                            s = this.c.m();
                        }
                        else {
                            s = this.c.e();
                        }
                        this.c.i(':');
                        final int b2 = JsonNamesMapKt.b(e, this.a, s);
                        boolean b4 = false;
                        Label_0472: {
                            if (b2 != -3) {
                                if (this.g.h) {
                                    final a a = this.a;
                                    final qj2.e d = e.d(b2);
                                    boolean b3 = false;
                                    Label_0373: {
                                        Label_0366: {
                                            if (d.b() || !(this.c.x() ^ true)) {
                                                if (sg2.e.a((Object)d.getKind(), (Object)qj2.h.b.a)) {
                                                    final uj2.a c = this.c;
                                                    final boolean c2 = this.g.c;
                                                    final byte t = c.t();
                                                    String c3 = null;
                                                    Label_0338: {
                                                        Label_0332: {
                                                            if (c2) {
                                                                if (t == 1 || t == 0) {
                                                                    c3 = c.l();
                                                                    break Label_0332;
                                                                }
                                                            }
                                                            else if (t == 1) {
                                                                c3 = c.k();
                                                                break Label_0332;
                                                            }
                                                            c3 = null;
                                                            break Label_0338;
                                                        }
                                                        c.c = c3;
                                                    }
                                                    if (c3 != null) {
                                                        if (JsonNamesMapKt.b(d, a, c3) == -3) {
                                                            this.c.k();
                                                            break Label_0366;
                                                        }
                                                    }
                                                }
                                                b3 = false;
                                                break Label_0373;
                                            }
                                        }
                                        b3 = true;
                                    }
                                    if (b3) {
                                        b = this.c.w();
                                        b4 = false;
                                        break Label_0472;
                                    }
                                }
                                final JsonElementMarker h = this.h;
                                n3 = b2;
                                if (h != null) {
                                    final v a2 = h.a;
                                    if (b2 < 64) {
                                        a2.c |= 1L << b2;
                                        n3 = b2;
                                    }
                                    else {
                                        final int n4 = (b2 >>> 6) - 1;
                                        final long[] d2 = a2.d;
                                        d2[n4] |= 1L << (b2 & 0x3F);
                                        n3 = b2;
                                    }
                                }
                                break Label_1313;
                            }
                            b = false;
                            b4 = true;
                        }
                        if (b4) {
                            if (!this.g.b) {
                                final m.m$a f = this.f;
                                boolean b5 = false;
                                Label_0522: {
                                    if (f != null) {
                                        if (sg2.e.a((Object)f.a, (Object)s)) {
                                            f.a = null;
                                            b5 = true;
                                            break Label_0522;
                                        }
                                    }
                                    b5 = false;
                                }
                                if (!b5) {
                                    final uj2.a c4 = this.c;
                                    c4.getClass();
                                    c4.o(kotlin.text.b.c1((CharSequence)c4.s().subSequence(0, c4.a).toString(), s, 0, 6), b.g("Encountered an unknown key '", s, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                                    throw null;
                                }
                            }
                            final uj2.a c5 = this.c;
                            final boolean c6 = this.g.c;
                            c5.getClass();
                            final ArrayList<Byte> list = new ArrayList<Byte>();
                            final byte t2 = c5.t();
                            Label_0867: {
                                if (t2 == 8 || t2 == 6) {
                                    while (true) {
                                        final byte t3 = c5.t();
                                        if (t3 == 1) {
                                            if (c6) {
                                                c5.l();
                                            }
                                            else {
                                                c5.e();
                                            }
                                        }
                                        else {
                                            boolean b6 = false;
                                            Label_0693: {
                                                if (t3 != 8) {
                                                    if (t3 != 6) {
                                                        b6 = false;
                                                        break Label_0693;
                                                    }
                                                }
                                                b6 = true;
                                            }
                                            if (b6) {
                                                list.add(t3);
                                            }
                                            else if (t3 == 9) {
                                                if (((Number)CollectionsKt___CollectionsKt.K3((List)list)).byteValue() != 8) {
                                                    final int a3 = c5.a;
                                                    final StringBuilder r = a.r("found ] instead of } at path: ");
                                                    r.append(c5.b);
                                                    throw bg.d.k((CharSequence)c5.s(), a3, r.toString());
                                                }
                                                o.n3((List)list);
                                            }
                                            else if (t3 == 7) {
                                                if (((Number)CollectionsKt___CollectionsKt.K3((List)list)).byteValue() != 6) {
                                                    final int a4 = c5.a;
                                                    final StringBuilder r2 = a.r("found } instead of ] at path: ");
                                                    r2.append(c5.b);
                                                    throw bg.d.k((CharSequence)c5.s(), a4, r2.toString());
                                                }
                                                o.n3((List)list);
                                            }
                                            else if (t3 == 10) {
                                                break;
                                            }
                                            c5.g();
                                            if (list.size() == 0) {
                                                break Label_0867;
                                            }
                                            continue;
                                        }
                                    }
                                    uj2.a.p(c5, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, (String)null, 6);
                                    throw null;
                                }
                                c5.l();
                            }
                            b = this.c.w();
                        }
                    }
                    if (b) {
                        uj2.a.p(this.c, "Unexpected trailing comma", 0, (String)null, 6);
                        throw null;
                    }
                    final JsonElementMarker h2 = this.h;
                    n3 = n2;
                    if (h2 != null) {
                        final v a5 = h2.a;
                        final int e2 = a5.a.e();
                        do {
                            final long c7 = a5.c;
                            if (c7 != -1L) {
                                n3 = Long.numberOfTrailingZeros(~c7);
                                a5.c |= 1L << n3;
                            }
                            else {
                                n3 = n2;
                                if (e2 <= 64) {
                                    break;
                                }
                                final int length = a5.d.length;
                                int n5 = 0;
                                while (true) {
                                    n3 = n2;
                                    if (n5 >= length) {
                                        break Label_1313;
                                    }
                                    final int n6 = n5 + 1;
                                    long n7 = a5.d[n5];
                                    while (n7 != -1L) {
                                        final int numberOfTrailingZeros = Long.numberOfTrailingZeros(~n7);
                                        n7 |= 1L << numberOfTrailingZeros;
                                        final int n8 = numberOfTrailingZeros + n6 * 64;
                                        if (a5.b.invoke(a5.a, n8)) {
                                            a5.d[n5] = n7;
                                            n3 = n8;
                                            break Label_1313;
                                        }
                                    }
                                    a5.d[n5] = n7;
                                    n5 = n6;
                                }
                            }
                        } while (!(boolean)a5.b.invoke(a5.a, n3));
                    }
                }
            }
            else {
                final int e3 = this.e;
                final boolean b7 = e3 % 2 != 0;
                boolean w2 = false;
                Label_1206: {
                    if (b7) {
                        if (e3 != -1) {
                            w2 = this.c.w();
                            break Label_1206;
                        }
                    }
                    else {
                        this.c.i(':');
                    }
                    w2 = false;
                }
                if (this.c.b()) {
                    if (b7) {
                        if (this.e == -1) {
                            final uj2.a c8 = this.c;
                            final int a6 = c8.a;
                            if (!(w2 ^ true)) {
                                uj2.a.p(c8, "Unexpected trailing comma", a6, (String)null, 4);
                                throw null;
                            }
                        }
                        else {
                            final uj2.a c9 = this.c;
                            final int a7 = c9.a;
                            if (!w2) {
                                uj2.a.p(c9, "Expected comma after the key-value pair", a7, (String)null, 4);
                                throw null;
                            }
                        }
                    }
                    n3 = this.e + 1;
                    this.e = n3;
                }
                else {
                    if (w2) {
                        uj2.a.p(this.c, "Expected '}', but had ',' instead", 0, (String)null, 6);
                        throw null;
                    }
                    n3 = n2;
                }
            }
        }
        if (this.b != WriteMode.MAP) {
            final h b8 = this.c.b;
            b8.b[b8.c] = n3;
        }
        return n3;
    }
    
    public final void f() {
    }
    
    public final long i() {
        return this.c.j();
    }
    
    public final int j(final SerialDescriptorImpl serialDescriptorImpl) {
        sg2.e.f((Object)serialDescriptorImpl, "enumDescriptor");
        final a a = this.a;
        final String x = this.x();
        final StringBuilder r = a.r(" at path ");
        r.append(this.c.b.a());
        return JsonNamesMapKt.c(serialDescriptorImpl, a, x, r.toString());
    }
    
    public final <T> T o(final pj2.a<T> a) {
        sg2.e.f((Object)a, "deserializer");
        try {
            if (!(a instanceof sj2.b) || this.a.a.i) {
                return (T)a.deserialize((rj2.c)this);
            }
            final String s = a0.s(a.getDescriptor(), this.a);
            final String f = this.c.f(s, this.g.c);
            pj2.a a2 = null;
            if (f != null) {
                a2 = ((sj2.b)a).a((rj2.a)this, f);
            }
            if (a2 == null) {
                return (T)a0.C((f)this, a);
            }
            this.f = new m.m$a(s);
            return (T)a2.deserialize((rj2.c)this);
        }
        catch (final MissingFieldException ex) {
            final List<String> missingFields = ex.getMissingFields();
            final StringBuilder sb = new StringBuilder();
            sb.append(((Throwable)ex).getMessage());
            sb.append(" at path: ");
            sb.append(this.c.b.a());
            throw new MissingFieldException(missingFields, sb.toString(), (Throwable)ex);
        }
    }
    
    public final short p() {
        final long j = this.c.j();
        final short n = (short)j;
        if (j == n) {
            return n;
        }
        final uj2.a c = this.c;
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse short for input '");
        sb.append(j);
        sb.append('\'');
        uj2.a.p(c, sb.toString(), 0, (String)null, 6);
        throw null;
    }
    
    public final double q() {
        final uj2.a c = this.c;
        final String l = c.l();
        final boolean b = false;
        try {
            final double double1 = Double.parseDouble(l);
            if (!this.a.a.k) {
                int n = b ? 1 : 0;
                if (!Double.isInfinite(double1)) {
                    n = (b ? 1 : 0);
                    if (!Double.isNaN(double1)) {
                        n = 1;
                    }
                }
                if (n == 0) {
                    bg.d.L0(this.c, (Number)double1);
                    throw null;
                }
            }
            return double1;
        }
        catch (final IllegalArgumentException ex) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to parse type '");
            sb.append("double");
            sb.append("' for input '");
            sb.append(l);
            sb.append('\'');
            uj2.a.p(c, sb.toString(), 0, (String)null, 6);
            throw null;
        }
    }
    
    public final char s() {
        final String l = this.c.l();
        if (l.length() == 1) {
            return l.charAt(0);
        }
        uj2.a.p(this.c, b.g("Expected single char, but got '", l, '\''), 0, (String)null, 6);
        throw null;
    }
    
    public final String x() {
        String s;
        if (this.g.c) {
            s = this.c.m();
        }
        else {
            s = this.c.k();
        }
        return s;
    }
    
    public final <T> T z(final qj2.e e, int c, final pj2.a<T> a, final T t) {
        sg2.e.f((Object)e, "descriptor");
        sg2.e.f((Object)a, "deserializer");
        if (this.b == WriteMode.MAP && (c & 0x1) == 0x0) {
            c = 1;
        }
        else {
            c = 0;
        }
        if (c != 0) {
            final h b = this.c.b;
            final int[] b2 = b.b;
            final int c2 = b.c;
            if (b2[c2] == -2) {
                b.a[c2] = h$a.a;
            }
        }
        final T o = this.o(a);
        if (c != 0) {
            final h b3 = this.c.b;
            final int[] b4 = b3.b;
            c = b3.c;
            if (b4[c] != -2) {
                ++c;
                if ((b3.c = c) == b3.a.length) {
                    b3.b();
                }
            }
            final Object[] a2 = b3.a;
            c = b3.c;
            a2[c] = o;
            b3.b[c] = -2;
        }
        return o;
    }
}
