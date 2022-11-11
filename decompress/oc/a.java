// 
// Decompiled by Procyon v0.6.0
// 

package oc;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import mc.a$a;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.Collections;
import android.util.SparseArray;
import android.util.Log;
import ad.r;
import mc.f;
import ad.s;
import java.util.List;
import mc.e;

public final class a extends e
{
    public final b m;
    
    public a(final List<byte[]> list) {
        final s s = new s((byte[])list.get(0));
        this.m = new b(s.w(), s.w());
    }
    
    public final f g(final byte[] array, int i, final boolean b) {
        if (b) {
            final b.h f = this.m.f;
            f.c.clear();
            f.d.clear();
            f.e.clear();
            f.f.clear();
            f.g.clear();
            f.h = null;
            f.i = null;
        }
        Object o = new(oc.c.class)();
        final b m = this.m;
        m.getClass();
        final r r = new r(array, i);
        while (r.b() >= 48 && r.g(8) == 15) {
            final b.h f2 = m.f;
            i = r.g(8);
            final int g = r.g(16);
            final int g2 = r.g(16);
            final int d = r.d();
            if (g2 * 8 > r.b()) {
                Log.w("DvbParser", "Data field length exceeds limit");
                r.m(r.b());
            }
            else {
                switch (i) {
                    case 20: {
                        if (g == f2.a) {
                            r.m(4);
                            final boolean f3 = r.f();
                            r.m(3);
                            final int g3 = r.g(16);
                            final int g4 = r.g(16);
                            int g5;
                            int g6;
                            int g7;
                            if (f3) {
                                g5 = r.g(16);
                                g6 = r.g(16);
                                g7 = r.g(16);
                                i = r.g(16);
                            }
                            else {
                                g6 = g3;
                                i = g4;
                                g5 = 0;
                                g7 = 0;
                            }
                            f2.h = new b.b(g3, g4, g5, g6, g7, i);
                            break;
                        }
                        break;
                    }
                    case 19: {
                        if (g == f2.a) {
                            final b.c f4 = b.f(r);
                            f2.e.put(f4.a, (Object)f4);
                            break;
                        }
                        if (g == f2.b) {
                            final b.c f5 = b.f(r);
                            f2.g.put(f5.a, (Object)f5);
                            break;
                        }
                        break;
                    }
                    case 18: {
                        if (g == f2.a) {
                            final b.a e = b.e(r, g2);
                            f2.d.put(e.a, (Object)e);
                            break;
                        }
                        if (g == f2.b) {
                            final b.a e2 = b.e(r, g2);
                            f2.f.put(e2.a, (Object)e2);
                            break;
                        }
                        break;
                    }
                    case 17: {
                        final b.d j = f2.i;
                        if (g == f2.a && j != null) {
                            final int g8 = r.g(8);
                            r.m(4);
                            final boolean f6 = r.f();
                            r.m(3);
                            final int g9 = r.g(16);
                            final int g10 = r.g(16);
                            r.g(3);
                            final int g11 = r.g(3);
                            r.m(2);
                            final int g12 = r.g(8);
                            final int g13 = r.g(8);
                            final int g14 = r.g(4);
                            final int g15 = r.g(2);
                            r.m(2);
                            i = g2 - 10;
                            final SparseArray sparseArray = new SparseArray();
                            while (i > 0) {
                                final int g16 = r.g(16);
                                final int g17 = r.g(2);
                                r.g(2);
                                final int g18 = r.g(12);
                                r.m(4);
                                final int g19 = r.g(12);
                                final int n = i - 6;
                                Label_0692: {
                                    if (g17 != 1) {
                                        i = n;
                                        if (g17 != 2) {
                                            break Label_0692;
                                        }
                                    }
                                    r.g(8);
                                    r.g(8);
                                    i = n - 2;
                                }
                                sparseArray.put(g16, (Object)new b.g(g18, g19));
                            }
                            final b.f f7 = new b.f(g8, f6, g9, g10, g11, g12, g13, g14, g15, sparseArray);
                            if (j.b == 0) {
                                final b.f f8 = (b.f)f2.c.get(g8);
                                if (f8 != null) {
                                    SparseArray<b.g> k;
                                    for (k = f8.j, i = 0; i < k.size(); ++i) {
                                        f7.j.put(k.keyAt(i), (Object)k.valueAt(i));
                                    }
                                }
                            }
                            f2.c.put(f7.a, (Object)f7);
                            break;
                        }
                        break;
                    }
                    case 16: {
                        if (g != f2.a) {
                            break;
                        }
                        final b.d l = f2.i;
                        r.g(8);
                        final int g20 = r.g(4);
                        final int g21 = r.g(2);
                        r.m(2);
                        i = g2 - 2;
                        final SparseArray sparseArray2 = new SparseArray();
                        while (i > 0) {
                            final int g22 = r.g(8);
                            r.m(8);
                            final int g23 = r.g(16);
                            final int g24 = r.g(16);
                            i -= 6;
                            sparseArray2.put(g22, (Object)new b.e(g23, g24));
                        }
                        final b.d d2 = new b.d(g20, g21, sparseArray2);
                        if (g21 != 0) {
                            f2.i = d2;
                            f2.c.clear();
                            f2.d.clear();
                            f2.e.clear();
                            break;
                        }
                        if (l != null && l.a != g20) {
                            f2.i = d2;
                            break;
                        }
                        break;
                    }
                }
                r.n(d + g2 - r.d());
            }
        }
        final b.h f9 = m.f;
        final b.d i2 = f9.i;
        List<Object> emptyList;
        if (i2 == null) {
            emptyList = (List<Object>)Collections.emptyList();
        }
        else {
            Object o2 = f9.h;
            if (o2 == null) {
                o2 = m.d;
            }
            final Bitmap g25 = m.g;
            if (g25 == null || ((b.b)o2).a + 1 != g25.getWidth() || ((b.b)o2).b + 1 != m.g.getHeight()) {
                final Bitmap bitmap = Bitmap.createBitmap(((b.b)o2).a + 1, ((b.b)o2).b + 1, Bitmap$Config.ARGB_8888);
                m.g = bitmap;
                m.c.setBitmap(bitmap);
            }
            final ArrayList<mc.a> list = new ArrayList<mc.a>();
            final SparseArray<b.e> c = i2.c;
            i = 0;
            final f f10 = (f)o;
            while (i < c.size()) {
                m.c.save();
                final b.e e3 = (b.e)c.valueAt(i);
                final b.f f11 = (b.f)m.f.c.get(c.keyAt(i));
                final int n2 = e3.a + ((b.b)o2).c;
                final int n3 = e3.b + ((b.b)o2).e;
                m.c.clipRect(n2, n3, Math.min(f11.c + n2, ((b.b)o2).d), Math.min(f11.d + n3, ((b.b)o2).f));
                Object e4;
                if ((e4 = m.f.d.get(f11.f)) == null && (e4 = m.f.f.get(f11.f)) == null) {
                    e4 = m.e;
                }
                final SparseArray<b.g> j2 = f11.j;
                int n4 = 0;
                final int n5 = i;
                while (n4 < j2.size()) {
                    i = j2.keyAt(n4);
                    final b.g g26 = (b.g)j2.valueAt(n4);
                    b.c c2;
                    if ((c2 = (b.c)m.f.e.get(i)) == null) {
                        c2 = (b.c)m.f.g.get(i);
                    }
                    if (c2 != null) {
                        Paint a;
                        if (c2.b) {
                            a = null;
                        }
                        else {
                            a = m.a;
                        }
                        i = f11.e;
                        final int n6 = g26.a + n2;
                        final int n7 = g26.b + n3;
                        final Canvas c3 = m.c;
                        int[] array2;
                        if (i == 3) {
                            array2 = ((b.a)e4).d;
                        }
                        else if (i == 2) {
                            array2 = ((b.a)e4).c;
                        }
                        else {
                            array2 = ((b.a)e4).b;
                        }
                        b.d(c2.c, array2, i, n6, n7, a, c3);
                        b.d(c2.d, array2, i, n6, n7 + 1, a, c3);
                    }
                    ++n4;
                }
                if (f11.b) {
                    i = f11.e;
                    if (i == 3) {
                        i = ((b.a)e4).d[f11.g];
                    }
                    else if (i == 2) {
                        i = ((b.a)e4).c[f11.h];
                    }
                    else {
                        i = ((b.a)e4).b[f11.i];
                    }
                    m.b.setColor(i);
                    m.c.drawRect((float)n2, (float)n3, (float)(f11.c + n2), (float)(f11.d + n3), m.b);
                }
                final a$a a$a = new a$a();
                a$a.b = Bitmap.createBitmap(m.g, n2, n3, f11.c, f11.d);
                final float n8 = (float)n2;
                final float n9 = (float)((b.b)o2).a;
                a$a.h = n8 / n9;
                a$a.i = 0;
                final float n10 = (float)n3;
                final float n11 = (float)((b.b)o2).b;
                a$a.e = n10 / n11;
                a$a.f = 0;
                a$a.g = 0;
                a$a.l = f11.c / n9;
                a$a.m = f11.d / n11;
                list.add(a$a.a());
                m.c.drawColor(0, PorterDuff$Mode.CLEAR);
                m.c.restore();
                i = n5 + 1;
            }
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list);
            o = f10;
            emptyList = unmodifiableList;
        }
        new c((List<mc.a>)emptyList);
        return (f)o;
    }
}
