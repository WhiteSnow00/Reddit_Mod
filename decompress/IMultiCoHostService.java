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
import X.Ipf;
import X.IlB;
import X.Rlc;
import X.VxG;
import X.VzU;
import X.0pM;
import X.0pc;
import java.util.List;
import X.Rld;
import X.W0g;
import X.Iph;
import X.IYK;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.Ipg;
import X.W1I;
import X.Rlf;
import com.bytedance.covode.number.Covode;
import X.VzT;
import X.0Vq;

public interface IMultiCoHostService extends 0Vq, VzT
{
    default static {
        Covode.recordClassIndex(8262);
    }
    
    void adjustCaptureAndClippingResolution();
    
    void apply(final Rlf p0, final W1I<Ipg> p1);
    
    void attach(final Room p0, final DataChannel p1, final Context p2);
    
    void cancelAll(final boolean p0);
    
    void cancelApply(final IYK p0, final W1I<Iph> p1);
    
    void cancelInvite(final W0g p0, final W1I<Rld> p1);
    
    void closeMultiGuest(final Runnable p0);
    
    void closeWithModeSwitch();
    
    void detach();
    
    List<0pc> getCoHostLinkedUserList();
    
    0pM getCoHostState();
    
    0pc getCoHostUser(final long p0);
    
    long getCoHostUserCountDown(final long p0);
    
    List<0pc> getCoHostUserList();
    
    0pc getCoHostUserWithLinkMicId(final String p0);
    
    0pc getCoHostUserWithPlayType(final long p0, final boolean p1);
    
    VzU getLinkSession();
    
    void invite(final VxG p0, final W1I<Rlc> p1);
    
    boolean isAttached();
    
    boolean isEnableSDK();
    
    void leave(final IlB p0, final W1I<Ipf> p1);
    
    void onSei(final String p0);
    
    void permitApply(final VxH p0, final W1I<RnI> p1, final Map<String, ?> p2);
    
    void recoverMultiGuest();
    
    void refreshUserList();
    
    void replyInvite(final PSy p0, final W1I<RnJ> p1, final Map<String, ?> p2);
    
    void setEnableSDK(final boolean p0, final String p1);
    
    void startCoHostUI(final ViewGroup p0, final FrameLayout p1, final 0CH p2);
    
     <T> void subscribe(final Class<T> p0, final SRT<? super VzU, ? super 1Wh<T>, 2P9> p1);
    
     <T> void unsubscribe(final Class<T> p0, final SRT<? super VzU, ? super 1Wh<T>, 2P9> p1);
}
