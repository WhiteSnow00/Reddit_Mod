// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import aa2.c;
import aa2.a;
import com.reddit.screen.BaseScreen;
import com.reddit.vault.h;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;

public final class vq implements du
{
    public final MasterKeyScreen$a a;
    public final h b;
    public final kl c;
    
    public vq(final kl c, final BaseScreen baseScreen, final a a, final c c2, final MasterKeyScreen$a a2, final h b) {
        this.c = c;
        this.a = a2;
        this.b = b;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
