// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.game;

import X.GRR;
import X.0jK;
import X.0jL;
import X.0AB;
import com.bytedance.android.livesdk.model.Hashtag;
import com.bytedance.android.livesdk.model.GameTag;
import X.Fra;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IGameTopicService extends 0Vq
{
    default static {
        Covode.recordClassIndex(6879);
    }
    
    void checkAndUpdateTopic(final Fragment p0, final DataChannel p1);
    
    GameTag currentGameTag(final Fra p0);
    
    Hashtag getLocalTopic(final Fra p0);
    
    void showGameCategoryListDialog(final 0AB p0, final 0jL p1);
    
    void showGameCategoryListDialog2(final 0AB p0, final 0jK p1, final GRR p2, final Fra p3);
}
