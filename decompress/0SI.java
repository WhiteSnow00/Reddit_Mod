// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.covode.number.Covode;

public interface 0si
{
    default static {
        Covode.recordClassIndex(8988);
    }
    
    void LIZ(final 0sh<LinkListUser, LinkMessage> p0);
    
    void LIZ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> p0, final int p1);
    
    void LIZ(final Throwable p0);
}
