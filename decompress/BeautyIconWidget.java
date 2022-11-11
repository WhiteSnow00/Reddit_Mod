// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.effect.widget;

import X.0CC;
import X.0CH;
import android.view.View$OnClickListener;
import X.0cB;
import kotlin.jvm.internal.n;
import X.CTM;
import com.bytedance.covode.number.Covode;
import X.2P9;
import X.SRS;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import X.6mZ;
import com.bytedance.ies.sdk.widgets.LiveWidget;

public final class BeautyIconWidget extends LiveWidget implements 6mZ
{
    public TextView LIZ;
    public ImageView LIZIZ;
    public View LIZJ;
    public int LIZLLL;
    public int LJ;
    public boolean LJFF;
    public final SRS<View, 2P9> LJI;
    
    static {
        Covode.recordClassIndex(6790);
    }
    
    public BeautyIconWidget(final SRS<? super View, 2P9> lji) {
        CTM.LIZ((Object)lji);
        this.LJI = (SRS<View, 2P9>)lji;
    }
    
    public final void LIZ() {
        final View lizj = this.LIZJ;
        if (lizj == null) {
            n.LIZ("");
        }
        lizj.setBackgroundResource(2131233913);
        final TextView liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        liz.setTextColor(0cB.LIZIZ(2131100564));
    }
    
    public final void LIZ(final int lizlll, final int lj, final boolean ljff) {
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    public final void LIZIZ() {
        final View lizj = this.LIZJ;
        if (lizj == null) {
            n.LIZ("");
        }
        lizj.setBackgroundResource(2131233914);
        final TextView liz = this.LIZ;
        if (liz == null) {
            n.LIZ("");
        }
        liz.setTextColor(0cB.LIZIZ(2131100708));
    }
    
    public final int getLayoutId() {
        return 2131561753;
    }
    
    public final void onCreate() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   com/bytedance/ies/sdk/widgets/LiveWidget.onCreate:()V
        //     4: aload_0        
        //     5: invokevirtual   com/bytedance/android/widget/Widget.getView:()Landroid/view/View;
        //     8: astore_1       
        //     9: aload_1        
        //    10: ifnull          41
        //    13: aload_0        
        //    14: getfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LJI:LX/SRS;
        //    17: astore_2       
        //    18: aload_2        
        //    19: astore_3       
        //    20: aload_2        
        //    21: ifnull          33
        //    24: new             LX/0in;
        //    27: dup            
        //    28: aload_2        
        //    29: invokespecial   X/0in.<init>:(LX/SRS;)V
        //    32: astore_3       
        //    33: aload_1        
        //    34: aload_3        
        //    35: checkcast       Landroid/view/View$OnClickListener;
        //    38: invokevirtual   android/view/View.setOnClickListener:(Landroid/view/View$OnClickListener;)V
        //    41: aload_0        
        //    42: ldc             2131366162
        //    44: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //    47: astore_3       
        //    48: aload_3        
        //    49: ldc             ""
        //    51: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    54: aload_0        
        //    55: aload_3        
        //    56: checkcast       Landroid/widget/TextView;
        //    59: putfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LIZ:Landroid/widget/TextView;
        //    62: aload_0        
        //    63: ldc             2131366182
        //    65: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //    68: astore_3       
        //    69: aload_3        
        //    70: ldc             ""
        //    72: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    75: aload_0        
        //    76: aload_3        
        //    77: checkcast       Landroid/widget/ImageView;
        //    80: putfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LIZIZ:Landroid/widget/ImageView;
        //    83: aload_0        
        //    84: ldc             2131362661
        //    86: invokevirtual   com/bytedance/ies/sdk/widgets/LiveWidget.findViewById:(I)Landroid/view/View;
        //    89: astore_3       
        //    90: aload_3        
        //    91: ldc             ""
        //    93: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    96: aload_0        
        //    97: aload_3        
        //    98: putfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LIZJ:Landroid/view/View;
        //   101: aload_0        
        //   102: getfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LIZ:Landroid/widget/TextView;
        //   105: astore_3       
        //   106: aload_3        
        //   107: ifnonnull       115
        //   110: ldc             ""
        //   112: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   115: aload_3        
        //   116: aload_0        
        //   117: getfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LJ:I
        //   120: invokevirtual   android/widget/TextView.setText:(I)V
        //   123: aload_0        
        //   124: getfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LIZIZ:Landroid/widget/ImageView;
        //   127: astore_3       
        //   128: aload_3        
        //   129: ifnonnull       137
        //   132: ldc             ""
        //   134: invokestatic    kotlin/jvm/internal/n.LIZ:(Ljava/lang/String;)V
        //   137: aload_3        
        //   138: aload_0        
        //   139: getfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LIZLLL:I
        //   142: invokevirtual   android/widget/ImageView.setImageResource:(I)V
        //   145: aload_0        
        //   146: getfield        com/bytedance/android/live/effect/widget/BeautyIconWidget.LJFF:Z
        //   149: ifeq            157
        //   152: aload_0        
        //   153: invokevirtual   com/bytedance/android/live/effect/widget/BeautyIconWidget.LIZ:()V
        //   156: return         
        //   157: aload_0        
        //   158: invokevirtual   com/bytedance/android/live/effect/widget/BeautyIconWidget.LIZIZ:()V
        //   161: return         
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
    
    public final void onStateChanged(final 0CH 0ch, final 0CC.a a) {
        super.onStateChanged(0ch, a);
    }
}
