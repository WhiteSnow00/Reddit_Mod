// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import h40.g;
import af2.c;
import of0.k0;
import com.reddit.emailcollection.common.EmailCollectionMode;
import dg0.b;
import hg0.a;
import com.reddit.events.emailcollection.EmailCollectionAnalytics;
import javax.inject.Provider;
import af2.e;

public final class i4
{
    public e a;
    public Provider<EmailCollectionAnalytics> b;
    public Provider<a> c;
    public e d;
    public Provider<dg0.a> e;
    
    public i4(final a1 a1, final zg2.a a2, final b b, final EmailCollectionMode emailCollectionMode, final Boolean b2) {
        this.a = af2.e.a((Object)b);
        this.b = (Provider<EmailCollectionAnalytics>)af2.c.b((Provider)new k0((Provider)a1.h, 8));
        this.c = (Provider<a>)af2.c.b((Provider)new hg0.c((Provider)af2.e.a((Object)a2), (Provider)a1.w, 0));
        this.d = af2.e.a((Object)emailCollectionMode);
        this.e = (Provider<dg0.a>)af2.c.b((Provider)new g((Provider)this.a, (Provider)a1.G, (Provider)a1.X1, (Provider)a1.o0, (Provider)this.b, (Provider)this.c, (Provider)a1.m, (Provider)this.d, (Provider)af2.e.a((Object)b2), 1));
    }
}
