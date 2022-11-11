// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.platform.extensions;

import rg2.q;
import android.text.style.MetricAffectingSpan;
import l2.d;
import l2.h;
import android.text.style.ScaleXSpan;
import l2.i;
import java.util.Arrays;
import o1.k0;
import p2.c;
import t2.g;
import java.util.ArrayList;
import i2.p;
import android.text.style.RelativeSizeSpan;
import android.text.style.AbsoluteSizeSpan;
import sg2.e;
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
    public static final float a(final long n, float a0, final b b) {
        final long b2 = j.b(n);
        if (k.a(b2, 4294967296L)) {
            a0 = b.A0(n);
        }
        else if (k.a(b2, 8589934592L)) {
            a0 *= j.c(n);
        }
        else {
            a0 = Float.NaN;
        }
        return a0;
    }
    
    public static final void b(final SpannableString spannableString, final long n, final int n2, final int n3) {
        if (n != r.l) {
            e((Spannable)spannableString, new BackgroundColorSpan(aa1.a.b1(n)), n2, n3);
        }
    }
    
    public static final void c(final SpannableString spannableString, final long n, final int n2, final int n3) {
        if (n != r.l) {
            e((Spannable)spannableString, new ForegroundColorSpan(aa1.a.b1(n)), n2, n3);
        }
    }
    
    public static final void d(final SpannableString spannableString, final long n, final b b, final int n2, final int n3) {
        e.f((Object)b, "density");
        final long b2 = j.b(n);
        if (k.a(b2, 4294967296L)) {
            e((Spannable)spannableString, new AbsoluteSizeSpan(lw0.b.k2(b.A0(n)), false), n2, n3);
        }
        else if (k.a(b2, 8589934592L)) {
            e((Spannable)spannableString, new RelativeSizeSpan(j.c(n)), n2, n3);
        }
    }
    
    public static final void e(final Spannable spannable, final Object o, final int n, final int n2) {
        e.f((Object)spannable, "<this>");
        e.f(o, "span");
        spannable.setSpan(o, n, n2, 33);
    }
    
    public static final void f(final SpannableString spannableString, final p p5, final ArrayList list, final b b, final rg2.r r) {
        e.f((Object)p5, "contextTextStyle");
        e.f((Object)b, "density");
        final ArrayList list2 = new ArrayList(list.size());
        final int size = list.size();
        int n = 0;
        while (true) {
            final boolean b2 = true;
            if (n >= size) {
                break;
            }
            final Object value = list.get(n);
            final i2.a.b b3 = (i2.a.b)value;
            int n2 = b2 ? 1 : 0;
            if (!a92.b.S((i2.k)b3.a)) {
                if (((i2.k)b3.a).e != null) {
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
        if (a92.b.S(p5.a) || p5.a.e != null) {
            final i2.k a = p5.a;
            k = new i2.k(0L, 0L, a.c, a.d, a.e, a.f, null, 0L, null, null, null, 0L, null, null, 16323);
        }
        else {
            k = null;
        }
        final SpannableExtensions_androidKt$setFontAttributes$1 spannableExtensions_androidKt$setFontAttributes$1 = new SpannableExtensions_androidKt$setFontAttributes$1((Spannable)spannableString, r);
        if (list2.size() <= 1) {
            if (list2.isEmpty() ^ true) {
                final i2.k i = (i2.k)((i2.a.b)list2.get(0)).a;
                i2.k d;
                if (k == null) {
                    d = i;
                }
                else {
                    d = k.d(i);
                }
                ((q<i2.k, Integer, Integer, Object>)spannableExtensions_androidKt$setFontAttributes$1).invoke(d, Integer.valueOf(((i2.a.b)list2.get(0)).b), Integer.valueOf(((i2.a.b)list2.get(0)).c));
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
                final i2.a.b b4 = (i2.a.b)list2.get(l);
                array[l] = b4.b;
                array[l + size2] = b4.c;
            }
            final Comparable[] array2 = array;
            if (array2.length > 1) {
                Arrays.sort(array2);
            }
            int intValue = kotlin.collections.b.Y0(array).intValue();
            for (final int intValue2 : array) {
                if (intValue2 != intValue) {
                    final int size4 = list2.size();
                    i2.k m = k;
                    i2.k k2;
                    for (int n5 = 0; n5 < size4; ++n5, m = k2) {
                        final i2.a.b b5 = (i2.a.b)list2.get(n5);
                        final int b6 = b5.b;
                        final int c = b5.c;
                        k2 = m;
                        if (b6 != c) {
                            k2 = m;
                            if (i2.b.c(intValue, intValue2, b6, c)) {
                                final i2.k k3 = (i2.k)b5.a;
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
                        ((q<i2.k, Integer, Integer, Object>)spannableExtensions_androidKt$setFontAttributes$1).invoke(m, Integer.valueOf(intValue), Integer.valueOf(intValue2));
                    }
                    intValue = intValue2;
                }
            }
        }
        final ArrayList<r2.b> list3 = new ArrayList<r2.b>();
        for (int size5 = list.size(), n6 = 0; n6 < size5; ++n6) {
            final i2.a.b b7 = (i2.a.b)list.get(n6);
            final int b8 = b7.b;
            final int c2 = b7.c;
            if (b8 >= 0 && b8 < spannableString.length() && c2 > b8) {
                if (c2 <= spannableString.length()) {
                    final int b9 = b7.b;
                    final int c3 = b7.c;
                    final i2.k k4 = (i2.k)b7.a;
                    final t2.a i2 = k4.i;
                    if (i2 != null) {
                        e((Spannable)spannableString, new l2.a(i2.a), b9, c3);
                    }
                    c(spannableString, k4.b(), b9, c3);
                    k4.a.d();
                    final t2.e m2 = k4.m;
                    if (m2 != null) {
                        e((Spannable)spannableString, new i(m2.a(t2.e.c), m2.a(t2.e.d)), b9, c3);
                    }
                    d(spannableString, k4.b, b, b9, c3);
                    final String g = k4.g;
                    if (g != null) {
                        e((Spannable)spannableString, new l2.b(g), b9, c3);
                    }
                    final g j2 = k4.j;
                    if (j2 != null) {
                        e((Spannable)spannableString, new ScaleXSpan(j2.a), b9, c3);
                        e((Spannable)spannableString, new l2.c(j2.b, 1), b9, c3);
                    }
                    final c k5 = k4.k;
                    if (k5 != null) {
                        e((Spannable)spannableString, r2.a.a.a(k5), b9, c3);
                    }
                    b(spannableString, k4.l, b9, c3);
                    final k0 n7 = k4.n;
                    if (n7 != null) {
                        e((Spannable)spannableString, new h(aa1.a.b1(n7.a), n1.c.c(n7.b), n1.c.d(n7.b), n7.c), b9, c3);
                    }
                    final long h = k4.h;
                    final long b10 = j.b(h);
                    Object o;
                    if (u2.k.a(b10, 4294967296L)) {
                        o = new d(b.A0(h));
                    }
                    else if (u2.k.a(b10, 8589934592L)) {
                        o = new l2.c(j.c(h), 0);
                    }
                    else {
                        o = null;
                    }
                    if (o != null) {
                        list3.add(new r2.b((MetricAffectingSpan)o, b9, c3));
                    }
                }
            }
        }
        for (int n8 = 0; n8 < list3.size(); ++n8) {
            final r2.b b11 = list3.get(n8);
            e((Spannable)spannableString, b11.a, b11.b, b11.c);
        }
    }
}
