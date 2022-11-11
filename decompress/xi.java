// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.auth.model.phone.PhoneNumber;
import com.reddit.screen.BaseScreen;
import jx.b;
import com.bluelinelabs.conductor.Router;
import zg2.a;

public final class xi implements du
{
    public final a<? extends Router> a;
    public final a<? extends b> b;
    public final kl c;
    
    public xi(final kl c, final BaseScreen baseScreen, final PhoneNumber phoneNumber, final wx.a a, final a a2, final a b) {
        this.c = c;
        this.a = (a<? extends Router>)a2;
        this.b = (a<? extends b>)b;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.c.k();
    }
}
