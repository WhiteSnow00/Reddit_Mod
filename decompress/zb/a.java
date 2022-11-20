// 
// Decompiled by Procyon v0.6.0
// 

package zb;

import java.util.List;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import com.google.android.exoplayer2.q$a;
import bd.c0;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.google.android.exoplayer2.q;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import com.google.android.exoplayer2.upstream.cache.a$b;
import java.lang.reflect.Constructor;
import android.util.SparseArray;

public final class a implements g
{
    public static final SparseArray<Constructor<? extends f>> c;
    public final a$b a;
    public final Executor b;
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   android/util/SparseArray.<init>:()V
        //     7: astore_0       
        //     8: aload_0        
        //     9: iconst_0       
        //    10: ldc             Lgc/b;.class
        //    12: invokestatic    zb/a.b:(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    15: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //    18: aload_0        
        //    19: iconst_2       
        //    20: ldc             Lic/a;.class
        //    22: invokestatic    zb/a.b:(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    25: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //    28: aload_0        
        //    29: iconst_1       
        //    30: ldc             Lmc/a;.class
        //    32: invokestatic    zb/a.b:(Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
        //    35: invokevirtual   android/util/SparseArray.put:(ILjava/lang/Object;)V
        //    38: aload_0        
        //    39: putstatic       zb/a.c:Landroid/util/SparseArray;
        //    42: return         
        //    43: astore_1       
        //    44: goto            18
        //    47: astore_1       
        //    48: goto            28
        //    51: astore_1       
        //    52: goto            38
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                              
        //  -----  -----  -----  -----  ----------------------------------
        //  8      18     43     47     Ljava/lang/ClassNotFoundException;
        //  18     28     47     51     Ljava/lang/ClassNotFoundException;
        //  28     38     51     55     Ljava/lang/ClassNotFoundException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 28, Size: 28
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
    
    public a(final a$b a, final ExecutorService b) {
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public static Constructor<? extends f> b(final Class<?> clazz) {
        try {
            return clazz.asSubclass(f.class).getConstructor(q.class, a$b.class, Executor.class);
        }
        catch (final NoSuchMethodException ex) {
            throw new IllegalStateException("Downloader constructor missing", ex);
        }
    }
    
    public final f a(final DownloadRequest downloadRequest) {
        final int f = c0.F(downloadRequest.g, downloadRequest.h);
        if (f == 0 || f == 1 || f == 2) {
            final Constructor constructor = (Constructor)zb.a.c.get(f);
            if (constructor != null) {
                final q$a q$a = new q$a();
                q$a.b = downloadRequest.g;
                final List i = downloadRequest.i;
                List<Object> f2;
                if (i != null && !i.isEmpty()) {
                    f2 = Collections.unmodifiableList((List<?>)new ArrayList<Object>(i));
                }
                else {
                    f2 = Collections.emptyList();
                }
                q$a.f = f2;
                q$a.g = downloadRequest.k;
                final q a = q$a.a();
                try {
                    return (f)constructor.newInstance(a, this.a, this.b);
                }
                catch (final Exception ex) {
                    throw new IllegalStateException(m5.a.c(61, "Failed to instantiate downloader for content type ", f));
                }
            }
            throw new IllegalStateException(m5.a.c(43, "Module missing for content type ", f));
        }
        if (f == 4) {
            final q$a q$a2 = new q$a();
            q$a2.b = downloadRequest.g;
            q$a2.g = downloadRequest.k;
            return new j(q$a2.a(), this.a, this.b);
        }
        throw new IllegalArgumentException(m5.a.c(29, "Unsupported type: ", f));
    }
}
