// 
// Decompiled by Procyon v0.6.0
// 

package cd;

import android.os.Message;
import android.opengl.EGLSurface;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.graphics.SurfaceTexture$OnFrameAvailableListener;
import com.google.android.exoplayer2.util.GlUtil;
import android.opengl.GLES20;
import android.opengl.EGLConfig;
import com.google.android.exoplayer2.util.EGLSurfaceTexture$a;
import com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException;
import android.os.HandlerThread;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import android.os.Handler$Callback;
import android.os.Handler;
import ah0.b;
import android.opengl.EGL14;
import bd.c0;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

public final class d extends Surface
{
    public static int i;
    public static boolean j;
    public final boolean f;
    public final a g;
    public boolean h;
    
    public d(final a g, final SurfaceTexture surfaceTexture, final boolean f) {
        super(surfaceTexture);
        this.g = g;
        this.f = f;
    }
    
    public static int a(final Context context) {
        final int a = c0.a;
        final boolean b = false;
        boolean b2 = false;
        Label_0098: {
            Label_0096: {
                if (a >= 24) {
                    if (a < 26) {
                        if ("samsung".equals(c0.c)) {
                            break Label_0096;
                        }
                        if ("XT1650".equals(c0.d)) {
                            break Label_0096;
                        }
                    }
                    if (a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        final String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            b2 = true;
                            break Label_0098;
                        }
                    }
                }
            }
            b2 = false;
        }
        if (!b2) {
            return 0;
        }
        int n;
        if (a < 17) {
            n = (b ? 1 : 0);
        }
        else {
            final String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
            n = (b ? 1 : 0);
            if (eglQueryString2 != null) {
                n = (b ? 1 : 0);
                if (eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                    n = 1;
                }
            }
        }
        if (n != 0) {
            return 1;
        }
        return 2;
    }
    
    public static d b(Context j, final boolean b) {
        final int n = 0;
        boolean b3 = false;
        Label_0066: {
            if (b) {
                synchronized (d.class) {
                    if (!d.j) {
                        d.i = a(j);
                        d.j = true;
                    }
                    final boolean b2 = d.i != 0;
                    monitorexit(d.class);
                    if (!b2) {
                        b3 = false;
                        break Label_0066;
                    }
                }
            }
            b3 = true;
        }
        b.H(b3);
        j = (Context)new a();
        int i;
        if (b) {
            i = d.i;
        }
        else {
            i = 0;
        }
        ((Thread)j).start();
        final Handler g = new Handler(((HandlerThread)j).getLooper(), (Handler$Callback)j);
        ((a)j).g = g;
        ((a)j).f = new EGLSurfaceTexture(g);
        synchronized (j) {
            ((a)j).g.obtainMessage(1, i, 0).sendToTarget();
            int n2 = n;
            while (((a)j).j == null && ((a)j).i == null && ((a)j).h == null) {
                try {
                    j.wait();
                }
                catch (final InterruptedException ex) {
                    n2 = 1;
                }
            }
            monitorexit(j);
            if (n2 != 0) {
                Thread.currentThread().interrupt();
            }
            final RuntimeException k = ((a)j).i;
            if (k != null) {
                throw k;
            }
            final Error h = ((a)j).h;
            if (h == null) {
                j = (Context)((a)j).j;
                j.getClass();
                return (d)j;
            }
            throw h;
        }
    }
    
    public final void release() {
        super.release();
        synchronized (this.g) {
            if (!this.h) {
                final a g = this.g;
                g.g.getClass();
                g.g.sendEmptyMessage(2);
                this.h = true;
            }
        }
    }
    
    public static final class a extends HandlerThread implements Handler$Callback
    {
        public EGLSurfaceTexture f;
        public Handler g;
        public Error h;
        public RuntimeException i;
        public d j;
        
        public a() {
            super("ExoPlayer:DummySurface");
        }
        
        public final void a(final int n) {
            this.f.getClass();
            final EGLSurfaceTexture f = this.f;
            f.getClass();
            boolean b = false;
            final EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
            if (eglGetDisplay == null) {
                throw new EGLSurfaceTexture$GlException("eglGetDisplay failed", (EGLSurfaceTexture$a)null);
            }
            final int[] array = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, array, 0, array, 1)) {
                f.h = eglGetDisplay;
                final EGLConfig[] array2 = { null };
                final int[] array3 = { 0 };
                final boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, EGLSurfaceTexture.l, 0, array2, 0, 1, array3, 0);
                if (eglChooseConfig && array3[0] > 0) {
                    final EGLConfig eglConfig = array2[0];
                    if (eglConfig != null) {
                        final EGLDisplay h = f.h;
                        int[] array4;
                        if (n == 0) {
                            final int[] array5;
                            array4 = (array5 = new int[3]);
                            array5[0] = 12440;
                            array5[array5[1] = 2] = 12344;
                        }
                        else {
                            final int[] array6;
                            array4 = (array6 = new int[5]);
                            array6[0] = 12440;
                            array6[array6[1] = 2] = 12992;
                            array6[3] = 1;
                            array6[4] = 12344;
                        }
                        final EGLContext eglCreateContext = EGL14.eglCreateContext(h, eglConfig, EGL14.EGL_NO_CONTEXT, array4, 0);
                        if (eglCreateContext == null) {
                            throw new EGLSurfaceTexture$GlException("eglCreateContext failed", (EGLSurfaceTexture$a)null);
                        }
                        f.i = eglCreateContext;
                        final EGLDisplay h2 = f.h;
                        EGLSurface j;
                        if (n == 1) {
                            j = EGL14.EGL_NO_SURFACE;
                        }
                        else {
                            int[] array7;
                            if (n == 2) {
                                final int[] array8;
                                array7 = (array8 = new int[7]);
                                array8[0] = 12375;
                                array8[1] = 1;
                                array8[2] = 12374;
                                array8[3] = 1;
                                array8[4] = 12992;
                                array8[5] = 1;
                                array8[6] = 12344;
                            }
                            else {
                                final int[] array9;
                                array7 = (array9 = new int[5]);
                                array9[0] = 12375;
                                array9[1] = 1;
                                array9[2] = 12374;
                                array9[3] = 1;
                                array9[4] = 12344;
                            }
                            j = EGL14.eglCreatePbufferSurface(h2, eglConfig, array7, 0);
                            if (j == null) {
                                throw new EGLSurfaceTexture$GlException("eglCreatePbufferSurface failed", (EGLSurfaceTexture$a)null);
                            }
                        }
                        if (EGL14.eglMakeCurrent(h2, j, j, eglCreateContext)) {
                            f.j = j;
                            GLES20.glGenTextures(1, f.g, 0);
                            GlUtil.b();
                            (f.k = new SurfaceTexture(f.g[0])).setOnFrameAvailableListener((SurfaceTexture$OnFrameAvailableListener)f);
                            final SurfaceTexture k = this.f.k;
                            k.getClass();
                            if (n != 0) {
                                b = true;
                            }
                            this.j = new d(this, k, b);
                            return;
                        }
                        throw new EGLSurfaceTexture$GlException("eglMakeCurrent failed", (EGLSurfaceTexture$a)null);
                    }
                }
                throw new EGLSurfaceTexture$GlException(c0.n("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", new Object[] { eglChooseConfig, array3[0], array2[0] }), (EGLSurfaceTexture$a)null);
            }
            throw new EGLSurfaceTexture$GlException("eglInitialize failed", (EGLSurfaceTexture$a)null);
        }
        
        public final void b() {
            this.f.getClass();
            final EGLSurfaceTexture f = this.f;
            f.f.removeCallbacks((Runnable)f);
            try {
                final SurfaceTexture k = f.k;
                if (k != null) {
                    k.release();
                    GLES20.glDeleteTextures(1, f.g, 0);
                }
            }
            finally {
                final EGLDisplay h = f.h;
                if (h != null && !h.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                    final EGLDisplay h2 = f.h;
                    final EGLSurface egl_NO_SURFACE = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(h2, egl_NO_SURFACE, egl_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                }
                final EGLSurface j = f.j;
                if (j != null && !j.equals((Object)EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(f.h, f.j);
                }
                final EGLContext i = f.i;
                if (i != null) {
                    EGL14.eglDestroyContext(f.h, i);
                }
                if (c0.a >= 19) {
                    EGL14.eglReleaseThread();
                }
                final EGLDisplay h3 = f.h;
                if (h3 != null && !h3.equals((Object)EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(f.h);
                }
                f.h = null;
                f.i = null;
                f.j = null;
                f.k = null;
            }
        }
        
        public final boolean handleMessage(final Message p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        android/os/Message.what:I
            //     4: istore_2       
            //     5: iload_2        
            //     6: iconst_1       
            //     7: if_icmpeq       51
            //    10: iload_2        
            //    11: iconst_2       
            //    12: if_icmpeq       17
            //    15: iconst_1       
            //    16: ireturn        
            //    17: aload_0        
            //    18: invokevirtual   cd/d$a.b:()V
            //    21: aload_0        
            //    22: invokevirtual   android/os/HandlerThread.quit:()Z
            //    25: pop            
            //    26: goto            41
            //    29: astore_1       
            //    30: ldc             "DummySurface"
            //    32: ldc             "Failed to release dummy surface"
            //    34: aload_1        
            //    35: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //    38: goto            21
            //    41: iconst_1       
            //    42: ireturn        
            //    43: astore_1       
            //    44: aload_0        
            //    45: invokevirtual   android/os/HandlerThread.quit:()Z
            //    48: pop            
            //    49: aload_1        
            //    50: athrow         
            //    51: aload_0        
            //    52: aload_1        
            //    53: getfield        android/os/Message.arg1:I
            //    56: invokevirtual   cd/d$a.a:(I)V
            //    59: aload_0        
            //    60: monitorenter   
            //    61: aload_0        
            //    62: invokevirtual   java/lang/Object.notify:()V
            //    65: aload_0        
            //    66: monitorexit    
            //    67: goto            131
            //    70: astore_1       
            //    71: aload_0        
            //    72: monitorexit    
            //    73: aload_1        
            //    74: athrow         
            //    75: astore_1       
            //    76: goto            138
            //    79: astore_1       
            //    80: ldc             "DummySurface"
            //    82: ldc             "Failed to initialize dummy surface"
            //    84: aload_1        
            //    85: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //    88: aload_0        
            //    89: aload_1        
            //    90: putfield        cd/d$a.h:Ljava/lang/Error;
            //    93: aload_0        
            //    94: monitorenter   
            //    95: aload_0        
            //    96: invokevirtual   java/lang/Object.notify:()V
            //    99: aload_0        
            //   100: monitorexit    
            //   101: goto            131
            //   104: astore_1       
            //   105: aload_0        
            //   106: monitorexit    
            //   107: aload_1        
            //   108: athrow         
            //   109: astore_1       
            //   110: ldc             "DummySurface"
            //   112: ldc             "Failed to initialize dummy surface"
            //   114: aload_1        
            //   115: invokestatic    ah0/b.U:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
            //   118: aload_0        
            //   119: aload_1        
            //   120: putfield        cd/d$a.i:Ljava/lang/RuntimeException;
            //   123: aload_0        
            //   124: monitorenter   
            //   125: aload_0        
            //   126: invokevirtual   java/lang/Object.notify:()V
            //   129: aload_0        
            //   130: monitorexit    
            //   131: iconst_1       
            //   132: ireturn        
            //   133: astore_1       
            //   134: aload_0        
            //   135: monitorexit    
            //   136: aload_1        
            //   137: athrow         
            //   138: aload_0        
            //   139: monitorenter   
            //   140: aload_0        
            //   141: invokevirtual   java/lang/Object.notify:()V
            //   144: aload_0        
            //   145: monitorexit    
            //   146: aload_1        
            //   147: athrow         
            //   148: astore_1       
            //   149: aload_0        
            //   150: monitorexit    
            //   151: aload_1        
            //   152: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                        
            //  -----  -----  -----  -----  ----------------------------
            //  17     21     29     41     Any
            //  30     38     43     51     Any
            //  51     59     109    138    Ljava/lang/RuntimeException;
            //  51     59     79     109    Ljava/lang/Error;
            //  51     59     75     153    Any
            //  61     67     70     75     Any
            //  71     73     70     75     Any
            //  80     93     75     153    Any
            //  95     101    104    109    Any
            //  105    107    104    109    Any
            //  110    123    75     153    Any
            //  125    131    133    138    Any
            //  134    136    133    138    Any
            //  140    146    148    153    Any
            //  149    151    148    153    Any
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 103, Size: 103
            //     at java.util.ArrayList.rangeCheck(Unknown Source)
            //     at java.util.ArrayList.get(Unknown Source)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3362)
            //     at com.strobel.decompiler.ast.AstBuilder.convertToAst(AstBuilder.java:3611)
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
