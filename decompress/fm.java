// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import y90.e0;
import java.util.Map;
import com.reddit.session.q;
import oa0.d;
import ge0.r;
import kz0.k;
import m02.h;
import s12.c;
import w02.a;
import com.reddit.talk.feature.inroom.InRoomViewModel$a;
import com.reddit.talk.feature.inroom.sheets.share.ShareBottomSheetScreen$a;
import com.reddit.talk.feature.inroom.sheets.overflow.OverflowBottomSheetScreen$a;
import com.reddit.talk.feature.inroom.sheets.minimize.MinimizePromptBottomSheetScreen$a;
import com.reddit.talk.feature.inroom.sheets.leaveroom.ConfirmLeaveRoomBottomSheetScreen$a;
import com.reddit.talk.util.b;
import com.reddit.screen.BaseScreen;

public final class fm implements du
{
    public final BaseScreen a;
    public final b b;
    public final ConfirmLeaveRoomBottomSheetScreen$a c;
    public final MinimizePromptBottomSheetScreen$a d;
    public final OverflowBottomSheetScreen$a e;
    public final ShareBottomSheetScreen$a f;
    public final kl g;
    
    public fm(final kl g, final BaseScreen a, final InRoomViewModel$a inRoomViewModel$a, final b b, final a a2, final w02.b b2, final ConfirmLeaveRoomBottomSheetScreen$a c, final MinimizePromptBottomSheetScreen$a d, final OverflowBottomSheetScreen$a e, final ShareBottomSheetScreen$a f) {
        this.g = g;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final c a() {
        return new c(h.a(this.a), (ub1.b)this.a, kl.D(this.g), kl.E(this.g));
    }
    
    public final com.reddit.talk.data.usecase.a b() {
        final e20.a e2 = ((e0)this.g.a).E2();
        k.N((Object)e2);
        final r a7 = ((e0)this.g.a).A7();
        k.N((Object)a7);
        final c a8 = this.a();
        final d r7 = ((e0)this.g.a).r7();
        k.N((Object)r7);
        final q e3 = ((e0)this.g.a).E();
        k.N((Object)e3);
        return new com.reddit.talk.data.usecase.a(e2, a7, a8, r7, e3);
    }
    
    public final o12.b c() {
        return new o12.b(this.a, new iz1.d());
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.g.k();
    }
}
