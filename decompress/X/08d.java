// 
// Decompiled by Procyon v0.6.0
// 

package X;

import android.os.ParcelFileDescriptor;
import com.bytedance.ies.abmock.SettingsManager;
import java.io.InputStream;
import java.io.Closeable;
import java.nio.MappedByteBuffer;
import android.content.ContentResolver;
import java.nio.channels.FileChannel;
import java.io.FileInputStream;
import android.net.Uri;
import android.os.CancellationSignal;
import java.nio.ByteBuffer;
import android.content.res.Resources;
import java.io.IOException;
import android.os.Process;
import java.io.File;
import android.content.Context;
import com.bytedance.covode.number.Covode;

public final class 08d
{
    static {
        Covode.recordClassIndex(910);
    }
    
    public static File LIZ(Context liziz) {
        if (5ek.LIZIZ == null || !5ek.LJ) {
            5ek.LIZIZ = liziz.getCacheDir();
        }
        liziz = (Context)5ek.LIZIZ;
        if (liziz == null) {
            return null;
        }
        final StringBuilder sb = new StringBuilder(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        final String string = sb.toString();
        int n = 0;
    Label_0125_Outer:
        while (true) {
            Label_0133: {
                if (n >= 100) {
                    break Label_0133;
                }
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(n);
                final File file = new File((File)liziz, sb2.toString());
                while (true) {
                    try {
                        if (file.createNewFile()) {
                            return file;
                        }
                        ++n;
                        continue Label_0125_Outer;
                        return null;
                    }
                    catch (final IOException ex) {
                        continue;
                    }
                    break;
                }
            }
        }
    }
    
    public static ByteBuffer LIZ(Context liz, final Resources resources, final int n) {
        liz = (Context)LIZ(liz);
        if (liz == null) {
            return null;
        }
        try {
            if (!LIZ((File)liz, resources, n)) {
                return null;
            }
            return LIZ((File)liz);
        }
        finally {
            LIZIZ((File)liz);
        }
    }
    
    public static ByteBuffer LIZ(Context openFileDescriptor, CancellationSignal cancellationSignal, final Uri uri) {
        final ContentResolver contentResolver = openFileDescriptor.getContentResolver();
        try {
            openFileDescriptor = (Context)contentResolver.openFileDescriptor(uri, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                cancellationSignal = (CancellationSignal)new FileInputStream(((ParcelFileDescriptor)openFileDescriptor).getFileDescriptor());
                try {
                    final FileChannel channel = ((FileInputStream)cancellationSignal).getChannel();
                    final MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    ((FileInputStream)cancellationSignal).close();
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                    return map;
                }
                finally {
                    try {
                        ((FileInputStream)cancellationSignal).close();
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)uri).addSuppressed(t);
                    }
                }
            }
            finally {
                try {
                    ((ParcelFileDescriptor)openFileDescriptor).close();
                }
                finally {
                    final Throwable t2;
                    ((Throwable)cancellationSignal).addSuppressed(t2);
                }
            }
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public static ByteBuffer LIZ(final File file) {
        try {
            final FileInputStream fileInputStream = new FileInputStream(file);
            try {
                final FileChannel channel = fileInputStream.getChannel();
                final MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                return map;
            }
            finally {
                try {
                    fileInputStream.close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)file).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {
            return null;
        }
    }
    
    public static void LIZ(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static boolean LIZ(final File file, Resources openRawResource, final int n) {
        Label_0025: {
            try {
                openRawResource = (Resources)openRawResource.openRawResource(n);
                final File file2 = file;
                final Resources resources = openRawResource;
                final boolean b = LIZ(file2, (InputStream)resources);
                final Resources resources2 = openRawResource;
                LIZ((Closeable)resources2);
                return b;
            }
            finally {
                openRawResource = null;
                break Label_0025;
            }
            try {
                final File file2 = file;
                final Resources resources = openRawResource;
                final boolean b = LIZ(file2, (InputStream)resources);
                final Resources resources2 = openRawResource;
                LIZ((Closeable)resources2);
                return b;
            }
            finally {}
        }
        LIZ((Closeable)openRawResource);
    }
    
    public static boolean LIZ(final File p0, final InputStream p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aconst_null    
        //     5: astore_3       
        //     6: aconst_null    
        //     7: astore          4
        //     9: new             Ljava/io/FileOutputStream;
        //    12: astore          5
        //    14: aload           5
        //    16: aload_0        
        //    17: iconst_0       
        //    18: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;Z)V
        //    21: sipush          1024
        //    24: newarray        B
        //    26: astore_0       
        //    27: aload_1        
        //    28: aload_0        
        //    29: invokevirtual   java/io/InputStream.read:([B)I
        //    32: istore          6
        //    34: iload           6
        //    36: iconst_m1      
        //    37: if_icmpeq       52
        //    40: aload           5
        //    42: aload_0        
        //    43: iconst_0       
        //    44: iload           6
        //    46: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //    49: goto            27
        //    52: aload           5
        //    54: invokestatic    X/08d.LIZ:(Ljava/io/Closeable;)V
        //    57: aload_2        
        //    58: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //    61: iconst_1       
        //    62: ireturn        
        //    63: astore_0       
        //    64: aload           4
        //    66: astore_1       
        //    67: goto            74
        //    70: astore_0       
        //    71: aload           5
        //    73: astore_1       
        //    74: aload_1        
        //    75: invokestatic    X/08d.LIZ:(Ljava/io/Closeable;)V
        //    78: aload_2        
        //    79: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //    82: aload_0        
        //    83: athrow         
        //    84: astore_0       
        //    85: aload           5
        //    87: invokestatic    X/08d.LIZ:(Ljava/io/Closeable;)V
        //    90: aload_2        
        //    91: invokestatic    android/os/StrictMode.setThreadPolicy:(Landroid/os/StrictMode$ThreadPolicy;)V
        //    94: iconst_0       
        //    95: ireturn        
        //    96: astore_0       
        //    97: aload_3        
        //    98: astore          5
        //   100: goto            85
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  9      21     96     103    Ljava/io/IOException;
        //  9      21     63     70     Any
        //  21     27     84     85     Ljava/io/IOException;
        //  21     27     70     74     Any
        //  27     34     84     85     Ljava/io/IOException;
        //  27     34     70     74     Any
        //  40     49     84     85     Ljava/io/IOException;
        //  40     49     70     74     Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0027:
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
    
    public static boolean LIZIZ(final File file) {
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
}
