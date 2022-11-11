// 
// Decompiled by Procyon v0.6.0
// 

package da2;

import javax.inject.Inject;
import com.reddit.vault.domain.ClearUpVaultForSignOutUseCase;
import ab2.g;
import com.reddit.presentation.CoroutinesPresenter;

public final class d extends CoroutinesPresenter implements a
{
    public final g j;
    public final ClearUpVaultForSignOutUseCase k;
    
    @Inject
    public d(final ab2.d j, final ClearUpVaultForSignOutUseCase k) {
        this.j = (g)j;
        this.k = k;
    }
}
