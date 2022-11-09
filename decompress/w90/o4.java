// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import hg0.c;
import com.reddit.emailcollection.common.EmailCollectionMode;
import jg0.b;
import com.reddit.emailverification.screens.EmailVerificationPopupPresenter;
import af2.e;
import com.reddit.events.emailverification.EmailVerificationAnalytics;
import hg0.a;
import javax.inject.Provider;

public final class o4
{
    public final a1 a;
    public Provider<a> b;
    public Provider<EmailVerificationAnalytics> c;
    public Provider<kg0.a> d;
    public e e;
    public e f;
    public e g;
    public e h;
    public Provider<EmailVerificationPopupPresenter> i;
    
    public o4(final a1 a, final zg2.a a2, final zg2.a a3, final b b, final String s, final EmailCollectionMode emailCollectionMode, final at0.a a4) {
        this.a = a;
        this.b = (Provider<a>)af2.c.b((Provider)new c((Provider)af2.e.a((Object)a2), (Provider)a.w, 0));
        final Provider b2 = af2.c.b((Provider)new ug0.a((Provider)a.h, 6));
        this.c = (Provider<EmailVerificationAnalytics>)b2;
        this.d = (Provider<kg0.a>)af2.c.b((Provider)new c((Provider)this.b, b2, 1));
        this.e = af2.e.a((Object)b);
        this.f = af2.e.a((Object)s);
        this.g = af2.e.a((Object)emailCollectionMode);
        this.h = af2.e.a((Object)a4);
        this.i = (Provider<EmailVerificationPopupPresenter>)af2.c.b((Provider)new ty.e((Provider)a.X1, (Provider)this.d, (Provider)a.m, (Provider)this.e, (Provider)this.f, (Provider)this.g, (Provider)new zy.e((Provider)a.A, (Provider)this.h, (Provider)af2.e.a((Object)a3), 0), (Provider)this.b, (Provider)this.c, 2));
    }
}
