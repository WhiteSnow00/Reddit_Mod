// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.nio.ByteBuffer;
import android.graphics.Typeface;
import android.net.Uri;
import java.nio.ByteOrder;
import android.os.CancellationSignal;
import android.content.pm.PackageManager$NameNotFoundException;
import android.database.ContentObserver;
import android.os.HandlerThread;
import android.os.Handler;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 151 extends 09K.c
{
    public static final a LJIIIIZZ;
    
    static {
        Covode.recordClassIndex(989);
        LJIIIIZZ = new a();
    }
    
    public 151(final Context context, final 06z 06z) {
        super(new b(context, 06z, 151.LJIIIIZZ));
    }
    
    public static final class a
    {
        static {
            Covode.recordClassIndex(990);
        }
    }
    
    public abstract static class c
    {
        static {
            Covode.recordClassIndex(995);
        }
        
        public abstract long LIZ();
    }
    
    public static final class b implements f
    {
        public g LIZ;
        public final Context LIZIZ;
        public final 06z LIZJ;
        public final Object LIZLLL;
        public Handler LJ;
        public HandlerThread LJFF;
        public 151.c LJI;
        public ContentObserver LJII;
        public Runnable LJIIIIZZ;
        
        static {
            Covode.recordClassIndex(991);
        }
        
        public b(Context liziz, final 06z lizj, final 151.a a) {
            this.LIZLLL = new Object();
            07U.LIZ(liziz, "Context cannot be null");
            07U.LIZ(lizj, "FontRequest cannot be null");
            liziz = ((Context)liziz).getApplicationContext();
            if (5WL.LIZIZ) {
                if (liziz == null) {
                    liziz = 5WL.LIZ;
                }
            }
            this.LIZIZ = (Context)liziz;
            this.LIZJ = lizj;
        }
        
        private 075.b LIZIZ() {
            try {
                final 075.a liz = 075.LIZ(this.LIZIZ, this.LIZJ);
                if (liz.LIZ != 0) {
                    final StringBuilder sb = new StringBuilder("fetchFonts failed (");
                    sb.append(liz.LIZ);
                    sb.append(")");
                    throw new RuntimeException(sb.toString());
                }
                final 075.b[] liziz = liz.LIZIZ;
                if (liziz != null && liziz.length != 0) {
                    return liziz[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            catch (final PackageManager$NameNotFoundException ex) {
                throw new RuntimeException("provider not found", (Throwable)ex);
            }
        }
        
        private void LIZJ() {
            this.LIZ = null;
            final ContentObserver ljii = this.LJII;
            if (ljii != null) {
                this.LIZIZ.getContentResolver().unregisterContentObserver(ljii);
                this.LJII = null;
            }
            synchronized (this.LIZLLL) {
                this.LJ.removeCallbacks(this.LJIIIIZZ);
                final HandlerThread ljff = this.LJFF;
                if (ljff != null) {
                    ljff.quit();
                }
                this.LJ = null;
                this.LJFF = null;
            }
        }
        
        public final void LIZ() {
            if (this.LIZ == null) {
                return;
            }
            try {
                final 075.b liziz = this.LIZIZ();
                final int lj = liziz.LJ;
                Label_0325: {
                    Label_0166: {
                        if (lj == 2) {
                            Label_0323: {
                                synchronized (this.LIZLLL) {
                                    final 151.c lji = this.LJI;
                                    if (lji == null) {
                                        break Label_0323;
                                    }
                                    final long liz = lji.LIZ();
                                    if (liz < 0L) {
                                        break Label_0323;
                                    }
                                    final Uri liz2 = liziz.LIZ;
                                    synchronized (this.LIZLLL) {
                                        if (this.LJII == null) {
                                            final 09S ljii = new 09S(this, this.LJ);
                                            this.LJII = ljii;
                                            this.LIZIZ.getContentResolver().registerContentObserver(liz2, false, (ContentObserver)ljii);
                                        }
                                        if (this.LJIIIIZZ == null) {
                                            this.LJIIIIZZ = new 09T(this);
                                        }
                                        this.LJ.postDelayed(this.LJIIIIZZ, liz);
                                        return;
                                    }
                                }
                                break Label_0166;
                            }
                            final Object o;
                            monitorexit(o);
                            break Label_0325;
                        }
                    }
                    if (lj == 0) {
                        final Typeface liz3 = 08a.LIZ(this.LIZIZ, new 075.b[] { liziz }, 0);
                        final ByteBuffer liz4 = 08d.LIZ(this.LIZIZ, null, liziz.LIZ);
                        if (liz4 != null) {
                            final g liz5 = this.LIZ;
                            final ByteBuffer duplicate = liz4.duplicate();
                            duplicate.position((int)09X.LIZ((09X.c)new 09X.a(duplicate)).LIZ);
                            final 16M 16M = new 16M();
                            duplicate.order(ByteOrder.LITTLE_ENDIAN);
                            16M.LIZ(duplicate.getInt(duplicate.position()) + duplicate.position(), duplicate);
                            liz5.LIZ(new 09Z(liz3, 16M));
                            this.LIZJ();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                }
                final StringBuilder sb = new StringBuilder("fetchFonts result is not OK. (");
                sb.append(lj);
                sb.append(")");
                throw new RuntimeException(sb.toString());
            }
            finally {
                final Throwable t;
                this.LIZ.LIZ(t);
                this.LIZJ();
            }
        }
        
        @Override
        public final void LIZ(final g g) {
            public final class 09R implements Runnable
            {
                public final /* synthetic */ g LIZ;
                public final /* synthetic */ b LIZIZ;
                
                static {
                    Covode.recordClassIndex(992);
                }
                
                public 09R(final b liziz, final g liz) {
                    this.LIZIZ = liziz;
                    this.LIZ = liz;
                }
                
                @Override
                public final void run() {
                    this.LIZIZ.LIZ = this.LIZ;
                    this.LIZIZ.LIZ();
                }
            }
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc_w           "LoaderCallback cannot be null"
            //     4: invokestatic    X/07U.LIZ:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
            //     7: pop            
            //     8: aload_0        
            //     9: getfield        X/150.LIZLLL:Ljava/lang/Object;
            //    12: astore_2       
            //    13: aload_2        
            //    14: monitorenter   
            //    15: aload_0        
            //    16: getfield        X/150.LJ:Landroid/os/Handler;
            //    19: ifnonnull       64
            //    22: new             Landroid/os/HandlerThread;
            //    25: astore_3       
            //    26: aload_3        
            //    27: ldc_w           "emojiCompat"
            //    30: bipush          10
            //    32: invokespecial   android/os/HandlerThread.<init>:(Ljava/lang/String;I)V
            //    35: aload_0        
            //    36: aload_3        
            //    37: putfield        X/150.LJFF:Landroid/os/HandlerThread;
            //    40: aload_3        
            //    41: invokevirtual   android/os/HandlerThread.start:()V
            //    44: new             Landroid/os/Handler;
            //    47: astore_3       
            //    48: aload_3        
            //    49: aload_0        
            //    50: getfield        X/150.LJFF:Landroid/os/HandlerThread;
            //    53: invokevirtual   android/os/HandlerThread.getLooper:()Landroid/os/Looper;
            //    56: invokespecial   android/os/Handler.<init>:(Landroid/os/Looper;)V
            //    59: aload_0        
            //    60: aload_3        
            //    61: putfield        X/150.LJ:Landroid/os/Handler;
            //    64: aload_0        
            //    65: getfield        X/150.LJ:Landroid/os/Handler;
            //    68: astore_3       
            //    69: new             LX/09R;
            //    72: astore          4
            //    74: aload           4
            //    76: aload_0        
            //    77: aload_1        
            //    78: invokespecial   X/09R.<init>:(LX/150;LX/09I;)V
            //    81: aload_3        
            //    82: aload           4
            //    84: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
            //    87: pop            
            //    88: aload_2        
            //    89: monitorexit    
            //    90: return         
            //    91: astore_1       
            //    92: aload_2        
            //    93: monitorexit    
            //    94: aload_1        
            //    95: athrow         
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type
            //  -----  -----  -----  -----  ----
            //  15     64     91     96     Any
            //  64     90     91     96     Any
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
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformSynchronized(AstMethodBodyBuilder.java:523)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:360)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
            //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
