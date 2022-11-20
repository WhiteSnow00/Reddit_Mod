// 
// Decompiled by Procyon v0.6.0
// 

package li2;

import java.net.URL;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.URLConnection;
import ng2.e;
import java.io.InputStream;

public final class c
{
    public static InputStream a(final String s) {
        e.f((Object)s, "path");
        final ClassLoader classLoader = c.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(s);
        }
        final URL resource = classLoader.getResource(s);
        if (resource == null) {
            return null;
        }
        final URLConnection urlConnection = (URLConnection)FirebasePerfUrlConnection.instrument((Object)resource.openConnection());
        urlConnection.setUseCaches(false);
        return urlConnection.getInputStream();
    }
}
