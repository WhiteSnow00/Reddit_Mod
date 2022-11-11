// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import com.reddit.vault.util.BiometricsHandler;
import ua2.d;
import com.reddit.screen.BaseScreen;
import pa2.b;
import com.reddit.vault.feature.vault.transfer.CommunityPickerScreen$a;
import com.reddit.vault.h;

public final class kr implements yt
{
    public final h a;
    public final CommunityPickerScreen$a b;
    public final b c;
    public final dl d;
    
    public kr(final dl d, final BaseScreen baseScreen, final ua2.b b, final d d2, final BiometricsHandler biometricsHandler, final h a, final CommunityPickerScreen$a b2, final b c) {
        this.d = d;
        this.a = a;
        this.b = b2;
        this.c = c;
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.d.k();
    }
}
