// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import pg2.j;
import androidx.compose.ui.platform.p0;
import u2.g;
import androidx.compose.ui.unit.LayoutDirection;
import u2.i;
import zg2.p;
import j1.b;
import ah2.f;
import j1.d;
import j1.a;
import j1.a$c;
import j1.a$b;
import j1.a$a;
import zg2.l;

public final class SizeKt
{
    public static final FillModifier a;
    public static final FillModifier b;
    public static final FillModifier c;
    public static final WrapContentModifier d;
    public static final WrapContentModifier e;
    public static final WrapContentModifier f;
    public static final WrapContentModifier g;
    public static final WrapContentModifier h;
    public static final WrapContentModifier i;
    
    static {
        a = new FillModifier(Direction.Horizontal, 1.0f, (l)new SizeKt$createFillWidthModifier$1(1.0f));
        b = new FillModifier(Direction.Vertical, 1.0f, (l)new SizeKt$createFillHeightModifier$1(1.0f));
        c = new FillModifier(Direction.Both, 1.0f, (l)new SizeKt$createFillSizeModifier$1(1.0f));
        d = c((a$b)a$a.n, false);
        e = c((a$b)a$a.m, false);
        f = a((a$c)a$a.k, false);
        g = a((a$c)a$a.j, false);
        h = b((a)a$a.e, false);
        i = b((a)a$a.a, false);
    }
    
    public static final d A(final d d, final a a, final boolean b) {
        ah2.f.f((Object)d, "<this>");
        ah2.f.f((Object)a, "align");
        WrapContentModifier wrapContentModifier;
        if (ah2.f.a((Object)a, (Object)a$a.e) && !b) {
            wrapContentModifier = SizeKt.h;
        }
        else if (ah2.f.a((Object)a, (Object)a$a.a) && !b) {
            wrapContentModifier = SizeKt.i;
        }
        else {
            wrapContentModifier = b(a, b);
        }
        return d.f0((d)wrapContentModifier);
    }
    
    public static d C(final d d, b.a n, final int n2) {
        if ((n2 & 0x1) != 0x0) {
            n = a$a.n;
        }
        ah2.f.f((Object)d, "<this>");
        ah2.f.f((Object)n, "align");
        WrapContentModifier wrapContentModifier;
        if (ah2.f.a((Object)n, (Object)a$a.n)) {
            wrapContentModifier = SizeKt.d;
        }
        else if (ah2.f.a((Object)n, (Object)a$a.m)) {
            wrapContentModifier = SizeKt.e;
        }
        else {
            wrapContentModifier = c((a$b)n, false);
        }
        return d.f0((d)wrapContentModifier);
    }
    
    public static final WrapContentModifier a(final a$c a$c, final boolean b) {
        return new WrapContentModifier(Direction.Vertical, b, (p<? super i, ? super LayoutDirection, g>)new SizeKt$createWrapContentHeightModifier$1(a$c), a$c, (l<? super p0, j>)new SizeKt$createWrapContentHeightModifier$2(a$c, b));
    }
    
    public static final WrapContentModifier b(final a a, final boolean b) {
        return new WrapContentModifier(Direction.Both, b, (p<? super i, ? super LayoutDirection, g>)new SizeKt$createWrapContentSizeModifier.SizeKt$createWrapContentSizeModifier$1(a), a, (l<? super p0, j>)new SizeKt$createWrapContentSizeModifier.SizeKt$createWrapContentSizeModifier$2(a, b));
    }
    
    public static final WrapContentModifier c(final a$b a$b, final boolean b) {
        return new WrapContentModifier(Direction.Horizontal, b, (p<? super i, ? super LayoutDirection, g>)new SizeKt$createWrapContentWidthModifier.SizeKt$createWrapContentWidthModifier$1(a$b), a$b, (l<? super p0, j>)new SizeKt$createWrapContentWidthModifier.SizeKt$createWrapContentWidthModifier$2(a$b, b));
    }
    
    public static final d d(final d d, final float n, final float n2) {
        ah2.f.f((Object)d, "$this$defaultMinSize");
        return d.f0((d)new UnspecifiedConstraintsModifier(n, n2, InspectableValueKt.a));
    }
    
    public static final d f(final d d, final float n) {
        ah2.f.f((Object)d, "<this>");
        FillModifier b;
        if (n == 1.0f) {
            b = SizeKt.b;
        }
        else {
            b = new FillModifier(Direction.Vertical, n, (l)new SizeKt$createFillHeightModifier$1(n));
        }
        return d.f0((d)b);
    }
    
    public static d h(final d d) {
        ah2.f.f((Object)d, "<this>");
        return d.f0((d)SizeKt.c);
    }
    
    public static final d i(final d d, final float n) {
        ah2.f.f((Object)d, "<this>");
        FillModifier a;
        if (n == 1.0f) {
            a = SizeKt.a;
        }
        else {
            a = new FillModifier(Direction.Horizontal, n, (l)new SizeKt$createFillWidthModifier$1(n));
        }
        return d.f0((d)a);
    }
    
    public static final d k(final d d, final float n) {
        ah2.f.f((Object)d, "$this$height");
        return d.f0((d)new SizeModifier(0.0f, n, 0.0f, n, true, InspectableValueKt.a, 5));
    }
    
    public static final d l(final d d, final float n, final float n2) {
        ah2.f.f((Object)d, "$this$heightIn");
        return d.f0((d)new SizeModifier(0.0f, n, 0.0f, n2, true, InspectableValueKt.a, 5));
    }
    
    public static final d n(final d d, final float n) {
        ah2.f.f((Object)d, "$this$requiredHeight");
        return d.f0((d)new SizeModifier(0.0f, n, 0.0f, n, false, InspectableValueKt.a, 5));
    }
    
    public static final d o(final d d, final float n) {
        ah2.f.f((Object)d, "$this$requiredSize");
        return d.f0((d)new SizeModifier(n, n, n, n, false, InspectableValueKt.a));
    }
    
    public static final d p(final d d, final float n, final float n2) {
        ah2.f.f((Object)d, "$this$requiredSize");
        return d.f0((d)new SizeModifier(n, n2, n, n2, false, InspectableValueKt.a));
    }
    
    public static d q(final d d, float n, float n2, final int n3) {
        if ((n3 & 0x1) != 0x0) {
            n = Float.NaN;
        }
        if ((n3 & 0x2) != 0x0) {
            n2 = Float.NaN;
        }
        float n4;
        if ((n3 & 0x4) != 0x0) {
            n4 = Float.NaN;
        }
        else {
            n4 = 0.0f;
        }
        float n5;
        if ((n3 & 0x8) != 0x0) {
            n5 = Float.NaN;
        }
        else {
            n5 = 0.0f;
        }
        ah2.f.f((Object)d, "$this$requiredSizeIn");
        return d.f0((d)new SizeModifier(n, n2, n4, n5, false, InspectableValueKt.a));
    }
    
    public static final d r(final float n) {
        return (d)new SizeModifier(n, 0.0f, n, 0.0f, false, InspectableValueKt.a, 10);
    }
    
    public static final d s(final d d, final float n) {
        ah2.f.f((Object)d, "$this$size");
        return d.f0((d)new SizeModifier(n, n, n, n, true, InspectableValueKt.a));
    }
    
    public static final d t(final d d, final float n, final float n2) {
        ah2.f.f((Object)d, "$this$size");
        return d.f0((d)new SizeModifier(n, n2, n, n2, true, InspectableValueKt.a));
    }
    
    public static final d u(final d d, final float n, final float n2, final float n3, final float n4) {
        ah2.f.f((Object)d, "$this$sizeIn");
        return d.f0((d)new SizeModifier(n, n2, n3, n4, true, InspectableValueKt.a));
    }
    
    public static final d w(final d d, final float n) {
        ah2.f.f((Object)d, "$this$width");
        return d.f0((d)new SizeModifier(n, 0.0f, n, 0.0f, true, InspectableValueKt.a, 10));
    }
    
    public static final d x(final d d, final float n, final float n2) {
        ah2.f.f((Object)d, "$this$widthIn");
        return d.f0((d)new SizeModifier(n, 0.0f, n2, 0.0f, true, InspectableValueKt.a, 10));
    }
    
    public static d z(final d d) {
        final b.b k = a$a.k;
        ah2.f.f((Object)d, "<this>");
        WrapContentModifier wrapContentModifier;
        if (ah2.f.a((Object)k, (Object)k)) {
            wrapContentModifier = SizeKt.f;
        }
        else if (ah2.f.a((Object)k, (Object)a$a.j)) {
            wrapContentModifier = SizeKt.g;
        }
        else {
            wrapContentModifier = a((a$c)k, false);
        }
        return d.f0((d)wrapContentModifier);
    }
}
