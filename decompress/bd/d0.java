// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParser;

public final class d0
{
    public static final byte[] a;
    public static final String[] b;
    
    public static String a(final int n, final int n2, final int n3) {
        return String.format("avc1.%02X%02X%02X", n, n2, n3);
    }
    
    public static String b(int length, final boolean b, int i, final int n, final int[] array, final int n2) {
        final String s = d0.b[length];
        char c;
        if (b) {
            length = (c = 'H');
        }
        else {
            length = (c = 'L');
        }
        final StringBuilder sb = new StringBuilder(c0.n("hvc1.%s%d.%X.%c%d", s, i, n, c, n2));
        for (length = array.length; length > 0 && array[length - 1] == 0; --length) {}
        for (i = 0; i < length; ++i) {
            sb.append(String.format(".%02X", array[i]));
        }
        return sb.toString();
    }
    
    public static void c(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void d(final boolean b, final String s) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(s));
    }
    
    public static void e(final int n, final int n2) {
        if (n >= 0 && n < n2) {
            return;
        }
        throw new IndexOutOfBoundsException();
    }
    
    public static void f(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void g(final Object o) {
        if (o != null) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static String h(final XmlPullParser xmlPullParser, final String s) {
        for (int attributeCount = xmlPullParser.getAttributeCount(), i = 0; i < attributeCount; ++i) {
            if (xmlPullParser.getAttributeName(i).equals(s)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
    
    public static boolean i(final XmlPullParser xmlPullParser, final String s) throws XmlPullParserException {
        final int eventType = xmlPullParser.getEventType();
        boolean b = true;
        if (eventType != 3 || !xmlPullParser.getName().equals(s)) {
            b = false;
        }
        return b;
    }
    
    public static boolean j(final XmlPullParser xmlPullParser) throws XmlPullParserException {
        return xmlPullParser.getEventType() == 2;
    }
    
    public static boolean k(final XmlPullParser xmlPullParser, final String s) throws XmlPullParserException {
        return j(xmlPullParser) && xmlPullParser.getName().equals(s);
    }
}
