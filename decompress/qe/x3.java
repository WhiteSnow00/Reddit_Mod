// 
// Decompiled by Procyon v0.6.0
// 

package qe;

import xd.b;
import xd.c;

public final class x3
{
    public final j4 a;
    
    public x3(final c7 c7) {
        this.a = c7.q;
    }
    
    public final boolean a() {
        boolean b = false;
        try {
            final b a = c.a(this.a.f);
            if (a == null) {
                this.a.c().u.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a.b(128, "com.android.vending").versionCode >= 80837300) {
                b = true;
            }
            return b;
        }
        catch (final Exception ex) {
            this.a.c().u.b((Object)ex, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
