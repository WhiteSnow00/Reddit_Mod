// 
// Decompiled by Procyon v0.6.0
// 

package q3;

import w3.m;
import p3.d;
import java.io.File;
import android.content.res.Resources;
import p3.d$c;
import android.content.Context;
import java.lang.reflect.GenericDeclaration;
import android.util.Log;
import java.lang.reflect.Array;
import android.graphics.Typeface;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

public class j extends p
{
    public static Class<?> a;
    public static Constructor<?> b;
    public static Method c;
    public static Method d;
    public static boolean e;
    
    public static boolean g(final String ex, final boolean b, final int n, final Object o) {
        h();
        try {
            return (boolean)j.c.invoke(o, ex, n, b);
        }
        catch (final InvocationTargetException ex) {}
        catch (final IllegalAccessException ex2) {}
        throw new RuntimeException(ex);
    }
    
    public static void h() {
        if (j.e) {
            return;
        }
        j.e = true;
        Object method = null;
        GenericDeclaration forName = null;
        Object constructor = null;
        Method method2 = null;
        Label_0117: {
            try {
                forName = Class.forName("android.graphics.FontFamily");
                constructor = ((Class)forName).getConstructor((Class[])new Class[0]);
                method2 = ((Class)forName).getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>)forName, 1).getClass());
                break Label_0117;
            }
            catch (final NoSuchMethodException constructor) {}
            catch (final ClassNotFoundException ex) {}
            Log.e("TypefaceCompatApi21Impl", ((Constructor<?>)constructor).getClass().getName(), (Throwable)constructor);
            final NoSuchMethodException ex2 = null;
            forName = (method2 = null);
            constructor = method;
            method = ex2;
        }
        j.b = (Constructor<?>)constructor;
        j.a = (Class<?>)forName;
        j.c = method2;
        j.d = (Method)method;
    }
    
    public Typeface a(Context instance, d$c d, final Resources resources, int i) {
        h();
        try {
            final Object instance2 = j.b.newInstance(new Object[0]);
            final d.d[] a = d.a;
            final int length = a.length;
            i = 0;
            while (i < length) {
                final d.d d2 = a[i];
                d = (d$c)q.d((Context)instance);
                if (d == null) {
                    return null;
                }
                try {
                    if (!q.b((File)d, resources, d2.f)) {
                        return null;
                    }
                    if (!g(((File)d).getPath(), d2.c, d2.b, instance2)) {
                        return null;
                    }
                    ((File)d).delete();
                    ++i;
                    continue;
                }
                catch (final RuntimeException instance) {
                    return null;
                }
                finally {
                    ((File)d).delete();
                }
                break;
            }
            h();
            try {
                instance = (RuntimeException)Array.newInstance(j.a, 1);
                Array.set(instance, 0, instance2);
                instance = (RuntimeException)j.d.invoke(null, instance);
                return (Typeface)instance;
            }
            catch (final InvocationTargetException instance) {}
            catch (final IllegalAccessException ex) {}
            throw new RuntimeException(instance);
        }
        catch (final InvocationTargetException instance) {}
        catch (final InstantiationException instance) {}
        catch (final IllegalAccessException ex2) {}
        throw new RuntimeException(instance);
    }
    
    public Typeface b(final Context p0, final m[] p1, final int p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: arraylength    
        //     2: iconst_1       
        //     3: if_icmpge       8
        //     6: aconst_null    
        //     7: areturn        
        //     8: aload_0        
        //     9: iload_3        
        //    10: aload_2        
        //    11: invokevirtual   q3/p.f:(I[Lw3/m;)Lw3/m;
        //    14: astore_2       
        //    15: aload_1        
        //    16: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //    19: astore          4
        //    21: aload           4
        //    23: aload_2        
        //    24: getfield        w3/m.a:Landroid/net/Uri;
        //    27: ldc             "r"
        //    29: aconst_null    
        //    30: invokevirtual   android/content/ContentResolver.openFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
        //    33: astore          4
        //    35: aload           4
        //    37: ifnonnull       52
        //    40: aload           4
        //    42: ifnull          50
        //    45: aload           4
        //    47: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //    50: aconst_null    
        //    51: areturn        
        //    52: new             Ljava/lang/StringBuilder;
        //    55: astore_2       
        //    56: aload_2        
        //    57: invokespecial   java/lang/StringBuilder.<init>:()V
        //    60: aload_2        
        //    61: ldc             "/proc/self/fd/"
        //    63: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    66: pop            
        //    67: aload_2        
        //    68: aload           4
        //    70: invokevirtual   android/os/ParcelFileDescriptor.getFd:()I
        //    73: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //    76: pop            
        //    77: aload_2        
        //    78: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //    81: invokestatic    android/system/Os.readlink:(Ljava/lang/String;)Ljava/lang/String;
        //    84: astore          5
        //    86: aload           5
        //    88: invokestatic    android/system/Os.stat:(Ljava/lang/String;)Landroid/system/StructStat;
        //    91: getfield        android/system/StructStat.st_mode:I
        //    94: invokestatic    android/system/OsConstants.S_ISREG:(I)Z
        //    97: ifeq            117
        //   100: new             Ljava/io/File;
        //   103: astore_2       
        //   104: aload_2        
        //   105: aload           5
        //   107: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   110: goto            119
        //   113: astore_1       
        //   114: goto            192
        //   117: aconst_null    
        //   118: astore_2       
        //   119: aload_2        
        //   120: ifnull          145
        //   123: aload_2        
        //   124: invokevirtual   java/io/File.canRead:()Z
        //   127: ifne            133
        //   130: goto            145
        //   133: aload_2        
        //   134: invokestatic    android/graphics/Typeface.createFromFile:(Ljava/io/File;)Landroid/graphics/Typeface;
        //   137: astore_1       
        //   138: aload           4
        //   140: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   143: aload_1        
        //   144: areturn        
        //   145: new             Ljava/io/FileInputStream;
        //   148: astore_2       
        //   149: aload_2        
        //   150: aload           4
        //   152: invokevirtual   android/os/ParcelFileDescriptor.getFileDescriptor:()Ljava/io/FileDescriptor;
        //   155: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/FileDescriptor;)V
        //   158: aload_0        
        //   159: aload_1        
        //   160: aload_2        
        //   161: invokevirtual   q3/p.c:(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
        //   164: astore_1       
        //   165: aload_2        
        //   166: invokevirtual   java/io/FileInputStream.close:()V
        //   169: aload           4
        //   171: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   174: aload_1        
        //   175: areturn        
        //   176: astore_1       
        //   177: aload_2        
        //   178: invokevirtual   java/io/FileInputStream.close:()V
        //   181: goto            190
        //   184: astore_2       
        //   185: aload_1        
        //   186: aload_2        
        //   187: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   190: aload_1        
        //   191: athrow         
        //   192: aload           4
        //   194: invokevirtual   android/os/ParcelFileDescriptor.close:()V
        //   197: goto            206
        //   200: astore_2       
        //   201: aload_1        
        //   202: aload_2        
        //   203: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   206: aload_1        
        //   207: athrow         
        //   208: astore_1       
        //   209: aconst_null    
        //   210: areturn        
        //   211: astore_2       
        //   212: goto            117
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                           
        //  -----  -----  -----  -----  -------------------------------
        //  21     35     208    211    Ljava/io/IOException;
        //  45     50     208    211    Ljava/io/IOException;
        //  52     110    211    215    Landroid/system/ErrnoException;
        //  52     110    113    208    Any
        //  123    130    113    208    Any
        //  133    138    113    208    Any
        //  138    143    208    211    Ljava/io/IOException;
        //  145    158    113    208    Any
        //  158    165    176    192    Any
        //  165    169    113    208    Any
        //  169    174    208    211    Ljava/io/IOException;
        //  177    181    184    190    Any
        //  185    190    113    208    Any
        //  190    192    113    208    Any
        //  192    197    200    206    Any
        //  201    206    208    211    Ljava/io/IOException;
        //  206    208    208    211    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0052:
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
}
