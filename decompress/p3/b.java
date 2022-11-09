// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import android.content.res.TypedArray;
import java.lang.reflect.Array;
import os.h;
import android.graphics.Color;
import android.util.StateSet;
import android.os.Build$VERSION;
import at1.a;
import java.io.IOException;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;
import android.util.Xml;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.XmlResourceParser;
import android.content.res.Resources;
import android.util.TypedValue;

public final class b
{
    public static final ThreadLocal<TypedValue> a;
    
    static {
        a = new ThreadLocal<TypedValue>();
    }
    
    public static ColorStateList a(final Resources resources, final XmlResourceParser xmlResourceParser, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        int next;
        do {
            next = ((XmlPullParser)xmlResourceParser).next();
        } while (next != 2 && next != 1);
        if (next == 2) {
            return b(resources, xmlResourceParser, attributeSet, resources$Theme);
        }
        throw new XmlPullParserException("No start tag found");
    }
    
    public static ColorStateList b(final Resources resources, final XmlResourceParser xmlResourceParser, final AttributeSet set, final Resources$Theme resources$Theme) throws XmlPullParserException, IOException {
        final String name = ((XmlPullParser)xmlResourceParser).getName();
        if (name.equals("selector")) {
            int depth = ((XmlPullParser)xmlResourceParser).getDepth();
            int n = 1;
            ++depth;
            int[][] array = new int[20][];
            int[] array2 = new int[20];
            int n2 = 0;
            while (true) {
                final int next = ((XmlPullParser)xmlResourceParser).next();
                if (next == n) {
                    break;
                }
                final int depth2 = ((XmlPullParser)xmlResourceParser).getDepth();
                if (depth2 < depth && next == 3) {
                    break;
                }
                int[] array6;
                int n40;
                if (next == 2 && depth2 <= depth && ((XmlPullParser)xmlResourceParser).getName().equals("item")) {
                    final int[] s = at1.a.s;
                    TypedArray typedArray;
                    if (resources$Theme == null) {
                        typedArray = resources.obtainAttributes(set, s);
                    }
                    else {
                        typedArray = resources$Theme.obtainStyledAttributes(set, s, 0, 0);
                    }
                    final int resourceId = typedArray.getResourceId(0, -1);
                    int n4 = 0;
                    Label_0308: {
                        if (resourceId != -1) {
                            final ThreadLocal<TypedValue> a = b.a;
                            TypedValue typedValue = a.get();
                            if (typedValue == null) {
                                typedValue = new TypedValue();
                                a.set(typedValue);
                            }
                            resources.getValue(resourceId, typedValue, (boolean)(n != 0));
                            final int type = typedValue.type;
                            int n3;
                            if (type >= 28 && type <= 31) {
                                n3 = n;
                            }
                            else {
                                n3 = 0;
                            }
                            if (n3 == 0) {
                                try {
                                    n4 = a(resources, resources.getXml(resourceId), resources$Theme).getDefaultColor();
                                }
                                catch (final Exception ex) {
                                    n4 = typedArray.getColor(0, -65281);
                                }
                                break Label_0308;
                            }
                        }
                        n4 = typedArray.getColor(0, -65281);
                    }
                    float n5;
                    if (typedArray.hasValue(n)) {
                        n5 = typedArray.getFloat(n, 1.0f);
                    }
                    else if (typedArray.hasValue(3)) {
                        n5 = typedArray.getFloat(3, 1.0f);
                    }
                    else {
                        n5 = 1.0f;
                    }
                    float n6;
                    if (Build$VERSION.SDK_INT >= 31 && typedArray.hasValue(2)) {
                        n6 = typedArray.getFloat(2, -1.0f);
                    }
                    else {
                        n6 = typedArray.getFloat(4, -1.0f);
                    }
                    typedArray.recycle();
                    final int attributeCount = set.getAttributeCount();
                    final int[] array3 = new int[attributeCount];
                    int i;
                    int n7;
                    int n8;
                    for (n7 = (i = 0); i < attributeCount; ++i, n7 = n8) {
                        final int attributeNameResource = set.getAttributeNameResource(i);
                        n8 = n7;
                        if (attributeNameResource != 16843173) {
                            n8 = n7;
                            if (attributeNameResource != 16843551) {
                                n8 = n7;
                                if (attributeNameResource != 2130968635) {
                                    n8 = n7;
                                    if (attributeNameResource != 2130969236) {
                                        int n9;
                                        if (set.getAttributeBooleanValue(i, false)) {
                                            n9 = attributeNameResource;
                                        }
                                        else {
                                            n9 = -attributeNameResource;
                                        }
                                        array3[n7] = n9;
                                        n8 = n7 + 1;
                                    }
                                }
                            }
                        }
                    }
                    final int[] trimStateSet = StateSet.trimStateSet(array3, n7);
                    final float n10 = 100.0f;
                    final boolean b = n6 >= 0.0f && n6 <= 100.0f;
                    int[] array4;
                    if (n5 == 1.0f && !b) {
                        array4 = trimStateSet;
                    }
                    else {
                        final int x0 = yd.a.X0((int)(Color.alpha(n4) * n5 + 0.5f), 0, 255);
                        Label_1227: {
                            if (b) {
                                final p3.a a2 = p3.a.a(n4);
                                final float a3 = a2.a;
                                float b2 = a2.b;
                                final l k = l.k;
                                if (b2 >= 1.0 && Math.round(n6) > 0.0 && Math.round(n6) < 100.0) {
                                    float min;
                                    if (a3 < 0.0f) {
                                        min = 0.0f;
                                    }
                                    else {
                                        min = Math.min(360.0f, a3);
                                    }
                                    float n11 = b2;
                                    final float n12 = 0.0f;
                                    p3.a a4 = null;
                                    int n13 = 1;
                                    float n14 = n10;
                                    float n15 = n12;
                                Label_0718:
                                    while (Math.abs(n15 - n11) >= 0.4f) {
                                        float n16 = n14;
                                        float n18;
                                        float n17 = n18 = 1000.0f;
                                        float n19 = 0.0f;
                                        p3.a a5 = null;
                                        float n20 = n14;
                                        final float n21 = min;
                                        while (true) {
                                            while (Math.abs(n19 - n16) > 0.01f) {
                                                final float n22 = (n16 - n19) / 2.0f + n19;
                                                final int c = p3.a.b(n22, b2, n21).c(l.k);
                                                final float j = h.i(Color.red(c));
                                                final float l = h.i(Color.green(c));
                                                final float m = h.i(Color.blue(c));
                                                final float[] array5 = h.i[1];
                                                final float n23 = array5[0];
                                                final float n24 = array5[1];
                                                final float n25 = array5[2];
                                                final float n26 = 100.0f;
                                                final float n27 = (m * n25 + (l * n24 + j * n23)) / 100.0f;
                                                float n28;
                                                if (n27 <= 0.008856452f) {
                                                    n28 = n27 * 903.2963f;
                                                }
                                                else {
                                                    n28 = (float)Math.cbrt(n27) * 116.0f - 16.0f;
                                                }
                                                final float abs = Math.abs(n6 - n28);
                                                if (abs < 0.2f) {
                                                    final p3.a a6 = p3.a.a(c);
                                                    final p3.a b3 = p3.a.b(a6.c, a6.b, n21);
                                                    final float n29 = a6.d - b3.d;
                                                    final float n30 = a6.e - b3.e;
                                                    final float n31 = a6.f - b3.f;
                                                    final float n32 = (float)(Math.pow(Math.sqrt(n31 * n31 + (n30 * n30 + n29 * n29)), 0.63) * 1.41);
                                                    if (n32 <= 1.0f) {
                                                        n18 = n32;
                                                        a5 = a6;
                                                        n17 = abs;
                                                    }
                                                }
                                                if (n17 == 0.0f && n18 == 0.0f) {
                                                    final float n33 = n26;
                                                    if (n13 != 0) {
                                                        if (a5 != null) {
                                                            n4 = a5.c(k);
                                                            break Label_1227;
                                                        }
                                                        b2 = (n11 - n15) / 2.0f + n15;
                                                        n13 = 0;
                                                    }
                                                    else {
                                                        if (a5 == null) {
                                                            n11 = b2;
                                                        }
                                                        else {
                                                            a4 = a5;
                                                            n15 = b2;
                                                        }
                                                        b2 = (n11 - n15) / 2.0f + n15;
                                                    }
                                                    final float n34 = n33;
                                                    min = n21;
                                                    n14 = n34;
                                                    continue Label_0718;
                                                }
                                                if (n28 < n6) {
                                                    n19 = n22;
                                                }
                                                else {
                                                    n16 = n22;
                                                }
                                                n20 = 100.0f;
                                            }
                                            final float n33 = n20;
                                            continue;
                                        }
                                    }
                                    if (a4 == null) {
                                        n4 = h.h(n6);
                                    }
                                    else {
                                        n4 = a4.c(k);
                                    }
                                }
                                else {
                                    n4 = h.h(n6);
                                }
                            }
                        }
                        n4 = ((0xFFFFFF & n4) | x0 << 24);
                        array4 = trimStateSet;
                    }
                    final int n35 = 1;
                    final int n36 = n2 + 1;
                    final int length = array2.length;
                    final int n37 = 8;
                    array6 = array2;
                    if (n36 > length) {
                        int n38;
                        if (n2 <= 4) {
                            n38 = 8;
                        }
                        else {
                            n38 = n2 * 2;
                        }
                        array6 = new int[n38];
                        System.arraycopy(array2, 0, array6, 0, n2);
                    }
                    array6[n2] = n4;
                    Object o = array;
                    if (n36 > array.length) {
                        final Class<?> componentType = array.getClass().getComponentType();
                        int n39;
                        if (n2 <= 4) {
                            n39 = n37;
                        }
                        else {
                            n39 = n2 * 2;
                        }
                        o = Array.newInstance(componentType, n39);
                        System.arraycopy(array, 0, o, 0, n2);
                    }
                    o[n2] = array4;
                    array = (int[][])o;
                    n2 = n36;
                    n40 = n35;
                }
                else {
                    n40 = n;
                    array6 = array2;
                }
                n = n40;
                array2 = array6;
            }
            final int[] array7 = new int[n2];
            final int[][] array8 = new int[n2][];
            System.arraycopy(array2, 0, array7, 0, n2);
            System.arraycopy(array, 0, array8, 0, n2);
            return new ColorStateList(array8, array7);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(((XmlPullParser)xmlResourceParser).getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
}
