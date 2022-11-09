// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.screen.BaseScreen;
import y61.a;

public final class pm implements du
{
    public final a a;
    public final kl b;
    
    public pm(final kl b, final BaseScreen baseScreen, final String s, final a a) {
        this.b = b;
        this.a = a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
