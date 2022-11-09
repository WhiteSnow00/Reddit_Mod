// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Shader$TileMode;
import android.content.res.TypedArray;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;
import java.util.ArrayList;
import android.content.res.Resources$Theme;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import com.bytedance.covode.number.Covode;

public final class 06n
{
    static {
        Covode.recordClassIndex(750);
    }
    
    public static a LIZ(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        final int n = xmlPullParser.getDepth() + 1;
        final ArrayList list = new ArrayList(20);
        final ArrayList list2 = new ArrayList(20);
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            final int depth = xmlPullParser.getDepth();
            if (depth < n && next == 3) {
                break;
            }
            if (next != 2 || depth > n || !xmlPullParser.getName().equals("item")) {
                continue;
            }
            final TypedArray liz = 06u.LIZ(resources, resources$Theme, set, new int[] { 16843173, 16844052 });
            final boolean hasValue = liz.hasValue(0);
            final boolean hasValue2 = liz.hasValue(1);
            if (!hasValue || !hasValue2) {
                final StringBuilder sb = new StringBuilder();
                sb.append(xmlPullParser.getPositionDescription());
                sb.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                throw new XmlPullParserException(sb.toString());
            }
            final int color = liz.getColor(0, 0);
            final float float1 = liz.getFloat(1, 0.0f);
            liz.recycle();
            list2.add(color);
            list.add(float1);
        }
        if (list2.size() > 0) {
            return new a(list2, list);
        }
        return null;
    }
    
    public static Shader$TileMode LIZ(final int n) {
        if (n == 1) {
            return Shader$TileMode.REPEAT;
        }
        if (n != 2) {
            return Shader$TileMode.CLAMP;
        }
        return Shader$TileMode.MIRROR;
    }
    
    public static final class a
    {
        public final int[] LIZ;
        public final float[] LIZIZ;
        
        static {
            Covode.recordClassIndex(751);
        }
        
        public a(final int n, final int n2) {
            this.LIZ = new int[] { n, n2 };
            this.LIZIZ = new float[] { 0.0f, 1.0f };
        }
        
        public a(final int n, final int n2, final int n3) {
            this.LIZ = new int[] { n, n2, n3 };
            this.LIZIZ = new float[] { 0.0f, 0.5f, 1.0f };
        }
        
        public a(final List<Integer> list, final List<Float> list2) {
            final int size = list.size();
            this.LIZ = new int[size];
            this.LIZIZ = new float[size];
            for (int i = 0; i < size; ++i) {
                this.LIZ[i] = (int)list.get(i);
                this.LIZIZ[i] = list2.get(i);
            }
        }
    }
}
