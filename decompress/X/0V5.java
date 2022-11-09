// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.covode.number.Covode;
import android.graphics.Bitmap;

public final class 0V5 implements Runnable
{
    public final /* synthetic */ 1E7 LIZ;
    public final /* synthetic */ Bitmap LIZIZ;
    public final /* synthetic */ 0V6 LIZJ;
    
    static {
        Covode.recordClassIndex(4769);
    }
    
    public 0V5(final 0V6 lizj, final 1E7 liz, final Bitmap liziz) {
        this.LIZJ = lizj;
        this.LIZ = liz;
        this.LIZIZ = liziz;
    }
    
    @Override
    public final void run() {
        public final class 1Em implements 0Tu
        {
            public final /* synthetic */ 0V5 LIZ;
            
            static {
                Covode.recordClassIndex(4770);
            }
            
            public 1Em(final 0V5 liz) {
                this.LIZ = liz;
            }
            
            @Override
            public final void LIZ(final boolean b, final String s, final 1EA 1ea) {
                MethodCollector.i(267);
                while (true) {
                    if (!b) {
                        Label_0321: {
                            try {
                                this.LIZ.LIZJ.LIZ(0, 107, s, 1ea);
                                MethodCollector.o(267);
                                return;
                            Block_11_Outer:
                                while (true) {
                                Block_9_Outer:
                                    while (true) {
                                        while (true) {
                                            final int lizj;
                                            while (true) {
                                                final Bitmap bitmap;
                                                Label_0135: {
                                                    final Bitmap liziz;
                                                    Block_8: {
                                                        Label_0163: {
                                                            Block_12: {
                                                                while (true) {
                                                                    liziz.getWidth();
                                                                    liziz.getHeight();
                                                                    break Label_0135;
                                                                    Label_0276: {
                                                                        final int n;
                                                                        iftrue(Label_0296:)(n >= 0);
                                                                    }
                                                                    break Block_12;
                                                                    final int lizlll;
                                                                    Label_0236:
                                                                    iftrue(Label_0256:)(lizlll >= 0);
                                                                    continue Block_11_Outer;
                                                                }
                                                                1ea.LJIILIIL = 0UP.LIZ(1ea.LJIILIIL, 180.0f);
                                                                break Label_0163;
                                                            }
                                                            liziz.getWidth();
                                                            liziz.getHeight();
                                                            break Label_0135;
                                                            liziz.getWidth();
                                                            liziz.getHeight();
                                                            break Label_0135;
                                                            liziz.getWidth();
                                                            liziz.getHeight();
                                                            break Label_0135;
                                                            Label_0188: {
                                                                final int n;
                                                                final int lizlll;
                                                                iftrue(Label_0216:)(lizlll + n <= liziz.getHeight());
                                                            }
                                                            break Block_8;
                                                            liziz.getWidth();
                                                            liziz.getHeight();
                                                            break Label_0135;
                                                        }
                                                        iftrue(Label_0321:)(1ea.LJIILIIL == null);
                                                        this.LIZ.LIZJ.LIZ(1, 1, "success", 1ea);
                                                        break Label_0321;
                                                        Label_0296: {
                                                            final int n;
                                                            final int lizlll;
                                                            final int n2;
                                                            bitmap = Bitmap.createBitmap(liziz, lizj, lizlll, n2, n);
                                                        }
                                                        break Label_0135;
                                                    }
                                                    liziz.getWidth();
                                                    liziz.getHeight();
                                                }
                                                1ea.LJIILIIL = bitmap;
                                                iftrue(Label_0163:)(!1ea.LJIIIIZZ.LJIIIZ);
                                                continue Block_11_Outer;
                                            }
                                            Label_0216: {
                                                iftrue(Label_0236:)(lizj >= 0);
                                            }
                                            continue;
                                        }
                                        iftrue(Label_0321:)(1ea == null || !1ea.LJIIL);
                                        break Block_9_Outer;
                                        Label_0256: {
                                            final int n2;
                                            iftrue(Label_0276:)(n2 >= 0);
                                        }
                                        continue Block_9_Outer;
                                    }
                                    final Bitmap liziz = this.LIZ.LIZIZ;
                                    final int lizj = 1ea.LJIIIIZZ.LIZJ;
                                    final int lizlll = 1ea.LJIIIIZZ.LIZLLL;
                                    final int n2 = 1ea.LJIIIIZZ.LJI - 1ea.LJIIIIZZ.LIZJ;
                                    final int n = 1ea.LJIIIIZZ.LJFF - 1ea.LJIIIIZZ.LJII;
                                    final int width = liziz.getWidth();
                                    Bitmap bitmap = null;
                                    iftrue(Label_0188:)(lizj + n2 <= width);
                                    continue Block_11_Outer;
                                }
                            }
                            finally {
                                MethodCollector.o(267);
                                return;
                            }
                        }
                        MethodCollector.o(267);
                        return;
                    }
                    continue;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: invokevirtual   X/1EK.LIZJ:()LX/0UC;
        //     6: aload_0        
        //     7: getfield        X/0V5.LIZ:LX/1E7;
        //    10: new             LX/1Em;
        //    13: dup            
        //    14: aload_0        
        //    15: invokespecial   X/1Em.<init>:(LX/0V5;)V
        //    18: invokeinterface X/0UC.LIZ:(LX/1E7;LX/0Tu;)V
        //    23: return         
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
