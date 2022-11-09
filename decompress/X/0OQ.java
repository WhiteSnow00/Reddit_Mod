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

public final class 0oq extends FrameLayout
{
    public final 5DO LIZ;
    public final RectF LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public boolean LJ;
    public int LJFF;
    public int LJI;
    
    static {
        Covode.recordClassIndex(8040);
    }
    
    public 0oq(final Context context, final AttributeSet set) {
        this(context, set, (byte)0);
    }
    
    public 0oq(final Context context, final AttributeSet set, final char c) {
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
        //    11: sipush          10902
        //    14: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.i:(I)V
        //    17: aload_0        
        //    18: getstatic       X/1y0.LIZ:LX/1y0;
        //    21: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    24: putfield        X/0oq.LIZ:LX/5DO;
        //    27: aload_0        
        //    28: new             Landroid/graphics/RectF;
        //    31: dup            
        //    32: invokespecial   android/graphics/RectF.<init>:()V
        //    35: putfield        X/0oq.LIZIZ:Landroid/graphics/RectF;
        //    38: aload_0        
        //    39: iconst_1       
        //    40: putfield        X/0oq.LJ:Z
        //    43: aload_0        
        //    44: ldc             "#4CFF6482"
        //    46: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //    49: putfield        X/0oq.LJFF:I
        //    52: aload_0        
        //    53: ldc             "#4CE43CFF"
        //    55: invokestatic    android/graphics/Color.parseColor:(Ljava/lang/String;)I
        //    58: putfield        X/0oq.LJI:I
        //    61: aload_0        
        //    62: iconst_0       
        //    63: invokevirtual   X/0oq.setWillNotDraw:(Z)V
        //    66: aload_1        
        //    67: aload_2        
        //    68: iconst_3       
        //    69: newarray        I
        //    71: dup            
        //    72: iconst_0       
        //    73: ldc             2130969514
        //    75: iastore        
        //    76: dup            
        //    77: iconst_1       
        //    78: ldc             2130970787
        //    80: iastore        
        //    81: dup            
        //    82: iconst_2       
        //    83: ldc             2130971095
        //    85: iastore        
        //    86: invokevirtual   android/content/Context.obtainStyledAttributes:(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
        //    89: astore_1       
        //    90: aload_1        
        //    91: ldc             ""
        //    93: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //    96: aload_0        
        //    97: aload_1        
        //    98: iconst_2       
        //    99: aload_0        
        //   100: getfield        X/0oq.LJFF:I
        //   103: invokevirtual   android/content/res/TypedArray.getColor:(II)I
        //   106: putfield        X/0oq.LJFF:I
        //   109: aload_0        
        //   110: aload_1        
        //   111: iconst_0       
        //   112: aload_0        
        //   113: getfield        X/0oq.LJI:I
        //   116: invokevirtual   android/content/res/TypedArray.getColor:(II)I
        //   119: putfield        X/0oq.LJI:I
        //   122: aload_1        
        //   123: iconst_1       
        //   124: ldc             13.0
        //   126: invokevirtual   android/content/res/TypedArray.getDimension:(IF)F
        //   129: fstore          4
        //   131: aload_0        
        //   132: fload           4
        //   134: putfield        X/0oq.LIZLLL:F
        //   137: aload_0        
        //   138: fload           4
        //   140: putfield        X/0oq.LIZJ:F
        //   143: aload_1        
        //   144: invokevirtual   android/content/res/TypedArray.recycle:()V
        //   147: sipush          10902
        //   150: invokestatic    com/bytedance/frameworks/apm/trace/MethodCollector.o:(I)V
        //   153: return         
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
    
    public final void LIZ() {
        this.LIZIZ.set(0.0f, 0.0f, (float)this.getWidth(), (float)this.getHeight());
        this.LIZJ = this.LIZLLL;
        this.LJ = true;
    }
    
    public final void LIZ(float n) {
        if (this.LJ) {
            final float width = this.LIZIZ.width();
            final RectF liziz = this.LIZIZ;
            final float left = liziz.left;
            n = width * (1.0f - n) / 2.0f;
            liziz.left = left + n;
            final RectF liziz2 = this.LIZIZ;
            liziz2.right -= n;
            if (this.LIZIZ.width() <= this.LIZIZ.height()) {
                this.LIZJ = this.LIZIZ.width();
                final RectF liziz3 = this.LIZIZ;
                liziz3.bottom = liziz3.top + this.LIZJ;
                this.LJ = false;
            }
        }
        this.invalidate();
    }
    
    public final void onDraw(final Canvas canvas) {
        if (canvas != null) {
            final RectF liziz = this.LIZIZ;
            final float lizj = this.LIZJ;
            canvas.drawRoundRect(liziz, lizj, lizj, this.getPaint());
        }
    }
    
    public final void onSizeChanged(int lji, final int n, int ljff, final int n2) {
        super.onSizeChanged(lji, n, ljff, n2);
        final float n3 = (float)lji;
        ljff = this.LJFF;
        lji = this.LJI;
        this.getPaint().setShader((Shader)new LinearGradient(0.0f, 0.0f, n3, 0.0f, new int[] { ljff, lji }, (float[])null, Shader$TileMode.CLAMP));
        this.LIZIZ.set(0.0f, 0.0f, n3, (float)n);
    }
}
