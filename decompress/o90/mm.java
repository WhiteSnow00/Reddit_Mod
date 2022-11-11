// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import se2.h;
import mg0.x;
import com.reddit.screen.BaseScreen;
import hi0.a0;
import javax.inject.Provider;
import ae0.q;

public final class mm implements yt
{
    public final q a;
    public final dl b;
    public Provider<a0> c;
    
    public mm(final dl b, final BaseScreen baseScreen, final String s, final q a) {
        this.b = b;
        this.a = a;
        this.c = (Provider<a0>)h.a((Provider)x.a((Provider)b.F));
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
