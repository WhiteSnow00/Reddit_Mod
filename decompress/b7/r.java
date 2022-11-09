// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import com.airbnb.lottie.parser.moshi.JsonReader;

public final class r implements l0<Integer>
{
    public static final r a;
    
    static {
        a = new r();
    }
    
    public final Object a(final JsonReader jsonReader, final float n) throws IOException {
        return Math.round(s.d(jsonReader) * n);
    }
}
