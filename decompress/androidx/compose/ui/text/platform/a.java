// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import t2.h;
import dg.l0;
import android.text.style.LeadingMarginSpan$Standard;
import android.text.Spannable;
import android.text.SpannableString;
import mg.d0;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o1.k0;
import o1.r;
import n1.f;
import t2.i;
import p2.d;
import n2.l;
import android.graphics.Typeface;
import n2.o;
import java.util.Locale;
import p2.c;
import ng2.e;
import java.util.ArrayList;
import u2.b;
import n2.g$a;
import i2.j;
import i2.k;
import i2.a$b;
import java.util.List;
import i2.p;
import i2.g;

public final class a implements g
{
    public final p a;
    public final List<a$b<k>> b;
    public final List<a$b<j>> c;
    public final g$a d;
    public final b e;
    public final q2.a f;
    public final CharSequence g;
    public final androidx.compose.ui.text.android.a h;
    public final ArrayList i;
    public final int j;
    
    public a(final p a, final g$a d, final b e, final String s, final List b, final List c) {
        Object g = s;
        ng2.e.f(g, "text");
        ng2.e.f((Object)a, "style");
        ng2.e.f((Object)d, "fontFamilyResolver");
        ng2.e.f((Object)e, "density");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final q2.a f = new q2.a(e.getDensity());
        this.f = f;
        this.i = new ArrayList();
        final h b2 = a.b.b;
        final d k = a.a.k;
        final int n = 3;
        int a2;
        if (b2 != null) {
            a2 = b2.a;
        }
        else {
            a2 = 3;
        }
        int j = 0;
        Label_0329: {
            if (a2 != 4) {
                if (a2 == 5) {
                    j = n;
                    break Label_0329;
                }
                if (a2 == 1) {
                    j = 0;
                    break Label_0329;
                }
                if (a2 == 2) {
                    j = 1;
                    break Label_0329;
                }
                if (a2 != 3) {
                    throw new IllegalStateException("Invalid TextDirection.".toString());
                }
                Locale locale = null;
                Label_0300: {
                    if (k != null) {
                        final p2.e a3 = k.f.get(0).a;
                        ng2.e.d((Object)a3, "null cannot be cast to non-null type androidx.compose.ui.text.intl.AndroidLocale");
                        if ((locale = ((p2.a)a3).a) != null) {
                            break Label_0300;
                        }
                    }
                    locale = Locale.getDefault();
                }
                final int a4 = y3.g.a;
                final int a5 = y3.g$a.a(locale);
                if (a5 != 0) {
                    j = n;
                    if (a5 == 1) {
                        break Label_0329;
                    }
                }
            }
            j = 2;
        }
        this.j = j;
        final AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        final k a6 = a.a;
        ng2.e.f((Object)a6, "style");
        final long b3 = u2.j.b(a6.b);
        if (u2.k.a(b3, 4294967296L)) {
            ((Paint)f).setTextSize(e.z0(a6.b));
        }
        else if (u2.k.a(b3, 8589934592L)) {
            ((Paint)f).setTextSize(u2.j.c(a6.b) * ((Paint)f).getTextSize());
        }
        if (a01.a.J(a6)) {
            final n2.g f2 = a6.f;
            o o;
            if ((o = a6.c) == null) {
                o = n2.o.m;
            }
            final n2.k d2 = a6.d;
            int a7;
            if (d2 != null) {
                a7 = d2.a;
            }
            else {
                a7 = 0;
            }
            final n2.k i = new n2.k(a7);
            final l e2 = a6.e;
            int a8;
            if (e2 != null) {
                a8 = e2.a;
            }
            else {
                a8 = 1;
            }
            ((Paint)f).setTypeface((Typeface)((mg2.r)androidParagraphIntrinsics$resolveTypeface$1).invoke((Object)f2, (Object)o, (Object)i, (Object)new l(a8)));
        }
        final d l = a6.k;
        if (l != null && !ng2.e.a((Object)l, (Object)p2.d.a.a())) {
            r2.a.a.b(f, a6.k);
        }
        if (u2.k.a(u2.j.b(a6.h), 8589934592L)) {
            ((Paint)f).setLetterSpacing(u2.j.c(a6.h));
        }
        final String g2 = a6.g;
        if (g2 != null && !ng2.e.a((Object)g2, (Object)"")) {
            ((Paint)f).setFontFeatureSettings(a6.g);
        }
        final i m = a6.j;
        if (m != null && !ng2.e.a((Object)m, (Object)t2.i.c)) {
            ((Paint)f).setTextScaleX(((Paint)f).getTextScaleX() * a6.j.a);
            ((Paint)f).setTextSkewX(((Paint)f).getTextSkewX() + a6.j.b);
        }
        f.b(a6.b());
        f.a(a6.a.d(), n1.f.c, a6.a.f());
        f.c(a6.n);
        final boolean a9 = u2.k.a(u2.j.b(a6.h), 4294967296L);
        float z0 = 0.0f;
        long n2;
        if (a9 && u2.j.c(a6.h) != 0.0f) {
            n2 = a6.h;
        }
        else {
            n2 = u2.j.c;
        }
        long n3;
        if (r.c(a6.l, r.k)) {
            n3 = r.l;
        }
        else {
            n3 = a6.l;
        }
        final t2.a i2 = a6.i;
        t2.a i3;
        if (i2 != null && ng2.e.a((Object)i2.a, (Object)0.0f)) {
            i3 = null;
        }
        else {
            i3 = a6.i;
        }
        t2.g m2 = a6.m;
        if (!(ng2.e.a((Object)m2, (Object)t2.g.b) ^ true)) {
            m2 = null;
        }
        final k k2 = new k(0L, 0L, (o)null, (n2.k)null, (l)null, (n2.g)null, (String)null, n2, i3, (i)null, (d)null, n3, m2, (k0)null, 9855);
        final float textSize = ((Paint)f).getTextSize();
        final ArrayList o2 = CollectionsKt___CollectionsKt.o5((Iterable)b, (Collection)cg.d.l3((Object)new a$b((Object)k2, 0, s.length())));
        if (!o2.isEmpty() || !c.isEmpty() || !ng2.e.a((Object)a.b.d, (Object)t2.j.c) || !d0.p0(a.b.c)) {
            g = new SpannableString((CharSequence)g);
            final i2.h b4 = a.b;
            b4.getClass();
            final float a10 = androidx.compose.ui.text.platform.extensions.a.a(b4.c, textSize, e);
            if (!Float.isNaN(a10)) {
                androidx.compose.ui.text.platform.extensions.a.e((Spannable)g, (Object)new l2.g(a10), 0, ((SpannableString)g).length());
            }
            final t2.j d3 = a.b.d;
            if (d3 != null && (!u2.j.a(d3.a, d0.Z(0)) || !u2.j.a(d3.b, d0.Z(0))) && !d0.p0(d3.a)) {
                if (!d0.p0(d3.b)) {
                    final long b5 = u2.j.b(d3.a);
                    float z2;
                    if (u2.k.a(b5, 4294967296L)) {
                        z2 = e.z0(d3.a);
                    }
                    else if (u2.k.a(b5, 8589934592L)) {
                        z2 = u2.j.c(d3.a) * textSize;
                    }
                    else {
                        z2 = 0.0f;
                    }
                    final long b6 = u2.j.b(d3.b);
                    if (u2.k.a(b6, 4294967296L)) {
                        z0 = e.z0(d3.b);
                    }
                    else if (u2.k.a(b6, 8589934592L)) {
                        z0 = u2.j.c(d3.b) * textSize;
                    }
                    androidx.compose.ui.text.platform.extensions.a.e((Spannable)g, (Object)new LeadingMarginSpan$Standard((int)(float)Math.ceil(z2), (int)(float)Math.ceil(z0)), 0, ((SpannableString)g).length());
                }
            }
            final int n4 = 0;
            androidx.compose.ui.text.platform.extensions.a.f((SpannableString)g, a, o2, e, (mg2.r)androidParagraphIntrinsics$resolveTypeface$1);
            for (int size = c.size(), n5 = 0; n5 < size; ++n5) {
                final a$b a$b = c.get(n5);
                final j j2 = (j)a$b.a;
                final int b7 = a$b.b;
                final int c2 = a$b.c;
                final float c3 = u2.j.c(j2.a);
                final int t0 = l0.t0(j2.a);
                final float c4 = u2.j.c(j2.b);
                final int t2 = l0.t0(j2.b);
                final float fontScale = e.getFontScale();
                final float density = e.getDensity();
                final int c5 = j2.c;
                final int n6 = 1;
                int n7;
                if (c5 == 1) {
                    n7 = 1;
                }
                else {
                    n7 = n4;
                }
                int n8;
                if (n7 != 0) {
                    n8 = n4;
                }
                else {
                    final int n9 = 2;
                    int n10;
                    if (c5 == 2) {
                        n10 = 1;
                    }
                    else {
                        n10 = n4;
                    }
                    if (n10 != 0) {
                        n8 = n6;
                    }
                    else {
                        final int n11 = 3;
                        int n12;
                        if (c5 == 3) {
                            n12 = 1;
                        }
                        else {
                            n12 = n4;
                        }
                        if (n12 != 0) {
                            n8 = n9;
                        }
                        else {
                            final int n13 = 4;
                            int n14;
                            if (c5 == 4) {
                                n14 = 1;
                            }
                            else {
                                n14 = n4;
                            }
                            if (n14 != 0) {
                                n8 = n11;
                            }
                            else {
                                final int n15 = 5;
                                int n16;
                                if (c5 == 5) {
                                    n16 = 1;
                                }
                                else {
                                    n16 = n4;
                                }
                                if (n16 != 0) {
                                    n8 = n13;
                                }
                                else {
                                    int n17;
                                    if (c5 == 6) {
                                        n17 = 1;
                                    }
                                    else {
                                        n17 = n4;
                                    }
                                    if (n17 != 0) {
                                        n8 = n15;
                                    }
                                    else {
                                        int n18;
                                        if (c5 == 7) {
                                            n18 = 1;
                                        }
                                        else {
                                            n18 = n4;
                                        }
                                        if (n18 == 0) {
                                            throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
                                        }
                                        n8 = 6;
                                    }
                                }
                            }
                        }
                    }
                }
                androidx.compose.ui.text.platform.extensions.a.e((Spannable)g, (Object)new l2.i(c3, c4, density * fontScale, t0, t2, n8), b7, c2);
            }
        }
        this.g = (CharSequence)g;
        this.h = new androidx.compose.ui.text.android.a(this.j, (CharSequence)g, this.f);
    }
    
    public final boolean a() {
        final ArrayList i = this.i;
        final int size = i.size();
        final boolean b = false;
        int n = 0;
        boolean b2;
        while (true) {
            b2 = b;
            if (n >= size) {
                break;
            }
            final q2.c c = (q2.c)i.get(n);
            if (c.a.getValue() != c.b) {
                b2 = true;
                break;
            }
            ++n;
        }
        return b2;
    }
    
    public final float b() {
        return ((Number)this.h.b.getValue()).floatValue();
    }
    
    public final float c() {
        return ((Number)this.h.c.getValue()).floatValue();
    }
}
