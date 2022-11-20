// 
// Decompiled by Procyon v0.6.0
// 

package q92;

import com.reddit.vault.feature.settings.SettingsScreenEntryPoint;
import javax.inject.Inject;
import en0.e;
import z32.b;
import com.reddit.vault.feature.settings.adapter.data.VaultSettingsAdapterItemProvider;
import javax.inject.Provider;

public final class a
{
    public final Provider<a> a;
    public final Provider<VaultSettingsAdapterItemProvider> b;
    
    @Inject
    public a(final b a, final e b) {
        ng2.e.f((Object)a, "myStuffSettingsAdapterItemProvider");
        ng2.e.f((Object)b, "vaultSettingsAdapterItemProvider");
        this.a = (Provider<a>)a;
        this.b = (Provider<VaultSettingsAdapterItemProvider>)b;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[SettingsScreenEntryPoint.values().length];
            a2[((Enum)SettingsScreenEntryPoint.MyStuff).ordinal()] = 1;
            a2[((Enum)SettingsScreenEntryPoint.DrawerVault).ordinal()] = 2;
            a = a2;
        }
    }
}
