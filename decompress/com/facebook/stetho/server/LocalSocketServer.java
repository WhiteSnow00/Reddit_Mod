// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.server;

import android.net.LocalSocket;
import java.io.InterruptedIOException;
import java.net.SocketException;
import java.io.IOException;
import java.net.BindException;
import com.facebook.stetho.common.LogUtil;
import com.facebook.stetho.common.Util;
import java.util.concurrent.atomic.AtomicInteger;
import android.net.LocalServerSocket;

public class LocalSocketServer
{
    private static final int MAX_BIND_RETRIES = 2;
    private static final int TIME_BETWEEN_BIND_RETRIES_MS = 1000;
    private static final String WORKER_THREAD_NAME_PREFIX = "StethoWorker";
    private final String mAddress;
    private final String mFriendlyName;
    private Thread mListenerThread;
    private LocalServerSocket mServerSocket;
    private final SocketHandler mSocketHandler;
    private boolean mStopped;
    private final AtomicInteger mThreadId;
    
    public LocalSocketServer(final String s, final String s2, final SocketHandler mSocketHandler) {
        this.mThreadId = new AtomicInteger();
        this.mFriendlyName = Util.throwIfNull(s);
        this.mAddress = Util.throwIfNull(s2);
        this.mSocketHandler = mSocketHandler;
    }
    
    private static LocalServerSocket bindToSocket(final String s) throws IOException {
        int n = 2;
        BindException ex = null;
        while (true) {
            try {
                if (LogUtil.isLoggable(3)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Trying to bind to @");
                    sb.append(s);
                    LogUtil.d(sb.toString());
                }
                return new LocalServerSocket(s);
            }
            catch (final BindException ex2) {
                LogUtil.w(ex2, "Binding error, sleep 1000 ms...");
                BindException ex3 = ex;
                if (ex == null) {
                    ex3 = ex2;
                }
                Util.sleepUninterruptibly(1000L);
                if (n > 0) {
                    --n;
                    ex = ex3;
                    continue;
                }
                throw ex3;
            }
            break;
        }
    }
    
    private void listenOnAddress(final String s) throws IOException {
        this.mServerSocket = bindToSocket(s);
        final StringBuilder sb = new StringBuilder();
        sb.append("Listening on @");
        sb.append(s);
        LogUtil.i(sb.toString());
        while (!Thread.interrupted()) {
            try {
                final WorkerThread workerThread = new WorkerThread(this.mServerSocket.accept(), this.mSocketHandler);
                final StringBuilder sb2 = new StringBuilder();
                sb2.append("StethoWorker-");
                sb2.append(this.mFriendlyName);
                sb2.append("-");
                sb2.append(this.mThreadId.incrementAndGet());
                workerThread.setName(sb2.toString());
                workerThread.setDaemon(true);
                workerThread.start();
            }
            catch (final IOException ex) {
                LogUtil.w(ex, "I/O error initialising connection thread");
                goto Label_0155;
            }
            catch (final SocketException ex2) {
                if (Thread.interrupted()) {
                    goto Label_0155;
                }
                LogUtil.w(ex2, "I/O error");
            }
            catch (final InterruptedIOException ex3) {
                goto Label_0155;
            }
        }
        goto Label_0155;
    }
    
    public String getName() {
        return this.mFriendlyName;
    }
    
    public void run() throws IOException {
        synchronized (this) {
            if (this.mStopped) {
                return;
            }
            this.mListenerThread = Thread.currentThread();
            monitorexit(this);
            this.listenOnAddress(this.mAddress);
        }
    }
    
    public void stop() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: iconst_1       
        //     4: putfield        com/facebook/stetho/server/LocalSocketServer.mStopped:Z
        //     7: aload_0        
        //     8: getfield        com/facebook/stetho/server/LocalSocketServer.mListenerThread:Ljava/lang/Thread;
        //    11: astore_1       
        //    12: aload_1        
        //    13: ifnonnull       19
        //    16: aload_0        
        //    17: monitorexit    
        //    18: return         
        //    19: aload_0        
        //    20: monitorexit    
        //    21: aload_1        
        //    22: invokevirtual   java/lang/Thread.interrupt:()V
        //    25: aload_0        
        //    26: getfield        com/facebook/stetho/server/LocalSocketServer.mServerSocket:Landroid/net/LocalServerSocket;
        //    29: astore_1       
        //    30: aload_1        
        //    31: ifnull          38
        //    34: aload_1        
        //    35: invokevirtual   android/net/LocalServerSocket.close:()V
        //    38: return         
        //    39: astore_1       
        //    40: aload_0        
        //    41: monitorexit    
        //    42: aload_1        
        //    43: athrow         
        //    44: astore_1       
        //    45: goto            38
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      12     39     44     Any
        //  16     18     39     44     Any
        //  19     21     39     44     Any
        //  25     30     44     48     Ljava/io/IOException;
        //  34     38     44     48     Ljava/io/IOException;
        //  40     42     39     44     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0038:
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
    
    public static class WorkerThread extends Thread
    {
        private final LocalSocket mSocket;
        private final SocketHandler mSocketHandler;
        
        public WorkerThread(final LocalSocket mSocket, final SocketHandler mSocketHandler) {
            this.mSocket = mSocket;
            this.mSocketHandler = mSocketHandler;
        }
        
        @Override
        public void run() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        com/facebook/stetho/server/LocalSocketServer$WorkerThread.mSocketHandler:Lcom/facebook/stetho/server/SocketHandler;
            //     4: aload_0        
            //     5: getfield        com/facebook/stetho/server/LocalSocketServer$WorkerThread.mSocket:Landroid/net/LocalSocket;
            //     8: invokeinterface com/facebook/stetho/server/SocketHandler.onAccepted:(Landroid/net/LocalSocket;)V
            //    13: aload_0        
            //    14: getfield        com/facebook/stetho/server/LocalSocketServer$WorkerThread.mSocket:Landroid/net/LocalSocket;
            //    17: invokevirtual   android/net/LocalSocket.close:()V
            //    20: goto            44
            //    23: astore_1       
            //    24: goto            45
            //    27: astore_2       
            //    28: ldc             "I/O error: %s"
            //    30: iconst_1       
            //    31: anewarray       Ljava/lang/Object;
            //    34: dup            
            //    35: iconst_0       
            //    36: aload_2        
            //    37: aastore        
            //    38: invokestatic    com/facebook/stetho/common/LogUtil.w:(Ljava/lang/String;[Ljava/lang/Object;)V
            //    41: goto            13
            //    44: return         
            //    45: aload_0        
            //    46: getfield        com/facebook/stetho/server/LocalSocketServer$WorkerThread.mSocket:Landroid/net/LocalSocket;
            //    49: invokevirtual   android/net/LocalSocket.close:()V
            //    52: aload_1        
            //    53: athrow         
            //    54: astore_2       
            //    55: goto            44
            //    58: astore_2       
            //    59: goto            52
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  0      13     27     44     Ljava/io/IOException;
            //  0      13     23     54     Any
            //  13     20     54     58     Ljava/io/IOException;
            //  28     41     23     54     Any
            //  45     52     58     62     Ljava/io/IOException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 31, Size: 31
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:112)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:203)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:761)
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:638)
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
    }
}
