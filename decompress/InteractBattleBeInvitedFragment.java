// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.match.ui.fragment;

import X.0kf;
import X.0xg;
import java.util.Map;
import X.0xt;
import X.0II;
import X.1Qk;
import X.0n9;
import com.bytedance.android.live.liveinteract.cohost.business.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.livesdk.model.message.TeamUsersInfo;
import java.util.List;
import X.0wQ;
import X.0jz;
import X.1NN;
import X.0xm;
import X.1lI;
import android.view.View$OnClickListener;
import android.view.View;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import kotlin.jvm.internal.n;
import X.0l6;
import X.0VX;
import X.1Ev;
import X.Hf4;
import X.0cB;
import X.CTM;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.0yJ;
import com.bytedance.android.live.liveinteract.match.business.contract.InteractPkBeInvitedContract;

public final class InteractBattleBeInvitedFragment extends View
{
    public int LIZ;
    public long LJ;
    public 0yJ LJFF;
    public HashMap LJI;
    
    static {
        Covode.recordClassIndex(7909);
    }
    
    @Override
    public final void LIZ() {
        final HashMap lji = this.LJI;
        if (lji != null) {
            lji.clear();
        }
    }
    
    @Override
    public final void LIZ(final Throwable t) {
        CTM.LIZ((Object)t);
        Hf4.LIZ(0cB.LJ(), 2131835775);
    }
    
    @Override
    public final void LIZIZ(final Throwable t) {
        CTM.LIZ((Object)t);
        if (t instanceof 1Ev && ((0VX)t).getErrorCode() == 4004048) {
            Hf4.LIZ(0cB.LJ(), 2131830585);
            return;
        }
        Hf4.LIZ(0cB.LJ(), 2131835775);
    }
    
    @Override
    public final 0l6.a LJ() {
        final 0l6.a a = new 0l6.a();
        final String string = this.getString(2131830613);
        n.LIZIZ((Object)string, "");
        a.LIZ(string);
        a.LIZIZ = 263;
        a.LJI = false;
        return a;
    }
    
    @Override
    public final android.view.View onCreateView(final LayoutInflater layoutInflater, final ViewGroup viewGroup, final Bundle bundle) {
        public final class 0nZ implements View$OnClickListener
        {
            public final /* synthetic */ InteractBattleBeInvitedFragment LIZ;
            public final /* synthetic */ boolean LIZIZ;
            
            static {
                Covode.recordClassIndex(7911);
            }
            
            public 0nZ(final InteractBattleBeInvitedFragment liz, final boolean liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onClick(final android.view.View view) {
                1Qk 1Qk;
                if (this.LIZ.LIZ == 1) {
                    1Qk = 0n9.LIZIZ;
                }
                else {
                    1Qk = 0n9.LIZ;
                }
                1Qk.LJIILL = System.currentTimeMillis();
                1lI.LIZ(this.LIZ.LIZ, "accept");
                0xm.LIZIZ.LIZ(String.valueOf(1NN.LLFF.LIZ().LJ), String.valueOf(this.LIZ.LJ), false, false, false, false, true);
                final InteractPkBeInvitedContract.b b = (InteractPkBeInvitedContract.b)this.LIZ.LIZJ;
                if (b != null) {
                    b.LIZIZ(this.LIZ.LIZ, this.LIZ.LJ);
                }
                final d liziz = this.LIZ.LIZIZ;
                if (liziz != null) {
                    liziz.dismiss();
                }
                if (0jz.LIZLLL().isEnableSDK()) {
                    0wQ.LIZIZ.LIZ(true, false, 1NN.LLFF.LIZ().LJFF, null, this.LIZ.LJ, this.LIZIZ);
                }
            }
        }
        public final class 0nY implements View$OnClickListener
        {
            public final /* synthetic */ InteractBattleBeInvitedFragment LIZ;
            public final /* synthetic */ boolean LIZIZ;
            
            static {
                Covode.recordClassIndex(7910);
            }
            
            public 0nY(final InteractBattleBeInvitedFragment liz, final boolean liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void onClick(final android.view.View view) {
                1lI.LIZ(this.LIZ.LIZ, "decline");
                0xm.LIZIZ.LIZ(String.valueOf(1NN.LLFF.LIZ().LJ), String.valueOf(this.LIZ.LJ), false, false, true, false, false);
                final InteractPkBeInvitedContract.b b = (InteractPkBeInvitedContract.b)this.LIZ.LIZJ;
                if (b != null) {
                    b.LIZ(this.LIZ.LIZ, this.LIZ.LJ);
                }
                final d liziz = this.LIZ.LIZIZ;
                if (liziz != null) {
                    liziz.dismiss();
                }
                if (0jz.LIZLLL().isEnableSDK()) {
                    0wQ.LIZIZ.LIZ(false, false, 1NN.LLFF.LIZ().LJFF, null, this.LIZ.LJ, this.LIZIZ);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_1        
        //     5: ldc             2131561990
        //     7: aload_2        
        //     8: iconst_0       
        //     9: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    12: astore          4
        //    14: aload_0        
        //    15: getfield        com/bytedance/android/live/liveinteract/match/ui/fragment/InteractBattleBeInvitedFragment.LIZ:I
        //    18: iconst_1       
        //    19: if_icmpne       625
        //    22: iconst_1       
        //    23: istore          5
        //    25: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //    28: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.isEnableSDK:()Z
        //    33: ifne            596
        //    36: aload_0        
        //    37: getfield        com/bytedance/android/live/liveinteract/match/ui/fragment/InteractBattleBeInvitedFragment.LJ:J
        //    40: lstore          6
        //    42: new             Ljava/util/HashMap;
        //    45: dup            
        //    46: invokespecial   java/util/HashMap.<init>:()V
        //    49: astore_2       
        //    50: getstatic       X/0xt.LIZIZ:LX/0xt;
        //    53: aload_2        
        //    54: invokevirtual   X/0xt.LIZLLL:(Ljava/util/Map;)V
        //    57: aload_2        
        //    58: getstatic       X/1NN.LLFF:LX/0k5;
        //    61: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    64: getfield        X/1NN.LJIILL:LX/0kf;
        //    67: iconst_0       
        //    68: invokestatic    X/0xg.LIZ:(Ljava/util/Map;LX/0kf;Z)V
        //    71: invokestatic    java/lang/System.currentTimeMillis:()J
        //    74: putstatic       X/0xt.LIZ:J
        //    77: aload_2        
        //    78: ldc             "time_stamp"
        //    80: getstatic       X/0xt.LIZ:J
        //    83: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    86: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    91: pop            
        //    92: aload_2        
        //    93: ldc             "connection_type"
        //    95: getstatic       X/0xs.MANUAL_PK:LX/0xs;
        //    98: invokevirtual   X/0xs.getType:()Ljava/lang/String;
        //   101: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   106: pop            
        //   107: getstatic       X/1NN.LLFF:LX/0k5;
        //   110: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   113: getfield        X/1NN.LJIIZILJ:Z
        //   116: ifeq            589
        //   119: ldc             "inviter"
        //   121: astore_1       
        //   122: aload_2        
        //   123: ldc             "anchor_type"
        //   125: aload_1        
        //   126: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   131: pop            
        //   132: iload           5
        //   134: ifeq            152
        //   137: aload_2        
        //   138: ldc             "oncemore_type"
        //   140: getstatic       X/0n9.LJIIIIZZ:LX/0n9;
        //   143: invokevirtual   X/0n9.LIZJ:()Ljava/lang/String;
        //   146: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   151: pop            
        //   152: aload_2        
        //   153: ldc             "pk_id"
        //   155: lload           6
        //   157: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   160: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   165: pop            
        //   166: aload_2        
        //   167: ldc             "relation_type"
        //   169: getstatic       X/1NN.LLFF:LX/0k5;
        //   172: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   175: getfield        X/1NN.LJLL:Ljava/lang/Integer;
        //   178: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   181: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   186: pop            
        //   187: getstatic       X/1NN.LLFF:LX/0k5;
        //   190: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   193: getfield        X/1NN.LJIILL:LX/0kf;
        //   196: getstatic       X/0kf.RANDOM_LINK_MIC_RECOMMEND:LX/0kf;
        //   199: if_acmpne       582
        //   202: ldc             "1"
        //   204: astore_1       
        //   205: aload_2        
        //   206: ldc             "is_quick_recommend"
        //   208: aload_1        
        //   209: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   214: pop            
        //   215: getstatic       X/0xt.LIZIZ:LX/0xt;
        //   218: aload_2        
        //   219: invokevirtual   X/0xt.LIZJ:(Ljava/util/Map;)V
        //   222: getstatic       X/0xt.LIZIZ:LX/0xt;
        //   225: ldc             "livesdk_connected_popup_show"
        //   227: aload_2        
        //   228: invokevirtual   X/0xt.LIZ:(Ljava/lang/String;Ljava/util/Map;)V
        //   231: aload           4
        //   233: ldc             2131374195
        //   235: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   238: astore_1       
        //   239: aload_1        
        //   240: ldc             ""
        //   242: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   245: aload_1        
        //   246: checkcast       LX/0yJ;
        //   249: astore_1       
        //   250: aload_0        
        //   251: aload_1        
        //   252: putfield        com/bytedance/android/live/liveinteract/match/ui/fragment/InteractBattleBeInvitedFragment.LJFF:LX/0yJ;
        //   255: aload_1        
        //   256: ifnonnull       264
        //   259: ldc             ""
        //   261: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   264: aload_1        
        //   265: invokevirtual   X/0yJ.LIZ:()V
        //   268: aload           4
        //   270: ldc             2131363031
        //   272: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   275: new             LX/0nY;
        //   278: dup            
        //   279: aload_0        
        //   280: iload           5
        //   282: invokespecial   X/0nY.<init>:(Lcom/bytedance/android/live/liveinteract/match/ui/fragment/InteractBattleBeInvitedFragment;Z)V
        //   285: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   288: aload           4
        //   290: ldc             2131363012
        //   292: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   295: new             LX/0nZ;
        //   298: dup            
        //   299: aload_0        
        //   300: iload           5
        //   302: invokespecial   X/0nZ.<init>:(Lcom/bytedance/android/live/liveinteract/match/ui/fragment/InteractBattleBeInvitedFragment;Z)V
        //   305: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   308: aload           4
        //   310: ldc             ""
        //   312: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   315: aload           4
        //   317: ldc             2131366936
        //   319: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   322: checkcast       LX/7wT;
        //   325: astore_3       
        //   326: aload           4
        //   328: ldc             2131373346
        //   330: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   333: checkcast       Landroid/widget/TextView;
        //   336: astore          8
        //   338: aload_0        
        //   339: getfield        com/bytedance/android/live/liveinteract/cohost/business/contract/InteractDialogFragmentBaseContract$AbsView.LIZLLL:LX/1NN;
        //   342: ldc_w           "data_guest_user"
        //   345: invokevirtual   X/1NN.LIZLLL:(Ljava/lang/String;)Ljava/lang/Object;
        //   348: checkcast       Lcom/bytedance/android/live/base/model/user/User;
        //   351: astore_2       
        //   352: aload_2        
        //   353: ifnull          367
        //   356: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   359: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.isEnableSDK:()Z
        //   364: ifeq            536
        //   367: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   370: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserList:()Ljava/util/List;
        //   375: invokeinterface java/util/List.size:()I
        //   380: istore          9
        //   382: aconst_null    
        //   383: astore          10
        //   385: iload           9
        //   387: iconst_1       
        //   388: if_icmple       531
        //   391: invokestatic    X/0jz.LIZLLL:()Lcom/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService;
        //   394: invokeinterface com/bytedance/android/live/liveinteract/multicohost/service/IMultiCoHostService.getCoHostUserList:()Ljava/util/List;
        //   399: iconst_1       
        //   400: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   405: checkcast       LX/0pc;
        //   408: astore_2       
        //   409: aload_2        
        //   410: ifnull          526
        //   413: aload_2        
        //   414: getfield        X/0pc.LIZ:LX/0pe;
        //   417: astore_1       
        //   418: aload_1        
        //   419: ifnull          526
        //   422: aload_1        
        //   423: getfield        X/0pe.LIZJ:Lcom/bytedance/android/live/base/model/ImageModel;
        //   426: astore_1       
        //   427: aload_3        
        //   428: ldc             ""
        //   430: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   433: aload_3        
        //   434: aload_1        
        //   435: aload_3        
        //   436: invokevirtual   X/7wT.getWidth:()I
        //   439: aload_3        
        //   440: invokevirtual   X/7wT.getHeight:()I
        //   443: ldc_w           2131234398
        //   446: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //   449: aload           8
        //   451: ldc             ""
        //   453: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   456: aload_2        
        //   457: ifnull          511
        //   460: aload_2        
        //   461: getfield        X/0pc.LIZ:LX/0pe;
        //   464: astore_1       
        //   465: aload_1        
        //   466: ifnull          511
        //   469: aload_1        
        //   470: getfield        X/0pe.LIZ:Ljava/lang/String;
        //   473: astore_1       
        //   474: aload_2        
        //   475: getfield        X/0pc.LIZ:LX/0pe;
        //   478: astore_2       
        //   479: aload_1        
        //   480: astore_3       
        //   481: aload           10
        //   483: astore          11
        //   485: aload_2        
        //   486: ifnull          497
        //   489: aload_2        
        //   490: getfield        X/0pe.LIZIZ:Ljava/lang/String;
        //   493: astore          11
        //   495: aload_1        
        //   496: astore_3       
        //   497: aload           8
        //   499: aload_3        
        //   500: aload           11
        //   502: invokestatic    X/0W3.LIZ:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   505: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   508: aload           4
        //   510: areturn        
        //   511: aconst_null    
        //   512: astore_3       
        //   513: aconst_null    
        //   514: astore_1       
        //   515: aload           10
        //   517: astore          11
        //   519: aload_2        
        //   520: ifnull          497
        //   523: goto            474
        //   526: aconst_null    
        //   527: astore_1       
        //   528: goto            427
        //   531: aconst_null    
        //   532: astore_2       
        //   533: goto            409
        //   536: aload_2        
        //   537: invokevirtual   com/bytedance/android/live/base/model/user/User.getAvatarThumb:()Lcom/bytedance/android/live/base/model/ImageModel;
        //   540: astore_1       
        //   541: aload_3        
        //   542: ldc             ""
        //   544: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   547: aload_3        
        //   548: aload_1        
        //   549: aload_3        
        //   550: invokevirtual   X/7wT.getWidth:()I
        //   553: aload_3        
        //   554: invokevirtual   X/7wT.getHeight:()I
        //   557: ldc_w           2131234398
        //   560: invokestatic    X/HFv.LIZ:(Landroid/widget/ImageView;Lcom/bytedance/android/live/base/model/ImageModel;III)V
        //   563: aload           8
        //   565: ldc             ""
        //   567: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   570: aload           8
        //   572: aload_2        
        //   573: invokestatic    X/0W3.LIZ:(Lcom/bytedance/android/live/base/model/user/User;)Ljava/lang/String;
        //   576: invokevirtual   android/widget/TextView.setText:(Ljava/lang/CharSequence;)V
        //   579: goto            508
        //   582: ldc_w           "0"
        //   585: astore_1       
        //   586: goto            205
        //   589: ldc_w           "invitee"
        //   592: astore_1       
        //   593: goto            122
        //   596: getstatic       X/0wQ.LIZIZ:LX/0wQ;
        //   599: getstatic       X/1NN.LLFF:LX/0k5;
        //   602: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   605: getfield        X/1NN.LJFF:J
        //   608: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   611: iconst_0       
        //   612: aconst_null    
        //   613: aload_0        
        //   614: getfield        com/bytedance/android/live/liveinteract/match/ui/fragment/InteractBattleBeInvitedFragment.LJ:J
        //   617: iload           5
        //   619: invokevirtual   X/0wQ.LIZ:(Ljava/lang/Long;ZLjava/util/List;JZ)V
        //   622: goto            231
        //   625: iconst_0       
        //   626: istore          5
        //   628: goto            25
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
