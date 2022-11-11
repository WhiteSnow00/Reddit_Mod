// 
// Decompiled by Procyon v0.6.0
// 

package e92;

import q90.e0;
import com.reddit.vault.c;
import o90.dl;
import o90.uk;
import sg2.e;
import o90.xt;
import javax.inject.Inject;
import o90.yg;
import hg2.j;
import com.reddit.vault.feature.errors.ErrorScreen;
import o90.tt;

public final class b implements tt<ErrorScreen, j>
{
    public final a a;
    
    @Inject
    public b(final yg a) {
        this.a = (a)a;
    }
    
    @Override
    public final xt inject(final Object o, final rg2.a a) {
        final ErrorScreen errorScreen = (ErrorScreen)o;
        e.f((Object)errorScreen, "target");
        e.f((Object)a, "factory");
        final yg yg = (yg)this.a;
        yg.getClass();
        final dl a2 = yg.a;
        final uk uk = new uk(a2);
        final c h6 = ((e0)a2.a).H6();
        ui.b.n((Object)h6);
        errorScreen.i0 = new i82.a(h6);
        return new xt((Object)uk);
    }
}
