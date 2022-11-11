// 
// Decompiled by Procyon v0.6.0
// 

package o90;

import ez.f;
import mg0.x;
import w21.c;
import w21.b;
import ii0.a;
import javax.inject.Provider;
import se2.e;

public final class t8
{
    public final z0 a;
    public e b;
    public e c;
    public Provider<a> d;
    public Provider<b> e;
    
    public t8(final z0 a, final c c, final w21.a a2) {
        this.a = a;
        this.b = se2.e.a((Object)c);
        this.c = se2.e.a((Object)a2);
        final Provider b = se2.c.b((Provider)new x((Provider)a.h, 13));
        this.d = (Provider<a>)b;
        this.e = (Provider<b>)se2.c.b((Provider)new f((Provider)this.b, (Provider)this.c, (Provider)a.y, (Provider)a.k, (Provider)a.n1, (Provider)a.m, (Provider)a.w, b, (Provider)a.r, 5));
    }
}
