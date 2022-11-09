// 
// Decompiled by Procyon v0.6.0
// 

package ja;

import java.io.IOException;
import android.util.JsonToken;
import java.io.Reader;
import android.util.JsonReader;
import java.io.BufferedReader;

public abstract class j
{
    public static f a(BufferedReader bufferedReader) throws IOException {
        bufferedReader = (BufferedReader)new JsonReader((Reader)bufferedReader);
        try {
            ((JsonReader)bufferedReader).beginObject();
            while (((JsonReader)bufferedReader).hasNext()) {
                if (((JsonReader)bufferedReader).nextName().equals("nextRequestWaitMillis")) {
                    if (((JsonReader)bufferedReader).peek() == JsonToken.STRING) {
                        return new f(Long.parseLong(((JsonReader)bufferedReader).nextString()));
                    }
                    return new f(((JsonReader)bufferedReader).nextLong());
                }
                else {
                    ((JsonReader)bufferedReader).skipValue();
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        }
        finally {
            ((JsonReader)bufferedReader).close();
        }
    }
    
    public abstract long b();
}
