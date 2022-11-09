// 
// Decompiled by Procyon v0.6.0
// 

package uc;

import android.text.Spannable;
import android.text.Layout$Alignment;
import java.util.Iterator;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import rc.c;
import java.util.ArrayDeque;
import android.text.style.TypefaceSpan;
import android.text.style.BackgroundColorSpan;
import at1.a;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import mj2.c0;
import java.util.Map;
import android.util.Pair;
import java.util.TreeSet;
import nc.a$a;
import android.text.SpannableStringBuilder;
import java.util.TreeMap;
import java.util.ArrayList;
import java.util.HashMap;

public final class d
{
    public final String a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final f f;
    public final String[] g;
    public final String h;
    public final String i;
    public final d j;
    public final HashMap<String, Integer> k;
    public final HashMap<String, Integer> l;
    public ArrayList m;
    
    public d(final String a, final String b, final long d, final long e, final f f, final String[] g, final String h, final String i, final d j) {
        this.a = a;
        this.b = b;
        this.i = i;
        this.f = f;
        this.g = g;
        this.c = (b != null);
        this.d = d;
        this.e = e;
        h.getClass();
        this.h = h;
        this.j = j;
        this.k = new HashMap<String, Integer>();
        this.l = new HashMap<String, Integer>();
    }
    
    public static d a(final String s) {
        return new d(null, s.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }
    
    public static SpannableStringBuilder e(final String s, final TreeMap treeMap) {
        if (!treeMap.containsKey(s)) {
            final a$a a$a = new a$a();
            a$a.a = (CharSequence)new SpannableStringBuilder();
            treeMap.put(s, a$a);
        }
        final CharSequence a = treeMap.get(s).a;
        a.getClass();
        return (SpannableStringBuilder)a;
    }
    
    public final d b(final int n) {
        final ArrayList m = this.m;
        if (m != null) {
            return (d)m.get(n);
        }
        throw new IndexOutOfBoundsException();
    }
    
    public final int c() {
        final ArrayList m = this.m;
        int size;
        if (m == null) {
            size = 0;
        }
        else {
            size = m.size();
        }
        return size;
    }
    
    public final void d(final TreeSet<Long> set, final boolean b) {
        final boolean equals = "p".equals(this.a);
        final boolean equals2 = "div".equals(this.a);
        if (b || equals || (equals2 && this.i != null)) {
            final long d = this.d;
            if (d != -9223372036854775807L) {
                set.add(d);
            }
            final long e = this.e;
            if (e != -9223372036854775807L) {
                set.add(e);
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); ++i) {
            ((d)this.m.get(i)).d(set, b || equals);
        }
    }
    
    public final boolean f(final long n) {
        final long d = this.d;
        return (d == -9223372036854775807L && this.e == -9223372036854775807L) || (d <= n && this.e == -9223372036854775807L) || (d == -9223372036854775807L && n < this.e) || (d <= n && n < this.e);
    }
    
    public final void g(final long n, String h, final ArrayList list) {
        if (!"".equals(this.h)) {
            h = this.h;
        }
        if (this.f(n) && "div".equals(this.a) && this.i != null) {
            list.add(new Pair((Object)h, (Object)this.i));
            return;
        }
        for (int i = 0; i < this.c(); ++i) {
            this.b(i).g(n, h, list);
        }
    }
    
    public final void h(final long n, final Map map, final Map map2, final String s, final TreeMap treeMap) {
        if (!this.f(n)) {
            return;
        }
        String h;
        if ("".equals(this.h)) {
            h = s;
        }
        else {
            h = this.h;
        }
        for (final Map.Entry<String, V> entry : this.l.entrySet()) {
            final String s2 = entry.getKey();
            int intValue;
            if (this.k.containsKey(s2)) {
                intValue = this.k.get(s2);
            }
            else {
                intValue = 0;
            }
            final int intValue2 = (int)entry.getValue();
            if (intValue != intValue2) {
                final a$a a$a = treeMap.get(s2);
                a$a.getClass();
                final e e = map2.get(h);
                e.getClass();
                final int j = e.j;
                final f c0 = mj2.c0.c0(this.f, this.g, map);
                SpannableStringBuilder a;
                if ((a = (SpannableStringBuilder)a$a.a) == null) {
                    a = new SpannableStringBuilder();
                    a$a.a = (CharSequence)a;
                }
                if (c0 == null) {
                    continue;
                }
                d d = this.j;
                final int h2 = c0.h;
                int n2 = -1;
                if (h2 != -1 || c0.i != -1) {
                    final boolean b = h2 == 1;
                    int n3;
                    if (c0.i == 1) {
                        n3 = 2;
                    }
                    else {
                        n3 = 0;
                    }
                    n2 = (n3 | (b ? 1 : 0));
                }
                if (n2 != -1) {
                    final int h3 = c0.h;
                    int n4;
                    if (h3 == -1 && c0.i == -1) {
                        n4 = -1;
                    }
                    else {
                        final boolean b2 = h3 == 1;
                        int n5;
                        if (c0.i == 1) {
                            n5 = 2;
                        }
                        else {
                            n5 = 0;
                        }
                        n4 = (n5 | (b2 ? 1 : 0));
                    }
                    ((Spannable)a).setSpan((Object)new StyleSpan(n4), intValue, intValue2, 33);
                }
                if (c0.f == 1) {
                    ((Spannable)a).setSpan((Object)new StrikethroughSpan(), intValue, intValue2, 33);
                }
                if (c0.g == 1) {
                    ((Spannable)a).setSpan((Object)new UnderlineSpan(), intValue, intValue2, 33);
                }
                if (c0.c) {
                    if (!c0.c) {
                        throw new IllegalStateException("Font color has not been defined.");
                    }
                    at1.a.C(a, (Object)new ForegroundColorSpan(c0.b), intValue, intValue2);
                }
                if (c0.e) {
                    if (!c0.e) {
                        throw new IllegalStateException("Background color has not been defined.");
                    }
                    at1.a.C(a, (Object)new BackgroundColorSpan(c0.d), intValue, intValue2);
                }
                if (c0.a != null) {
                    at1.a.C(a, (Object)new TypefaceSpan(c0.a), intValue, intValue2);
                }
                final b r = c0.r;
                if (r != null) {
                    int a2 = r.a;
                    int b3;
                    if (a2 == -1) {
                        if (j != 2 && j != 1) {
                            a2 = 1;
                        }
                        else {
                            a2 = 3;
                        }
                        b3 = 1;
                    }
                    else {
                        b3 = r.b;
                    }
                    int c2;
                    if ((c2 = r.c) == -2) {
                        c2 = 1;
                    }
                    at1.a.C(a, (Object)new rc.d(a2, b3, c2), intValue, intValue2);
                }
                final int m = c0.m;
                Label_0950: {
                    if (m == 2) {
                        while (true) {
                            while (d != null) {
                                final f c3 = mj2.c0.c0(d.f, d.g, map);
                                if (c3 != null && c3.m == 1) {
                                    if (d == null) {
                                        break Label_0950;
                                    }
                                    final ArrayDeque<d> arrayDeque = new ArrayDeque<d>();
                                    arrayDeque.push(d);
                                    while (true) {
                                        while (!arrayDeque.isEmpty()) {
                                            final d d2 = arrayDeque.pop();
                                            final f c4 = mj2.c0.c0(d2.f, d2.g, map);
                                            if (c4 != null && c4.m == 3) {
                                                if (d2 == null) {
                                                    break Label_0950;
                                                }
                                                if (d2.c() == 1 && d2.b(0).b != null) {
                                                    final String b4 = d2.b(0).b;
                                                    final int a3 = bd.c0.a;
                                                    final f c5 = mj2.c0.c0(d2.f, d2.g, map);
                                                    int n6;
                                                    if (c5 != null) {
                                                        n6 = c5.n;
                                                    }
                                                    else {
                                                        n6 = -1;
                                                    }
                                                    int n7 = n6;
                                                    if (n6 == -1) {
                                                        final f c6 = mj2.c0.c0(d.f, d.g, map);
                                                        n7 = n6;
                                                        if (c6 != null) {
                                                            n7 = c6.n;
                                                        }
                                                    }
                                                    ((Spannable)a).setSpan((Object)new c(b4, n7), intValue, intValue2, 33);
                                                    break Label_0950;
                                                }
                                                Log.i("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                                break Label_0950;
                                            }
                                            else {
                                                for (int i = d2.c() - 1; i >= 0; --i) {
                                                    arrayDeque.push(d2.b(i));
                                                }
                                            }
                                        }
                                        final d d2 = null;
                                        continue;
                                    }
                                }
                                else {
                                    d = d.j;
                                }
                            }
                            d = null;
                            continue;
                        }
                    }
                    if (m == 3 || m == 4) {
                        ((Spannable)a).setSpan((Object)new uc.a(), intValue, intValue2, 33);
                    }
                }
                boolean b5 = false;
                if (c0.q == 1) {
                    b5 = true;
                }
                if (b5) {
                    at1.a.C(a, (Object)new rc.a(), intValue, intValue2);
                }
                final int k = c0.j;
                if (k != 1) {
                    if (k != 2) {
                        if (k == 3) {
                            at1.a.C(a, (Object)new RelativeSizeSpan(c0.k / 100.0f), intValue, intValue2);
                        }
                    }
                    else {
                        at1.a.C(a, (Object)new RelativeSizeSpan(c0.k), intValue, intValue2);
                    }
                }
                else {
                    at1.a.C(a, (Object)new AbsoluteSizeSpan((int)c0.k, true), intValue, intValue2);
                }
                if (!"p".equals(this.a)) {
                    continue;
                }
                final float s3 = c0.s;
                if (s3 != Float.MAX_VALUE) {
                    a$a.q = s3 * -90.0f / 100.0f;
                }
                final Layout$Alignment o = c0.o;
                if (o != null) {
                    a$a.c = o;
                }
                final Layout$Alignment p5 = c0.p;
                if (p5 == null) {
                    continue;
                }
                a$a.d = p5;
            }
        }
        for (int l = 0; l < this.c(); ++l) {
            this.b(l).h(n, map, map2, h, treeMap);
        }
    }
    
    public final void i(final long n, final boolean b, String h, final TreeMap treeMap) {
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.a)) {
            return;
        }
        if (!"".equals(this.h)) {
            h = this.h;
        }
        if (this.c && b) {
            final SpannableStringBuilder e = e(h, treeMap);
            final String b2 = this.b;
            b2.getClass();
            e.append((CharSequence)b2);
        }
        else if ("br".equals(this.a) && b) {
            e(h, treeMap).append('\n');
        }
        else if (this.f(n)) {
            for (final Map.Entry<String, V> entry : treeMap.entrySet()) {
                final HashMap<String, Integer> k = this.k;
                final String s = entry.getKey();
                final CharSequence a = ((a$a)entry.getValue()).a;
                a.getClass();
                k.put(s, a.length());
            }
            final boolean equals = "p".equals(this.a);
            for (int i = 0; i < this.c(); ++i) {
                this.b(i).i(n, b || equals, h, treeMap);
            }
            if (equals) {
                final SpannableStringBuilder e2 = e(h, treeMap);
                int length = e2.length();
                while (--length >= 0 && e2.charAt(length) == ' ') {}
                if (length >= 0 && e2.charAt(length) != '\n') {
                    e2.append('\n');
                }
            }
            for (final Map.Entry<String, V> entry2 : treeMap.entrySet()) {
                final HashMap<String, Integer> l = this.l;
                h = entry2.getKey();
                final CharSequence a2 = ((a$a)entry2.getValue()).a;
                a2.getClass();
                l.put(h, a2.length());
            }
        }
    }
}
