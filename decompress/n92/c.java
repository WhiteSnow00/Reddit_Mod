// 
// Decompiled by Procyon v0.6.0
// 

package n92;

import ng2.e;
import com.reddit.vault.feature.settings.SettingsScreen;
import com.reddit.vault.h;
import com.reddit.vault.feature.settings.SettingsScreenEntryPoint;
import b92.a;
import com.reddit.vault.util.BiometricsHandler;

public final class c
{
    public final b a;
    public final BiometricsHandler b;
    public final a c;
    public final SettingsScreenEntryPoint d;
    public final h e;
    
    public c(final SettingsScreen a, final BiometricsHandler b, final SettingsScreen c, final SettingsScreenEntryPoint d, final h e) {
        ng2.e.f((Object)a, "view");
        ng2.e.f((Object)b, "biometricsHandler");
        ng2.e.f((Object)c, "recoveryPhraseListener");
        ng2.e.f((Object)d, "settingsScreenEntryPoint");
        this.a = (b)a;
        this.b = b;
        this.c = (a)c;
        this.d = d;
        this.e = e;
    }
}
