// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.screen.BaseScreen;
import pg2.j;
import zg2.l;

public final class wn implements du
{
    public final l<? super Boolean, j> a;
    public final kl b;
    
    public wn(final kl b, final BaseScreen baseScreen, final String s, final String s2, final l a, final Boolean b2) {
        this.b = b;
        this.a = (l<? super Boolean, j>)a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
