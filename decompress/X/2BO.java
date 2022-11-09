// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.c.a;

public final class 2Bo extends 1si
{
    public static final a LIZLLL;
    public SBy LIZ;
    public boolean LIZIZ;
    public boolean LIZJ;
    public String LJ;
    public SDe LJFF;
    public com.facebook.fresco.animation.c.a LJI;
    
    static {
        Covode.recordClassIndex(5860);
        LIZLLL = new a((byte)0);
    }
    
    public 2Bo(final Context context) {
        super(context);
        this.LJ = "";
        this.LIZIZ = true;
    }
    
    public 2Bo(final Context context, final AttributeSet set) {
        super(context, set);
        this.LJ = "";
        this.LIZIZ = true;
    }
    
    public static final String LIZ(final String s, final String s2) {
        return 2Bo.LIZLLL.LIZIZ(s, s2);
    }
    
    public final 2Bo LIZ(final SBy liz) {
        CTM.LIZ((Object)liz);
        this.LIZ = liz;
        return this;
    }
    
    public final 2Bo LIZ(final String lj) {
        CTM.LIZ((Object)lj);
        this.LJ = lj;
        return this;
    }
    
    public final void LIZ() {
        public final class 1IB implements KFw<ByQ>
        {
            public final /* synthetic */ 2Bo LIZ;
            
            static {
                Covode.recordClassIndex(5862);
            }
            
            public 1IB(final 2Bo liz) {
                this.LIZ = liz;
            }
            
            public final void LIZ(final String s) {
            }
            
            public final void LIZ(final String s, final Object o) {
            }
            
            public final void LIZ(final String s, final Throwable t) {
            }
            
            public final void LIZIZ(final String s, final Throwable t) {
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        X/2Bo.LJFF:LX/SDe;
        //     4: ifnonnull       47
        //     7: invokestatic    X/SBH.LIZIZ:()LX/SAp;
        //    10: astore_1       
        //    11: aload_1        
        //    12: aload_0        
        //    13: getfield        X/2Bo.LJ:Ljava/lang/String;
        //    16: invokevirtual   X/SAp.LIZ:(Ljava/lang/String;)LX/SAp;
        //    19: pop            
        //    20: aload_1        
        //    21: iconst_0       
        //    22: invokevirtual   X/SDU.LIZJ:(Z)LX/SDU;
        //    25: pop            
        //    26: aload_1        
        //    27: new             LX/1IB;
        //    30: dup            
        //    31: aload_0        
        //    32: invokespecial   X/1IB.<init>:(LX/2Bo;)V
        //    35: invokevirtual   X/SDU.LIZ:(LX/KFw;)LX/SDU;
        //    38: pop            
        //    39: aload_0        
        //    40: aload_1        
        //    41: invokevirtual   X/SDU.LIZJ:()LX/SDT;
        //    44: putfield        X/2Bo.LJFF:LX/SDe;
        //    47: aload_0        
        //    48: aload_0        
        //    49: getfield        X/2Bo.LJFF:LX/SDe;
        //    52: invokevirtual   X/SEd.setController:(LX/SDe;)V
        //    55: return         
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
    
    public final void LIZIZ() {
        this.LIZIZ = true;
        this.LIZ();
    }
    
    public final void LIZJ() {
        this.LIZIZ = false;
        final com.facebook.fresco.animation.c.a lji = this.LJI;
        if (lji != null) {
            lji.stop();
        }
    }
    
    public final boolean LIZLLL() {
        final com.facebook.fresco.animation.c.a lji = this.LJI;
        return lji != null && lji.isRunning();
    }
    
    public final com.facebook.fresco.animation.c.a getAnimatedDrawable2() {
        return this.LJI;
    }
    
    public final boolean getUseWrapContent() {
        return this.LIZJ;
    }
    
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        I60.LIZ((Object)this);
    }
    
    public final void setAnimatedDrawable2(final com.facebook.fresco.animation.c.a lji) {
        this.LJI = lji;
    }
    
    public final void setAutoPlay(final boolean liziz) {
        this.LIZIZ = liziz;
    }
    
    public final void setUseWrapContent(final boolean lizj) {
        this.LIZJ = lizj;
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(5861);
        }
        
        public final String LIZ(final String s, final String s2) {
            CTM.LIZ((Object)s, (Object)s2);
            return 0cc.LIZ(s, s2, false);
        }
        
        public final String LIZIZ(final String s, final String s2) {
            CTM.LIZ((Object)s, (Object)s2);
            return 0cc.LIZIZ(s, s2, false);
        }
        
        public final String LIZJ(final String s, final String s2) {
            CTM.LIZ((Object)s, (Object)s2);
            return 0cc.LIZIZ(s, s2, false);
        }
    }
}
