// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import android.graphics.Color;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.JsonReader;

public final class g implements l0<Integer>
{
    public static final g a;
    
    static {
        a = new g();
    }
    
    public final Object a(final JsonReader jsonReader, final float n) throws IOException {
        final boolean b = jsonReader.w() == JsonReader$Token.BEGIN_ARRAY;
        if (b) {
            jsonReader.b();
        }
        final double t = jsonReader.t();
        final double t2 = jsonReader.t();
        final double t3 = jsonReader.t();
        double t4;
        if (jsonReader.w() == JsonReader$Token.NUMBER) {
            t4 = jsonReader.t();
        }
        else {
            t4 = 1.0;
        }
        if (b) {
            jsonReader.q();
        }
        double n2 = t;
        double n3 = t2;
        double n4 = t3;
        double n5 = t4;
        if (t <= 1.0) {
            n2 = t;
            n3 = t2;
            n4 = t3;
            n5 = t4;
            if (t2 <= 1.0) {
                n2 = t;
                n3 = t2;
                n4 = t3;
                n5 = t4;
                if (t3 <= 1.0) {
                    final double n6 = t * 255.0;
                    final double n7 = t2 * 255.0;
                    final double n8 = t3 * 255.0;
                    n2 = n6;
                    n3 = n7;
                    n4 = n8;
                    n5 = t4;
                    if (t4 <= 1.0) {
                        n5 = t4 * 255.0;
                        n4 = n8;
                        n3 = n7;
                        n2 = n6;
                    }
                }
            }
        }
        return Color.argb((int)n5, (int)n2, (int)n3, (int)n4);
    }
}
