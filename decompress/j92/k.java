// 
// Decompiled by Procyon v0.6.0
// 

package j92;

import q90.e0;
import com.reddit.vault.data.remote.RemoteVaultDataSource;
import o90.lk;
import com.reddit.vault.h;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen$a;
import za2.l;
import com.reddit.vault.feature.registration.masterkey.MasterKeyPresenter;
import com.reddit.vault.d;
import com.reddit.vault.data.mapper.MnemonicMapper;
import za2.n;
import com.reddit.screen.di.ScreenPresentationModule;
import com.reddit.vault.di.module.MoshiInstanceHolder;
import com.squareup.moshi.y;
import zd.b;
import com.reddit.screen.BaseScreen;
import o90.dm;
import ng2.e;
import o90.ht;
import mg2.a;
import javax.inject.Inject;
import o90.cm;
import com.reddit.vault.feature.registration.masterkey.MasterKeyScreen;
import o90.dt;

public final class k implements dt<MasterKeyScreen, f>
{
    public final j a;
    
    @Inject
    public k(final cm a) {
        this.a = (j)a;
    }
    
    public final ht inject(final Object o, final a a) {
        final MasterKeyScreen masterKeyScreen = (MasterKeyScreen)o;
        e.f((Object)masterKeyScreen, "target");
        e.f((Object)a, "factory");
        final f f = (f)a.invoke();
        final j a2 = this.a;
        final c a3 = f.a;
        final j92.e b = f.b;
        final l c = f.c;
        final MasterKeyScreen$a d = f.d;
        final h e = f.e;
        final cm cm = (cm)a2;
        cm.getClass();
        a3.getClass();
        b.getClass();
        c.getClass();
        final lk a4 = cm.a;
        final dm dm = new dm(a4, (BaseScreen)masterKeyScreen, a3, b, c, d, e);
        final RemoteVaultDataSource g4 = ((o82.a)a4.a).g4();
        zd.b.r(g4);
        final s82.a i8 = ((o82.a)a4.a).i8();
        zd.b.r(i8);
        final s82.d q5 = ((o82.a)a4.a).q5();
        zd.b.r(q5);
        final RemoteVaultDataSource g5 = ((o82.a)a4.a).g4();
        zd.b.r(g5);
        final s82.f w7 = ((o82.a)a4.a).w7();
        zd.b.r(w7);
        final com.reddit.vault.c o2 = ((e0)a4.a).O6();
        zd.b.r(o2);
        final d82.a a5 = new d82.a(o2);
        final y y = (y)MoshiInstanceHolder.a.getValue();
        zd.b.s(y);
        final t92.a m5 = ((o82.a)a4.a).m5();
        zd.b.r(m5);
        final n n = new n(ScreenPresentationModule.c((BaseScreen)masterKeyScreen));
        final ua2.d a6 = dm.a();
        final d20.a d2 = ((e0)a4.a).D2();
        zd.b.r(d2);
        final MnemonicMapper mnemonicMapper = new MnemonicMapper(d2);
        final qa2.a s0 = ((e0)a4.a).s0();
        zd.b.r(s0);
        final d20.a d3 = ((e0)a4.a).D2();
        zd.b.r(d3);
        final s82.d q6 = ((o82.a)a4.a).q5();
        zd.b.r(q6);
        masterKeyScreen.i0 = (j92.d)new MasterKeyPresenter(a3, b, g4, i8, q5, g5, w7, a5, d, y, m5, n, a6, mnemonicMapper, s0, d3, new g92.a(new za2.f(q6), c, dm.a(), (d)masterKeyScreen), e);
        return new ht((Object)dm);
    }
}
