// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdk.chatroom.model.multiguestv3.BizJoinChannelParams;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3GuestGoLivePreviewPanelOpt;
import com.bytedance.covode.number.Covode;

public final class 1m0 extends GpV<GpW> implements 1Xe
{
    public final 1Vt LIZ;
    public final 24s LIZIZ;
    
    static {
        Covode.recordClassIndex(9144);
    }
    
    public 1m0(final 1Vt liz, final 24s liziz) {
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    public final 1Xa LIZ(final long n) {
        final int liz = 1Uo.LJJIJIIJIL.LIZ(n);
        if (0rF.LIZIZ(liz)) {
            final 1Xa 1Xa = new 1Xa(this, new 1YG(MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportSilentMic(), false, null, null, false, false, false, 0, 1022));
            0xo.LIZIZ("qiuyihao", "provideApplyDialogUICtrlCmd(audio only): ".concat(String.valueOf(1Xa)));
            return 1Xa;
        }
        if (0rF.LIZ(liz)) {
            final 1Xa 1Xa2 = new 1Xa(this, new 1YG(MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportSilentMic(), false, this, null, false, false, false, 0, 1006));
            0xo.LIZIZ("qiuyihao", "provideApplyDialogUICtrlCmd(video): ".concat(String.valueOf(1Xa2)));
            return 1Xa2;
        }
        0xo.LIZIZ("qiuyihao", "link type unknown");
        return null;
    }
    
    public final void LIZ(final GpW gpW) {
        super.LIZ(gpW);
    }
    
    public final void LIZ(final QgG<2P9> qgG, final QgG<2P9> qgG2) {
        public final class 1Xp implements W1I<Qmq>
        {
            public final /* synthetic */ QgG LIZ;
            public final /* synthetic */ QgG LIZIZ;
            
            static {
                Covode.recordClassIndex(9145);
            }
            
            public 1Xp(final QgG liz, final QgG liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void LIZ(final Vxk vxk, final Throwable t) {
                CTM.LIZ((Object)vxk);
                this.LIZIZ.invoke();
                0bv.LIZ(0cB.LJ(), t, null);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: getstatic       X/0b5.LIZIZ:Lcom/google/gson/Gson;
        //     8: astore_3       
        //     9: aload_0        
        //    10: getfield        X/1m0.LIZ:LX/1Vt;
        //    13: astore          4
        //    15: aload           4
        //    17: ifnull          87
        //    20: aload           4
        //    22: getfield        X/1Vt.LIZ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    25: astore          4
        //    27: aload           4
        //    29: ifnull          87
        //    32: aload           4
        //    34: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //    37: lstore          5
        //    39: ldc             "biz_params"
        //    41: aload_3        
        //    42: new             Lcom/bytedance/android/livesdk/chatroom/model/multiguestv3/BizJoinChannelParams;
        //    45: dup            
        //    46: lload           5
        //    48: invokespecial   com/bytedance/android/livesdk/chatroom/model/multiguestv3/BizJoinChannelParams.<init>:(J)V
        //    51: invokevirtual   com/google/gson/Gson.LIZIZ:(Ljava/lang/Object;)Ljava/lang/String;
        //    54: invokestatic    X/8sj.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)LX/8si;
        //    57: invokestatic    X/FJ4.LIZ:(LX/8si;)Ljava/util/Map;
        //    60: astore_3       
        //    61: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //    64: new             LX/2P1;
        //    67: dup            
        //    68: aload_3        
        //    69: invokespecial   X/2P1.<init>:(Ljava/util/Map;)V
        //    72: new             LX/1Xp;
        //    75: dup            
        //    76: aload_1        
        //    77: aload_2        
        //    78: invokespecial   X/1Xp.<init>:(LX/QgG;LX/QgG;)V
        //    81: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.joinChannel:(LX/2P1;LX/W1I;)V
        //    86: return         
        //    87: lconst_0       
        //    88: lstore          5
        //    90: goto            39
        //    Signature:
        //  (LX/QgG<LX/2P9;>;LX/QgG<LX/2P9;>;)V
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
    
    public final void LIZ(final String s, final int n) {
        CTM.LIZ((Object)s);
        final 24s liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LIZ(s, false, n);
        }
        0sP.LJ = false;
    }
    
    public final 0t2 LIZIZ(final long n) {
        final int liz = 1Uo.LJJIJIIJIL.LIZ(n);
        final boolean liziz = 0rF.LIZIZ(liz);
        final Room room = null;
        Room liz2 = null;
        if (liziz) {
            final boolean supportSilentMic = MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportSilentMic();
            final boolean supportCloseGoLive = MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportCloseGoLive();
            final 1Vt liz3 = this.LIZ;
            if (liz3 != null) {
                liz2 = liz3.LIZ;
            }
            final 1YG 1yg = new 1YG(supportSilentMic, supportCloseGoLive, this, null, 0t4.LIZIZ(liz2), true, false, 0, 806);
            0xo.LIZIZ("qiuyihao", "provideApplyConfirmDialogUICtrlCmd(audio only): ".concat(String.valueOf(1yg)));
            return 1yg;
        }
        if (0rF.LIZ(liz)) {
            final boolean supportSilentMic2 = MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportSilentMic();
            final boolean supportCloseGoLive2 = MultiGuestV3GuestGoLivePreviewPanelOpt.INSTANCE.isSupportCloseGoLive();
            final 1Vt liz4 = this.LIZ;
            Room liz5 = room;
            if (liz4 != null) {
                liz5 = liz4.LIZ;
            }
            final 1YG 1yg2 = new 1YG(supportSilentMic2, supportCloseGoLive2, this, null, 0t4.LIZ(liz5), true, false, 0, 806);
            0xo.LIZIZ("qiuyihao", "provideApplyConfirmDialogUICtrlCmd(video): ".concat(String.valueOf(1yg2)));
            return 1yg2;
        }
        0xo.LIZIZ("qiuyihao", "link type unknown");
        return null;
    }
}
