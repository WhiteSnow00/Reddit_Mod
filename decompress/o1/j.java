// 
// Decompiled by Procyon v0.6.0
// 

package o1;

import a4.v;
import android.graphics.ColorSpace$Named;
import android.graphics.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import a4.w;
import sg2.e;
import p1.c;
import android.graphics.Bitmap;

public final class j
{
    public static final c a(final Bitmap bitmap) {
        e.f((Object)bitmap, "<this>");
        final ColorSpace b = w.b(bitmap);
        if (b != null) {
            final Object o = b(b);
            if (o != null) {
                return (c)o;
            }
        }
        final float[] a = ColorSpaces.a;
        final Object o = ColorSpaces.c;
        return (c)o;
    }
    
    public static final c b(final ColorSpace colorSpace) {
        e.f((Object)colorSpace, "<this>");
        Object o;
        if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.SRGB))) {
            o = ColorSpaces.c;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.ACES))) {
            o = ColorSpaces.o;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.ACESCG))) {
            o = ColorSpaces.p;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.ADOBE_RGB))) {
            o = ColorSpaces.m;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.BT2020))) {
            o = ColorSpaces.h;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.BT709))) {
            o = ColorSpaces.g;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.CIE_LAB))) {
            o = ColorSpaces.r;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.CIE_XYZ))) {
            o = ColorSpaces.q;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.DCI_P3))) {
            o = ColorSpaces.i;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.DISPLAY_P3))) {
            o = ColorSpaces.j;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.EXTENDED_SRGB))) {
            o = ColorSpaces.e;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.LINEAR_EXTENDED_SRGB))) {
            o = ColorSpaces.f;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.LINEAR_SRGB))) {
            o = ColorSpaces.d;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.NTSC_1953))) {
            o = ColorSpaces.k;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.PRO_PHOTO_RGB))) {
            o = ColorSpaces.n;
        }
        else if (e.a((Object)colorSpace, (Object)ColorSpace.get(ColorSpace$Named.SMPTE_C))) {
            o = ColorSpaces.l;
        }
        else {
            o = ColorSpaces.c;
        }
        return (c)o;
    }
    
    public static final Bitmap c(final int n, final int n2, final int n3, final boolean b, final c c) {
        e.f((Object)c, "colorSpace");
        final Bitmap b2 = v.b(n, n2, o1.e.b(n3), b, d(c));
        e.e((Object)b2, "createBitmap(\n          \u2026orkColorSpace()\n        )");
        return b2;
    }
    
    public static final ColorSpace d(final c c) {
        e.f((Object)c, "<this>");
        ColorSpace$Named colorSpace$Named;
        if (e.a((Object)c, (Object)ColorSpaces.c)) {
            colorSpace$Named = ColorSpace$Named.SRGB;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.o)) {
            colorSpace$Named = ColorSpace$Named.ACES;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.p)) {
            colorSpace$Named = ColorSpace$Named.ACESCG;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.m)) {
            colorSpace$Named = ColorSpace$Named.ADOBE_RGB;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.h)) {
            colorSpace$Named = ColorSpace$Named.BT2020;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.g)) {
            colorSpace$Named = ColorSpace$Named.BT709;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.r)) {
            colorSpace$Named = ColorSpace$Named.CIE_LAB;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.q)) {
            colorSpace$Named = ColorSpace$Named.CIE_XYZ;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.i)) {
            colorSpace$Named = ColorSpace$Named.DCI_P3;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.j)) {
            colorSpace$Named = ColorSpace$Named.DISPLAY_P3;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.e)) {
            colorSpace$Named = ColorSpace$Named.EXTENDED_SRGB;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.f)) {
            colorSpace$Named = ColorSpace$Named.LINEAR_EXTENDED_SRGB;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.d)) {
            colorSpace$Named = ColorSpace$Named.LINEAR_SRGB;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.k)) {
            colorSpace$Named = ColorSpace$Named.NTSC_1953;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.n)) {
            colorSpace$Named = ColorSpace$Named.PRO_PHOTO_RGB;
        }
        else if (e.a((Object)c, (Object)ColorSpaces.l)) {
            colorSpace$Named = ColorSpace$Named.SMPTE_C;
        }
        else {
            colorSpace$Named = ColorSpace$Named.SRGB;
        }
        final ColorSpace value = ColorSpace.get(colorSpace$Named);
        e.e((Object)value, "get(frameworkNamedSpace)");
        return value;
    }
}
