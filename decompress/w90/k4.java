// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import g60.u1;
import of0.k0;
import dg0.c;
import com.reddit.emailcollection.common.EmailCollectionMode;
import zg2.a;
import dg0.d;
import com.reddit.events.emailcollection.EmailCollectionAnalytics;
import javax.inject.Provider;
import af2.e;

public final class k4
{
    public e a;
    public e b;
    public Provider<EmailCollectionAnalytics> c;
    public e d;
    public Provider<d> e;
    
    public k4(final a1 a1, final a a2, final dg0.e e, final EmailCollectionMode emailCollectionMode, final c c) {
        this.a = af2.e.a((Object)a2);
        this.b = af2.e.a((Object)e);
        this.c = (Provider<EmailCollectionAnalytics>)af2.c.b((Provider)new k0((Provider)a1.h, 8));
        this.d = af2.e.a((Object)emailCollectionMode);
        this.e = (Provider<d>)af2.c.b((Provider)new u1((Provider)this.a, (Provider)this.b, (Provider)a1.X1, (Provider)a1.m, this.c, (Provider)a1.w, (Provider)this.d, (Provider)af2.e.a((Object)c), 1));
    }
}
