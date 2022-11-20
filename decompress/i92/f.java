// 
// Decompiled by Procyon v0.6.0
// 

package i92;

import javax.inject.Inject;
import ng2.e;
import com.reddit.vault.data.mapper.MnemonicMapper;
import ua2.g;
import com.reddit.vault.feature.registration.importvault.ImportVaultScreen$a;
import com.reddit.presentation.CoroutinesPresenter;

public final class f extends CoroutinesPresenter implements c
{
    public final b j;
    public final d k;
    public final ImportVaultScreen$a l;
    public final g m;
    public final MnemonicMapper n;
    
    @Inject
    public f(final b j, final d k, final ImportVaultScreen$a l, final ua2.d m, final MnemonicMapper n) {
        e.f((Object)j, "params");
        e.f((Object)k, "view");
        e.f((Object)l, "importVaultListener");
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = (g)m;
        this.n = n;
    }
}
