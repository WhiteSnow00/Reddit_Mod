// 
// Decompiled by Procyon v0.6.0
// 

package ja2;

import sg2.e;
import com.reddit.vault.feature.vault.membership.cancel.CancelMembershipScreen;
import com.reddit.vault.feature.errors.ErrorScreen$a;
import com.reddit.vault.h;
import com.reddit.vault.util.BiometricsHandler;

public final class d
{
    public final a a;
    public final c b;
    public final BiometricsHandler c;
    public final h d;
    public final ErrorScreen$a e;
    
    public d(final a a, final CancelMembershipScreen b, final BiometricsHandler c, final h d, final CancelMembershipScreen e) {
        sg2.e.f((Object)b, "view");
        sg2.e.f((Object)c, "biometricsHandler");
        sg2.e.f((Object)e, "errorScreenListener");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = (ErrorScreen$a)e;
    }
}
