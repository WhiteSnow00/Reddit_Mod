// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import wd.b;
import wd.c;

public final class u3
{
    public final h4 a;
    
    public u3(final g7 g7) {
        this.a = g7.q;
    }
    
    public final boolean a() {
        boolean b = false;
        try {
            final b a = c.a(this.a.f);
            if (a == null) {
                this.a.h().s.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                return false;
            }
            if (a.b(128, "com.android.vending").versionCode >= 80837300) {
                b = true;
            }
            return b;
        }
        catch (final Exception ex) {
            this.a.h().s.b((Object)ex, "Failed to retrieve Play Store version for Install Referrer");
            return false;
        }
    }
}
