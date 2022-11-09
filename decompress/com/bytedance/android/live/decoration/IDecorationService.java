// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.decoration;

import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.live.BaseDialogFragmentV2;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.android.livesdk.model.RoomDecoration;
import java.util.List;
import X.HP3;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IDecorationService extends 0Vq
{
    default static {
        Covode.recordClassIndex(5895);
    }
    
    LiveWidget getDecorationWidget();
    
    Class<? extends HP3<List<RoomDecoration>>> getDonationDecorationsEvent();
    
    LiveRecyclableWidget getDonationStickerAnchorWidget(final Layer2PriorityManager p0);
    
    BaseDialogFragmentV2 getLiveStickerDonationListDialog();
    
    LiveDialogFragment getPropsStickerDialog();
    
    Class<? extends HP3<RoomSticker>> getRoomStickersEvent();
}
