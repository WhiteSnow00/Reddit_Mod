// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.screen.BaseScreen;
import wj1.c;
import wj1.b;
import javax.inject.Provider;
import f40.a;
import se2.e;

public final class v9
{
    public e a;
    public e b;
    public e c;
    public a d;
    public Provider<b> e;
    
    public v9(final z0 z0, final c c, final wj1.a a, final BaseScreen baseScreen) {
        this.a = se2.e.a((Object)c);
        this.b = se2.e.a((Object)a);
        final e a2 = se2.e.a((Object)baseScreen);
        this.c = a2;
        this.d = f40.a.a((Provider)cz0.c.b((Provider)a2), (Provider)this.c, (Provider)z0.j0, (Provider)z0.w, (Provider)z0.T, (Provider)z0.f3);
        this.e = (Provider<b>)se2.c.b((Provider)new ox.c((Provider)this.a, (Provider)this.b, (Provider)this.d, (Provider)id0.b.e((Provider)z0.h), 13));
    }
}
