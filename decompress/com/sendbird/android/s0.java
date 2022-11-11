// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import fc2.g;
import fc2.i;

public final class s0
{
    public float a;
    public float b;
    public int c;
    public int d;
    public int e;
    public int f;
    public long g;
    public long h;
    public int i;
    public i j;
    
    public s0() {
        this.a = 3.0f;
        this.b = 24.0f;
        this.c = 2;
        this.d = 5;
        this.e = 15000;
        this.f = 5000;
        this.h = 500L;
        this.i = 1;
    }
    
    public final void a(final g p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   fc2/g.p:()Lfc2/i;
        //     4: astore_2       
        //     5: aload_2        
        //     6: ldc             "ping_interval"
        //     8: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //    11: ifne            17
        //    14: goto            559
        //    17: aload_2        
        //    18: ldc             "ping_interval"
        //    20: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //    23: astore_1       
        //    24: aload_1        
        //    25: instanceof      Lfc2/k;
        //    28: ifeq            478
        //    31: aload_2        
        //    32: ldc             "ping_interval"
        //    34: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //    37: astore_3       
        //    38: aload_3        
        //    39: ldc             "this[key]"
        //    41: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //    44: ldc             Ljava/lang/Integer;.class
        //    46: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //    49: astore_1       
        //    50: aload_1        
        //    51: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //    54: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //    57: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    60: ifeq            77
        //    63: aload_3        
        //    64: invokevirtual   fc2/g.e:()B
        //    67: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //    70: checkcast       Ljava/lang/Integer;
        //    73: astore_1       
        //    74: goto            561
        //    77: aload_1        
        //    78: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //    81: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //    84: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    87: ifeq            104
        //    90: aload_3        
        //    91: invokevirtual   fc2/g.z:()S
        //    94: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //    97: checkcast       Ljava/lang/Integer;
        //   100: astore_1       
        //   101: goto            561
        //   104: aload_1        
        //   105: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   108: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   111: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   114: ifeq            128
        //   117: aload_3        
        //   118: invokevirtual   fc2/g.m:()I
        //   121: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   124: astore_1       
        //   125: goto            561
        //   128: aload_1        
        //   129: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   132: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   135: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   138: ifeq            155
        //   141: aload_3        
        //   142: invokevirtual   fc2/g.x:()J
        //   145: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   148: checkcast       Ljava/lang/Integer;
        //   151: astore_1       
        //   152: goto            561
        //   155: aload_1        
        //   156: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   159: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   162: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   165: ifeq            182
        //   168: aload_3        
        //   169: invokevirtual   fc2/g.l:()F
        //   172: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   175: checkcast       Ljava/lang/Integer;
        //   178: astore_1       
        //   179: goto            561
        //   182: aload_1        
        //   183: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   186: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   189: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   192: ifeq            209
        //   195: aload_3        
        //   196: invokevirtual   fc2/g.k:()D
        //   199: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   202: checkcast       Ljava/lang/Integer;
        //   205: astore_1       
        //   206: goto            561
        //   209: aload_1        
        //   210: ldc             Ljava/math/BigDecimal;.class
        //   212: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   215: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   218: ifeq            250
        //   221: aload_3        
        //   222: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //   225: astore_1       
        //   226: aload_1        
        //   227: ifnull          238
        //   230: aload_1        
        //   231: checkcast       Ljava/lang/Integer;
        //   234: astore_1       
        //   235: goto            561
        //   238: new             Ljava/lang/NullPointerException;
        //   241: astore_1       
        //   242: aload_1        
        //   243: ldc             "null cannot be cast to non-null type kotlin.Int"
        //   245: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   248: aload_1        
        //   249: athrow         
        //   250: aload_1        
        //   251: ldc             Ljava/math/BigInteger;.class
        //   253: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   256: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   259: ifeq            291
        //   262: aload_3        
        //   263: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //   266: astore_1       
        //   267: aload_1        
        //   268: ifnull          279
        //   271: aload_1        
        //   272: checkcast       Ljava/lang/Integer;
        //   275: astore_1       
        //   276: goto            561
        //   279: new             Ljava/lang/NullPointerException;
        //   282: astore_1       
        //   283: aload_1        
        //   284: ldc             "null cannot be cast to non-null type kotlin.Int"
        //   286: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   289: aload_1        
        //   290: athrow         
        //   291: aload_1        
        //   292: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //   295: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   298: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   301: ifeq            318
        //   304: aload_3        
        //   305: invokevirtual   fc2/g.i:()C
        //   308: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   311: checkcast       Ljava/lang/Integer;
        //   314: astore_1       
        //   315: goto            561
        //   318: aload_1        
        //   319: ldc             Ljava/lang/String;.class
        //   321: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   324: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   327: ifeq            359
        //   330: aload_3        
        //   331: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //   334: astore_1       
        //   335: aload_1        
        //   336: ifnull          347
        //   339: aload_1        
        //   340: checkcast       Ljava/lang/Integer;
        //   343: astore_1       
        //   344: goto            561
        //   347: new             Ljava/lang/NullPointerException;
        //   350: astore_1       
        //   351: aload_1        
        //   352: ldc             "null cannot be cast to non-null type kotlin.Int"
        //   354: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   357: aload_1        
        //   358: athrow         
        //   359: aload_1        
        //   360: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   363: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   366: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   369: ifeq            386
        //   372: aload_3        
        //   373: invokevirtual   fc2/g.d:()Z
        //   376: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   379: checkcast       Ljava/lang/Integer;
        //   382: astore_1       
        //   383: goto            561
        //   386: aload_1        
        //   387: ldc             Lfc2/i;.class
        //   389: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   392: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   395: ifeq            409
        //   398: aload_3        
        //   399: invokevirtual   fc2/g.p:()Lfc2/i;
        //   402: checkcast       Ljava/lang/Integer;
        //   405: astore_1       
        //   406: goto            561
        //   409: aload_1        
        //   410: ldc             Lfc2/k;.class
        //   412: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   415: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   418: ifeq            432
        //   421: aload_3        
        //   422: invokevirtual   fc2/g.q:()Lfc2/k;
        //   425: checkcast       Ljava/lang/Integer;
        //   428: astore_1       
        //   429: goto            561
        //   432: aload_1        
        //   433: ldc             Lfc2/f;.class
        //   435: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   438: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   441: ifeq            455
        //   444: aload_3        
        //   445: invokevirtual   fc2/g.n:()Lfc2/f;
        //   448: checkcast       Ljava/lang/Integer;
        //   451: astore_1       
        //   452: goto            561
        //   455: aload_1        
        //   456: ldc             Lfc2/h;.class
        //   458: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   461: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   464: ifeq            559
        //   467: aload_3        
        //   468: invokevirtual   fc2/g.o:()Lfc2/h;
        //   471: checkcast       Ljava/lang/Integer;
        //   474: astore_1       
        //   475: goto            561
        //   478: aload_1        
        //   479: instanceof      Lfc2/i;
        //   482: ifeq            516
        //   485: aload_2        
        //   486: ldc             "ping_interval"
        //   488: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   491: astore_1       
        //   492: aload_1        
        //   493: ifnull          504
        //   496: aload_1        
        //   497: checkcast       Ljava/lang/Integer;
        //   500: astore_1       
        //   501: goto            561
        //   504: new             Ljava/lang/NullPointerException;
        //   507: astore_1       
        //   508: aload_1        
        //   509: ldc             "null cannot be cast to non-null type kotlin.Int"
        //   511: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   514: aload_1        
        //   515: athrow         
        //   516: aload_1        
        //   517: instanceof      Lfc2/f;
        //   520: ifeq            559
        //   523: aload_2        
        //   524: ldc             "ping_interval"
        //   526: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   529: astore_1       
        //   530: aload_1        
        //   531: ifnull          542
        //   534: aload_1        
        //   535: checkcast       Ljava/lang/Integer;
        //   538: astore_1       
        //   539: goto            561
        //   542: new             Ljava/lang/NullPointerException;
        //   545: astore_1       
        //   546: aload_1        
        //   547: ldc             "null cannot be cast to non-null type kotlin.Int"
        //   549: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   552: aload_1        
        //   553: athrow         
        //   554: astore_1       
        //   555: aload_1        
        //   556: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //   559: aconst_null    
        //   560: astore_1       
        //   561: aload_1        
        //   562: ifnull          581
        //   565: aload_0        
        //   566: aload_1        
        //   567: invokevirtual   java/lang/Number.intValue:()I
        //   570: sipush          1000
        //   573: imul           
        //   574: putfield        com/sendbird/android/s0.e:I
        //   577: getstatic       hg2/j.a:Lhg2/j;
        //   580: astore_1       
        //   581: aload_2        
        //   582: ldc             "pong_timeout"
        //   584: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //   587: ifne            593
        //   590: goto            1135
        //   593: aload_2        
        //   594: ldc             "pong_timeout"
        //   596: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   599: astore_1       
        //   600: aload_1        
        //   601: instanceof      Lfc2/k;
        //   604: ifeq            1054
        //   607: aload_2        
        //   608: ldc             "pong_timeout"
        //   610: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   613: astore_1       
        //   614: aload_1        
        //   615: ldc             "this[key]"
        //   617: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   620: ldc             Ljava/lang/Integer;.class
        //   622: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   625: astore_3       
        //   626: aload_3        
        //   627: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //   630: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   633: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   636: ifeq            653
        //   639: aload_1        
        //   640: invokevirtual   fc2/g.e:()B
        //   643: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //   646: checkcast       Ljava/lang/Integer;
        //   649: astore_1       
        //   650: goto            1137
        //   653: aload_3        
        //   654: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //   657: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   660: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   663: ifeq            680
        //   666: aload_1        
        //   667: invokevirtual   fc2/g.z:()S
        //   670: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //   673: checkcast       Ljava/lang/Integer;
        //   676: astore_1       
        //   677: goto            1137
        //   680: aload_3        
        //   681: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   684: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   687: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   690: ifeq            704
        //   693: aload_1        
        //   694: invokevirtual   fc2/g.m:()I
        //   697: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   700: astore_1       
        //   701: goto            1137
        //   704: aload_3        
        //   705: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   708: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   711: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   714: ifeq            731
        //   717: aload_1        
        //   718: invokevirtual   fc2/g.x:()J
        //   721: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   724: checkcast       Ljava/lang/Integer;
        //   727: astore_1       
        //   728: goto            1137
        //   731: aload_3        
        //   732: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   735: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   738: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   741: ifeq            758
        //   744: aload_1        
        //   745: invokevirtual   fc2/g.l:()F
        //   748: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   751: checkcast       Ljava/lang/Integer;
        //   754: astore_1       
        //   755: goto            1137
        //   758: aload_3        
        //   759: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   762: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   765: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   768: ifeq            785
        //   771: aload_1        
        //   772: invokevirtual   fc2/g.k:()D
        //   775: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   778: checkcast       Ljava/lang/Integer;
        //   781: astore_1       
        //   782: goto            1137
        //   785: aload_3        
        //   786: ldc             Ljava/math/BigDecimal;.class
        //   788: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   791: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   794: ifeq            826
        //   797: aload_1        
        //   798: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //   801: astore_1       
        //   802: aload_1        
        //   803: ifnull          814
        //   806: aload_1        
        //   807: checkcast       Ljava/lang/Integer;
        //   810: astore_1       
        //   811: goto            1137
        //   814: new             Ljava/lang/NullPointerException;
        //   817: astore_1       
        //   818: aload_1        
        //   819: ldc             "null cannot be cast to non-null type kotlin.Int"
        //   821: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   824: aload_1        
        //   825: athrow         
        //   826: aload_3        
        //   827: ldc             Ljava/math/BigInteger;.class
        //   829: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   832: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   835: ifeq            867
        //   838: aload_1        
        //   839: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //   842: astore_1       
        //   843: aload_1        
        //   844: ifnull          855
        //   847: aload_1        
        //   848: checkcast       Ljava/lang/Integer;
        //   851: astore_1       
        //   852: goto            1137
        //   855: new             Ljava/lang/NullPointerException;
        //   858: astore_1       
        //   859: aload_1        
        //   860: ldc             "null cannot be cast to non-null type kotlin.Int"
        //   862: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   865: aload_1        
        //   866: athrow         
        //   867: aload_3        
        //   868: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //   871: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   874: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   877: ifeq            894
        //   880: aload_1        
        //   881: invokevirtual   fc2/g.i:()C
        //   884: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   887: checkcast       Ljava/lang/Integer;
        //   890: astore_1       
        //   891: goto            1137
        //   894: aload_3        
        //   895: ldc             Ljava/lang/String;.class
        //   897: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   900: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   903: ifeq            935
        //   906: aload_1        
        //   907: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //   910: astore_1       
        //   911: aload_1        
        //   912: ifnull          923
        //   915: aload_1        
        //   916: checkcast       Ljava/lang/Integer;
        //   919: astore_1       
        //   920: goto            1137
        //   923: new             Ljava/lang/NullPointerException;
        //   926: astore_1       
        //   927: aload_1        
        //   928: ldc             "null cannot be cast to non-null type kotlin.Int"
        //   930: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   933: aload_1        
        //   934: athrow         
        //   935: aload_3        
        //   936: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   939: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   942: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   945: ifeq            962
        //   948: aload_1        
        //   949: invokevirtual   fc2/g.d:()Z
        //   952: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   955: checkcast       Ljava/lang/Integer;
        //   958: astore_1       
        //   959: goto            1137
        //   962: aload_3        
        //   963: ldc             Lfc2/i;.class
        //   965: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   968: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   971: ifeq            985
        //   974: aload_1        
        //   975: invokevirtual   fc2/g.p:()Lfc2/i;
        //   978: checkcast       Ljava/lang/Integer;
        //   981: astore_1       
        //   982: goto            1137
        //   985: aload_3        
        //   986: ldc             Lfc2/k;.class
        //   988: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   991: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   994: ifeq            1008
        //   997: aload_1        
        //   998: invokevirtual   fc2/g.q:()Lfc2/k;
        //  1001: checkcast       Ljava/lang/Integer;
        //  1004: astore_1       
        //  1005: goto            1137
        //  1008: aload_3        
        //  1009: ldc             Lfc2/f;.class
        //  1011: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1014: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1017: ifeq            1031
        //  1020: aload_1        
        //  1021: invokevirtual   fc2/g.n:()Lfc2/f;
        //  1024: checkcast       Ljava/lang/Integer;
        //  1027: astore_1       
        //  1028: goto            1137
        //  1031: aload_3        
        //  1032: ldc             Lfc2/h;.class
        //  1034: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1037: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1040: ifeq            1135
        //  1043: aload_1        
        //  1044: invokevirtual   fc2/g.o:()Lfc2/h;
        //  1047: checkcast       Ljava/lang/Integer;
        //  1050: astore_1       
        //  1051: goto            1137
        //  1054: aload_1        
        //  1055: instanceof      Lfc2/i;
        //  1058: ifeq            1092
        //  1061: aload_2        
        //  1062: ldc             "pong_timeout"
        //  1064: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  1067: astore_1       
        //  1068: aload_1        
        //  1069: ifnull          1080
        //  1072: aload_1        
        //  1073: checkcast       Ljava/lang/Integer;
        //  1076: astore_1       
        //  1077: goto            1137
        //  1080: new             Ljava/lang/NullPointerException;
        //  1083: astore_1       
        //  1084: aload_1        
        //  1085: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  1087: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1090: aload_1        
        //  1091: athrow         
        //  1092: aload_1        
        //  1093: instanceof      Lfc2/f;
        //  1096: ifeq            1135
        //  1099: aload_2        
        //  1100: ldc             "pong_timeout"
        //  1102: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  1105: astore_1       
        //  1106: aload_1        
        //  1107: ifnull          1118
        //  1110: aload_1        
        //  1111: checkcast       Ljava/lang/Integer;
        //  1114: astore_1       
        //  1115: goto            1137
        //  1118: new             Ljava/lang/NullPointerException;
        //  1121: astore_1       
        //  1122: aload_1        
        //  1123: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  1125: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1128: aload_1        
        //  1129: athrow         
        //  1130: astore_1       
        //  1131: aload_1        
        //  1132: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //  1135: aconst_null    
        //  1136: astore_1       
        //  1137: aload_1        
        //  1138: ifnull          1157
        //  1141: aload_0        
        //  1142: aload_1        
        //  1143: invokevirtual   java/lang/Number.intValue:()I
        //  1146: sipush          1000
        //  1149: imul           
        //  1150: putfield        com/sendbird/android/s0.f:I
        //  1153: getstatic       hg2/j.a:Lhg2/j;
        //  1156: astore_1       
        //  1157: aload_2        
        //  1158: ldc             "login_ts"
        //  1160: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //  1163: ifne            1169
        //  1166: goto            1711
        //  1169: aload_2        
        //  1170: ldc             "login_ts"
        //  1172: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  1175: astore_1       
        //  1176: aload_1        
        //  1177: instanceof      Lfc2/k;
        //  1180: ifeq            1630
        //  1183: aload_2        
        //  1184: ldc             "login_ts"
        //  1186: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  1189: astore_1       
        //  1190: aload_1        
        //  1191: ldc             "this[key]"
        //  1193: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1196: ldc             Ljava/lang/Long;.class
        //  1198: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1201: astore_3       
        //  1202: aload_3        
        //  1203: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //  1206: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1209: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1212: ifeq            1229
        //  1215: aload_1        
        //  1216: invokevirtual   fc2/g.e:()B
        //  1219: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //  1222: checkcast       Ljava/lang/Long;
        //  1225: astore_1       
        //  1226: goto            1713
        //  1229: aload_3        
        //  1230: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //  1233: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1236: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1239: ifeq            1256
        //  1242: aload_1        
        //  1243: invokevirtual   fc2/g.z:()S
        //  1246: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //  1249: checkcast       Ljava/lang/Long;
        //  1252: astore_1       
        //  1253: goto            1713
        //  1256: aload_3        
        //  1257: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //  1260: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1263: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1266: ifeq            1283
        //  1269: aload_1        
        //  1270: invokevirtual   fc2/g.m:()I
        //  1273: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1276: checkcast       Ljava/lang/Long;
        //  1279: astore_1       
        //  1280: goto            1713
        //  1283: aload_3        
        //  1284: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //  1287: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1290: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1293: ifeq            1307
        //  1296: aload_1        
        //  1297: invokevirtual   fc2/g.x:()J
        //  1300: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1303: astore_1       
        //  1304: goto            1713
        //  1307: aload_3        
        //  1308: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //  1311: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1314: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1317: ifeq            1334
        //  1320: aload_1        
        //  1321: invokevirtual   fc2/g.l:()F
        //  1324: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1327: checkcast       Ljava/lang/Long;
        //  1330: astore_1       
        //  1331: goto            1713
        //  1334: aload_3        
        //  1335: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //  1338: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1341: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1344: ifeq            1361
        //  1347: aload_1        
        //  1348: invokevirtual   fc2/g.k:()D
        //  1351: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1354: checkcast       Ljava/lang/Long;
        //  1357: astore_1       
        //  1358: goto            1713
        //  1361: aload_3        
        //  1362: ldc             Ljava/math/BigDecimal;.class
        //  1364: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1367: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1370: ifeq            1402
        //  1373: aload_1        
        //  1374: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //  1377: astore_1       
        //  1378: aload_1        
        //  1379: ifnull          1390
        //  1382: aload_1        
        //  1383: checkcast       Ljava/lang/Long;
        //  1386: astore_1       
        //  1387: goto            1713
        //  1390: new             Ljava/lang/NullPointerException;
        //  1393: astore_1       
        //  1394: aload_1        
        //  1395: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  1397: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1400: aload_1        
        //  1401: athrow         
        //  1402: aload_3        
        //  1403: ldc             Ljava/math/BigInteger;.class
        //  1405: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1408: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1411: ifeq            1443
        //  1414: aload_1        
        //  1415: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //  1418: astore_1       
        //  1419: aload_1        
        //  1420: ifnull          1431
        //  1423: aload_1        
        //  1424: checkcast       Ljava/lang/Long;
        //  1427: astore_1       
        //  1428: goto            1713
        //  1431: new             Ljava/lang/NullPointerException;
        //  1434: astore_1       
        //  1435: aload_1        
        //  1436: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  1438: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1441: aload_1        
        //  1442: athrow         
        //  1443: aload_3        
        //  1444: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //  1447: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1450: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1453: ifeq            1470
        //  1456: aload_1        
        //  1457: invokevirtual   fc2/g.i:()C
        //  1460: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //  1463: checkcast       Ljava/lang/Long;
        //  1466: astore_1       
        //  1467: goto            1713
        //  1470: aload_3        
        //  1471: ldc             Ljava/lang/String;.class
        //  1473: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1476: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1479: ifeq            1511
        //  1482: aload_1        
        //  1483: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //  1486: astore_1       
        //  1487: aload_1        
        //  1488: ifnull          1499
        //  1491: aload_1        
        //  1492: checkcast       Ljava/lang/Long;
        //  1495: astore_1       
        //  1496: goto            1713
        //  1499: new             Ljava/lang/NullPointerException;
        //  1502: astore_1       
        //  1503: aload_1        
        //  1504: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  1506: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1509: aload_1        
        //  1510: athrow         
        //  1511: aload_3        
        //  1512: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //  1515: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1518: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1521: ifeq            1538
        //  1524: aload_1        
        //  1525: invokevirtual   fc2/g.d:()Z
        //  1528: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  1531: checkcast       Ljava/lang/Long;
        //  1534: astore_1       
        //  1535: goto            1713
        //  1538: aload_3        
        //  1539: ldc             Lfc2/i;.class
        //  1541: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1544: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1547: ifeq            1561
        //  1550: aload_1        
        //  1551: invokevirtual   fc2/g.p:()Lfc2/i;
        //  1554: checkcast       Ljava/lang/Long;
        //  1557: astore_1       
        //  1558: goto            1713
        //  1561: aload_3        
        //  1562: ldc             Lfc2/k;.class
        //  1564: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1567: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1570: ifeq            1584
        //  1573: aload_1        
        //  1574: invokevirtual   fc2/g.q:()Lfc2/k;
        //  1577: checkcast       Ljava/lang/Long;
        //  1580: astore_1       
        //  1581: goto            1713
        //  1584: aload_3        
        //  1585: ldc             Lfc2/f;.class
        //  1587: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1590: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1593: ifeq            1607
        //  1596: aload_1        
        //  1597: invokevirtual   fc2/g.n:()Lfc2/f;
        //  1600: checkcast       Ljava/lang/Long;
        //  1603: astore_1       
        //  1604: goto            1713
        //  1607: aload_3        
        //  1608: ldc             Lfc2/h;.class
        //  1610: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1613: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1616: ifeq            1711
        //  1619: aload_1        
        //  1620: invokevirtual   fc2/g.o:()Lfc2/h;
        //  1623: checkcast       Ljava/lang/Long;
        //  1626: astore_1       
        //  1627: goto            1713
        //  1630: aload_1        
        //  1631: instanceof      Lfc2/i;
        //  1634: ifeq            1668
        //  1637: aload_2        
        //  1638: ldc             "login_ts"
        //  1640: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  1643: astore_1       
        //  1644: aload_1        
        //  1645: ifnull          1656
        //  1648: aload_1        
        //  1649: checkcast       Ljava/lang/Long;
        //  1652: astore_1       
        //  1653: goto            1713
        //  1656: new             Ljava/lang/NullPointerException;
        //  1659: astore_1       
        //  1660: aload_1        
        //  1661: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  1663: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1666: aload_1        
        //  1667: athrow         
        //  1668: aload_1        
        //  1669: instanceof      Lfc2/f;
        //  1672: ifeq            1711
        //  1675: aload_2        
        //  1676: ldc             "login_ts"
        //  1678: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  1681: astore_1       
        //  1682: aload_1        
        //  1683: ifnull          1694
        //  1686: aload_1        
        //  1687: checkcast       Ljava/lang/Long;
        //  1690: astore_1       
        //  1691: goto            1713
        //  1694: new             Ljava/lang/NullPointerException;
        //  1697: astore_1       
        //  1698: aload_1        
        //  1699: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  1701: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1704: aload_1        
        //  1705: athrow         
        //  1706: astore_1       
        //  1707: aload_1        
        //  1708: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //  1711: aconst_null    
        //  1712: astore_1       
        //  1713: aload_1        
        //  1714: ifnull          1729
        //  1717: aload_0        
        //  1718: aload_1        
        //  1719: invokevirtual   java/lang/Number.longValue:()J
        //  1722: putfield        com/sendbird/android/s0.g:J
        //  1725: getstatic       hg2/j.a:Lhg2/j;
        //  1728: astore_1       
        //  1729: aload_2        
        //  1730: ldc             "max_unread_cnt_on_super_group"
        //  1732: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //  1735: ifne            1741
        //  1738: goto            2283
        //  1741: aload_2        
        //  1742: ldc             "max_unread_cnt_on_super_group"
        //  1744: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  1747: astore_1       
        //  1748: aload_1        
        //  1749: instanceof      Lfc2/k;
        //  1752: ifeq            2202
        //  1755: aload_2        
        //  1756: ldc             "max_unread_cnt_on_super_group"
        //  1758: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  1761: astore_3       
        //  1762: aload_3        
        //  1763: ldc             "this[key]"
        //  1765: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1768: ldc             Ljava/lang/Integer;.class
        //  1770: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1773: astore_1       
        //  1774: aload_1        
        //  1775: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //  1778: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1781: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1784: ifeq            1801
        //  1787: aload_3        
        //  1788: invokevirtual   fc2/g.e:()B
        //  1791: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //  1794: checkcast       Ljava/lang/Integer;
        //  1797: astore_1       
        //  1798: goto            2285
        //  1801: aload_1        
        //  1802: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //  1805: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1808: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1811: ifeq            1828
        //  1814: aload_3        
        //  1815: invokevirtual   fc2/g.z:()S
        //  1818: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //  1821: checkcast       Ljava/lang/Integer;
        //  1824: astore_1       
        //  1825: goto            2285
        //  1828: aload_1        
        //  1829: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //  1832: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1835: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1838: ifeq            1852
        //  1841: aload_3        
        //  1842: invokevirtual   fc2/g.m:()I
        //  1845: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1848: astore_1       
        //  1849: goto            2285
        //  1852: aload_1        
        //  1853: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //  1856: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1859: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1862: ifeq            1879
        //  1865: aload_3        
        //  1866: invokevirtual   fc2/g.x:()J
        //  1869: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  1872: checkcast       Ljava/lang/Integer;
        //  1875: astore_1       
        //  1876: goto            2285
        //  1879: aload_1        
        //  1880: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //  1883: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1886: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1889: ifeq            1906
        //  1892: aload_3        
        //  1893: invokevirtual   fc2/g.l:()F
        //  1896: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1899: checkcast       Ljava/lang/Integer;
        //  1902: astore_1       
        //  1903: goto            2285
        //  1906: aload_1        
        //  1907: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //  1910: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1913: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1916: ifeq            1933
        //  1919: aload_3        
        //  1920: invokevirtual   fc2/g.k:()D
        //  1923: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1926: checkcast       Ljava/lang/Integer;
        //  1929: astore_1       
        //  1930: goto            2285
        //  1933: aload_1        
        //  1934: ldc             Ljava/math/BigDecimal;.class
        //  1936: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1939: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1942: ifeq            1974
        //  1945: aload_3        
        //  1946: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //  1949: astore_1       
        //  1950: aload_1        
        //  1951: ifnull          1962
        //  1954: aload_1        
        //  1955: checkcast       Ljava/lang/Integer;
        //  1958: astore_1       
        //  1959: goto            2285
        //  1962: new             Ljava/lang/NullPointerException;
        //  1965: astore_1       
        //  1966: aload_1        
        //  1967: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  1969: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  1972: aload_1        
        //  1973: athrow         
        //  1974: aload_1        
        //  1975: ldc             Ljava/math/BigInteger;.class
        //  1977: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  1980: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1983: ifeq            2015
        //  1986: aload_3        
        //  1987: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //  1990: astore_1       
        //  1991: aload_1        
        //  1992: ifnull          2003
        //  1995: aload_1        
        //  1996: checkcast       Ljava/lang/Integer;
        //  1999: astore_1       
        //  2000: goto            2285
        //  2003: new             Ljava/lang/NullPointerException;
        //  2006: astore_1       
        //  2007: aload_1        
        //  2008: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  2010: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2013: aload_1        
        //  2014: athrow         
        //  2015: aload_1        
        //  2016: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //  2019: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2022: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2025: ifeq            2042
        //  2028: aload_3        
        //  2029: invokevirtual   fc2/g.i:()C
        //  2032: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //  2035: checkcast       Ljava/lang/Integer;
        //  2038: astore_1       
        //  2039: goto            2285
        //  2042: aload_1        
        //  2043: ldc             Ljava/lang/String;.class
        //  2045: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2048: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2051: ifeq            2083
        //  2054: aload_3        
        //  2055: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //  2058: astore_1       
        //  2059: aload_1        
        //  2060: ifnull          2071
        //  2063: aload_1        
        //  2064: checkcast       Ljava/lang/Integer;
        //  2067: astore_1       
        //  2068: goto            2285
        //  2071: new             Ljava/lang/NullPointerException;
        //  2074: astore_1       
        //  2075: aload_1        
        //  2076: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  2078: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2081: aload_1        
        //  2082: athrow         
        //  2083: aload_1        
        //  2084: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //  2087: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2090: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2093: ifeq            2110
        //  2096: aload_3        
        //  2097: invokevirtual   fc2/g.d:()Z
        //  2100: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2103: checkcast       Ljava/lang/Integer;
        //  2106: astore_1       
        //  2107: goto            2285
        //  2110: aload_1        
        //  2111: ldc             Lfc2/i;.class
        //  2113: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2116: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2119: ifeq            2133
        //  2122: aload_3        
        //  2123: invokevirtual   fc2/g.p:()Lfc2/i;
        //  2126: checkcast       Ljava/lang/Integer;
        //  2129: astore_1       
        //  2130: goto            2285
        //  2133: aload_1        
        //  2134: ldc             Lfc2/k;.class
        //  2136: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2139: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2142: ifeq            2156
        //  2145: aload_3        
        //  2146: invokevirtual   fc2/g.q:()Lfc2/k;
        //  2149: checkcast       Ljava/lang/Integer;
        //  2152: astore_1       
        //  2153: goto            2285
        //  2156: aload_1        
        //  2157: ldc             Lfc2/f;.class
        //  2159: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2162: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2165: ifeq            2179
        //  2168: aload_3        
        //  2169: invokevirtual   fc2/g.n:()Lfc2/f;
        //  2172: checkcast       Ljava/lang/Integer;
        //  2175: astore_1       
        //  2176: goto            2285
        //  2179: aload_1        
        //  2180: ldc             Lfc2/h;.class
        //  2182: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2185: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2188: ifeq            2283
        //  2191: aload_3        
        //  2192: invokevirtual   fc2/g.o:()Lfc2/h;
        //  2195: checkcast       Ljava/lang/Integer;
        //  2198: astore_1       
        //  2199: goto            2285
        //  2202: aload_1        
        //  2203: instanceof      Lfc2/i;
        //  2206: ifeq            2240
        //  2209: aload_2        
        //  2210: ldc             "max_unread_cnt_on_super_group"
        //  2212: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  2215: astore_1       
        //  2216: aload_1        
        //  2217: ifnull          2228
        //  2220: aload_1        
        //  2221: checkcast       Ljava/lang/Integer;
        //  2224: astore_1       
        //  2225: goto            2285
        //  2228: new             Ljava/lang/NullPointerException;
        //  2231: astore_1       
        //  2232: aload_1        
        //  2233: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  2235: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2238: aload_1        
        //  2239: athrow         
        //  2240: aload_1        
        //  2241: instanceof      Lfc2/f;
        //  2244: ifeq            2283
        //  2247: aload_2        
        //  2248: ldc             "max_unread_cnt_on_super_group"
        //  2250: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  2253: astore_1       
        //  2254: aload_1        
        //  2255: ifnull          2266
        //  2258: aload_1        
        //  2259: checkcast       Ljava/lang/Integer;
        //  2262: astore_1       
        //  2263: goto            2285
        //  2266: new             Ljava/lang/NullPointerException;
        //  2269: astore_1       
        //  2270: aload_1        
        //  2271: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  2273: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2276: aload_1        
        //  2277: athrow         
        //  2278: astore_1       
        //  2279: aload_1        
        //  2280: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //  2283: aconst_null    
        //  2284: astore_1       
        //  2285: aload_1        
        //  2286: ifnull          2301
        //  2289: aload_0        
        //  2290: aload_1        
        //  2291: invokevirtual   java/lang/Number.intValue:()I
        //  2294: putfield        com/sendbird/android/s0.i:I
        //  2297: getstatic       hg2/j.a:Lhg2/j;
        //  2300: astore_1       
        //  2301: aload_2        
        //  2302: ldc             "bc_duration"
        //  2304: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //  2307: ifne            2313
        //  2310: goto            2855
        //  2313: aload_2        
        //  2314: ldc             "bc_duration"
        //  2316: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  2319: astore_1       
        //  2320: aload_1        
        //  2321: instanceof      Lfc2/k;
        //  2324: ifeq            2774
        //  2327: aload_2        
        //  2328: ldc             "bc_duration"
        //  2330: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  2333: astore_3       
        //  2334: aload_3        
        //  2335: ldc             "this[key]"
        //  2337: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //  2340: ldc             Ljava/lang/Long;.class
        //  2342: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2345: astore_1       
        //  2346: aload_1        
        //  2347: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //  2350: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2353: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2356: ifeq            2373
        //  2359: aload_3        
        //  2360: invokevirtual   fc2/g.e:()B
        //  2363: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //  2366: checkcast       Ljava/lang/Long;
        //  2369: astore_1       
        //  2370: goto            2857
        //  2373: aload_1        
        //  2374: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //  2377: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2380: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2383: ifeq            2400
        //  2386: aload_3        
        //  2387: invokevirtual   fc2/g.z:()S
        //  2390: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //  2393: checkcast       Ljava/lang/Long;
        //  2396: astore_1       
        //  2397: goto            2857
        //  2400: aload_1        
        //  2401: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //  2404: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2407: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2410: ifeq            2427
        //  2413: aload_3        
        //  2414: invokevirtual   fc2/g.m:()I
        //  2417: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  2420: checkcast       Ljava/lang/Long;
        //  2423: astore_1       
        //  2424: goto            2857
        //  2427: aload_1        
        //  2428: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //  2431: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2434: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2437: ifeq            2451
        //  2440: aload_3        
        //  2441: invokevirtual   fc2/g.x:()J
        //  2444: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  2447: astore_1       
        //  2448: goto            2857
        //  2451: aload_1        
        //  2452: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //  2455: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2458: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2461: ifeq            2478
        //  2464: aload_3        
        //  2465: invokevirtual   fc2/g.l:()F
        //  2468: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  2471: checkcast       Ljava/lang/Long;
        //  2474: astore_1       
        //  2475: goto            2857
        //  2478: aload_1        
        //  2479: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //  2482: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2485: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2488: ifeq            2505
        //  2491: aload_3        
        //  2492: invokevirtual   fc2/g.k:()D
        //  2495: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  2498: checkcast       Ljava/lang/Long;
        //  2501: astore_1       
        //  2502: goto            2857
        //  2505: aload_1        
        //  2506: ldc             Ljava/math/BigDecimal;.class
        //  2508: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2511: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2514: ifeq            2546
        //  2517: aload_3        
        //  2518: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //  2521: astore_1       
        //  2522: aload_1        
        //  2523: ifnull          2534
        //  2526: aload_1        
        //  2527: checkcast       Ljava/lang/Long;
        //  2530: astore_1       
        //  2531: goto            2857
        //  2534: new             Ljava/lang/NullPointerException;
        //  2537: astore_1       
        //  2538: aload_1        
        //  2539: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  2541: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2544: aload_1        
        //  2545: athrow         
        //  2546: aload_1        
        //  2547: ldc             Ljava/math/BigInteger;.class
        //  2549: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2552: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2555: ifeq            2587
        //  2558: aload_3        
        //  2559: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //  2562: astore_1       
        //  2563: aload_1        
        //  2564: ifnull          2575
        //  2567: aload_1        
        //  2568: checkcast       Ljava/lang/Long;
        //  2571: astore_1       
        //  2572: goto            2857
        //  2575: new             Ljava/lang/NullPointerException;
        //  2578: astore_1       
        //  2579: aload_1        
        //  2580: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  2582: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2585: aload_1        
        //  2586: athrow         
        //  2587: aload_1        
        //  2588: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //  2591: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2594: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2597: ifeq            2614
        //  2600: aload_3        
        //  2601: invokevirtual   fc2/g.i:()C
        //  2604: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //  2607: checkcast       Ljava/lang/Long;
        //  2610: astore_1       
        //  2611: goto            2857
        //  2614: aload_1        
        //  2615: ldc             Ljava/lang/String;.class
        //  2617: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2620: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2623: ifeq            2655
        //  2626: aload_3        
        //  2627: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //  2630: astore_1       
        //  2631: aload_1        
        //  2632: ifnull          2643
        //  2635: aload_1        
        //  2636: checkcast       Ljava/lang/Long;
        //  2639: astore_1       
        //  2640: goto            2857
        //  2643: new             Ljava/lang/NullPointerException;
        //  2646: astore_1       
        //  2647: aload_1        
        //  2648: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  2650: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2653: aload_1        
        //  2654: athrow         
        //  2655: aload_1        
        //  2656: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //  2659: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2662: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2665: ifeq            2682
        //  2668: aload_3        
        //  2669: invokevirtual   fc2/g.d:()Z
        //  2672: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  2675: checkcast       Ljava/lang/Long;
        //  2678: astore_1       
        //  2679: goto            2857
        //  2682: aload_1        
        //  2683: ldc             Lfc2/i;.class
        //  2685: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2688: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2691: ifeq            2705
        //  2694: aload_3        
        //  2695: invokevirtual   fc2/g.p:()Lfc2/i;
        //  2698: checkcast       Ljava/lang/Long;
        //  2701: astore_1       
        //  2702: goto            2857
        //  2705: aload_1        
        //  2706: ldc             Lfc2/k;.class
        //  2708: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2711: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2714: ifeq            2728
        //  2717: aload_3        
        //  2718: invokevirtual   fc2/g.q:()Lfc2/k;
        //  2721: checkcast       Ljava/lang/Long;
        //  2724: astore_1       
        //  2725: goto            2857
        //  2728: aload_1        
        //  2729: ldc             Lfc2/f;.class
        //  2731: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2734: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2737: ifeq            2751
        //  2740: aload_3        
        //  2741: invokevirtual   fc2/g.n:()Lfc2/f;
        //  2744: checkcast       Ljava/lang/Long;
        //  2747: astore_1       
        //  2748: goto            2857
        //  2751: aload_1        
        //  2752: ldc             Lfc2/h;.class
        //  2754: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2757: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2760: ifeq            2855
        //  2763: aload_3        
        //  2764: invokevirtual   fc2/g.o:()Lfc2/h;
        //  2767: checkcast       Ljava/lang/Long;
        //  2770: astore_1       
        //  2771: goto            2857
        //  2774: aload_1        
        //  2775: instanceof      Lfc2/i;
        //  2778: ifeq            2812
        //  2781: aload_2        
        //  2782: ldc             "bc_duration"
        //  2784: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  2787: astore_1       
        //  2788: aload_1        
        //  2789: ifnull          2800
        //  2792: aload_1        
        //  2793: checkcast       Ljava/lang/Long;
        //  2796: astore_1       
        //  2797: goto            2857
        //  2800: new             Ljava/lang/NullPointerException;
        //  2803: astore_1       
        //  2804: aload_1        
        //  2805: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  2807: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2810: aload_1        
        //  2811: athrow         
        //  2812: aload_1        
        //  2813: instanceof      Lfc2/f;
        //  2816: ifeq            2855
        //  2819: aload_2        
        //  2820: ldc             "bc_duration"
        //  2822: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  2825: astore_1       
        //  2826: aload_1        
        //  2827: ifnull          2838
        //  2830: aload_1        
        //  2831: checkcast       Ljava/lang/Long;
        //  2834: astore_1       
        //  2835: goto            2857
        //  2838: new             Ljava/lang/NullPointerException;
        //  2841: astore_1       
        //  2842: aload_1        
        //  2843: ldc             "null cannot be cast to non-null type kotlin.Long"
        //  2845: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  2848: aload_1        
        //  2849: athrow         
        //  2850: astore_1       
        //  2851: aload_1        
        //  2852: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //  2855: aconst_null    
        //  2856: astore_1       
        //  2857: aload_1        
        //  2858: ifnull          2911
        //  2861: aload_1        
        //  2862: invokevirtual   java/lang/Number.longValue:()J
        //  2865: lstore          4
        //  2867: lconst_0       
        //  2868: lload           4
        //  2870: lcmp           
        //  2871: ifne            2884
        //  2874: aload_0        
        //  2875: ldc2_w          500
        //  2878: putfield        com/sendbird/android/s0.h:J
        //  2881: goto            2904
        //  2884: aload_0        
        //  2885: getfield        com/sendbird/android/s0.h:J
        //  2888: lconst_0       
        //  2889: lcmp           
        //  2890: ifle            2904
        //  2893: aload_0        
        //  2894: lload           4
        //  2896: sipush          1000
        //  2899: i2l            
        //  2900: lmul           
        //  2901: putfield        com/sendbird/android/s0.h:J
        //  2904: getstatic       hg2/j.a:Lhg2/j;
        //  2907: astore_1       
        //  2908: goto            2911
        //  2911: aload_2        
        //  2912: ldc             "reconnect"
        //  2914: invokevirtual   fc2/i.N:(Ljava/lang/String;)Lfc2/i;
        //  2917: astore_2       
        //  2918: aload_2        
        //  2919: ifnull          5236
        //  2922: aload_2        
        //  2923: ldc             "interval"
        //  2925: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //  2928: ifne            2934
        //  2931: goto            3476
        //  2934: aload_2        
        //  2935: ldc             "interval"
        //  2937: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  2940: astore_1       
        //  2941: aload_1        
        //  2942: instanceof      Lfc2/k;
        //  2945: ifeq            3395
        //  2948: aload_2        
        //  2949: ldc             "interval"
        //  2951: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  2954: astore_1       
        //  2955: aload_1        
        //  2956: ldc             "this[key]"
        //  2958: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //  2961: ldc             Ljava/lang/Float;.class
        //  2963: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2966: astore_3       
        //  2967: aload_3        
        //  2968: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //  2971: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  2974: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  2977: ifeq            2994
        //  2980: aload_1        
        //  2981: invokevirtual   fc2/g.e:()B
        //  2984: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //  2987: checkcast       Ljava/lang/Float;
        //  2990: astore_1       
        //  2991: goto            3478
        //  2994: aload_3        
        //  2995: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //  2998: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3001: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3004: ifeq            3021
        //  3007: aload_1        
        //  3008: invokevirtual   fc2/g.z:()S
        //  3011: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //  3014: checkcast       Ljava/lang/Float;
        //  3017: astore_1       
        //  3018: goto            3478
        //  3021: aload_3        
        //  3022: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //  3025: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3028: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3031: ifeq            3048
        //  3034: aload_1        
        //  3035: invokevirtual   fc2/g.m:()I
        //  3038: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3041: checkcast       Ljava/lang/Float;
        //  3044: astore_1       
        //  3045: goto            3478
        //  3048: aload_3        
        //  3049: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //  3052: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3055: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3058: ifeq            3075
        //  3061: aload_1        
        //  3062: invokevirtual   fc2/g.x:()J
        //  3065: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3068: checkcast       Ljava/lang/Float;
        //  3071: astore_1       
        //  3072: goto            3478
        //  3075: aload_3        
        //  3076: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //  3079: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3082: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3085: ifeq            3099
        //  3088: aload_1        
        //  3089: invokevirtual   fc2/g.l:()F
        //  3092: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  3095: astore_1       
        //  3096: goto            3478
        //  3099: aload_3        
        //  3100: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //  3103: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3106: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3109: ifeq            3126
        //  3112: aload_1        
        //  3113: invokevirtual   fc2/g.k:()D
        //  3116: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  3119: checkcast       Ljava/lang/Float;
        //  3122: astore_1       
        //  3123: goto            3478
        //  3126: aload_3        
        //  3127: ldc             Ljava/math/BigDecimal;.class
        //  3129: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3132: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3135: ifeq            3167
        //  3138: aload_1        
        //  3139: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //  3142: astore_1       
        //  3143: aload_1        
        //  3144: ifnull          3155
        //  3147: aload_1        
        //  3148: checkcast       Ljava/lang/Float;
        //  3151: astore_1       
        //  3152: goto            3478
        //  3155: new             Ljava/lang/NullPointerException;
        //  3158: astore_1       
        //  3159: aload_1        
        //  3160: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  3162: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  3165: aload_1        
        //  3166: athrow         
        //  3167: aload_3        
        //  3168: ldc             Ljava/math/BigInteger;.class
        //  3170: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3173: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3176: ifeq            3208
        //  3179: aload_1        
        //  3180: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //  3183: astore_1       
        //  3184: aload_1        
        //  3185: ifnull          3196
        //  3188: aload_1        
        //  3189: checkcast       Ljava/lang/Float;
        //  3192: astore_1       
        //  3193: goto            3478
        //  3196: new             Ljava/lang/NullPointerException;
        //  3199: astore_1       
        //  3200: aload_1        
        //  3201: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  3203: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  3206: aload_1        
        //  3207: athrow         
        //  3208: aload_3        
        //  3209: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //  3212: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3215: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3218: ifeq            3235
        //  3221: aload_1        
        //  3222: invokevirtual   fc2/g.i:()C
        //  3225: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //  3228: checkcast       Ljava/lang/Float;
        //  3231: astore_1       
        //  3232: goto            3478
        //  3235: aload_3        
        //  3236: ldc             Ljava/lang/String;.class
        //  3238: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3241: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3244: ifeq            3276
        //  3247: aload_1        
        //  3248: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //  3251: astore_1       
        //  3252: aload_1        
        //  3253: ifnull          3264
        //  3256: aload_1        
        //  3257: checkcast       Ljava/lang/Float;
        //  3260: astore_1       
        //  3261: goto            3478
        //  3264: new             Ljava/lang/NullPointerException;
        //  3267: astore_1       
        //  3268: aload_1        
        //  3269: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  3271: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  3274: aload_1        
        //  3275: athrow         
        //  3276: aload_3        
        //  3277: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //  3280: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3283: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3286: ifeq            3303
        //  3289: aload_1        
        //  3290: invokevirtual   fc2/g.d:()Z
        //  3293: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3296: checkcast       Ljava/lang/Float;
        //  3299: astore_1       
        //  3300: goto            3478
        //  3303: aload_3        
        //  3304: ldc             Lfc2/i;.class
        //  3306: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3309: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3312: ifeq            3326
        //  3315: aload_1        
        //  3316: invokevirtual   fc2/g.p:()Lfc2/i;
        //  3319: checkcast       Ljava/lang/Float;
        //  3322: astore_1       
        //  3323: goto            3478
        //  3326: aload_3        
        //  3327: ldc             Lfc2/k;.class
        //  3329: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3332: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3335: ifeq            3349
        //  3338: aload_1        
        //  3339: invokevirtual   fc2/g.q:()Lfc2/k;
        //  3342: checkcast       Ljava/lang/Float;
        //  3345: astore_1       
        //  3346: goto            3478
        //  3349: aload_3        
        //  3350: ldc             Lfc2/f;.class
        //  3352: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3355: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3358: ifeq            3372
        //  3361: aload_1        
        //  3362: invokevirtual   fc2/g.n:()Lfc2/f;
        //  3365: checkcast       Ljava/lang/Float;
        //  3368: astore_1       
        //  3369: goto            3478
        //  3372: aload_3        
        //  3373: ldc             Lfc2/h;.class
        //  3375: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3378: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3381: ifeq            3476
        //  3384: aload_1        
        //  3385: invokevirtual   fc2/g.o:()Lfc2/h;
        //  3388: checkcast       Ljava/lang/Float;
        //  3391: astore_1       
        //  3392: goto            3478
        //  3395: aload_1        
        //  3396: instanceof      Lfc2/i;
        //  3399: ifeq            3433
        //  3402: aload_2        
        //  3403: ldc             "interval"
        //  3405: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  3408: astore_1       
        //  3409: aload_1        
        //  3410: ifnull          3421
        //  3413: aload_1        
        //  3414: checkcast       Ljava/lang/Float;
        //  3417: astore_1       
        //  3418: goto            3478
        //  3421: new             Ljava/lang/NullPointerException;
        //  3424: astore_1       
        //  3425: aload_1        
        //  3426: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  3428: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  3431: aload_1        
        //  3432: athrow         
        //  3433: aload_1        
        //  3434: instanceof      Lfc2/f;
        //  3437: ifeq            3476
        //  3440: aload_2        
        //  3441: ldc             "interval"
        //  3443: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  3446: astore_1       
        //  3447: aload_1        
        //  3448: ifnull          3459
        //  3451: aload_1        
        //  3452: checkcast       Ljava/lang/Float;
        //  3455: astore_1       
        //  3456: goto            3478
        //  3459: new             Ljava/lang/NullPointerException;
        //  3462: astore_1       
        //  3463: aload_1        
        //  3464: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  3466: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  3469: aload_1        
        //  3470: athrow         
        //  3471: astore_1       
        //  3472: aload_1        
        //  3473: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //  3476: aconst_null    
        //  3477: astore_1       
        //  3478: aload_1        
        //  3479: ifnull          3506
        //  3482: aload_0        
        //  3483: aload_1        
        //  3484: invokevirtual   java/lang/Number.floatValue:()F
        //  3487: bipush          10
        //  3489: i2f            
        //  3490: fmul           
        //  3491: f2d            
        //  3492: invokestatic    java/lang/Math.rint:(D)D
        //  3495: d2f            
        //  3496: ldc             10.0
        //  3498: fdiv           
        //  3499: putfield        com/sendbird/android/s0.a:F
        //  3502: getstatic       hg2/j.a:Lhg2/j;
        //  3505: astore_1       
        //  3506: aload_2        
        //  3507: ldc             "max_interval"
        //  3509: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //  3512: ifne            3518
        //  3515: goto            4060
        //  3518: aload_2        
        //  3519: ldc             "max_interval"
        //  3521: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  3524: astore_1       
        //  3525: aload_1        
        //  3526: instanceof      Lfc2/k;
        //  3529: ifeq            3979
        //  3532: aload_2        
        //  3533: ldc             "max_interval"
        //  3535: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  3538: astore_1       
        //  3539: aload_1        
        //  3540: ldc             "this[key]"
        //  3542: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //  3545: ldc             Ljava/lang/Float;.class
        //  3547: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3550: astore_3       
        //  3551: aload_3        
        //  3552: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //  3555: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3558: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3561: ifeq            3578
        //  3564: aload_1        
        //  3565: invokevirtual   fc2/g.e:()B
        //  3568: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //  3571: checkcast       Ljava/lang/Float;
        //  3574: astore_1       
        //  3575: goto            4062
        //  3578: aload_3        
        //  3579: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //  3582: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3585: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3588: ifeq            3605
        //  3591: aload_1        
        //  3592: invokevirtual   fc2/g.z:()S
        //  3595: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //  3598: checkcast       Ljava/lang/Float;
        //  3601: astore_1       
        //  3602: goto            4062
        //  3605: aload_3        
        //  3606: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //  3609: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3612: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3615: ifeq            3632
        //  3618: aload_1        
        //  3619: invokevirtual   fc2/g.m:()I
        //  3622: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  3625: checkcast       Ljava/lang/Float;
        //  3628: astore_1       
        //  3629: goto            4062
        //  3632: aload_3        
        //  3633: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //  3636: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3639: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3642: ifeq            3659
        //  3645: aload_1        
        //  3646: invokevirtual   fc2/g.x:()J
        //  3649: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  3652: checkcast       Ljava/lang/Float;
        //  3655: astore_1       
        //  3656: goto            4062
        //  3659: aload_3        
        //  3660: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //  3663: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3666: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3669: ifeq            3683
        //  3672: aload_1        
        //  3673: invokevirtual   fc2/g.l:()F
        //  3676: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  3679: astore_1       
        //  3680: goto            4062
        //  3683: aload_3        
        //  3684: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //  3687: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3690: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3693: ifeq            3710
        //  3696: aload_1        
        //  3697: invokevirtual   fc2/g.k:()D
        //  3700: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  3703: checkcast       Ljava/lang/Float;
        //  3706: astore_1       
        //  3707: goto            4062
        //  3710: aload_3        
        //  3711: ldc             Ljava/math/BigDecimal;.class
        //  3713: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3716: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3719: ifeq            3751
        //  3722: aload_1        
        //  3723: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //  3726: astore_1       
        //  3727: aload_1        
        //  3728: ifnull          3739
        //  3731: aload_1        
        //  3732: checkcast       Ljava/lang/Float;
        //  3735: astore_1       
        //  3736: goto            4062
        //  3739: new             Ljava/lang/NullPointerException;
        //  3742: astore_1       
        //  3743: aload_1        
        //  3744: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  3746: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  3749: aload_1        
        //  3750: athrow         
        //  3751: aload_3        
        //  3752: ldc             Ljava/math/BigInteger;.class
        //  3754: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3757: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3760: ifeq            3792
        //  3763: aload_1        
        //  3764: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //  3767: astore_1       
        //  3768: aload_1        
        //  3769: ifnull          3780
        //  3772: aload_1        
        //  3773: checkcast       Ljava/lang/Float;
        //  3776: astore_1       
        //  3777: goto            4062
        //  3780: new             Ljava/lang/NullPointerException;
        //  3783: astore_1       
        //  3784: aload_1        
        //  3785: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  3787: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  3790: aload_1        
        //  3791: athrow         
        //  3792: aload_3        
        //  3793: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //  3796: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3799: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3802: ifeq            3819
        //  3805: aload_1        
        //  3806: invokevirtual   fc2/g.i:()C
        //  3809: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //  3812: checkcast       Ljava/lang/Float;
        //  3815: astore_1       
        //  3816: goto            4062
        //  3819: aload_3        
        //  3820: ldc             Ljava/lang/String;.class
        //  3822: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3825: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3828: ifeq            3860
        //  3831: aload_1        
        //  3832: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //  3835: astore_1       
        //  3836: aload_1        
        //  3837: ifnull          3848
        //  3840: aload_1        
        //  3841: checkcast       Ljava/lang/Float;
        //  3844: astore_1       
        //  3845: goto            4062
        //  3848: new             Ljava/lang/NullPointerException;
        //  3851: astore_1       
        //  3852: aload_1        
        //  3853: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  3855: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  3858: aload_1        
        //  3859: athrow         
        //  3860: aload_3        
        //  3861: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //  3864: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3867: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3870: ifeq            3887
        //  3873: aload_1        
        //  3874: invokevirtual   fc2/g.d:()Z
        //  3877: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  3880: checkcast       Ljava/lang/Float;
        //  3883: astore_1       
        //  3884: goto            4062
        //  3887: aload_3        
        //  3888: ldc             Lfc2/i;.class
        //  3890: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3893: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3896: ifeq            3910
        //  3899: aload_1        
        //  3900: invokevirtual   fc2/g.p:()Lfc2/i;
        //  3903: checkcast       Ljava/lang/Float;
        //  3906: astore_1       
        //  3907: goto            4062
        //  3910: aload_3        
        //  3911: ldc             Lfc2/k;.class
        //  3913: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3916: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3919: ifeq            3933
        //  3922: aload_1        
        //  3923: invokevirtual   fc2/g.q:()Lfc2/k;
        //  3926: checkcast       Ljava/lang/Float;
        //  3929: astore_1       
        //  3930: goto            4062
        //  3933: aload_3        
        //  3934: ldc             Lfc2/f;.class
        //  3936: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3939: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3942: ifeq            3956
        //  3945: aload_1        
        //  3946: invokevirtual   fc2/g.n:()Lfc2/f;
        //  3949: checkcast       Ljava/lang/Float;
        //  3952: astore_1       
        //  3953: goto            4062
        //  3956: aload_3        
        //  3957: ldc             Lfc2/h;.class
        //  3959: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  3962: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  3965: ifeq            4060
        //  3968: aload_1        
        //  3969: invokevirtual   fc2/g.o:()Lfc2/h;
        //  3972: checkcast       Ljava/lang/Float;
        //  3975: astore_1       
        //  3976: goto            4062
        //  3979: aload_1        
        //  3980: instanceof      Lfc2/i;
        //  3983: ifeq            4017
        //  3986: aload_2        
        //  3987: ldc             "max_interval"
        //  3989: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  3992: astore_1       
        //  3993: aload_1        
        //  3994: ifnull          4005
        //  3997: aload_1        
        //  3998: checkcast       Ljava/lang/Float;
        //  4001: astore_1       
        //  4002: goto            4062
        //  4005: new             Ljava/lang/NullPointerException;
        //  4008: astore_1       
        //  4009: aload_1        
        //  4010: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  4012: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4015: aload_1        
        //  4016: athrow         
        //  4017: aload_1        
        //  4018: instanceof      Lfc2/f;
        //  4021: ifeq            4060
        //  4024: aload_2        
        //  4025: ldc             "max_interval"
        //  4027: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  4030: astore_1       
        //  4031: aload_1        
        //  4032: ifnull          4043
        //  4035: aload_1        
        //  4036: checkcast       Ljava/lang/Float;
        //  4039: astore_1       
        //  4040: goto            4062
        //  4043: new             Ljava/lang/NullPointerException;
        //  4046: astore_1       
        //  4047: aload_1        
        //  4048: ldc             "null cannot be cast to non-null type kotlin.Float"
        //  4050: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4053: aload_1        
        //  4054: athrow         
        //  4055: astore_1       
        //  4056: aload_1        
        //  4057: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //  4060: aconst_null    
        //  4061: astore_1       
        //  4062: aload_1        
        //  4063: ifnull          4078
        //  4066: aload_0        
        //  4067: aload_1        
        //  4068: invokevirtual   java/lang/Number.floatValue:()F
        //  4071: putfield        com/sendbird/android/s0.b:F
        //  4074: getstatic       hg2/j.a:Lhg2/j;
        //  4077: astore_1       
        //  4078: aload_2        
        //  4079: ldc             "mul"
        //  4081: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //  4084: ifne            4090
        //  4087: goto            4632
        //  4090: aload_2        
        //  4091: ldc             "mul"
        //  4093: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  4096: astore_1       
        //  4097: aload_1        
        //  4098: instanceof      Lfc2/k;
        //  4101: ifeq            4551
        //  4104: aload_2        
        //  4105: ldc             "mul"
        //  4107: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  4110: astore_3       
        //  4111: aload_3        
        //  4112: ldc             "this[key]"
        //  4114: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //  4117: ldc             Ljava/lang/Integer;.class
        //  4119: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4122: astore_1       
        //  4123: aload_1        
        //  4124: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //  4127: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4130: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4133: ifeq            4150
        //  4136: aload_3        
        //  4137: invokevirtual   fc2/g.e:()B
        //  4140: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //  4143: checkcast       Ljava/lang/Integer;
        //  4146: astore_1       
        //  4147: goto            4634
        //  4150: aload_1        
        //  4151: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //  4154: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4157: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4160: ifeq            4177
        //  4163: aload_3        
        //  4164: invokevirtual   fc2/g.z:()S
        //  4167: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //  4170: checkcast       Ljava/lang/Integer;
        //  4173: astore_1       
        //  4174: goto            4634
        //  4177: aload_1        
        //  4178: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //  4181: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4184: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4187: ifeq            4201
        //  4190: aload_3        
        //  4191: invokevirtual   fc2/g.m:()I
        //  4194: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4197: astore_1       
        //  4198: goto            4634
        //  4201: aload_1        
        //  4202: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //  4205: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4208: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4211: ifeq            4228
        //  4214: aload_3        
        //  4215: invokevirtual   fc2/g.x:()J
        //  4218: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4221: checkcast       Ljava/lang/Integer;
        //  4224: astore_1       
        //  4225: goto            4634
        //  4228: aload_1        
        //  4229: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //  4232: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4235: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4238: ifeq            4255
        //  4241: aload_3        
        //  4242: invokevirtual   fc2/g.l:()F
        //  4245: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  4248: checkcast       Ljava/lang/Integer;
        //  4251: astore_1       
        //  4252: goto            4634
        //  4255: aload_1        
        //  4256: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //  4259: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4262: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4265: ifeq            4282
        //  4268: aload_3        
        //  4269: invokevirtual   fc2/g.k:()D
        //  4272: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  4275: checkcast       Ljava/lang/Integer;
        //  4278: astore_1       
        //  4279: goto            4634
        //  4282: aload_1        
        //  4283: ldc             Ljava/math/BigDecimal;.class
        //  4285: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4288: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4291: ifeq            4323
        //  4294: aload_3        
        //  4295: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //  4298: astore_1       
        //  4299: aload_1        
        //  4300: ifnull          4311
        //  4303: aload_1        
        //  4304: checkcast       Ljava/lang/Integer;
        //  4307: astore_1       
        //  4308: goto            4634
        //  4311: new             Ljava/lang/NullPointerException;
        //  4314: astore_1       
        //  4315: aload_1        
        //  4316: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  4318: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4321: aload_1        
        //  4322: athrow         
        //  4323: aload_1        
        //  4324: ldc             Ljava/math/BigInteger;.class
        //  4326: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4329: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4332: ifeq            4364
        //  4335: aload_3        
        //  4336: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //  4339: astore_1       
        //  4340: aload_1        
        //  4341: ifnull          4352
        //  4344: aload_1        
        //  4345: checkcast       Ljava/lang/Integer;
        //  4348: astore_1       
        //  4349: goto            4634
        //  4352: new             Ljava/lang/NullPointerException;
        //  4355: astore_1       
        //  4356: aload_1        
        //  4357: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  4359: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4362: aload_1        
        //  4363: athrow         
        //  4364: aload_1        
        //  4365: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //  4368: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4371: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4374: ifeq            4391
        //  4377: aload_3        
        //  4378: invokevirtual   fc2/g.i:()C
        //  4381: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //  4384: checkcast       Ljava/lang/Integer;
        //  4387: astore_1       
        //  4388: goto            4634
        //  4391: aload_1        
        //  4392: ldc             Ljava/lang/String;.class
        //  4394: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4397: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4400: ifeq            4432
        //  4403: aload_3        
        //  4404: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //  4407: astore_1       
        //  4408: aload_1        
        //  4409: ifnull          4420
        //  4412: aload_1        
        //  4413: checkcast       Ljava/lang/Integer;
        //  4416: astore_1       
        //  4417: goto            4634
        //  4420: new             Ljava/lang/NullPointerException;
        //  4423: astore_1       
        //  4424: aload_1        
        //  4425: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  4427: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4430: aload_1        
        //  4431: athrow         
        //  4432: aload_1        
        //  4433: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //  4436: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4439: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4442: ifeq            4459
        //  4445: aload_3        
        //  4446: invokevirtual   fc2/g.d:()Z
        //  4449: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  4452: checkcast       Ljava/lang/Integer;
        //  4455: astore_1       
        //  4456: goto            4634
        //  4459: aload_1        
        //  4460: ldc             Lfc2/i;.class
        //  4462: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4465: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4468: ifeq            4482
        //  4471: aload_3        
        //  4472: invokevirtual   fc2/g.p:()Lfc2/i;
        //  4475: checkcast       Ljava/lang/Integer;
        //  4478: astore_1       
        //  4479: goto            4634
        //  4482: aload_1        
        //  4483: ldc             Lfc2/k;.class
        //  4485: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4488: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4491: ifeq            4505
        //  4494: aload_3        
        //  4495: invokevirtual   fc2/g.q:()Lfc2/k;
        //  4498: checkcast       Ljava/lang/Integer;
        //  4501: astore_1       
        //  4502: goto            4634
        //  4505: aload_1        
        //  4506: ldc             Lfc2/f;.class
        //  4508: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4511: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4514: ifeq            4528
        //  4517: aload_3        
        //  4518: invokevirtual   fc2/g.n:()Lfc2/f;
        //  4521: checkcast       Ljava/lang/Integer;
        //  4524: astore_1       
        //  4525: goto            4634
        //  4528: aload_1        
        //  4529: ldc             Lfc2/h;.class
        //  4531: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4534: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4537: ifeq            4632
        //  4540: aload_3        
        //  4541: invokevirtual   fc2/g.o:()Lfc2/h;
        //  4544: checkcast       Ljava/lang/Integer;
        //  4547: astore_1       
        //  4548: goto            4634
        //  4551: aload_1        
        //  4552: instanceof      Lfc2/i;
        //  4555: ifeq            4589
        //  4558: aload_2        
        //  4559: ldc             "mul"
        //  4561: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  4564: astore_1       
        //  4565: aload_1        
        //  4566: ifnull          4577
        //  4569: aload_1        
        //  4570: checkcast       Ljava/lang/Integer;
        //  4573: astore_1       
        //  4574: goto            4634
        //  4577: new             Ljava/lang/NullPointerException;
        //  4580: astore_1       
        //  4581: aload_1        
        //  4582: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  4584: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4587: aload_1        
        //  4588: athrow         
        //  4589: aload_1        
        //  4590: instanceof      Lfc2/f;
        //  4593: ifeq            4632
        //  4596: aload_2        
        //  4597: ldc             "mul"
        //  4599: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  4602: astore_1       
        //  4603: aload_1        
        //  4604: ifnull          4615
        //  4607: aload_1        
        //  4608: checkcast       Ljava/lang/Integer;
        //  4611: astore_1       
        //  4612: goto            4634
        //  4615: new             Ljava/lang/NullPointerException;
        //  4618: astore_1       
        //  4619: aload_1        
        //  4620: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  4622: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4625: aload_1        
        //  4626: athrow         
        //  4627: astore_1       
        //  4628: aload_1        
        //  4629: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //  4632: aconst_null    
        //  4633: astore_1       
        //  4634: aload_1        
        //  4635: ifnull          4650
        //  4638: aload_0        
        //  4639: aload_1        
        //  4640: invokevirtual   java/lang/Number.intValue:()I
        //  4643: putfield        com/sendbird/android/s0.c:I
        //  4646: getstatic       hg2/j.a:Lhg2/j;
        //  4649: astore_1       
        //  4650: aload_2        
        //  4651: ldc_w           "retry_cnt"
        //  4654: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //  4657: ifne            4663
        //  4660: goto            5209
        //  4663: aload_2        
        //  4664: ldc_w           "retry_cnt"
        //  4667: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  4670: astore_1       
        //  4671: aload_1        
        //  4672: instanceof      Lfc2/k;
        //  4675: ifeq            5126
        //  4678: aload_2        
        //  4679: ldc_w           "retry_cnt"
        //  4682: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  4685: astore_1       
        //  4686: aload_1        
        //  4687: ldc             "this[key]"
        //  4689: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //  4692: ldc             Ljava/lang/Integer;.class
        //  4694: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4697: astore_3       
        //  4698: aload_3        
        //  4699: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //  4702: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4705: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4708: ifeq            4725
        //  4711: aload_1        
        //  4712: invokevirtual   fc2/g.e:()B
        //  4715: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //  4718: checkcast       Ljava/lang/Integer;
        //  4721: astore_1       
        //  4722: goto            5150
        //  4725: aload_3        
        //  4726: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //  4729: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4732: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4735: ifeq            4752
        //  4738: aload_1        
        //  4739: invokevirtual   fc2/g.z:()S
        //  4742: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //  4745: checkcast       Ljava/lang/Integer;
        //  4748: astore_1       
        //  4749: goto            5150
        //  4752: aload_3        
        //  4753: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //  4756: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4759: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4762: ifeq            4776
        //  4765: aload_1        
        //  4766: invokevirtual   fc2/g.m:()I
        //  4769: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  4772: astore_1       
        //  4773: goto            5150
        //  4776: aload_3        
        //  4777: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //  4780: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4783: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4786: ifeq            4803
        //  4789: aload_1        
        //  4790: invokevirtual   fc2/g.x:()J
        //  4793: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //  4796: checkcast       Ljava/lang/Integer;
        //  4799: astore_1       
        //  4800: goto            5150
        //  4803: aload_3        
        //  4804: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //  4807: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4810: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4813: ifeq            4830
        //  4816: aload_1        
        //  4817: invokevirtual   fc2/g.l:()F
        //  4820: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  4823: checkcast       Ljava/lang/Integer;
        //  4826: astore_1       
        //  4827: goto            5150
        //  4830: aload_3        
        //  4831: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //  4834: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4837: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4840: ifeq            4857
        //  4843: aload_1        
        //  4844: invokevirtual   fc2/g.k:()D
        //  4847: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  4850: checkcast       Ljava/lang/Integer;
        //  4853: astore_1       
        //  4854: goto            5150
        //  4857: aload_3        
        //  4858: ldc             Ljava/math/BigDecimal;.class
        //  4860: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4863: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4866: ifeq            4898
        //  4869: aload_1        
        //  4870: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //  4873: astore_1       
        //  4874: aload_1        
        //  4875: ifnull          4886
        //  4878: aload_1        
        //  4879: checkcast       Ljava/lang/Integer;
        //  4882: astore_1       
        //  4883: goto            5150
        //  4886: new             Ljava/lang/NullPointerException;
        //  4889: astore_1       
        //  4890: aload_1        
        //  4891: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  4893: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4896: aload_1        
        //  4897: athrow         
        //  4898: aload_3        
        //  4899: ldc             Ljava/math/BigInteger;.class
        //  4901: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4904: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4907: ifeq            4939
        //  4910: aload_1        
        //  4911: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //  4914: astore_1       
        //  4915: aload_1        
        //  4916: ifnull          4927
        //  4919: aload_1        
        //  4920: checkcast       Ljava/lang/Integer;
        //  4923: astore_1       
        //  4924: goto            5150
        //  4927: new             Ljava/lang/NullPointerException;
        //  4930: astore_1       
        //  4931: aload_1        
        //  4932: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  4934: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  4937: aload_1        
        //  4938: athrow         
        //  4939: aload_3        
        //  4940: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //  4943: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4946: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4949: ifeq            4966
        //  4952: aload_1        
        //  4953: invokevirtual   fc2/g.i:()C
        //  4956: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //  4959: checkcast       Ljava/lang/Integer;
        //  4962: astore_1       
        //  4963: goto            5150
        //  4966: aload_3        
        //  4967: ldc             Ljava/lang/String;.class
        //  4969: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  4972: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  4975: ifeq            5007
        //  4978: aload_1        
        //  4979: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //  4982: astore_1       
        //  4983: aload_1        
        //  4984: ifnull          4995
        //  4987: aload_1        
        //  4988: checkcast       Ljava/lang/Integer;
        //  4991: astore_1       
        //  4992: goto            5150
        //  4995: new             Ljava/lang/NullPointerException;
        //  4998: astore_1       
        //  4999: aload_1        
        //  5000: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  5002: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5005: aload_1        
        //  5006: athrow         
        //  5007: aload_3        
        //  5008: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //  5011: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  5014: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  5017: ifeq            5034
        //  5020: aload_1        
        //  5021: invokevirtual   fc2/g.d:()Z
        //  5024: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //  5027: checkcast       Ljava/lang/Integer;
        //  5030: astore_1       
        //  5031: goto            5150
        //  5034: aload_3        
        //  5035: ldc             Lfc2/i;.class
        //  5037: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  5040: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  5043: ifeq            5057
        //  5046: aload_1        
        //  5047: invokevirtual   fc2/g.p:()Lfc2/i;
        //  5050: checkcast       Ljava/lang/Integer;
        //  5053: astore_1       
        //  5054: goto            5150
        //  5057: aload_3        
        //  5058: ldc             Lfc2/k;.class
        //  5060: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  5063: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  5066: ifeq            5080
        //  5069: aload_1        
        //  5070: invokevirtual   fc2/g.q:()Lfc2/k;
        //  5073: checkcast       Ljava/lang/Integer;
        //  5076: astore_1       
        //  5077: goto            5150
        //  5080: aload_3        
        //  5081: ldc             Lfc2/f;.class
        //  5083: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  5086: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  5089: ifeq            5103
        //  5092: aload_1        
        //  5093: invokevirtual   fc2/g.n:()Lfc2/f;
        //  5096: checkcast       Ljava/lang/Integer;
        //  5099: astore_1       
        //  5100: goto            5150
        //  5103: aload_3        
        //  5104: ldc             Lfc2/h;.class
        //  5106: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //  5109: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  5112: ifeq            5209
        //  5115: aload_1        
        //  5116: invokevirtual   fc2/g.o:()Lfc2/h;
        //  5119: checkcast       Ljava/lang/Integer;
        //  5122: astore_1       
        //  5123: goto            5150
        //  5126: aload_1        
        //  5127: instanceof      Lfc2/i;
        //  5130: ifeq            5165
        //  5133: aload_2        
        //  5134: ldc_w           "retry_cnt"
        //  5137: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  5140: astore_1       
        //  5141: aload_1        
        //  5142: ifnull          5153
        //  5145: aload_1        
        //  5146: checkcast       Ljava/lang/Integer;
        //  5149: astore_1       
        //  5150: goto            5211
        //  5153: new             Ljava/lang/NullPointerException;
        //  5156: astore_1       
        //  5157: aload_1        
        //  5158: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  5160: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5163: aload_1        
        //  5164: athrow         
        //  5165: aload_1        
        //  5166: instanceof      Lfc2/f;
        //  5169: ifeq            5209
        //  5172: aload_2        
        //  5173: ldc_w           "retry_cnt"
        //  5176: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //  5179: astore_1       
        //  5180: aload_1        
        //  5181: ifnull          5192
        //  5184: aload_1        
        //  5185: checkcast       Ljava/lang/Integer;
        //  5188: astore_1       
        //  5189: goto            5150
        //  5192: new             Ljava/lang/NullPointerException;
        //  5195: astore_1       
        //  5196: aload_1        
        //  5197: ldc             "null cannot be cast to non-null type kotlin.Int"
        //  5199: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //  5202: aload_1        
        //  5203: athrow         
        //  5204: astore_1       
        //  5205: aload_1        
        //  5206: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //  5209: aconst_null    
        //  5210: astore_1       
        //  5211: aload_1        
        //  5212: ifnull          5227
        //  5215: aload_0        
        //  5216: aload_1        
        //  5217: invokevirtual   java/lang/Number.intValue:()I
        //  5220: putfield        com/sendbird/android/s0.d:I
        //  5223: getstatic       hg2/j.a:Lhg2/j;
        //  5226: astore_1       
        //  5227: getstatic       hg2/j.a:Lhg2/j;
        //  5230: astore_1       
        //  5231: aload_2        
        //  5232: astore_1       
        //  5233: goto            5238
        //  5236: aconst_null    
        //  5237: astore_1       
        //  5238: aload_0        
        //  5239: aload_1        
        //  5240: putfield        com/sendbird/android/s0.j:Lfc2/i;
        //  5243: getstatic       hg2/j.a:Lhg2/j;
        //  5246: astore_1       
        //  5247: return         
        //  5248: astore_1       
        //  5249: goto            559
        //  5252: astore_1       
        //  5253: goto            1135
        //  5256: astore_1       
        //  5257: goto            1711
        //  5260: astore_1       
        //  5261: goto            2283
        //  5264: astore_1       
        //  5265: goto            2855
        //  5268: astore_1       
        //  5269: goto            3476
        //  5272: astore_1       
        //  5273: goto            4060
        //  5276: astore_1       
        //  5277: goto            4632
        //  5280: astore_1       
        //  5281: goto            5209
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  17     44     554    559    Ljava/lang/Exception;
        //  44     74     5248   5252   Ljava/lang/Exception;
        //  77     101    5248   5252   Ljava/lang/Exception;
        //  104    125    5248   5252   Ljava/lang/Exception;
        //  128    152    5248   5252   Ljava/lang/Exception;
        //  155    179    5248   5252   Ljava/lang/Exception;
        //  182    206    5248   5252   Ljava/lang/Exception;
        //  209    226    5248   5252   Ljava/lang/Exception;
        //  230    235    5248   5252   Ljava/lang/Exception;
        //  238    250    5248   5252   Ljava/lang/Exception;
        //  250    267    5248   5252   Ljava/lang/Exception;
        //  271    276    5248   5252   Ljava/lang/Exception;
        //  279    291    5248   5252   Ljava/lang/Exception;
        //  291    315    5248   5252   Ljava/lang/Exception;
        //  318    335    5248   5252   Ljava/lang/Exception;
        //  339    344    5248   5252   Ljava/lang/Exception;
        //  347    359    5248   5252   Ljava/lang/Exception;
        //  359    383    5248   5252   Ljava/lang/Exception;
        //  386    406    5248   5252   Ljava/lang/Exception;
        //  409    429    5248   5252   Ljava/lang/Exception;
        //  432    452    5248   5252   Ljava/lang/Exception;
        //  455    475    5248   5252   Ljava/lang/Exception;
        //  478    492    554    559    Ljava/lang/Exception;
        //  496    501    554    559    Ljava/lang/Exception;
        //  504    516    554    559    Ljava/lang/Exception;
        //  516    530    554    559    Ljava/lang/Exception;
        //  534    539    554    559    Ljava/lang/Exception;
        //  542    554    554    559    Ljava/lang/Exception;
        //  593    620    1130   1135   Ljava/lang/Exception;
        //  620    650    5252   5256   Ljava/lang/Exception;
        //  653    677    5252   5256   Ljava/lang/Exception;
        //  680    701    5252   5256   Ljava/lang/Exception;
        //  704    728    5252   5256   Ljava/lang/Exception;
        //  731    755    5252   5256   Ljava/lang/Exception;
        //  758    782    5252   5256   Ljava/lang/Exception;
        //  785    802    5252   5256   Ljava/lang/Exception;
        //  806    811    5252   5256   Ljava/lang/Exception;
        //  814    826    5252   5256   Ljava/lang/Exception;
        //  826    843    5252   5256   Ljava/lang/Exception;
        //  847    852    5252   5256   Ljava/lang/Exception;
        //  855    867    5252   5256   Ljava/lang/Exception;
        //  867    891    5252   5256   Ljava/lang/Exception;
        //  894    911    5252   5256   Ljava/lang/Exception;
        //  915    920    5252   5256   Ljava/lang/Exception;
        //  923    935    5252   5256   Ljava/lang/Exception;
        //  935    959    5252   5256   Ljava/lang/Exception;
        //  962    982    5252   5256   Ljava/lang/Exception;
        //  985    1005   5252   5256   Ljava/lang/Exception;
        //  1008   1028   5252   5256   Ljava/lang/Exception;
        //  1031   1051   5252   5256   Ljava/lang/Exception;
        //  1054   1068   1130   1135   Ljava/lang/Exception;
        //  1072   1077   1130   1135   Ljava/lang/Exception;
        //  1080   1092   1130   1135   Ljava/lang/Exception;
        //  1092   1106   1130   1135   Ljava/lang/Exception;
        //  1110   1115   1130   1135   Ljava/lang/Exception;
        //  1118   1130   1130   1135   Ljava/lang/Exception;
        //  1169   1196   1706   1711   Ljava/lang/Exception;
        //  1196   1226   5256   5260   Ljava/lang/Exception;
        //  1229   1253   5256   5260   Ljava/lang/Exception;
        //  1256   1280   5256   5260   Ljava/lang/Exception;
        //  1283   1304   5256   5260   Ljava/lang/Exception;
        //  1307   1331   5256   5260   Ljava/lang/Exception;
        //  1334   1358   5256   5260   Ljava/lang/Exception;
        //  1361   1378   5256   5260   Ljava/lang/Exception;
        //  1382   1387   5256   5260   Ljava/lang/Exception;
        //  1390   1402   5256   5260   Ljava/lang/Exception;
        //  1402   1419   5256   5260   Ljava/lang/Exception;
        //  1423   1428   5256   5260   Ljava/lang/Exception;
        //  1431   1443   5256   5260   Ljava/lang/Exception;
        //  1443   1467   5256   5260   Ljava/lang/Exception;
        //  1470   1487   5256   5260   Ljava/lang/Exception;
        //  1491   1496   5256   5260   Ljava/lang/Exception;
        //  1499   1511   5256   5260   Ljava/lang/Exception;
        //  1511   1535   5256   5260   Ljava/lang/Exception;
        //  1538   1558   5256   5260   Ljava/lang/Exception;
        //  1561   1581   5256   5260   Ljava/lang/Exception;
        //  1584   1604   5256   5260   Ljava/lang/Exception;
        //  1607   1627   5256   5260   Ljava/lang/Exception;
        //  1630   1644   1706   1711   Ljava/lang/Exception;
        //  1648   1653   1706   1711   Ljava/lang/Exception;
        //  1656   1668   1706   1711   Ljava/lang/Exception;
        //  1668   1682   1706   1711   Ljava/lang/Exception;
        //  1686   1691   1706   1711   Ljava/lang/Exception;
        //  1694   1706   1706   1711   Ljava/lang/Exception;
        //  1741   1768   2278   2283   Ljava/lang/Exception;
        //  1768   1798   5260   5264   Ljava/lang/Exception;
        //  1801   1825   5260   5264   Ljava/lang/Exception;
        //  1828   1849   5260   5264   Ljava/lang/Exception;
        //  1852   1876   5260   5264   Ljava/lang/Exception;
        //  1879   1903   5260   5264   Ljava/lang/Exception;
        //  1906   1930   5260   5264   Ljava/lang/Exception;
        //  1933   1950   5260   5264   Ljava/lang/Exception;
        //  1954   1959   5260   5264   Ljava/lang/Exception;
        //  1962   1974   5260   5264   Ljava/lang/Exception;
        //  1974   1991   5260   5264   Ljava/lang/Exception;
        //  1995   2000   5260   5264   Ljava/lang/Exception;
        //  2003   2015   5260   5264   Ljava/lang/Exception;
        //  2015   2039   5260   5264   Ljava/lang/Exception;
        //  2042   2059   5260   5264   Ljava/lang/Exception;
        //  2063   2068   5260   5264   Ljava/lang/Exception;
        //  2071   2083   5260   5264   Ljava/lang/Exception;
        //  2083   2107   5260   5264   Ljava/lang/Exception;
        //  2110   2130   5260   5264   Ljava/lang/Exception;
        //  2133   2153   5260   5264   Ljava/lang/Exception;
        //  2156   2176   5260   5264   Ljava/lang/Exception;
        //  2179   2199   5260   5264   Ljava/lang/Exception;
        //  2202   2216   2278   2283   Ljava/lang/Exception;
        //  2220   2225   2278   2283   Ljava/lang/Exception;
        //  2228   2240   2278   2283   Ljava/lang/Exception;
        //  2240   2254   2278   2283   Ljava/lang/Exception;
        //  2258   2263   2278   2283   Ljava/lang/Exception;
        //  2266   2278   2278   2283   Ljava/lang/Exception;
        //  2313   2340   2850   2855   Ljava/lang/Exception;
        //  2340   2370   5264   5268   Ljava/lang/Exception;
        //  2373   2397   5264   5268   Ljava/lang/Exception;
        //  2400   2424   5264   5268   Ljava/lang/Exception;
        //  2427   2448   5264   5268   Ljava/lang/Exception;
        //  2451   2475   5264   5268   Ljava/lang/Exception;
        //  2478   2502   5264   5268   Ljava/lang/Exception;
        //  2505   2522   5264   5268   Ljava/lang/Exception;
        //  2526   2531   5264   5268   Ljava/lang/Exception;
        //  2534   2546   5264   5268   Ljava/lang/Exception;
        //  2546   2563   5264   5268   Ljava/lang/Exception;
        //  2567   2572   5264   5268   Ljava/lang/Exception;
        //  2575   2587   5264   5268   Ljava/lang/Exception;
        //  2587   2611   5264   5268   Ljava/lang/Exception;
        //  2614   2631   5264   5268   Ljava/lang/Exception;
        //  2635   2640   5264   5268   Ljava/lang/Exception;
        //  2643   2655   5264   5268   Ljava/lang/Exception;
        //  2655   2679   5264   5268   Ljava/lang/Exception;
        //  2682   2702   5264   5268   Ljava/lang/Exception;
        //  2705   2725   5264   5268   Ljava/lang/Exception;
        //  2728   2748   5264   5268   Ljava/lang/Exception;
        //  2751   2771   5264   5268   Ljava/lang/Exception;
        //  2774   2788   2850   2855   Ljava/lang/Exception;
        //  2792   2797   2850   2855   Ljava/lang/Exception;
        //  2800   2812   2850   2855   Ljava/lang/Exception;
        //  2812   2826   2850   2855   Ljava/lang/Exception;
        //  2830   2835   2850   2855   Ljava/lang/Exception;
        //  2838   2850   2850   2855   Ljava/lang/Exception;
        //  2934   2961   3471   3476   Ljava/lang/Exception;
        //  2961   2991   5268   5272   Ljava/lang/Exception;
        //  2994   3018   5268   5272   Ljava/lang/Exception;
        //  3021   3045   5268   5272   Ljava/lang/Exception;
        //  3048   3072   5268   5272   Ljava/lang/Exception;
        //  3075   3096   5268   5272   Ljava/lang/Exception;
        //  3099   3123   5268   5272   Ljava/lang/Exception;
        //  3126   3143   5268   5272   Ljava/lang/Exception;
        //  3147   3152   5268   5272   Ljava/lang/Exception;
        //  3155   3167   5268   5272   Ljava/lang/Exception;
        //  3167   3184   5268   5272   Ljava/lang/Exception;
        //  3188   3193   5268   5272   Ljava/lang/Exception;
        //  3196   3208   5268   5272   Ljava/lang/Exception;
        //  3208   3232   5268   5272   Ljava/lang/Exception;
        //  3235   3252   5268   5272   Ljava/lang/Exception;
        //  3256   3261   5268   5272   Ljava/lang/Exception;
        //  3264   3276   5268   5272   Ljava/lang/Exception;
        //  3276   3300   5268   5272   Ljava/lang/Exception;
        //  3303   3323   5268   5272   Ljava/lang/Exception;
        //  3326   3346   5268   5272   Ljava/lang/Exception;
        //  3349   3369   5268   5272   Ljava/lang/Exception;
        //  3372   3392   5268   5272   Ljava/lang/Exception;
        //  3395   3409   3471   3476   Ljava/lang/Exception;
        //  3413   3418   3471   3476   Ljava/lang/Exception;
        //  3421   3433   3471   3476   Ljava/lang/Exception;
        //  3433   3447   3471   3476   Ljava/lang/Exception;
        //  3451   3456   3471   3476   Ljava/lang/Exception;
        //  3459   3471   3471   3476   Ljava/lang/Exception;
        //  3518   3545   4055   4060   Ljava/lang/Exception;
        //  3545   3575   5272   5276   Ljava/lang/Exception;
        //  3578   3602   5272   5276   Ljava/lang/Exception;
        //  3605   3629   5272   5276   Ljava/lang/Exception;
        //  3632   3656   5272   5276   Ljava/lang/Exception;
        //  3659   3680   5272   5276   Ljava/lang/Exception;
        //  3683   3707   5272   5276   Ljava/lang/Exception;
        //  3710   3727   5272   5276   Ljava/lang/Exception;
        //  3731   3736   5272   5276   Ljava/lang/Exception;
        //  3739   3751   5272   5276   Ljava/lang/Exception;
        //  3751   3768   5272   5276   Ljava/lang/Exception;
        //  3772   3777   5272   5276   Ljava/lang/Exception;
        //  3780   3792   5272   5276   Ljava/lang/Exception;
        //  3792   3816   5272   5276   Ljava/lang/Exception;
        //  3819   3836   5272   5276   Ljava/lang/Exception;
        //  3840   3845   5272   5276   Ljava/lang/Exception;
        //  3848   3860   5272   5276   Ljava/lang/Exception;
        //  3860   3884   5272   5276   Ljava/lang/Exception;
        //  3887   3907   5272   5276   Ljava/lang/Exception;
        //  3910   3930   5272   5276   Ljava/lang/Exception;
        //  3933   3953   5272   5276   Ljava/lang/Exception;
        //  3956   3976   5272   5276   Ljava/lang/Exception;
        //  3979   3993   4055   4060   Ljava/lang/Exception;
        //  3997   4002   4055   4060   Ljava/lang/Exception;
        //  4005   4017   4055   4060   Ljava/lang/Exception;
        //  4017   4031   4055   4060   Ljava/lang/Exception;
        //  4035   4040   4055   4060   Ljava/lang/Exception;
        //  4043   4055   4055   4060   Ljava/lang/Exception;
        //  4090   4117   4627   4632   Ljava/lang/Exception;
        //  4117   4147   5276   5280   Ljava/lang/Exception;
        //  4150   4174   5276   5280   Ljava/lang/Exception;
        //  4177   4198   5276   5280   Ljava/lang/Exception;
        //  4201   4225   5276   5280   Ljava/lang/Exception;
        //  4228   4252   5276   5280   Ljava/lang/Exception;
        //  4255   4279   5276   5280   Ljava/lang/Exception;
        //  4282   4299   5276   5280   Ljava/lang/Exception;
        //  4303   4308   5276   5280   Ljava/lang/Exception;
        //  4311   4323   5276   5280   Ljava/lang/Exception;
        //  4323   4340   5276   5280   Ljava/lang/Exception;
        //  4344   4349   5276   5280   Ljava/lang/Exception;
        //  4352   4364   5276   5280   Ljava/lang/Exception;
        //  4364   4388   5276   5280   Ljava/lang/Exception;
        //  4391   4408   5276   5280   Ljava/lang/Exception;
        //  4412   4417   5276   5280   Ljava/lang/Exception;
        //  4420   4432   5276   5280   Ljava/lang/Exception;
        //  4432   4456   5276   5280   Ljava/lang/Exception;
        //  4459   4479   5276   5280   Ljava/lang/Exception;
        //  4482   4502   5276   5280   Ljava/lang/Exception;
        //  4505   4525   5276   5280   Ljava/lang/Exception;
        //  4528   4548   5276   5280   Ljava/lang/Exception;
        //  4551   4565   4627   4632   Ljava/lang/Exception;
        //  4569   4574   4627   4632   Ljava/lang/Exception;
        //  4577   4589   4627   4632   Ljava/lang/Exception;
        //  4589   4603   4627   4632   Ljava/lang/Exception;
        //  4607   4612   4627   4632   Ljava/lang/Exception;
        //  4615   4627   4627   4632   Ljava/lang/Exception;
        //  4663   4692   5204   5209   Ljava/lang/Exception;
        //  4692   4722   5280   5284   Ljava/lang/Exception;
        //  4725   4749   5280   5284   Ljava/lang/Exception;
        //  4752   4773   5280   5284   Ljava/lang/Exception;
        //  4776   4800   5280   5284   Ljava/lang/Exception;
        //  4803   4827   5280   5284   Ljava/lang/Exception;
        //  4830   4854   5280   5284   Ljava/lang/Exception;
        //  4857   4874   5280   5284   Ljava/lang/Exception;
        //  4878   4883   5280   5284   Ljava/lang/Exception;
        //  4886   4898   5280   5284   Ljava/lang/Exception;
        //  4898   4915   5280   5284   Ljava/lang/Exception;
        //  4919   4924   5280   5284   Ljava/lang/Exception;
        //  4927   4939   5280   5284   Ljava/lang/Exception;
        //  4939   4963   5280   5284   Ljava/lang/Exception;
        //  4966   4983   5280   5284   Ljava/lang/Exception;
        //  4987   4992   5280   5284   Ljava/lang/Exception;
        //  4995   5007   5280   5284   Ljava/lang/Exception;
        //  5007   5031   5280   5284   Ljava/lang/Exception;
        //  5034   5054   5280   5284   Ljava/lang/Exception;
        //  5057   5077   5280   5284   Ljava/lang/Exception;
        //  5080   5100   5280   5284   Ljava/lang/Exception;
        //  5103   5123   5280   5284   Ljava/lang/Exception;
        //  5126   5141   5204   5209   Ljava/lang/Exception;
        //  5145   5150   5204   5209   Ljava/lang/Exception;
        //  5153   5165   5204   5209   Ljava/lang/Exception;
        //  5165   5180   5204   5209   Ljava/lang/Exception;
        //  5184   5189   5204   5209   Ljava/lang/Exception;
        //  5192   5204   5204   5209   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 2456, Size: 2456
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
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("ConnectionConfig{DEFAULT_INTERVAL=3.0, DEFAULT_MAX_INTERVAL=24.0, DEFAULT_MULTIPLIER=2, DEFAULT_RETRY_CUONT=5, baseInterval=");
        r.append(this.a);
        r.append(", maxInterval=");
        r.append(this.b);
        r.append(", multiplier=");
        r.append(this.c);
        r.append(", maxRetryCount=");
        r.append(this.d);
        r.append(", pingInterval=");
        r.append(this.e);
        r.append(", pongTimeout=");
        r.append(this.f);
        r.append(", lastConnectedAt=");
        r.append(this.g);
        r.append(", maxUnreadCountOnSuperGroup=");
        r.append(this.i);
        r.append(", bcDuration=");
        return b.i(r, this.h, '}');
    }
}
