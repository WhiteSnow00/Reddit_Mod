// 
// Decompiled by Procyon v0.6.0
// 

package pc;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff$Mode;
import nc.a$a;
import java.util.ArrayList;
import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import java.util.Collections;
import android.util.SparseArray;
import android.util.Log;
import bd.r;
import nc.f;
import bd.s;
import java.util.List;
import nc.e;

public final class a extends e
{
    public final b m;
    
    public a(final List<byte[]> list) {
        final s s = new s(list.get(0));
        this.m = new b(s.w(), s.w());
    }
    
    @Override
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
        final c c = new(pc.c.class)();
        final b m = this.m;
        m.getClass();
        final r r = new r(array, i);
        while (r.b() >= 48 && r.g(8) == 15) {
            final b.h f2 = m.f;
            final int g = r.g(8);
            i = r.g(16);
            final int g2 = r.g(16);
            final int d = r.d();
            if (g2 * 8 > r.b()) {
                Log.w("DvbParser", "Data field length exceeds limit");
                r.m(r.b());
            }
            else {
                switch (g) {
                    case 20: {
                        if (i == f2.a) {
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
                        if (i == f2.a) {
                            final b.c f4 = b.f(r);
                            f2.e.put(f4.a, (Object)f4);
                            break;
                        }
                        if (i == f2.b) {
                            final b.c f5 = b.f(r);
                            f2.g.put(f5.a, (Object)f5);
                            break;
                        }
                        break;
                    }
                    case 18: {
                        if (i == f2.a) {
                            final b.a e = b.e(r, g2);
                            f2.d.put(e.a, (Object)e);
                            break;
                        }
                        if (i == f2.b) {
                            final b.a e2 = b.e(r, g2);
                            f2.f.put(e2.a, (Object)e2);
                            break;
                        }
                        break;
                    }
                    case 17: {
                        final b.d j = f2.i;
                        if (i == f2.a && j != null) {
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
                                Label_0686: {
                                    if (g17 != 1) {
                                        i = n;
                                        if (g17 != 2) {
                                            break Label_0686;
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
                        if (i != f2.a) {
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
        c c2;
        List<Object> unmodifiableList;
        if (i2 == null) {
            final List<Object> emptyList = Collections.emptyList();
            c2 = c;
            unmodifiableList = emptyList;
        }
        else {
            Object o = f9.h;
            if (o == null) {
                o = m.d;
            }
            final Bitmap g25 = m.g;
            if (g25 == null || ((b.b)o).a + 1 != g25.getWidth() || ((b.b)o).b + 1 != m.g.getHeight()) {
                final Bitmap bitmap = Bitmap.createBitmap(((b.b)o).a + 1, ((b.b)o).b + 1, Bitmap$Config.ARGB_8888);
                m.g = bitmap;
                m.c.setBitmap(bitmap);
            }
            final ArrayList<nc.a> list = new ArrayList<nc.a>();
            final SparseArray<b.e> c3 = i2.c;
            i = 0;
            c2 = c;
            while (i < c3.size()) {
                m.c.save();
                final b.e e3 = (b.e)c3.valueAt(i);
                final b.f f10 = (b.f)m.f.c.get(c3.keyAt(i));
                final int n2 = e3.a + ((b.b)o).c;
                final int n3 = e3.b + ((b.b)o).e;
                m.c.clipRect(n2, n3, Math.min(f10.c + n2, ((b.b)o).d), Math.min(f10.d + n3, ((b.b)o).f));
                Object e4;
                if ((e4 = m.f.d.get(f10.f)) == null && (e4 = m.f.f.get(f10.f)) == null) {
                    e4 = m.e;
                }
                final SparseArray<b.g> j2 = f10.j;
                int n4 = 0;
                final int n5 = i;
                while (n4 < j2.size()) {
                    i = j2.keyAt(n4);
                    final b.g g26 = (b.g)j2.valueAt(n4);
                    b.c c4;
                    if ((c4 = (b.c)m.f.e.get(i)) == null) {
                        c4 = (b.c)m.f.g.get(i);
                    }
                    if (c4 != null) {
                        Paint a;
                        if (c4.b) {
                            a = null;
                        }
                        else {
                            a = m.a;
                        }
                        i = f10.e;
                        final int n6 = g26.a + n2;
                        final int n7 = g26.b + n3;
                        final Canvas c5 = m.c;
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
                        b.d(c4.c, array2, i, n6, n7, a, c5);
                        b.d(c4.d, array2, i, n6, n7 + 1, a, c5);
                    }
                    ++n4;
                }
                if (f10.b) {
                    i = f10.e;
                    if (i == 3) {
                        i = ((b.a)e4).d[f10.g];
                    }
                    else if (i == 2) {
                        i = ((b.a)e4).c[f10.h];
                    }
                    else {
                        i = ((b.a)e4).b[f10.i];
                    }
                    m.b.setColor(i);
                    m.c.drawRect((float)n2, (float)n3, (float)(f10.c + n2), (float)(f10.d + n3), m.b);
                }
                final a$a a$a = new a$a();
                a$a.b = Bitmap.createBitmap(m.g, n2, n3, f10.c, f10.d);
                final float n8 = (float)n2;
                final float n9 = (float)((b.b)o).a;
                a$a.h = n8 / n9;
                a$a.i = 0;
                final float n10 = (float)n3;
                final float n11 = (float)((b.b)o).b;
                a$a.e = n10 / n11;
                a$a.f = 0;
                a$a.g = 0;
                a$a.l = f10.c / n9;
                a$a.m = f10.d / n11;
                list.add(a$a.a());
                m.c.drawColor(0, PorterDuff$Mode.CLEAR);
                m.c.restore();
                i = n5 + 1;
            }
            unmodifiableList = Collections.unmodifiableList((List<?>)list);
        }
        new c((List)unmodifiableList);
        return (f)c2;
    }
}
