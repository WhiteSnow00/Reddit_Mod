// 
// Decompiled by Procyon v0.6.0
// 

package m72;

import q61.a;
import ff2.o;
import l10.p;
import q20.d;
import af2.t;
import ff0.v0;
import javax.inject.Inject;
import wa0.b0;
import xd0.s;
import q20.c;
import android.support.v4.media.b;

public final class e extends b
{
    public final p20.b g;
    public final c h;
    public final s i;
    public final b0 j;
    public final y10.c k;
    
    @Inject
    public e(final p20.b g, final c h, final s i, final b0 j, final y10.c k) {
        ng2.e.f((Object)g, "resourceProvider");
        ng2.e.f((Object)h, "postExecutionThread");
        ng2.e.f((Object)i, "preferenceRepository");
        ng2.e.f((Object)j, "streamFeatures");
        ng2.e.f((Object)k, "defaultUserIconFactory");
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    public final t S2(final v0 v0) {
        final e.e$a e$a = (e.e$a)v0;
        final t distinctUntilChanged = this.i.b().distinctUntilChanged();
        ng2.e.e((Object)distinctUntilChanged, "preferenceRepository\n   \u2026  .distinctUntilChanged()");
        final t onErrorReturn = px0.c.J2((t)distinctUntilChanged, (d)this.h).map((o)new p(7, (Object)e$a, (Object)this)).onErrorReturn((o)new a(11));
        ng2.e.e((Object)onErrorReturn, "preferenceRepository\n   \u2026rorReturn { Result.None }");
        return onErrorReturn;
    }
}
