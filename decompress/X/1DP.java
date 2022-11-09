// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.utils.LiveAppBundleUtils;
import com.bytedance.covode.number.Covode;

@0kX(LIZ = "LINK_MIC_APP_BUNDLE_UTIL")
public final class 1dP implements 0yA
{
    public static final a LIZJ;
    public int LIZ;
    public final boolean LIZIZ;
    public int LIZLLL;
    
    static {
        Covode.recordClassIndex(10377);
        LIZJ = new a((byte)0);
    }
    
    public 1dP(final boolean liziz) {
        this.LIZIZ = liziz;
        this.LIZ = Integer.MAX_VALUE;
    }
    
    @Override
    public final void LIZ(final int liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final String s, final QgG<2P9> qgG) {
        public final class 1dO implements H8A
        {
            public final /* synthetic */ 1dP LIZ;
            public final /* synthetic */ long LIZIZ;
            public final /* synthetic */ String LIZJ;
            public final /* synthetic */ QgG LIZLLL;
            
            static {
                Covode.recordClassIndex(10379);
            }
            
            public 1dO(final 1dP liz, final long liziz, final String lizj, final QgG lizlll) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
            }
            
            public final void LIZ() {
                1dP.LIZJ.LIZ("load linkmic aab failed with dialog");
                if (0sH.LIZ.LIZ()) {
                    Hf4.LIZ(0cB.LJ(), "please set setting \u3010live_test_skip_aab_check\u3011 = true to skip aab check and restart app\u3002", 0L);
                }
            }
            
            public final void LIZ(final String s, final boolean b, final int liz) {
                1dP.LIZJ.LIZ("load failed with dialog: reason".concat(String.valueOf(liz)));
                this.LIZ.LIZ = liz;
                1mk.LIZ(1, this.LIZ.LIZIZ, System.currentTimeMillis() - this.LIZIZ, this.LIZJ, String.valueOf(this.LIZ.LIZ));
                final LLV liz2 = LLV.LIZ;
                final StringBuilder sb = new StringBuilder("onPluginInstallError reason = ");
                sb.append(liz);
                sb.append(' ');
                sb.append(this.LIZJ);
                ((VZq)liz2).LIZ(601, sb.toString());
            }
            
            public final void LIZIZ() {
                1mk.LIZ(0, this.LIZ.LIZIZ, System.currentTimeMillis() - this.LIZIZ, "source", "");
                if (this.LIZ.LIZ != Integer.MAX_VALUE) {
                    return;
                }
                final a lizj = 1dP.LIZJ;
                final StringBuilder sb = new StringBuilder("load success with dialog ");
                sb.append(this.LIZJ);
                lizj.LIZ(sb.toString());
                this.LIZLLL.invoke();
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_2        
        //     2: invokestatic    X/CTM.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)V
        //     5: getstatic       X/Gqy.LINK_MIC:LX/Gqy;
        //     8: invokestatic    com/bytedance/android/livesdk/utils/LiveAppBundleUtils.isPluginAvailable:(LX/Gqy;)Z
        //    11: ifeq            22
        //    14: aload_2        
        //    15: invokeinterface X/QgG.invoke:()Ljava/lang/Object;
        //    20: pop            
        //    21: return         
        //    22: aload_0        
        //    23: ldc             2147483647
        //    25: putfield        X/1dP.LIZ:I
        //    28: invokestatic    java/lang/System.currentTimeMillis:()J
        //    31: lstore_3       
        //    32: getstatic       X/Gqy.LINK_MIC:LX/Gqy;
        //    35: new             LX/1dO;
        //    38: dup            
        //    39: aload_0        
        //    40: lload_3        
        //    41: aload_1        
        //    42: aload_2        
        //    43: invokespecial   X/1dO.<init>:(LX/1dP;JLjava/lang/String;LX/QgG;)V
        //    46: iconst_0       
        //    47: invokestatic    com/bytedance/android/livesdk/utils/LiveAppBundleUtils.ensurePluginAvailable:(LX/Gqy;LX/H8A;Z)V
        //    50: return         
        //    Signature:
        //  (Ljava/lang/String;LX/QgG<LX/2P9;>;)V
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
    
    @Override
    public final boolean LIZ() {
        if (this.LIZ == -14) {
            return false;
        }
        this.LIZLLL = 1;
        return true;
    }
    
    @Override
    public final int LIZIZ() {
        return this.LIZLLL;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(10378);
        }
        
        public final 0yA LIZ() {
            return 1jw.LIZ.LIZIZ("LINK_MIC_APP_BUNDLE_UTIL");
        }
        
        public final void LIZ(final String s) {
            CTM.LIZ((Object)s);
            0ba.LIZ(3, "linkmic_aab", s);
        }
    }
}
