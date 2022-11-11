// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import java.util.Map;
import com.reddit.talk.model.RoomTheme;
import com.reddit.screen.BaseScreen;

public final class kk implements yt
{
    public final dl a;
    
    public kk(final dl a, final BaseScreen baseScreen, final RoomTheme roomTheme) {
        this.a = a;
    }
    
    public final Map<Class<?>, tt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
