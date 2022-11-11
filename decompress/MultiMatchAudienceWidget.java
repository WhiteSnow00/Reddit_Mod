// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multimatch.widget;

import X.GK2;
import X.0CC;
import X.0CH;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import X.1ci;
import X.28m;
import X.0wQ;
import X.2FD;
import X.0nC;
import X.1jz;
import X.0n9;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import X.Vwg;
import java.util.List;
import X.GpW;
import X.Gmg;
import X.CTM;
import com.bytedance.android.livesdk.model.message.LinkMicBattleMessage;
import com.bytedance.android.livesdkapi.host.IHostFrescoHelper;
import X.0pc;
import java.util.ArrayList;
import X.0ba;
import android.graphics.Bitmap;
import X.HZG;
import X.0jR;
import android.view.View;
import com.bytedance.covode.number.Covode;
import X.1mi;
import com.bytedance.android.live.liveinteract.multicohost.service.IMultiCoHostService;
import X.1mc;
import X.6mZ;
import X.1ma;

public final class MultiMatchAudienceWidget extends MatchBaseWidget implements 1ma, 6mZ
{
    public final 1mc LIZLLL;
    public final IMultiCoHostService LJ;
    public 1mi LJFF;
    
    static {
        Covode.recordClassIndex(10236);
    }
    
    public MultiMatchAudienceWidget(final View view) {
        super(view);
        this.LIZLLL = new 1mc();
        this.LJ = 0jR.LIZ(IMultiCoHostService.class);
    }
    
    private final void LIZIZ() {
        final 1mi ljff = this.LJFF;
        if (ljff != null) {
            ljff.LJIJ();
        }
        this.LJFF = null;
    }
    
    private final boolean LIZIZ(final String s) {
        public final class 1cl implements HZG
        {
            static {
                Covode.recordClassIndex(10237);
            }
            
            public final void LIZ(final Bitmap bitmap) {
                0ba.LIZ(3, "MultiMatchAudienceWidge", "load icon success");
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/live/liveinteract/multimatch/widget/MultiMatchAudienceWidget.LJ:Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          158
        //     9: aload_2        
        //    10: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserList:()Ljava/util/List;
        //    15: astore_2       
        //    16: aload_2        
        //    17: ifnull          158
        //    20: new             Ljava/util/ArrayList;
        //    23: dup            
        //    24: invokespecial   java/util/ArrayList.<init>:()V
        //    27: astore_3       
        //    28: aload_2        
        //    29: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    34: astore          4
        //    36: aload           4
        //    38: invokeinterface java/util/Iterator.hasNext:()Z
        //    43: ifeq            136
        //    46: aload           4
        //    48: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    53: astore          5
        //    55: aload           5
        //    57: checkcast       LX/0pc;
        //    60: astore          6
        //    62: ldc             Lcom/bytedance/android/livesdkapi/host/IHostFrescoHelper;.class
        //    64: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //    67: checkcast       Lcom/bytedance/android/livesdkapi/host/IHostFrescoHelper;
        //    70: astore          7
        //    72: aload           7
        //    74: ifnull          108
        //    77: aload           6
        //    79: getfield        X/0pc.LIZ:LX/0pe;
        //    82: astore_2       
        //    83: aload_2        
        //    84: ifnull          131
        //    87: aload_2        
        //    88: getfield        X/0pe.LIZJ:Lcom/bytedance/android/live/base/model/ImageModel;
        //    91: astore_2       
        //    92: aload           7
        //    94: aload_2        
        //    95: new             LX/1cl;
        //    98: dup            
        //    99: invokespecial   X/1cl.<init>:()V
        //   102: invokeinterface com/bytedance/android/livesdkapi/host/IHostFrescoHelper.LIZ:(Lcom/bytedance/android/live/base/model/ImageModel;LX/HZG;)LX/GfU;
        //   107: pop            
        //   108: aload           6
        //   110: getfield        X/0pc.LJFF:LX/0pg;
        //   113: getstatic       X/0pg.LINKED:LX/0pg;
        //   116: if_acmpne       36
        //   119: aload_3        
        //   120: aload           5
        //   122: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   127: pop            
        //   128: goto            36
        //   131: aconst_null    
        //   132: astore_2       
        //   133: goto            92
        //   136: aload_3        
        //   137: checkcast       Ljava/util/List;
        //   140: astore_2       
        //   141: aload_2        
        //   142: ifnull          158
        //   145: aload_2        
        //   146: invokeinterface java/util/List.size:()I
        //   151: istore          8
        //   153: iload           8
        //   155: ifne            160
        //   158: iconst_0       
        //   159: ireturn        
        //   160: getstatic       com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZJ:Lcom/bytedance/ies/sdk/datachannel/DataChannelGlobal;
        //   163: ldc             LX/2GM;.class
        //   165: aload_1        
        //   166: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannelGlobal.LIZ:(Ljava/lang/Class;Ljava/lang/Object;)V
        //   169: aload_0        
        //   170: ldc             LX/1ci;.class
        //   172: invokevirtual   com/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget.LIZ:(Ljava/lang/Class;)LX/0x9;
        //   175: checkcast       LX/1ci;
        //   178: astore_3       
        //   179: aload_3        
        //   180: invokevirtual   X/1ci.LIZ:()V
        //   183: aload_3        
        //   184: getfield        X/1ci.LIZ:LX/15z;
        //   187: getstatic       X/1NN.LLFF:LX/0k5;
        //   190: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   193: getfield        X/1NN.LJ:J
        //   196: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   199: invokevirtual   androidx/lifecycle/LiveData.setValue:(Ljava/lang/Object;)V
        //   202: aload_3        
        //   203: getfield        X/1ci.LIZIZ:LX/15z;
        //   206: aload_2        
        //   207: invokevirtual   androidx/lifecycle/LiveData.setValue:(Ljava/lang/Object;)V
        //   210: aload_3        
        //   211: getstatic       X/1NN.LLFF:LX/0k5;
        //   214: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   217: getfield        X/1NN.LJFF:J
        //   220: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   223: putfield        X/1ci.LJIIL:Ljava/lang/Long;
        //   226: aload_0        
        //   227: getfield        com/bytedance/android/live/liveinteract/multimatch/widget/MultiMatchAudienceWidget.LJFF:LX/1mi;
        //   230: astore_3       
        //   231: aload_3        
        //   232: ifnonnull       312
        //   235: iload           8
        //   237: iconst_2       
        //   238: if_icmpne       301
        //   241: getstatic       X/1NN.LLFF:LX/0k5;
        //   244: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   247: astore_1       
        //   248: aload_2        
        //   249: iconst_1       
        //   250: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   255: checkcast       LX/0pc;
        //   258: astore_2       
        //   259: aload_2        
        //   260: ifnull          295
        //   263: aload_2        
        //   264: getfield        X/0pc.LJIILIIL:J
        //   267: lstore          9
        //   269: aload_1        
        //   270: lload           9
        //   272: putfield        X/1NN.LJFF:J
        //   275: new             LX/293;
        //   278: dup            
        //   279: invokespecial   X/293.<init>:()V
        //   282: astore_1       
        //   283: aload_0        
        //   284: aload_1        
        //   285: putfield        com/bytedance/android/live/liveinteract/multimatch/widget/MultiMatchAudienceWidget.LJFF:LX/1mi;
        //   288: aload_1        
        //   289: aload_0        
        //   290: invokevirtual   X/1cg.LIZ:(Lcom/bytedance/android/live/liveinteract/multimatch/widget/MatchBaseWidget;)V
        //   293: iconst_1       
        //   294: ireturn        
        //   295: lconst_0       
        //   296: lstore          9
        //   298: goto            269
        //   301: new             LX/28m;
        //   304: dup            
        //   305: invokespecial   X/28m.<init>:()V
        //   308: astore_1       
        //   309: goto            283
        //   312: iload           8
        //   314: iconst_2       
        //   315: if_icmple       347
        //   318: aload_3        
        //   319: instanceof      LX/28m;
        //   322: ifne            347
        //   325: bipush          6
        //   327: ldc             "MultiMatchAudienceWidge"
        //   329: ldc             "onBattleClick  ->  not multi, but use multi match view "
        //   331: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   334: aload_0        
        //   335: invokespecial   com/bytedance/android/live/liveinteract/multimatch/widget/MultiMatchAudienceWidget.LIZIZ:()V
        //   338: aload_0        
        //   339: aload_1        
        //   340: invokespecial   com/bytedance/android/live/liveinteract/multimatch/widget/MultiMatchAudienceWidget.LIZIZ:(Ljava/lang/String;)Z
        //   343: pop            
        //   344: goto            293
        //   347: iload           8
        //   349: iconst_2       
        //   350: if_icmpgt       382
        //   353: aload_3        
        //   354: instanceof      LX/293;
        //   357: ifne            382
        //   360: bipush          6
        //   362: ldc             "MultiMatchAudienceWidge"
        //   364: ldc             "onBattleClick  -> not two match, but use two match view "
        //   366: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   369: aload_0        
        //   370: invokespecial   com/bytedance/android/live/liveinteract/multimatch/widget/MultiMatchAudienceWidget.LIZIZ:()V
        //   373: aload_0        
        //   374: aload_1        
        //   375: invokespecial   com/bytedance/android/live/liveinteract/multimatch/widget/MultiMatchAudienceWidget.LIZIZ:(Ljava/lang/String;)Z
        //   378: pop            
        //   379: goto            293
        //   382: new             Ljava/lang/StringBuilder;
        //   385: dup            
        //   386: ldc             "onBattleClick  -> link num="
        //   388: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //   391: astore_1       
        //   392: aload_1        
        //   393: iload           8
        //   395: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   398: pop            
        //   399: aload_1        
        //   400: ldc             ",  match view is "
        //   402: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   405: pop            
        //   406: aload_1        
        //   407: aload_0        
        //   408: getfield        com/bytedance/android/live/liveinteract/multimatch/widget/MultiMatchAudienceWidget.LJFF:LX/1mi;
        //   411: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   414: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   417: pop            
        //   418: aload_1        
        //   419: bipush          32
        //   421: invokevirtual   java/lang/StringBuilder.append:(C)Ljava/lang/StringBuilder;
        //   424: pop            
        //   425: iconst_4       
        //   426: ldc             "MultiMatchAudienceWidge"
        //   428: aload_1        
        //   429: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   432: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //   435: goto            293
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
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
    
    @Override
    public final void LIZ(final LinkMicBattleMessage linkMicBattleMessage) {
        CTM.LIZ((Object)linkMicBattleMessage);
        this.LIZIZ("open_message");
        final 1mi ljff = this.LJFF;
        if (ljff != null) {
            ljff.LIZ(linkMicBattleMessage);
        }
    }
    
    @Override
    public final void LIZ(final String s) {
        final 1mi ljff = this.LJFF;
        if (ljff != null) {
            ljff.LIZIZ(s);
        }
    }
    
    public final void LIZ(final Throwable t) {
        Gmg.LIZ((GpW)this, t);
    }
    
    @Override
    public final void LIZ(final List<Vwg> list, final List<Vwg> list2) {
        final 1mi ljff = this.LJFF;
        if (ljff != null) {
            ljff.LIZ(list, list2);
        }
    }
    
    @Override
    public final boolean LIZ(final BattleInfoResponse battleInfoResponse, final int n) {
        CTM.LIZ((Object)battleInfoResponse);
        this.LIZIZ("room_enter");
        final 1mi ljff = this.LJFF;
        return ljff != null && ljff.LIZ(battleInfoResponse, n);
    }
    
    public final String LJIIL() {
        return this.getClass().getName();
    }
    
    @Override
    public final void onCreate() {
        super.onCreate();
        0n9.LJIIIIZZ.LIZ("create", 0);
        1jz.LIZ("match_widget");
        this.LIZLLL.LIZ(this);
    }
    
    @Override
    public final void onDestroy() {
        final DataChannel dataChannel = super.dataChannel;
        0nC normal;
        if (dataChannel == null || (normal = (0nC)dataChannel.LIZIZ((Class)2FD.class)) == null) {
            normal = 0nC.NORMAL;
        }
        if (normal.compareTo(0nC.START) >= 0 && normal.compareTo(0nC.END) < 0) {
            0wQ.LIZIZ.LIZ(this.LJFF instanceof 28m, this.LIZ(1ci.class).LJIILIIL, this.LIZ(1ci.class).LJIIL);
        }
        ((GK2)this.LIZLLL).LIZ();
        final 1mi ljff = this.LJFF;
        if (ljff != null) {
            ljff.LJIJ();
        }
        this.LJFF = null;
        super.onDestroy();
    }
    
    @Override
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
