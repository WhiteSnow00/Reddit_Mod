// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import f40.a;
import com.reddit.screen.BaseScreen;
import ms1.b;
import ms1.d;
import ms1.c;
import javax.inject.Provider;
import se2.e;

public final class we
{
    public final z0 a;
    public e b;
    public Provider<c> c;
    public Provider<m20.c> d;
    
    public we(final z0 a, final d d, final b b, final BaseScreen baseScreen) {
        this.a = a;
        this.b = e.a((Object)d);
        this.c = (Provider<c>)se2.c.b((Provider)new a((Provider)this.b, (Provider)e.a((Object)b), (Provider)a.e, (Provider)a.p0, (Provider)a.B4, (Provider)a.m, 9));
        this.d = (Provider<m20.c>)se2.c.b((Provider)oa1.b.a((Provider)cz0.c.b((Provider)e.a((Object)baseScreen))));
    }
}
