// 
// Decompiled by Procyon v0.6.0
// 

package k92;

import ng2.e;
import com.reddit.vault.feature.registration.protectvault.ProtectVaultScreen;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;
import com.reddit.vault.h;
import za2.l;

public final class d
{
    public final a a;
    public final c b;
    public final l c;
    public final b92.a d;
    public final h e;
    public final MasterKeyScreen$a f;
    
    public d(final a a, final ProtectVaultScreen b, final ProtectVaultScreen c, final ProtectVaultScreen d, final h e, final ProtectVaultScreen f) {
        ng2.e.f((Object)b, "view");
        ng2.e.f((Object)c, "preparedDeepLinkHandler");
        ng2.e.f((Object)d, "recoveryPhraseListener");
        ng2.e.f((Object)f, "masterKeyListener");
        this.a = a;
        this.b = (c)b;
        this.c = (l)c;
        this.d = (b92.a)d;
        this.e = e;
        this.f = (MasterKeyScreen$a)f;
    }
}
