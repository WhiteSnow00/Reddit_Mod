// 
// Decompiled by Procyon v0.6.0
// 

package v92;

import sg2.e;
import com.reddit.vault.feature.settings.adapter.data.VaultSettingsAdapterItemProvider;
import com.reddit.vault.util.BiometricsHandler$a;

public final class c implements BiometricsHandler$a
{
    public final /* synthetic */ VaultSettingsAdapterItemProvider a;
    
    public c(final VaultSettingsAdapterItemProvider a) {
        this.a = a;
    }
    
    public final void C(final CharSequence charSequence) {
        e.f((Object)charSequence, "errorMessage");
        this.a.a.C(charSequence);
    }
    
    public final void D() {
    }
    
    public final void E() {
        this.a.a.qm();
    }
}
