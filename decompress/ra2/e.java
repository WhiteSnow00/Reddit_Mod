// 
// Decompiled by Procyon v0.6.0
// 

package ra2;

import com.reddit.vault.f;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen;
import com.reddit.vault.h;
import com.reddit.vault.util.BiometricsHandler;

public final class e
{
    public final b a;
    public final d b;
    public final BiometricsHandler c;
    public final h d;
    public final com.reddit.vault.e e;
    
    public e(final b a, final ApproveTransactionScreen b, final BiometricsHandler c, final h d, final f e) {
        sg2.e.f((Object)b, "view");
        sg2.e.f((Object)c, "biometricsHandler");
        this.a = a;
        this.b = (d)b;
        this.c = c;
        this.d = d;
        this.e = (com.reddit.vault.e)e;
    }
}
