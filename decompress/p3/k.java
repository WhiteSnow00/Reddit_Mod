// 
// Decompiled by Procyon v0.6.0
// 

package p3;

import android.util.AttributeSet;
import android.graphics.Shader;
import android.content.res.Resources;
import android.util.Log;
import android.content.res.ColorStateList;
import android.content.res.Resources$Theme;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.content.Context;

public final class k
{
    public static int a(final Context context, final int n, final int n2) {
        final TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(n, typedValue, true);
        if (typedValue.resourceId != 0) {
            return n;
        }
        return n2;
    }
    
    public static ColorStateList b(final TypedArray typedArray, XmlPullParser xmlPullParser, final Resources$Theme resources$Theme) {
        final boolean g = g(xmlPullParser, "tint");
        xmlPullParser = null;
        if (!g) {
            return null;
        }
        final TypedValue typedValue = new TypedValue();
        typedArray.getValue(1, typedValue);
        final int type = typedValue.type;
        if (type == 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Failed to resolve attribute at index ");
            sb.append(1);
            sb.append(": ");
            sb.append(typedValue);
            throw new UnsupportedOperationException(sb.toString());
        }
        if (type >= 28 && type <= 31) {
            return ColorStateList.valueOf(typedValue.data);
        }
        final Resources resources = typedArray.getResources();
        final int resourceId = typedArray.getResourceId(1, 0);
        final ThreadLocal<TypedValue> a = b.a;
        Object a2;
        try {
            a2 = b.a(resources, resources.getXml(resourceId), resources$Theme);
        }
        catch (final Exception ex) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", (Throwable)ex);
            a2 = xmlPullParser;
        }
        return (ColorStateList)a2;
    }
    
    public static c c(final TypedArray typedArray, final XmlPullParser xmlPullParser, final Resources$Theme resources$Theme, final String s, int resourceId) {
        if (g(xmlPullParser, s)) {
            final TypedValue typedValue = new TypedValue();
            typedArray.getValue(resourceId, typedValue);
            final int type = typedValue.type;
            if (type >= 28 && type <= 31) {
                return new c(null, null, typedValue.data);
            }
            final Resources resources = typedArray.getResources();
            resourceId = typedArray.getResourceId(resourceId, 0);
            c a;
            try {
                a = c.a(resources, resourceId, resources$Theme);
            }
            catch (final Exception ex) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", (Throwable)ex);
                a = null;
            }
            if (a != null) {
                return a;
            }
        }
        return new c(null, null, 0);
    }
    
    public static float d(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final float n2) {
        if (!g(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getFloat(n, n2);
    }
    
    public static int e(final TypedArray typedArray, final XmlPullParser xmlPullParser, final String s, final int n, final int n2) {
        if (!g(xmlPullParser, s)) {
            return n2;
        }
        return typedArray.getInt(n, n2);
    }
    
    public static String f(final TypedArray typedArray, final int n, final int n2) {
        String s;
        if ((s = typedArray.getString(n)) == null) {
            s = typedArray.getString(n2);
        }
        return s;
    }
    
    public static boolean g(final XmlPullParser xmlPullParser, final String s) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", s) != null;
    }
    
    public static TypedArray h(final Resources resources, final Resources$Theme resources$Theme, final AttributeSet set, final int[] array) {
        if (resources$Theme == null) {
            return resources.obtainAttributes(set, array);
        }
        return resources$Theme.obtainStyledAttributes(set, array, 0, 0);
    }
}
