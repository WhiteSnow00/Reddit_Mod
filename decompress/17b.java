// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.abmock.SettingsManager;
import java.nio.channels.ReadableByteChannel;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.nio.channels.Channels;
import com.bytedance.covode.number.Covode;
import java.io.File;
import android.content.Context;

public final class 17b implements 0Cj
{
    public 0Fl LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final File LIZLLL;
    public final int LJ;
    public final 0Cj LJFF;
    public boolean LJI;
    
    static {
        Covode.recordClassIndex(1724);
    }
    
    public 17b(final Context liziz, final String lizj, final File lizlll, final int lj, final 0Cj ljff) {
        this.LIZIZ = liziz;
        this.LIZJ = lizj;
        this.LIZLLL = lizlll;
        this.LJ = lj;
        this.LJFF = ljff;
    }
    
    public static File LIZ(final Context context) {
        if (5ek.LIZIZ == null || !5ek.LJ) {
            return 5ek.LIZIZ = context.getCacheDir();
        }
        return 5ek.LIZIZ;
    }
    
    private void LIZ(final File file) {
        ReadableByteChannel readableByteChannel;
        if (this.LIZJ != null) {
            readableByteChannel = Channels.newChannel(this.LIZIZ.getAssets().open(this.LIZJ));
        }
        else {
            if (this.LIZLLL == null) {
                throw new IllegalStateException("copyFromAssetPath and copyFromFile == null!");
            }
            readableByteChannel = new FileInputStream(this.LIZLLL).getChannel();
        }
        final File tempFile = File.createTempFile("room-copy-helper", ".tmp", LIZ(this.LIZIZ));
        LIZIZ(tempFile);
        0Fp.LIZ(readableByteChannel, new FileOutputStream(tempFile).getChannel());
        final File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            final StringBuilder sb = new StringBuilder("Failed to create directories for ");
            sb.append(file.getAbsolutePath());
            throw new IOException(sb.toString());
        }
        if (tempFile.renameTo(file)) {
            return;
        }
        final StringBuilder sb2 = new StringBuilder("Failed to move intermediate file (");
        sb2.append(tempFile.getAbsolutePath());
        sb2.append(") to destination (");
        sb2.append(file.getAbsolutePath());
        sb2.append(").");
        throw new IOException(sb2.toString());
    }
    
    public static void LIZIZ(final File file) {
        while (true) {
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
                    return;
                }
                file.deleteOnExit();
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    @Override
    public final String LIZ() {
        return this.LJFF.LIZ();
    }
    
    @Override
    public final void LIZ(final boolean b) {
        this.LJFF.LIZ(b);
    }
    
    @Override
    public final 0Ce LIZIZ() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: aload_0        
        //     3: getfield        X/17b.LJI:Z
        //     6: ifne            268
        //     9: aload_0        
        //    10: invokevirtual   X/17b.LIZ:()Ljava/lang/String;
        //    13: astore_1       
        //    14: aload_0        
        //    15: getfield        X/17b.LIZIZ:Landroid/content/Context;
        //    18: aload_1        
        //    19: invokevirtual   android/content/Context.getDatabasePath:(Ljava/lang/String;)Ljava/io/File;
        //    22: astore_2       
        //    23: aload_0        
        //    24: getfield        X/17b.LIZ:LX/0Fl;
        //    27: astore_3       
        //    28: aload_3        
        //    29: ifnull          48
        //    32: aload_3        
        //    33: getfield        X/0Fl.LJIIIZ:Z
        //    36: ifeq            42
        //    39: goto            48
        //    42: iconst_0       
        //    43: istore          4
        //    45: goto            51
        //    48: iconst_1       
        //    49: istore          4
        //    51: new             LX/0Fm;
        //    54: astore_3       
        //    55: aload_0        
        //    56: getfield        X/17b.LIZIZ:Landroid/content/Context;
        //    59: astore          5
        //    61: getstatic       X/5ek.LIZJ:Ljava/io/File;
        //    64: ifnull          73
        //    67: getstatic       X/5ek.LJ:Z
        //    70: ifne            81
        //    73: aload           5
        //    75: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    78: putstatic       X/5ek.LIZJ:Ljava/io/File;
        //    81: aload_3        
        //    82: aload_1        
        //    83: getstatic       X/5ek.LIZJ:Ljava/io/File;
        //    86: iload           4
        //    88: invokespecial   X/0Fm.<init>:(Ljava/lang/String;Ljava/io/File;Z)V
        //    91: aload_3        
        //    92: getfield        X/0Fm.LIZIZ:Ljava/util/concurrent/locks/Lock;
        //    95: invokeinterface java/util/concurrent/locks/Lock.lock:()V
        //   100: aload_3        
        //   101: getfield        X/0Fm.LIZJ:Z
        //   104: ifeq            155
        //   107: new             Ljava/io/FileOutputStream;
        //   110: astore          5
        //   112: aload           5
        //   114: aload_3        
        //   115: getfield        X/0Fm.LIZ:Ljava/io/File;
        //   118: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   121: aload_3        
        //   122: aload           5
        //   124: invokevirtual   java/io/FileOutputStream.getChannel:()Ljava/nio/channels/FileChannel;
        //   127: putfield        X/0Fm.LIZLLL:Ljava/nio/channels/FileChannel;
        //   130: aload_3        
        //   131: getfield        X/0Fm.LIZLLL:Ljava/nio/channels/FileChannel;
        //   134: invokevirtual   java/nio/channels/FileChannel.lock:()Ljava/nio/channels/FileLock;
        //   137: pop            
        //   138: goto            155
        //   141: astore_1       
        //   142: new             Ljava/lang/IllegalStateException;
        //   145: astore_2       
        //   146: aload_2        
        //   147: ldc             "Unable to grab copy lock."
        //   149: aload_1        
        //   150: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   153: aload_2        
        //   154: athrow         
        //   155: aload_2        
        //   156: invokevirtual   java/io/File.exists:()Z
        //   159: ifne            184
        //   162: aload_0        
        //   163: aload_2        
        //   164: invokespecial   X/17b.LIZ:(Ljava/io/File;)V
        //   167: goto            259
        //   170: astore_1       
        //   171: new             Ljava/lang/RuntimeException;
        //   174: astore_2       
        //   175: aload_2        
        //   176: ldc             "Unable to copy database file."
        //   178: aload_1        
        //   179: invokespecial   java/lang/RuntimeException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //   182: aload_2        
        //   183: athrow         
        //   184: aload_0        
        //   185: getfield        X/17b.LIZ:LX/0Fl;
        //   188: ifnonnull       194
        //   191: goto            259
        //   194: aload_2        
        //   195: invokestatic    X/0Fo.LIZ:(Ljava/io/File;)I
        //   198: istore          6
        //   200: aload_0        
        //   201: getfield        X/17b.LJ:I
        //   204: istore          7
        //   206: iload           6
        //   208: iload           7
        //   210: if_icmpne       216
        //   213: goto            259
        //   216: aload_0        
        //   217: getfield        X/17b.LIZ:LX/0Fl;
        //   220: iload           6
        //   222: iload           7
        //   224: invokevirtual   X/0Fl.LIZ:(II)Z
        //   227: ifeq            233
        //   230: goto            259
        //   233: aload_0        
        //   234: getfield        X/17b.LIZIZ:Landroid/content/Context;
        //   237: aload_1        
        //   238: invokevirtual   android/content/Context.deleteDatabase:(Ljava/lang/String;)Z
        //   241: ifeq            259
        //   244: aload_0        
        //   245: aload_2        
        //   246: invokespecial   X/17b.LIZ:(Ljava/io/File;)V
        //   249: goto            259
        //   252: astore_2       
        //   253: aload_3        
        //   254: invokevirtual   X/0Fm.LIZ:()V
        //   257: aload_2        
        //   258: athrow         
        //   259: aload_3        
        //   260: invokevirtual   X/0Fm.LIZ:()V
        //   263: aload_0        
        //   264: iconst_1       
        //   265: putfield        X/17b.LJI:Z
        //   268: aload_0        
        //   269: getfield        X/17b.LJFF:LX/0Cj;
        //   272: invokeinterface X/0Cj.LIZIZ:()LX/0Ce;
        //   277: astore_3       
        //   278: aload_0        
        //   279: monitorexit    
        //   280: aload_3        
        //   281: areturn        
        //   282: astore_3       
        //   283: aload_0        
        //   284: monitorexit    
        //   285: aload_3        
        //   286: athrow         
        //   287: astore_2       
        //   288: goto            259
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  2      28     282    287    Any
        //  32     39     282    287    Any
        //  51     73     282    287    Any
        //  73     81     282    287    Any
        //  81     91     282    287    Any
        //  91     107    252    259    Any
        //  107    138    141    155    Ljava/io/IOException;
        //  107    138    252    259    Any
        //  142    155    252    259    Any
        //  155    162    252    259    Any
        //  162    167    170    184    Ljava/io/IOException;
        //  162    167    252    259    Any
        //  171    184    252    259    Any
        //  184    191    252    259    Any
        //  194    200    287    291    Ljava/io/IOException;
        //  194    200    252    259    Any
        //  200    206    252    259    Any
        //  216    230    252    259    Any
        //  233    244    252    259    Any
        //  244    249    287    291    Ljava/io/IOException;
        //  244    249    252    259    Any
        //  253    259    282    287    Any
        //  259    268    282    287    Any
        //  268    278    282    287    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0194:
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
