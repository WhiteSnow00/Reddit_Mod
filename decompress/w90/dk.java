// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.talk.model.RoomTheme;
import com.reddit.screen.BaseScreen;

public final class dk implements du
{
    public final kl a;
    
    public dk(final kl a, final BaseScreen baseScreen, final RoomTheme roomTheme, final String s, final String s2, final String s3, final Boolean b) {
        this.a = a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
