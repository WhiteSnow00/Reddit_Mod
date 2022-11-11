// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import com.reddit.screen.BaseScreen;
import w72.a;
import w72.c;
import a82.b;
import javax.inject.Provider;
import se2.e;

public final class q3
{
    public e a;
    public e b;
    public e c;
    public Provider<b> d;
    public Provider<w72.b> e;
    
    public q3(final c c, final a a, final rg2.a a2, final BaseScreen baseScreen) {
        this.a = se2.e.a((Object)c);
        this.b = se2.e.a((Object)a);
        this.c = se2.e.a((Object)a2);
        final Provider b = se2.c.b((Provider)new vh1.a((Object)se2.e.a((Object)baseScreen), 5));
        this.d = (Provider<b>)b;
        this.e = (Provider<w72.b>)se2.c.b((Provider)new dx.a((Provider)this.a, (Provider)this.b, (Provider)this.c, b, 10));
    }
}
