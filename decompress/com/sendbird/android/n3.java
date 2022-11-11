// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import fc2.g;
import sg2.e;
import bd0.a;

public final class n3
{
    public final String a;
    
    static {
        new a() {};
    }
    
    public n3(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof n3 && e.a((Object)this.a, (Object)((n3)o).a));
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return hashCode;
    }
    
    @Override
    public final String toString() {
        return a.o(a.r("PollData(text="), this.a, ")");
    }
    
    public static final class b
    {
        public static n3 a(final g p0) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ifnull          1181
            //     4: aload_0        
            //     5: instanceof      Lfc2/k;
            //     8: ifeq            602
            //    11: aload_0        
            //    12: invokevirtual   fc2/g.C:()Ljava/lang/String;
            //    15: invokestatic    fc2/j.a:(Ljava/lang/String;)Lfc2/g;
            //    18: invokevirtual   fc2/g.p:()Lfc2/i;
            //    21: astore_0       
            //    22: aload_0        
            //    23: ldc             "text"
            //    25: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
            //    28: istore_1       
            //    29: iload_1        
            //    30: ifne            36
            //    33: goto            576
            //    36: aload_0        
            //    37: ldc             "text"
            //    39: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //    42: astore_2       
            //    43: aload_2        
            //    44: instanceof      Lfc2/k;
            //    47: ifeq            495
            //    50: aload_0        
            //    51: ldc             "text"
            //    53: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //    56: astore_0       
            //    57: aload_0        
            //    58: ldc             "this[key]"
            //    60: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
            //    63: ldc             Ljava/lang/String;.class
            //    65: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //    68: astore_2       
            //    69: aload_2        
            //    70: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
            //    73: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //    76: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    79: ifeq            96
            //    82: aload_0        
            //    83: invokevirtual   fc2/g.e:()B
            //    86: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
            //    89: checkcast       Ljava/lang/String;
            //    92: astore_0       
            //    93: goto            578
            //    96: aload_2        
            //    97: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
            //   100: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   103: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   106: ifeq            123
            //   109: aload_0        
            //   110: invokevirtual   fc2/g.z:()S
            //   113: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
            //   116: checkcast       Ljava/lang/String;
            //   119: astore_0       
            //   120: goto            578
            //   123: aload_2        
            //   124: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //   127: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   130: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   133: ifeq            150
            //   136: aload_0        
            //   137: invokevirtual   fc2/g.m:()I
            //   140: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   143: checkcast       Ljava/lang/String;
            //   146: astore_0       
            //   147: goto            578
            //   150: aload_2        
            //   151: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
            //   154: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   157: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   160: ifeq            177
            //   163: aload_0        
            //   164: invokevirtual   fc2/g.x:()J
            //   167: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //   170: checkcast       Ljava/lang/String;
            //   173: astore_0       
            //   174: goto            578
            //   177: aload_2        
            //   178: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
            //   181: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   184: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   187: ifeq            204
            //   190: aload_0        
            //   191: invokevirtual   fc2/g.l:()F
            //   194: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
            //   197: checkcast       Ljava/lang/String;
            //   200: astore_0       
            //   201: goto            578
            //   204: aload_2        
            //   205: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
            //   208: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   211: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   214: ifeq            231
            //   217: aload_0        
            //   218: invokevirtual   fc2/g.k:()D
            //   221: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
            //   224: checkcast       Ljava/lang/String;
            //   227: astore_0       
            //   228: goto            578
            //   231: aload_2        
            //   232: ldc             Ljava/math/BigDecimal;.class
            //   234: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   237: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   240: ifeq            272
            //   243: aload_0        
            //   244: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
            //   247: astore_0       
            //   248: aload_0        
            //   249: ifnull          260
            //   252: aload_0        
            //   253: checkcast       Ljava/lang/String;
            //   256: astore_0       
            //   257: goto            578
            //   260: new             Ljava/lang/NullPointerException;
            //   263: astore_0       
            //   264: aload_0        
            //   265: ldc             "null cannot be cast to non-null type kotlin.String"
            //   267: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   270: aload_0        
            //   271: athrow         
            //   272: aload_2        
            //   273: ldc             Ljava/math/BigInteger;.class
            //   275: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   278: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   281: ifeq            313
            //   284: aload_0        
            //   285: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
            //   288: astore_0       
            //   289: aload_0        
            //   290: ifnull          301
            //   293: aload_0        
            //   294: checkcast       Ljava/lang/String;
            //   297: astore_0       
            //   298: goto            578
            //   301: new             Ljava/lang/NullPointerException;
            //   304: astore_0       
            //   305: aload_0        
            //   306: ldc             "null cannot be cast to non-null type kotlin.String"
            //   308: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   311: aload_0        
            //   312: athrow         
            //   313: aload_2        
            //   314: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
            //   317: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   320: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   323: ifeq            340
            //   326: aload_0        
            //   327: invokevirtual   fc2/g.i:()C
            //   330: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
            //   333: checkcast       Ljava/lang/String;
            //   336: astore_0       
            //   337: goto            578
            //   340: aload_2        
            //   341: ldc             Ljava/lang/String;.class
            //   343: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   346: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   349: ifeq            376
            //   352: aload_0        
            //   353: invokevirtual   fc2/g.C:()Ljava/lang/String;
            //   356: astore_0       
            //   357: aload_0        
            //   358: ifnull          364
            //   361: goto            578
            //   364: new             Ljava/lang/NullPointerException;
            //   367: astore_0       
            //   368: aload_0        
            //   369: ldc             "null cannot be cast to non-null type kotlin.String"
            //   371: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   374: aload_0        
            //   375: athrow         
            //   376: aload_2        
            //   377: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //   380: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   383: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   386: ifeq            403
            //   389: aload_0        
            //   390: invokevirtual   fc2/g.d:()Z
            //   393: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //   396: checkcast       Ljava/lang/String;
            //   399: astore_0       
            //   400: goto            578
            //   403: aload_2        
            //   404: ldc             Lfc2/i;.class
            //   406: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   409: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   412: ifeq            426
            //   415: aload_0        
            //   416: invokevirtual   fc2/g.p:()Lfc2/i;
            //   419: checkcast       Ljava/lang/String;
            //   422: astore_0       
            //   423: goto            578
            //   426: aload_2        
            //   427: ldc             Lfc2/k;.class
            //   429: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   432: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   435: ifeq            449
            //   438: aload_0        
            //   439: invokevirtual   fc2/g.q:()Lfc2/k;
            //   442: checkcast       Ljava/lang/String;
            //   445: astore_0       
            //   446: goto            578
            //   449: aload_2        
            //   450: ldc             Lfc2/f;.class
            //   452: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   455: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   458: ifeq            472
            //   461: aload_0        
            //   462: invokevirtual   fc2/g.n:()Lfc2/f;
            //   465: checkcast       Ljava/lang/String;
            //   468: astore_0       
            //   469: goto            578
            //   472: aload_2        
            //   473: ldc             Lfc2/h;.class
            //   475: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   478: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   481: ifeq            576
            //   484: aload_0        
            //   485: invokevirtual   fc2/g.o:()Lfc2/h;
            //   488: checkcast       Ljava/lang/String;
            //   491: astore_0       
            //   492: goto            578
            //   495: aload_2        
            //   496: instanceof      Lfc2/i;
            //   499: ifeq            533
            //   502: aload_0        
            //   503: ldc             "text"
            //   505: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //   508: astore_0       
            //   509: aload_0        
            //   510: ifnull          521
            //   513: aload_0        
            //   514: checkcast       Ljava/lang/String;
            //   517: astore_0       
            //   518: goto            578
            //   521: new             Ljava/lang/NullPointerException;
            //   524: astore_0       
            //   525: aload_0        
            //   526: ldc             "null cannot be cast to non-null type kotlin.String"
            //   528: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   531: aload_0        
            //   532: athrow         
            //   533: aload_2        
            //   534: instanceof      Lfc2/f;
            //   537: ifeq            576
            //   540: aload_0        
            //   541: ldc             "text"
            //   543: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //   546: astore_0       
            //   547: aload_0        
            //   548: ifnull          559
            //   551: aload_0        
            //   552: checkcast       Ljava/lang/String;
            //   555: astore_0       
            //   556: goto            578
            //   559: new             Ljava/lang/NullPointerException;
            //   562: astore_0       
            //   563: aload_0        
            //   564: ldc             "null cannot be cast to non-null type kotlin.String"
            //   566: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   569: aload_0        
            //   570: athrow         
            //   571: astore_0       
            //   572: aload_0        
            //   573: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
            //   576: aconst_null    
            //   577: astore_0       
            //   578: aload_0        
            //   579: ifnull          593
            //   582: new             Lcom/sendbird/android/n3;
            //   585: dup            
            //   586: aload_0        
            //   587: invokespecial   com/sendbird/android/n3.<init>:(Ljava/lang/String;)V
            //   590: astore_0       
            //   591: aload_0        
            //   592: areturn        
            //   593: aconst_null    
            //   594: areturn        
            //   595: astore_0       
            //   596: aload_0        
            //   597: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
            //   600: aconst_null    
            //   601: areturn        
            //   602: aload_0        
            //   603: instanceof      Lfc2/i;
            //   606: ifeq            1181
            //   609: aload_0        
            //   610: invokevirtual   fc2/g.p:()Lfc2/i;
            //   613: astore_0       
            //   614: aload_0        
            //   615: ldc             "text"
            //   617: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
            //   620: ifne            626
            //   623: goto            1166
            //   626: aload_0        
            //   627: ldc             "text"
            //   629: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //   632: astore_2       
            //   633: aload_2        
            //   634: instanceof      Lfc2/k;
            //   637: ifeq            1085
            //   640: aload_0        
            //   641: ldc             "text"
            //   643: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //   646: astore_2       
            //   647: aload_2        
            //   648: ldc             "this[key]"
            //   650: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
            //   653: ldc             Ljava/lang/String;.class
            //   655: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   658: astore_0       
            //   659: aload_0        
            //   660: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
            //   663: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   666: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   669: ifeq            686
            //   672: aload_2        
            //   673: invokevirtual   fc2/g.e:()B
            //   676: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
            //   679: checkcast       Ljava/lang/String;
            //   682: astore_0       
            //   683: goto            1168
            //   686: aload_0        
            //   687: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
            //   690: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   693: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   696: ifeq            713
            //   699: aload_2        
            //   700: invokevirtual   fc2/g.z:()S
            //   703: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
            //   706: checkcast       Ljava/lang/String;
            //   709: astore_0       
            //   710: goto            1168
            //   713: aload_0        
            //   714: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //   717: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   720: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   723: ifeq            740
            //   726: aload_2        
            //   727: invokevirtual   fc2/g.m:()I
            //   730: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   733: checkcast       Ljava/lang/String;
            //   736: astore_0       
            //   737: goto            1168
            //   740: aload_0        
            //   741: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
            //   744: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   747: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   750: ifeq            767
            //   753: aload_2        
            //   754: invokevirtual   fc2/g.x:()J
            //   757: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //   760: checkcast       Ljava/lang/String;
            //   763: astore_0       
            //   764: goto            1168
            //   767: aload_0        
            //   768: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
            //   771: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   774: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   777: ifeq            794
            //   780: aload_2        
            //   781: invokevirtual   fc2/g.l:()F
            //   784: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
            //   787: checkcast       Ljava/lang/String;
            //   790: astore_0       
            //   791: goto            1168
            //   794: aload_0        
            //   795: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
            //   798: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   801: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   804: ifeq            821
            //   807: aload_2        
            //   808: invokevirtual   fc2/g.k:()D
            //   811: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
            //   814: checkcast       Ljava/lang/String;
            //   817: astore_0       
            //   818: goto            1168
            //   821: aload_0        
            //   822: ldc             Ljava/math/BigDecimal;.class
            //   824: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   827: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   830: ifeq            862
            //   833: aload_2        
            //   834: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
            //   837: astore_0       
            //   838: aload_0        
            //   839: ifnull          850
            //   842: aload_0        
            //   843: checkcast       Ljava/lang/String;
            //   846: astore_0       
            //   847: goto            1168
            //   850: new             Ljava/lang/NullPointerException;
            //   853: astore_0       
            //   854: aload_0        
            //   855: ldc             "null cannot be cast to non-null type kotlin.String"
            //   857: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   860: aload_0        
            //   861: athrow         
            //   862: aload_0        
            //   863: ldc             Ljava/math/BigInteger;.class
            //   865: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   868: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   871: ifeq            903
            //   874: aload_2        
            //   875: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
            //   878: astore_0       
            //   879: aload_0        
            //   880: ifnull          891
            //   883: aload_0        
            //   884: checkcast       Ljava/lang/String;
            //   887: astore_0       
            //   888: goto            1168
            //   891: new             Ljava/lang/NullPointerException;
            //   894: astore_0       
            //   895: aload_0        
            //   896: ldc             "null cannot be cast to non-null type kotlin.String"
            //   898: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   901: aload_0        
            //   902: athrow         
            //   903: aload_0        
            //   904: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
            //   907: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   910: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   913: ifeq            930
            //   916: aload_2        
            //   917: invokevirtual   fc2/g.i:()C
            //   920: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
            //   923: checkcast       Ljava/lang/String;
            //   926: astore_0       
            //   927: goto            1168
            //   930: aload_0        
            //   931: ldc             Ljava/lang/String;.class
            //   933: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   936: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   939: ifeq            966
            //   942: aload_2        
            //   943: invokevirtual   fc2/g.C:()Ljava/lang/String;
            //   946: astore_0       
            //   947: aload_0        
            //   948: ifnull          954
            //   951: goto            1168
            //   954: new             Ljava/lang/NullPointerException;
            //   957: astore_0       
            //   958: aload_0        
            //   959: ldc             "null cannot be cast to non-null type kotlin.String"
            //   961: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   964: aload_0        
            //   965: athrow         
            //   966: aload_0        
            //   967: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //   970: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   973: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   976: ifeq            993
            //   979: aload_2        
            //   980: invokevirtual   fc2/g.d:()Z
            //   983: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //   986: checkcast       Ljava/lang/String;
            //   989: astore_0       
            //   990: goto            1168
            //   993: aload_0        
            //   994: ldc             Lfc2/i;.class
            //   996: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   999: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1002: ifeq            1016
            //  1005: aload_2        
            //  1006: invokevirtual   fc2/g.p:()Lfc2/i;
            //  1009: checkcast       Ljava/lang/String;
            //  1012: astore_0       
            //  1013: goto            1168
            //  1016: aload_0        
            //  1017: ldc             Lfc2/k;.class
            //  1019: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1022: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1025: ifeq            1039
            //  1028: aload_2        
            //  1029: invokevirtual   fc2/g.q:()Lfc2/k;
            //  1032: checkcast       Ljava/lang/String;
            //  1035: astore_0       
            //  1036: goto            1168
            //  1039: aload_0        
            //  1040: ldc             Lfc2/f;.class
            //  1042: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1045: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1048: ifeq            1062
            //  1051: aload_2        
            //  1052: invokevirtual   fc2/g.n:()Lfc2/f;
            //  1055: checkcast       Ljava/lang/String;
            //  1058: astore_0       
            //  1059: goto            1168
            //  1062: aload_0        
            //  1063: ldc             Lfc2/h;.class
            //  1065: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1068: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1071: ifeq            1166
            //  1074: aload_2        
            //  1075: invokevirtual   fc2/g.o:()Lfc2/h;
            //  1078: checkcast       Ljava/lang/String;
            //  1081: astore_0       
            //  1082: goto            1168
            //  1085: aload_2        
            //  1086: instanceof      Lfc2/i;
            //  1089: ifeq            1123
            //  1092: aload_0        
            //  1093: ldc             "text"
            //  1095: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1098: astore_0       
            //  1099: aload_0        
            //  1100: ifnull          1111
            //  1103: aload_0        
            //  1104: checkcast       Ljava/lang/String;
            //  1107: astore_0       
            //  1108: goto            1168
            //  1111: new             Ljava/lang/NullPointerException;
            //  1114: astore_0       
            //  1115: aload_0        
            //  1116: ldc             "null cannot be cast to non-null type kotlin.String"
            //  1118: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1121: aload_0        
            //  1122: athrow         
            //  1123: aload_2        
            //  1124: instanceof      Lfc2/f;
            //  1127: ifeq            1166
            //  1130: aload_0        
            //  1131: ldc             "text"
            //  1133: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1136: astore_0       
            //  1137: aload_0        
            //  1138: ifnull          1149
            //  1141: aload_0        
            //  1142: checkcast       Ljava/lang/String;
            //  1145: astore_0       
            //  1146: goto            1168
            //  1149: new             Ljava/lang/NullPointerException;
            //  1152: astore_0       
            //  1153: aload_0        
            //  1154: ldc             "null cannot be cast to non-null type kotlin.String"
            //  1156: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1159: aload_0        
            //  1160: athrow         
            //  1161: astore_0       
            //  1162: aload_0        
            //  1163: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
            //  1166: aconst_null    
            //  1167: astore_0       
            //  1168: aload_0        
            //  1169: ifnull          1181
            //  1172: new             Lcom/sendbird/android/n3;
            //  1175: dup            
            //  1176: aload_0        
            //  1177: invokespecial   com/sendbird/android/n3.<init>:(Ljava/lang/String;)V
            //  1180: areturn        
            //  1181: aconst_null    
            //  1182: areturn        
            //  1183: astore_0       
            //  1184: goto            576
            //  1187: astore_0       
            //  1188: goto            1166
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                                                             
            //  -----  -----  -----  -----  -----------------------------------------------------------------
            //  11     29     595    602    Lcom/sendbird/android/shadow/com/google/gson/JsonSyntaxException;
            //  36     63     571    576    Ljava/lang/Exception;
            //  63     93     1183   1187   Ljava/lang/Exception;
            //  96     120    1183   1187   Ljava/lang/Exception;
            //  123    147    1183   1187   Ljava/lang/Exception;
            //  150    174    1183   1187   Ljava/lang/Exception;
            //  177    201    1183   1187   Ljava/lang/Exception;
            //  204    228    1183   1187   Ljava/lang/Exception;
            //  231    248    1183   1187   Ljava/lang/Exception;
            //  252    257    1183   1187   Ljava/lang/Exception;
            //  260    272    1183   1187   Ljava/lang/Exception;
            //  272    289    1183   1187   Ljava/lang/Exception;
            //  293    298    1183   1187   Ljava/lang/Exception;
            //  301    313    1183   1187   Ljava/lang/Exception;
            //  313    337    1183   1187   Ljava/lang/Exception;
            //  340    357    1183   1187   Ljava/lang/Exception;
            //  364    376    1183   1187   Ljava/lang/Exception;
            //  376    400    1183   1187   Ljava/lang/Exception;
            //  403    423    1183   1187   Ljava/lang/Exception;
            //  426    446    1183   1187   Ljava/lang/Exception;
            //  449    469    1183   1187   Ljava/lang/Exception;
            //  472    492    1183   1187   Ljava/lang/Exception;
            //  495    509    571    576    Ljava/lang/Exception;
            //  513    518    571    576    Ljava/lang/Exception;
            //  521    533    571    576    Ljava/lang/Exception;
            //  533    547    571    576    Ljava/lang/Exception;
            //  551    556    571    576    Ljava/lang/Exception;
            //  559    571    571    576    Ljava/lang/Exception;
            //  572    576    595    602    Lcom/sendbird/android/shadow/com/google/gson/JsonSyntaxException;
            //  582    591    595    602    Lcom/sendbird/android/shadow/com/google/gson/JsonSyntaxException;
            //  626    653    1161   1166   Ljava/lang/Exception;
            //  653    683    1187   1191   Ljava/lang/Exception;
            //  686    710    1187   1191   Ljava/lang/Exception;
            //  713    737    1187   1191   Ljava/lang/Exception;
            //  740    764    1187   1191   Ljava/lang/Exception;
            //  767    791    1187   1191   Ljava/lang/Exception;
            //  794    818    1187   1191   Ljava/lang/Exception;
            //  821    838    1187   1191   Ljava/lang/Exception;
            //  842    847    1187   1191   Ljava/lang/Exception;
            //  850    862    1187   1191   Ljava/lang/Exception;
            //  862    879    1187   1191   Ljava/lang/Exception;
            //  883    888    1187   1191   Ljava/lang/Exception;
            //  891    903    1187   1191   Ljava/lang/Exception;
            //  903    927    1187   1191   Ljava/lang/Exception;
            //  930    947    1187   1191   Ljava/lang/Exception;
            //  954    966    1187   1191   Ljava/lang/Exception;
            //  966    990    1187   1191   Ljava/lang/Exception;
            //  993    1013   1187   1191   Ljava/lang/Exception;
            //  1016   1036   1187   1191   Ljava/lang/Exception;
            //  1039   1059   1187   1191   Ljava/lang/Exception;
            //  1062   1082   1187   1191   Ljava/lang/Exception;
            //  1085   1099   1161   1166   Ljava/lang/Exception;
            //  1103   1108   1161   1166   Ljava/lang/Exception;
            //  1111   1123   1161   1166   Ljava/lang/Exception;
            //  1123   1137   1161   1166   Ljava/lang/Exception;
            //  1141   1146   1161   1166   Ljava/lang/Exception;
            //  1149   1161   1161   1166   Ljava/lang/Exception;
            // 
            // The error that occurred was:
            // 
            // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
            //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:662)
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
}
