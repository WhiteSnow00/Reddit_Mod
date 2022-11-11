// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.interact.model.Config;
import com.ss.bytertc.engine.RTCEngine;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestBackgroundVoicePlaySetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostSeiTalkSetting;
import android.view.SurfaceView;
import com.bytedance.bpea.basics.Cert;
import com.ss.avframework.livestreamv2.core.interact.Client$Listener;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.ILiveStream;
import com.ss.avframework.livestreamv2.core.interact.Client;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;

@0kX(LIZ = "RTC_CONTROLLER")
public final class 1cu implements 0xW
{
    public InteractConfig LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;
    public Client LJII;
    public final 0xX LJIIIIZZ;
    public ILiveStream LJIIIZ;
    @0kW(LIZ = "LINK_LOGGER")
    public 0xN LJIIJ;
    public 0xP LJIIJJI;
    public final 5DO LJIIL;
    
    static {
        Covode.recordClassIndex(10258);
    }
    
    public 1cu() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0        
        //     5: new             LX/0xX;
        //     8: dup            
        //     9: invokespecial   X/0xX.<init>:()V
        //    12: putfield        X/1cu.LJIIIIZZ:LX/0xX;
        //    15: aload_0        
        //    16: new             LX/296;
        //    19: dup            
        //    20: aload_0        
        //    21: invokespecial   X/296.<init>:(LX/1cu;)V
        //    24: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    27: putfield        X/1cu.LJIIL:LX/5DO;
        //    30: getstatic       X/1jw.LIZ:LX/1jw;
        //    33: aload_0        
        //    34: invokevirtual   X/1Na.LIZ:(Ljava/lang/Object;)V
        //    37: return         
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
    
    public final 0k1 LIZ() {
        return (0k1)this.LJIIL.getValue();
    }
    
    @Override
    public final void LIZ(final int n, final long n2, final Object... array) {
        CTM.LIZ((Object)array);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZ(n, n2, array);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(n, n2, array);
        }
    }
    
    @Override
    public final void LIZ(final int n, final String s) {
        CTM.LIZ((Object)s);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZ(n, s);
        this.LIZIZ = false;
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(n, s);
        }
    }
    
    @Override
    public final void LIZ(final long n, final int n2) {
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(n, n2);
        }
    }
    
    @Override
    public final void LIZ(final long n, final long n2) {
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZ(n, n2);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(n, n2);
        }
    }
    
    public final void LIZ(final 0xP ljiijji) {
        CTM.LIZ((Object)ljiijji);
        if (this.LJIIJ == null) {
            n.LIZ("");
        }
        this.LJIIIIZZ.LIZ(this);
        this.LJIIJJI = ljiijji;
    }
    
    public final void LIZ(final 1aI 1aI) {
        CTM.LIZ((Object)1aI);
        if (!this.LJ) {
            return;
        }
        final String liziz = 0b8.a.LIZIZ.LIZIZ((Object)1aI);
        n.LIZIZ((Object)liziz, "");
        this.LIZLLL(liziz);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(1aI, liziz);
        }
    }
    
    public final void LIZ(final L6w l6w, final 0xO 0xO) {
        CTM.LIZ((Object)l6w, (Object)0xO);
        if (this.LJ) {
            return;
        }
        if (this.LIZIZ) {
            return;
        }
        if (this.LJIIJ == null) {
            n.LIZ("");
        }
        this.LIZIZ = true;
        this.LJIIIZ = l6w.getLiveCore();
        final Client liziz = this.LIZIZ(l6w, 0xO);
        if ((this.LJII = liziz) != null) {
            liziz.setListener((Client$Listener)this.LJIIIIZZ.LIZJ);
        }
        if (this.LIZ() != null) {
            System.currentTimeMillis();
        }
        0Z5.LJ.LIZ(this.LJIIIZ);
        final Client ljii = this.LJII;
        if (ljii != null) {
            ljii.joinChannel();
        }
    }
    
    public final void LIZ(final Cert cert) {
        final Client ljii = this.LJII;
        if (ljii == null) {
            return;
        }
        if (this.LJFF) {
            return;
        }
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LJFF();
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LJFF();
        }
        0Z5.LJ.LIZ(this.LJIIIZ);
        ljii.startPushData();
        if (cert != null) {
            ljii.startInteract((Object)cert);
        }
        else {
            ljii.startInteract();
        }
        this.LJFF = true;
    }
    
    public final void LIZ(final Cert cert, final String s) {
        CTM.LIZ((Object)s);
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        if (this.LJII != null) {
            final 0xN ljiij = this.LJIIJ;
            if (ljiij == null) {
                n.LIZ("");
            }
            ljiij.LIZ().LJ(s);
            final 0xP ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                ljiijji.LJ(s);
            }
            if (cert == null) {
                final Client ljii = this.LJII;
                if (ljii != null) {
                    ljii.stop();
                }
            }
            else {
                final Client ljii2 = this.LJII;
                if (ljii2 != null) {
                    ljii2.stop((Object)cert);
                }
            }
            final Client ljii3 = this.LJII;
            if (ljii3 != null) {
                ljii3.dispose();
            }
            this.LJII = null;
            return;
        }
        this.LJ();
    }
    
    @Override
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZ(s);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(s);
        }
    }
    
    @Override
    public final void LIZ(final String s, final long n) {
        CTM.LIZ((Object)s);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZ(s, n);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(s, n);
        }
    }
    
    @Override
    public final void LIZ(final String s, final SurfaceView surfaceView) {
        CTM.LIZ((Object)s, (Object)surfaceView);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZ(s, surfaceView);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(s, surfaceView);
        }
    }
    
    @Override
    public final void LIZ(final String s, final Boolean b) {
        CTM.LIZ((Object)s);
        if (b != null) {
            final boolean booleanValue = b;
            final 0xP ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                ljiijji.LIZ(s, booleanValue);
            }
        }
    }
    
    @Override
    public final void LIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        CTM.LIZ((Object)s, (Object)s2);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZ(s, s2);
        }
    }
    
    public final void LIZ(final boolean b) {
        if (this.LJIIJ == null) {
            n.LIZ("");
        }
        final Client ljii = this.LJII;
        if (ljii != null) {
            ljii.enableAllRemoteRender(b, false);
        }
    }
    
    public final Client LIZIZ(final L6w l6w, final 0xO 0xO) {
        final InteractConfig interactConfig = new InteractConfig();
        ((Config)interactConfig).setContext(0cB.LJ());
        ((Config)interactConfig).setLogReportInterval(5);
        if (CoHostSeiTalkSetting.INSTANCE.enable()) {
            ((Config)interactConfig).setVolumeThreshold(CoHostSeiTalkSetting.INSTANCE.getMinAudioVolume());
        }
        final IPullStreamService liz = 0jR.LIZ(IPullStreamService.class);
        n.LIZIZ((Object)liz, "");
        ((Config)interactConfig).setProjectKey(liz.getProjectKey());
        final IHostContext liz2 = 0jR.LIZ(IHostContext.class);
        n.LIZIZ((Object)liz2, "");
        ((Config)interactConfig).setAppChannel(liz2.getChannel());
        ((Config)interactConfig).setAppId(String.valueOf(0jR.LIZ(IHostContext.class).appId()));
        final IHostContext liz3 = 0jR.LIZ(IHostContext.class);
        n.LIZIZ((Object)liz3, "");
        ((Config)interactConfig).setAppVersion(liz3.getVersionCode());
        0xO.LIZ(interactConfig);
        this.LJIIIZ = l6w.getLiveCore();
        return l6w.LIZ(interactConfig);
    }
    
    @Override
    public final void LIZIZ(final int n, final String s) {
        CTM.LIZ((Object)s);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZIZ(n, s);
        this.LIZJ = false;
        if (this.LJI) {
            this.LJ = false;
            return;
        }
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZIZ(n, s);
        }
    }
    
    @Override
    public final void LIZIZ(final long n, final int n2) {
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZIZ(n, n2);
        }
    }
    
    @Override
    public final void LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZIZ(s);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZIZ(s);
        }
    }
    
    @Override
    public final void LIZIZ(final String s, final SurfaceView surfaceView) {
        CTM.LIZ((Object)s, (Object)surfaceView);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZIZ(s, surfaceView);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZIZ(s, surfaceView);
        }
    }
    
    @Override
    public final void LIZIZ(final String s, final Boolean b) {
        CTM.LIZ((Object)s);
        if (b != null) {
            final boolean booleanValue = b;
            final 0xP ljiijji = this.LJIIJJI;
            if (ljiijji != null) {
                ljiijji.LIZIZ(s, booleanValue);
            }
        }
    }
    
    @Override
    public final void LIZIZ(final String s, final String s2) {
        CTM.LIZ((Object)s, (Object)s2);
        CTM.LIZ((Object)s, (Object)s2);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZIZ(s, s2);
        }
    }
    
    public final void LIZIZ(final boolean b) {
        final Client ljii = this.LJII;
        if (ljii != null) {
            ljii.resume();
        }
        if (!LiveGuestBackgroundVoicePlaySetting.INSTANCE.getValue()) {
            final Client ljii2 = this.LJII;
            if (ljii2 != null) {
                ljii2.muteAllRemoteAudioStreams(b);
            }
        }
    }
    
    public final boolean LIZIZ() {
        return this.LJII == null;
    }
    
    public final void LIZJ() {
        if (this.LJIIJ == null) {
            n.LIZ("");
        }
        this.LJIIIIZZ.LIZ();
        this.LJIIJJI = null;
        final Client ljii = this.LJII;
        if (ljii != null) {
            ljii.setListener((Client$Listener)null);
        }
        final Client ljii2 = this.LJII;
        if (ljii2 != null) {
            ljii2.stop();
        }
        final Client ljii3 = this.LJII;
        if (ljii3 != null) {
            ljii3.dispose();
        }
    }
    
    @Override
    public final void LIZJ(final int n, final String s) {
        CTM.LIZ((Object)s);
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZJ(n, s);
        this.LIZIZ = false;
        this.LJI = true;
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZJ(n, s);
        }
    }
    
    @Override
    public final void LIZJ(final String s) {
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZJ(s);
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZJ(s);
        }
    }
    
    public final long LIZLLL(final String s) {
        CTM.LIZ((Object)s);
        final Client ljii = this.LJII;
        if (ljii != null) {
            final RTCEngine rtcEngine = ljii.getRtcEngine();
            if (rtcEngine != null) {
                return rtcEngine.sendRoomMessage(s);
            }
        }
        return 0L;
    }
    
    @Override
    public final void LIZLLL() {
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LIZLLL();
        this.LIZIZ = false;
        this.LJ = true;
        this.LIZLLL = true;
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LIZLLL();
        }
    }
    
    @Override
    public final void LJ() {
        final 0xN ljiij = this.LJIIJ;
        if (ljiij == null) {
            n.LIZ("");
        }
        ljiij.LIZ().LJ();
        this.LIZJ = false;
        this.LJ = false;
        this.LJFF = false;
        this.LIZLLL = false;
        final 0xP ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.LJ();
        }
    }
    
    public final void LJ(final String s) {
        final Client ljii = this.LJII;
        if (ljii != null) {
            ljii.updateRtcExtInfo(s);
        }
    }
    
    public final void LJFF() {
        final Client ljii = this.LJII;
        if (ljii != null) {
            ljii.invalidateSei();
        }
    }
    
    public final void LJI() {
        final Client ljii = this.LJII;
        if (ljii != null) {
            ljii.pause();
        }
        if (!LiveGuestBackgroundVoicePlaySetting.INSTANCE.getValue()) {
            final Client ljii2 = this.LJII;
            if (ljii2 != null) {
                ljii2.muteAllRemoteAudioStreams(true);
            }
        }
    }
}
