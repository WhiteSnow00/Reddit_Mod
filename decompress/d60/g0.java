// 
// Decompiled by Procyon v0.6.0
// 

package d60;

import com.bluelinelabs.conductor.Controller;
import ah2.f;
import com.bluelinelabs.conductor.Router;
import com.reddit.screen.BaseScreen;
import af2.d;

public final class g0 implements d
{
    public static final g0 a;
    
    public static Router a(final BaseScreen baseScreen) {
        f.f((Object)baseScreen, "screen");
        final Router p = ((Controller)baseScreen).p;
        f.e((Object)p, "screen.router");
        return p;
    }
    
    public Object get() {
        return new f0();
    }
}
