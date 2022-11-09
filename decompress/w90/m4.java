// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import h00.g;
import af2.c;
import of0.k0;
import dg0.h;
import com.reddit.emailcollection.screens.EmailCollectionPopupPresenter;
import af2.e;
import hg0.a;
import com.reddit.events.emailcollection.EmailCollectionAnalytics;
import javax.inject.Provider;
import com.reddit.emailcollection.common.EmailCollectionMode;

public final class m4
{
    public final EmailCollectionMode a;
    public final a1 b;
    public Provider<EmailCollectionAnalytics> c;
    public Provider<a> d;
    public Provider<eg0.a> e;
    public e f;
    public e g;
    public zy.e h;
    public Provider<EmailCollectionPopupPresenter> i;
    
    public m4(final a1 b, final zg2.a a, final zg2.a a2, final h h, final EmailCollectionMode a3, final at0.a a4) {
        this.b = b;
        this.a = a3;
        this.c = (Provider<EmailCollectionAnalytics>)af2.c.b((Provider)new k0((Provider)b.h, 8));
        final Provider b2 = af2.c.b((Provider)new hg0.c((Provider)af2.e.a((Object)a), (Provider)b.w, 0));
        this.d = (Provider<a>)b2;
        this.e = (Provider<eg0.a>)af2.c.b((Provider)new d00.c((Provider)this.c, b2, 23));
        this.f = af2.e.a((Object)h);
        this.g = af2.e.a((Object)a4);
        this.h = new zy.e((Provider)b.A, (Provider)this.g, (Provider)af2.e.a((Object)a2), 0);
        this.i = (Provider<EmailCollectionPopupPresenter>)af2.c.b((Provider)new g((Provider)this.e, (Provider)this.f, (Provider)this.h, (Provider)this.d, (Provider)af2.e.a((Object)a3), (Provider)b.m, (Provider)this.c, 4));
    }
}
