// 
// Decompiled by Procyon v0.6.0
// 

package lc2;

import rc2.u;
import rc2.t;
import java.util.concurrent.RejectedExecutionException;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import com.sendbird.android.shadow.okio.ByteString;
import java.util.logging.Level;
import java.io.IOException;
import rc2.e;
import java.util.logging.Logger;
import java.io.Closeable;

public final class m implements Closeable
{
    public static final Logger j;
    public final e f;
    public final a g;
    public final boolean h;
    public final lc2.b.a i;
    
    static {
        j = Logger.getLogger(c.class.getName());
    }
    
    public m(final e f, final boolean h) {
        this.f = f;
        this.h = h;
        final a g = new a(f);
        this.g = g;
        this.i = new lc2.b.a(g);
    }
    
    public static int a(final int n, final byte b, final short n2) throws IOException {
        int n3 = n;
        if ((b & 0x8) != 0x0) {
            n3 = n - 1;
        }
        if (n2 <= n3) {
            return (short)(n3 - n2);
        }
        c.b("PROTOCOL_ERROR padding %s > remaining length %s", n2, n3);
        throw null;
    }
    
    public final boolean b(final boolean p0, final b p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        lc2/m.f:Lrc2/e;
        //     4: ldc2_w          9
        //     7: invokeinterface rc2/e.c1:(J)V
        //    12: aload_0        
        //    13: getfield        lc2/m.f:Lrc2/e;
        //    16: astore          16
        //    18: aload           16
        //    20: invokeinterface rc2/e.readByte:()B
        //    25: istore          7
        //    27: aload           16
        //    29: invokeinterface rc2/e.readByte:()B
        //    34: istore          6
        //    36: aload           16
        //    38: invokeinterface rc2/e.readByte:()B
        //    43: sipush          255
        //    46: iand           
        //    47: iload           7
        //    49: sipush          255
        //    52: iand           
        //    53: bipush          16
        //    55: ishl           
        //    56: iload           6
        //    58: sipush          255
        //    61: iand           
        //    62: bipush          8
        //    64: ishl           
        //    65: ior            
        //    66: ior            
        //    67: istore          8
        //    69: iload           8
        //    71: iflt            2228
        //    74: iload           8
        //    76: sipush          16384
        //    79: if_icmpgt       2228
        //    82: aload_0        
        //    83: getfield        lc2/m.f:Lrc2/e;
        //    86: invokeinterface rc2/e.readByte:()B
        //    91: sipush          255
        //    94: iand           
        //    95: i2b            
        //    96: istore_3       
        //    97: iload_1        
        //    98: ifeq            127
        //   101: iload_3        
        //   102: iconst_4       
        //   103: if_icmpne       109
        //   106: goto            127
        //   109: ldc             "Expected a SETTINGS frame but was %s"
        //   111: iconst_1       
        //   112: anewarray       Ljava/lang/Object;
        //   115: dup            
        //   116: iconst_0       
        //   117: iload_3        
        //   118: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //   121: aastore        
        //   122: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   125: aconst_null    
        //   126: athrow         
        //   127: aload_0        
        //   128: getfield        lc2/m.f:Lrc2/e;
        //   131: invokeinterface rc2/e.readByte:()B
        //   136: sipush          255
        //   139: iand           
        //   140: i2b            
        //   141: istore          4
        //   143: aload_0        
        //   144: getfield        lc2/m.f:Lrc2/e;
        //   147: invokeinterface rc2/e.readInt:()I
        //   152: ldc             2147483647
        //   154: iand           
        //   155: istore          7
        //   157: getstatic       lc2/m.j:Ljava/util/logging/Logger;
        //   160: astore          16
        //   162: aload           16
        //   164: getstatic       java/util/logging/Level.FINE:Ljava/util/logging/Level;
        //   167: invokevirtual   java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
        //   170: ifeq            189
        //   173: aload           16
        //   175: iconst_1       
        //   176: iload           7
        //   178: iload           8
        //   180: iload_3        
        //   181: iload           4
        //   183: invokestatic    lc2/c.a:(ZIIBB)Ljava/lang/String;
        //   186: invokevirtual   java/util/logging/Logger.fine:(Ljava/lang/String;)V
        //   189: iload_3        
        //   190: tableswitch {
        //                0: 1460
        //                1: 911
        //                2: 842
        //                3: 632
        //                4: 307
        //                5: 293
        //                6: 279
        //                7: 267
        //                8: 255
        //          default: 240
        //        }
        //   240: aload_0        
        //   241: getfield        lc2/m.f:Lrc2/e;
        //   244: iload           8
        //   246: i2l            
        //   247: invokeinterface rc2/e.skip:(J)V
        //   252: goto            2226
        //   255: aload_0        
        //   256: aload_2        
        //   257: iload           8
        //   259: iload           7
        //   261: invokevirtual   lc2/m.n:(Llc2/m$b;II)V
        //   264: goto            1434
        //   267: aload_0        
        //   268: aload_2        
        //   269: iload           8
        //   271: iload           7
        //   273: invokevirtual   lc2/m.h:(Llc2/m$b;II)V
        //   276: goto            1434
        //   279: aload_0        
        //   280: aload_2        
        //   281: iload           8
        //   283: iload           4
        //   285: iload           7
        //   287: invokevirtual   lc2/m.k:(Llc2/m$b;IBI)V
        //   290: goto            1434
        //   293: aload_0        
        //   294: aload_2        
        //   295: iload           8
        //   297: iload           4
        //   299: iload           7
        //   301: invokevirtual   lc2/m.l:(Llc2/m$b;IBI)V
        //   304: goto            1434
        //   307: iload           7
        //   309: ifne            621
        //   312: iload           4
        //   314: iconst_1       
        //   315: iand           
        //   316: ifeq            343
        //   319: iload           8
        //   321: ifne            332
        //   324: aload_2        
        //   325: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   328: pop            
        //   329: goto            1434
        //   332: ldc             "FRAME_SIZE_ERROR ack frame should be empty!"
        //   334: iconst_0       
        //   335: anewarray       Ljava/lang/Object;
        //   338: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   341: aconst_null    
        //   342: athrow         
        //   343: iload           8
        //   345: bipush          6
        //   347: irem           
        //   348: ifne            602
        //   351: new             Le2/h;
        //   354: dup            
        //   355: invokespecial   e2/h.<init>:()V
        //   358: astore          16
        //   360: iconst_0       
        //   361: istore          7
        //   363: iload           7
        //   365: iload           8
        //   367: if_icmpge       544
        //   370: aload_0        
        //   371: getfield        lc2/m.f:Lrc2/e;
        //   374: invokeinterface rc2/e.readShort:()S
        //   379: ldc             65535
        //   381: iand           
        //   382: istore          9
        //   384: aload_0        
        //   385: getfield        lc2/m.f:Lrc2/e;
        //   388: invokeinterface rc2/e.readInt:()I
        //   393: istore          10
        //   395: iload           9
        //   397: iconst_2       
        //   398: if_icmpeq       496
        //   401: iload           9
        //   403: iconst_3       
        //   404: if_icmpeq       490
        //   407: iload           9
        //   409: iconst_4       
        //   410: if_icmpeq       467
        //   413: iload           9
        //   415: iconst_5       
        //   416: if_icmpeq       426
        //   419: iload           9
        //   421: istore          6
        //   423: goto            529
        //   426: iload           10
        //   428: sipush          16384
        //   431: if_icmplt       448
        //   434: iload           10
        //   436: ldc             16777215
        //   438: if_icmpgt       448
        //   441: iload           9
        //   443: istore          6
        //   445: goto            529
        //   448: ldc             "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
        //   450: iconst_1       
        //   451: anewarray       Ljava/lang/Object;
        //   454: dup            
        //   455: iconst_0       
        //   456: iload           10
        //   458: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   461: aastore        
        //   462: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   465: aconst_null    
        //   466: athrow         
        //   467: bipush          7
        //   469: istore          6
        //   471: iload           10
        //   473: iflt            479
        //   476: goto            529
        //   479: ldc             "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
        //   481: iconst_0       
        //   482: anewarray       Ljava/lang/Object;
        //   485: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   488: aconst_null    
        //   489: athrow         
        //   490: iconst_4       
        //   491: istore          6
        //   493: goto            529
        //   496: iload           9
        //   498: istore          6
        //   500: iload           10
        //   502: ifeq            529
        //   505: iload           10
        //   507: iconst_1       
        //   508: if_icmpne       518
        //   511: iload           9
        //   513: istore          6
        //   515: goto            529
        //   518: ldc             "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
        //   520: iconst_0       
        //   521: anewarray       Ljava/lang/Object;
        //   524: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   527: aconst_null    
        //   528: athrow         
        //   529: aload           16
        //   531: iload           6
        //   533: iload           10
        //   535: invokevirtual   e2/h.f:(II)V
        //   538: iinc            7, 6
        //   541: goto            363
        //   544: aload_2        
        //   545: checkcast       Llc2/e$f;
        //   548: astore_2       
        //   549: aload_2        
        //   550: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   553: pop            
        //   554: aload_2        
        //   555: getfield        lc2/e$f.h:Llc2/e;
        //   558: astore          18
        //   560: aload           18
        //   562: getfield        lc2/e.m:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
        //   565: astore          19
        //   567: new             Llc2/k;
        //   570: astore          17
        //   572: aload           17
        //   574: aload_2        
        //   575: iconst_1       
        //   576: anewarray       Ljava/lang/Object;
        //   579: dup            
        //   580: iconst_0       
        //   581: aload           18
        //   583: getfield        lc2/e.i:Ljava/lang/String;
        //   586: aastore        
        //   587: aload           16
        //   589: invokespecial   lc2/k.<init>:(Llc2/e$f;[Ljava/lang/Object;Le2/h;)V
        //   592: aload           19
        //   594: aload           17
        //   596: invokevirtual   java/util/concurrent/ScheduledThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        //   599: goto            1434
        //   602: ldc             "TYPE_SETTINGS length %% 6 != 0: %s"
        //   604: iconst_1       
        //   605: anewarray       Ljava/lang/Object;
        //   608: dup            
        //   609: iconst_0       
        //   610: iload           8
        //   612: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   615: aastore        
        //   616: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   619: aconst_null    
        //   620: athrow         
        //   621: ldc             "TYPE_SETTINGS streamId != 0"
        //   623: iconst_0       
        //   624: anewarray       Ljava/lang/Object;
        //   627: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   630: aconst_null    
        //   631: athrow         
        //   632: iload           8
        //   634: iconst_4       
        //   635: if_icmpne       823
        //   638: iload           7
        //   640: ifeq            812
        //   643: aload_0        
        //   644: getfield        lc2/m.f:Lrc2/e;
        //   647: invokeinterface rc2/e.readInt:()I
        //   652: istore          6
        //   654: iload           6
        //   656: invokestatic    com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.fromHttp2:(I)Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //   659: astore          16
        //   661: aload           16
        //   663: ifnull          793
        //   666: aload_2        
        //   667: checkcast       Llc2/e$f;
        //   670: astore_2       
        //   671: aload_2        
        //   672: getfield        lc2/e$f.h:Llc2/e;
        //   675: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   678: pop            
        //   679: iload           7
        //   681: ifeq            697
        //   684: iload           7
        //   686: iconst_1       
        //   687: iand           
        //   688: ifne            697
        //   691: iconst_1       
        //   692: istore          6
        //   694: goto            700
        //   697: iconst_0       
        //   698: istore          6
        //   700: iload           6
        //   702: ifeq            748
        //   705: aload_2        
        //   706: getfield        lc2/e$f.h:Llc2/e;
        //   709: astore_2       
        //   710: aload_2        
        //   711: new             Llc2/i;
        //   714: dup            
        //   715: aload_2        
        //   716: iconst_2       
        //   717: anewarray       Ljava/lang/Object;
        //   720: dup            
        //   721: iconst_0       
        //   722: aload_2        
        //   723: getfield        lc2/e.i:Ljava/lang/String;
        //   726: aastore        
        //   727: dup            
        //   728: iconst_1       
        //   729: iload           7
        //   731: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   734: aastore        
        //   735: iload           7
        //   737: aload           16
        //   739: invokespecial   lc2/i.<init>:(Llc2/e;[Ljava/lang/Object;ILcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
        //   742: invokevirtual   lc2/e.j:(Lgc2/a;)V
        //   745: goto            1434
        //   748: aload_2        
        //   749: getfield        lc2/e$f.h:Llc2/e;
        //   752: iload           7
        //   754: invokevirtual   lc2/e.k:(I)Llc2/n;
        //   757: astore_2       
        //   758: aload_2        
        //   759: ifnull          1434
        //   762: aload_2        
        //   763: monitorenter   
        //   764: aload_2        
        //   765: getfield        lc2/n.k:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //   768: ifnonnull       781
        //   771: aload_2        
        //   772: aload           16
        //   774: putfield        lc2/n.k:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //   777: aload_2        
        //   778: invokevirtual   java/lang/Object.notifyAll:()V
        //   781: aload_2        
        //   782: monitorexit    
        //   783: goto            1434
        //   786: astore          16
        //   788: aload_2        
        //   789: monitorexit    
        //   790: aload           16
        //   792: athrow         
        //   793: ldc             "TYPE_RST_STREAM unexpected error code: %d"
        //   795: iconst_1       
        //   796: anewarray       Ljava/lang/Object;
        //   799: dup            
        //   800: iconst_0       
        //   801: iload           6
        //   803: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   806: aastore        
        //   807: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   810: aconst_null    
        //   811: athrow         
        //   812: ldc             "TYPE_RST_STREAM streamId == 0"
        //   814: iconst_0       
        //   815: anewarray       Ljava/lang/Object;
        //   818: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   821: aconst_null    
        //   822: athrow         
        //   823: ldc             "TYPE_RST_STREAM length: %d != 4"
        //   825: iconst_1       
        //   826: anewarray       Ljava/lang/Object;
        //   829: dup            
        //   830: iconst_0       
        //   831: iload           8
        //   833: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   836: aastore        
        //   837: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   840: aconst_null    
        //   841: athrow         
        //   842: iload           8
        //   844: iconst_5       
        //   845: if_icmpne       892
        //   848: iload           7
        //   850: ifeq            881
        //   853: aload_0        
        //   854: getfield        lc2/m.f:Lrc2/e;
        //   857: invokeinterface rc2/e.readInt:()I
        //   862: pop            
        //   863: aload_0        
        //   864: getfield        lc2/m.f:Lrc2/e;
        //   867: invokeinterface rc2/e.readByte:()B
        //   872: pop            
        //   873: aload_2        
        //   874: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   877: pop            
        //   878: goto            1434
        //   881: ldc             "TYPE_PRIORITY streamId == 0"
        //   883: iconst_0       
        //   884: anewarray       Ljava/lang/Object;
        //   887: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   890: aconst_null    
        //   891: athrow         
        //   892: ldc             "TYPE_PRIORITY length: %d != 5"
        //   894: iconst_1       
        //   895: anewarray       Ljava/lang/Object;
        //   898: dup            
        //   899: iconst_0       
        //   900: iload           8
        //   902: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   905: aastore        
        //   906: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   909: aconst_null    
        //   910: athrow         
        //   911: iload           7
        //   913: ifeq            1448
        //   916: iload           4
        //   918: iconst_1       
        //   919: iand           
        //   920: ifeq            928
        //   923: iconst_1       
        //   924: istore_1       
        //   925: goto            930
        //   928: iconst_0       
        //   929: istore_1       
        //   930: iload           4
        //   932: bipush          8
        //   934: iand           
        //   935: ifeq            957
        //   938: aload_0        
        //   939: getfield        lc2/m.f:Lrc2/e;
        //   942: invokeinterface rc2/e.readByte:()B
        //   947: sipush          255
        //   950: iand           
        //   951: i2s            
        //   952: istore          5
        //   954: goto            960
        //   957: iconst_0       
        //   958: istore          5
        //   960: iload           8
        //   962: istore          6
        //   964: iload           4
        //   966: bipush          32
        //   968: iand           
        //   969: ifeq            1003
        //   972: aload_0        
        //   973: getfield        lc2/m.f:Lrc2/e;
        //   976: invokeinterface rc2/e.readInt:()I
        //   981: pop            
        //   982: aload_0        
        //   983: getfield        lc2/m.f:Lrc2/e;
        //   986: invokeinterface rc2/e.readByte:()B
        //   991: pop            
        //   992: aload_2        
        //   993: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   996: pop            
        //   997: iload           8
        //   999: iconst_5       
        //  1000: isub           
        //  1001: istore          6
        //  1003: aload_0        
        //  1004: iload           6
        //  1006: iload           4
        //  1008: iload           5
        //  1010: invokestatic    lc2/m.a:(IBS)I
        //  1013: iload           5
        //  1015: iload           4
        //  1017: iload           7
        //  1019: invokevirtual   lc2/m.j:(ISBI)Ljava/util/ArrayList;
        //  1022: astore          17
        //  1024: aload_2        
        //  1025: checkcast       Llc2/e$f;
        //  1028: astore          16
        //  1030: aload           16
        //  1032: getfield        lc2/e$f.h:Llc2/e;
        //  1035: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1038: pop            
        //  1039: iload           7
        //  1041: ifeq            1057
        //  1044: iload           7
        //  1046: iconst_1       
        //  1047: iand           
        //  1048: ifne            1057
        //  1051: iconst_1       
        //  1052: istore          6
        //  1054: goto            1060
        //  1057: iconst_0       
        //  1058: istore          6
        //  1060: iload           6
        //  1062: ifeq            1120
        //  1065: aload           16
        //  1067: getfield        lc2/e$f.h:Llc2/e;
        //  1070: astore_2       
        //  1071: aload_2        
        //  1072: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1075: pop            
        //  1076: new             Llc2/g;
        //  1079: astore          16
        //  1081: aload           16
        //  1083: aload_2        
        //  1084: iconst_2       
        //  1085: anewarray       Ljava/lang/Object;
        //  1088: dup            
        //  1089: iconst_0       
        //  1090: aload_2        
        //  1091: getfield        lc2/e.i:Ljava/lang/String;
        //  1094: aastore        
        //  1095: dup            
        //  1096: iconst_1       
        //  1097: iload           7
        //  1099: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1102: aastore        
        //  1103: iload           7
        //  1105: aload           17
        //  1107: iload_1        
        //  1108: invokespecial   lc2/g.<init>:(Llc2/e;[Ljava/lang/Object;ILjava/util/ArrayList;Z)V
        //  1111: aload_2        
        //  1112: aload           16
        //  1114: invokevirtual   lc2/e.j:(Lgc2/a;)V
        //  1117: goto            1434
        //  1120: aload           16
        //  1122: getfield        lc2/e$f.h:Llc2/e;
        //  1125: astore_2       
        //  1126: aload_2        
        //  1127: monitorenter   
        //  1128: aload           16
        //  1130: getfield        lc2/e$f.h:Llc2/e;
        //  1133: iload           7
        //  1135: invokevirtual   lc2/e.h:(I)Llc2/n;
        //  1138: astore          18
        //  1140: aload           18
        //  1142: ifnonnull       1318
        //  1145: aload           16
        //  1147: getfield        lc2/e$f.h:Llc2/e;
        //  1150: astore          18
        //  1152: aload           18
        //  1154: getfield        lc2/e.l:Z
        //  1157: ifeq            1165
        //  1160: aload_2        
        //  1161: monitorexit    
        //  1162: goto            1434
        //  1165: iload           7
        //  1167: aload           18
        //  1169: getfield        lc2/e.j:I
        //  1172: if_icmpgt       1180
        //  1175: aload_2        
        //  1176: monitorexit    
        //  1177: goto            1434
        //  1180: iload           7
        //  1182: iconst_2       
        //  1183: irem           
        //  1184: aload           18
        //  1186: getfield        lc2/e.k:I
        //  1189: iconst_2       
        //  1190: irem           
        //  1191: if_icmpne       1199
        //  1194: aload_2        
        //  1195: monitorexit    
        //  1196: goto            1434
        //  1199: aload           17
        //  1201: invokestatic    gc2/b.v:(Ljava/util/ArrayList;)Lfc2/q;
        //  1204: astore          18
        //  1206: new             Llc2/n;
        //  1209: astore          17
        //  1211: aload           17
        //  1213: iload           7
        //  1215: aload           16
        //  1217: getfield        lc2/e$f.h:Llc2/e;
        //  1220: iconst_0       
        //  1221: iload_1        
        //  1222: aload           18
        //  1224: invokespecial   lc2/n.<init>:(ILlc2/e;ZZLfc2/q;)V
        //  1227: aload           16
        //  1229: getfield        lc2/e$f.h:Llc2/e;
        //  1232: astore          18
        //  1234: aload           18
        //  1236: iload           7
        //  1238: putfield        lc2/e.j:I
        //  1241: aload           18
        //  1243: getfield        lc2/e.h:Ljava/util/LinkedHashMap;
        //  1246: iload           7
        //  1248: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1251: aload           17
        //  1253: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1258: pop            
        //  1259: getstatic       lc2/e.y:Ljava/util/concurrent/ThreadPoolExecutor;
        //  1262: astore          19
        //  1264: new             Llc2/j;
        //  1267: astore          18
        //  1269: aload           18
        //  1271: aload           16
        //  1273: iconst_2       
        //  1274: anewarray       Ljava/lang/Object;
        //  1277: dup            
        //  1278: iconst_0       
        //  1279: aload           16
        //  1281: getfield        lc2/e$f.h:Llc2/e;
        //  1284: getfield        lc2/e.i:Ljava/lang/String;
        //  1287: aastore        
        //  1288: dup            
        //  1289: iconst_1       
        //  1290: iload           7
        //  1292: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1295: aastore        
        //  1296: aload           17
        //  1298: invokespecial   lc2/j.<init>:(Llc2/e$f;[Ljava/lang/Object;Llc2/n;)V
        //  1301: aload           19
        //  1303: aload           18
        //  1305: invokevirtual   java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        //  1308: aload_2        
        //  1309: monitorexit    
        //  1310: goto            1434
        //  1313: astore          16
        //  1315: goto            1443
        //  1318: aload_2        
        //  1319: monitorexit    
        //  1320: aload           18
        //  1322: monitorenter   
        //  1323: aload           18
        //  1325: iconst_1       
        //  1326: putfield        lc2/n.f:Z
        //  1329: aload           18
        //  1331: getfield        lc2/n.e:Ljava/util/ArrayDeque;
        //  1334: aload           17
        //  1336: invokestatic    gc2/b.v:(Ljava/util/ArrayList;)Lfc2/q;
        //  1339: invokevirtual   java/util/ArrayDeque.add:(Ljava/lang/Object;)Z
        //  1342: pop            
        //  1343: aload           18
        //  1345: invokevirtual   lc2/n.f:()Z
        //  1348: istore          11
        //  1350: aload           18
        //  1352: invokevirtual   java/lang/Object.notifyAll:()V
        //  1355: aload           18
        //  1357: monitorexit    
        //  1358: iload           11
        //  1360: ifne            1377
        //  1363: aload           18
        //  1365: getfield        lc2/n.d:Llc2/e;
        //  1368: aload           18
        //  1370: getfield        lc2/n.c:I
        //  1373: invokevirtual   lc2/e.k:(I)Llc2/n;
        //  1376: pop            
        //  1377: iload_1        
        //  1378: ifeq            1434
        //  1381: aload           18
        //  1383: monitorenter   
        //  1384: aload           18
        //  1386: getfield        lc2/n.g:Llc2/n$b;
        //  1389: iconst_1       
        //  1390: putfield        lc2/n$b.j:Z
        //  1393: aload           18
        //  1395: invokevirtual   lc2/n.f:()Z
        //  1398: istore_1       
        //  1399: aload           18
        //  1401: invokevirtual   java/lang/Object.notifyAll:()V
        //  1404: aload           18
        //  1406: monitorexit    
        //  1407: iload_1        
        //  1408: ifne            1434
        //  1411: aload           18
        //  1413: getfield        lc2/n.d:Llc2/e;
        //  1416: aload           18
        //  1418: getfield        lc2/n.c:I
        //  1421: invokevirtual   lc2/e.k:(I)Llc2/n;
        //  1424: pop            
        //  1425: goto            1434
        //  1428: astore_2       
        //  1429: aload           18
        //  1431: monitorexit    
        //  1432: aload_2        
        //  1433: athrow         
        //  1434: goto            2226
        //  1437: astore_2       
        //  1438: aload           18
        //  1440: monitorexit    
        //  1441: aload_2        
        //  1442: athrow         
        //  1443: aload_2        
        //  1444: monitorexit    
        //  1445: aload           16
        //  1447: athrow         
        //  1448: ldc_w           "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
        //  1451: iconst_0       
        //  1452: anewarray       Ljava/lang/Object;
        //  1455: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1458: aconst_null    
        //  1459: athrow         
        //  1460: iload           7
        //  1462: ifeq            2214
        //  1465: iload           4
        //  1467: iconst_1       
        //  1468: iand           
        //  1469: ifeq            1477
        //  1472: iconst_1       
        //  1473: istore_1       
        //  1474: goto            1479
        //  1477: iconst_0       
        //  1478: istore_1       
        //  1479: iload           4
        //  1481: bipush          32
        //  1483: iand           
        //  1484: ifeq            1493
        //  1487: iconst_1       
        //  1488: istore          6
        //  1490: goto            1496
        //  1493: iconst_0       
        //  1494: istore          6
        //  1496: iload           6
        //  1498: ifne            2202
        //  1501: iload           4
        //  1503: bipush          8
        //  1505: iand           
        //  1506: ifeq            1528
        //  1509: aload_0        
        //  1510: getfield        lc2/m.f:Lrc2/e;
        //  1513: invokeinterface rc2/e.readByte:()B
        //  1518: sipush          255
        //  1521: iand           
        //  1522: i2s            
        //  1523: istore          5
        //  1525: goto            1531
        //  1528: iconst_0       
        //  1529: istore          5
        //  1531: iload           8
        //  1533: iload           4
        //  1535: iload           5
        //  1537: invokestatic    lc2/m.a:(IBS)I
        //  1540: istore          8
        //  1542: aload_0        
        //  1543: getfield        lc2/m.f:Lrc2/e;
        //  1546: astore          16
        //  1548: aload_2        
        //  1549: checkcast       Llc2/e$f;
        //  1552: astore          17
        //  1554: aload           17
        //  1556: getfield        lc2/e$f.h:Llc2/e;
        //  1559: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1562: pop            
        //  1563: iload           7
        //  1565: ifeq            1581
        //  1568: iload           7
        //  1570: iconst_1       
        //  1571: iand           
        //  1572: ifne            1581
        //  1575: iconst_1       
        //  1576: istore          6
        //  1578: goto            1584
        //  1581: iconst_0       
        //  1582: istore          6
        //  1584: iload           6
        //  1586: ifeq            1737
        //  1589: aload           17
        //  1591: getfield        lc2/e$f.h:Llc2/e;
        //  1594: astore          17
        //  1596: aload           17
        //  1598: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1601: pop            
        //  1602: new             Lcom/sendbird/android/shadow/okio/a;
        //  1605: dup            
        //  1606: invokespecial   com/sendbird/android/shadow/okio/a.<init>:()V
        //  1609: astore_2       
        //  1610: iload           8
        //  1612: i2l            
        //  1613: lstore          12
        //  1615: aload           16
        //  1617: lload           12
        //  1619: invokeinterface rc2/e.c1:(J)V
        //  1624: aload           16
        //  1626: aload_2        
        //  1627: lload           12
        //  1629: invokeinterface rc2/t.m:(Lcom/sendbird/android/shadow/okio/a;J)J
        //  1634: pop2           
        //  1635: aload_2        
        //  1636: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  1639: lload           12
        //  1641: lcmp           
        //  1642: ifne            1688
        //  1645: aload           17
        //  1647: new             Llc2/h;
        //  1650: dup            
        //  1651: aload           17
        //  1653: iconst_2       
        //  1654: anewarray       Ljava/lang/Object;
        //  1657: dup            
        //  1658: iconst_0       
        //  1659: aload           17
        //  1661: getfield        lc2/e.i:Ljava/lang/String;
        //  1664: aastore        
        //  1665: dup            
        //  1666: iconst_1       
        //  1667: iload           7
        //  1669: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1672: aastore        
        //  1673: iload           7
        //  1675: aload_2        
        //  1676: iload           8
        //  1678: iload_1        
        //  1679: invokespecial   lc2/h.<init>:(Llc2/e;[Ljava/lang/Object;ILcom/sendbird/android/shadow/okio/a;IZ)V
        //  1682: invokevirtual   lc2/e.j:(Lgc2/a;)V
        //  1685: goto            1791
        //  1688: new             Ljava/lang/StringBuilder;
        //  1691: dup            
        //  1692: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1695: astore          16
        //  1697: aload           16
        //  1699: aload_2        
        //  1700: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  1703: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1706: pop            
        //  1707: aload           16
        //  1709: ldc_w           " != "
        //  1712: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1715: pop            
        //  1716: aload           16
        //  1718: iload           8
        //  1720: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1723: pop            
        //  1724: new             Ljava/io/IOException;
        //  1727: dup            
        //  1728: aload           16
        //  1730: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1733: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1736: athrow         
        //  1737: aload           17
        //  1739: getfield        lc2/e$f.h:Llc2/e;
        //  1742: iload           7
        //  1744: invokevirtual   lc2/e.h:(I)Llc2/n;
        //  1747: astore_2       
        //  1748: aload_2        
        //  1749: ifnonnull       1798
        //  1752: aload           17
        //  1754: getfield        lc2/e$f.h:Llc2/e;
        //  1757: iload           7
        //  1759: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.PROTOCOL_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //  1762: invokevirtual   lc2/e.p:(ILcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
        //  1765: aload           17
        //  1767: getfield        lc2/e$f.h:Llc2/e;
        //  1770: astore_2       
        //  1771: iload           8
        //  1773: i2l            
        //  1774: lstore          12
        //  1776: aload_2        
        //  1777: lload           12
        //  1779: invokevirtual   lc2/e.n:(J)V
        //  1782: aload           16
        //  1784: lload           12
        //  1786: invokeinterface rc2/e.skip:(J)V
        //  1791: iload           5
        //  1793: istore          7
        //  1795: goto            2187
        //  1798: aload_2        
        //  1799: getfield        lc2/n.g:Llc2/n$b;
        //  1802: astore          17
        //  1804: iload           8
        //  1806: i2l            
        //  1807: lstore          12
        //  1809: iload           5
        //  1811: istore          6
        //  1813: lload           12
        //  1815: lconst_0       
        //  1816: lcmp           
        //  1817: ifle            2118
        //  1820: aload           17
        //  1822: getfield        lc2/n$b.k:Llc2/n;
        //  1825: astore          18
        //  1827: aload           18
        //  1829: monitorenter   
        //  1830: aload           17
        //  1832: getfield        lc2/n$b.j:Z
        //  1835: istore          11
        //  1837: aload           17
        //  1839: getfield        lc2/n$b.g:Lcom/sendbird/android/shadow/okio/a;
        //  1842: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  1845: lload           12
        //  1847: ladd           
        //  1848: aload           17
        //  1850: getfield        lc2/n$b.h:J
        //  1853: lcmp           
        //  1854: ifle            1863
        //  1857: iconst_1       
        //  1858: istore          7
        //  1860: goto            1866
        //  1863: iconst_0       
        //  1864: istore          7
        //  1866: aload           18
        //  1868: monitorexit    
        //  1869: iload           7
        //  1871: ifeq            1926
        //  1874: aload           16
        //  1876: lload           12
        //  1878: invokeinterface rc2/e.skip:(J)V
        //  1883: aload           17
        //  1885: getfield        lc2/n$b.k:Llc2/n;
        //  1888: astore          17
        //  1890: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.FLOW_CONTROL_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //  1893: astore          16
        //  1895: aload           17
        //  1897: aload           16
        //  1899: invokevirtual   lc2/n.d:(Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)Z
        //  1902: ifne            1908
        //  1905: goto            2124
        //  1908: aload           17
        //  1910: getfield        lc2/n.d:Llc2/e;
        //  1913: aload           17
        //  1915: getfield        lc2/n.c:I
        //  1918: aload           16
        //  1920: invokevirtual   lc2/e.p:(ILcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
        //  1923: goto            2124
        //  1926: iload           11
        //  1928: ifeq            1943
        //  1931: aload           16
        //  1933: lload           12
        //  1935: invokeinterface rc2/e.skip:(J)V
        //  1940: goto            2124
        //  1943: aload           16
        //  1945: aload           17
        //  1947: getfield        lc2/n$b.f:Lcom/sendbird/android/shadow/okio/a;
        //  1950: lload           12
        //  1952: invokeinterface rc2/t.m:(Lcom/sendbird/android/shadow/okio/a;J)J
        //  1957: lstore          14
        //  1959: lload           14
        //  1961: ldc2_w          -1
        //  1964: lcmp           
        //  1965: ifeq            2104
        //  1968: lload           12
        //  1970: lload           14
        //  1972: lsub           
        //  1973: lstore          14
        //  1975: aload           17
        //  1977: getfield        lc2/n$b.k:Llc2/n;
        //  1980: astore          18
        //  1982: aload           18
        //  1984: monitorenter   
        //  1985: aload           17
        //  1987: getfield        lc2/n$b.i:Z
        //  1990: ifeq            2015
        //  1993: aload           17
        //  1995: getfield        lc2/n$b.f:Lcom/sendbird/android/shadow/okio/a;
        //  1998: astore          19
        //  2000: aload           19
        //  2002: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  2005: lstore          12
        //  2007: aload           19
        //  2009: invokevirtual   com/sendbird/android/shadow/okio/a.b:()V
        //  2012: goto            2068
        //  2015: aload           17
        //  2017: getfield        lc2/n$b.g:Lcom/sendbird/android/shadow/okio/a;
        //  2020: astore          19
        //  2022: aload           19
        //  2024: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  2027: lconst_0       
        //  2028: lcmp           
        //  2029: ifne            2038
        //  2032: iconst_1       
        //  2033: istore          7
        //  2035: goto            2041
        //  2038: iconst_0       
        //  2039: istore          7
        //  2041: aload           19
        //  2043: aload           17
        //  2045: getfield        lc2/n$b.f:Lcom/sendbird/android/shadow/okio/a;
        //  2048: invokevirtual   com/sendbird/android/shadow/okio/a.y:(Lrc2/t;)J
        //  2051: pop2           
        //  2052: iload           7
        //  2054: ifeq            2065
        //  2057: aload           17
        //  2059: getfield        lc2/n$b.k:Llc2/n;
        //  2062: invokevirtual   java/lang/Object.notifyAll:()V
        //  2065: lconst_0       
        //  2066: lstore          12
        //  2068: aload           18
        //  2070: monitorexit    
        //  2071: lload           12
        //  2073: lconst_0       
        //  2074: lcmp           
        //  2075: ifle            2091
        //  2078: aload           17
        //  2080: getfield        lc2/n$b.k:Llc2/n;
        //  2083: getfield        lc2/n.d:Llc2/e;
        //  2086: lload           12
        //  2088: invokevirtual   lc2/e.n:(J)V
        //  2091: lload           14
        //  2093: lstore          12
        //  2095: goto            1813
        //  2098: astore_2       
        //  2099: aload           18
        //  2101: monitorexit    
        //  2102: aload_2        
        //  2103: athrow         
        //  2104: new             Ljava/io/EOFException;
        //  2107: dup            
        //  2108: invokespecial   java/io/EOFException.<init>:()V
        //  2111: athrow         
        //  2112: astore_2       
        //  2113: aload           18
        //  2115: monitorexit    
        //  2116: aload_2        
        //  2117: athrow         
        //  2118: aload           17
        //  2120: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2123: pop            
        //  2124: iload           6
        //  2126: istore          7
        //  2128: iload_1        
        //  2129: ifeq            2187
        //  2132: aload_2        
        //  2133: monitorenter   
        //  2134: aload_2        
        //  2135: getfield        lc2/n.g:Llc2/n$b;
        //  2138: iconst_1       
        //  2139: putfield        lc2/n$b.j:Z
        //  2142: aload_2        
        //  2143: invokevirtual   lc2/n.f:()Z
        //  2146: istore_1       
        //  2147: aload_2        
        //  2148: invokevirtual   java/lang/Object.notifyAll:()V
        //  2151: aload_2        
        //  2152: monitorexit    
        //  2153: iload           6
        //  2155: istore          7
        //  2157: iload_1        
        //  2158: ifne            2187
        //  2161: aload_2        
        //  2162: getfield        lc2/n.d:Llc2/e;
        //  2165: aload_2        
        //  2166: getfield        lc2/n.c:I
        //  2169: invokevirtual   lc2/e.k:(I)Llc2/n;
        //  2172: pop            
        //  2173: iload           6
        //  2175: istore          7
        //  2177: goto            2187
        //  2180: astore          16
        //  2182: aload_2        
        //  2183: monitorexit    
        //  2184: aload           16
        //  2186: athrow         
        //  2187: aload_0        
        //  2188: getfield        lc2/m.f:Lrc2/e;
        //  2191: iload           7
        //  2193: i2l            
        //  2194: invokeinterface rc2/e.skip:(J)V
        //  2199: goto            2226
        //  2202: ldc_w           "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
        //  2205: iconst_0       
        //  2206: anewarray       Ljava/lang/Object;
        //  2209: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  2212: aconst_null    
        //  2213: athrow         
        //  2214: ldc_w           "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
        //  2217: iconst_0       
        //  2218: anewarray       Ljava/lang/Object;
        //  2221: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  2224: aconst_null    
        //  2225: athrow         
        //  2226: iconst_1       
        //  2227: ireturn        
        //  2228: ldc_w           "FRAME_SIZE_ERROR: %s"
        //  2231: iconst_1       
        //  2232: anewarray       Ljava/lang/Object;
        //  2235: dup            
        //  2236: iconst_0       
        //  2237: iload           8
        //  2239: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2242: aastore        
        //  2243: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  2246: aconst_null    
        //  2247: athrow         
        //  2248: astore_2       
        //  2249: iconst_0       
        //  2250: ireturn        
        //  2251: astore_2       
        //  2252: goto            1434
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      12     2248   2251   Ljava/io/IOException;
        //  554    599    2251   2255   Ljava/util/concurrent/RejectedExecutionException;
        //  764    781    786    793    Any
        //  1076   1117   2251   2255   Ljava/util/concurrent/RejectedExecutionException;
        //  1128   1140   1313   1448   Any
        //  1145   1162   1313   1448   Any
        //  1165   1177   1313   1448   Any
        //  1180   1196   1313   1448   Any
        //  1199   1310   1313   1448   Any
        //  1318   1320   1313   1448   Any
        //  1323   1358   1437   1443   Any
        //  1384   1407   1428   1434   Any
        //  1429   1432   1428   1434   Any
        //  1438   1441   1437   1443   Any
        //  1443   1445   1313   1448   Any
        //  1830   1857   2112   2118   Any
        //  1866   1869   2112   2118   Any
        //  1985   2012   2098   2104   Any
        //  2015   2032   2098   2104   Any
        //  2041   2052   2098   2104   Any
        //  2057   2065   2098   2104   Any
        //  2068   2071   2098   2104   Any
        //  2099   2102   2098   2104   Any
        //  2113   2116   2112   2118   Any
        //  2134   2153   2180   2187   Any
        //  2182   2184   2180   2187   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0602:
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
    
    @Override
    public final void close() throws IOException {
        ((t)this.f).close();
    }
    
    public final void d(final b b) throws IOException {
        if (this.h) {
            if (!this.b(true, b)) {
                c.b("Required SETTINGS preface not received", new Object[0]);
                throw null;
            }
        }
        else {
            final e f = this.f;
            final ByteString a = c.a;
            final ByteString u0 = f.U0((long)a.size());
            final Logger j = m.j;
            if (j.isLoggable(Level.FINE)) {
                j.fine(gc2.b.l("<< CONNECTION %s", u0.hex()));
            }
            if (!a.equals((Object)u0)) {
                c.b("Expected a connection header but was %s", u0.utf8());
                throw null;
            }
        }
    }
    
    public final void h(final b b, int i, int int1) throws IOException {
        final int n = 0;
        if (i < 8) {
            c.b("TYPE_GOAWAY length < 8: %s", i);
            throw null;
        }
        if (int1 == 0) {
            int1 = this.f.readInt();
            final int int2 = this.f.readInt();
            i -= 8;
            if (ErrorCode.fromHttp2(int2) != null) {
                ByteString byteString = ByteString.EMPTY;
                if (i > 0) {
                    byteString = this.f.U0((long)i);
                }
                final lc2.e.f f = (lc2.e.f)b;
                f.getClass();
                byteString.size();
                Object h = f.h;
                synchronized (h) {
                    final n[] array = (n[])f.h.h.values().toArray(new n[f.h.h.size()]);
                    f.h.l = true;
                    monitorexit(h);
                    int length;
                    ErrorCode refused_STREAM;
                    for (length = array.length, i = n; i < length; ++i) {
                        h = array[i];
                        if (((n)h).c > int1 && ((n)h).e()) {
                            refused_STREAM = ErrorCode.REFUSED_STREAM;
                            synchronized (h) {
                                if (((n)h).k == null) {
                                    ((n)h).k = refused_STREAM;
                                    h.notifyAll();
                                }
                                monitorexit(h);
                                f.h.k(((n)h).c);
                            }
                        }
                    }
                    return;
                }
            }
            c.b("TYPE_GOAWAY unexpected error code: %d", int2);
            throw null;
        }
        c.b("TYPE_GOAWAY streamId != 0", new Object[0]);
        throw null;
    }
    
    public final ArrayList j(int n, final short k, final byte h, int e) throws IOException {
        final a g = this.g;
        g.j = n;
        g.g = n;
        g.k = k;
        g.h = h;
        g.i = e;
        final lc2.b.a i = this.i;
        while (!i.b.e1()) {
            n = (i.b.readByte() & 0xFF);
            if (n == 128) {
                throw new IOException("index == 0");
            }
            e = 0;
            if ((n & 0x80) == 0x80) {
                final int n2 = i.e(n, 127) - 1;
                n = e;
                if (n2 >= 0) {
                    n = e;
                    if (n2 <= lc2.b.a.length - 1) {
                        n = 1;
                    }
                }
                if (n == 0) {
                    n = lc2.b.a.length;
                    n = i.f + 1 + (n2 - n);
                    if (n >= 0) {
                        final lc2.a[] e2 = i.e;
                        if (n < e2.length) {
                            i.a.add(e2[n]);
                            continue;
                        }
                    }
                    final StringBuilder t = a.t("Header index too large ");
                    t.append(n2 + 1);
                    throw new IOException(t.toString());
                }
                i.a.add(lc2.b.a[n2]);
            }
            else if (n == 64) {
                final ByteString d = i.d();
                lc2.b.a(d);
                i.c(new lc2.a(d, i.d()));
            }
            else if ((n & 0x40) == 0x40) {
                i.c(new lc2.a(i.b(i.e(n, 63) - 1), i.d()));
            }
            else if ((n & 0x20) == 0x20) {
                e = i.e(n, 31);
                i.d = e;
                if (e < 0 || e > i.c) {
                    final StringBuilder t2 = a.t("Invalid dynamic table size update ");
                    t2.append(i.d);
                    throw new IOException(t2.toString());
                }
                n = i.h;
                if (e >= n) {
                    continue;
                }
                if (e == 0) {
                    Arrays.fill(i.e, null);
                    i.f = i.e.length - 1;
                    i.g = 0;
                    i.h = 0;
                }
                else {
                    i.a(n - e);
                }
            }
            else if (n != 16 && n != 0) {
                i.a.add(new lc2.a(i.b(i.e(n, 15) - 1), i.d()));
            }
            else {
                final ByteString d2 = i.d();
                lc2.b.a(d2);
                i.a.add(new lc2.a(d2, i.d()));
            }
        }
        final lc2.b.a j = this.i;
        j.getClass();
        final ArrayList list = new ArrayList(j.a);
        j.a.clear();
        return list;
    }
    
    public final void k(final b b, int n, final byte b2, int int1) throws IOException {
        Label_0148: {
            if (n != 8) {
                break Label_0148;
            }
            Label_0136: {
                if (int1 != 0) {
                    break Label_0136;
                }
                final int int2 = this.f.readInt();
                int1 = this.f.readInt();
                if ((b2 & 0x1) != 0x0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                final lc2.e.f f = (lc2.e.f)b;
                f.getClass();
                if (n != 0) {
                    synchronized (f.h) {
                        final lc2.e h = f.h;
                        h.p = false;
                        h.notifyAll();
                        return;
                    }
                }
                try {
                    final lc2.e h2 = f.h;
                    h2.m.execute(h2.new e(true, int2, int1));
                    return;
                    c.b("TYPE_PING length != 8: %s", n);
                    throw null;
                    c.b("TYPE_PING streamId != 0", new Object[0]);
                    throw null;
                }
                catch (final RejectedExecutionException ex) {}
            }
        }
    }
    
    public final void l(final b p0, final int p1, final byte p2, final int p3) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ifeq            174
        //     5: iload_3        
        //     6: bipush          8
        //     8: iand           
        //     9: ifeq            31
        //    12: aload_0        
        //    13: getfield        lc2/m.f:Lrc2/e;
        //    16: invokeinterface rc2/e.readByte:()B
        //    21: sipush          255
        //    24: iand           
        //    25: i2s            
        //    26: istore          5
        //    28: goto            34
        //    31: iconst_0       
        //    32: istore          5
        //    34: aload_0        
        //    35: getfield        lc2/m.f:Lrc2/e;
        //    38: invokeinterface rc2/e.readInt:()I
        //    43: ldc             2147483647
        //    45: iand           
        //    46: istore          6
        //    48: aload_0        
        //    49: iload_2        
        //    50: iconst_4       
        //    51: isub           
        //    52: iload_3        
        //    53: iload           5
        //    55: invokestatic    lc2/m.a:(IBS)I
        //    58: iload           5
        //    60: iload_3        
        //    61: iload           4
        //    63: invokevirtual   lc2/m.j:(ISBI)Ljava/util/ArrayList;
        //    66: astore          7
        //    68: aload_1        
        //    69: checkcast       Llc2/e$f;
        //    72: getfield        lc2/e$f.h:Llc2/e;
        //    75: astore_1       
        //    76: aload_1        
        //    77: monitorenter   
        //    78: aload_1        
        //    79: getfield        lc2/e.x:Ljava/util/LinkedHashSet;
        //    82: iload           6
        //    84: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    87: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    92: ifeq            109
        //    95: aload_1        
        //    96: iload           6
        //    98: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.PROTOCOL_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //   101: invokevirtual   lc2/e.p:(ILcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
        //   104: aload_1        
        //   105: monitorexit    
        //   106: goto            166
        //   109: aload_1        
        //   110: getfield        lc2/e.x:Ljava/util/LinkedHashSet;
        //   113: iload           6
        //   115: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   118: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   123: pop            
        //   124: aload_1        
        //   125: monitorexit    
        //   126: new             Llc2/f;
        //   129: astore          8
        //   131: aload           8
        //   133: aload_1        
        //   134: iconst_2       
        //   135: anewarray       Ljava/lang/Object;
        //   138: dup            
        //   139: iconst_0       
        //   140: aload_1        
        //   141: getfield        lc2/e.i:Ljava/lang/String;
        //   144: aastore        
        //   145: dup            
        //   146: iconst_1       
        //   147: iload           6
        //   149: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   152: aastore        
        //   153: iload           6
        //   155: aload           7
        //   157: invokespecial   lc2/f.<init>:(Llc2/e;[Ljava/lang/Object;ILjava/util/ArrayList;)V
        //   160: aload_1        
        //   161: aload           8
        //   163: invokevirtual   lc2/e.j:(Lgc2/a;)V
        //   166: return         
        //   167: astore          7
        //   169: aload_1        
        //   170: monitorexit    
        //   171: aload           7
        //   173: athrow         
        //   174: ldc_w           "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
        //   177: iconst_0       
        //   178: anewarray       Ljava/lang/Object;
        //   181: invokestatic    lc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   184: aconst_null    
        //   185: athrow         
        //   186: astore_1       
        //   187: goto            166
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  78     106    167    174    Any
        //  109    126    167    174    Any
        //  126    166    186    190    Ljava/util/concurrent/RejectedExecutionException;
        //  169    171    167    174    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0166:
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
    
    public final void n(b h, int n, final int n2) throws IOException {
        if (n != 4) {
            c.b("TYPE_WINDOW_UPDATE length !=4: %s", n);
            throw null;
        }
        final long n3 = (long)this.f.readInt() & 0x7FFFFFFFL;
        n = lcmp(n3, 0L);
        if (n != 0) {
            final lc2.e.f f = (lc2.e.f)h;
            if (n2 == 0) {
                synchronized (f.h) {
                    final lc2.e h2 = f.h;
                    h2.r += n3;
                    h2.notifyAll();
                    return;
                }
            }
            h = (b)f.h.h(n2);
            if (h != null) {
                synchronized (h) {
                    ((n)h).b += n3;
                    if (n > 0) {
                        h.notifyAll();
                    }
                }
            }
            return;
        }
        c.b("windowSizeIncrement was 0", n3);
        throw null;
    }
    
    public static final class a implements t
    {
        public final e f;
        public int g;
        public byte h;
        public int i;
        public int j;
        public short k;
        
        public a(final e f) {
            this.f = f;
        }
        
        public final void close() throws IOException {
        }
        
        public final long m(final com.sendbird.android.shadow.okio.a a, long m) throws IOException {
            while (true) {
                final int j = this.j;
                if (j == 0) {
                    this.f.skip((long)this.k);
                    this.k = 0;
                    if ((this.h & 0x4) != 0x0) {
                        return -1L;
                    }
                    final int i = this.i;
                    final e f = this.f;
                    final int n = (f.readByte() & 0xFF) | ((f.readByte() & 0xFF) << 16 | (f.readByte() & 0xFF) << 8);
                    this.j = n;
                    this.g = n;
                    final byte b = (byte)(this.f.readByte() & 0xFF);
                    this.h = (byte)(this.f.readByte() & 0xFF);
                    final Logger k = m.j;
                    if (k.isLoggable(Level.FINE)) {
                        k.fine(c.a(true, this.i, this.g, b, this.h));
                    }
                    final int l = this.f.readInt() & Integer.MAX_VALUE;
                    this.i = l;
                    if (b != 9) {
                        c.b("%s != TYPE_CONTINUATION", b);
                        throw null;
                    }
                    if (l == i) {
                        continue;
                    }
                    c.b("TYPE_CONTINUATION streamId changed", new Object[0]);
                    throw null;
                }
                else {
                    m = ((t)this.f).m(a, Math.min(m, j));
                    if (m == -1L) {
                        return -1L;
                    }
                    this.j -= (int)m;
                    return m;
                }
            }
        }
        
        public final u timeout() {
            return ((t)this.f).timeout();
        }
    }
    
    public interface b
    {
    }
}
