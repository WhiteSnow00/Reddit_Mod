// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.platform.extensions;

import zg2.q;
import android.text.style.MetricAffectingSpan;
import l2.d;
import l2.h;
import android.text.style.ScaleXSpan;
import l2.i;
import java.util.Arrays;
import android.graphics.Typeface;
import n2.l;
import n2.m;
import o1.k0;
import t2.e;
import p2.c;
import t2.g;
import i2.a$b;
import java.util.ArrayList;
import i2.p;
import android.text.style.RelativeSizeSpan;
import android.text.style.AbsoluteSizeSpan;
import ah2.f;
import android.text.style.ForegroundColorSpan;
import android.text.Spannable;
import android.text.style.BackgroundColorSpan;
import o1.r;
import android.text.SpannableString;
import u2.k;
import u2.j;
import u2.b;

public final class a
{
    public static final float a(final long n, float x0, final b b) {
        final long b2 = j.b(n);
        if (k.a(b2, 4294967296L)) {
            x0 = b.x0(n);
        }
        else if (k.a(b2, 8589934592L)) {
            x0 *= j.c(n);
        }
        else {
            x0 = Float.NaN;
        }
        return x0;
    }
    
    public static final void b(final SpannableString spannableString, final long n, final int n2, final int n3) {
        if (n != r.l) {
            e((Spannable)spannableString, new BackgroundColorSpan(at1.a.X1(n)), n2, n3);
        }
    }
    
    public static final void c(final SpannableString spannableString, final long n, final int n2, final int n3) {
        if (n != r.l) {
            e((Spannable)spannableString, new ForegroundColorSpan(at1.a.X1(n)), n2, n3);
        }
    }
    
    public static final void d(final SpannableString spannableString, final long n, final b b, final int n2, final int n3) {
        f.f((Object)b, "density");
        final long b2 = j.b(n);
        if (k.a(b2, 4294967296L)) {
            e((Spannable)spannableString, new AbsoluteSizeSpan(at1.a.D1(b.x0(n)), false), n2, n3);
        }
        else if (k.a(b2, 8589934592L)) {
            e((Spannable)spannableString, new RelativeSizeSpan(j.c(n)), n2, n3);
        }
    }
    
    public static final void e(final Spannable spannable, final Object o, final int n, final int n2) {
        f.f((Object)spannable, "<this>");
        f.f(o, "span");
        spannable.setSpan(o, n, n2, 33);
    }
    
    public static final void f(final SpannableString spannableString, final p p5, final ArrayList list, final b b, final zg2.r r) {
        f.f((Object)p5, "contextTextStyle");
        f.f((Object)b, "density");
        final ArrayList list2 = new ArrayList(list.size());
        final int size = list.size();
        int n = 0;
        while (true) {
            final boolean b2 = true;
            if (n >= size) {
                break;
            }
            final Object value = list.get(n);
            final a$b a$b = (a$b)value;
            int n2 = b2 ? 1 : 0;
            if (!at1.a.M0((i2.k)a$b.a)) {
                if (((i2.k)a$b.a).e != null) {
                    n2 = (b2 ? 1 : 0);
                }
                else {
                    n2 = 0;
                }
            }
            if (n2 != 0) {
                list2.add(value);
            }
            ++n;
        }
        i2.k k;
        if (at1.a.M0(p5.a) || p5.a.e != null) {
            final i2.k a = p5.a;
            k = new i2.k(0L, 0L, a.c, a.d, a.e, a.f, (String)null, 0L, (t2.a)null, (g)null, (c)null, 0L, (e)null, (k0)null, 16323);
        }
        else {
            k = null;
        }
        final SpannableExtensions_androidKt$setFontAttributes$1 spannableExtensions_androidKt$setFontAttributes$1 = new SpannableExtensions_androidKt$setFontAttributes$1((Spannable)spannableString, (zg2.r<? super n2.g, ? super m, ? super n2.k, ? super l, ? extends Typeface>)r);
        if (list2.size() <= 1) {
            if (list2.isEmpty() ^ true) {
                final i2.k i = (i2.k)list2.get(0).a;
                i2.k d;
                if (k == null) {
                    d = i;
                }
                else {
                    d = k.d(i);
                }
                ((q)spannableExtensions_androidKt$setFontAttributes$1).invoke((Object)d, (Object)list2.get(0).b, (Object)list2.get(0).c);
            }
        }
        else {
            final int size2 = list2.size();
            final int n3 = size2 * 2;
            final Integer[] array = new Integer[n3];
            for (int j = 0; j < n3; ++j) {
                array[j] = 0;
            }
            for (int size3 = list2.size(), l = 0; l < size3; ++l) {
                final a$b a$b2 = list2.get(l);
                array[l] = a$b2.b;
                array[l + size2] = a$b2.c;
            }
            final Comparable[] array2 = array;
            if (array2.length > 1) {
                Arrays.sort(array2);
            }
            int intValue = ((Number)kotlin.collections.b.C1((Object[])array)).intValue();
            for (final int intValue2 : array) {
                if (intValue2 != intValue) {
                    final int size4 = list2.size();
                    i2.k m = k;
                    i2.k k2;
                    for (int n5 = 0; n5 < size4; ++n5, m = k2) {
                        final a$b a$b3 = list2.get(n5);
                        final int b3 = a$b3.b;
                        final int c = a$b3.c;
                        k2 = m;
                        if (b3 != c) {
                            k2 = m;
                            if (i2.b.c(intValue, intValue2, b3, c)) {
                                final i2.k k3 = (i2.k)a$b3.a;
                                i2.k d2;
                                if (m == null) {
                                    d2 = k3;
                                }
                                else {
                                    d2 = m.d(k3);
                                }
                                k2 = d2;
                            }
                        }
                    }
                    if (m != null) {
                        ((q)spannableExtensions_androidKt$setFontAttributes$1).invoke((Object)m, (Object)intValue, (Object)intValue2);
                    }
                    intValue = intValue2;
                }
            }
        }
        final ArrayList<r2.b> list3 = new ArrayList<r2.b>();
        for (int size5 = list.size(), n6 = 0; n6 < size5; ++n6) {
            final a$b a$b4 = list.get(n6);
            final int b4 = a$b4.b;
            final int c2 = a$b4.c;
            if (b4 >= 0 && b4 < spannableString.length() && c2 > b4) {
                if (c2 <= spannableString.length()) {
                    final int b5 = a$b4.b;
                    final int c3 = a$b4.c;
                    final i2.k k4 = (i2.k)a$b4.a;
                    final t2.a i2 = k4.i;
                    if (i2 != null) {
                        e((Spannable)spannableString, new l2.a(i2.a), b5, c3);
                    }
                    c(spannableString, k4.b(), b5, c3);
                    k4.a.d();
                    final e m2 = k4.m;
                    if (m2 != null) {
                        e((Spannable)spannableString, new i(m2.a(e.c), m2.a(e.d)), b5, c3);
                    }
                    d(spannableString, k4.b, b, b5, c3);
                    final String g = k4.g;
                    if (g != null) {
                        e((Spannable)spannableString, new l2.b(g), b5, c3);
                    }
                    final g j2 = k4.j;
                    if (j2 != null) {
                        e((Spannable)spannableString, new ScaleXSpan(j2.a), b5, c3);
                        e((Spannable)spannableString, new l2.c(j2.b, 1), b5, c3);
                    }
                    final c k5 = k4.k;
                    if (k5 != null) {
                        e((Spannable)spannableString, r2.a.a.a(k5), b5, c3);
                    }
                    b(spannableString, k4.l, b5, c3);
                    final k0 n7 = k4.n;
                    if (n7 != null) {
                        e((Spannable)spannableString, new h(at1.a.X1(n7.a), n1.c.c(n7.b), n1.c.d(n7.b), n7.c), b5, c3);
                    }
                    final long h = k4.h;
                    final long b6 = j.b(h);
                    MetricAffectingSpan metricAffectingSpan;
                    if (u2.k.a(b6, 4294967296L)) {
                        metricAffectingSpan = new d(b.x0(h));
                    }
                    else if (u2.k.a(b6, 8589934592L)) {
                        metricAffectingSpan = new l2.c(j.c(h), 0);
                    }
                    else {
                        metricAffectingSpan = null;
                    }
                    if (metricAffectingSpan != null) {
                        list3.add(new r2.b(metricAffectingSpan, b5, c3));
                    }
                }
            }
        }
        for (int n8 = 0; n8 < list3.size(); ++n8) {
            final r2.b b7 = list3.get(n8);
            e((Spannable)spannableString, b7.a, b7.b, b7.c);
        }
    }
}
