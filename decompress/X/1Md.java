// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.live.liveinteract.match.remote.api.LinkBattleApi;
import com.bytedance.android.live.liveinteract.multimatch.remote.api.MultiMatchApi;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveTimeIncrementForBattleSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import java.util.List;
import org.json.JSONObject;
import kotlin.jvm.internal.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.contract.MultiMatchBeInvitedContract;

public final class 1md extends a
{
    public final MatchBaseWidget LIZ;
    
    static {
        Covode.recordClassIndex(10038);
    }
    
    public 1md(final MultiMatchBeInvitedContract.AbsView absView, final MatchBaseWidget liz) {
        CTM.LIZ((Object)absView, (Object)liz);
        super(absView);
        this.LIZ = liz;
    }
    
    @Override
    public final 1ci LIZ() {
        return this.LIZ.LIZ(1ci.class);
    }
    
    @Override
    public final void LIZ(final int n, final SRS<? super Boolean, 2P9> srs) {
        public final class 1c1<T> implements 2d6
        {
            public final /* synthetic */ long LIZ;
            public final /* synthetic */ SRS LIZIZ;
            
            static {
                Covode.recordClassIndex(10040);
            }
            
            public 1c1(final long liz, final SRS liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        public final class 1c0<T> implements 2d6
        {
            public final /* synthetic */ 1md LIZ;
            public final /* synthetic */ long LIZIZ;
            public final /* synthetic */ SRS LIZJ;
            
            static {
                Covode.recordClassIndex(10039);
            }
            
            public 1c0(final 1md liz, final long liziz, final SRS lizj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: getfield        X/0kz.LJII:Lcom/bytedance/android/live/liveinteract/cohost/business/contract/InteractDialogFragmentBaseContract$AbsView;
        //     8: checkcast       Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/contract/MultiMatchBeInvitedContract$AbsView;
        //    11: astore_3       
        //    12: aload_3        
        //    13: ifnull          240
        //    16: aload_3        
        //    17: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/business/dialog/contract/MultiMatchBeInvitedContract$AbsView.LIZJ:()I
        //    20: iconst_1       
        //    21: if_icmpne       240
        //    24: getstatic       X/0n9.LIZIZ:LX/1Qk;
        //    27: invokevirtual   X/1Qk.LJ:()J
        //    30: lstore          4
        //    32: aload_0        
        //    33: invokevirtual   X/1cG.LIZ:()LX/1ci;
        //    36: getfield        X/1ci.LIZ:LX/15z;
        //    39: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //    42: checkcast       Ljava/lang/Long;
        //    45: astore          6
        //    47: aload           6
        //    49: astore_3       
        //    50: aload           6
        //    52: ifnonnull       60
        //    55: lconst_0       
        //    56: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    59: astore_3       
        //    60: aload_3        
        //    61: ldc             ""
        //    63: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    66: aload_3        
        //    67: invokevirtual   java/lang/Long.longValue:()J
        //    70: lstore          7
        //    72: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveInteractBattleDurationSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveInteractBattleDurationSetting;
        //    75: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveInteractBattleDurationSetting.getValue:()J
        //    78: lstore          9
        //    80: getstatic       com/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting;
        //    83: invokevirtual   com/bytedance/android/livesdk/livesetting/linkmic/LiveTimeIncrementForBattleSetting.getValue:()J
        //    86: lstore          11
        //    88: getstatic       X/1mg.LJIILJJIL:LX/1mg;
        //    91: astore          13
        //    93: invokestatic    X/Gqs.LIZ:()J
        //    96: putstatic       X/1mg.LIZJ:J
        //    99: new             Lorg/json/JSONObject;
        //   102: dup            
        //   103: invokespecial   org/json/JSONObject.<init>:()V
        //   106: astore          14
        //   108: aload           14
        //   110: ldc             "battle_id"
        //   112: lload           4
        //   114: invokestatic    X/0d3.LIZ:(Lorg/json/JSONObject;Ljava/lang/String;J)V
        //   117: new             Lorg/json/JSONObject;
        //   120: dup            
        //   121: invokespecial   org/json/JSONObject.<init>:()V
        //   124: astore          6
        //   126: aload           6
        //   128: ldc             "role_type"
        //   130: ldc             "invitee"
        //   132: invokestatic    X/0d3.LIZ:(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
        //   135: iload_1        
        //   136: ifne            234
        //   139: ldc             "normal"
        //   141: astore_3       
        //   142: aload           6
        //   144: ldc             "scene"
        //   146: aload_3        
        //   147: invokestatic    X/0d3.LIZ:(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V
        //   150: aload           13
        //   152: ldc             "reply_request"
        //   154: aload           14
        //   156: aload           6
        //   158: new             Lorg/json/JSONObject;
        //   161: dup            
        //   162: invokespecial   org/json/JSONObject.<init>:()V
        //   165: invokestatic    X/1mg.LIZ:(LX/1mg;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lorg/json/JSONObject;)V
        //   168: invokestatic    X/0yr.LIZ:()LX/0yr;
        //   171: ldc             Lcom/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi;.class
        //   173: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   176: checkcast       Lcom/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi;
        //   179: lload           4
        //   181: lload           7
        //   183: lload           9
        //   185: lload           9
        //   187: lload           11
        //   189: ladd           
        //   190: iload_1        
        //   191: invokeinterface com/bytedance/android/live/liveinteract/multimatch/remote/api/MultiMatchApi.acceptInvite:(JJJJI)LX/FBF;
        //   196: aload_0        
        //   197: invokevirtual   X/0kz.LJI:()LX/FCn;
        //   200: invokevirtual   X/FBF.LIZ:(LX/FBZ;)Ljava/lang/Object;
        //   203: checkcast       LX/FIc;
        //   206: new             LX/1c0;
        //   209: dup            
        //   210: aload_0        
        //   211: lload           4
        //   213: aload_2        
        //   214: invokespecial   X/1c0.<init>:(LX/1md;JLX/SRS;)V
        //   217: new             LX/1c1;
        //   220: dup            
        //   221: lload           4
        //   223: aload_2        
        //   224: invokespecial   X/1c1.<init>:(JLX/SRS;)V
        //   227: invokeinterface X/FIc.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   232: pop            
        //   233: return         
        //   234: ldc             "invite_each_other"
        //   236: astore_3       
        //   237: goto            142
        //   240: getstatic       X/0n9.LIZ:LX/1Qk;
        //   243: invokevirtual   X/1Qk.LJ:()J
        //   246: lstore          4
        //   248: goto            32
        //    Signature:
        //  (ILX/SRS<-Ljava/lang/Boolean;LX/2P9;>;)V
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
    
    @Override
    public final void LIZ(final SRS<? super Boolean, 2P9> srs) {
        public final class 1c3<T> implements 2d6
        {
            public final /* synthetic */ SRS LIZ;
            public final /* synthetic */ long LIZIZ;
            
            static {
                Covode.recordClassIndex(10042);
            }
            
            public 1c3(final SRS liz, final long liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        public final class 1c2<T> implements 2d6
        {
            public final /* synthetic */ 1md LIZ;
            public final /* synthetic */ long LIZIZ;
            public final /* synthetic */ SRS LIZJ;
            public final /* synthetic */ int LIZLLL;
            
            static {
                Covode.recordClassIndex(10041);
            }
            
            public 1c2(final 1md liz, final long liziz, final SRS lizj, final int lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: getfield        X/0kz.LJII:Lcom/bytedance/android/live/liveinteract/cohost/business/contract/InteractDialogFragmentBaseContract$AbsView;
        //     8: checkcast       Lcom/bytedance/android/live/liveinteract/multimatch/business/dialog/contract/MultiMatchBeInvitedContract$AbsView;
        //    11: astore_2       
        //    12: iconst_0       
        //    13: istore_3       
        //    14: aload_2        
        //    15: ifnull          161
        //    18: aload_2        
        //    19: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/business/dialog/contract/MultiMatchBeInvitedContract$AbsView.LIZJ:()I
        //    22: istore          4
        //    24: iload           4
        //    26: istore          5
        //    28: iload           4
        //    30: iconst_1       
        //    31: if_icmpne       164
        //    34: getstatic       X/0n9.LIZIZ:LX/1Qk;
        //    37: invokevirtual   X/1Qk.LJ:()J
        //    40: lstore          6
        //    42: iconst_2       
        //    43: istore          5
        //    45: aload_0        
        //    46: invokevirtual   X/1cG.LIZ:()LX/1ci;
        //    49: getfield        X/1ci.LIZ:LX/15z;
        //    52: invokevirtual   androidx/lifecycle/LiveData.getValue:()Ljava/lang/Object;
        //    55: checkcast       Ljava/lang/Long;
        //    58: astore          8
        //    60: aload           8
        //    62: astore_2       
        //    63: aload           8
        //    65: ifnonnull       73
        //    68: lconst_0       
        //    69: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    72: astore_2       
        //    73: aload_2        
        //    74: ldc             ""
        //    76: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    79: aload_2        
        //    80: invokevirtual   java/lang/Long.longValue:()J
        //    83: lstore          9
        //    85: getstatic       X/1mg.LJIILJJIL:LX/1mg;
        //    88: iload           4
        //    90: lload           6
        //    92: ldc             "active"
        //    94: lconst_0       
        //    95: invokevirtual   X/1mg.LIZ:(IJLjava/lang/String;J)V
        //    98: invokestatic    X/0yr.LIZ:()LX/0yr;
        //   101: ldc             Lcom/bytedance/android/live/liveinteract/match/remote/api/LinkBattleApi;.class
        //   103: invokevirtual   X/0yr.LIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //   106: checkcast       Lcom/bytedance/android/live/liveinteract/match/remote/api/LinkBattleApi;
        //   109: lload           9
        //   111: lload           6
        //   113: iload           4
        //   115: iconst_0       
        //   116: invokeinterface com/bytedance/android/live/liveinteract/match/remote/api/LinkBattleApi.reject:(JJII)LX/FBF;
        //   121: aload_0        
        //   122: invokevirtual   X/0kz.LJI:()LX/FCn;
        //   125: invokevirtual   X/FBF.LIZ:(LX/FBZ;)Ljava/lang/Object;
        //   128: checkcast       LX/FIc;
        //   131: new             LX/1c2;
        //   134: dup            
        //   135: aload_0        
        //   136: lload           6
        //   138: aload_1        
        //   139: iload           5
        //   141: invokespecial   X/1c2.<init>:(LX/1md;JLX/SRS;I)V
        //   144: new             LX/1c3;
        //   147: dup            
        //   148: aload_1        
        //   149: lload           6
        //   151: invokespecial   X/1c3.<init>:(LX/SRS;J)V
        //   154: invokeinterface X/FIc.LIZ:(LX/2d6;LX/2d6;)LX/2fc;
        //   159: pop            
        //   160: return         
        //   161: iconst_0       
        //   162: istore          5
        //   164: getstatic       X/0n9.LIZ:LX/1Qk;
        //   167: invokevirtual   X/1Qk.LJ:()J
        //   170: lstore          6
        //   172: iload           5
        //   174: istore          4
        //   176: iload_3        
        //   177: istore          5
        //   179: goto            45
        //    Signature:
        //  (LX/SRS<-Ljava/lang/Boolean;LX/2P9;>;)V
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
}
