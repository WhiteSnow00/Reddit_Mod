// 
// Decompiled by Procyon v0.6.0
// 

package oc;

import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StyleSpan;
import android.text.SpannableString;
import android.graphics.Color;
import nc.a$a;
import java.util.Comparator;
import java.util.Collections;
import android.text.Layout$Alignment;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.nio.ByteBuffer;
import bd.d0;
import android.util.Log;
import nc.a;
import java.util.List;
import bd.r;
import bd.s;

public final class b extends oc.c
{
    public final s g;
    public final r h;
    public int i;
    public final int j;
    public final b[] k;
    public b l;
    public List<nc.a> m;
    public List<nc.a> n;
    public c o;
    public int p;
    
    public b(int i, final List<byte[]> list) {
        this.g = new s();
        this.h = new r();
        this.i = -1;
        int j = i;
        if (i == -1) {
            j = 1;
        }
        this.j = j;
        if (list == null || list.size() != 1 || ((byte[])list.get(0)).length != 1 || ((byte[])list.get(0))[0] == 1) {}
        this.k = new b[8];
        for (i = 0; i < 8; ++i) {
            this.k[i] = new b();
        }
        this.l = this.k[0];
    }
    
    @Override
    public final d e() {
        final List<nc.a> m = this.m;
        (this.n = m).getClass();
        return new d((List)m);
    }
    
    @Override
    public final void f(final oc.c.a a) {
        final ByteBuffer h = a.h;
        h.getClass();
        this.g.z(h.limit(), h.array());
        while (true) {
            final s g = this.g;
            if (g.c - g.b < 3) {
                break;
            }
            final int n = g.r() & 0x7;
            final int n2 = n & 0x3;
            boolean b = false;
            final boolean b2 = (n & 0x4) == 0x4;
            final byte b3 = (byte)this.g.r();
            final byte b4 = (byte)this.g.r();
            if (n2 != 2 && n2 != 3) {
                continue;
            }
            if (!b2) {
                continue;
            }
            if (n2 == 3) {
                this.i();
                final int i = (b3 & 0xC0) >> 6;
                final int j = this.i;
                if (j != -1 && i != (j + 1) % 4) {
                    this.k();
                    final int k = this.i;
                    final StringBuilder sb = new StringBuilder(71);
                    sb.append("Sequence number discontinuity. previous=");
                    sb.append(k);
                    sb.append(" current=");
                    sb.append(i);
                    Log.w("Cea708Decoder", sb.toString());
                }
                this.i = i;
                int n3;
                if ((n3 = (b3 & 0x3F)) == 0) {
                    n3 = 64;
                }
                final c o = new c(i, n3);
                this.o = o;
                o.c[o.d++] = b4;
            }
            else {
                if (n2 == 2) {
                    b = true;
                }
                d0.c(b);
                final c o2 = this.o;
                if (o2 == null) {
                    Log.e("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    continue;
                }
                final byte[] c = o2.c;
                final int d = o2.d;
                final int n4 = d + 1;
                c[d] = b3;
                o2.d = n4 + 1;
                c[n4] = b4;
            }
            final c o3 = this.o;
            if (o3.d != o3.b * 2 - 1) {
                continue;
            }
            this.i();
        }
    }
    
    @Override
    public final void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        this.p = 0;
        this.l = this.k[0];
        this.k();
        this.o = null;
    }
    
    @Override
    public final boolean h() {
        return this.m != this.n;
    }
    
    public final void i() {
        final c o = this.o;
        if (o == null) {
            return;
        }
        final int d = o.d;
        final int n = o.b * 2 - 1;
        if (d != n) {
            final int a = o.a;
            final StringBuilder sb = new StringBuilder(115);
            sb.append("DtvCcPacket ended prematurely; size is ");
            sb.append(n);
            sb.append(", but current index is ");
            sb.append(d);
            sb.append(" (sequence number ");
            sb.append(a);
            sb.append(");");
            Log.d("Cea708Decoder", sb.toString());
        }
        final r h = this.h;
        final c o2 = this.o;
        h.j(o2.d, o2.c);
        final r h2 = this.h;
        int n2 = 3;
        final int g = h2.g(3);
        final int g2 = this.h.g(5);
        int n3 = 7;
        int n4;
        if ((n4 = g) == 7) {
            this.h.m(2);
            final int g3 = this.h.g(6);
            if ((n4 = g3) < 7) {
                ag0.a.u(44, "Invalid extended service number: ", g3, "Cea708Decoder");
                n4 = g3;
            }
        }
        if (g2 == 0) {
            if (n4 != 0) {
                final StringBuilder sb2 = new StringBuilder(59);
                sb2.append("serviceNumber is non-zero (");
                sb2.append(n4);
                sb2.append(") when blockSize is 0");
                Log.w("Cea708Decoder", sb2.toString());
            }
        }
        else if (n4 == this.j) {
            final int e = this.h.e();
            int n5 = 0;
            while (this.h.b() > 0 && this.h.e() < g2 * 8 + e) {
                int g4 = this.h.g(8);
                if (g4 != 16) {
                    if (g4 <= 31) {
                        if (g4 == 0) {
                            continue;
                        }
                        if (g4 == n2) {
                            this.m = this.j();
                            continue;
                        }
                        if (g4 != 8) {
                            switch (g4) {
                                case 12: {
                                    this.k();
                                    continue;
                                }
                                case 13: {
                                    this.l.a('\n');
                                }
                                case 14: {
                                    continue;
                                }
                                default: {
                                    if (g4 >= 17 && g4 <= 23) {
                                        ag0.a.u(55, "Currently unsupported COMMAND_EXT1 Command: ", g4, "Cea708Decoder");
                                        this.h.m(8);
                                        continue;
                                    }
                                    if (g4 >= 24 && g4 <= 31) {
                                        ag0.a.u(54, "Currently unsupported COMMAND_P16 Command: ", g4, "Cea708Decoder");
                                        this.h.m(16);
                                        continue;
                                    }
                                    ag0.a.u(31, "Invalid C0 command: ", g4, "Cea708Decoder");
                                    continue;
                                }
                            }
                        }
                        else {
                            final b l = this.l;
                            final int length = l.b.length();
                            if (length > 0) {
                                l.b.delete(length - 1, length);
                                continue;
                            }
                            continue;
                        }
                    }
                    else {
                        if (g4 <= 127) {
                            if (g4 == 127) {
                                this.l.a('\u266b');
                            }
                            else {
                                this.l.a((char)(g4 & 0xFF));
                            }
                            n5 = 1;
                            continue;
                        }
                        int n6 = 0;
                        Label_2057: {
                            if (g4 <= 159) {
                                n6 = n2;
                            Label_1857:
                                while (true) {
                                    switch (g4) {
                                        default: {
                                            n5 = 1;
                                            ag0.a.u(31, "Invalid C1 command: ", g4, "Cea708Decoder");
                                            n6 = n2;
                                            break Label_2057;
                                        }
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159: {
                                            final int p = g4 - 152;
                                            final b b = this.k[p];
                                            this.h.m(2);
                                            final boolean f = this.h.f();
                                            final boolean f2 = this.h.f();
                                            this.h.f();
                                            final int g5 = this.h.g(n2);
                                            final boolean f3 = this.h.f();
                                            final int g6 = this.h.g(n3);
                                            final int g7 = this.h.g(8);
                                            final int g8 = this.h.g(4);
                                            int g9 = this.h.g(4);
                                            this.h.m(2);
                                            this.h.g(6);
                                            this.h.m(2);
                                            final int g10 = this.h.g(3);
                                            int g11 = this.h.g(3);
                                            b.c = true;
                                            b.d = f;
                                            b.k = f2;
                                            b.e = g5;
                                            b.f = f3;
                                            b.g = g6;
                                            b.h = g7;
                                            b.i = g8;
                                            final int j = b.j;
                                            ++g9;
                                            if (j != g9) {
                                                b.j = g9;
                                                while ((f2 && b.a.size() >= b.j) || b.a.size() >= 15) {
                                                    b.a.remove(0);
                                                }
                                            }
                                            if (g10 != 0 && b.m != g10) {
                                                b.m = g10;
                                                final int n7 = g10 - 1;
                                                final int o3 = oc.b.b.C[n7];
                                                final boolean b2 = oc.b.b.B[n7];
                                                final int n8 = oc.b.b.z[n7];
                                                final int n9 = oc.b.b.A[n7];
                                                final int i = oc.b.b.y[n7];
                                                b.o = o3;
                                                b.l = i;
                                            }
                                            if (g11 != 0 && b.n != g11) {
                                                b.n = g11;
                                                --g11;
                                                final int n10 = oc.b.b.E[g11];
                                                final int n11 = oc.b.b.D[g11];
                                                b.e(false, false);
                                                b.f(oc.b.b.w, oc.b.b.F[g11]);
                                            }
                                            if (this.p != p) {
                                                this.p = p;
                                                this.l = this.k[p];
                                                break;
                                            }
                                            break;
                                        }
                                        case 151: {
                                            if (!this.l.c) {
                                                this.h.m(32);
                                                break;
                                            }
                                            final int c = b.c(this.h.g(2), this.h.g(2), this.h.g(2), this.h.g(2));
                                            this.h.g(2);
                                            b.c(this.h.g(2), this.h.g(2), this.h.g(2), 0);
                                            this.h.f();
                                            this.h.f();
                                            this.h.g(2);
                                            this.h.g(2);
                                            final int g12 = this.h.g(2);
                                            this.h.m(8);
                                            final b k = this.l;
                                            k.o = c;
                                            k.l = g12;
                                            break;
                                        }
                                        case 146: {
                                            if (!this.l.c) {
                                                this.h.m(16);
                                                break;
                                            }
                                            this.h.m(4);
                                            final int g13 = this.h.g(4);
                                            this.h.m(2);
                                            this.h.g(6);
                                            final b m = this.l;
                                            if (m.v != g13) {
                                                m.a('\n');
                                            }
                                            m.v = g13;
                                            break;
                                        }
                                        case 145: {
                                            if (!this.l.c) {
                                                this.h.m(24);
                                                break;
                                            }
                                            final int c2 = b.c(this.h.g(2), this.h.g(2), this.h.g(2), this.h.g(2));
                                            final int c3 = b.c(this.h.g(2), this.h.g(2), this.h.g(2), this.h.g(2));
                                            this.h.m(2);
                                            b.c(this.h.g(2), this.h.g(2), this.h.g(2), 0);
                                            this.l.f(c2, c3);
                                            break;
                                        }
                                        case 144: {
                                            if (!this.l.c) {
                                                this.h.m(16);
                                                break;
                                            }
                                            this.h.g(4);
                                            this.h.g(2);
                                            this.h.g(2);
                                            final boolean f4 = this.h.f();
                                            final boolean f5 = this.h.f();
                                            this.h.g(3);
                                            this.h.g(3);
                                            this.l.e(f4, f5);
                                            n6 = 3;
                                            break Label_1857;
                                        }
                                        case 140: {
                                            int n12 = 1;
                                            while (true) {
                                                n6 = n2;
                                                if (n12 > 8) {
                                                    break Label_1857;
                                                }
                                                if (this.h.f()) {
                                                    this.k[8 - n12].d();
                                                }
                                                ++n12;
                                            }
                                            break;
                                        }
                                        case 139: {
                                            int n13 = 1;
                                            while (true) {
                                                n6 = n2;
                                                if (n13 > 8) {
                                                    break Label_1857;
                                                }
                                                if (this.h.f()) {
                                                    final b b3 = this.k[8 - n13];
                                                    b3.d ^= true;
                                                }
                                                ++n13;
                                            }
                                            break;
                                        }
                                        case 138: {
                                            int n14 = 1;
                                            while (true) {
                                                n6 = n2;
                                                if (n14 > 8) {
                                                    break Label_1857;
                                                }
                                                if (this.h.f()) {
                                                    this.k[8 - n14].d = false;
                                                }
                                                ++n14;
                                            }
                                            break;
                                        }
                                        case 137: {
                                            int n15 = 1;
                                            while (true) {
                                                n6 = n2;
                                                if (n15 > 8) {
                                                    break Label_1857;
                                                }
                                                if (this.h.f()) {
                                                    this.k[8 - n15].d = true;
                                                }
                                                ++n15;
                                            }
                                            break;
                                        }
                                        case 142: {
                                            n5 = 1;
                                            break Label_2057;
                                        }
                                        case 143: {
                                            this.k();
                                            n6 = n2;
                                            continue Label_1857;
                                        }
                                        case 141: {
                                            this.h.m(8);
                                            n6 = n2;
                                            continue Label_1857;
                                        }
                                        case 136: {
                                            final int n16 = 1;
                                            int n17 = 1;
                                            while (true) {
                                                n5 = n16;
                                                n6 = n2;
                                                if (n17 > 8) {
                                                    break Label_2057;
                                                }
                                                if (this.h.f()) {
                                                    final b b4 = this.k[8 - n17];
                                                    b4.a.clear();
                                                    b4.b.clear();
                                                    b4.p = -1;
                                                    b4.q = -1;
                                                    b4.r = -1;
                                                    b4.t = -1;
                                                    b4.v = 0;
                                                }
                                                ++n17;
                                            }
                                            break;
                                        }
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135: {
                                            final int n18 = 1;
                                            g4 -= 128;
                                            n5 = n18;
                                            n6 = n2;
                                            if (this.p != g4) {
                                                this.p = g4;
                                                this.l = this.k[g4];
                                                n5 = n18;
                                                n6 = n2;
                                            }
                                            break Label_2057;
                                        }
                                    }
                                    n6 = 3;
                                    continue Label_1857;
                                }
                            }
                            if (g4 <= 255) {
                                this.l.a((char)(g4 & 0xFF));
                                n5 = 1;
                                n6 = n2;
                            }
                            else {
                                ag0.a.u(33, "Invalid base command: ", g4, "Cea708Decoder");
                                n6 = n2;
                            }
                        }
                        n2 = n6;
                    }
                }
                else {
                    final int g14 = this.h.g(8);
                    if (g14 <= 31) {
                        if (g14 > 7) {
                            if (g14 <= 15) {
                                this.h.m(8);
                            }
                            else if (g14 <= 23) {
                                this.h.m(16);
                            }
                            else if (g14 <= 31) {
                                this.h.m(24);
                            }
                        }
                    }
                    else {
                        n3 = 7;
                        int n19;
                        if (g14 <= 127) {
                            Label_2673: {
                                if (g14 != 32) {
                                    if (g14 != 33) {
                                        if (g14 != 37) {
                                            if (g14 != 42) {
                                                if (g14 != 44) {
                                                    if (g14 != 63) {
                                                        if (g14 != 57) {
                                                            if (g14 != 58) {
                                                                if (g14 != 60) {
                                                                    if (g14 != 61) {
                                                                        switch (g14) {
                                                                            default: {
                                                                                switch (g14) {
                                                                                    default: {
                                                                                        ag0.a.u(33, "Invalid G2 character: ", g14, "Cea708Decoder");
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 127: {
                                                                                        this.l.a('\u250c');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 126: {
                                                                                        this.l.a('\u2518');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 125: {
                                                                                        this.l.a('\u2500');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 124: {
                                                                                        this.l.a('\u2514');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 123: {
                                                                                        this.l.a('\u2510');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 122: {
                                                                                        this.l.a('\u2502');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 121: {
                                                                                        this.l.a('\u215e');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 120: {
                                                                                        this.l.a('\u215d');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 119: {
                                                                                        this.l.a('\u215c');
                                                                                        break Label_2673;
                                                                                    }
                                                                                    case 118: {
                                                                                        this.l.a('\u215b');
                                                                                        break Label_2673;
                                                                                    }
                                                                                }
                                                                                break;
                                                                            }
                                                                            case 53: {
                                                                                this.l.a('\u2022');
                                                                                break;
                                                                            }
                                                                            case 52: {
                                                                                this.l.a('\u201d');
                                                                                break;
                                                                            }
                                                                            case 51: {
                                                                                this.l.a('\u201c');
                                                                                break;
                                                                            }
                                                                            case 50: {
                                                                                this.l.a('\u2019');
                                                                                break;
                                                                            }
                                                                            case 49: {
                                                                                this.l.a('\u2018');
                                                                                break;
                                                                            }
                                                                            case 48: {
                                                                                this.l.a('\u2588');
                                                                                break;
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        this.l.a('\u2120');
                                                                    }
                                                                }
                                                                else {
                                                                    this.l.a('\u0153');
                                                                }
                                                            }
                                                            else {
                                                                this.l.a('\u0161');
                                                            }
                                                        }
                                                        else {
                                                            this.l.a('\u2122');
                                                        }
                                                    }
                                                    else {
                                                        this.l.a('\u0178');
                                                    }
                                                }
                                                else {
                                                    this.l.a('\u0152');
                                                }
                                            }
                                            else {
                                                this.l.a('\u0160');
                                            }
                                        }
                                        else {
                                            this.l.a('\u2026');
                                        }
                                    }
                                    else {
                                        this.l.a(' ');
                                    }
                                }
                                else {
                                    this.l.a(' ');
                                }
                            }
                            n19 = 1;
                        }
                        else {
                            if (g14 > 159) {
                                if (g14 <= 255) {
                                    if (g14 == 160) {
                                        this.l.a('\u33c4');
                                    }
                                    else {
                                        ag0.a.u(33, "Invalid G3 character: ", g14, "Cea708Decoder");
                                        this.l.a('_');
                                    }
                                    n5 = 1;
                                }
                                else {
                                    ag0.a.u(37, "Invalid extended command: ", g14, "Cea708Decoder");
                                }
                                continue;
                            }
                            if (g14 <= 135) {
                                this.h.m(32);
                                n19 = n5;
                            }
                            else if (g14 <= 143) {
                                this.h.m(40);
                                n19 = n5;
                            }
                            else {
                                n19 = n5;
                                if (g14 <= 159) {
                                    this.h.m(2);
                                    this.h.m(this.h.g(6) * 8);
                                    continue;
                                }
                            }
                        }
                        n5 = n19;
                    }
                }
                n3 = 7;
            }
            if (n5 != 0) {
                this.m = this.j();
            }
        }
        this.o = null;
    }
    
    public final List<nc.a> j() {
        final ArrayList list = new ArrayList();
        final int n = 0;
        for (int i = 0; i < 8; ++i) {
            final b b = this.k[i];
            if (b.c && (!b.a.isEmpty() || b.b.length() != 0)) {
                final b b2 = this.k[i];
                if (b2.d) {
                    Object o;
                    if (!b2.c || (b2.a.isEmpty() && b2.b.length() == 0)) {
                        o = null;
                    }
                    else {
                        final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int j = 0; j < b2.a.size(); ++j) {
                            spannableStringBuilder.append((CharSequence)b2.a.get(j));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence)b2.b());
                        final int l = b2.l;
                        Layout$Alignment layout$Alignment = null;
                        Label_0286: {
                            if (l != 0) {
                                if (l == 1) {
                                    layout$Alignment = Layout$Alignment.ALIGN_OPPOSITE;
                                    break Label_0286;
                                }
                                if (l == 2) {
                                    layout$Alignment = Layout$Alignment.ALIGN_CENTER;
                                    break Label_0286;
                                }
                                if (l != 3) {
                                    throw new IllegalArgumentException(a2.b.f(43, "Unexpected justification value: ", b2.l));
                                }
                            }
                            layout$Alignment = Layout$Alignment.ALIGN_NORMAL;
                        }
                        float n2;
                        float n3;
                        if (b2.f) {
                            n2 = b2.h / 99.0f;
                            n3 = b2.g / 99.0f;
                        }
                        else {
                            n2 = b2.h / 209.0f;
                            n3 = b2.g / 74.0f;
                        }
                        final int k = b2.i;
                        final int n4 = k / 3;
                        int n5;
                        if (n4 == 0) {
                            n5 = 0;
                        }
                        else if (n4 == 1) {
                            n5 = 1;
                        }
                        else {
                            n5 = 2;
                        }
                        final int n6 = k % 3;
                        int n7;
                        if (n6 == 0) {
                            n7 = 0;
                        }
                        else if (n6 == 1) {
                            n7 = 1;
                        }
                        else {
                            n7 = 2;
                        }
                        final int o2 = b2.o;
                        o = new a(spannableStringBuilder, layout$Alignment, n3 * 0.9f + 0.05f, n5, n2 * 0.9f + 0.05f, n7, o2 != oc.b.b.x, o2, b2.e);
                    }
                    if (o != null) {
                        list.add(o);
                    }
                }
            }
        }
        Collections.sort((List<Object>)list, (Comparator<? super Object>)a.c);
        final ArrayList list2 = new ArrayList<nc.a>(list.size());
        for (int n8 = n; n8 < list.size(); ++n8) {
            list2.add(((a)list.get(n8)).a);
        }
        return Collections.unmodifiableList((List<? extends nc.a>)list2);
    }
    
    public final void k() {
        for (int i = 0; i < 8; ++i) {
            this.k[i].d();
        }
    }
    
    public static final class a
    {
        public static final w3.d c;
        public final nc.a a;
        public final int b;
        
        static {
            c = new w3.d(1);
        }
        
        public a(final SpannableStringBuilder a, final Layout$Alignment c, final float e, final int g, final float h, final int i, final boolean b, final int o, final int b2) {
            final a$a a$a = new a$a();
            a$a.a = (CharSequence)a;
            a$a.c = c;
            a$a.e = e;
            a$a.f = 0;
            a$a.g = g;
            a$a.h = h;
            a$a.i = i;
            a$a.l = -3.4028235E38f;
            if (b) {
                a$a.o = o;
                a$a.n = true;
            }
            this.a = a$a.a();
            this.b = b2;
        }
    }
    
    public static final class b
    {
        public static final int[] A;
        public static final boolean[] B;
        public static final int[] C;
        public static final int[] D;
        public static final int[] E;
        public static final int[] F;
        public static final int w;
        public static final int x;
        public static final int[] y;
        public static final int[] z;
        public final ArrayList a;
        public final SpannableStringBuilder b;
        public boolean c;
        public boolean d;
        public int e;
        public boolean f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public int s;
        public int t;
        public int u;
        public int v;
        
        static {
            w = c(2, 2, 2, 0);
            final int n = x = c(0, 0, 0, 0);
            final int c = c(0, 0, 0, 3);
            y = new int[] { 0, 0, 0, 0, 0, 2, 0 };
            z = new int[] { 0, 0, 0, 0, 0, 0, 2 };
            A = new int[] { 3, 3, 3, 3, 3, 3, 1 };
            B = new boolean[] { false, false, false, true, true, true, false };
            C = new int[] { n, c, n, n, c, n, n };
            D = new int[] { 0, 1, 2, 3, 4, 3, 4 };
            E = new int[] { 0, 0, 0, 0, 0, 3, 3 };
            F = new int[] { n, n, n, n, n, c, c };
        }
        
        public b() {
            this.a = new ArrayList();
            this.b = new SpannableStringBuilder();
            this.d();
        }
        
        public static int c(int n, int n2, final int n3, int n4) {
            d0.e(n, 4);
            d0.e(n2, 4);
            d0.e(n3, 4);
            d0.e(n4, 4);
            int n5 = 0;
            Label_0060: {
                if (n4 != 0 && n4 != 1) {
                    if (n4 == 2) {
                        n4 = 127;
                        break Label_0060;
                    }
                    if (n4 == 3) {
                        n4 = 0;
                        break Label_0060;
                    }
                }
                n4 = 255;
            }
            if (n > 1) {
                n = 255;
            }
            else {
                n = 0;
            }
            if (n2 > 1) {
                n2 = 255;
            }
            else {
                n2 = 0;
            }
            if (n3 > 1) {
                n5 = 255;
            }
            return Color.argb(n4, n, n2, n5);
        }
        
        public final void a(final char c) {
            if (c == '\n') {
                this.a.add(this.b());
                this.b.clear();
                if (this.p != -1) {
                    this.p = 0;
                }
                if (this.q != -1) {
                    this.q = 0;
                }
                if (this.r != -1) {
                    this.r = 0;
                }
                if (this.t != -1) {
                    this.t = 0;
                }
                while ((this.k && this.a.size() >= this.j) || this.a.size() >= 15) {
                    this.a.remove(0);
                }
            }
            else {
                this.b.append(c);
            }
        }
        
        public final SpannableString b() {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.b);
            final int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.p != -1) {
                    spannableStringBuilder.setSpan((Object)new StyleSpan(2), this.p, length, 33);
                }
                if (this.q != -1) {
                    spannableStringBuilder.setSpan((Object)new UnderlineSpan(), this.q, length, 33);
                }
                if (this.r != -1) {
                    spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(this.s), this.r, length, 33);
                }
                if (this.t != -1) {
                    spannableStringBuilder.setSpan((Object)new BackgroundColorSpan(this.u), this.t, length, 33);
                }
            }
            return new SpannableString((CharSequence)spannableStringBuilder);
        }
        
        public final void d() {
            this.a.clear();
            this.b.clear();
            this.p = -1;
            this.q = -1;
            this.r = -1;
            this.t = -1;
            this.v = 0;
            this.c = false;
            this.d = false;
            this.e = 4;
            this.f = false;
            this.g = 0;
            this.h = 0;
            this.i = 0;
            this.j = 15;
            this.k = true;
            this.l = 0;
            this.m = 0;
            this.n = 0;
            final int x = oc.b.b.x;
            this.o = x;
            this.s = oc.b.b.w;
            this.u = x;
        }
        
        public final void e(final boolean b, final boolean b2) {
            if (this.p != -1) {
                if (!b) {
                    this.b.setSpan((Object)new StyleSpan(2), this.p, this.b.length(), 33);
                    this.p = -1;
                }
            }
            else if (b) {
                this.p = this.b.length();
            }
            if (this.q != -1) {
                if (!b2) {
                    this.b.setSpan((Object)new UnderlineSpan(), this.q, this.b.length(), 33);
                    this.q = -1;
                }
            }
            else if (b2) {
                this.q = this.b.length();
            }
        }
        
        public final void f(final int s, final int u) {
            if (this.r != -1 && this.s != s) {
                this.b.setSpan((Object)new ForegroundColorSpan(this.s), this.r, this.b.length(), 33);
            }
            if (s != oc.b.b.w) {
                this.r = this.b.length();
                this.s = s;
            }
            if (this.t != -1 && this.u != u) {
                this.b.setSpan((Object)new BackgroundColorSpan(this.u), this.t, this.b.length(), 33);
            }
            if (u != oc.b.b.x) {
                this.t = this.b.length();
                this.u = u;
            }
        }
    }
    
    public static final class c
    {
        public final int a;
        public final int b;
        public final byte[] c;
        public int d;
        
        public c(final int a, final int b) {
            this.a = a;
            this.b = b;
            this.c = new byte[b * 2 - 1];
            this.d = 0;
        }
    }
}
