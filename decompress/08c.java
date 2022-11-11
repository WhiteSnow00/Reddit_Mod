// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.io.IOException;
import java.io.Closeable;
import java.io.InputStream;
import android.os.CancellationSignal;
import android.content.res.Resources;
import android.content.Context;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.File;
import com.bytedance.sysoptimizer.TypeFaceLancet;
import com.bytedance.sysoptimizer.TypeFaceOptimizer;
import java.lang.reflect.Field;
import android.graphics.Typeface;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ConcurrentHashMap;

public class 08c
{
    public ConcurrentHashMap<Long, 06l.b> LJII;
    
    static {
        Covode.recordClassIndex(906);
    }
    
    public 08c() {
        this.LJII = new ConcurrentHashMap<Long, 06l.b>();
    }
    
    public static long LIZ(final Typeface typeface) {
        final long n = 0L;
        if (typeface == null) {
            return 0L;
        }
        try {
            final Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number)declaredField.get(typeface)).longValue();
        }
        catch (final NoSuchFieldException | IllegalAccessException ex) {
            return n;
        }
    }
    
    public static Typeface LIZ(final String s) {
        if (TypeFaceOptimizer.getSwitch() && s != null) {
            if (TypeFaceLancet.cache.contains(s)) {
                return TypeFaceLancet.cache.get(s);
            }
            final Typeface fromFile = Typeface.createFromFile(s);
            if (fromFile != null) {
                TypeFaceLancet.cache.put(s, fromFile);
                return fromFile;
            }
        }
        return Typeface.createFromFile(s);
    }
    
    public static <T> T LIZ(final T[] array, int n, final a<T> a) {
        int n2;
        if ((n & 0x1) == 0x0) {
            n2 = 400;
        }
        else {
            n2 = 700;
        }
        final boolean b = (n & 0x2) != 0x0;
        T t = null;
        n = Integer.MAX_VALUE;
        int n5;
        for (int length = array.length, i = 0; i < length; ++i, n = n5) {
            final T t2 = array[i];
            final int abs = Math.abs(a.LIZIZ(t2) - n2);
            int n3;
            if (a.LIZ(t2) == b) {
                n3 = 0;
            }
            else {
                n3 = 1;
            }
            final int n4 = abs * 2 + n3;
            if (t == null || (n5 = n) > n4) {
                t = t2;
                n5 = n4;
            }
        }
        return t;
    }
    
    public static boolean LIZ(final File file) {
        try {
            609 liz;
            if (NIJ.LIZIZ()) {
                liz = (609)SettingsManager.LIZ().LIZ("storage_intercepter_key", (Class)609.class, (Object)4F0.LIZ);
            }
            else {
                liz = 4F0.LIZ;
            }
            if (608.LIZ(file.getAbsolutePath(), liz)) {
                608.LIZ(file, (Throwable)new RuntimeException(), "exception_delete_log", 608.LIZ(liz));
            }
            if (608.LIZJ(file.getAbsolutePath(), liz)) {
                608.LIZ(file, (Throwable)new RuntimeException(), "exception_handle", 608.LIZ(liz));
                return false;
            }
            return file.delete();
        }
        finally {
            return file.delete();
        }
    }
    
    public 075.b LIZ(final 075.b[] array, final int n) {
        public final class 14n implements a<075.b>
        {
            static {
                Covode.recordClassIndex(907);
            }
        }
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iload_2        
        //     2: new             LX/14n;
        //     5: dup            
        //     6: invokespecial   X/14n.<init>:()V
        //     9: invokestatic    X/08c.LIZ:([Ljava/lang/Object;ILX/08b;)Ljava/lang/Object;
        //    12: checkcast       LX/073;
        //    15: areturn        
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
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
    
    public Typeface LIZ(final Context context, final 06l.b b, final Resources resources, final int n) {
        final 06l.c c = LIZ(b.LIZ, n, (a<06l.c>)new 14o());
        if (c == null) {
            return null;
        }
        final Typeface liz = 08a.LIZ(context, resources, c.LJFF, c.LIZ, n);
        final long liz2 = LIZ(liz);
        if (liz2 != 0L) {
            this.LJII.put(liz2, b);
        }
        return liz;
    }
    
    public Typeface LIZ(Context liz, final Resources resources, final int n, final String s, final int n2) {
        liz = (Context)08d.LIZ(liz);
        if (liz == null) {
            return null;
        }
        try {
            if (!08d.LIZ((File)liz, resources, n)) {
                return null;
            }
            return LIZ(((File)liz).getPath());
        }
        catch (final RuntimeException ex) {
            return null;
        }
        finally {
            LIZ((File)liz);
        }
    }
    
    public Typeface LIZ(final Context context, CancellationSignal cancellationSignal, final 075.b[] array, final int n) {
        final int length = array.length;
        final CancellationSignal cancellationSignal2 = null;
        if (length <= 0) {
            return null;
        }
        cancellationSignal = (CancellationSignal)this.LIZ(array, n);
        try {
            cancellationSignal = (CancellationSignal)context.getContentResolver().openInputStream(((075.b)cancellationSignal).LIZ);
            final 08c 08c = this;
            final Context context2 = context;
            final CancellationSignal cancellationSignal3 = cancellationSignal;
            final Typeface typeface = 08c.LIZ(context2, (InputStream)cancellationSignal3);
            final CancellationSignal cancellationSignal4 = cancellationSignal;
            08d.LIZ((Closeable)cancellationSignal4);
            return typeface;
        }
        catch (final IOException ex) {
            cancellationSignal = null;
        }
        finally {
            cancellationSignal = cancellationSignal2;
            goto Label_0055;
        }
        try {
            final 08c 08c = this;
            final Context context2 = context;
            final CancellationSignal cancellationSignal3 = cancellationSignal;
            final Typeface typeface = 08c.LIZ(context2, (InputStream)cancellationSignal3);
            final CancellationSignal cancellationSignal4 = cancellationSignal;
            08d.LIZ((Closeable)cancellationSignal4);
            return typeface;
        }
        catch (final IOException ex2) {
            goto Label_0064;
        }
    }
    
    public Typeface LIZ(Context liz, final InputStream inputStream) {
        liz = (Context)08d.LIZ(liz);
        if (liz == null) {
            return null;
        }
        try {
            if (!08d.LIZ((File)liz, inputStream)) {
                return null;
            }
            return LIZ(((File)liz).getPath());
        }
        catch (final RuntimeException ex) {
            return null;
        }
        finally {
            LIZ((File)liz);
        }
    }
    
    public interface a<T>
    {
        default static {
            Covode.recordClassIndex(909);
        }
        
        boolean LIZ(final T p0);
        
        int LIZIZ(final T p0);
    }
}
