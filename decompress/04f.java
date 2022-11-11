// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.concurrent.ArrayBlockingQueue;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadThread;
import android.view.View;
import android.util.AttributeSet;
import java.util.Objects;
import android.view.ViewGroup;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import android.os.Handler$Callback;
import android.os.Handler;
import android.view.LayoutInflater;

public final class 04f
{
    public LayoutInflater LIZ;
    public Handler LIZIZ;
    public c LIZJ;
    public Handler$Callback LIZLLL;
    
    static {
        Covode.recordClassIndex(546);
    }
    
    public 04f(final Context context) {
        this.LIZLLL = (Handler$Callback)new 04b(this);
        this.LIZ = new a(context);
        this.LIZIZ = new Handler(this.LIZLLL);
        this.LIZJ = c.LIZ;
    }
    
    public final void LIZ(final int lizj, final ViewGroup liziz, final d lj) {
        Objects.requireNonNull(lj, "callback argument may not be null!");
        b b;
        if ((b = this.LIZJ.LIZJ.LIZ()) == null) {
            b = new b();
        }
        b.LIZ = this;
        b.LIZJ = lizj;
        b.LIZIZ = liziz;
        b.LJ = lj;
        final c lizj2 = this.LIZJ;
        try {
            lizj2.LIZIZ.put(b);
        }
        catch (final InterruptedException ex) {
            throw new RuntimeException("Failed to enqueue async inflate request", ex);
        }
    }
    
    public static final class a extends LayoutInflater
    {
        public static final String[] LIZ;
        
        static {
            Covode.recordClassIndex(548);
            LIZ = new String[] { "android.widget.", "android.webkit.", "android.app." };
        }
        
        public a(final Context context) {
            super(context);
        }
        
        public final LayoutInflater cloneInContext(final Context context) {
            return new a(context);
        }
        
        public final View onCreateView(final String s, final AttributeSet set) {
            final String[] liz = a.LIZ;
            final int length = liz.length;
            int n = 0;
        Label_0042_Outer:
            while (true) {
                Label_0051: {
                    if (n >= length) {
                        break Label_0051;
                    }
                    final String s2 = liz[n];
                    while (true) {
                        try {
                            final View view = this.createView(s, s2, set);
                            if (view != null) {
                                return view;
                            }
                            ++n;
                            continue Label_0042_Outer;
                            return super.onCreateView(s, set);
                        }
                        catch (final ClassNotFoundException ex) {
                            continue;
                        }
                        break;
                    }
                }
            }
        }
    }
    
    public static final class b
    {
        public 04f LIZ;
        public ViewGroup LIZIZ;
        public int LIZJ;
        public View LIZLLL;
        public d LJ;
        
        static {
            Covode.recordClassIndex(549);
        }
    }
    
    public interface d
    {
        default static {
            Covode.recordClassIndex(551);
        }
        
        void onInflateFinished(final View p0, final int p1, final ViewGroup p2);
    }
    
    public static final class c extends PthreadThread
    {
        public static final c LIZ;
        public ArrayBlockingQueue<b> LIZIZ;
        public 07T.c<b> LIZJ;
        
        static {
            Covode.recordClassIndex(550);
            (LIZ = new c()).start();
        }
        
        public c() {
            super("AsyncLayoutInflater$InflateThread");
            this.LIZIZ = new ArrayBlockingQueue<b>(10);
            this.LIZJ = (07T.c<b>)new 07T.c(10);
        }
        
        public final void run() {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: getfield        X/13e.LIZIZ:Ljava/util/concurrent/ArrayBlockingQueue;
            //     4: invokevirtual   java/util/concurrent/ArrayBlockingQueue.take:()Ljava/lang/Object;
            //     7: checkcast       LX/04d;
            //    10: astore_1       
            //    11: aload_1        
            //    12: aload_1        
            //    13: getfield        X/04d.LIZ:LX/04f;
            //    16: getfield        X/04f.LIZ:Landroid/view/LayoutInflater;
            //    19: aload_1        
            //    20: getfield        X/04d.LIZJ:I
            //    23: aload_1        
            //    24: getfield        X/04d.LIZIZ:Landroid/view/ViewGroup;
            //    27: iconst_0       
            //    28: invokestatic    X/0II.LIZ:(Landroid/view/LayoutInflater;ILandroid/view/ViewGroup;Z)Landroid/view/View;
            //    31: putfield        X/04d.LIZLLL:Landroid/view/View;
            //    34: aload_1        
            //    35: getfield        X/04d.LIZ:LX/04f;
            //    38: getfield        X/04f.LIZIZ:Landroid/os/Handler;
            //    41: iconst_0       
            //    42: aload_1        
            //    43: invokestatic    android/os/Message.obtain:(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;
            //    46: invokevirtual   android/os/Message.sendToTarget:()V
            //    49: goto            0
            //    52: astore_1       
            //    53: goto            0
            //    56: astore_2       
            //    57: goto            34
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                            
            //  -----  -----  -----  -----  --------------------------------
            //  0      11     52     56     Ljava/lang/InterruptedException;
            //  11     34     56     60     Ljava/lang/RuntimeException;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0034:
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
