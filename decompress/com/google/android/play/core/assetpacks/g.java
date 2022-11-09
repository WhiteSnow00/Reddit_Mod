// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.play.core.assetpacks;

import eg.f0;
import eg.e1;
import eg.u1;
import ig.k0;
import dg.k;

public final class g
{
    public static final k g;
    public final byte[] a;
    public final c b;
    public final k0<u1> c;
    public final k0<b> d;
    public final eg.k0 e;
    public final e1 f;
    
    static {
        g = new k("ExtractChunkTaskHandler");
    }
    
    public g(final c b, final k0<u1> c, final k0<b> d, final eg.k0 e, final e1 f) {
        this.a = new byte[8192];
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final void a(final f0 p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/google/android/play/core/assetpacks/g.b:Lcom/google/android/play/core/assetpacks/c;
        //     4: astore_2       
        //     5: aload_1        
        //     6: getfield        eg/s0.b:Ljava/lang/String;
        //     9: astore_3       
        //    10: aload_1        
        //    11: getfield        eg/f0.d:I
        //    14: istore          4
        //    16: aload_1        
        //    17: getfield        eg/f0.e:J
        //    20: lstore          5
        //    22: aload_1        
        //    23: getfield        eg/f0.g:Ljava/lang/String;
        //    26: astore          7
        //    28: new             Lcom/google/android/play/core/assetpacks/o;
        //    31: dup            
        //    32: aload_2        
        //    33: aload_3        
        //    34: iload           4
        //    36: lload           5
        //    38: aload           7
        //    40: invokespecial   com/google/android/play/core/assetpacks/o.<init>:(Lcom/google/android/play/core/assetpacks/c;Ljava/lang/String;IJLjava/lang/String;)V
        //    43: astore          8
        //    45: aload_2        
        //    46: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    49: pop            
        //    50: new             Ljava/io/File;
        //    53: dup            
        //    54: new             Ljava/io/File;
        //    57: dup            
        //    58: new             Ljava/io/File;
        //    61: dup            
        //    62: aload_2        
        //    63: iload           4
        //    65: aload_3        
        //    66: lload           5
        //    68: invokevirtual   com/google/android/play/core/assetpacks/c.c:(ILjava/lang/String;J)Ljava/io/File;
        //    71: ldc             "_slices"
        //    73: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    76: ldc             "_metadata"
        //    78: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    81: aload           7
        //    83: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //    86: astore_3       
        //    87: aload_3        
        //    88: invokevirtual   java/io/File.exists:()Z
        //    91: ifne            99
        //    94: aload_3        
        //    95: invokevirtual   java/io/File.mkdirs:()Z
        //    98: pop            
        //    99: aload_1        
        //   100: getfield        eg/f0.m:Ljava/io/InputStream;
        //   103: astore_3       
        //   104: aload_1        
        //   105: getfield        eg/f0.h:I
        //   108: iconst_1       
        //   109: if_icmpeq       115
        //   112: goto            127
        //   115: new             Ljava/util/zip/GZIPInputStream;
        //   118: dup            
        //   119: aload_3        
        //   120: sipush          8192
        //   123: invokespecial   java/util/zip/GZIPInputStream.<init>:(Ljava/io/InputStream;I)V
        //   126: astore_3       
        //   127: aload_1        
        //   128: getfield        eg/f0.i:I
        //   131: ifle            799
        //   134: aload           8
        //   136: invokevirtual   com/google/android/play/core/assetpacks/o.b:()Leg/z;
        //   139: astore          7
        //   141: aload           7
        //   143: getfield        eg/z.e:I
        //   146: istore          9
        //   148: aload_1        
        //   149: getfield        eg/f0.i:I
        //   152: istore          4
        //   154: iload           9
        //   156: iload           4
        //   158: iconst_1       
        //   159: isub           
        //   160: if_icmpne       754
        //   163: aload           7
        //   165: getfield        eg/z.a:I
        //   168: istore          4
        //   170: iload           4
        //   172: iconst_1       
        //   173: if_icmpeq       533
        //   176: iload           4
        //   178: iconst_2       
        //   179: if_icmpeq       371
        //   182: iload           4
        //   184: iconst_3       
        //   185: if_icmpne       334
        //   188: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //   191: ldc             "Resuming central directory from last chunk."
        //   193: iconst_0       
        //   194: anewarray       Ljava/lang/Object;
        //   197: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   200: aload           7
        //   202: getfield        eg/z.c:J
        //   205: lstore          5
        //   207: aload           8
        //   209: invokevirtual   com/google/android/play/core/assetpacks/o.c:()Ljava/io/File;
        //   212: astore_2       
        //   213: new             Ljava/io/RandomAccessFile;
        //   216: astore          7
        //   218: aload           7
        //   220: aload_2        
        //   221: ldc             "rw"
        //   223: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   226: aload           7
        //   228: lload           5
        //   230: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   233: aload_3        
        //   234: aload           8
        //   236: getfield        com/google/android/play/core/assetpacks/o.a:[B
        //   239: invokevirtual   java/io/InputStream.read:([B)I
        //   242: istore          4
        //   244: iload           4
        //   246: ifle            262
        //   249: aload           7
        //   251: aload           8
        //   253: getfield        com/google/android/play/core/assetpacks/o.a:[B
        //   256: iconst_0       
        //   257: iload           4
        //   259: invokevirtual   java/io/RandomAccessFile.write:([BII)V
        //   262: iload           4
        //   264: sipush          8192
        //   267: if_icmpeq       233
        //   270: aload           7
        //   272: invokevirtual   java/io/RandomAccessFile.close:()V
        //   275: aload_1        
        //   276: getfield        eg/f0.i:I
        //   279: iconst_1       
        //   280: iadd           
        //   281: aload_1        
        //   282: getfield        eg/f0.j:I
        //   285: if_icmpne       294
        //   288: iconst_1       
        //   289: istore          4
        //   291: goto            297
        //   294: iconst_0       
        //   295: istore          4
        //   297: iload           4
        //   299: ifeq            305
        //   302: goto            729
        //   305: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   308: astore          7
        //   310: aload           7
        //   312: ldc             "Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB."
        //   314: aload_1        
        //   315: getfield        eg/s0.c:I
        //   318: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;I)V
        //   321: aload           7
        //   323: athrow         
        //   324: astore          8
        //   326: aload           7
        //   328: invokevirtual   java/io/RandomAccessFile.close:()V
        //   331: aload           8
        //   333: athrow         
        //   334: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   337: astore          8
        //   339: aload           8
        //   341: ldc             "Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s."
        //   343: iconst_1       
        //   344: anewarray       Ljava/lang/Object;
        //   347: dup            
        //   348: iconst_0       
        //   349: aload           7
        //   351: getfield        eg/z.a:I
        //   354: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   357: aastore        
        //   358: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   361: aload_1        
        //   362: getfield        eg/s0.c:I
        //   365: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;I)V
        //   368: aload           8
        //   370: athrow         
        //   371: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //   374: ldc             "Resuming zip entry from last chunk during local file header."
        //   376: iconst_0       
        //   377: anewarray       Ljava/lang/Object;
        //   380: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   383: aload_0        
        //   384: getfield        com/google/android/play/core/assetpacks/g.b:Lcom/google/android/play/core/assetpacks/c;
        //   387: astore          10
        //   389: aload_1        
        //   390: getfield        eg/s0.b:Ljava/lang/String;
        //   393: astore          11
        //   395: aload_1        
        //   396: getfield        eg/f0.d:I
        //   399: istore          4
        //   401: aload_1        
        //   402: getfield        eg/f0.e:J
        //   405: lstore          5
        //   407: aload_1        
        //   408: getfield        eg/f0.g:Ljava/lang/String;
        //   411: astore_2       
        //   412: aload           10
        //   414: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   417: pop            
        //   418: new             Ljava/io/File;
        //   421: astore          7
        //   423: new             Ljava/io/File;
        //   426: astore          12
        //   428: new             Ljava/io/File;
        //   431: astore          13
        //   433: new             Ljava/io/File;
        //   436: astore          14
        //   438: aload           14
        //   440: aload           10
        //   442: iload           4
        //   444: aload           11
        //   446: lload           5
        //   448: invokevirtual   com/google/android/play/core/assetpacks/c.c:(ILjava/lang/String;J)Ljava/io/File;
        //   451: ldc             "_slices"
        //   453: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   456: aload           13
        //   458: aload           14
        //   460: ldc             "_metadata"
        //   462: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   465: aload           12
        //   467: aload           13
        //   469: aload_2        
        //   470: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   473: aload           7
        //   475: aload           12
        //   477: ldc             "checkpoint_ext.dat"
        //   479: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   482: aload           7
        //   484: invokevirtual   java/io/File.exists:()Z
        //   487: ifeq            514
        //   490: new             Ljava/io/FileInputStream;
        //   493: astore_2       
        //   494: aload_2        
        //   495: aload           7
        //   497: invokespecial   java/io/FileInputStream.<init>:(Ljava/io/File;)V
        //   500: new             Ljava/io/SequenceInputStream;
        //   503: dup            
        //   504: aload_2        
        //   505: aload_3        
        //   506: invokespecial   java/io/SequenceInputStream.<init>:(Ljava/io/InputStream;Ljava/io/InputStream;)V
        //   509: astore          7
        //   511: goto            802
        //   514: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   517: astore          7
        //   519: aload           7
        //   521: ldc             "Checkpoint extension file not found."
        //   523: aload_1        
        //   524: getfield        eg/s0.c:I
        //   527: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;I)V
        //   530: aload           7
        //   532: athrow         
        //   533: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //   536: ldc             "Resuming zip entry from last chunk during file %s."
        //   538: iconst_1       
        //   539: anewarray       Ljava/lang/Object;
        //   542: dup            
        //   543: iconst_0       
        //   544: aload           7
        //   546: getfield        eg/z.b:Ljava/lang/String;
        //   549: aastore        
        //   550: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   553: new             Ljava/io/File;
        //   556: astore          13
        //   558: aload           13
        //   560: aload           7
        //   562: getfield        eg/z.b:Ljava/lang/String;
        //   565: invokespecial   java/io/File.<init>:(Ljava/lang/String;)V
        //   568: aload           13
        //   570: invokevirtual   java/io/File.exists:()Z
        //   573: ifeq            735
        //   576: new             Ljava/io/RandomAccessFile;
        //   579: astore_2       
        //   580: aload_2        
        //   581: aload           13
        //   583: ldc             "rw"
        //   585: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   588: aload_2        
        //   589: aload           7
        //   591: getfield        eg/z.c:J
        //   594: invokevirtual   java/io/RandomAccessFile.seek:(J)V
        //   597: aload           7
        //   599: getfield        eg/z.d:J
        //   602: lstore          5
        //   604: lload           5
        //   606: ldc2_w          8192
        //   609: invokestatic    java/lang/Math.min:(JJ)J
        //   612: l2i            
        //   613: istore          9
        //   615: aload_3        
        //   616: aload_0        
        //   617: getfield        com/google/android/play/core/assetpacks/g.a:[B
        //   620: iconst_0       
        //   621: iload           9
        //   623: invokevirtual   java/io/InputStream.read:([BII)I
        //   626: iconst_0       
        //   627: invokestatic    java/lang/Math.max:(II)I
        //   630: istore          4
        //   632: iload           4
        //   634: ifle            648
        //   637: aload_2        
        //   638: aload_0        
        //   639: getfield        com/google/android/play/core/assetpacks/g.a:[B
        //   642: iconst_0       
        //   643: iload           4
        //   645: invokevirtual   java/io/RandomAccessFile.write:([BII)V
        //   648: lload           5
        //   650: iload           4
        //   652: i2l            
        //   653: lsub           
        //   654: lstore          5
        //   656: lload           5
        //   658: lconst_0       
        //   659: lcmp           
        //   660: ifle            674
        //   663: iload           4
        //   665: ifgt            671
        //   668: goto            674
        //   671: goto            604
        //   674: aload_2        
        //   675: invokevirtual   java/io/RandomAccessFile.length:()J
        //   678: lstore          15
        //   680: aload_2        
        //   681: invokevirtual   java/io/RandomAccessFile.close:()V
        //   684: iload           4
        //   686: iload           9
        //   688: if_icmpeq       799
        //   691: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //   694: ldc             "Chunk has ended while resuming the previous chunks file content."
        //   696: iconst_0       
        //   697: anewarray       Ljava/lang/Object;
        //   700: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   703: aload           13
        //   705: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //   708: astore          7
        //   710: aload_1        
        //   711: getfield        eg/f0.i:I
        //   714: istore          4
        //   716: aload           8
        //   718: iload           4
        //   720: lload           15
        //   722: lload           5
        //   724: aload           7
        //   726: invokevirtual   com/google/android/play/core/assetpacks/o.e:(IJJLjava/lang/String;)V
        //   729: aconst_null    
        //   730: astore          7
        //   732: goto            802
        //   735: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   738: astore          7
        //   740: aload           7
        //   742: ldc             "Partial file specified in checkpoint does not exist. Corrupt directory."
        //   744: aload_1        
        //   745: getfield        eg/s0.c:I
        //   748: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;I)V
        //   751: aload           7
        //   753: athrow         
        //   754: new             Lcom/google/android/play/core/assetpacks/zzck;
        //   757: astore          8
        //   759: aload           8
        //   761: ldc             "Trying to resume with chunk number %s when previously processed chunk was number %s."
        //   763: iconst_2       
        //   764: anewarray       Ljava/lang/Object;
        //   767: dup            
        //   768: iconst_0       
        //   769: iload           4
        //   771: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   774: aastore        
        //   775: dup            
        //   776: iconst_1       
        //   777: aload           7
        //   779: getfield        eg/z.e:I
        //   782: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   785: aastore        
        //   786: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   789: aload_1        
        //   790: getfield        eg/s0.c:I
        //   793: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;I)V
        //   796: aload           8
        //   798: athrow         
        //   799: aload_3        
        //   800: astore          7
        //   802: aload           7
        //   804: ifnull          1386
        //   807: new             Lcom/google/android/play/core/assetpacks/f;
        //   810: astore_2       
        //   811: aload_2        
        //   812: aload           7
        //   814: invokespecial   com/google/android/play/core/assetpacks/f.<init>:(Ljava/io/InputStream;)V
        //   817: aload_0        
        //   818: getfield        com/google/android/play/core/assetpacks/g.b:Lcom/google/android/play/core/assetpacks/c;
        //   821: astore          12
        //   823: aload_1        
        //   824: getfield        eg/s0.b:Ljava/lang/String;
        //   827: astore          13
        //   829: aload_1        
        //   830: getfield        eg/f0.d:I
        //   833: istore          4
        //   835: aload_1        
        //   836: getfield        eg/f0.e:J
        //   839: lstore          5
        //   841: aload           12
        //   843: iload           4
        //   845: aload           13
        //   847: aload_1        
        //   848: getfield        eg/f0.g:Ljava/lang/String;
        //   851: lload           5
        //   853: invokevirtual   com/google/android/play/core/assetpacks/c.k:(ILjava/lang/String;Ljava/lang/String;J)Ljava/io/File;
        //   856: astore          14
        //   858: aload           14
        //   860: invokevirtual   java/io/File.exists:()Z
        //   863: ifne            880
        //   866: aload           14
        //   868: invokevirtual   java/io/File.mkdirs:()Z
        //   871: pop            
        //   872: goto            880
        //   875: astore          7
        //   877: goto            1742
        //   880: aload_2        
        //   881: invokevirtual   com/google/android/play/core/assetpacks/f.b:()Leg/a0;
        //   884: astore          13
        //   886: aload           13
        //   888: getfield        eg/a0.d:Z
        //   891: ifne            1049
        //   894: aload_2        
        //   895: getfield        com/google/android/play/core/assetpacks/f.j:Z
        //   898: ifne            1049
        //   901: aload           13
        //   903: invokevirtual   eg/a0.a:()I
        //   906: ifne            915
        //   909: iconst_1       
        //   910: istore          4
        //   912: goto            918
        //   915: iconst_0       
        //   916: istore          4
        //   918: iload           4
        //   920: ifeq            1035
        //   923: aload           13
        //   925: invokevirtual   eg/m1.g:()Z
        //   928: ifne            1035
        //   931: aload           8
        //   933: aload           13
        //   935: getfield        eg/a0.f:[B
        //   938: invokevirtual   com/google/android/play/core/assetpacks/o.h:([B)V
        //   941: new             Ljava/io/File;
        //   944: astore          12
        //   946: aload           12
        //   948: aload           14
        //   950: aload           13
        //   952: getfield        eg/a0.a:Ljava/lang/String;
        //   955: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   958: aload           12
        //   960: invokevirtual   java/io/File.getParentFile:()Ljava/io/File;
        //   963: invokevirtual   java/io/File.mkdirs:()Z
        //   966: pop            
        //   967: new             Ljava/io/FileOutputStream;
        //   970: astore          10
        //   972: aload           10
        //   974: aload           12
        //   976: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //   979: aload_2        
        //   980: aload_0        
        //   981: getfield        com/google/android/play/core/assetpacks/g.a:[B
        //   984: iconst_0       
        //   985: sipush          8192
        //   988: invokevirtual   com/google/android/play/core/assetpacks/f.read:([BII)I
        //   991: istore          4
        //   993: iload           4
        //   995: ifle            1027
        //   998: aload           10
        //  1000: aload_0        
        //  1001: getfield        com/google/android/play/core/assetpacks/g.a:[B
        //  1004: iconst_0       
        //  1005: iload           4
        //  1007: invokevirtual   java/io/FileOutputStream.write:([BII)V
        //  1010: aload_2        
        //  1011: aload_0        
        //  1012: getfield        com/google/android/play/core/assetpacks/g.a:[B
        //  1015: iconst_0       
        //  1016: sipush          8192
        //  1019: invokevirtual   com/google/android/play/core/assetpacks/f.read:([BII)I
        //  1022: istore          4
        //  1024: goto            993
        //  1027: aload           10
        //  1029: invokevirtual   java/io/FileOutputStream.close:()V
        //  1032: goto            1049
        //  1035: aload           8
        //  1037: aload_2        
        //  1038: aload           13
        //  1040: getfield        eg/a0.f:[B
        //  1043: invokevirtual   com/google/android/play/core/assetpacks/o.i:(Ljava/io/InputStream;[B)V
        //  1046: goto            1049
        //  1049: aload_2        
        //  1050: getfield        com/google/android/play/core/assetpacks/f.i:Z
        //  1053: ifne            1063
        //  1056: aload_2        
        //  1057: getfield        com/google/android/play/core/assetpacks/f.j:Z
        //  1060: ifeq            880
        //  1063: aload_2        
        //  1064: getfield        com/google/android/play/core/assetpacks/f.j:Z
        //  1067: ifeq            1095
        //  1070: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1073: ldc_w           "Writing central directory metadata."
        //  1076: iconst_0       
        //  1077: anewarray       Ljava/lang/Object;
        //  1080: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1083: aload           8
        //  1085: aload           7
        //  1087: aload           13
        //  1089: getfield        eg/a0.f:[B
        //  1092: invokevirtual   com/google/android/play/core/assetpacks/o.i:(Ljava/io/InputStream;[B)V
        //  1095: aload_1        
        //  1096: getfield        eg/f0.i:I
        //  1099: iconst_1       
        //  1100: iadd           
        //  1101: aload_1        
        //  1102: getfield        eg/f0.j:I
        //  1105: if_icmpne       1114
        //  1108: iconst_1       
        //  1109: istore          4
        //  1111: goto            1117
        //  1114: iconst_0       
        //  1115: istore          4
        //  1117: iload           4
        //  1119: ifne            1386
        //  1122: aload           13
        //  1124: getfield        eg/a0.d:Z
        //  1127: ifeq            1164
        //  1130: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1133: ldc_w           "Writing slice checkpoint for partial local file header."
        //  1136: iconst_0       
        //  1137: anewarray       Ljava/lang/Object;
        //  1140: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1143: aload           13
        //  1145: getfield        eg/a0.f:[B
        //  1148: astore          7
        //  1150: aload           8
        //  1152: aload_1        
        //  1153: getfield        eg/f0.i:I
        //  1156: aload           7
        //  1158: invokevirtual   com/google/android/play/core/assetpacks/o.f:(I[B)V
        //  1161: goto            1386
        //  1164: aload_2        
        //  1165: getfield        com/google/android/play/core/assetpacks/f.j:Z
        //  1168: ifeq            1196
        //  1171: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1174: ldc_w           "Writing slice checkpoint for central directory."
        //  1177: iconst_0       
        //  1178: anewarray       Ljava/lang/Object;
        //  1181: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1184: aload           8
        //  1186: aload_1        
        //  1187: getfield        eg/f0.i:I
        //  1190: invokevirtual   com/google/android/play/core/assetpacks/o.d:(I)V
        //  1193: goto            1386
        //  1196: aload           13
        //  1198: getfield        eg/a0.c:I
        //  1201: ifne            1331
        //  1204: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1207: ldc_w           "Writing slice checkpoint for partial file."
        //  1210: iconst_0       
        //  1211: anewarray       Ljava/lang/Object;
        //  1214: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1217: new             Ljava/io/File;
        //  1220: astore          7
        //  1222: aload_0        
        //  1223: getfield        com/google/android/play/core/assetpacks/g.b:Lcom/google/android/play/core/assetpacks/c;
        //  1226: astore          12
        //  1228: aload_1        
        //  1229: getfield        eg/s0.b:Ljava/lang/String;
        //  1232: astore          10
        //  1234: aload_1        
        //  1235: getfield        eg/f0.d:I
        //  1238: istore          4
        //  1240: aload_1        
        //  1241: getfield        eg/f0.e:J
        //  1244: lstore          5
        //  1246: aload           12
        //  1248: iload           4
        //  1250: aload           10
        //  1252: aload_1        
        //  1253: getfield        eg/f0.g:Ljava/lang/String;
        //  1256: lload           5
        //  1258: invokevirtual   com/google/android/play/core/assetpacks/c.k:(ILjava/lang/String;Ljava/lang/String;J)Ljava/io/File;
        //  1261: astore          12
        //  1263: aload           12
        //  1265: invokevirtual   java/io/File.exists:()Z
        //  1268: ifne            1277
        //  1271: aload           12
        //  1273: invokevirtual   java/io/File.mkdirs:()Z
        //  1276: pop            
        //  1277: aload           7
        //  1279: aload           12
        //  1281: aload           13
        //  1283: getfield        eg/a0.a:Ljava/lang/String;
        //  1286: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1289: aload           13
        //  1291: getfield        eg/a0.b:J
        //  1294: aload_2        
        //  1295: getfield        com/google/android/play/core/assetpacks/f.h:J
        //  1298: lsub           
        //  1299: lstore          5
        //  1301: aload           7
        //  1303: invokevirtual   java/io/File.length:()J
        //  1306: lload           5
        //  1308: lcmp           
        //  1309: ifne            1315
        //  1312: goto            1358
        //  1315: new             Lcom/google/android/play/core/assetpacks/zzck;
        //  1318: astore          7
        //  1320: aload           7
        //  1322: ldc_w           "Partial file is of unexpected size."
        //  1325: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;)V
        //  1328: aload           7
        //  1330: athrow         
        //  1331: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1334: ldc_w           "Writing slice checkpoint for partial unextractable file."
        //  1337: iconst_0       
        //  1338: anewarray       Ljava/lang/Object;
        //  1341: invokevirtual   dg/k.g:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1344: aload           8
        //  1346: invokevirtual   com/google/android/play/core/assetpacks/o.c:()Ljava/io/File;
        //  1349: astore          7
        //  1351: aload           7
        //  1353: invokevirtual   java/io/File.length:()J
        //  1356: lstore          5
        //  1358: aload           7
        //  1360: invokevirtual   java/io/File.getCanonicalPath:()Ljava/lang/String;
        //  1363: astore          7
        //  1365: aload_2        
        //  1366: getfield        com/google/android/play/core/assetpacks/f.h:J
        //  1369: lstore          15
        //  1371: aload           8
        //  1373: aload_1        
        //  1374: getfield        eg/f0.i:I
        //  1377: lload           5
        //  1379: lload           15
        //  1381: aload           7
        //  1383: invokevirtual   com/google/android/play/core/assetpacks/o.e:(IJJLjava/lang/String;)V
        //  1386: aload_3        
        //  1387: invokevirtual   java/io/InputStream.close:()V
        //  1390: aload_1        
        //  1391: getfield        eg/f0.i:I
        //  1394: istore          9
        //  1396: iload           9
        //  1398: iconst_1       
        //  1399: iadd           
        //  1400: aload_1        
        //  1401: getfield        eg/f0.j:I
        //  1404: if_icmpne       1413
        //  1407: iconst_1       
        //  1408: istore          4
        //  1410: goto            1416
        //  1413: iconst_0       
        //  1414: istore          4
        //  1416: iload           4
        //  1418: ifeq            1468
        //  1421: aload           8
        //  1423: iload           9
        //  1425: invokevirtual   com/google/android/play/core/assetpacks/o.g:(I)V
        //  1428: goto            1468
        //  1431: astore_3       
        //  1432: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1435: ldc_w           "Writing extraction finished checkpoint failed with %s."
        //  1438: iconst_1       
        //  1439: anewarray       Ljava/lang/Object;
        //  1442: dup            
        //  1443: iconst_0       
        //  1444: aload_3        
        //  1445: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1448: aastore        
        //  1449: invokevirtual   dg/k.h:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1452: new             Lcom/google/android/play/core/assetpacks/zzck;
        //  1455: dup            
        //  1456: ldc_w           "Writing extraction finished checkpoint failed."
        //  1459: aload_3        
        //  1460: aload_1        
        //  1461: getfield        eg/s0.c:I
        //  1464: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;Ljava/lang/Exception;I)V
        //  1467: athrow         
        //  1468: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1471: ldc_w           "Extraction finished for chunk %s of slice %s of pack %s of session %s."
        //  1474: iconst_4       
        //  1475: anewarray       Ljava/lang/Object;
        //  1478: dup            
        //  1479: iconst_0       
        //  1480: aload_1        
        //  1481: getfield        eg/f0.i:I
        //  1484: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1487: aastore        
        //  1488: dup            
        //  1489: iconst_1       
        //  1490: aload_1        
        //  1491: getfield        eg/f0.g:Ljava/lang/String;
        //  1494: aastore        
        //  1495: dup            
        //  1496: iconst_2       
        //  1497: aload_1        
        //  1498: getfield        eg/s0.b:Ljava/lang/String;
        //  1501: aastore        
        //  1502: dup            
        //  1503: iconst_3       
        //  1504: aload_1        
        //  1505: getfield        eg/s0.c:I
        //  1508: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1511: aastore        
        //  1512: invokevirtual   dg/k.j:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1515: aload_0        
        //  1516: getfield        com/google/android/play/core/assetpacks/g.c:Lig/k0;
        //  1519: invokeinterface ig/k0.zza:()Ljava/lang/Object;
        //  1524: checkcast       Leg/u1;
        //  1527: astore          7
        //  1529: aload_1        
        //  1530: getfield        eg/s0.c:I
        //  1533: istore          4
        //  1535: aload_1        
        //  1536: getfield        eg/s0.b:Ljava/lang/String;
        //  1539: astore          8
        //  1541: aload_1        
        //  1542: getfield        eg/f0.g:Ljava/lang/String;
        //  1545: astore_3       
        //  1546: aload           7
        //  1548: iload           4
        //  1550: aload_1        
        //  1551: getfield        eg/f0.i:I
        //  1554: aload           8
        //  1556: aload_3        
        //  1557: invokeinterface eg/u1.g:(IILjava/lang/String;Ljava/lang/String;)V
        //  1562: aload_1        
        //  1563: getfield        eg/f0.m:Ljava/io/InputStream;
        //  1566: invokevirtual   java/io/InputStream.close:()V
        //  1569: goto            1610
        //  1572: astore_3       
        //  1573: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1576: ldc_w           "Could not close file for chunk %s of slice %s of pack %s."
        //  1579: iconst_3       
        //  1580: anewarray       Ljava/lang/Object;
        //  1583: dup            
        //  1584: iconst_0       
        //  1585: aload_1        
        //  1586: getfield        eg/f0.i:I
        //  1589: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1592: aastore        
        //  1593: dup            
        //  1594: iconst_1       
        //  1595: aload_1        
        //  1596: getfield        eg/f0.g:Ljava/lang/String;
        //  1599: aastore        
        //  1600: dup            
        //  1601: iconst_2       
        //  1602: aload_1        
        //  1603: getfield        eg/s0.b:Ljava/lang/String;
        //  1606: aastore        
        //  1607: invokevirtual   dg/k.k:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1610: aload_1        
        //  1611: getfield        eg/f0.l:I
        //  1614: iconst_3       
        //  1615: if_icmpne       1739
        //  1618: aload_0        
        //  1619: getfield        com/google/android/play/core/assetpacks/g.d:Lig/k0;
        //  1622: invokeinterface ig/k0.zza:()Ljava/lang/Object;
        //  1627: checkcast       Lcom/google/android/play/core/assetpacks/b;
        //  1630: astore          7
        //  1632: aload_1        
        //  1633: getfield        eg/s0.b:Ljava/lang/String;
        //  1636: astore          8
        //  1638: aload_1        
        //  1639: getfield        eg/f0.k:J
        //  1642: lstore          5
        //  1644: aload_0        
        //  1645: getfield        com/google/android/play/core/assetpacks/g.e:Leg/k0;
        //  1648: astore_3       
        //  1649: aload_3        
        //  1650: monitorenter   
        //  1651: aload_1        
        //  1652: getfield        eg/f0.i:I
        //  1655: i2d            
        //  1656: dconst_1       
        //  1657: dadd           
        //  1658: aload_1        
        //  1659: getfield        eg/f0.j:I
        //  1662: i2d            
        //  1663: ddiv           
        //  1664: dstore          17
        //  1666: aload_3        
        //  1667: getfield        eg/k0.a:Ljava/util/HashMap;
        //  1670: aload           8
        //  1672: dload           17
        //  1674: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1677: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1680: pop            
        //  1681: aload_3        
        //  1682: monitorexit    
        //  1683: aload           8
        //  1685: iconst_3       
        //  1686: iconst_0       
        //  1687: lload           5
        //  1689: lload           5
        //  1691: dload           17
        //  1693: iconst_1       
        //  1694: aload_1        
        //  1695: getfield        eg/f0.f:Ljava/lang/String;
        //  1698: aload_0        
        //  1699: getfield        com/google/android/play/core/assetpacks/g.f:Leg/e1;
        //  1702: aload_1        
        //  1703: getfield        eg/s0.b:Ljava/lang/String;
        //  1706: invokevirtual   eg/e1.a:(Ljava/lang/String;)Ljava/lang/String;
        //  1709: invokestatic    com/google/android/play/core/assetpacks/AssetPackState.h:(Ljava/lang/String;IIJJDILjava/lang/String;Ljava/lang/String;)Leg/x;
        //  1712: astore_1       
        //  1713: aload           7
        //  1715: getfield        com/google/android/play/core/assetpacks/b.o:Landroid/os/Handler;
        //  1718: new             Leg/r;
        //  1721: dup            
        //  1722: iconst_0       
        //  1723: aload           7
        //  1725: aload_1        
        //  1726: invokespecial   eg/r.<init>:(ILjava/lang/Object;Ljava/lang/Object;)V
        //  1729: invokevirtual   android/os/Handler.post:(Ljava/lang/Runnable;)Z
        //  1732: pop            
        //  1733: return         
        //  1734: astore_1       
        //  1735: aload_3        
        //  1736: monitorexit    
        //  1737: aload_1        
        //  1738: athrow         
        //  1739: return         
        //  1740: astore          7
        //  1742: aload_3        
        //  1743: invokevirtual   java/io/InputStream.close:()V
        //  1746: aload           7
        //  1748: athrow         
        //  1749: astore_3       
        //  1750: getstatic       com/google/android/play/core/assetpacks/g.g:Ldg/k;
        //  1753: ldc_w           "IOException during extraction %s."
        //  1756: iconst_1       
        //  1757: anewarray       Ljava/lang/Object;
        //  1760: dup            
        //  1761: iconst_0       
        //  1762: aload_3        
        //  1763: invokevirtual   java/lang/Throwable.getMessage:()Ljava/lang/String;
        //  1766: aastore        
        //  1767: invokevirtual   dg/k.h:(Ljava/lang/String;[Ljava/lang/Object;)V
        //  1770: new             Lcom/google/android/play/core/assetpacks/zzck;
        //  1773: dup            
        //  1774: ldc_w           "Error extracting chunk %s of slice %s of pack %s of session %s."
        //  1777: iconst_4       
        //  1778: anewarray       Ljava/lang/Object;
        //  1781: dup            
        //  1782: iconst_0       
        //  1783: aload_1        
        //  1784: getfield        eg/f0.i:I
        //  1787: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1790: aastore        
        //  1791: dup            
        //  1792: iconst_1       
        //  1793: aload_1        
        //  1794: getfield        eg/f0.g:Ljava/lang/String;
        //  1797: aastore        
        //  1798: dup            
        //  1799: iconst_2       
        //  1800: aload_1        
        //  1801: getfield        eg/s0.b:Ljava/lang/String;
        //  1804: aastore        
        //  1805: dup            
        //  1806: iconst_3       
        //  1807: aload_1        
        //  1808: getfield        eg/s0.c:I
        //  1811: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1814: aastore        
        //  1815: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1818: aload_3        
        //  1819: aload_1        
        //  1820: getfield        eg/s0.c:I
        //  1823: invokespecial   com/google/android/play/core/assetpacks/zzck.<init>:(Ljava/lang/String;Ljava/lang/Exception;I)V
        //  1826: athrow         
        //  1827: astore          7
        //  1829: goto            331
        //  1832: astore_3       
        //  1833: goto            1746
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  99     112    1749   1827   Ljava/io/IOException;
        //  115    127    1749   1827   Ljava/io/IOException;
        //  127    154    1740   1742   Any
        //  163    170    1740   1742   Any
        //  188    226    1740   1742   Any
        //  226    233    324    334    Any
        //  233    244    324    334    Any
        //  249    262    324    334    Any
        //  270    288    1740   1742   Any
        //  305    324    1740   1742   Any
        //  326    331    1827   1832   Any
        //  331    334    1740   1742   Any
        //  334    371    1740   1742   Any
        //  371    511    1740   1742   Any
        //  514    533    1740   1742   Any
        //  533    604    1740   1742   Any
        //  604    632    1740   1742   Any
        //  637    648    1740   1742   Any
        //  674    684    1740   1742   Any
        //  691    716    1740   1742   Any
        //  716    729    875    880    Any
        //  735    754    875    880    Any
        //  754    799    875    880    Any
        //  807    872    875    880    Any
        //  880    909    875    880    Any
        //  923    993    875    880    Any
        //  998    1024   875    880    Any
        //  1027   1032   875    880    Any
        //  1035   1046   875    880    Any
        //  1049   1063   875    880    Any
        //  1063   1095   875    880    Any
        //  1095   1108   875    880    Any
        //  1122   1161   875    880    Any
        //  1164   1193   875    880    Any
        //  1196   1277   875    880    Any
        //  1277   1312   875    880    Any
        //  1315   1331   875    880    Any
        //  1331   1358   875    880    Any
        //  1358   1386   875    880    Any
        //  1386   1390   1749   1827   Ljava/io/IOException;
        //  1421   1428   1431   1468   Ljava/io/IOException;
        //  1562   1569   1572   1610   Ljava/io/IOException;
        //  1651   1681   1734   1739   Any
        //  1742   1746   1832   1836   Any
        //  1746   1749   1749   1827   Ljava/io/IOException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 880, Size: 880
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
}
