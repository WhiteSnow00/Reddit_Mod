// 
// Decompiled by Procyon v0.6.0
// 

package nb;

import java.util.Arrays;
import bd.r;
import com.google.android.exoplayer2.ParserException;
import db.u$b;
import db.u;
import android.util.Log;
import db.t;
import java.io.IOException;
import db.e;
import db.i;
import java.util.Collections;
import java.util.ArrayList;
import com.google.android.exoplayer2.n;
import com.google.common.collect.ImmutableList;
import db.j;
import android.util.SparseBooleanArray;
import android.util.SparseArray;
import android.util.SparseIntArray;
import bd.s;
import bd.a0;
import java.util.List;
import db.h;

public final class d0 implements h
{
    public final int a;
    public final List<a0> b;
    public final s c;
    public final SparseIntArray d;
    public final e0$c e;
    public final SparseArray<e0> f;
    public final SparseBooleanArray g;
    public final SparseBooleanArray h;
    public final c0 i;
    public b0 j;
    public j k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public e0 p;
    public int q;
    public int r;
    
    static {
        new(nb.c.class)();
    }
    
    public d0() {
        this(1, new a0(0L), new nb.h(0, (List<n>)ImmutableList.of()));
    }
    
    public d0(int i, final a0 a0, final nb.h e) {
        this.e = (e0$c)e;
        this.a = i;
        if (i != 1 && i != 2) {
            ((ArrayList<a0>)(this.b = new ArrayList<a0>())).add(a0);
        }
        else {
            this.b = Collections.singletonList(a0);
        }
        this.c = new s(new byte[9400], 0);
        final SparseBooleanArray g = new SparseBooleanArray();
        this.g = g;
        this.h = new SparseBooleanArray();
        final SparseArray f = new SparseArray();
        this.f = (SparseArray<e0>)f;
        this.d = new SparseIntArray();
        this.i = new c0();
        this.k = (j)db.j.I2;
        this.r = -1;
        g.clear();
        f.clear();
        final SparseArray sparseArray = new SparseArray();
        int size;
        for (size = sparseArray.size(), i = 0; i < size; ++i) {
            this.f.put(sparseArray.keyAt(i), (Object)sparseArray.valueAt(i));
        }
        this.f.put(0, (Object)new z((y)new a()));
        this.p = null;
    }
    
    public final void a(long n, final long n2) {
        bd.d0.f(this.a != 2);
        final int size = this.b.size();
        int i = 0;
        while (i < size) {
            final a0 a0 = this.b.get(i);
            synchronized (a0) {
                n = a0.b;
                monitorexit(a0);
                boolean b;
                if (!(b = (n == -9223372036854775807L))) {
                    n = a0.c();
                    b = (n != -9223372036854775807L && n != 0L && n != n2);
                }
                if (b) {
                    a0.d(n2);
                }
                ++i;
                continue;
            }
            break;
        }
        if (n2 != 0L) {
            final b0 j = this.j;
            if (j != null) {
                j.c(n2);
            }
        }
        this.c.y(0);
        this.d.clear();
        for (int k = 0; k < this.f.size(); ++k) {
            ((e0)this.f.valueAt(k)).b();
        }
        this.q = 0;
    }
    
    public final boolean c(final i i) throws IOException {
        final byte[] a = this.c.a;
        final e e = (e)i;
        e.h(a, 0, 940, false);
        int j = 0;
    Label_0026:
        while (j < 188) {
            int k = 0;
            while (true) {
                while (k < 5) {
                    if (a[k * 188 + j] != 71) {
                        final boolean b = false;
                        if (b) {
                            e.n(j);
                            return true;
                        }
                        ++j;
                        continue Label_0026;
                    }
                    else {
                        ++k;
                    }
                }
                final boolean b = true;
                continue;
            }
        }
        return false;
    }
    
    public final void f(final j k) {
        this.k = k;
    }
    
    public final int h(final i i, final t t) throws IOException {
        final e e = (e)i;
        final long c = e.c;
        final boolean m = this.m;
        final int n = 0;
        if (m) {
            final boolean b = c != -1L && this.a != 2;
            final long n2 = -9223372036854775807L;
            if (b) {
                final c0 j = this.i;
                if (!j.d) {
                    final int r = this.r;
                    int n3;
                    if (r <= 0) {
                        j.a(e);
                        n3 = n;
                    }
                    else {
                        if (!j.f) {
                            final int n4 = (int)Math.min(j.a, c);
                            final long a = c - n4;
                            if (e.d == a) {
                                j.c.y(n4);
                                e.f = 0;
                                e.h(j.c.a, 0, n4, false);
                                final s c2 = j.c;
                                final int b2 = c2.b;
                                final int c3 = c2.c;
                                int n5 = c3 - 188;
                                long v = 0L;
                            Label_0335:
                                while (true) {
                                    v = n2;
                                    if (n5 >= b2) {
                                        final byte[] a2 = c2.a;
                                        int k = -4;
                                        int n6 = 0;
                                        while (true) {
                                            while (k <= 4) {
                                                final int n7 = k * 188 + n5;
                                                if (n7 >= b2 && n7 < c3 && a2[n7] == 71) {
                                                    if (++n6 == 5) {
                                                        final boolean b3 = true;
                                                        if (b3) {
                                                            v = mj2.c0.V(c2, n5, r);
                                                            if (v != -9223372036854775807L) {
                                                                break Label_0335;
                                                            }
                                                        }
                                                        --n5;
                                                        continue Label_0335;
                                                    }
                                                }
                                                else {
                                                    n6 = 0;
                                                }
                                                ++k;
                                            }
                                            final boolean b3 = false;
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                j.h = v;
                                j.f = true;
                                n3 = n;
                                return n3;
                            }
                            t.a = a;
                        }
                        else {
                            if (j.h == -9223372036854775807L) {
                                j.a(e);
                                n3 = n;
                                return n3;
                            }
                            if (!j.e) {
                                final int n8 = (int)Math.min(j.a, c);
                                final long d = e.d;
                                final long a3 = 0;
                                if (d == a3) {
                                    j.c.y(n8);
                                    e.f = 0;
                                    e.h(j.c.a, 0, n8, false);
                                    final s c4 = j.c;
                                    int b4 = c4.b;
                                    final int c5 = c4.c;
                                    long v2;
                                    while (true) {
                                        v2 = n2;
                                        if (b4 >= c5) {
                                            break;
                                        }
                                        if (c4.a[b4] == 71) {
                                            v2 = mj2.c0.V(c4, b4, r);
                                            if (v2 != -9223372036854775807L) {
                                                break;
                                            }
                                        }
                                        ++b4;
                                    }
                                    j.g = v2;
                                    j.e = true;
                                    n3 = n;
                                    return n3;
                                }
                                t.a = a3;
                            }
                            else {
                                final long g = j.g;
                                if (g == -9223372036854775807L) {
                                    j.a(e);
                                    n3 = n;
                                    return n3;
                                }
                                final long l = j.b.b(j.h) - j.b.b(g);
                                j.i = l;
                                if (l < 0L) {
                                    final StringBuilder sb = new StringBuilder(65);
                                    sb.append("Invalid duration: ");
                                    sb.append(l);
                                    sb.append(". Using TIME_UNSET instead.");
                                    Log.w("TsDurationReader", sb.toString());
                                    j.i = -9223372036854775807L;
                                }
                                j.a(e);
                                n3 = n;
                                return n3;
                            }
                        }
                        n3 = 1;
                    }
                    return n3;
                }
            }
            if (!this.n) {
                this.n = true;
                final c0 i2 = this.i;
                final long i3 = i2.i;
                if (i3 != -9223372036854775807L) {
                    final b0 j2 = new b0(i2.b, i3, c, this.r, 112800);
                    this.j = j2;
                    this.k.s((u)j2.a);
                }
                else {
                    this.k.s((u)new u$b(i3));
                }
            }
            if (this.o) {
                this.o = false;
                this.a(0L, 0L);
                if (e.d != 0L) {
                    t.a = 0L;
                    return 1;
                }
            }
            final b0 j3 = this.j;
            if (j3 != null && j3.c != null) {
                return j3.a(e, t);
            }
        }
        final s c6 = this.c;
        final byte[] a4 = c6.a;
        final int b5 = c6.b;
        if (9400 - b5 < 188) {
            final int n9 = c6.c - b5;
            if (n9 > 0) {
                System.arraycopy(a4, b5, a4, 0, n9);
            }
            this.c.z(n9, a4);
        }
        boolean b6;
        while (true) {
            final s c7 = this.c;
            final int c8 = c7.c;
            if (c8 - c7.b >= 188) {
                b6 = true;
                break;
            }
            final int read = e.read(a4, c8, 9400 - c8);
            if (read == -1) {
                b6 = false;
                break;
            }
            this.c.A(c8 + read);
        }
        if (!b6) {
            return -1;
        }
        final s c9 = this.c;
        final int b7 = c9.b;
        int c10;
        byte[] a5;
        int n10;
        for (c10 = c9.c, a5 = c9.a, n10 = b7; n10 < c10 && a5[n10] != 71; ++n10) {}
        this.c.B(n10);
        final int n11 = n10 + 188;
        e0 e2 = null;
        if (n11 > c10) {
            final int q = n10 - b7 + this.q;
            this.q = q;
            if (this.a == 2) {
                if (q > 376) {
                    throw ParserException.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", (Throwable)null);
                }
            }
        }
        else {
            this.q = 0;
        }
        final s c11 = this.c;
        final int c12 = c11.c;
        if (n11 > c12) {
            return 0;
        }
        final int c13 = c11.c();
        if ((0x800000 & c13) != 0x0) {
            this.c.B(n11);
            return 0;
        }
        final int n12 = ((0x400000 & c13) != 0x0 | false) ? 1 : 0;
        final int n13 = (0x1FFF00 & c13) >> 8;
        final boolean b8 = (c13 & 0x20) != 0x0;
        if ((c13 & 0x10) != 0x0) {
            e2 = (e0)this.f.get(n13);
        }
        if (e2 == null) {
            this.c.B(n11);
            return 0;
        }
        if (this.a != 2) {
            final int n14 = c13 & 0xF;
            final int value = this.d.get(n13, n14 - 1);
            this.d.put(n13, n14);
            if (value == n14) {
                this.c.B(n11);
                return 0;
            }
            if (n14 != (value + 1 & 0xF)) {
                e2.b();
            }
        }
        int n15 = n12;
        if (b8) {
            final int r2 = this.c.r();
            int n16;
            if ((this.c.r() & 0x40) != 0x0) {
                n16 = 2;
            }
            else {
                n16 = 0;
            }
            n15 = (n12 | n16);
            this.c.C(r2 - 1);
        }
        final boolean m2 = this.m;
        if (this.a == 2 || m2 || !this.h.get(n13, false)) {
            this.c.A(n11);
            e2.c(n15, this.c);
            this.c.A(c12);
        }
        if (this.a != 2 && !m2 && this.m && c != -1L) {
            this.o = true;
        }
        this.c.B(n11);
        return 0;
    }
    
    public final void release() {
    }
    
    public final class a implements y
    {
        public final r a;
        
        public a() {
            this.a = new r(new byte[4], 4);
        }
        
        public final void a(final a0 a0, final j j, final e0$d e0$d) {
        }
        
        public final void c(final s s) {
            if (s.r() != 0) {
                return;
            }
            if ((s.r() & 0x80) == 0x0) {
                return;
            }
            s.C(6);
            for (int n = (s.c - s.b) / 4, i = 0; i < n; ++i) {
                final r a = this.a;
                s.b(0, 4, a.a);
                a.k(0);
                final int g = this.a.g(16);
                this.a.m(3);
                if (g == 0) {
                    this.a.m(13);
                }
                else {
                    final int g2 = this.a.g(13);
                    if (d0.this.f.get(g2) == null) {
                        final d0 b = d0.this;
                        b.f.put(g2, (Object)new z((y)b.new b(g2)));
                        final d0 b2 = d0.this;
                        ++b2.l;
                    }
                }
            }
            final d0 b3 = d0.this;
            if (b3.a != 2) {
                b3.f.remove(0);
            }
        }
    }
    
    public final class b implements y
    {
        public final r a;
        public final SparseArray<e0> b;
        public final SparseIntArray c;
        public final int d;
        
        public b(final int d) {
            this.a = new r(new byte[5], 5);
            this.b = (SparseArray<e0>)new SparseArray();
            this.c = new SparseIntArray();
            this.d = d;
        }
        
        public final void a(final a0 a0, final j j, final e0$d e0$d) {
        }
        
        public final void c(final s s) {
            if (s.r() != 2) {
                return;
            }
            final d0 e = d0.this;
            final int a = e.a;
            a0 a2;
            if (a != 1 && a != 2 && e.l != 1) {
                a2 = new a0(e.b.get(0).c());
                d0.this.b.add(a2);
            }
            else {
                a2 = e.b.get(0);
            }
            if ((s.r() & 0x80) == 0x0) {
                return;
            }
            s.C(1);
            final int w = s.w();
            s.C(3);
            final r a3 = this.a;
            s.b(0, 2, a3.a);
            a3.k(0);
            this.a.m(3);
            d0.this.r = this.a.g(13);
            final r a4 = this.a;
            s.b(0, 2, a4.a);
            a4.k(0);
            final r a5 = this.a;
            int n = 4;
            a5.m(4);
            s.C(this.a.g(12));
            final d0 e2 = d0.this;
            final int a6 = e2.a;
            int n2 = 21;
            if (a6 == 2 && e2.p == null) {
                final e0$b e0$b = new e0$b(21, (String)null, (ArrayList)null, bd.c0.f);
                final d0 e3 = d0.this;
                e3.p = e3.e.a(21, e0$b);
                final d0 e4 = d0.this;
                final e0 p = e4.p;
                if (p != null) {
                    p.a(a2, e4.k, new e0$d(w, 21, 8192));
                }
            }
            this.b.clear();
            this.c.clear();
            int i = s.c - s.b;
            while (i > 0) {
                final r a7 = this.a;
                s.b(0, 5, a7.a);
                a7.k(0);
                final int g = this.a.g(8);
                this.a.m(3);
                final int g2 = this.a.g(13);
                this.a.m(n);
                final int g3 = this.a.g(12);
                final int b = s.b;
                final int n3 = g3 + b;
                final int n4 = -1;
                String trim = null;
                ArrayList<e0$a> list = null;
                int n5 = n2;
                int n6 = n;
                int n7 = n4;
                while (s.b < n3) {
                    final int r = s.r();
                    final int n8 = s.b + s.r();
                    if (n8 > n3) {
                        n6 = 4;
                        break;
                    }
                    final int n9 = 172;
                    ArrayList<e0$a> list2 = null;
                    String s3 = null;
                    Label_0766: {
                        Label_0616: {
                            Label_0610: {
                                Label_0587: {
                                    if (r == 5) {
                                        final long s2 = s.s();
                                        if (s2 != 1094921523L) {
                                            if (s2 == 1161904947L) {
                                                break Label_0587;
                                            }
                                            if (s2 == 1094921524L) {
                                                break Label_0610;
                                            }
                                            if (s2 == 1212503619L) {
                                                n7 = 36;
                                            }
                                            break Label_0616;
                                        }
                                    }
                                    else if (r != 106) {
                                        if (r == 122) {
                                            break Label_0587;
                                        }
                                        if (r == 127) {
                                            if (s.r() == n5) {
                                                break Label_0610;
                                            }
                                            break Label_0616;
                                        }
                                        else {
                                            if (r == 123) {
                                                n7 = 138;
                                                break Label_0616;
                                            }
                                            if (r == 10) {
                                                trim = s.o(3).trim();
                                                break Label_0616;
                                            }
                                            if (r == 89) {
                                                list2 = new ArrayList<e0$a>();
                                                while (s.b < n8) {
                                                    final String trim2 = s.o(3).trim();
                                                    s.r();
                                                    final byte[] array = new byte[4];
                                                    s.b(0, 4, array);
                                                    list2.add(new e0$a(trim2, array));
                                                }
                                                n7 = 89;
                                                s3 = trim;
                                                break Label_0766;
                                            }
                                            s3 = trim;
                                            list2 = list;
                                            if (r == 111) {
                                                n7 = 257;
                                                list2 = list;
                                                s3 = trim;
                                            }
                                            break Label_0766;
                                        }
                                    }
                                    n7 = 129;
                                    break Label_0616;
                                }
                                n7 = 135;
                                break Label_0616;
                            }
                            n7 = n9;
                        }
                        s3 = trim;
                        list2 = list;
                    }
                    s.C(n8 - s.b);
                    n6 = 4;
                    n5 = 21;
                    trim = s3;
                    list = list2;
                }
                s.B(n3);
                final e0$b e0$b2 = new e0$b(n7, trim, (ArrayList)list, Arrays.copyOfRange(s.a, b, n3));
                int n10;
                if (g == 6 || (n10 = g) == 5) {
                    n10 = n7;
                }
                i -= g3 + 5;
                final d0 e5 = d0.this;
                int n11;
                if (e5.a == 2) {
                    n11 = n10;
                }
                else {
                    n11 = g2;
                }
                if (!e5.g.get(n11)) {
                    final d0 e6 = d0.this;
                    e0 e7;
                    if (e6.a == 2 && n10 == 21) {
                        e7 = e6.p;
                    }
                    else {
                        e7 = e6.e.a(n10, e0$b2);
                    }
                    if (d0.this.a != 2 || g2 < this.c.get(n11, 8192)) {
                        this.c.put(n11, g2);
                        this.b.put(n11, (Object)e7);
                    }
                }
                n = n6;
                n2 = 21;
            }
            for (int size = this.c.size(), j = 0; j < size; ++j) {
                final int key = this.c.keyAt(j);
                final int value = this.c.valueAt(j);
                d0.this.g.put(key, true);
                d0.this.h.put(value, true);
                final e0 e8 = (e0)this.b.valueAt(j);
                if (e8 != null) {
                    final d0 e9 = d0.this;
                    if (e8 != e9.p) {
                        e8.a(a2, e9.k, new e0$d(w, key, 8192));
                    }
                    d0.this.f.put(value, (Object)e8);
                }
            }
            final d0 e10 = d0.this;
            if (e10.a == 2) {
                if (!e10.m) {
                    e10.k.b();
                    final d0 e11 = d0.this;
                    e11.l = 0;
                    e11.m = true;
                }
            }
            else {
                e10.f.remove(this.d);
                final d0 e12 = d0.this;
                int l;
                if (e12.a == 1) {
                    l = 0;
                }
                else {
                    l = e12.l - 1;
                }
                e12.l = l;
                if (l == 0) {
                    e12.k.b();
                    d0.this.m = true;
                }
            }
        }
    }
}
