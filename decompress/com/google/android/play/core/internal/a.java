// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.internal;

import java.nio.Buffer;
import java.util.Iterator;
import ig.t;
import ig.p0;
import java.nio.ByteOrder;
import ig.n0;
import ig.o0;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import ig.a0;
import java.security.PublicKey;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.InvalidKeyException;
import java.security.InvalidAlgorithmParameterException;
import java.security.SignatureException;
import java.util.Arrays;
import java.security.cert.CertificateException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.Signature;
import java.security.spec.KeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.security.KeyFactory;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import android.util.Pair;
import java.util.ArrayList;
import java.security.cert.CertificateFactory;
import java.util.HashMap;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import a2.b;
import java.io.IOException;
import java.security.cert.X509Certificate;

public final class a
{
    public static X509Certificate[][] a(final String p0) throws zzf, SecurityException, IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_0        
        //     5: ldc             "r"
        //     7: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/lang/String;Ljava/lang/String;)V
        //    10: astore_1       
        //    11: aload_1        
        //    12: invokevirtual   java/io/RandomAccessFile.length:()J
        //    15: lstore_2       
        //    16: iconst_0       
        //    17: istore          4
        //    19: lload_2        
        //    20: ldc2_w          22
        //    23: lcmp           
        //    24: ifge            32
        //    27: aconst_null    
        //    28: astore_0       
        //    29: goto            52
        //    32: aload_1        
        //    33: iconst_0       
        //    34: invokestatic    ig/p0.b:(Ljava/io/RandomAccessFile;I)Landroid/util/Pair;
        //    37: astore_0       
        //    38: aload_0        
        //    39: ifnull          45
        //    42: goto            52
        //    45: aload_1        
        //    46: ldc             65535
        //    48: invokestatic    ig/p0.b:(Ljava/io/RandomAccessFile;I)Landroid/util/Pair;
        //    51: astore_0       
        //    52: aload_0        
        //    53: ifnull          1257
        //    56: aload_0        
        //    57: getfield        android/util/Pair.first:Ljava/lang/Object;
        //    60: checkcast       Ljava/nio/ByteBuffer;
        //    63: astore          5
        //    65: aload_0        
        //    66: getfield        android/util/Pair.second:Ljava/lang/Object;
        //    69: checkcast       Ljava/lang/Long;
        //    72: invokevirtual   java/lang/Long.longValue:()J
        //    75: lstore_2       
        //    76: ldc2_w          -20
        //    79: lload_2        
        //    80: ladd           
        //    81: lstore          6
        //    83: lload           6
        //    85: lconst_0       
        //    86: lcmp           
        //    87: ifge            93
        //    90: goto            108
        //    93: aload_1        
        //    94: lload           6
        //    96: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //    99: aload_1        
        //   100: invokevirtual   java/io/RandomAccessFile.readInt:()I
        //   103: ldc             1347094023
        //   105: if_icmpeq       1245
        //   108: aload           5
        //   110: invokestatic    ig/p0.c:(Ljava/nio/ByteBuffer;)V
        //   113: aload           5
        //   115: aload           5
        //   117: invokevirtual   java/nio/Buffer.position:()I
        //   120: bipush          16
        //   122: iadd           
        //   123: invokevirtual   java/nio/ByteBuffer.getInt:(I)I
        //   126: i2l            
        //   127: ldc2_w          4294967295
        //   130: land           
        //   131: lstore          6
        //   133: lload           6
        //   135: lload_2        
        //   136: lcmp           
        //   137: ifge            1191
        //   140: aload           5
        //   142: invokestatic    ig/p0.c:(Ljava/nio/ByteBuffer;)V
        //   145: aload           5
        //   147: aload           5
        //   149: invokevirtual   java/nio/Buffer.position:()I
        //   152: bipush          12
        //   154: iadd           
        //   155: invokevirtual   java/nio/ByteBuffer.getInt:(I)I
        //   158: i2l            
        //   159: ldc2_w          4294967295
        //   162: land           
        //   163: lload           6
        //   165: ladd           
        //   166: lload_2        
        //   167: lcmp           
        //   168: ifne            1175
        //   171: lload           6
        //   173: ldc2_w          32
        //   176: lcmp           
        //   177: iflt            1134
        //   180: bipush          24
        //   182: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //   185: astore_0       
        //   186: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //   189: astore          8
        //   191: aload_0        
        //   192: aload           8
        //   194: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //   197: pop            
        //   198: aload_1        
        //   199: lload           6
        //   201: aload_0        
        //   202: invokevirtual   java/nio/Buffer.capacity:()I
        //   205: i2l            
        //   206: lsub           
        //   207: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   210: aload_1        
        //   211: aload_0        
        //   212: invokevirtual   java/nio/ByteBuffer.array:()[B
        //   215: aload_0        
        //   216: invokevirtual   java/nio/ByteBuffer.arrayOffset:()I
        //   219: aload_0        
        //   220: invokevirtual   java/nio/Buffer.capacity:()I
        //   223: invokevirtual   java/io/RandomAccessFile.readFully:([BII)V
        //   226: aload_0        
        //   227: bipush          8
        //   229: invokevirtual   java/nio/ByteBuffer.getLong:(I)J
        //   232: ldc2_w          2334950737559900225
        //   235: lcmp           
        //   236: ifne            1122
        //   239: aload_0        
        //   240: bipush          16
        //   242: invokevirtual   java/nio/ByteBuffer.getLong:(I)J
        //   245: ldc2_w          3617552046287187010
        //   248: lcmp           
        //   249: ifne            1122
        //   252: aload_0        
        //   253: iconst_0       
        //   254: invokevirtual   java/nio/ByteBuffer.getLong:(I)J
        //   257: lstore          9
        //   259: lload           9
        //   261: aload_0        
        //   262: invokevirtual   java/nio/Buffer.capacity:()I
        //   265: i2l            
        //   266: lcmp           
        //   267: iflt            1081
        //   270: lload           9
        //   272: ldc2_w          2147483639
        //   275: lcmp           
        //   276: ifgt            1081
        //   279: ldc2_w          8
        //   282: lload           9
        //   284: ladd           
        //   285: l2i            
        //   286: istore          11
        //   288: lload           6
        //   290: iload           11
        //   292: i2l            
        //   293: lsub           
        //   294: lstore          12
        //   296: lload           12
        //   298: lconst_0       
        //   299: lcmp           
        //   300: iflt            1040
        //   303: iload           11
        //   305: invokestatic    java/nio/ByteBuffer.allocate:(I)Ljava/nio/ByteBuffer;
        //   308: astore_0       
        //   309: aload_0        
        //   310: aload           8
        //   312: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //   315: pop            
        //   316: aload_1        
        //   317: lload           12
        //   319: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   322: aload_1        
        //   323: aload_0        
        //   324: invokevirtual   java/nio/ByteBuffer.array:()[B
        //   327: aload_0        
        //   328: invokevirtual   java/nio/ByteBuffer.arrayOffset:()I
        //   331: aload_0        
        //   332: invokevirtual   java/nio/Buffer.capacity:()I
        //   335: invokevirtual   java/io/RandomAccessFile.readFully:([BII)V
        //   338: aload_0        
        //   339: iconst_0       
        //   340: invokevirtual   java/nio/ByteBuffer.getLong:(I)J
        //   343: lstore          14
        //   345: lload           14
        //   347: lload           9
        //   349: lcmp           
        //   350: ifne            981
        //   353: aload_0        
        //   354: lload           12
        //   356: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   359: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //   362: astore          16
        //   364: aload           16
        //   366: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   369: checkcast       Ljava/nio/ByteBuffer;
        //   372: astore_0       
        //   373: aload           16
        //   375: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   378: checkcast       Ljava/lang/Long;
        //   381: invokevirtual   java/lang/Long.longValue:()J
        //   384: lstore          9
        //   386: aload_0        
        //   387: invokevirtual   java/nio/ByteBuffer.order:()Ljava/nio/ByteOrder;
        //   390: aload           8
        //   392: if_acmpne       969
        //   395: aload_0        
        //   396: invokevirtual   java/nio/Buffer.capacity:()I
        //   399: bipush          24
        //   401: isub           
        //   402: istore          11
        //   404: iload           11
        //   406: bipush          8
        //   408: if_icmplt       914
        //   411: aload_0        
        //   412: invokevirtual   java/nio/Buffer.capacity:()I
        //   415: istore          17
        //   417: iload           11
        //   419: aload_0        
        //   420: invokevirtual   java/nio/Buffer.capacity:()I
        //   423: if_icmpgt       855
        //   426: aload_0        
        //   427: invokevirtual   java/nio/Buffer.limit:()I
        //   430: istore          17
        //   432: aload_0        
        //   433: invokevirtual   java/nio/Buffer.position:()I
        //   436: istore          18
        //   438: aload_0        
        //   439: iconst_0       
        //   440: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   443: pop            
        //   444: aload_0        
        //   445: iload           11
        //   447: invokevirtual   java/nio/ByteBuffer.limit:(I)Ljava/nio/Buffer;
        //   450: pop            
        //   451: aload_0        
        //   452: bipush          8
        //   454: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   457: pop            
        //   458: aload_0        
        //   459: invokevirtual   java/nio/ByteBuffer.slice:()Ljava/nio/ByteBuffer;
        //   462: astore          8
        //   464: aload           8
        //   466: aload_0        
        //   467: invokevirtual   java/nio/ByteBuffer.order:()Ljava/nio/ByteOrder;
        //   470: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //   473: pop            
        //   474: aload_0        
        //   475: iconst_0       
        //   476: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   479: pop            
        //   480: aload_0        
        //   481: iload           17
        //   483: invokevirtual   java/nio/ByteBuffer.limit:(I)Ljava/nio/Buffer;
        //   486: pop            
        //   487: aload_0        
        //   488: iload           18
        //   490: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   493: pop            
        //   494: aload           8
        //   496: invokevirtual   java/nio/Buffer.hasRemaining:()Z
        //   499: ifeq            818
        //   502: iinc            4, 1
        //   505: aload           8
        //   507: invokevirtual   java/nio/Buffer.remaining:()I
        //   510: bipush          8
        //   512: if_icmplt       775
        //   515: aload           8
        //   517: invokevirtual   java/nio/ByteBuffer.getLong:()J
        //   520: lstore          14
        //   522: lload           14
        //   524: ldc2_w          4
        //   527: lcmp           
        //   528: iflt            716
        //   531: lload           14
        //   533: ldc2_w          2147483647
        //   536: lcmp           
        //   537: ifgt            716
        //   540: lload           14
        //   542: l2i            
        //   543: istore          11
        //   545: aload           8
        //   547: invokevirtual   java/nio/Buffer.position:()I
        //   550: istore          17
        //   552: iload           11
        //   554: aload           8
        //   556: invokevirtual   java/nio/Buffer.remaining:()I
        //   559: if_icmpgt       634
        //   562: aload           8
        //   564: invokevirtual   java/nio/ByteBuffer.getInt:()I
        //   567: ldc             1896449818
        //   569: if_icmpne       620
        //   572: iload           11
        //   574: iconst_4       
        //   575: isub           
        //   576: aload           8
        //   578: invokestatic    com/google/android/play/core/internal/a.e:(ILjava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;
        //   581: astore_0       
        //   582: new             Lig/o0;
        //   585: astore          8
        //   587: aload           8
        //   589: aload_0        
        //   590: lload           9
        //   592: lload           6
        //   594: lload_2        
        //   595: aload           5
        //   597: invokespecial   ig/o0.<init>:(Ljava/nio/ByteBuffer;JJJLjava/nio/ByteBuffer;)V
        //   600: aload_1        
        //   601: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //   604: aload           8
        //   606: invokestatic    com/google/android/play/core/internal/a.k:(Ljava/nio/channels/FileChannel;Lig/o0;)[[Ljava/security/cert/X509Certificate;
        //   609: astore_0       
        //   610: aload_1        
        //   611: invokevirtual   java/io/RandomAccessFile.close:()V
        //   614: aload_1        
        //   615: invokevirtual   java/io/RandomAccessFile.close:()V
        //   618: aload_0        
        //   619: areturn        
        //   620: aload           8
        //   622: iload           17
        //   624: iload           11
        //   626: iadd           
        //   627: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   630: pop            
        //   631: goto            494
        //   634: new             Lcom/google/android/play/core/internal/zzf;
        //   637: astore_0       
        //   638: aload           8
        //   640: invokevirtual   java/nio/Buffer.remaining:()I
        //   643: istore          17
        //   645: new             Ljava/lang/StringBuilder;
        //   648: astore          5
        //   650: aload           5
        //   652: bipush          91
        //   654: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   657: aload           5
        //   659: ldc             "APK Signing Block entry #"
        //   661: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   664: pop            
        //   665: aload           5
        //   667: iload           4
        //   669: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   672: pop            
        //   673: aload           5
        //   675: ldc             " size out of range: "
        //   677: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   680: pop            
        //   681: aload           5
        //   683: iload           11
        //   685: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   688: pop            
        //   689: aload           5
        //   691: ldc             ", available: "
        //   693: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   696: pop            
        //   697: aload           5
        //   699: iload           17
        //   701: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   704: pop            
        //   705: aload_0        
        //   706: aload           5
        //   708: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   711: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //   714: aload_0        
        //   715: athrow         
        //   716: new             Lcom/google/android/play/core/internal/zzf;
        //   719: astore_0       
        //   720: new             Ljava/lang/StringBuilder;
        //   723: astore          5
        //   725: aload           5
        //   727: bipush          76
        //   729: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   732: aload           5
        //   734: ldc             "APK Signing Block entry #"
        //   736: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   739: pop            
        //   740: aload           5
        //   742: iload           4
        //   744: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   747: pop            
        //   748: aload           5
        //   750: ldc             " size out of range: "
        //   752: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   755: pop            
        //   756: aload           5
        //   758: lload           14
        //   760: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //   763: pop            
        //   764: aload_0        
        //   765: aload           5
        //   767: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   770: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //   773: aload_0        
        //   774: athrow         
        //   775: new             Lcom/google/android/play/core/internal/zzf;
        //   778: astore_0       
        //   779: new             Ljava/lang/StringBuilder;
        //   782: astore          5
        //   784: aload           5
        //   786: bipush          70
        //   788: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   791: aload           5
        //   793: ldc             "Insufficient data to read size of APK Signing Block entry #"
        //   795: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   798: pop            
        //   799: aload           5
        //   801: iload           4
        //   803: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   806: pop            
        //   807: aload_0        
        //   808: aload           5
        //   810: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   813: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //   816: aload_0        
        //   817: athrow         
        //   818: new             Lcom/google/android/play/core/internal/zzf;
        //   821: astore_0       
        //   822: aload_0        
        //   823: ldc             "No APK Signature Scheme v2 block in APK Signing Block"
        //   825: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //   828: aload_0        
        //   829: athrow         
        //   830: astore          5
        //   832: aload_0        
        //   833: iconst_0       
        //   834: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   837: pop            
        //   838: aload_0        
        //   839: iload           17
        //   841: invokevirtual   java/nio/ByteBuffer.limit:(I)Ljava/nio/Buffer;
        //   844: pop            
        //   845: aload_0        
        //   846: iload           18
        //   848: invokevirtual   java/nio/ByteBuffer.position:(I)Ljava/nio/Buffer;
        //   851: pop            
        //   852: aload           5
        //   854: athrow         
        //   855: new             Ljava/lang/IllegalArgumentException;
        //   858: astore_0       
        //   859: new             Ljava/lang/StringBuilder;
        //   862: astore          5
        //   864: aload           5
        //   866: bipush          41
        //   868: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   871: aload           5
        //   873: ldc             "end > capacity: "
        //   875: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   878: pop            
        //   879: aload           5
        //   881: iload           11
        //   883: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   886: pop            
        //   887: aload           5
        //   889: ldc             " > "
        //   891: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   894: pop            
        //   895: aload           5
        //   897: iload           17
        //   899: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   902: pop            
        //   903: aload_0        
        //   904: aload           5
        //   906: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   909: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   912: aload_0        
        //   913: athrow         
        //   914: new             Ljava/lang/IllegalArgumentException;
        //   917: astore          5
        //   919: new             Ljava/lang/StringBuilder;
        //   922: astore_0       
        //   923: aload_0        
        //   924: bipush          38
        //   926: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   929: aload_0        
        //   930: ldc             "end < start: "
        //   932: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   935: pop            
        //   936: aload_0        
        //   937: iload           11
        //   939: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   942: pop            
        //   943: aload_0        
        //   944: ldc             " < "
        //   946: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   949: pop            
        //   950: aload_0        
        //   951: bipush          8
        //   953: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   956: pop            
        //   957: aload           5
        //   959: aload_0        
        //   960: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   963: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   966: aload           5
        //   968: athrow         
        //   969: new             Ljava/lang/IllegalArgumentException;
        //   972: astore_0       
        //   973: aload_0        
        //   974: ldc             "ByteBuffer byte order must be little endian"
        //   976: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
        //   979: aload_0        
        //   980: athrow         
        //   981: new             Lcom/google/android/play/core/internal/zzf;
        //   984: astore_0       
        //   985: new             Ljava/lang/StringBuilder;
        //   988: astore          5
        //   990: aload           5
        //   992: bipush          103
        //   994: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   997: aload           5
        //   999: ldc             "APK Signing Block sizes in header and footer do not match: "
        //  1001: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1004: pop            
        //  1005: aload           5
        //  1007: lload           14
        //  1009: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1012: pop            
        //  1013: aload           5
        //  1015: ldc             " vs "
        //  1017: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1020: pop            
        //  1021: aload           5
        //  1023: lload           9
        //  1025: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1028: pop            
        //  1029: aload_0        
        //  1030: aload           5
        //  1032: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1035: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1038: aload_0        
        //  1039: athrow         
        //  1040: new             Lcom/google/android/play/core/internal/zzf;
        //  1043: astore          5
        //  1045: new             Ljava/lang/StringBuilder;
        //  1048: astore_0       
        //  1049: aload_0        
        //  1050: bipush          59
        //  1052: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1055: aload_0        
        //  1056: ldc             "APK Signing Block offset out of range: "
        //  1058: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1061: pop            
        //  1062: aload_0        
        //  1063: lload           12
        //  1065: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1068: pop            
        //  1069: aload           5
        //  1071: aload_0        
        //  1072: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1075: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1078: aload           5
        //  1080: athrow         
        //  1081: new             Lcom/google/android/play/core/internal/zzf;
        //  1084: astore          5
        //  1086: new             Ljava/lang/StringBuilder;
        //  1089: astore_0       
        //  1090: aload_0        
        //  1091: bipush          57
        //  1093: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1096: aload_0        
        //  1097: ldc             "APK Signing Block size out of range: "
        //  1099: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1102: pop            
        //  1103: aload_0        
        //  1104: lload           9
        //  1106: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1109: pop            
        //  1110: aload           5
        //  1112: aload_0        
        //  1113: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1116: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1119: aload           5
        //  1121: athrow         
        //  1122: new             Lcom/google/android/play/core/internal/zzf;
        //  1125: astore_0       
        //  1126: aload_0        
        //  1127: ldc             "No APK Signing Block before ZIP Central Directory"
        //  1129: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1132: aload_0        
        //  1133: athrow         
        //  1134: new             Lcom/google/android/play/core/internal/zzf;
        //  1137: astore          5
        //  1139: new             Ljava/lang/StringBuilder;
        //  1142: astore_0       
        //  1143: aload_0        
        //  1144: bipush          87
        //  1146: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1149: aload_0        
        //  1150: ldc             "APK too small for APK Signing Block. ZIP Central Directory offset: "
        //  1152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1155: pop            
        //  1156: aload_0        
        //  1157: lload           6
        //  1159: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1162: pop            
        //  1163: aload           5
        //  1165: aload_0        
        //  1166: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1169: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1172: aload           5
        //  1174: athrow         
        //  1175: new             Lcom/google/android/play/core/internal/zzf;
        //  1178: astore_0       
        //  1179: aload_0        
        //  1180: ldc             "ZIP Central Directory is not immediately followed by End of Central Directory"
        //  1182: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1185: aload_0        
        //  1186: athrow         
        //  1187: astore_0       
        //  1188: goto            1309
        //  1191: new             Lcom/google/android/play/core/internal/zzf;
        //  1194: astore          5
        //  1196: new             Ljava/lang/StringBuilder;
        //  1199: astore_0       
        //  1200: aload_0        
        //  1201: bipush          122
        //  1203: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1206: aload_0        
        //  1207: ldc             "ZIP Central Directory offset out of range: "
        //  1209: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1212: pop            
        //  1213: aload_0        
        //  1214: lload           6
        //  1216: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1219: pop            
        //  1220: aload_0        
        //  1221: ldc             ". ZIP End of Central Directory offset: "
        //  1223: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1226: pop            
        //  1227: aload_0        
        //  1228: lload_2        
        //  1229: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1232: pop            
        //  1233: aload           5
        //  1235: aload_0        
        //  1236: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1239: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1242: aload           5
        //  1244: athrow         
        //  1245: new             Lcom/google/android/play/core/internal/zzf;
        //  1248: astore_0       
        //  1249: aload_0        
        //  1250: ldc             "ZIP64 APK not supported"
        //  1252: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1255: aload_0        
        //  1256: athrow         
        //  1257: new             Lcom/google/android/play/core/internal/zzf;
        //  1260: astore          5
        //  1262: aload_1        
        //  1263: invokevirtual   java/io/RandomAccessFile.length:()J
        //  1266: lstore_2       
        //  1267: new             Ljava/lang/StringBuilder;
        //  1270: astore_0       
        //  1271: aload_0        
        //  1272: bipush          102
        //  1274: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1277: aload_0        
        //  1278: ldc             "Not an APK file: ZIP End of Central Directory record not found in file with "
        //  1280: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1283: pop            
        //  1284: aload_0        
        //  1285: lload_2        
        //  1286: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1289: pop            
        //  1290: aload_0        
        //  1291: ldc             " bytes"
        //  1293: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1296: pop            
        //  1297: aload           5
        //  1299: aload_0        
        //  1300: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1303: invokespecial   com/google/android/play/core/internal/zzf.<init>:(Ljava/lang/String;)V
        //  1306: aload           5
        //  1308: athrow         
        //  1309: aload_1        
        //  1310: invokevirtual   java/io/RandomAccessFile.close:()V
        //  1313: aload_0        
        //  1314: athrow         
        //  1315: astore_1       
        //  1316: goto            618
        //  1319: astore_1       
        //  1320: goto            1313
        //    Exceptions:
        //  throws com.google.android.play.core.internal.zzf
        //  throws java.lang.SecurityException
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  11     16     1187   1315   Any
        //  32     38     1187   1315   Any
        //  45     52     1187   1315   Any
        //  56     76     1187   1315   Any
        //  93     108    1187   1315   Any
        //  108    133    1187   1315   Any
        //  140    171    1187   1315   Any
        //  180    270    1187   1315   Any
        //  303    345    1187   1315   Any
        //  353    404    1187   1315   Any
        //  411    438    1187   1315   Any
        //  438    474    830    855    Any
        //  474    494    1187   1315   Any
        //  494    502    1187   1315   Any
        //  505    522    1187   1315   Any
        //  545    614    1187   1315   Any
        //  614    618    1315   1319   Ljava/io/IOException;
        //  620    631    1187   1315   Any
        //  634    716    1187   1315   Any
        //  716    775    1187   1315   Any
        //  775    818    1187   1315   Any
        //  818    830    1187   1315   Any
        //  832    855    1187   1315   Any
        //  855    914    1187   1315   Any
        //  914    969    1187   1315   Any
        //  969    981    1187   1315   Any
        //  981    1040   1187   1315   Any
        //  1040   1081   1187   1315   Any
        //  1081   1122   1187   1315   Any
        //  1122   1134   1187   1315   Any
        //  1134   1175   1187   1315   Any
        //  1175   1187   1187   1315   Any
        //  1191   1245   1187   1315   Any
        //  1245   1257   1187   1315   Any
        //  1257   1309   1187   1315   Any
        //  1309   1313   1319   1323   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 676, Size: 676
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
    
    public static int b(final int n) {
        if (n == 1) {
            return 32;
        }
        if (n == 2) {
            return 64;
        }
        throw new IllegalArgumentException(b.f(44, "Unknown content digest algorthm: ", n));
    }
    
    public static int c(final int n) {
        if (n != 513) {
            if (n != 514) {
                if (n == 769) {
                    return 1;
                }
                switch (n) {
                    default: {
                        final String value = String.valueOf(Long.toHexString(n));
                        String concat;
                        if (value.length() != 0) {
                            concat = "Unknown signature algorithm: 0x".concat(value);
                        }
                        else {
                            concat = new String("Unknown signature algorithm: 0x");
                        }
                        throw new IllegalArgumentException(concat);
                    }
                    case 258:
                    case 260: {
                        break;
                    }
                    case 257:
                    case 259: {
                        return 1;
                    }
                }
            }
            return 2;
        }
        return 1;
    }
    
    public static String d(final int n) {
        if (n == 1) {
            return "SHA-256";
        }
        if (n == 2) {
            return "SHA-512";
        }
        throw new IllegalArgumentException(b.f(44, "Unknown content digest algorthm: ", n));
    }
    
    public static ByteBuffer e(int n, final ByteBuffer byteBuffer) throws BufferUnderflowException {
        if (n >= 0) {
            final int limit = byteBuffer.limit();
            final int position = byteBuffer.position();
            n += position;
            if (n >= position && n <= limit) {
                byteBuffer.limit(n);
                try {
                    final ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(n);
                    return slice;
                }
                finally {
                    byteBuffer.limit(limit);
                }
            }
            throw new BufferUnderflowException();
        }
        throw new IllegalArgumentException(b.f(17, "size: ", n));
    }
    
    public static ByteBuffer f(final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            throw new IOException(b.f(93, "Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining()));
        }
        final int int1 = byteBuffer.getInt();
        if (int1 < 0) {
            throw new IllegalArgumentException("Negative length");
        }
        if (int1 <= byteBuffer.remaining()) {
            return e(int1, byteBuffer);
        }
        final int remaining = byteBuffer.remaining();
        final StringBuilder sb = new StringBuilder(101);
        sb.append("Length-prefixed field longer than remaining buffer. Field length: ");
        sb.append(int1);
        sb.append(", remaining: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }
    
    public static void g(final int n, final byte[] array) {
        array[1] = (byte)(n & 0xFF);
        array[2] = (byte)(n >>> 8 & 0xFF);
        array[3] = (byte)(n >>> 16 & 0xFF);
        array[4] = (byte)(n >> 24);
    }
    
    public static byte[] h(final ByteBuffer byteBuffer) throws IOException {
        final int int1 = byteBuffer.getInt();
        if (int1 < 0) {
            throw new IOException("Negative length");
        }
        if (int1 <= byteBuffer.remaining()) {
            final byte[] array = new byte[int1];
            byteBuffer.get(array);
            return array;
        }
        final int remaining = byteBuffer.remaining();
        final StringBuilder sb = new StringBuilder(90);
        sb.append("Underflow while reading length-prefixed value. Length: ");
        sb.append(int1);
        sb.append(", available: ");
        sb.append(remaining);
        throw new IOException(sb.toString());
    }
    
    public static X509Certificate[] i(ByteBuffer parameter, final HashMap hashMap, final CertificateFactory certificateFactory) throws SecurityException, IOException {
        final ByteBuffer f = f((ByteBuffer)parameter);
        final ByteBuffer f2 = f((ByteBuffer)parameter);
        final byte[] h = h((ByteBuffer)parameter);
        final ArrayList list = new ArrayList();
        final BufferUnderflowException ex = null;
        int n = 0;
        int n2 = -1;
        byte[] h2 = null;
        while (f2.hasRemaining()) {
            final int n3 = n + 1;
            try {
                parameter = (BufferUnderflowException)f(f2);
                if (((Buffer)parameter).remaining() >= 8) {
                    final int int1 = ((ByteBuffer)parameter).getInt();
                    list.add(int1);
                    if (int1 != 513 && int1 != 514 && int1 != 769) {
                        switch (int1) {
                            default: {
                                n = n3;
                                continue;
                            }
                            case 257:
                            case 258:
                            case 259:
                            case 260: {
                                break;
                            }
                        }
                    }
                    if (n2 != -1) {
                        final int c = c(int1);
                        final int c2 = c(n2);
                        n = n3;
                        if (c == 1) {
                            continue;
                        }
                        if (c2 != 1) {
                            n = n3;
                            continue;
                        }
                    }
                    h2 = h((ByteBuffer)parameter);
                    n2 = int1;
                    n = n3;
                    continue;
                }
                parameter = (BufferUnderflowException)new SecurityException("Signature record too short");
                throw parameter;
            }
            catch (final BufferUnderflowException parameter) {}
            catch (final IOException ex2) {}
            throw new SecurityException(b.f(45, "Failed to parse signature record #", n3), parameter);
        }
        if (n2 != -1) {
            String s;
            if (n2 != 513 && n2 != 514) {
                if (n2 != 769) {
                    switch (n2) {
                        default: {
                            final String value = String.valueOf(Long.toHexString(n2));
                            String concat;
                            if (value.length() != 0) {
                                concat = "Unknown signature algorithm: 0x".concat(value);
                            }
                            else {
                                concat = new String("Unknown signature algorithm: 0x");
                            }
                            throw new IllegalArgumentException(concat);
                        }
                        case 257:
                        case 258:
                        case 259:
                        case 260: {
                            s = "RSA";
                            break;
                        }
                    }
                }
                else {
                    s = "DSA";
                }
            }
            else {
                s = "EC";
            }
            Pair pair;
            if (n2 != 513) {
                if (n2 != 514) {
                    if (n2 != 769) {
                        switch (n2) {
                            default: {
                                final String value2 = String.valueOf(Long.toHexString(n2));
                                String concat2;
                                if (value2.length() != 0) {
                                    concat2 = "Unknown signature algorithm: 0x".concat(value2);
                                }
                                else {
                                    concat2 = new String("Unknown signature algorithm: 0x");
                                }
                                throw new IllegalArgumentException(concat2);
                            }
                            case 260: {
                                pair = Pair.create((Object)"SHA512withRSA", (Object)null);
                                break;
                            }
                            case 259: {
                                pair = Pair.create((Object)"SHA256withRSA", (Object)null);
                                break;
                            }
                            case 258: {
                                pair = Pair.create((Object)"SHA512withRSA/PSS", (Object)new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                                break;
                            }
                            case 257: {
                                pair = Pair.create((Object)"SHA256withRSA/PSS", (Object)new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                                break;
                            }
                        }
                    }
                    else {
                        pair = Pair.create((Object)"SHA256withDSA", (Object)null);
                    }
                }
                else {
                    pair = Pair.create((Object)"SHA512withECDSA", (Object)null);
                }
            }
            else {
                pair = Pair.create((Object)"SHA256withECDSA", (Object)null);
            }
            final String s2 = (String)pair.first;
            parameter = (BufferUnderflowException)pair.second;
            try {
                final PublicKey generatePublic = KeyFactory.getInstance(s).generatePublic(new X509EncodedKeySpec(h));
                final Signature instance = Signature.getInstance(s2);
                instance.initVerify(generatePublic);
                if (parameter != null) {
                    instance.setParameter((AlgorithmParameterSpec)parameter);
                }
                instance.update(f);
                if (!instance.verify(h2)) {
                    throw new SecurityException(String.valueOf(s2).concat(" signature did not verify"));
                }
                f.clear();
                final ByteBuffer f3 = f(f);
                final ArrayList<Integer> list2 = new ArrayList<Integer>();
                int n4 = 0;
                parameter = ex;
                while (f3.hasRemaining()) {
                    final int n5 = n4 + 1;
                    try {
                        final ByteBuffer f4 = f(f3);
                        if (f4.remaining() < 8) {
                            parameter = (BufferUnderflowException)new IOException("Record too short");
                            throw parameter;
                        }
                        final int int2 = f4.getInt();
                        list2.add(int2);
                        n4 = n5;
                        if (int2 == n2) {
                            parameter = (BufferUnderflowException)(Object)h(f4);
                            n4 = n5;
                            continue;
                        }
                        continue;
                    }
                    catch (final BufferUnderflowException parameter) {}
                    catch (final IOException ex3) {}
                    throw new IOException(b.f(42, "Failed to parse digest record #", n5), parameter);
                }
                if (!list.equals(list2)) {
                    throw new SecurityException("Signature algorithms don't match between digests and signatures records");
                }
                final int c3 = c(n2);
                final byte[] array = hashMap.put(c3, parameter);
                if (array != null && !MessageDigest.isEqual(array, (byte[])(Object)parameter)) {
                    throw new SecurityException(d(c3).concat(" contents digest does not match the digest specified by a preceding signer"));
                }
                final ByteBuffer f5 = f(f);
                parameter = (BufferUnderflowException)new ArrayList();
                int n6 = 0;
                while (f5.hasRemaining()) {
                    ++n6;
                    final byte[] h3 = h(f5);
                    try {
                        ((ArrayList<zzg>)parameter).add(new zzg((X509Certificate)certificateFactory.generateCertificate(new ByteArrayInputStream(h3)), h3));
                        continue;
                    }
                    catch (final CertificateException parameter) {
                        throw new SecurityException(b.f(41, "Failed to decode certificate #", n6), parameter);
                    }
                    break;
                }
                if (((ArrayList)parameter).isEmpty()) {
                    throw new SecurityException("No certificates listed");
                }
                if (Arrays.equals(h, ((ArrayList<X509Certificate>)parameter).get(0).getPublicKey().getEncoded())) {
                    return ((ArrayList)parameter).toArray(new X509Certificate[((ArrayList)parameter).size()]);
                }
                throw new SecurityException("Public key mismatch between certificate and signature record");
            }
            catch (final SignatureException parameter) {}
            catch (final InvalidAlgorithmParameterException parameter) {}
            catch (final InvalidKeyException parameter) {}
            catch (final InvalidKeySpecException parameter) {}
            catch (final NoSuchAlgorithmException ex4) {}
            throw new SecurityException(a.i(new StringBuilder(String.valueOf(s2).length() + 27), "Failed to verify ", s2, " signature"), parameter);
        }
        if (n == 0) {
            throw new SecurityException("No signatures found");
        }
        throw new SecurityException("No supported signatures found");
    }
    
    public static byte[][] j(final int[] array, a0[] d) throws DigestException {
        long n = 0L;
        for (int i = 0; i < 3; ++i) {
            n += (d[i].zza() + 1048575L) / 1048576L;
        }
        if (n < 2097151L) {
            final int n2 = (int)n;
            final byte[][] array2 = new byte[array.length][];
            int n3 = 0;
            int length;
            while (true) {
                length = array.length;
                if (n3 >= length) {
                    break;
                }
                final byte[] array3 = new byte[b(array[n3]) * n2 + 5];
                array3[0] = 90;
                g(n2, array3);
                array2[n3] = array3;
                ++n3;
            }
            final byte[] array4 = new byte[5];
            array4[0] = -91;
            final MessageDigest[] array5 = new MessageDigest[length];
            int j = 0;
            while (j < array.length) {
                final String d2 = d(array[j]);
                try {
                    array5[j] = MessageDigest.getInstance(d2);
                    ++j;
                    continue;
                }
                catch (final NoSuchAlgorithmException ex) {
                    throw new RuntimeException(d2.concat(" digest not supported"), ex);
                }
                break;
            }
            final int n4 = 0;
            int n6;
            int n5 = n6 = n4;
            int n8;
            for (int k = n4; k < 3; ++k, n5 = n8) {
                final a0 a0 = d[k];
                long zza = a0.zza();
                long n7 = 0L;
                n8 = n5;
                while (zza > 0L) {
                    final int n9 = (int)Math.min(zza, 1048576L);
                    g(n9, array4);
                    for (int l = 0; l < length; ++l) {
                        array5[l].update(array4);
                    }
                    try {
                        a0.a(array5, n7, n9);
                        for (int n10 = 0; n10 < array.length; ++n10) {
                            final int n11 = array[n10];
                            final byte[] array6 = array2[n10];
                            final int b = b(n11);
                            final MessageDigest messageDigest = array5[n10];
                            final int digest = messageDigest.digest(array6, n8 * b + 5, b);
                            if (digest != b) {
                                final String algorithm = messageDigest.getAlgorithm();
                                final StringBuilder sb = new StringBuilder(String.valueOf(algorithm).length() + 46);
                                sb.append("Unexpected output size of ");
                                sb.append(algorithm);
                                sb.append(" digest: ");
                                sb.append(digest);
                                throw new RuntimeException(sb.toString());
                            }
                        }
                        final long n12 = n9;
                        zza -= n12;
                        ++n8;
                        n7 += n12;
                        continue;
                    }
                    catch (final IOException ex2) {
                        final StringBuilder sb2 = new StringBuilder(59);
                        sb2.append("Failed to digest chunk #");
                        sb2.append(n8);
                        sb2.append(" of section #");
                        sb2.append(n6);
                        throw new DigestException(sb2.toString(), ex2);
                    }
                    break;
                }
                ++n6;
            }
            final byte[][] array7 = new byte[array.length][];
            int n13 = 0;
            while (n13 < array.length) {
                final int n14 = array[n13];
                final byte[] array8 = array2[n13];
                d = (a0[])(Object)d(n14);
                try {
                    array7[n13] = MessageDigest.getInstance((String)(Object)d).digest(array8);
                    ++n13;
                    continue;
                }
                catch (final NoSuchAlgorithmException ex3) {
                    throw new RuntimeException(((String)(Object)d).concat(" digest not supported"), ex3);
                }
                break;
            }
            return array7;
        }
        final StringBuilder sb3 = new StringBuilder(37);
        sb3.append("Too many chunks: ");
        sb3.append(n);
        throw new DigestException(sb3.toString());
    }
    
    public static X509Certificate[][] k(final FileChannel ex, final o0 o0) throws SecurityException {
        final HashMap hashMap = new HashMap();
        final ArrayList list = new ArrayList();
        try {
            final CertificateFactory instance = CertificateFactory.getInstance("X.509");
            try {
                final ByteBuffer f = f(o0.a);
                final int n = 0;
                int n2 = 0;
                while (f.hasRemaining()) {
                    ++n2;
                    try {
                        list.add(i(f(f), hashMap, instance));
                        continue;
                    }
                    catch (final SecurityException ex) {}
                    catch (final BufferUnderflowException ex) {}
                    catch (final IOException ex2) {}
                    final StringBuilder sb = new StringBuilder(48);
                    sb.append("Failed to parse/verify signer #");
                    sb.append(n2);
                    sb.append(" block");
                    throw new SecurityException(sb.toString(), ex);
                }
                if (n2 <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (hashMap.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                final long b = o0.b;
                final long c = o0.c;
                final long d = o0.d;
                final ByteBuffer e = o0.e;
                if (!hashMap.isEmpty()) {
                    final n0 n3 = new n0((FileChannel)ex, 0L, b);
                    final n0 n4 = new n0((FileChannel)ex, c, d - c);
                    final ByteBuffer duplicate = e.duplicate();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    p0.c(duplicate);
                    final int position = duplicate.position();
                    if (b >= 0L && b <= 4294967295L) {
                        duplicate.putInt(duplicate.position() + (position + 16), (int)b);
                        final t t = new t(duplicate);
                        final int size = hashMap.size();
                        final int[] array = new int[size];
                        final Iterator iterator = hashMap.keySet().iterator();
                        int n5 = 0;
                        while (iterator.hasNext()) {
                            array[n5] = (int)iterator.next();
                            ++n5;
                        }
                        try {
                            final byte[][] j = j(array, new a0[] { (a0)n3, (a0)n4, (a0)t });
                            for (int i = n; i < size; ++i) {
                                final int n6 = array[i];
                                if (!MessageDigest.isEqual((byte[])hashMap.get(n6), j[i])) {
                                    throw new SecurityException(d(n6).concat(" digest of contents did not verify"));
                                }
                            }
                            return list.toArray(new X509Certificate[list.size()][]);
                        }
                        catch (final DigestException ex3) {
                            throw new SecurityException("Failed to compute digest(s) of contents", ex3);
                        }
                    }
                    final StringBuilder sb2 = new StringBuilder(47);
                    sb2.append("uint32 value of out range: ");
                    sb2.append(b);
                    throw new IllegalArgumentException(sb2.toString());
                }
                throw new SecurityException("No digests provided");
            }
            catch (final IOException ex4) {
                throw new SecurityException("Failed to read list of signers", ex4);
            }
        }
        catch (final CertificateException ex5) {
            throw new RuntimeException("Failed to obtain X.509 CertificateFactory", ex5);
        }
    }
}
