// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.covode.number.Covode;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.app.Activity;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.host.IHostApp;

public final class 0iY
{
    public final IHostApp LIZ;
    public 1Mp LIZIZ;
    public LiveEffect LIZJ;
    public OgM LIZLLL;
    public final Activity LJ;
    public final View LJFF;
    public View LJI;
    public RecyclerView LJII;
    
    static {
        Covode.recordClassIndex(6750);
    }
    
    public 0iY(final Activity lj, final View ljff) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: aload_0        
        //     6: invokespecial   java/lang/Object.<init>:()V
        //     9: aload_0        
        //    10: aload_1        
        //    11: putfield        X/0iY.LJ:Landroid/app/Activity;
        //    14: aload_0        
        //    15: aload_2        
        //    16: putfield        X/0iY.LJFF:Landroid/view/View;
        //    19: ldc             Lcom/bytedance/android/livesdkapi/host/IHostApp;.class
        //    21: invokestatic    X/0jR.LIZ:(Ljava/lang/Class;)LX/0Vq;
        //    24: checkcast       Lcom/bytedance/android/livesdkapi/host/IHostApp;
        //    27: astore_3       
        //    28: aload_0        
        //    29: aload_3        
        //    30: putfield        X/0iY.LIZ:Lcom/bytedance/android/livesdkapi/host/IHostApp;
        //    33: aload_0        
        //    34: new             LX/1Mp;
        //    37: dup            
        //    38: invokespecial   X/1Mp.<init>:()V
        //    41: putfield        X/0iY.LIZIZ:LX/1Mp;
        //    44: aload_3        
        //    45: aload_1        
        //    46: new             LX/1My;
        //    49: dup            
        //    50: aload_0        
        //    51: invokespecial   X/1My.<init>:(LX/0iY;)V
        //    54: invokeinterface com/bytedance/android/livesdkapi/host/IHostApp.initGalleryModule:(Landroid/app/Activity;LX/OgN;)V
        //    59: aload_2        
        //    60: invokestatic    X/GTi.LIZ:(Landroid/view/View;)V
        //    63: aload_2        
        //    64: invokevirtual   android/view/View.getBackground:()Landroid/graphics/drawable/Drawable;
        //    67: astore_1       
        //    68: aload_1        
        //    69: ldc             ""
        //    71: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    74: aload_1        
        //    75: getstatic       com/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting.INSTANCE:Lcom/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting;
        //    78: invokevirtual   com/bytedance/android/livesdk/livesetting/broadcast/LiveEffectSecondLevelPanelConfigSetting.getValue:()LX/GOr;
        //    81: getfield        X/GOr.LIZ:F
        //    84: ldc             255.0
        //    86: fmul           
        //    87: f2i            
        //    88: invokevirtual   android/graphics/drawable/Drawable.setAlpha:(I)V
        //    91: aload_0        
        //    92: aload_2        
        //    93: ldc             2131371010
        //    95: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //    98: putfield        X/0iY.LJI:Landroid/view/View;
        //   101: aload_0        
        //   102: aload_2        
        //   103: ldc             2131367432
        //   105: invokevirtual   android/view/View.findViewById:(I)Landroid/view/View;
        //   108: checkcast       Landroidx/recyclerview/widget/RecyclerView;
        //   111: putfield        X/0iY.LJII:Landroidx/recyclerview/widget/RecyclerView;
        //   114: aload_0        
        //   115: getfield        X/0iY.LJI:Landroid/view/View;
        //   118: astore_1       
        //   119: aload_1        
        //   120: ifnull          135
        //   123: aload_1        
        //   124: new             LX/0iX;
        //   127: dup            
        //   128: aload_0        
        //   129: invokespecial   X/0iX.<init>:(LX/0iY;)V
        //   132: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //   135: aload_0        
        //   136: getfield        X/0iY.LJII:Landroidx/recyclerview/widget/RecyclerView;
        //   139: astore_1       
        //   140: aload_1        
        //   141: ifnull          149
        //   144: aload_1        
        //   145: aconst_null    
        //   146: invokevirtual   androidx/recyclerview/widget/RecyclerView.setItemAnimator:(LX/0EI;)V
        //   149: aload_0        
        //   150: getfield        X/0iY.LJII:Landroidx/recyclerview/widget/RecyclerView;
        //   153: astore_1       
        //   154: aload_1        
        //   155: ifnull          166
        //   158: aload_1        
        //   159: aload_0        
        //   160: getfield        X/0iY.LIZIZ:LX/1Mp;
        //   163: invokevirtual   androidx/recyclerview/widget/RecyclerView.setAdapter:(LX/0EA;)V
        //   166: aload_0        
        //   167: getfield        X/0iY.LJII:Landroidx/recyclerview/widget/RecyclerView;
        //   170: astore_1       
        //   171: aload_1        
        //   172: ifnull          188
        //   175: aload_1        
        //   176: new             Landroidx/recyclerview/widget/LinearLayoutManager;
        //   179: dup            
        //   180: iconst_0       
        //   181: iconst_0       
        //   182: invokespecial   androidx/recyclerview/widget/LinearLayoutManager.<init>:(IZ)V
        //   185: invokevirtual   androidx/recyclerview/widget/RecyclerView.setLayoutManager:(LX/0EM;)V
        //   188: return         
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
    
    public final void LIZ(final LiveEffect lizj) {
        public final class 1Mz implements I6J
        {
            public final /* synthetic */ 0iY LIZ;
            public final /* synthetic */ LiveEffect LIZIZ;
            
            static {
                Covode.recordClassIndex(6753);
            }
            
            public 1Mz(final 0iY liz, final LiveEffect liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void LIZ(final String s, final String... array) {
            }
            
            public final void LIZ(final String... array) {
                CTM.LIZ((Object)array);
                if (!GTi.LIZLLL(this.LIZ.LJFF)) {
                    this.LIZ.LIZ.scanPhotoList();
                }
                GTi.LIZIZ(this.LIZ.LJFF);
                final 1Mp liziz = this.LIZ.LIZIZ;
                liziz.LIZJ = this.LIZIZ;
                ((RecyclerView.a)liziz).notifyDataSetChanged();
            }
            
            public final void LIZIZ(final String... array) {
                CTM.LIZ((Object)array);
                Hf4.LIZ(0cB.LJ(), 2131829595);
            }
            
            public final void LIZJ(final String... array) {
            }
            
            public final void LIZLLL(final String... array) {
            }
            
            public final void LJ(final String... array) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_1        
        //     2: putfield        X/0iY.LIZJ:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;
        //     5: aload_1        
        //     6: ifnull          25
        //     9: aload_1        
        //    10: getfield        com/bytedance/android/livesdkapi/depend/model/LiveEffect.sdkExtraModel:LX/GbB;
        //    13: astore_2       
        //    14: aload_2        
        //    15: ifnull          25
        //    18: aload_2        
        //    19: getfield        X/GbB.LIZ:Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect$PlDataBean;
        //    22: ifnonnull       33
        //    25: aload_0        
        //    26: getfield        X/0iY.LJFF:Landroid/view/View;
        //    29: invokestatic    X/GTi.LIZ:(Landroid/view/View;)V
        //    32: return         
        //    33: aload_0        
        //    34: getfield        X/0iY.LJ:Landroid/app/Activity;
        //    37: invokestatic    X/I6E.LIZ:(Landroid/app/Activity;)LX/Gm3;
        //    40: new             LX/1Mz;
        //    43: dup            
        //    44: aload_0        
        //    45: aload_1        
        //    46: invokespecial   X/1Mz.<init>:(LX/0iY;Lcom/bytedance/android/livesdkapi/depend/model/LiveEffect;)V
        //    49: iconst_1       
        //    50: anewarray       Ljava/lang/String;
        //    53: dup            
        //    54: iconst_0       
        //    55: ldc             "android.permission.READ_EXTERNAL_STORAGE"
        //    57: aastore        
        //    58: invokevirtual   X/Gm3.LIZ:(LX/I6J;[Ljava/lang/String;)V
        //    61: return         
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
}
