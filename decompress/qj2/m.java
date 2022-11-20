// 
// Decompiled by Procyon v0.6.0
// 

package qj2;

import kotlinx.serialization.MissingFieldException;
import nj2.c;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import oj2.v;
import dg2.o;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.ArrayList;
import mj2.h$b;
import kotlinx.serialization.json.internal.JsonNamesMapKt;
import pj2.g;
import kotlinx.serialization.json.internal.JsonElementMarker;
import pj2.e;
import b6.h;
import kotlinx.serialization.json.internal.WriteMode;
import pj2.a;
import pj2.f;
import android.support.v4.media.b;

public final class m extends android.support.v4.media.b implements f
{
    public final pj2.a g;
    public final WriteMode h;
    public final qj2.a i;
    public final h j;
    public int k;
    public a l;
    public final e m;
    public final JsonElementMarker n;
    
    public m(final pj2.a g, final WriteMode h, final qj2.a i, final mj2.e e, final a l) {
        ng2.e.f((Object)g, "json");
        ng2.e.f((Object)h, "mode");
        ng2.e.f((Object)i, "lexer");
        ng2.e.f((Object)e, "descriptor");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = g.b;
        this.k = -1;
        this.l = l;
        final e a = g.a;
        this.m = a;
        JsonElementMarker n;
        if (a.f) {
            n = null;
        }
        else {
            n = new JsonElementMarker(e);
        }
        this.n = n;
    }
    
    public final g B() {
        return new kotlinx.serialization.json.internal.a(this.g.a, this.i).b();
    }
    
    public final int C() {
        final long j = this.i.j();
        final int n = (int)j;
        if (j == n) {
            return n;
        }
        final qj2.a i = this.i;
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse int for input '");
        sb.append(j);
        sb.append('\'');
        qj2.a.p(i, sb.toString(), 0, null, 6);
        throw null;
    }
    
    public final int H(final mj2.e e) {
        ng2.e.f((Object)e, "descriptor");
        final int n = b.a[this.h.ordinal()];
        final int n2 = -1;
        int n3 = 0;
        Label_1326: {
            if (n != 2) {
                if (n != 4) {
                    final boolean w = this.i.w();
                    if (this.i.b()) {
                        n3 = this.k;
                        if (n3 != -1 && !w) {
                            qj2.a.p(this.i, "Expected end of the array or comma", 0, null, 6);
                            throw null;
                        }
                        ++n3;
                        this.k = n3;
                    }
                    else {
                        if (w) {
                            qj2.a.p(this.i, "Unexpected trailing comma", 0, null, 6);
                            throw null;
                        }
                        n3 = n2;
                    }
                }
                else {
                    boolean b = this.i.w();
                    while (this.i.b()) {
                        String s;
                        if (this.m.c) {
                            s = this.i.m();
                        }
                        else {
                            s = this.i.e();
                        }
                        this.i.i(':');
                        final int b2 = JsonNamesMapKt.b(e, this.g, s);
                        boolean b4 = false;
                        Label_0478: {
                            if (b2 != -3) {
                                if (this.m.h) {
                                    final pj2.a g = this.g;
                                    final mj2.e d = e.d(b2);
                                    boolean b3 = false;
                                    Label_0379: {
                                        Label_0372: {
                                            if (d.b() || !(this.i.x() ^ true)) {
                                                if (ng2.e.a((Object)d.getKind(), (Object)h$b.a)) {
                                                    final qj2.a i = this.i;
                                                    final boolean c = this.m.c;
                                                    final byte t = i.t();
                                                    String c2 = null;
                                                    Label_0342: {
                                                        Label_0335: {
                                                            if (c) {
                                                                if (t == 1 || t == 0) {
                                                                    c2 = i.l();
                                                                    break Label_0335;
                                                                }
                                                            }
                                                            else if (t == 1) {
                                                                c2 = i.k();
                                                                break Label_0335;
                                                            }
                                                            c2 = null;
                                                            break Label_0342;
                                                        }
                                                        i.c = c2;
                                                    }
                                                    if (c2 != null) {
                                                        if (JsonNamesMapKt.b(d, g, c2) == -3) {
                                                            this.i.k();
                                                            break Label_0372;
                                                        }
                                                    }
                                                }
                                                b3 = false;
                                                break Label_0379;
                                            }
                                        }
                                        b3 = true;
                                    }
                                    if (b3) {
                                        b = this.i.w();
                                        b4 = false;
                                        break Label_0478;
                                    }
                                }
                                final JsonElementMarker n4 = this.n;
                                n3 = b2;
                                if (n4 != null) {
                                    final v a = n4.a;
                                    if (b2 < 64) {
                                        a.c |= 1L << b2;
                                        n3 = b2;
                                    }
                                    else {
                                        final int n5 = (b2 >>> 6) - 1;
                                        final long[] d2 = a.d;
                                        d2[n5] |= 1L << (b2 & 0x3F);
                                        n3 = b2;
                                    }
                                }
                                break Label_1326;
                            }
                            b = false;
                            b4 = true;
                        }
                        if (b4) {
                            if (!this.m.b) {
                                final a l = this.l;
                                boolean b5 = false;
                                Label_0532: {
                                    if (l != null) {
                                        if (ng2.e.a((Object)l.a, (Object)s)) {
                                            l.a = null;
                                            b5 = true;
                                            break Label_0532;
                                        }
                                    }
                                    b5 = false;
                                }
                                if (!b5) {
                                    final qj2.a j = this.i;
                                    j.getClass();
                                    j.o(kotlin.text.b.W0((CharSequence)j.s().subSequence(0, j.a).toString(), s, 0, 6), aq2.a.m("Encountered an unknown key '", s, '\''), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
                                    throw null;
                                }
                            }
                            final qj2.a k = this.i;
                            final boolean c3 = this.m.c;
                            k.getClass();
                            final ArrayList<Byte> list = new ArrayList<Byte>();
                            final byte t2 = k.t();
                            Label_0881: {
                                if (t2 == 8 || t2 == 6) {
                                    while (true) {
                                        final byte t3 = k.t();
                                        if (t3 == 1) {
                                            if (c3) {
                                                k.l();
                                            }
                                            else {
                                                k.e();
                                            }
                                        }
                                        else {
                                            boolean b6 = false;
                                            Label_0704: {
                                                if (t3 != 8) {
                                                    if (t3 != 6) {
                                                        b6 = false;
                                                        break Label_0704;
                                                    }
                                                }
                                                b6 = true;
                                            }
                                            if (b6) {
                                                list.add(t3);
                                            }
                                            else if (t3 == 9) {
                                                if (((Number)CollectionsKt___CollectionsKt.c5((List)list)).byteValue() != 8) {
                                                    final int a2 = k.a;
                                                    final StringBuilder t4 = a.t("found ] instead of } at path: ");
                                                    t4.append(k.b);
                                                    throw kotlinx.coroutines.channels.a.f(k.s(), a2, t4.toString());
                                                }
                                                o.F4((List)list);
                                            }
                                            else if (t3 == 7) {
                                                if (((Number)CollectionsKt___CollectionsKt.c5((List)list)).byteValue() != 6) {
                                                    final int a3 = k.a;
                                                    final StringBuilder t5 = a.t("found } instead of ] at path: ");
                                                    t5.append(k.b);
                                                    throw kotlinx.coroutines.channels.a.f(k.s(), a3, t5.toString());
                                                }
                                                o.F4((List)list);
                                            }
                                            else if (t3 == 10) {
                                                break;
                                            }
                                            k.g();
                                            if (list.size() == 0) {
                                                break Label_0881;
                                            }
                                            continue;
                                        }
                                    }
                                    qj2.a.p(k, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                    throw null;
                                }
                                k.l();
                            }
                            b = this.i.w();
                        }
                    }
                    if (b) {
                        qj2.a.p(this.i, "Unexpected trailing comma", 0, null, 6);
                        throw null;
                    }
                    final JsonElementMarker n6 = this.n;
                    n3 = n2;
                    if (n6 != null) {
                        final v a4 = n6.a;
                        final int e2 = a4.a.e();
                        do {
                            final long c4 = a4.c;
                            if (c4 != -1L) {
                                n3 = Long.numberOfTrailingZeros(~c4);
                                a4.c |= 1L << n3;
                            }
                            else {
                                n3 = n2;
                                if (e2 <= 64) {
                                    break;
                                }
                                final int length = a4.d.length;
                                int n7 = 0;
                                while (true) {
                                    n3 = n2;
                                    if (n7 >= length) {
                                        break Label_1326;
                                    }
                                    final int n8 = n7 + 1;
                                    long n9 = a4.d[n7];
                                    while (n9 != -1L) {
                                        final int numberOfTrailingZeros = Long.numberOfTrailingZeros(~n9);
                                        n9 |= 1L << numberOfTrailingZeros;
                                        final int n10 = numberOfTrailingZeros + n8 * 64;
                                        if (a4.b.invoke((Object)a4.a, (Object)n10)) {
                                            a4.d[n7] = n9;
                                            n3 = n10;
                                            break Label_1326;
                                        }
                                    }
                                    a4.d[n7] = n9;
                                    n7 = n8;
                                }
                            }
                        } while (!(boolean)a4.b.invoke((Object)a4.a, (Object)n3));
                    }
                }
            }
            else {
                final int m = this.k;
                final boolean b7 = m % 2 != 0;
                boolean w2 = false;
                Label_1220: {
                    if (b7) {
                        if (m != -1) {
                            w2 = this.i.w();
                            break Label_1220;
                        }
                    }
                    else {
                        this.i.i(':');
                    }
                    w2 = false;
                }
                if (this.i.b()) {
                    if (b7) {
                        if (this.k == -1) {
                            final qj2.a i2 = this.i;
                            final int a5 = i2.a;
                            if (!(w2 ^ true)) {
                                qj2.a.p(i2, "Unexpected trailing comma", a5, null, 4);
                                throw null;
                            }
                        }
                        else {
                            final qj2.a i3 = this.i;
                            final int a6 = i3.a;
                            if (!w2) {
                                qj2.a.p(i3, "Expected comma after the key-value pair", a6, null, 4);
                                throw null;
                            }
                        }
                    }
                    n3 = this.k + 1;
                    this.k = n3;
                }
                else {
                    if (w2) {
                        qj2.a.p(this.i, "Expected '}', but had ',' instead", 0, null, 6);
                        throw null;
                    }
                    n3 = n2;
                }
            }
        }
        if (this.h != WriteMode.MAP) {
            final qj2.h b8 = this.i.b;
            b8.b[b8.c] = n3;
        }
        return n3;
    }
    
    public final float O() {
        final qj2.a i = this.i;
        final String l = i.l();
        final boolean b = false;
        try {
            final float float1 = Float.parseFloat(l);
            if (!this.g.a.k) {
                int n = b ? 1 : 0;
                if (!Float.isInfinite(float1)) {
                    n = (b ? 1 : 0);
                    if (!Float.isNaN(float1)) {
                        n = 1;
                    }
                }
                if (n == 0) {
                    kotlinx.coroutines.channels.a.m(this.i, float1);
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
            qj2.a.p(i, sb.toString(), 0, null, 6);
            throw null;
        }
    }
    
    public final boolean P() {
        boolean b2;
        if (this.m.c) {
            final qj2.a i = this.i;
            int v = i.v();
            if (v == i.s().length()) {
                qj2.a.p(i, "EOF", 0, null, 6);
                throw null;
            }
            boolean b;
            if (i.s().charAt(v) == '\"') {
                ++v;
                b = true;
            }
            else {
                b = false;
            }
            b2 = i.c(v);
            if (b) {
                if (i.a == i.s().length()) {
                    qj2.a.p(i, "EOF", 0, null, 6);
                    throw null;
                }
                if (i.s().charAt(i.a) != '\"') {
                    qj2.a.p(i, "Expected closing quotation mark", 0, null, 6);
                    throw null;
                }
                ++i.a;
                b2 = b2;
            }
        }
        else {
            final qj2.a j = this.i;
            b2 = j.c(j.v());
        }
        return b2;
    }
    
    public final boolean W() {
        final JsonElementMarker n = this.n;
        final boolean b = false;
        final boolean b2 = n != null && n.b;
        boolean b3 = b;
        if (!b2) {
            b3 = b;
            if (this.i.x()) {
                b3 = true;
            }
        }
        return b3;
    }
    
    public final nj2.a a(final mj2.e e) {
        ng2.e.f((Object)e, "descriptor");
        final WriteMode q1 = xd.a.q1(e, this.g);
        final qj2.h b = this.i.b;
        b.getClass();
        final int c = b.c + 1;
        b.c = c;
        if (c == b.a.length) {
            b.b();
        }
        b.a[c] = e;
        this.i.i(q1.begin);
        if (this.i.t() != 4) {
            final int n = qj2.m.b.a[q1.ordinal()];
            m m;
            if (n != 1 && n != 2 && n != 3) {
                if (this.h == q1 && this.g.a.f) {
                    m = this;
                }
                else {
                    m = new m(this.g, q1, this.i, e, this.l);
                }
            }
            else {
                m = new m(this.g, q1, this.i, e, this.l);
            }
            return (nj2.a)m;
        }
        qj2.a.p(this.i, "Unexpected leading comma", 0, null, 6);
        throw null;
    }
    
    public final pj2.a a0() {
        return this.g;
    }
    
    public final h c() {
        return this.j;
    }
    
    public final void d(final mj2.e e) {
        ng2.e.f((Object)e, "descriptor");
        if (this.g.a.b && e.e() == 0) {
            while (this.H(e) != -1) {}
        }
        this.i.i(this.h.end);
        final qj2.h b = this.i.b;
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
    
    public final byte d0() {
        final long j = this.i.j();
        final byte b = (byte)j;
        if (j == b) {
            return b;
        }
        final qj2.a i = this.i;
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse byte for input '");
        sb.append(j);
        sb.append('\'');
        qj2.a.p(i, sb.toString(), 0, null, 6);
        throw null;
    }
    
    public final void f() {
    }
    
    public final long g() {
        return this.i.j();
    }
    
    public final int h(final SerialDescriptorImpl serialDescriptorImpl) {
        ng2.e.f((Object)serialDescriptorImpl, "enumDescriptor");
        final pj2.a g = this.g;
        final String w = this.w();
        final StringBuilder t = a.t(" at path ");
        t.append(this.i.b.a());
        return JsonNamesMapKt.c(serialDescriptorImpl, g, w, t.toString());
    }
    
    public final <T> T l(final lj2.a<T> a) {
        ng2.e.f((Object)a, "deserializer");
        try {
            if (!(a instanceof oj2.b) || this.g.a.i) {
                return (T)a.deserialize((c)this);
            }
            final String n = p2.b.n(a.getDescriptor(), this.g);
            final String f = this.i.f(n, this.m.c);
            lj2.a a2 = null;
            if (f != null) {
                a2 = ((oj2.b)a).a((nj2.a)this, f);
            }
            if (a2 == null) {
                return (T)p2.b.x((f)this, (lj2.a)a);
            }
            this.l = new a(n);
            return (T)a2.deserialize((c)this);
        }
        catch (final MissingFieldException ex) {
            final List<String> missingFields = ex.getMissingFields();
            final StringBuilder sb = new StringBuilder();
            sb.append(ex.getMessage());
            sb.append(" at path: ");
            sb.append(this.i.b.a());
            throw new MissingFieldException(missingFields, sb.toString(), ex);
        }
    }
    
    public final short r() {
        final long j = this.i.j();
        final short n = (short)j;
        if (j == n) {
            return n;
        }
        final qj2.a i = this.i;
        final StringBuilder sb = new StringBuilder();
        sb.append("Failed to parse short for input '");
        sb.append(j);
        sb.append('\'');
        qj2.a.p(i, sb.toString(), 0, null, 6);
        throw null;
    }
    
    public final double s() {
        final qj2.a i = this.i;
        final String l = i.l();
        final boolean b = false;
        try {
            final double double1 = Double.parseDouble(l);
            if (!this.g.a.k) {
                int n = b ? 1 : 0;
                if (!Double.isInfinite(double1)) {
                    n = (b ? 1 : 0);
                    if (!Double.isNaN(double1)) {
                        n = 1;
                    }
                }
                if (n == 0) {
                    kotlinx.coroutines.channels.a.m(this.i, double1);
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
            qj2.a.p(i, sb.toString(), 0, null, 6);
            throw null;
        }
    }
    
    public final char t() {
        final String l = this.i.l();
        if (l.length() == 1) {
            return l.charAt(0);
        }
        qj2.a.p(this.i, aq2.a.m("Expected single char, but got '", l, '\''), 0, null, 6);
        throw null;
    }
    
    public final <T> T u(final mj2.e e, int c, final lj2.a<T> a, final T t) {
        ng2.e.f((Object)e, "descriptor");
        ng2.e.f((Object)a, "deserializer");
        if (this.h == WriteMode.MAP && (c & 0x1) == 0x0) {
            c = 1;
        }
        else {
            c = 0;
        }
        if (c != 0) {
            final qj2.h b = this.i.b;
            final int[] b2 = b.b;
            final int c2 = b.c;
            if (b2[c2] == -2) {
                b.a[c2] = qj2.h.a.a;
            }
        }
        final T l = this.l(a);
        if (c != 0) {
            final qj2.h b3 = this.i.b;
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
            a2[c] = l;
            b3.b[c] = -2;
        }
        return l;
    }
    
    public final String w() {
        String s;
        if (this.m.c) {
            s = this.i.m();
        }
        else {
            s = this.i.k();
        }
        return s;
    }
    
    public static final class a
    {
        public String a;
        
        public a(final String a) {
            this.a = a;
        }
    }
    
    public final class b
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[WriteMode.values().length];
            a2[WriteMode.LIST.ordinal()] = 1;
            a2[WriteMode.MAP.ordinal()] = 2;
            a2[WriteMode.POLY_OBJ.ordinal()] = 3;
            a2[WriteMode.OBJ.ordinal()] = 4;
            a = a2;
        }
    }
}
