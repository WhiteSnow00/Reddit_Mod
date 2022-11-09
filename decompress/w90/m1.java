// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import af2.h;
import p61.a;
import p61.c;
import p61.b;
import ri0.u;
import ri0.a0;
import javax.inject.Provider;
import af2.e;

public final class m1
{
    public e a;
    public e b;
    public e c;
    public Provider<a0> d;
    public Provider<u> e;
    public Provider<b> f;
    
    public m1(final a1 a1, final c c, final a a2, final je0.a a3) {
        this.a = af2.e.a((Object)c);
        this.b = af2.e.a((Object)a2);
        this.c = af2.e.b((Object)a3);
        final Provider a4 = h.a((Provider)qb0.b.c((Provider)a1.h));
        this.d = (Provider<a0>)a4;
        final Provider b = af2.c.b(a4);
        this.e = (Provider<u>)b;
        this.f = (Provider<b>)af2.c.b((Provider)new tx.a((Provider)this.a, (Provider)this.b, (Provider)a1.w, (Provider)this.c, b, 7));
    }
}
