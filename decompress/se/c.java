// 
// Decompiled by Procyon v0.6.0
// 

package se;

import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import u10.o;
import androidx.compose.ui.platform.p1;
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
    
    public static p1 a(final f f, final String s) {
        try {
            return new p1(((Context)f).getPackageManager().getResourcesForApplication(s), s);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            final StringBuilder sb = new StringBuilder(o.e(s, 52));
            sb.append("Unable to get resources for ");
            sb.append(s);
            sb.append(", using local resources.");
            Log.w("OssLicenses", sb.toString());
            return new p1(f.getResources(), ((Context)f).getPackageName());
        }
    }
    
    public static c b(final Context context) {
        if (se.c.c == null) {
            final c c = se.c.c = new c(context);
            c.a = new d(c.b);
        }
        return se.c.c;
    }
}
