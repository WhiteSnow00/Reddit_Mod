// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.util.Xml;
import android.util.Base64;
import android.content.res.TypedArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import android.content.res.Resources;
import org.xmlpull.v1.XmlPullParser;
import com.bytedance.covode.number.Covode;

public final class 06l
{
    static {
        Covode.recordClassIndex(745);
    }
    
    public static a LIZ(final XmlPullParser xmlPullParser, final Resources resources) {
        int i;
        do {
            i = xmlPullParser.next();
            if (i != 2) {
                continue;
            }
            xmlPullParser.require(2, (String)null, "font-family");
            if (xmlPullParser.getName().equals("font-family")) {
                return LIZIZ(xmlPullParser, resources);
            }
            LIZ(xmlPullParser);
            return null;
        } while (i != 1);
        throw new XmlPullParserException("No start tag found");
    }
    
    public static List<List<byte[]>> LIZ(final Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        final TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            final ArrayList list = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                int resourceId;
                for (i = 0; i < obtainTypedArray.length(); ++i) {
                    resourceId = obtainTypedArray.getResourceId(i, 0);
                    if (resourceId != 0) {
                        list.add(LIZ(resources.getStringArray(resourceId)));
                    }
                }
            }
            else {
                list.add(LIZ(resources.getStringArray(i)));
            }
            return list;
        }
        finally {
            obtainTypedArray.recycle();
        }
    }
    
    public static List<byte[]> LIZ(final String[] array) {
        final ArrayList list = new ArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(Base64.decode(array[i], 0));
        }
        return list;
    }
    
    public static void LIZ(final XmlPullParser xmlPullParser) {
        int n = 1;
        while (true) {
            final int next = xmlPullParser.next();
            if (next != 2) {
                if (next != 3) {
                    continue;
                }
                --n;
            }
            else {
                ++n;
            }
            if (n > 0) {
                continue;
            }
            break;
        }
    }
    
    public static a LIZIZ(final XmlPullParser xmlPullParser, final Resources resources) {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[] { 2130969584, 2130969585, 2130969586, 2130969587, 2130969588, 2130969589 });
        final String string = obtainAttributes.getString(0);
        final String string2 = obtainAttributes.getString(4);
        final String string3 = obtainAttributes.getString(5);
        final int resourceId = obtainAttributes.getResourceId(1, 0);
        final int integer = obtainAttributes.getInteger(2, 1);
        final int integer2 = obtainAttributes.getInteger(3, 500);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                LIZ(xmlPullParser);
            }
            return (a)new d(new 06z(string, string2, string3, LIZ(resources, resourceId)), integer, integer2);
        }
        final ArrayList list = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    list.add(LIZJ(xmlPullParser, resources));
                }
                else {
                    LIZ(xmlPullParser);
                }
            }
        }
        if (list.isEmpty()) {
            return null;
        }
        return (a)new b((c[])list.toArray(new c[list.size()]));
    }
    
    public static c LIZJ(final XmlPullParser xmlPullParser, final Resources resources) {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), new int[] { 16844082, 16844083, 16844095, 16844143, 16844144, 2130969582, 2130969590, 2130969592, 2130969593, 2130971325 });
        int n = 8;
        if (!obtainAttributes.hasValue(8)) {
            n = 1;
        }
        final int int1 = obtainAttributes.getInt(n, 400);
        int n2 = 6;
        if (!obtainAttributes.hasValue(6)) {
            n2 = 2;
        }
        final boolean b = 1 == obtainAttributes.getInt(n2, 0);
        int n3 = 9;
        if (!obtainAttributes.hasValue(9)) {
            n3 = 3;
        }
        int n4 = 7;
        if (!obtainAttributes.hasValue(7)) {
            n4 = 4;
        }
        final String string = obtainAttributes.getString(n4);
        final int int2 = obtainAttributes.getInt(n3, 0);
        int n5 = 5;
        if (!obtainAttributes.hasValue(5)) {
            n5 = 0;
        }
        final int resourceId = obtainAttributes.getResourceId(n5, 0);
        final String string2 = obtainAttributes.getString(n5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            LIZ(xmlPullParser);
        }
        return new c(string2, int1, b, string, int2, resourceId);
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(746);
        }
    }
    
    public static final class c
    {
        public final String LIZ;
        public int LIZIZ;
        public boolean LIZJ;
        public String LIZLLL;
        public int LJ;
        public int LJFF;
        
        static {
            Covode.recordClassIndex(748);
        }
        
        public c(final String liz, final int liziz, final boolean lizj, final String lizlll, final int lj, final int ljff) {
            this.LIZ = liz;
            this.LIZIZ = liziz;
            this.LIZJ = lizj;
            this.LIZLLL = lizlll;
            this.LJ = lj;
            this.LJFF = ljff;
        }
    }
    
    public static final class b implements a
    {
        public final c[] LIZ;
        
        static {
            Covode.recordClassIndex(747);
        }
        
        public b(final c[] liz) {
            this.LIZ = liz;
        }
    }
    
    public static final class d implements a
    {
        public final 06z LIZ;
        public final int LIZIZ;
        public final int LIZJ;
        
        static {
            Covode.recordClassIndex(749);
        }
        
        public d(final 06z liz, final int lizj, final int liziz) {
            this.LIZ = liz;
            this.LIZJ = lizj;
            this.LIZIZ = liziz;
        }
    }
}
