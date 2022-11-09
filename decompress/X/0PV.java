// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.text.style.ForegroundColorSpan;
import android.content.Context;
import kotlin.jvm.internal.n;
import android.content.DialogInterface;
import com.bytedance.android.livesdk.model.message.PerceptionDialogInfo;
import com.bytedance.android.livesdk.model.message.PerceptionMessage;
import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import android.app.Dialog;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.covode.number.Covode;

public final class 0pV
{
    public static final 0pV LIZ;
    
    static {
        Covode.recordClassIndex(8179);
        LIZ = new 0pV();
    }
    
    public static void LIZ(final LiveDialog liveDialog) {
        liveDialog.show();
        KN6.LIZ.LIZ((Dialog)liveDialog);
    }
    
    public final void LIZ(final String s) {
        CTM.LIZ((Object)s);
        0ba.LIZ(4, "multi_co_host_violation", s);
    }
    
    public final void LIZ(String s, final int n, final String s2, final PunishEventInfo punishEventInfo) {
        if (punishEventInfo != null) {
            final Gkn liz = Gkn.LJFF.LIZ("livesdk_violation_popup");
            liz.LIZ();
            liz.LIZ("action_type", s);
            liz.LIZ("user_type", "anchor");
            if (n == 2) {
                s = "live";
            }
            else {
                s = "apply_pk";
            }
            liz.LIZ("scene_type", s);
            liz.LIZ("record_id", punishEventInfo.LIZJ);
            liz.LIZ("violation_type", punishEventInfo.LIZ);
            liz.LIZ("violation_reason", punishEventInfo.LIZIZ);
            liz.LIZ("violation_anchor_id", punishEventInfo.LIZLLL);
            liz.LIZ("click_tab", s2);
            liz.LIZ("period", (Number)punishEventInfo.LJFF);
            liz.LIZLLL();
        }
    }
    
    public final boolean LIZ(final PerceptionMessage perceptionMessage, final SRS<? super Integer, 2P9> srs, final SRS<? super Integer, 2P9> srs2) {
        public final class 1SN implements b
        {
            public final /* synthetic */ PerceptionDialogInfo LIZ;
            public final /* synthetic */ PerceptionMessage LIZIZ;
            public final /* synthetic */ 39d LIZJ;
            public final /* synthetic */ SRS LIZLLL;
            
            static {
                Covode.recordClassIndex(8181);
            }
            
            public 1SN(final PerceptionDialogInfo liz, final PerceptionMessage liziz, final 39d lizj, final SRS lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
            }
            
            @Override
            public final void LIZ(final DialogInterface dialogInterface) {
                CTM.LIZ((Object)dialogInterface);
                0pV.LIZ.LIZ("click", this.LIZ.LJI, "default_tab", this.LIZIZ.LIZIZ);
                final LiveDialog liveDialog = (LiveDialog)this.LIZJ.element;
                if (liveDialog != null) {
                    liveDialog.dismiss();
                }
                final SRS lizlll = this.LIZLLL;
                if (lizlll != null) {
                    lizlll.invoke((Object)this.LIZ.LJI);
                }
            }
        }
        public final class 1SM implements b
        {
            public final /* synthetic */ PerceptionDialogInfo LIZ;
            public final /* synthetic */ PerceptionMessage LIZIZ;
            public final /* synthetic */ 39d LIZJ;
            public final /* synthetic */ SRS LIZLLL;
            
            static {
                Covode.recordClassIndex(8180);
            }
            
            public 1SM(final PerceptionDialogInfo liz, final PerceptionMessage liziz, final 39d lizj, final SRS lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
            }
            
            @Override
            public final void LIZ(final DialogInterface dialogInterface) {
                CTM.LIZ((Object)dialogInterface);
                0pV.LIZ.LIZ("click", this.LIZ.LJI, "suggest_tab", this.LIZIZ.LIZIZ);
                final LiveDialog liveDialog = (LiveDialog)this.LIZJ.element;
                if (liveDialog != null) {
                    liveDialog.dismiss();
                }
                final SRS lizlll = this.LIZLLL;
                if (lizlll != null) {
                    lizlll.invoke((Object)this.LIZ.LJI);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       6
        //     4: iconst_0       
        //     5: ireturn        
        //     6: aload_1        
        //     7: getfield        com/bytedance/android/livesdk/model/message/PerceptionMessage.LIZ:Lcom/bytedance/android/livesdk/model/message/PerceptionDialogInfo;
        //    10: astore          4
        //    12: aload           4
        //    14: ifnonnull       19
        //    17: iconst_0       
        //    18: ireturn        
        //    19: aload           4
        //    21: getfield        com/bytedance/android/livesdk/model/message/PerceptionDialogInfo.LJI:I
        //    24: iconst_2       
        //    25: if_icmpeq       39
        //    28: aload           4
        //    30: getfield        com/bytedance/android/livesdk/model/message/PerceptionDialogInfo.LJI:I
        //    33: iconst_3       
        //    34: if_icmpeq       39
        //    37: iconst_0       
        //    38: ireturn        
        //    39: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //    42: astore          5
        //    44: aload           5
        //    46: ldc             ""
        //    48: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    51: aload           5
        //    53: invokestatic    X/GTi.LIZIZ:(Landroid/content/Context;)LX/1nL;
        //    56: ifnonnull       65
        //    59: aload_0        
        //    60: ldc             "activityContext is null"
        //    62: invokevirtual   X/0pV.LIZ:(Ljava/lang/String;)V
        //    65: invokestatic    X/0cB.LJ:()Landroid/content/Context;
        //    68: astore          5
        //    70: aload           5
        //    72: ldc             ""
        //    74: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    77: aload           5
        //    79: invokestatic    X/GTi.LIZIZ:(Landroid/content/Context;)LX/1nL;
        //    82: astore          6
        //    84: aload           6
        //    86: astore          7
        //    88: aload           7
        //    90: ifnonnull       95
        //    93: iconst_0       
        //    94: ireturn        
        //    95: getstatic       X/HYW.LIZ:Landroid/text/Spannable;
        //    98: astore          5
        //   100: aload           4
        //   102: getfield        com/bytedance/android/livesdk/model/message/PerceptionDialogInfo.LIZIZ:Lcom/bytedance/android/livesdk/model/message/common/Text;
        //   105: astore          8
        //   107: aload           8
        //   109: ifnull          155
        //   112: aload           8
        //   114: aload           8
        //   116: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZIZ:Ljava/lang/String;
        //   119: invokestatic    X/HYW.LIZ:(Lcom/bytedance/android/livesdk/model/message/common/Text;Ljava/lang/String;)Landroid/text/Spannable;
        //   122: astore          5
        //   124: aload           5
        //   126: new             Landroid/text/style/ForegroundColorSpan;
        //   129: dup            
        //   130: aload           7
        //   132: ldc             2131099750
        //   134: invokestatic    X/06x.LIZJ:(Landroid/content/Context;I)I
        //   137: invokespecial   android/text/style/ForegroundColorSpan.<init>:(I)V
        //   140: iconst_0       
        //   141: aload           5
        //   143: invokeinterface android/text/Spannable.length:()I
        //   148: bipush          18
        //   150: invokeinterface android/text/Spannable.setSpan:(Ljava/lang/Object;III)V
        //   155: getstatic       X/HYW.LIZ:Landroid/text/Spannable;
        //   158: astore          8
        //   160: aload           4
        //   162: getfield        com/bytedance/android/livesdk/model/message/PerceptionDialogInfo.LIZJ:Lcom/bytedance/android/livesdk/model/message/common/Text;
        //   165: astore          9
        //   167: aload           9
        //   169: ifnull          202
        //   172: aload           9
        //   174: aload           9
        //   176: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZIZ:Ljava/lang/String;
        //   179: invokestatic    X/HYW.LIZ:(Lcom/bytedance/android/livesdk/model/message/common/Text;Ljava/lang/String;)Landroid/text/Spannable;
        //   182: astore          8
        //   184: aload           7
        //   186: aload           8
        //   188: iconst_0       
        //   189: aload           8
        //   191: invokeinterface android/text/Spannable.length:()I
        //   196: bipush          33
        //   198: iconst_3       
        //   199: invokestatic    X/0fd.LIZ:(Landroid/content/Context;Landroid/text/Spannable;IIII)V
        //   202: aload           6
        //   204: astore          9
        //   206: getstatic       X/HYW.LIZ:Landroid/text/Spannable;
        //   209: astore          6
        //   211: aload           4
        //   213: getfield        com/bytedance/android/livesdk/model/message/PerceptionDialogInfo.LIZLLL:Lcom/bytedance/android/livesdk/model/message/common/Text;
        //   216: astore          7
        //   218: aload           7
        //   220: ifnull          287
        //   223: aload           7
        //   225: aload           7
        //   227: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZIZ:Ljava/lang/String;
        //   230: invokestatic    X/HYW.LIZ:(Lcom/bytedance/android/livesdk/model/message/common/Text;Ljava/lang/String;)Landroid/text/Spannable;
        //   233: astore          6
        //   235: aload           6
        //   237: new             Landroid/text/style/ForegroundColorSpan;
        //   240: dup            
        //   241: aload           9
        //   243: ldc             2131099685
        //   245: invokestatic    X/06x.LIZJ:(Landroid/content/Context;I)I
        //   248: invokespecial   android/text/style/ForegroundColorSpan.<init>:(I)V
        //   251: iconst_0       
        //   252: aload           6
        //   254: invokeinterface android/text/Spannable.length:()I
        //   259: bipush          18
        //   261: invokeinterface android/text/Spannable.setSpan:(Ljava/lang/Object;III)V
        //   266: aload           9
        //   268: aload           6
        //   270: iconst_0       
        //   271: aload           6
        //   273: invokeinterface android/text/Spannable.length:()I
        //   278: bipush          33
        //   280: iconst_3       
        //   281: sipush          600
        //   284: invokestatic    X/0fd.LIZ:(Landroid/content/Context;Landroid/text/Spannable;IIIII)V
        //   287: getstatic       X/HYW.LIZ:Landroid/text/Spannable;
        //   290: astore          7
        //   292: aload           9
        //   294: ldc             2131099755
        //   296: invokestatic    X/06x.LIZJ:(Landroid/content/Context;I)I
        //   299: istore          10
        //   301: aload           4
        //   303: getfield        com/bytedance/android/livesdk/model/message/PerceptionDialogInfo.LJ:Lcom/bytedance/android/livesdk/model/message/common/Text;
        //   306: astore          11
        //   308: aload           11
        //   310: ifnull          372
        //   313: aload           11
        //   315: aload           11
        //   317: getfield        com/bytedance/android/livesdk/model/message/common/Text.LIZIZ:Ljava/lang/String;
        //   320: invokestatic    X/HYW.LIZ:(Lcom/bytedance/android/livesdk/model/message/common/Text;Ljava/lang/String;)Landroid/text/Spannable;
        //   323: astore          7
        //   325: aload           7
        //   327: new             Landroid/text/style/ForegroundColorSpan;
        //   330: dup            
        //   331: iload           10
        //   333: invokespecial   android/text/style/ForegroundColorSpan.<init>:(I)V
        //   336: iconst_0       
        //   337: aload           7
        //   339: invokeinterface android/text/Spannable.length:()I
        //   344: bipush          18
        //   346: invokeinterface android/text/Spannable.setSpan:(Ljava/lang/Object;III)V
        //   351: aload           9
        //   353: aload           7
        //   355: iconst_0       
        //   356: aload           7
        //   358: invokeinterface android/text/Spannable.length:()I
        //   363: bipush          33
        //   365: iconst_3       
        //   366: sipush          400
        //   369: invokestatic    X/0fd.LIZ:(Landroid/content/Context;Landroid/text/Spannable;IIIII)V
        //   372: new             LX/39d;
        //   375: dup            
        //   376: invokespecial   X/39d.<init>:()V
        //   379: astore          11
        //   381: aload           11
        //   383: aconst_null    
        //   384: putfield        X/39d.element:Ljava/lang/Object;
        //   387: aload           6
        //   389: getstatic       X/HYW.LIZ:Landroid/text/Spannable;
        //   392: if_acmpeq       488
        //   395: aload           7
        //   397: getstatic       X/HYW.LIZ:Landroid/text/Spannable;
        //   400: if_acmpeq       488
        //   403: new             LX/1II;
        //   406: dup            
        //   407: aload           9
        //   409: invokespecial   X/1II.<init>:(Landroid/content/Context;)V
        //   412: astore          9
        //   414: aload           9
        //   416: aload           8
        //   418: invokevirtual   X/1II.LIZ:(Ljava/lang/CharSequence;)LX/1II;
        //   421: pop            
        //   422: aload           9
        //   424: ldc             2131234514
        //   426: invokevirtual   X/1II.LIZ:(I)LX/1II;
        //   429: pop            
        //   430: aload           9
        //   432: aload           6
        //   434: new             LX/1SM;
        //   437: dup            
        //   438: aload           4
        //   440: aload_1        
        //   441: aload           11
        //   443: aload_2        
        //   444: invokespecial   X/1SM.<init>:(Lcom/bytedance/android/livesdk/model/message/PerceptionDialogInfo;Lcom/bytedance/android/livesdk/model/message/PerceptionMessage;LX/39d;LX/SRS;)V
        //   447: invokevirtual   X/1II.LIZJ:(Ljava/lang/CharSequence;LX/0dy;)LX/1II;
        //   450: pop            
        //   451: aload           9
        //   453: aload           7
        //   455: new             LX/1SN;
        //   458: dup            
        //   459: aload           4
        //   461: aload_1        
        //   462: aload           11
        //   464: aload_3        
        //   465: invokespecial   X/1SN.<init>:(Lcom/bytedance/android/livesdk/model/message/PerceptionDialogInfo;Lcom/bytedance/android/livesdk/model/message/PerceptionMessage;LX/39d;LX/SRS;)V
        //   468: invokevirtual   X/1II.LIZLLL:(Ljava/lang/CharSequence;LX/0dy;)LX/1II;
        //   471: pop            
        //   472: aload           9
        //   474: iconst_0       
        //   475: putfield        X/1II.LJIJ:Z
        //   478: aload           11
        //   480: aload           9
        //   482: invokevirtual   X/1II.LIZIZ:()Lcom/bytedance/android/live/design/app/LiveDialog;
        //   485: putfield        X/39d.element:Ljava/lang/Object;
        //   488: aload           11
        //   490: getfield        X/39d.element:Ljava/lang/Object;
        //   493: ifnonnull       498
        //   496: iconst_0       
        //   497: ireturn        
        //   498: aload           5
        //   500: getstatic       X/HYW.LIZ:Landroid/text/Spannable;
        //   503: if_acmpeq       519
        //   506: aload           11
        //   508: getfield        X/39d.element:Ljava/lang/Object;
        //   511: checkcast       Lcom/bytedance/android/live/design/app/LiveDialog;
        //   514: aload           5
        //   516: invokevirtual   com/bytedance/android/live/design/app/LiveDialog.setTitle:(Ljava/lang/CharSequence;)V
        //   519: aload           11
        //   521: getfield        X/39d.element:Ljava/lang/Object;
        //   524: checkcast       Lcom/bytedance/android/live/design/app/LiveDialog;
        //   527: invokestatic    X/0pV.LIZ:(Lcom/bytedance/android/live/design/app/LiveDialog;)V
        //   530: aload_0        
        //   531: ldc             "show"
        //   533: aload           4
        //   535: getfield        com/bytedance/android/livesdk/model/message/PerceptionDialogInfo.LJI:I
        //   538: ldc             ""
        //   540: aload_1        
        //   541: getfield        com/bytedance/android/livesdk/model/message/PerceptionMessage.LIZIZ:Lcom/bytedance/android/livesdk/model/message/PunishEventInfo;
        //   544: invokevirtual   X/0pV.LIZ:(Ljava/lang/String;ILjava/lang/String;Lcom/bytedance/android/livesdk/model/message/PunishEventInfo;)V
        //   547: iconst_1       
        //   548: ireturn        
        //    Signature:
        //  (Lcom/bytedance/android/livesdk/model/message/PerceptionMessage;LX/SRS<-Ljava/lang/Integer;LX/2P9;>;LX/SRS<-Ljava/lang/Integer;LX/2P9;>;)Z
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
}
