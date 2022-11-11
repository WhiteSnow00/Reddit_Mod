// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.pin.widget;

import com.bytedance.ies.sdk.widgets.LiveWidget;
import X.0CC;
import X.0CH;
import X.HYh;
import X.GST;
import java.util.ArrayList;
import X.0zY;
import java.util.List;
import X.G69;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import X.CTM;
import kotlin.jvm.internal.n;
import X.2AE;
import X.2AD;
import X.2HI;
import java.util.Objects;
import X.2AC;
import X.2P9;
import X.QgG;
import X.2AB;
import X.2Hn;
import X.G8U;
import X.10h;
import X.1e7;
import X.0Bf;
import X.1ms;
import com.bytedance.covode.number.Covode;
import X.5DO;
import X.H31;
import X.2Gk;
import X.0zO;
import com.bytedance.android.live.pin.PinMessageViewModel;
import X.1e0;
import X.1e5;
import X.6mZ;
import X.10K;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;

public abstract class BaseCommentPinnedWidget extends LiveRecyclableWidget implements 10K, 6mZ
{
    public 1e5 LIZ;
    public 1e0 LIZIZ;
    public PinMessageViewModel LIZJ;
    public 0zO<? extends 2Gk<? extends H31>> LIZLLL;
    public final 5DO LJ;
    
    static {
        Covode.recordClassIndex(10597);
    }
    
    public BaseCommentPinnedWidget() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/ies/sdk/widgets/LiveRecyclableWidget.<init>:()V
        //     4: aload_0        
        //     5: new             LX/2AA;
        //     8: dup            
        //     9: aload_0        
        //    10: invokespecial   X/2AA.<init>:(Lcom/bytedance/android/live/pin/widget/BaseCommentPinnedWidget;)V
        //    13: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    16: putfield        com/bytedance/android/live/pin/widget/BaseCommentPinnedWidget.LJ:LX/5DO;
        //    19: return         
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
    
    public final 1ms LIZ() {
        return (1ms)this.LJ.getValue();
    }
    
    public abstract void LIZIZ();
    
    public abstract 1e5 LIZJ();
    
    public abstract 1e0 LIZLLL();
    
    public final void LJ() {
        final 0zO<? extends 2Gk<? extends H31>> lizlll = this.LIZLLL;
        if (lizlll != null && !lizlll.LIZJ().LIZJ) {
            lizlll.LIZJ().LIZ();
        }
    }
    
    public void onInit(final Object[] array) {
    }
    
    public void onLoad(final Object[] array) {
        public final class 1eB<T> implements 0Bf
        {
            public final /* synthetic */ BaseCommentPinnedWidget LIZ;
            
            static {
                Covode.recordClassIndex(10599);
            }
            
            public 1eB(final BaseCommentPinnedWidget liz) {
                this.LIZ = liz;
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/bytedance/android/live/pin/widget/BaseCommentPinnedWidget.LIZIZ:()V
        //     4: aload_0        
        //     5: getfield        com/bytedance/android/live/pin/widget/BaseCommentPinnedWidget.LIZJ:Lcom/bytedance/android/live/pin/PinMessageViewModel;
        //     8: astore_2       
        //     9: aload_2        
        //    10: ifnull          375
        //    13: aload_0        
        //    14: getfield        com/bytedance/ies/sdk/widgets/LiveWidget.dataChannel:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    17: astore_1       
        //    18: aload_1        
        //    19: ldc             ""
        //    21: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    24: aload_1        
        //    25: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    28: aload_2        
        //    29: aload_1        
        //    30: putfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIJJI:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    33: aload_1        
        //    34: ldc             LX/G69;.class
        //    36: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZIZ:(Ljava/lang/Class;)Ljava/lang/Object;
        //    39: checkcast       Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //    42: astore_1       
        //    43: aload_1        
        //    44: ifnull          440
        //    47: aload_1        
        //    48: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getId:()J
        //    51: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    54: astore_1       
        //    55: aload_2        
        //    56: aload_1        
        //    57: putfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIJ:Ljava/lang/Long;
        //    60: aload_2        
        //    61: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJIIJ:Ljava/lang/Long;
        //    64: astore_1       
        //    65: aload_1        
        //    66: ifnull          132
        //    69: aload_1        
        //    70: invokevirtual   java/lang/Number.longValue:()J
        //    73: lstore_3       
        //    74: aload_2        
        //    75: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    78: getstatic       X/0zY.LIZLLL:Landroid/util/LongSparseArray;
        //    81: lload_3        
        //    82: invokevirtual   android/util/LongSparseArray.get:(J)Ljava/lang/Object;
        //    85: checkcast       Ljava/util/List;
        //    88: astore          5
        //    90: aload           5
        //    92: astore_1       
        //    93: aload           5
        //    95: ifnonnull       114
        //    98: new             Ljava/util/ArrayList;
        //   101: dup            
        //   102: invokespecial   java/util/ArrayList.<init>:()V
        //   105: astore_1       
        //   106: getstatic       X/0zY.LIZLLL:Landroid/util/LongSparseArray;
        //   109: lload_3        
        //   110: aload_1        
        //   111: invokevirtual   android/util/LongSparseArray.put:(JLjava/lang/Object;)V
        //   114: aload_1        
        //   115: aload_2        
        //   116: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   121: ifne            132
        //   124: aload_1        
        //   125: aload_2        
        //   126: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   131: pop            
        //   132: aload_2        
        //   133: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LIZ:LX/10r;
        //   136: astore          6
        //   138: aload           6
        //   140: ifnull          375
        //   143: aload_2        
        //   144: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJI:I
        //   147: iconst_2       
        //   148: if_icmpne       253
        //   151: aload           6
        //   153: getfield        X/10r.LJIILJJIL:Z
        //   156: ifne            202
        //   159: getstatic       X/GST.m:LX/44V;
        //   162: astore_1       
        //   163: aload_1        
        //   164: ldc             ""
        //   166: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   169: aload_1        
        //   170: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   173: checkcast       Ljava/lang/Boolean;
        //   176: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   179: ifne            202
        //   182: getstatic       X/GST.k:LX/44V;
        //   185: iconst_1       
        //   186: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   189: invokevirtual   X/44T.LIZ:(Ljava/lang/Object;)V
        //   192: getstatic       X/GST.m:LX/44V;
        //   195: iconst_1       
        //   196: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   199: invokevirtual   X/44T.LIZ:(Ljava/lang/Object;)V
        //   202: aload           6
        //   204: getfield        X/10r.LJIILJJIL:Z
        //   207: ifeq            253
        //   210: getstatic       X/GST.p:LX/44V;
        //   213: astore_1       
        //   214: aload_1        
        //   215: ldc             ""
        //   217: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   220: aload_1        
        //   221: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   224: checkcast       Ljava/lang/Boolean;
        //   227: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   230: ifne            253
        //   233: getstatic       X/GST.n:LX/44V;
        //   236: iconst_1       
        //   237: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   240: invokevirtual   X/44T.LIZ:(Ljava/lang/Object;)V
        //   243: getstatic       X/GST.p:LX/44V;
        //   246: iconst_1       
        //   247: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   250: invokevirtual   X/44T.LIZ:(Ljava/lang/Object;)V
        //   253: aload           6
        //   255: getfield        X/10r.LJIILJJIL:Z
        //   258: ifeq            407
        //   261: getstatic       X/GST.n:LX/44V;
        //   264: astore_1       
        //   265: aload_1        
        //   266: ldc             ""
        //   268: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   271: aload_1        
        //   272: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   275: astore_1       
        //   276: aload_1        
        //   277: ldc             ""
        //   279: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   282: aload_1        
        //   283: checkcast       Ljava/lang/Boolean;
        //   286: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   289: istore          7
        //   291: aload_2        
        //   292: iload           7
        //   294: putfield        com/bytedance/android/live/pin/PinMessageViewModel.LJFF:Z
        //   297: aload           6
        //   299: getfield        X/10r.LJIIJ:LX/0CH;
        //   302: astore          8
        //   304: aload           6
        //   306: getfield        X/10r.LIZ:J
        //   309: lstore          9
        //   311: aload           6
        //   313: getfield        X/10r.LIZJ:J
        //   316: lstore_3       
        //   317: aload           6
        //   319: getfield        X/10r.LJIILL:Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   322: astore_1       
        //   323: aload_1        
        //   324: ifnull          350
        //   327: aload_1        
        //   328: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwner:()Lcom/bytedance/android/live/base/model/user/User;
        //   331: astore_1       
        //   332: aload_1        
        //   333: ifnull          350
        //   336: aload_1        
        //   337: invokevirtual   com/bytedance/android/live/base/model/user/User.getSecUid:()Ljava/lang/String;
        //   340: astore          5
        //   342: aload           5
        //   344: astore_1       
        //   345: aload           5
        //   347: ifnonnull       353
        //   350: ldc             "0"
        //   352: astore_1       
        //   353: aload_2        
        //   354: new             LX/HYh;
        //   357: dup            
        //   358: aload           8
        //   360: lload           9
        //   362: lload_3        
        //   363: aload_1        
        //   364: aload           6
        //   366: getfield        X/10r.LJIILJJIL:Z
        //   369: invokespecial   X/HYh.<init>:(LX/0CH;JJLjava/lang/String;Z)V
        //   372: putfield        com/bytedance/android/live/pin/PinMessageViewModel.LJII:LX/HYh;
        //   375: aload_0        
        //   376: getfield        com/bytedance/android/live/pin/widget/BaseCommentPinnedWidget.LIZJ:Lcom/bytedance/android/live/pin/PinMessageViewModel;
        //   379: astore_1       
        //   380: aload_1        
        //   381: ifnull          406
        //   384: aload_1        
        //   385: getfield        com/bytedance/android/live/pin/PinMessageViewModel.LJ:Landroidx/lifecycle/LiveData;
        //   388: astore_1       
        //   389: aload_1        
        //   390: ifnull          406
        //   393: aload_1        
        //   394: aload_0        
        //   395: new             LX/1eB;
        //   398: dup            
        //   399: aload_0        
        //   400: invokespecial   X/1eB.<init>:(Lcom/bytedance/android/live/pin/widget/BaseCommentPinnedWidget;)V
        //   403: invokevirtual   androidx/lifecycle/LiveData.observe:(LX/0CH;LX/0Bf;)V
        //   406: return         
        //   407: getstatic       X/GST.k:LX/44V;
        //   410: astore_1       
        //   411: aload_1        
        //   412: ldc             ""
        //   414: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   417: aload_1        
        //   418: invokevirtual   X/44T.LIZ:()Ljava/lang/Object;
        //   421: astore_1       
        //   422: aload_1        
        //   423: ldc             ""
        //   425: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   428: aload_1        
        //   429: checkcast       Ljava/lang/Boolean;
        //   432: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   435: istore          7
        //   437: goto            291
        //   440: aconst_null    
        //   441: astore_1       
        //   442: goto            55
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
    
    public void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
    
    public void onUnload() {
        final 1e0 liziz = this.LIZIZ;
        if (liziz != null) {
            liziz.LJIIIIZZ();
        }
        final 1e5 liz = this.LIZ;
        if (liz != null) {
            liz.LJIIIIZZ();
        }
    }
}
