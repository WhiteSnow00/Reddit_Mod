// 
// Decompiled by Procyon v0.6.0
// 

package b7;

import java.io.IOException;
import com.airbnb.lottie.parser.moshi.JsonReader$Token;
import com.airbnb.lottie.parser.moshi.JsonReader;
import d7.d;

public final class e0 implements l0<d>
{
    public static final e0 a;
    
    static {
        a = new e0();
    }
    
    public final Object a(final JsonReader jsonReader, final float n) throws IOException {
        final boolean b = jsonReader.w() == JsonReader$Token.BEGIN_ARRAY;
        if (b) {
            jsonReader.b();
        }
        final float n2 = (float)jsonReader.t();
        final float n3 = (float)jsonReader.t();
        while (jsonReader.hasNext()) {
            jsonReader.z1();
        }
        if (b) {
            jsonReader.q();
        }
        return new d(n2 / 100.0f * n, n3 / 100.0f * n);
    }
}
