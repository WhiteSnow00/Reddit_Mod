// 
// Decompiled by Procyon v0.6.0
// 

package v3;

import android.os.CancellationSignal;

public final class d
{
    public boolean a;
    public b b;
    public CancellationSignal c;
    public boolean d;
    
    public final void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            final b b = this.b;
            final CancellationSignal c = this.c;
            monitorexit(this);
            Label_0051: {
                if (b == null) {
                    break Label_0051;
                }
                try {
                    b.onCancel();
                    break Label_0051;
                }
                finally {
                    synchronized (this) {
                        this.d = false;
                        this.notifyAll();
                    }
                    iftrue(Label_0082:)(c == null);
                    v3.d.a.a(c);
                }
            }
            Label_0082: {
                synchronized (this) {
                    this.d = false;
                    this.notifyAll();
                }
            }
        }
    }
    
    public final void b(final b p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        v3/d.d:Z
        //     6: istore_2       
        //     7: iload_2        
        //     8: ifeq            18
        //    11: aload_0        
        //    12: invokevirtual   java/lang/Object.wait:()V
        //    15: goto            2
        //    18: aload_0        
        //    19: getfield        v3/d.b:Lv3/d$b;
        //    22: aload_1        
        //    23: if_acmpne       29
        //    26: aload_0        
        //    27: monitorexit    
        //    28: return         
        //    29: aload_0        
        //    30: aload_1        
        //    31: putfield        v3/d.b:Lv3/d$b;
        //    34: aload_0        
        //    35: getfield        v3/d.a:Z
        //    38: ifeq            50
        //    41: aload_0        
        //    42: monitorexit    
        //    43: aload_1        
        //    44: invokeinterface v3/d$b.onCancel:()V
        //    49: return         
        //    50: aload_0        
        //    51: monitorexit    
        //    52: return         
        //    53: astore_1       
        //    54: aload_0        
        //    55: monitorexit    
        //    56: aload_1        
        //    57: athrow         
        //    58: astore_3       
        //    59: goto            2
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  2      7      53     58     Any
        //  11     15     58     62     Ljava/lang/InterruptedException;
        //  11     15     53     58     Any
        //  18     28     53     58     Any
        //  29     43     53     58     Any
        //  50     52     53     58     Any
        //  54     56     53     58     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0018:
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
    
    public static final class a
    {
        public static void a(final Object o) {
            ((CancellationSignal)o).cancel();
        }
        
        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }
    
    public interface b
    {
        void onCancel();
    }
}
