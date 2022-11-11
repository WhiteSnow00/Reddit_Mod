// 
// Decompiled by Procyon v0.6.0
// 

package nc;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.text.SpannableString;
import android.text.Layout$Alignment;
import mc.a$a;
import ad.c0;
import android.text.SpannableStringBuilder;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import mc.f;
import mc.j;
import java.nio.ByteBuffer;
import java.util.Collections;
import com.google.android.exoplayer2.decoder.DecoderException;
import android.util.Log;
import java.util.List;
import java.util.ArrayList;
import ad.s;

public final class a extends c
{
    public static final int[] A;
    public static final int[] B;
    public static final int[] C;
    public static final int[] D;
    public static final int[] E;
    public static final boolean[] F;
    public static final int[] y;
    public static final int[] z;
    public final s g;
    public final int h;
    public final int i;
    public final int j;
    public final long k;
    public final ArrayList<a> l;
    public a m;
    public List<a> n;
    public List<a> o;
    public int p;
    public int q;
    public boolean r;
    public boolean s;
    public byte t;
    public byte u;
    public int v;
    public boolean w;
    public long x;
    
    static {
        y = new int[] { 11, 1, 3, 12, 14, 5, 7, 9 };
        z = new int[] { 0, 4, 8, 12, 16, 20, 24, 28 };
        A = new int[] { -1, -16711936, -16776961, -16711681, -65536, -256, -65281 };
        B = new int[] { 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632 };
        C = new int[] { 174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251 };
        D = new int[] { 193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187 };
        E = new int[] { 195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496 };
        F = new boolean[] { false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false };
    }
    
    public a(final String s, final int n) {
        this.g = new s();
        this.l = new ArrayList<a>();
        this.m = new a(0, 4);
        this.v = 0;
        this.k = 16000000L;
        int h;
        if ("application/x-mp4-cea-608".equals(s)) {
            h = 2;
        }
        else {
            h = 3;
        }
        this.h = h;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.j = 0;
                        this.i = 0;
                    }
                    else {
                        this.j = 1;
                        this.i = 1;
                    }
                }
                else {
                    this.j = 0;
                    this.i = 1;
                }
            }
            else {
                this.j = 1;
                this.i = 0;
            }
        }
        else {
            this.j = 0;
            this.i = 0;
        }
        this.k(0);
        this.j();
        this.w = true;
        this.x = -9223372036854775807L;
    }
    
    public final d e() {
        final List<a> n = this.n;
        (this.o = n).getClass();
        return new d(n);
    }
    
    public final void f(final c.a a) {
        final ByteBuffer h = ((DecoderInputBuffer)a).h;
        h.getClass();
        this.g.z(h.limit(), h.array());
        boolean b = false;
        while (true) {
            final s g = this.g;
            final int c = g.c;
            final int b2 = g.b;
            final int h2 = this.h;
            if (c - b2 < h2) {
                break;
            }
            int n;
            if (h2 == 2) {
                n = -4;
            }
            else {
                n = (byte)g.r();
            }
            final int r = this.g.r();
            final int r2 = this.g.r();
            if ((n & 0x2) != 0x0) {
                continue;
            }
            if ((n & 0x1) != this.i) {
                continue;
            }
            final byte b3 = (byte)(r & 0x7F);
            final byte b4 = (byte)(r2 & 0x7F);
            if (b3 == 0 && b4 == 0) {
                continue;
            }
            final boolean r3 = this.r;
            boolean r4 = false;
            Label_0197: {
                if ((n & 0x4) == 0x4) {
                    final boolean[] f = a.F;
                    if (f[r] && f[r2]) {
                        r4 = true;
                        break Label_0197;
                    }
                }
                r4 = false;
            }
            this.r = r4;
            boolean b5 = false;
            Label_0299: {
                if (r4 && (b3 & 0xF0) == 0x10) {
                    if (this.s && this.t == b3 && this.u == b4) {
                        this.s = false;
                        b5 = true;
                        break Label_0299;
                    }
                    this.s = true;
                    this.t = b3;
                    this.u = b4;
                }
                else {
                    this.s = false;
                }
                b5 = false;
            }
            if (b5) {
                continue;
            }
            Label_1535: {
                if (!r4) {
                    if (!r3) {
                        continue;
                    }
                    this.j();
                }
                else {
                    Label_0472: {
                        if (1 <= b3 && b3 <= 15) {
                            this.w = false;
                        }
                        else if ((b3 & 0xF7) == 0x14) {
                            Label_0467: {
                                if (b4 != 32 && b4 != 47) {
                                    switch (b4) {
                                        default: {
                                            switch (b4) {
                                                default: {
                                                    break Label_0472;
                                                }
                                                case 42:
                                                case 43: {
                                                    this.w = false;
                                                    break Label_0472;
                                                }
                                                case 41: {
                                                    break Label_0467;
                                                }
                                            }
                                            break;
                                        }
                                        case 37:
                                        case 38:
                                        case 39: {
                                            break;
                                        }
                                    }
                                }
                            }
                            this.w = true;
                        }
                    }
                    if (!this.w) {
                        continue;
                    }
                    final int n2 = b3 & 0xE0;
                    if (n2 == 0) {
                        this.v = (b3 >> 3 & 0x1);
                    }
                    if (this.v != this.j) {
                        continue;
                    }
                    if (n2 == 0) {
                        final int n3 = b3 & 0xF7;
                        if (n3 == 17 && (b4 & 0xF0) == 0x30) {
                            this.m.a((char)a.C[b4 & 0xF]);
                        }
                        else {
                            final int n4 = b3 & 0xF6;
                            if (n4 == 18 && (b4 & 0xE0) == 0x20) {
                                this.m.b();
                                final a m = this.m;
                                int n5;
                                if ((b3 & 0x1) == 0x0) {
                                    n5 = a.D[b4 & 0x1F];
                                }
                                else {
                                    n5 = a.E[b4 & 0x1F];
                                }
                                m.a((char)n5);
                            }
                            else if (n3 == 17 && (b4 & 0xF0) == 0x20) {
                                this.m.a(' ');
                                final boolean b6 = (b4 & 0x1) == 0x1;
                                final a i = this.m;
                                i.a.add(new a(b4 >> 1 & 0x7, b6, i.c.length()));
                            }
                            else if ((b3 & 0xF0) == 0x10 && (b4 & 0xC0) == 0x40) {
                                final int n6 = a.y[b3 & 0x7];
                                final boolean b7 = (b4 & 0x20) != 0x0;
                                int d = n6;
                                if (b7) {
                                    d = n6 + 1;
                                }
                                final a j = this.m;
                                if (d != j.d) {
                                    if (this.p != 1 && !j.e()) {
                                        final a k = new a(this.p, this.q);
                                        this.m = k;
                                        this.l.add(k);
                                    }
                                    this.m.d = d;
                                }
                                final boolean b8 = (b4 & 0x10) == 0x10;
                                final boolean b9 = (b4 & 0x1) == 0x1;
                                final int n7 = b4 >> 1 & 0x7;
                                final a l = this.m;
                                int n8;
                                if (b8) {
                                    n8 = 8;
                                }
                                else {
                                    n8 = n7;
                                }
                                l.a.add(new a(n8, b9, l.c.length()));
                                if (b8) {
                                    this.m.e = a.z[n7];
                                }
                            }
                            else if (n3 == 23 && b4 >= 33 && b4 <= 35) {
                                this.m.f = b4 - 32;
                            }
                            else if (n4 == 20 && (b4 & 0xF0) == 0x20) {
                                if (b4 != 32) {
                                    if (b4 != 41) {
                                        switch (b4) {
                                            default: {
                                                final int p = this.p;
                                                if (p == 0) {
                                                    break;
                                                }
                                                if (b4 == 33) {
                                                    this.m.b();
                                                    break;
                                                }
                                                switch (b4) {
                                                    default: {
                                                        break Label_1535;
                                                    }
                                                    case 47: {
                                                        this.n = this.i();
                                                        this.j();
                                                        break Label_1535;
                                                    }
                                                    case 46: {
                                                        this.j();
                                                        break Label_1535;
                                                    }
                                                    case 45: {
                                                        if (p == 1 && !this.m.e()) {
                                                            final a m2 = this.m;
                                                            m2.b.add(m2.d());
                                                            m2.c.setLength(0);
                                                            m2.a.clear();
                                                            while (m2.b.size() >= Math.min(m2.h, m2.d)) {
                                                                m2.b.remove(0);
                                                            }
                                                            break Label_1535;
                                                        }
                                                        break Label_1535;
                                                    }
                                                    case 44: {
                                                        this.n = Collections.emptyList();
                                                        final int p2 = this.p;
                                                        if (p2 == 1 || p2 == 3) {
                                                            this.j();
                                                            break Label_1535;
                                                        }
                                                        break Label_1535;
                                                    }
                                                }
                                                break;
                                            }
                                            case 39: {
                                                this.k(1);
                                                this.q = 4;
                                                this.m.h = 4;
                                                break;
                                            }
                                            case 38: {
                                                this.k(1);
                                                this.q = 3;
                                                this.m.h = 3;
                                                break;
                                            }
                                            case 37: {
                                                this.k(1);
                                                this.q = 2;
                                                this.m.h = 2;
                                                break;
                                            }
                                        }
                                    }
                                    else {
                                        this.k(3);
                                    }
                                }
                                else {
                                    this.k(2);
                                }
                            }
                        }
                    }
                    else {
                        final a m3 = this.m;
                        final int[] b10 = a.B;
                        m3.a((char)b10[(b3 & 0x7F) - 32]);
                        if ((b4 & 0xE0) != 0x0) {
                            this.m.a((char)b10[(b4 & 0x7F) - 32]);
                        }
                    }
                }
            }
            b = true;
        }
        if (b) {
            final int p3 = this.p;
            if (p3 == 1 || p3 == 3) {
                this.n = this.i();
                this.x = super.e;
            }
        }
    }
    
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.k(0);
        this.q = 4;
        this.m.h = 4;
        this.j();
        this.r = false;
        this.s = false;
        this.t = 0;
        this.u = 0;
        this.v = 0;
        this.w = true;
        this.x = -9223372036854775807L;
    }
    
    public final j g() throws SubtitleDecoderException {
        final j g = super.g();
        if (g != null) {
            return g;
        }
        final long k = this.k;
        int n2;
        final int n = n2 = 0;
        if (k != -9223372036854775807L) {
            final long x = this.x;
            if (x == -9223372036854775807L) {
                n2 = n;
            }
            else {
                n2 = n;
                if (super.e - x >= k) {
                    n2 = 1;
                }
            }
        }
        if (n2 != 0) {
            final j j = super.b.pollFirst();
            if (j != null) {
                this.n = Collections.emptyList();
                this.x = -9223372036854775807L;
                j.u(super.e, (f)this.e(), Long.MAX_VALUE);
                return j;
            }
        }
        return null;
    }
    
    public final boolean h() {
        return this.n != this.o;
    }
    
    public final List<a> i() {
        final int size = this.l.size();
        final ArrayList list = new ArrayList<a>(size);
        final int n = 0;
        int n2 = 2;
        int min;
        for (int i = 0; i < size; ++i, n2 = min) {
            final a c = this.l.get(i).c(Integer.MIN_VALUE);
            list.add(c);
            min = n2;
            if (c != null) {
                min = Math.min(n2, c.n);
            }
        }
        final ArrayList list2 = new ArrayList<a>(size);
        for (int j = n; j < size; ++j) {
            final a a = list.get(j);
            if (a != null) {
                a c2 = a;
                if (a.n != n2) {
                    c2 = this.l.get(j).c(n2);
                    c2.getClass();
                }
                list2.add(c2);
            }
        }
        return (List<a>)list2;
    }
    
    public final void j() {
        final a m = this.m;
        m.g = this.p;
        m.a.clear();
        m.b.clear();
        m.c.setLength(0);
        m.d = 15;
        m.e = 0;
        m.f = 0;
        this.l.clear();
        this.l.add(this.m);
    }
    
    public final void k(final int n) {
        final int p = this.p;
        if (p == n) {
            return;
        }
        if ((this.p = n) == 3) {
            for (int i = 0; i < this.l.size(); ++i) {
                this.l.get(i).g = n;
            }
            return;
        }
        this.j();
        if (p == 3 || n == 1 || n == 0) {
            this.n = Collections.emptyList();
        }
    }
    
    public final void release() {
    }
    
    public static final class a
    {
        public final ArrayList a;
        public final ArrayList b;
        public final StringBuilder c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        
        public a(final int g, final int h) {
            final ArrayList a = new ArrayList();
            this.a = a;
            final ArrayList b = new ArrayList();
            this.b = b;
            final StringBuilder c = new StringBuilder();
            this.c = c;
            this.g = g;
            a.clear();
            b.clear();
            c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
            this.h = h;
        }
        
        public final void a(final char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }
        
        public final void b() {
            final int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                int size = this.a.size();
                while (--size >= 0) {
                    final a a = this.a.get(size);
                    final int c = a.c;
                    if (c != length) {
                        break;
                    }
                    a.c = c - 1;
                }
            }
        }
        
        public final a c(int i) {
            final int n = this.e + this.f;
            final int n2 = 32 - n;
            final SpannableStringBuilder a = new SpannableStringBuilder();
            for (int j = 0; j < this.b.size(); ++j) {
                CharSequence subSequence = this.b.get(j);
                final int a2 = c0.a;
                if (subSequence.length() > n2) {
                    subSequence = subSequence.subSequence(0, n2);
                }
                a.append(subSequence);
                a.append('\n');
            }
            Object o = this.d();
            final int a3 = c0.a;
            if (((SpannableString)o).length() > n2) {
                o = ((SpannableString)o).subSequence(0, n2);
            }
            a.append((CharSequence)o);
            if (a.length() == 0) {
                return null;
            }
            final int n3 = n2 - a.length();
            final int n4 = n - n3;
            if (i == Integer.MIN_VALUE) {
                if (this.g == 2 && (Math.abs(n4) < 3 || n3 < 0)) {
                    i = 1;
                }
                else if (this.g == 2 && n4 > 0) {
                    i = 2;
                }
                else {
                    i = 0;
                }
            }
            float h;
            if (i != 1) {
                int n5;
                if (i != 2) {
                    n5 = n;
                }
                else {
                    n5 = 32 - n3;
                }
                h = n5 / 32.0f * 0.8f + 0.1f;
            }
            else {
                h = 0.5f;
            }
            final int d = this.d;
            int n6;
            if (d > 7) {
                n6 = d - 15 - 2;
            }
            else {
                n6 = d;
                if (this.g == 1) {
                    n6 = d - (this.h - 1);
                }
            }
            final a$a a$a = new a$a();
            a$a.a = (CharSequence)a;
            a$a.c = Layout$Alignment.ALIGN_NORMAL;
            a$a.e = (float)n6;
            a$a.f = 1;
            a$a.h = h;
            a$a.i = i;
            return a$a.a();
        }
        
        public final SpannableString d() {
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.c);
            final int length = spannableStringBuilder.length();
            final int n2;
            int n = n2 = -1;
            int n4;
            final int n3 = n4 = n2;
            int i = 0;
            int n5 = 0;
            int n6 = 0;
            int n7 = n3;
            int n8 = n2;
            while (i < this.a.size()) {
                final a a = this.a.get(i);
                final boolean b = a.b;
                final int a2 = a.a;
                int n9 = n6;
                int n10 = n4;
                if (a2 != 8) {
                    int n11;
                    if (a2 == 7) {
                        n11 = 1;
                    }
                    else {
                        n11 = 0;
                    }
                    if (a2 != 7) {
                        n4 = nc.a.A[a2];
                    }
                    n9 = n11;
                    n10 = n4;
                }
                final int c = a.c;
                final int n12 = i + 1;
                int c2;
                if (n12 < this.a.size()) {
                    c2 = this.a.get(n12).c;
                }
                else {
                    c2 = length;
                }
                if (c == c2) {
                    i = n12;
                    n6 = n9;
                    n4 = n10;
                }
                else {
                    int n13;
                    if (n != -1 && !b) {
                        spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n, c, 33);
                        n13 = -1;
                    }
                    else if ((n13 = n) == -1) {
                        n13 = n;
                        if (b) {
                            n13 = c;
                        }
                    }
                    int n14;
                    if (n8 != -1 && n9 == 0) {
                        spannableStringBuilder.setSpan((Object)new StyleSpan(2), n8, c, 33);
                        n14 = -1;
                    }
                    else if ((n14 = n8) == -1) {
                        n14 = n8;
                        if (n9 != 0) {
                            n14 = c;
                        }
                    }
                    i = n12;
                    n = n13;
                    n8 = n14;
                    n6 = n9;
                    if ((n4 = n10) == n7) {
                        continue;
                    }
                    if (n7 != -1) {
                        spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n7), n5, c, 33);
                    }
                    n7 = n10;
                    i = n12;
                    n = n13;
                    n8 = n14;
                    n5 = c;
                    n6 = n9;
                    n4 = n10;
                }
            }
            if (n != -1 && n != length) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n, length, 33);
            }
            if (n8 != -1 && n8 != length) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), n8, length, 33);
            }
            if (n5 != length) {
                if (n7 != -1) {
                    spannableStringBuilder.setSpan((Object)new ForegroundColorSpan(n7), n5, length, 33);
                }
            }
            return new SpannableString((CharSequence)spannableStringBuilder);
        }
        
        public final boolean e() {
            return this.a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }
        
        public static final class a
        {
            public final int a;
            public final boolean b;
            public int c;
            
            public a(final int a, final boolean b, final int c) {
                this.a = a;
                this.b = b;
                this.c = c;
            }
        }
    }
}
