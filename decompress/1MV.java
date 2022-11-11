// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.View;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.n;
import com.ss.android.ugc.effectmanager.effect.listener.IModFavoriteList;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.covode.number.Covode;

public final class 1Mv implements a
{
    public final /* synthetic */ 1jV LIZ;
    
    static {
        Covode.recordClassIndex(6746);
    }
    
    public 1Mv(final 1jV liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final LiveEffect liveEffect, final boolean b) {
        final 1Kj liziz = 1Kj.LIZIZ;
        final DataChannel ljiilliil = this.LIZ.LJIILLIIL;
        if (liveEffect != null) {
            liziz.LIZ(liveEffect, b, ljiilliil);
            1Kj.LIZ.modifyFavoriteList(0gZ.LIZIZ, String.valueOf(liveEffect.effectId), Boolean.valueOf(b), (IModFavoriteList)new 1j9(liveEffect, b, ljiilliil));
        }
        final String s = "favorite";
        final String s2 = null;
        Label_0163: {
            if (b && (n.LIZ((Object)this.LIZ.LJIILJJIL, (Object)"favorite") ^ true)) {
                final T16 liz = this.LIZ.LJII.LIZIZ.LIZ(0);
                while (true) {
                    Label_0337: {
                        if (liz == null) {
                            break Label_0337;
                        }
                        final View lj = liz.LJ;
                        if (lj == null) {
                            break Label_0337;
                        }
                        final View viewById = lj.findViewById(2131372052);
                        View view;
                        if ((view = viewById) != null) {
                            viewById.setSelected(true);
                            view = viewById;
                        }
                        0cf.LIZ().postDelayed((Runnable)new 0iZ(view), 200L);
                        break Label_0163;
                    }
                    View view = null;
                    continue;
                }
            }
        }
        final Gkn liz2 = Gkn.LJFF.LIZ("livesdk_live_favorite_click");
        liz2.LIZ(this.LIZ.LJIILLIIL);
        String s3;
        if (b) {
            s3 = s;
        }
        else {
            s3 = "cancel_favorite";
        }
        liz2.LIZ("click_type", s3);
        Long value;
        if (liveEffect != null) {
            value = liveEffect.effectId;
        }
        else {
            value = null;
        }
        liz2.LIZ("sticker_id", (Number)value);
        String resourceId;
        if (liveEffect != null) {
            resourceId = liveEffect.getResourceId();
        }
        else {
            resourceId = null;
        }
        liz2.LIZ("resource_id", resourceId);
        String effectPanelKey = s2;
        if (liveEffect != null) {
            effectPanelKey = liveEffect.effectPanelKey;
        }
        liz2.LIZ("tab", effectPanelKey);
        liz2.LIZ("is_avatar", String.valueOf(GTi.LJ(Boolean.valueOf(0iM.LIZLLL(liveEffect)))));
        liz2.LIZ("is_group_sticker", String.valueOf(GTi.LJ(Boolean.valueOf(0gY.LIZIZ(liveEffect)))));
        liz2.LIZLLL();
    }
}
