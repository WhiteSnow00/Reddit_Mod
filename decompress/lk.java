// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import x40.a;
import rm0.c;
import rm0.b;
import com.reddit.frontpage.presentation.detail.crosspost.video.CrossPostVideoDetailPresenter;
import javax.inject.Provider;
import af2.e;

public final class lk
{
    public e a;
    public e b;
    public Provider<rm0.e> c;
    public Provider<CrossPostVideoDetailPresenter> d;
    
    public lk(final kl kl, final ap ap, final b b, final c c) {
        this.a = e.a((Object)c);
        this.b = e.a((Object)b);
        final Provider b2 = af2.c.b((Provider)new sx.b((Provider)ap.k, (Provider)kl.W, (Provider)kl.l, (Provider)kl.f0, (Provider)ap.U0, 5));
        this.c = (Provider<rm0.e>)b2;
        this.d = (Provider<CrossPostVideoDetailPresenter>)af2.c.b((Provider)new a((Provider)this.a, (Provider)this.b, b2, (Provider)kl.F4, (Provider)kl.Y, (Provider)kl.q2, (Provider)kl.N0, (Provider)kl.O0, (Provider)kl.R, 1));
    }
}
