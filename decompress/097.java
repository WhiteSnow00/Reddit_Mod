// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.view.Choreographer$FrameCallback;
import android.view.Choreographer;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

public final class 097
{
    public static final ThreadLocal<097> LIZ;
    public final 050<b, Long> LIZIZ;
    public final ArrayList<b> LIZJ;
    public c LIZLLL;
    public long LJ;
    public boolean LJFF;
    public final a LJI;
    
    static {
        Covode.recordClassIndex(952);
        LIZ = new ThreadLocal<097>();
    }
    
    public 097() {
        this.LIZIZ = new 050<b, Long>();
        this.LIZJ = new ArrayList<b>();
        this.LJI = new a();
        this.LJ = 0L;
        this.LJFF = false;
    }
    
    public static 097 LIZ() {
        final ThreadLocal<097> liz = 097.LIZ;
        if (liz.get() == null) {
            liz.set(new 097());
        }
        return liz.get();
    }
    
    public final void LIZ(final b b) {
        this.LIZIZ.remove(b);
        final int index = this.LIZJ.indexOf(b);
        if (index >= 0) {
            this.LIZJ.set(index, null);
            this.LJFF = true;
        }
    }
    
    public final c LIZIZ() {
        if (this.LIZLLL == null) {
            this.LIZLLL = (c)new d(this.LJI);
        }
        return this.LIZLLL;
    }
    
    public final class a
    {
        static {
            Covode.recordClassIndex(953);
        }
    }
    
    public interface b
    {
        default static {
            Covode.recordClassIndex(954);
        }
        
        boolean LIZ(final long p0);
    }
    
    public abstract static class c
    {
        public final a LIZ;
        
        static {
            Covode.recordClassIndex(955);
        }
        
        public c(final a liz) {
            this.LIZ = liz;
        }
        
        public abstract void LIZ();
    }
    
    public static final class d extends c
    {
        public final Choreographer LIZIZ;
        public final Choreographer$FrameCallback LIZJ;
        
        static {
            Covode.recordClassIndex(956);
        }
        
        public d(final a a) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: aload_1        
            //     2: invokespecial   X/095.<init>:(LX/093;)V
            //     5: aload_0        
            //     6: invokestatic    android/view/Choreographer.getInstance:()Landroid/view/Choreographer;
            //     9: putfield        X/14v.LIZIZ:Landroid/view/Choreographer;
            //    12: aload_0        
            //    13: new             LX/096;
            //    16: dup            
            //    17: aload_0        
            //    18: invokespecial   X/096.<init>:(LX/14v;)V
            //    21: putfield        X/14v.LIZJ:Landroid/view/Choreographer$FrameCallback;
            //    24: return         
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:605)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:195)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
        public final void LIZ() {
            this.LIZIZ.postFrameCallback(this.LIZJ);
        }
    }
}
