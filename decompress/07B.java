// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Callable;
import com.bytedance.covode.number.Covode;
import android.os.Handler$Callback;
import android.os.Handler;
import android.os.HandlerThread;

public final class 07B
{
    public final Object LIZ;
    public HandlerThread LIZIZ;
    public Handler LIZJ;
    public final int LIZLLL;
    public int LJ;
    public Handler$Callback LJFF;
    public final int LJI;
    public final String LJII;
    
    static {
        Covode.recordClassIndex(771);
    }
    
    public 07B(final String ljii) {
        this.LIZ = new Object();
        this.LJFF = (Handler$Callback)new 076(this);
        this.LJII = ljii;
        this.LJI = 10;
        this.LIZLLL = 10000;
        this.LJ = 0;
    }
    
    public final <T> T LIZ(final Callable<T> p0, final int p1) {
        public final class 079 implements Runnable
        {
            public final /* synthetic */ AtomicReference LIZ;
            public final /* synthetic */ Callable LIZIZ;
            public final /* synthetic */ ReentrantLock LIZJ;
            public final /* synthetic */ AtomicBoolean LIZLLL;
            public final /* synthetic */ Condition LJ;
            
            static {
                Covode.recordClassIndex(775);
            }
            
            public 079(final AtomicReference liz, final Callable liziz, final ReentrantLock lizj, final AtomicBoolean lizlll, final Condition lj) {
                this.LIZ = liz;
                this.LIZIZ = liziz;
                this.LIZJ = lizj;
                this.LIZLLL = lizlll;
                this.LJ = lj;
            }
            
            @Override
            public final void run() {
                while (true) {
                    try {
                        this.LIZ.set(this.LIZIZ.call());
                        this.LIZJ.lock();
                        try {
                            this.LIZLLL.set(false);
                            this.LJ.signal();
                        }
                        finally {
                            this.LIZJ.unlock();
                        }
                    }
                    catch (final Exception ex) {
                        continue;
                    }
                    break;
                }
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/concurrent/locks/ReentrantLock.<init>:()V
        //     7: astore_3       
        //     8: aload_3        
        //     9: invokevirtual   java/util/concurrent/locks/ReentrantLock.newCondition:()Ljava/util/concurrent/locks/Condition;
        //    12: astore          4
        //    14: new             Ljava/util/concurrent/atomic/AtomicReference;
        //    17: dup            
        //    18: invokespecial   java/util/concurrent/atomic/AtomicReference.<init>:()V
        //    21: astore          5
        //    23: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //    26: dup            
        //    27: iconst_1       
        //    28: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //    31: astore          6
        //    33: aload_0        
        //    34: new             LX/079;
        //    37: dup            
        //    38: aload           5
        //    40: aload_1        
        //    41: aload_3        
        //    42: aload           6
        //    44: aload           4
        //    46: invokespecial   X/079.<init>:(Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/Callable;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/locks/Condition;)V
        //    49: invokevirtual   X/07B.LIZ:(Ljava/lang/Runnable;)V
        //    52: aload_3        
        //    53: invokevirtual   java/util/concurrent/locks/ReentrantLock.lock:()V
        //    56: aload           6
        //    58: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //    61: ifne            76
        //    64: aload           5
        //    66: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //    69: astore_1       
        //    70: aload_3        
        //    71: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //    74: aload_1        
        //    75: areturn        
        //    76: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //    79: iload_2        
        //    80: i2l            
        //    81: invokevirtual   java/util/concurrent/TimeUnit.toNanos:(J)J
        //    84: lstore          7
        //    86: aload           4
        //    88: lload           7
        //    90: invokeinterface java/util/concurrent/locks/Condition.awaitNanos:(J)J
        //    95: lstore          9
        //    97: lload           9
        //    99: lstore          7
        //   101: aload           6
        //   103: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   106: ifne            118
        //   109: aload           5
        //   111: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   114: astore_1       
        //   115: goto            128
        //   118: lload           7
        //   120: lconst_0       
        //   121: lcmp           
        //   122: ifle            134
        //   125: goto            86
        //   128: aload_3        
        //   129: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   132: aload_1        
        //   133: areturn        
        //   134: new             Ljava/lang/InterruptedException;
        //   137: astore_1       
        //   138: aload_1        
        //   139: ldc             "timeout"
        //   141: invokespecial   java/lang/InterruptedException.<init>:(Ljava/lang/String;)V
        //   144: aload_1        
        //   145: athrow         
        //   146: astore_1       
        //   147: aload_3        
        //   148: invokevirtual   java/util/concurrent/locks/ReentrantLock.unlock:()V
        //   151: aload_1        
        //   152: athrow         
        //   153: astore_1       
        //   154: goto            101
        //    Signature:
        //  <T:Ljava/lang/Object;>(Ljava/util/concurrent/Callable<TT;>;I)TT;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  56     70     146    153    Any
        //  76     86     146    153    Any
        //  86     97     153    157    Ljava/lang/InterruptedException;
        //  86     97     146    153    Any
        //  101    115    146    153    Any
        //  134    146    146    153    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0086:
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
    
    public final void LIZ(final Runnable runnable) {
        synchronized (this.LIZ) {
            if (this.LIZIZ == null) {
                (this.LIZIZ = new HandlerThread(this.LJII, this.LJI)).start();
                this.LIZJ = new Handler(this.LIZIZ.getLooper(), this.LJFF);
                ++this.LJ;
            }
            this.LIZJ.removeMessages(0);
            final Handler lizj = this.LIZJ;
            lizj.sendMessage(lizj.obtainMessage(1, (Object)runnable));
        }
    }
    
    public interface a<T>
    {
        default static {
            Covode.recordClassIndex(776);
        }
        
        void LIZ(final T p0);
    }
}
