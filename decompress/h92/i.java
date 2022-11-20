// 
// Decompiled by Procyon v0.6.0
// 

package h92;

import ng2.e;
import com.reddit.vault.feature.registration.createvault.CreateVaultScreen;
import com.reddit.vault.feature.registration.createvault.ConfirmRestorePreviousVaultScreen$a;
import com.reddit.vault.feature.registration.createvault.IgnoreRecoveryConfirmationScreen$a;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;
import za2.l;

public final class i
{
    public final f a;
    public final h b;
    public final l c;
    public final MasterKeyScreen$a d;
    public final IgnoreRecoveryConfirmationScreen$a e;
    public final ConfirmRestorePreviousVaultScreen$a f;
    public final com.reddit.vault.h g;
    
    public i(final f a, final CreateVaultScreen b, final CreateVaultScreen c, final CreateVaultScreen d, final CreateVaultScreen e, final CreateVaultScreen f, final com.reddit.vault.h g) {
        ng2.e.f((Object)b, "view");
        ng2.e.f((Object)c, "preparedDeepLinkHandler");
        ng2.e.f((Object)d, "masterKeyListener");
        ng2.e.f((Object)e, "ignoreRecoveryListener");
        ng2.e.f((Object)f, "confirmRestorePreviousVaultListener");
        this.a = a;
        this.b = (h)b;
        this.c = (l)c;
        this.d = (MasterKeyScreen$a)d;
        this.e = (IgnoreRecoveryConfirmationScreen$a)e;
        this.f = (ConfirmRestorePreviousVaultScreen$a)f;
        this.g = g;
    }
}
