// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import java.io.IOException;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.content.res.XmlResourceParser;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import java.util.ArrayList;
import mg.d0;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import android.content.res.ColorStateList;
import android.graphics.Shader;

public final class c
{
    public final Shader a;
    public final ColorStateList b;
    public int c;
    
    public c(final Shader a, final ColorStateList b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public static c a(final Resources resources, int n, final Resources$Theme resources$Theme) throws IOException, XmlPullParserException {
        final XmlResourceParser xml = resources.getXml(n);
        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xml);
        do {
            n = ((XmlPullParser)xml).next();
        } while (n != 2 && n != 1);
        if (n != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        final String name = ((XmlPullParser)xml).getName();
        name.getClass();
        if (!name.equals("gradient")) {
            if (name.equals("selector")) {
                final ColorStateList b = p3.b.b(resources, xml, attributeSet, resources$Theme);
                return new c(null, b, b.getDefaultColor());
            }
            final StringBuilder sb = new StringBuilder();
            sb.append(((XmlPullParser)xml).getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        else {
            final String name2 = ((XmlPullParser)xml).getName();
            if (name2.equals("gradient")) {
                final TypedArray h = k.h(resources, resources$Theme, attributeSet, d0.e0);
                final float d = k.d(h, (XmlPullParser)xml, "startX", 8, 0.0f);
                final float d2 = k.d(h, (XmlPullParser)xml, "startY", 9, 0.0f);
                final float d3 = k.d(h, (XmlPullParser)xml, "endX", 10, 0.0f);
                final float d4 = k.d(h, (XmlPullParser)xml, "endY", 11, 0.0f);
                final float d5 = k.d(h, (XmlPullParser)xml, "centerX", 3, 0.0f);
                final float d6 = k.d(h, (XmlPullParser)xml, "centerY", 4, 0.0f);
                final int e = k.e(h, (XmlPullParser)xml, "type", 2, 0);
                if (!k.g((XmlPullParser)xml, "startColor")) {
                    n = 0;
                }
                else {
                    n = h.getColor(0, 0);
                }
                final boolean g = k.g((XmlPullParser)xml, "centerColor");
                int color;
                if (!k.g((XmlPullParser)xml, "centerColor")) {
                    color = 0;
                }
                else {
                    color = h.getColor(7, 0);
                }
                int color2;
                if (!k.g((XmlPullParser)xml, "endColor")) {
                    color2 = 0;
                }
                else {
                    color2 = h.getColor(1, 0);
                }
                final int e2 = k.e(h, (XmlPullParser)xml, "tileMode", 6, 0);
                final float d7 = k.d(h, (XmlPullParser)xml, "gradientRadius", 5, 0.0f);
                h.recycle();
                final int n2 = ((XmlPullParser)xml).getDepth() + 1;
                final ArrayList list = new ArrayList(20);
                final ArrayList<Integer> list2 = new ArrayList<Integer>(20);
                while (true) {
                    final int next = ((XmlPullParser)xml).next();
                    if (next == 1) {
                        break;
                    }
                    final int depth = ((XmlPullParser)xml).getDepth();
                    if (depth < n2 && next == 3) {
                        break;
                    }
                    if (next != 2) {
                        continue;
                    }
                    if (depth > n2) {
                        continue;
                    }
                    if (!((XmlPullParser)xml).getName().equals("item")) {
                        continue;
                    }
                    final TypedArray h2 = k.h(resources, resources$Theme, attributeSet, d0.f0);
                    final boolean hasValue = h2.hasValue(0);
                    final boolean hasValue2 = h2.hasValue(1);
                    if (!hasValue || !hasValue2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(((XmlPullParser)xml).getPositionDescription());
                        sb2.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                        throw new XmlPullParserException(sb2.toString());
                    }
                    final int color3 = h2.getColor(0, 0);
                    final float float1 = h2.getFloat(1, 0.0f);
                    h2.recycle();
                    list2.add(color3);
                    list.add(float1);
                }
                e e3;
                if (list2.size() > 0) {
                    e3 = new e(list2, list);
                }
                else {
                    e3 = null;
                }
                if (e3 == null) {
                    if (g) {
                        e3 = new e(n, color, color2);
                    }
                    else {
                        e3 = new e(n, color2);
                    }
                }
                Object o;
                if (e != 1) {
                    if (e != 2) {
                        final int[] a = e3.a;
                        final float[] b2 = e3.b;
                        Shader$TileMode shader$TileMode;
                        if (e2 != 1) {
                            if (e2 != 2) {
                                shader$TileMode = Shader$TileMode.CLAMP;
                            }
                            else {
                                shader$TileMode = Shader$TileMode.MIRROR;
                            }
                        }
                        else {
                            shader$TileMode = Shader$TileMode.REPEAT;
                        }
                        o = new LinearGradient(d, d2, d3, d4, a, b2, shader$TileMode);
                    }
                    else {
                        o = new SweepGradient(d5, d6, e3.a, e3.b);
                    }
                }
                else {
                    if (d7 <= 0.0f) {
                        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
                    }
                    final int[] a2 = e3.a;
                    final float[] b3 = e3.b;
                    Shader$TileMode shader$TileMode2;
                    if (e2 != 1) {
                        if (e2 != 2) {
                            shader$TileMode2 = Shader$TileMode.CLAMP;
                        }
                        else {
                            shader$TileMode2 = Shader$TileMode.MIRROR;
                        }
                    }
                    else {
                        shader$TileMode2 = Shader$TileMode.REPEAT;
                    }
                    o = new RadialGradient(d5, d6, d7, a2, b3, shader$TileMode2);
                }
                return new c((Shader)o, null, 0);
            }
            final StringBuilder sb3 = new StringBuilder();
            sb3.append(((XmlPullParser)xml).getPositionDescription());
            sb3.append(": invalid gradient color tag ");
            sb3.append(name2);
            throw new XmlPullParserException(sb3.toString());
        }
    }
    
    public final boolean b() {
        if (this.a == null) {
            final ColorStateList b = this.b;
            if (b != null && b.isStateful()) {
                return true;
            }
        }
        return false;
    }
}
