// 
// Decompiled by Procyon v0.6.0
// 

package a7;

import java.io.IOException;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.HttpURLConnection;

public final class b
{
    public static a a(final String s) throws IOException {
        final HttpURLConnection httpURLConnection = (HttpURLConnection)FirebasePerfUrlConnection.instrument((Object)new URL(s).openConnection());
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new a(httpURLConnection);
    }
}
