// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import a4.u1;
import android.text.style.LeadingMarginSpan$Standard;
import android.text.Spannable;
import android.text.SpannableString;
import mj2.c0;
import t2.h;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import o1.k0;
import t2.e;
import o1.r;
import o1.n;
import p2.c;
import n2.l;
import android.graphics.Typeface;
import n2.m;
import y3.g$a;
import java.util.Locale;
import ah2.f;
import java.util.ArrayList;
import u2.b;
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
    public final n2.g.a d;
    public final b e;
    public final q2.a f;
    public final CharSequence g;
    public final androidx.compose.ui.text.android.a h;
    public final ArrayList i;
    public final int j;
    
    public a(final p a, final n2.g.a d, final b e, final String s, final List b, final List c) {
        Object g = s;
        ah2.f.f(g, "text");
        ah2.f.f((Object)a, "style");
        ah2.f.f((Object)d, "fontFamilyResolver");
        ah2.f.f((Object)e, "density");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        final q2.a f = new q2.a(e.getDensity());
        this.f = f;
        this.i = new ArrayList();
        final t2.f b2 = a.b.b;
        final c k = a.a.k;
        final int n = 3;
        int a2;
        if (b2 != null) {
            a2 = b2.a;
        }
        else {
            a2 = 3;
        }
        int j = 0;
        Label_0321: {
            if (a2 != 4) {
                if (a2 == 5) {
                    j = n;
                    break Label_0321;
                }
                if (a2 == 1) {
                    j = 0;
                    break Label_0321;
                }
                if (a2 == 2) {
                    j = 1;
                    break Label_0321;
                }
                if (a2 != 3) {
                    throw new IllegalStateException("Invalid TextDirection.".toString());
                }
                Locale locale;
                if (k == null || (locale = ((p2.a)k.f.get(0).a).a) == null) {
                    locale = Locale.getDefault();
                }
                final int a3 = y3.g.a;
                final int a4 = g$a.a(locale);
                if (a4 != 0) {
                    j = n;
                    if (a4 == 1) {
                        break Label_0321;
                    }
                }
            }
            j = 2;
        }
        this.j = j;
        final AndroidParagraphIntrinsics$resolveTypeface$1 androidParagraphIntrinsics$resolveTypeface$1 = new AndroidParagraphIntrinsics$resolveTypeface$1(this);
        final k a5 = a.a;
        ah2.f.f((Object)a5, "style");
        final long b3 = u2.j.b(a5.b);
        if (u2.k.a(b3, 4294967296L)) {
            ((Paint)f).setTextSize(e.x0(a5.b));
        }
        else if (u2.k.a(b3, 8589934592L)) {
            ((Paint)f).setTextSize(u2.j.c(a5.b) * ((Paint)f).getTextSize());
        }
        if (at1.a.M0(a5)) {
            final n2.g f2 = a5.f;
            m m;
            if ((m = a5.c) == null) {
                m = n2.m.m;
            }
            final n2.k d2 = a5.d;
            int a6;
            if (d2 != null) {
                a6 = d2.a;
            }
            else {
                a6 = 0;
            }
            final n2.k i = new n2.k(a6);
            final l e2 = a5.e;
            int a7;
            if (e2 != null) {
                a7 = e2.a;
            }
            else {
                a7 = 1;
            }
            ((Paint)f).setTypeface((Typeface)((zg2.r)androidParagraphIntrinsics$resolveTypeface$1).invoke(f2, m, i, new l(a7)));
        }
        final c l = a5.k;
        if (l != null && !ah2.f.a((Object)l, (Object)p2.c.a.a())) {
            r2.a.a.b(f, a5.k);
        }
        if (u2.k.a(u2.j.b(a5.h), 8589934592L)) {
            ((Paint)f).setLetterSpacing(u2.j.c(a5.h));
        }
        final String g2 = a5.g;
        if (g2 != null && !ah2.f.a((Object)g2, (Object)"")) {
            ((Paint)f).setFontFeatureSettings(a5.g);
        }
        final t2.g j2 = a5.j;
        if (j2 != null && !ah2.f.a((Object)j2, (Object)t2.g.c)) {
            ((Paint)f).setTextScaleX(((Paint)f).getTextScaleX() * a5.j.a);
            ((Paint)f).setTextSkewX(((Paint)f).getTextSkewX() + a5.j.b);
        }
        f.b(a5.b());
        a5.a.d();
        f.a(null, n1.f.c);
        f.c(a5.n);
        f.d(a5.m);
        long n2;
        if (u2.k.a(u2.j.b(a5.h), 4294967296L) && u2.j.c(a5.h) != 0.0f) {
            n2 = a5.h;
        }
        else {
            n2 = u2.j.c;
        }
        long n3;
        if (r.c(a5.l, r.k)) {
            n3 = r.l;
        }
        else {
            n3 = a5.l;
        }
        final t2.a i2 = a5.i;
        t2.a i3;
        if (i2 != null && ah2.f.a((Object)i2.a, (Object)0.0f)) {
            i3 = null;
        }
        else {
            i3 = a5.i;
        }
        final k k2 = new k(0L, 0L, (m)null, (n2.k)null, (l)null, (n2.g)null, (String)null, n2, i3, (t2.g)null, (c)null, n3, (e)null, (k0)null, 13951);
        final float textSize = ((Paint)f).getTextSize();
        final ArrayList n4 = CollectionsKt___CollectionsKt.N1((Iterable)b, (Collection)ah2.c.X((Object)new a$b((Object)k2, 0, s.length())));
        if (!n4.isEmpty() || !c.isEmpty() || !ah2.f.a((Object)a.b.d, (Object)t2.h.c) || !c0.J(a.b.c)) {
            g = new SpannableString((CharSequence)g);
            final i2.h b4 = a.b;
            b4.getClass();
            final float a8 = androidx.compose.ui.text.platform.extensions.a.a(b4.c, textSize, e);
            if (!Float.isNaN(a8)) {
                androidx.compose.ui.text.platform.extensions.a.e((Spannable)g, new l2.e(a8), 0, ((SpannableString)g).length());
            }
            final h d3 = a.b.d;
            if (d3 != null && (!u2.j.a(d3.a, c0.G(0)) || !u2.j.a(d3.b, c0.G(0))) && !c0.J(d3.a)) {
                if (!c0.J(d3.b)) {
                    final long b5 = u2.j.b(d3.a);
                    float x0;
                    if (u2.k.a(b5, 4294967296L)) {
                        x0 = e.x0(d3.a);
                    }
                    else if (u2.k.a(b5, 8589934592L)) {
                        x0 = u2.j.c(d3.a) * textSize;
                    }
                    else {
                        x0 = 0.0f;
                    }
                    final long b6 = u2.j.b(d3.b);
                    float x2;
                    if (u2.k.a(b6, 4294967296L)) {
                        x2 = e.x0(d3.b);
                    }
                    else if (u2.k.a(b6, 8589934592L)) {
                        x2 = textSize * u2.j.c(d3.b);
                    }
                    else {
                        x2 = 0.0f;
                    }
                    androidx.compose.ui.text.platform.extensions.a.e((Spannable)g, new LeadingMarginSpan$Standard((int)(float)Math.ceil(x0), (int)(float)Math.ceil(x2)), 0, ((SpannableString)g).length());
                }
            }
            final int n5 = 0;
            androidx.compose.ui.text.platform.extensions.a.f((SpannableString)g, a, n4, e, (zg2.r)androidParagraphIntrinsics$resolveTypeface$1);
            for (int size = c.size(), n6 = 0; n6 < size; ++n6) {
                final a$b a$b = c.get(n6);
                final j j3 = (j)a$b.a;
                final int b7 = a$b.b;
                final int c2 = a$b.c;
                final float c3 = u2.j.c(j3.a);
                final int f3 = u1.f0(j3.a);
                final float c4 = u2.j.c(j3.b);
                final int f4 = u1.f0(j3.b);
                final float fontScale = e.getFontScale();
                final float density = e.getDensity();
                final int c5 = j3.c;
                int n7;
                if (c5 == 1) {
                    n7 = 1;
                }
                else {
                    n7 = n5;
                }
                int n8;
                if (n7 != 0) {
                    n8 = n5;
                }
                else {
                    int n9;
                    if (c5 == 2) {
                        n9 = 1;
                    }
                    else {
                        n9 = n5;
                    }
                    if (n9 != 0) {
                        n8 = 1;
                    }
                    else {
                        int n10;
                        if (c5 == 3) {
                            n10 = 1;
                        }
                        else {
                            n10 = n5;
                        }
                        if (n10 != 0) {
                            n8 = 2;
                        }
                        else {
                            int n11;
                            if (c5 == 4) {
                                n11 = 1;
                            }
                            else {
                                n11 = n5;
                            }
                            if (n11 != 0) {
                                n8 = 3;
                            }
                            else {
                                final int n12 = 5;
                                int n13;
                                if (c5 == 5) {
                                    n13 = 1;
                                }
                                else {
                                    n13 = n5;
                                }
                                if (n13 != 0) {
                                    n8 = 4;
                                }
                                else {
                                    int n14;
                                    if (c5 == 6) {
                                        n14 = 1;
                                    }
                                    else {
                                        n14 = n5;
                                    }
                                    if (n14 != 0) {
                                        n8 = n12;
                                    }
                                    else {
                                        int n15;
                                        if (c5 == 7) {
                                            n15 = 1;
                                        }
                                        else {
                                            n15 = n5;
                                        }
                                        if (n15 == 0) {
                                            throw new IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
                                        }
                                        n8 = 6;
                                    }
                                }
                            }
                        }
                    }
                }
                androidx.compose.ui.text.platform.extensions.a.e((Spannable)g, new l2.g(c3, c4, density * fontScale, f3, f4, n8), b7, c2);
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
