// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.publicscreen.api;

import com.bytedance.android.livesdk.model.message.ChatMessage;
import X.Got;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import X.10r;
import X.10q;
import X.10d;
import X.10I;
import X.10J;
import X.H7p;
import android.widget.TextView;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import java.util.List;
import X.10p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.0CH;
import X.10E;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.10D;
import X.10H;
import android.content.Context;
import X.1eV;
import X.H31;
import X.10o;
import X.0zk;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IPublicScreenService extends 0Vq
{
    default static {
        Covode.recordClassIndex(10618);
    }
    
    void addCapsuleHandler(final int p0, final 0zk p1);
    
    void addOnRegistryReadyListener(final 10o p0);
    
    void clearMockChatMessage();
    
    1eV convert(final H31 p0);
    
    10E createGameMessageView(final Context p0, final int p1, final 10H p2, final 10D p3, final DataChannel p4);
    
    void enter(final 0CH p0, final DataChannel p1, final Room p2);
    
    10p getAutoTranslatePresenter();
    
    List<0zk> getCapsuleHandlers(final int p0);
    
    BottomMessage getCurrentBottomMessage(final long p0);
    
    Class<? extends IPublicScreenWidget> getExtendedPublicScreenWidget();
    
    Class<? extends LiveRecyclableWidget> getExtendedScreenMultiFilterWidget();
    
    Class<? extends LiveRecyclableWidget> getExtendedScreenRadioFilterWidget();
    
    10H getGiftHistoryManager(final DataChannel p0);
    
    10I getGiftHistoryWidgetHelper(final 0CH p0, final DataChannel p1, final TextView p2, final H7p p3, final int p4, final int p5, final 10J p6);
    
    long getHotDuration(final long p0);
    
    10d getNewMessageListener(final DataChannel p0);
    
    List<10o> getOnRegistryReadyListeners();
    
    Class<? extends IPublicScreenWidget> getPublicScreenWidgetClass(final boolean p0);
    
    Long getStartStreamingTimestamp(final long p0);
    
    10q getTextMessageConfig();
    
    void handleCapsuleClick(final 10r p0, final CapsuleMessage p1);
    
    void hideBottomMessage(final long p0, final String p1);
    
    void insertBottomMessage(final long p0, final String p1, final Text p2, final long p3, final PunishEventInfo p4, final int p5, final int p6, final int p7, final int p8, final String p9);
    
    long insertMessage(final long p0, final H31 p1, final boolean p2);
    
    long insertModel(final long p0, final 1eV p1, final boolean p2);
    
    void leave(final DataChannel p0, final Room p1);
    
    ChatMessage mockChatMessage(final long p0, final String p1, final User p2, final int p3, final Got p4);
    
    void onPlayFragmentCreate();
    
    void onStartStreaming(final long p0);
    
    void onStopStreaming(final long p0);
    
    void pin(final long p0, final H31 p1);
    
    void preloadBroadcastLayout();
    
    void removeModelByToken(final long p0, final long p1);
    
    void resetDuration(final long p0);
    
    boolean textDropShadow(final boolean p0);
    
    void updateGameMessageLikeCount(final String p0);
    
    void updateGameMessageViewUserCount(final int p0);
    
    void updateMessage(final long p0, final long p1, final H31 p2);
    
    void updateModel(final long p0, final 1eV p1);
}
