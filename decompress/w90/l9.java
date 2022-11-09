// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import lx.d;
import com.reddit.screen.BaseScreen;
import ik1.a;
import ik1.c;
import ik1.b;
import javax.inject.Provider;
import af2.e;

public final class l9
{
    public e a;
    public e b;
    public e c;
    public Provider<b> d;
    
    public l9(final a1 a1, final c c, final a a2, final BaseScreen baseScreen) {
        this.a = e.a((Object)c);
        this.b = e.a((Object)a2);
        final e a3 = e.a((Object)baseScreen);
        this.c = a3;
        this.d = (Provider<b>)af2.c.b((Provider)new d((Provider)this.a, (Provider)this.b, (Provider)a1.m, (Provider)a1.D2, (Provider)cx.b.c((Provider)iv0.b.b((Provider)a3), (Provider)this.c, (Provider)a1.w, (Provider)a1.T, (Provider)a1.d3), 10));
    }
}
