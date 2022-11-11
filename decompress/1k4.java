// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.bytedance.android.live.liveinteract.match.widget.LinkBattleWidget;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveNetworkTypeModeRateSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceRatingHighSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveEnablePerPushInteractiveStreamSetting;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.live.base.model.user.User;
import android.view.SurfaceView;
import java.util.concurrent.TimeUnit;
import com.bytedance.android.livesdk.livesetting.linkmic.LivePkConnectTimeoutIntervalSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicConnectTimeoutIntervalSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.internal.IMultiGuestV3InternalService;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import com.ss.bytertc.engine.RTCEngine;
import com.ss.avframework.livestreamv2.core.interact.Client;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.bytedance.android.livesdk.livesetting.broadcast.CoHostPerceptionEnableSetting;
import com.ss.avframework.livestreamv2.core.interact.model.Config$Vendor;
import com.bytedance.android.livesdk.livesetting.linkmic.RtcAbLabelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostSeiTalkSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.ss.avframework.livestreamv2.core.interact.model.Config$Type;
import com.ss.avframework.livestreamv2.core.interact.model.Config$MixStreamType;
import com.ss.avframework.livestreamv2.core.interact.model.Config$InteractMode;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.ss.avframework.livestreamv2.core.interact.model.Config$Character;
import com.ss.avframework.livestreamv2.core.interact.Client$StreamMixer;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import android.text.TextUtils;
import com.bytedance.ttnet.TTNetInit;
import com.ss.avframework.livestreamv2.core.interact.model.Config$VideoQuality;
import java.util.Map;
import java.util.HashMap;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import org.json.JSONObject;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

public final class 1k4 extends GpV<a> implements 1co, 1cq, 0xP, OnMessageListener
{
    public Room LIZ;
    public boolean LIZIZ;
    public DataChannel LIZJ;
    public 1NN LIZLLL;
    public 1lJ LJ;
    @0kW(LIZ = "RTC_CONTROLLER")
    public 1cu LJFF;
    public 2fc LJI;
    public 0y0 LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public int LJIILLIIL;
    @0kW(LIZ = "LINKER_MANAGER")
    public 0xL LJIIZILJ;
    @0kW(LIZ = "LIVE_VIDEO_CLIENT_FACTORY", LIZIZ = true)
    public L6w LJIJ;
    @0kW(LIZ = "LINK_MESSAGE_CENTER")
    public 1cs LJIJI;
    public 0lO LJIJJ;
    public 0lP LJIJJLI;
    public final 1mj LJIL;
    
    static {
        Covode.recordClassIndex(7276);
    }
    
    public 1k4(final DataChannel lizj) {
        this.LJIILLIIL = -1;
        this.LJIJJ = new 0lO();
        this.LJIJJLI = new 0lP();
        this.LJIL = new 1vY(this);
        this.LIZJ = lizj;
        this.LIZ = (Room)lizj.LIZIZ((Class)G69.class);
        this.LIZIZ = (boolean)lizj.LIZIZ((Class)G5l.class);
        1jw.LIZ.LIZ(1NN.LLFF.LIZ(), null);
        1jw.LIZ.LIZ(new 1cu(), null);
        1jw.LIZ.LIZ(this);
    }
    
    private void LIZJ(final Cert cert) {
        if (this.LJIIJJI) {
            return;
        }
        if (1NN.LLFF.LIZ().LJIIZILJ) {
            if (!this.LJFF.LJFF) {
                1jz.LIZ(false);
                this.LJFF.LIZ(cert);
            }
        }
        else {
            1jz.LIZ(false);
            this.LJFF.LIZ(cert);
            this.LJFF.LIZ(true);
        }
        1NN.LLFF.LIZ().LIZLLL = true;
        0xo.LIZ("LinkCross_RTC_START", this.LJIIJJI = true);
        1jz.LIZLLL.LIZ("rtc_mix_stream", new JSONObject(), 0);
        ((I5h)I5o.LIZIZ).LIZJ("mix_stream", (JSONObject)null);
        this.LJFF.LJFF();
    }
    
    private void LIZLLL(final int n) {
        0ba.LIZ(3, "LinkCrossRoomTAG", "finishServer, finishCode = ".concat(String.valueOf(n)));
        if (!this.LJIILIIL && !this.LJIIL) {
            final boolean b = true;
            this.LJIIL = true;
            try {
                final boolean b2 = 0n9.LIZ.LIZJ() != 0nC.NORMAL;
                final StringBuilder sb = new StringBuilder("finish, isBattling = ");
                sb.append(b2);
                sb.append("  state = ");
                sb.append(0n9.LIZ.LIZJ());
                0ba.LIZ(3, "LinkCrossRoomTAG", sb.toString());
                if (!b2 || ((a)((GK2)this).LJJIL).LIZLLL() == null) {
                    this.LJ(n);
                    return;
                }
                ((a)((GK2)this).LJJIL).LIZLLL().LIZ(103, n == 202 && b, (QgG<2P9>)new 1kA(this, n));
            }
            catch (final Exception ex) {
                0ba.LIZ(6, "LinkCrossRoomTAG", "finishServer , npe");
                this.LJ(n);
            }
        }
    }
    
    private void LIZLLL(final Cert cert) {
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null && lizlll.LJ == 0L) {
            ((a)((GK2)this).LJJIL).LJI();
            this.LJII();
            return;
        }
        if (this.LJFF.LIZLLL) {
            this.LIZJ(cert);
            return;
        }
        this.LJIIIIZZ();
        if (!CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
            this.LIZJ(cert);
        }
    }
    
    private void LJ(final int n) {
        if (((GK2)this).LJJIL == null) {
            return;
        }
        0xo.LIZJ("FINISH_CROSS", "finishCode = ".concat(String.valueOf(n)));
        long lj = 0L;
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null) {
            lj = lizlll.LJ;
        }
        final HashMap hashMap = new HashMap();
        hashMap.put("needSuggest", false);
        if (n == 201 && 1NN.LLFF.LIZ().LJJZZI) {
            hashMap.put("needSuggest", true);
            hashMap.put("guest_user_id", this.LIZLLL.LJFF);
        }
        hashMap.put("channel_id", lj);
        hashMap.put("finishCode", n);
        if (this.LJIIZILJ.LIZIZ(0xG.a.COHOST) == null) {
            this.LIZJ();
            return;
        }
        ((FIw)this.LJIIZILJ.LIZIZ(0xG.a.COHOST).LIZJ(hashMap).LIZ((FAN)this.LJJI())).LIZ((2d6)new 1ON(this), (2d6)new 1OO(this));
    }
    
    private void LJ(final Cert cert) {
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null && !lizlll.LIZIZ(0kd.CONNECTION_FINISH)) {
            return;
        }
        final StringBuilder sb = new StringBuilder("isControllerNotNull:");
        sb.append(this.LJFF.LJ);
        0xo.LIZJ("LinkCross_TurnOffEngine", sb.toString());
        this.LJFF.LIZ(cert, "");
        1jz.LIZJ();
    }
    
    private void LJI() {
        this.LIZJ.LIZJ((Class)2En.class);
    }
    
    private void LJII() {
        if (this.LIZIZ) {
            this.LIZJ.LIZJ((Class)2Ea.class, (Object)new Fgf(8));
        }
        for (final StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            stackTraceElement.getClassName();
            stackTraceElement.getMethodName();
        }
        FGP.LIZ().LIZ((Object)new 0kD(2));
        if (this.LIZIZ) {
            if (!1NN.LLFF.LIZ().LJIIJ && 1NN.LLFF.LIZ().LJIILJJIL) {
                this.LIZJ.LIZIZ((Class)2Du.class, (Object)new Fgn(1));
            }
        }
        else {
            this.LIZJ.LIZIZ((Class)2Du.class, (Object)new Fgn(1));
        }
    }
    
    private void LJIIIIZZ() {
        public final class 1OM implements 0xO
        {
            public final /* synthetic */ Config$VideoQuality LIZ;
            public final /* synthetic */ 1k4 LIZIZ;
            
            static {
                Covode.recordClassIndex(7278);
            }
            
            public 1OM(final 1k4 liziz, final Config$VideoQuality liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            @Override
            public final InteractConfig LIZ(final InteractConfig interactConfig) {
                interactConfig.setStreamMixer((Client$StreamMixer)this.LIZIZ.LJ);
                interactConfig.setBackgroundColor("#303342");
                interactConfig.setMixStreamRtmpUrl(this.LIZIZ.LIZ.getStreamUrl().LIZ());
                ((Config)interactConfig).setContext(0cB.LJ());
                ((Config)interactConfig).setRtcExtInfo(this.LIZIZ.LIZLLL.LJJIJIL);
                ((Config)interactConfig).setVideoQuality(this.LIZ);
                ((Config)interactConfig).setCharacter(Config$Character.ANCHOR);
                ((Config)interactConfig).setLogReportInterval(5);
                ((Config)interactConfig).setProjectKey(0jR.LIZ(IPullStreamService.class).getProjectKey());
                ((Config)interactConfig).setInteractMode(Config$InteractMode.PK);
                ((Config)interactConfig).setMixStreamType(Config$MixStreamType.SERVER_MIX);
                ((Config)interactConfig).setSeiVersion(2);
                ((Config)interactConfig).setType(Config$Type.VIDEO);
                ((Config)interactConfig).setAppChannel(0jR.LIZ(IHostContext.class).getChannel());
                ((Config)interactConfig).setAppId(String.valueOf(0jR.LIZ(IHostContext.class).appId()));
                ((Config)interactConfig).setAppVersion(0jR.LIZ(IHostContext.class).getVersionCode());
                if (CoHostSeiTalkSetting.INSTANCE.enable()) {
                    ((Config)interactConfig).setVolumeCallbackInterval(CoHostSeiTalkSetting.INSTANCE.getInterval());
                    ((Config)interactConfig).setVolumeThreshold(CoHostSeiTalkSetting.INSTANCE.getMinAudioVolume());
                }
                interactConfig.setRtcABTestConfig(RtcAbLabelSetting.INSTANCE.getValue());
                interactConfig.setUrlDispatcher(1OX.LIZ);
                this.LIZIZ.LJ.LIZ(interactConfig);
                return interactConfig;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/GK2.LJJIL:LX/GFD;
        //     4: ifnonnull       8
        //     7: return         
        //     8: aload_0        
        //     9: getfield        X/1k4.LIZLLL:LX/1NN;
        //    12: astore_1       
        //    13: aload_1        
        //    14: ifnull          28
        //    17: aload_1        
        //    18: getstatic       X/0kd.CONNECTION_FINISH:LX/0kd;
        //    21: invokevirtual   X/1NN.LIZ:(LX/0kd;)Z
        //    24: ifeq            28
        //    27: return         
        //    28: aload_0        
        //    29: getfield        X/1k4.LJIIIZ:Z
        //    32: ifne            45
        //    35: aload_0        
        //    36: getfield        X/1k4.LJFF:LX/1cu;
        //    39: getfield        X/1cu.LIZLLL:Z
        //    42: ifeq            46
        //    45: return         
        //    46: aload_0        
        //    47: getfield        X/1k4.LJIJ:LX/L6w;
        //    50: ifnonnull       54
        //    53: return         
        //    54: aload_0        
        //    55: getfield        X/1k4.LIZLLL:LX/1NN;
        //    58: getfield        X/1NN.LJJIJIL:Ljava/lang/String;
        //    61: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    64: ifeq            77
        //    67: ldc_w           "LinkCross_TurnOnEngine"
        //    70: ldc_w           "rtcExtInfo is empty!"
        //    73: invokestatic    X/0xo.LIZJ:(Ljava/lang/String;Ljava/lang/String;)V
        //    76: return         
        //    77: aload_0        
        //    78: iconst_1       
        //    79: putfield        X/1k4.LJIIIZ:Z
        //    82: aload_0        
        //    83: getfield        X/1k4.LIZLLL:LX/1NN;
        //    86: invokestatic    java/lang/System.currentTimeMillis:()J
        //    89: putfield        X/1NN.LJJLIIIJLLLLLLLZ:J
        //    92: aload_0        
        //    93: invokespecial   X/1k4.LJIIJJI:()Z
        //    96: ifeq            161
        //    99: getstatic       com/ss/avframework/livestreamv2/core/interact/model/Config$VideoQuality.ANCHOR_HIGH:Lcom/ss/avframework/livestreamv2/core/interact/model/Config$VideoQuality;
        //   102: astore_1       
        //   103: aload_0        
        //   104: new             LX/1lJ;
        //   107: dup            
        //   108: aload_1        
        //   109: invokespecial   X/1lJ.<init>:(Lcom/ss/avframework/livestreamv2/core/interact/model/Config$VideoQuality;)V
        //   112: putfield        X/1k4.LJ:LX/1lJ;
        //   115: aload_0        
        //   116: getfield        X/1k4.LJFF:LX/1cu;
        //   119: aload_0        
        //   120: getfield        X/1k4.LJIJ:LX/L6w;
        //   123: new             LX/1OM;
        //   126: dup            
        //   127: aload_0        
        //   128: aload_1        
        //   129: invokespecial   X/1OM.<init>:(LX/1k4;Lcom/ss/avframework/livestreamv2/core/interact/model/Config$VideoQuality;)V
        //   132: invokevirtual   X/1cu.LIZ:(LX/L6w;LX/0xO;)V
        //   135: invokestatic    X/1jz.LIZIZ:()V
        //   138: getstatic       X/1NN.LLFF:LX/0k5;
        //   141: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   144: getfield        X/1NN.LJIIZILJ:Z
        //   147: ifne            45
        //   150: aload_0        
        //   151: getfield        X/1k4.LJFF:LX/1cu;
        //   154: iconst_0       
        //   155: invokevirtual   X/1cu.LIZ:(Z)V
        //   158: goto            45
        //   161: getstatic       com/ss/avframework/livestreamv2/core/interact/model/Config$VideoQuality.ANCHOR_NORMAL:Lcom/ss/avframework/livestreamv2/core/interact/model/Config$VideoQuality;
        //   164: astore_1       
        //   165: goto            103
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1106)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:425)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    
    private void LJIIIZ() {
        final 0y0 ljii = this.LJII;
        if (ljii != null) {
            ljii.LIZIZ();
            this.LJII = null;
        }
    }
    
    private void LJIIJ() {
        if (((GK2)this).LJJIL == null) {
            return;
        }
        if (this.LJFF != null) {
            final StringBuilder sb = new StringBuilder("mHasRtcJoinedChannel = ");
            sb.append(this.LJFF.LIZLLL);
            sb.append("  mIsFinishingService = ");
            sb.append(this.LJIIL);
            0xo.LIZ("disableCoHostProgress", true, sb.toString());
            if (this.LJFF.LIZLLL) {
                return;
            }
        }
        if (this.LJIIL) {
            return;
        }
        this.LIZLLL.LIZ(false);
        if (super.LJJIJL != null) {
            super.LJJIJL.LIZJ((Class)2GQ.class, (Object)new 2Im(false, (Runnable)null));
        }
        this.LJII();
    }
    
    private boolean LJIIJJI() {
        return this.LIZ.getStreamUrlExtraSafely().LJIIJJI > 0;
    }
    
    private Config$Vendor LJIIL() {
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null) {
            return lizlll.LIZLLL();
        }
        return Config$Vendor.UNKNOWN;
    }
    
    public final void LIZ() {
        this.LJIIIIZZ = true;
        if (CoHostPerceptionEnableSetting.INSTANCE.getValue() && super.LJJIJL != null) {
            final IMessageManager messageManager = (IMessageManager)super.LJJIJL.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.removeMessageListener((OnMessageListener)this);
            }
        }
        if (this.LJIILJJIL && super.LJJIJL != null) {
            super.LJJIJL.LIZIZ((Class)2Du.class, (Object)new Fgn(3));
        }
        this.LJIIIZ();
        final 0kd lizj = 1NN.LLFF.LIZ().LIZJ();
        if (this.LIZIZ && 0kd.CONNECTION_FINISH.compareTo(lizj) > 0) {
            this.LIZIZ(205);
        }
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZIZ(0kd.UNLOADED);
        }
        final 2fc lji = this.LJI;
        if (lji != null) {
            lji.dispose();
        }
        if (super.LJJIJL != null) {
            super.LJJIJL.LIZIZ((Object)this);
        }
        this.LJIJI.LIZIZ(this.LJIL);
        this.LJIJI.LIZIZ(this);
        this.LJFF.LIZJ();
        0y7.LIZ();
        if (this.LIZ != null) {
            0jR.LIZ(IRoomFunctionService.class).likeMicStateChange(this.LIZ.getId(), 1, this.LIZIZ);
        }
        super.LIZ();
    }
    
    public final void LIZ(final int ljiilliil) {
        if (this.LJFF == null) {
            return;
        }
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null) {
            final String ljjjliil = lizlll.LJJJLIIL;
            final long lj = this.LIZLLL.LJ;
            final long n = 0L;
            if (lj > 0L && !TextUtils.isEmpty((CharSequence)ljjjliil)) {
                if (!this.LJIIJ) {
                    this.LJIILLIIL = ljiilliil;
                    this.LJIILL = true;
                    return;
                }
                this.LJIILL = false;
                final 1NN liz = this.LJIJJLI.LIZ;
                if (liz == null) {
                    kotlin.jvm.internal.n.LIZ("");
                }
                final long lj2 = liz.LJ;
                if (lj2 <= 0L) {
                    return;
                }
                final 1Ou 1Ou = new 1Ou("co_host_reply_msg", lj2, 0b8.a.LIZJ.LIZIZ((Object)new 1Ot(ljiilliil)));
                final String liziz = 0b8.a.LIZJ.LIZIZ((Object)1Ou);
                CTM.LIZ((Object)ljjjliil, (Object)liziz);
                final JSONObject jsonObject = new JSONObject();
                0d3.LIZ(jsonObject, "target_linkmic_id", ljjjliil);
                0d3.LIZ(jsonObject, "message", liziz);
                0d3.LIZ(jsonObject, "reply_status", String.valueOf(ljiilliil));
                1jz.LIZLLL.LIZ("send_reply_with_rtc_msg", jsonObject, 0);
                final 1cu ljff = this.LJFF;
                CTM.LIZ((Object)ljjjliil, (Object)liziz);
                final Client ljii = ljff.LJII;
                long sendUserMessage = n;
                if (ljii != null) {
                    final RTCEngine rtcEngine = ljii.getRtcEngine();
                    sendUserMessage = n;
                    if (rtcEngine != null) {
                        sendUserMessage = rtcEngine.sendUserMessage(ljjjliil, liziz);
                    }
                }
                CTM.LIZ((Object)ljjjliil, (Object)1Ou);
                if (!0lN.LIZIZ.containsKey(sendUserMessage)) {
                    0lN.LIZIZ.put(sendUserMessage, ljjjliil);
                }
                if (!0lN.LIZJ.containsKey(sendUserMessage)) {
                    0lN.LIZJ.put(sendUserMessage, ljiilliil);
                }
                if (!0lN.LIZ.containsKey(sendUserMessage)) {
                    0lN.LIZ.put(sendUserMessage, 1Ou);
                }
                CTM.LIZ((Object)liziz);
                final JSONObject jsonObject2 = new JSONObject();
                0d3.LIZ(jsonObject2, "message", liziz);
                1jz.LIZLLL.LIZ("send_reply_with_rtc_room_msg", jsonObject2, 0);
                this.LJFF.LIZLLL(liziz);
            }
        }
    }
    
    public final void LIZ(final int n, final long n2, final Object... array) {
    }
    
    public final void LIZ(final int n, final String s) {
        final int liziz = 0y3.LIZIZ;
        final long n2 = n;
        0y3.LIZ(liziz, n2, s);
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "error_code", 104L);
        0d3.LIZ(jsonObject, "error_msg", n2);
        0d3.LIZ(jsonObject, "error_detail", s);
        1jz.LIZLLL.LIZ("rtc_join_channel_failed", jsonObject, 0);
        1mk.LIZ(0xv.LIZ(jsonObject));
        final JSONObject lizlll = 1jz.LIZLLL.LIZLLL();
        0d3.LIZ(lizlll, "end_reason", "join_channel_failed");
        0d3.LIZ(lizlll, "error_code", 104L);
        0d3.LIZ(lizlll, "error_msg", n2);
        0d3.LIZ(lizlll, "error_detail", s);
        ((I5h)I5o.LIZIZ).LIZ(2, lizlll);
        ((I5h)HiV.LIZ).LIZ(2, lizlll);
        if (this.LIZLLL.LIZIZ && !this.LIZLLL.LIZJ) {
            final StringBuilder sb = new StringBuilder("position:LinkCross; code:");
            sb.append(n);
            sb.append("; desc:");
            sb.append(s);
            0xo.LIZ("LinkCross_OnStartFailed_Before_Reply", true, sb.toString());
            this.LIZJ.LIZJ((Class)2Eo.class);
            return;
        }
        if (((GK2)this).LJJIL != null) {
            ((a)((GK2)this).LJJIL).LJFF();
            final a a = (a)((GK2)this).LJJIL;
            final StringBuilder sb2 = new StringBuilder("position:LinkCross; code:");
            sb2.append(n);
            sb2.append("; desc:");
            sb2.append(s);
            a.LIZ("OnStartFailed", sb2.toString());
        }
        final 2fc lji = this.LJI;
        if (lji != null) {
            lji.dispose();
        }
        this.LIZLLL.LJJJJIZL = 0L;
    }
    
    public final void LIZ(final long n, final int n2) {
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "status", String.valueOf(n2));
        1jz.LIZLLL.LIZ("send_reply_with_rtc_room_msg_result", jsonObject, 0);
    }
    
    public final void LIZ(final long n, final long n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(" ");
        sb.append(n2);
        0ba.LIZ(4, "bitrate_callback", sb.toString());
        if (((GK2)this).LJJIL == null) {
            return;
        }
        ((a)((GK2)this).LJJIL).LJIIIIZZ();
    }
    
    public final void LIZ(final 1aI 1aI, final String s) {
    }
    
    public final void LIZ(final a a) {
        super.LIZ((GpW)a);
        this.LJIIIIZZ = false;
        if (CoHostPerceptionEnableSetting.INSTANCE.getValue() && super.LJJIJL != null) {
            final IMessageManager messageManager = (IMessageManager)super.LJJIJL.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.addMessageListener(HDh.PERCEPTION_MESSAGE.getIntType(), (OnMessageListener)this);
            }
        }
        this.LIZLLL = 1NN.LLFF.LIZ();
        final 1cs ljiji = this.LJIJI;
        if (ljiji != null) {
            ljiji.LIZ(this);
            this.LJIJI.LIZ(this.LJIL);
        }
        final DataChannel lizj = this.LIZJ;
        lizj.LIZ((Object)this, (Class)2Eq.class, (SRS)new 1k6(this));
        lizj.LIZ((0CH)((GK2)this).LJJIL, (Class)2Ev.class, (SRS)new 1k7(this));
        lizj.LIZ((0CH)((GK2)this).LJJIL, (Class)2EQ.class, (SRS)new 1k8(this));
        lizj.LIZ((0CH)((GK2)this).LJJIL, (Class)2Ey.class, (SRS)new 1k9(this));
        Label_0223: {
            if (this.LIZIZ) {
                this.LJFF.LIZ(this);
                if (this.LIZLLL.LIZJ) {
                    final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-501");
                    with.usage("");
                    with.tag("link mic start to push stream");
                    with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
                    this.LIZ((Cert)with.build());
                }
                else {
                    final 0xL ljiizilj = this.LJIIZILJ;
                    Label_0337: {
                        if (ljiizilj != null) {
                            final 0xJ liziz = ljiizilj.LIZIZ(0xG.a.MULTIGUEST);
                            if (liziz != null && liziz instanceof 1TT) {
                                if (((1TT)liziz).LIZLLL()) {
                                    break Label_0223;
                                }
                                break Label_0337;
                            }
                        }
                        if (0sD.LIZJ.LIZ().LIZLLL() && 0jR.LIZ(IMultiGuestV3InternalService.class).isRtcEngineOn()) {
                            break Label_0223;
                        }
                    }
                    this.LJIIIIZZ();
                }
            }
        }
        if (this.LIZ != null && !this.LIZIZ) {
            0jR.LIZ(IRoomFunctionService.class).likeMicStateChange(this.LIZ.getId(), 0, this.LIZIZ);
        }
    }
    
    public final void LIZ(final Cert cert) {
        if (((GK2)this).LJJIL == null) {
            return;
        }
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null && lizlll.LIZ) {
            return;
        }
        this.LIZLLL.LIZ(true);
        if (super.LJJIJL != null) {
            super.LJJIJL.LIZJ((Class)2GQ.class, (Object)new 2Im(true, (Runnable)null));
        }
        this.LIZLLL.LIZIZ(0kd.CONNECTION_START);
        0xo.LIZ("LinkCross_TurnOnEngine");
        this.LIZJ.LIZJ((Class)2Ea.class, (Object)new Fgf(7));
        this.LIZLLL(cert);
        final 1NN lizlll2 = this.LIZLLL;
        if (lizlll2 != null && lizlll2.LIZ(0kd.CONNECTION_SUCCEED)) {
            return;
        }
        int n;
        if (1NN.LLFF.LIZ().LJIILIIL) {
            n = LiveRandomLinkmicConnectTimeoutIntervalSetting.INSTANCE.getValue();
        }
        else {
            n = LivePkConnectTimeoutIntervalSetting.INSTANCE.getValue();
        }
        final long n2 = n;
        this.LJI = ((FIc)FBF.LIZIZ(n2, TimeUnit.SECONDS).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((FBZ)this.LJJ())).LIZ((2d6)new 1OV(this, n2), (2d6)new 1OW(this));
    }
    
    public final void LIZ(final Boolean b) {
        final 1cu ljff = this.LJFF;
        if (ljff != null) {
            final boolean booleanValue = b;
            final Client ljii = ljff.LJII;
            if (ljii != null) {
                ljii.muteLocalAudio(booleanValue);
            }
        }
    }
    
    public final void LIZ(final String s) {
        ((a)((GK2)this).LJJIL).LIZ("OnUserJoined", "position:LinkCross; interactId:".concat(String.valueOf(s)));
    }
    
    public final void LIZ(String s, final long n) {
        ((a)((GK2)this).LJJIL).LIZ("OnUserLeaved", "position:LinkCross; interactId:".concat(String.valueOf(s)));
        final 1NN lizlll = this.LIZLLL;
        if (lizlll == null) {
            return;
        }
        boolean b;
        if (TextUtils.equals((CharSequence)lizlll.LJIJJ, (CharSequence)s) || TextUtils.equals((CharSequence)this.LIZLLL.LJJJLIIL, (CharSequence)s)) {
            b = true;
        }
        else {
            b = false;
        }
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "leaved_linkmic_id", s);
        if (b ^ true) {
            s = "1";
        }
        else {
            s = "0";
        }
        0d3.LIZ(jsonObject, "is_virtual_user", s);
        1jz.LIZLLL.LIZ("rtc_user_leave", jsonObject, 0);
        if (!b) {
            return;
        }
        if (this.LIZIZ && !this.LIZLLL.LJJJLZIJ && this.LIZLLL.LIZ(0kd.CONNECTION_SUCCEED)) {
            Hf4.LIZ(((GpW)((GK2)this).LJJIL).getContext(), 0cB.LIZ(2131830959), 0L);
        }
        if (!this.LIZLLL.LJJJLZIJ && 0lK.LIZ()) {
            this.LIZLLL.LJIIJ = true;
            if (super.LJJIJL != null) {
                super.LJJIJL.LIZJ((Class)2EN.class, (Object)0cB.LIZ(2131828975));
            }
            1O2.LIZ(1O2.d.SYSTEM_REMATCH);
            0xy.LIZ(null, 0kf.RANDOM_LINK_MIC_INVITE, "", "");
        }
        this.LIZIZ(202);
    }
    
    public final void LIZ(final String s, final SurfaceView surfaceView) {
        final 2fc lji = this.LJI;
        if (lji != null) {
            lji.dispose();
        }
        final JSONObject jsonObject = new JSONObject();
        final 1NN liz = 1NN.LLFF.LIZ();
        long n = 1L;
        if (liz.LJJJJIZL > 0L) {
            n = System.currentTimeMillis() - liz.LJJJJIZL;
        }
        0d3.LIZ(jsonObject, "cost", n);
        0d3.LIZ(jsonObject, "first_joined", String.valueOf((int)((liz.LJJJJI ^ true) ? 1 : 0)));
        if (!liz.LJJJJI) {
            liz.LJJJJI = true;
        }
        1jz.LIZLLL.LIZ("rtc_first_remote_video", jsonObject, 0);
        ((I5h)I5o.LIZIZ).LIZJ("first_video", jsonObject);
    }
    
    public final void LIZ(final String s, final String s2) {
        final 1Ou liz = this.LJIJJ.LIZ(s2);
        if (liz == null) {
            return;
        }
        if (TextUtils.equals((CharSequence)liz.LIZ, (CharSequence)"co_host_reply_msg")) {
            final long liziz = liz.LIZIZ;
            CTM.LIZ((Object)s2);
            final JSONObject jsonObject = new JSONObject();
            0d3.LIZ(jsonObject, "message", s2);
            0d3.LIZ(jsonObject, "channel_id", liziz);
            1jz.LIZLLL.LIZ("receive_reply_with_rtc_room_msg", jsonObject, 0);
        }
    }
    
    public final void LIZ(final String s, final boolean b) {
    }
    
    public final void LIZ(final boolean b) {
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null && lizlll.LJFF != 0L && ((GK2)this).LJJIL != null) {
            final User user = this.LIZLLL.LIZJ("data_guest_user");
            if (user != null && this.LIZLLL.LJFF == user.getId() && !b) {
                this.LIZJ.LIZIZ((Class)2Er.class, (Object)user);
                return;
            }
            ((FIw)Fk2.LIZ().LIZIZ().LIZ(this.LIZLLL.LJFF, "LinkCrossRoomVideoPresenter_queryGuestInfo").LIZ((FAN)this.LJJI())).LIZ((2d6)new 1OT(this), (2d6)new 1OU(this));
        }
    }
    
    public final void LIZIZ() {
        final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-521");
        with.usage("");
        with.tag("link mic stop");
        with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
        this.LIZIZ((Cert)with.build());
    }
    
    public final void LIZIZ(final int n) {
        if (this.LIZLLL != null) {
            final StringBuilder sb = new StringBuilder("finish, finishCode = ");
            sb.append(n);
            sb.append("   channelId = ");
            sb.append(this.LIZLLL.LJ);
            0ba.LIZ(3, "LinkCrossRoomTAG", sb.toString());
        }
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null && lizlll.LJ > 0L) {
            this.LJI();
            this.LIZLLL(n);
            final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-523");
            with.usage("");
            with.tag("link mic stop");
            with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
            this.LIZIZ((Cert)with.build());
        }
    }
    
    public final void LIZIZ(final int n, final String s) {
        this.LJIIJJI = false;
        this.LJIIJ();
        if (((GK2)this).LJJIL != null) {
            final a a = (a)((GK2)this).LJJIL;
            final StringBuilder sb = new StringBuilder("position:LinkCross; code:");
            sb.append(n);
            sb.append("; desc:");
            sb.append(s);
            a.LIZ("OnEndFailed", sb.toString());
        }
    }
    
    public final void LIZIZ(final long n, final int n2) {
        final 1Ou 1Ou = 0lN.LIZ.get(n);
        if (1Ou != null) {
            if (TextUtils.equals((CharSequence)1Ou.LIZ, (CharSequence)"co_host_reply_msg") && 0lN.LIZJ.get(n) != null) {
                final int intValue = 0lN.LIZJ.get(n);
                final String s = 0lN.LIZIZ.get(n);
                final String liziz = 0b8.a.LIZJ.LIZIZ((Object)1Ou);
                CTM.LIZ((Object)s, (Object)liziz);
                final JSONObject jsonObject = new JSONObject();
                0d3.LIZ(jsonObject, "target_linkmic_id", s);
                0d3.LIZ(jsonObject, "message", liziz);
                0d3.LIZ(jsonObject, "reply_status", String.valueOf(intValue));
                0d3.LIZ(jsonObject, "status", String.valueOf(n2));
                1jz.LIZLLL.LIZ("send_reply_with_rtc_msg_result", jsonObject, 0);
            }
            if (0lN.LIZIZ.containsKey(n)) {
                0lN.LIZIZ.remove(n);
            }
            if (0lN.LIZJ.containsKey(n)) {
                0lN.LIZJ.remove(n);
            }
            if (0lN.LIZ.containsKey(n)) {
                0lN.LIZ.remove(n);
            }
        }
    }
    
    public final void LIZIZ(final Cert cert) {
        if (((GK2)this).LJJIL == null) {
            return;
        }
        if (this.LIZIZ) {
            this.LJ(cert);
            return;
        }
        this.LJII();
    }
    
    public final void LIZIZ(final String s) {
    }
    
    public final void LIZIZ(final String s, final SurfaceView lizj) {
        final 2fc lji = this.LJI;
        if (lji != null) {
            lji.dispose();
        }
        if (((GK2)this).LJJIL == null) {
            return;
        }
        0ba.LIZ(3, "LinkCrossRoomTAG", "receive remote first frame");
        final 1NN liz = 1NN.LLFF.LIZ();
        final long ljjjjizl = liz.LJJJJIZL;
        final long n = 0L;
        long n2;
        if (ljjjjizl > 0L) {
            n2 = System.currentTimeMillis() - liz.LJJJJIZL;
        }
        else {
            n2 = 1L;
        }
        liz.LJJJJIZL = 0L;
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "duration", n2);
        0d3.LIZ(jsonObject, "cost", n2);
        0d3.LIZ(jsonObject, "first_joined", String.valueOf((int)((liz.LJJJJ ^ true) ? 1 : 0)));
        if (!liz.LJJJJ) {
            liz.LJJJJ = true;
        }
        1jz.LIZLLL.LIZ("rtc_first_frame_render", jsonObject, 0);
        0d8.LIZ("ttlive_client_linkmic_anchor_frist_frame", n2, 0xv.LIZ(jsonObject));
        final JSONObject liz2 = 0xv.LIZ(jsonObject);
        CTM.LIZ((Object)liz2);
        0d8.LIZIZ(1mk.LIZ, 0, liz2);
        0d3.LIZ(jsonObject, "link_mic_id", liz.LJJJJZI);
        ((I5h)I5o.LIZIZ).LIZJ("first_frame_render", jsonObject);
        final JSONObject lizlll = 1jz.LIZLLL.LIZLLL();
        0d3.LIZ(lizlll, "end_reason", "rtc_first_frame_render");
        0d3.LIZ(lizlll, "link_mic_id", liz.LJJJJZI);
        0d3.LIZ(lizlll, "remote_linkmic_id", liz.LJJJLIIL);
        ((I5h)I5o.LIZIZ).LIZ(1, lizlll);
        ((I5h)HiV.LIZ).LIZ(1, lizlll);
        final JSONObject jsonObject2 = new JSONObject();
        0d3.LIZ(jsonObject2, "record_id", liz.LJJJJZI);
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        String idStr;
        if (room != null) {
            idStr = room.getIdStr();
        }
        else {
            idStr = null;
        }
        0d3.LIZ(jsonObject2, "room_id", idStr);
        0d3.LIZ(jsonObject2, "remote_room_id", liz.LJIIIIZZ);
        final Room room2 = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        long ownerUserId = n;
        if (room2 != null) {
            ownerUserId = room2.getOwnerUserId();
        }
        0d3.LIZ(jsonObject2, "user_id", ownerUserId);
        0d3.LIZ(jsonObject2, "remote_user_id", liz.LJFF);
        0d3.LIZ(jsonObject2, "is_inviter", liz.LJIIZILJ);
        ((I5h)I5n.LIZ).LIZ(jsonObject2);
        final 1NN lizlll2 = this.LIZLLL;
        if (lizlll2 != null) {
            lizlll2.LJIIJ = false;
        }
        if (!this.LIZLLL.LIZIZ(0kd.CONNECTION_SUCCEED)) {
            return;
        }
        final Fgn fgn = new Fgn(2);
        fgn.LIZJ = lizj;
        final DataChannel lizj2 = this.LIZJ;
        if (lizj2 != null) {
            lizj2.LIZIZ((Class)2Du.class, (Object)fgn);
            this.LIZJ.LIZJ((Class)2Dr.class, (Object)"");
            this.LJIILJJIL = true;
        }
        ((a)((GK2)this).LJJIL).LIZ("OnFirstRemoteVideoFrame", "position:LinkCross; interactId:".concat(String.valueOf(s)));
        ((a)((GK2)this).LJJIL).LJII();
        1lI.LIZ(1lI.LIZJ, "check_permission_request", new JSONObject(), false, null, null, 60);
        1lI.LIZ = System.currentTimeMillis();
        ((FIc)0yr.LIZ().LIZ(LinkBattleApi.class).checkPermission().LIZ((FBZ)this.LJJI())).LIZ((2d6)new 1OP(this), (2d6)new 1OQ(this));
        final 29P liz3 = 29P.LIZ;
        final 2fc ljff = 0y7.LJFF;
        if (ljff != null) {
            ljff.dispose();
        }
        liz3.LIZ();
        while (true) {
            try {
                if (0y7.LIZ == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (0y7.LIZIZ == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (0y7.LIZJ == null) {
                    throw new IllegalStateException("Required value was null.".toString());
                }
                if (0y7.LIZLLL.get("inviter_id") == null || !(kotlin.jvm.internal.n.LIZ((Object)0y7.LIZLLL.get("inviter_id"), (Object)"") ^ true)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (0y7.LJ.get("invitee_id") != null && (kotlin.jvm.internal.n.LIZ((Object)0y7.LJ.get("invitee_id"), (Object)"") ^ true)) {
                    0y7.LJFF = FBF.LIZ(1L, TimeUnit.MINUTES).LIZ((FCD)new FC5()).LIZ((2d6)1dI.LIZ, (2d6)1dJ.LIZ);
                    if (this.LIZ != null) {
                        0jR.LIZ(IRoomFunctionService.class).likeMicStateChange(this.LIZ.getId(), 0, this.LIZIZ);
                    }
                    return;
                }
                throw new IllegalStateException("Check failed.".toString());
            }
            catch (final IllegalStateException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void LIZIZ(final String s, final String s2) {
        final 1Ou liz = this.LJIJJ.LIZ(s2);
        if (liz == null) {
            return;
        }
        if (liz.LIZIZ != this.LIZLLL.LJ) {
            return;
        }
        if (TextUtils.equals((CharSequence)liz.LIZ, (CharSequence)"co_host_reply_msg")) {
            final 1Ot 1Ot = this.LJIJJ.LIZ(liz.LIZJ, 1Ot.class);
            if (1Ot != null) {
                final int liz2 = 1Ot.LIZ;
                final String liziz = 0b8.a.LIZJ.LIZIZ((Object)liz);
                CTM.LIZ((Object)s, (Object)liziz);
                final JSONObject jsonObject = new JSONObject();
                0d3.LIZ(jsonObject, "from_linkmic_id", s);
                0d3.LIZ(jsonObject, "message", liziz);
                0d3.LIZ(jsonObject, "reply_status", String.valueOf(liz2));
                1jz.LIZLLL.LIZ("receive_reply_with_rtc_msg", jsonObject, 0);
                final 1NN lizlll = this.LIZLLL;
                if (lizlll != null && !lizlll.LIZJ) {
                    super.LJJIJL.LIZJ((Class)2Ep.class, (Object)1Ot.LIZ);
                }
            }
        }
    }
    
    public final void LIZIZ(final String s, final boolean b) {
    }
    
    public final void LIZIZ(final boolean liz) {
        final 1cu ljff = this.LJFF;
        if (ljff != null && ljff.LIZLLL) {
            this.LJ.LIZ = liz;
            final Gr5 gr5 = new Gr5();
            int lji;
            if (liz) {
                lji = 100102;
            }
            else {
                lji = 100101;
            }
            gr5.LJI = lji;
            gr5.LIZLLL = String.valueOf(Fk2.LIZ().LIZIZ().LIZJ());
            gr5.LJ = String.valueOf(this.LIZLLL.LJJJJZI);
            gr5.LIZIZ = "0";
            gr5.LIZJ = "0";
            0xo.LIZ("LinkCross_ForegroundStateChanged", this.LIZIZ, 0b8.a.LIZIZ.LIZIZ((Object)gr5));
            final HashMap hashMap = new HashMap();
            hashMap.put("content", 0b8.a.LIZIZ.LIZIZ((Object)gr5));
            if (this.LJIIZILJ.LIZIZ(0xG.a.COHOST) != null) {
                this.LJIIZILJ.LIZIZ(0xG.a.COHOST).LJ(hashMap);
            }
        }
        if (!this.LJFF.LIZIZ()) {
            if (liz) {
                this.LJFF.LIZIZ(this.LIZLLL.LJJLJLI);
            }
            else {
                this.LJFF.LJI();
            }
            this.LJFF.LJFF();
        }
    }
    
    public final void LIZJ() {
        this.LJIIL = false;
        this.LJIILIIL = true;
        this.LJIIJ();
    }
    
    public final void LIZJ(final int n, final String s) {
        final int liziz = 0y3.LIZIZ;
        final long n2 = n;
        0y3.LIZ(liziz, n2, s);
        CTM.LIZ((Object)s);
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "error_code", 104L);
        0d3.LIZ(jsonObject, "error_msg", n2);
        0d3.LIZ(jsonObject, "error_detail", s);
        1jz.LIZLLL.LIZ("rtc_error", jsonObject, 1);
        ((I5h)I5n.LIZ).LIZJ("rtc_error", jsonObject);
        ((I5h)I5o.LIZIZ).LIZJ("rtc_error", jsonObject);
        final JSONObject lizlll = 1jz.LIZLLL.LIZLLL();
        0d3.LIZ(lizlll, "end_reason", "rtc_error");
        ((I5h)I5n.LIZ).LIZ(2, lizlll);
        ((I5h)I5o.LIZIZ).LIZ(2, lizlll);
        1mk.LIZ(0xv.LIZ(jsonObject));
        final 1NN lizlll2 = this.LIZLLL;
        if (lizlll2 != null && lizlll2.LIZIZ && !this.LIZLLL.LIZJ) {
            final StringBuilder sb = new StringBuilder("position:LinkCross; code:");
            sb.append(n);
            sb.append("; desc:");
            sb.append(s);
            0xo.LIZ("LinkCross_onError_Before_Reply", true, sb.toString());
            this.LIZJ.LIZJ((Class)2Eo.class);
            return;
        }
        if (((GK2)this).LJJIL != null) {
            ((a)((GK2)this).LJJIL).LJFF();
            final a a = (a)((GK2)this).LJJIL;
            final StringBuilder sb2 = new StringBuilder("position:LinkCross; code:");
            sb2.append(n);
            sb2.append(";message:");
            sb2.append(s);
            a.LIZ("OnError", sb2.toString());
        }
    }
    
    public final void LIZJ(final long n, final int n2) {
        try {
            if (!this.LIZIZ) {
                return;
            }
            final 1NN lizlll = this.LIZLLL;
            if (lizlll != null && n == lizlll.LJFF) {
                if (this.LJ == null) {
                    return;
                }
                if (n2 == 100102) {
                    ((a)((GK2)this).LJJIL).LIZ(true);
                    this.LJ.LIZIZ = true;
                }
                else if (n2 == 100101) {
                    ((a)((GK2)this).LJJIL).LIZ(false);
                    this.LJ.LIZIZ = false;
                }
                this.LJFF.LJFF();
            }
        }
        catch (final NumberFormatException ex) {
            0ba.LIZJ(ex.toString());
        }
    }
    
    public final void LIZJ(final String s) {
    }
    
    public final void LIZLLL() {
        if (((GK2)this).LJJIL != null && this.LIZLLL != null) {
            final a a = (a)((GK2)this).LJJIL;
            final StringBuilder sb = new StringBuilder("position:LinkCross, replied = ");
            sb.append(this.LIZLLL.LIZJ);
            a.LIZ("OnStartSuccess", sb.toString());
        }
        this.LJIIJ = true;
        if (this.LJIILL) {
            final int ljiilliil = this.LJIILLIIL;
            if (ljiilliil > 0) {
                this.LIZ(ljiilliil);
            }
        }
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LJJLIIIJJI = System.currentTimeMillis() - this.LIZLLL.LJJLIIIJLLLLLLLZ;
        }
        final long ljjliiijji = this.LIZLLL.LJJLIIIJJI;
        final JSONObject jsonObject = new JSONObject();
        0d3.LIZ(jsonObject, "cost", ljjliiijji);
        1jz.LIZLLL.LIZ("rtc_join_channel_succeed", jsonObject, 0);
        if (super.LJJIJL != null) {
            final DataChannel ljjijl = super.LJJIJL;
            this.LJIIL().name();
            ljjijl.LIZJ((Class)2EX.class, (Object)new 0kE());
        }
        final String liz = this.LIZ.getStreamUrl().LIZ();
        final long id = this.LIZ.getId();
        final String lowerCase = this.LJIIL().name().toLowerCase();
        Config$VideoQuality config$VideoQuality;
        if (this.LJIIJJI()) {
            config$VideoQuality = Config$VideoQuality.ANCHOR_HIGH;
        }
        else {
            config$VideoQuality = Config$VideoQuality.ANCHOR_NORMAL;
        }
        (this.LJII = new 0y0(lowerCase, liz, id, config$VideoQuality.getWidth(), config$VideoQuality.getHeight(), config$VideoQuality.getBitrate(), config$VideoQuality.getFps())).LIZ();
        if (this.LIZLLL.LIZJ) {
            final PrivacyCert$Builder with = PrivacyCert$Builder.with("bpea-500");
            with.usage("");
            with.tag("link mic start push stream");
            with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
            this.LIZJ((Cert)with.build());
            return;
        }
        if (!this.LJFF.LIZIZ() && this.LIZLLL.LJIIZILJ) {
            final boolean value = LiveEnablePerPushInteractiveStreamSetting.INSTANCE.getValue();
            boolean b;
            if (TTliveAnchorDeviceScoreSetting.INSTANCE.getValue() >= TTliveAnchorDeviceRatingHighSetting.INSTANCE.getValue()) {
                b = true;
            }
            else {
                b = false;
            }
            final boolean ljiiiz = 1NN.LLFF.LIZ().LJIIIZ;
            boolean b2;
            if (TTNetInit.getEffectiveConnectionType() >= LiveNetworkTypeModeRateSetting.INSTANCE.getValue()) {
                b2 = true;
            }
            else {
                b2 = false;
            }
            if (value && b && ljiiiz && b2) {
                final 1cu ljff = this.LJFF;
                final PrivacyCert$Builder with2 = PrivacyCert$Builder.with("bpea-506");
                with2.usage("");
                with2.tag("link mic start to push stream");
                with2.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
                ljff.LIZ((Cert)with2.build());
                1jz.LIZ(true);
            }
        }
    }
    
    public final void LIZLLL(final String s) {
    }
    
    public final void LJ() {
        final 1NN lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.LIZIZ(0kd.CONNECTION_FINISH_SUCCEED);
        }
        1jz.LIZLLL.LIZ("rtc_offline", new JSONObject(), 0);
        this.LJIIJ = false;
        this.LJIIJJI = false;
        this.LJIIJ();
        this.LJIIIZ();
        if (super.LJJIJL != null) {
            super.LJJIJL.LIZJ((Class)2EX.class, (Object)new 0kE());
        }
        if (((GK2)this).LJJIL != null) {
            ((a)((GK2)this).LJJIL).LIZ("onEndSuccess", "position:LinkCross");
        }
        0y7.LIZ();
    }
    
    public final void LJ(final String s) {
    }
    
    public final void LJFF() {
    }
    
    public final void onMessage(final IMessage message) {
        if (CoHostPerceptionEnableSetting.INSTANCE.getValue() && message instanceof PerceptionMessage) {
            0lE.LIZ.LIZ((PerceptionMessage)message, (SRS<? super Integer, 2P9>)new 1k5(this), null);
        }
    }
    
    public interface a extends GpW
    {
        default static {
            Covode.recordClassIndex(7279);
        }
        
        void LIZ(final String p0, final String p1);
        
        void LIZ(final boolean p0);
        
        void LIZIZ(final boolean p0);
        
        LinkBattleWidget LIZLLL();
        
        void LJ();
        
        void LJFF();
        
        void LJI();
        
        void LJII();
        
        void LJIIIIZZ();
    }
}
