// 
// Decompiled by Procyon v0.6.0
// 

package hc;

import com.google.android.exoplayer2.source.p;
import java.util.AbstractCollection;
import qb.a$b;
import bd.c0;
import db.j;
import bd.o;
import android.text.TextUtils;
import java.util.Collections;
import com.google.android.exoplayer2.n$a;
import java.util.ArrayList;
import java.util.Map;
import vb.k;
import zc.f;
import java.io.InterruptedIOException;
import bd.d0;
import java.io.IOException;
import xl0.d;
import java.io.EOFException;
import java.math.BigInteger;
import mk2.e;
import xa.b0;
import bd.s;
import com.google.android.exoplayer2.n;
import java.util.List;
import bd.a0;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.a;
import android.net.Uri;
import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicInteger;
import dc.m;

public final class h extends m
{
    public static final AtomicInteger L;
    public final boolean A;
    public final boolean B;
    public i C;
    public l D;
    public int E;
    public boolean F;
    public volatile boolean G;
    public boolean H;
    public ImmutableList<Integer> I;
    public boolean J;
    public boolean K;
    public final int k;
    public final int l;
    public final Uri m;
    public final boolean n;
    public final int o;
    public final a p;
    public final b q;
    public final i r;
    public final boolean s;
    public final boolean t;
    public final a0 u;
    public final g v;
    public final List<n> w;
    public final com.google.android.exoplayer2.drm.b x;
    public final vb.g y;
    public final s z;
    
    static {
        L = new AtomicInteger();
    }
    
    public h(final g v, final a a, final b b, final n n, final boolean a2, final a p27, final b q, final boolean b2, final Uri m, final List<n> w, final int n2, final Object o, final long n3, final long n4, final long n5, final int o2, final boolean k, final int l, final boolean t, final boolean s, final a0 u, final com.google.android.exoplayer2.drm.b x, final i r, final vb.g y, final s z, final boolean n6, final b0 b3) {
        super(a, b, n, n2, o, n3, n4, n5);
        this.A = a2;
        this.o = o2;
        this.K = k;
        this.l = l;
        this.q = q;
        this.p = p27;
        this.F = (q != null);
        this.B = b2;
        this.m = m;
        this.s = s;
        this.u = u;
        this.t = t;
        this.v = v;
        this.w = w;
        this.x = x;
        this.r = r;
        this.y = y;
        this.z = z;
        this.n = n6;
        this.I = (ImmutableList<Integer>)ImmutableList.of();
        this.k = h.L.getAndIncrement();
    }
    
    public static byte[] e(final String s) {
        String substring = s;
        if (e.O(s).startsWith("0x")) {
            substring = s.substring(2);
        }
        final byte[] byteArray = new BigInteger(substring, 16).toByteArray();
        final byte[] array = new byte[16];
        int n;
        if (byteArray.length > 16) {
            n = byteArray.length - 16;
        }
        else {
            n = 0;
        }
        System.arraycopy(byteArray, n, array, 16 - byteArray.length + n, byteArray.length - n);
        return array;
    }
    
    public final void a() {
        this.G = true;
    }
    
    @Override
    public final boolean c() {
        throw null;
    }
    
    public final void d(final a a, final b b, final boolean b2, final boolean b3) throws IOException {
        boolean b4;
        b a2;
        if (b2) {
            b4 = (this.E != 0);
            a2 = b;
        }
        else {
            a2 = b.a((long)this.E);
            b4 = false;
        }
        try {
            final db.e g = this.g(a, a2, b3);
            Label_0204: {
                Label_0065: {
                    if (!b4) {
                        break Label_0065;
                    }
                    g.n(this.E);
                    while (true) {
                        try {
                            try {
                                while (!this.G && ((hc.b)this.C).a.h((db.i)g, b.d) == 0) {}
                            }
                            finally {
                                break Label_0204;
                            }
                            final long n = g.d;
                            final long n2 = b.f;
                            this.E = (int)(n - n2);
                        }
                        catch (final EOFException ex) {
                            if ((super.d.j & 0x4000) != 0x0) {
                                ((hc.b)this.C).a.a(0L, 0L);
                                final long n = g.d;
                                final long n2 = b.f;
                                continue;
                            }
                            throw ex;
                        }
                        break;
                    }
                }
                return;
            }
            this.E = (int)(g.d - b.f);
        }
        finally {
            d.g(a);
        }
    }
    
    public final int f(final int n) {
        d0.f(this.n ^ true);
        if (n >= ((AbstractCollection)this.I).size()) {
            return 0;
        }
        return ((List<Integer>)this.I).get(n);
    }
    
    public final db.e g(a c, b b, boolean c2) throws IOException {
        final long a = c.a(b);
        Label_0141: {
            if (c2) {
                try {
                    final a0 u = this.u;
                    final boolean s = this.s;
                    final long g = super.g;
                    synchronized (u) {
                        if (u.a == 9223372036854775806L) {
                            c2 = true;
                        }
                        else {
                            c2 = false;
                        }
                        d0.f(c2);
                        if (u.b != -9223372036854775807L) {
                            break Label_0141;
                        }
                        if (s) {
                            u.d.set(g);
                        }
                        else {
                            while (u.b == -9223372036854775807L) {
                                u.wait();
                            }
                        }
                    }
                }
                catch (final InterruptedException ex) {
                    throw new InterruptedIOException();
                }
            }
        }
        final db.e e = new db.e((f)c, b.f, a);
        Label_1614: {
            if (this.C != null) {
                break Label_1614;
            }
            e.f = 0;
            while (true) {
                try {
                    this.z.y(10);
                    e.h(this.z.a, 0, 10, false);
                    long n2 = 0L;
                    Label_0444: {
                        if (this.z.t() == 4801587) {
                            this.z.C(3);
                            final int q = this.z.q();
                            final int n = q + 10;
                            final s z = this.z;
                            final byte[] a2 = z.a;
                            if (n > a2.length) {
                                z.y(n);
                                System.arraycopy(a2, 0, this.z.a, 0, 10);
                            }
                            e.h(this.z.a, 10, q, false);
                            final qb.a r2 = this.y.r2(q, this.z.a);
                            if (r2 != null) {
                                for (int length = r2.f.length, i = 0; i < length; ++i) {
                                    final a$b a$b = r2.f[i];
                                    if (a$b instanceof k) {
                                        final k k = (k)a$b;
                                        if ("com.apple.streaming.transportStreamTimestamp".equals(k.g)) {
                                            System.arraycopy(k.h, 0, this.z.a, 0, 8);
                                            this.z.B(0);
                                            this.z.A(8);
                                            n2 = (this.z.k() & 0x1FFFFFFFFL);
                                            break Label_0444;
                                        }
                                    }
                                }
                            }
                        }
                        n2 = -9223372036854775807L;
                    }
                    e.f = 0;
                    final i r3 = this.r;
                    Label_1354: {
                        if (r3 != null) {
                            b = (b)r3;
                            c = (a)((hc.b)b).a;
                            d0.f((c instanceof nb.d0 || c instanceof kb.e) ^ true);
                            c = (a)((hc.b)b).a;
                            if (c instanceof hc.n) {
                                c = (a)new hc.n(((hc.b)b).b.h, ((hc.b)b).c);
                            }
                            else if (c instanceof nb.f) {
                                c = (a)new nb.f(0);
                            }
                            else if (c instanceof nb.a) {
                                c = (a)new nb.a();
                            }
                            else if (c instanceof nb.d) {
                                c = (a)new nb.d();
                            }
                            else {
                                if (!(c instanceof jb.d)) {
                                    c = (a)((hc.b)b).a.getClass().getSimpleName();
                                    if (((String)c).length() != 0) {
                                        c = (a)"Unexpected extractor type for recreation: ".concat((String)c);
                                    }
                                    else {
                                        c = (a)new String("Unexpected extractor type for recreation: ");
                                    }
                                    throw new IllegalStateException((String)c);
                                }
                                c = (a)new jb.d();
                            }
                            c = (a)new hc.b((db.h)c, ((hc.b)b).b, ((hc.b)b).c);
                        }
                        else {
                            final g v = this.v;
                            b = (b)b.a;
                            final n d = super.d;
                            final Object w = this.w;
                            final a0 u2 = this.u;
                            c = (a)c.e();
                            ((hc.d)v).getClass();
                            final int x0 = yl.a.x0(d.q);
                            final int y0 = yl.a.y0((Map)c);
                            final int a3 = yl.a.A0((Uri)b);
                            c = (a)(Object)hc.d.b;
                            final ArrayList list = new ArrayList(7);
                            hc.d.a(x0, list);
                            hc.d.a(y0, list);
                            hc.d.a(a3, list);
                            for (int j = 0; j < 7; ++j) {
                                hc.d.a(c[j], list);
                            }
                            e.f = 0;
                            int l = 0;
                            b = null;
                            while (l < list.size()) {
                                final int intValue = list.get(l);
                                if (intValue != 0) {
                                    if (intValue != 1) {
                                        if (intValue != 2) {
                                            if (intValue != 7) {
                                                if (intValue != 8) {
                                                    if (intValue != 11) {
                                                        if (intValue != 13) {
                                                            c = null;
                                                        }
                                                        else {
                                                            c = (a)new hc.n(d.h, u2);
                                                        }
                                                    }
                                                    else {
                                                        int n3;
                                                        if (w != null) {
                                                            n3 = 48;
                                                            c = (a)w;
                                                        }
                                                        else {
                                                            c = (a)new n$a();
                                                            ((n$a)c).k = "application/cea-608";
                                                            c = (a)Collections.singletonList(new n((n$a)c));
                                                            n3 = 16;
                                                        }
                                                        final String n4 = d.n;
                                                        if (!TextUtils.isEmpty((CharSequence)n4)) {
                                                            final boolean b2 = bd.o.c(n4, "audio/mp4a-latm") != null;
                                                            int n5 = n3;
                                                            if (!b2) {
                                                                n5 = (n3 | 0x2);
                                                            }
                                                            final boolean b3 = bd.o.c(n4, "video/avc") != null;
                                                            n3 = n5;
                                                            if (!b3) {
                                                                n3 = (n5 | 0x4);
                                                            }
                                                        }
                                                        c = (a)new nb.d0(2, u2, new nb.h(n3, (List<n>)c));
                                                    }
                                                }
                                                else {
                                                    c = (a)d.o;
                                                    boolean b4 = false;
                                                    Label_1142: {
                                                        if (c != null) {
                                                            int n6 = 0;
                                                            while (true) {
                                                                final a$b[] f = ((qb.a)c).f;
                                                                if (n6 >= f.length) {
                                                                    break;
                                                                }
                                                                final a$b a$b2 = f[n6];
                                                                if (a$b2 instanceof hc.m) {
                                                                    b4 = (((hc.m)a$b2).h.isEmpty() ^ true);
                                                                    break Label_1142;
                                                                }
                                                                ++n6;
                                                            }
                                                        }
                                                        b4 = false;
                                                    }
                                                    int n7;
                                                    if (b4) {
                                                        n7 = 4;
                                                    }
                                                    else {
                                                        n7 = 0;
                                                    }
                                                    if (w != null) {
                                                        c = (a)w;
                                                    }
                                                    else {
                                                        c = (a)Collections.emptyList();
                                                    }
                                                    c = (a)new kb.e(n7, u2, null, (List<n>)c);
                                                }
                                            }
                                            else {
                                                c = (a)new jb.d(0L);
                                            }
                                        }
                                        else {
                                            c = (a)new nb.f(0);
                                        }
                                    }
                                    else {
                                        c = (a)new nb.d();
                                    }
                                }
                                else {
                                    c = (a)new nb.a();
                                }
                                c.getClass();
                                try {
                                    c2 = ((db.h)c).c((db.i)e);
                                }
                                catch (final EOFException ex2) {
                                    e.f = 0;
                                    c2 = false;
                                }
                                finally {
                                    e.f = 0;
                                }
                                if (c2) {
                                    c = (a)new hc.b((db.h)c, d, u2);
                                    break Label_1354;
                                }
                                if (b == null && (intValue == x0 || intValue == y0 || intValue == a3 || intValue == 11)) {
                                    b = (b)c;
                                }
                                ++l;
                            }
                            b.getClass();
                            c = (a)new hc.b((db.h)b, d, u2);
                        }
                    }
                    this.C = (i)c;
                    c = (a)((hc.b)c).a;
                    if (c instanceof nb.f || c instanceof nb.a || c instanceof nb.d || c instanceof jb.d) {
                        c = (a)this.D;
                        long n8;
                        if (n2 != -9223372036854775807L) {
                            n8 = this.u.b(n2);
                        }
                        else {
                            n8 = super.g;
                        }
                        if (((l)c).a0 != n8) {
                            ((l)c).a0 = n8;
                            c = (a)(Object)((l)c).A;
                            for (int length2 = c.length, n9 = 0; n9 < length2; ++n9) {
                                b = c[n9];
                                if (((p)b).F != n8) {
                                    ((p)b).F = n8;
                                    ((p)b).z = true;
                                }
                            }
                        }
                    }
                    else {
                        c = (a)this.D;
                        if (((l)c).a0 != 0L) {
                            ((l)c).a0 = 0L;
                            c = (a)(Object)((l)c).A;
                            for (int length3 = c.length, n10 = 0; n10 < length3; ++n10) {
                                b = c[n10];
                                if (((p)b).F != 0L) {
                                    ((p)b).F = 0L;
                                    ((p)b).z = true;
                                }
                            }
                        }
                    }
                    this.D.C.clear();
                    b = (b)this.C;
                    c = (a)this.D;
                    ((hc.b)b).a.f((j)c);
                    c = (a)this.D;
                    b = (b)this.x;
                    if (!c0.a(((l)c).b0, b)) {
                        ((l)c).b0 = (com.google.android.exoplayer2.drm.b)b;
                        int n11 = 0;
                        while (true) {
                            final l.c[] a4 = ((l)c).A;
                            if (n11 >= a4.length) {
                                break;
                            }
                            if (((l)c).T[n11]) {
                                final l.c c3 = a4[n11];
                                c3.I = (com.google.android.exoplayer2.drm.b)b;
                                c3.z = true;
                            }
                            ++n11;
                        }
                    }
                    return e;
                }
                catch (final EOFException ex3) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void load() throws IOException {
        this.D.getClass();
        if (this.C == null) {
            final i r = this.r;
            if (r != null) {
                final db.h a = ((hc.b)r).a;
                if (a instanceof nb.d0 || a instanceof kb.e) {
                    this.C = r;
                    this.F = false;
                }
            }
        }
        if (this.F) {
            this.p.getClass();
            this.q.getClass();
            this.d(this.p, this.q, this.B, false);
            this.E = 0;
            this.F = false;
        }
        if (!this.G) {
            if (!this.t) {
                this.d((a)super.i, super.b, this.A, true);
            }
            this.H = (this.G ^ true);
        }
    }
}
