// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.fresco.animation.c.a;
import com.bytedance.covode.number.Covode;
import android.graphics.drawable.Animatable;

public final class 0cd
{
    public String LIZ;
    public String LIZIZ;
    public String LIZJ;
    public 0ce LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public int LJII;
    public long LJIIIIZZ;
    public long LJIIIZ;
    public boolean LJIIJ;
    public Animatable LJIIJJI;
    public boolean LJIIL;
    public boolean LJIILIIL;
    public final String LJIILJJIL;
    public 1si LJIILL;
    
    static {
        Covode.recordClassIndex(5741);
    }
    
    public 0cd() {
        this.LJIILJJIL = "Gecko_Webp_Controller";
        this.LIZ = "";
        this.LIZIZ = "";
        this.LIZJ = "";
        this.LJ = true;
        this.LJI = 1;
        this.LJIIIIZZ = -1L;
        this.LJIIIZ = -1L;
    }
    
    public final 0cd LIZ(final 0ce lizlll) {
        CTM.LIZ((Object)lizlll);
        this.LIZLLL = lizlll;
        return this;
    }
    
    public final 0cd LIZ(final 1si ljiill) {
        CTM.LIZ((Object)ljiill);
        this.LJIILL = ljiill;
        return this;
    }
    
    public final 0cd LIZ(final String liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        return this;
    }
    
    public final void LIZ() {
        final Animatable ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.start();
        }
    }
    
    public final 0cd LIZIZ(final String liziz) {
        CTM.LIZ((Object)liziz);
        this.LIZIZ = liziz;
        return this;
    }
    
    public final void LIZIZ() {
        final Animatable ljiijji = this.LJIIJJI;
        if (ljiijji != null) {
            ljiijji.stop();
        }
    }
    
    public final void LIZJ() {
        public final class 1iH extends SDW<ByQ>
        {
            public final /* synthetic */ 0cd LIZ;
            public final /* synthetic */ long LIZIZ;
            
            static {
                Covode.recordClassIndex(5742);
            }
            
            public 1iH(final 0cd liz, final long liziz) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
            }
            
            public final void LIZ(String string, final Throwable t) {
                super.LIZ(string, t);
                final StringBuilder sb = new StringBuilder("GeckoWebpController.onFailure,channel:");
                sb.append(this.LIZ.LIZ);
                sb.append(",fileName:");
                sb.append(this.LIZ.LIZIZ);
                sb.append(",filePath:");
                sb.append(this.LIZ.LIZJ);
                sb.append(",throwable:");
                sb.append(t);
                string = sb.toString();
                0ca.LIZ.LIZ(this.LIZ.LIZJ, this.LIZIZ, this.LIZ.LIZ, this.LIZ.LIZIZ, false, string);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: lstore_1       
        //     4: aload_0        
        //     5: getfield        X/0cd.LJIILL:LX/1si;
        //     8: ifnonnull       34
        //    11: iconst_4       
        //    12: aload_0        
        //    13: getfield        X/0cd.LJIILJJIL:Ljava/lang/String;
        //    16: ldc             "draweeView is null"
        //    18: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    21: getstatic       X/0ca.LIZ:LX/0ca;
        //    24: ldc             ""
        //    26: lload_1        
        //    27: iconst_0       
        //    28: ldc             "draweeView is null"
        //    30: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //    33: return         
        //    34: aload_0        
        //    35: getfield        X/0cd.LIZ:Ljava/lang/String;
        //    38: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    41: ifne            73
        //    44: aload_0        
        //    45: getfield        X/0cd.LIZIZ:Ljava/lang/String;
        //    48: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    51: ifne            73
        //    54: aload_0        
        //    55: aload_0        
        //    56: getfield        X/0cd.LIZ:Ljava/lang/String;
        //    59: aload_0        
        //    60: getfield        X/0cd.LIZIZ:Ljava/lang/String;
        //    63: aload_0        
        //    64: getfield        X/0cd.LJFF:Z
        //    67: invokestatic    X/0cc.LIZIZ:(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;
        //    70: putfield        X/0cd.LIZJ:Ljava/lang/String;
        //    73: aload_0        
        //    74: getfield        X/0cd.LIZJ:Ljava/lang/String;
        //    77: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    80: ifeq            106
        //    83: iconst_4       
        //    84: aload_0        
        //    85: getfield        X/0cd.LJIILJJIL:Ljava/lang/String;
        //    88: ldc             "filePath is null"
        //    90: invokestatic    X/0ba.LIZ:(ILjava/lang/String;Ljava/lang/String;)V
        //    93: getstatic       X/0ca.LIZ:LX/0ca;
        //    96: ldc             ""
        //    98: lload_1        
        //    99: iconst_0       
        //   100: ldc             "filePath is null"
        //   102: invokevirtual   X/0ca.LIZ:(Ljava/lang/String;JZLjava/lang/String;)V
        //   105: return         
        //   106: aload_0        
        //   107: getfield        X/0cd.LIZJ:Ljava/lang/String;
        //   110: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   113: astore_3       
        //   114: invokestatic    X/SBH.LIZIZ:()LX/SAp;
        //   117: astore          4
        //   119: aload           4
        //   121: aload_3        
        //   122: invokevirtual   X/SAp.LIZ:(Landroid/net/Uri;)LX/SAp;
        //   125: pop            
        //   126: aload           4
        //   128: aload_0        
        //   129: getfield        X/0cd.LJ:Z
        //   132: invokevirtual   X/SDU.LIZJ:(Z)LX/SDU;
        //   135: pop            
        //   136: aload           4
        //   138: new             LX/1iH;
        //   141: dup            
        //   142: aload_0        
        //   143: lload_1        
        //   144: invokespecial   X/1iH.<init>:(LX/0cd;J)V
        //   147: invokevirtual   X/SDU.LIZ:(LX/KFw;)LX/SDU;
        //   150: pop            
        //   151: aload           4
        //   153: invokevirtual   X/SDU.LIZJ:()LX/SDT;
        //   156: astore          4
        //   158: aload_0        
        //   159: getfield        X/0cd.LJIILL:LX/1si;
        //   162: astore_3       
        //   163: aload_3        
        //   164: ifnull          202
        //   167: aload_3        
        //   168: aload           4
        //   170: invokevirtual   X/SEd.setController:(LX/SDe;)V
        //   173: aload_0        
        //   174: getfield        X/0cd.LJIILIIL:Z
        //   177: ifeq            202
        //   180: aload_3        
        //   181: invokevirtual   X/SEd.getHierarchy:()LX/SB0;
        //   184: checkcast       LX/SEV;
        //   187: astore          4
        //   189: aload           4
        //   191: ldc             ""
        //   193: invokestatic    kotlin/jvm/internal/n.LIZIZ:(Ljava/lang/Object;Ljava/lang/String;)V
        //   196: aload           4
        //   198: iconst_0       
        //   199: invokevirtual   X/SEV.LIZIZ:(I)V
        //   202: return         
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
