// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import fc2.i;
import java.util.ArrayList;
import java.util.List;

public final class q3
{
    public final List<a> a;
    
    public q3(final ArrayList a) {
        this.a = a;
    }
    
    public static final class a
    {
        public final long a;
        public final long b;
        
        public a(final long a, final long b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof q3.a) {
                    final q3.a a = (q3.a)o;
                    if (this.a == a.a && this.b == a.b) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final long a = this.a;
            final int n = (int)(a ^ a >>> 32);
            final long b = this.b;
            return n * 31 + (int)(b >>> 32 ^ b);
        }
        
        @Override
        public final String toString() {
            final StringBuilder r = a.r("UpdatedVoteCount(optionId=");
            r.append(this.a);
            r.append(", voteCount=");
            return d.m(r, this.b, ")");
        }
        
        public static final class a
        {
            public static q3.a a(final i p0) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: ifnonnull       11
                //     4: ldc             "jsonObject is null"
                //     6: invokestatic    ec2/a.e:(Ljava/lang/String;)V
                //     9: aconst_null    
                //    10: areturn        
                //    11: aload_0        
                //    12: ldc             "option_id"
                //    14: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
                //    17: ifne            23
                //    20: goto            565
                //    23: aload_0        
                //    24: ldc             "option_id"
                //    26: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
                //    29: astore_1       
                //    30: aload_1        
                //    31: instanceof      Lfc2/k;
                //    34: ifeq            484
                //    37: aload_0        
                //    38: ldc             "option_id"
                //    40: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
                //    43: astore_1       
                //    44: aload_1        
                //    45: ldc             "this[key]"
                //    47: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
                //    50: ldc             Ljava/lang/Long;.class
                //    52: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //    55: astore_2       
                //    56: aload_2        
                //    57: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
                //    60: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //    63: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //    66: ifeq            83
                //    69: aload_1        
                //    70: invokevirtual   fc2/g.e:()B
                //    73: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
                //    76: checkcast       Ljava/lang/Long;
                //    79: astore_1       
                //    80: goto            567
                //    83: aload_2        
                //    84: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
                //    87: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //    90: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //    93: ifeq            110
                //    96: aload_1        
                //    97: invokevirtual   fc2/g.z:()S
                //   100: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
                //   103: checkcast       Ljava/lang/Long;
                //   106: astore_1       
                //   107: goto            567
                //   110: aload_2        
                //   111: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
                //   114: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   117: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   120: ifeq            137
                //   123: aload_1        
                //   124: invokevirtual   fc2/g.m:()I
                //   127: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //   130: checkcast       Ljava/lang/Long;
                //   133: astore_1       
                //   134: goto            567
                //   137: aload_2        
                //   138: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
                //   141: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   144: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   147: ifeq            161
                //   150: aload_1        
                //   151: invokevirtual   fc2/g.x:()J
                //   154: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
                //   157: astore_1       
                //   158: goto            567
                //   161: aload_2        
                //   162: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
                //   165: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   168: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   171: ifeq            188
                //   174: aload_1        
                //   175: invokevirtual   fc2/g.l:()F
                //   178: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
                //   181: checkcast       Ljava/lang/Long;
                //   184: astore_1       
                //   185: goto            567
                //   188: aload_2        
                //   189: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
                //   192: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   195: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   198: ifeq            215
                //   201: aload_1        
                //   202: invokevirtual   fc2/g.k:()D
                //   205: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
                //   208: checkcast       Ljava/lang/Long;
                //   211: astore_1       
                //   212: goto            567
                //   215: aload_2        
                //   216: ldc             Ljava/math/BigDecimal;.class
                //   218: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   221: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   224: ifeq            256
                //   227: aload_1        
                //   228: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
                //   231: astore_1       
                //   232: aload_1        
                //   233: ifnull          244
                //   236: aload_1        
                //   237: checkcast       Ljava/lang/Long;
                //   240: astore_1       
                //   241: goto            567
                //   244: new             Ljava/lang/NullPointerException;
                //   247: astore_1       
                //   248: aload_1        
                //   249: ldc             "null cannot be cast to non-null type kotlin.Long"
                //   251: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //   254: aload_1        
                //   255: athrow         
                //   256: aload_2        
                //   257: ldc             Ljava/math/BigInteger;.class
                //   259: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   262: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   265: ifeq            297
                //   268: aload_1        
                //   269: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
                //   272: astore_1       
                //   273: aload_1        
                //   274: ifnull          285
                //   277: aload_1        
                //   278: checkcast       Ljava/lang/Long;
                //   281: astore_1       
                //   282: goto            567
                //   285: new             Ljava/lang/NullPointerException;
                //   288: astore_1       
                //   289: aload_1        
                //   290: ldc             "null cannot be cast to non-null type kotlin.Long"
                //   292: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //   295: aload_1        
                //   296: athrow         
                //   297: aload_2        
                //   298: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
                //   301: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   304: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   307: ifeq            324
                //   310: aload_1        
                //   311: invokevirtual   fc2/g.i:()C
                //   314: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
                //   317: checkcast       Ljava/lang/Long;
                //   320: astore_1       
                //   321: goto            567
                //   324: aload_2        
                //   325: ldc             Ljava/lang/String;.class
                //   327: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   330: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   333: ifeq            365
                //   336: aload_1        
                //   337: invokevirtual   fc2/g.C:()Ljava/lang/String;
                //   340: astore_1       
                //   341: aload_1        
                //   342: ifnull          353
                //   345: aload_1        
                //   346: checkcast       Ljava/lang/Long;
                //   349: astore_1       
                //   350: goto            567
                //   353: new             Ljava/lang/NullPointerException;
                //   356: astore_1       
                //   357: aload_1        
                //   358: ldc             "null cannot be cast to non-null type kotlin.Long"
                //   360: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //   363: aload_1        
                //   364: athrow         
                //   365: aload_2        
                //   366: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
                //   369: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   372: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   375: ifeq            392
                //   378: aload_1        
                //   379: invokevirtual   fc2/g.d:()Z
                //   382: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
                //   385: checkcast       Ljava/lang/Long;
                //   388: astore_1       
                //   389: goto            567
                //   392: aload_2        
                //   393: ldc             Lfc2/i;.class
                //   395: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   398: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   401: ifeq            415
                //   404: aload_1        
                //   405: invokevirtual   fc2/g.p:()Lfc2/i;
                //   408: checkcast       Ljava/lang/Long;
                //   411: astore_1       
                //   412: goto            567
                //   415: aload_2        
                //   416: ldc             Lfc2/k;.class
                //   418: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   421: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   424: ifeq            438
                //   427: aload_1        
                //   428: invokevirtual   fc2/g.q:()Lfc2/k;
                //   431: checkcast       Ljava/lang/Long;
                //   434: astore_1       
                //   435: goto            567
                //   438: aload_2        
                //   439: ldc             Lfc2/f;.class
                //   441: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   444: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   447: ifeq            461
                //   450: aload_1        
                //   451: invokevirtual   fc2/g.n:()Lfc2/f;
                //   454: checkcast       Ljava/lang/Long;
                //   457: astore_1       
                //   458: goto            567
                //   461: aload_2        
                //   462: ldc             Lfc2/h;.class
                //   464: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   467: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   470: ifeq            565
                //   473: aload_1        
                //   474: invokevirtual   fc2/g.o:()Lfc2/h;
                //   477: checkcast       Ljava/lang/Long;
                //   480: astore_1       
                //   481: goto            567
                //   484: aload_1        
                //   485: instanceof      Lfc2/i;
                //   488: ifeq            522
                //   491: aload_0        
                //   492: ldc             "option_id"
                //   494: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
                //   497: astore_1       
                //   498: aload_1        
                //   499: ifnull          510
                //   502: aload_1        
                //   503: checkcast       Ljava/lang/Long;
                //   506: astore_1       
                //   507: goto            567
                //   510: new             Ljava/lang/NullPointerException;
                //   513: astore_1       
                //   514: aload_1        
                //   515: ldc             "null cannot be cast to non-null type kotlin.Long"
                //   517: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //   520: aload_1        
                //   521: athrow         
                //   522: aload_1        
                //   523: instanceof      Lfc2/f;
                //   526: ifeq            565
                //   529: aload_0        
                //   530: ldc             "option_id"
                //   532: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
                //   535: astore_1       
                //   536: aload_1        
                //   537: ifnull          548
                //   540: aload_1        
                //   541: checkcast       Ljava/lang/Long;
                //   544: astore_1       
                //   545: goto            567
                //   548: new             Ljava/lang/NullPointerException;
                //   551: astore_1       
                //   552: aload_1        
                //   553: ldc             "null cannot be cast to non-null type kotlin.Long"
                //   555: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //   558: aload_1        
                //   559: athrow         
                //   560: astore_1       
                //   561: aload_1        
                //   562: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
                //   565: aconst_null    
                //   566: astore_1       
                //   567: aload_1        
                //   568: ifnonnull       601
                //   571: new             Ljava/lang/StringBuilder;
                //   574: dup            
                //   575: invokespecial   java/lang/StringBuilder.<init>:()V
                //   578: astore_1       
                //   579: aload_1        
                //   580: ldc             "optionId is null. jsonObject="
                //   582: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   585: pop            
                //   586: aload_1        
                //   587: aload_0        
                //   588: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   591: pop            
                //   592: aload_1        
                //   593: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   596: invokestatic    ec2/a.e:(Ljava/lang/String;)V
                //   599: aconst_null    
                //   600: areturn        
                //   601: aload_0        
                //   602: ldc             "vote_count"
                //   604: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
                //   607: ifne            613
                //   610: goto            1155
                //   613: aload_0        
                //   614: ldc             "vote_count"
                //   616: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
                //   619: astore_2       
                //   620: aload_2        
                //   621: instanceof      Lfc2/k;
                //   624: ifeq            1074
                //   627: aload_0        
                //   628: ldc             "vote_count"
                //   630: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
                //   633: astore_2       
                //   634: aload_2        
                //   635: ldc             "this[key]"
                //   637: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
                //   640: ldc             Ljava/lang/Long;.class
                //   642: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   645: astore_3       
                //   646: aload_3        
                //   647: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
                //   650: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   653: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   656: ifeq            673
                //   659: aload_2        
                //   660: invokevirtual   fc2/g.e:()B
                //   663: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
                //   666: checkcast       Ljava/lang/Long;
                //   669: astore_2       
                //   670: goto            1157
                //   673: aload_3        
                //   674: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
                //   677: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   680: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   683: ifeq            700
                //   686: aload_2        
                //   687: invokevirtual   fc2/g.z:()S
                //   690: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
                //   693: checkcast       Ljava/lang/Long;
                //   696: astore_2       
                //   697: goto            1157
                //   700: aload_3        
                //   701: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
                //   704: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   707: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   710: ifeq            727
                //   713: aload_2        
                //   714: invokevirtual   fc2/g.m:()I
                //   717: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //   720: checkcast       Ljava/lang/Long;
                //   723: astore_2       
                //   724: goto            1157
                //   727: aload_3        
                //   728: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
                //   731: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   734: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   737: ifeq            751
                //   740: aload_2        
                //   741: invokevirtual   fc2/g.x:()J
                //   744: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
                //   747: astore_2       
                //   748: goto            1157
                //   751: aload_3        
                //   752: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
                //   755: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   758: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   761: ifeq            778
                //   764: aload_2        
                //   765: invokevirtual   fc2/g.l:()F
                //   768: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
                //   771: checkcast       Ljava/lang/Long;
                //   774: astore_2       
                //   775: goto            1157
                //   778: aload_3        
                //   779: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
                //   782: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   785: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   788: ifeq            805
                //   791: aload_2        
                //   792: invokevirtual   fc2/g.k:()D
                //   795: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
                //   798: checkcast       Ljava/lang/Long;
                //   801: astore_2       
                //   802: goto            1157
                //   805: aload_3        
                //   806: ldc             Ljava/math/BigDecimal;.class
                //   808: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   811: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   814: ifeq            846
                //   817: aload_2        
                //   818: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
                //   821: astore_2       
                //   822: aload_2        
                //   823: ifnull          834
                //   826: aload_2        
                //   827: checkcast       Ljava/lang/Long;
                //   830: astore_2       
                //   831: goto            1157
                //   834: new             Ljava/lang/NullPointerException;
                //   837: astore_2       
                //   838: aload_2        
                //   839: ldc             "null cannot be cast to non-null type kotlin.Long"
                //   841: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //   844: aload_2        
                //   845: athrow         
                //   846: aload_3        
                //   847: ldc             Ljava/math/BigInteger;.class
                //   849: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   852: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   855: ifeq            887
                //   858: aload_2        
                //   859: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
                //   862: astore_2       
                //   863: aload_2        
                //   864: ifnull          875
                //   867: aload_2        
                //   868: checkcast       Ljava/lang/Long;
                //   871: astore_2       
                //   872: goto            1157
                //   875: new             Ljava/lang/NullPointerException;
                //   878: astore_2       
                //   879: aload_2        
                //   880: ldc             "null cannot be cast to non-null type kotlin.Long"
                //   882: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //   885: aload_2        
                //   886: athrow         
                //   887: aload_3        
                //   888: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
                //   891: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   894: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   897: ifeq            914
                //   900: aload_2        
                //   901: invokevirtual   fc2/g.i:()C
                //   904: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
                //   907: checkcast       Ljava/lang/Long;
                //   910: astore_2       
                //   911: goto            1157
                //   914: aload_3        
                //   915: ldc             Ljava/lang/String;.class
                //   917: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   920: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   923: ifeq            955
                //   926: aload_2        
                //   927: invokevirtual   fc2/g.C:()Ljava/lang/String;
                //   930: astore_2       
                //   931: aload_2        
                //   932: ifnull          943
                //   935: aload_2        
                //   936: checkcast       Ljava/lang/Long;
                //   939: astore_2       
                //   940: goto            1157
                //   943: new             Ljava/lang/NullPointerException;
                //   946: astore_2       
                //   947: aload_2        
                //   948: ldc             "null cannot be cast to non-null type kotlin.Long"
                //   950: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //   953: aload_2        
                //   954: athrow         
                //   955: aload_3        
                //   956: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
                //   959: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   962: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   965: ifeq            982
                //   968: aload_2        
                //   969: invokevirtual   fc2/g.d:()Z
                //   972: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
                //   975: checkcast       Ljava/lang/Long;
                //   978: astore_2       
                //   979: goto            1157
                //   982: aload_3        
                //   983: ldc             Lfc2/i;.class
                //   985: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //   988: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //   991: ifeq            1005
                //   994: aload_2        
                //   995: invokevirtual   fc2/g.p:()Lfc2/i;
                //   998: checkcast       Ljava/lang/Long;
                //  1001: astore_2       
                //  1002: goto            1157
                //  1005: aload_3        
                //  1006: ldc             Lfc2/k;.class
                //  1008: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //  1011: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //  1014: ifeq            1028
                //  1017: aload_2        
                //  1018: invokevirtual   fc2/g.q:()Lfc2/k;
                //  1021: checkcast       Ljava/lang/Long;
                //  1024: astore_2       
                //  1025: goto            1157
                //  1028: aload_3        
                //  1029: ldc             Lfc2/f;.class
                //  1031: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //  1034: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //  1037: ifeq            1051
                //  1040: aload_2        
                //  1041: invokevirtual   fc2/g.n:()Lfc2/f;
                //  1044: checkcast       Ljava/lang/Long;
                //  1047: astore_2       
                //  1048: goto            1157
                //  1051: aload_3        
                //  1052: ldc             Lfc2/h;.class
                //  1054: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
                //  1057: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
                //  1060: ifeq            1155
                //  1063: aload_2        
                //  1064: invokevirtual   fc2/g.o:()Lfc2/h;
                //  1067: checkcast       Ljava/lang/Long;
                //  1070: astore_2       
                //  1071: goto            1157
                //  1074: aload_2        
                //  1075: instanceof      Lfc2/i;
                //  1078: ifeq            1112
                //  1081: aload_0        
                //  1082: ldc             "vote_count"
                //  1084: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
                //  1087: astore_2       
                //  1088: aload_2        
                //  1089: ifnull          1100
                //  1092: aload_2        
                //  1093: checkcast       Ljava/lang/Long;
                //  1096: astore_2       
                //  1097: goto            1157
                //  1100: new             Ljava/lang/NullPointerException;
                //  1103: astore_2       
                //  1104: aload_2        
                //  1105: ldc             "null cannot be cast to non-null type kotlin.Long"
                //  1107: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //  1110: aload_2        
                //  1111: athrow         
                //  1112: aload_2        
                //  1113: instanceof      Lfc2/f;
                //  1116: ifeq            1155
                //  1119: aload_0        
                //  1120: ldc             "vote_count"
                //  1122: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
                //  1125: astore_2       
                //  1126: aload_2        
                //  1127: ifnull          1138
                //  1130: aload_2        
                //  1131: checkcast       Ljava/lang/Long;
                //  1134: astore_2       
                //  1135: goto            1157
                //  1138: new             Ljava/lang/NullPointerException;
                //  1141: astore_2       
                //  1142: aload_2        
                //  1143: ldc             "null cannot be cast to non-null type kotlin.Long"
                //  1145: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
                //  1148: aload_2        
                //  1149: athrow         
                //  1150: astore_2       
                //  1151: aload_2        
                //  1152: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
                //  1155: aconst_null    
                //  1156: astore_2       
                //  1157: aload_2        
                //  1158: ifnonnull       1191
                //  1161: new             Ljava/lang/StringBuilder;
                //  1164: dup            
                //  1165: invokespecial   java/lang/StringBuilder.<init>:()V
                //  1168: astore_1       
                //  1169: aload_1        
                //  1170: ldc             "voteCount is null. jsonObject="
                //  1172: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //  1175: pop            
                //  1176: aload_1        
                //  1177: aload_0        
                //  1178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //  1181: pop            
                //  1182: aload_1        
                //  1183: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //  1186: invokestatic    ec2/a.e:(Ljava/lang/String;)V
                //  1189: aconst_null    
                //  1190: areturn        
                //  1191: new             Lcom/sendbird/android/q3$a;
                //  1194: dup            
                //  1195: aload_1        
                //  1196: invokevirtual   java/lang/Long.longValue:()J
                //  1199: aload_2        
                //  1200: invokevirtual   java/lang/Long.longValue:()J
                //  1203: invokespecial   com/sendbird/android/q3$a.<init>:(JJ)V
                //  1206: areturn        
                //  1207: astore_1       
                //  1208: goto            565
                //  1211: astore_2       
                //  1212: goto            1155
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                 
                //  -----  -----  -----  -----  ---------------------
                //  23     50     560    565    Ljava/lang/Exception;
                //  50     80     1207   1211   Ljava/lang/Exception;
                //  83     107    1207   1211   Ljava/lang/Exception;
                //  110    134    1207   1211   Ljava/lang/Exception;
                //  137    158    1207   1211   Ljava/lang/Exception;
                //  161    185    1207   1211   Ljava/lang/Exception;
                //  188    212    1207   1211   Ljava/lang/Exception;
                //  215    232    1207   1211   Ljava/lang/Exception;
                //  236    241    1207   1211   Ljava/lang/Exception;
                //  244    256    1207   1211   Ljava/lang/Exception;
                //  256    273    1207   1211   Ljava/lang/Exception;
                //  277    282    1207   1211   Ljava/lang/Exception;
                //  285    297    1207   1211   Ljava/lang/Exception;
                //  297    321    1207   1211   Ljava/lang/Exception;
                //  324    341    1207   1211   Ljava/lang/Exception;
                //  345    350    1207   1211   Ljava/lang/Exception;
                //  353    365    1207   1211   Ljava/lang/Exception;
                //  365    389    1207   1211   Ljava/lang/Exception;
                //  392    412    1207   1211   Ljava/lang/Exception;
                //  415    435    1207   1211   Ljava/lang/Exception;
                //  438    458    1207   1211   Ljava/lang/Exception;
                //  461    481    1207   1211   Ljava/lang/Exception;
                //  484    498    560    565    Ljava/lang/Exception;
                //  502    507    560    565    Ljava/lang/Exception;
                //  510    522    560    565    Ljava/lang/Exception;
                //  522    536    560    565    Ljava/lang/Exception;
                //  540    545    560    565    Ljava/lang/Exception;
                //  548    560    560    565    Ljava/lang/Exception;
                //  613    640    1150   1155   Ljava/lang/Exception;
                //  640    670    1211   1215   Ljava/lang/Exception;
                //  673    697    1211   1215   Ljava/lang/Exception;
                //  700    724    1211   1215   Ljava/lang/Exception;
                //  727    748    1211   1215   Ljava/lang/Exception;
                //  751    775    1211   1215   Ljava/lang/Exception;
                //  778    802    1211   1215   Ljava/lang/Exception;
                //  805    822    1211   1215   Ljava/lang/Exception;
                //  826    831    1211   1215   Ljava/lang/Exception;
                //  834    846    1211   1215   Ljava/lang/Exception;
                //  846    863    1211   1215   Ljava/lang/Exception;
                //  867    872    1211   1215   Ljava/lang/Exception;
                //  875    887    1211   1215   Ljava/lang/Exception;
                //  887    911    1211   1215   Ljava/lang/Exception;
                //  914    931    1211   1215   Ljava/lang/Exception;
                //  935    940    1211   1215   Ljava/lang/Exception;
                //  943    955    1211   1215   Ljava/lang/Exception;
                //  955    979    1211   1215   Ljava/lang/Exception;
                //  982    1002   1211   1215   Ljava/lang/Exception;
                //  1005   1025   1211   1215   Ljava/lang/Exception;
                //  1028   1048   1211   1215   Ljava/lang/Exception;
                //  1051   1071   1211   1215   Ljava/lang/Exception;
                //  1074   1088   1150   1155   Ljava/lang/Exception;
                //  1092   1097   1150   1155   Ljava/lang/Exception;
                //  1100   1112   1150   1155   Ljava/lang/Exception;
                //  1112   1126   1150   1155   Ljava/lang/Exception;
                //  1130   1135   1150   1155   Ljava/lang/Exception;
                //  1138   1150   1150   1155   Ljava/lang/Exception;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0083:
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
}
