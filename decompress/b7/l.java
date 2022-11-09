// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import com.airbnb.lottie.parser.moshi.JsonReader;

public final class l implements l0<Float>
{
    public static final l a;
    
    static {
        a = new l();
    }
    
    public final Object a(final JsonReader jsonReader, final float n) throws IOException {
        return s.d(jsonReader) * n;
    }
}
