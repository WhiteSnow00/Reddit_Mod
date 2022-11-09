// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestBeautySetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.covode.number.Covode;

public final class 0vm
{
    static {
        Covode.recordClassIndex(9756);
    }
    
    public static final void LIZ(final DataChannel dataChannel, final boolean b, final boolean b2) {
        if (MultiGuestBeautySetting.useNewBeautySmallItem()) {
            final IEffectService liz = 0jR.LIZ(IEffectService.class);
            n.LIZIZ((Object)liz, "");
            final 1JR multiGuestBeautyLogManager = liz.getMultiGuestBeautyLogManager();
            if (multiGuestBeautyLogManager != null) {
                multiGuestBeautyLogManager.LIZ(false);
                multiGuestBeautyLogManager.LIZ("video_anchor_connect_page");
                multiGuestBeautyLogManager.LIZ(FJ3.LIZLLL((Map)0uY.LIZ()));
                multiGuestBeautyLogManager.LIZ(dataChannel, true);
                if (b && b2) {
                    multiGuestBeautyLogManager.LIZ(dataChannel, 0);
                    multiGuestBeautyLogManager.LJ(dataChannel);
                }
                multiGuestBeautyLogManager.LIZ();
            }
        }
    }
    
    public static final void LIZ(final DataChannel dataChannel, final boolean b, final boolean b2, final boolean b3) {
        if (MultiGuestBeautySetting.useNewBeautySmallItem()) {
            final IEffectService liz = 0jR.LIZ(IEffectService.class);
            n.LIZIZ((Object)liz, "");
            final 1JR multiGuestBeautyLogManager = liz.getMultiGuestBeautyLogManager();
            if (multiGuestBeautyLogManager != null) {
                multiGuestBeautyLogManager.LIZ(false);
                multiGuestBeautyLogManager.LIZ("video_anchor_connect_detail");
                multiGuestBeautyLogManager.LIZ(FJ3.LIZLLL((Map)0uY.LIZ()));
                multiGuestBeautyLogManager.LIZ(dataChannel, false);
                Label_0123: {
                    Label_0101: {
                        if (b) {
                            multiGuestBeautyLogManager.LIZ(dataChannel, 2);
                            multiGuestBeautyLogManager.LJ(dataChannel);
                        }
                        else if (b3) {
                            if (!b2) {
                                multiGuestBeautyLogManager.LIZ(dataChannel);
                                multiGuestBeautyLogManager.LIZJ(dataChannel);
                                multiGuestBeautyLogManager.LIZIZ(dataChannel, false);
                                break Label_0123;
                            }
                            break Label_0101;
                        }
                        if (!b2) {
                            break Label_0123;
                        }
                    }
                    multiGuestBeautyLogManager.LIZLLL(dataChannel);
                    multiGuestBeautyLogManager.LIZJ();
                    multiGuestBeautyLogManager.LIZLLL();
                }
                multiGuestBeautyLogManager.LIZ();
            }
        }
    }
    
    public static final void LIZ(final boolean b, final DataChannel dataChannel) {
        if (b) {
            return;
        }
        if (MultiGuestBeautySetting.useNewBeautySmallItem()) {
            final IEffectService liz = 0jR.LIZ(IEffectService.class);
            n.LIZIZ((Object)liz, "");
            final 1JR multiGuestBeautyLogManager = liz.getMultiGuestBeautyLogManager();
            if (multiGuestBeautyLogManager != null) {
                final IEffectService liz2 = 0jR.LIZ(IEffectService.class);
                n.LIZIZ((Object)liz2, "");
                final 1JQ composerManagerB = liz2.composerManagerB();
                n.LIZIZ((Object)composerManagerB, "");
                multiGuestBeautyLogManager.LIZ(composerManagerB);
                multiGuestBeautyLogManager.LIZ(false);
                multiGuestBeautyLogManager.LIZ("video_anchor_connect_detail");
                multiGuestBeautyLogManager.LIZ(FJ3.LIZLLL((Map)0uY.LIZ()));
                multiGuestBeautyLogManager.LIZLLL(dataChannel);
                multiGuestBeautyLogManager.LIZJ();
                multiGuestBeautyLogManager.LIZLLL();
                multiGuestBeautyLogManager.LIZ();
            }
        }
    }
}
