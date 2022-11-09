// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.function;

import X.0AB;
import X.G51;
import X.1nL;
import X.Hca;
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
import X.CTM;
import com.bytedance.covode.number.Covode;

public class RoomFunctionServiceDummy implements IRoomFunctionService
{
    static {
        Covode.recordClassIndex(6827);
    }
    
    public void addOnUserCountVisibilityChangeListener(final long n, final b b) {
        CTM.LIZ((Object)b);
    }
    
    @Override
    public void enter(final 0CH 0ch, final DataChannel dataChannel, final Room room) {
        CTM.LIZ((Object)0ch);
    }
    
    @Override
    public void enterPlayOrBroadCastFragment(final Fragment fragment, final DataChannel dataChannel, final Room room) {
        CTM.LIZ((Object)fragment);
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getCustomPollCardWidget() {
        return null;
    }
    
    @Override
    public 0is getCustomPollManager() {
        return null;
    }
    
    @Override
    public long getGiftPollId() {
        return 0L;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getGiftSelectPollWidget() {
        return null;
    }
    
    @Override
    public LiveRecyclableWidget getLiveGiftPollWidget(final boolean b, final int n) {
        return null;
    }
    
    @Override
    public LiveRecyclableWidget getLiveNormalPollWidget(final boolean b, final int n) {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getLiveRoomNotifyWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getNormalSelectPollWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getStreamInfoWidget() {
        return null;
    }
    
    @Override
    public void guessWord(final String s, final Fragment fragment) {
    }
    
    @Override
    public boolean isDrawGuessing(final DataChannel dataChannel) {
        return false;
    }
    
    @Override
    public boolean isGiftPolling() {
        return false;
    }
    
    @Override
    public void leave(final DataChannel dataChannel, final Room room) {
    }
    
    @Override
    public void leavePlayOrBroadCastFragment(final DataChannel dataChannel, final Room room) {
    }
    
    @Override
    public void likeMicStateChange(final long n, final int n2, final boolean b) {
    }
    
    @Override
    public void loadAudienceInteractionFeatureBehavior(final DataChannel dataChannel, final boolean b) {
    }
    
    @Override
    public void loadCustomPollBehavior(final DataChannel dataChannel) {
    }
    
    @Override
    public LiveRecyclableWidget loadDrawGuessCanvas() {
        return null;
    }
    
    @Override
    public LiveRecyclableWidget loadDrawGuessStatusWidget() {
        return null;
    }
    
    @Override
    public LiveRecyclableWidget loadDrawGuessToolbar(final Fragment fragment) {
        CTM.LIZ((Object)fragment);
        return null;
    }
    
    @Override
    public void loadInteractionFeatureBehavior(final DataChannel dataChannel) {
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public DialogInterface onLongPress(final Context context, final boolean b, final Room room, final GKo gKo, final IHostLongPressCallback hostLongPressCallback, final Jz6 jz6) {
        CTM.LIZ((Object)context, (Object)room, (Object)gKo, (Object)jz6);
        return null;
    }
    
    @Override
    public CwQ provideDialogDispatcher(final 0Bu 0Bu) {
        CTM.LIZ((Object)0Bu);
        CTM.LIZ((Object)0Bu);
        return (CwQ)new Hca();
    }
    
    @Override
    public void releaseDrawGuess() {
    }
    
    @Override
    public void releasePollCountdown() {
    }
    
    @Override
    public boolean shouldShowUserCount(final Room room) {
        return false;
    }
    
    @Override
    public void showCustomPollDialog(final String s, final 1nL 1nL, final DataChannel dataChannel, final boolean b) {
        CTM.LIZ((Object)s, (Object)1nL);
    }
    
    @Override
    public void showLiveEventCardDialog(final 1nL 1nL, final DataChannel dataChannel, final boolean b, final boolean b2, final long n) {
        CTM.LIZ((Object)1nL);
    }
    
    @Override
    public void showManagerDialog(final boolean b, final G51 g51, final 0AB 0ab) {
        CTM.LIZ((Object)g51, (Object)0ab);
    }
}
