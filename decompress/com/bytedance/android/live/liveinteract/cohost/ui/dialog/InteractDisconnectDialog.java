// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.ui.dialog;

import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import X.1J6;
import X.1ib;
import android.widget.Space;
import kotlin.jvm.internal.n;
import X.1so;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import X.1Qk;
import org.json.JSONObject;
import X.1jz;
import X.Hf4;
import X.0cB;
import java.util.Map;
import X.0jz;
import X.0xt;
import X.0nC;
import X.0n9;
import X.0xy;
import android.view.View$OnClickListener;
import android.os.Bundle;
import X.CTM;
import android.view.View;
import X.FpL;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.2P9;
import X.QgG;
import X.1lM;
import X.1NN;
import X.1k4;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class InteractDisconnectDialog extends LiveDialogFragment
{
    public String LIZ;
    public String LIZIZ;
    public int LIZJ;
    public String LIZLLL;
    public String LJ;
    public 1k4 LJFF;
    public 1NN LJI;
    public 1lM LJII;
    public boolean LJIIIIZZ;
    public int LJIIIZ;
    public QgG<2P9> LJIIJ;
    public QgG<2P9> LJIIJJI;
    public HashMap LJIIL;
    
    static {
        Covode.recordClassIndex(7479);
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561974);
        fpL.LIZIZ = 2131887250;
        fpL.LJI = 80;
        fpL.LJIIIIZZ = -2;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJIIL == null) {
            this.LJIIL = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJIIL.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJIIL.put(n, viewById);
        }
        return viewById;
    }
    
    public final InteractDisconnectDialog LIZ(final 1lM ljii, final boolean ljiiiizz) {
        CTM.LIZ((Object)ljii);
        this.LJII = ljii;
        this.LJIIIIZZ = ljiiiizz;
        return this;
    }
    
    public final InteractDisconnectDialog LIZ(final boolean ljiiiizz, final QgG<2P9> ljiij) {
        CTM.LIZ((Object)ljiij);
        this.LJIIJ = ljiij;
        this.LJIIIIZZ = ljiiiizz;
        return this;
    }
    
    public final void LIZIZ() {
        final HashMap ljiil = this.LJIIL;
        if (ljiil != null) {
            ljiil.clear();
        }
    }
    
    public final void onDestroy() {
        super.onDestroy();
        this.LJFF = null;
        this.LJII = null;
        this.LJI = null;
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 0m0 implements CompoundButton$OnCheckedChangeListener
        {
            public final /* synthetic */ InteractDisconnectDialog LIZ;
            
            static {
                Covode.recordClassIndex(7482);
            }
            
            public 0m0(final InteractDisconnectDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
                this.LIZ.LJIIIZ = (b ? 1 : 0);
                1NN.LLFF.LIZ().LJJZZI = b;
                final InteractDisconnectDialog liz = this.LIZ;
                if (b) {
                    final 1so 1so = (1so)liz.LIZ(2131368608);
                    n.LIZIZ((Object)1so, "");
                    1so.setVisibility(8);
                    final Space space = (Space)liz.LIZ(2131371519);
                    n.LIZIZ((Object)space, "");
                    space.setVisibility(8);
                    return;
                }
                final 1so 1so2 = (1so)liz.LIZ(2131368608);
                n.LIZIZ((Object)1so2, "");
                1so2.setVisibility(0);
                final Space space2 = (Space)liz.LIZ(2131371519);
                n.LIZIZ((Object)space2, "");
                space2.setVisibility(0);
            }
        }
        public final class 0lz implements View$OnClickListener
        {
            public final /* synthetic */ InteractDisconnectDialog LIZ;
            
            static {
                Covode.recordClassIndex(7481);
            }
            
            public 0lz(final InteractDisconnectDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final InteractDisconnectDialog liz = this.LIZ;
                final int lizj = liz.LIZJ;
                if (lizj != 1) {
                    if (lizj != 2) {
                        if (lizj == 3) {
                            final QgG<2P9> ljiij = liz.LJIIJ;
                            if (ljiij != null) {
                                ljiij.invoke();
                            }
                            1Qk 1Qk;
                            if (liz.LJIIIIZZ) {
                                1Qk = 0n9.LIZIZ;
                            }
                            else {
                                1Qk = 0n9.LIZ;
                            }
                            if (1Qk.LIZJ() == 0nC.INVITED) {
                                0xt.LIZIZ.LIZ(liz.LJIIIIZZ);
                            }
                        }
                    }
                    else {
                        1Qk 1Qk2;
                        if (liz.LJIIIIZZ) {
                            1Qk2 = 0n9.LIZIZ;
                        }
                        else {
                            1Qk2 = 0n9.LIZ;
                        }
                        final 0nC lizj2 = 1Qk2.LIZJ();
                        if (lizj2 == 0nC.INVITED) {
                            if (liz.LJII != null) {
                                if (!0jz.LIZLLL().isEnableSDK()) {
                                    final 0xt liziz = 0xt.LIZIZ;
                                    final HashMap hashMap = new HashMap();
                                    liziz.LIZIZ(hashMap);
                                    liziz.LIZ(true, false, hashMap);
                                    hashMap.put("invitee_id", String.valueOf(1NN.LLFF.LIZ().LJFF));
                                    liziz.LIZ("livesdk_match_cancel_click", hashMap);
                                }
                                final 1lM ljii = liz.LJII;
                                if (ljii != null) {
                                    ljii.LIZ(liz.LJIIIIZZ, null);
                                }
                            }
                            0xt.LIZIZ.LIZ(liz.LJIIIIZZ);
                        }
                        else if (0nC.START.compareTo(lizj2) <= 0 && lizj2.compareTo(0nC.FINISH) < 0) {
                            if (!0jz.LIZLLL().isEnableSDK()) {
                                0xt.LIZ(0xt.a.POSITIVE_OVER);
                            }
                            final 1lM ljii2 = liz.LJII;
                            if (ljii2 != null) {
                                1lM.LIZ(ljii2, 101, true);
                            }
                        }
                    }
                }
                else if (liz.LJFF != null) {
                    Hf4.LIZ(0cB.LJ(), 2131829246);
                    final 1NN lji = liz.LJI;
                    if (lji != null) {
                        lji.LJJJLZIJ = true;
                    }
                    1jz.LIZLLL.LIZ("finish_click", new JSONObject(), 0);
                    final 1k4 ljff = liz.LJFF;
                    if (ljff != null) {
                        ljff.LIZIZ(201);
                    }
                }
                ((DialogFragment)this.LIZ).dismiss();
                0xy.LIZ("disconnect", this.LIZ.LJIIIZ);
            }
        }
        public final class 0ly implements View$OnClickListener
        {
            public final /* synthetic */ InteractDisconnectDialog LIZ;
            
            static {
                Covode.recordClassIndex(7480);
            }
            
            public 0ly(final InteractDisconnectDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final QgG<2P9> ljiijji = this.LIZ.LJIIJJI;
                if (ljiijji != null) {
                    ljiijji.invoke();
                }
                ((DialogFragment)this.LIZ).dismiss();
                0xy.LIZ("keep_connect", this.LIZ.LJIIIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.onViewCreated:(Landroid/view/View;Landroid/os/Bundle;)V
        //    10: aload_0        
        //    11: ldc             2131373652
        //    13: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    16: checkcast       LX/1ib;
        //    19: astore_2       
        //    20: aload_2        
        //    21: ldc             ""
        //    23: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    26: aload_2        
        //    27: aload_0        
        //    28: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog.LIZ:Ljava/lang/String;
        //    31: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //    34: aload_0        
        //    35: ldc             2131373093
        //    37: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    40: checkcast       LX/1ib;
        //    43: astore_2       
        //    44: aload_2        
        //    45: ldc             ""
        //    47: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    50: aload_2        
        //    51: aload_0        
        //    52: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog.LIZIZ:Ljava/lang/String;
        //    55: invokevirtual   X/1ib.setText:(Ljava/lang/CharSequence;)V
        //    58: getstatic       X/1NN.LLFF:LX/0k5;
        //    61: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //    64: getfield        X/1NN.LJIILL:LX/0kf;
        //    67: invokevirtual   X/0kf.getType:()I
        //    70: istore_3       
        //    71: iconst_0       
        //    72: istore          4
        //    74: iload_3        
        //    75: iconst_1       
        //    76: if_icmpne       519
        //    79: iconst_1       
        //    80: istore_3       
        //    81: iload_3        
        //    82: ifne            475
        //    85: aload_0        
        //    86: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog.LIZJ:I
        //    89: iconst_1       
        //    90: if_icmpne       475
        //    93: aload_0        
        //    94: ldc             2131374200
        //    96: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    99: astore_2       
        //   100: aload_2        
        //   101: ldc             ""
        //   103: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   106: aload_2        
        //   107: iconst_0       
        //   108: invokevirtual   android/view/View.setVisibility:(I)V
        //   111: aload_0        
        //   112: ldc             2131363332
        //   114: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   117: checkcast       LX/1J6;
        //   120: astore_2       
        //   121: aload_2        
        //   122: ldc             ""
        //   124: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   127: aload_2        
        //   128: iconst_0       
        //   129: invokevirtual   X/1J6.setVisibility:(I)V
        //   132: aload_0        
        //   133: ldc             2131368608
        //   135: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   138: checkcast       LX/1so;
        //   141: astore_2       
        //   142: aload_2        
        //   143: ldc             ""
        //   145: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   148: aload_2        
        //   149: aload_0        
        //   150: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog.LJ:Ljava/lang/String;
        //   153: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   156: aload_0        
        //   157: ldc             2131369513
        //   159: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   162: checkcast       LX/1so;
        //   165: astore_2       
        //   166: aload_2        
        //   167: ldc             ""
        //   169: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   172: aload_2        
        //   173: aload_0        
        //   174: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog.LIZLLL:Ljava/lang/String;
        //   177: invokevirtual   X/1so.setText:(Ljava/lang/CharSequence;)V
        //   180: aload_0        
        //   181: ldc             2131368608
        //   183: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   186: checkcast       LX/1so;
        //   189: new             LX/0ly;
        //   192: dup            
        //   193: aload_0        
        //   194: invokespecial   X/0ly.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog;)V
        //   197: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   200: aload_0        
        //   201: ldc             2131369513
        //   203: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   206: checkcast       LX/1so;
        //   209: new             LX/0lz;
        //   212: dup            
        //   213: aload_0        
        //   214: invokespecial   X/0lz.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog;)V
        //   217: invokevirtual   X/1so.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   220: aload_1        
        //   221: ldc             2131363332
        //   223: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   226: checkcast       LX/1J6;
        //   229: new             LX/0m0;
        //   232: dup            
        //   233: aload_0        
        //   234: invokespecial   X/0m0.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog;)V
        //   237: invokevirtual   X/1J6.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
        //   240: new             Ljava/util/HashMap;
        //   243: dup            
        //   244: invokespecial   java/util/HashMap.<init>:()V
        //   247: astore_2       
        //   248: getstatic       X/1NN.LLFF:LX/0k5;
        //   251: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   254: getfield        X/1NN.LJIILL:LX/0kf;
        //   257: getstatic       X/0kf.FOLLOW_INVITE:LX/0kf;
        //   260: if_acmpne       468
        //   263: ldc             "mutual_follow"
        //   265: astore_1       
        //   266: aload_2        
        //   267: ldc             "invitee_list"
        //   269: aload_1        
        //   270: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   275: pop            
        //   276: iload           4
        //   278: istore_3       
        //   279: getstatic       X/0n9.LIZ:LX/1Qk;
        //   282: invokevirtual   X/1Qk.LIZJ:()LX/0nC;
        //   285: getstatic       X/0nC.NORMAL:LX/0nC;
        //   288: if_acmpeq       293
        //   291: iconst_1       
        //   292: istore_3       
        //   293: iload_3        
        //   294: ifne            453
        //   297: aload_2        
        //   298: ldc             "connection_type"
        //   300: ldc             "anchor"
        //   302: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   307: pop            
        //   308: ldc             "cancel_connection_popup"
        //   310: aload_2        
        //   311: invokestatic    X/0xy.LIZ:(Ljava/lang/String;Ljava/util/Map;)V
        //   314: aload_0        
        //   315: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog.LIZJ:I
        //   318: istore_3       
        //   319: iload_3        
        //   320: iconst_3       
        //   321: if_icmpeq       329
        //   324: iload_3        
        //   325: iconst_2       
        //   326: if_icmpne       442
        //   329: aload_0        
        //   330: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog.LJIIIIZZ:Z
        //   333: ifeq            443
        //   336: getstatic       X/0n9.LIZIZ:LX/1Qk;
        //   339: invokevirtual   X/1Qk.LIZJ:()LX/0nC;
        //   342: astore_1       
        //   343: aload_1        
        //   344: getstatic       X/0nC.INVITED:LX/0nC;
        //   347: if_acmpne       442
        //   350: getstatic       X/0xt.LIZIZ:LX/0xt;
        //   353: astore          5
        //   355: aload_0        
        //   356: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/InteractDisconnectDialog.LJIIIIZZ:Z
        //   359: istore          6
        //   361: new             Ljava/util/LinkedHashMap;
        //   364: dup            
        //   365: invokespecial   java/util/LinkedHashMap.<init>:()V
        //   368: astore_1       
        //   369: aload           5
        //   371: iconst_1       
        //   372: iload           6
        //   374: aload_1        
        //   375: invokevirtual   X/0xt.LIZ:(ZZLjava/util/Map;)V
        //   378: aload           5
        //   380: aload_1        
        //   381: invokevirtual   X/0xt.LIZIZ:(Ljava/util/Map;)V
        //   384: getstatic       X/1NN.LLFF:LX/0k5;
        //   387: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   390: getfield        X/1NN.LJL:Ljava/lang/String;
        //   393: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   396: ifne            427
        //   399: getstatic       X/1NN.LLFF:LX/0k5;
        //   402: invokevirtual   X/0k5.LIZ:()LX/1NN;
        //   405: getfield        X/1NN.LJL:Ljava/lang/String;
        //   408: astore_2       
        //   409: aload_2        
        //   410: ifnonnull       416
        //   413: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   416: aload_1        
        //   417: ldc_w           "request_from"
        //   420: aload_2        
        //   421: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   426: pop            
        //   427: aload           5
        //   429: aload_1        
        //   430: invokevirtual   X/0xt.LIZLLL:(Ljava/util/Map;)V
        //   433: aload           5
        //   435: ldc_w           "livesdk_pk_invite_withdraw_page_show"
        //   438: aload_1        
        //   439: invokevirtual   X/0xt.LIZ:(Ljava/lang/String;Ljava/util/Map;)V
        //   442: return         
        //   443: getstatic       X/0n9.LIZ:LX/1Qk;
        //   446: invokevirtual   X/1Qk.LIZJ:()LX/0nC;
        //   449: astore_1       
        //   450: goto            343
        //   453: aload_2        
        //   454: ldc             "connection_type"
        //   456: ldc_w           "manual_pk"
        //   459: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   464: pop            
        //   465: goto            308
        //   468: ldc_w           "recommend"
        //   471: astore_1       
        //   472: goto            266
        //   475: aload_0        
        //   476: ldc             2131374200
        //   478: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   481: astore_2       
        //   482: aload_2        
        //   483: ldc             ""
        //   485: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   488: aload_2        
        //   489: bipush          8
        //   491: invokevirtual   android/view/View.setVisibility:(I)V
        //   494: aload_0        
        //   495: ldc             2131363332
        //   497: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //   500: checkcast       LX/1J6;
        //   503: astore_2       
        //   504: aload_2        
        //   505: ldc             ""
        //   507: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   510: aload_2        
        //   511: bipush          8
        //   513: invokevirtual   X/1J6.setVisibility:(I)V
        //   516: goto            132
        //   519: iconst_0       
        //   520: istore_3       
        //   521: goto            81
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
