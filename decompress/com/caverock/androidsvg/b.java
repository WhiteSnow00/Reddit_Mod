// 
// Decompiled by Procyon v0.6.0
// 

package com.caverock.androidsvg;

import android.graphics.Paint$Style;
import android.graphics.PathMeasure;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import java.util.List;
import android.graphics.DashPathEffect;
import android.graphics.PathEffect;
import android.graphics.Paint$Join;
import android.graphics.Paint$Cap;
import java.util.Set;
import java.util.Iterator;
import android.graphics.Bitmap;
import android.graphics.Path$FillType;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.util.Collection;
import java.util.Locale;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.Xfermode;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import java.util.ArrayList;
import android.graphics.Path$Op;
import android.util.Log;
import android.graphics.Typeface;
import android.graphics.RectF;
import android.graphics.Path;
import android.graphics.Matrix;
import java.util.Stack;
import android.graphics.Canvas;
import java.util.HashSet;

public final class b
{
    public static HashSet<String> h;
    public Canvas a;
    public float b;
    public SVG c;
    public h d;
    public Stack<h> e;
    public Stack<SVG.h0> f;
    public Stack<Matrix> g;
    
    public b(final Canvas a, final float b) {
        this.a = a;
        this.b = b;
    }
    
    public static Path A(final SVG$y svg$y) {
        final Path path = new Path();
        final float[] o = svg$y.o;
        path.moveTo(o[0], o[1]);
        int n = 2;
        while (true) {
            final float[] o2 = svg$y.o;
            if (n >= o2.length) {
                break;
            }
            path.lineTo(o2[n], o2[n + 1]);
            n += 2;
        }
        if (svg$y instanceof SVG$z) {
            path.close();
        }
        if (((SVG$i0)svg$y).h == null) {
            ((SVG$i0)svg$y).h = c(path);
        }
        return path;
    }
    
    public static void N(final h h, final boolean b, final SVG.m0 m0) {
        final SVG.Style a = h.a;
        Float n;
        if (b) {
            n = a.i;
        }
        else {
            n = a.k;
        }
        final float floatValue = n;
        int n2;
        if (m0 instanceof SVG$f) {
            n2 = ((SVG$f)m0).f;
        }
        else {
            if (!(m0 instanceof SVG$g)) {
                return;
            }
            n2 = h.a.s.f;
        }
        final int i = i(floatValue, n2);
        if (b) {
            h.d.setColor(i);
        }
        else {
            h.e.setColor(i);
        }
    }
    
    public static void a(final float n, final float n2, float n3, float n4, final float n5, final boolean b, final boolean b2, final float n6, final float n7, final SVG.w w) {
        if (n != n6 || n2 != n7) {
            if (n3 != 0.0f && n4 != 0.0f) {
                final float abs = Math.abs(n3);
                final float abs2 = Math.abs(n4);
                final double radians = Math.toRadians(n5 % 360.0);
                final double cos = Math.cos(radians);
                final double sin = Math.sin(radians);
                final double n8 = (n - n6) / 2.0;
                final double n9 = (n2 - n7) / 2.0;
                final double n10 = sin * n9 + cos * n8;
                final double n11 = n9 * cos + -sin * n8;
                double n12 = abs * abs;
                double n13 = abs2 * abs2;
                final double n14 = n10 * n10;
                final double n15 = n11 * n11;
                final double n16 = n15 / n13 + n14 / n12;
                n4 = abs;
                n3 = abs2;
                if (n16 > 0.99999) {
                    final double n17 = Math.sqrt(n16) * 1.00001;
                    n4 = (float)(abs * n17);
                    n3 = (float)(n17 * abs2);
                    n12 = n4 * n4;
                    n13 = n3 * n3;
                }
                double n18;
                if (b == b2) {
                    n18 = -1.0;
                }
                else {
                    n18 = 1.0;
                }
                final double n19 = n12 * n15;
                final double n20 = n13 * n14;
                double n21;
                if ((n21 = (n12 * n13 - n19 - n20) / (n19 + n20)) < 0.0) {
                    n21 = 0.0;
                }
                final double n22 = Math.sqrt(n21) * n18;
                final double n23 = n4;
                final double n24 = n3;
                final double n25 = n23 * n11 / n24 * n22;
                final double n26 = n22 * -(n24 * n10 / n23);
                final double n27 = (n + n6) / 2.0;
                final double n28 = cos * n26 + sin * n25 + (n2 + n7) / 2.0;
                final double n29 = (n10 - n25) / n23;
                final double n30 = (n11 - n26) / n24;
                final double n31 = (-n10 - n25) / n23;
                final double n32 = (-n11 - n26) / n24;
                final double n33 = n30 * n30 + n29 * n29;
                final double sqrt = Math.sqrt(n33);
                double n34;
                if (n30 < 0.0) {
                    n34 = -1.0;
                }
                else {
                    n34 = 1.0;
                }
                final double acos = Math.acos(n29 / sqrt);
                final double sqrt2 = Math.sqrt((n32 * n32 + n31 * n31) * n33);
                double n35;
                if (n29 * n32 - n30 * n31 < 0.0) {
                    n35 = -1.0;
                }
                else {
                    n35 = 1.0;
                }
                final double n36 = (n30 * n32 + n29 * n31) / sqrt2;
                double acos2;
                if (n36 < -1.0) {
                    acos2 = 3.141592653589793;
                }
                else if (n36 > 1.0) {
                    acos2 = 0.0;
                }
                else {
                    acos2 = Math.acos(n36);
                }
                final double n37 = n35 * acos2;
                double n38;
                if (!b2 && n37 > 0.0) {
                    n38 = n37 - 6.283185307179586;
                }
                else {
                    n38 = n37;
                    if (b2) {
                        n38 = n37;
                        if (n37 < 0.0) {
                            n38 = n37 + 6.283185307179586;
                        }
                    }
                }
                final double n39 = n38 % 6.283185307179586;
                final double n40 = acos * n34 % 6.283185307179586;
                final int n41 = (int)Math.ceil(Math.abs(n39) * 2.0 / 3.141592653589793);
                final double n42 = n39 / n41;
                final double n43 = n42 / 2.0;
                final double n44 = Math.sin(n43) * 1.3333333333333333 / (Math.cos(n43) + 1.0);
                final int n45 = n41 * 6;
                final float[] array = new float[n45];
                int i = 0;
                int n46 = 0;
                final double n47 = n28;
                while (i < n41) {
                    final double n48 = i * n42 + n40;
                    final double cos2 = Math.cos(n48);
                    final double sin2 = Math.sin(n48);
                    final int n49 = n46 + 1;
                    array[n46] = (float)(cos2 - n44 * sin2);
                    final int n50 = n49 + 1;
                    array[n49] = (float)(cos2 * n44 + sin2);
                    final double n51 = n48 + n42;
                    final double cos3 = Math.cos(n51);
                    final double sin3 = Math.sin(n51);
                    final int n52 = n50 + 1;
                    array[n50] = (float)(n44 * sin3 + cos3);
                    final int n53 = n52 + 1;
                    array[n52] = (float)(sin3 - n44 * cos3);
                    final int n54 = n53 + 1;
                    array[n53] = (float)cos3;
                    n46 = n54 + 1;
                    array[n54] = (float)sin3;
                    ++i;
                }
                final Matrix matrix = new Matrix();
                matrix.postScale(n4, n3);
                matrix.postRotate(n5);
                matrix.postTranslate((float)(cos * n25 - sin * n26 + n27), (float)n47);
                matrix.mapPoints(array);
                array[n45 - 2] = n6;
                array[n45 - 1] = n7;
                for (int j = 0; j < n45; j += 6) {
                    w.c(array[j], array[j + 1], array[j + 2], array[j + 3], array[j + 4], array[j + 5]);
                }
            }
            else {
                w.b(n6, n7);
            }
        }
    }
    
    public static SVG.b c(final Path path) {
        final RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        return new SVG.b(rectF.left, rectF.top, rectF.width(), rectF.height());
    }
    
    public static Matrix e(final SVG.b b, final SVG.b b2, final PreserveAspectRatio preserveAspectRatio) {
        final Matrix matrix = new Matrix();
        if (preserveAspectRatio != null) {
            if (preserveAspectRatio.a != null) {
                final float n = b.c / b2.c;
                final float n2 = b.d / b2.d;
                final float n3 = -b2.a;
                final float n4 = -b2.b;
                if (preserveAspectRatio.equals(PreserveAspectRatio.c)) {
                    matrix.preTranslate(b.a, b.b);
                    matrix.preScale(n, n2);
                    matrix.preTranslate(n3, n4);
                    return matrix;
                }
                float n5;
                if (preserveAspectRatio.b == PreserveAspectRatio.Scale.slice) {
                    n5 = Math.max(n, n2);
                }
                else {
                    n5 = Math.min(n, n2);
                }
                final float n6 = b.c / n5;
                final float n7 = b.d / n5;
                final int[] a = b$a.a;
                float n8 = 0.0f;
                Label_0237: {
                    float n9 = 0.0f;
                    switch (a[preserveAspectRatio.a.ordinal()]) {
                        default: {
                            n8 = n3;
                            break Label_0237;
                        }
                        case 4:
                        case 5:
                        case 6: {
                            n9 = b2.c - n6;
                            break;
                        }
                        case 1:
                        case 2:
                        case 3: {
                            n9 = (b2.c - n6) / 2.0f;
                            break;
                        }
                    }
                    n8 = n3 - n9;
                }
                final int n10 = a[preserveAspectRatio.a.ordinal()];
                float n11 = 0.0f;
                Label_0325: {
                    float n12 = 0.0f;
                    Label_0318: {
                        Label_0307: {
                            if (n10 != 2) {
                                if (n10 != 3) {
                                    if (n10 == 5) {
                                        break Label_0307;
                                    }
                                    if (n10 != 6) {
                                        if (n10 == 7) {
                                            break Label_0307;
                                        }
                                        if (n10 != 8) {
                                            n11 = n4;
                                            break Label_0325;
                                        }
                                    }
                                }
                                n12 = b2.d - n7;
                                break Label_0318;
                            }
                        }
                        n12 = (b2.d - n7) / 2.0f;
                    }
                    n11 = n4 - n12;
                }
                matrix.preTranslate(b.a, b.b);
                matrix.preScale(n5, n5);
                matrix.preTranslate(n8, n11);
            }
        }
        return matrix;
    }
    
    public static Typeface h(final String s, final Integer n, final SVG.Style.FontStyle fontStyle) {
        final SVG.Style.FontStyle italic = SVG.Style.FontStyle.Italic;
        final int n2 = 0;
        final boolean b = fontStyle == italic;
        int n3;
        if (n > 500) {
            if (b) {
                n3 = 3;
            }
            else {
                n3 = 1;
            }
        }
        else if (b) {
            n3 = 2;
        }
        else {
            n3 = 0;
        }
        s.getClass();
        int n4 = 0;
        Label_0213: {
            switch (s.hashCode()) {
                case 1126973893: {
                    if (!s.equals("cursive")) {
                        break;
                    }
                    n4 = 4;
                    break Label_0213;
                }
                case 109326717: {
                    if (!s.equals("serif")) {
                        break;
                    }
                    n4 = 3;
                    break Label_0213;
                }
                case -1081737434: {
                    if (!s.equals("fantasy")) {
                        break;
                    }
                    n4 = 2;
                    break Label_0213;
                }
                case -1431958525: {
                    if (!s.equals("monospace")) {
                        break;
                    }
                    n4 = 1;
                    break Label_0213;
                }
                case -1536685117: {
                    n4 = n2;
                    if (!s.equals("sans-serif")) {
                        break;
                    }
                    break Label_0213;
                }
            }
            n4 = -1;
        }
        Typeface typeface = null;
        switch (n4) {
            default: {
                typeface = null;
                break;
            }
            case 4: {
                typeface = Typeface.create(Typeface.SANS_SERIF, n3);
                break;
            }
            case 3: {
                typeface = Typeface.create(Typeface.SERIF, n3);
                break;
            }
            case 2: {
                typeface = Typeface.create(Typeface.SANS_SERIF, n3);
                break;
            }
            case 1: {
                typeface = Typeface.create(Typeface.MONOSPACE, n3);
                break;
            }
            case 0: {
                typeface = Typeface.create(Typeface.SANS_SERIF, n3);
                break;
            }
        }
        return typeface;
    }
    
    public static int i(final float n, final int n2) {
        int n3 = 255;
        final int round = Math.round((n2 >> 24 & 0xFF) * n);
        if (round < 0) {
            n3 = 0;
        }
        else if (round <= 255) {
            n3 = round;
        }
        return n3 << 24 | (n2 & 0xFFFFFF);
    }
    
    public static void o(final String s, final Object... array) {
        Log.e("SVGAndroidRenderer", String.format(s, array));
    }
    
    public static void q(final SVG$j svg$j, String l) {
        final SVG.SVG$j0 g = ((SVG.l0)svg$j).a.g(l);
        if (g == null) {
            Log.w("SVGAndroidRenderer", String.format("Gradient reference '%s' not found", l));
            return;
        }
        if (!(g instanceof SVG$j)) {
            o("Gradient href attributes must point to other gradient elements", new Object[0]);
            return;
        }
        if (g == svg$j) {
            o("Circular reference in gradient href attribute '%s'", l);
            return;
        }
        l = (String)g;
        if (svg$j.i == null) {
            svg$j.i = ((SVG$j)l).i;
        }
        if (svg$j.j == null) {
            svg$j.j = ((SVG$j)l).j;
        }
        if (svg$j.k == null) {
            svg$j.k = ((SVG$j)l).k;
        }
        if (svg$j.h.isEmpty()) {
            svg$j.h = ((SVG$j)l).h;
        }
        while (true) {
            try {
                if (svg$j instanceof SVG.k0) {
                    final SVG.k0 k0 = (SVG.k0)svg$j;
                    final SVG.k0 k2 = (SVG.k0)g;
                    if (k0.m == null) {
                        k0.m = k2.m;
                    }
                    if (k0.n == null) {
                        k0.n = k2.n;
                    }
                    if (k0.o == null) {
                        k0.o = k2.o;
                    }
                    if (k0.p == null) {
                        k0.p = k2.p;
                    }
                }
                else {
                    r((SVG.o0)svg$j, (SVG.o0)g);
                }
                l = ((SVG$j)l).l;
                if (l != null) {
                    q(svg$j, l);
                }
            }
            catch (final ClassCastException ex) {
                continue;
            }
            break;
        }
    }
    
    public static void r(final SVG.o0 o0, final SVG.o0 o2) {
        if (o0.m == null) {
            o0.m = o2.m;
        }
        if (o0.n == null) {
            o0.n = o2.n;
        }
        if (o0.o == null) {
            o0.o = o2.o;
        }
        if (o0.p == null) {
            o0.p = o2.p;
        }
        if (o0.q == null) {
            o0.q = o2.q;
        }
    }
    
    public static void s(final SVG$x svg$x, String x) {
        final SVG.SVG$j0 g = ((SVG.l0)svg$x).a.g(x);
        if (g == null) {
            Log.w("SVGAndroidRenderer", String.format("Pattern reference '%s' not found", x));
            return;
        }
        if (!(g instanceof SVG$x)) {
            o("Pattern href attributes must point to other pattern elements", new Object[0]);
            return;
        }
        if (g == svg$x) {
            o("Circular reference in pattern href attribute '%s'", x);
            return;
        }
        final SVG$x svg$x2 = (SVG$x)g;
        if (svg$x.q == null) {
            svg$x.q = svg$x2.q;
        }
        if (svg$x.r == null) {
            svg$x.r = svg$x2.r;
        }
        if (svg$x.s == null) {
            svg$x.s = svg$x2.s;
        }
        if (svg$x.t == null) {
            svg$x.t = svg$x2.t;
        }
        if (svg$x.u == null) {
            svg$x.u = svg$x2.u;
        }
        if (svg$x.v == null) {
            svg$x.v = svg$x2.v;
        }
        if (svg$x.w == null) {
            svg$x.w = svg$x2.w;
        }
        if (((SVG.f0)svg$x).i.isEmpty()) {
            ((SVG.f0)svg$x).i = ((SVG.f0)svg$x2).i;
        }
        if (((SVG$p0)svg$x).p == null) {
            ((SVG$p0)svg$x).p = ((SVG$p0)svg$x2).p;
        }
        if (((SVG$n0)svg$x).o == null) {
            ((SVG$n0)svg$x).o = ((SVG$n0)svg$x2).o;
        }
        x = svg$x2.x;
        if (x != null) {
            s(svg$x, x);
        }
    }
    
    public static boolean x(final SVG.Style style, final long n) {
        return (style.f & n) != 0x0L;
    }
    
    public final Path B(final SVG$a0 svg$a0) {
        final SVG.o s = svg$a0.s;
        float e = 0.0f;
        float f = 0.0f;
        Label_0081: {
            float n;
            if (s == null && svg$a0.t == null) {
                n = 0.0f;
            }
            else if (s == null) {
                n = svg$a0.t.f(this);
            }
            else {
                if (svg$a0.t != null) {
                    e = s.e(this);
                    f = svg$a0.t.f(this);
                    break Label_0081;
                }
                n = s.e(this);
            }
            final float n2 = n;
            e = n;
            f = n2;
        }
        final float min = Math.min(e, svg$a0.q.e(this) / 2.0f);
        final float min2 = Math.min(f, svg$a0.r.f(this) / 2.0f);
        final SVG.o o = svg$a0.o;
        float e2;
        if (o != null) {
            e2 = o.e(this);
        }
        else {
            e2 = 0.0f;
        }
        final SVG.o p = svg$a0.p;
        float f2;
        if (p != null) {
            f2 = p.f(this);
        }
        else {
            f2 = 0.0f;
        }
        final float e3 = svg$a0.q.e(this);
        final float f3 = svg$a0.r.f(this);
        if (((SVG$i0)svg$a0).h == null) {
            ((SVG$i0)svg$a0).h = new SVG.b(e2, f2, e3, f3);
        }
        final float n3 = e2 + e3;
        final float n4 = f2 + f3;
        final Path path = new Path();
        if (min != 0.0f && min2 != 0.0f) {
            final float n5 = min * 0.5522848f;
            final float n6 = 0.5522848f * min2;
            final float n7 = f2 + min2;
            path.moveTo(e2, n7);
            final float n8 = n7 - n6;
            final float n9 = e2 + min;
            final float n10 = n9 - n5;
            path.cubicTo(e2, n8, n10, f2, n9, f2);
            final float n11 = n3 - min;
            path.lineTo(n11, f2);
            final float n12 = n11 + n5;
            path.cubicTo(n12, f2, n3, n8, n3, n7);
            final float n13 = n4 - min2;
            path.lineTo(n3, n13);
            final float n14 = n13 + n6;
            path.cubicTo(n3, n14, n12, n4, n11, n4);
            path.lineTo(n9, n4);
            path.cubicTo(n10, n4, e2, n14, e2, n13);
            path.lineTo(e2, n7);
        }
        else {
            path.moveTo(e2, f2);
            path.lineTo(n3, f2);
            path.lineTo(n3, n4);
            path.lineTo(e2, n4);
            path.lineTo(e2, f2);
        }
        path.close();
        return path;
    }
    
    public final SVG.b C(final SVG.o o, final SVG.o o2, final SVG.o o3, final SVG.o o4) {
        float f = 0.0f;
        float e;
        if (o != null) {
            e = o.e(this);
        }
        else {
            e = 0.0f;
        }
        if (o2 != null) {
            f = o2.f(this);
        }
        final h d = this.d;
        SVG.b b = d.g;
        if (b == null) {
            b = d.f;
        }
        float n;
        if (o3 != null) {
            n = o3.e(this);
        }
        else {
            n = b.c;
        }
        float n2;
        if (o4 != null) {
            n2 = o4.f(this);
        }
        else {
            n2 = b.d;
        }
        return new SVG.b(e, f, n, n2);
    }
    
    public final Path D(final SVG$i0 svg$i0, final boolean b) {
        this.e.push(this.d);
        this.T(this.d = new h(this.d), (SVG$j0)svg$i0);
        if (this.k() && this.V()) {
            Path path;
            if (svg$i0 instanceof SVG$b1) {
                if (!b) {
                    o("<use> elements inside a <clipPath> cannot reference another <use>", new Object[0]);
                }
                final SVG$b1 svg$b1 = (SVG$b1)svg$i0;
                final SVG.SVG$j0 g = ((SVG.l0)svg$i0).a.g(svg$b1.p);
                if (g == null) {
                    o("Use reference '%s' not found", svg$b1.p);
                    this.d = this.e.pop();
                    return null;
                }
                if (!(g instanceof SVG$i0)) {
                    this.d = this.e.pop();
                    return null;
                }
                final Path d = this.D((SVG$i0)g, false);
                if (d == null) {
                    return null;
                }
                if (((SVG$i0)svg$b1).h == null) {
                    ((SVG$i0)svg$b1).h = c(d);
                }
                final Matrix o = ((SVG$l)svg$b1).o;
                path = d;
                if (o != null) {
                    d.transform(o);
                    path = d;
                }
            }
            else if (svg$i0 instanceof SVG$k) {
                final SVG$k svg$k = (SVG$k)svg$i0;
                if (svg$i0 instanceof SVG$u) {
                    final Path path2 = path = new b.b$d(((SVG$u)svg$i0).o).a;
                    if (svg$i0.h == null) {
                        svg$i0.h = c(path2);
                        path = path2;
                    }
                }
                else if (svg$i0 instanceof SVG$a0) {
                    path = this.B((SVG$a0)svg$i0);
                }
                else if (svg$i0 instanceof SVG$d) {
                    path = this.y((SVG$d)svg$i0);
                }
                else if (svg$i0 instanceof SVG$i) {
                    path = this.z((SVG$i)svg$i0);
                }
                else if (svg$i0 instanceof SVG$y) {
                    path = A((SVG$y)svg$i0);
                }
                else {
                    path = null;
                }
                if (path == null) {
                    return null;
                }
                if (((SVG$i0)svg$k).h == null) {
                    ((SVG$i0)svg$k).h = c(path);
                }
                final Matrix n = svg$k.n;
                if (n != null) {
                    path.transform(n);
                }
                path.setFillType(this.w());
            }
            else {
                if (!(svg$i0 instanceof SVG$u0)) {
                    o("Invalid %s element found in clipPath definition", ((SVG.l0)svg$i0).o());
                    return null;
                }
                final SVG$u0 svg$u0 = (SVG$u0)svg$i0;
                final ArrayList o2 = ((SVG$y0)svg$u0).o;
                final float n2 = 0.0f;
                float e;
                if (o2 != null && o2.size() != 0) {
                    e = ((SVG.o)((SVG$y0)svg$u0).o.get(0)).e(this);
                }
                else {
                    e = 0.0f;
                }
                final ArrayList p2 = ((SVG$y0)svg$u0).p;
                float f;
                if (p2 != null && p2.size() != 0) {
                    f = ((SVG.o)((SVG$y0)svg$u0).p.get(0)).f(this);
                }
                else {
                    f = 0.0f;
                }
                final ArrayList q = ((SVG$y0)svg$u0).q;
                float e2;
                if (q != null && q.size() != 0) {
                    e2 = ((SVG.o)((SVG$y0)svg$u0).q.get(0)).e(this);
                }
                else {
                    e2 = 0.0f;
                }
                final ArrayList r = ((SVG$y0)svg$u0).r;
                float f2 = n2;
                if (r != null) {
                    if (r.size() == 0) {
                        f2 = n2;
                    }
                    else {
                        f2 = ((SVG.o)((SVG$y0)svg$u0).r.get(0)).f(this);
                    }
                }
                float n3 = e;
                if (this.d.a.z != SVG.Style.TextAnchor.Start) {
                    float d2 = this.d((SVG$w0)svg$u0);
                    if (this.d.a.z == SVG.Style.TextAnchor.Middle) {
                        d2 /= 2.0f;
                    }
                    n3 = e - d2;
                }
                if (((SVG$i0)svg$u0).h == null) {
                    final b.b$i b$i = new b.b$i(this, n3, f);
                    this.n((SVG$w0)svg$u0, (j)b$i);
                    final RectF c = b$i.c;
                    ((SVG$i0)svg$u0).h = new SVG.b(c.left, c.top, c.width(), b$i.c.height());
                }
                path = new Path();
                this.n((SVG$w0)svg$u0, (j)new b.b$g(n3 + e2, f + f2, path, this));
                final Matrix s = svg$u0.s;
                if (s != null) {
                    path.transform(s);
                }
                path.setFillType(this.w());
            }
            if (this.d.a.J != null) {
                final Path b2 = this.b(svg$i0, svg$i0.h);
                if (b2 != null) {
                    path.op(b2, Path$Op.INTERSECT);
                }
            }
            this.d = this.e.pop();
            return path;
        }
        this.d = this.e.pop();
        return null;
    }
    
    public final void E(final SVG.b b) {
        if (this.d.a.L != null) {
            final Paint paint = new Paint();
            paint.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
            this.a.saveLayer((RectF)null, paint, 31);
            final Paint paint2 = new Paint();
            paint2.setColorFilter((ColorFilter)new ColorMatrixColorFilter(new ColorMatrix(new float[] { 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2127f, 0.7151f, 0.0722f, 0.0f, 0.0f })));
            this.a.saveLayer((RectF)null, paint2, 31);
            final SVG$r svg$r = (SVG$r)this.c.g(this.d.a.L);
            this.L(svg$r, b);
            this.a.restore();
            final Paint paint3 = new Paint();
            paint3.setXfermode((Xfermode)new PorterDuffXfermode(PorterDuff$Mode.DST_IN));
            this.a.saveLayer((RectF)null, paint3, 31);
            this.L(svg$r, b);
            this.a.restore();
            this.a.restore();
        }
        this.O();
    }
    
    public final boolean F() {
        if (this.d.a.r >= 1.0f && this.d.a.L == null) {
            return false;
        }
        final Canvas a = this.a;
        final int n = (int)(this.d.a.r * 256.0f);
        int n2;
        if (n < 0) {
            n2 = 0;
        }
        else if ((n2 = n) > 255) {
            n2 = 255;
        }
        a.saveLayerAlpha((RectF)null, n2, 31);
        this.e.push(this.d);
        final h d = new h(this.d);
        this.d = d;
        final String l = d.a.L;
        if (l != null) {
            final SVG.SVG$j0 g = this.c.g(l);
            if (g == null || !(g instanceof SVG$r)) {
                o("Mask reference '%s' not found", this.d.a.L);
                this.d.a.L = null;
            }
        }
        return true;
    }
    
    public final void G(final SVG$d0 svg$d0, SVG.b f, SVG.b f2, final PreserveAspectRatio preserveAspectRatio) {
        if (f.c != 0.0f) {
            if (f.d != 0.0f) {
                PreserveAspectRatio preserveAspectRatio2;
                if ((preserveAspectRatio2 = preserveAspectRatio) == null) {
                    preserveAspectRatio2 = ((SVG$n0)svg$d0).o;
                    if (preserveAspectRatio2 == null) {
                        preserveAspectRatio2 = PreserveAspectRatio.d;
                    }
                }
                this.T(this.d, (SVG$j0)svg$d0);
                if (!this.k()) {
                    return;
                }
                final h d = this.d;
                d.f = f;
                if (!d.a.A) {
                    f = this.d.f;
                    this.M(f.a, f.b, f.c, f.d);
                }
                this.f((SVG$i0)svg$d0, this.d.f);
                if (f2 != null) {
                    this.a.concat(e(this.d.f, f2, preserveAspectRatio2));
                    this.d.g = ((SVG$p0)svg$d0).p;
                }
                else {
                    final Canvas a = this.a;
                    f2 = this.d.f;
                    a.translate(f2.a, f2.b);
                }
                final boolean f3 = this.F();
                this.U();
                this.I((SVG.h0)svg$d0, true);
                if (f3) {
                    this.E(((SVG$i0)svg$d0).h);
                }
                this.R((SVG$i0)svg$d0);
            }
        }
    }
    
    public final void H(SVG.l0 l0) {
        if (l0 instanceof SVG.s) {
            return;
        }
        this.P();
        if (l0 instanceof SVG$j0) {
            final Boolean d = ((SVG$j0)l0).d;
            if (d != null) {
                this.d.h = d;
            }
        }
        if (l0 instanceof SVG$d0) {
            final SVG$d0 svg$d0 = (SVG$d0)l0;
            this.G(svg$d0, this.C(svg$d0.q, svg$d0.r, svg$d0.s, svg$d0.t), ((SVG$p0)svg$d0).p, ((SVG$n0)svg$d0).o);
        }
        else {
            final boolean b = l0 instanceof SVG$b1;
            Bitmap decodeByteArray = null;
            int n = 0;
            final float n2 = 0.0f;
            float f = 0.0f;
            if (b) {
                final SVG$b1 svg$b1 = (SVG$b1)l0;
                final SVG.o s = svg$b1.s;
                if (s == null || !s.h()) {
                    final SVG.o t = svg$b1.t;
                    if (t == null || !t.h()) {
                        this.T(this.d, (SVG$j0)svg$b1);
                        if (this.k()) {
                            final SVG.SVG$j0 g = ((SVG.l0)svg$b1).a.g(svg$b1.p);
                            if (g == null) {
                                o("Use reference '%s' not found", svg$b1.p);
                            }
                            else {
                                final Matrix o = ((SVG$l)svg$b1).o;
                                if (o != null) {
                                    this.a.concat(o);
                                }
                                final SVG.o q = svg$b1.q;
                                float e;
                                if (q != null) {
                                    e = q.e(this);
                                }
                                else {
                                    e = 0.0f;
                                }
                                final SVG.o r = svg$b1.r;
                                float f2;
                                if (r != null) {
                                    f2 = r.f(this);
                                }
                                else {
                                    f2 = 0.0f;
                                }
                                this.a.translate(e, f2);
                                this.f((SVG$i0)svg$b1, ((SVG$i0)svg$b1).h);
                                final boolean f3 = this.F();
                                this.f.push((SVG.h0)svg$b1);
                                this.g.push(this.a.getMatrix());
                                if (g instanceof SVG$d0) {
                                    final SVG$d0 svg$d2 = (SVG$d0)g;
                                    final SVG.b c = this.C(null, null, svg$b1.s, svg$b1.t);
                                    this.P();
                                    this.G(svg$d2, c, ((SVG$p0)svg$d2).p, ((SVG$n0)svg$d2).o);
                                    this.O();
                                }
                                else if (g instanceof SVG$r0) {
                                    SVG.o s2 = svg$b1.s;
                                    if (s2 == null) {
                                        s2 = new SVG.o(100.0f, SVG.Unit.percent);
                                    }
                                    SVG.o t2 = svg$b1.t;
                                    if (t2 == null) {
                                        t2 = new SVG.o(100.0f, SVG.Unit.percent);
                                    }
                                    final SVG.b c2 = this.C(null, null, s2, t2);
                                    this.P();
                                    final SVG$r0 svg$r0 = (SVG$r0)g;
                                    if (c2.c != 0.0f) {
                                        if (c2.d != 0.0f) {
                                            PreserveAspectRatio preserveAspectRatio = ((SVG$n0)svg$r0).o;
                                            if (preserveAspectRatio == null) {
                                                preserveAspectRatio = PreserveAspectRatio.d;
                                            }
                                            this.T(this.d, (SVG$j0)svg$r0);
                                            final h d2 = this.d;
                                            d2.f = c2;
                                            if (!d2.a.A) {
                                                final SVG.b f4 = this.d.f;
                                                this.M(f4.a, f4.b, f4.c, f4.d);
                                            }
                                            final SVG.b p = ((SVG$p0)svg$r0).p;
                                            if (p != null) {
                                                this.a.concat(e(this.d.f, p, preserveAspectRatio));
                                                this.d.g = ((SVG$p0)svg$r0).p;
                                            }
                                            else {
                                                final Canvas a = this.a;
                                                final SVG.b f5 = this.d.f;
                                                a.translate(f5.a, f5.b);
                                            }
                                            final boolean f6 = this.F();
                                            this.I((SVG.h0)svg$r0, true);
                                            if (f6) {
                                                this.E(((SVG$i0)svg$r0).h);
                                            }
                                            this.R((SVG$i0)svg$r0);
                                        }
                                    }
                                    this.O();
                                }
                                else {
                                    this.H((SVG.l0)g);
                                }
                                this.f.pop();
                                this.g.pop();
                                if (f3) {
                                    this.E(((SVG$i0)svg$b1).h);
                                }
                                this.R((SVG$i0)svg$b1);
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$q0) {
                final Object o2 = l0;
                this.T(this.d, (SVG$j0)o2);
                if (this.k()) {
                    final Matrix o3 = ((SVG$l)o2).o;
                    if (o3 != null) {
                        this.a.concat(o3);
                    }
                    this.f((SVG$i0)o2, ((SVG$i0)o2).h);
                    final boolean f7 = this.F();
                    final String language = Locale.getDefault().getLanguage();
                    for (final SVG.l0 l2 : ((SVG.f0)o2).i) {
                        if (!(l2 instanceof SVG.e0)) {
                            continue;
                        }
                        final SVG.e0 e2 = (SVG.e0)l2;
                        if (e2.a() != null) {
                            continue;
                        }
                        final Set<String> e3 = e2.e();
                        if (e3 != null) {
                            if (e3.isEmpty()) {
                                continue;
                            }
                            if (!e3.contains(language)) {
                                continue;
                            }
                        }
                        final Set<String> g2 = e2.g();
                        if (g2 != null) {
                            if (com.caverock.androidsvg.b.h == null) {
                                synchronized (b.class) {
                                    (com.caverock.androidsvg.b.h = new HashSet<String>()).add("Structure");
                                    com.caverock.androidsvg.b.h.add("BasicStructure");
                                    com.caverock.androidsvg.b.h.add("ConditionalProcessing");
                                    com.caverock.androidsvg.b.h.add("Image");
                                    com.caverock.androidsvg.b.h.add("Style");
                                    com.caverock.androidsvg.b.h.add("ViewportAttribute");
                                    com.caverock.androidsvg.b.h.add("Shape");
                                    com.caverock.androidsvg.b.h.add("BasicText");
                                    com.caverock.androidsvg.b.h.add("PaintAttribute");
                                    com.caverock.androidsvg.b.h.add("BasicPaintAttribute");
                                    com.caverock.androidsvg.b.h.add("OpacityAttribute");
                                    com.caverock.androidsvg.b.h.add("BasicGraphicsAttribute");
                                    com.caverock.androidsvg.b.h.add("Marker");
                                    com.caverock.androidsvg.b.h.add("Gradient");
                                    com.caverock.androidsvg.b.h.add("Pattern");
                                    com.caverock.androidsvg.b.h.add("Clip");
                                    com.caverock.androidsvg.b.h.add("BasicClip");
                                    com.caverock.androidsvg.b.h.add("Mask");
                                    com.caverock.androidsvg.b.h.add("View");
                                }
                            }
                            if (g2.isEmpty()) {
                                continue;
                            }
                            if (!com.caverock.androidsvg.b.h.containsAll(g2)) {
                                continue;
                            }
                        }
                        final Set<String> d3 = e2.d();
                        if (d3 != null) {
                            d3.isEmpty();
                        }
                        else {
                            final Set<String> n3 = e2.n();
                            if (n3 == null) {
                                this.H(l2);
                                break;
                            }
                            n3.isEmpty();
                        }
                    }
                    if (f7) {
                        this.E(((SVG$i0)o2).h);
                    }
                    this.R((SVG$i0)o2);
                }
            }
            else if (l0 instanceof SVG$l) {
                final SVG$l svg$l = (SVG$l)l0;
                this.T(this.d, (SVG$j0)svg$l);
                if (this.k()) {
                    final Matrix o4 = svg$l.o;
                    if (o4 != null) {
                        this.a.concat(o4);
                    }
                    this.f((SVG$i0)svg$l, ((SVG$i0)svg$l).h);
                    final boolean f8 = this.F();
                    this.I((SVG.h0)svg$l, true);
                    if (f8) {
                        this.E(((SVG$i0)svg$l).h);
                    }
                    this.R((SVG$i0)svg$l);
                }
            }
            else if (l0 instanceof SVG$n) {
                final SVG$n svg$n = (SVG$n)l0;
                final SVG.o s3 = svg$n.s;
                if (s3 != null && !s3.h()) {
                    final SVG.o t3 = svg$n.t;
                    if (t3 != null) {
                        if (!t3.h()) {
                            final String p2 = svg$n.p;
                            if (p2 != null) {
                                l0 = (SVG.l0)((SVG$n0)svg$n).o;
                                if (l0 == null) {
                                    l0 = (SVG.l0)PreserveAspectRatio.d;
                                }
                                if (p2.startsWith("data:")) {
                                    if (p2.length() >= 14) {
                                        final int index = p2.indexOf(44);
                                        if (index >= 12) {
                                            if (";base64".equals(p2.substring(index - 7, index))) {
                                                try {
                                                    final byte[] decode = Base64.decode(p2.substring(index + 1), 0);
                                                    decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                                                }
                                                catch (final Exception ex) {
                                                    Log.e("SVGAndroidRenderer", "Could not decode bad Data URL", (Throwable)ex);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (decodeByteArray != null) {
                                    final SVG.b b2 = new SVG.b(0.0f, 0.0f, (float)decodeByteArray.getWidth(), (float)decodeByteArray.getHeight());
                                    this.T(this.d, (SVG$j0)svg$n);
                                    if (this.k()) {
                                        if (this.V()) {
                                            final Matrix u = svg$n.u;
                                            if (u != null) {
                                                this.a.concat(u);
                                            }
                                            final SVG.o q2 = svg$n.q;
                                            float e4;
                                            if (q2 != null) {
                                                e4 = q2.e(this);
                                            }
                                            else {
                                                e4 = 0.0f;
                                            }
                                            final SVG.o r2 = svg$n.r;
                                            float f9;
                                            if (r2 != null) {
                                                f9 = r2.f(this);
                                            }
                                            else {
                                                f9 = 0.0f;
                                            }
                                            final float e5 = svg$n.s.e(this);
                                            final float e6 = svg$n.t.e(this);
                                            final h d4 = this.d;
                                            d4.f = new SVG.b(e4, f9, e5, e6);
                                            if (!d4.a.A) {
                                                final SVG.b f10 = this.d.f;
                                                this.M(f10.a, f10.b, f10.c, f10.d);
                                            }
                                            ((SVG$i0)svg$n).h = this.d.f;
                                            this.R((SVG$i0)svg$n);
                                            this.f((SVG$i0)svg$n, ((SVG$i0)svg$n).h);
                                            final boolean f11 = this.F();
                                            this.U();
                                            this.a.save();
                                            this.a.concat(e(this.d.f, b2, (PreserveAspectRatio)l0));
                                            if (this.d.a.R != SVG.Style.RenderQuality.optimizeSpeed) {
                                                n = 2;
                                            }
                                            this.a.drawBitmap(decodeByteArray, 0.0f, 0.0f, new Paint(n));
                                            this.a.restore();
                                            if (f11) {
                                                this.E(((SVG$i0)svg$n).h);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$u) {
                final SVG$u svg$u = (SVG$u)l0;
                if (svg$u.o != null) {
                    this.T(this.d, (SVG$j0)svg$u);
                    if (this.k()) {
                        if (this.V()) {
                            final h d5 = this.d;
                            if (d5.c || d5.b) {
                                final Matrix n4 = ((SVG$k)svg$u).n;
                                if (n4 != null) {
                                    this.a.concat(n4);
                                }
                                final Path a2 = new b.b$d(svg$u.o).a;
                                if (((SVG$i0)svg$u).h == null) {
                                    ((SVG$i0)svg$u).h = c(a2);
                                }
                                this.R((SVG$i0)svg$u);
                                this.g((SVG$i0)svg$u);
                                this.f((SVG$i0)svg$u, ((SVG$i0)svg$u).h);
                                final boolean f12 = this.F();
                                final h d6 = this.d;
                                if (d6.b) {
                                    final SVG.Style.FillRule h = d6.a.h;
                                    Path$FillType fillType;
                                    if (h != null && h == SVG.Style.FillRule.EvenOdd) {
                                        fillType = Path$FillType.EVEN_ODD;
                                    }
                                    else {
                                        fillType = Path$FillType.WINDING;
                                    }
                                    a2.setFillType(fillType);
                                    this.l((SVG$i0)svg$u, a2);
                                }
                                if (this.d.c) {
                                    this.m(a2);
                                }
                                this.K((SVG$k)svg$u);
                                if (f12) {
                                    this.E(((SVG$i0)svg$u).h);
                                }
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$a0) {
                final SVG$a0 svg$a0 = (SVG$a0)l0;
                final SVG.o q3 = svg$a0.q;
                if (q3 != null && svg$a0.r != null && !q3.h()) {
                    if (!svg$a0.r.h()) {
                        this.T(this.d, (SVG$j0)svg$a0);
                        if (this.k()) {
                            if (this.V()) {
                                final Matrix n5 = ((SVG$k)svg$a0).n;
                                if (n5 != null) {
                                    this.a.concat(n5);
                                }
                                final Path b3 = this.B(svg$a0);
                                this.R((SVG$i0)svg$a0);
                                this.g((SVG$i0)svg$a0);
                                this.f((SVG$i0)svg$a0, ((SVG$i0)svg$a0).h);
                                final boolean f13 = this.F();
                                if (this.d.b) {
                                    this.l((SVG$i0)svg$a0, b3);
                                }
                                if (this.d.c) {
                                    this.m(b3);
                                }
                                if (f13) {
                                    this.E(((SVG$i0)svg$a0).h);
                                }
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$d) {
                final SVG$d svg$d3 = (SVG$d)l0;
                final SVG.o q4 = svg$d3.q;
                if (q4 != null) {
                    if (!q4.h()) {
                        this.T(this.d, (SVG$j0)svg$d3);
                        if (this.k()) {
                            if (this.V()) {
                                final Matrix n6 = ((SVG$k)svg$d3).n;
                                if (n6 != null) {
                                    this.a.concat(n6);
                                }
                                final Path y = this.y(svg$d3);
                                this.R((SVG$i0)svg$d3);
                                this.g((SVG$i0)svg$d3);
                                this.f((SVG$i0)svg$d3, ((SVG$i0)svg$d3).h);
                                final boolean f14 = this.F();
                                if (this.d.b) {
                                    this.l((SVG$i0)svg$d3, y);
                                }
                                if (this.d.c) {
                                    this.m(y);
                                }
                                if (f14) {
                                    this.E(((SVG$i0)svg$d3).h);
                                }
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$i) {
                final SVG$i svg$i = (SVG$i)l0;
                final SVG.o q5 = svg$i.q;
                if (q5 != null && svg$i.r != null && !q5.h()) {
                    if (!svg$i.r.h()) {
                        this.T(this.d, (SVG$j0)svg$i);
                        if (this.k()) {
                            if (this.V()) {
                                final Matrix n7 = ((SVG$k)svg$i).n;
                                if (n7 != null) {
                                    this.a.concat(n7);
                                }
                                final Path z = this.z(svg$i);
                                this.R((SVG$i0)svg$i);
                                this.g((SVG$i0)svg$i);
                                this.f((SVG$i0)svg$i, ((SVG$i0)svg$i).h);
                                final boolean f15 = this.F();
                                if (this.d.b) {
                                    this.l((SVG$i0)svg$i, z);
                                }
                                if (this.d.c) {
                                    this.m(z);
                                }
                                if (f15) {
                                    this.E(((SVG$i0)svg$i).h);
                                }
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$p) {
                final SVG$p svg$p = (SVG$p)l0;
                this.T(this.d, (SVG$j0)svg$p);
                if (this.k()) {
                    if (this.V()) {
                        if (this.d.c) {
                            final Matrix n8 = ((SVG$k)svg$p).n;
                            if (n8 != null) {
                                this.a.concat(n8);
                            }
                            final SVG.o o5 = svg$p.o;
                            float e7;
                            if (o5 == null) {
                                e7 = 0.0f;
                            }
                            else {
                                e7 = o5.e(this);
                            }
                            final SVG.o p3 = svg$p.p;
                            float f16;
                            if (p3 == null) {
                                f16 = 0.0f;
                            }
                            else {
                                f16 = p3.f(this);
                            }
                            final SVG.o q6 = svg$p.q;
                            float e8;
                            if (q6 == null) {
                                e8 = 0.0f;
                            }
                            else {
                                e8 = q6.e(this);
                            }
                            final SVG.o r3 = svg$p.r;
                            if (r3 != null) {
                                f = r3.f(this);
                            }
                            if (((SVG$i0)svg$p).h == null) {
                                ((SVG$i0)svg$p).h = new SVG.b(Math.min(e7, e8), Math.min(f16, f), Math.abs(e8 - e7), Math.abs(f - f16));
                            }
                            final Path path = new Path();
                            path.moveTo(e7, f16);
                            path.lineTo(e8, f);
                            this.R((SVG$i0)svg$p);
                            this.g((SVG$i0)svg$p);
                            this.f((SVG$i0)svg$p, ((SVG$i0)svg$p).h);
                            final boolean f17 = this.F();
                            this.m(path);
                            this.K((SVG$k)svg$p);
                            if (f17) {
                                this.E(((SVG$i0)svg$p).h);
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$z) {
                final SVG$z svg$z = (SVG$z)l0;
                this.T(this.d, (SVG$j0)svg$z);
                if (this.k()) {
                    if (this.V()) {
                        final h d7 = this.d;
                        if (d7.c || d7.b) {
                            final Matrix n9 = ((SVG$k)svg$z).n;
                            if (n9 != null) {
                                this.a.concat(n9);
                            }
                            if (((SVG$y)svg$z).o.length >= 2) {
                                final Path a3 = A((SVG$y)svg$z);
                                this.R((SVG$i0)svg$z);
                                this.g((SVG$i0)svg$z);
                                this.f((SVG$i0)svg$z, ((SVG$i0)svg$z).h);
                                final boolean f18 = this.F();
                                if (this.d.b) {
                                    this.l((SVG$i0)svg$z, a3);
                                }
                                if (this.d.c) {
                                    this.m(a3);
                                }
                                this.K((SVG$k)svg$z);
                                if (f18) {
                                    this.E(((SVG$i0)svg$z).h);
                                }
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$y) {
                final SVG$y svg$y = (SVG$y)l0;
                this.T(this.d, (SVG$j0)svg$y);
                if (this.k()) {
                    if (this.V()) {
                        final h d8 = this.d;
                        if (d8.c || d8.b) {
                            final Matrix n10 = ((SVG$k)svg$y).n;
                            if (n10 != null) {
                                this.a.concat(n10);
                            }
                            if (svg$y.o.length >= 2) {
                                final Path a4 = A(svg$y);
                                this.R((SVG$i0)svg$y);
                                final SVG.Style.FillRule h2 = this.d.a.h;
                                Path$FillType fillType2;
                                if (h2 != null && h2 == SVG.Style.FillRule.EvenOdd) {
                                    fillType2 = Path$FillType.EVEN_ODD;
                                }
                                else {
                                    fillType2 = Path$FillType.WINDING;
                                }
                                a4.setFillType(fillType2);
                                this.g((SVG$i0)svg$y);
                                this.f((SVG$i0)svg$y, ((SVG$i0)svg$y).h);
                                final boolean f19 = this.F();
                                if (this.d.b) {
                                    this.l((SVG$i0)svg$y, a4);
                                }
                                if (this.d.c) {
                                    this.m(a4);
                                }
                                this.K((SVG$k)svg$y);
                                if (f19) {
                                    this.E(((SVG$i0)svg$y).h);
                                }
                            }
                        }
                    }
                }
            }
            else if (l0 instanceof SVG$u0) {
                final SVG$u0 svg$u2 = (SVG$u0)l0;
                this.T(this.d, (SVG$j0)svg$u2);
                if (this.k()) {
                    final Matrix s4 = svg$u2.s;
                    if (s4 != null) {
                        this.a.concat(s4);
                    }
                    final ArrayList o6 = ((SVG$y0)svg$u2).o;
                    float e9;
                    if (o6 != null && o6.size() != 0) {
                        e9 = ((SVG.o)((SVG$y0)svg$u2).o.get(0)).e(this);
                    }
                    else {
                        e9 = 0.0f;
                    }
                    final ArrayList p4 = ((SVG$y0)svg$u2).p;
                    float f20;
                    if (p4 != null && p4.size() != 0) {
                        f20 = ((SVG.o)((SVG$y0)svg$u2).p.get(0)).f(this);
                    }
                    else {
                        f20 = 0.0f;
                    }
                    final ArrayList q7 = ((SVG$y0)svg$u2).q;
                    float e10;
                    if (q7 != null && q7.size() != 0) {
                        e10 = ((SVG.o)((SVG$y0)svg$u2).q.get(0)).e(this);
                    }
                    else {
                        e10 = 0.0f;
                    }
                    final ArrayList r4 = ((SVG$y0)svg$u2).r;
                    float f21 = n2;
                    if (r4 != null) {
                        if (r4.size() == 0) {
                            f21 = n2;
                        }
                        else {
                            f21 = ((SVG.o)((SVG$y0)svg$u2).r.get(0)).f(this);
                        }
                    }
                    final SVG.Style.TextAnchor v = this.v();
                    float n11 = e9;
                    if (v != SVG.Style.TextAnchor.Start) {
                        float d9 = this.d((SVG$w0)svg$u2);
                        if (v == SVG.Style.TextAnchor.Middle) {
                            d9 /= 2.0f;
                        }
                        n11 = e9 - d9;
                    }
                    if (((SVG$i0)svg$u2).h == null) {
                        final b.b$i b$i = new b.b$i(this, n11, f20);
                        this.n((SVG$w0)svg$u2, (j)b$i);
                        final RectF c3 = b$i.c;
                        ((SVG$i0)svg$u2).h = new SVG.b(c3.left, c3.top, c3.width(), b$i.c.height());
                    }
                    this.R((SVG$i0)svg$u2);
                    this.g((SVG$i0)svg$u2);
                    this.f((SVG$i0)svg$u2, ((SVG$i0)svg$u2).h);
                    final boolean f22 = this.F();
                    this.n((SVG$w0)svg$u2, (j)new b.b$f(this, n11 + e10, f20 + f21));
                    if (f22) {
                        this.E(((SVG$i0)svg$u2).h);
                    }
                }
            }
        }
        this.O();
    }
    
    public final void I(final SVG.h0 h0, final boolean b) {
        if (b) {
            this.f.push(h0);
            this.g.push(this.a.getMatrix());
        }
        final Iterator<SVG.l0> iterator = h0.h().iterator();
        while (iterator.hasNext()) {
            this.H(iterator.next());
        }
        if (b) {
            this.f.pop();
            this.g.pop();
        }
    }
    
    public final void J(final SVG$q svg$q, final c c) {
        this.P();
        final Float v = svg$q.v;
        final float n = 0.0f;
        float floatValue = 0.0f;
        Label_0080: {
            if (v != null) {
                if (!Float.isNaN(v)) {
                    floatValue = svg$q.v;
                    break Label_0080;
                }
                final float c2 = c.c;
                if (c2 != 0.0f || c.d != 0.0f) {
                    floatValue = (float)Math.toDegrees(Math.atan2(c.d, c2));
                    break Label_0080;
                }
            }
            floatValue = 0.0f;
        }
        float a;
        if (svg$q.q) {
            a = 1.0f;
        }
        else {
            a = this.d.a.l.a(this.b);
        }
        this.d = this.t((SVG.l0)svg$q);
        final Matrix matrix = new Matrix();
        matrix.preTranslate(c.a, c.b);
        matrix.preRotate(floatValue);
        matrix.preScale(a, a);
        final SVG.o r = svg$q.r;
        float e;
        if (r != null) {
            e = r.e(this);
        }
        else {
            e = 0.0f;
        }
        final SVG.o s = svg$q.s;
        float f;
        if (s != null) {
            f = s.f(this);
        }
        else {
            f = 0.0f;
        }
        final SVG.o t = svg$q.t;
        float f2 = 3.0f;
        float e2;
        if (t != null) {
            e2 = t.e(this);
        }
        else {
            e2 = 3.0f;
        }
        final SVG.o u = svg$q.u;
        if (u != null) {
            f2 = u.f(this);
        }
        final SVG.b p2 = ((SVG$p0)svg$q).p;
        if (p2 != null) {
            final float n2 = e2 / p2.c;
            final float n3 = f2 / p2.d;
            PreserveAspectRatio preserveAspectRatio = ((SVG$n0)svg$q).o;
            if (preserveAspectRatio == null) {
                preserveAspectRatio = PreserveAspectRatio.d;
            }
            float n4 = n3;
            float n5 = n2;
            if (!preserveAspectRatio.equals(PreserveAspectRatio.c)) {
                if (preserveAspectRatio.b == PreserveAspectRatio.Scale.slice) {
                    n5 = Math.max(n2, n3);
                }
                else {
                    n5 = Math.min(n2, n3);
                }
                n4 = n5;
            }
            matrix.preTranslate(-e * n5, -f * n4);
            this.a.concat(matrix);
            final SVG.b p3 = ((SVG$p0)svg$q).p;
            final float n6 = p3.c * n5;
            final float n7 = p3.d * n4;
            final int[] a2 = b$a.a;
            float n8 = 0.0f;
            Label_0479: {
                float n9 = 0.0f;
                switch (a2[preserveAspectRatio.a.ordinal()]) {
                    default: {
                        n8 = 0.0f;
                        break Label_0479;
                    }
                    case 4:
                    case 5:
                    case 6: {
                        n9 = e2 - n6;
                        break;
                    }
                    case 1:
                    case 2:
                    case 3: {
                        n9 = (e2 - n6) / 2.0f;
                        break;
                    }
                }
                n8 = 0.0f - n9;
            }
            final int n10 = a2[preserveAspectRatio.a.ordinal()];
            float n11 = 0.0f;
            Label_0562: {
                float n12 = 0.0f;
                Label_0556: {
                    Label_0547: {
                        if (n10 != 2) {
                            if (n10 != 3) {
                                if (n10 == 5) {
                                    break Label_0547;
                                }
                                if (n10 != 6) {
                                    if (n10 == 7) {
                                        break Label_0547;
                                    }
                                    if (n10 != 8) {
                                        n11 = n;
                                        break Label_0562;
                                    }
                                }
                            }
                            n12 = f2 - n7;
                            break Label_0556;
                        }
                    }
                    n12 = (f2 - n7) / 2.0f;
                }
                n11 = 0.0f - n12;
            }
            if (!this.d.a.A) {
                this.M(n8, n11, e2, f2);
            }
            matrix.reset();
            matrix.preScale(n5, n4);
            this.a.concat(matrix);
        }
        else {
            matrix.preTranslate(-e, -f);
            this.a.concat(matrix);
            if (!this.d.a.A) {
                this.M(0.0f, 0.0f, e2, f2);
            }
        }
        final boolean f3 = this.F();
        this.I((SVG.h0)svg$q, false);
        if (f3) {
            this.E(((SVG$i0)svg$q).h);
        }
        this.O();
    }
    
    public final void K(final SVG$k svg$k) {
        final SVG.Style a = this.d.a;
        final String c = a.C;
        if (c == null && a.D == null && a.E == null) {
            return;
        }
        SVG$q svg$q = null;
        Label_0095: {
            if (c != null) {
                final SVG.SVG$j0 g = ((SVG.l0)svg$k).a.g(c);
                if (g != null) {
                    svg$q = (SVG$q)g;
                    break Label_0095;
                }
                o("Marker reference '%s' not found", this.d.a.C);
            }
            svg$q = null;
        }
        final String d = this.d.a.D;
        SVG$q svg$q2 = null;
        Label_0164: {
            if (d != null) {
                final SVG.SVG$j0 g2 = ((SVG.l0)svg$k).a.g(d);
                if (g2 != null) {
                    svg$q2 = (SVG$q)g2;
                    break Label_0164;
                }
                o("Marker reference '%s' not found", this.d.a.D);
            }
            svg$q2 = null;
        }
        final String e = this.d.a.E;
        SVG$q svg$q3 = null;
        Label_0233: {
            if (e != null) {
                final SVG.SVG$j0 g3 = ((SVG.l0)svg$k).a.g(e);
                if (g3 != null) {
                    svg$q3 = (SVG$q)g3;
                    break Label_0233;
                }
                o("Marker reference '%s' not found", this.d.a.E);
            }
            svg$q3 = null;
        }
        ArrayList<c> a2;
        if (svg$k instanceof SVG$u) {
            a2 = new b.b$b(this, ((SVG$u)svg$k).o).a;
        }
        else if (svg$k instanceof SVG$p) {
            final SVG$p svg$p = (SVG$p)svg$k;
            final SVG.o o = svg$p.o;
            float e2;
            if (o != null) {
                e2 = o.e(this);
            }
            else {
                e2 = 0.0f;
            }
            final SVG.o p = svg$p.p;
            float f;
            if (p != null) {
                f = p.f(this);
            }
            else {
                f = 0.0f;
            }
            final SVG.o q = svg$p.q;
            float e3;
            if (q != null) {
                e3 = q.e(this);
            }
            else {
                e3 = 0.0f;
            }
            final SVG.o r = svg$p.r;
            float f2;
            if (r != null) {
                f2 = r.f(this);
            }
            else {
                f2 = 0.0f;
            }
            a2 = new ArrayList<c>(2);
            final float n = e3 - e2;
            final float n2 = f2 - f;
            a2.add(new c(e2, f, n, n2));
            a2.add(new c(e3, f2, n, n2));
        }
        else {
            final SVG$y svg$y = (SVG$y)svg$k;
            final int length = svg$y.o.length;
            if (length < 2) {
                a2 = null;
            }
            else {
                final ArrayList<c> list = new ArrayList<c>();
                final float[] o2 = svg$y.o;
                c c2 = new c(o2[0], o2[1], 0.0f, 0.0f);
                int i = 2;
                float n3 = 0.0f;
                float n4 = 0.0f;
                while (i < length) {
                    final float[] o3 = svg$y.o;
                    n3 = o3[i];
                    n4 = o3[i + 1];
                    c2.a(n3, n4);
                    list.add(c2);
                    c2 = new c(n3, n4, n3 - c2.a, n4 - c2.b);
                    i += 2;
                }
                if (svg$y instanceof SVG$z) {
                    final float[] o4 = svg$y.o;
                    final float n5 = o4[0];
                    if (n3 != n5) {
                        final float n6 = o4[1];
                        if (n4 != n6) {
                            c2.a(n5, n6);
                            list.add(c2);
                            final c c3 = new c(n5, n6, n5 - c2.a, n6 - c2.b);
                            c3.b(list.get(0));
                            list.add(c3);
                            list.set(0, c3);
                        }
                    }
                }
                else {
                    list.add(c2);
                }
                a2 = list;
            }
        }
        if (a2 == null) {
            return;
        }
        final int size = a2.size();
        if (size == 0) {
            return;
        }
        final SVG.Style a3 = this.d.a;
        a3.E = null;
        a3.D = null;
        a3.C = null;
        if (svg$q != null) {
            this.J(svg$q, (c)a2.get(0));
        }
        if (svg$q2 != null && a2.size() > 2) {
            c c4 = a2.get(0);
            c c5 = a2.get(1);
            int j = 1;
            while (j < size - 1) {
                ++j;
                final c c6 = a2.get(j);
                Label_0961: {
                    if (c5.e) {
                        final float c7 = c5.c;
                        final float d2 = c5.d;
                        final float a4 = c5.a;
                        final float a5 = c4.a;
                        final float b = c5.b;
                        float n7;
                        if ((n7 = (b - c4.b) * d2 + (a4 - a5) * c7) == 0.0f) {
                            n7 = (c6.a - a4) * c7 + (c6.b - b) * d2;
                        }
                        final float n8 = fcmpl(n7, 0.0f);
                        if (n8 <= 0) {
                            if (n8 == 0) {
                                if (c7 > 0.0f) {
                                    break Label_0961;
                                }
                                if (d2 >= 0.0f) {
                                    break Label_0961;
                                }
                            }
                            c5.c = -c7;
                            c5.d = -d2;
                        }
                    }
                }
                this.J(svg$q2, c5);
                c4 = c5;
                c5 = c6;
            }
        }
        if (svg$q3 != null) {
            this.J(svg$q3, (c)a2.get(size - 1));
        }
    }
    
    public final void L(final SVG$r svg$r, final SVG.b b) {
        final Boolean o = svg$r.o;
        final boolean b2 = true;
        float n2;
        float n3;
        if (o != null && o) {
            final SVG.o q = svg$r.q;
            float n;
            if (q != null) {
                n = q.e(this);
            }
            else {
                n = b.c;
            }
            final SVG.o r = svg$r.r;
            if (r != null) {
                final float f = r.f(this);
                n2 = n;
                n3 = f;
            }
            else {
                final float d = b.d;
                n2 = n;
                n3 = d;
            }
        }
        else {
            final SVG.o q2 = svg$r.q;
            float c = 1.2f;
            float c2;
            if (q2 != null) {
                c2 = q2.c(this, 1.0f);
            }
            else {
                c2 = 1.2f;
            }
            final SVG.o r2 = svg$r.r;
            if (r2 != null) {
                c = r2.c(this, 1.0f);
            }
            final float n4 = c2 * b.c;
            n3 = c * b.d;
            n2 = n4;
        }
        if (n2 != 0.0f) {
            if (n3 != 0.0f) {
                this.P();
                final h t = this.t((SVG.l0)svg$r);
                this.d = t;
                t.a.r = 1.0f;
                final boolean f2 = this.F();
                this.a.save();
                final Boolean p2 = svg$r.p;
                int n5 = b2 ? 1 : 0;
                if (p2 != null) {
                    if (p2) {
                        n5 = (b2 ? 1 : 0);
                    }
                    else {
                        n5 = 0;
                    }
                }
                if (n5 == 0) {
                    this.a.translate(b.a, b.b);
                    this.a.scale(b.c, b.d);
                }
                this.I((SVG.h0)svg$r, false);
                this.a.restore();
                if (f2) {
                    this.E(b);
                }
                this.O();
            }
        }
    }
    
    public final void M(final float n, final float n2, float n3, float n4) {
        final float n5 = n3 + n;
        final float n6 = n4 + n2;
        final SVG.c b = this.d.a.B;
        float n7 = n;
        float n8 = n2;
        n4 = n5;
        n3 = n6;
        if (b != null) {
            n7 = n + b.d.e(this);
            n8 = n2 + this.d.a.B.a.f(this);
            n4 = n5 - this.d.a.B.b.e(this);
            n3 = n6 - this.d.a.B.c.f(this);
        }
        this.a.clipRect(n7, n8, n4, n3);
    }
    
    public final void O() {
        this.a.restore();
        this.d = this.e.pop();
    }
    
    public final void P() {
        this.a.save();
        this.e.push(this.d);
        this.d = new h(this.d);
    }
    
    public final String Q(String s, final boolean b, final boolean b2) {
        if (this.d.h) {
            return s.replaceAll("[\\n\\t]", " ");
        }
        final String s2 = s = s.replaceAll("\\n", "").replaceAll("\\t", " ");
        if (b) {
            s = s2.replaceAll("^\\s+", "");
        }
        String replaceAll = s;
        if (b2) {
            replaceAll = s.replaceAll("\\s+$", "");
        }
        return replaceAll.replaceAll("\\s{2,}", " ");
    }
    
    public final void R(final SVG$i0 svg$i0) {
        if (((SVG.l0)svg$i0).b == null) {
            return;
        }
        if (svg$i0.h == null) {
            return;
        }
        final Matrix matrix = new Matrix();
        if (this.g.peek().invert(matrix)) {
            final float[] array = new float[8];
            final SVG.b h = svg$i0.h;
            final float a = h.a;
            array[0] = a;
            final float b = h.b;
            array[1] = b;
            final float n = h.c + a;
            int i = 2;
            array[2] = n;
            array[3] = b;
            array[4] = n;
            final float n2 = b + h.d;
            array[5] = n2;
            array[6] = a;
            array[7] = n2;
            matrix.preConcat(this.a.getMatrix());
            matrix.mapPoints(array);
            final float n3 = array[0];
            final float n4 = array[1];
            final RectF rectF = new RectF(n3, n4, n3, n4);
            while (i <= 6) {
                final float n5 = array[i];
                if (n5 < rectF.left) {
                    rectF.left = n5;
                }
                if (n5 > rectF.right) {
                    rectF.right = n5;
                }
                final float n6 = array[i + 1];
                if (n6 < rectF.top) {
                    rectF.top = n6;
                }
                if (n6 > rectF.bottom) {
                    rectF.bottom = n6;
                }
                i += 2;
            }
            final SVG$i0 svg$i2 = (SVG$i0)this.f.peek();
            final SVG.b h2 = svg$i2.h;
            if (h2 == null) {
                final float left = rectF.left;
                final float top = rectF.top;
                svg$i2.h = new SVG.b(left, top, rectF.right - left, rectF.bottom - top);
            }
            else {
                final float left2 = rectF.left;
                final float top2 = rectF.top;
                final SVG.b b2 = new SVG.b(left2, top2, rectF.right - left2, rectF.bottom - top2);
                final float a2 = b2.a;
                if (a2 < h2.a) {
                    h2.a = a2;
                }
                final float b3 = b2.b;
                if (b3 < h2.b) {
                    h2.b = b3;
                }
                final float n7 = b2.a + b2.c;
                final float a3 = h2.a;
                if (n7 > h2.c + a3) {
                    h2.c = n7 - a3;
                }
                final float n8 = b2.b + b2.d;
                final float b4 = h2.b;
                if (n8 > h2.d + b4) {
                    h2.d = n8 - b4;
                }
            }
        }
    }
    
    public final void S(final h h, final SVG.Style style) {
        if (x(style, 4096L)) {
            h.a.s = style.s;
        }
        if (x(style, 2048L)) {
            h.a.r = style.r;
        }
        final boolean x = x(style, 1L);
        final boolean b = false;
        if (x) {
            h.a.g = style.g;
            final SVG.m0 g = style.g;
            h.b = (g != null && g != SVG$f.h);
        }
        if (x(style, 4L)) {
            h.a.i = style.i;
        }
        if (x(style, 6149L)) {
            N(h, true, h.a.g);
        }
        if (x(style, 2L)) {
            h.a.h = style.h;
        }
        if (x(style, 8L)) {
            h.a.j = style.j;
            final SVG.m0 j = style.j;
            h.c = (j != null && j != SVG$f.h);
        }
        if (x(style, 16L)) {
            h.a.k = style.k;
        }
        if (x(style, 6168L)) {
            N(h, false, h.a.j);
        }
        if (x(style, 34359738368L)) {
            h.a.Q = style.Q;
        }
        if (x(style, 32L)) {
            final SVG.Style a = h.a;
            final SVG.o l = style.l;
            a.l = l;
            h.e.setStrokeWidth(l.b(this));
        }
        if (x(style, 64L)) {
            h.a.m = style.m;
            final int n = b$a.b[style.m.ordinal()];
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        h.e.setStrokeCap(Paint$Cap.SQUARE);
                    }
                }
                else {
                    h.e.setStrokeCap(Paint$Cap.ROUND);
                }
            }
            else {
                h.e.setStrokeCap(Paint$Cap.BUTT);
            }
        }
        if (x(style, 128L)) {
            h.a.n = style.n;
            final int n2 = b$a.c[style.n.ordinal()];
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        h.e.setStrokeJoin(Paint$Join.BEVEL);
                    }
                }
                else {
                    h.e.setStrokeJoin(Paint$Join.ROUND);
                }
            }
            else {
                h.e.setStrokeJoin(Paint$Join.MITER);
            }
        }
        if (x(style, 256L)) {
            h.a.o = style.o;
            h.e.setStrokeMiter((float)style.o);
        }
        if (x(style, 512L)) {
            h.a.p = style.p;
        }
        if (x(style, 1024L)) {
            h.a.q = style.q;
        }
        final boolean x2 = x(style, 1536L);
        final Typeface typeface = null;
        final Typeface typeface2 = null;
        if (x2) {
            final SVG.o[] p2 = h.a.p;
            if (p2 == null) {
                h.e.setPathEffect((PathEffect)null);
            }
            else {
                final int length = p2.length;
                int n3;
                if (length % 2 == 0) {
                    n3 = length;
                }
                else {
                    n3 = length * 2;
                }
                final float[] array = new float[n3];
                int i = 0;
                float n4 = 0.0f;
                while (i < n3) {
                    final float b2 = h.a.p[i % length].b(this);
                    array[i] = b2;
                    n4 += b2;
                    ++i;
                }
                if (n4 == 0.0f) {
                    h.e.setPathEffect((PathEffect)null);
                }
                else {
                    float b3;
                    final float n5 = b3 = h.a.q.b(this);
                    if (n5 < 0.0f) {
                        b3 = n5 % n4 + n4;
                    }
                    h.e.setPathEffect((PathEffect)new DashPathEffect(array, b3));
                }
            }
        }
        if (x(style, 16384L)) {
            final float textSize = this.d.d.getTextSize();
            h.a.u = style.u;
            h.d.setTextSize(style.u.c(this, textSize));
            h.e.setTextSize(style.u.c(this, textSize));
        }
        if (x(style, 8192L)) {
            h.a.t = style.t;
        }
        if (x(style, 32768L)) {
            if (style.v == -1 && h.a.v > 100) {
                final SVG.Style a2 = h.a;
                a2.v -= 100;
            }
            else if (style.v == 1 && h.a.v < 900) {
                final SVG.Style a3 = h.a;
                a3.v += 100;
            }
            else {
                h.a.v = style.v;
            }
        }
        if (x(style, 65536L)) {
            h.a.w = style.w;
        }
        if (x(style, 106496L)) {
            final List<String> t = h.a.t;
            Typeface typeface3 = typeface;
            if (t != null) {
                typeface3 = typeface;
                if (this.c != null) {
                    final Iterator<String> iterator = t.iterator();
                    typeface3 = typeface2;
                    while (iterator.hasNext()) {
                        final String s = iterator.next();
                        final SVG.Style a4 = h.a;
                        final Typeface h2 = h(s, a4.v, a4.w);
                        if ((typeface3 = h2) != null) {
                            typeface3 = h2;
                            break;
                        }
                    }
                }
            }
            Typeface h3;
            if ((h3 = typeface3) == null) {
                final SVG.Style a5 = h.a;
                h3 = h("serif", a5.v, a5.w);
            }
            h.d.setTypeface(h3);
            h.e.setTypeface(h3);
        }
        if (x(style, 131072L)) {
            h.a.x = style.x;
            final Paint d = h.d;
            final SVG.Style.TextDecoration x3 = style.x;
            final SVG.Style.TextDecoration lineThrough = SVG.Style.TextDecoration.LineThrough;
            d.setStrikeThruText(x3 == lineThrough);
            final Paint d2 = h.d;
            final SVG.Style.TextDecoration x4 = style.x;
            final SVG.Style.TextDecoration underline = SVG.Style.TextDecoration.Underline;
            d2.setUnderlineText(x4 == underline);
            h.e.setStrikeThruText(style.x == lineThrough);
            final Paint e = h.e;
            boolean underlineText = b;
            if (style.x == underline) {
                underlineText = true;
            }
            e.setUnderlineText(underlineText);
        }
        if (x(style, 68719476736L)) {
            h.a.y = style.y;
        }
        if (x(style, 262144L)) {
            h.a.z = style.z;
        }
        if (x(style, 524288L)) {
            h.a.A = style.A;
        }
        if (x(style, 2097152L)) {
            h.a.C = style.C;
        }
        if (x(style, 4194304L)) {
            h.a.D = style.D;
        }
        if (x(style, 8388608L)) {
            h.a.E = style.E;
        }
        if (x(style, 16777216L)) {
            h.a.F = style.F;
        }
        if (x(style, 33554432L)) {
            h.a.G = style.G;
        }
        if (x(style, 1048576L)) {
            h.a.B = style.B;
        }
        if (x(style, 268435456L)) {
            h.a.J = style.J;
        }
        if (x(style, 536870912L)) {
            h.a.K = style.K;
        }
        if (x(style, 1073741824L)) {
            h.a.L = style.L;
        }
        if (x(style, 67108864L)) {
            h.a.H = style.H;
        }
        if (x(style, 134217728L)) {
            h.a.I = style.I;
        }
        if (x(style, 8589934592L)) {
            h.a.O = style.O;
        }
        if (x(style, 17179869184L)) {
            h.a.P = style.P;
        }
        if (x(style, 137438953472L)) {
            h.a.R = style.R;
        }
    }
    
    public final void T(final h h, final SVG$j0 svg$j0) {
        final SVG.h0 b = ((SVG.l0)svg$j0).b;
        final int n = 0;
        final boolean b2 = b == null;
        final SVG.Style a = h.a;
        Boolean b3 = Boolean.TRUE;
        a.F = b3;
        if (!b2) {
            b3 = Boolean.FALSE;
        }
        a.A = b3;
        a.B = null;
        a.J = null;
        a.r = 1.0f;
        a.H = (SVG.m0)SVG$f.g;
        a.I = 1.0f;
        a.L = null;
        a.M = null;
        a.N = 1.0f;
        a.O = null;
        a.P = 1.0f;
        a.Q = SVG.Style.VectorEffect.None;
        final SVG.Style e = svg$j0.e;
        if (e != null) {
            this.S(h, e);
        }
        final ArrayList a2 = this.c.c.a;
        int n2 = 0;
        Label_0188: {
            if (a2 != null) {
                n2 = n;
                if (!a2.isEmpty()) {
                    break Label_0188;
                }
            }
            n2 = 1;
        }
        if ((n2 ^ 0x1) != 0x0) {
            for (final CSSParser.l l : this.c.c.a) {
                if (CSSParser.g(l.a, svg$j0)) {
                    this.S(h, l.b);
                }
            }
        }
        final SVG.Style f = svg$j0.f;
        if (f != null) {
            this.S(h, f);
        }
    }
    
    public final void U() {
        final SVG.Style a = this.d.a;
        final SVG.m0 o = a.O;
        int n;
        if (o instanceof SVG$f) {
            n = ((SVG$f)o).f;
        }
        else {
            if (!(o instanceof SVG$g)) {
                return;
            }
            n = a.s.f;
        }
        final Float p = a.P;
        int i = n;
        if (p != null) {
            i = i(p, n);
        }
        this.a.drawColor(i);
    }
    
    public final boolean V() {
        final Boolean g = this.d.a.G;
        return g == null || g;
    }
    
    public final Path b(final SVG$i0 svg$i0, final SVG.b b) {
        final SVG.SVG$j0 g = ((SVG.l0)svg$i0).a.g(this.d.a.J);
        boolean b2 = false;
        if (g == null) {
            o("ClipPath reference '%s' not found", this.d.a.J);
            return null;
        }
        final SVG$e svg$e = (SVG$e)g;
        this.e.push(this.d);
        this.d = this.t((SVG.l0)svg$e);
        final Boolean p2 = svg$e.p;
        if (p2 == null || p2) {
            b2 = true;
        }
        final Matrix matrix = new Matrix();
        if (!b2) {
            matrix.preTranslate(b.a, b.b);
            matrix.preScale(b.c, b.d);
        }
        final Matrix o = ((SVG$l)svg$e).o;
        if (o != null) {
            matrix.preConcat(o);
        }
        final Path path = new Path();
        for (final SVG.l0 l0 : ((SVG.f0)svg$e).i) {
            if (!(l0 instanceof SVG$i0)) {
                continue;
            }
            final Path d = this.D((SVG$i0)l0, true);
            if (d == null) {
                continue;
            }
            path.op(d, Path$Op.UNION);
        }
        if (this.d.a.J != null) {
            if (((SVG$i0)svg$e).h == null) {
                ((SVG$i0)svg$e).h = c(path);
            }
            final Path b3 = this.b((SVG$i0)svg$e, ((SVG$i0)svg$e).h);
            if (b3 != null) {
                path.op(b3, Path$Op.INTERSECT);
            }
        }
        path.transform(matrix);
        this.d = this.e.pop();
        return path;
    }
    
    public final float d(final SVG$w0 svg$w0) {
        final b.b$k b$k = new b.b$k(this);
        this.n(svg$w0, (j)b$k);
        return b$k.a;
    }
    
    public final void f(final SVG$i0 svg$i0, final SVG.b b) {
        if (this.d.a.J == null) {
            return;
        }
        final Path b2 = this.b(svg$i0, b);
        if (b2 != null) {
            this.a.clipPath(b2);
        }
    }
    
    public final void g(final SVG$i0 svg$i0) {
        final SVG.m0 g = this.d.a.g;
        if (g instanceof SVG$t) {
            this.j(true, svg$i0.h, (SVG$t)g);
        }
        final SVG.m0 j = this.d.a.j;
        if (j instanceof SVG$t) {
            this.j(false, svg$i0.h, (SVG$t)j);
        }
    }
    
    public final void j(final boolean b, final SVG.b b2, final SVG$t svg$t) {
        final SVG.SVG$j0 g = this.c.g(svg$t.f);
        boolean c = true;
        final boolean b3 = true;
        final int n = 0;
        final int n2 = 0;
        if (g == null) {
            String s;
            if (b) {
                s = "Fill";
            }
            else {
                s = "Stroke";
            }
            o("%s reference '%s' not found", s, svg$t.f);
            final SVG.m0 g2 = svg$t.g;
            if (g2 != null) {
                N(this.d, b, g2);
            }
            else if (b) {
                this.d.b = false;
            }
            else {
                this.d.c = false;
            }
            return;
        }
        if (g instanceof SVG.k0) {
            final SVG.k0 k0 = (SVG.k0)g;
            final String l = k0.l;
            if (l != null) {
                q(k0, l);
            }
            final Boolean i = k0.i;
            final boolean b4 = i != null && i;
            final h d = this.d;
            Paint paint;
            if (b) {
                paint = d.d;
            }
            else {
                paint = d.e;
            }
            float n4;
            float n7;
            float n8;
            float n9;
            if (b4) {
                SVG.b b5 = d.g;
                if (b5 == null) {
                    b5 = d.f;
                }
                final SVG.o m = k0.m;
                float e;
                if (m != null) {
                    e = m.e(this);
                }
                else {
                    e = 0.0f;
                }
                final SVG.o n3 = k0.n;
                float f;
                if (n3 != null) {
                    f = n3.f(this);
                }
                else {
                    f = 0.0f;
                }
                final SVG.o o = k0.o;
                if (o != null) {
                    n4 = o.e(this);
                }
                else {
                    n4 = b5.c;
                }
                final SVG.o p3 = k0.p;
                float f2;
                if (p3 != null) {
                    f2 = p3.f(this);
                }
                else {
                    f2 = 0.0f;
                }
                final float n5 = e;
                final float n6 = f;
                n7 = f2;
                n8 = n5;
                n9 = n6;
            }
            else {
                final SVG.o j = k0.m;
                float c2;
                if (j != null) {
                    c2 = j.c(this, 1.0f);
                }
                else {
                    c2 = 0.0f;
                }
                final SVG.o n10 = k0.n;
                float c3;
                if (n10 != null) {
                    c3 = n10.c(this, 1.0f);
                }
                else {
                    c3 = 0.0f;
                }
                final SVG.o o2 = k0.o;
                float c4;
                if (o2 != null) {
                    c4 = o2.c(this, 1.0f);
                }
                else {
                    c4 = 1.0f;
                }
                final SVG.o p4 = k0.p;
                float c5;
                if (p4 != null) {
                    c5 = p4.c(this, 1.0f);
                }
                else {
                    c5 = 0.0f;
                }
                n7 = c5;
                n4 = c4;
                n9 = c3;
                n8 = c2;
            }
            this.P();
            this.d = this.t((SVG.l0)k0);
            final Matrix localMatrix = new Matrix();
            if (!b4) {
                localMatrix.preTranslate(b2.a, b2.b);
                localMatrix.preScale(b2.c, b2.d);
            }
            final Matrix j2 = k0.j;
            if (j2 != null) {
                localMatrix.preConcat(j2);
            }
            final int size = k0.h.size();
            if (size == 0) {
                this.O();
                if (b) {
                    this.d.b = false;
                }
                else {
                    this.d.c = false;
                }
            }
            else {
                final int[] array = new int[size];
                final float[] array2 = new float[size];
                final Iterator iterator = k0.h.iterator();
                int n11 = 0;
                float n12 = -1.0f;
                while (iterator.hasNext()) {
                    final SVG$c0 svg$c0 = (SVG$c0)iterator.next();
                    final Float h = svg$c0.h;
                    float floatValue;
                    if (h != null) {
                        floatValue = h;
                    }
                    else {
                        floatValue = 0.0f;
                    }
                    if (n11 != 0 && floatValue < n12) {
                        array2[n11] = n12;
                        floatValue = n12;
                    }
                    else {
                        array2[n11] = floatValue;
                    }
                    this.P();
                    this.T(this.d, (SVG$j0)svg$c0);
                    final SVG.Style a = this.d.a;
                    SVG$f g3;
                    if ((g3 = (SVG$f)a.H) == null) {
                        g3 = SVG$f.g;
                    }
                    array[n11] = i(a.I, g3.f);
                    ++n11;
                    this.O();
                    n12 = floatValue;
                }
                if ((n8 == n4 && n9 == n7) || size == 1) {
                    this.O();
                    paint.setColor(array[size - 1]);
                }
                else {
                    final Shader$TileMode clamp = Shader$TileMode.CLAMP;
                    final SVG.GradientSpread k2 = k0.k;
                    Shader$TileMode shader$TileMode = clamp;
                    if (k2 != null) {
                        if (k2 == SVG.GradientSpread.reflect) {
                            shader$TileMode = Shader$TileMode.MIRROR;
                        }
                        else {
                            shader$TileMode = clamp;
                            if (k2 == SVG.GradientSpread.repeat) {
                                shader$TileMode = Shader$TileMode.REPEAT;
                            }
                        }
                    }
                    this.O();
                    final LinearGradient shader = new LinearGradient(n8, n9, n4, n7, array, array2, shader$TileMode);
                    ((Shader)shader).setLocalMatrix(localMatrix);
                    paint.setShader((Shader)shader);
                    int alpha = (int)(this.d.a.i * 256.0f);
                    if (alpha < 0) {
                        alpha = n2;
                    }
                    else if (alpha > 255) {
                        alpha = 255;
                    }
                    paint.setAlpha(alpha);
                }
            }
        }
        else if (g instanceof SVG.o0) {
            final SVG.o0 o3 = (SVG.o0)g;
            final String l2 = o3.l;
            if (l2 != null) {
                q(o3, l2);
            }
            final Boolean i2 = o3.i;
            final boolean b6 = i2 != null && i2;
            final h d2 = this.d;
            Paint paint2;
            if (b) {
                paint2 = d2.d;
            }
            else {
                paint2 = d2.e;
            }
            float n15;
            float n16;
            float n17;
            if (b6) {
                final SVG.o o4 = new SVG.o(50.0f, SVG.Unit.percent);
                final SVG.o m2 = o3.m;
                float n13;
                if (m2 != null) {
                    n13 = m2.e(this);
                }
                else {
                    n13 = o4.e(this);
                }
                final SVG.o n14 = o3.n;
                if (n14 != null) {
                    n15 = n14.f(this);
                }
                else {
                    n15 = o4.f(this);
                }
                final SVG.o o5 = o3.o;
                if (o5 != null) {
                    n16 = o5.b(this);
                }
                else {
                    n16 = o4.b(this);
                }
                n17 = n13;
            }
            else {
                final SVG.o m3 = o3.m;
                float c6;
                if (m3 != null) {
                    c6 = m3.c(this, 1.0f);
                }
                else {
                    c6 = 0.5f;
                }
                final SVG.o n18 = o3.n;
                if (n18 != null) {
                    n15 = n18.c(this, 1.0f);
                }
                else {
                    n15 = 0.5f;
                }
                final SVG.o o6 = o3.o;
                if (o6 != null) {
                    n16 = o6.c(this, 1.0f);
                }
                else {
                    n16 = 0.5f;
                }
                n17 = c6;
            }
            this.P();
            this.d = this.t((SVG.l0)o3);
            final Matrix localMatrix2 = new Matrix();
            if (!b6) {
                localMatrix2.preTranslate(b2.a, b2.b);
                localMatrix2.preScale(b2.c, b2.d);
            }
            final Matrix j3 = o3.j;
            if (j3 != null) {
                localMatrix2.preConcat(j3);
            }
            final int size2 = o3.h.size();
            if (size2 == 0) {
                this.O();
                if (b) {
                    this.d.b = false;
                }
                else {
                    this.d.c = false;
                }
            }
            else {
                final int[] array3 = new int[size2];
                final float[] array4 = new float[size2];
                final Iterator iterator2 = o3.h.iterator();
                int n19 = 0;
                float n20 = -1.0f;
                while (iterator2.hasNext()) {
                    final SVG$c0 svg$c2 = (SVG$c0)iterator2.next();
                    final Float h2 = svg$c2.h;
                    float floatValue2;
                    if (h2 != null) {
                        floatValue2 = h2;
                    }
                    else {
                        floatValue2 = 0.0f;
                    }
                    if (n19 != 0 && floatValue2 < n20) {
                        array4[n19] = n20;
                    }
                    else {
                        array4[n19] = floatValue2;
                        n20 = floatValue2;
                    }
                    this.P();
                    this.T(this.d, (SVG$j0)svg$c2);
                    final SVG.Style a2 = this.d.a;
                    SVG$f g4;
                    if ((g4 = (SVG$f)a2.H) == null) {
                        g4 = SVG$f.g;
                    }
                    array3[n19] = i(a2.I, g4.f);
                    ++n19;
                    this.O();
                }
                if (n16 != 0.0f && size2 != 1) {
                    final Shader$TileMode clamp2 = Shader$TileMode.CLAMP;
                    final SVG.GradientSpread k3 = o3.k;
                    Shader$TileMode shader$TileMode2 = clamp2;
                    if (k3 != null) {
                        if (k3 == SVG.GradientSpread.reflect) {
                            shader$TileMode2 = Shader$TileMode.MIRROR;
                        }
                        else {
                            shader$TileMode2 = clamp2;
                            if (k3 == SVG.GradientSpread.repeat) {
                                shader$TileMode2 = Shader$TileMode.REPEAT;
                            }
                        }
                    }
                    this.O();
                    final RadialGradient shader2 = new RadialGradient(n17, n15, n16, array3, array4, shader$TileMode2);
                    ((Shader)shader2).setLocalMatrix(localMatrix2);
                    paint2.setShader((Shader)shader2);
                    int alpha2 = (int)(this.d.a.i * 256.0f);
                    if (alpha2 < 0) {
                        alpha2 = n;
                    }
                    else if (alpha2 > 255) {
                        alpha2 = 255;
                    }
                    paint2.setAlpha(alpha2);
                }
                else {
                    this.O();
                    paint2.setColor(array3[size2 - 1]);
                }
            }
        }
        else if (g instanceof SVG$b0) {
            final SVG$b0 svg$b0 = (SVG$b0)g;
            if (b) {
                if (x(((SVG$j0)svg$b0).e, 2147483648L)) {
                    final h d3 = this.d;
                    final SVG.Style a3 = d3.a;
                    final SVG.m0 m4 = ((SVG$j0)svg$b0).e.M;
                    a3.g = m4;
                    d3.b = (m4 != null && b3);
                }
                if (x(((SVG$j0)svg$b0).e, 4294967296L)) {
                    this.d.a.i = ((SVG$j0)svg$b0).e.N;
                }
                if (x(((SVG$j0)svg$b0).e, 6442450944L)) {
                    final h d4 = this.d;
                    N(d4, b, d4.a.g);
                }
            }
            else {
                if (x(((SVG$j0)svg$b0).e, 2147483648L)) {
                    final h d5 = this.d;
                    if ((d5.a.j = ((SVG$j0)svg$b0).e.M) == null) {
                        c = false;
                    }
                    d5.c = c;
                }
                if (x(((SVG$j0)svg$b0).e, 4294967296L)) {
                    this.d.a.k = ((SVG$j0)svg$b0).e.N;
                }
                if (x(((SVG$j0)svg$b0).e, 6442450944L)) {
                    final h d6 = this.d;
                    N(d6, b, d6.a.j);
                }
            }
        }
    }
    
    public final boolean k() {
        final Boolean f = this.d.a.F;
        return f == null || f;
    }
    
    public final void l(final SVG$i0 svg$i0, final Path path) {
        final SVG.m0 g = this.d.a.g;
        if (g instanceof SVG$t) {
            final SVG.SVG$j0 g2 = this.c.g(((SVG$t)g).f);
            if (g2 instanceof SVG$x) {
                final SVG$x svg$x = (SVG$x)g2;
                final Boolean q = svg$x.q;
                final boolean b = q != null && q;
                final String x = svg$x.x;
                if (x != null) {
                    s(svg$x, x);
                }
                float f;
                float e2;
                float n;
                float n2;
                if (b) {
                    final SVG.o t = svg$x.t;
                    float e;
                    if (t != null) {
                        e = t.e(this);
                    }
                    else {
                        e = 0.0f;
                    }
                    final SVG.o u = svg$x.u;
                    if (u != null) {
                        f = u.f(this);
                    }
                    else {
                        f = 0.0f;
                    }
                    final SVG.o v = svg$x.v;
                    if (v != null) {
                        e2 = v.e(this);
                    }
                    else {
                        e2 = 0.0f;
                    }
                    final SVG.o w = svg$x.w;
                    if (w != null) {
                        final float f2 = w.f(this);
                        n = e;
                        n2 = f2;
                    }
                    else {
                        final float n3 = 0.0f;
                        n = e;
                        n2 = n3;
                    }
                }
                else {
                    final SVG.o t2 = svg$x.t;
                    float c;
                    if (t2 != null) {
                        c = t2.c(this, 1.0f);
                    }
                    else {
                        c = 0.0f;
                    }
                    final SVG.o u2 = svg$x.u;
                    float c2;
                    if (u2 != null) {
                        c2 = u2.c(this, 1.0f);
                    }
                    else {
                        c2 = 0.0f;
                    }
                    final SVG.o v2 = svg$x.v;
                    float c3;
                    if (v2 != null) {
                        c3 = v2.c(this, 1.0f);
                    }
                    else {
                        c3 = 0.0f;
                    }
                    final SVG.o w2 = svg$x.w;
                    float c4;
                    if (w2 != null) {
                        c4 = w2.c(this, 1.0f);
                    }
                    else {
                        c4 = 0.0f;
                    }
                    final SVG.b h = svg$i0.h;
                    final float a = h.a;
                    final float c5 = h.c;
                    final float n4 = c * c5 + a;
                    final float b2 = h.b;
                    final float d = h.d;
                    final float n5 = c4 * d;
                    final float n6 = c2 * d + b2;
                    final float n7 = c3 * c5;
                    n2 = n5;
                    e2 = n7;
                    f = n6;
                    n = n4;
                }
                if (e2 != 0.0f) {
                    if (n2 != 0.0f) {
                        PreserveAspectRatio preserveAspectRatio = ((SVG$n0)svg$x).o;
                        if (preserveAspectRatio == null) {
                            preserveAspectRatio = PreserveAspectRatio.d;
                        }
                        this.P();
                        this.a.clipPath(path);
                        final h d2 = new h();
                        this.S(d2, SVG.Style.a());
                        d2.a.A = Boolean.FALSE;
                        this.u((SVG.l0)svg$x, d2);
                        this.d = d2;
                        final SVG.b h2 = svg$i0.h;
                        final Matrix s = svg$x.s;
                        Object o = h2;
                        if (s != null) {
                            this.a.concat(s);
                            final Matrix matrix = new Matrix();
                            o = h2;
                            if (svg$x.s.invert(matrix)) {
                                final float[] array = new float[8];
                                final SVG.b h3 = svg$i0.h;
                                final float a2 = h3.a;
                                array[0] = a2;
                                final float b3 = h3.b;
                                array[1] = b3;
                                final float n8 = h3.c + a2;
                                array[2] = n8;
                                array[3] = b3;
                                array[4] = n8;
                                final float n9 = b3 + h3.d;
                                array[5] = n9;
                                array[6] = a2;
                                array[7] = n9;
                                matrix.mapPoints(array);
                                final float n10 = array[0];
                                final float n11 = array[1];
                                final RectF rectF = new RectF(n10, n11, n10, n11);
                                for (int i = 2; i <= 6; i += 2) {
                                    final float n12 = array[i];
                                    if (n12 < rectF.left) {
                                        rectF.left = n12;
                                    }
                                    if (n12 > rectF.right) {
                                        rectF.right = n12;
                                    }
                                    final float n13 = array[i + 1];
                                    if (n13 < rectF.top) {
                                        rectF.top = n13;
                                    }
                                    if (n13 > rectF.bottom) {
                                        rectF.bottom = n13;
                                    }
                                }
                                final float left = rectF.left;
                                final float top = rectF.top;
                                o = new SVG.b(left, top, rectF.right - left, rectF.bottom - top);
                            }
                        }
                        final float n14 = (float)Math.floor((((SVG.b)o).a - n) / e2) * e2 + n;
                        float b4 = (float)Math.floor((((SVG.b)o).b - f) / n2) * n2 + f;
                        final float a3 = ((SVG.b)o).a;
                        final float c6 = ((SVG.b)o).c;
                        final float b5 = ((SVG.b)o).b;
                        final float d3 = ((SVG.b)o).d;
                        final SVG.b b6 = new SVG.b(0.0f, 0.0f, e2, n2);
                        final boolean f3 = this.F();
                        final float n15 = n14;
                        while (b4 < b5 + d3) {
                            for (float a4 = n15; a4 < a3 + c6; a4 += e2) {
                                b6.a = a4;
                                b6.b = b4;
                                this.P();
                                if (!this.d.a.A) {
                                    this.M(b6.a, b6.b, b6.c, b6.d);
                                }
                                final SVG.b p2 = ((SVG$p0)svg$x).p;
                                if (p2 != null) {
                                    this.a.concat(e(b6, p2, preserveAspectRatio));
                                }
                                else {
                                    final Boolean r = svg$x.r;
                                    final boolean b7 = r == null || r;
                                    this.a.translate(a4, b4);
                                    if (!b7) {
                                        final Canvas a5 = this.a;
                                        final SVG.b h4 = svg$i0.h;
                                        a5.scale(h4.c, h4.d);
                                    }
                                }
                                final Iterator<SVG.l0> iterator = ((SVG.f0)svg$x).i.iterator();
                                while (iterator.hasNext()) {
                                    this.H(iterator.next());
                                }
                                this.O();
                            }
                            b4 += n2;
                        }
                        if (f3) {
                            this.E(((SVG$i0)svg$x).h);
                        }
                        this.O();
                    }
                }
                return;
            }
        }
        this.a.drawPath(path, this.d.d);
    }
    
    public final void m(final Path path) {
        final h d = this.d;
        if (d.a.Q == SVG.Style.VectorEffect.NonScalingStroke) {
            final Matrix matrix = this.a.getMatrix();
            final Path path2 = new Path();
            path.transform(matrix, path2);
            this.a.setMatrix(new Matrix());
            final Shader shader = this.d.e.getShader();
            final Matrix localMatrix = new Matrix();
            if (shader != null) {
                shader.getLocalMatrix(localMatrix);
                final Matrix localMatrix2 = new Matrix(localMatrix);
                localMatrix2.postConcat(matrix);
                shader.setLocalMatrix(localMatrix2);
            }
            this.a.drawPath(path2, this.d.e);
            this.a.setMatrix(matrix);
            if (shader != null) {
                shader.setLocalMatrix(localMatrix);
            }
        }
        else {
            this.a.drawPath(path, d.e);
        }
    }
    
    public final void n(final SVG$w0 svg$w0, final j j) {
        if (!this.k()) {
            return;
        }
        final Iterator<SVG.l0> iterator = ((SVG.f0)svg$w0).i.iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            final SVG.l0 l0 = iterator.next();
            if (l0 instanceof SVG$a1) {
                j.b(this.Q(((SVG$a1)l0).c, b, iterator.hasNext() ^ true));
            }
            else if (j.a((SVG$w0)l0)) {
                final boolean b2 = l0 instanceof SVG$x0;
                final float n = 0.0f;
                float n2 = 0.0f;
                float c = 0.0f;
                if (b2) {
                    this.P();
                    final SVG$x0 svg$x0 = (SVG$x0)l0;
                    this.T(this.d, (SVG$j0)svg$x0);
                    if (this.k()) {
                        if (this.V()) {
                            final SVG.SVG$j0 g = ((SVG.l0)svg$x0).a.g(svg$x0.o);
                            if (g == null) {
                                o("TextPath reference '%s' not found", svg$x0.o);
                            }
                            else {
                                final SVG$u svg$u = (SVG$u)g;
                                final Path a = new b.b$d(svg$u.o).a;
                                final Matrix n3 = ((SVG$k)svg$u).n;
                                if (n3 != null) {
                                    a.transform(n3);
                                }
                                final PathMeasure pathMeasure = new PathMeasure(a, false);
                                final SVG.o p2 = svg$x0.p;
                                if (p2 != null) {
                                    c = p2.c(this, pathMeasure.getLength());
                                }
                                final SVG.Style.TextAnchor v = this.v();
                                float n4 = c;
                                if (v != SVG.Style.TextAnchor.Start) {
                                    float d = this.d((SVG$w0)svg$x0);
                                    if (v == SVG.Style.TextAnchor.Middle) {
                                        d /= 2.0f;
                                    }
                                    n4 = c - d;
                                }
                                this.g((SVG$i0)svg$x0.q);
                                final boolean f = this.F();
                                this.n((SVG$w0)svg$x0, (j)new b.b$e(n4, a, this));
                                if (f) {
                                    this.E(((SVG$i0)svg$x0).h);
                                }
                            }
                        }
                    }
                    this.O();
                }
                else if (l0 instanceof SVG$t0) {
                    this.P();
                    final SVG$t0 svg$t0 = (SVG$t0)l0;
                    this.T(this.d, (SVG$j0)svg$t0);
                    if (this.k()) {
                        final ArrayList o = ((SVG$y0)svg$t0).o;
                        final boolean b3 = o != null && o.size() > 0;
                        final boolean b4 = j instanceof b.b$f;
                        float n5;
                        float e;
                        float f2;
                        if (b4) {
                            if (!b3) {
                                n2 = ((b.b$f)j).a;
                            }
                            else {
                                n2 = ((SVG.o)((SVG$y0)svg$t0).o.get(0)).e(this);
                            }
                            final ArrayList p3 = ((SVG$y0)svg$t0).p;
                            if (p3 != null && p3.size() != 0) {
                                n5 = ((SVG.o)((SVG$y0)svg$t0).p.get(0)).f(this);
                            }
                            else {
                                n5 = ((b.b$f)j).b;
                            }
                            final ArrayList q = ((SVG$y0)svg$t0).q;
                            if (q != null && q.size() != 0) {
                                e = ((SVG.o)((SVG$y0)svg$t0).q.get(0)).e(this);
                            }
                            else {
                                e = 0.0f;
                            }
                            final ArrayList r = ((SVG$y0)svg$t0).r;
                            f2 = n;
                            if (r != null) {
                                if (r.size() == 0) {
                                    f2 = n;
                                }
                                else {
                                    f2 = ((SVG.o)((SVG$y0)svg$t0).r.get(0)).f(this);
                                }
                            }
                        }
                        else {
                            f2 = 0.0f;
                            n5 = (e = 0.0f);
                        }
                        float n6 = n2;
                        if (b3) {
                            final SVG.Style.TextAnchor v2 = this.v();
                            n6 = n2;
                            if (v2 != SVG.Style.TextAnchor.Start) {
                                float d2 = this.d((SVG$w0)svg$t0);
                                if (v2 == SVG.Style.TextAnchor.Middle) {
                                    d2 /= 2.0f;
                                }
                                n6 = n2 - d2;
                            }
                        }
                        this.g((SVG$i0)svg$t0.s);
                        if (b4) {
                            final b.b$f b$f = (b.b$f)j;
                            b$f.a = n6 + e;
                            b$f.b = n5 + f2;
                        }
                        final boolean f3 = this.F();
                        this.n((SVG$w0)svg$t0, j);
                        if (f3) {
                            this.E(((SVG$i0)svg$t0).h);
                        }
                    }
                    this.O();
                }
                else if (l0 instanceof SVG$s0) {
                    this.P();
                    final SVG$s0 svg$s0 = (SVG$s0)l0;
                    this.T(this.d, (SVG$j0)svg$s0);
                    if (this.k()) {
                        this.g((SVG$i0)svg$s0.p);
                        final SVG.SVG$j0 g2 = l0.a.g(svg$s0.o);
                        if (g2 != null && g2 instanceof SVG$w0) {
                            final StringBuilder sb = new StringBuilder();
                            this.p((SVG$w0)g2, sb);
                            if (sb.length() > 0) {
                                j.b(sb.toString());
                            }
                        }
                        else {
                            o("Tref reference '%s' not found", svg$s0.o);
                        }
                    }
                    this.O();
                }
            }
            b = false;
        }
    }
    
    public final void p(final SVG$w0 svg$w0, final StringBuilder sb) {
        final Iterator<SVG.l0> iterator = ((SVG.f0)svg$w0).i.iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            final SVG.l0 l0 = iterator.next();
            if (l0 instanceof SVG$w0) {
                this.p((SVG$w0)l0, sb);
            }
            else if (l0 instanceof SVG$a1) {
                sb.append(this.Q(((SVG$a1)l0).c, b, iterator.hasNext() ^ true));
            }
            b = false;
        }
    }
    
    public final h t(final SVG.l0 l0) {
        final h h = new h();
        this.S(h, SVG.Style.a());
        this.u(l0, h);
        return h;
    }
    
    public final void u(SVG.l0 l0, final h h) {
        final ArrayList list = new ArrayList();
        while (true) {
            if (l0 instanceof SVG$j0) {
                list.add(0, l0);
            }
            final SVG.h0 b = l0.b;
            if (b == null) {
                break;
            }
            l0 = (SVG.l0)b;
        }
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            this.T(h, (SVG$j0)iterator.next());
        }
        final h d = this.d;
        h.g = d.g;
        h.f = d.f;
    }
    
    public final SVG.Style.TextAnchor v() {
        final SVG.Style a = this.d.a;
        if (a.y != SVG.Style.TextDirection.LTR) {
            final SVG.Style.TextAnchor z = a.z;
            if (z != SVG.Style.TextAnchor.Middle) {
                SVG.Style.TextAnchor textAnchor;
                if (z == (textAnchor = SVG.Style.TextAnchor.Start)) {
                    textAnchor = SVG.Style.TextAnchor.End;
                }
                return textAnchor;
            }
        }
        return a.z;
    }
    
    public final Path$FillType w() {
        final SVG.Style.FillRule k = this.d.a.K;
        if (k != null && k == SVG.Style.FillRule.EvenOdd) {
            return Path$FillType.EVEN_ODD;
        }
        return Path$FillType.WINDING;
    }
    
    public final Path y(final SVG$d svg$d) {
        final SVG.o o = svg$d.o;
        float f = 0.0f;
        float e;
        if (o != null) {
            e = o.e(this);
        }
        else {
            e = 0.0f;
        }
        final SVG.o p = svg$d.p;
        if (p != null) {
            f = p.f(this);
        }
        final float b = svg$d.q.b(this);
        final float n = e - b;
        final float n2 = f - b;
        final float n3 = e + b;
        final float n4 = f + b;
        if (((SVG$i0)svg$d).h == null) {
            final float n5 = 2.0f * b;
            ((SVG$i0)svg$d).h = new SVG.b(n, n2, n5, n5);
        }
        final float n6 = 0.5522848f * b;
        final Path path = new Path();
        path.moveTo(e, n2);
        final float n7 = e + n6;
        final float n8 = f - n6;
        path.cubicTo(n7, n2, n3, n8, n3, f);
        final float n9 = f + n6;
        path.cubicTo(n3, n9, n7, n4, e, n4);
        final float n10 = e - n6;
        path.cubicTo(n10, n4, n, n9, n, f);
        path.cubicTo(n, n8, n10, n2, e, n2);
        path.close();
        return path;
    }
    
    public final Path z(final SVG$i svg$i) {
        final SVG.o o = svg$i.o;
        float f = 0.0f;
        float e;
        if (o != null) {
            e = o.e(this);
        }
        else {
            e = 0.0f;
        }
        final SVG.o p = svg$i.p;
        if (p != null) {
            f = p.f(this);
        }
        final float e2 = svg$i.q.e(this);
        final float f2 = svg$i.r.f(this);
        final float n = e - e2;
        final float n2 = f - f2;
        final float n3 = e + e2;
        final float n4 = f + f2;
        if (((SVG$i0)svg$i).h == null) {
            ((SVG$i0)svg$i).h = new SVG.b(n, n2, e2 * 2.0f, 2.0f * f2);
        }
        final float n5 = e2 * 0.5522848f;
        final float n6 = 0.5522848f * f2;
        final Path path = new Path();
        path.moveTo(e, n2);
        final float n7 = e + n5;
        final float n8 = f - n6;
        path.cubicTo(n7, n2, n3, n8, n3, f);
        final float n9 = n6 + f;
        path.cubicTo(n3, n9, n7, n4, e, n4);
        final float n10 = e - n5;
        path.cubicTo(n10, n4, n, n9, n, f);
        path.cubicTo(n, n8, n10, n2, e, n2);
        path.close();
        return path;
    }
    
    public final class c
    {
        public float a;
        public float b;
        public float c;
        public float d;
        public boolean e;
        
        public c(final float a, final float b, final float n, final float n2) {
            this.c = 0.0f;
            this.d = 0.0f;
            this.e = false;
            this.a = a;
            this.b = b;
            final double sqrt = Math.sqrt(n2 * n2 + n * n);
            if (sqrt != 0.0) {
                this.c = (float)(n / sqrt);
                this.d = (float)(n2 / sqrt);
            }
        }
        
        public final void a(float n, float d) {
            final float n2 = n - this.a;
            final float n3 = d - this.b;
            final double sqrt = Math.sqrt(n3 * n3 + n2 * n2);
            d = n2;
            n = n3;
            if (sqrt != 0.0) {
                d = (float)(n2 / sqrt);
                n = (float)(n3 / sqrt);
            }
            final float c = this.c;
            if (d == -c && n == -this.d) {
                this.e = true;
                this.c = -n;
                this.d = d;
            }
            else {
                this.c = c + d;
                this.d += n;
            }
        }
        
        public final void b(final c c) {
            final float c2 = c.c;
            final float c3 = this.c;
            if (c2 == -c3) {
                final float d = c.d;
                if (d == -this.d) {
                    this.e = true;
                    this.c = -d;
                    this.d = c.c;
                    return;
                }
            }
            this.c = c3 + c2;
            this.d += c.d;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("(");
            t.append(this.a);
            t.append(",");
            t.append(this.b);
            t.append(" ");
            t.append(this.c);
            t.append(",");
            t.append(this.d);
            t.append(")");
            return t.toString();
        }
    }
    
    public final class h
    {
        public SVG.Style a;
        public boolean b;
        public boolean c;
        public Paint d;
        public Paint e;
        public SVG.b f;
        public SVG.b g;
        public boolean h;
        
        public h() {
            (this.d = new Paint()).setFlags(193);
            this.d.setHinting(0);
            this.d.setStyle(Paint$Style.FILL);
            this.d.setTypeface(Typeface.DEFAULT);
            (this.e = new Paint()).setFlags(193);
            this.e.setHinting(0);
            this.e.setStyle(Paint$Style.STROKE);
            this.e.setTypeface(Typeface.DEFAULT);
            this.a = SVG.Style.a();
        }
        
        public h(final h h) {
            this.b = h.b;
            this.c = h.c;
            this.d = new Paint(h.d);
            this.e = new Paint(h.e);
            final SVG.b f = h.f;
            if (f != null) {
                this.f = new SVG.b(f);
            }
            final SVG.b g = h.g;
            if (g != null) {
                this.g = new SVG.b(g);
            }
            this.h = h.h;
            try {
                this.a = (SVG.Style)h.a.clone();
            }
            catch (final CloneNotSupportedException ex) {
                Log.e("SVGAndroidRenderer", "Unexpected clone error", (Throwable)ex);
                this.a = SVG.Style.a();
            }
        }
    }
    
    public abstract class j
    {
        public boolean a(final SVG$w0 svg$w0) {
            return true;
        }
        
        public abstract void b(final String p0);
    }
}
