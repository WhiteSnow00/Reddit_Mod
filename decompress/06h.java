// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.content.res.TypedArray;
import java.lang.reflect.Array;
import android.graphics.Color;
import android.util.StateSet;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

public final class 06h
{
    static {
        Covode.recordClassIndex(743);
    }
    
    public static ColorStateList LIZ(final Resources resources, final int n, final Resources$Theme resources$Theme) {
        try {
            return LIZ(resources, (XmlPullParser)resources.getXml(n), resources$Theme);
        }
        catch (final Exception ex) {
            return null;
        }
    }
    
    public static ColorStateList LIZ(final Resources resources, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
        final AttributeSet attributeSet = Xml.asAttributeSet(xmlPullParser);
        int i;
        do {
            i = xmlPullParser.next();
            if (i != 2) {
                continue;
            }
            return LIZ(resources, xmlPullParser, attributeSet, resources$Theme);
        } while (i != 1);
        throw new XmlPullParserException("No start tag found");
    }
    
    public static ColorStateList LIZ(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return LIZIZ(resources, xmlPullParser, set, resources$Theme);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(xmlPullParser.getPositionDescription());
        sb.append(": invalid color state list tag ");
        sb.append(name);
        throw new XmlPullParserException(sb.toString());
    }
    
    public static ColorStateList LIZIZ(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final int n = xmlPullParser.getDepth() + 1;
        int[][] array = new int[20][];
        int[] array2 = new int[20];
        int n2 = 0;
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlPullParser.getDepth();
            if (depth < n && next == 3) {
                break;
            }
            int n3 = n2;
            int[] array3 = array2;
            int[][] array4 = array;
            if (next == 2) {
                n3 = n2;
                array3 = array2;
                array4 = array;
                if (depth <= n) {
                    n3 = n2;
                    array3 = array2;
                    array4 = array;
                    if (xmlPullParser.getName().equals("item")) {
                        final int[] array6;
                        final int[] array5 = array6 = new int[3];
                        array6[0] = 16843173;
                        array6[1] = 16843551;
                        array6[2] = 2130969040;
                        TypedArray typedArray;
                        if (resources$Theme == null) {
                            typedArray = resources.obtainAttributes(set, array5);
                        }
                        else {
                            typedArray = resources$Theme.obtainStyledAttributes(set, array5, 0, 0);
                        }
                        final int color = typedArray.getColor(0, -65281);
                        final boolean hasValue = typedArray.hasValue(1);
                        float n4 = 1.0f;
                        if (hasValue) {
                            n4 = typedArray.getFloat(1, 1.0f);
                        }
                        else if (typedArray.hasValue(2)) {
                            n4 = typedArray.getFloat(2, 1.0f);
                        }
                        typedArray.recycle();
                        final int attributeCount = set.getAttributeCount();
                        final int[] array7 = new int[attributeCount];
                        int i = 0;
                        int n5 = 0;
                        while (i < attributeCount) {
                            final int attributeNameResource = set.getAttributeNameResource(i);
                            int n6 = n5;
                            if (attributeNameResource != 16843173) {
                                n6 = n5;
                                if (attributeNameResource != 16843551) {
                                    n6 = n5;
                                    if (attributeNameResource != 2130969040) {
                                        int n7;
                                        if (set.getAttributeBooleanValue(i, false)) {
                                            n7 = attributeNameResource;
                                        }
                                        else {
                                            n7 = -attributeNameResource;
                                        }
                                        array7[n5] = n7;
                                        n6 = n5 + 1;
                                    }
                                }
                            }
                            ++i;
                            n5 = n6;
                        }
                        final int[] trimStateSet = StateSet.trimStateSet(array7, n5);
                        final int round = Math.round(Color.alpha(color) * n4);
                        n3 = n2 + 1;
                        array3 = array2;
                        if (n3 > array2.length) {
                            array3 = new int[06o.LIZ(n2)];
                            System.arraycopy(array2, 0, array3, 0, n2);
                        }
                        array3[n2] = (round << 24 | (color & 0xFFFFFF));
                        Object o = array;
                        if (n3 > array.length) {
                            o = Array.newInstance(array.getClass().getComponentType(), 06o.LIZ(n2));
                            System.arraycopy(array, 0, o, 0, n2);
                        }
                        o[n2] = trimStateSet;
                        array4 = (int[][])o;
                    }
                }
            }
            n2 = n3;
            array2 = array3;
            array = array4;
        }
        final int[] array8 = new int[n2];
        final int[][] array9 = new int[n2][];
        System.arraycopy(array2, 0, array8, 0, n2);
        System.arraycopy(array, 0, array9, 0, n2);
        return new ColorStateList(array9, array8);
    }
}
