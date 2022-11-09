// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import lx.d;
import e40.k;
import b21.a;
import b21.b;
import javax.inject.Provider;
import d00.c;
import af2.e;

public final class m
{
    public e a;
    public e b;
    public c c;
    public Provider<b> d;
    
    public m(final a1 a1, final b21.c c, final a a2) {
        this.a = e.a((Object)c);
        this.b = e.a((Object)a2);
        this.c = d00.c.b((Provider)a1.y, (Provider)a1.m);
        this.d = (Provider<b>)af2.c.b((Provider)new d((Provider)this.a, (Provider)this.b, (Provider)this.c, (Provider)k.a((Provider)a1.y, (Provider)a1.m, (Provider)a1.r), (Provider)a1.m, 4));
    }
}
