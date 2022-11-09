// 
// Decompiled by Procyon v0.6.0
// 

package ba;

import java.io.File;
import android.content.Context;
import java.util.Locale;
import java.util.HashSet;

public final class e
{
    public final HashSet a;
    public final c b;
    public final b c;
    
    public e() {
        final f b = new f();
        final a c = new a();
        this.a = new HashSet();
        this.b = b;
        this.c = c;
    }
    
    public static void d(final String s, final Object... array) {
        String.format(Locale.US, s, array);
    }
    
    public final File a(final Context context, String a, final String s) {
        a = ((f)this.b).a(a);
        if (s == null || s.length() == 0) {
            return new File(context.getDir("lib", 0), a);
        }
        return new File(context.getDir("lib", 0), a40.f.n(a, ".", s));
    }
    
    public final void b(final Context context) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if ("twilio_video_android_so".length() != 0) {
            d("Beginning load of %s...", "twilio_video_android_so");
            this.c(context, "twilio_video_android_so", null);
            return;
        }
        throw new IllegalArgumentException("Given library is either null or empty");
    }
    
    public final void c(final Context p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        ba/e.a:Ljava/util/HashSet;
        //     4: aload_2        
        //     5: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //     8: ifeq            25
        //    11: ldc             "%s already loaded previously!"
        //    13: iconst_1       
        //    14: anewarray       Ljava/lang/Object;
        //    17: dup            
        //    18: iconst_0       
        //    19: aload_2        
        //    20: aastore        
        //    21: invokestatic    ba/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    24: return         
        //    25: aload_0        
        //    26: getfield        ba/e.b:Lba/c;
        //    29: checkcast       Lba/f;
        //    32: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    35: pop            
        //    36: aload_2        
        //    37: invokestatic    java/lang/System.loadLibrary:(Ljava/lang/String;)V
        //    40: aload_0        
        //    41: getfield        ba/e.a:Ljava/util/HashSet;
        //    44: aload_2        
        //    45: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //    48: pop            
        //    49: ldc             "%s (%s) was loaded normally!"
        //    51: iconst_2       
        //    52: anewarray       Ljava/lang/Object;
        //    55: dup            
        //    56: iconst_0       
        //    57: aload_2        
        //    58: aastore        
        //    59: dup            
        //    60: iconst_1       
        //    61: aload_3        
        //    62: aastore        
        //    63: invokestatic    ba/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    66: return         
        //    67: astore          4
        //    69: ldc             "Loading the library normally failed: %s"
        //    71: iconst_1       
        //    72: anewarray       Ljava/lang/Object;
        //    75: dup            
        //    76: iconst_0       
        //    77: aload           4
        //    79: invokestatic    android/util/Log.getStackTraceString:(Ljava/lang/Throwable;)Ljava/lang/String;
        //    82: aastore        
        //    83: invokestatic    ba/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    86: ldc             "%s (%s) was not loaded normally, re-linking..."
        //    88: iconst_2       
        //    89: anewarray       Ljava/lang/Object;
        //    92: dup            
        //    93: iconst_0       
        //    94: aload_2        
        //    95: aastore        
        //    96: dup            
        //    97: iconst_1       
        //    98: aload_3        
        //    99: aastore        
        //   100: invokestatic    ba/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   103: aload_0        
        //   104: aload_1        
        //   105: aload_2        
        //   106: aload_3        
        //   107: invokevirtual   ba/e.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   110: astore          5
        //   112: aload           5
        //   114: invokevirtual   java/io/File.exists:()Z
        //   117: ifeq            123
        //   120: goto            629
        //   123: aload_1        
        //   124: ldc             "lib"
        //   126: iconst_0       
        //   127: invokevirtual   android/content/Context.getDir:(Ljava/lang/String;I)Ljava/io/File;
        //   130: astore          6
        //   132: aload_0        
        //   133: aload_1        
        //   134: aload_2        
        //   135: aload_3        
        //   136: invokevirtual   ba/e.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   139: astore          4
        //   141: aload           6
        //   143: new             Lba/d;
        //   146: dup            
        //   147: aload_0        
        //   148: getfield        ba/e.b:Lba/c;
        //   151: checkcast       Lba/f;
        //   154: aload_2        
        //   155: invokevirtual   ba/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   158: invokespecial   ba/d.<init>:(Ljava/lang/String;)V
        //   161: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //   164: astore          6
        //   166: aload           6
        //   168: ifnonnull       174
        //   171: goto            224
        //   174: aload           6
        //   176: arraylength    
        //   177: istore          7
        //   179: iconst_0       
        //   180: istore          8
        //   182: iload           8
        //   184: iload           7
        //   186: if_icmpge       224
        //   189: aload           6
        //   191: iload           8
        //   193: aaload         
        //   194: astore          9
        //   196: aload           9
        //   198: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   201: aload           4
        //   203: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   206: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   209: ifne            218
        //   212: aload           9
        //   214: invokevirtual   java/io/File.delete:()Z
        //   217: pop            
        //   218: iinc            8, 1
        //   221: goto            182
        //   224: aload_0        
        //   225: getfield        ba/e.c:Lba/b;
        //   228: astore          6
        //   230: aload_0        
        //   231: getfield        ba/e.b:Lba/c;
        //   234: checkcast       Lba/f;
        //   237: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   240: pop            
        //   241: getstatic       android/os/Build.SUPPORTED_ABIS:[Ljava/lang/String;
        //   244: astore          4
        //   246: aload           4
        //   248: arraylength    
        //   249: ifle            255
        //   252: goto            323
        //   255: getstatic       android/os/Build.CPU_ABI2:Ljava/lang/String;
        //   258: astore          4
        //   260: aload           4
        //   262: ifnull          282
        //   265: aload           4
        //   267: invokevirtual   java/lang/String.length:()I
        //   270: ifne            276
        //   273: goto            282
        //   276: iconst_0       
        //   277: istore          8
        //   279: goto            285
        //   282: iconst_1       
        //   283: istore          8
        //   285: iload           8
        //   287: ifne            310
        //   290: iconst_2       
        //   291: anewarray       Ljava/lang/String;
        //   294: dup            
        //   295: iconst_0       
        //   296: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //   299: aastore        
        //   300: dup            
        //   301: iconst_1       
        //   302: aload           4
        //   304: aastore        
        //   305: astore          4
        //   307: goto            323
        //   310: iconst_1       
        //   311: anewarray       Ljava/lang/String;
        //   314: astore          4
        //   316: aload           4
        //   318: iconst_0       
        //   319: getstatic       android/os/Build.CPU_ABI:Ljava/lang/String;
        //   322: aastore        
        //   323: aload_0        
        //   324: getfield        ba/e.b:Lba/c;
        //   327: checkcast       Lba/f;
        //   330: aload_2        
        //   331: invokevirtual   ba/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   334: astore          9
        //   336: aload           6
        //   338: checkcast       Lba/a;
        //   341: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   344: pop            
        //   345: aload_1        
        //   346: aload           4
        //   348: aload           9
        //   350: aload_0        
        //   351: invokestatic    ba/a.b:(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Lba/e;)Lba/a$a;
        //   354: astore          6
        //   356: aload           6
        //   358: ifnull          681
        //   361: iconst_0       
        //   362: istore          8
        //   364: iload           8
        //   366: iconst_5       
        //   367: if_icmpge       615
        //   370: ldc             "Found %s! Extracting..."
        //   372: iconst_1       
        //   373: anewarray       Ljava/lang/Object;
        //   376: dup            
        //   377: iconst_0       
        //   378: aload           9
        //   380: aastore        
        //   381: invokestatic    ba/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   384: aload           5
        //   386: invokevirtual   java/io/File.exists:()Z
        //   389: ifne            407
        //   392: aload           5
        //   394: invokevirtual   java/io/File.createNewFile:()Z
        //   397: istore          10
        //   399: iload           10
        //   401: ifne            407
        //   404: goto            609
        //   407: aload           6
        //   409: getfield        ba/a$a.a:Ljava/util/zip/ZipFile;
        //   412: aload           6
        //   414: getfield        ba/a$a.b:Ljava/util/zip/ZipEntry;
        //   417: invokevirtual   java/util/zip/ZipFile.getInputStream:(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
        //   420: astore_1       
        //   421: new             Ljava/io/FileOutputStream;
        //   424: astore          4
        //   426: aload           4
        //   428: aload           5
        //   430: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   433: sipush          4096
        //   436: newarray        B
        //   438: astore          11
        //   440: lconst_0       
        //   441: lstore          12
        //   443: aload_1        
        //   444: aload           11
        //   446: invokevirtual   java/io/InputStream.read:([B)I
        //   449: istore          7
        //   451: iload           7
        //   453: iconst_m1      
        //   454: if_icmpne       537
        //   457: aload           4
        //   459: invokevirtual   java/io/OutputStream.flush:()V
        //   462: aload           4
        //   464: invokevirtual   java/io/FileOutputStream.getFD:()Ljava/io/FileDescriptor;
        //   467: invokevirtual   java/io/FileDescriptor.sync:()V
        //   470: aload           5
        //   472: invokevirtual   java/io/File.length:()J
        //   475: lstore          14
        //   477: lload           12
        //   479: lload           14
        //   481: lcmp           
        //   482: ifeq            488
        //   485: goto            600
        //   488: aload_1        
        //   489: invokestatic    ba/a.a:(Ljava/io/Closeable;)V
        //   492: aload           4
        //   494: invokestatic    ba/a.a:(Ljava/io/Closeable;)V
        //   497: aload           5
        //   499: iconst_1       
        //   500: iconst_0       
        //   501: invokevirtual   java/io/File.setReadable:(ZZ)Z
        //   504: pop            
        //   505: aload           5
        //   507: iconst_1       
        //   508: iconst_0       
        //   509: invokevirtual   java/io/File.setExecutable:(ZZ)Z
        //   512: pop            
        //   513: aload           5
        //   515: iconst_1       
        //   516: invokevirtual   java/io/File.setWritable:(Z)Z
        //   519: pop            
        //   520: aload           6
        //   522: getfield        ba/a$a.a:Ljava/util/zip/ZipFile;
        //   525: astore_1       
        //   526: aload_1        
        //   527: ifnull          629
        //   530: goto            625
        //   533: astore_1       
        //   534: goto            719
        //   537: aload           4
        //   539: aload           11
        //   541: iconst_0       
        //   542: iload           7
        //   544: invokevirtual   java/io/OutputStream.write:([BII)V
        //   547: lload           12
        //   549: iload           7
        //   551: i2l            
        //   552: ladd           
        //   553: lstore          12
        //   555: goto            443
        //   558: astore_2       
        //   559: aload           4
        //   561: astore_3       
        //   562: goto            568
        //   565: astore_2       
        //   566: aconst_null    
        //   567: astore_3       
        //   568: aload_1        
        //   569: astore          4
        //   571: aload_2        
        //   572: astore_1       
        //   573: aload           4
        //   575: astore_2       
        //   576: goto            584
        //   579: astore_1       
        //   580: aconst_null    
        //   581: astore_2       
        //   582: aconst_null    
        //   583: astore_3       
        //   584: aload_2        
        //   585: invokestatic    ba/a.a:(Ljava/io/Closeable;)V
        //   588: aload_3        
        //   589: invokestatic    ba/a.a:(Ljava/io/Closeable;)V
        //   592: aload_1        
        //   593: athrow         
        //   594: astore_1       
        //   595: aconst_null    
        //   596: astore_1       
        //   597: aconst_null    
        //   598: astore          4
        //   600: aload_1        
        //   601: invokestatic    ba/a.a:(Ljava/io/Closeable;)V
        //   604: aload           4
        //   606: invokestatic    ba/a.a:(Ljava/io/Closeable;)V
        //   609: iinc            8, 1
        //   612: goto            364
        //   615: aload           6
        //   617: getfield        ba/a$a.a:Ljava/util/zip/ZipFile;
        //   620: astore_1       
        //   621: aload_1        
        //   622: ifnull          629
        //   625: aload_1        
        //   626: invokevirtual   java/util/zip/ZipFile.close:()V
        //   629: aload_0        
        //   630: getfield        ba/e.b:Lba/c;
        //   633: astore_1       
        //   634: aload           5
        //   636: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   639: astore          4
        //   641: aload_1        
        //   642: checkcast       Lba/f;
        //   645: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   648: pop            
        //   649: aload           4
        //   651: invokestatic    java/lang/System.load:(Ljava/lang/String;)V
        //   654: aload_0        
        //   655: getfield        ba/e.a:Ljava/util/HashSet;
        //   658: aload_2        
        //   659: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   662: pop            
        //   663: ldc             "%s (%s) was re-linked!"
        //   665: iconst_2       
        //   666: anewarray       Ljava/lang/Object;
        //   669: dup            
        //   670: iconst_0       
        //   671: aload_2        
        //   672: aastore        
        //   673: dup            
        //   674: iconst_1       
        //   675: aload_3        
        //   676: aastore        
        //   677: invokestatic    ba/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   680: return         
        //   681: aload_1        
        //   682: aload           9
        //   684: invokestatic    ba/a.c:(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
        //   687: astore_1       
        //   688: goto            704
        //   691: astore_2       
        //   692: iconst_1       
        //   693: anewarray       Ljava/lang/String;
        //   696: astore_1       
        //   697: aload_1        
        //   698: iconst_0       
        //   699: aload_2        
        //   700: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   703: aastore        
        //   704: new             Lcom/getkeepsafe/relinker/MissingLibraryException;
        //   707: astore_2       
        //   708: aload_2        
        //   709: aload           9
        //   711: aload           4
        //   713: aload_1        
        //   714: invokespecial   com/getkeepsafe/relinker/MissingLibraryException.<init>:(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
        //   717: aload_2        
        //   718: athrow         
        //   719: aload           6
        //   721: astore_2       
        //   722: goto            728
        //   725: astore_1       
        //   726: aconst_null    
        //   727: astore_2       
        //   728: aload_2        
        //   729: ifnull          745
        //   732: aload_2        
        //   733: getfield        ba/a$a.a:Ljava/util/zip/ZipFile;
        //   736: astore_2       
        //   737: aload_2        
        //   738: ifnull          745
        //   741: aload_2        
        //   742: invokevirtual   java/util/zip/ZipFile.close:()V
        //   745: aload_1        
        //   746: athrow         
        //   747: astore_1       
        //   748: goto            609
        //   751: astore          4
        //   753: goto            597
        //   756: astore          11
        //   758: goto            600
        //   761: astore_1       
        //   762: goto            629
        //   765: astore_2       
        //   766: goto            745
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  25     66     67     769    Ljava/lang/UnsatisfiedLinkError;
        //  345    356    725    728    Any
        //  370    384    533    537    Any
        //  384    399    747    751    Ljava/io/IOException;
        //  384    399    533    537    Any
        //  407    421    594    597    Ljava/io/FileNotFoundException;
        //  407    421    594    597    Ljava/io/IOException;
        //  407    421    579    584    Any
        //  421    433    751    756    Ljava/io/FileNotFoundException;
        //  421    433    751    756    Ljava/io/IOException;
        //  421    433    565    568    Any
        //  433    440    756    761    Ljava/io/FileNotFoundException;
        //  433    440    756    761    Ljava/io/IOException;
        //  433    440    558    565    Any
        //  443    451    756    761    Ljava/io/FileNotFoundException;
        //  443    451    756    761    Ljava/io/IOException;
        //  443    451    558    565    Any
        //  457    477    756    761    Ljava/io/FileNotFoundException;
        //  457    477    756    761    Ljava/io/IOException;
        //  457    477    558    565    Any
        //  488    520    533    537    Any
        //  520    526    761    765    Ljava/io/IOException;
        //  537    547    756    761    Ljava/io/FileNotFoundException;
        //  537    547    756    761    Ljava/io/IOException;
        //  537    547    558    565    Any
        //  584    594    533    537    Any
        //  600    609    533    537    Any
        //  615    621    761    765    Ljava/io/IOException;
        //  625    629    761    765    Ljava/io/IOException;
        //  681    688    691    704    Ljava/lang/Exception;
        //  681    688    533    537    Any
        //  692    704    533    537    Any
        //  704    719    533    537    Any
        //  732    737    765    769    Ljava/io/IOException;
        //  741    745    765    769    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 403, Size: 403
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
