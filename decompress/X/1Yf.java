// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Iterator;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.List;
import java.util.ArrayList;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.android.livesdk.IBarrageService;
import com.bytedance.android.livesdk.livesetting.roomfunction.ShareEffectShowIntervalSetting;
import java.util.Map;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import java.util.LinkedHashMap;
import android.os.Bundle;
import android.app.Dialog;
import com.bytedance.covode.number.Covode;

public final class 1Yf implements Jz6
{
    public final /* synthetic */ 1Yj LIZ;
    public final /* synthetic */ GKo LIZIZ;
    
    static {
        Covode.recordClassIndex(9351);
    }
    
    public 1Yf(final 1Yj liz, final GKo liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final void LIZ() {
    }
    
    public final void LIZ(final Dialog dialog) {
    }
    
    public final void LIZ(final String s, String s2, final Bundle bundle) {
        if (bundle == null) {
            return;
        }
        GCz.LIZ(this.LIZ.LIZJ, this.LIZ.LJ, (0CH)this.LIZ.LIZLLL, s2, this.LIZ.LIZJ.getLabels(), bundle);
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        final IInteractService liz = 0jR.LIZ(IInteractService.class);
        n.LIZIZ((Object)liz, "");
        if (n.LIZ((Object)liz.getConnectionType(), (Object)"manual_pk")) {
            final IInteractService liz2 = 0jR.LIZ(IInteractService.class);
            n.LIZIZ((Object)liz2, "");
            if (liz2.isBattling()) {
                linkedHashMap.put("match_status", "pk_phase");
            }
            else {
                linkedHashMap.put("match_status", "punish");
            }
        }
        final Room lizj = this.LIZ.LIZJ;
        final DataChannel lj = this.LIZ.LJ;
        String s3;
        if (s == null) {
            s3 = "";
        }
        else {
            s3 = s;
        }
        final String ljj = this.LIZIZ.LJJ;
        n.LIZIZ((Object)ljj, "");
        GCz.LIZ(lizj, lj, s3, s2, bundle, ljj, (Map)linkedHashMap, this.LIZIZ);
        final Room lizj2 = this.LIZ.LIZJ;
        final DataChannel lj2 = this.LIZ.LJ;
        if (s == null) {
            s2 = "";
        }
        else {
            s2 = s;
        }
        GCz.LIZ(lizj2, lj2, s2);
        if (ShareEffectShowIntervalSetting.INSTANCE.getValue().LIZJ) {
            final 0Vq liz3 = 0jR.LIZ((Class<0Vq>)IBarrageService.class);
            n.LIZIZ((Object)liz3, "");
            final GcJ likeHelper = ((IBarrageService)liz3).getLikeHelper(this.LIZ.LIZJ.getId());
            if (likeHelper != null) {
                likeHelper.LJIILL();
            }
            final Gkn liz4 = Gkn.LJFF.LIZ("livesdk_shared_anchor_share_special_effect_show");
            liz4.LIZ(this.LIZ.LJ);
            liz4.LIZLLL();
        }
        final 0Vq liz5 = 0jR.LIZ((Class<0Vq>)IHostShare.class);
        n.LIZIZ((Object)liz5, "");
        final String[] stringArray = bundle.getStringArray(((IHostShare)liz5).getBundleKey(0));
        if (stringArray != null) {
            final ArrayList list = new ArrayList(stringArray.length);
            for (final String s4 : stringArray) {
                n.LIZIZ((Object)s4, "");
                final Long lji = 353.LJI(s4);
                long longValue;
                if (lji != null) {
                    longValue = lji;
                }
                else {
                    longValue = 0L;
                }
                list.add((Object)longValue);
            }
            final List list2 = list;
            final ArrayList list3 = new ArrayList();
            for (final Object next : list2) {
                if (((Number)next).longValue() != this.LIZ.LIZJ.getOwnerUserId()) {
                    list3.add(next);
                }
            }
            final List list4 = list3;
            final 1Yj liz6 = this.LIZ;
            liz6.LIZ(list4, liz6.LIZJ.getId());
            final Iterator iterator2 = list4.iterator();
            while (iterator2.hasNext()) {
                final long longValue2 = ((Number)iterator2.next()).longValue();
                1Tj.LIZ(longValue2, "invitation_plus", "chat_merge");
                if (s == null) {
                    s2 = "";
                }
                else {
                    s2 = s;
                }
                final 1Uo lizlll = this.LIZ.LIZLLL();
                0k8 ljiill;
                if (lizlll != null) {
                    ljiill = lizlll.LJIILL;
                }
                else {
                    ljiill = null;
                }
                0xy.LIZ(longValue2, s2, ljiill, "invitation_plus");
            }
        }
    }
    
    public final void LIZ(final Throwable t) {
        t.printStackTrace();
    }
    
    public final void LIZIZ(final Dialog dialog) {
    }
}
