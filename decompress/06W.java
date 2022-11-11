// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.CancellationSignal;
import com.bytedance.covode.number.Covode;

public final class 06W
{
    public boolean LIZ;
    public a LIZIZ;
    public Object LIZJ;
    public boolean LIZLLL;
    
    static {
        Covode.recordClassIndex(726);
    }
    
    public final void LIZ(final a p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        X/06W.LIZLLL:Z
        //     6: ifeq            16
        //     9: aload_0        
        //    10: invokevirtual   java/lang/Object.wait:()V
        //    13: goto            2
        //    16: aload_0        
        //    17: getfield        X/06W.LIZIZ:LX/06V;
        //    20: aload_1        
        //    21: if_acmpne       27
        //    24: aload_0        
        //    25: monitorexit    
        //    26: return         
        //    27: aload_0        
        //    28: aload_1        
        //    29: putfield        X/06W.LIZIZ:LX/06V;
        //    32: aload_0        
        //    33: getfield        X/06W.LIZ:Z
        //    36: ifeq            55
        //    39: aload_1        
        //    40: ifnonnull       46
        //    43: goto            55
        //    46: aload_0        
        //    47: monitorexit    
        //    48: aload_1        
        //    49: invokeinterface X/06V.LIZ:()V
        //    54: return         
        //    55: aload_0        
        //    56: monitorexit    
        //    57: return         
        //    58: astore_1       
        //    59: aload_0        
        //    60: monitorexit    
        //    61: aload_1        
        //    62: athrow         
        //    63: astore_2       
        //    64: goto            2
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      9      58     63     Any
        //  9      13     63     67     Ljava/lang/InterruptedException;
        //  9      13     58     63     Any
        //  16     26     58     63     Any
        //  27     39     58     63     Any
        //  55     57     58     63     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0016:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
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
    
    public final boolean LIZ() {
        synchronized (this) {
            return this.LIZ;
        }
    }
    
    public final void LIZIZ() {
        synchronized (this) {
            if (this.LIZ) {
                return;
            }
            this.LIZ = true;
            this.LIZLLL = true;
            final a liziz = this.LIZIZ;
            final Object lizj = this.LIZJ;
            monitorexit(this);
            Label_0044: {
                if (liziz == null) {
                    break Label_0044;
                }
                try {
                    liziz.LIZ();
                    if (lizj != null) {
                        ((CancellationSignal)lizj).cancel();
                    }
                }
                finally {
                    synchronized (this) {
                        this.LIZLLL = false;
                        this.notifyAll();
                    }
                }
            }
            synchronized (this) {
                this.LIZLLL = false;
                this.notifyAll();
            }
        }
    }
    
    public final Object LIZJ() {
        synchronized (this) {
            if (this.LIZJ == null) {
                final CancellationSignal lizj = new CancellationSignal();
                this.LIZJ = lizj;
                if (this.LIZ) {
                    lizj.cancel();
                }
            }
            return this.LIZJ;
        }
    }
    
    public interface a
    {
        default static {
            Covode.recordClassIndex(727);
        }
        
        void LIZ();
    }
}
