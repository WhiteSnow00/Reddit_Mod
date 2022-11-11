// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguestv3.internal;

import X.VvR;
import X.W0N;
import X.1Wh;
import X.VzU;
import X.SRT;
import X.2P9;
import X.L76;
import X.SRS;
import X.LLU;
import X.W1b;
import X.RnJ;
import X.PSy;
import X.RnI;
import X.VxH;
import X.VvO;
import X.Ipf;
import X.IlB;
import X.VvS;
import X.Qmr;
import X.RmJ;
import X.Qmq;
import X.2P1;
import X.Rlc;
import X.VxG;
import android.content.Context;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.QgG;
import java.util.Map;
import java.util.Set;
import X.Qmt;
import X.W1m;
import X.Qmw;
import X.2U9;
import X.Qms;
import X.2SD;
import X.Rld;
import X.FAE;
import X.W0g;
import X.Iph;
import X.IYK;
import X.Ipg;
import X.W1I;
import X.Rlf;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import X.1dl;
import X.FBF;
import X.1Wc;
import com.bytedance.covode.number.Covode;
import X.0Vq;

public interface IMultiGuestV3InternalService extends 0Vq
{
    default static {
        Covode.recordClassIndex(8873);
    }
    
    void adjustResolutionWhenFallBack();
    
    FBF<1dl<GuestMicCameraManageResponse>> anchorMuteGuest(final 1Wc p0);
    
    void apply(final Rlf p0, final W1I<Ipg> p1);
    
    void cancelApply(final IYK p0, final W1I<Iph> p1);
    
    FAE<Rld> cancelInvite(final W0g p0);
    
    void changeMaxPosition(final 2SD p0, final W1I<Qms> p1);
    
    String channelId();
    
    void createChannel(final 2U9 p0, final W1I<Qmw> p1);
    
    void destroyChannel(final W1m p0, final W1I<Qmt> p1);
    
    void detach();
    
    void disposeCancelInviteDisposable(final long p0);
    
    Set<Long> getHasAppliedUidSetWhenIsAnchor();
    
    Set<Long> getHasInvitedUidSetWhenIsAnchor();
    
    int getLinkMicState();
    
    Map<String, String> getSceneLayoutIdMap();
    
    void hookJoinChannel(final QgG<Boolean> p0);
    
    void init(final Room p0, final String p1, final Context p2);
    
    FAE<Rlc> invite(final VxG p0);
    
    void invite(final VxG p0, final W1I<Rlc> p1);
    
    boolean isRtcEngineOn();
    
    boolean isRtcLocked();
    
    void joinChannel(final 2P1 p0, final W1I<Qmq> p1);
    
    void kickOut(final RmJ p0, final W1I<Qmr> p1);
    
    VvS layoutManager();
    
    void leaveChannel(final IlB p0, final W1I<Ipf> p1);
    
    VvO micPositionManager();
    
    void onLinkControlWidgetCreate(final Room p0, final Context p1);
    
    void onLinkControlWidgetDestroy();
    
    void permitApply(final VxH p0, final W1I<RnI> p1);
    
    void replyInvite(final PSy p0, final W1I<RnJ> p1);
    
    W1b rtcManager();
    
    int scene();
    
    LLU selfLinkInfo();
    
    void sendSeiToSDK(final String p0, final SRS<? super L76, 2P9> p1);
    
     <T> IMultiGuestV3InternalService subscribe(final Class<T> p0, final SRT<? super VzU, ? super 1Wh<T>, 2P9> p1);
    
     <T> IMultiGuestV3InternalService unsubscribe(final Class<T> p0, final SRT<? super VzU, ? super 1Wh<T>, 2P9> p1);
    
     <T> void unsubscribeCreateChannelMsg();
    
    void updateLayoutParam(final String p0);
    
    void updateLiveConfig(final W0N p0);
    
    VvR userManager();
}
