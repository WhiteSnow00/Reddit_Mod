// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.n;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.Matrix;
import android.widget.Scroller;
import com.bytedance.covode.number.Covode;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

public final class 0sz extends Drawable
{
    public final boolean[] LIZ;
    public final Paint LIZIZ;
    public Bitmap LIZJ;
    public final 5DO LIZLLL;
    public final 5DO LJ;
    public float[] LJFF;
    public final 5DO LJI;
    public final 5DO LJII;
    public final 5DO LJIIIIZZ;
    public final 5DO LJIIIZ;
    
    static {
        Covode.recordClassIndex(9060);
    }
    
    public 0sz() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   android/graphics/drawable/Drawable.<init>:()V
        //     4: aload_0        
        //     5: new             Landroid/graphics/Paint;
        //     8: dup            
        //     9: bipush          6
        //    11: invokespecial   android/graphics/Paint.<init>:(I)V
        //    14: putfield        X/0sz.LIZIZ:Landroid/graphics/Paint;
        //    17: aload_0        
        //    18: iconst_4       
        //    19: newarray        Z
        //    21: putfield        X/0sz.LIZ:[Z
        //    24: aload_0        
        //    25: getstatic       X/22s.LIZ:LX/22s;
        //    28: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    31: putfield        X/0sz.LIZLLL:LX/5DO;
        //    34: aload_0        
        //    35: getstatic       X/22q.LIZ:LX/22q;
        //    38: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    41: putfield        X/0sz.LJ:LX/5DO;
        //    44: aload_0        
        //    45: getstatic       X/22p.LIZ:LX/22p;
        //    48: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    51: putfield        X/0sz.LJI:LX/5DO;
        //    54: aload_0        
        //    55: getstatic       X/22r.LIZ:LX/22r;
        //    58: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    61: putfield        X/0sz.LJII:LX/5DO;
        //    64: aload_0        
        //    65: getstatic       X/22t.LIZ:LX/22t;
        //    68: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    71: putfield        X/0sz.LJIIIIZZ:LX/5DO;
        //    74: aload_0        
        //    75: getstatic       X/22o.LIZ:LX/22o;
        //    78: invokestatic    X/3Os.LIZ:(LX/QgG;)LX/5DO;
        //    81: putfield        X/0sz.LJIIIZ:LX/5DO;
        //    84: return         
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
    
    private final Scroller LJFF() {
        return (Scroller)this.LIZLLL.getValue();
    }
    
    private final Matrix LJI() {
        return (Matrix)this.LJ.getValue();
    }
    
    public final GradientDrawable LIZ() {
        return (GradientDrawable)this.LJI.getValue();
    }
    
    public final GradientDrawable LIZIZ() {
        return (GradientDrawable)this.LJII.getValue();
    }
    
    public final BitmapDrawable LIZJ() {
        return (BitmapDrawable)this.LJIIIIZZ.getValue();
    }
    
    public final GradientDrawable LIZLLL() {
        return (GradientDrawable)this.LJIIIZ.getValue();
    }
    
    public final void LJ() {
        int n = 0;
        do {
            this.LIZ[n] = false;
        } while (++n < 4);
        this.invalidateSelf();
    }
    
    public final void draw(final Canvas canvas) {
        CTM.LIZ((Object)canvas);
        if (this.LIZJ != null && this.LJFF != null && this.LJFF().computeScrollOffset()) {
            final float n = this.LJFF().getCurrX() / 100.0f;
            final 8si liz = 8sj.LIZ((Object)(n > 0.0f), (Object)Math.abs(n));
            final boolean booleanValue = (boolean)liz.getFirst();
            float floatValue = ((Number)liz.getSecond()).floatValue();
            this.LJI().reset();
            final float[] ljff = this.LJFF;
            if (ljff == null) {
                kotlin.jvm.internal.n.LIZIZ();
            }
            final float n2 = ljff[0];
            final float[] ljff2 = this.LJFF;
            if (ljff2 == null) {
                kotlin.jvm.internal.n.LIZIZ();
            }
            final float n3 = ljff2[1];
            8si 8si;
            if (booleanValue) {
                8si = 8sj.LIZ((Object)(1.0f - n2 * floatValue), (Object)(1.0f - n3 * floatValue));
            }
            else {
                8si = 8sj.LIZ((Object)(1.0f - n2 + n2 * floatValue), (Object)(1.0f - n3 + n3 * floatValue));
            }
            this.LJI().postScale(((Number)8si.getFirst()).floatValue(), ((Number)8si.getSecond()).floatValue());
            if (!booleanValue) {
                floatValue = 1.0f - floatValue;
            }
            final Matrix lji = this.LJI();
            final float[] ljff3 = this.LJFF;
            if (ljff3 == null) {
                kotlin.jvm.internal.n.LIZIZ();
            }
            final float n4 = ljff3[2];
            final float[] ljff4 = this.LJFF;
            if (ljff4 == null) {
                kotlin.jvm.internal.n.LIZIZ();
            }
            lji.postTranslate(n4 * floatValue, ljff4[3] * floatValue);
            final Bitmap lizj = this.LIZJ;
            if (lizj == null) {
                kotlin.jvm.internal.n.LIZIZ();
            }
            canvas.drawBitmap(lizj, this.LJI(), this.LIZIZ);
            this.invalidateSelf();
        }
        else {
            if (this.LIZ[0]) {
                this.LIZ().draw(canvas);
            }
            if (this.LIZ[1]) {
                this.LIZJ().draw(canvas);
            }
            if (this.LIZ[2]) {
                this.LIZIZ().draw(canvas);
            }
            if (this.LIZ[3]) {
                this.LIZLLL().draw(canvas);
            }
        }
    }
    
    public final int getOpacity() {
        return -3;
    }
    
    public final void setAlpha(final int alpha) {
        if (this.LIZIZ.getAlpha() != alpha) {
            this.LIZIZ.setAlpha(alpha);
            this.invalidateSelf();
        }
    }
    
    public final void setColorFilter(final ColorFilter colorFilter) {
        if (n.LIZ((Object)this.LIZIZ.getColorFilter(), (Object)colorFilter) ^ true) {
            this.LIZIZ.setColorFilter(colorFilter);
            this.invalidateSelf();
        }
    }
}
