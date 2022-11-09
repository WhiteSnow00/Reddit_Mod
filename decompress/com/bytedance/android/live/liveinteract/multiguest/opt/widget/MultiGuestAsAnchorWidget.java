// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multiguest.opt.widget;

import X.GK2;
import com.bytedance.android.widget.Widget;
import X.0CC;
import X.1YV;
import X.2Fe;
import org.json.JSONObject;
import X.2G5;
import X.Fgq;
import X.FGP;
import X.0tW;
import X.1Yj;
import X.2Gb;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import X.G69;
import X.0xt;
import X.0xo;
import X.2Im;
import X.F5g;
import X.GTi;
import android.content.Context;
import android.app.Dialog;
import X.KN6;
import X.GCe;
import X.0k8;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import X.6E8;
import com.bytedance.bpea.basics.PrivacyCert$Builder;
import X.5E5;
import X.Hf4;
import X.0cB;
import X.0CH;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.2Ge;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import java.util.List;
import X.GpW;
import X.Gmg;
import android.view.SurfaceView;
import X.CTM;
import X.0ba;
import com.bytedance.covode.number.Covode;
import X.2P9;
import X.Fgf;
import X.SRS;
import com.bytedance.android.live.liveinteract.multilive.anchor.ui.dialog.MultiLiveAnchorOpenCameraDialog;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.0j2;
import X.0kW;
import X.1Uo;
import X.1Yq;
import X.0rW;
import X.1mM;
import X.1kJ;
import X.6mZ;
import X.0qt;
import com.bytedance.android.live.liveinteract.commoninterface.BaseInternalLinkMicAnchorWidget;

public final class MultiGuestAsAnchorWidget extends BaseInternalLinkMicAnchorWidget implements a, 6mZ
{
    public 1kJ LIZ;
    public 1mM LIZIZ;
    public 0rW LIZJ;
    public 1Yq LIZLLL;
    @0kW(LIZ = "MULTI_GUEST_DATA_HOLDER")
    public 1Uo LJ;
    public 0j2 LJFF;
    public Room LJI;
    public MultiLiveAnchorOpenCameraDialog LJII;
    public final String LJIIIIZZ;
    public final SRS<Fgf, 2P9> LJIIIZ;
    
    static {
        Covode.recordClassIndex(8627);
    }
    
    public MultiGuestAsAnchorWidget() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/liveinteract/commoninterface/BaseInternalLinkMicAnchorWidget.<init>:()V
        //     4: aload_0        
        //     5: ldc             "MultiLiveAnchorOpenCamera"
        //     7: putfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LJIIIIZZ:Ljava/lang/String;
        //    10: aload_0        
        //    11: new             LX/212;
        //    14: dup            
        //    15: aload_0        
        //    16: invokespecial   X/212.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //    19: putfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LJIIIZ:LX/SRS;
        //    22: getstatic       X/1jw.LIZ:LX/1jw;
        //    25: aload_0        
        //    26: invokevirtual   X/1Na.LIZ:(Ljava/lang/Object;)V
        //    29: return         
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
    
    public final void LIZ() {
        final 1kJ liz = this.LIZ;
        if (liz != null) {
            liz.LJIIJ();
        }
    }
    
    @Override
    public final void LIZ(final long n, final long n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(n);
        sb.append(' ');
        sb.append(n2);
        0ba.LIZ(4, "bitrate_callback", sb.toString());
        final 0j2 ljff = this.LJFF;
        if (ljff != null) {
            ljff.LIZ();
        }
    }
    
    @Override
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZJ(s);
        }
    }
    
    @Override
    public final void LIZ(final String s, final SurfaceView surfaceView) {
        CTM.LIZ((Object)s, (Object)surfaceView);
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZ(s, surfaceView);
        }
    }
    
    public final void LIZ(final Throwable t) {
        Gmg.LIZ((GpW)this, t);
    }
    
    @Override
    public final void LIZ(final List<LinkPlayerInfo> list) {
        public final class 0rG implements DialogInterface$OnDismissListener
        {
            public final /* synthetic */ MultiGuestAsAnchorWidget LIZ;
            
            static {
                Covode.recordClassIndex(8636);
            }
            
            public 0rG(final MultiGuestAsAnchorWidget liz) {
                this.LIZ = liz;
            }
            
            public final void onDismiss(final DialogInterface dialogInterface) {
                final DataChannel dataChannel = this.LIZ.dataChannel;
                if (dataChannel != null) {
                    dataChannel.LIZJ((Class)2Ge.class);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: invokevirtual   com/bytedance/android/widget/Widget.isViewValid:()Z
        //     8: ifne            12
        //    11: return         
        //    12: aload_0        
        //    13: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZ:LX/1kJ;
        //    16: astore_2       
        //    17: aload_2        
        //    18: ifnull          159
        //    21: aload_0        
        //    22: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LJ:LX/1Uo;
        //    25: astore_3       
        //    26: aload_3        
        //    27: ifnonnull       35
        //    30: ldc             ""
        //    32: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    35: aload_0        
        //    36: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZLLL:LX/1Yq;
        //    39: astore_1       
        //    40: aload_1        
        //    41: ifnull          165
        //    44: aload_1        
        //    45: getfield        X/1Yq.LIZ:I
        //    48: istore          4
        //    50: aload_3        
        //    51: iload           4
        //    53: putfield        X/1Uo.LJIJ:I
        //    56: aload_0        
        //    57: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZIZ:LX/1mM;
        //    60: ifnonnull       113
        //    63: aload_0        
        //    64: getfield        com/bytedance/android/widget/Widget.context:Landroid/content/Context;
        //    67: astore_3       
        //    68: aload_3        
        //    69: ldc             ""
        //    71: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    74: aload_0        
        //    75: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZ:LX/1kJ;
        //    78: astore_1       
        //    79: aload_1        
        //    80: ifnull          160
        //    83: aload_1        
        //    84: invokevirtual   X/1kJ.LJIIJJI:()Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    87: astore_1       
        //    88: new             LX/1mM;
        //    91: dup            
        //    92: aload_0        
        //    93: aload_3        
        //    94: aload_1        
        //    95: invokespecial   X/1mM.<init>:(LX/0CH;Landroid/content/Context;Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //    98: astore_1       
        //    99: aload_1        
        //   100: aload_2        
        //   101: putfield        X/1mM.LJFF:LX/0mc;
        //   104: aload_1        
        //   105: invokevirtual   X/1mM.LJI:()V
        //   108: aload_0        
        //   109: aload_1        
        //   110: putfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZIZ:LX/1mM;
        //   113: aload_0        
        //   114: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZIZ:LX/1mM;
        //   117: astore_1       
        //   118: aload_1        
        //   119: ifnull          134
        //   122: aload_1        
        //   123: new             LX/0rG;
        //   126: dup            
        //   127: aload_0        
        //   128: invokespecial   X/0rG.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //   131: invokevirtual   X/1mM.setOnDismissListener:(Landroid/content/DialogInterface$OnDismissListener;)V
        //   134: aload_0        
        //   135: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZIZ:LX/1mM;
        //   138: astore_1       
        //   139: aload_1        
        //   140: ifnull          154
        //   143: aload_1        
        //   144: invokevirtual   X/1mM.show:()V
        //   147: getstatic       X/KN6.LIZ:LX/KN6;
        //   150: aload_1        
        //   151: invokevirtual   X/KN6.LIZ:(Landroid/app/Dialog;)V
        //   154: aload_0        
        //   155: aconst_null    
        //   156: putfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZLLL:LX/1Yq;
        //   159: return         
        //   160: aconst_null    
        //   161: astore_1       
        //   162: goto            88
        //   165: iconst_m1      
        //   166: istore          4
        //   168: goto            50
        //    Signature:
        //  (Ljava/util/List<Lcom/bytedance/android/livesdk/chatroom/model/interact/LinkPlayerInfo;>;)V
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
    
    public final void LIZIZ() {
        final 1kJ liz = this.LIZ;
        if (liz != null) {
            liz.LJII();
        }
    }
    
    @Override
    public final void LIZIZ(final String s) {
        CTM.LIZ((Object)s);
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZJ(s);
        }
    }
    
    @Override
    public final void LIZJ() {
    }
    
    @Override
    public final void LIZJ(String liz) {
        CTM.LIZ((Object)liz);
        liz = 0cB.LIZ(2131830560, liz);
        Hf4.LIZ(0cB.LJ(), liz, 0L);
    }
    
    @Override
    public final void LIZLLL() {
        Hf4.LIZ(((Widget)this).context, 2131835905);
        final 1kJ liz = this.LIZ;
        if (liz != null) {
            final 5E5 rtc_ERROR = 5E5.RTC_ERROR;
            final PrivacyCert$Builder with = PrivacyCert$Builder.Companion.with("bpea-530");
            with.usage("");
            with.tag("stop link mic when error occurs");
            with.policies(new 6E8[] { PrivacyPolicyStore.getAudioPrivacyPolicy() });
            liz.LIZ(rtc_ERROR, (Cert)with.build());
        }
    }
    
    @Override
    public final void LIZLLL(final String s) {
        CTM.LIZ((Object)s);
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZLLL(s);
        }
    }
    
    @Override
    public final void LJ() {
        if (((Widget)this).isViewValid()) {
            final 1mM liziz = this.LIZIZ;
            if (liziz != null && liziz.isShowing()) {
                final 1mM liziz2 = this.LIZIZ;
                if (liziz2 != null) {
                    liziz2.LJIIIZ();
                }
            }
        }
    }
    
    @Override
    public final void LJ(final String s) {
        CTM.LIZ((Object)s);
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZLLL(s);
        }
    }
    
    @Override
    public final void LJFF() {
        final 1Uo lj = this.LJ;
        if (lj == null) {
            n.LIZ("");
        }
        if (lj.LJIILL != 0k8.NORMAL) {
            final 0rW lizj = this.LIZJ;
            if (lizj != null) {
                lizj.LIZJ();
            }
        }
    }
    
    @Override
    public final void LJFF(final String s) {
        CTM.LIZ((Object)s);
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZIZ(s);
        }
    }
    
    @Override
    public final int LJI(final String s) {
        CTM.LIZ((Object)s);
        final GCe liz = GCe.LIZ();
        n.LIZIZ((Object)liz, "");
        if (n.LIZ((Object)s, (Object)liz.LJII)) {
            return 0;
        }
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            return lizj.LJ(s);
        }
        return -1;
    }
    
    @Override
    public final void LJI() {
        final MultiLiveAnchorOpenCameraDialog ljii = this.LJII;
        if (ljii != null && ljii.isShowing()) {
            return;
        }
        final 1Uo lj = this.LJ;
        if (lj == null) {
            n.LIZ("");
        }
        if (!lj.LIZIZ) {
            final 1mM liziz = this.LIZIZ;
            if (liziz != null) {
                liziz.dismiss();
            }
            final Context context = ((Widget)this).context;
            n.LIZIZ((Object)context, "");
            final MultiLiveAnchorOpenCameraDialog ljii2 = new MultiLiveAnchorOpenCameraDialog(context, super.dataChannel, (0CH)this, "end_link_and_no_guest");
            (this.LJII = ljii2).show();
            KN6.LIZ.LIZ((Dialog)ljii2);
        }
    }
    
    @Override
    public final int LJII(final String s) {
        CTM.LIZ((Object)s);
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            return lizj.LJFF(s);
        }
        return -1;
    }
    
    @Override
    public final void LJII() {
    }
    
    public final void LJIIIIZZ() {
        final MultiLiveAnchorOpenCameraDialog ljii = this.LJII;
        if (ljii != null) {
            GTi.LIZIZ((Dialog)ljii);
        }
        final 1mM liziz = this.LIZIZ;
        if (liziz != null) {
            GTi.LIZIZ((Dialog)liziz);
        }
        final 1mM liziz2 = this.LIZIZ;
        if (liziz2 != null) {
            liziz2.LJIIJJI();
        }
    }
    
    public final String LJIIL() {
        return this.getClass().getName();
    }
    
    public final int getLayoutId() {
        return 2131562387;
    }
    
    public final void onCreate() {
        public final class 219 extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiGuestAsAnchorWidget LIZ;
            
            static {
                Covode.recordClassIndex(8635);
            }
            
            public 219(final MultiGuestAsAnchorWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 218 extends F5g implements SRS<1Yq, 2P9>
        {
            public final /* synthetic */ MultiGuestAsAnchorWidget LIZ;
            
            static {
                Covode.recordClassIndex(8634);
            }
            
            public 218(final MultiGuestAsAnchorWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 217 extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiGuestAsAnchorWidget LIZ;
            
            static {
                Covode.recordClassIndex(8633);
            }
            
            public 217(final MultiGuestAsAnchorWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 216 extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiGuestAsAnchorWidget LIZ;
            
            static {
                Covode.recordClassIndex(8632);
            }
            
            public 216(final MultiGuestAsAnchorWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 215 extends F5g implements SRS<2Im, 2P9>
        {
            public final /* synthetic */ MultiGuestAsAnchorWidget LIZ;
            
            static {
                Covode.recordClassIndex(8631);
            }
            
            public 215(final MultiGuestAsAnchorWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 214 extends F5g implements SRS<Boolean, 2P9>
        {
            public final /* synthetic */ MultiGuestAsAnchorWidget LIZ;
            
            static {
                Covode.recordClassIndex(8630);
            }
            
            public 214(final MultiGuestAsAnchorWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 213 extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiGuestAsAnchorWidget LIZ;
            
            static {
                Covode.recordClassIndex(8629);
            }
            
            public 213(final MultiGuestAsAnchorWidget liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/ies/sdk/widgets/LiveWidget.onCreate:()V
        //     4: ldc_w           "LinkIn_Anchor_Widget_onCreate"
        //     7: invokestatic    X/0xo.LIZ:(Ljava/lang/String;)V
        //    10: aload_0        
        //    11: aload_0        
        //    12: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    15: ldc_w           LX/G69;.class
        //    18: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    21: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    24: putfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LJI:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    27: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //    30: aload_0        
        //    31: ldc_w           LX/2Gb;.class
        //    34: new             LX/213;
        //    37: dup            
        //    38: aload_0        
        //    39: invokespecial   X/213.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //    42: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)V
        //    45: aload_0        
        //    46: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    49: astore_1       
        //    50: aload_1        
        //    51: aload_0        
        //    52: ldc_w           LX/2Ea;.class
        //    55: aload_0        
        //    56: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LJIIIZ:LX/SRS;
        //    59: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    62: pop            
        //    63: aload_1        
        //    64: aload_0        
        //    65: ldc_w           LX/Gw5;.class
        //    68: new             LX/214;
        //    71: dup            
        //    72: aload_0        
        //    73: invokespecial   X/214.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //    76: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    79: pop            
        //    80: aload_1        
        //    81: aload_0        
        //    82: ldc_w           LX/2GQ;.class
        //    85: new             LX/215;
        //    88: dup            
        //    89: aload_0        
        //    90: invokespecial   X/215.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //    93: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    96: pop            
        //    97: aload_1        
        //    98: aload_0        
        //    99: ldc_w           LX/2G7;.class
        //   102: new             LX/216;
        //   105: dup            
        //   106: aload_0        
        //   107: invokespecial   X/216.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //   110: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   113: pop            
        //   114: aload_1        
        //   115: aload_0        
        //   116: ldc_w           LX/2Ge;.class
        //   119: new             LX/217;
        //   122: dup            
        //   123: aload_0        
        //   124: invokespecial   X/217.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //   127: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   130: pop            
        //   131: aload_1        
        //   132: aload_0        
        //   133: ldc_w           LX/2Ff;.class
        //   136: new             LX/218;
        //   139: dup            
        //   140: aload_0        
        //   141: invokespecial   X/218.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //   144: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(Ljava/lang/Object;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   147: pop            
        //   148: aload_1        
        //   149: aload_0        
        //   150: ldc_w           LX/2GP;.class
        //   153: new             LX/219;
        //   156: dup            
        //   157: aload_0        
        //   158: invokespecial   X/219.<init>:(Lcom/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget;)V
        //   161: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   164: pop            
        //   165: aload_0        
        //   166: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LJI:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   169: astore_1       
        //   170: aload_1        
        //   171: ifnull          198
        //   174: aload_0        
        //   175: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   178: astore_2       
        //   179: aload_2        
        //   180: ldc             ""
        //   182: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   185: aload_0        
        //   186: new             LX/20Y;
        //   189: dup            
        //   190: aload_1        
        //   191: aload_2        
        //   192: invokespecial   X/20Y.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //   195: putfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZ:LX/1kJ;
        //   198: aload_0        
        //   199: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZ:LX/1kJ;
        //   202: astore_1       
        //   203: aload_1        
        //   204: ifnull          212
        //   207: aload_1        
        //   208: aload_0        
        //   209: invokevirtual   X/GpV.LIZ:(LX/GpW;)V
        //   212: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //   215: ldc_w           2131829039
        //   218: invokestatic    X/Hf4.LIZ:(Landroid/content/Context;I)V
        //   221: aload_0        
        //   222: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZ:LX/1kJ;
        //   225: astore_1       
        //   226: aload_1        
        //   227: ifnonnull       233
        //   230: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   233: aload_1        
        //   234: getfield        X/1kJ.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   237: astore_1       
        //   238: aload_0        
        //   239: getfield        com/bytedance/android/widget/Widget.contentView:Landroid/view/View;
        //   242: astore_2       
        //   243: aload_2        
        //   244: ldc_w           "null cannot be cast to non-null type android.widget.FrameLayout"
        //   247: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   250: pop            
        //   251: aload_2        
        //   252: checkcast       Landroid/widget/FrameLayout;
        //   255: astore_2       
        //   256: aload_0        
        //   257: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZ:LX/1kJ;
        //   260: astore_3       
        //   261: aload_3        
        //   262: ifnonnull       268
        //   265: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   268: new             LX/1ZK;
        //   271: dup            
        //   272: aload_1        
        //   273: aload_2        
        //   274: aload_3        
        //   275: invokevirtual   X/1kJ.LIZJ:()LX/1Tr;
        //   278: invokespecial   X/1ZK.<init>:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;Landroid/widget/FrameLayout;LX/1Tr;)V
        //   281: astore_2       
        //   282: aload_0        
        //   283: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   286: astore_1       
        //   287: aload_1        
        //   288: ldc             ""
        //   290: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   293: aload_2        
        //   294: aload_1        
        //   295: invokevirtual   X/0rW.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)V
        //   298: aload_2        
        //   299: iconst_0       
        //   300: invokevirtual   X/0rW.LIZ:(Z)V
        //   303: aload_0        
        //   304: aload_2        
        //   305: putfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LIZJ:LX/0rW;
        //   308: getstatic       X/1Yj.LJI:LX/0tX;
        //   311: aload_0        
        //   312: getfield        com/bytedance/android/live/liveinteract/multiguest/opt/widget/MultiGuestAsAnchorWidget.LJI:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   315: aload_0        
        //   316: getfield        com/bytedance/android/widget/Widget.context:Landroid/content/Context;
        //   319: invokestatic    X/GTi.LIZ:(Landroid/content/Context;)LX/1nL;
        //   322: aload_0        
        //   323: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   326: iconst_0       
        //   327: invokevirtual   X/0tX.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/live/Room;LX/1nL;Lcom/bytedance/ies/sdk/datachannel/DataChannel;Z)LX/0tW;
        //   330: pop            
        //   331: return         
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
    
    public final void onDestroy() {
        0xo.LIZ("LinkIn_Anchor_Widget_onDestroy");
        final 1kJ liz = this.LIZ;
        if (liz != null) {
            ((GK2)liz).LIZ();
        }
        final 0rW lizj = this.LIZJ;
        if (lizj != null) {
            lizj.LIZIZ();
        }
        final DataChannel dataChannel = super.dataChannel;
        if (dataChannel != null) {
            dataChannel.LIZIZ((Object)this);
        }
        super.onDestroy();
        final 0tW liz2 = 1Yj.LJI.LIZ();
        if (liz2 != null) {
            liz2.LIZIZ();
        }
        this.LJIIIIZZ();
    }
    
    public final void onPause() {
        final 1kJ liz = this.LIZ;
        if (liz != null) {
            liz.LJIIIZ();
        }
        super.onPause();
    }
    
    public final void onResume() {
        super.onResume();
        final 1kJ liz = this.LIZ;
        if (liz != null) {
            liz.LJIIIIZZ();
        }
        final MultiLiveAnchorOpenCameraDialog ljii = this.LJII;
        if (ljii != null && ljii.isShowing()) {
            final MultiLiveAnchorOpenCameraDialog ljii2 = this.LJII;
            if (ljii2 != null) {
                ljii2.LIZ();
            }
            return;
        }
        final 1Uo lj = this.LJ;
        if (lj == null) {
            n.LIZ("");
        }
        if (lj.LJII == 0) {
            final 1Uo lj2 = this.LJ;
            if (lj2 == null) {
                n.LIZ("");
            }
            lj2.LIZIZ = true;
            FGP.LIZ().LIZ((Object)new Fgq(40));
            final DataChannel dataChannel = super.dataChannel;
            if (dataChannel != null) {
                dataChannel.LIZJ((Class)2G5.class, (Object)true);
            }
            final JSONObject jsonObject = new JSONObject();
            jsonObject.put("log_name", (Object)"ttlive_multilive_anchor_switch_camera");
            jsonObject.put("switch", (Object)"on");
            jsonObject.put("way", (Object)"Anchor's camera is opened forcedly in MultiGuestAsAnchorWidget");
            0ba.LIZ(4, this.LJIIIIZZ, jsonObject.toString());
            final DataChannel dataChannel2 = super.dataChannel;
            if (dataChannel2 != null) {
                dataChannel2.LIZJ((Class)2Fe.class, (Object)new 1YV(false, "end_link_and_no_guest"));
            }
        }
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
