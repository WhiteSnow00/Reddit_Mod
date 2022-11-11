// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Shader;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.graphics.RectF;
import android.widget.FrameLayout;

public final class 0oE extends FrameLayout
{
    public final 5DO LIZ;
    public final int[] LIZIZ;
    public final float[] LIZJ;
    public final RectF LIZLLL;
    
    static {
        Covode.recordClassIndex(7979);
    }
    
    public 0oE(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 0oE(final Context context, final AttributeSet set, final char c) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: iconst_0       
        //     8: invokespecial   android/widget/FrameLayout.<init>:(Landroid/content/Context;Landroid/util/AttributeSet;I)V
        //    11: sipush          12302
        //    14: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    17: aload_0        
        //    18: iconst_0       
        //    19: invokevirtual   X/0oE.setWillNotDraw:(Z)V
        //    22: aload_0        
        //    23: getstatic       X/1xf.LIZ:LX/1xf;
        //    26: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    29: putfield        X/0oE.LIZ:LX/5DO;
        //    32: aload_0        
        //    33: iconst_5       
        //    34: newarray        I
        //    36: dup            
        //    37: iconst_0       
        //    38: ldc             "#00000000"
        //    40: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //    43: iastore        
        //    44: dup            
        //    45: iconst_1       
        //    46: ldc             "#4D000000"
        //    48: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //    51: iastore        
        //    52: dup            
        //    53: iconst_2       
        //    54: ldc             "#66000000"
        //    56: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //    59: iastore        
        //    60: dup            
        //    61: iconst_3       
        //    62: ldc             "#4D000000"
        //    64: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //    67: iastore        
        //    68: dup            
        //    69: iconst_4       
        //    70: ldc             "#00000000"
        //    72: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //    75: iastore        
        //    76: putfield        X/0oE.LIZIZ:[I
        //    79: aload_0        
        //    80: iconst_5       
        //    81: newarray        F
        //    83: dup            
        //    84: iconst_0       
        //    85: fconst_0       
        //    86: fastore        
        //    87: dup            
        //    88: iconst_1       
        //    89: ldc             0.08
        //    91: fastore        
        //    92: dup            
        //    93: iconst_2       
        //    94: ldc             0.53
        //    96: fastore        
        //    97: dup            
        //    98: iconst_3       
        //    99: ldc             0.92
        //   101: fastore        
        //   102: dup            
        //   103: iconst_4       
        //   104: fconst_1       
        //   105: fastore        
        //   106: putfield        X/0oE.LIZJ:[F
        //   109: aload_0        
        //   110: new             Landroid/graphics/RectF;
        //   113: dup            
        //   114: invokespecial   android/graphics/RectF.<init>:()V
        //   117: putfield        X/0oE.LIZLLL:Landroid/graphics/RectF;
        //   120: sipush          12302
        //   123: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   126: return         
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:419)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.convertType(AstBuilder.java:207)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:645)
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
    
    private final Paint getPaint() {
        return (Paint)this.LIZ.getValue();
    }
    
    public final void onDraw(final Canvas canvas) {
        MethodCollector.i(12273);
        if (canvas != null) {
            canvas.drawRect(this.LIZLLL, this.getPaint());
        }
        super.onDraw(canvas);
        MethodCollector.o(12273);
    }
    
    public final void onSizeChanged(final int n, final int n2, final int n3, final int n4) {
        super.onSizeChanged(n, n2, n3, n4);
        this.LIZLLL.set(0.0f, 0.0f, (float)n, (float)n2);
        this.getPaint().setShader((Shader)new LinearGradient(0.0f, 0.0f, this.LIZLLL.width(), 0.0f, this.LIZIZ, this.LIZJ, Shader$TileMode.CLAMP));
    }
}
