// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RunnableFuture;

public abstract class u<R, E extends Exception> implements RunnableFuture<R>
{
    public final e f;
    public final e g;
    public final Object h;
    public Exception i;
    public R j;
    public Thread k;
    public boolean l;
    
    public u() {
        this.f = new e();
        this.g = new e();
        this.h = new Object();
    }
    
    public final void b() {
        this.g.c();
    }
    
    public void c() {
    }
    
    @Override
    public final boolean cancel(final boolean b) {
        synchronized (this.h) {
            if (!this.l) {
                Object o = this.g;
                synchronized (o) {
                    final boolean a = ((e)o).a;
                    monitorexit(o);
                    if (!a) {
                        this.l = true;
                        this.c();
                        o = this.k;
                        if (o != null) {
                            if (b) {
                                ((Thread)o).interrupt();
                            }
                        }
                        else {
                            this.f.e();
                            this.g.e();
                        }
                        return true;
                    }
                }
            }
            return false;
        }
    }
    
    public abstract R d() throws E, Exception;
    
    @Override
    public final R get() throws ExecutionException, InterruptedException {
        this.g.a();
        if (this.l) {
            throw new CancellationException();
        }
        if (this.i == null) {
            return this.j;
        }
        throw new ExecutionException(this.i);
    }
    
    @Override
    public final R get(long convert, final TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        convert = TimeUnit.MILLISECONDS.convert(convert, timeUnit);
        if (!this.g.b(convert)) {
            throw new TimeoutException();
        }
        if (this.l) {
            throw new CancellationException();
        }
        if (this.i == null) {
            return this.j;
        }
        throw new ExecutionException(this.i);
    }
    
    @Override
    public final boolean isCancelled() {
        return this.l;
    }
    
    @Override
    public final boolean isDone() {
        final e g = this.g;
        synchronized (g) {
            return g.a;
        }
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        bd/u.h:Ljava/lang/Object;
        //     4: astore_2       
        //     5: aload_2        
        //     6: monitorenter   
        //     7: aload_0        
        //     8: getfield        bd/u.l:Z
        //    11: ifeq            17
        //    14: aload_2        
        //    15: monitorexit    
        //    16: return         
        //    17: aload_0        
        //    18: invokestatic    java/lang/Thread.currentThread:()Ljava/lang/Thread;
        //    21: putfield        bd/u.k:Ljava/lang/Thread;
        //    24: aload_2        
        //    25: monitorexit    
        //    26: aload_0        
        //    27: getfield        bd/u.f:Lbd/e;
        //    30: invokevirtual   bd/e.e:()Z
        //    33: pop            
        //    34: aload_0        
        //    35: aload_0        
        //    36: invokevirtual   bd/u.d:()Ljava/lang/Object;
        //    39: putfield        bd/u.j:Ljava/lang/Object;
        //    42: aload_0        
        //    43: getfield        bd/u.h:Ljava/lang/Object;
        //    46: astore_2       
        //    47: aload_2        
        //    48: monitorenter   
        //    49: aload_0        
        //    50: getfield        bd/u.g:Lbd/e;
        //    53: invokevirtual   bd/e.e:()Z
        //    56: pop            
        //    57: aload_0        
        //    58: aconst_null    
        //    59: putfield        bd/u.k:Ljava/lang/Thread;
        //    62: invokestatic    java/lang/Thread.interrupted:()Z
        //    65: pop            
        //    66: aload_2        
        //    67: monitorexit    
        //    68: goto            112
        //    71: astore_1       
        //    72: aload_2        
        //    73: monitorexit    
        //    74: aload_1        
        //    75: athrow         
        //    76: astore_2       
        //    77: goto            118
        //    80: astore_1       
        //    81: aload_0        
        //    82: aload_1        
        //    83: putfield        bd/u.i:Ljava/lang/Exception;
        //    86: aload_0        
        //    87: getfield        bd/u.h:Ljava/lang/Object;
        //    90: astore_2       
        //    91: aload_2        
        //    92: monitorenter   
        //    93: aload_0        
        //    94: getfield        bd/u.g:Lbd/e;
        //    97: invokevirtual   bd/e.e:()Z
        //   100: pop            
        //   101: aload_0        
        //   102: aconst_null    
        //   103: putfield        bd/u.k:Ljava/lang/Thread;
        //   106: invokestatic    java/lang/Thread.interrupted:()Z
        //   109: pop            
        //   110: aload_2        
        //   111: monitorexit    
        //   112: return         
        //   113: astore_1       
        //   114: aload_2        
        //   115: monitorexit    
        //   116: aload_1        
        //   117: athrow         
        //   118: aload_0        
        //   119: getfield        bd/u.h:Ljava/lang/Object;
        //   122: astore_1       
        //   123: aload_1        
        //   124: monitorenter   
        //   125: aload_0        
        //   126: getfield        bd/u.g:Lbd/e;
        //   129: invokevirtual   bd/e.e:()Z
        //   132: pop            
        //   133: aload_0        
        //   134: aconst_null    
        //   135: putfield        bd/u.k:Ljava/lang/Thread;
        //   138: invokestatic    java/lang/Thread.interrupted:()Z
        //   141: pop            
        //   142: aload_1        
        //   143: monitorexit    
        //   144: aload_2        
        //   145: athrow         
        //   146: astore_2       
        //   147: aload_1        
        //   148: monitorexit    
        //   149: aload_2        
        //   150: athrow         
        //   151: astore_1       
        //   152: aload_2        
        //   153: monitorexit    
        //   154: aload_1        
        //   155: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  7      16     151    156    Any
        //  17     26     151    156    Any
        //  34     42     80     118    Ljava/lang/Exception;
        //  34     42     76     151    Any
        //  49     68     71     76     Any
        //  72     74     71     76     Any
        //  81     86     76     151    Any
        //  93     112    113    118    Any
        //  114    116    113    118    Any
        //  125    144    146    151    Any
        //  147    149    146    151    Any
        //  152    154    151    156    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 102, Size: 102
        //     at java.util.ArrayList.rangeCheck(Unknown Source)
        //     at java.util.ArrayList.get(Unknown Source)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
        //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3476)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
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
