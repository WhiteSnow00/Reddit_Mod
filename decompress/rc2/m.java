// 
// Decompiled by Procyon v0.6.0
// 

package rc2;

import xc2.u;
import xc2.t;
import java.util.concurrent.RejectedExecutionException;
import java.util.Collection;
import java.util.Arrays;
import java.util.ArrayList;
import com.sendbird.android.shadow.okhttp3.internal.http2.ErrorCode;
import com.sendbird.android.shadow.okio.ByteString;
import mc2.a;
import java.util.logging.Level;
import java.io.IOException;
import xc2.e;
import java.util.logging.Logger;
import java.io.Closeable;

public final class m implements Closeable
{
    public static final Logger j;
    public final e f;
    public final a g;
    public final boolean h;
    public final rc2.b.a i;
    
    static {
        j = Logger.getLogger(c.class.getName());
    }
    
    public m(final e f, final boolean h) {
        this.f = f;
        this.h = h;
        final a g = new a(f);
        this.g = g;
        this.i = new rc2.b.a(g);
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
        //     1: getfield        rc2/m.f:Lxc2/e;
        //     4: ldc2_w          9
        //     7: invokeinterface xc2/e.c1:(J)V
        //    12: aload_0        
        //    13: getfield        rc2/m.f:Lxc2/e;
        //    16: astore_3       
        //    17: aload_3        
        //    18: invokeinterface xc2/e.readByte:()B
        //    23: istore          4
        //    25: aload_3        
        //    26: invokeinterface xc2/e.readByte:()B
        //    31: istore          5
        //    33: aload_3        
        //    34: invokeinterface xc2/e.readByte:()B
        //    39: sipush          255
        //    42: iand           
        //    43: iload           4
        //    45: sipush          255
        //    48: iand           
        //    49: bipush          16
        //    51: ishl           
        //    52: iload           5
        //    54: sipush          255
        //    57: iand           
        //    58: bipush          8
        //    60: ishl           
        //    61: ior            
        //    62: ior            
        //    63: istore          6
        //    65: iload           6
        //    67: iflt            2208
        //    70: iload           6
        //    72: sipush          16384
        //    75: if_icmpgt       2208
        //    78: aload_0        
        //    79: getfield        rc2/m.f:Lxc2/e;
        //    82: invokeinterface xc2/e.readByte:()B
        //    87: sipush          255
        //    90: iand           
        //    91: i2b            
        //    92: istore          7
        //    94: iload_1        
        //    95: ifeq            126
        //    98: iload           7
        //   100: iconst_4       
        //   101: if_icmpne       107
        //   104: goto            126
        //   107: ldc             "Expected a SETTINGS frame but was %s"
        //   109: iconst_1       
        //   110: anewarray       Ljava/lang/Object;
        //   113: dup            
        //   114: iconst_0       
        //   115: iload           7
        //   117: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //   120: aastore        
        //   121: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   124: aconst_null    
        //   125: athrow         
        //   126: aload_0        
        //   127: getfield        rc2/m.f:Lxc2/e;
        //   130: invokeinterface xc2/e.readByte:()B
        //   135: sipush          255
        //   138: iand           
        //   139: i2b            
        //   140: istore          8
        //   142: aload_0        
        //   143: getfield        rc2/m.f:Lxc2/e;
        //   146: invokeinterface xc2/e.readInt:()I
        //   151: ldc             2147483647
        //   153: iand           
        //   154: istore          5
        //   156: getstatic       rc2/m.j:Ljava/util/logging/Logger;
        //   159: astore_3       
        //   160: aload_3        
        //   161: getstatic       java/util/logging/Level.FINE:Ljava/util/logging/Level;
        //   164: invokevirtual   java/util/logging/Logger.isLoggable:(Ljava/util/logging/Level;)Z
        //   167: ifeq            186
        //   170: aload_3        
        //   171: iconst_1       
        //   172: iload           5
        //   174: iload           6
        //   176: iload           7
        //   178: iload           8
        //   180: invokestatic    rc2/c.a:(ZIIBB)Ljava/lang/String;
        //   183: invokevirtual   java/util/logging/Logger.fine:(Ljava/lang/String;)V
        //   186: iload           7
        //   188: tableswitch {
        //                0: 1445
        //                1: 903
        //                2: 834
        //                3: 630
        //                4: 307
        //                5: 293
        //                6: 279
        //                7: 267
        //                8: 255
        //          default: 240
        //        }
        //   240: aload_0        
        //   241: getfield        rc2/m.f:Lxc2/e;
        //   244: iload           6
        //   246: i2l            
        //   247: invokeinterface xc2/e.skip:(J)V
        //   252: goto            2206
        //   255: aload_0        
        //   256: aload_2        
        //   257: iload           6
        //   259: iload           5
        //   261: invokevirtual   rc2/m.n:(Lrc2/m$b;II)V
        //   264: goto            1420
        //   267: aload_0        
        //   268: aload_2        
        //   269: iload           6
        //   271: iload           5
        //   273: invokevirtual   rc2/m.f:(Lrc2/m$b;II)V
        //   276: goto            1420
        //   279: aload_0        
        //   280: aload_2        
        //   281: iload           6
        //   283: iload           8
        //   285: iload           5
        //   287: invokevirtual   rc2/m.h:(Lrc2/m$b;IBI)V
        //   290: goto            1420
        //   293: aload_0        
        //   294: aload_2        
        //   295: iload           6
        //   297: iload           8
        //   299: iload           5
        //   301: invokevirtual   rc2/m.j:(Lrc2/m$b;IBI)V
        //   304: goto            1420
        //   307: iload           5
        //   309: ifne            619
        //   312: iload           8
        //   314: iconst_1       
        //   315: iand           
        //   316: ifeq            343
        //   319: iload           6
        //   321: ifne            332
        //   324: aload_2        
        //   325: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   328: pop            
        //   329: goto            1420
        //   332: ldc             "FRAME_SIZE_ERROR ack frame should be empty!"
        //   334: iconst_0       
        //   335: anewarray       Ljava/lang/Object;
        //   338: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   341: aconst_null    
        //   342: athrow         
        //   343: iload           6
        //   345: bipush          6
        //   347: irem           
        //   348: ifne            600
        //   351: new             Lz0/w;
        //   354: dup            
        //   355: iconst_1       
        //   356: invokespecial   z0/w.<init>:(I)V
        //   359: astore_3       
        //   360: iconst_0       
        //   361: istore          5
        //   363: iload           5
        //   365: iload           6
        //   367: if_icmpge       543
        //   370: aload_0        
        //   371: getfield        rc2/m.f:Lxc2/e;
        //   374: invokeinterface xc2/e.readShort:()S
        //   379: ldc             65535
        //   381: iand           
        //   382: istore          9
        //   384: aload_0        
        //   385: getfield        rc2/m.f:Lxc2/e;
        //   388: invokeinterface xc2/e.readInt:()I
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
        //   421: istore          4
        //   423: goto            529
        //   426: iload           10
        //   428: sipush          16384
        //   431: if_icmplt       448
        //   434: iload           10
        //   436: ldc             16777215
        //   438: if_icmpgt       448
        //   441: iload           9
        //   443: istore          4
        //   445: goto            529
        //   448: ldc             "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
        //   450: iconst_1       
        //   451: anewarray       Ljava/lang/Object;
        //   454: dup            
        //   455: iconst_0       
        //   456: iload           10
        //   458: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   461: aastore        
        //   462: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   465: aconst_null    
        //   466: athrow         
        //   467: bipush          7
        //   469: istore          4
        //   471: iload           10
        //   473: iflt            479
        //   476: goto            529
        //   479: ldc             "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
        //   481: iconst_0       
        //   482: anewarray       Ljava/lang/Object;
        //   485: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   488: aconst_null    
        //   489: athrow         
        //   490: iconst_4       
        //   491: istore          4
        //   493: goto            529
        //   496: iload           9
        //   498: istore          4
        //   500: iload           10
        //   502: ifeq            529
        //   505: iload           10
        //   507: iconst_1       
        //   508: if_icmpne       518
        //   511: iload           9
        //   513: istore          4
        //   515: goto            529
        //   518: ldc             "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
        //   520: iconst_0       
        //   521: anewarray       Ljava/lang/Object;
        //   524: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   527: aconst_null    
        //   528: athrow         
        //   529: aload_3        
        //   530: iload           4
        //   532: iload           10
        //   534: invokevirtual   z0/w.e:(II)V
        //   537: iinc            5, 6
        //   540: goto            363
        //   543: aload_2        
        //   544: checkcast       Lrc2/e$f;
        //   547: astore_2       
        //   548: aload_2        
        //   549: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   552: pop            
        //   553: aload_2        
        //   554: getfield        rc2/e$f.i:Lrc2/e;
        //   557: astore          11
        //   559: aload           11
        //   561: getfield        rc2/e.m:Ljava/util/concurrent/ScheduledThreadPoolExecutor;
        //   564: astore          12
        //   566: new             Lrc2/k;
        //   569: astore          13
        //   571: aload           13
        //   573: aload_2        
        //   574: iconst_1       
        //   575: anewarray       Ljava/lang/Object;
        //   578: dup            
        //   579: iconst_0       
        //   580: aload           11
        //   582: getfield        rc2/e.i:Ljava/lang/String;
        //   585: aastore        
        //   586: aload_3        
        //   587: invokespecial   rc2/k.<init>:(Lrc2/e$f;[Ljava/lang/Object;Lz0/w;)V
        //   590: aload           12
        //   592: aload           13
        //   594: invokevirtual   java/util/concurrent/ScheduledThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        //   597: goto            1420
        //   600: ldc             "TYPE_SETTINGS length %% 6 != 0: %s"
        //   602: iconst_1       
        //   603: anewarray       Ljava/lang/Object;
        //   606: dup            
        //   607: iconst_0       
        //   608: iload           6
        //   610: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   613: aastore        
        //   614: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   617: aconst_null    
        //   618: athrow         
        //   619: ldc             "TYPE_SETTINGS streamId != 0"
        //   621: iconst_0       
        //   622: anewarray       Ljava/lang/Object;
        //   625: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   628: aconst_null    
        //   629: athrow         
        //   630: iload           6
        //   632: iconst_4       
        //   633: if_icmpne       815
        //   636: iload           5
        //   638: ifeq            804
        //   641: aload_0        
        //   642: getfield        rc2/m.f:Lxc2/e;
        //   645: invokeinterface xc2/e.readInt:()I
        //   650: istore          4
        //   652: iload           4
        //   654: invokestatic    com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.fromHttp2:(I)Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //   657: astore_3       
        //   658: aload_3        
        //   659: ifnull          785
        //   662: aload_2        
        //   663: checkcast       Lrc2/e$f;
        //   666: astore_2       
        //   667: aload_2        
        //   668: getfield        rc2/e$f.i:Lrc2/e;
        //   671: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   674: pop            
        //   675: iload           5
        //   677: ifeq            693
        //   680: iload           5
        //   682: iconst_1       
        //   683: iand           
        //   684: ifne            693
        //   687: iconst_1       
        //   688: istore          4
        //   690: goto            696
        //   693: iconst_0       
        //   694: istore          4
        //   696: iload           4
        //   698: ifeq            743
        //   701: aload_2        
        //   702: getfield        rc2/e$f.i:Lrc2/e;
        //   705: astore_2       
        //   706: aload_2        
        //   707: new             Lrc2/i;
        //   710: dup            
        //   711: aload_2        
        //   712: iconst_2       
        //   713: anewarray       Ljava/lang/Object;
        //   716: dup            
        //   717: iconst_0       
        //   718: aload_2        
        //   719: getfield        rc2/e.i:Ljava/lang/String;
        //   722: aastore        
        //   723: dup            
        //   724: iconst_1       
        //   725: iload           5
        //   727: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   730: aastore        
        //   731: iload           5
        //   733: aload_3        
        //   734: invokespecial   rc2/i.<init>:(Lrc2/e;[Ljava/lang/Object;ILcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
        //   737: invokevirtual   rc2/e.f:(Lod/g0;)V
        //   740: goto            1420
        //   743: aload_2        
        //   744: getfield        rc2/e$f.i:Lrc2/e;
        //   747: iload           5
        //   749: invokevirtual   rc2/e.g:(I)Lrc2/n;
        //   752: astore_2       
        //   753: aload_2        
        //   754: ifnull          1420
        //   757: aload_2        
        //   758: monitorenter   
        //   759: aload_2        
        //   760: getfield        rc2/n.k:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //   763: ifnonnull       775
        //   766: aload_2        
        //   767: aload_3        
        //   768: putfield        rc2/n.k:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //   771: aload_2        
        //   772: invokevirtual   java/lang/Object.notifyAll:()V
        //   775: aload_2        
        //   776: monitorexit    
        //   777: goto            1420
        //   780: astore_3       
        //   781: aload_2        
        //   782: monitorexit    
        //   783: aload_3        
        //   784: athrow         
        //   785: ldc             "TYPE_RST_STREAM unexpected error code: %d"
        //   787: iconst_1       
        //   788: anewarray       Ljava/lang/Object;
        //   791: dup            
        //   792: iconst_0       
        //   793: iload           4
        //   795: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   798: aastore        
        //   799: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   802: aconst_null    
        //   803: athrow         
        //   804: ldc             "TYPE_RST_STREAM streamId == 0"
        //   806: iconst_0       
        //   807: anewarray       Ljava/lang/Object;
        //   810: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   813: aconst_null    
        //   814: athrow         
        //   815: ldc             "TYPE_RST_STREAM length: %d != 4"
        //   817: iconst_1       
        //   818: anewarray       Ljava/lang/Object;
        //   821: dup            
        //   822: iconst_0       
        //   823: iload           6
        //   825: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   828: aastore        
        //   829: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   832: aconst_null    
        //   833: athrow         
        //   834: iload           6
        //   836: iconst_5       
        //   837: if_icmpne       884
        //   840: iload           5
        //   842: ifeq            873
        //   845: aload_0        
        //   846: getfield        rc2/m.f:Lxc2/e;
        //   849: invokeinterface xc2/e.readInt:()I
        //   854: pop            
        //   855: aload_0        
        //   856: getfield        rc2/m.f:Lxc2/e;
        //   859: invokeinterface xc2/e.readByte:()B
        //   864: pop            
        //   865: aload_2        
        //   866: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   869: pop            
        //   870: goto            1420
        //   873: ldc             "TYPE_PRIORITY streamId == 0"
        //   875: iconst_0       
        //   876: anewarray       Ljava/lang/Object;
        //   879: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   882: aconst_null    
        //   883: athrow         
        //   884: ldc             "TYPE_PRIORITY length: %d != 5"
        //   886: iconst_1       
        //   887: anewarray       Ljava/lang/Object;
        //   890: dup            
        //   891: iconst_0       
        //   892: iload           6
        //   894: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   897: aastore        
        //   898: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   901: aconst_null    
        //   902: athrow         
        //   903: iload           5
        //   905: ifeq            1433
        //   908: iload           8
        //   910: iconst_1       
        //   911: iand           
        //   912: ifeq            920
        //   915: iconst_1       
        //   916: istore_1       
        //   917: goto            922
        //   920: iconst_0       
        //   921: istore_1       
        //   922: iload           8
        //   924: bipush          8
        //   926: iand           
        //   927: ifeq            953
        //   930: aload_0        
        //   931: getfield        rc2/m.f:Lxc2/e;
        //   934: invokeinterface xc2/e.readByte:()B
        //   939: sipush          255
        //   942: iand           
        //   943: i2s            
        //   944: istore          4
        //   946: iload           4
        //   948: istore          14
        //   950: goto            960
        //   953: iconst_0       
        //   954: istore          4
        //   956: iload           4
        //   958: istore          14
        //   960: iload           6
        //   962: istore          4
        //   964: iload           8
        //   966: bipush          32
        //   968: iand           
        //   969: ifeq            1003
        //   972: aload_0        
        //   973: getfield        rc2/m.f:Lxc2/e;
        //   976: invokeinterface xc2/e.readInt:()I
        //   981: pop            
        //   982: aload_0        
        //   983: getfield        rc2/m.f:Lxc2/e;
        //   986: invokeinterface xc2/e.readByte:()B
        //   991: pop            
        //   992: aload_2        
        //   993: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   996: pop            
        //   997: iload           6
        //   999: iconst_5       
        //  1000: isub           
        //  1001: istore          4
        //  1003: aload_0        
        //  1004: iload           4
        //  1006: iload           8
        //  1008: iload           14
        //  1010: invokestatic    rc2/m.a:(IBS)I
        //  1013: iload           14
        //  1015: iload           8
        //  1017: iload           5
        //  1019: invokevirtual   rc2/m.g:(ISBI)Ljava/util/ArrayList;
        //  1022: astore          13
        //  1024: aload_2        
        //  1025: checkcast       Lrc2/e$f;
        //  1028: astore_3       
        //  1029: aload_3        
        //  1030: getfield        rc2/e$f.i:Lrc2/e;
        //  1033: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1036: pop            
        //  1037: iload           5
        //  1039: ifeq            1055
        //  1042: iload           5
        //  1044: iconst_1       
        //  1045: iand           
        //  1046: ifne            1055
        //  1049: iconst_1       
        //  1050: istore          4
        //  1052: goto            1058
        //  1055: iconst_0       
        //  1056: istore          4
        //  1058: iload           4
        //  1060: ifeq            1114
        //  1063: aload_3        
        //  1064: getfield        rc2/e$f.i:Lrc2/e;
        //  1067: astore_2       
        //  1068: aload_2        
        //  1069: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1072: pop            
        //  1073: new             Lrc2/g;
        //  1076: astore_3       
        //  1077: aload_3        
        //  1078: aload_2        
        //  1079: iconst_2       
        //  1080: anewarray       Ljava/lang/Object;
        //  1083: dup            
        //  1084: iconst_0       
        //  1085: aload_2        
        //  1086: getfield        rc2/e.i:Ljava/lang/String;
        //  1089: aastore        
        //  1090: dup            
        //  1091: iconst_1       
        //  1092: iload           5
        //  1094: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1097: aastore        
        //  1098: iload           5
        //  1100: aload           13
        //  1102: iload_1        
        //  1103: invokespecial   rc2/g.<init>:(Lrc2/e;[Ljava/lang/Object;ILjava/util/ArrayList;Z)V
        //  1106: aload_2        
        //  1107: aload_3        
        //  1108: invokevirtual   rc2/e.f:(Lod/g0;)V
        //  1111: goto            1420
        //  1114: aload_3        
        //  1115: getfield        rc2/e$f.i:Lrc2/e;
        //  1118: astore_2       
        //  1119: aload_2        
        //  1120: monitorenter   
        //  1121: aload_3        
        //  1122: getfield        rc2/e$f.i:Lrc2/e;
        //  1125: iload           5
        //  1127: invokevirtual   rc2/e.c:(I)Lrc2/n;
        //  1130: astore          11
        //  1132: aload           11
        //  1134: ifnonnull       1304
        //  1137: aload_3        
        //  1138: getfield        rc2/e$f.i:Lrc2/e;
        //  1141: astore          11
        //  1143: aload           11
        //  1145: getfield        rc2/e.l:Z
        //  1148: ifeq            1156
        //  1151: aload_2        
        //  1152: monitorexit    
        //  1153: goto            1420
        //  1156: iload           5
        //  1158: aload           11
        //  1160: getfield        rc2/e.j:I
        //  1163: if_icmpgt       1171
        //  1166: aload_2        
        //  1167: monitorexit    
        //  1168: goto            1420
        //  1171: iload           5
        //  1173: iconst_2       
        //  1174: irem           
        //  1175: aload           11
        //  1177: getfield        rc2/e.k:I
        //  1180: iconst_2       
        //  1181: irem           
        //  1182: if_icmpne       1190
        //  1185: aload_2        
        //  1186: monitorexit    
        //  1187: goto            1420
        //  1190: aload           13
        //  1192: invokestatic    mc2/a.v:(Ljava/util/ArrayList;)Llc2/q;
        //  1195: astore          11
        //  1197: new             Lrc2/n;
        //  1200: astore          13
        //  1202: aload           13
        //  1204: iload           5
        //  1206: aload_3        
        //  1207: getfield        rc2/e$f.i:Lrc2/e;
        //  1210: iconst_0       
        //  1211: iload_1        
        //  1212: aload           11
        //  1214: invokespecial   rc2/n.<init>:(ILrc2/e;ZZLlc2/q;)V
        //  1217: aload_3        
        //  1218: getfield        rc2/e$f.i:Lrc2/e;
        //  1221: astore          11
        //  1223: aload           11
        //  1225: iload           5
        //  1227: putfield        rc2/e.j:I
        //  1230: aload           11
        //  1232: getfield        rc2/e.h:Ljava/util/LinkedHashMap;
        //  1235: iload           5
        //  1237: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1240: aload           13
        //  1242: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1247: pop            
        //  1248: getstatic       rc2/e.y:Ljava/util/concurrent/ThreadPoolExecutor;
        //  1251: astore          12
        //  1253: new             Lrc2/j;
        //  1256: astore          11
        //  1258: aload           11
        //  1260: aload_3        
        //  1261: iconst_2       
        //  1262: anewarray       Ljava/lang/Object;
        //  1265: dup            
        //  1266: iconst_0       
        //  1267: aload_3        
        //  1268: getfield        rc2/e$f.i:Lrc2/e;
        //  1271: getfield        rc2/e.i:Ljava/lang/String;
        //  1274: aastore        
        //  1275: dup            
        //  1276: iconst_1       
        //  1277: iload           5
        //  1279: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1282: aastore        
        //  1283: aload           13
        //  1285: invokespecial   rc2/j.<init>:(Lrc2/e$f;[Ljava/lang/Object;Lrc2/n;)V
        //  1288: aload           12
        //  1290: aload           11
        //  1292: invokevirtual   java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        //  1295: aload_2        
        //  1296: monitorexit    
        //  1297: goto            1420
        //  1300: astore_3       
        //  1301: goto            1429
        //  1304: aload_2        
        //  1305: monitorexit    
        //  1306: aload           11
        //  1308: monitorenter   
        //  1309: aload           11
        //  1311: iconst_1       
        //  1312: putfield        rc2/n.f:Z
        //  1315: aload           11
        //  1317: getfield        rc2/n.e:Ljava/util/ArrayDeque;
        //  1320: aload           13
        //  1322: invokestatic    mc2/a.v:(Ljava/util/ArrayList;)Llc2/q;
        //  1325: invokevirtual   java/util/ArrayDeque.add:(Ljava/lang/Object;)Z
        //  1328: pop            
        //  1329: aload           11
        //  1331: invokevirtual   rc2/n.f:()Z
        //  1334: istore          15
        //  1336: aload           11
        //  1338: invokevirtual   java/lang/Object.notifyAll:()V
        //  1341: aload           11
        //  1343: monitorexit    
        //  1344: iload           15
        //  1346: ifne            1363
        //  1349: aload           11
        //  1351: getfield        rc2/n.d:Lrc2/e;
        //  1354: aload           11
        //  1356: getfield        rc2/n.c:I
        //  1359: invokevirtual   rc2/e.g:(I)Lrc2/n;
        //  1362: pop            
        //  1363: iload_1        
        //  1364: ifeq            1420
        //  1367: aload           11
        //  1369: monitorenter   
        //  1370: aload           11
        //  1372: getfield        rc2/n.g:Lrc2/n$b;
        //  1375: iconst_1       
        //  1376: putfield        rc2/n$b.j:Z
        //  1379: aload           11
        //  1381: invokevirtual   rc2/n.f:()Z
        //  1384: istore_1       
        //  1385: aload           11
        //  1387: invokevirtual   java/lang/Object.notifyAll:()V
        //  1390: aload           11
        //  1392: monitorexit    
        //  1393: iload_1        
        //  1394: ifne            1420
        //  1397: aload           11
        //  1399: getfield        rc2/n.d:Lrc2/e;
        //  1402: aload           11
        //  1404: getfield        rc2/n.c:I
        //  1407: invokevirtual   rc2/e.g:(I)Lrc2/n;
        //  1410: pop            
        //  1411: goto            1420
        //  1414: astore_2       
        //  1415: aload           11
        //  1417: monitorexit    
        //  1418: aload_2        
        //  1419: athrow         
        //  1420: goto            2206
        //  1423: astore_2       
        //  1424: aload           11
        //  1426: monitorexit    
        //  1427: aload_2        
        //  1428: athrow         
        //  1429: aload_2        
        //  1430: monitorexit    
        //  1431: aload_3        
        //  1432: athrow         
        //  1433: ldc_w           "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
        //  1436: iconst_0       
        //  1437: anewarray       Ljava/lang/Object;
        //  1440: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1443: aconst_null    
        //  1444: athrow         
        //  1445: iload           5
        //  1447: ifeq            2194
        //  1450: iload           8
        //  1452: iconst_1       
        //  1453: iand           
        //  1454: ifeq            1462
        //  1457: iconst_1       
        //  1458: istore_1       
        //  1459: goto            1464
        //  1462: iconst_0       
        //  1463: istore_1       
        //  1464: iload           8
        //  1466: bipush          32
        //  1468: iand           
        //  1469: ifeq            1478
        //  1472: iconst_1       
        //  1473: istore          4
        //  1475: goto            1481
        //  1478: iconst_0       
        //  1479: istore          4
        //  1481: iload           4
        //  1483: ifne            2182
        //  1486: iload           8
        //  1488: bipush          8
        //  1490: iand           
        //  1491: ifeq            1517
        //  1494: aload_0        
        //  1495: getfield        rc2/m.f:Lxc2/e;
        //  1498: invokeinterface xc2/e.readByte:()B
        //  1503: sipush          255
        //  1506: iand           
        //  1507: i2s            
        //  1508: istore          4
        //  1510: iload           4
        //  1512: istore          14
        //  1514: goto            1524
        //  1517: iconst_0       
        //  1518: istore          4
        //  1520: iload           4
        //  1522: istore          14
        //  1524: iload           6
        //  1526: iload           8
        //  1528: iload           14
        //  1530: invokestatic    rc2/m.a:(IBS)I
        //  1533: istore          6
        //  1535: aload_0        
        //  1536: getfield        rc2/m.f:Lxc2/e;
        //  1539: astore_3       
        //  1540: aload_2        
        //  1541: checkcast       Lrc2/e$f;
        //  1544: astore          13
        //  1546: aload           13
        //  1548: getfield        rc2/e$f.i:Lrc2/e;
        //  1551: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1554: pop            
        //  1555: iload           5
        //  1557: ifeq            1573
        //  1560: iload           5
        //  1562: iconst_1       
        //  1563: iand           
        //  1564: ifne            1573
        //  1567: iconst_1       
        //  1568: istore          4
        //  1570: goto            1576
        //  1573: iconst_0       
        //  1574: istore          4
        //  1576: iload           4
        //  1578: ifeq            1722
        //  1581: aload           13
        //  1583: getfield        rc2/e$f.i:Lrc2/e;
        //  1586: astore          13
        //  1588: aload           13
        //  1590: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1593: pop            
        //  1594: new             Lcom/sendbird/android/shadow/okio/a;
        //  1597: dup            
        //  1598: invokespecial   com/sendbird/android/shadow/okio/a.<init>:()V
        //  1601: astore_2       
        //  1602: iload           6
        //  1604: i2l            
        //  1605: lstore          16
        //  1607: aload_3        
        //  1608: lload           16
        //  1610: invokeinterface xc2/e.c1:(J)V
        //  1615: aload_3        
        //  1616: aload_2        
        //  1617: lload           16
        //  1619: invokeinterface xc2/t.m:(Lcom/sendbird/android/shadow/okio/a;J)J
        //  1624: pop2           
        //  1625: aload_2        
        //  1626: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  1629: lload           16
        //  1631: lcmp           
        //  1632: ifne            1678
        //  1635: aload           13
        //  1637: new             Lrc2/h;
        //  1640: dup            
        //  1641: aload           13
        //  1643: iconst_2       
        //  1644: anewarray       Ljava/lang/Object;
        //  1647: dup            
        //  1648: iconst_0       
        //  1649: aload           13
        //  1651: getfield        rc2/e.i:Ljava/lang/String;
        //  1654: aastore        
        //  1655: dup            
        //  1656: iconst_1       
        //  1657: iload           5
        //  1659: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1662: aastore        
        //  1663: iload           5
        //  1665: aload_2        
        //  1666: iload           6
        //  1668: iload_1        
        //  1669: invokespecial   rc2/h.<init>:(Lrc2/e;[Ljava/lang/Object;ILcom/sendbird/android/shadow/okio/a;IZ)V
        //  1672: invokevirtual   rc2/e.f:(Lod/g0;)V
        //  1675: goto            1775
        //  1678: new             Ljava/lang/StringBuilder;
        //  1681: dup            
        //  1682: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1685: astore_3       
        //  1686: aload_3        
        //  1687: aload_2        
        //  1688: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  1691: invokevirtual   java/lang/StringBuilder.append:(J)Ljava/lang/StringBuilder;
        //  1694: pop            
        //  1695: aload_3        
        //  1696: ldc_w           " != "
        //  1699: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1702: pop            
        //  1703: aload_3        
        //  1704: iload           6
        //  1706: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1709: pop            
        //  1710: new             Ljava/io/IOException;
        //  1713: dup            
        //  1714: aload_3        
        //  1715: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1718: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;)V
        //  1721: athrow         
        //  1722: aload           13
        //  1724: getfield        rc2/e$f.i:Lrc2/e;
        //  1727: iload           5
        //  1729: invokevirtual   rc2/e.c:(I)Lrc2/n;
        //  1732: astore_2       
        //  1733: aload_2        
        //  1734: ifnonnull       1782
        //  1737: aload           13
        //  1739: getfield        rc2/e$f.i:Lrc2/e;
        //  1742: iload           5
        //  1744: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.PROTOCOL_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //  1747: invokevirtual   rc2/e.p:(ILcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
        //  1750: aload           13
        //  1752: getfield        rc2/e$f.i:Lrc2/e;
        //  1755: astore_2       
        //  1756: iload           6
        //  1758: i2l            
        //  1759: lstore          16
        //  1761: aload_2        
        //  1762: lload           16
        //  1764: invokevirtual   rc2/e.j:(J)V
        //  1767: aload_3        
        //  1768: lload           16
        //  1770: invokeinterface xc2/e.skip:(J)V
        //  1775: iload           14
        //  1777: istore          4
        //  1779: goto            2167
        //  1782: aload_2        
        //  1783: getfield        rc2/n.g:Lrc2/n$b;
        //  1786: astore          13
        //  1788: iload           6
        //  1790: i2l            
        //  1791: lstore          16
        //  1793: iload           14
        //  1795: istore          4
        //  1797: lload           16
        //  1799: lconst_0       
        //  1800: lcmp           
        //  1801: ifle            2096
        //  1804: aload           13
        //  1806: getfield        rc2/n$b.k:Lrc2/n;
        //  1809: astore          11
        //  1811: aload           11
        //  1813: monitorenter   
        //  1814: aload           13
        //  1816: getfield        rc2/n$b.j:Z
        //  1819: istore          15
        //  1821: aload           13
        //  1823: getfield        rc2/n$b.g:Lcom/sendbird/android/shadow/okio/a;
        //  1826: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  1829: lload           16
        //  1831: ladd           
        //  1832: aload           13
        //  1834: getfield        rc2/n$b.h:J
        //  1837: lcmp           
        //  1838: ifle            1847
        //  1841: iconst_1       
        //  1842: istore          5
        //  1844: goto            1850
        //  1847: iconst_0       
        //  1848: istore          5
        //  1850: aload           11
        //  1852: monitorexit    
        //  1853: iload           5
        //  1855: ifeq            1906
        //  1858: aload_3        
        //  1859: lload           16
        //  1861: invokeinterface xc2/e.skip:(J)V
        //  1866: aload           13
        //  1868: getfield        rc2/n$b.k:Lrc2/n;
        //  1871: astore          13
        //  1873: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.FLOW_CONTROL_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //  1876: astore_3       
        //  1877: aload           13
        //  1879: aload_3        
        //  1880: invokevirtual   rc2/n.d:(Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)Z
        //  1883: ifne            1889
        //  1886: goto            2102
        //  1889: aload           13
        //  1891: getfield        rc2/n.d:Lrc2/e;
        //  1894: aload           13
        //  1896: getfield        rc2/n.c:I
        //  1899: aload_3        
        //  1900: invokevirtual   rc2/e.p:(ILcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
        //  1903: goto            2102
        //  1906: iload           15
        //  1908: ifeq            1922
        //  1911: aload_3        
        //  1912: lload           16
        //  1914: invokeinterface xc2/e.skip:(J)V
        //  1919: goto            2102
        //  1922: aload_3        
        //  1923: aload           13
        //  1925: getfield        rc2/n$b.f:Lcom/sendbird/android/shadow/okio/a;
        //  1928: lload           16
        //  1930: invokeinterface xc2/t.m:(Lcom/sendbird/android/shadow/okio/a;J)J
        //  1935: lstore          18
        //  1937: lload           18
        //  1939: ldc2_w          -1
        //  1942: lcmp           
        //  1943: ifeq            2082
        //  1946: lload           16
        //  1948: lload           18
        //  1950: lsub           
        //  1951: lstore          18
        //  1953: aload           13
        //  1955: getfield        rc2/n$b.k:Lrc2/n;
        //  1958: astore          11
        //  1960: aload           11
        //  1962: monitorenter   
        //  1963: aload           13
        //  1965: getfield        rc2/n$b.i:Z
        //  1968: ifeq            1993
        //  1971: aload           13
        //  1973: getfield        rc2/n$b.f:Lcom/sendbird/android/shadow/okio/a;
        //  1976: astore          12
        //  1978: aload           12
        //  1980: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  1983: lstore          16
        //  1985: aload           12
        //  1987: invokevirtual   com/sendbird/android/shadow/okio/a.b:()V
        //  1990: goto            2046
        //  1993: aload           13
        //  1995: getfield        rc2/n$b.g:Lcom/sendbird/android/shadow/okio/a;
        //  1998: astore          12
        //  2000: aload           12
        //  2002: getfield        com/sendbird/android/shadow/okio/a.g:J
        //  2005: lconst_0       
        //  2006: lcmp           
        //  2007: ifne            2016
        //  2010: iconst_1       
        //  2011: istore          5
        //  2013: goto            2019
        //  2016: iconst_0       
        //  2017: istore          5
        //  2019: aload           12
        //  2021: aload           13
        //  2023: getfield        rc2/n$b.f:Lcom/sendbird/android/shadow/okio/a;
        //  2026: invokevirtual   com/sendbird/android/shadow/okio/a.B:(Lxc2/t;)J
        //  2029: pop2           
        //  2030: iload           5
        //  2032: ifeq            2043
        //  2035: aload           13
        //  2037: getfield        rc2/n$b.k:Lrc2/n;
        //  2040: invokevirtual   java/lang/Object.notifyAll:()V
        //  2043: lconst_0       
        //  2044: lstore          16
        //  2046: aload           11
        //  2048: monitorexit    
        //  2049: lload           16
        //  2051: lconst_0       
        //  2052: lcmp           
        //  2053: ifle            2069
        //  2056: aload           13
        //  2058: getfield        rc2/n$b.k:Lrc2/n;
        //  2061: getfield        rc2/n.d:Lrc2/e;
        //  2064: lload           16
        //  2066: invokevirtual   rc2/e.j:(J)V
        //  2069: lload           18
        //  2071: lstore          16
        //  2073: goto            1797
        //  2076: astore_2       
        //  2077: aload           11
        //  2079: monitorexit    
        //  2080: aload_2        
        //  2081: athrow         
        //  2082: new             Ljava/io/EOFException;
        //  2085: dup            
        //  2086: invokespecial   java/io/EOFException.<init>:()V
        //  2089: athrow         
        //  2090: astore_2       
        //  2091: aload           11
        //  2093: monitorexit    
        //  2094: aload_2        
        //  2095: athrow         
        //  2096: aload           13
        //  2098: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  2101: pop            
        //  2102: iload           4
        //  2104: istore          5
        //  2106: iload           5
        //  2108: istore          4
        //  2110: iload_1        
        //  2111: ifeq            2167
        //  2114: aload_2        
        //  2115: monitorenter   
        //  2116: aload_2        
        //  2117: getfield        rc2/n.g:Lrc2/n$b;
        //  2120: iconst_1       
        //  2121: putfield        rc2/n$b.j:Z
        //  2124: aload_2        
        //  2125: invokevirtual   rc2/n.f:()Z
        //  2128: istore_1       
        //  2129: aload_2        
        //  2130: invokevirtual   java/lang/Object.notifyAll:()V
        //  2133: aload_2        
        //  2134: monitorexit    
        //  2135: iload           5
        //  2137: istore          4
        //  2139: iload_1        
        //  2140: ifne            2167
        //  2143: aload_2        
        //  2144: getfield        rc2/n.d:Lrc2/e;
        //  2147: aload_2        
        //  2148: getfield        rc2/n.c:I
        //  2151: invokevirtual   rc2/e.g:(I)Lrc2/n;
        //  2154: pop            
        //  2155: iload           5
        //  2157: istore          4
        //  2159: goto            2167
        //  2162: astore_3       
        //  2163: aload_2        
        //  2164: monitorexit    
        //  2165: aload_3        
        //  2166: athrow         
        //  2167: aload_0        
        //  2168: getfield        rc2/m.f:Lxc2/e;
        //  2171: iload           4
        //  2173: i2l            
        //  2174: invokeinterface xc2/e.skip:(J)V
        //  2179: goto            2206
        //  2182: ldc_w           "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
        //  2185: iconst_0       
        //  2186: anewarray       Ljava/lang/Object;
        //  2189: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  2192: aconst_null    
        //  2193: athrow         
        //  2194: ldc_w           "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
        //  2197: iconst_0       
        //  2198: anewarray       Ljava/lang/Object;
        //  2201: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  2204: aconst_null    
        //  2205: athrow         
        //  2206: iconst_1       
        //  2207: ireturn        
        //  2208: ldc_w           "FRAME_SIZE_ERROR: %s"
        //  2211: iconst_1       
        //  2212: anewarray       Ljava/lang/Object;
        //  2215: dup            
        //  2216: iconst_0       
        //  2217: iload           6
        //  2219: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2222: aastore        
        //  2223: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  2226: aconst_null    
        //  2227: athrow         
        //  2228: astore_2       
        //  2229: iconst_0       
        //  2230: ireturn        
        //  2231: astore_2       
        //  2232: goto            1420
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  0      12     2228   2231   Ljava/io/IOException;
        //  553    597    2231   2235   Ljava/util/concurrent/RejectedExecutionException;
        //  759    775    780    785    Any
        //  1073   1111   2231   2235   Ljava/util/concurrent/RejectedExecutionException;
        //  1121   1132   1300   1433   Any
        //  1137   1153   1300   1433   Any
        //  1156   1168   1300   1433   Any
        //  1171   1187   1300   1433   Any
        //  1190   1297   1300   1433   Any
        //  1304   1306   1300   1433   Any
        //  1309   1344   1423   1429   Any
        //  1370   1393   1414   1420   Any
        //  1415   1418   1414   1420   Any
        //  1424   1427   1423   1429   Any
        //  1429   1431   1300   1433   Any
        //  1814   1841   2090   2096   Any
        //  1850   1853   2090   2096   Any
        //  1963   1990   2076   2082   Any
        //  1993   2010   2076   2082   Any
        //  2019   2030   2076   2082   Any
        //  2035   2043   2076   2082   Any
        //  2046   2049   2076   2082   Any
        //  2077   2080   2076   2082   Any
        //  2091   2094   2090   2096   Any
        //  2116   2135   2162   2167   Any
        //  2163   2165   2162   2167   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0600:
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
    
    public final void c(final b b) throws IOException {
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
                j.fine(mc2.a.l("<< CONNECTION %s", new Object[] { u0.hex() }));
            }
            if (!a.equals(u0)) {
                c.b("Expected a connection header but was %s", u0.utf8());
                throw null;
            }
        }
    }
    
    @Override
    public final void close() throws IOException {
        ((t)this.f).close();
    }
    
    public final void f(final b b, int i, int int1) throws IOException {
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
                final rc2.e.f f = (rc2.e.f)b;
                f.getClass();
                byteString.size();
                Object j = f.i;
                synchronized (j) {
                    final n[] array = (n[])f.i.h.values().toArray(new n[f.i.h.size()]);
                    f.i.l = true;
                    monitorexit(j);
                    int length;
                    ErrorCode refused_STREAM;
                    for (length = array.length, i = n; i < length; ++i) {
                        j = array[i];
                        if (((n)j).c > int1 && ((n)j).e()) {
                            refused_STREAM = ErrorCode.REFUSED_STREAM;
                            synchronized (j) {
                                if (((n)j).k == null) {
                                    ((n)j).k = refused_STREAM;
                                    j.notifyAll();
                                }
                                monitorexit(j);
                                f.i.g(((n)j).c);
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
    
    public final ArrayList g(int n, final short n2, final byte b, final int i) throws IOException {
        final a g = this.g;
        g.j = n;
        g.g = n;
        g.k = n2;
        g.h = b;
        g.i = i;
        final rc2.b.a j = this.i;
        while (!j.b.e1()) {
            n = (j.b.readByte() & 0xFF);
            if (n == 128) {
                throw new IOException("index == 0");
            }
            final int n3 = 0;
            if ((n & 0x80) == 0x80) {
                final int n4 = j.e(n, 127) - 1;
                n = n3;
                if (n4 >= 0) {
                    n = n3;
                    if (n4 <= b.a.length - 1) {
                        n = 1;
                    }
                }
                if (n == 0) {
                    n = b.a.length;
                    n = j.f + 1 + (n4 - n);
                    if (n >= 0) {
                        final rc2.a[] e = j.e;
                        if (n < e.length) {
                            j.a.add(e[n]);
                            continue;
                        }
                    }
                    final StringBuilder r = a.r("Header index too large ");
                    r.append(n4 + 1);
                    throw new IOException(r.toString());
                }
                j.a.add(b.a[n4]);
            }
            else if (n == 64) {
                final ByteString d = j.d();
                b.a(d);
                j.c(new rc2.a(d, j.d()));
            }
            else if ((n & 0x40) == 0x40) {
                j.c(new rc2.a(j.b(j.e(n, 63) - 1), j.d()));
            }
            else if ((n & 0x20) == 0x20) {
                final int e2 = j.e(n, 31);
                j.d = e2;
                if (e2 < 0 || e2 > j.c) {
                    final StringBuilder r2 = a.r("Invalid dynamic table size update ");
                    r2.append(j.d);
                    throw new IOException(r2.toString());
                }
                n = j.h;
                if (e2 >= n) {
                    continue;
                }
                if (e2 == 0) {
                    Arrays.fill(j.e, null);
                    j.f = j.e.length - 1;
                    j.g = 0;
                    j.h = 0;
                }
                else {
                    j.a(n - e2);
                }
            }
            else if (n != 16 && n != 0) {
                j.a.add(new rc2.a(j.b(j.e(n, 15) - 1), j.d()));
            }
            else {
                final ByteString d2 = j.d();
                b.a(d2);
                j.a.add(new rc2.a(d2, j.d()));
            }
        }
        final rc2.b.a k = this.i;
        k.getClass();
        final ArrayList list = new ArrayList(k.a);
        k.a.clear();
        return list;
    }
    
    public final void h(final b b, int n, final byte b2, int int1) throws IOException {
        Label_0149: {
            if (n != 8) {
                break Label_0149;
            }
            Label_0137: {
                if (int1 != 0) {
                    break Label_0137;
                }
                final int int2 = this.f.readInt();
                int1 = this.f.readInt();
                if ((b2 & 0x1) != 0x0) {
                    n = 1;
                }
                else {
                    n = 0;
                }
                final rc2.e.f f = (rc2.e.f)b;
                f.getClass();
                if (n != 0) {
                    synchronized (f.i) {
                        final rc2.e i = f.i;
                        i.p = false;
                        i.notifyAll();
                        return;
                    }
                }
                try {
                    final rc2.e j = f.i;
                    j.m.execute(j.new e(true, int2, int1));
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
    
    public final void j(final b p0, final int p1, final byte p2, final int p3) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: ifeq            182
        //     5: iload_3        
        //     6: bipush          8
        //     8: iand           
        //     9: ifeq            35
        //    12: aload_0        
        //    13: getfield        rc2/m.f:Lxc2/e;
        //    16: invokeinterface xc2/e.readByte:()B
        //    21: sipush          255
        //    24: iand           
        //    25: i2s            
        //    26: istore          5
        //    28: iload           5
        //    30: istore          6
        //    32: goto            42
        //    35: iconst_0       
        //    36: istore          5
        //    38: iload           5
        //    40: istore          6
        //    42: aload_0        
        //    43: getfield        rc2/m.f:Lxc2/e;
        //    46: invokeinterface xc2/e.readInt:()I
        //    51: ldc             2147483647
        //    53: iand           
        //    54: istore          5
        //    56: aload_0        
        //    57: iload_2        
        //    58: iconst_4       
        //    59: isub           
        //    60: iload_3        
        //    61: iload           6
        //    63: invokestatic    rc2/m.a:(IBS)I
        //    66: iload           6
        //    68: iload_3        
        //    69: iload           4
        //    71: invokevirtual   rc2/m.g:(ISBI)Ljava/util/ArrayList;
        //    74: astore          7
        //    76: aload_1        
        //    77: checkcast       Lrc2/e$f;
        //    80: getfield        rc2/e$f.i:Lrc2/e;
        //    83: astore_1       
        //    84: aload_1        
        //    85: monitorenter   
        //    86: aload_1        
        //    87: getfield        rc2/e.x:Ljava/util/LinkedHashSet;
        //    90: iload           5
        //    92: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    95: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   100: ifeq            117
        //   103: aload_1        
        //   104: iload           5
        //   106: getstatic       com/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode.PROTOCOL_ERROR:Lcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;
        //   109: invokevirtual   rc2/e.p:(ILcom/sendbird/android/shadow/okhttp3/internal/http2/ErrorCode;)V
        //   112: aload_1        
        //   113: monitorexit    
        //   114: goto            174
        //   117: aload_1        
        //   118: getfield        rc2/e.x:Ljava/util/LinkedHashSet;
        //   121: iload           5
        //   123: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   126: invokeinterface java/util/Set.add:(Ljava/lang/Object;)Z
        //   131: pop            
        //   132: aload_1        
        //   133: monitorexit    
        //   134: new             Lrc2/f;
        //   137: astore          8
        //   139: aload           8
        //   141: aload_1        
        //   142: iconst_2       
        //   143: anewarray       Ljava/lang/Object;
        //   146: dup            
        //   147: iconst_0       
        //   148: aload_1        
        //   149: getfield        rc2/e.i:Ljava/lang/String;
        //   152: aastore        
        //   153: dup            
        //   154: iconst_1       
        //   155: iload           5
        //   157: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   160: aastore        
        //   161: iload           5
        //   163: aload           7
        //   165: invokespecial   rc2/f.<init>:(Lrc2/e;[Ljava/lang/Object;ILjava/util/ArrayList;)V
        //   168: aload_1        
        //   169: aload           8
        //   171: invokevirtual   rc2/e.f:(Lod/g0;)V
        //   174: return         
        //   175: astore          7
        //   177: aload_1        
        //   178: monitorexit    
        //   179: aload           7
        //   181: athrow         
        //   182: ldc_w           "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
        //   185: iconst_0       
        //   186: anewarray       Ljava/lang/Object;
        //   189: invokestatic    rc2/c.b:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   192: aconst_null    
        //   193: athrow         
        //   194: astore_1       
        //   195: goto            174
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  86     114    175    182    Any
        //  117    134    175    182    Any
        //  134    174    194    198    Ljava/util/concurrent/RejectedExecutionException;
        //  177    179    175    182    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0174:
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
    
    public final void n(final b b, int n, final int n2) throws IOException {
        if (n != 4) {
            c.b("TYPE_WINDOW_UPDATE length !=4: %s", n);
            throw null;
        }
        final long n3 = (long)this.f.readInt() & 0x7FFFFFFFL;
        n = lcmp(n3, 0L);
        if (n != 0) {
            final rc2.e.f f = (rc2.e.f)b;
            if (n2 == 0) {
                synchronized (f.i) {
                    final rc2.e i = f.i;
                    i.r += n3;
                    i.notifyAll();
                    return;
                }
            }
            final n c = f.i.c(n2);
            if (c != null) {
                synchronized (c) {
                    c.b += n3;
                    if (n > 0) {
                        c.notifyAll();
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
