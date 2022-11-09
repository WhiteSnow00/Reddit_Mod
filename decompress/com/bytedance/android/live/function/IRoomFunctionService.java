// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.function;

import X.0AB;
import X.G51;
import X.1nL;
import X.CwQ;
import X.0Bu;
import android.content.DialogInterface;
import X.Jz6;
import com.bytedance.android.livesdk.callback.IHostLongPressCallback;
import X.GKo;
import android.content.Context;
import X.0is;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.0CH;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IRoomFunctionService extends 0Vq
{
    default static {
        Covode.recordClassIndex(6824);
    }
    
    void addOnUserCountVisibilityChangeListener(final long p0, final IRoomFunctionService.b p1);
    
    void enter(final 0CH p0, final DataChannel p1, final Room p2);
    
    void enterPlayOrBroadCastFragment(final Fragment p0, final DataChannel p1, final Room p2);
    
    Class<? extends LiveRecyclableWidget> getCustomPollCardWidget();
    
    0is getCustomPollManager();
    
    long getGiftPollId();
    
    Class<? extends LiveRecyclableWidget> getGiftSelectPollWidget();
    
    LiveRecyclableWidget getLiveGiftPollWidget(final boolean p0, final int p1);
    
    LiveRecyclableWidget getLiveNormalPollWidget(final boolean p0, final int p1);
    
    Class<? extends LiveRecyclableWidget> getLiveRoomNotifyWidget();
    
    Class<? extends LiveRecyclableWidget> getNormalSelectPollWidget();
    
    Class<? extends LiveRecyclableWidget> getStreamInfoWidget();
    
    void guessWord(final String p0, final Fragment p1);
    
    boolean isDrawGuessing(final DataChannel p0);
    
    boolean isGiftPolling();
    
    void leave(final DataChannel p0, final Room p1);
    
    void leavePlayOrBroadCastFragment(final DataChannel p0, final Room p1);
    
    void likeMicStateChange(final long p0, final int p1, final boolean p2);
    
    void loadAudienceInteractionFeatureBehavior(final DataChannel p0, final boolean p1);
    
    void loadCustomPollBehavior(final DataChannel p0);
    
    LiveRecyclableWidget loadDrawGuessCanvas();
    
    LiveRecyclableWidget loadDrawGuessStatusWidget();
    
    LiveRecyclableWidget loadDrawGuessToolbar(final Fragment p0);
    
    void loadInteractionFeatureBehavior(final DataChannel p0);
    
    DialogInterface onLongPress(final Context p0, final boolean p1, final Room p2, final GKo p3, final IHostLongPressCallback p4, final Jz6 p5);
    
    CwQ provideDialogDispatcher(final 0Bu p0);
    
    void releaseDrawGuess();
    
    void releasePollCountdown();
    
    boolean shouldShowUserCount(final Room p0);
    
    void showCustomPollDialog(final String p0, final 1nL p1, final DataChannel p2, final boolean p3);
    
    void showLiveEventCardDialog(final 1nL p0, final DataChannel p1, final boolean p2, final boolean p3, final long p4);
    
    void showManagerDialog(final boolean p0, final G51 p1, final 0AB p2);
}
