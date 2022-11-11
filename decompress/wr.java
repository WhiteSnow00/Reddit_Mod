// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import ma2.x;
import com.reddit.screen.BaseScreen;
import xa2.b;

public final class wr implements du
{
    public final b a;
    public final kl b;
    
    public wr(final kl b, final BaseScreen baseScreen, final x x, final b a) {
        this.b = b;
        this.a = a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
