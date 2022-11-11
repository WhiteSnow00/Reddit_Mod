// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import p91.b;
import zg2.a;
import com.reddit.screen.BaseScreen;
import p91.f;
import java.util.List;
import p91.d;
import q20.c;
import javax.inject.Provider;
import af2.e;

public final class ob
{
    public final a1 a;
    public e b;
    public e c;
    public e d;
    public Provider<p91.e> e;
    public e f;
    public Provider<c> g;
    public Provider<d> h;
    
    public ob(final a1 a, final p91.c c, final List list, final f f, final BaseScreen baseScreen, final a a2, final b b) {
        this.a = a;
        this.b = af2.e.a((Object)c);
        this.c = af2.e.a((Object)list);
        this.d = af2.e.a((Object)f);
        this.e = (Provider<p91.e>)af2.c.b((Provider)new ex.b((Provider)af2.e.a((Object)baseScreen), 9));
        this.f = af2.e.a((Object)b);
        final Provider b2 = af2.c.b((Provider)ei1.a.a((Provider)af2.e.a((Object)a2)));
        this.g = (Provider<c>)b2;
        this.h = (Provider<d>)af2.c.b((Provider)new bc0.d((Provider)this.b, (Provider)this.c, (Provider)this.d, (Provider)this.e, (Provider)this.f, b2, 3));
    }
}
