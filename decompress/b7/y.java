// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import com.airbnb.lottie.parser.moshi.JsonReader;
import android.graphics.PointF;

public final class y implements l0<PointF>
{
    public static final y a;
    
    static {
        a = new y();
    }
    
    public final Object a(final JsonReader jsonReader, final float n) throws IOException {
        return s.b(jsonReader, n);
    }
}
