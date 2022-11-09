// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import jx1.i;
import dv1.k;
import af2.c;
import com.reddit.sharing.custom.a;
import af2.e;
import com.reddit.sharing.custom.ShareBottomSheet$a;
import com.reddit.screen.BaseScreen;
import kx1.b;
import jx1.h;
import javax.inject.Provider;

public final class dr implements du
{
    public final kl a;
    public Provider<h> b;
    public Provider<b> c;
    
    public dr(final kl a, final BaseScreen baseScreen, final ShareBottomSheet$a shareBottomSheet$a) {
        this.a = a;
        this.b = (Provider<h>)af2.c.b((Provider)new a(e.a((Object)shareBottomSheet$a)));
        this.c = (Provider<b>)af2.c.b((Provider)new k((Provider)a.M, (Provider)a.N, (Provider)sa1.b.a((Provider)e.a((Object)baseScreen)), 2));
    }
    
    public final i a() {
        final s40.e u4 = ((e0)this.a.a).U4();
        kz0.k.N((Object)u4);
        return new i(u4);
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.a.k();
    }
}
