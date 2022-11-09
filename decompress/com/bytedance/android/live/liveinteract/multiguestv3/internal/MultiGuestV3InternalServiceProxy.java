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
import X.2Ij;
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
import X.CTM;
import com.bytedance.android.live.liveinteract.multilive.model.GuestMicCameraManageResponse;
import X.1dl;
import X.FBF;
import X.1Wc;
import X.0d8;
import X.0ba;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3ServiceRefactorSetting;
import com.bytedance.covode.number.Covode;
import X.5DO;

public class MultiGuestV3InternalServiceProxy implements IMultiGuestV3InternalService
{
    public MultiGuestV3InternalServiceImpl service;
    public final 5DO serviceSingleton$delegate;
    
    static {
        Covode.recordClassIndex(8888);
    }
    
    public MultiGuestV3InternalServiceProxy() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: getstatic       X/21x.LIZ:LX/21x;
        //     8: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    11: putfield        com/bytedance/android/live/liveinteract/multiguestv3/internal/MultiGuestV3InternalServiceProxy.serviceSingleton$delegate:LX/5DO;
        //    14: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:162)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:137)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:333)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:254)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:129)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final MultiGuestV3InternalServiceImpl getRealServiceImpl() {
        final StringBuilder sb = new StringBuilder("getRealServiceImpl currentSetting=");
        sb.append(LinkMicMultiGuestV3ServiceRefactorSetting.getValue());
        0ba.LIZ(3, "MultiGuestV3InternalServiceProxy", sb.toString());
        MultiGuestV3InternalServiceImpl multiGuestV3InternalServiceImpl;
        if (LinkMicMultiGuestV3ServiceRefactorSetting.getValue()) {
            if (this.service == null) {
                0d8.LIZ(new Throwable(), "Service should not be empty!!!");
            }
            if ((multiGuestV3InternalServiceImpl = this.service) == null) {
                return new MultiGuestV3InternalServiceImpl();
            }
        }
        else {
            multiGuestV3InternalServiceImpl = this.getServiceSingleton();
        }
        return multiGuestV3InternalServiceImpl;
    }
    
    private final MultiGuestV3InternalServiceImpl getServiceSingleton() {
        return (MultiGuestV3InternalServiceImpl)this.serviceSingleton$delegate.getValue();
    }
    
    @Override
    public void adjustResolutionWhenFallBack() {
        this.getRealServiceImpl().adjustResolutionWhenFallBack();
    }
    
    @Override
    public FBF<1dl<GuestMicCameraManageResponse>> anchorMuteGuest(final 1Wc 1Wc) {
        CTM.LIZ((Object)1Wc);
        return this.getRealServiceImpl().anchorMuteGuest(1Wc);
    }
    
    @Override
    public void apply(final Rlf rlf, final W1I<Ipg> w1I) {
        CTM.LIZ((Object)rlf);
        this.getRealServiceImpl().apply(rlf, w1I);
    }
    
    @Override
    public void cancelApply(final IYK iyk, final W1I<Iph> w1I) {
        CTM.LIZ((Object)iyk);
        this.getRealServiceImpl().cancelApply(iyk, w1I);
    }
    
    @Override
    public FAE<Rld> cancelInvite(final W0g w0g) {
        CTM.LIZ((Object)w0g);
        return this.getRealServiceImpl().cancelInvite(w0g);
    }
    
    @Override
    public void changeMaxPosition(final 2SD 2sd, final W1I<Qms> w1I) {
        CTM.LIZ((Object)2sd);
        this.getRealServiceImpl().changeMaxPosition(2sd, w1I);
    }
    
    @Override
    public String channelId() {
        return this.getRealServiceImpl().channelId();
    }
    
    @Override
    public void createChannel(final 2U9 2u9, final W1I<Qmw> w1I) {
        CTM.LIZ((Object)2u9);
        this.getRealServiceImpl().createChannel(2u9, w1I);
    }
    
    @Override
    public void destroyChannel(final W1m w1m, final W1I<Qmt> w1I) {
        CTM.LIZ((Object)w1m);
        this.getRealServiceImpl().destroyChannel(w1m, w1I);
    }
    
    @Override
    public void detach() {
        this.getRealServiceImpl().detach();
    }
    
    @Override
    public void disposeCancelInviteDisposable(final long n) {
        this.getRealServiceImpl().disposeCancelInviteDisposable(n);
    }
    
    @Override
    public Set<Long> getHasAppliedUidSetWhenIsAnchor() {
        return this.getRealServiceImpl().getHasAppliedUidSetWhenIsAnchor();
    }
    
    @Override
    public Set<Long> getHasInvitedUidSetWhenIsAnchor() {
        return this.getRealServiceImpl().getHasInvitedUidSetWhenIsAnchor();
    }
    
    @Override
    public int getLinkMicState() {
        return this.getRealServiceImpl().getLinkMicState();
    }
    
    @Override
    public Map<String, String> getSceneLayoutIdMap() {
        return this.getRealServiceImpl().getSceneLayoutIdMap();
    }
    
    @Override
    public void hookJoinChannel(final QgG<Boolean> qgG) {
        CTM.LIZ((Object)qgG);
        this.getRealServiceImpl().hookJoinChannel(qgG);
    }
    
    @Override
    public void init(final Room room, final String s, final Context context) {
        CTM.LIZ((Object)room);
        this.getRealServiceImpl().init(room, s, context);
    }
    
    @Override
    public FAE<Rlc> invite(final VxG vxG) {
        CTM.LIZ((Object)vxG);
        return this.getRealServiceImpl().invite(vxG);
    }
    
    @Override
    public void invite(final VxG vxG, final W1I<Rlc> w1I) {
        CTM.LIZ((Object)vxG);
        this.getRealServiceImpl().invite(vxG, w1I);
    }
    
    @Override
    public boolean isRtcEngineOn() {
        return this.getRealServiceImpl().isRtcEngineOn();
    }
    
    @Override
    public boolean isRtcLocked() {
        return this.getRealServiceImpl().isRtcLocked();
    }
    
    @Override
    public void joinChannel(final 2P1 2p1, final W1I<Qmq> w1I) {
        CTM.LIZ((Object)2p1);
        this.getRealServiceImpl().joinChannel(2p1, w1I);
    }
    
    public void joinDirect(final 2Ij 2Ij, final W1I<Object> w1I) {
        CTM.LIZ((Object)2Ij);
        CTM.LIZ((Object)2Ij);
    }
    
    @Override
    public void kickOut(final RmJ rmJ, final W1I<Qmr> w1I) {
        CTM.LIZ((Object)rmJ);
        this.getRealServiceImpl().kickOut(rmJ, w1I);
    }
    
    @Override
    public VvS layoutManager() {
        return this.getRealServiceImpl().layoutManager();
    }
    
    @Override
    public void leaveChannel(final IlB ilB, final W1I<Ipf> w1I) {
        CTM.LIZ((Object)ilB);
        this.getRealServiceImpl().leaveChannel(ilB, w1I);
    }
    
    @Override
    public VvO micPositionManager() {
        return this.getRealServiceImpl().micPositionManager();
    }
    
    @Override
    public void onInit() {
    }
    
    @Override
    public void onLinkControlWidgetCreate(final Room room, final Context context) {
        final StringBuilder sb = new StringBuilder("onLinkControlWidgetCreate room=");
        sb.append(room);
        sb.append(" context=");
        sb.append(context);
        0ba.LIZ(3, "MultiGuestV3InternalServiceProxy", sb.toString());
        if (LinkMicMultiGuestV3ServiceRefactorSetting.getValue()) {
            final MultiGuestV3InternalServiceImpl service = new MultiGuestV3InternalServiceImpl();
            service.onLinkControlWidgetCreate(room, context);
            this.service = service;
        }
    }
    
    @Override
    public void onLinkControlWidgetDestroy() {
        0ba.LIZ(3, "MultiGuestV3InternalServiceProxy", "onLinkControlWidgetDestroy");
        if (LinkMicMultiGuestV3ServiceRefactorSetting.getValue()) {
            final MultiGuestV3InternalServiceImpl service = this.service;
            if (service != null) {
                service.onLinkControlWidgetDestroy();
            }
            this.service = null;
        }
    }
    
    @Override
    public void permitApply(final VxH vxH, final W1I<RnI> w1I) {
        CTM.LIZ((Object)vxH);
        this.getRealServiceImpl().permitApply(vxH, w1I);
    }
    
    @Override
    public void replyInvite(final PSy pSy, final W1I<RnJ> w1I) {
        CTM.LIZ((Object)pSy);
        this.getRealServiceImpl().replyInvite(pSy, w1I);
    }
    
    @Override
    public W1b rtcManager() {
        return this.getRealServiceImpl().rtcManager();
    }
    
    @Override
    public int scene() {
        return this.getRealServiceImpl().scene();
    }
    
    @Override
    public LLU selfLinkInfo() {
        return this.getRealServiceImpl().selfLinkInfo();
    }
    
    @Override
    public void sendSeiToSDK(final String s, final SRS<? super L76, 2P9> srs) {
        CTM.LIZ((Object)srs);
        this.getRealServiceImpl().sendSeiToSDK(s, srs);
    }
    
    @Override
    public <T> IMultiGuestV3InternalService subscribe(final Class<T> clazz, final SRT<? super VzU, ? super 1Wh<T>, 2P9> srt) {
        CTM.LIZ((Object)clazz, (Object)srt);
        final MultiGuestV3InternalServiceImpl realServiceImpl = this.getRealServiceImpl();
        realServiceImpl.subscribe(clazz, srt);
        return realServiceImpl;
    }
    
    @Override
    public <T> IMultiGuestV3InternalService unsubscribe(final Class<T> clazz, final SRT<? super VzU, ? super 1Wh<T>, 2P9> srt) {
        CTM.LIZ((Object)clazz, (Object)srt);
        final MultiGuestV3InternalServiceImpl realServiceImpl = this.getRealServiceImpl();
        realServiceImpl.unsubscribe(clazz, srt);
        return realServiceImpl;
    }
    
    @Override
    public <T> void unsubscribeCreateChannelMsg() {
        this.getRealServiceImpl().unsubscribeCreateChannelMsg();
    }
    
    @Override
    public void updateLayoutParam(final String s) {
        CTM.LIZ((Object)s);
        CTM.LIZ((Object)s);
    }
    
    @Override
    public void updateLiveConfig(final W0N w0N) {
        CTM.LIZ((Object)w0N);
        this.getRealServiceImpl().updateLiveConfig(w0N);
    }
    
    @Override
    public VvR userManager() {
        return this.getRealServiceImpl().userManager();
    }
}
