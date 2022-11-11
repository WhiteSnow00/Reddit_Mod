// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.decoration;

import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.android.live.BaseDialogFragmentV2;
import X.CTM;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.Layer2PriorityManager;
import com.bytedance.android.livesdk.model.RoomDecoration;
import java.util.List;
import X.HP3;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.covode.number.Covode;

public class DecorationServiceDummy implements IDecorationService
{
    static {
        Covode.recordClassIndex(5894);
    }
    
    @Override
    public LiveWidget getDecorationWidget() {
        return null;
    }
    
    @Override
    public Class<? extends HP3<List<RoomDecoration>>> getDonationDecorationsEvent() {
        return null;
    }
    
    @Override
    public LiveRecyclableWidget getDonationStickerAnchorWidget(final Layer2PriorityManager layer2PriorityManager) {
        CTM.LIZ((Object)layer2PriorityManager);
        return null;
    }
    
    @Override
    public BaseDialogFragmentV2 getLiveStickerDonationListDialog() {
        return null;
    }
    
    @Override
    public LiveDialogFragment getPropsStickerDialog() {
        return null;
    }
    
    @Override
    public Class<? extends HP3<RoomSticker>> getRoomStickersEvent() {
        return null;
    }
    
    @Override
    public void onInit() {
    }
}
