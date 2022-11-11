// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.MenuItem;
import com.bytedance.covode.number.Covode;

public final class 12v implements 03o
{
    public final /* synthetic */ 1fW LIZ;
    
    static {
        Covode.recordClassIndex(342);
    }
    
    public 12v(final 1fW liz) {
        this.LIZ = liz;
    }
    
    @Override
    public final void LIZ(final 12x 12x, final MenuItem menuItem) {
        this.LIZ.LIZ.removeCallbacksAndMessages((Object)12x);
    }
    
    @Override
    public final void LIZIZ(final 12x 12x, final MenuItem menuItem) {
        public final class 02g implements Runnable
        {
            public final /* synthetic */ 1fW.a LIZ;
            public final /* synthetic */ MenuItem LIZIZ;
            public final /* synthetic */ 12x LIZJ;
            public final /* synthetic */ 12v LIZLLL;
            
            static {
                Covode.recordClassIndex(343);
            }
            
            public 02g(final 12v lizlll, final 1fW.a liz, final MenuItem liziz, final 12x lizj) {
                this.LIZLLL = lizlll;
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
            }
            
            @Override
            public final void run() {
                if (this.LIZ != null) {
                    this.LIZLLL.LIZ.LJFF = true;
                    this.LIZ.LIZIZ.LIZ(false);
                    this.LIZLLL.LIZ.LJFF = false;
                }
                if (this.LIZIZ.isEnabled() && this.LIZIZ.hasSubMenu()) {
                    this.LIZJ.LIZ(this.LIZIZ, null, 4);
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/12v.LIZ:LX/1fW;
        //     4: getfield        X/1fW.LIZ:Landroid/os/Handler;
        //     7: astore_3       
        //     8: aconst_null    
        //     9: astore          4
        //    11: aload_3        
        //    12: aconst_null    
        //    13: invokevirtual   android/os/Handler.removeCallbacksAndMessages:(Ljava/lang/Object;)V
        //    16: aload_0        
        //    17: getfield        X/12v.LIZ:LX/1fW;
        //    20: getfield        X/1fW.LIZIZ:Ljava/util/List;
        //    23: invokeinterface java/util/List.size:()I
        //    28: istore          5
        //    30: iconst_0       
        //    31: istore          6
        //    33: iload           6
        //    35: iload           5
        //    37: if_icmpge       70
        //    40: aload_1        
        //    41: aload_0        
        //    42: getfield        X/12v.LIZ:LX/1fW;
        //    45: getfield        X/1fW.LIZIZ:Ljava/util/List;
        //    48: iload           6
        //    50: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //    55: checkcast       LX/02h;
        //    58: getfield        X/02h.LIZIZ:LX/12x;
        //    61: if_acmpne       71
        //    64: iload           6
        //    66: iconst_m1      
        //    67: if_icmpne       77
        //    70: return         
        //    71: iinc            6, 1
        //    74: goto            33
        //    77: iinc            6, 1
        //    80: iload           6
        //    82: aload_0        
        //    83: getfield        X/12v.LIZ:LX/1fW;
        //    86: getfield        X/1fW.LIZIZ:Ljava/util/List;
        //    89: invokeinterface java/util/List.size:()I
        //    94: if_icmpge       116
        //    97: aload_0        
        //    98: getfield        X/12v.LIZ:LX/1fW;
        //   101: getfield        X/1fW.LIZIZ:Ljava/util/List;
        //   104: iload           6
        //   106: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   111: checkcast       LX/02h;
        //   114: astore          4
        //   116: new             LX/02g;
        //   119: dup            
        //   120: aload_0        
        //   121: aload           4
        //   123: aload_2        
        //   124: aload_1        
        //   125: invokespecial   X/02g.<init>:(LX/12v;LX/02h;Landroid/view/MenuItem;LX/12x;)V
        //   128: astore_2       
        //   129: invokestatic    android/os/SystemClock.uptimeMillis:()J
        //   132: lstore          7
        //   134: aload_0        
        //   135: getfield        X/12v.LIZ:LX/1fW;
        //   138: getfield        X/1fW.LIZ:Landroid/os/Handler;
        //   141: aload_2        
        //   142: aload_1        
        //   143: lload           7
        //   145: ldc2_w          200
        //   148: ladd           
        //   149: invokevirtual   android/os/Handler.postAtTime:(Ljava/lang/Runnable;Ljava/lang/Object;J)Z
        //   152: pop            
        //   153: return         
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:410)
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
