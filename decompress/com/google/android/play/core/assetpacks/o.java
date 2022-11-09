// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import java.util.Dictionary;
import java.io.OutputStream;
import java.io.FileOutputStream;
import eg.z;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.File;
import dg.k;

public final class o
{
    public static final k h;
    public final byte[] a;
    public final c b;
    public final String c;
    public final int d;
    public final long e;
    public final String f;
    public int g;
    
    static {
        h = new k("SliceMetadataManager");
    }
    
    public o(final c b, final String c, final int d, final long e, final String f) {
        this.a = new byte[8192];
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = -1;
    }
    
    public final int a() throws IOException {
        final c b = this.b;
        final String c = this.c;
        final int d = this.d;
        final long e = this.e;
        final String f = this.f;
        b.getClass();
        final File file = new File(new File(new File(new File(b.c(d, c, e), "_slices"), "_metadata"), f), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        final FileInputStream fileInputStream = new FileInputStream(file);
        try {
            final Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new zzck("Slice checkpoint file corrupt.");
        }
        finally {
            try {
                fileInputStream.close();
            }
            finally {}
        }
    }
    
    public final z b() throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/play/core/assetpacks/o.b:Lcom/google/android/play/core/assetpacks/c;
        //     4: astore_1       
        //     5: aload_0        
        //     6: getfield        com/google/android/play/core/assetpacks/o.c:Ljava/lang/String;
        //     9: astore_2       
        //    10: aload_0        
        //    11: getfield        com/google/android/play/core/assetpacks/o.d:I
        //    14: istore_3       
        //    15: aload_0        
        //    16: getfield        com/google/android/play/core/assetpacks/o.e:J
        //    19: lstore          4
        //    21: aload_0        
        //    22: getfield        com/google/android/play/core/assetpacks/o.f:Ljava/lang/String;
        //    25: astore          6
        //    27: aload_1        
        //    28: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    31: pop            
        //    32: new             Ljava/io/File;
        //    35: dup            
        //    36: new             Ljava/io/File;
        //    39: dup            
        //    40: new             Ljava/io/File;
        //    43: dup            
        //    44: new             Ljava/io/File;
        //    47: dup            
        //    48: aload_1        
        //    49: iload_3        
        //    50: aload_2        
        //    51: lload           4
        //    53: invokevirtual   com/google/android/play/core/assetpacks/c.c:(ILjava/lang/String;J)Ljava/io/File;
        //    56: ldc             "_slices"
        //    58: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    61: ldc             "_metadata"
        //    63: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    66: aload           6
        //    68: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    71: ldc             "checkpoint.dat"
        //    73: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    76: astore_2       
        //    77: aload_2        
        //    78: invokevirtual   java/io/File.exists:()Z
        //    81: ifeq            242
        //    84: new             Ljava/util/Properties;
        //    87: dup            
        //    88: invokespecial   java/util/Properties.<init>:()V
        //    91: astore_1       
        //    92: new             Ljava/io/FileInputStream;
        //    95: dup            
        //    96: aload_2        
        //    97: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   100: astore_2       
        //   101: aload_1        
        //   102: aload_2        
        //   103: invokevirtual   java/util/Properties.load:(Ljava/io/InputStream;)V
        //   106: aload_2        
        //   107: invokevirtual   java/io/InputStream.close:()V
        //   110: aload_1        
        //   111: ldc             "fileStatus"
        //   113: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   116: ifnull          225
        //   119: aload_1        
        //   120: ldc             "previousChunk"
        //   122: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   125: ifnull          225
        //   128: aload_1        
        //   129: ldc             "fileStatus"
        //   131: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   134: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   137: istore_3       
        //   138: aload_1        
        //   139: ldc             "fileName"
        //   141: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   144: astore_2       
        //   145: aload_1        
        //   146: ldc             "fileOffset"
        //   148: ldc             "-1"
        //   150: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   153: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   156: lstore          7
        //   158: aload_1        
        //   159: ldc             "remainingBytes"
        //   161: ldc             "-1"
        //   163: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   166: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   169: lstore          4
        //   171: aload_1        
        //   172: ldc             "previousChunk"
        //   174: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;)Ljava/lang/String;
        //   177: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   180: istore          9
        //   182: aload_0        
        //   183: aload_1        
        //   184: ldc             "metadataFileCounter"
        //   186: ldc             "0"
        //   188: invokevirtual   java/util/Properties.getProperty:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   191: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   194: putfield        com/google/android/play/core/assetpacks/o.g:I
        //   197: new             Leg/z;
        //   200: dup            
        //   201: iload_3        
        //   202: iload           9
        //   204: lload           7
        //   206: lload           4
        //   208: aload_2        
        //   209: invokespecial   eg/z.<init>:(IIJJLjava/lang/String;)V
        //   212: areturn        
        //   213: astore_1       
        //   214: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   217: dup            
        //   218: ldc             "Slice checkpoint file corrupt."
        //   220: aload_1        
        //   221: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   224: athrow         
        //   225: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   228: dup            
        //   229: ldc             "Slice checkpoint file corrupt."
        //   231: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;)V
        //   234: athrow         
        //   235: astore_1       
        //   236: aload_2        
        //   237: invokevirtual   java/io/InputStream.close:()V
        //   240: aload_1        
        //   241: athrow         
        //   242: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   245: dup            
        //   246: ldc             "Slice checkpoint file does not exist."
        //   248: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;)V
        //   251: athrow         
        //   252: astore_2       
        //   253: goto            240
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  101    106    235    242    Any
        //  128    197    213    225    Ljava/lang/NumberFormatException;
        //  236    240    252    256    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0240:
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
    
    public final File c() {
        final c b = this.b;
        final String c = this.c;
        final int d = this.d;
        final long e = this.e;
        final String f = this.f;
        b.getClass();
        final File file = new File(new File(new File(b.c(d, c, e), "_slices"), "_metadata"), f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, String.format("%s-NAM.dat", this.g));
    }
    
    public final void d(final int n) throws IOException {
        final Properties properties = new Properties();
        ((Dictionary<String, String>)properties).put("fileStatus", "3");
        ((Dictionary<String, String>)properties).put("fileOffset", String.valueOf(this.c().length()));
        ((Dictionary<String, String>)properties).put("previousChunk", String.valueOf(n));
        ((Dictionary<String, String>)properties).put("metadataFileCounter", String.valueOf(this.g));
        final FileOutputStream fileOutputStream = new FileOutputStream(this.j());
        try {
            properties.store(fileOutputStream, null);
            fileOutputStream.close();
        }
        finally {
            try {
                fileOutputStream.close();
            }
            finally {}
        }
    }
    
    public final void e(final int n, final long n2, final long n3, final String s) throws IOException {
        final Properties properties = new Properties();
        ((Dictionary<String, String>)properties).put("fileStatus", "1");
        ((Dictionary<String, String>)properties).put("fileName", s);
        ((Dictionary<String, String>)properties).put("fileOffset", String.valueOf(n2));
        ((Dictionary<String, String>)properties).put("remainingBytes", String.valueOf(n3));
        ((Dictionary<String, String>)properties).put("previousChunk", String.valueOf(n));
        ((Dictionary<String, String>)properties).put("metadataFileCounter", String.valueOf(this.g));
        final FileOutputStream fileOutputStream = new FileOutputStream(this.j());
        try {
            properties.store(fileOutputStream, null);
            fileOutputStream.close();
        }
        finally {
            try {
                fileOutputStream.close();
            }
            finally {}
        }
    }
    
    public final void f(final int p0, final byte[] p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: invokespecial   java/util/Properties.<init>:()V
        //     7: astore_3       
        //     8: aload_3        
        //     9: ldc             "fileStatus"
        //    11: ldc             "2"
        //    13: invokevirtual   java/util/Dictionary.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    16: pop            
        //    17: aload_3        
        //    18: ldc             "previousChunk"
        //    20: iload_1        
        //    21: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    24: invokevirtual   java/util/Dictionary.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    27: pop            
        //    28: aload_3        
        //    29: ldc             "metadataFileCounter"
        //    31: aload_0        
        //    32: getfield        com/google/android/play/core/assetpacks/o.g:I
        //    35: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //    38: invokevirtual   java/util/Dictionary.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    41: pop            
        //    42: new             Ljava/io/FileOutputStream;
        //    45: dup            
        //    46: aload_0        
        //    47: invokevirtual   com/google/android/play/core/assetpacks/o.j:()Ljava/io/File;
        //    50: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //    53: astore          4
        //    55: aload_3        
        //    56: aload           4
        //    58: aconst_null    
        //    59: invokevirtual   java/util/Properties.store:(Ljava/io/OutputStream;Ljava/lang/String;)V
        //    62: aload           4
        //    64: invokevirtual   java/io/OutputStream.close:()V
        //    67: aload_0        
        //    68: getfield        com/google/android/play/core/assetpacks/o.b:Lcom/google/android/play/core/assetpacks/c;
        //    71: astore          4
        //    73: aload_0        
        //    74: getfield        com/google/android/play/core/assetpacks/o.c:Ljava/lang/String;
        //    77: astore          5
        //    79: aload_0        
        //    80: getfield        com/google/android/play/core/assetpacks/o.d:I
        //    83: istore_1       
        //    84: aload_0        
        //    85: getfield        com/google/android/play/core/assetpacks/o.e:J
        //    88: lstore          6
        //    90: aload_0        
        //    91: getfield        com/google/android/play/core/assetpacks/o.f:Ljava/lang/String;
        //    94: astore_3       
        //    95: aload           4
        //    97: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   100: pop            
        //   101: new             Ljava/io/File;
        //   104: dup            
        //   105: new             Ljava/io/File;
        //   108: dup            
        //   109: new             Ljava/io/File;
        //   112: dup            
        //   113: new             Ljava/io/File;
        //   116: dup            
        //   117: aload           4
        //   119: iload_1        
        //   120: aload           5
        //   122: lload           6
        //   124: invokevirtual   com/google/android/play/core/assetpacks/c.c:(ILjava/lang/String;J)Ljava/io/File;
        //   127: ldc             "_slices"
        //   129: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   132: ldc             "_metadata"
        //   134: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   137: aload_3        
        //   138: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   141: ldc             "checkpoint_ext.dat"
        //   143: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   146: astore          4
        //   148: aload           4
        //   150: invokevirtual   java/io/File.exists:()Z
        //   153: ifeq            162
        //   156: aload           4
        //   158: invokevirtual   java/io/File.delete:()Z
        //   161: pop            
        //   162: new             Ljava/io/FileOutputStream;
        //   165: dup            
        //   166: aload           4
        //   168: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   171: astore          4
        //   173: aload           4
        //   175: aload_2        
        //   176: invokevirtual   java/io/OutputStream.write:([B)V
        //   179: aload           4
        //   181: invokevirtual   java/io/OutputStream.close:()V
        //   184: return         
        //   185: astore_2       
        //   186: aload           4
        //   188: invokevirtual   java/io/OutputStream.close:()V
        //   191: aload_2        
        //   192: athrow         
        //   193: astore_2       
        //   194: aload           4
        //   196: invokevirtual   java/io/OutputStream.close:()V
        //   199: aload_2        
        //   200: athrow         
        //   201: astore          4
        //   203: goto            191
        //   206: astore          4
        //   208: goto            199
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  55     62     193    201    Any
        //  173    179    185    193    Any
        //  186    191    201    206    Any
        //  194    199    206    211    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 105, Size: 105
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
    
    public final void g(final int n) throws IOException {
        final Properties properties = new Properties();
        ((Dictionary<String, String>)properties).put("fileStatus", "4");
        ((Dictionary<String, String>)properties).put("previousChunk", String.valueOf(n));
        ((Dictionary<String, String>)properties).put("metadataFileCounter", String.valueOf(this.g));
        final FileOutputStream fileOutputStream = new FileOutputStream(this.j());
        try {
            properties.store(fileOutputStream, null);
            fileOutputStream.close();
        }
        finally {
            try {
                fileOutputStream.close();
            }
            finally {}
        }
    }
    
    public final void h(final byte[] p0) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0        
        //     2: getfield        com/google/android/play/core/assetpacks/o.g:I
        //     5: iconst_1       
        //     6: iadd           
        //     7: putfield        com/google/android/play/core/assetpacks/o.g:I
        //    10: aload_0        
        //    11: getfield        com/google/android/play/core/assetpacks/o.b:Lcom/google/android/play/core/assetpacks/c;
        //    14: astore_2       
        //    15: aload_0        
        //    16: getfield        com/google/android/play/core/assetpacks/o.c:Ljava/lang/String;
        //    19: astore_3       
        //    20: aload_0        
        //    21: getfield        com/google/android/play/core/assetpacks/o.d:I
        //    24: istore          4
        //    26: aload_0        
        //    27: getfield        com/google/android/play/core/assetpacks/o.e:J
        //    30: lstore          5
        //    32: aload_0        
        //    33: getfield        com/google/android/play/core/assetpacks/o.f:Ljava/lang/String;
        //    36: astore          7
        //    38: aload_2        
        //    39: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    42: pop            
        //    43: new             Ljava/io/File;
        //    46: dup            
        //    47: new             Ljava/io/File;
        //    50: dup            
        //    51: new             Ljava/io/File;
        //    54: dup            
        //    55: aload_2        
        //    56: iload           4
        //    58: aload_3        
        //    59: lload           5
        //    61: invokevirtual   com/google/android/play/core/assetpacks/c.c:(ILjava/lang/String;J)Ljava/io/File;
        //    64: ldc             "_slices"
        //    66: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    69: ldc             "_metadata"
        //    71: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    74: aload           7
        //    76: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    79: astore          7
        //    81: aload           7
        //    83: invokevirtual   java/io/File.exists:()Z
        //    86: ifne            95
        //    89: aload           7
        //    91: invokevirtual   java/io/File.mkdirs:()Z
        //    94: pop            
        //    95: new             Ljava/io/File;
        //    98: dup            
        //    99: aload           7
        //   101: ldc             "%s-LFH.dat"
        //   103: iconst_1       
        //   104: anewarray       Ljava/lang/Object;
        //   107: dup            
        //   108: iconst_0       
        //   109: aload_0        
        //   110: getfield        com/google/android/play/core/assetpacks/o.g:I
        //   113: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   116: aastore        
        //   117: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   120: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   123: astore_3       
        //   124: new             Ljava/io/FileOutputStream;
        //   127: astore          7
        //   129: aload           7
        //   131: aload_3        
        //   132: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   135: aload           7
        //   137: aload_1        
        //   138: invokevirtual   java/io/FileOutputStream.write:([B)V
        //   141: aload           7
        //   143: invokevirtual   java/io/FileOutputStream.close:()V
        //   146: return         
        //   147: astore_1       
        //   148: aload           7
        //   150: invokevirtual   java/io/FileOutputStream.close:()V
        //   153: aload_1        
        //   154: athrow         
        //   155: astore_1       
        //   156: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   159: dup            
        //   160: ldc             "Could not write metadata file."
        //   162: aload_1        
        //   163: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;Ljava/lang/Exception;)V
        //   166: athrow         
        //   167: astore          7
        //   169: goto            153
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  124    135    155    167    Ljava/io/IOException;
        //  135    141    147    155    Any
        //  141    146    155    167    Ljava/io/IOException;
        //  148    153    167    172    Any
        //  153    155    155    167    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0153:
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
    
    public final void i(final InputStream inputStream, final byte[] array) throws IOException {
        ++this.g;
        final FileOutputStream fileOutputStream = new FileOutputStream(this.c());
        try {
            fileOutputStream.write(array);
            for (int i = inputStream.read(this.a); i > 0; i = inputStream.read(this.a)) {
                fileOutputStream.write(this.a, 0, i);
            }
            fileOutputStream.close();
        }
        finally {
            try {
                fileOutputStream.close();
            }
            finally {}
        }
    }
    
    public final File j() throws IOException {
        final c b = this.b;
        final String c = this.c;
        final int d = this.d;
        final long e = this.e;
        final String f = this.f;
        b.getClass();
        final File file = new File(new File(new File(new File(b.c(d, c, e), "_slices"), "_metadata"), f), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
