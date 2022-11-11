// 
// Decompiled by Procyon v0.6.0
// 

package ge;

import java.io.Serializable;
import android.util.Log;
import java.util.concurrent.ExecutionException;
import ve.g;
import ve.j;
import com.google.firebase.auth.FirebaseAuth;
import fi.f;
import java.net.HttpURLConnection;
import lw0.b;
import yg.d;
import android.content.Context;

public final class dc
{
    public final Context a;
    public jc b;
    public final String c;
    public final d d;
    
    public dc(final Context a, final d d, final String s) {
        lw0.b.R((Object)a);
        this.a = a;
        lw0.b.R((Object)d);
        this.d = d;
        this.c = String.format("Android/%s/%s", "Fallback", s);
    }
    
    public final void a(final HttpURLConnection httpURLConnection) {
        final String concat = String.valueOf(this.c).concat("/FirebaseCore-Android");
        if (this.b == null) {
            final Context a = this.a;
            this.b = new jc(a, a.getPackageName());
        }
        httpURLConnection.setRequestProperty("X-Android-Package", this.b.a);
        httpURLConnection.setRequestProperty("X-Android-Cert", this.b.b);
        httpURLConnection.setRequestProperty("Accept-Language", j5.d());
        httpURLConnection.setRequestProperty("X-Client-Version", concat);
        final Throwable t = null;
        httpURLConnection.setRequestProperty("X-Firebase-Locale", null);
        final d d = this.d;
        d.b();
        httpURLConnection.setRequestProperty("X-Firebase-GMPID", d.c.b);
        final f f = (f)FirebaseAuth.getInstance(this.d).l.get();
        Serializable s = t;
        Label_0183: {
            if (f != null) {
                try {
                    s = (String)j.a((g)f.a());
                    break Label_0183;
                }
                catch (final InterruptedException s) {}
                catch (final ExecutionException ex) {}
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(((Throwable)s).getMessage())));
                s = t;
            }
        }
        httpURLConnection.setRequestProperty("X-Firebase-Client", (String)s);
    }
}
