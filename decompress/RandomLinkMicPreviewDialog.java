// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.cohost.ui.dialog;

import androidx.fragment.app.Fragment;
import X.0xg;
import X.0kf;
import X.Gkn;
import X.CTM;
import kotlin.jvm.internal.n;
import X.1Pd;
import X.2d6;
import android.view.View$OnClickListener;
import android.os.Bundle;
import X.1Oa;
import android.view.View;
import X.FpL;
import X.6uH;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.1ib;
import X.1O2;
import X.8si;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import X.0lC;
import com.bytedance.android.livesdk.LiveDialogFragment;

public final class RandomLinkMicPreviewDialog extends LiveDialogFragment implements b
{
    public a LIZ;
    public List<? extends ImageModel> LIZIZ;
    public int LIZJ;
    public 8si<? extends 1O2.g, Long> LIZLLL;
    public 1ib LJ;
    public final 1O2.a LJFF;
    public HashMap LJI;
    
    static {
        Covode.recordClassIndex(7501);
    }
    
    public RandomLinkMicPreviewDialog() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.<init>:()V
        //     4: aload_0        
        //     5: getstatic       X/6uH.INSTANCE:LX/6uH;
        //     8: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZIZ:Ljava/util/List;
        //    11: aload_0        
        //    12: iconst_2       
        //    13: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZJ:I
        //    16: aload_0        
        //    17: new             LX/1PR;
        //    20: dup            
        //    21: aload_0        
        //    22: invokespecial   X/1PR.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog;)V
        //    25: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LJFF:LX/0kl;
        //    28: return         
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
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561897);
        fpL.LJI = 80;
        fpL.LJFF = 0.0f;
        fpL.LJII = -1;
        fpL.LJIIIIZZ = -2;
        return fpL;
    }
    
    public final View LIZ(final int n) {
        if (this.LJI == null) {
            this.LJI = new HashMap();
        }
        View viewById;
        if ((viewById = this.LJI.get(n)) == null) {
            final View view = ((Fragment)this).getView();
            if (view == null) {
                return null;
            }
            viewById = view.findViewById(n);
            this.LJI.put(n, viewById);
        }
        return viewById;
    }
    
    public final void LIZ(final 8si<? extends 1O2.g, Long> 8si) {
        final 1ib lj = this.LJ;
        if (lj != null) {
            lj.setText((CharSequence)1Oa.LIZIZ.LIZ(8si));
        }
    }
    
    public final void LIZIZ() {
        final HashMap lji = this.LJI;
        if (lji != null) {
            lji.clear();
        }
    }
    
    public final void onDestroyView() {
        super.onDestroyView();
        final a liz = this.LIZ;
        if (liz != null) {
            liz.LIZIZ();
        }
        1O2.LIZIZ(this.LJFF);
        this.LIZIZ();
    }
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 1PS<T> implements 2d6
        {
            public final /* synthetic */ RandomLinkMicPreviewDialog LIZ;
            public final /* synthetic */ 1Pd LIZIZ;
            
            static {
                Covode.recordClassIndex(7504);
            }
            
            public 1PS(final RandomLinkMicPreviewDialog liz, final 1Pd liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
        }
        public final class 0m7 implements View$OnClickListener
        {
            public final /* synthetic */ RandomLinkMicPreviewDialog LIZ;
            
            static {
                Covode.recordClassIndex(7503);
            }
            
            public 0m7(final RandomLinkMicPreviewDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                final a liz = this.LIZ.LIZ;
                if (liz != null) {
                    liz.LIZ();
                }
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
        //    11: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZLLL:LX/8si;
        //    14: ifnonnull       21
        //    17: aload_0        
        //    18: invokevirtual   androidx/fragment/app/DialogFragment.dismiss:()V
        //    21: getstatic       X/1O2.LIZJ:J
        //    24: lstore_3       
        //    25: getstatic       X/Gkn.LJFF:LX/Gkq;
        //    28: ldc             "livesdk_cancel_connection_popup_show"
        //    30: invokevirtual   X/Gkq.LIZ:(Ljava/lang/String;)LX/Gkn;
        //    33: astore_2       
        //    34: aload_2        
        //    35: invokevirtual   X/Gkn.LIZ:()LX/Gkn;
        //    38: pop            
        //    39: aload_2        
        //    40: ldc             "waiting_time"
        //    42: lload_3        
        //    43: ldc2_w          1000
        //    46: lmul           
        //    47: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;J)LX/Gkn;
        //    50: pop            
        //    51: aload_2        
        //    52: ldc             "enter_from"
        //    54: ldc             "connection_icon"
        //    56: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //    59: pop            
        //    60: aload_2        
        //    61: ldc             "invitee_list"
        //    63: getstatic       X/0kf.RANDOM_LINK_MIC_INVITE:LX/0kf;
        //    66: invokestatic    X/0xg.LIZ:(LX/0kf;)Ljava/lang/String;
        //    69: invokevirtual   X/Gkn.LIZ:(Ljava/lang/String;Ljava/lang/String;)LX/Gkn;
        //    72: pop            
        //    73: aload_2        
        //    74: invokevirtual   X/Gkn.LIZLLL:()V
        //    77: new             LX/1Oa;
        //    80: dup            
        //    81: invokespecial   X/1Oa.<init>:()V
        //    84: astore_2       
        //    85: aload_0        
        //    86: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //    89: aload_2        
        //    90: aload_0        
        //    91: putfield        X/1Oa.LIZ:LX/0lB;
        //    94: aload_0        
        //    95: aload_2        
        //    96: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZ:LX/0lA;
        //    99: aload_0        
        //   100: aload_1        
        //   101: ldc             2131373449
        //   103: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   106: checkcast       LX/1ib;
        //   109: putfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LJ:LX/1ib;
        //   112: aload_0        
        //   113: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZLLL:LX/8si;
        //   116: astore_2       
        //   117: aload_2        
        //   118: ifnonnull       124
        //   121: invokestatic    kotlin/jvm/internal/n.LIZIZ:()V
        //   124: aload_0        
        //   125: aload_2        
        //   126: invokevirtual   com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZ:(LX/8si;)V
        //   129: aload_1        
        //   130: ldc             2131373445
        //   132: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   135: checkcast       LX/1ib;
        //   138: astore_2       
        //   139: aload_2        
        //   140: ifnull          155
        //   143: aload_2        
        //   144: new             LX/0m7;
        //   147: dup            
        //   148: aload_0        
        //   149: invokespecial   X/0m7.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog;)V
        //   152: invokevirtual   X/1ib.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   155: aload_0        
        //   156: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LJFF:LX/0kl;
        //   159: invokestatic    X/1O2.LIZ:(LX/0kl;)Z
        //   162: pop            
        //   163: aload_1        
        //   164: invokevirtual   android/view/View.getContext:()Landroid/content/Context;
        //   167: astore          5
        //   169: aload           5
        //   171: ldc             ""
        //   173: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   176: aload_0        
        //   177: invokevirtual   androidx/fragment/app/Fragment.getContext:()Landroid/content/Context;
        //   180: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //   183: astore_2       
        //   184: aload_2        
        //   185: ldc             ""
        //   187: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   190: new             LX/1kD;
        //   193: dup            
        //   194: aload           5
        //   196: aload_2        
        //   197: invokespecial   X/1kD.<init>:(Landroid/content/Context;Landroid/view/LayoutInflater;)V
        //   200: astore_2       
        //   201: aload_1        
        //   202: ldc             2131374304
        //   204: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   207: checkcast       LX/1Pd;
        //   210: astore_1       
        //   211: aload_1        
        //   212: iconst_0       
        //   213: invokevirtual   X/1Pd.setClickable:(Z)V
        //   216: aload_1        
        //   217: invokestatic    X/0cB.LIZJ:()I
        //   220: i2f            
        //   221: ldc_w           1.25
        //   224: fdiv           
        //   225: f2i            
        //   226: ineg           
        //   227: invokevirtual   X/0Gh.setPageMargin:(I)V
        //   230: aload_1        
        //   231: iconst_2       
        //   232: invokevirtual   X/0Gh.setOffscreenPageLimit:(I)V
        //   235: aload_1        
        //   236: ldc             ""
        //   238: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   241: aload_0        
        //   242: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZIZ:Ljava/util/List;
        //   245: invokeinterface java/util/List.size:()I
        //   250: bipush          10
        //   252: if_icmplt       393
        //   255: iconst_1       
        //   256: istore          6
        //   258: aload_1        
        //   259: iconst_0       
        //   260: new             LX/1P2;
        //   263: dup            
        //   264: aload_1        
        //   265: iload           6
        //   267: invokespecial   X/1P2.<init>:(LX/0Gh;Z)V
        //   270: invokevirtual   X/0Gh.setPageTransformer:(ZLX/0Ge;)V
        //   273: aload_0        
        //   274: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZIZ:Ljava/util/List;
        //   277: astore          5
        //   279: aload           5
        //   281: ifnull          313
        //   284: aload           5
        //   286: invokestatic    X/Qsi.LJII:(Ljava/lang/Iterable;)Ljava/util/List;
        //   289: astore          5
        //   291: aload           5
        //   293: ifnull          313
        //   296: aload_2        
        //   297: getfield        X/1kD.LIZ:Ljava/util/ArrayList;
        //   300: invokevirtual   java/util/ArrayList.clear:()V
        //   303: aload_2        
        //   304: getfield        X/1kD.LIZ:Ljava/util/ArrayList;
        //   307: aload           5
        //   309: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   312: pop            
        //   313: aload_1        
        //   314: aload_2        
        //   315: invokevirtual   X/0Gh.setAdapter:(Landroidx/viewpager/widget/PagerAdapter;)V
        //   318: aload_1        
        //   319: aload_0        
        //   320: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZJ:I
        //   323: invokevirtual   X/0Gh.setCurrentItem:(I)V
        //   326: aload_0        
        //   327: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZIZ:Ljava/util/List;
        //   330: invokeinterface java/util/List.size:()I
        //   335: bipush          10
        //   337: if_icmplt       392
        //   340: ldc2_w          2300
        //   343: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //   346: invokestatic    X/FBH.LIZIZ:(JLjava/util/concurrent/TimeUnit;)LX/FBF;
        //   349: new             LX/FC5;
        //   352: dup            
        //   353: invokespecial   X/FC5.<init>:()V
        //   356: invokevirtual   X/FBF.LIZ:(LX/FCD;)LX/FBF;
        //   359: new             LX/1PS;
        //   362: dup            
        //   363: aload_0        
        //   364: aload_1        
        //   365: invokespecial   X/1PS.<init>:(Lcom/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog;LX/1Pd;)V
        //   368: invokevirtual   X/FBF.LIZLLL:(LX/2d6;)LX/2fc;
        //   371: astore_1       
        //   372: aload_1        
        //   373: ifnull          392
        //   376: aload_0        
        //   377: getfield        com/bytedance/android/live/liveinteract/cohost/ui/dialog/RandomLinkMicPreviewDialog.LIZ:LX/0lA;
        //   380: astore_2       
        //   381: aload_2        
        //   382: ifnull          392
        //   385: aload_2        
        //   386: aload_1        
        //   387: invokeinterface X/0lA.LIZ:(LX/2fc;)V
        //   392: return         
        //   393: iconst_0       
        //   394: istore          6
        //   396: goto            258
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
