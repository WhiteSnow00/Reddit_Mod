// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import r92.c;
import com.reddit.screen.BaseScreen;
import p92.a;

public final class cq implements du
{
    public final a a;
    public final kl b;
    
    public cq(final kl b, final BaseScreen baseScreen, final r92.a a, final c c, final a a2) {
        this.b = b;
        this.a = a2;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
