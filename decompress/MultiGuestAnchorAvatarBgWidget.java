// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguest.opt.widget;

import X.SEd;
import X.SDU;
import X.Qys;
import X.0CC;
import X.0CH;
import X.G18;
import X.SDT;
import X.SAp;
import X.S8e;
import java.util.List;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import android.view.View;
import X.0cq;
import X.0cp;
import X.SDe;
import X.SBH;
import X.S8f;
import X.Ql3;
import X.HZ0;
import android.widget.ImageView;
import X.HFv;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.2d6;
import X.1Uq;
import X.1Up;
import X.F8U;
import X.F8V;
import X.FBH;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import X.1si;
import X.2fc;
import X.1ib;
import X.6mZ;
import X.0ka;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public final class MultiGuestAnchorAvatarBgWidget extends LiveWidget implements 0ka, 6mZ
{
    public 1ib LIZ;
    public 2fc LIZIZ;
    public 1si LIZJ;
    public 1si LIZLLL;
    
    static {
        Covode.recordClassIndex(8624);
    }
    
    public final int getLayoutId() {
        return 2131562256;
    }
    
    public final void onCreate() {
        super.onCreate();
        final View viewById = this.findViewById(2131368952);
        n.LIZIZ((Object)viewById, "");
        this.LIZJ = (1si)viewById;
        final View viewById2 = this.findViewById(2131368955);
        n.LIZIZ((Object)viewById2, "");
        this.LIZLLL = (1si)viewById2;
        final View viewById3 = this.findViewById(2131373049);
        n.LIZIZ((Object)viewById3, "");
        final 1ib liz = (1ib)viewById3;
        this.LIZ = liz;
        if (liz == null) {
            n.LIZ("");
        }
        liz.setVisibility(0);
        this.LIZIZ = FBH.LIZ(1L, TimeUnit.SECONDS).LIZIZ(6L).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1Up(this), (2d6)1Uq.LIZ);
        final 1si lizj = this.LIZJ;
        if (lizj == null) {
            n.LIZ("");
        }
        lizj.setVisibility(0);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        while (true) {
            Label_0326: {
                if (room == null) {
                    break Label_0326;
                }
                final User owner = room.getOwner();
                if (owner == null) {
                    break Label_0326;
                }
                final ImageModel avatarThumb = owner.getAvatarThumb();
                final 1si lizj2 = this.LIZJ;
                if (lizj2 == null) {
                    n.LIZ("");
                }
                final 1si lizj3 = this.LIZJ;
                if (lizj3 == null) {
                    n.LIZ("");
                }
                final int width = lizj3.getWidth();
                final 1si lizj4 = this.LIZJ;
                if (lizj4 == null) {
                    n.LIZ("");
                }
                HFv.LIZ((ImageView)lizj2, avatarThumb, width, lizj4.getHeight(), 2131234398);
                final 1si lizlll = this.LIZLLL;
                if (lizlll == null) {
                    n.LIZ("");
                }
                lizlll.setVisibility(0);
                final HZ0 ljiij = new HZ0(5, 0.74698794f);
                if (avatarThumb != null) {
                    final List<String> urls = avatarThumb.getUrls();
                    if (urls != null && urls.size() == 0) {
                        final S8f liz2 = S8f.LIZ(Ql3.LIZ(2131234398));
                        liz2.LJIIJ = (Qys)ljiij;
                        final S8e liz3 = liz2.LIZ();
                        final SAp liziz = SBH.LIZIZ();
                        ((SDU)liziz).LIZIZ((Object)liz3);
                        final 1si lizlll2 = this.LIZLLL;
                        if (lizlll2 == null) {
                            n.LIZ("");
                        }
                        ((SDU)liziz).LIZ(((SEd)lizlll2).getController());
                        final SDT lizj5 = ((SDU)liziz).LIZJ();
                        final 1si lizlll3 = this.LIZLLL;
                        if (lizlll3 == null) {
                            n.LIZ("");
                        }
                        ((SEd)lizlll3).setController((SDe)lizj5);
                        return;
                    }
                }
                final G18 liz4 = 0cp.LIZ();
                0cq.LIZ(liz4, avatarThumb);
                liz4.LIZ(0.74698794f);
                final 1si lizlll4 = this.LIZLLL;
                if (lizlll4 == null) {
                    n.LIZ("");
                }
                liz4.LIZ((View)lizlll4);
                return;
            }
            final ImageModel avatarThumb = null;
            continue;
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        final 2fc liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.dispose();
        }
    }
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
