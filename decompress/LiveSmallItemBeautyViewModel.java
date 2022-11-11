// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.smallitem;

import java.util.Iterator;
import X.0iM;
import kotlin.n.y;
import java.util.Collection;
import java.util.ArrayList;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchExperimentSetting;
import X.0WE;
import X.F1i;
import java.util.List;
import X.1Km;
import X.FIT;
import X.0cB;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyMaxValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautyDefaultValue;
import X.Gaz;
import kotlin.jvm.internal.n;
import X.0jR;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveAnchorEnableInnerBeautySetting;
import X.2P9;
import X.SRT;
import X.F2r;
import X.F0v;
import X.Cye;
import X.2CS;
import X.0Br;
import X.EzE;
import X.EzZ;
import X.F0a;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.0i3;
import X.0hz;
import X.EDN;
import X.0hy;
import X.F0H;
import X.0Bq;

public final class LiveSmallItemBeautyViewModel extends 0Bq
{
    public final F0H<0hy> LIZ;
    public final EDN<0hz> LIZIZ;
    public final 0i3 LIZJ;
    
    static {
        Covode.recordClassIndex(6588);
    }
    
    public LiveSmallItemBeautyViewModel(final 0i3 lizj) {
        CTM.LIZ((Object)lizj);
        this.LIZJ = lizj;
        this.LIZ = (F0H<0hy>)F0a.LIZ(Integer.MAX_VALUE, (EzZ)null, 6);
        this.LIZIZ = (EDN<0hz>)EzE.LIZ(1, 10, (EzZ)null, 4);
        F0v.LIZ(0Br.LIZ(this), (F2r)null, (SRT)new 2CS(this, null), 3);
    }
    
    public final Object LIZ(final boolean b, String unzipPath, final Cye<? super 2P9> cye) {
        if (LiveAnchorEnableInnerBeautySetting.INSTANCE.enable()) {
            final IBroadcastService liz = 0jR.LIZ(IBroadcastService.class);
            n.LIZIZ((Object)liz, "");
            final 0WE liveCameraResManager = liz.getLiveCameraResManager();
            if (liveCameraResManager != null) {
                liveCameraResManager.loadSmoothComposerFile();
            }
            final EDN<0hz> liziz = this.LIZIZ;
            final Gaz gaz = new Gaz();
            CTM.LIZ((Object)"Smooth_ALL");
            gaz.LIZJ = "Smooth_ALL";
            gaz.LIZIZ = LiveAnchorEnableInnerBeautyDefaultValue.INSTANCE.getValue();
            gaz.LIZLLL = LiveAnchorEnableInnerBeautyMaxValue.INSTANCE.getValue();
            final LiveEffect liveEffect = new LiveEffect();
            liveEffect.isLocal = true;
            liveEffect.effectId = 1L;
            liveEffect.setResourceId("1");
            liveEffect.localIcon = 2131234372;
            liveEffect.name = 0cB.LIZ(2131836026);
            liveEffect.effectPanelName = 0cB.LIZ(2131830646);
            final IBroadcastService liz2 = 0jR.LIZ(IBroadcastService.class);
            n.LIZIZ((Object)liz2, "");
            final 0WE liveCameraResManager2 = liz2.getLiveCameraResManager();
            if (liveCameraResManager2 == null || (unzipPath = liveCameraResManager2.getSmoothComposerFilePath()) == null) {
                unzipPath = "";
            }
            liveEffect.setUnzipPath(unzipPath);
            liveEffect.setComposerConfigList(FIT.LIZ((Object)gaz));
            final List liz3 = FIT.LIZ((Object)liveEffect);
            unzipPath = 0cB.LIZ(2131830646);
            n.LIZIZ((Object)unzipPath, "");
            final Object emit = liziz.emit((Object)new 0hz.b(FIT.LIZ((Object)new 1Km(unzipPath, liz3, "beauty"))), (Cye)cye);
            if (emit == F1i.COROUTINE_SUSPENDED) {
                return emit;
            }
        }
        else {
            final Object emit2 = this.LIZIZ.emit((Object)new 0hz.a(b, unzipPath), (Cye)cye);
            if (emit2 == F1i.COROUTINE_SUSPENDED) {
                return emit2;
            }
        }
        return 2P9.LIZ;
    }
    
    public final List<1Km<LiveEffect>> LIZ(final List<1Km<LiveEffect>> list) {
        if (LiveBeautySwitchExperimentSetting.INSTANCE.hasNone()) {
            final ArrayList list2 = new ArrayList();
            list2.addAll(list);
            final Iterator iterator = list2.iterator();
            int n = 0;
            while (true) {
                while (iterator.hasNext()) {
                    if (y.LIZIZ(((1Km)iterator.next()).LIZJ, "beauty", false)) {
                        final ArrayList list3 = new ArrayList();
                        if (n >= 0 && !0iM.LJ((LiveEffect)((1Km)list2.get(n)).LIZIZ.get(0))) {
                            final 1Km 1Km = (1Km)list2.get(n);
                            final String effectPanelName = ((LiveEffect)1Km.LIZIZ.get(0)).effectPanelName;
                            final String effectPanelKey = ((LiveEffect)1Km.LIZIZ.get(0)).effectPanelKey;
                            final LiveEffect liveEffect = new LiveEffect();
                            liveEffect.effectPanelName = effectPanelName;
                            liveEffect.effectPanelKey = effectPanelKey;
                            final Gaz smallItemConfig = liveEffect.getSmallItemConfig();
                            if (smallItemConfig != null) {
                                smallItemConfig.LJI = 0;
                            }
                            liveEffect.extra = "first_none_in_beauty";
                            liveEffect.isLocal = true;
                            liveEffect.isDownloaded = true;
                            liveEffect.isExclusive = false;
                            liveEffect.localIcon = 2131234585;
                            liveEffect.name = 0cB.LIZ(2131829159);
                            list3.add(liveEffect);
                            list3.addAll(1Km.LIZIZ);
                            final 1Km 1Km2 = (1Km)list2.get(n);
                            list2.set(n, new 1Km(1Km2.LIZ, list3, 1Km2.LIZJ, 1Km2.LIZLLL, 1Km2.LJ, 1Km2.LJFF));
                        }
                        return list2;
                    }
                    ++n;
                }
                n = -1;
                continue;
            }
        }
        return list;
    }
}
