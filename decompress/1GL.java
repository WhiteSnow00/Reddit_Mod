// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Set;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Map;
import com.bytedance.covode.number.Covode;

public final class 1gl extends 0Fw.a
{
    public final /* synthetic */ 0G9 LIZ;
    
    static {
        Covode.recordClassIndex(1702);
    }
    
    public 1gl(final 0G9 liz) {
        this.LIZ = liz;
    }
    
    public final void LIZ(final String[] array) {
        public final class 0G4 implements Runnable
        {
            public final /* synthetic */ String[] LIZ;
            public final /* synthetic */ 1gl LIZIZ;
            
            static {
                Covode.recordClassIndex(1703);
            }
            
            public 0G4(final 1gl liziz, final String[] liz) {
                this.LIZIZ = liziz;
                this.LIZ = liz;
            }
            
            @Override
            public final void run() {
                final 0G3 lizlll = this.LIZIZ.LIZ.LIZLLL;
                final String[] liz = this.LIZ;
                synchronized (lizlll.LJI) {
                    for (final Map.Entry<0G3.b, V> entry : lizlll.LJI) {
                        if (!entry.getKey().LIZ()) {
                            final 0G3.c c = (0G3.c)entry.getValue();
                            Set<String> lizlll2 = null;
                            Label_0238: {
                                if (c.LIZIZ.length == 1) {
                                    final int length = liz.length;
                                    int i = 0;
                                    while (i < length) {
                                        if (liz[i].equalsIgnoreCase(c.LIZIZ[0])) {
                                            lizlll2 = c.LIZLLL;
                                            if (lizlll2 != null) {
                                                break Label_0238;
                                            }
                                            break;
                                        }
                                        else {
                                            ++i;
                                        }
                                    }
                                    continue;
                                }
                                lizlll2 = new HashSet<String>();
                                for (final String s : liz) {
                                    for (final String s2 : c.LIZIZ) {
                                        if (s2.equalsIgnoreCase(s)) {
                                            ((HashSet<String>)lizlll2).add(s2);
                                            break;
                                        }
                                    }
                                }
                                if (((HashSet)lizlll2).size() <= 0) {
                                    continue;
                                }
                            }
                            c.LIZJ.LIZ(lizlll2);
                        }
                    }
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/1gl.LIZ:LX/0G9;
        //     4: getfield        X/0G9.LJI:Ljava/util/concurrent/Executor;
        //     7: new             LX/0G4;
        //    10: dup            
        //    11: aload_0        
        //    12: aload_1        
        //    13: invokespecial   X/0G4.<init>:(LX/1gl;[Ljava/lang/String;)V
        //    16: invokeinterface java/util/concurrent/Executor.execute:(Ljava/lang/Runnable;)V
        //    21: return         
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
