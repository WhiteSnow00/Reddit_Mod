// 
// Decompiled by Procyon v0.6.0
// 

package k92;

import com.reddit.screen.BaseScreen;
import com.reddit.vault.h;
import com.reddit.vault.ProtectVaultEvent;
import ng2.e;
import android.view.MenuItem;
import com.reddit.vault.feature.registration.protectvault.ProtectVaultScreen;
import android.view.MenuItem$OnMenuItemClickListener;

public final class f implements MenuItem$OnMenuItemClickListener
{
    public final ProtectVaultScreen a;
    
    public f(final ProtectVaultScreen a) {
        this.a = a;
    }
    
    public final boolean onMenuItemClick(final MenuItem menuItem) {
        final ProtectVaultScreen a = this.a;
        e.f((Object)a, "this$0");
        e.f((Object)menuItem, "it");
        ((BaseScreen)a).d();
        final h o = ((k92.e)a.zC()).o;
        if (o != null) {
            o.p6(ProtectVaultEvent.Skipped);
        }
        return true;
    }
}
