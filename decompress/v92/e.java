// 
// Decompiled by Procyon v0.6.0
// 

package v92;

import com.reddit.vault.f;
import com.reddit.vault.feature.vault.coins.PurchaseCoinsScreen;
import com.reddit.vault.feature.vault.transaction.approve.ApproveTransactionScreen$a;

public final class e
{
    public final b a;
    public final d b;
    public final com.reddit.vault.e c;
    public final ApproveTransactionScreen$a d;
    
    public e(final b a, final PurchaseCoinsScreen b, final f c, final PurchaseCoinsScreen d) {
        ng2.e.f((Object)b, "view");
        ng2.e.f((Object)d, "approveTransactionListener");
        this.a = a;
        this.b = (d)b;
        this.c = (com.reddit.vault.e)c;
        this.d = (ApproveTransactionScreen$a)d;
    }
}
