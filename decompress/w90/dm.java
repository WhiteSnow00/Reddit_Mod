// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import w92.c;
import w92.a;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.feature.registration.importvault.ImportVaultScreen$a;

public final class dm implements du
{
    public final ImportVaultScreen$a a;
    public final kl b;
    
    public dm(final kl b, final BaseScreen baseScreen, final a a, final c c, final ImportVaultScreen$a a2) {
        this.b = b;
        this.a = a2;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
