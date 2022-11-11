// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Arrays;
import com.bytedance.android.livesdk.model.message.LinkMicAnchorGuideMessage;
import android.content.Context;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import android.app.Activity;
import java.util.Objects;
import com.bytedance.android.live.base.model.user.User;
import android.view.View$OnClickListener;
import kotlin.jvm.internal.n;
import android.view.View;
import com.bytedance.covode.number.Covode;
import android.widget.ImageView;

public final class 1Oy implements 0lR
{
    public final ImageView LIZ;
    public final 1ib LIZIZ;
    public final 1ib LIZJ;
    
    static {
        Covode.recordClassIndex(7368);
    }
    
    public 1Oy(View viewById) {
        CTM.LIZ((Object)viewById);
        final View viewById2 = viewById.findViewById(2131363887);
        n.LIZIZ((Object)viewById2, "");
        this.LIZ = (ImageView)viewById2;
        final View viewById3 = viewById.findViewById(2131365874);
        n.LIZIZ((Object)viewById3, "");
        this.LIZIZ = (1ib)viewById3;
        viewById = viewById.findViewById(2131366581);
        n.LIZIZ((Object)viewById, "");
        this.LIZJ = (1ib)viewById;
    }
    
    @Override
    public final void LIZ(final 10r 10r, final 2H4 2h4) {
        public final class 0lS implements View$OnClickListener
        {
            public final /* synthetic */ User LIZ;
            public final /* synthetic */ 10r LIZIZ;
            
            static {
                Covode.recordClassIndex(7371);
            }
            
            public 0lS(final 1Oy 1Oy, final User liz, final 10r liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onClick(final View view) {
                final User liz = this.LIZ;
                if (liz != null) {
                    if (!liz.isFollowing()) {
                        final long liz2 = this.LIZIZ.LIZ;
                        final DataChannel ljiizilj = this.LIZIZ.LJIIZILJ;
                        final Long value = this.LIZ.getId();
                        final 1NN liz3 = 1NN.LLFF.LIZ();
                        final GIK liziz = Fk2.LIZ().LIZIZ();
                        final GII gii = new GII();
                        long longValue;
                        if (value != null) {
                            longValue = value;
                        }
                        else {
                            longValue = 0L;
                        }
                        liziz.LIZ(((GIa)((GId)gii).LIZ(longValue)).LIZIZ(liz2).LIZJ()).LIZ(F8U.LIZ(F8V.LIZ)).LIZ((2d6)new 1Ow(ljiizilj, liz3), (2d6)1Ox.LIZ);
                    }
                    final String string = this.LIZIZ.LJIIIZ.getString(2131829292, new Object[] { 0W3.LIZ(this.LIZ) });
                    n.LIZIZ((Object)string, "");
                    final Context ljiiiz = this.LIZIZ.LJIIIZ;
                    Objects.requireNonNull(ljiiiz, "null cannot be cast to non-null type android.app.Activity");
                    Hf4.LIZ((Activity)ljiiiz, string, 2131234590);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_2        
        //     6: getfield        X/2Gk.LJIILIIL:LX/H31;
        //     9: astore_3       
        //    10: aload_3        
        //    11: ldc             ""
        //    13: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    16: aload_3        
        //    17: checkcast       Lcom/bytedance/android/livesdk/model/message/LinkMicAnchorGuideMessage;
        //    20: getfield        com/bytedance/android/livesdk/model/message/LinkMicAnchorGuideMessage.LJ:Lcom/bytedance/android/live/base/model/user/User;
        //    23: astore          4
        //    25: invokestatic    X/0cp.LIZ:()LX/G18;
        //    28: astore          5
        //    30: aload           4
        //    32: ifnull          591
        //    35: aload           4
        //    37: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //    40: astore_3       
        //    41: aload           5
        //    43: aload_3        
        //    44: invokestatic    X/0cq.LIZ:(LX/G18;Lcom/bytedance/android/live/base/model/ImageModel;)LX/G18;
        //    47: pop            
        //    48: aload           5
        //    50: iconst_1       
        //    51: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    54: invokeinterface X/G18.LIZ:(Ljava/lang/Boolean;)LX/G18;
        //    59: pop            
        //    60: aload           5
        //    62: ldc             2131234399
        //    64: invokeinterface X/G18.LIZIZ:(I)LX/G18;
        //    69: pop            
        //    70: aload           5
        //    72: aload_0        
        //    73: getfield        X/1Oy.LIZ:Landroid/widget/ImageView;
        //    76: invokeinterface X/G18.LIZ:(Landroid/view/View;)V
        //    81: aload_0        
        //    82: getfield        X/1Oy.LIZIZ:LX/1ib;
        //    85: astore_3       
        //    86: aload_2        
        //    87: getfield        X/2Gk.LJIILIIL:LX/H31;
        //    90: astore          5
        //    92: aload           5
        //    94: ldc             ""
        //    96: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    99: aload           5
        //   101: checkcast       Lcom/bytedance/android/livesdk/model/message/LinkMicAnchorGuideMessage;
        //   104: getfield        com/bytedance/android/livesdk/model/message/LinkMicAnchorGuideMessage.LIZ:Ljava/lang/String;
        //   107: astore          5
        //   109: aload           5
        //   111: ldc             ""
        //   113: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   116: aload           5
        //   118: iconst_1       
        //   119: anewarray       Ljava/lang/Object;
        //   122: dup            
        //   123: iconst_0       
        //   124: aload           4
        //   126: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;)Ljava/lang/String;
        //   129: aastore        
        //   130: iconst_1       
        //   131: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   134: invokestatic    X/0II.LIZ:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   137: astore          5
        //   139: aload           5
        //   141: ldc             ""
        //   143: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   146: aload_3        
        //   147: aload           5
        //   149: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   152: aload_0        
        //   153: getfield        X/1Oy.LIZJ:LX/1ib;
        //   156: aload_1        
        //   157: getfield        X/10r.LJIIIZ:Landroid/content/Context;
        //   160: ldc             2131835784
        //   162: invokevirtual   android/content/Context.getString:(I)Ljava/lang/String;
        //   165: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //   168: aload_0        
        //   169: getfield        X/1Oy.LIZJ:LX/1ib;
        //   172: new             LX/0lS;
        //   175: dup            
        //   176: aload_0        
        //   177: aload           4
        //   179: aload_1        
        //   180: invokespecial   X/0lS.<init>:(LX/1Oy;Lcom/bytedance/android/live/base/model/user/User;LX/10r;)V
        //   183: invokevirtual   X/1ib.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   186: aload_2        
        //   187: getfield        X/2AW.LJ:LX/10M;
        //   190: getfield        X/10M.LIZ:I
        //   193: iconst_1       
        //   194: if_icmpne       503
        //   197: getstatic       X/0lD.LIZ:LX/0lD;
        //   200: astore          4
        //   202: aload_1        
        //   203: getfield        X/10r.LJIIZILJ:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   206: astore_3       
        //   207: aload_1        
        //   208: invokevirtual   X/10r.LIZIZ:()J
        //   211: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   214: astore          6
        //   216: aload_2        
        //   217: getfield        X/2Gk.LJIILIIL:LX/H31;
        //   220: astore_1       
        //   221: aload_1        
        //   222: ldc             ""
        //   224: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   227: aload_1        
        //   228: checkcast       Lcom/bytedance/android/livesdk/model/message/LinkMicAnchorGuideMessage;
        //   231: getfield        com/bytedance/android/livesdk/model/message/LinkMicAnchorGuideMessage.LJII:Z
        //   234: istore          7
        //   236: aload           6
        //   238: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //   241: getstatic       X/1NN.LLFF:LX/0k5;
        //   244: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   247: astore_2       
        //   248: getstatic       X/Gkn.LJFF:LX/Gkq;
        //   251: ldc             "livesdk_follow_guide_show"
        //   253: invokevirtual   X/Gkq.LIZ:(Ljava/lang/String;)LX/Gkn;
        //   256: astore          5
        //   258: aload_3        
        //   259: invokestatic    X/GTi.LIZJ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Z
        //   262: ifeq            584
        //   265: ldc             "anchor"
        //   267: astore_1       
        //   268: aload           5
        //   270: ldc             "user_type"
        //   272: aload_1        
        //   273: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   276: pop            
        //   277: ldc             Lcom/bytedance/android/live/liveinteract/api/IInteractService;.class
        //   279: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   282: checkcast       Lcom/bytedance/android/live/liveinteract/api/IInteractService;
        //   285: invokeinterface com/bytedance/android/live/liveinteract/api/IInteractService.hasMultiCoHostPermission:()Z
        //   290: istore          8
        //   292: ldc             "0"
        //   294: astore_1       
        //   295: iload           8
        //   297: ifeq            509
        //   300: ldc             Lcom/bytedance/android/live/liveinteract/api/IInteractService;.class
        //   302: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //   305: astore          9
        //   307: aload           9
        //   309: ldc             ""
        //   311: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   314: aload           9
        //   316: checkcast       Lcom/bytedance/android/live/liveinteract/api/IInteractService;
        //   319: invokeinterface com/bytedance/android/live/liveinteract/api/IInteractService.getMultiCoHostLinkedUserList:()Ljava/util/List;
        //   324: astore          9
        //   326: aload           9
        //   328: invokeinterface java/util/List.size:()I
        //   333: iconst_2       
        //   334: if_icmple       340
        //   337: ldc             "1"
        //   339: astore_1       
        //   340: aload           5
        //   342: ldc             "is_multi"
        //   344: aload_1        
        //   345: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   348: pop            
        //   349: aload           5
        //   351: ldc             "current_connection_cnts"
        //   353: aload           9
        //   355: invokeinterface java/util/List.size:()I
        //   360: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;I)LX/Gkn;
        //   363: pop            
        //   364: aload           5
        //   366: ldc             "uid_list"
        //   368: aload           9
        //   370: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   373: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   376: pop            
        //   377: aload           5
        //   379: ldc_w           "user_id"
        //   382: aload           6
        //   384: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   387: pop            
        //   388: aload           5
        //   390: ldc_w           "room_id"
        //   393: aload_3        
        //   394: invokestatic    X/GTi.LIZIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)J
        //   397: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;J)LX/Gkn;
        //   400: pop            
        //   401: aload_3        
        //   402: invokestatic    X/GTi.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)Lcom/bytedance/android/livesdkapi/depend/model/live/Room;
        //   405: astore_1       
        //   406: aload_1        
        //   407: ifnull          504
        //   410: aload_1        
        //   411: invokevirtual   com/bytedance/android/livesdkapi/depend/model/live/Room.getOwnerUserId:()J
        //   414: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   417: astore_1       
        //   418: aload           5
        //   420: ldc_w           "anchor_id"
        //   423: aload_1        
        //   424: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   427: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   430: pop            
        //   431: aload           5
        //   433: ldc_w           "channel_id"
        //   436: aload_2        
        //   437: getfield        X/1NN.LJ:J
        //   440: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   443: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   446: pop            
        //   447: aload           5
        //   449: ldc_w           "pk_id"
        //   452: aload_2        
        //   453: getfield        X/1NN.LJJZZIII:J
        //   456: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   459: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   462: pop            
        //   463: aload           5
        //   465: ldc_w           "connection_type"
        //   468: aload           4
        //   470: invokevirtual   X/0lD.LIZ:()Ljava/lang/String;
        //   473: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   476: pop            
        //   477: aload           5
        //   479: ldc_w           "follow_status"
        //   482: iload           7
        //   484: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   487: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/Boolean;)LX/Gkn;
        //   490: pop            
        //   491: aload           5
        //   493: aload_3        
        //   494: invokevirtual   X/Gkn.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;)LX/Gkn;
        //   497: pop            
        //   498: aload           5
        //   500: invokevirtual   X/Gkn.LIZLLL:()V
        //   503: return         
        //   504: aconst_null    
        //   505: astore_1       
        //   506: goto            418
        //   509: getstatic       X/1NN.LLFF:LX/0k5;
        //   512: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   515: getfield        X/1NN.LJJLI:Lcom/bytedance/android/live/base/model/user/User;
        //   518: astore_1       
        //   519: aload_1        
        //   520: ifnull          579
        //   523: aload_1        
        //   524: invokevirtual   com/bytedance/android/live/base/model/user/User.getId:()J
        //   527: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   530: astore_1       
        //   531: aload           5
        //   533: ldc             "is_multi"
        //   535: ldc             "0"
        //   537: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   540: pop            
        //   541: aload           5
        //   543: ldc             "current_connection_cnts"
        //   545: ldc_w           "2"
        //   548: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   551: pop            
        //   552: aload           5
        //   554: ldc             "uid_list"
        //   556: iconst_2       
        //   557: anewarray       Ljava/lang/Object;
        //   560: dup            
        //   561: iconst_0       
        //   562: aload_1        
        //   563: aastore        
        //   564: dup            
        //   565: iconst_1       
        //   566: aload           6
        //   568: aastore        
        //   569: invokevirtual   [java/lang/Object.toString:()Ljava/lang/String;
        //   572: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //   575: pop            
        //   576: goto            377
        //   579: aconst_null    
        //   580: astore_1       
        //   581: goto            531
        //   584: ldc_w           "user"
        //   587: astore_1       
        //   588: goto            268
        //   591: aconst_null    
        //   592: astore_3       
        //   593: goto            41
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
