// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import xv0.e;
import com.reddit.screen.BaseScreen;
import je0.g;

public final class wm implements du
{
    public final g a;
    public final kl b;
    
    public wm(final kl b, final BaseScreen baseScreen, final e e, final g a) {
        this.b = b;
        this.a = a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
