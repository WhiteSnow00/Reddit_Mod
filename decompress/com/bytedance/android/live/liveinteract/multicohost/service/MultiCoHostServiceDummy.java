// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multicohost.service;

import X.2P9;
import X.1Wh;
import X.SRT;
import X.0CH;
import android.widget.FrameLayout;
import android.view.ViewGroup;
import X.RnJ;
import X.PSy;
import java.util.Map;
import X.RnI;
import X.VxH;
import X.Vx1;
import X.LLq;
import X.W0N;
import X.Vxk;
import X.RnT;
import X.Vwp;
import X.W1n;
import X.RnM;
import X.RnL;
import X.RnR;
import X.RlZ;
import X.Vwo;
import X.RnS;
import X.RnQ;
import X.RnP;
import X.RnO;
import X.RnN;
import X.Ipf;
import X.IlB;
import X.Qmr;
import X.RmJ;
import X.Rlc;
import X.VxG;
import X.Vwg;
import X.VzU;
import X.0pM;
import X.6uH;
import X.0pc;
import java.util.List;
import X.Rld;
import X.W0g;
import X.Iph;
import X.IYK;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.CTM;
import X.Ipg;
import X.W1I;
import X.Rlf;
import com.bytedance.covode.number.Covode;

public class MultiCoHostServiceDummy implements IMultiCoHostService
{
    static {
        Covode.recordClassIndex(8264);
    }
    
    @Override
    public void adjustCaptureAndClippingResolution() {
    }
    
    @Override
    public void apply(final Rlf rlf, final W1I<Ipg> w1I) {
        CTM.LIZ((Object)rlf);
    }
    
    @Override
    public void attach(final Room room, final DataChannel dataChannel, final Context context) {
    }
    
    @Override
    public void cancelAll(final boolean b) {
    }
    
    @Override
    public void cancelApply(final IYK iyk, final W1I<Iph> w1I) {
        CTM.LIZ((Object)iyk);
    }
    
    @Override
    public void cancelInvite(final W0g w0g, final W1I<Rld> w1I) {
        CTM.LIZ((Object)w0g);
    }
    
    @Override
    public void closeMultiGuest(final Runnable runnable) {
    }
    
    @Override
    public void closeWithModeSwitch() {
    }
    
    @Override
    public void detach() {
    }
    
    @Override
    public List<0pc> getCoHostLinkedUserList() {
        return (List<0pc>)6uH.INSTANCE;
    }
    
    @Override
    public 0pM getCoHostState() {
        return 0pM.None;
    }
    
    @Override
    public 0pc getCoHostUser(final long n) {
        return null;
    }
    
    @Override
    public long getCoHostUserCountDown(final long n) {
        return 0L;
    }
    
    @Override
    public List<0pc> getCoHostUserList() {
        return (List<0pc>)6uH.INSTANCE;
    }
    
    @Override
    public 0pc getCoHostUserWithLinkMicId(final String s) {
        CTM.LIZ((Object)s);
        return null;
    }
    
    @Override
    public 0pc getCoHostUserWithPlayType(final long n, final boolean b) {
        return null;
    }
    
    @Override
    public VzU getLinkSession() {
        return null;
    }
    
    public List<Vwg> getLinkUserList() {
        return (List<Vwg>)6uH.INSTANCE;
    }
    
    @Override
    public void invite(final VxG vxG, final W1I<Rlc> w1I) {
        CTM.LIZ((Object)vxG);
    }
    
    @Override
    public boolean isAttached() {
        return false;
    }
    
    @Override
    public boolean isEnableSDK() {
        return false;
    }
    
    public void kickOut(final RmJ rmJ, final W1I<Qmr> w1I) {
        CTM.LIZ((Object)rmJ);
    }
    
    @Override
    public void leave(final IlB ilB, final W1I<Ipf> w1I) {
        CTM.LIZ((Object)ilB);
    }
    
    public void onApplyMessageReceived(final VzU vzU, final RnN rnN) {
        CTM.LIZ((Object)vzU, (Object)rnN);
        CTM.LIZ((Object)vzU, (Object)rnN);
        CTM.LIZ((Object)vzU, (Object)rnN);
    }
    
    public void onAudioMute(final long n, final String s, final boolean b) {
        CTM.LIZ((Object)s);
        a.LIZ(s);
    }
    
    public void onCancelApplyMessageReceived(final VzU vzU, final RnO rnO) {
        CTM.LIZ((Object)vzU, (Object)rnO);
        CTM.LIZ((Object)vzU, (Object)rnO);
        CTM.LIZ((Object)vzU, (Object)rnO);
    }
    
    public void onCancelInviteMessageReceived(final VzU vzU, final RnP rnP) {
        CTM.LIZ((Object)vzU, (Object)rnP);
        CTM.LIZ((Object)vzU, (Object)rnP);
        CTM.LIZ((Object)vzU, (Object)rnP);
    }
    
    public void onCreateChannelMessageReceived(final VzU vzU, final RnQ rnQ) {
        CTM.LIZ((Object)vzU, (Object)rnQ);
        CTM.LIZ((Object)vzU, (Object)rnQ);
        CTM.LIZ((Object)vzU, (Object)rnQ);
    }
    
    public void onDestroyChannelMessageReceived(final VzU vzU, final RnS rnS) {
        CTM.LIZ((Object)vzU, (Object)rnS);
        CTM.LIZ((Object)vzU, (Object)rnS);
        CTM.LIZ((Object)vzU, (Object)rnS);
    }
    
    public void onFirstRemoteAudio(final VzU vzU, final Vwg vwg) {
        CTM.LIZ((Object)vzU, (Object)vwg);
        a.LIZ(vzU, vwg);
    }
    
    public void onFirstRemoteVideoFrame(final VzU vzU, final Vwg vwg) {
        CTM.LIZ((Object)vzU, (Object)vwg);
        a.LIZIZ(vzU, vwg);
    }
    
    public void onFirstRemoteVideoFrameRender(final VzU vzU, final Vwg vwg) {
        CTM.LIZ((Object)vzU, (Object)vwg);
        CTM.LIZ((Object)vzU, (Object)vwg);
        CTM.LIZ((Object)vzU, (Object)vwg);
    }
    
    @Override
    public void onInit() {
    }
    
    public void onInviteMessageReceived(final VzU vzU, final Vwo vwo) {
        CTM.LIZ((Object)vzU, (Object)vwo);
        CTM.LIZ((Object)vzU, (Object)vwo);
        CTM.LIZ((Object)vzU, (Object)vwo);
    }
    
    public void onJoinChannelMessageReceived(final VzU vzU, final RlZ rlZ) {
        CTM.LIZ((Object)vzU, (Object)rlZ);
        a.LIZ(vzU, rlZ);
    }
    
    public void onJoinDirectMessageReceived(final VzU vzU, final RnR rnR) {
        CTM.LIZ((Object)vzU, (Object)rnR);
        a.LIZ(vzU, rnR);
    }
    
    public void onKickOutMessageReceived(final VzU vzU, final RnL rnL) {
        CTM.LIZ((Object)vzU, (Object)rnL);
        a.LIZ(vzU, rnL);
    }
    
    public void onLeaveMessageReceived(final VzU vzU, final RnM rnM) {
        CTM.LIZ((Object)vzU, (Object)rnM);
        CTM.LIZ((Object)vzU, (Object)rnM);
        CTM.LIZ((Object)vzU, (Object)rnM);
    }
    
    public void onLinkMicFinishReason(final VzU vzU, final int n) {
        CTM.LIZ((Object)vzU);
        CTM.LIZ((Object)vzU);
        CTM.LIZ((Object)vzU);
    }
    
    public void onLinkMicStateChanged(final VzU vzU, final int n) {
        CTM.LIZ((Object)vzU);
        CTM.LIZ((Object)vzU);
        CTM.LIZ((Object)vzU);
    }
    
    public void onLocalLinkedListDidChange(final List<Vwg> list, final List<Vwg> list2) {
        CTM.LIZ((Object)list, (Object)list2);
    }
    
    public void onLocalLinkedListWillChange(final List<Vwg> list, final List<Vwg> list2) {
        CTM.LIZ((Object)list, (Object)list2);
    }
    
    public void onNeedJoinChannel(final W1n w1n) {
        CTM.LIZ((Object)w1n);
        CTM.LIZ((Object)w1n);
        CTM.LIZ((Object)w1n);
    }
    
    public void onPermitApplyMessageReceived(final VzU vzU, final Vwp vwp) {
        CTM.LIZ((Object)vzU, (Object)vwp);
        CTM.LIZ((Object)vzU, (Object)vwp);
        CTM.LIZ((Object)vzU, (Object)vwp);
    }
    
    public void onReceivedSei(final String s) {
        CTM.LIZ((Object)s);
        a.LIZIZ(s);
    }
    
    public void onRemoteMute(final boolean b, final String s, final boolean b2) {
        CTM.LIZ((Object)s);
    }
    
    public void onReplyInviteMessageReceived(final VzU vzU, final RnT rnT) {
        CTM.LIZ((Object)vzU, (Object)rnT);
        CTM.LIZ((Object)vzU, (Object)rnT);
        CTM.LIZ((Object)vzU, (Object)rnT);
    }
    
    public void onRoomMsgReceived(final VzU vzU, final String s, final String s2) {
        CTM.LIZ((Object)vzU, (Object)s, (Object)s2);
        a.LIZ(vzU, s, s2);
    }
    
    public void onRoomMsgSentResult(final long n, final int n2) {
    }
    
    public void onRtcEndResult(final VzU vzU, final boolean b, final Vxk vxk) {
        CTM.LIZ((Object)vzU);
        a.LIZ(vzU);
    }
    
    public void onRtcError(final VzU vzU, final Vxk vxk) {
        CTM.LIZ((Object)vzU, (Object)vxk);
        a.LIZ(vzU, vxk);
    }
    
    public void onRtcInit(final VzU vzU, final W0N w0N) {
        CTM.LIZ((Object)vzU);
        a.LIZIZ(vzU);
    }
    
    public void onRtcStartResult(final VzU vzU, final LLq lLq) {
        CTM.LIZ((Object)vzU, (Object)lLq);
        a.LIZ(vzU, lLq);
    }
    
    @Override
    public void onSei(final String s) {
    }
    
    public void onSendRtcRoomMessage(final VzU vzU, final String s) {
        CTM.LIZ((Object)vzU, (Object)s);
    }
    
    public void onStartJoinRtcChannel() {
    }
    
    public void onStartPushStream(final VzU vzU) {
        CTM.LIZ((Object)vzU);
        a.LIZJ(vzU);
    }
    
    public void onTalkStateUpdated(final String[] array, final boolean[] array2, final int[] array3) {
    }
    
    public String onTriggerSei() {
        return null;
    }
    
    public void onTurnOffEngine(final String s) {
        CTM.LIZ((Object)s);
        a.LIZJ(s);
    }
    
    public void onUserJoined(final VzU vzU, final Vwg vwg, final Vx1 vx1) {
        CTM.LIZ((Object)vzU, (Object)vwg);
        CTM.LIZ((Object)vzU, (Object)vwg);
        CTM.LIZ((Object)vzU, (Object)vwg);
    }
    
    public void onUserLeft(final String s, final long n) {
        CTM.LIZ((Object)s);
    }
    
    public void onUserListChanged(final VzU vzU, final List<Vwg> list, final List<Vwg> list2, final List<Vwg> list3, final String s, final Vx1 vx1) {
        CTM.LIZ((Object)vzU, (Object)list, (Object)list2, (Object)list3);
        CTM.LIZ((Object)vzU, (Object)list, (Object)list2, (Object)list3);
        CTM.LIZ((Object)vzU, (Object)list, (Object)list2, (Object)list3);
    }
    
    public void onUserMsgReceived(final VzU vzU, final String s, final String s2) {
        CTM.LIZ((Object)vzU, (Object)s, (Object)s2);
        a.LIZIZ(vzU, s, s2);
    }
    
    public void onVideoMute(final long n, final String s, final boolean b) {
        CTM.LIZ((Object)s);
        a.LIZLLL(s);
    }
    
    @Override
    public void permitApply(final VxH vxH, final W1I<RnI> w1I, final Map<String, ?> map) {
        CTM.LIZ((Object)vxH);
    }
    
    @Override
    public void recoverMultiGuest() {
    }
    
    @Override
    public void refreshUserList() {
    }
    
    @Override
    public void replyInvite(final PSy pSy, final W1I<RnJ> w1I, final Map<String, ?> map) {
        CTM.LIZ((Object)pSy);
    }
    
    @Override
    public void setEnableSDK(final boolean b, final String s) {
        CTM.LIZ((Object)s);
    }
    
    @Override
    public void startCoHostUI(final ViewGroup viewGroup, final FrameLayout frameLayout, final 0CH 0ch) {
        CTM.LIZ((Object)viewGroup, (Object)frameLayout, (Object)0ch);
    }
    
    @Override
    public <T> void subscribe(final Class<T> clazz, final SRT<? super VzU, ? super 1Wh<T>, 2P9> srt) {
        CTM.LIZ((Object)clazz, (Object)srt);
    }
    
    @Override
    public <T> void unsubscribe(final Class<T> clazz, final SRT<? super VzU, ? super 1Wh<T>, 2P9> srt) {
        CTM.LIZ((Object)clazz, (Object)srt);
    }
}
