// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.JsonReader;
import android.graphics.PointF;

public final class z implements l0<PointF>
{
    public static final z a;
    
    static {
        a = new z();
    }
    
    public final Object a(final JsonReader jsonReader, final float n) throws IOException {
        final JsonReader$Token u = jsonReader.u();
        PointF pointF;
        if (u == JsonReader$Token.BEGIN_ARRAY) {
            pointF = s.b(jsonReader, n);
        }
        else if (u == JsonReader$Token.BEGIN_OBJECT) {
            pointF = s.b(jsonReader, n);
        }
        else {
            if (u != JsonReader$Token.NUMBER) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Cannot convert json to point. Next token is ");
                sb.append(u);
                throw new IllegalArgumentException(sb.toString());
            }
            final PointF pointF2 = new PointF((float)jsonReader.s() * n, (float)jsonReader.s() * n);
            while (jsonReader.hasNext()) {
                jsonReader.F1();
            }
            pointF = pointF2;
        }
        return pointF;
    }
}
