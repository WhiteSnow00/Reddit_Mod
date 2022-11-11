// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.vault.util.BiometricsHandler;
import cb2.d;
import com.reddit.screen.BaseScreen;
import xa2.b;
import com.reddit.vault.feature.vault.transfer.CommunityPickerScreen$a;
import com.reddit.vault.h;

public final class qr implements du
{
    public final h a;
    public final CommunityPickerScreen$a b;
    public final b c;
    public final kl d;
    
    public qr(final kl d, final BaseScreen baseScreen, final cb2.b b, final d d2, final BiometricsHandler biometricsHandler, final h a, final CommunityPickerScreen$a b2, final b c) {
        this.d = d;
        this.a = a;
        this.b = b2;
        this.c = c;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.d.k();
    }
}
