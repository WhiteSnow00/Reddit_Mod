// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.ui;

import android.view.ViewGroup;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.regex.Pattern;
import android.text.Layout$Alignment;
import android.util.Base64;
import ad.d0;
import java.util.Comparator;
import a81.e;
import android.text.style.UnderlineSpan;
import qc.c;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.util.SparseArray;
import android.text.style.BackgroundColorSpan;
import java.util.HashSet;
import android.text.Spanned;
import java.util.Map;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import ad.c0;
import java.util.ArrayList;
import android.view.View;
import java.util.Collections;
import android.util.AttributeSet;
import android.content.Context;
import xc.b;
import java.util.List;
import xc.h;
import android.widget.FrameLayout;

public final class f extends FrameLayout implements a
{
    public final com.google.android.exoplayer2.ui.a f;
    public final h g;
    public List<mc.a> h;
    public b i;
    public float j;
    public int k;
    public float l;
    
    public f(final Context context) {
        super(context, (AttributeSet)null);
        this.h = Collections.emptyList();
        this.i = b.g;
        this.j = 0.0533f;
        this.k = 0;
        this.l = 0.08f;
        final com.google.android.exoplayer2.ui.a f = new com.google.android.exoplayer2.ui.a(context);
        this.f = f;
        final h g = new h(context);
        ((WebView)(this.g = g)).setBackgroundColor(0);
        ((ViewGroup)this).addView((View)f);
        ((ViewGroup)this).addView((View)g);
    }
    
    public final void a(final List<mc.a> list, final b i, final float j, final int k, final float l) {
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        final ArrayList list2 = new ArrayList();
        final ArrayList h = new ArrayList();
        for (int n = 0; n < list.size(); ++n) {
            final mc.a a = list.get(n);
            if (a.i != null) {
                list2.add(a);
            }
            else {
                h.add(a);
            }
        }
        if (!this.h.isEmpty() || !h.isEmpty()) {
            this.h = h;
            this.c();
        }
        this.f.a((List)list2, i, j, k, l);
        ((View)this).invalidate();
    }
    
    public final String b(float b, final int n) {
        b = xc.f.b(n, b, ((View)this).getHeight(), ((View)this).getHeight() - ((View)this).getPaddingTop() - ((View)this).getPaddingBottom());
        if (b == -3.4028235E38f) {
            return "unset";
        }
        return c0.n("%.2fpx", b / ((View)this).getContext().getResources().getDisplayMetrics().density);
    }
    
    public final void c() {
        final StringBuilder sb = new StringBuilder();
        final String d0 = ml0.a.D0(this.i.a);
        int n = 0;
        final String b = this.b(this.j, this.k);
        final b i = this.i;
        final int d2 = i.d;
        String s;
        if (d2 != 1) {
            if (d2 != 2) {
                if (d2 != 3) {
                    if (d2 != 4) {
                        s = "unset";
                    }
                    else {
                        s = c0.n("-0.05em -0.05em 0.15em %s", ml0.a.D0(i.e));
                    }
                }
                else {
                    s = c0.n("0.06em 0.08em 0.15em %s", ml0.a.D0(i.e));
                }
            }
            else {
                s = c0.n("0.1em 0.12em 0.15em %s", ml0.a.D0(i.e));
            }
        }
        else {
            s = c0.n("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", ml0.a.D0(i.e));
        }
        sb.append(c0.n("<body><div style='-webkit-user-select:none;position:fixed;top:0;bottom:0;left:0;right:0;color:%s;font-size:%s;line-height:%.2f;text-shadow:%s;'>", d0, b, 1.2f, s));
        final HashMap<String, String> hashMap = new HashMap<String, String>();
        final String s2 = "default_bg";
        final String u = ml0.a.u("default_bg");
        final String d3 = ml0.a.D0(this.i.b);
        final String s3 = "background-color:%s;";
        hashMap.put(u, c0.n("background-color:%s;", d3));
        while (true) {
            final int n2 = 0;
            int n3 = 0;
            if (n >= this.h.size()) {
                break;
            }
            final mc.a a = this.h.get(n);
            final float m = a.m;
            float n4;
            if (m != -3.4028235E38f) {
                n4 = m * 100.0f;
            }
            else {
                n4 = 50.0f;
            }
            final int n5 = a.n;
            int n6 = -100;
            int n7;
            if (n5 != 1) {
                if (n5 != 2) {
                    n7 = 0;
                }
                else {
                    n7 = -100;
                }
            }
            else {
                n7 = -50;
            }
            final float j = a.j;
            String n9;
            if (j != -3.4028235E38f) {
                String s4;
                if (a.k != 1) {
                    s4 = c0.n("%.2f%%", j * 100.0f);
                    if (a.u == 1) {
                        final int l = a.l;
                        int n8;
                        if (l != 1) {
                            if (l != 2) {
                                n8 = 0;
                            }
                            else {
                                n8 = -100;
                            }
                        }
                        else {
                            n8 = -50;
                        }
                        n6 = -n8;
                    }
                    else {
                        final int k = a.l;
                        if (k != 1) {
                            if (k != 2) {
                                n6 = 0;
                            }
                            else {
                                n6 = -100;
                            }
                        }
                        else {
                            n6 = -50;
                        }
                    }
                }
                else if (j >= 0.0f) {
                    s4 = c0.n("%.2fem", j * 1.2f);
                    n6 = 0;
                }
                else {
                    s4 = c0.n("%.2fem", (-j - 1.0f) * 1.2f);
                    n6 = 0;
                    n3 = 1;
                }
                n9 = s4;
            }
            else {
                n9 = c0.n("%.2f%%", (1.0f - this.l) * 100.0f);
                n3 = n2;
            }
            final float o = a.o;
            String n10;
            if (o != -3.4028235E38f) {
                n10 = c0.n("%.2f%%", o * 100.0f);
            }
            else {
                n10 = "fit-content";
            }
            final Layout$Alignment g = a.g;
            String s5 = null;
            Label_0725: {
                if (g != null) {
                    final int n11 = f$a.a[((Enum)g).ordinal()];
                    if (n11 == 1) {
                        s5 = "start";
                        break Label_0725;
                    }
                    if (n11 == 2) {
                        s5 = "end";
                        break Label_0725;
                    }
                }
                s5 = "center";
            }
            final int u2 = a.u;
            String s6;
            if (u2 != 1) {
                if (u2 != 2) {
                    s6 = "horizontal-tb";
                }
                else {
                    s6 = "vertical-lr";
                }
            }
            else {
                s6 = "vertical-rl";
            }
            final String b2 = this.b(a.t, a.s);
            int n12;
            if (a.q) {
                n12 = a.r;
            }
            else {
                n12 = this.i.c;
            }
            final String d4 = ml0.a.D0(n12);
            final int u3 = a.u;
            String s7 = "left";
            String s8 = "top";
            String s9 = null;
            Label_0893: {
                String s10 = null;
                Label_0885: {
                    if (u3 != 1) {
                        if (u3 != 2) {
                            if (n3 != 0) {
                                s8 = "bottom";
                            }
                            s9 = s8;
                            break Label_0893;
                        }
                        s10 = s7;
                        if (n3 == 0) {
                            break Label_0885;
                        }
                    }
                    else if (n3 != 0) {
                        s10 = s7;
                        break Label_0885;
                    }
                    s10 = "right";
                }
                s7 = "top";
                s9 = s10;
            }
            String s11;
            if (u3 != 2 && u3 != 1) {
                s11 = "width";
                final int n13 = n6;
                n6 = n7;
                n7 = n13;
            }
            else {
                s11 = "height";
            }
            final CharSequence f = a.f;
            final float density = ((View)this).getContext().getResources().getDisplayMetrics().density;
            final Pattern a2 = d.a;
            d.a a3 = null;
            String s17 = null;
            String s18 = null;
            Label_2476: {
                if (f == null) {
                    a3 = new d.a("", (Map)ImmutableMap.of());
                }
                else {
                    if (f instanceof Spanned) {
                        final Spanned spanned = (Spanned)f;
                        final HashSet<Integer> set = new HashSet<Integer>();
                        final BackgroundColorSpan[] array = (BackgroundColorSpan[])spanned.getSpans(0, ((CharSequence)spanned).length(), (Class)BackgroundColorSpan.class);
                        for (int length = array.length, n14 = 0; n14 < length; ++n14) {
                            set.add(array[n14].getBackgroundColor());
                        }
                        final HashMap<String, String> hashMap2 = new HashMap<String, String>();
                        for (final int intValue : set) {
                            final StringBuilder sb2 = new StringBuilder(14);
                            sb2.append("bg_");
                            sb2.append(intValue);
                            hashMap2.put(ml0.a.u(sb2.toString()), c0.n(s3, ml0.a.D0(intValue)));
                        }
                        final SparseArray sparseArray = new SparseArray();
                        final Object[] spans = spanned.getSpans(0, ((CharSequence)spanned).length(), (Class)Object.class);
                        final int length2 = spans.length;
                        int n15 = 0;
                        final String s12 = s5;
                        final String s13 = s6;
                        while (n15 < length2) {
                            final Object o2 = spans[n15];
                            final boolean b3 = o2 instanceof StrikethroughSpan;
                            final String s14 = null;
                            String n16 = null;
                            Label_1866: {
                                if (b3) {
                                    n16 = "<span style='text-decoration:line-through;'>";
                                }
                                else {
                                    String s15 = null;
                                    Label_1663: {
                                        if (o2 instanceof ForegroundColorSpan) {
                                            s15 = c0.n("<span style='color:%s;'>", ml0.a.D0(((ForegroundColorSpan)o2).getForegroundColor()));
                                        }
                                        else if (o2 instanceof BackgroundColorSpan) {
                                            s15 = c0.n("<span class='bg_%s'>", ((BackgroundColorSpan)o2).getBackgroundColor());
                                        }
                                        else if (o2 instanceof qc.a) {
                                            s15 = "<span style='text-combine-upright:all;'>";
                                        }
                                        else if (o2 instanceof AbsoluteSizeSpan) {
                                            final AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan)o2;
                                            float n17;
                                            if (absoluteSizeSpan.getDip()) {
                                                n17 = (float)absoluteSizeSpan.getSize();
                                            }
                                            else {
                                                n17 = absoluteSizeSpan.getSize() / density;
                                            }
                                            s15 = c0.n("<span style='font-size:%.2fpx;'>", n17);
                                        }
                                        else {
                                            if (!(o2 instanceof RelativeSizeSpan)) {
                                                if (o2 instanceof TypefaceSpan) {
                                                    final String family = ((TypefaceSpan)o2).getFamily();
                                                    if (family != null) {
                                                        s15 = c0.n("<span style='font-family:\"%s\";'>", family);
                                                        break Label_1663;
                                                    }
                                                }
                                                else if (o2 instanceof StyleSpan) {
                                                    final int style = ((StyleSpan)o2).getStyle();
                                                    if (style == 1) {
                                                        s15 = "<b>";
                                                        break Label_1663;
                                                    }
                                                    if (style == 2) {
                                                        s15 = "<i>";
                                                        break Label_1663;
                                                    }
                                                    if (style == 3) {
                                                        s15 = "<b><i>";
                                                        break Label_1663;
                                                    }
                                                }
                                                else if (o2 instanceof c) {
                                                    final int b4 = ((c)o2).b;
                                                    if (b4 == -1) {
                                                        s15 = "<ruby style='ruby-position:unset;'>";
                                                        break Label_1663;
                                                    }
                                                    if (b4 == 1) {
                                                        s15 = "<ruby style='ruby-position:over;'>";
                                                        break Label_1663;
                                                    }
                                                    if (b4 == 2) {
                                                        s15 = "<ruby style='ruby-position:under;'>";
                                                        break Label_1663;
                                                    }
                                                }
                                                else {
                                                    if (o2 instanceof UnderlineSpan) {
                                                        s15 = "<u>";
                                                        break Label_1663;
                                                    }
                                                    if (o2 instanceof qc.d) {
                                                        final qc.d d5 = (qc.d)o2;
                                                        final int a4 = d5.a;
                                                        final int b5 = d5.b;
                                                        final StringBuilder sb3 = new StringBuilder();
                                                        if (b5 != 1) {
                                                            if (b5 == 2) {
                                                                sb3.append("open ");
                                                            }
                                                        }
                                                        else {
                                                            sb3.append("filled ");
                                                        }
                                                        if (a4 != 0) {
                                                            if (a4 != 1) {
                                                                if (a4 != 2) {
                                                                    if (a4 != 3) {
                                                                        sb3.append("unset");
                                                                    }
                                                                    else {
                                                                        sb3.append("sesame");
                                                                    }
                                                                }
                                                                else {
                                                                    sb3.append("dot");
                                                                }
                                                            }
                                                            else {
                                                                sb3.append("circle");
                                                            }
                                                        }
                                                        else {
                                                            sb3.append("none");
                                                        }
                                                        final String string = sb3.toString();
                                                        String s16;
                                                        if (d5.c != 2) {
                                                            s16 = "over right";
                                                        }
                                                        else {
                                                            s16 = "under left";
                                                        }
                                                        n16 = c0.n("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", string, s16);
                                                        break Label_1866;
                                                    }
                                                }
                                                n16 = null;
                                                break Label_1866;
                                            }
                                            s15 = c0.n("<span style='font-size:%.2f%%;'>", ((RelativeSizeSpan)o2).getSizeChange() * 100.0f);
                                        }
                                    }
                                    n16 = s15;
                                }
                            }
                            String j2 = null;
                            Label_2087: {
                                Label_2082: {
                                    if (!b3 && !(o2 instanceof ForegroundColorSpan) && !(o2 instanceof BackgroundColorSpan) && !(o2 instanceof qc.a) && !(o2 instanceof AbsoluteSizeSpan) && !(o2 instanceof RelativeSizeSpan)) {
                                        if (!(o2 instanceof qc.d)) {
                                            if (o2 instanceof TypefaceSpan) {
                                                j2 = s14;
                                                if (((TypefaceSpan)o2).getFamily() != null) {
                                                    break Label_2082;
                                                }
                                            }
                                            else if (o2 instanceof StyleSpan) {
                                                final int style2 = ((StyleSpan)o2).getStyle();
                                                if (style2 != 1) {
                                                    if (style2 != 2) {
                                                        if (style2 != 3) {
                                                            j2 = s14;
                                                        }
                                                        else {
                                                            j2 = "</i></b>";
                                                        }
                                                    }
                                                    else {
                                                        j2 = "</i>";
                                                    }
                                                }
                                                else {
                                                    j2 = "</b>";
                                                }
                                            }
                                            else if (o2 instanceof c) {
                                                final String a5 = d.a(((c)o2).a);
                                                j2 = a.j(e.h(a5, 16), "<rt>", a5, "</rt></ruby>");
                                            }
                                            else {
                                                j2 = s14;
                                                if (o2 instanceof UnderlineSpan) {
                                                    j2 = "</u>";
                                                }
                                            }
                                            break Label_2087;
                                        }
                                    }
                                }
                                j2 = "</span>";
                            }
                            final int spanStart = spanned.getSpanStart(o2);
                            final int spanEnd = spanned.getSpanEnd(o2);
                            if (n16 != null) {
                                j2.getClass();
                                final d.b b6 = new d.b(spanStart, spanEnd, n16, j2);
                                d.c c;
                                if ((c = (d.c)sparseArray.get(spanStart)) == null) {
                                    c = new d.c();
                                    sparseArray.put(spanStart, (Object)c);
                                }
                                c.a.add(b6);
                                d.c c2;
                                if ((c2 = (d.c)sparseArray.get(spanEnd)) == null) {
                                    c2 = new d.c();
                                    sparseArray.put(spanEnd, (Object)c2);
                                }
                                c2.b.add(b6);
                            }
                            ++n15;
                        }
                        s6 = s13;
                        s17 = n10;
                        s18 = s12;
                        final StringBuilder sb4 = new StringBuilder(((CharSequence)spanned).length());
                        int n18 = 0;
                        int n19 = 0;
                        while (n18 < sparseArray.size()) {
                            final int key = sparseArray.keyAt(n18);
                            sb4.append(d.a(((CharSequence)spanned).subSequence(n19, key)));
                            final d.c c3 = (d.c)sparseArray.get(key);
                            Collections.sort((List<Object>)c3.b, (Comparator<? super Object>)d.b.f);
                            final Iterator iterator2 = c3.b.iterator();
                            while (iterator2.hasNext()) {
                                sb4.append(((d.b)iterator2.next()).d);
                            }
                            Collections.sort((List<Object>)c3.a, d.b.e);
                            final Iterator iterator3 = c3.a.iterator();
                            while (iterator3.hasNext()) {
                                sb4.append(((d.b)iterator3.next()).c);
                            }
                            ++n18;
                            n19 = key;
                        }
                        sb4.append(d.a(((CharSequence)spanned).subSequence(n19, ((CharSequence)spanned).length())));
                        a3 = new d.a(sb4.toString(), hashMap2);
                        break Label_2476;
                    }
                    a3 = new d.a(d.a(f), (Map)ImmutableMap.of());
                }
                final String s19 = n10;
                s18 = s5;
                s17 = s19;
            }
            for (final String s20 : hashMap.keySet()) {
                final String s21 = hashMap.put(s20, hashMap.get(s20));
                ad.d0.f(s21 == null || s21.equals(hashMap.get(s20)));
            }
            final float v = a.v;
            String n20;
            if (v != 0.0f) {
                final int u4 = a.u;
                String s22;
                if (u4 != 2 && u4 != 1) {
                    s22 = "skewX";
                }
                else {
                    s22 = "skewY";
                }
                n20 = c0.n("%s(%.2fdeg)", s22, v);
            }
            else {
                n20 = "";
            }
            sb.append(c0.n("<div style='position:absolute;z-index:%s;%s:%.2f%%;%s:%s;%s:%s;text-align:%s;writing-mode:%s;font-size:%s;background-color:%s;transform:translate(%s%%,%s%%)%s;'>", n, s7, n4, s9, n9, s11, s17, s18, s6, b2, d4, n6, n7, n20));
            sb.append(c0.n("<span class='%s'>", s2));
            final Layout$Alignment h = a.h;
            if (h != null) {
                final int n21 = f$a.a[((Enum)h).ordinal()];
                String s23;
                if (n21 != 1) {
                    if (n21 != 2) {
                        s23 = "center";
                    }
                    else {
                        s23 = "end";
                    }
                }
                else {
                    s23 = "start";
                }
                sb.append(c0.n("<span style='display:inline-block; text-align:%s;'>", s23));
                sb.append(a3.a);
                sb.append("</span>");
            }
            else {
                sb.append(a3.a);
            }
            sb.append("</span>");
            sb.append("</div>");
            ++n;
        }
        sb.append("</div></body></html>");
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("<html><head><style>");
        for (final String s24 : hashMap.keySet()) {
            sb5.append(s24);
            sb5.append("{");
            sb5.append(hashMap.get(s24));
            sb5.append("}");
        }
        sb5.append("</style></head>");
        sb.insert(0, sb5.toString());
        ((WebView)this.g).loadData(Base64.encodeToString(sb.toString().getBytes(rg.b.c), 1), "text/html", "base64");
    }
    
    public final void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        if (b && !this.h.isEmpty()) {
            this.c();
        }
    }
}
