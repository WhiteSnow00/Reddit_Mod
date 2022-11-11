// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import com.reddit.screen.BaseScreen;
import hg2.j;
import rg2.l;

public final class mn implements yt
{
    public final l<? super Boolean, j> a;
    public final dl b;
    
    public mn(final dl b, final BaseScreen baseScreen, final String s, final String s2, final l a, final Boolean b2) {
        this.b = b;
        this.a = a;
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}
