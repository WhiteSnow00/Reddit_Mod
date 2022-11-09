// 
// Decompiled by Procyon v0.6.0
// 

package androidx.profileinstaller;

import java.util.concurrent.Executor;
import android.content.Context;
import java.io.IOException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.File;
import android.content.pm.PackageInfo;

public final class b
{
    public static final b$a a;
    public static final b$b b;
    
    static {
        a = new b$a();
        b = new b$b();
    }
    
    public static void a(final PackageInfo packageInfo, File file) {
        final File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            file = (File)new DataOutputStream(new FileOutputStream(file2));
            try {
                ((DataOutputStream)file).writeLong(packageInfo.lastUpdateTime);
                ((OutputStream)file).close();
            }
            finally {
                try {
                    ((OutputStream)file).close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)packageInfo).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex) {}
    }
    
    public static void b(final Context p0, final Executor p1, final c p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //     4: astore          4
        //     6: aload           4
        //     8: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    11: astore          5
        //    13: aload           4
        //    15: invokevirtual   android/content/Context.getApplicationInfo:()Landroid/content/pm/ApplicationInfo;
        //    18: astore          6
        //    20: aload           4
        //    22: invokevirtual   android/content/Context.getAssets:()Landroid/content/res/AssetManager;
        //    25: astore          7
        //    27: new             Ljava/io/File;
        //    30: dup            
        //    31: aload           6
        //    33: getfield        android/content/pm/ApplicationInfo.sourceDir:Ljava/lang/String;
        //    36: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //    39: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //    42: astore          8
        //    44: aload_0        
        //    45: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    48: astore          6
        //    50: iconst_0       
        //    51: istore          9
        //    53: aload           6
        //    55: aload           5
        //    57: iconst_0       
        //    58: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    61: astore          6
        //    63: aload_0        
        //    64: invokevirtual   android/content/Context.getFilesDir:()Ljava/io/File;
        //    67: astore          4
        //    69: iconst_1       
        //    70: istore          10
        //    72: iload_3        
        //    73: ifne            243
        //    76: new             Ljava/io/File;
        //    79: dup            
        //    80: aload           4
        //    82: ldc             "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
        //    84: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    87: astore          11
        //    89: aload           11
        //    91: invokevirtual   java/io/File.exists:()Z
        //    94: ifne            100
        //    97: goto            207
        //   100: new             Ljava/io/DataInputStream;
        //   103: astore          12
        //   105: new             Ljava/io/FileInputStream;
        //   108: astore          13
        //   110: aload           13
        //   112: aload           11
        //   114: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   117: aload           12
        //   119: aload           13
        //   121: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   124: aload           12
        //   126: invokevirtual   java/io/DataInputStream.readLong:()J
        //   129: lstore          14
        //   131: aload           12
        //   133: invokevirtual   java/io/InputStream.close:()V
        //   136: lload           14
        //   138: aload           6
        //   140: getfield        android/content/pm/PackageInfo.lastUpdateTime:J
        //   143: lcmp           
        //   144: ifne            153
        //   147: iconst_1       
        //   148: istore          16
        //   150: goto            156
        //   153: iconst_0       
        //   154: istore          16
        //   156: iload           16
        //   158: istore          9
        //   160: iload           16
        //   162: ifeq            207
        //   165: aload_2        
        //   166: iconst_2       
        //   167: aconst_null    
        //   168: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   173: iload           16
        //   175: istore          9
        //   177: goto            207
        //   180: astore          13
        //   182: aload           12
        //   184: invokevirtual   java/io/InputStream.close:()V
        //   187: goto            199
        //   190: astore          12
        //   192: aload           13
        //   194: aload           12
        //   196: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   199: aload           13
        //   201: athrow         
        //   202: astore          12
        //   204: iconst_0       
        //   205: istore          9
        //   207: iload           9
        //   209: ifne            215
        //   212: goto            243
        //   215: ldc             "Skipping profile installation for "
        //   217: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   220: astore_1       
        //   221: aload_1        
        //   222: aload_0        
        //   223: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   226: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   229: pop            
        //   230: ldc             "ProfileInstaller"
        //   232: aload_1        
        //   233: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   236: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   239: pop            
        //   240: goto            1127
        //   243: ldc             "Installing profile for "
        //   245: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   248: astore          12
        //   250: aload           12
        //   252: aload_0        
        //   253: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //   256: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   259: pop            
        //   260: ldc             "ProfileInstaller"
        //   262: aload           12
        //   264: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   267: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   270: pop            
        //   271: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   274: istore          16
        //   276: new             Ljava/io/File;
        //   279: dup            
        //   280: new             Ljava/io/File;
        //   283: dup            
        //   284: ldc             "/data/misc/profiles/cur/0"
        //   286: aload           5
        //   288: invokespecial   java/io/File.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //   291: ldc             "primary.prof"
        //   293: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   296: astore_0       
        //   297: new             Landroidx/profileinstaller/a;
        //   300: dup            
        //   301: aload           7
        //   303: aload_1        
        //   304: aload_2        
        //   305: aload           8
        //   307: aload_0        
        //   308: invokespecial   androidx/profileinstaller/a.<init>:(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Landroidx/profileinstaller/b$c;Ljava/lang/String;Ljava/io/File;)V
        //   311: astore_1       
        //   312: aload_1        
        //   313: getfield        androidx/profileinstaller/a.d:[B
        //   316: ifnonnull       332
        //   319: aload_1        
        //   320: iconst_3       
        //   321: iload           16
        //   323: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   326: invokevirtual   androidx/profileinstaller/a.a:(ILjava/io/Serializable;)V
        //   329: goto            345
        //   332: aload_0        
        //   333: invokevirtual   java/io/File.canWrite:()Z
        //   336: ifne            351
        //   339: aload_1        
        //   340: iconst_4       
        //   341: aconst_null    
        //   342: invokevirtual   androidx/profileinstaller/a.a:(ILjava/io/Serializable;)V
        //   345: iconst_0       
        //   346: istore          16
        //   348: goto            359
        //   351: aload_1        
        //   352: iconst_1       
        //   353: putfield        androidx/profileinstaller/a.f:Z
        //   356: iconst_1       
        //   357: istore          16
        //   359: iload           16
        //   361: ifne            367
        //   364: goto            1127
        //   367: aload_1        
        //   368: getfield        androidx/profileinstaller/a.f:Z
        //   371: ifeq            1151
        //   374: aload_1        
        //   375: getfield        androidx/profileinstaller/a.d:[B
        //   378: ifnonnull       384
        //   381: goto            758
        //   384: aload           7
        //   386: ldc             "dexopt/baseline.prof"
        //   388: invokevirtual   android/content/res/AssetManager.openFd:(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //   391: astore_0       
        //   392: aload_0        
        //   393: invokevirtual   android/content/res/AssetFileDescriptor.createInputStream:()Ljava/io/FileInputStream;
        //   396: astore_2       
        //   397: getstatic       androidx/profileinstaller/c.a:[B
        //   400: aload_2        
        //   401: iconst_4       
        //   402: invokestatic    h5/c.b:(Ljava/io/InputStream;I)[B
        //   405: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   408: ifeq            437
        //   411: aload_1        
        //   412: aload_2        
        //   413: aload_2        
        //   414: iconst_4       
        //   415: invokestatic    h5/c.b:(Ljava/io/InputStream;I)[B
        //   418: aload           8
        //   420: invokestatic    androidx/profileinstaller/c.h:(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lh5/b;
        //   423: putfield        androidx/profileinstaller/a.g:[Lh5/b;
        //   426: aload_2        
        //   427: invokevirtual   java/io/InputStream.close:()V
        //   430: aload_0        
        //   431: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   434: goto            540
        //   437: new             Ljava/lang/IllegalStateException;
        //   440: astore          8
        //   442: aload           8
        //   444: ldc             "Invalid magic"
        //   446: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   449: aload           8
        //   451: athrow         
        //   452: astore          8
        //   454: aload_2        
        //   455: ifnull          472
        //   458: aload_2        
        //   459: invokevirtual   java/io/InputStream.close:()V
        //   462: goto            472
        //   465: astore_2       
        //   466: aload           8
        //   468: aload_2        
        //   469: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   472: aload           8
        //   474: athrow         
        //   475: astore_2       
        //   476: aload_0        
        //   477: ifnull          493
        //   480: aload_0        
        //   481: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   484: goto            493
        //   487: astore_0       
        //   488: aload_2        
        //   489: aload_0        
        //   490: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   493: aload_2        
        //   494: athrow         
        //   495: astore_0       
        //   496: aload_1        
        //   497: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   500: bipush          8
        //   502: aload_0        
        //   503: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   508: goto            540
        //   511: astore_0       
        //   512: aload_1        
        //   513: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   516: bipush          7
        //   518: aload_0        
        //   519: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   524: goto            540
        //   527: astore_0       
        //   528: aload_1        
        //   529: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   532: bipush          6
        //   534: aload_0        
        //   535: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   540: aload_1        
        //   541: getfield        androidx/profileinstaller/a.g:[Lh5/b;
        //   544: astore          8
        //   546: aload           8
        //   548: ifnull          758
        //   551: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   554: istore          16
        //   556: iload           16
        //   558: bipush          24
        //   560: if_icmpeq       583
        //   563: iload           16
        //   565: bipush          25
        //   567: if_icmpeq       583
        //   570: iload           16
        //   572: bipush          31
        //   574: if_icmpeq       583
        //   577: iconst_0       
        //   578: istore          16
        //   580: goto            586
        //   583: iconst_1       
        //   584: istore          16
        //   586: iload           16
        //   588: ifeq            758
        //   591: aload_1        
        //   592: getfield        androidx/profileinstaller/a.a:Landroid/content/res/AssetManager;
        //   595: ldc             "dexopt/baseline.profm"
        //   597: invokevirtual   android/content/res/AssetManager.openFd:(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //   600: astore_0       
        //   601: aload_0        
        //   602: invokevirtual   android/content/res/AssetFileDescriptor.createInputStream:()Ljava/io/FileInputStream;
        //   605: astore_2       
        //   606: getstatic       androidx/profileinstaller/c.b:[B
        //   609: aload_2        
        //   610: iconst_4       
        //   611: invokestatic    h5/c.b:(Ljava/io/InputStream;I)[B
        //   614: invokestatic    java/util/Arrays.equals:([B[B)Z
        //   617: ifeq            650
        //   620: aload_1        
        //   621: aload_2        
        //   622: aload_2        
        //   623: iconst_4       
        //   624: invokestatic    h5/c.b:(Ljava/io/InputStream;I)[B
        //   627: aload_1        
        //   628: getfield        androidx/profileinstaller/a.d:[B
        //   631: aload           8
        //   633: invokestatic    androidx/profileinstaller/c.e:(Ljava/io/FileInputStream;[B[B[Lh5/b;)[Lh5/b;
        //   636: putfield        androidx/profileinstaller/a.g:[Lh5/b;
        //   639: aload_2        
        //   640: invokevirtual   java/io/InputStream.close:()V
        //   643: aload_0        
        //   644: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   647: goto            758
        //   650: new             Ljava/lang/IllegalStateException;
        //   653: astore          8
        //   655: aload           8
        //   657: ldc             "Invalid magic"
        //   659: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   662: aload           8
        //   664: athrow         
        //   665: astore          8
        //   667: aload_2        
        //   668: ifnull          685
        //   671: aload_2        
        //   672: invokevirtual   java/io/InputStream.close:()V
        //   675: goto            685
        //   678: astore_2       
        //   679: aload           8
        //   681: aload_2        
        //   682: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   685: aload           8
        //   687: athrow         
        //   688: astore_2       
        //   689: aload_0        
        //   690: ifnull          706
        //   693: aload_0        
        //   694: invokevirtual   android/content/res/AssetFileDescriptor.close:()V
        //   697: goto            706
        //   700: astore_0       
        //   701: aload_2        
        //   702: aload_0        
        //   703: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   706: aload_2        
        //   707: athrow         
        //   708: astore_0       
        //   709: aload_1        
        //   710: aconst_null    
        //   711: putfield        androidx/profileinstaller/a.g:[Lh5/b;
        //   714: aload_1        
        //   715: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   718: bipush          8
        //   720: aload_0        
        //   721: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   726: goto            758
        //   729: astore_0       
        //   730: aload_1        
        //   731: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   734: bipush          7
        //   736: aload_0        
        //   737: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   742: goto            758
        //   745: astore_0       
        //   746: aload_1        
        //   747: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   750: bipush          9
        //   752: aload_0        
        //   753: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   758: aload_1        
        //   759: getfield        androidx/profileinstaller/a.g:[Lh5/b;
        //   762: astore_2       
        //   763: aload_1        
        //   764: getfield        androidx/profileinstaller/a.d:[B
        //   767: astore          8
        //   769: aload_2        
        //   770: ifnull          921
        //   773: aload           8
        //   775: ifnonnull       781
        //   778: goto            921
        //   781: aload_1        
        //   782: getfield        androidx/profileinstaller/a.f:Z
        //   785: ifeq            910
        //   788: new             Ljava/io/ByteArrayOutputStream;
        //   791: astore_0       
        //   792: aload_0        
        //   793: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
        //   796: aload_0        
        //   797: getstatic       androidx/profileinstaller/c.a:[B
        //   800: invokevirtual   java/io/OutputStream.write:([B)V
        //   803: aload_0        
        //   804: aload           8
        //   806: invokevirtual   java/io/OutputStream.write:([B)V
        //   809: aload_0        
        //   810: aload           8
        //   812: aload_2        
        //   813: invokestatic    androidx/profileinstaller/c.j:(Ljava/io/ByteArrayOutputStream;[B[Lh5/b;)Z
        //   816: ifne            842
        //   819: aload_1        
        //   820: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   823: iconst_5       
        //   824: aconst_null    
        //   825: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   830: aload_1        
        //   831: aconst_null    
        //   832: putfield        androidx/profileinstaller/a.g:[Lh5/b;
        //   835: aload_0        
        //   836: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   839: goto            921
        //   842: aload_1        
        //   843: aload_0        
        //   844: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
        //   847: putfield        androidx/profileinstaller/a.h:[B
        //   850: aload_0        
        //   851: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   854: goto            902
        //   857: astore_2       
        //   858: aload_0        
        //   859: invokevirtual   java/io/ByteArrayOutputStream.close:()V
        //   862: goto            871
        //   865: astore_0       
        //   866: aload_2        
        //   867: aload_0        
        //   868: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //   871: aload_2        
        //   872: athrow         
        //   873: astore_0       
        //   874: aload_1        
        //   875: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   878: bipush          8
        //   880: aload_0        
        //   881: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   886: goto            902
        //   889: astore_0       
        //   890: aload_1        
        //   891: getfield        androidx/profileinstaller/a.c:Landroidx/profileinstaller/b$c;
        //   894: bipush          7
        //   896: aload_0        
        //   897: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //   902: aload_1        
        //   903: aconst_null    
        //   904: putfield        androidx/profileinstaller/a.g:[Lh5/b;
        //   907: goto            921
        //   910: new             Ljava/lang/IllegalStateException;
        //   913: dup            
        //   914: ldc_w           "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
        //   917: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   920: athrow         
        //   921: aload_1        
        //   922: getfield        androidx/profileinstaller/a.h:[B
        //   925: astore_0       
        //   926: aload_0        
        //   927: ifnonnull       936
        //   930: iconst_0       
        //   931: istore          16
        //   933: goto            1115
        //   936: aload_1        
        //   937: getfield        androidx/profileinstaller/a.f:Z
        //   940: ifeq            1140
        //   943: new             Ljava/io/ByteArrayInputStream;
        //   946: astore_2       
        //   947: aload_2        
        //   948: aload_0        
        //   949: invokespecial   java/io/ByteArrayInputStream.<init>:([B)V
        //   952: new             Ljava/io/FileOutputStream;
        //   955: astore          8
        //   957: aload           8
        //   959: aload_1        
        //   960: getfield        androidx/profileinstaller/a.e:Ljava/io/File;
        //   963: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   966: sipush          512
        //   969: newarray        B
        //   971: astore_0       
        //   972: aload_2        
        //   973: aload_0        
        //   974: invokevirtual   java/io/InputStream.read:([B)I
        //   977: istore          16
        //   979: iload           16
        //   981: ifle            996
        //   984: aload           8
        //   986: aload_0        
        //   987: iconst_0       
        //   988: iload           16
        //   990: invokevirtual   java/io/OutputStream.write:([BII)V
        //   993: goto            972
        //   996: aload_1        
        //   997: iconst_1       
        //   998: aconst_null    
        //   999: invokevirtual   androidx/profileinstaller/a.a:(ILjava/io/Serializable;)V
        //  1002: aload           8
        //  1004: invokevirtual   java/io/OutputStream.close:()V
        //  1007: aload_2        
        //  1008: invokevirtual   java/io/InputStream.close:()V
        //  1011: aload_1        
        //  1012: aconst_null    
        //  1013: putfield        androidx/profileinstaller/a.h:[B
        //  1016: aload_1        
        //  1017: aconst_null    
        //  1018: putfield        androidx/profileinstaller/a.g:[Lh5/b;
        //  1021: iload           10
        //  1023: istore          16
        //  1025: goto            1115
        //  1028: astore_0       
        //  1029: goto            1056
        //  1032: astore_0       
        //  1033: goto            1037
        //  1036: astore_0       
        //  1037: aload           8
        //  1039: invokevirtual   java/io/OutputStream.close:()V
        //  1042: goto            1053
        //  1045: astore          8
        //  1047: aload_0        
        //  1048: aload           8
        //  1050: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1053: aload_0        
        //  1054: athrow         
        //  1055: astore_0       
        //  1056: aload_2        
        //  1057: invokevirtual   java/io/InputStream.close:()V
        //  1060: goto            1069
        //  1063: astore_2       
        //  1064: aload_0        
        //  1065: aload_2        
        //  1066: invokevirtual   java/lang/Throwable.addSuppressed:(Ljava/lang/Throwable;)V
        //  1069: aload_0        
        //  1070: athrow         
        //  1071: astore_0       
        //  1072: goto            1084
        //  1075: astore_0       
        //  1076: goto            1095
        //  1079: astore_0       
        //  1080: goto            1128
        //  1083: astore_0       
        //  1084: aload_1        
        //  1085: bipush          7
        //  1087: aload_0        
        //  1088: invokevirtual   androidx/profileinstaller/a.a:(ILjava/io/Serializable;)V
        //  1091: goto            1102
        //  1094: astore_0       
        //  1095: aload_1        
        //  1096: bipush          6
        //  1098: aload_0        
        //  1099: invokevirtual   androidx/profileinstaller/a.a:(ILjava/io/Serializable;)V
        //  1102: aload_1        
        //  1103: aconst_null    
        //  1104: putfield        androidx/profileinstaller/a.h:[B
        //  1107: aload_1        
        //  1108: aconst_null    
        //  1109: putfield        androidx/profileinstaller/a.g:[Lh5/b;
        //  1112: iconst_0       
        //  1113: istore          16
        //  1115: iload           16
        //  1117: ifeq            1127
        //  1120: aload           6
        //  1122: aload           4
        //  1124: invokestatic    androidx/profileinstaller/b.a:(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
        //  1127: return         
        //  1128: aload_1        
        //  1129: aconst_null    
        //  1130: putfield        androidx/profileinstaller/a.h:[B
        //  1133: aload_1        
        //  1134: aconst_null    
        //  1135: putfield        androidx/profileinstaller/a.g:[Lh5/b;
        //  1138: aload_0        
        //  1139: athrow         
        //  1140: new             Ljava/lang/IllegalStateException;
        //  1143: dup            
        //  1144: ldc_w           "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
        //  1147: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1150: athrow         
        //  1151: new             Ljava/lang/IllegalStateException;
        //  1154: dup            
        //  1155: ldc_w           "This device doesn't support aot. Did you call deviceSupportsAotProfile()?"
        //  1158: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1161: athrow         
        //  1162: astore_0       
        //  1163: aload_2        
        //  1164: bipush          7
        //  1166: aload_0        
        //  1167: invokeinterface androidx/profileinstaller/b$c.a:(ILjava/lang/Object;)V
        //  1172: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  53     63     1162   1173   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  100    124    202    207    Ljava/io/IOException;
        //  124    131    180    202    Any
        //  131    136    202    207    Ljava/io/IOException;
        //  182    187    190    199    Any
        //  192    199    202    207    Ljava/io/IOException;
        //  199    202    202    207    Ljava/io/IOException;
        //  384    392    527    540    Ljava/io/FileNotFoundException;
        //  384    392    511    527    Ljava/io/IOException;
        //  384    392    495    511    Ljava/lang/IllegalStateException;
        //  392    397    475    495    Any
        //  397    426    452    475    Any
        //  426    430    475    495    Any
        //  430    434    527    540    Ljava/io/FileNotFoundException;
        //  430    434    511    527    Ljava/io/IOException;
        //  430    434    495    511    Ljava/lang/IllegalStateException;
        //  437    452    452    475    Any
        //  458    462    465    472    Any
        //  466    472    475    495    Any
        //  472    475    475    495    Any
        //  480    484    487    493    Any
        //  488    493    527    540    Ljava/io/FileNotFoundException;
        //  488    493    511    527    Ljava/io/IOException;
        //  488    493    495    511    Ljava/lang/IllegalStateException;
        //  493    495    527    540    Ljava/io/FileNotFoundException;
        //  493    495    511    527    Ljava/io/IOException;
        //  493    495    495    511    Ljava/lang/IllegalStateException;
        //  591    601    745    758    Ljava/io/FileNotFoundException;
        //  591    601    729    745    Ljava/io/IOException;
        //  591    601    708    729    Ljava/lang/IllegalStateException;
        //  601    606    688    708    Any
        //  606    639    665    688    Any
        //  639    643    688    708    Any
        //  643    647    745    758    Ljava/io/FileNotFoundException;
        //  643    647    729    745    Ljava/io/IOException;
        //  643    647    708    729    Ljava/lang/IllegalStateException;
        //  650    665    665    688    Any
        //  671    675    678    685    Any
        //  679    685    688    708    Any
        //  685    688    688    708    Any
        //  693    697    700    706    Any
        //  701    706    745    758    Ljava/io/FileNotFoundException;
        //  701    706    729    745    Ljava/io/IOException;
        //  701    706    708    729    Ljava/lang/IllegalStateException;
        //  706    708    745    758    Ljava/io/FileNotFoundException;
        //  706    708    729    745    Ljava/io/IOException;
        //  706    708    708    729    Ljava/lang/IllegalStateException;
        //  788    796    889    902    Ljava/io/IOException;
        //  788    796    873    889    Ljava/lang/IllegalStateException;
        //  796    835    857    873    Any
        //  835    839    889    902    Ljava/io/IOException;
        //  835    839    873    889    Ljava/lang/IllegalStateException;
        //  842    850    857    873    Any
        //  850    854    889    902    Ljava/io/IOException;
        //  850    854    873    889    Ljava/lang/IllegalStateException;
        //  858    862    865    871    Any
        //  866    871    889    902    Ljava/io/IOException;
        //  866    871    873    889    Ljava/lang/IllegalStateException;
        //  871    873    889    902    Ljava/io/IOException;
        //  871    873    873    889    Ljava/lang/IllegalStateException;
        //  943    952    1094   1095   Ljava/io/FileNotFoundException;
        //  943    952    1083   1084   Ljava/io/IOException;
        //  943    952    1079   1083   Any
        //  952    966    1055   1056   Any
        //  966    972    1036   1037   Any
        //  972    979    1036   1037   Any
        //  984    993    1032   1036   Any
        //  996    1002   1032   1036   Any
        //  1002   1007   1028   1032   Any
        //  1007   1011   1075   1079   Ljava/io/FileNotFoundException;
        //  1007   1011   1071   1075   Ljava/io/IOException;
        //  1007   1011   1079   1083   Any
        //  1037   1042   1045   1053   Any
        //  1047   1053   1028   1032   Any
        //  1053   1055   1028   1032   Any
        //  1056   1060   1063   1069   Any
        //  1064   1069   1075   1079   Ljava/io/FileNotFoundException;
        //  1064   1069   1071   1075   Ljava/io/IOException;
        //  1064   1069   1079   1083   Any
        //  1069   1071   1075   1079   Ljava/io/FileNotFoundException;
        //  1069   1071   1071   1075   Ljava/io/IOException;
        //  1069   1071   1079   1083   Any
        //  1084   1091   1079   1083   Any
        //  1095   1102   1079   1083   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1037:
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
    
    public interface c
    {
        void a(final int p0, final Object p1);
    }
}
