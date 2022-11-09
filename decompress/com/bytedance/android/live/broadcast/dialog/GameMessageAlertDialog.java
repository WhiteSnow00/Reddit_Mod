// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.broadcast.dialog;

import androidx.fragment.app.DialogFragment;
import X.44T;
import androidx.recyclerview.widget.RecyclerView;
import androidx.fragment.app.Fragment;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.view.View$OnClickListener;
import android.os.Bundle;
import X.T0r;
import X.44V;
import X.GIK;
import X.GTi;
import X.GST;
import X.HQ5;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.n;
import X.Fk2;
import X.Gkn;
import X.CTM;
import X.Ht9;
import X.6JE;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.view.View;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.T0p;
import android.app.Dialog;
import X.2fc;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class GameMessageAlertDialog extends LiveDialogFragment
{
    public String LIZ;
    public boolean LIZIZ;
    public final String[] LIZJ;
    public 2fc LIZLLL;
    public Dialog LJ;
    public GameMessageAlertDialog.b LJFF;
    public T0p LJI;
    public HashMap LJII;
    
    static {
        Covode.recordClassIndex(5317);
    }
    
    public GameMessageAlertDialog() {
        this.LIZJ = new String[] { "Messages", "Activities" };
        this.LIZIZ = true;
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561860);
        fpL.LIZ = 2;
        fpL.LIZIZ = 2131887271;
        fpL.LJI = 80;
        fpL.LJIIIZ = 73;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJII == null) {
            this.LJII = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJII.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJII.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZIZ() {
        final HashMap ljii = this.LJII;
        if (ljii != null) {
            ljii.clear();
        }
    }
    
    public final void LIZJ() {
        public final class 0Z0 implements DialogInterface$OnClickListener
        {
            public final /* synthetic */ GameMessageAlertDialog LIZ;
            
            static {
                Covode.recordClassIndex(5331);
            }
            
            public 0Z0(final GameMessageAlertDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final DialogInterface dialogInterface, final int n) {
                this.LIZ.LIZLLL();
                dialogInterface.dismiss();
            }
        }
        public final class 0Yz implements DialogInterface$OnClickListener
        {
            public final /* synthetic */ GameMessageAlertDialog LIZ;
            
            static {
                Covode.recordClassIndex(5330);
            }
            
            public 0Yz(final GameMessageAlertDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final DialogInterface dialogInterface, final int n) {
                6JE.LIZIZ(((Fragment)this.LIZ).getContext());
                dialogInterface.dismiss();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog.LJ:Landroid/app/Dialog;
        //     4: ifnonnull       89
        //     7: new             LX/Ht9;
        //    10: dup            
        //    11: aload_0        
        //    12: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //    15: invokespecial   X/Ht9.<init>:(Landroid/content/Context;)V
        //    18: astore_1       
        //    19: aload_1        
        //    20: ldc             "tiktok_live_interaction_resource"
        //    22: ldc             "ttlive_ic_float_permission_pic.png"
        //    24: invokevirtual   X/Ht9.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Ht9;
        //    27: pop            
        //    28: aload_1        
        //    29: ldc             2131831755
        //    31: invokevirtual   X/Ht9.LIZ:(I)LX/Ht9;
        //    34: pop            
        //    35: aload_1        
        //    36: ldc             2131831754
        //    38: invokevirtual   X/Ht9.LIZIZ:(I)LX/Ht9;
        //    41: pop            
        //    42: aload_1        
        //    43: ldc             2131831753
        //    45: new             LX/0Yz;
        //    48: dup            
        //    49: aload_0        
        //    50: invokespecial   X/0Yz.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog;)V
        //    53: iconst_0       
        //    54: invokevirtual   X/Ht9.LIZ:(ILandroid/content/DialogInterface$OnClickListener;Z)LX/Ht9;
        //    57: pop            
        //    58: aload_1        
        //    59: ldc             2131831752
        //    61: new             LX/0Z0;
        //    64: dup            
        //    65: aload_0        
        //    66: invokespecial   X/0Z0.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog;)V
        //    69: iconst_0       
        //    70: invokevirtual   X/Ht9.LIZIZ:(ILandroid/content/DialogInterface$OnClickListener;Z)LX/Ht9;
        //    73: pop            
        //    74: aload_1        
        //    75: invokevirtual   X/Ht9.LIZ:()LX/HtA;
        //    78: astore_1       
        //    79: aload_1        
        //    80: iconst_0       
        //    81: invokevirtual   X/HtA.setCanceledOnTouchOutside:(Z)V
        //    84: aload_0        
        //    85: aload_1        
        //    86: putfield        com/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog.LJ:Landroid/app/Dialog;
        //    89: aload_0        
        //    90: getfield        com/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog.LJ:Landroid/app/Dialog;
        //    93: invokestatic    X/GTi.LIZ:(Landroid/app/Dialog;)Landroid/app/Dialog;
        //    96: pop            
        //    97: return         
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
    
    public final void LIZLLL() {
        final GameMessageAlertDialog.b ljff = this.LJFF;
        if (ljff != null) {
            ljff.LIZJ = 6JE.LIZ(((Fragment)this).getContext());
            ((RecyclerView.a)ljff).notifyDataSetChanged();
        }
    }
    
    public final void onDestroyView() {
        final 2fc lizlll = this.LIZLLL;
        if (lizlll != null) {
            lizlll.dispose();
        }
        super.onDestroyView();
        this.LIZIZ();
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        CTM.LIZ((Object)dialogInterface);
        super.onDismiss(dialogInterface);
        final Gkn liz = Gkn.LJFF.LIZ("livesdk_live_overlay_setting_left");
        final GIK liziz = Fk2.LIZ().LIZIZ();
        n.LIZIZ((Object)liziz, "");
        liz.LIZ("anchor_id", String.valueOf(liziz.LIZJ()));
        final Room room = (Room)DataChannelGlobal.LIZJ.LIZIZ((Class)HQ5.class);
        long id;
        if (room != null) {
            id = room.getId();
        }
        else {
            id = 0L;
        }
        liz.LIZ("room_id", id);
        liz.LIZ("live_type", "screen_share");
        final 44V ljjiiz = GST.LJJIIZ;
        n.LIZIZ((Object)ljjiiz, "");
        liz.LIZ("is_comments_notifications", GTi.LJ((Boolean)((44T)ljjiiz).LIZ()));
        final 44V ljjiizi = GST.LJJIIZI;
        n.LIZIZ((Object)ljjiizi, "");
        liz.LIZ("is_gift_notifications", GTi.LJ((Boolean)((44T)ljjiizi).LIZ()));
        final 44V ljjij = GST.LJJIJ;
        n.LIZIZ((Object)ljjij, "");
        liz.LIZ("is_entry_messages", GTi.LJ((Boolean)((44T)ljjij).LIZ()));
        final 44V ljjijiiji = GST.LJJIJIIJI;
        n.LIZIZ((Object)ljjijiiji, "");
        liz.LIZ("is_followed_messages", GTi.LJ((Boolean)((44T)ljjijiiji).LIZ()));
        final 44V ljjijiijil = GST.LJJIJIIJIL;
        n.LIZIZ((Object)ljjijiijil, "");
        liz.LIZ("is_like_messages", GTi.LJ((Boolean)((44T)ljjijiijil).LIZ()));
        final 44V q = GST.q;
        n.LIZIZ((Object)q, "");
        liz.LIZ("is_show_activities_tab", GTi.LJ((Boolean)((44T)q).LIZ()));
        liz.LIZLLL();
    }
    
    public final void onStart() {
        super.onStart();
        if (n.LIZ((Object)this.LIZ, (Object)"guide_toast") || n.LIZ((Object)this.LIZ, (Object)"popup_panel")) {
            final T0p lji = this.LJI;
            if (lji != null) {
                final T0r tab = lji.getTabAt(1);
                if (tab != null) {
                    tab.LIZ();
                }
            }
        }
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 0Yy implements View$OnClickListener
        {
            public final /* synthetic */ GameMessageAlertDialog LIZ;
            
            static {
                Covode.recordClassIndex(5329);
            }
            
            public 0Yy(final GameMessageAlertDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                ((DialogFragment)this.LIZ).dismiss();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //     6: aload_1        
        //     7: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    10: aload_0        
        //    11: aload_1        
        //    12: aload_2        
        //    13: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    16: aload_1        
        //    17: new             LX/0Yy;
        //    20: dup            
        //    21: aload_0        
        //    22: invokespecial   X/0Yy.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog;)V
        //    25: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    28: new             Ljava/util/ArrayList;
        //    31: dup            
        //    32: invokespecial   java/util/ArrayList.<init>:()V
        //    35: astore_3       
        //    36: getstatic       X/GST.LJJIIZ:LX/44V;
        //    39: astore_2       
        //    40: aload_2        
        //    41: ldc             ""
        //    43: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    46: aload_3        
        //    47: new             Lcom/bytedance/android/live/broadcast/dialog/0Yx;
        //    50: dup            
        //    51: ldc_w           2131831757
        //    54: aload_2        
        //    55: ldc_w           "livesdk_anchor_message_alert_setting_hover_ban_comment_click"
        //    58: invokespecial   com/bytedance/android/live/broadcast/dialog/0Yx.<init>:(ILX/44V;Ljava/lang/String;)V
        //    61: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    64: pop            
        //    65: getstatic       X/GST.LJJIIZI:LX/44V;
        //    68: astore_2       
        //    69: aload_2        
        //    70: ldc             ""
        //    72: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    75: aload_3        
        //    76: new             Lcom/bytedance/android/live/broadcast/dialog/0Yx;
        //    79: dup            
        //    80: ldc_w           2131831758
        //    83: aload_2        
        //    84: ldc_w           "livesdk_anchor_message_alert_setting_hover_ban_gift_click"
        //    87: invokespecial   com/bytedance/android/live/broadcast/dialog/0Yx.<init>:(ILX/44V;Ljava/lang/String;)V
        //    90: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //    93: pop            
        //    94: getstatic       X/GST.LJJIJ:LX/44V;
        //    97: astore_2       
        //    98: aload_2        
        //    99: ldc             ""
        //   101: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   104: aload_3        
        //   105: new             Lcom/bytedance/android/live/broadcast/dialog/0Yx;
        //   108: dup            
        //   109: ldc_w           2131831759
        //   112: aload_2        
        //   113: ldc_w           "livesdk_anchor_message_alert_setting_hover_ban_entry_click"
        //   116: invokespecial   com/bytedance/android/live/broadcast/dialog/0Yx.<init>:(ILX/44V;Ljava/lang/String;)V
        //   119: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   122: pop            
        //   123: getstatic       X/GST.LJJIJIIJI:LX/44V;
        //   126: astore_2       
        //   127: aload_2        
        //   128: ldc             ""
        //   130: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   133: aload_3        
        //   134: new             Lcom/bytedance/android/live/broadcast/dialog/0Yx;
        //   137: dup            
        //   138: ldc_w           2131831760
        //   141: aload_2        
        //   142: ldc_w           "livesdk_anchor_message_alert_setting_hover_ban_follow_click"
        //   145: invokespecial   com/bytedance/android/live/broadcast/dialog/0Yx.<init>:(ILX/44V;Ljava/lang/String;)V
        //   148: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   151: pop            
        //   152: getstatic       X/GST.LJJIJIIJIL:LX/44V;
        //   155: astore_2       
        //   156: aload_2        
        //   157: ldc             ""
        //   159: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   162: aload_3        
        //   163: new             Lcom/bytedance/android/live/broadcast/dialog/0Yx;
        //   166: dup            
        //   167: ldc_w           2131831761
        //   170: aload_2        
        //   171: ldc_w           "livesdk_anchor_message_alert_setting_hover_ban_like_click"
        //   174: invokespecial   com/bytedance/android/live/broadcast/dialog/0Yx.<init>:(ILX/44V;Ljava/lang/String;)V
        //   177: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   180: pop            
        //   181: new             Ljava/util/ArrayList;
        //   184: dup            
        //   185: invokespecial   java/util/ArrayList.<init>:()V
        //   188: astore          4
        //   190: aload_0        
        //   191: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   194: astore          5
        //   196: aconst_null    
        //   197: astore_2       
        //   198: aconst_null    
        //   199: astore          6
        //   201: aload           5
        //   203: ldc_w           2131562363
        //   206: aconst_null    
        //   207: invokestatic    android/view/View.inflate:(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
        //   210: astore          5
        //   212: aload           5
        //   214: ifnull          330
        //   217: aload           5
        //   219: ldc_w           2131372697
        //   222: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   225: checkcast       LX/2Bo;
        //   228: astore          7
        //   230: aload           7
        //   232: ldc_w           "tiktok_live_broadcast_resource"
        //   235: ldc_w           "ttlive_ic_game_setting_msg.png"
        //   238: invokestatic    X/0cc.LIZIZ:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   241: invokevirtual   X/2Bo.LIZ:(Ljava/lang/String;)LX/2Bo;
        //   244: pop            
        //   245: aload           7
        //   247: invokevirtual   X/2Bo.LIZ:()V
        //   250: aload           5
        //   252: ldc_w           2131372725
        //   255: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   258: checkcast       Landroidx/recyclerview/widget/RecyclerView;
        //   261: astore          7
        //   263: aload           7
        //   265: ldc             ""
        //   267: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   270: aload_0        
        //   271: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   274: pop            
        //   275: aload           7
        //   277: new             Landroidx/recyclerview/widget/LinearLayoutManager;
        //   280: dup            
        //   281: iconst_1       
        //   282: iconst_0       
        //   283: invokespecial   androidx/recyclerview/widget/LinearLayoutManager.<init>:(IZ)V
        //   286: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //   289: aload           7
        //   291: new             Lcom/bytedance/android/live/broadcast/dialog/1GS;
        //   294: dup            
        //   295: aload_3        
        //   296: aload_0        
        //   297: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   300: invokestatic    X/6JE.LIZ:(Landroid/content/Context;)Z
        //   303: new             LX/2Gx;
        //   306: dup            
        //   307: aload_0        
        //   308: invokespecial   X/2Gx.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog;)V
        //   311: ldc_w           2131561861
        //   314: invokespecial   com/bytedance/android/live/broadcast/dialog/1GS.<init>:(Ljava/util/List;ZLX/QgG;I)V
        //   317: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //   320: aload           4
        //   322: aload           5
        //   324: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   329: pop            
        //   330: aload_0        
        //   331: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   334: ldc_w           2131562363
        //   337: aconst_null    
        //   338: invokestatic    android/view/View.inflate:(Landroid/content/Context;ILandroid/view/ViewGroup;)Landroid/view/View;
        //   341: astore_3       
        //   342: aload_3        
        //   343: ifnull          503
        //   346: getstatic       X/GST.q:LX/44V;
        //   349: astore          5
        //   351: aload           5
        //   353: ldc             ""
        //   355: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   358: new             Lcom/bytedance/android/live/broadcast/dialog/0Yx;
        //   361: dup            
        //   362: ldc_w           2131831390
        //   365: aload           5
        //   367: ldc_w           "livesdk_live_show_activities_tab_click"
        //   370: invokespecial   com/bytedance/android/live/broadcast/dialog/0Yx.<init>:(ILX/44V;Ljava/lang/String;)V
        //   373: astore          5
        //   375: aload_3        
        //   376: ldc_w           2131372697
        //   379: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   382: checkcast       LX/2Bo;
        //   385: astore          7
        //   387: aload           7
        //   389: ldc_w           "tiktok_live_broadcast_resource"
        //   392: ldc_w           "ttlive_ic_game_setting_activities.png"
        //   395: invokestatic    X/0cc.LIZIZ:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   398: invokevirtual   X/2Bo.LIZ:(Ljava/lang/String;)LX/2Bo;
        //   401: pop            
        //   402: aload           7
        //   404: invokevirtual   X/2Bo.LIZ:()V
        //   407: aload_3        
        //   408: ldc_w           2131372725
        //   411: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   414: checkcast       Landroidx/recyclerview/widget/RecyclerView;
        //   417: astore          8
        //   419: aload           8
        //   421: ldc             ""
        //   423: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   426: aload_0        
        //   427: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   430: pop            
        //   431: aload           8
        //   433: new             Landroidx/recyclerview/widget/LinearLayoutManager;
        //   436: dup            
        //   437: iconst_1       
        //   438: iconst_0       
        //   439: invokespecial   androidx/recyclerview/widget/LinearLayoutManager.<init>:(IZ)V
        //   442: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //   445: new             Ljava/util/ArrayList;
        //   448: dup            
        //   449: invokespecial   java/util/ArrayList.<init>:()V
        //   452: astore          7
        //   454: aload           7
        //   456: aload           5
        //   458: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   461: pop            
        //   462: aload           8
        //   464: new             Lcom/bytedance/android/live/broadcast/dialog/1GS;
        //   467: dup            
        //   468: aload           7
        //   470: aload_0        
        //   471: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   474: invokestatic    X/6JE.LIZ:(Landroid/content/Context;)Z
        //   477: new             LX/2Gy;
        //   480: dup            
        //   481: aload_0        
        //   482: invokespecial   X/2Gy.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog;)V
        //   485: ldc_w           2131562362
        //   488: invokespecial   com/bytedance/android/live/broadcast/dialog/1GS.<init>:(Ljava/util/List;ZLX/QgG;I)V
        //   491: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //   494: aload           4
        //   496: aload_3        
        //   497: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   502: pop            
        //   503: aload_1        
        //   504: ldc_w           2131372698
        //   507: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   510: checkcast       LX/T0p;
        //   513: astore_3       
        //   514: aload_3        
        //   515: ifnull          590
        //   518: aload_1        
        //   519: ldc_w           2131372699
        //   522: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   525: checkcast       LX/0Gh;
        //   528: astore_2       
        //   529: aload           6
        //   531: astore_1       
        //   532: aload_2        
        //   533: ifnull          570
        //   536: new             LX/1GU;
        //   539: dup            
        //   540: aload           4
        //   542: invokespecial   X/1GU.<init>:(Ljava/util/List;)V
        //   545: astore_1       
        //   546: aload_0        
        //   547: getfield        com/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog.LIZJ:[Ljava/lang/String;
        //   550: astore          6
        //   552: aload           6
        //   554: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //   557: aload_1        
        //   558: aload           6
        //   560: putfield        X/1GU.LIZ:[Ljava/lang/String;
        //   563: aload_2        
        //   564: aload_1        
        //   565: invokevirtual   X/0Gh.setAdapter:(Landroidx/viewpager/widget/PagerAdapter;)V
        //   568: aload_2        
        //   569: astore_1       
        //   570: aload_3        
        //   571: aload_1        
        //   572: iconst_0       
        //   573: invokevirtual   X/T0p.setupWithViewPager:(LX/0Gh;Z)V
        //   576: aload_3        
        //   577: new             LX/1iB;
        //   580: dup            
        //   581: aload_0        
        //   582: invokespecial   X/1iB.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog;)V
        //   585: invokevirtual   X/T0p.addOnTabSelectedListener:(LX/Stv;)V
        //   588: aload_3        
        //   589: astore_2       
        //   590: aload_0        
        //   591: aload_2        
        //   592: putfield        com/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog.LJI:LX/T0p;
        //   595: aload_0        
        //   596: invokestatic    X/FGP.LIZ:()LX/FGP;
        //   599: ldc_w           LX/GTe;.class
        //   602: invokevirtual   X/FGP.LIZ:(Ljava/lang/Class;)LX/FBF;
        //   605: new             LX/1GT;
        //   608: dup            
        //   609: aload_0        
        //   610: invokespecial   X/1GT.<init>:(Lcom/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog;)V
        //   613: invokevirtual   X/FBF.LIZLLL:(LX/2d6;)LX/2fc;
        //   616: putfield        com/bytedance/android/live/broadcast/dialog/GameMessageAlertDialog.LIZLLL:LX/2fc;
        //   619: sipush          8495
        //   622: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   625: return         
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
