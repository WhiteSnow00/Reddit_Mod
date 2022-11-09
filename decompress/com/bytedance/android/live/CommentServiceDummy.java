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
import X.CTM;
import X.0fs;
import com.bytedance.covode.number.Covode;

public class CommentServiceDummy implements ICommentService
{
    static {
        Covode.recordClassIndex(4815);
    }
    
    @Override
    public void addCommentEventListener(final 0fs 0fs) {
        CTM.LIZ((Object)0fs);
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getCommentWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getQuickCommentWidget() {
        return null;
    }
    
    @Override
    public List<1F8> loadAllBaseEmoji() {
        return null;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void removeCommentEventListener(final 0fs 0fs) {
        CTM.LIZ((Object)0fs);
    }
    
    @Override
    public void sendComment(final long n, final String s, final int n2, final ISendCommentEvent$Sender sendCommentEvent$Sender) {
        CTM.LIZ((Object)s, (Object)sendCommentEvent$Sender);
    }
    
    public void sendComment(final long n, final String s, final ISendCommentEvent$Sender sendCommentEvent$Sender) {
        CTM.LIZ((Object)s, (Object)sendCommentEvent$Sender);
    }
    
    @Override
    public void sendComment(final long n, final List<? extends EmoteModel> list, final int n2, final ISendCommentEvent$Sender sendCommentEvent$Sender) {
        CTM.LIZ((Object)list, (Object)sendCommentEvent$Sender);
    }
    
    @Override
    public void showEmoteDetailDialog(final EmoteModel emoteModel, final 0AB 0ab, final boolean b) {
        CTM.LIZ((Object)emoteModel, (Object)0ab);
    }
}
