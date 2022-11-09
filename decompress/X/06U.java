// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.AttributeSet;
import android.content.res.Resources;
import android.util.TypedValue;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.TypedArray;
import com.bytedance.covode.number.Covode;

public final class 06u
{
    static {
        Covode.recordClassIndex(758);
    }
    
    public static float LIZ(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final float n2) {
        if (!LIZ(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getFloat(n, n2);
    }
    
    public static int LIZ(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!LIZ(xmlPullParser, s)) {
            return 0;
        }
        return typedArray.getColor(n, 0);
    }
    
    public static int LIZ(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!LIZ(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getInt(n, n2);
    }
    
    public static 06i LIZ(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme, final String s, final int n) {
        if (LIZ(xmlPullParser, s)) {
            final TypedValue typedValue = new TypedValue();
            typedArray.getValue(n, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return 06i.LIZ(typedValue.data);
            }
            final 06i liz = 06i.LIZ(typedArray.getResources(), typedArray.getResourceId(n, 0), resources$Theme);
            if (liz != null) {
                return liz;
            }
        }
        return 06i.LIZ(0);
    }
    
    public static TypedArray LIZ(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        if (resources$Theme == null) {
            return resources.obtainAttributes(set, array);
        }
        return resources$Theme.obtainStyledAttributes(set, array, 0, 0);
    }
    
    public static TypedValue LIZ(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s) {
        if (!LIZ(xmlPullParser, s)) {
            return null;
        }
        return typedArray.peekValue(0);
    }
    
    public static boolean LIZ(final XmlPullParser xmlPullParser, final String s) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }
    
    public static int LIZIZ(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!LIZ(xmlPullParser, s)) {
            return 0;
        }
        return typedArray.getResourceId(n, 0);
    }
    
    public static String LIZJ(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n) {
        if (!LIZ(xmlPullParser, s)) {
            return null;
        }
        return typedArray.getString(n);
    }
}
