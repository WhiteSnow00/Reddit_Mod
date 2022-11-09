// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import s40.e;
import kz0.k;
import com.reddit.events.snoovatar.SnoovatarAnalytics;
import com.reddit.domain.snoovatar.model.SnoovatarModel;
import xn1.b;
import com.reddit.screen.BaseScreen;

public final class br implements du
{
    public final kl a;
    
    public br(final kl a, final BaseScreen baseScreen, final b b, final SnoovatarModel snoovatarModel, final ux1.b b2) {
        this.a = a;
    }
    
    public final SnoovatarAnalytics a() {
        final e u4 = ((e0)this.a.a).U4();
        k.N((Object)u4);
        return new SnoovatarAnalytics(u4);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
