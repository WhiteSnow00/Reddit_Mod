// 
// Decompiled by Procyon v0.6.0
// 

package ng;

import aj2.c;
import com.bluelinelabs.conductor.Controller;
import com.reddit.screen.BaseScreen;
import com.reddit.widget.bottomnav.BottomNavView$Item$Type;
import ah2.f;
import com.bluelinelabs.conductor.Router;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.content.Context;
import nf2.o;
import java.util.List;
import java.util.ArrayList;
import com.reddit.launch.bottomnav.e;
import qk.a;
import nf2.q;
import ig.m0;

public final class i implements m0, q
{
    public final /* synthetic */ int f;
    public Object g;
    public Object h;
    
    public i(final int f) {
        this.f = f;
        if (f != 3) {
            this.g = a.l();
            this.h = a.j();
            return;
        }
    }
    
    public i(final e e) {
        this.f = 5;
        this.h = new com.reddit.widget.bottomnav.a(e);
    }
    
    public i(final Object g) {
        this.f = 6;
        this.g = g;
        this.h = Thread.currentThread();
    }
    
    public i(final ArrayList g, final List h) {
        this.f = 1;
        if (g.size() == h.size() - 1) {
            this.g = g;
            this.h = h;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }
    
    public final void a(final o p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ng/i.g:Ljava/lang/Object;
        //     4: checkcast       Lrt/a;
        //     7: astore_2       
        //     8: aload_0        
        //     9: getfield        ng/i.h:Ljava/lang/Object;
        //    12: astore_3       
        //    13: aload_2        
        //    14: getfield        rt/a.b:Lrt/e;
        //    17: aload_3        
        //    18: invokeinterface rt/e.d:(Ljava/lang/Object;)Ljava/lang/String;
        //    23: astore          4
        //    25: aload_2        
        //    26: getfield        rt/a.a:Lst/b;
        //    29: checkcast       Lst/c;
        //    32: aload           4
        //    34: invokevirtual   st/c.a:(Ljava/lang/String;)Lst/a;
        //    37: getfield        st/a.b:Ljava/io/File;
        //    40: invokevirtual   java/io/File.exists:()Z
        //    43: ifeq            152
        //    46: aconst_null    
        //    47: astore_3       
        //    48: aconst_null    
        //    49: astore          5
        //    51: aload_2        
        //    52: getfield        rt/a.a:Lst/b;
        //    55: checkcast       Lst/c;
        //    58: aload           4
        //    60: invokevirtual   st/c.b:(Ljava/lang/String;)Lrk2/b0;
        //    63: astore_2       
        //    64: aload_2        
        //    65: astore          5
        //    67: aload_2        
        //    68: astore_3       
        //    69: aload_1        
        //    70: aload_2        
        //    71: invokeinterface nf2/o.onSuccess:(Ljava/lang/Object;)V
        //    76: aload_2        
        //    77: astore          5
        //    79: aload_2        
        //    80: astore_3       
        //    81: aload_1        
        //    82: invokeinterface nf2/o.onComplete:()V
        //    87: aload_2        
        //    88: astore_3       
        //    89: goto            111
        //    92: astore_1       
        //    93: goto            129
        //    96: astore_2       
        //    97: aload_3        
        //    98: astore          5
        //   100: aload_1        
        //   101: aload_2        
        //   102: invokeinterface nf2/o.onError:(Ljava/lang/Throwable;)V
        //   107: aload_3        
        //   108: ifnull          172
        //   111: aload_3        
        //   112: invokevirtual   rk2/b0.close:()V
        //   115: goto            172
        //   118: astore_1       
        //   119: aload_1        
        //   120: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   123: invokevirtual   java/lang/Throwable.printStackTrace:(Ljava/io/PrintStream;)V
        //   126: goto            172
        //   129: aload           5
        //   131: ifnull          150
        //   134: aload           5
        //   136: invokevirtual   rk2/b0.close:()V
        //   139: goto            150
        //   142: astore_3       
        //   143: aload_3        
        //   144: getstatic       java/lang/System.err:Ljava/io/PrintStream;
        //   147: invokevirtual   java/lang/Throwable.printStackTrace:(Ljava/io/PrintStream;)V
        //   150: aload_1        
        //   151: athrow         
        //   152: aload_1        
        //   153: new             Ljava/io/FileNotFoundException;
        //   156: dup            
        //   157: ldc             "resolvedKey does not resolve to a file"
        //   159: aload           4
        //   161: invokestatic    ak0/m.l:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   164: invokespecial   java/io/FileNotFoundException.<init>:(Ljava/lang/String;)V
        //   167: invokeinterface nf2/o.onError:(Ljava/lang/Throwable;)V
        //   172: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  51     64     96     111    Ljava/io/FileNotFoundException;
        //  51     64     92     152    Any
        //  69     76     96     111    Ljava/io/FileNotFoundException;
        //  69     76     92     152    Any
        //  81     87     96     111    Ljava/io/FileNotFoundException;
        //  81     87     92     152    Any
        //  100    107    92     152    Any
        //  111    115    118    129    Ljava/io/IOException;
        //  134    139    142    150    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 84, Size: 84
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
    
    public final boolean b() {
        final Context context = (Context)this.g;
        final String s = "";
        String packageName;
        if (context != null) {
            packageName = context.getApplicationContext().getPackageName();
        }
        else {
            packageName = "";
        }
        final String s2 = null;
        final boolean b = false;
        String s3 = null;
        Label_0257: {
            try {
                final Class<?> forName = Class.forName("android.os.SystemProperties");
                try {
                    final Method declaredMethod = forName.getDeclaredMethod("get", String.class);
                    final InvocationTargetException ex;
                    cl.a a2 = null;
                    String message = null;
                    Label_0159: {
                        InvocationTargetException ex2 = null;
                        Label_0152: {
                            cl.a a3;
                            try {
                                s3 = (String)declaredMethod.invoke(null, "debug.instabug.apm.app");
                                break Label_0257;
                            }
                            catch (final InvocationTargetException ex) {
                                final cl.a a = (cl.a)this.h;
                                ex2 = ex;
                                a2 = a;
                                if (ex.getMessage() == null) {
                                    break Label_0152;
                                }
                                a3 = a;
                            }
                            catch (final IllegalAccessException ex) {
                                final cl.a a4 = (cl.a)this.h;
                                ex2 = ex;
                                a2 = a4;
                                if (ex.getMessage() == null) {
                                    break Label_0152;
                                }
                                a3 = a4;
                            }
                            message = ex.getMessage();
                            a2 = a3;
                            break Label_0159;
                        }
                        message = "";
                        ex = ex2;
                    }
                    a2.b(message, (Throwable)ex);
                    s3 = s2;
                }
                catch (final NoSuchMethodException ex3) {
                    final cl.a a5 = (cl.a)this.h;
                    String message2;
                    if (ex3.getMessage() != null) {
                        message2 = ex3.getMessage();
                    }
                    else {
                        message2 = "";
                    }
                    a5.b(message2, (Throwable)ex3);
                    s3 = s2;
                }
            }
            catch (final ClassNotFoundException ex4) {
                final cl.a a6 = (cl.a)this.h;
                String message3 = s;
                if (ex4.getMessage() != null) {
                    message3 = ex4.getMessage();
                }
                a6.b(message3, (Throwable)ex4);
                s3 = s2;
            }
        }
        boolean b2 = b;
        if (!packageName.isEmpty()) {
            b2 = b;
            if (packageName.equals(s3)) {
                b2 = true;
            }
        }
        return b2;
    }
    
    public final Router c() {
        final Router router = (Router)this.g;
        if (router != null) {
            return router;
        }
        ah2.f.n("router");
        throw null;
    }
    
    public final BaseScreen d(final BottomNavView$Item$Type bottomNavView$Item$Type) {
        ah2.f.f((Object)bottomNavView$Item$Type, "tabType");
        final com.reddit.widget.bottomnav.a a = (com.reddit.widget.bottomnav.a)this.h;
        a.getClass();
        final String s = a.c.get(bottomNavView$Item$Type);
        BaseScreen baseScreen = null;
        if (s == null) {
            return null;
        }
        final Controller g = this.c().g(s);
        if (g != null) {
            baseScreen = (BaseScreen)g;
        }
        return baseScreen;
    }
    
    @Override
    public final String toString() {
        switch (this.f) {
            default: {
                return super.toString();
            }
            case 3: {
                final StringBuilder sb = new StringBuilder();
                sb.append((String)this.g);
                sb.append(" - ");
                sb.append((String)this.h);
                return sb.toString();
            }
        }
    }
}
