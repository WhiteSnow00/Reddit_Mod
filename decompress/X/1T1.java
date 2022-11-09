// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Objects;
import android.view.LayoutInflater;
import android.widget.CompoundButton;
import android.widget.CompoundButton$OnCheckedChangeListener;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 1T1 implements 0e0
{
    public final SRS<Boolean, 2P9> LIZ;
    
    static {
        Covode.recordClassIndex(8295);
    }
    
    public 1T1(final SRS<? super Boolean, 2P9> liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = (SRS<Boolean, 2P9>)liz;
    }
    
    @Override
    public final View LIZ(final Context context, final ViewGroup viewGroup) {
        public final class 0q2 implements CompoundButton$OnCheckedChangeListener
        {
            public final /* synthetic */ 1T1 LIZ;
            
            static {
                Covode.recordClassIndex(8296);
            }
            
            public 0q2(final 1T1 liz) {
                this.LIZ = liz;
            }
            
            public final void onCheckedChanged(final CompoundButton compoundButton, final boolean b) {
                this.LIZ.LIZ.invoke((Object)b);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    android/view/LayoutInflater.from:(Landroid/content/Context;)Landroid/view/LayoutInflater;
        //     4: ldc             2131561779
        //     6: aload_2        
        //     7: iconst_0       
        //     8: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ldc             "null cannot be cast to non-null type com.bytedance.android.live.design.widget.LiveCheckBox"
        //    15: invokestatic    java/util/Objects.requireNonNull:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        //    18: pop            
        //    19: aload_1        
        //    20: checkcast       LX/1J6;
        //    23: astore_1       
        //    24: aload_1        
        //    25: new             LX/0q2;
        //    28: dup            
        //    29: aload_0        
        //    30: invokespecial   X/0q2.<init>:(LX/1T1;)V
        //    33: invokevirtual   X/1J6.setOnCheckedChangeListener:(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V
        //    36: aload_0        
        //    37: getfield        X/1T1.LIZ:LX/SRS;
        //    40: aload_1        
        //    41: invokevirtual   X/1J6.isChecked:()Z
        //    44: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    47: invokeinterface X/SRS.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //    52: pop            
        //    53: aload_1        
        //    54: areturn        
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
