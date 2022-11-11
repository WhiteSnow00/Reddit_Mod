// 
// Decompiled by Procyon v0.6.0
// 

package aa;

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
        return new File(context.getDir("lib", 0), a.k(a, ".", s));
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
        //     1: getfield        aa/e.a:Ljava/util/HashSet;
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
        //    21: invokestatic    aa/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //    24: return         
        //    25: aload_0        
        //    26: getfield        aa/e.b:Laa/c;
        //    29: checkcast       Laa/f;
        //    32: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    35: pop            
        //    36: aload_2        
        //    37: invokestatic    java/lang/System.loadLibrary:(Ljava/lang/String;)V
        //    40: aload_0        
        //    41: getfield        aa/e.a:Ljava/util/HashSet;
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
        //    63: invokestatic    aa/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
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
        //    83: invokestatic    aa/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
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
        //   100: invokestatic    aa/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   103: aload_0        
        //   104: aload_1        
        //   105: aload_2        
        //   106: aload_3        
        //   107: invokevirtual   aa/e.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   110: astore          5
        //   112: aload           5
        //   114: invokevirtual   java/io/File.exists:()Z
        //   117: ifeq            123
        //   120: goto            621
        //   123: aload_1        
        //   124: ldc             "lib"
        //   126: iconst_0       
        //   127: invokevirtual   android/content/Context.getDir:(Ljava/lang/String;I)Ljava/io/File;
        //   130: astore          6
        //   132: aload_0        
        //   133: aload_1        
        //   134: aload_2        
        //   135: aload_3        
        //   136: invokevirtual   aa/e.a:(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;
        //   139: astore          4
        //   141: aload           6
        //   143: new             Laa/d;
        //   146: dup            
        //   147: aload_0        
        //   148: getfield        aa/e.b:Laa/c;
        //   151: checkcast       Laa/f;
        //   154: aload_2        
        //   155: invokevirtual   aa/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   158: invokespecial   aa/d.<init>:(Ljava/lang/String;)V
        //   161: invokevirtual   java/io/File.listFiles:(Ljava/io/FilenameFilter;)[Ljava/io/File;
        //   164: astore          7
        //   166: aload           7
        //   168: ifnonnull       174
        //   171: goto            224
        //   174: aload           7
        //   176: arraylength    
        //   177: istore          8
        //   179: iconst_0       
        //   180: istore          9
        //   182: iload           9
        //   184: iload           8
        //   186: if_icmpge       224
        //   189: aload           7
        //   191: iload           9
        //   193: aaload         
        //   194: astore          6
        //   196: aload           6
        //   198: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   201: aload           4
        //   203: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   206: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   209: ifne            218
        //   212: aload           6
        //   214: invokevirtual   java/io/File.delete:()Z
        //   217: pop            
        //   218: iinc            9, 1
        //   221: goto            182
        //   224: aload_0        
        //   225: getfield        aa/e.c:Laa/b;
        //   228: astore          6
        //   230: aload_0        
        //   231: getfield        aa/e.b:Laa/c;
        //   234: checkcast       Laa/f;
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
        //   277: istore          9
        //   279: goto            285
        //   282: iconst_1       
        //   283: istore          9
        //   285: iload           9
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
        //   324: getfield        aa/e.b:Laa/c;
        //   327: checkcast       Laa/f;
        //   330: aload_2        
        //   331: invokevirtual   aa/f.a:(Ljava/lang/String;)Ljava/lang/String;
        //   334: astore          7
        //   336: aload           6
        //   338: checkcast       Laa/a;
        //   341: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   344: pop            
        //   345: aload_1        
        //   346: aload           4
        //   348: aload           7
        //   350: aload_0        
        //   351: invokestatic    aa/a.b:(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/String;Laa/e;)Laa/a$a;
        //   354: astore          6
        //   356: aload           6
        //   358: ifnull          673
        //   361: iconst_0       
        //   362: istore          9
        //   364: iload           9
        //   366: iconst_5       
        //   367: if_icmpge       607
        //   370: ldc             "Found %s! Extracting..."
        //   372: iconst_1       
        //   373: anewarray       Ljava/lang/Object;
        //   376: dup            
        //   377: iconst_0       
        //   378: aload           7
        //   380: aastore        
        //   381: invokestatic    aa/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   384: aload           5
        //   386: invokevirtual   java/io/File.exists:()Z
        //   389: ifne            407
        //   392: aload           5
        //   394: invokevirtual   java/io/File.createNewFile:()Z
        //   397: istore          10
        //   399: iload           10
        //   401: ifne            407
        //   404: goto            601
        //   407: aload           6
        //   409: getfield        aa/a$a.a:Ljava/util/zip/ZipFile;
        //   412: aload           6
        //   414: getfield        aa/a$a.b:Ljava/util/zip/ZipEntry;
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
        //   449: istore          8
        //   451: iload           8
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
        //   485: goto            592
        //   488: aload_1        
        //   489: invokestatic    aa/a.a:(Ljava/io/Closeable;)V
        //   492: aload           4
        //   494: invokestatic    aa/a.a:(Ljava/io/Closeable;)V
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
        //   522: getfield        aa/a$a.a:Ljava/util/zip/ZipFile;
        //   525: astore_1       
        //   526: aload_1        
        //   527: ifnull          621
        //   530: goto            617
        //   533: astore_1       
        //   534: goto            711
        //   537: aload           4
        //   539: aload           11
        //   541: iconst_0       
        //   542: iload           8
        //   544: invokevirtual   java/io/OutputStream.write:([BII)V
        //   547: lload           12
        //   549: iload           8
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
        //   568: goto            576
        //   571: astore_2       
        //   572: aconst_null    
        //   573: astore_1       
        //   574: aconst_null    
        //   575: astore_3       
        //   576: aload_1        
        //   577: invokestatic    aa/a.a:(Ljava/io/Closeable;)V
        //   580: aload_3        
        //   581: invokestatic    aa/a.a:(Ljava/io/Closeable;)V
        //   584: aload_2        
        //   585: athrow         
        //   586: astore_1       
        //   587: aconst_null    
        //   588: astore_1       
        //   589: aconst_null    
        //   590: astore          4
        //   592: aload_1        
        //   593: invokestatic    aa/a.a:(Ljava/io/Closeable;)V
        //   596: aload           4
        //   598: invokestatic    aa/a.a:(Ljava/io/Closeable;)V
        //   601: iinc            9, 1
        //   604: goto            364
        //   607: aload           6
        //   609: getfield        aa/a$a.a:Ljava/util/zip/ZipFile;
        //   612: astore_1       
        //   613: aload_1        
        //   614: ifnull          621
        //   617: aload_1        
        //   618: invokevirtual   java/util/zip/ZipFile.close:()V
        //   621: aload_0        
        //   622: getfield        aa/e.b:Laa/c;
        //   625: astore_1       
        //   626: aload           5
        //   628: invokevirtual   java/io/File.getAbsolutePath:()Ljava/lang/String;
        //   631: astore          4
        //   633: aload_1        
        //   634: checkcast       Laa/f;
        //   637: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   640: pop            
        //   641: aload           4
        //   643: invokestatic    java/lang/System.load:(Ljava/lang/String;)V
        //   646: aload_0        
        //   647: getfield        aa/e.a:Ljava/util/HashSet;
        //   650: aload_2        
        //   651: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   654: pop            
        //   655: ldc             "%s (%s) was re-linked!"
        //   657: iconst_2       
        //   658: anewarray       Ljava/lang/Object;
        //   661: dup            
        //   662: iconst_0       
        //   663: aload_2        
        //   664: aastore        
        //   665: dup            
        //   666: iconst_1       
        //   667: aload_3        
        //   668: aastore        
        //   669: invokestatic    aa/e.d:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   672: return         
        //   673: aload_1        
        //   674: aload           7
        //   676: invokestatic    aa/a.c:(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/String;
        //   679: astore_1       
        //   680: goto            696
        //   683: astore_2       
        //   684: iconst_1       
        //   685: anewarray       Ljava/lang/String;
        //   688: astore_1       
        //   689: aload_1        
        //   690: iconst_0       
        //   691: aload_2        
        //   692: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   695: aastore        
        //   696: new             Lcom/getkeepsafe/relinker/MissingLibraryException;
        //   699: astore_2       
        //   700: aload_2        
        //   701: aload           7
        //   703: aload           4
        //   705: aload_1        
        //   706: invokespecial   com/getkeepsafe/relinker/MissingLibraryException.<init>:(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)V
        //   709: aload_2        
        //   710: athrow         
        //   711: aload           6
        //   713: astore_2       
        //   714: goto            720
        //   717: astore_1       
        //   718: aconst_null    
        //   719: astore_2       
        //   720: aload_2        
        //   721: ifnull          737
        //   724: aload_2        
        //   725: getfield        aa/a$a.a:Ljava/util/zip/ZipFile;
        //   728: astore_2       
        //   729: aload_2        
        //   730: ifnull          737
        //   733: aload_2        
        //   734: invokevirtual   java/util/zip/ZipFile.close:()V
        //   737: aload_1        
        //   738: athrow         
        //   739: astore_1       
        //   740: goto            601
        //   743: astore          4
        //   745: goto            589
        //   748: astore          11
        //   750: goto            592
        //   753: astore_1       
        //   754: goto            621
        //   757: astore_2       
        //   758: goto            737
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                            
        //  -----  -----  -----  -----  --------------------------------
        //  25     66     67     761    Ljava/lang/UnsatisfiedLinkError;
        //  345    356    717    720    Any
        //  370    384    533    537    Any
        //  384    399    739    743    Ljava/io/IOException;
        //  384    399    533    537    Any
        //  407    421    586    589    Ljava/io/FileNotFoundException;
        //  407    421    586    589    Ljava/io/IOException;
        //  407    421    571    576    Any
        //  421    433    743    748    Ljava/io/FileNotFoundException;
        //  421    433    743    748    Ljava/io/IOException;
        //  421    433    565    568    Any
        //  433    440    748    753    Ljava/io/FileNotFoundException;
        //  433    440    748    753    Ljava/io/IOException;
        //  433    440    558    565    Any
        //  443    451    748    753    Ljava/io/FileNotFoundException;
        //  443    451    748    753    Ljava/io/IOException;
        //  443    451    558    565    Any
        //  457    477    748    753    Ljava/io/FileNotFoundException;
        //  457    477    748    753    Ljava/io/IOException;
        //  457    477    558    565    Any
        //  488    520    533    537    Any
        //  520    526    753    757    Ljava/io/IOException;
        //  537    547    748    753    Ljava/io/FileNotFoundException;
        //  537    547    748    753    Ljava/io/IOException;
        //  537    547    558    565    Any
        //  576    586    533    537    Any
        //  592    601    533    537    Any
        //  607    613    753    757    Ljava/io/IOException;
        //  617    621    753    757    Ljava/io/IOException;
        //  673    680    683    696    Ljava/lang/Exception;
        //  673    680    533    537    Any
        //  684    696    533    537    Any
        //  696    711    533    537    Any
        //  724    729    757    761    Ljava/io/IOException;
        //  733    737    757    761    Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 397, Size: 397
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
