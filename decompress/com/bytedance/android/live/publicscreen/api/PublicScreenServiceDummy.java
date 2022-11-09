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
import X.6uH;
import X.10d;
import X.10I;
import X.10J;
import X.H7p;
import android.widget.TextView;
import com.bytedance.android.livesdk.model.message.BottomMessage;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
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
import X.CTM;
import X.10o;
import X.0zk;
import com.bytedance.covode.number.Covode;

public class PublicScreenServiceDummy implements IPublicScreenService
{
    static {
        Covode.recordClassIndex(10620);
    }
    
    @Override
    public void addCapsuleHandler(final int n, final 0zk 0zk) {
    }
    
    @Override
    public void addOnRegistryReadyListener(final 10o 10o) {
        CTM.LIZ((Object)10o);
    }
    
    @Override
    public void clearMockChatMessage() {
    }
    
    @Override
    public 1eV convert(final H31 h31) {
        return null;
    }
    
    @Override
    public 10E createGameMessageView(final Context context, final int n, final 10H 10H, final 10D 10D, final DataChannel dataChannel) {
        CTM.LIZ((Object)context, (Object)10D, (Object)dataChannel);
        return null;
    }
    
    @Override
    public void enter(final 0CH 0ch, final DataChannel dataChannel, final Room room) {
        CTM.LIZ((Object)0ch);
    }
    
    @Override
    public 10p getAutoTranslatePresenter() {
        return null;
    }
    
    @Override
    public List<0zk> getCapsuleHandlers(final int n) {
        return null;
    }
    
    public Class<? extends LiveRecyclableWidget> getCommitPinWidget() {
        return null;
    }
    
    @Override
    public BottomMessage getCurrentBottomMessage(final long n) {
        return null;
    }
    
    @Override
    public Class<? extends IPublicScreenWidget> getExtendedPublicScreenWidget() {
        return null;
    }
    
    public Class<? extends LiveRecyclableWidget> getExtendedScreenFilterWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getExtendedScreenMultiFilterWidget() {
        return null;
    }
    
    @Override
    public Class<? extends LiveRecyclableWidget> getExtendedScreenRadioFilterWidget() {
        return null;
    }
    
    @Override
    public 10H getGiftHistoryManager(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        return null;
    }
    
    @Override
    public 10I getGiftHistoryWidgetHelper(final 0CH 0ch, final DataChannel dataChannel, final TextView textView, final H7p h7p, final int n, final int n2, final 10J 10J) {
        CTM.LIZ((Object)0ch, (Object)dataChannel, (Object)textView, (Object)h7p, (Object)10J);
        return null;
    }
    
    @Override
    public long getHotDuration(final long n) {
        return 0L;
    }
    
    @Override
    public 10d getNewMessageListener(final DataChannel dataChannel) {
        CTM.LIZ((Object)dataChannel);
        return null;
    }
    
    @Override
    public List<10o> getOnRegistryReadyListeners() {
        return (List<10o>)6uH.INSTANCE;
    }
    
    @Override
    public Class<? extends IPublicScreenWidget> getPublicScreenWidgetClass(final boolean b) {
        return null;
    }
    
    @Override
    public Long getStartStreamingTimestamp(final long n) {
        return null;
    }
    
    @Override
    public 10q getTextMessageConfig() {
        return null;
    }
    
    @Override
    public void handleCapsuleClick(final 10r 10r, final CapsuleMessage capsuleMessage) {
        CTM.LIZ((Object)10r, (Object)capsuleMessage);
    }
    
    @Override
    public void hideBottomMessage(final long n, final String s) {
        CTM.LIZ((Object)s);
    }
    
    @Override
    public void insertBottomMessage(final long n, final String s, final Text text, final long n2, final PunishEventInfo punishEventInfo, final int n3, final int n4, final int n5, final int n6, final String s2) {
    }
    
    @Override
    public long insertMessage(final long n, final H31 h31, final boolean b) {
        CTM.LIZ((Object)h31);
        return 0L;
    }
    
    public long insertModel(final long n, final 1eV 1eV) {
        CTM.LIZ((Object)1eV);
        return 0L;
    }
    
    @Override
    public long insertModel(final long n, final 1eV 1eV, final boolean b) {
        CTM.LIZ((Object)1eV);
        return 0L;
    }
    
    @Override
    public void leave(final DataChannel dataChannel, final Room room) {
    }
    
    @Override
    public ChatMessage mockChatMessage(final long n, final String s, final User user, final int n2, final Got got) {
        return null;
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void onPlayFragmentCreate() {
    }
    
    @Override
    public void onStartStreaming(final long n) {
    }
    
    @Override
    public void onStopStreaming(final long n) {
    }
    
    @Override
    public void pin(final long n, final H31 h31) {
        CTM.LIZ((Object)h31);
    }
    
    @Override
    public void preloadBroadcastLayout() {
    }
    
    @Override
    public void removeModelByToken(final long n, final long n2) {
    }
    
    public void removeOnRegistryReadyListener(final 10o 10o) {
        CTM.LIZ((Object)10o);
    }
    
    @Override
    public void resetDuration(final long n) {
    }
    
    @Override
    public boolean textDropShadow(final boolean b) {
        return false;
    }
    
    @Override
    public void updateGameMessageLikeCount(final String s) {
        CTM.LIZ((Object)s);
    }
    
    @Override
    public void updateGameMessageViewUserCount(final int n) {
    }
    
    @Override
    public void updateMessage(final long n, final long n2, final H31 h31) {
        CTM.LIZ((Object)h31);
    }
    
    @Override
    public void updateModel(final long n, final 1eV 1eV) {
        CTM.LIZ((Object)1eV);
    }
}
