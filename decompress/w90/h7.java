// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import w30.d;
import d01.c;
import d01.b;
import ei0.a;
import javax.inject.Provider;
import af2.e;

public final class h7
{
    public final a1 a;
    public e b;
    public Provider<a> c;
    public Provider<b> d;
    
    public h7(final a1 a, final c c) {
        this.a = a;
        this.b = e.a((Object)c);
        final Provider b = af2.c.b((Provider)new xb0.b((Provider)a.h, 12));
        this.c = (Provider<a>)b;
        this.d = (Provider<b>)af2.c.b((Provider)new d((Provider)this.b, b, (Provider)a.m2, (Provider)a.i2, (Provider)a.R1, (Provider)a.T2, 2));
    }
}
