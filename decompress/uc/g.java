// 
// Decompiled by Procyon v0.6.0
// 

package uc;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import nc.a$a;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Pair;
import java.util.TreeMap;
import java.util.ArrayList;
import nc.a;
import java.util.List;
import bd.c0;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import nc.f;

public final class g implements f
{
    public final d f;
    public final long[] g;
    public final Map<String, uc.f> h;
    public final Map<String, e> i;
    public final Map<String, String> j;
    
    public g(final d f, final HashMap hashMap, final HashMap i, final HashMap j) {
        this.f = f;
        this.i = i;
        this.j = j;
        this.h = Collections.unmodifiableMap((Map<? extends String, ? extends uc.f>)hashMap);
        final TreeSet set = new TreeSet();
        int n = 0;
        f.d(set, false);
        final long[] g = new long[set.size()];
        final Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            g[n] = (long)iterator.next();
            ++n;
        }
        this.g = g;
    }
    
    public final long a(final int n) {
        return this.g[n];
    }
    
    public final int c() {
        return this.g.length;
    }
    
    public final int d(final long n) {
        int b = c0.b(this.g, n, false);
        if (b >= this.g.length) {
            b = -1;
        }
        return b;
    }
    
    public final List<a> f(final long n) {
        final d f = this.f;
        final Map<String, uc.f> h = this.h;
        final Map<String, e> i = this.i;
        final Map<String, String> j = this.j;
        f.getClass();
        final ArrayList list = new ArrayList();
        f.g(n, f.h, list);
        final TreeMap treeMap = new TreeMap();
        f.i(n, false, f.h, treeMap);
        f.h(n, h, i, f.h, treeMap);
        final ArrayList list2 = new ArrayList();
        for (final Pair pair : list) {
            final String s = j.get(pair.second);
            if (s == null) {
                continue;
            }
            final byte[] decode = Base64.decode(s, 0);
            final Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            final e e = i.get(pair.first);
            e.getClass();
            final a$a a$a = new a$a();
            a$a.b = decodeByteArray;
            a$a.h = e.b;
            a$a.i = 0;
            a$a.e = e.c;
            a$a.f = 0;
            a$a.g = e.e;
            a$a.l = e.f;
            a$a.m = e.g;
            a$a.p = e.j;
            list2.add(a$a.a());
        }
        for (final Map.Entry<Object, V> entry : treeMap.entrySet()) {
            final e e2 = i.get(entry.getKey());
            e2.getClass();
            final a$a a$a2 = (a$a)entry.getValue();
            final CharSequence a = a$a2.a;
            a.getClass();
            final SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder)a;
            for (final uc.a a2 : (uc.a[])spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), (Class)uc.a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart((Object)a2), spannableStringBuilder.getSpanEnd((Object)a2), (CharSequence)"");
            }
            for (int l = 0; l < spannableStringBuilder.length(); ++l) {
                if (spannableStringBuilder.charAt(l) == ' ') {
                    int n3;
                    int n2;
                    for (n2 = (n3 = l + 1); n3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(n3) == ' '; ++n3) {}
                    final int n4 = n3 - n2;
                    if (n4 > 0) {
                        spannableStringBuilder.delete(l, n4 + l);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int n5 = 0; n5 < spannableStringBuilder.length() - 1; ++n5) {
                if (spannableStringBuilder.charAt(n5) == '\n') {
                    final int n6 = n5 + 1;
                    if (spannableStringBuilder.charAt(n6) == ' ') {
                        spannableStringBuilder.delete(n6, n5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int n7 = 0; n7 < spannableStringBuilder.length() - 1; ++n7) {
                if (spannableStringBuilder.charAt(n7) == ' ') {
                    final int n8 = n7 + 1;
                    if (spannableStringBuilder.charAt(n8) == '\n') {
                        spannableStringBuilder.delete(n7, n8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            final float c = e2.c;
            final int d = e2.d;
            a$a2.e = c;
            a$a2.f = d;
            a$a2.g = e2.e;
            a$a2.h = e2.b;
            a$a2.l = e2.f;
            final float m = e2.i;
            final int h2 = e2.h;
            a$a2.k = m;
            a$a2.j = h2;
            a$a2.p = e2.j;
            list2.add(a$a2.a());
        }
        return list2;
    }
}
