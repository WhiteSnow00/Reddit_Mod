// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.Paint$FontMetricsInt;
import android.graphics.Paint;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public class 1mq extends 1eO
{
    public int LIZ;
    public a LIZIZ;
    public a LIZJ;
    public float LIZLLL;
    public final int LJ;
    public String LJFF;
    public final 5DO LJI;
    public final 5DO LJII;
    public final 5DO LJJ;
    
    static {
        Covode.recordClassIndex(10582);
    }
    
    public 1mq(final Context context, final Bitmap bitmap, final int lj, final String ljff, final int n, final 1eJ 1eJ) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;)V
        //     4: aload_0        
        //     5: aload_1        
        //     6: aload_2        
        //     7: aconst_null    
        //     8: aload           4
        //    10: iload           5
        //    12: iconst_0       
        //    13: aload           6
        //    15: invokespecial   X/1eO.<init>:(Landroid/content/Context;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Ljava/lang/String;IILX/1eJ;)V
        //    18: aload_0        
        //    19: iload_3        
        //    20: putfield        X/1mq.LJ:I
        //    23: aload_0        
        //    24: aload           4
        //    26: putfield        X/1mq.LJFF:Ljava/lang/String;
        //    29: aload_0        
        //    30: sipush          255
        //    33: putfield        X/1mq.LIZ:I
        //    36: aload_0        
        //    37: new             LX/2A6;
        //    40: dup            
        //    41: aload_0        
        //    42: invokespecial   X/2A6.<init>:(LX/1mq;)V
        //    45: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    48: putfield        X/1mq.LJI:LX/5DO;
        //    51: aload_0        
        //    52: new             LX/2A8;
        //    55: dup            
        //    56: aload_0        
        //    57: invokespecial   X/2A8.<init>:(LX/1mq;)V
        //    60: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    63: putfield        X/1mq.LJII:LX/5DO;
        //    66: aload_0        
        //    67: new             LX/2A7;
        //    70: dup            
        //    71: aload_0        
        //    72: invokespecial   X/2A7.<init>:(LX/1mq;)V
        //    75: invokestatic    X/H30.LIZ:(LX/QgG;)LX/5DO;
        //    78: putfield        X/1mq.LJJ:LX/5DO;
        //    81: return         
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
    
    private ValueAnimator LJI() {
        return (ValueAnimator)this.LJII.getValue();
    }
    
    private ValueAnimator LJII() {
        return (ValueAnimator)this.LJJ.getValue();
    }
    
    @Override
    public final int LIZ(final Paint paint, final Paint$FontMetricsInt paint$FontMetricsInt) {
        CTM.LIZ((Object)paint);
        if (paint$FontMetricsInt != null) {
            final Paint$FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            final int n = fontMetricsInt.bottom - fontMetricsInt.top;
            final int ljiiiz = super.LJIIIZ;
            if (ljiiiz > n) {
                final int n2 = ljiiiz / 2;
                final int n3 = n / 4;
                final int n4 = n2 - n3;
                final int n5 = -(n2 + n3);
                paint$FontMetricsInt.ascent = n5;
                paint$FontMetricsInt.top = n5;
                paint$FontMetricsInt.bottom = n4;
                paint$FontMetricsInt.descent = n4;
            }
        }
        if (super.LJIIIIZZ < 0) {
            super.LJIIIIZZ = this.LIZ(paint);
        }
        return super.LJIIIIZZ;
    }
    
    public final ValueAnimator LIZ() {
        return (ValueAnimator)this.LJI.getValue();
    }
    
    @Override
    public void LIZ(final Canvas canvas, final Paint paint) {
        CTM.LIZ((Object)canvas, (Object)paint);
        final int liz = this.LIZ;
        int n;
        if (liz >= 0 && 255 >= liz) {
            canvas.saveLayerAlpha(0.0f, 0.0f, (float)super.LJIIIIZZ, (float)super.LJIIIZ, this.LIZ, 31);
            n = 1;
        }
        else {
            n = 0;
        }
        super.LIZ(canvas, paint);
        if (n != 0) {
            canvas.restore();
        }
    }
    
    @Override
    public final void LIZ(final Canvas canvas, final RectF rectF) {
        CTM.LIZ((Object)canvas, (Object)rectF);
        super.LIZ(canvas, rectF);
        canvas.save();
        canvas.rotate(this.LIZLLL, rectF.left + rectF.width() / 2.0f, rectF.top + rectF.height() / 2.0f);
    }
    
    @Override
    public final int LIZIZ() {
        final int lj = this.LJ;
        if (lj != 0) {
            return lj;
        }
        return super.LIZIZ();
    }
    
    @Override
    public final void LIZIZ(final Canvas canvas, final RectF rectF) {
        CTM.LIZ((Object)canvas, (Object)rectF);
        super.LIZIZ(canvas, rectF);
        canvas.restore();
    }
    
    public final void LIZJ() {
        this.LIZ = 0;
        this.LJI().start();
    }
    
    public final void LIZLLL() {
        this.LJII().start();
    }
    
    public void LJ() {
        this.LIZ().cancel();
        this.LJI().cancel();
        this.LJII().cancel();
    }
    
    @Override
    public final String LJFF() {
        return this.LJFF;
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(10583);
        }
        
        void LIZ();
    }
}
