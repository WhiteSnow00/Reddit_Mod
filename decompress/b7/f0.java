// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import c7.f;
import w6.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import android.graphics.PointF;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.parser.moshi.JsonReader$a;
import y6.h;

public final class f0 implements l0<h>
{
    public static final f0 a;
    public static final JsonReader$a b;
    
    static {
        a = new f0();
        b = JsonReader$a.a(new String[] { "c", "v", "i", "o" });
    }
    
    public final Object a(final JsonReader jsonReader, final float n) throws IOException {
        if (jsonReader.w() == JsonReader$Token.BEGIN_ARRAY) {
            jsonReader.b();
        }
        jsonReader.h();
        List c = null;
        ArrayList c3;
        ArrayList c2 = c3 = null;
        boolean o1 = false;
        while (jsonReader.hasNext()) {
            final int y = jsonReader.y(f0.b);
            if (y != 0) {
                if (y != 1) {
                    if (y != 2) {
                        if (y != 3) {
                            jsonReader.A();
                            jsonReader.z1();
                        }
                        else {
                            c3 = s.c(jsonReader, n);
                        }
                    }
                    else {
                        c2 = s.c(jsonReader, n);
                    }
                }
                else {
                    c = s.c(jsonReader, n);
                }
            }
            else {
                o1 = jsonReader.O1();
            }
        }
        jsonReader.r();
        if (jsonReader.w() == JsonReader$Token.END_ARRAY) {
            jsonReader.q();
        }
        if (c != null && c2 != null && c3 != null) {
            h h;
            if (c.isEmpty()) {
                h = new h(new PointF(), false, (List)Collections.emptyList());
            }
            else {
                final int size = c.size();
                final PointF pointF = (PointF)c.get(0);
                final ArrayList list = new ArrayList<a>(size);
                for (int i = 1; i < size; ++i) {
                    final PointF pointF2 = (PointF)c.get(i);
                    final int n2 = i - 1;
                    list.add(new a(f.a((PointF)c.get(n2), (PointF)c3.get(n2)), f.a(pointF2, (PointF)c2.get(i)), pointF2));
                }
                if (o1) {
                    final PointF pointF3 = (PointF)c.get(0);
                    final int n3 = size - 1;
                    list.add(new a(f.a((PointF)c.get(n3), (PointF)c3.get(n3)), f.a(pointF3, (PointF)c2.get(0)), pointF3));
                }
                h = new h(pointF, o1, (List)list);
            }
            return h;
        }
        throw new IllegalArgumentException("Shape data was missing information.");
    }
}
