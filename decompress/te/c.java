// 
// Decompiled by Procyon v0.6.0
// 

package te;

import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import ak0.n;
import androidx.appcompat.app.f;
import android.content.Context;

public final class c
{
    public static c c;
    public d a;
    public final Context b;
    
    public c(final Context context) {
        this.b = context.getApplicationContext();
    }
    
    public static c a(final Context context) {
        if (te.c.c == null) {
            final c c = te.c.c = new c(context);
            c.a = new d(c.b);
        }
        return te.c.c;
    }
    
    public static y0.f b(final f f, final String s) {
        try {
            return new y0.f(((Context)f).getPackageManager().getResourcesForApplication(s), s);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            final StringBuilder sb = new StringBuilder(n.f(s, 52));
            sb.append("Unable to get resources for ");
            sb.append(s);
            sb.append(", using local resources.");
            Log.w("OssLicenses", sb.toString());
            return new y0.f(f.getResources(), ((Context)f).getPackageName());
        }
    }
}
