// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 2A9 extends 1mq
{
    public 1mq LJI;
    public 1mq LJII;
    
    static {
        Covode.recordClassIndex(10592);
    }
    
    public 2A9(final Context context, final Bitmap bitmap, final int n, final String s, final int n2, final 1eJ 1eJ) {
        CTM.LIZ((Object)context);
        super(context, bitmap, n, s, n2, 1eJ);
    }
    
    @Override
    public final int LIZ(final Paint paint) {
        CTM.LIZ((Object)paint);
        final 1mq lji = this.LJI;
        int liziz;
        if (lji != null) {
            liziz = lji.LIZIZ(paint);
        }
        else {
            liziz = 0;
        }
        final 1mq ljii = this.LJII;
        if (ljii != null) {
            ljii.LIZIZ(paint);
        }
        return liziz;
    }
    
    public final void LIZ(final a a) {
        public final class 1eA implements a
        {
            public final /* synthetic */ 2A9 LIZ;
            public final /* synthetic */ a LIZIZ;
            
            static {
                Covode.recordClassIndex(10593);
            }
            
            public 1eA(final 2A9 liz, final a liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            @Override
            public final void LIZ() {
                final 2A9 liz = this.LIZ;
                final 1mq ljii = liz.LJII;
                int ljiiiizz;
                if (ljii != null) {
                    ljiiiizz = ljii.LJIIIIZZ;
                }
                else {
                    ljiiiizz = -1;
                }
                liz.LJIIIIZZ = ljiiiizz;
                final 1mq ljii2 = this.LIZ.LJII;
                if (ljii2 != null) {
                    ljii2.LIZJ();
                }
                final a liziz = this.LIZIZ;
                if (liziz != null) {
                    liziz.LIZ();
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/2A9.LJI:LX/1mq;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ifnull          13
        //     9: aload_2        
        //    10: invokevirtual   X/1mq.LIZLLL:()V
        //    13: aload_0        
        //    14: getfield        X/2A9.LJI:LX/1mq;
        //    17: astore_2       
        //    18: aload_2        
        //    19: ifnull          35
        //    22: aload_2        
        //    23: new             LX/1eA;
        //    26: dup            
        //    27: aload_0        
        //    28: aload_1        
        //    29: invokespecial   X/1eA.<init>:(LX/2A9;LX/0zb;)V
        //    32: putfield        X/1mq.LIZJ:LX/0zb;
        //    35: return         
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
    
    @Override
    public final void LIZ(final Canvas canvas, final Paint paint) {
        CTM.LIZ((Object)canvas, (Object)paint);
        final 1mq lji = this.LJI;
        if (lji != null && lji.LIZ > 0) {
            final 1mq lji2 = this.LJI;
            if (lji2 != null) {
                lji2.LIZIZ(canvas, paint);
            }
        }
        final 1mq ljii = this.LJII;
        if (ljii != null && ljii.LIZ > 0) {
            final 1mq ljii2 = this.LJII;
            if (ljii2 != null) {
                ljii2.LIZIZ(canvas, paint);
            }
        }
    }
    
    @Override
    public final void LJ() {
        final 1mq lji = this.LJI;
        if (lji != null) {
            lji.LJ();
        }
        final 1mq ljii = this.LJII;
        if (ljii != null) {
            ljii.LJ();
        }
    }
}
