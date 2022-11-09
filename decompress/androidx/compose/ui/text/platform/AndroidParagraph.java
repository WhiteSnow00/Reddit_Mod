// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.text.platform;

import ak0.m;
import android.graphics.Path;
import o1.h;
import android.graphics.Canvas;
import t2.e;
import o1.k0;
import n1.c;
import eg.n0;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import android.graphics.Paint$FontMetricsInt;
import i2.p;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import java.util.ArrayList;
import l2.g;
import kotlin.collections.EmptyList;
import android.text.Spanned;
import o1.n;
import android.text.TextUtils$TruncateAt;
import pg2.f;
import java.util.List;
import androidx.compose.ui.text.android.b;
import i2.d;

public final class AndroidParagraph implements d
{
    public final androidx.compose.ui.text.platform.a a;
    public final int b;
    public final long c;
    public final b d;
    public final List<n1.d> e;
    public final f f;
    
    public AndroidParagraph(final androidx.compose.ui.text.platform.a a, int i, final boolean b, final long c) {
        this.a = a;
        this.b = i;
        this.c = c;
        if (u2.a.i(c) != 0 || u2.a.j(c) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i >= 1) {
            final p a2 = a.a;
            final t2.d a3 = a2.b.a;
            boolean b2 = false;
            Label_0108: {
                if (a3 != null) {
                    if (a3.a == 1) {
                        b2 = true;
                        break Label_0108;
                    }
                }
                b2 = false;
            }
            final int n = 3;
            int n2 = 0;
            Label_0264: {
                if (b2) {
                    n2 = n;
                }
                else {
                    boolean b3 = false;
                    Label_0147: {
                        if (a3 != null) {
                            if (a3.a == 2) {
                                b3 = true;
                                break Label_0147;
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        n2 = 4;
                    }
                    else {
                        boolean b4 = false;
                        Label_0182: {
                            if (a3 != null) {
                                if (a3.a == 3) {
                                    b4 = true;
                                    break Label_0182;
                                }
                            }
                            b4 = false;
                        }
                        if (b4) {
                            n2 = 2;
                        }
                        else {
                            boolean b5 = false;
                            Label_0217: {
                                if (a3 != null) {
                                    if (a3.a == 5) {
                                        b5 = true;
                                        break Label_0217;
                                    }
                                }
                                b5 = false;
                            }
                            if (!b5) {
                                boolean b6 = false;
                                Label_0250: {
                                    if (a3 != null) {
                                        if (a3.a == 6) {
                                            b6 = true;
                                            break Label_0250;
                                        }
                                    }
                                    b6 = false;
                                }
                                if (b6) {
                                    n2 = 1;
                                    break Label_0264;
                                }
                            }
                            n2 = 0;
                        }
                    }
                }
            }
            int n3 = 0;
            Label_0288: {
                if (a3 != null) {
                    if (a3.a == 4) {
                        n3 = 1;
                        break Label_0288;
                    }
                }
                n3 = 0;
            }
            TextUtils$TruncateAt end;
            if (b) {
                end = TextUtils$TruncateAt.END;
            }
            else {
                end = null;
            }
            final b u = this.u(n2, n3, end, i);
            Label_0479: {
                if (b) {
                    int n4;
                    if (u.a) {
                        n4 = u.b.getLineBottom(u.c - 1);
                    }
                    else {
                        n4 = u.b.getHeight();
                    }
                    if (n4 + u.d + u.e > u2.a.g(c) && i > 1) {
                        final int g = u2.a.g(c);
                        while (true) {
                            int c2;
                            b u2;
                            for (c2 = u.c, i = 0; i < c2; ++i) {
                                if (u.b(i) > g) {
                                    u2 = u;
                                    if (i > 0) {
                                        u2 = u;
                                        if (i != this.b) {
                                            u2 = this.u(n2, n3, end, i);
                                        }
                                    }
                                    this.d = u2;
                                    break Label_0479;
                                }
                            }
                            i = u.c;
                            continue;
                        }
                    }
                }
                this.d = u;
            }
            final q2.a f = this.a.f;
            a2.a.a.d();
            f.a(null, a80.a.f(this.v(), this.getHeight()));
            final b d = this.d;
            s2.a[] array;
            if (!(d.e() instanceof Spanned)) {
                array = new s2.a[0];
            }
            else {
                array = (s2.a[])((Spanned)d.e()).getSpans(0, d.e().length(), (Class)s2.a.class);
                ah2.f.e((Object)array, "brushSpans");
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
                array[i].f = new n1.f(a80.a.f(this.v(), this.getHeight()));
            }
            final CharSequence g2 = this.a.g;
            Object instance;
            if (!(g2 instanceof Spanned)) {
                instance = EmptyList.INSTANCE;
            }
            else {
                final Object[] spans = ((Spanned)g2).getSpans(0, g2.length(), (Class)g.class);
                ah2.f.e((Object)spans, "getSpans(0, length, PlaceholderSpan::class.java)");
                final ArrayList list = new ArrayList<n1.d>(spans.length);
                for (int length2 = spans.length, j = 0; j < length2; ++j) {
                    final g g3 = (g)spans[j];
                    final Spanned spanned = (Spanned)g2;
                    final int spanStart = spanned.getSpanStart((Object)g3);
                    final int spanEnd = spanned.getSpanEnd((Object)g3);
                    final int lineForOffset = this.d.b.getLineForOffset(spanStart);
                    if (this.d.b.getEllipsisCount(lineForOffset) > 0 && spanEnd > this.d.b.getEllipsisStart(lineForOffset)) {
                        i = 1;
                    }
                    else {
                        i = 0;
                    }
                    final b d2 = this.d;
                    int n5;
                    if (d2.b.getEllipsisStart(lineForOffset) == 0) {
                        n5 = d2.b.getLineEnd(lineForOffset);
                    }
                    else {
                        n5 = d2.b.getText().length();
                    }
                    final boolean b7 = spanEnd > n5;
                    n1.d d4;
                    if (i == 0 && !b7) {
                        i = AndroidParagraph.a.a[this.r(spanStart).ordinal()];
                        float o;
                        if (i != 1) {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            o = this.o(spanStart, true) - g3.c();
                        }
                        else {
                            o = this.o(spanStart, true);
                        }
                        final float n6 = (float)g3.c();
                        final b d3 = this.d;
                        float c3 = 0.0f;
                        Label_1198: {
                            float n7 = 0.0f;
                            float n8 = 0.0f;
                            Label_1109: {
                                float n9 = 0.0f;
                                switch (g3.k) {
                                    default: {
                                        throw new IllegalStateException("unexpected verticalAlignment");
                                    }
                                    case 6: {
                                        final Paint$FontMetricsInt a4 = g3.a();
                                        n7 = (float)((a4.ascent + a4.descent - g3.b()) / 2);
                                        n8 = d3.a(lineForOffset);
                                        break Label_1109;
                                    }
                                    case 5: {
                                        n9 = d3.a(lineForOffset) + g3.a().descent;
                                        i = g3.b();
                                        break;
                                    }
                                    case 4: {
                                        n7 = (float)g3.a().ascent;
                                        n8 = d3.a(lineForOffset);
                                        break Label_1109;
                                    }
                                    case 3: {
                                        c3 = (d3.b(lineForOffset) + d3.c(lineForOffset) - g3.b()) / 2;
                                        break Label_1198;
                                    }
                                    case 2: {
                                        n9 = d3.b(lineForOffset);
                                        i = g3.b();
                                        break;
                                    }
                                    case 1: {
                                        c3 = d3.c(lineForOffset);
                                        break Label_1198;
                                    }
                                    case 0: {
                                        n9 = d3.a(lineForOffset);
                                        i = g3.b();
                                        break;
                                    }
                                }
                                c3 = n9 - i;
                                break Label_1198;
                            }
                            c3 = n8 + n7;
                        }
                        d4 = new n1.d(o, c3, n6 + o, g3.b() + c3);
                    }
                    else {
                        d4 = null;
                    }
                    list.add(d4);
                }
                instance = list;
            }
            this.e = (List<n1.d>)instance;
            this.f = kotlin.a.a(LazyThreadSafetyMode.NONE, (zg2.a)new AndroidParagraph$wordBoundary.AndroidParagraph$wordBoundary$2(this));
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }
    
    public final ResolvedTextDirection a(int lineForOffset) {
        lineForOffset = this.d.b.getLineForOffset(lineForOffset);
        ResolvedTextDirection resolvedTextDirection;
        if (this.d.b.getParagraphDirection(lineForOffset) == 1) {
            resolvedTextDirection = ResolvedTextDirection.Ltr;
        }
        else {
            resolvedTextDirection = ResolvedTextDirection.Rtl;
        }
        return resolvedTextDirection;
    }
    
    public final float b(final int n) {
        return this.d.c(n);
    }
    
    public final long c(int n) {
        final k2.a a = (k2.a)this.f.getValue();
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
        final k2.a a5 = (k2.a)this.f.getValue();
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
        return n0.j(n3, n);
    }
    
    public final float d() {
        return this.d.a(0);
    }
    
    public final int e(final long n) {
        final b d = this.d;
        return this.d.b.getOffsetForHorizontal(d.b.getLineForVertical(d.d + (int)n1.c.d(n)), n1.c.c(n));
    }
    
    public final int f(final int n) {
        return this.d.b.getLineStart(n);
    }
    
    public final int g(int n, final boolean b) {
        if (b) {
            final b d = this.d;
            if (d.b.getEllipsisStart(n) == 0) {
                n = d.b.getLineVisibleEnd(n);
            }
            else {
                n = d.b.getEllipsisStart(n) + d.b.getLineStart(n);
            }
        }
        else {
            final b d2 = this.d;
            if (d2.b.getEllipsisStart(n) == 0) {
                n = d2.b.getLineEnd(n);
            }
            else {
                n = d2.b.getText().length();
            }
        }
        return n;
    }
    
    public final float getHeight() {
        final b d = this.d;
        int n;
        if (d.a) {
            n = d.b.getLineBottom(d.c - 1);
        }
        else {
            n = d.b.getHeight();
        }
        return (float)(n + d.d + d.e);
    }
    
    public final int h(final float n) {
        final b d = this.d;
        return d.b.getLineForVertical(d.d + (int)n);
    }
    
    public final float i(final int n) {
        return this.d.b.getLineLeft(n);
    }
    
    public final void j(final o1.p p4, final long n, final k0 k0, final e e) {
        final q2.a f = this.a.f;
        f.b(n);
        f.c(k0);
        f.d(e);
        final Canvas a = o1.c.a;
        final Canvas a2 = ((o1.b)p4).a;
        if (this.d.a) {
            a2.save();
            a2.clipRect(0.0f, 0.0f, this.v(), this.getHeight());
        }
        this.d.f(a2);
        if (this.d.a) {
            a2.restore();
        }
    }
    
    public final float k(final int n) {
        return this.d.b(n);
    }
    
    public final n1.d l(int lineForOffset) {
        if (lineForOffset >= 0 && lineForOffset <= this.a.g.length()) {
            final float d = androidx.compose.ui.text.android.b.d(this.d, lineForOffset);
            lineForOffset = this.d.b.getLineForOffset(lineForOffset);
            return new n1.d(d, this.d.c(lineForOffset), d, this.d.b(lineForOffset));
        }
        final StringBuilder p = d.p("offset(", lineForOffset, ") is out of bounds (0,");
        p.append(this.a.g.length());
        throw new AssertionError((Object)p.toString());
    }
    
    public final float m(final int n) {
        return this.d.b.getLineRight(n);
    }
    
    public final h n(final int n, final int n2) {
        if (n >= 0 && n <= n2 && n2 <= this.a.g.length()) {
            final Path path = new Path();
            final b d = this.d;
            d.getClass();
            d.b.getSelectionPath(n, n2, path);
            if (d.d != 0 && !path.isEmpty()) {
                path.offset(0.0f, (float)d.d);
            }
            return new h(path);
        }
        final StringBuilder r = m.r("Start(", n, ") or End(", n2, ") is out of Range(0..");
        r.append(this.a.g.length());
        r.append("), or start > end!");
        throw new AssertionError((Object)r.toString());
    }
    
    public final float o(final int n, final boolean b) {
        float n2;
        if (b) {
            n2 = b.d(this.d, n);
        }
        else {
            n2 = ((j2.b)this.d.f.getValue()).a(n, false, false);
        }
        return n2;
    }
    
    public final float p() {
        final int b = this.b;
        final b d = this.d;
        final int c = d.c;
        float n;
        if (b < c) {
            n = d.a(b - 1);
        }
        else {
            n = d.a(c - 1);
        }
        return n;
    }
    
    public final int q(final int n) {
        return this.d.b.getLineForOffset(n);
    }
    
    public final ResolvedTextDirection r(final int n) {
        ResolvedTextDirection resolvedTextDirection;
        if (this.d.b.isRtlCharAt(n)) {
            resolvedTextDirection = ResolvedTextDirection.Rtl;
        }
        else {
            resolvedTextDirection = ResolvedTextDirection.Ltr;
        }
        return resolvedTextDirection;
    }
    
    public final n1.d s(int lineForOffset) {
        final float d = androidx.compose.ui.text.android.b.d(this.d, lineForOffset);
        final float d2 = androidx.compose.ui.text.android.b.d(this.d, lineForOffset + 1);
        lineForOffset = this.d.b.getLineForOffset(lineForOffset);
        return new n1.d(d, this.d.c(lineForOffset), d2, this.d.b(lineForOffset));
    }
    
    public final List<n1.d> t() {
        return this.e;
    }
    
    public final b u(final int n, final int n2, final TextUtils$TruncateAt textUtils$TruncateAt, final int n3) {
        final CharSequence g = this.a.g;
        final float v = this.v();
        final androidx.compose.ui.text.platform.a a = this.a;
        final q2.a f = a.f;
        final int j = a.j;
        final androidx.compose.ui.text.android.a h = a.h;
        ah2.f.f((Object)a.a, "<this>");
        return new b(g, v, f, n, textUtils$TruncateAt, j, n3, n2, h);
    }
    
    public final float v() {
        return (float)u2.a.h(this.c);
    }
}
