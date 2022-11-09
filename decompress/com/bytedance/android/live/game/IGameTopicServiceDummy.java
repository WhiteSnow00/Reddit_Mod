// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.game;

import X.GRR;
import X.0jK;
import X.0jL;
import X.0AB;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.GameTag;
import X.Fra;
import X.CTM;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;

public class IGameTopicServiceDummy implements IGameTopicService
{
    static {
        Covode.recordClassIndex(6880);
    }
    
    @Override
    public void checkAndUpdateTopic(final Fragment fragment, final DataChannel dataChannel) {
        CTM.LIZ((Object)fragment, (Object)dataChannel);
    }
    
    @Override
    public GameTag currentGameTag(final Fra fra) {
        CTM.LIZ((Object)fra);
        return null;
    }
    
    @Override
    public Hashtag getLocalTopic(final Fra fra) {
        CTM.LIZ((Object)fra);
        return new Hashtag(Long.valueOf(0L), "", (ImageModel)null, 0, 12, (DefaultConstructorMarker)null);
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void showGameCategoryListDialog(final 0AB 0ab, final 0jL 0jL) {
    }
    
    @Override
    public void showGameCategoryListDialog2(final 0AB 0ab, final 0jK 0jK, final GRR grr, final Fra fra) {
        CTM.LIZ((Object)grr, (Object)fra);
        CTM.LIZ((Object)grr, (Object)fra);
    }
}
