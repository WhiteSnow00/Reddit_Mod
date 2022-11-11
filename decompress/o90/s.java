// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.screen.BaseScreen;
import ls0.c;
import ls0.b;
import qs0.a;
import javax.inject.Provider;
import se2.e;

public final class s
{
    public e a;
    public e b;
    public Provider<a> c;
    public Provider<b> d;
    
    public s(final z0 z0, final c c, final ls0.a a, final BaseScreen baseScreen) {
        this.a = e.a((Object)c);
        final e a2 = e.a((Object)baseScreen);
        this.b = a2;
        this.c = (Provider<a>)se2.c.b((Provider)jx.c.a((Provider)cz0.c.b((Provider)a2), (Provider)z0.w, (Provider)z0.E, (Provider)this.b));
        this.d = (Provider<b>)se2.c.b((Provider)new jx.c((Provider)this.a, (Provider)this.c, (Provider)e.a((Object)a), (Provider)z0.F, 11));
    }
}
