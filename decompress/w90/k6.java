// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import vx.d;
import com.reddit.screen.BaseScreen;
import h82.a;
import h82.c;
import j82.b;
import javax.inject.Provider;
import af2.e;

public final class k6
{
    public e a;
    public Provider<b> b;
    public Provider<h82.b> c;
    
    public k6(final c c, final a a, final BaseScreen baseScreen) {
        this.a = e.a((Object)c);
        this.b = (Provider<b>)af2.c.b((Provider)new iv0.b((Provider)e.a((Object)baseScreen), 20));
        this.c = (Provider<h82.b>)af2.c.b((Provider)new d((Provider)this.a, (Provider)this.b, (Provider)e.a((Object)a), 26));
    }
}
