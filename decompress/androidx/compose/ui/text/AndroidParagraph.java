// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text;

import android.graphics.Paint;
import j2.o;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.PathEffect;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import android.graphics.Paint$Style;
import o1.n;
import android.graphics.Path;
import t2.g;
import o1.k0;
import android.text.Layout;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import android.graphics.Paint$FontMetricsInt;
import i2.h;
import i2.p;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import l2.i;
import kotlin.collections.EmptyList;
import android.text.Spanned;
import android.text.TextUtils$TruncateAt;
import android.os.Build$VERSION;
import ng2.e;
import l2.c;
import android.text.SpannableString;
import android.text.Spannable;
import u2.j;
import mg.d0;
import cg2.f;
import java.util.List;
import androidx.compose.ui.text.android.b;
import androidx.compose.ui.text.platform.a;
import i2.d;

public final class AndroidParagraph implements d
{
    public final a a;
    public final int b;
    public final long c;
    public final b d;
    public final CharSequence e;
    public final List<n1.d> f;
    public final f g;
    
    public AndroidParagraph(final a a, int i, final boolean b, final long c) {
        this.a = a;
        this.b = i;
        this.c = c;
        if (u2.a.i(c) != 0 || u2.a.j(c) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i >= 1) {
            final p a2 = a.a;
            boolean b2 = false;
            Label_0185: {
                if (b && !j.a(a2.a.h, d0.Z(0)) && !j.a(a2.a.h, j.c)) {
                    final t2.f a3 = a2.b.a;
                    if (a3 != null) {
                        final int a4 = a3.a;
                        if (a4 != 5 && a4 != 4) {
                            b2 = true;
                            break Label_0185;
                        }
                    }
                }
                b2 = false;
            }
            Object e;
            if (b2) {
                e = a.g;
                if (((CharSequence)e).length() != 0) {
                    if (e instanceof Spannable) {
                        e = e;
                    }
                    else {
                        e = new SpannableString((CharSequence)e);
                    }
                    androidx.compose.ui.text.platform.extensions.a.e((Spannable)e, (Object)new c(), ((CharSequence)e).length() - 1, ((CharSequence)e).length() - 1);
                }
            }
            else {
                e = a.g;
            }
            this.e = (CharSequence)e;
            final h b3 = a2.b;
            final t2.f a5 = b3.a;
            boolean b4 = false;
            Label_0322: {
                if (a5 != null) {
                    if (a5.a == 1) {
                        b4 = true;
                        break Label_0322;
                    }
                }
                b4 = false;
            }
            int n = 0;
            Label_0474: {
                if (b4) {
                    n = 3;
                }
                else {
                    boolean b5 = false;
                    Label_0357: {
                        if (a5 != null) {
                            if (a5.a == 2) {
                                b5 = true;
                                break Label_0357;
                            }
                        }
                        b5 = false;
                    }
                    if (b5) {
                        n = 4;
                    }
                    else {
                        boolean b6 = false;
                        Label_0392: {
                            if (a5 != null) {
                                if (a5.a == 3) {
                                    b6 = true;
                                    break Label_0392;
                                }
                            }
                            b6 = false;
                        }
                        if (b6) {
                            n = 2;
                        }
                        else {
                            boolean b7 = false;
                            Label_0427: {
                                if (a5 != null) {
                                    if (a5.a == 5) {
                                        b7 = true;
                                        break Label_0427;
                                    }
                                }
                                b7 = false;
                            }
                            if (!b7) {
                                boolean b8 = false;
                                Label_0460: {
                                    if (a5 != null) {
                                        if (a5.a == 6) {
                                            b8 = true;
                                            break Label_0460;
                                        }
                                    }
                                    b8 = false;
                                }
                                if (b8) {
                                    n = 1;
                                    break Label_0474;
                                }
                            }
                            n = 0;
                        }
                    }
                }
            }
            int n2;
            if (a5 == null) {
                n2 = 0;
            }
            else {
                int n3;
                if (a5.a == 4) {
                    n3 = 1;
                }
                else {
                    n3 = 0;
                }
                n2 = n3;
            }
            final oi2.d0 f = b3.f;
            int n4;
            if (ng2.e.a((Object)f, (Object)oi2.d0.s)) {
                if (Build$VERSION.SDK_INT <= 32) {
                    n4 = 1;
                }
                else {
                    n4 = 3;
                }
            }
            else {
                ng2.e.a((Object)f, (Object)oi2.d0.r);
                n4 = 0;
            }
            final t2.d e2 = a2.b.e;
            Object o;
            if (e2 != null) {
                o = new t2.d.a(e2.a);
            }
            else {
                o = null;
            }
            boolean b9 = false;
            Label_0609: {
                if (o != null) {
                    if (((t2.d.a)o).a == 1) {
                        b9 = true;
                        break Label_0609;
                    }
                }
                b9 = false;
            }
            int n5 = 0;
            Label_0690: {
                if (!b9) {
                    boolean b10 = false;
                    Label_0641: {
                        if (o != null) {
                            if (((t2.d.a)o).a == 2) {
                                b10 = true;
                                break Label_0641;
                            }
                        }
                        b10 = false;
                    }
                    if (b10) {
                        n5 = 1;
                        break Label_0690;
                    }
                    boolean b11 = false;
                    Label_0676: {
                        if (o != null) {
                            if (((t2.d.a)o).a == 3) {
                                b11 = true;
                                break Label_0676;
                            }
                        }
                        b11 = false;
                    }
                    if (b11) {
                        n5 = 2;
                        break Label_0690;
                    }
                }
                n5 = 0;
            }
            Object o2;
            if (e2 != null) {
                o2 = new t2.d.b(e2.b);
            }
            else {
                o2 = null;
            }
            boolean b12 = false;
            Label_0737: {
                if (o2 != null) {
                    if (((t2.d.b)o2).a == 1) {
                        b12 = true;
                        break Label_0737;
                    }
                }
                b12 = false;
            }
            int n6 = 0;
            Label_0853: {
                if (!b12) {
                    boolean b13 = false;
                    Label_0769: {
                        if (o2 != null) {
                            if (((t2.d.b)o2).a == 2) {
                                b13 = true;
                                break Label_0769;
                            }
                        }
                        b13 = false;
                    }
                    if (b13) {
                        n6 = 1;
                        break Label_0853;
                    }
                    boolean b14 = false;
                    Label_0804: {
                        if (o2 != null) {
                            if (((t2.d.b)o2).a == 3) {
                                b14 = true;
                                break Label_0804;
                            }
                        }
                        b14 = false;
                    }
                    if (b14) {
                        n6 = 2;
                        break Label_0853;
                    }
                    boolean b15 = false;
                    Label_0839: {
                        if (o2 != null) {
                            if (((t2.d.b)o2).a == 4) {
                                b15 = true;
                                break Label_0839;
                            }
                        }
                        b15 = false;
                    }
                    if (b15) {
                        n6 = 3;
                        break Label_0853;
                    }
                }
                n6 = 0;
            }
            Object o3;
            if (e2 != null) {
                o3 = new t2.d.c(e2.c);
            }
            else {
                o3 = null;
            }
            boolean b16 = false;
            Label_0900: {
                if (o3 != null) {
                    if (((t2.d.c)o3).a == 1) {
                        b16 = true;
                        break Label_0900;
                    }
                }
                b16 = false;
            }
            int n7 = 0;
            Label_0946: {
                if (!b16) {
                    boolean b17 = false;
                    Label_0932: {
                        if (o3 != null) {
                            if (((t2.d.c)o3).a == 2) {
                                b17 = true;
                                break Label_0932;
                            }
                        }
                        b17 = false;
                    }
                    if (b17) {
                        n7 = 1;
                        break Label_0946;
                    }
                }
                n7 = 0;
            }
            TextUtils$TruncateAt end;
            if (b) {
                end = TextUtils$TruncateAt.END;
            }
            else {
                end = null;
            }
            final b w = this.w(n, n2, end, i, n4, n5, n6, n7);
            Label_1116: {
                if (b && w.a() > u2.a.g(c) && i > 1) {
                    final int g = u2.a.g(c);
                    while (true) {
                        int e3;
                        b w2;
                        for (e3 = w.e, i = 0; i < e3; ++i) {
                            if (w.c(i) > g) {
                                w2 = w;
                                if (i >= 0) {
                                    w2 = w;
                                    if (i != this.b) {
                                        if (i < 1) {
                                            i = 1;
                                        }
                                        w2 = this.w(n, n2, end, i, n4, n5, n6, n7);
                                    }
                                }
                                this.d = w2;
                                break Label_1116;
                            }
                        }
                        i = w.e;
                        continue;
                    }
                }
                this.d = w;
            }
            this.a.f.a(a2.a.a.d(), vl.a.d0(this.getWidth(), this.getHeight()), a2.a.a.f());
            final b d = this.d;
            s2.a[] array;
            if (!(d.h() instanceof Spanned)) {
                array = new s2.a[0];
            }
            else {
                array = (s2.a[])((Spanned)d.h()).getSpans(0, d.h().length(), (Class)s2.a.class);
                ng2.e.e((Object)array, "brushSpans");
                if (array.length == 0) {
                    i = 1;
                }
                else {
                    i = 0;
                }
                if (i != 0) {
                    array = new s2.a[0];
                }
            }
            int length;
            for (length = array.length, i = 0; i < length; ++i) {
                array[i].h = new n1.f(vl.a.d0(this.getWidth(), this.getHeight()));
            }
            final CharSequence e4 = this.e;
            Object instance;
            if (!(e4 instanceof Spanned)) {
                instance = EmptyList.INSTANCE;
            }
            else {
                final Object[] spans = ((Spanned)e4).getSpans(0, e4.length(), (Class)i.class);
                ng2.e.e((Object)spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                final ArrayList list = new ArrayList<n1.d>(spans.length);
                for (int length2 = spans.length, j = 0; j < length2; ++j) {
                    final i k = (i)spans[j];
                    final Spanned spanned = (Spanned)e4;
                    final int spanStart = spanned.getSpanStart((Object)k);
                    final int spanEnd = spanned.getSpanEnd((Object)k);
                    final int d2 = this.d.d(spanStart);
                    if (d2 >= this.b) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    final boolean b18 = this.d.d.getEllipsisCount(d2) > 0 && spanEnd > this.d.d.getEllipsisStart(d2);
                    final b d3 = this.d;
                    int n8;
                    if (d3.d.getEllipsisStart(d2) == 0) {
                        n8 = d3.d.getLineEnd(d2);
                    }
                    else {
                        n8 = d3.d.getText().length();
                    }
                    final boolean b19 = spanEnd > n8;
                    n1.d d5;
                    if (!b18 && !b19 && i == 0) {
                        i = AndroidParagraph.AndroidParagraph$a.a[((Enum)this.t(spanStart)).ordinal()];
                        float p4;
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            p4 = this.p(spanStart, true) - k.c();
                        }
                        else {
                            p4 = this.p(spanStart, true);
                        }
                        final float n9 = (float)k.c();
                        final b d4 = this.d;
                        float e5 = 0.0f;
                        Label_1860: {
                            float n12 = 0.0f;
                            Label_1853: {
                                float n10 = 0.0f;
                                float n11 = 0.0f;
                                switch (k.k) {
                                    default: {
                                        throw new IllegalStateException("unexpected verticalAlignment");
                                    }
                                    case 6: {
                                        final Paint$FontMetricsInt a6 = k.a();
                                        n10 = (float)((a6.ascent + a6.descent - k.b()) / 2);
                                        n11 = d4.b(d2);
                                        break;
                                    }
                                    case 5: {
                                        n12 = d4.b(d2) + k.a().descent;
                                        i = k.b();
                                        break Label_1853;
                                    }
                                    case 4: {
                                        n10 = (float)k.a().ascent;
                                        n11 = d4.b(d2);
                                        break;
                                    }
                                    case 3: {
                                        e5 = (d4.c(d2) + d4.e(d2) - k.b()) / 2;
                                        break Label_1860;
                                    }
                                    case 2: {
                                        n12 = d4.c(d2);
                                        i = k.b();
                                        break Label_1853;
                                    }
                                    case 1: {
                                        e5 = d4.e(d2);
                                        break Label_1860;
                                    }
                                    case 0: {
                                        n12 = d4.b(d2);
                                        i = k.b();
                                        break Label_1853;
                                    }
                                }
                                e5 = n11 + n10;
                                break Label_1860;
                            }
                            e5 = n12 - i;
                        }
                        d5 = new n1.d(p4, e5, n9 + p4, k.b() + e5);
                    }
                    else {
                        d5 = null;
                    }
                    list.add(d5);
                }
                instance = list;
            }
            this.f = (List<n1.d>)instance;
            this.g = kotlin.a.a(LazyThreadSafetyMode.NONE, (mg2.a)new AndroidParagraph$wordBoundary$2(this));
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }
    
    public final ResolvedTextDirection a(int d) {
        d = this.d.d(d);
        ResolvedTextDirection resolvedTextDirection;
        if (this.d.d.getParagraphDirection(d) == 1) {
            resolvedTextDirection = ResolvedTextDirection.Ltr;
        }
        else {
            resolvedTextDirection = ResolvedTextDirection.Rtl;
        }
        return resolvedTextDirection;
    }
    
    public final float b(final int n) {
        return this.d.e(n);
    }
    
    public final long c(int n) {
        final k2.a a = (k2.a)this.g.getValue();
        final k2.b a2 = a.a;
        a2.a(n);
        int n2;
        if (a.a.e(a2.d.preceding(n))) {
            final k2.b a3 = a.a;
            a3.a(n);
            int preceding = n;
            while (true) {
                n2 = preceding;
                if (preceding == -1) {
                    break;
                }
                final boolean b = a3.e(preceding) && !a3.c(preceding);
                n2 = preceding;
                if (b) {
                    break;
                }
                a3.a(preceding);
                preceding = a3.d.preceding(preceding);
            }
        }
        else {
            final k2.b a4 = a.a;
            a4.a(n);
            if (a4.d(n)) {
                if (a4.d.isBoundary(n) && !a4.b(n)) {
                    n2 = n;
                }
                else {
                    n2 = a4.d.preceding(n);
                }
            }
            else if (a4.b(n)) {
                n2 = a4.d.preceding(n);
            }
            else {
                n2 = -1;
            }
        }
        int n3;
        if ((n3 = n2) == -1) {
            n3 = n;
        }
        final k2.a a5 = (k2.a)this.g.getValue();
        final k2.b a6 = a5.a;
        a6.a(n);
        int n4;
        if (a5.a.c(a6.d.following(n))) {
            final k2.b a7 = a5.a;
            a7.a(n);
            int following = n;
            while (true) {
                n4 = following;
                if (following == -1) {
                    break;
                }
                final boolean b2 = !a7.e(following) && a7.c(following);
                n4 = following;
                if (b2) {
                    break;
                }
                a7.a(following);
                following = a7.d.following(following);
            }
        }
        else {
            final k2.b a8 = a5.a;
            a8.a(n);
            if (a8.b(n)) {
                if (a8.d.isBoundary(n) && !a8.d(n)) {
                    n4 = n;
                }
                else {
                    n4 = a8.d.following(n);
                }
            }
            else if (a8.d(n)) {
                n4 = a8.d.following(n);
            }
            else {
                n4 = -1;
            }
        }
        if (n4 != -1) {
            n = n4;
        }
        return d0.f(n3, n);
    }
    
    public final float d() {
        return this.d.b(0);
    }
    
    public final int e(final long n) {
        final b d = this.d;
        final int lineForVertical = d.d.getLineForVertical(d.f + (int)n1.c.f(n));
        final b d2 = this.d;
        final float e = n1.c.e(n);
        final Layout d3 = d2.d;
        final float n2 = -1;
        float n3;
        if (lineForVertical == d2.e - 1) {
            n3 = d2.h + d2.i;
        }
        else {
            n3 = 0.0f;
        }
        return d3.getOffsetForHorizontal(lineForVertical, n3 * n2 + e);
    }
    
    public final int f(final int n) {
        return this.d.d.getLineStart(n);
    }
    
    public final int g(int n, final boolean b) {
        if (b) {
            final b d = this.d;
            if (d.d.getEllipsisStart(n) == 0) {
                n = d.d.getLineVisibleEnd(n);
            }
            else {
                n = d.d.getEllipsisStart(n) + d.d.getLineStart(n);
            }
        }
        else {
            final b d2 = this.d;
            if (d2.d.getEllipsisStart(n) == 0) {
                n = d2.d.getLineEnd(n);
            }
            else {
                n = d2.d.getText().length();
            }
        }
        return n;
    }
    
    public final float getHeight() {
        return (float)this.d.a();
    }
    
    public final float getWidth() {
        return (float)u2.a.h(this.c);
    }
    
    public final int h(final float n) {
        final b d = this.d;
        return d.d.getLineForVertical(d.f + (int)n);
    }
    
    public final float i(final int n) {
        final b d = this.d;
        final float lineLeft = d.d.getLineLeft(n);
        float h;
        if (n == d.e - 1) {
            h = d.h;
        }
        else {
            h = 0.0f;
        }
        return lineLeft + h;
    }
    
    public final void j(final o1.p p4, final long n, final k0 k0, final g g) {
        final q2.a f = this.a.f;
        f.b(n);
        f.c(k0);
        f.d(g);
        this.x(p4);
    }
    
    public final float k(final int n) {
        return this.d.c(n);
    }
    
    public final n1.d l(int d) {
        if (d >= 0 && d <= this.e.length()) {
            final float f = this.d.f(d, false);
            d = this.d.d(d);
            return new n1.d(f, this.d.e(d), f, this.d.c(d));
        }
        final StringBuilder o = android.support.v4.media.a.o("offset(", d, ") is out of bounds (0,");
        o.append(this.e.length());
        throw new AssertionError((Object)o.toString());
    }
    
    public final float n(final int n) {
        final b d = this.d;
        final float lineRight = d.d.getLineRight(n);
        float i;
        if (n == d.e - 1) {
            i = d.i;
        }
        else {
            i = 0.0f;
        }
        return lineRight + i;
    }
    
    public final o1.h o(final int n, final int n2) {
        if (n >= 0 && n <= n2 && n2 <= this.e.length()) {
            final Path path = new Path();
            final b d = this.d;
            d.getClass();
            d.d.getSelectionPath(n, n2, path);
            if (d.f != 0 && !path.isEmpty()) {
                path.offset(0.0f, (float)d.f);
            }
            return new o1.h(path);
        }
        final StringBuilder p2 = android.support.v4.media.a.p("Start(", n, ") or End(", n2, ") is out of Range(0..");
        p2.append(this.e.length());
        p2.append("), or start > end!");
        throw new AssertionError((Object)p2.toString());
    }
    
    public final float p(final int n, final boolean b) {
        float n2;
        if (b) {
            n2 = this.d.f(n, false);
        }
        else {
            n2 = this.d.g(n, false);
        }
        return n2;
    }
    
    public final void q(final o1.p p6, final n n, final float n2, final k0 k0, final g g, final q1.f e) {
        final q2.a f = this.a.f;
        f.a(n, vl.a.d0(this.getWidth(), this.getHeight()), n2);
        f.c(k0);
        f.d(g);
        if (e != null) {
            if (!e.a((Object)f.e, (Object)e)) {
                f.e = e;
                if (e.a((Object)e, (Object)q1.h.a)) {
                    ((Paint)f).setStyle(Paint$Style.FILL);
                }
                else if (e instanceof q1.i) {
                    ((Paint)f).setStyle(Paint$Style.STROKE);
                    final q1.i i = (q1.i)e;
                    ((Paint)f).setStrokeWidth(i.a);
                    ((Paint)f).setStrokeMiter(i.b);
                    final int d = i.d;
                    final int n3 = 1;
                    Paint$Join strokeJoin;
                    if (d == 0) {
                        strokeJoin = Paint$Join.MITER;
                    }
                    else if (d == 1) {
                        strokeJoin = Paint$Join.ROUND;
                    }
                    else if (d == 2) {
                        strokeJoin = Paint$Join.BEVEL;
                    }
                    else {
                        strokeJoin = Paint$Join.MITER;
                    }
                    ((Paint)f).setStrokeJoin(strokeJoin);
                    final int c = i.c;
                    Paint$Cap strokeCap;
                    if (c == 0) {
                        strokeCap = Paint$Cap.BUTT;
                    }
                    else if (c == 1) {
                        strokeCap = Paint$Cap.ROUND;
                    }
                    else {
                        int n4;
                        if (c == 2) {
                            n4 = n3;
                        }
                        else {
                            n4 = 0;
                        }
                        if (n4 != 0) {
                            strokeCap = Paint$Cap.SQUARE;
                        }
                        else {
                            strokeCap = Paint$Cap.BUTT;
                        }
                    }
                    ((Paint)f).setStrokeCap(strokeCap);
                    ((Paint)f).setPathEffect((PathEffect)null);
                }
            }
        }
        this.x(p6);
    }
    
    public final float r() {
        final b d = this.d;
        return d.b(d.e - 1);
    }
    
    public final int s(final int n) {
        return this.d.d(n);
    }
    
    public final ResolvedTextDirection t(final int n) {
        ResolvedTextDirection resolvedTextDirection;
        if (this.d.d.isRtlCharAt(n)) {
            resolvedTextDirection = ResolvedTextDirection.Rtl;
        }
        else {
            resolvedTextDirection = ResolvedTextDirection.Ltr;
        }
        return resolvedTextDirection;
    }
    
    public final n1.d u(final int n) {
        final b d = this.d;
        final int d2 = d.d(n);
        final float e = d.e(d2);
        final float c = d.c(d2);
        final boolean b = d.d.getParagraphDirection(d2) == 1;
        final boolean rtlChar = d.d.isRtlCharAt(n);
        float n2 = 0.0f;
        float n3 = 0.0f;
        Label_0180: {
            if (b && !rtlChar) {
                n2 = d.f(n, false);
                n3 = d.f(n + 1, true);
            }
            else {
                float n4;
                float n5;
                if (b && rtlChar) {
                    n4 = d.g(n, false);
                    n5 = d.g(n + 1, true);
                }
                else {
                    if (!rtlChar) {
                        n2 = d.g(n, false);
                        n3 = d.g(n + 1, true);
                        break Label_0180;
                    }
                    n4 = d.f(n, false);
                    n5 = d.f(n + 1, true);
                }
                final float n6 = n4;
                n2 = n5;
                n3 = n6;
            }
        }
        final RectF rectF = new RectF(n2, e, n3, c);
        return new n1.d(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
    
    public final List<n1.d> v() {
        return this.f;
    }
    
    public final b w(final int n, final int n2, final TextUtils$TruncateAt textUtils$TruncateAt, final int n3, final int n4, final int n5, final int n6, final int n7) {
        final CharSequence e = this.e;
        final float width = this.getWidth();
        final a a = this.a;
        final q2.a f = a.f;
        final int j = a.j;
        final androidx.compose.ui.text.android.a h = a.h;
        ng2.e.f((Object)a.a, "<this>");
        return new b(e, width, f, n, textUtils$TruncateAt, j, n3, n5, n6, n7, n4, n2, h);
    }
    
    public final void x(final o1.p p) {
        final Canvas a = o1.c.a;
        final Canvas a2 = ((o1.b)p).a;
        if (this.d.c) {
            a2.save();
            a2.clipRect(0.0f, 0.0f, this.getWidth(), this.getHeight());
        }
        final b d = this.d;
        d.getClass();
        ng2.e.f((Object)a2, "canvas");
        final int f = d.f;
        if (f != 0) {
            a2.translate(0.0f, (float)f);
        }
        final o m = d.m;
        m.getClass();
        m.a = a2;
        d.d.draw((Canvas)d.m);
        final int f2 = d.f;
        if (f2 != 0) {
            a2.translate(0.0f, -1 * (float)f2);
        }
        if (this.d.c) {
            a2.restore();
        }
    }
}
