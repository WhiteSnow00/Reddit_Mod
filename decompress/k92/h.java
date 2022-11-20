// 
// Decompiled by Procyon v0.6.0
// 

package k92;

import q90.e0;
import o90.lk;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;
import za2.l;
import za2.f;
import zd.b;
import com.reddit.screen.BaseScreen;
import o90.uo;
import ng2.e;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.to;
import com.reddit.vault.feature.registration.protectvault.ProtectVaultScreen;
import o90.dt;

public final class h implements dt<ProtectVaultScreen, d>
{
    public final g a;
    
    @Inject
    public h(final to a) {
        this.a = (g)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final ProtectVaultScreen protectVaultScreen = (ProtectVaultScreen)o;
        e.f((Object)protectVaultScreen, "target");
        e.f((Object)a, "factory");
        final d d = (d)a.invoke();
        final g a2 = this.a;
        final k92.a a3 = d.a;
        final c b = d.b;
        final l c = d.c;
        final b92.a d2 = d.d;
        final com.reddit.vault.h e = d.e;
        final MasterKeyScreen$a f = d.f;
        final to to = (to)a2;
        to.getClass();
        a3.getClass();
        b.getClass();
        c.getClass();
        d2.getClass();
        f.getClass();
        final lk a4 = to.a;
        final uo uo = new uo(a4, (BaseScreen)protectVaultScreen, a3, b, c, d2, e, f);
        final com.reddit.vault.c o2 = ((e0)a4.a).O6();
        zd.b.r(o2);
        final d82.a a5 = new d82.a(o2);
        final ua2.d a6 = uo.a();
        final s82.d q5 = ((o82.a)a4.a).q5();
        zd.b.r(q5);
        protectVaultScreen.i0 = new k92.e(a3, b, a5, d2, f, e, a6, new g92.a(new f(q5), c, uo.a(), (com.reddit.vault.d)protectVaultScreen));
        return new ht((Object)uo);
    }
}
