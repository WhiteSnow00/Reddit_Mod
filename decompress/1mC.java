// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.battle.BattleSetting;
import com.bytedance.android.livesdkapi.depend.model.live.RoomLinkInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.match.BattleIdentifyTimeOutCheckBattleInfo;
import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import kotlin.jvm.internal.n;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.bytedance.android.livesdkapi.depend.model.live.Room;

public final class 1mc extends GpV<1ma>
{
    public int LIZ;
    public int LIZIZ;
    public Room LIZJ;
    public final OnMessageListener LIZLLL;
    public final SRT<VzU, 1Wh<1T0>, 2P9> LJ;
    
    static {
        Covode.recordClassIndex(9964);
    }
    
    public 1mc() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   X/GpV.<init>:()V
        //     4: aload_0        
        //     5: iconst_1       
        //     6: putfield        X/1mc.LIZ:I
        //     9: aload_0        
        //    10: new             LX/1bg;
        //    13: dup            
        //    14: aload_0        
        //    15: invokespecial   X/1bg.<init>:(LX/1mc;)V
        //    18: putfield        X/1mc.LIZLLL:Lcom/ss/ugc/live/sdk/message/interfaces/OnMessageListener;
        //    21: aload_0        
        //    22: new             LX/27L;
        //    25: dup            
        //    26: aload_0        
        //    27: invokespecial   X/27L.<init>:(LX/1mc;)V
        //    30: putfield        X/1mc.LJ:LX/SRT;
        //    33: return         
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
        0jz.LIZLLL().unsubscribe(1T0.class, this.LJ);
        final DataChannel ljjijl = super.LJJIJL;
        if (ljjijl != null) {
            final IMessageManager messageManager = (IMessageManager)ljjijl.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.removeMessageListener(this.LIZLLL);
            }
        }
        super.LIZ();
    }
    
    public final void LIZ(final int n) {
        public final class 1bf<T> implements 2d6
        {
            public final /* synthetic */ 1mc LIZ;
            
            static {
                Covode.recordClassIndex(9966);
            }
            
            public 1bf(final 1mc liz) {
                this.LIZ = liz;
            }
        }
        public final class 1be<T> implements 2d6
        {
            public final /* synthetic */ 1mc LIZ;
            public final /* synthetic */ int LIZIZ;
            
            static {
                Covode.recordClassIndex(9965);
            }
            
            public 1be(final 1mc liz, final int liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
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
        //     8: iconst_4       
        //     9: ldc             "MultiMatchAudiencePrese"
        //    11: ldc             "checkBattleInfo"
        //    13: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    16: getstatic       X/0n9.LIZ:LX/1Qk;
        //    19: invokevirtual   X/1Qk.LJFF:()J
        //    22: lstore_2       
        //    23: aload_0        
        //    24: invokevirtual   X/1mc.LIZJ:()Z
        //    27: istore          4
        //    29: ldc             "audience_start"
        //    31: astore          5
        //    33: iload           4
        //    35: ifne            144
        //    38: ldc             "audience_start"
        //    40: invokestatic    X/1lI.LIZ:(Ljava/lang/String;)V
        //    43: invokestatic    X/0yr.LIZ:()LX/0yr;
        //    46: ldc             Lcom/bytedance/android/live/liveinteract/match/remote/api/LinkBattleApi;.class
        //    48: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    51: checkcast       Lcom/bytedance/android/live/liveinteract/match/remote/api/LinkBattleApi;
        //    54: astore          5
        //    56: aload_0        
        //    57: getfield        X/1mc.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    60: astore          6
        //    62: aload           6
        //    64: ifnonnull       72
        //    67: ldc             ""
        //    69: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    72: aload           6
        //    74: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //    77: lstore          7
        //    79: aload_0        
        //    80: getfield        X/1mc.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    83: astore          6
        //    85: aload           6
        //    87: ifnonnull       95
        //    90: ldc             ""
        //    92: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //    95: aload           5
        //    97: lload           7
        //    99: lload_2        
        //   100: aload           6
        //   102: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   105: invokeinterface com/bytedance/android/live/liveinteract/match/remote/api/LinkBattleApi.getInfo:(JJJ)LX/FBF;
        //   110: aload_0        
        //   111: invokevirtual   X/GpV.LJJIFFI:()LX/FCn;
        //   114: invokevirtual   X/FBF.LIZ:(LX/FBZ;)Ljava/lang/Object;
        //   117: checkcast       LX/FIc;
        //   120: new             LX/1be;
        //   123: dup            
        //   124: aload_0        
        //   125: iload_1        
        //   126: invokespecial   X/1be.<init>:(LX/1mc;I)V
        //   129: new             LX/1bf;
        //   132: dup            
        //   133: aload_0        
        //   134: invokespecial   X/1bf.<init>:(LX/1mc;)V
        //   137: invokeinterface X/FIc.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   142: pop            
        //   143: return         
        //   144: getstatic       X/1mg.LJIILJJIL:LX/1mg;
        //   147: astore          6
        //   149: iload_1        
        //   150: iconst_1       
        //   151: if_icmpeq       185
        //   154: iload_1        
        //   155: iconst_2       
        //   156: if_icmpeq       178
        //   159: iload_1        
        //   160: iconst_3       
        //   161: if_icmpeq       168
        //   164: ldc             "other"
        //   166: astore          5
        //   168: aload           6
        //   170: aload           5
        //   172: invokevirtual   X/1mg.LIZIZ:(Ljava/lang/String;)V
        //   175: goto            43
        //   178: ldc             "match_expired"
        //   180: astore          5
        //   182: goto            168
        //   185: ldc             "audience_room_enter"
        //   187: astore          5
        //   189: goto            168
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
    
    public final void LIZ(final 1ma 1ma) {
        super.LIZ((GpW)1ma);
        final DataChannel ljjijl = super.LJJIJL;
        Room lizj;
        if (ljjijl == null || (lizj = (Room)ljjijl.LIZIZ((Class)G69.class)) == null) {
            lizj = new Room();
        }
        this.LIZJ = lizj;
        final DataChannel ljjijl2 = super.LJJIJL;
        if (ljjijl2 != null) {
            final IMessageManager messageManager = (IMessageManager)ljjijl2.LIZIZ((Class)GwN.class);
            if (messageManager != null) {
                messageManager.addMessageListener(HDh.LINK_MIC_BATTLE.getIntType(), this.LIZLLL);
            }
        }
        final int size = 0jz.LIZLLL().getCoHostLinkedUserList().size();
        int liz = 3;
        if (size < 3) {
            liz = 1;
        }
        this.LIZ = liz;
        0jz.LIZLLL().subscribe(1T0.class, this.LJ);
    }
    
    public final int LIZIZ() {
        if (((GK2)this).LJJIL == null) {
            return 0;
        }
        final Room lizj = this.LIZJ;
        if (lizj == null) {
            n.LIZ("");
        }
        if (lizj.getLinkMicInfo() == null) {
            0ba.LIZ(6, "MultiMatchAudiencePrese", "link co_host; link_mic empty");
            return 1;
        }
        if (!this.LIZJ()) {
            1lI.LIZ("audience_start");
        }
        final Room lizj2 = this.LIZJ;
        if (lizj2 == null) {
            n.LIZ("");
        }
        final RoomLinkInfo linkMicInfo = lizj2.getLinkMicInfo();
        BattleInfoResponse lj;
        if (linkMicInfo != null) {
            lj = linkMicInfo.LJ;
        }
        else {
            lj = null;
        }
        if (lj == null) {
            0ba.LIZ(6, "MultiMatchAudiencePrese", "link match; battle_info empty");
            return 2;
        }
        final Long liz = lj.LIZ;
        final long lj2 = 1NN.LLFF.LIZ().LJ;
        if (liz != null && liz == lj2) {
            0ba.LIZ(4, "MultiMatchAudiencePrese", "initBattleInfo, info = ".concat(String.valueOf(lj)));
            final BattleSetting lizj3 = lj.LIZJ;
            if (lizj3 != null && lizj3.LJ == 1) {
                0n9.LIZ.LJJIJ = true;
            }
            final 1ma 1ma = (1ma)((GK2)this).LJJIL;
            if (1ma != null && !1ma.LIZ(lj, 0) && BattleIdentifyTimeOutCheckBattleInfo.INSTANCE.getValue()) {
                this.LIZ(2);
            }
            return 0;
        }
        0ba.LIZ(6, "MultiMatchAudiencePrese", "link match; channel id changed");
        return 1;
    }
    
    public final boolean LIZJ() {
        return 0jz.LIZLLL().getCoHostLinkedUserList().size() > 2;
    }
}
