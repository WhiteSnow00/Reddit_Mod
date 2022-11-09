// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.liveinteract.multilive.guset.dialog;

import X.SRN;
import androidx.fragment.app.DialogFragment;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import X.1NO;
import X.0uW;
import X.1Uo;
import X.1jw;
import X.0jz;
import X.0sD;
import X.0AB;
import X.JOh;
import X.CTM;
import X.2P9;
import X.SRS;
import X.F5g;
import android.view.View$OnClickListener;
import android.os.Bundle;
import X.0vm;
import java.util.Objects;
import X.0AO;
import X.5e3;
import X.0uy;
import X.GTi;
import X.0ux;
import android.view.View;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ColorDrawable;
import X.FpL;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestPreviewFragment;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestUserInfoFragment;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import X.5DO;
import X.1YG;
import X.1Xa;
import androidx.fragment.app.Fragment;
import X.1ZS;
import X.0rb;
import X.1kK;
import java.lang.ref.WeakReference;
import X.0qb;
import com.bytedance.android.live.liveinteract.multilive.guset.fragment.PreviewDialogFragment;

public final class MultiLiveGuestUserInfoDialog extends PreviewDialogFragment
{
    public static final a LJIIIIZZ;
    public 0qb.a LIZ;
    public WeakReference<1kK> LIZIZ;
    public 0rb.a LIZJ;
    public 1ZS LIZLLL;
    public Fragment LJ;
    public 1Xa LJFF;
    public 1YG LJI;
    public String LJII;
    public final 5DO LJIIIZ;
    public final 5DO LJIIJ;
    public final long LJIIJJI;
    public HashMap LJIIL;
    
    static {
        Covode.recordClassIndex(9584);
        LJIIIIZZ = (a)new a((byte)0);
    }
    
    public MultiLiveGuestUserInfoDialog() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/android/live/liveinteract/multilive/guset/fragment/PreviewDialogFragment.<init>:()V
        //     4: aload_0        
        //     5: ldc             "anchor_permit"
        //     7: putfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJII:Ljava/lang/String;
        //    10: aload_0        
        //    11: new             LX/26D;
        //    14: dup            
        //    15: aload_0        
        //    16: invokespecial   X/26D.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //    19: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    22: putfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJIIIZ:LX/5DO;
        //    25: aload_0        
        //    26: new             LX/26C;
        //    29: dup            
        //    30: aload_0        
        //    31: invokespecial   X/26C.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //    34: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    37: putfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJIIJ:LX/5DO;
        //    40: aload_0        
        //    41: invokestatic    java/lang/System.currentTimeMillis:()J
        //    44: putfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJIIJJI:J
        //    47: return         
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
    
    public static final /* synthetic */ void LIZ(final MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog) {
        multiLiveGuestUserInfoDialog.dismiss();
    }
    
    private final MultiGuestUserInfoFragment LJFF() {
        return (MultiGuestUserInfoFragment)this.LJIIIZ.getValue();
    }
    
    private final MultiGuestPreviewFragment LJI() {
        return (MultiGuestPreviewFragment)this.LJIIJ.getValue();
    }
    
    public final boolean D_() {
        final MultiGuestPreviewFragment lji = this.LJI();
        n.LIZIZ((Object)lji, "");
        if (lji.mStatusActive) {
            this.LJI().LJIIIIZZ();
            return true;
        }
        return super.D_();
    }
    
    public final FpL LIZ() {
        final FpL fpL = new FpL(2131561873);
        fpL.LIZIZ = 2131887257;
        fpL.LIZ((Drawable)new ColorDrawable(0));
        fpL.LJI = 80;
        fpL.LJIIIIZZ = -1;
        fpL.LJ = (this.LIZLLL() ^ true);
        return fpL;
    }
    
    @Override
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
    
    public final void LIZ(final 0rb.a lizj, final 1ZS lizlll) {
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
    }
    
    public final void LIZ(final 0ux 0ux) {
        if (GTi.LIZ((CharSequence)0ux.getSource())) {
            this.LJII = 0ux.getSource();
        }
        final int n = 0uy.LIZ[0ux.ordinal()];
        0qb.b lj;
        if (n != 1) {
            if (n != 2) {
                throw new 5e3();
            }
            lj = this.LJI();
        }
        else {
            this.LJFF().LIZ(this.LIZJ, this.LIZLLL);
            lj = this.LJFF();
        }
        this.LJ = (Fragment)lj;
        final 0AO liz = ((Fragment)this).getChildFragmentManager().LIZ();
        if (0ux.getGoNextPage()) {
            liz.LIZ(2130772235, 2130772231);
        }
        else {
            liz.LIZ(2130772230, 2130772236);
        }
        final Fragment lj2 = this.LJ;
        if (lj2 == null) {
            return;
        }
        liz.LIZIZ(2131365523, lj2, null);
        liz.LIZIZ();
    }
    
    public final void LIZ(final 1Xa ljff, final 1YG lji) {
        if (ljff != null) {
            this.LJFF = ljff;
        }
        if (lji != null) {
            this.LJI = lji;
        }
    }
    
    @Override
    public final void LIZIZ() {
        final HashMap ljiil = this.LJIIL;
        if (ljiil != null) {
            ljiil.clear();
        }
    }
    
    public final boolean LIZLLL() {
        return this.LIZJ == 0rb.a.GO_LIVE;
    }
    
    public final Fragment LJ() {
        0qb.b b;
        if (this.LIZLLL()) {
            b = this.LJI();
            n.LIZIZ((Object)b, "");
        }
        else {
            b = this.LJFF();
        }
        return (Fragment)b;
    }
    
    public final void dismiss() {
        public final class 0uv implements Runnable
        {
            public final /* synthetic */ MultiLiveGuestUserInfoDialog LIZ;
            
            static {
                Covode.recordClassIndex(9586);
            }
            
            public 0uv(final MultiLiveGuestUserInfoDialog liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                MultiLiveGuestUserInfoDialog.LIZ(this.LIZ);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJ:Landroidx/fragment/app/Fragment;
        //     4: astore_1       
        //     5: aload_1        
        //     6: instanceof      Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment;
        //     9: istore_2       
        //    10: iconst_0       
        //    11: istore_3       
        //    12: iload_2        
        //    13: ifeq            369
        //    16: aload_1        
        //    17: ldc_w           "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestPreviewFragment"
        //    20: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    23: pop            
        //    24: aload_1        
        //    25: checkcast       Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment;
        //    28: astore_1       
        //    29: aload_1        
        //    30: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LIZLLL:Landroid/view/View;
        //    33: ifnull          44
        //    36: aload_1        
        //    37: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LIZLLL:Landroid/view/View;
        //    40: iconst_0       
        //    41: invokevirtual   android/view/View.setVisibility:(I)V
        //    44: aload_1        
        //    45: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LJIILLIIL:LX/1Uo;
        //    48: ifnull          72
        //    51: aload_1        
        //    52: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LJIILJJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    55: aload_1        
        //    56: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LJFF:Ljava/lang/Boolean;
        //    59: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //    62: aload_1        
        //    63: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LJIILLIIL:LX/1Uo;
        //    66: getfield        X/1Uo.LIZIZ:Z
        //    69: invokestatic    X/0vm.LIZ:(Lcom/bytedance/ies/sdk/datachannel/DataChannel;ZZ)V
        //    72: aload_1        
        //    73: iconst_1       
        //    74: putfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LJIJI:Z
        //    77: aload_0        
        //    78: getfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJ:Landroidx/fragment/app/Fragment;
        //    81: astore_1       
        //    82: aload_1        
        //    83: ldc_w           "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestPreviewFragment"
        //    86: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    89: pop            
        //    90: aload_1        
        //    91: checkcast       Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment;
        //    94: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LIZLLL:Landroid/view/View;
        //    97: astore_1       
        //    98: aload_1        
        //    99: ifnull          115
        //   102: aload_1        
        //   103: new             LX/0uv;
        //   106: dup            
        //   107: aload_0        
        //   108: invokespecial   X/0uv.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //   111: invokevirtual   android/view/View.post:(Ljava/lang/Runnable;)Z
        //   114: pop            
        //   115: getstatic       X/0sD.LIZJ:LX/0sC;
        //   118: invokevirtual   X/0sC.LIZ:()LX/0sD;
        //   121: invokevirtual   X/0sD.LIZLLL:()Z
        //   124: ifeq            336
        //   127: invokestatic    X/0jz.LIZJ:()Lcom/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService;
        //   130: invokeinterface com/bytedance/android/live/liveinteract/multiguestv3/internal/IMultiGuestV3InternalService.getLinkMicState:()I
        //   135: iconst_5       
        //   136: if_icmpne       336
        //   139: aload_0        
        //   140: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LIZLLL:()Z
        //   143: ifne            336
        //   146: getstatic       X/1jw.LIZ:LX/1jw;
        //   149: ldc_w           "MULTI_GUEST_DATA_HOLDER"
        //   152: invokevirtual   X/1Na.LIZ:(Ljava/lang/String;)Ljava/lang/Object;
        //   155: astore          4
        //   157: aload           4
        //   159: astore_1       
        //   160: aload           4
        //   162: instanceof      LX/1Uo;
        //   165: ifne            170
        //   168: aconst_null    
        //   169: astore_1       
        //   170: aload_1        
        //   171: checkcast       LX/1Uo;
        //   174: astore_1       
        //   175: aload_1        
        //   176: ifnull          336
        //   179: invokestatic    X/1NO.LIZ:()LX/1NO;
        //   182: getfield        X/1NO.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //   185: ifnull          190
        //   188: iconst_1       
        //   189: istore_3       
        //   190: iload_3        
        //   191: ifeq            236
        //   194: new             LX/0Wp;
        //   197: dup            
        //   198: ldc_w           "liveinteract"
        //   201: invokestatic    X/1NO.LIZ:()LX/1NO;
        //   204: getfield        X/1NO.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //   207: ldc             ""
        //   209: invokespecial   X/0Wp.<init>:(Ljava/lang/String;Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;Ljava/lang/String;)V
        //   212: astore          4
        //   214: aload_0        
        //   215: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   218: astore          5
        //   220: aload           5
        //   222: ifnull          236
        //   225: aload           5
        //   227: ldc_w           LX/Gte;.class
        //   230: aload           4
        //   232: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZJ:(Ljava/lang/Class;Ljava/lang/Object;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   235: pop            
        //   236: getstatic       X/0uW.LIZJ:LX/0uW;
        //   239: astore          5
        //   241: invokestatic    X/1NO.LIZ:()LX/1NO;
        //   244: getfield        X/1NO.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //   247: astore          4
        //   249: invokestatic    X/1NO.LIZ:()LX/1NO;
        //   252: getfield        X/1NO.LIZIZ:I
        //   255: i2l            
        //   256: lstore          6
        //   258: aload_1        
        //   259: getfield        X/1Uo.LIZ:Z
        //   262: istore          8
        //   264: aload_1        
        //   265: getfield        X/1Uo.LIZIZ:Z
        //   268: istore          9
        //   270: aload_1        
        //   271: getfield        X/1Uo.LIZLLL:Z
        //   274: istore_2       
        //   275: aload_0        
        //   276: getfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJ:Landroidx/fragment/app/Fragment;
        //   279: astore_1       
        //   280: aload_1        
        //   281: instanceof      Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment;
        //   284: ifeq            337
        //   287: aload_1        
        //   288: ldc_w           "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestPreviewFragment"
        //   291: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   294: pop            
        //   295: aload_1        
        //   296: checkcast       Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment;
        //   299: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestPreviewFragment.LJJ:Ljava/lang/String;
        //   302: astore_1       
        //   303: aload_1        
        //   304: ldc             ""
        //   306: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   309: aload           5
        //   311: aload           4
        //   313: lload           6
        //   315: iload           8
        //   317: iconst_1       
        //   318: ixor           
        //   319: iload           9
        //   321: iconst_1       
        //   322: ixor           
        //   323: iload_2        
        //   324: aload_1        
        //   325: invokestatic    java/lang/System.currentTimeMillis:()J
        //   328: aload_0        
        //   329: getfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJIIJJI:J
        //   332: lsub           
        //   333: invokevirtual   X/0uW.LIZ:(Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;JZZZLjava/lang/String;J)V
        //   336: return         
        //   337: aload_1        
        //   338: instanceof      Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestUserInfoFragment;
        //   341: ifeq            363
        //   344: aload_1        
        //   345: ldc_w           "null cannot be cast to non-null type com.bytedance.android.live.liveinteract.multilive.guset.fragment.MultiGuestUserInfoFragment"
        //   348: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //   351: pop            
        //   352: aload_1        
        //   353: checkcast       Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestUserInfoFragment;
        //   356: getfield        com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestUserInfoFragment.LJIIJ:Ljava/lang/String;
        //   359: astore_1       
        //   360: goto            303
        //   363: ldc             ""
        //   365: astore_1       
        //   366: goto            303
        //   369: aload_0        
        //   370: invokespecial   com/bytedance/android/livesdk/LiveDialogFragment.dismiss:()V
        //   373: goto            115
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
    
    public final void onViewCreated(final View view, final Bundle bundle) {
        public final class 26H extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiLiveGuestUserInfoDialog LIZ;
            
            static {
                Covode.recordClassIndex(9594);
            }
            
            public 26H(final MultiLiveGuestUserInfoDialog liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 26G extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiLiveGuestUserInfoDialog LIZ;
            
            static {
                Covode.recordClassIndex(9593);
            }
            
            public 26G(final MultiLiveGuestUserInfoDialog liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 26F extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiLiveGuestUserInfoDialog LIZ;
            
            static {
                Covode.recordClassIndex(9592);
            }
            
            public 26F(final MultiLiveGuestUserInfoDialog liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 26E extends F5g implements SRS<2P9, 2P9>
        {
            public final /* synthetic */ MultiLiveGuestUserInfoDialog LIZ;
            
            static {
                Covode.recordClassIndex(9591);
            }
            
            public 26E(final MultiLiveGuestUserInfoDialog liz) {
                this.LIZ = liz;
                super(1);
            }
        }
        public final class 0uw implements View$OnClickListener
        {
            public final /* synthetic */ MultiLiveGuestUserInfoDialog LIZ;
            
            static {
                Covode.recordClassIndex(9589);
            }
            
            public 0uw(final MultiLiveGuestUserInfoDialog liz) {
                this.LIZ = liz;
            }
            
            public final void onClick(final View view) {
                if (this.LIZ.LIZLLL()) {
                    return;
                }
                ((DialogFragment)this.LIZ).dismiss();
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
        //    11: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LJJ:()LX/FpL;
        //    14: fconst_0       
        //    15: putfield        X/FpL.LJFF:F
        //    18: aload_0        
        //    19: ldc_w           2131369039
        //    22: invokevirtual   com/bytedance/android/livesdk/LiveDialogFragment.LIZ:(I)Landroid/view/View;
        //    25: new             LX/0uw;
        //    28: dup            
        //    29: aload_0        
        //    30: invokespecial   X/0uw.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //    33: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    36: aload_0        
        //    37: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJ:()Landroidx/fragment/app/Fragment;
        //    40: astore_2       
        //    41: aload_0        
        //    42: aload_2        
        //    43: putfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LJ:Landroidx/fragment/app/Fragment;
        //    46: aload_2        
        //    47: instanceof      Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestUserInfoFragment;
        //    50: ifeq            68
        //    53: aload_2        
        //    54: checkcast       Lcom/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestUserInfoFragment;
        //    57: aload_0        
        //    58: getfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LIZJ:LX/0ra;
        //    61: aload_0        
        //    62: getfield        com/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog.LIZLLL:LX/1ZS;
        //    65: invokevirtual   com/bytedance/android/live/liveinteract/multilive/guset/fragment/MultiGuestUserInfoFragment.LIZ:(LX/0ra;LX/1ZS;)V
        //    68: aload_0        
        //    69: invokevirtual   androidx/fragment/app/Fragment.getChildFragmentManager:()LX/0AB;
        //    72: invokevirtual   X/0AB.LIZ:()LX/0AO;
        //    75: astore_1       
        //    76: aload_1        
        //    77: ldc             2131365523
        //    79: aload_2        
        //    80: invokevirtual   X/0AO.LIZ:(ILandroidx/fragment/app/Fragment;)LX/0AO;
        //    83: pop            
        //    84: aload_1        
        //    85: invokevirtual   X/0AO.LIZIZ:()I
        //    88: pop            
        //    89: aload_0        
        //    90: getfield        com/bytedance/android/livesdk/LiveDialogFragment.LJIL:Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //    93: astore_1       
        //    94: aload_1        
        //    95: ifnull          183
        //    98: aload_1        
        //    99: aload_0        
        //   100: ldc_w           LX/2Fm;.class
        //   103: new             LX/2HC;
        //   106: dup            
        //   107: aload_0        
        //   108: invokespecial   X/2HC.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //   111: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   114: pop            
        //   115: aload_1        
        //   116: aload_0        
        //   117: ldc_w           LX/2Fj;.class
        //   120: new             LX/26E;
        //   123: dup            
        //   124: aload_0        
        //   125: invokespecial   X/26E.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //   128: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   131: pop            
        //   132: aload_1        
        //   133: aload_0        
        //   134: ldc_w           LX/2Fw;.class
        //   137: new             LX/26F;
        //   140: dup            
        //   141: aload_0        
        //   142: invokespecial   X/26F.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //   145: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   148: pop            
        //   149: aload_1        
        //   150: aload_0        
        //   151: ldc_w           LX/2Fv;.class
        //   154: new             LX/26G;
        //   157: dup            
        //   158: aload_0        
        //   159: invokespecial   X/26G.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //   162: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   165: pop            
        //   166: aload_1        
        //   167: aload_0        
        //   168: ldc_w           LX/2Ft;.class
        //   171: new             LX/26H;
        //   174: dup            
        //   175: aload_0        
        //   176: invokespecial   X/26H.<init>:(Lcom/bytedance/android/live/liveinteract/multilive/guset/dialog/MultiLiveGuestUserInfoDialog;)V
        //   179: invokevirtual   com/bytedance/ies/sdk/datachannel/DataChannel.LIZ:(LX/0CH;Ljava/lang/Class;LX/SRS;)Lcom/bytedance/ies/sdk/datachannel/DataChannel;
        //   182: pop            
        //   183: return         
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
    
    public final void show(final 0AB 0ab, String ljjiizi) {
        CTM.LIZ((Object)0ab);
        while (true) {
            if (this.LJ().isAdded()) {
                break Label_0020;
            }
            try {
                super.show(0ab, ljjiizi);
                if (0sD.LIZJ.LIZ().LIZLLL() && 0jz.LIZJ().getLinkMicState() == 5 && !this.LIZLLL()) {
                    Object liz = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
                    final boolean b = liz instanceof 1Uo;
                    final 1Uo 1Uo = null;
                    if (!b) {
                        liz = null;
                    }
                    final 1Uo 1Uo2 = (1Uo)liz;
                    if (1Uo2 != null) {
                        final 0uW lizj = 0uW.LIZJ;
                        Object liz2 = 1jw.LIZ.LIZ("MULTI_GUEST_DATA_HOLDER");
                        if (!(liz2 instanceof 1Uo)) {
                            liz2 = 1Uo;
                        }
                        final 1Uo 1Uo3 = (1Uo)liz2;
                        String s = null;
                        Label_0132: {
                            if (1Uo3 != null) {
                                ljjiizi = 1Uo3.LJJIIZI;
                                if ((s = ljjiizi) != null) {
                                    break Label_0132;
                                }
                            }
                            s = "";
                        }
                        lizj.LIZ(s, "guest_icon", "", 1NO.LIZ().LIZJ, 1NO.LIZ().LIZIZ, 1Uo2.LIZ ^ true, 1Uo2.LIZIZ ^ true, 1Uo2.LIZLLL);
                    }
                }
            }
            catch (final Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(9585);
        }
        
        public final MultiLiveGuestUserInfoDialog LIZ(final DataChannel ljil, final 0qb.a liz, final WeakReference<1kK> liziz, final 0rb.a lizj, final 1ZS lizlll, final String ljii) {
            CTM.LIZ((Object)ljil, (Object)ljii);
            final MultiLiveGuestUserInfoDialog multiLiveGuestUserInfoDialog = new MultiLiveGuestUserInfoDialog((byte)0);
            multiLiveGuestUserInfoDialog.LJIL = ljil;
            multiLiveGuestUserInfoDialog.LIZ = liz;
            multiLiveGuestUserInfoDialog.LIZIZ = liziz;
            multiLiveGuestUserInfoDialog.LIZJ = lizj;
            multiLiveGuestUserInfoDialog.LIZLLL = lizlll;
            multiLiveGuestUserInfoDialog.LJII = ljii;
            return multiLiveGuestUserInfoDialog;
        }
    }
}
