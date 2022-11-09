// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live;

import X.0AB;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent$Sender;
import X.1F8;
import java.util.List;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import X.0fs;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface ICommentService extends 0Vq
{
    default static {
        Covode.recordClassIndex(4816);
    }
    
    void addCommentEventListener(final 0fs p0);
    
    Class<? extends LiveRecyclableWidget> getCommentWidget();
    
    Class<? extends LiveRecyclableWidget> getQuickCommentWidget();
    
    List<1F8> loadAllBaseEmoji();
    
    void removeCommentEventListener(final 0fs p0);
    
    void sendComment(final long p0, final String p1, final int p2, final ISendCommentEvent$Sender p3);
    
    void sendComment(final long p0, final List<? extends EmoteModel> p1, final int p2, final ISendCommentEvent$Sender p3);
    
    void showEmoteDetailDialog(final EmoteModel p0, final 0AB p1, final boolean p2);
}
