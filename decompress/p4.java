// 
// Decompiled by Procyon v0.6.0
// 

package ke;

import j0.i;
import android.net.Uri;
import j0.b;

public final class p4
{
    public static final b a;
    
    static {
        a = new b();
    }
    
    public static Uri a() {
        synchronized (p4.class) {
            final b a = p4.a;
            final Uri uri = (Uri)((i)a).getOrDefault((Object)"com.google.android.gms.measurement", (Object)null);
            if (uri == null) {
                final Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
                ((i)a).put((Object)"com.google.android.gms.measurement", (Object)parse);
                return parse;
            }
            return uri;
        }
    }
}
