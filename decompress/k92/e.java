// 
// Decompiled by Procyon v0.6.0
// 

package k92;

import javax.inject.Inject;
import r82.b0;
import ua2.d;
import ua2.g;
import com.reddit.vault.h;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;
import com.reddit.presentation.CoroutinesPresenter;

public final class e extends CoroutinesPresenter implements b
{
    public final a j;
    public final c k;
    public final d82.a l;
    public final b92.a m;
    public final MasterKeyScreen$a n;
    public final h o;
    public final g p;
    public final g92.a q;
    public final boolean r;
    public final boolean s;
    
    @Inject
    public e(final a j, final c k, final d82.a l, final b92.a m, final MasterKeyScreen$a n, final h o, final d p8, final g92.a q) {
        ng2.e.f((Object)j, "params");
        ng2.e.f((Object)k, "view");
        ng2.e.f((Object)m, "recoveryPhraseListener");
        ng2.e.f((Object)n, "masterKeyListener");
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = (g)p8;
        this.q = q;
        final b0 a = j.a;
        this.r = a.k;
        this.s = a.l;
    }
    
    public final void A() {
        super.A();
        this.k.Jt(this.j.a.i);
        this.k.Wt(this.j.a.j);
        if (this.j.a.h) {
            this.k.Nm(2131955024);
        }
        else {
            this.k.Nm(2131955021);
        }
    }
}
