// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import sg2.e;
import fc2.i;

public final class u3
{
    public final String a;
    public final long b;
    public final RestrictionType c;
    
    public u3(final String a, final long b, final RestrictionType c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final void a(final i i) {
        i.K("description", this.a);
        i.J("end_at", this.b);
        i.K("restriction_type", this.c.getValue());
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof u3) {
                final u3 u3 = (u3)o;
                if (e.a((Object)this.a, (Object)u3.a) && this.b == u3.b && e.a((Object)this.c, (Object)u3.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final long b = this.b;
        final int n = (int)(b ^ b >>> 32);
        final RestrictionType c = this.c;
        if (c != null) {
            hashCode = c.hashCode();
        }
        return (hashCode2 * 31 + n) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("RestrictionInfo(description=");
        r.append(this.a);
        r.append(", endAt=");
        r.append(this.b);
        r.append(", restrictionType=");
        r.append(this.c);
        r.append(")");
        return r.toString();
    }
    
    public static final class a
    {
        public static u3 a(final i p0, final RestrictionType p1) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "restrictionType"
            //     3: invokestatic    sg2/e.f:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_0        
            //     7: ldc             "muted_description"
            //     9: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
            //    12: ifne            18
            //    15: goto            558
            //    18: aload_0        
            //    19: ldc             "muted_description"
            //    21: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //    24: astore_2       
            //    25: aload_2        
            //    26: instanceof      Lfc2/k;
            //    29: ifeq            477
            //    32: aload_0        
            //    33: ldc             "muted_description"
            //    35: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //    38: astore_2       
            //    39: aload_2        
            //    40: ldc             "this[key]"
            //    42: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
            //    45: ldc             Ljava/lang/String;.class
            //    47: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //    50: astore_3       
            //    51: aload_3        
            //    52: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
            //    55: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //    58: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    61: ifeq            78
            //    64: aload_2        
            //    65: invokevirtual   fc2/g.e:()B
            //    68: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
            //    71: checkcast       Ljava/lang/String;
            //    74: astore_2       
            //    75: goto            560
            //    78: aload_3        
            //    79: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
            //    82: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //    85: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //    88: ifeq            105
            //    91: aload_2        
            //    92: invokevirtual   fc2/g.z:()S
            //    95: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
            //    98: checkcast       Ljava/lang/String;
            //   101: astore_2       
            //   102: goto            560
            //   105: aload_3        
            //   106: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //   109: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   112: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   115: ifeq            132
            //   118: aload_2        
            //   119: invokevirtual   fc2/g.m:()I
            //   122: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   125: checkcast       Ljava/lang/String;
            //   128: astore_2       
            //   129: goto            560
            //   132: aload_3        
            //   133: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
            //   136: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   139: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   142: ifeq            159
            //   145: aload_2        
            //   146: invokevirtual   fc2/g.x:()J
            //   149: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //   152: checkcast       Ljava/lang/String;
            //   155: astore_2       
            //   156: goto            560
            //   159: aload_3        
            //   160: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
            //   163: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   166: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   169: ifeq            186
            //   172: aload_2        
            //   173: invokevirtual   fc2/g.l:()F
            //   176: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
            //   179: checkcast       Ljava/lang/String;
            //   182: astore_2       
            //   183: goto            560
            //   186: aload_3        
            //   187: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
            //   190: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   193: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   196: ifeq            213
            //   199: aload_2        
            //   200: invokevirtual   fc2/g.k:()D
            //   203: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
            //   206: checkcast       Ljava/lang/String;
            //   209: astore_2       
            //   210: goto            560
            //   213: aload_3        
            //   214: ldc             Ljava/math/BigDecimal;.class
            //   216: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   219: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   222: ifeq            254
            //   225: aload_2        
            //   226: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
            //   229: astore_2       
            //   230: aload_2        
            //   231: ifnull          242
            //   234: aload_2        
            //   235: checkcast       Ljava/lang/String;
            //   238: astore_2       
            //   239: goto            560
            //   242: new             Ljava/lang/NullPointerException;
            //   245: astore_2       
            //   246: aload_2        
            //   247: ldc             "null cannot be cast to non-null type kotlin.String"
            //   249: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   252: aload_2        
            //   253: athrow         
            //   254: aload_3        
            //   255: ldc             Ljava/math/BigInteger;.class
            //   257: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   260: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   263: ifeq            295
            //   266: aload_2        
            //   267: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
            //   270: astore_2       
            //   271: aload_2        
            //   272: ifnull          283
            //   275: aload_2        
            //   276: checkcast       Ljava/lang/String;
            //   279: astore_2       
            //   280: goto            560
            //   283: new             Ljava/lang/NullPointerException;
            //   286: astore_2       
            //   287: aload_2        
            //   288: ldc             "null cannot be cast to non-null type kotlin.String"
            //   290: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   293: aload_2        
            //   294: athrow         
            //   295: aload_3        
            //   296: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
            //   299: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   302: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   305: ifeq            322
            //   308: aload_2        
            //   309: invokevirtual   fc2/g.i:()C
            //   312: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
            //   315: checkcast       Ljava/lang/String;
            //   318: astore_2       
            //   319: goto            560
            //   322: aload_3        
            //   323: ldc             Ljava/lang/String;.class
            //   325: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   328: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   331: ifeq            358
            //   334: aload_2        
            //   335: invokevirtual   fc2/g.C:()Ljava/lang/String;
            //   338: astore_2       
            //   339: aload_2        
            //   340: ifnull          346
            //   343: goto            560
            //   346: new             Ljava/lang/NullPointerException;
            //   349: astore_2       
            //   350: aload_2        
            //   351: ldc             "null cannot be cast to non-null type kotlin.String"
            //   353: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   356: aload_2        
            //   357: athrow         
            //   358: aload_3        
            //   359: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //   362: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   365: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   368: ifeq            385
            //   371: aload_2        
            //   372: invokevirtual   fc2/g.d:()Z
            //   375: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //   378: checkcast       Ljava/lang/String;
            //   381: astore_2       
            //   382: goto            560
            //   385: aload_3        
            //   386: ldc             Lfc2/i;.class
            //   388: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   391: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   394: ifeq            408
            //   397: aload_2        
            //   398: invokevirtual   fc2/g.p:()Lfc2/i;
            //   401: checkcast       Ljava/lang/String;
            //   404: astore_2       
            //   405: goto            560
            //   408: aload_3        
            //   409: ldc             Lfc2/k;.class
            //   411: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   414: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   417: ifeq            431
            //   420: aload_2        
            //   421: invokevirtual   fc2/g.q:()Lfc2/k;
            //   424: checkcast       Ljava/lang/String;
            //   427: astore_2       
            //   428: goto            560
            //   431: aload_3        
            //   432: ldc             Lfc2/f;.class
            //   434: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   437: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   440: ifeq            454
            //   443: aload_2        
            //   444: invokevirtual   fc2/g.n:()Lfc2/f;
            //   447: checkcast       Ljava/lang/String;
            //   450: astore_2       
            //   451: goto            560
            //   454: aload_3        
            //   455: ldc             Lfc2/h;.class
            //   457: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   460: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   463: ifeq            558
            //   466: aload_2        
            //   467: invokevirtual   fc2/g.o:()Lfc2/h;
            //   470: checkcast       Ljava/lang/String;
            //   473: astore_2       
            //   474: goto            560
            //   477: aload_2        
            //   478: instanceof      Lfc2/i;
            //   481: ifeq            515
            //   484: aload_0        
            //   485: ldc             "muted_description"
            //   487: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //   490: astore_2       
            //   491: aload_2        
            //   492: ifnull          503
            //   495: aload_2        
            //   496: checkcast       Ljava/lang/String;
            //   499: astore_2       
            //   500: goto            560
            //   503: new             Ljava/lang/NullPointerException;
            //   506: astore_2       
            //   507: aload_2        
            //   508: ldc             "null cannot be cast to non-null type kotlin.String"
            //   510: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   513: aload_2        
            //   514: athrow         
            //   515: aload_2        
            //   516: instanceof      Lfc2/f;
            //   519: ifeq            558
            //   522: aload_0        
            //   523: ldc             "muted_description"
            //   525: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //   528: astore_2       
            //   529: aload_2        
            //   530: ifnull          541
            //   533: aload_2        
            //   534: checkcast       Ljava/lang/String;
            //   537: astore_2       
            //   538: goto            560
            //   541: new             Ljava/lang/NullPointerException;
            //   544: astore_2       
            //   545: aload_2        
            //   546: ldc             "null cannot be cast to non-null type kotlin.String"
            //   548: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   551: aload_2        
            //   552: athrow         
            //   553: astore_2       
            //   554: aload_2        
            //   555: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
            //   558: aconst_null    
            //   559: astore_2       
            //   560: ldc             ""
            //   562: astore          4
            //   564: aload_2        
            //   565: ifnull          573
            //   568: aload_2        
            //   569: astore_3       
            //   570: goto            576
            //   573: ldc             ""
            //   575: astore_3       
            //   576: aload_0        
            //   577: ldc             "description"
            //   579: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
            //   582: ifne            588
            //   585: goto            1145
            //   588: aload_0        
            //   589: ldc             "description"
            //   591: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //   594: astore_2       
            //   595: aload_2        
            //   596: instanceof      Lfc2/k;
            //   599: ifeq            1064
            //   602: aload_0        
            //   603: ldc             "description"
            //   605: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //   608: astore          5
            //   610: aload           5
            //   612: ldc             "this[key]"
            //   614: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
            //   617: ldc             Ljava/lang/String;.class
            //   619: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   622: astore_2       
            //   623: aload_2        
            //   624: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
            //   627: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   630: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   633: ifeq            651
            //   636: aload           5
            //   638: invokevirtual   fc2/g.e:()B
            //   641: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
            //   644: checkcast       Ljava/lang/String;
            //   647: astore_2       
            //   648: goto            1147
            //   651: aload_2        
            //   652: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
            //   655: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   658: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   661: ifeq            679
            //   664: aload           5
            //   666: invokevirtual   fc2/g.z:()S
            //   669: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
            //   672: checkcast       Ljava/lang/String;
            //   675: astore_2       
            //   676: goto            1147
            //   679: aload_2        
            //   680: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //   683: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   686: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   689: ifeq            707
            //   692: aload           5
            //   694: invokevirtual   fc2/g.m:()I
            //   697: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //   700: checkcast       Ljava/lang/String;
            //   703: astore_2       
            //   704: goto            1147
            //   707: aload_2        
            //   708: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
            //   711: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   714: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   717: ifeq            735
            //   720: aload           5
            //   722: invokevirtual   fc2/g.x:()J
            //   725: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //   728: checkcast       Ljava/lang/String;
            //   731: astore_2       
            //   732: goto            1147
            //   735: aload_2        
            //   736: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
            //   739: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   742: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   745: ifeq            763
            //   748: aload           5
            //   750: invokevirtual   fc2/g.l:()F
            //   753: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
            //   756: checkcast       Ljava/lang/String;
            //   759: astore_2       
            //   760: goto            1147
            //   763: aload_2        
            //   764: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
            //   767: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   770: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   773: ifeq            791
            //   776: aload           5
            //   778: invokevirtual   fc2/g.k:()D
            //   781: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
            //   784: checkcast       Ljava/lang/String;
            //   787: astore_2       
            //   788: goto            1147
            //   791: aload_2        
            //   792: ldc             Ljava/math/BigDecimal;.class
            //   794: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   797: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   800: ifeq            833
            //   803: aload           5
            //   805: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
            //   808: astore_2       
            //   809: aload_2        
            //   810: ifnull          821
            //   813: aload_2        
            //   814: checkcast       Ljava/lang/String;
            //   817: astore_2       
            //   818: goto            1147
            //   821: new             Ljava/lang/NullPointerException;
            //   824: astore_2       
            //   825: aload_2        
            //   826: ldc             "null cannot be cast to non-null type kotlin.String"
            //   828: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   831: aload_2        
            //   832: athrow         
            //   833: aload_2        
            //   834: ldc             Ljava/math/BigInteger;.class
            //   836: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   839: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   842: ifeq            875
            //   845: aload           5
            //   847: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
            //   850: astore_2       
            //   851: aload_2        
            //   852: ifnull          863
            //   855: aload_2        
            //   856: checkcast       Ljava/lang/String;
            //   859: astore_2       
            //   860: goto            1147
            //   863: new             Ljava/lang/NullPointerException;
            //   866: astore_2       
            //   867: aload_2        
            //   868: ldc             "null cannot be cast to non-null type kotlin.String"
            //   870: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   873: aload_2        
            //   874: athrow         
            //   875: aload_2        
            //   876: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
            //   879: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   882: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   885: ifeq            903
            //   888: aload           5
            //   890: invokevirtual   fc2/g.i:()C
            //   893: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
            //   896: checkcast       Ljava/lang/String;
            //   899: astore_2       
            //   900: goto            1147
            //   903: aload_2        
            //   904: ldc             Ljava/lang/String;.class
            //   906: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   909: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   912: ifeq            940
            //   915: aload           5
            //   917: invokevirtual   fc2/g.C:()Ljava/lang/String;
            //   920: astore_2       
            //   921: aload_2        
            //   922: ifnull          928
            //   925: goto            1147
            //   928: new             Ljava/lang/NullPointerException;
            //   931: astore_2       
            //   932: aload_2        
            //   933: ldc             "null cannot be cast to non-null type kotlin.String"
            //   935: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //   938: aload_2        
            //   939: athrow         
            //   940: aload_2        
            //   941: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //   944: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   947: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   950: ifeq            968
            //   953: aload           5
            //   955: invokevirtual   fc2/g.d:()Z
            //   958: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //   961: checkcast       Ljava/lang/String;
            //   964: astore_2       
            //   965: goto            1147
            //   968: aload_2        
            //   969: ldc             Lfc2/i;.class
            //   971: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   974: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //   977: ifeq            992
            //   980: aload           5
            //   982: invokevirtual   fc2/g.p:()Lfc2/i;
            //   985: checkcast       Ljava/lang/String;
            //   988: astore_2       
            //   989: goto            1147
            //   992: aload_2        
            //   993: ldc             Lfc2/k;.class
            //   995: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //   998: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1001: ifeq            1016
            //  1004: aload           5
            //  1006: invokevirtual   fc2/g.q:()Lfc2/k;
            //  1009: checkcast       Ljava/lang/String;
            //  1012: astore_2       
            //  1013: goto            1147
            //  1016: aload_2        
            //  1017: ldc             Lfc2/f;.class
            //  1019: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1022: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1025: ifeq            1040
            //  1028: aload           5
            //  1030: invokevirtual   fc2/g.n:()Lfc2/f;
            //  1033: checkcast       Ljava/lang/String;
            //  1036: astore_2       
            //  1037: goto            1147
            //  1040: aload_2        
            //  1041: ldc             Lfc2/h;.class
            //  1043: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1046: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1049: ifeq            1145
            //  1052: aload           5
            //  1054: invokevirtual   fc2/g.o:()Lfc2/h;
            //  1057: checkcast       Ljava/lang/String;
            //  1060: astore_2       
            //  1061: goto            1147
            //  1064: aload_2        
            //  1065: instanceof      Lfc2/i;
            //  1068: ifeq            1102
            //  1071: aload_0        
            //  1072: ldc             "description"
            //  1074: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1077: astore_2       
            //  1078: aload_2        
            //  1079: ifnull          1090
            //  1082: aload_2        
            //  1083: checkcast       Ljava/lang/String;
            //  1086: astore_2       
            //  1087: goto            1147
            //  1090: new             Ljava/lang/NullPointerException;
            //  1093: astore_2       
            //  1094: aload_2        
            //  1095: ldc             "null cannot be cast to non-null type kotlin.String"
            //  1097: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1100: aload_2        
            //  1101: athrow         
            //  1102: aload_2        
            //  1103: instanceof      Lfc2/f;
            //  1106: ifeq            1145
            //  1109: aload_0        
            //  1110: ldc             "description"
            //  1112: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1115: astore_2       
            //  1116: aload_2        
            //  1117: ifnull          1128
            //  1120: aload_2        
            //  1121: checkcast       Ljava/lang/String;
            //  1124: astore_2       
            //  1125: goto            1147
            //  1128: new             Ljava/lang/NullPointerException;
            //  1131: astore_2       
            //  1132: aload_2        
            //  1133: ldc             "null cannot be cast to non-null type kotlin.String"
            //  1135: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1138: aload_2        
            //  1139: athrow         
            //  1140: astore_2       
            //  1141: aload_2        
            //  1142: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
            //  1145: aconst_null    
            //  1146: astore_2       
            //  1147: aload_3        
            //  1148: astore          5
            //  1150: aload_2        
            //  1151: ifnull          1157
            //  1154: aload_2        
            //  1155: astore          5
            //  1157: ldc2_w          -1
            //  1160: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //  1163: astore_3       
            //  1164: aload_0        
            //  1165: ldc             "muted_end_at"
            //  1167: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
            //  1170: ifne            1176
            //  1173: goto            1734
            //  1176: aload_0        
            //  1177: ldc             "muted_end_at"
            //  1179: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1182: astore_2       
            //  1183: aload_2        
            //  1184: instanceof      Lfc2/k;
            //  1187: ifeq            1653
            //  1190: aload_0        
            //  1191: ldc             "muted_end_at"
            //  1193: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1196: astore_2       
            //  1197: aload_2        
            //  1198: ldc             "this[key]"
            //  1200: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
            //  1203: ldc             Ljava/lang/Long;.class
            //  1205: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1208: astore          6
            //  1210: aload           6
            //  1212: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
            //  1215: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1218: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1221: ifeq            1238
            //  1224: aload_2        
            //  1225: invokevirtual   fc2/g.e:()B
            //  1228: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
            //  1231: checkcast       Ljava/lang/Long;
            //  1234: astore_2       
            //  1235: goto            1736
            //  1238: aload           6
            //  1240: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
            //  1243: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1246: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1249: ifeq            1266
            //  1252: aload_2        
            //  1253: invokevirtual   fc2/g.z:()S
            //  1256: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
            //  1259: checkcast       Ljava/lang/Long;
            //  1262: astore_2       
            //  1263: goto            1736
            //  1266: aload           6
            //  1268: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //  1271: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1274: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1277: ifeq            1294
            //  1280: aload_2        
            //  1281: invokevirtual   fc2/g.m:()I
            //  1284: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1287: checkcast       Ljava/lang/Long;
            //  1290: astore_2       
            //  1291: goto            1736
            //  1294: aload           6
            //  1296: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
            //  1299: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1302: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1305: ifeq            1319
            //  1308: aload_2        
            //  1309: invokevirtual   fc2/g.x:()J
            //  1312: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //  1315: astore_2       
            //  1316: goto            1736
            //  1319: aload           6
            //  1321: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
            //  1324: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1327: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1330: ifeq            1347
            //  1333: aload_2        
            //  1334: invokevirtual   fc2/g.l:()F
            //  1337: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
            //  1340: checkcast       Ljava/lang/Long;
            //  1343: astore_2       
            //  1344: goto            1736
            //  1347: aload           6
            //  1349: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
            //  1352: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1355: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1358: ifeq            1375
            //  1361: aload_2        
            //  1362: invokevirtual   fc2/g.k:()D
            //  1365: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
            //  1368: checkcast       Ljava/lang/Long;
            //  1371: astore_2       
            //  1372: goto            1736
            //  1375: aload           6
            //  1377: ldc             Ljava/math/BigDecimal;.class
            //  1379: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1382: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1385: ifeq            1417
            //  1388: aload_2        
            //  1389: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
            //  1392: astore_2       
            //  1393: aload_2        
            //  1394: ifnull          1405
            //  1397: aload_2        
            //  1398: checkcast       Ljava/lang/Long;
            //  1401: astore_2       
            //  1402: goto            1736
            //  1405: new             Ljava/lang/NullPointerException;
            //  1408: astore_2       
            //  1409: aload_2        
            //  1410: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  1412: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1415: aload_2        
            //  1416: athrow         
            //  1417: aload           6
            //  1419: ldc             Ljava/math/BigInteger;.class
            //  1421: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1424: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1427: ifeq            1459
            //  1430: aload_2        
            //  1431: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
            //  1434: astore_2       
            //  1435: aload_2        
            //  1436: ifnull          1447
            //  1439: aload_2        
            //  1440: checkcast       Ljava/lang/Long;
            //  1443: astore_2       
            //  1444: goto            1736
            //  1447: new             Ljava/lang/NullPointerException;
            //  1450: astore_2       
            //  1451: aload_2        
            //  1452: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  1454: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1457: aload_2        
            //  1458: athrow         
            //  1459: aload           6
            //  1461: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
            //  1464: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1467: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1470: ifeq            1487
            //  1473: aload_2        
            //  1474: invokevirtual   fc2/g.i:()C
            //  1477: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
            //  1480: checkcast       Ljava/lang/Long;
            //  1483: astore_2       
            //  1484: goto            1736
            //  1487: aload           6
            //  1489: ldc             Ljava/lang/String;.class
            //  1491: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1494: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1497: ifeq            1529
            //  1500: aload_2        
            //  1501: invokevirtual   fc2/g.C:()Ljava/lang/String;
            //  1504: astore_2       
            //  1505: aload_2        
            //  1506: ifnull          1517
            //  1509: aload_2        
            //  1510: checkcast       Ljava/lang/Long;
            //  1513: astore_2       
            //  1514: goto            1736
            //  1517: new             Ljava/lang/NullPointerException;
            //  1520: astore_2       
            //  1521: aload_2        
            //  1522: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  1524: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1527: aload_2        
            //  1528: athrow         
            //  1529: aload           6
            //  1531: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //  1534: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1537: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1540: ifeq            1557
            //  1543: aload_2        
            //  1544: invokevirtual   fc2/g.d:()Z
            //  1547: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //  1550: checkcast       Ljava/lang/Long;
            //  1553: astore_2       
            //  1554: goto            1736
            //  1557: aload           6
            //  1559: ldc             Lfc2/i;.class
            //  1561: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1564: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1567: ifeq            1581
            //  1570: aload_2        
            //  1571: invokevirtual   fc2/g.p:()Lfc2/i;
            //  1574: checkcast       Ljava/lang/Long;
            //  1577: astore_2       
            //  1578: goto            1736
            //  1581: aload           6
            //  1583: ldc             Lfc2/k;.class
            //  1585: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1588: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1591: ifeq            1605
            //  1594: aload_2        
            //  1595: invokevirtual   fc2/g.q:()Lfc2/k;
            //  1598: checkcast       Ljava/lang/Long;
            //  1601: astore_2       
            //  1602: goto            1736
            //  1605: aload           6
            //  1607: ldc             Lfc2/f;.class
            //  1609: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1612: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1615: ifeq            1629
            //  1618: aload_2        
            //  1619: invokevirtual   fc2/g.n:()Lfc2/f;
            //  1622: checkcast       Ljava/lang/Long;
            //  1625: astore_2       
            //  1626: goto            1736
            //  1629: aload           6
            //  1631: ldc             Lfc2/h;.class
            //  1633: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1636: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1639: ifeq            1734
            //  1642: aload_2        
            //  1643: invokevirtual   fc2/g.o:()Lfc2/h;
            //  1646: checkcast       Ljava/lang/Long;
            //  1649: astore_2       
            //  1650: goto            1736
            //  1653: aload_2        
            //  1654: instanceof      Lfc2/i;
            //  1657: ifeq            1691
            //  1660: aload_0        
            //  1661: ldc             "muted_end_at"
            //  1663: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1666: astore_2       
            //  1667: aload_2        
            //  1668: ifnull          1679
            //  1671: aload_2        
            //  1672: checkcast       Ljava/lang/Long;
            //  1675: astore_2       
            //  1676: goto            1736
            //  1679: new             Ljava/lang/NullPointerException;
            //  1682: astore_2       
            //  1683: aload_2        
            //  1684: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  1686: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1689: aload_2        
            //  1690: athrow         
            //  1691: aload_2        
            //  1692: instanceof      Lfc2/f;
            //  1695: ifeq            1734
            //  1698: aload_0        
            //  1699: ldc             "muted_end_at"
            //  1701: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1704: astore_2       
            //  1705: aload_2        
            //  1706: ifnull          1717
            //  1709: aload_2        
            //  1710: checkcast       Ljava/lang/Long;
            //  1713: astore_2       
            //  1714: goto            1736
            //  1717: new             Ljava/lang/NullPointerException;
            //  1720: astore_2       
            //  1721: aload_2        
            //  1722: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  1724: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1727: aload_2        
            //  1728: athrow         
            //  1729: astore_2       
            //  1730: aload_2        
            //  1731: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
            //  1734: aconst_null    
            //  1735: astore_2       
            //  1736: aload_2        
            //  1737: ifnull          1742
            //  1740: aload_2        
            //  1741: astore_3       
            //  1742: aload_0        
            //  1743: ldc             "end_at"
            //  1745: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
            //  1748: ifne            1754
            //  1751: goto            2312
            //  1754: aload_0        
            //  1755: ldc             "end_at"
            //  1757: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1760: astore_2       
            //  1761: aload_2        
            //  1762: instanceof      Lfc2/k;
            //  1765: ifeq            2231
            //  1768: aload_0        
            //  1769: ldc             "end_at"
            //  1771: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  1774: astore_2       
            //  1775: aload_2        
            //  1776: ldc             "this[key]"
            //  1778: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
            //  1781: ldc             Ljava/lang/Long;.class
            //  1783: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1786: astore          6
            //  1788: aload           6
            //  1790: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
            //  1793: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1796: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1799: ifeq            1816
            //  1802: aload_2        
            //  1803: invokevirtual   fc2/g.e:()B
            //  1806: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
            //  1809: checkcast       Ljava/lang/Long;
            //  1812: astore_2       
            //  1813: goto            2314
            //  1816: aload           6
            //  1818: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
            //  1821: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1824: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1827: ifeq            1844
            //  1830: aload_2        
            //  1831: invokevirtual   fc2/g.z:()S
            //  1834: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
            //  1837: checkcast       Ljava/lang/Long;
            //  1840: astore_2       
            //  1841: goto            2314
            //  1844: aload           6
            //  1846: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //  1849: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1852: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1855: ifeq            1872
            //  1858: aload_2        
            //  1859: invokevirtual   fc2/g.m:()I
            //  1862: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  1865: checkcast       Ljava/lang/Long;
            //  1868: astore_2       
            //  1869: goto            2314
            //  1872: aload           6
            //  1874: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
            //  1877: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1880: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1883: ifeq            1897
            //  1886: aload_2        
            //  1887: invokevirtual   fc2/g.x:()J
            //  1890: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //  1893: astore_2       
            //  1894: goto            2314
            //  1897: aload           6
            //  1899: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
            //  1902: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1905: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1908: ifeq            1925
            //  1911: aload_2        
            //  1912: invokevirtual   fc2/g.l:()F
            //  1915: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
            //  1918: checkcast       Ljava/lang/Long;
            //  1921: astore_2       
            //  1922: goto            2314
            //  1925: aload           6
            //  1927: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
            //  1930: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1933: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1936: ifeq            1953
            //  1939: aload_2        
            //  1940: invokevirtual   fc2/g.k:()D
            //  1943: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
            //  1946: checkcast       Ljava/lang/Long;
            //  1949: astore_2       
            //  1950: goto            2314
            //  1953: aload           6
            //  1955: ldc             Ljava/math/BigDecimal;.class
            //  1957: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  1960: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  1963: ifeq            1995
            //  1966: aload_2        
            //  1967: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
            //  1970: astore_2       
            //  1971: aload_2        
            //  1972: ifnull          1983
            //  1975: aload_2        
            //  1976: checkcast       Ljava/lang/Long;
            //  1979: astore_2       
            //  1980: goto            2314
            //  1983: new             Ljava/lang/NullPointerException;
            //  1986: astore_2       
            //  1987: aload_2        
            //  1988: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  1990: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  1993: aload_2        
            //  1994: athrow         
            //  1995: aload           6
            //  1997: ldc             Ljava/math/BigInteger;.class
            //  1999: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2002: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2005: ifeq            2037
            //  2008: aload_2        
            //  2009: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
            //  2012: astore_2       
            //  2013: aload_2        
            //  2014: ifnull          2025
            //  2017: aload_2        
            //  2018: checkcast       Ljava/lang/Long;
            //  2021: astore_2       
            //  2022: goto            2314
            //  2025: new             Ljava/lang/NullPointerException;
            //  2028: astore_2       
            //  2029: aload_2        
            //  2030: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  2032: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2035: aload_2        
            //  2036: athrow         
            //  2037: aload           6
            //  2039: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
            //  2042: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2045: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2048: ifeq            2065
            //  2051: aload_2        
            //  2052: invokevirtual   fc2/g.i:()C
            //  2055: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
            //  2058: checkcast       Ljava/lang/Long;
            //  2061: astore_2       
            //  2062: goto            2314
            //  2065: aload           6
            //  2067: ldc             Ljava/lang/String;.class
            //  2069: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2072: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2075: ifeq            2107
            //  2078: aload_2        
            //  2079: invokevirtual   fc2/g.C:()Ljava/lang/String;
            //  2082: astore_2       
            //  2083: aload_2        
            //  2084: ifnull          2095
            //  2087: aload_2        
            //  2088: checkcast       Ljava/lang/Long;
            //  2091: astore_2       
            //  2092: goto            2314
            //  2095: new             Ljava/lang/NullPointerException;
            //  2098: astore_2       
            //  2099: aload_2        
            //  2100: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  2102: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2105: aload_2        
            //  2106: athrow         
            //  2107: aload           6
            //  2109: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //  2112: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2115: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2118: ifeq            2135
            //  2121: aload_2        
            //  2122: invokevirtual   fc2/g.d:()Z
            //  2125: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //  2128: checkcast       Ljava/lang/Long;
            //  2131: astore_2       
            //  2132: goto            2314
            //  2135: aload           6
            //  2137: ldc             Lfc2/i;.class
            //  2139: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2142: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2145: ifeq            2159
            //  2148: aload_2        
            //  2149: invokevirtual   fc2/g.p:()Lfc2/i;
            //  2152: checkcast       Ljava/lang/Long;
            //  2155: astore_2       
            //  2156: goto            2314
            //  2159: aload           6
            //  2161: ldc             Lfc2/k;.class
            //  2163: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2166: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2169: ifeq            2183
            //  2172: aload_2        
            //  2173: invokevirtual   fc2/g.q:()Lfc2/k;
            //  2176: checkcast       Ljava/lang/Long;
            //  2179: astore_2       
            //  2180: goto            2314
            //  2183: aload           6
            //  2185: ldc             Lfc2/f;.class
            //  2187: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2190: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2193: ifeq            2207
            //  2196: aload_2        
            //  2197: invokevirtual   fc2/g.n:()Lfc2/f;
            //  2200: checkcast       Ljava/lang/Long;
            //  2203: astore_2       
            //  2204: goto            2314
            //  2207: aload           6
            //  2209: ldc             Lfc2/h;.class
            //  2211: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2214: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2217: ifeq            2312
            //  2220: aload_2        
            //  2221: invokevirtual   fc2/g.o:()Lfc2/h;
            //  2224: checkcast       Ljava/lang/Long;
            //  2227: astore_2       
            //  2228: goto            2314
            //  2231: aload_2        
            //  2232: instanceof      Lfc2/i;
            //  2235: ifeq            2269
            //  2238: aload_0        
            //  2239: ldc             "end_at"
            //  2241: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  2244: astore_2       
            //  2245: aload_2        
            //  2246: ifnull          2257
            //  2249: aload_2        
            //  2250: checkcast       Ljava/lang/Long;
            //  2253: astore_2       
            //  2254: goto            2314
            //  2257: new             Ljava/lang/NullPointerException;
            //  2260: astore_2       
            //  2261: aload_2        
            //  2262: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  2264: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2267: aload_2        
            //  2268: athrow         
            //  2269: aload_2        
            //  2270: instanceof      Lfc2/f;
            //  2273: ifeq            2312
            //  2276: aload_0        
            //  2277: ldc             "end_at"
            //  2279: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  2282: astore_2       
            //  2283: aload_2        
            //  2284: ifnull          2295
            //  2287: aload_2        
            //  2288: checkcast       Ljava/lang/Long;
            //  2291: astore_2       
            //  2292: goto            2314
            //  2295: new             Ljava/lang/NullPointerException;
            //  2298: astore_2       
            //  2299: aload_2        
            //  2300: ldc             "null cannot be cast to non-null type kotlin.Long"
            //  2302: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2305: aload_2        
            //  2306: athrow         
            //  2307: astore_2       
            //  2308: aload_2        
            //  2309: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
            //  2312: aconst_null    
            //  2313: astore_2       
            //  2314: aload_2        
            //  2315: ifnull          2320
            //  2318: aload_2        
            //  2319: astore_3       
            //  2320: aload_3        
            //  2321: invokevirtual   java/lang/Number.longValue:()J
            //  2324: lstore          7
            //  2326: getstatic       com/sendbird/android/RestrictionType.Companion:Lcom/sendbird/android/RestrictionType$a;
            //  2329: astore_3       
            //  2330: aload_0        
            //  2331: ldc             "restriction_type"
            //  2333: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
            //  2336: ifne            2342
            //  2339: goto            2882
            //  2342: aload_0        
            //  2343: ldc             "restriction_type"
            //  2345: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  2348: astore_2       
            //  2349: aload_2        
            //  2350: instanceof      Lfc2/k;
            //  2353: ifeq            2801
            //  2356: aload_0        
            //  2357: ldc             "restriction_type"
            //  2359: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  2362: astore_2       
            //  2363: aload_2        
            //  2364: ldc             "this[key]"
            //  2366: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
            //  2369: ldc             Ljava/lang/String;.class
            //  2371: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2374: astore_0       
            //  2375: aload_0        
            //  2376: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
            //  2379: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2382: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2385: ifeq            2402
            //  2388: aload_2        
            //  2389: invokevirtual   fc2/g.e:()B
            //  2392: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
            //  2395: checkcast       Ljava/lang/String;
            //  2398: astore_0       
            //  2399: goto            2824
            //  2402: aload_0        
            //  2403: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
            //  2406: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2409: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2412: ifeq            2429
            //  2415: aload_2        
            //  2416: invokevirtual   fc2/g.z:()S
            //  2419: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
            //  2422: checkcast       Ljava/lang/String;
            //  2425: astore_0       
            //  2426: goto            2824
            //  2429: aload_0        
            //  2430: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
            //  2433: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2436: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2439: ifeq            2456
            //  2442: aload_2        
            //  2443: invokevirtual   fc2/g.m:()I
            //  2446: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
            //  2449: checkcast       Ljava/lang/String;
            //  2452: astore_0       
            //  2453: goto            2824
            //  2456: aload_0        
            //  2457: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
            //  2460: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2463: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2466: ifeq            2483
            //  2469: aload_2        
            //  2470: invokevirtual   fc2/g.x:()J
            //  2473: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
            //  2476: checkcast       Ljava/lang/String;
            //  2479: astore_0       
            //  2480: goto            2824
            //  2483: aload_0        
            //  2484: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
            //  2487: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2490: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2493: ifeq            2510
            //  2496: aload_2        
            //  2497: invokevirtual   fc2/g.l:()F
            //  2500: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
            //  2503: checkcast       Ljava/lang/String;
            //  2506: astore_0       
            //  2507: goto            2824
            //  2510: aload_0        
            //  2511: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
            //  2514: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2517: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2520: ifeq            2537
            //  2523: aload_2        
            //  2524: invokevirtual   fc2/g.k:()D
            //  2527: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
            //  2530: checkcast       Ljava/lang/String;
            //  2533: astore_0       
            //  2534: goto            2824
            //  2537: aload_0        
            //  2538: ldc             Ljava/math/BigDecimal;.class
            //  2540: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2543: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2546: ifeq            2578
            //  2549: aload_2        
            //  2550: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
            //  2553: astore_0       
            //  2554: aload_0        
            //  2555: ifnull          2566
            //  2558: aload_0        
            //  2559: checkcast       Ljava/lang/String;
            //  2562: astore_0       
            //  2563: goto            2824
            //  2566: new             Ljava/lang/NullPointerException;
            //  2569: astore_0       
            //  2570: aload_0        
            //  2571: ldc             "null cannot be cast to non-null type kotlin.String"
            //  2573: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2576: aload_0        
            //  2577: athrow         
            //  2578: aload_0        
            //  2579: ldc             Ljava/math/BigInteger;.class
            //  2581: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2584: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2587: ifeq            2619
            //  2590: aload_2        
            //  2591: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
            //  2594: astore_0       
            //  2595: aload_0        
            //  2596: ifnull          2607
            //  2599: aload_0        
            //  2600: checkcast       Ljava/lang/String;
            //  2603: astore_0       
            //  2604: goto            2824
            //  2607: new             Ljava/lang/NullPointerException;
            //  2610: astore_0       
            //  2611: aload_0        
            //  2612: ldc             "null cannot be cast to non-null type kotlin.String"
            //  2614: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2617: aload_0        
            //  2618: athrow         
            //  2619: aload_0        
            //  2620: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
            //  2623: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2626: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2629: ifeq            2646
            //  2632: aload_2        
            //  2633: invokevirtual   fc2/g.i:()C
            //  2636: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
            //  2639: checkcast       Ljava/lang/String;
            //  2642: astore_0       
            //  2643: goto            2824
            //  2646: aload_0        
            //  2647: ldc             Ljava/lang/String;.class
            //  2649: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2652: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2655: ifeq            2682
            //  2658: aload_2        
            //  2659: invokevirtual   fc2/g.C:()Ljava/lang/String;
            //  2662: astore_0       
            //  2663: aload_0        
            //  2664: ifnull          2670
            //  2667: goto            2824
            //  2670: new             Ljava/lang/NullPointerException;
            //  2673: astore_0       
            //  2674: aload_0        
            //  2675: ldc             "null cannot be cast to non-null type kotlin.String"
            //  2677: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2680: aload_0        
            //  2681: athrow         
            //  2682: aload_0        
            //  2683: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
            //  2686: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2689: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2692: ifeq            2709
            //  2695: aload_2        
            //  2696: invokevirtual   fc2/g.d:()Z
            //  2699: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
            //  2702: checkcast       Ljava/lang/String;
            //  2705: astore_0       
            //  2706: goto            2824
            //  2709: aload_0        
            //  2710: ldc             Lfc2/i;.class
            //  2712: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2715: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2718: ifeq            2732
            //  2721: aload_2        
            //  2722: invokevirtual   fc2/g.p:()Lfc2/i;
            //  2725: checkcast       Ljava/lang/String;
            //  2728: astore_0       
            //  2729: goto            2824
            //  2732: aload_0        
            //  2733: ldc             Lfc2/k;.class
            //  2735: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2738: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2741: ifeq            2755
            //  2744: aload_2        
            //  2745: invokevirtual   fc2/g.q:()Lfc2/k;
            //  2748: checkcast       Ljava/lang/String;
            //  2751: astore_0       
            //  2752: goto            2824
            //  2755: aload_0        
            //  2756: ldc             Lfc2/f;.class
            //  2758: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2761: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2764: ifeq            2778
            //  2767: aload_2        
            //  2768: invokevirtual   fc2/g.n:()Lfc2/f;
            //  2771: checkcast       Ljava/lang/String;
            //  2774: astore_0       
            //  2775: goto            2824
            //  2778: aload_0        
            //  2779: ldc             Lfc2/h;.class
            //  2781: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
            //  2784: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
            //  2787: ifeq            2882
            //  2790: aload_2        
            //  2791: invokevirtual   fc2/g.o:()Lfc2/h;
            //  2794: checkcast       Ljava/lang/String;
            //  2797: astore_0       
            //  2798: goto            2824
            //  2801: aload_2        
            //  2802: instanceof      Lfc2/i;
            //  2805: ifeq            2839
            //  2808: aload_0        
            //  2809: ldc             "restriction_type"
            //  2811: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  2814: astore_0       
            //  2815: aload_0        
            //  2816: ifnull          2827
            //  2819: aload_0        
            //  2820: checkcast       Ljava/lang/String;
            //  2823: astore_0       
            //  2824: goto            2884
            //  2827: new             Ljava/lang/NullPointerException;
            //  2830: astore_0       
            //  2831: aload_0        
            //  2832: ldc             "null cannot be cast to non-null type kotlin.String"
            //  2834: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2837: aload_0        
            //  2838: athrow         
            //  2839: aload_2        
            //  2840: instanceof      Lfc2/f;
            //  2843: ifeq            2882
            //  2846: aload_0        
            //  2847: ldc             "restriction_type"
            //  2849: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
            //  2852: astore_0       
            //  2853: aload_0        
            //  2854: ifnull          2865
            //  2857: aload_0        
            //  2858: checkcast       Ljava/lang/String;
            //  2861: astore_0       
            //  2862: goto            2824
            //  2865: new             Ljava/lang/NullPointerException;
            //  2868: astore_0       
            //  2869: aload_0        
            //  2870: ldc             "null cannot be cast to non-null type kotlin.String"
            //  2872: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
            //  2875: aload_0        
            //  2876: athrow         
            //  2877: astore_0       
            //  2878: aload_0        
            //  2879: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
            //  2882: aconst_null    
            //  2883: astore_0       
            //  2884: aload           4
            //  2886: astore_2       
            //  2887: aload_0        
            //  2888: ifnull          2893
            //  2891: aload_0        
            //  2892: astore_2       
            //  2893: aload_3        
            //  2894: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
            //  2897: pop            
            //  2898: aload_2        
            //  2899: invokestatic    com/sendbird/android/RestrictionType$a.a:(Ljava/lang/String;)Lcom/sendbird/android/RestrictionType;
            //  2902: astore_0       
            //  2903: aload_0        
            //  2904: ifnull          2910
            //  2907: goto            2912
            //  2910: aload_1        
            //  2911: astore_0       
            //  2912: new             Lcom/sendbird/android/u3;
            //  2915: dup            
            //  2916: aload           5
            //  2918: lload           7
            //  2920: aload_0        
            //  2921: invokespecial   com/sendbird/android/u3.<init>:(Ljava/lang/String;JLcom/sendbird/android/RestrictionType;)V
            //  2924: areturn        
            //  2925: astore_2       
            //  2926: goto            558
            //  2929: astore_2       
            //  2930: goto            1145
            //  2933: astore_2       
            //  2934: goto            1734
            //  2937: astore_2       
            //  2938: goto            2312
            //  2941: astore_0       
            //  2942: goto            2882
            //    Exceptions:
            //  Try           Handler
            //  Start  End    Start  End    Type                 
            //  -----  -----  -----  -----  ---------------------
            //  18     45     553    558    Ljava/lang/Exception;
            //  45     75     2925   2929   Ljava/lang/Exception;
            //  78     102    2925   2929   Ljava/lang/Exception;
            //  105    129    2925   2929   Ljava/lang/Exception;
            //  132    156    2925   2929   Ljava/lang/Exception;
            //  159    183    2925   2929   Ljava/lang/Exception;
            //  186    210    2925   2929   Ljava/lang/Exception;
            //  213    230    2925   2929   Ljava/lang/Exception;
            //  234    239    2925   2929   Ljava/lang/Exception;
            //  242    254    2925   2929   Ljava/lang/Exception;
            //  254    271    2925   2929   Ljava/lang/Exception;
            //  275    280    2925   2929   Ljava/lang/Exception;
            //  283    295    2925   2929   Ljava/lang/Exception;
            //  295    319    2925   2929   Ljava/lang/Exception;
            //  322    339    2925   2929   Ljava/lang/Exception;
            //  346    358    2925   2929   Ljava/lang/Exception;
            //  358    382    2925   2929   Ljava/lang/Exception;
            //  385    405    2925   2929   Ljava/lang/Exception;
            //  408    428    2925   2929   Ljava/lang/Exception;
            //  431    451    2925   2929   Ljava/lang/Exception;
            //  454    474    2925   2929   Ljava/lang/Exception;
            //  477    491    553    558    Ljava/lang/Exception;
            //  495    500    553    558    Ljava/lang/Exception;
            //  503    515    553    558    Ljava/lang/Exception;
            //  515    529    553    558    Ljava/lang/Exception;
            //  533    538    553    558    Ljava/lang/Exception;
            //  541    553    553    558    Ljava/lang/Exception;
            //  588    617    1140   1145   Ljava/lang/Exception;
            //  617    648    2929   2933   Ljava/lang/Exception;
            //  651    676    2929   2933   Ljava/lang/Exception;
            //  679    704    2929   2933   Ljava/lang/Exception;
            //  707    732    2929   2933   Ljava/lang/Exception;
            //  735    760    2929   2933   Ljava/lang/Exception;
            //  763    788    2929   2933   Ljava/lang/Exception;
            //  791    809    2929   2933   Ljava/lang/Exception;
            //  813    818    2929   2933   Ljava/lang/Exception;
            //  821    833    2929   2933   Ljava/lang/Exception;
            //  833    851    2929   2933   Ljava/lang/Exception;
            //  855    860    2929   2933   Ljava/lang/Exception;
            //  863    875    2929   2933   Ljava/lang/Exception;
            //  875    900    2929   2933   Ljava/lang/Exception;
            //  903    921    2929   2933   Ljava/lang/Exception;
            //  928    940    2929   2933   Ljava/lang/Exception;
            //  940    965    2929   2933   Ljava/lang/Exception;
            //  968    989    2929   2933   Ljava/lang/Exception;
            //  992    1013   2929   2933   Ljava/lang/Exception;
            //  1016   1037   2929   2933   Ljava/lang/Exception;
            //  1040   1061   2929   2933   Ljava/lang/Exception;
            //  1064   1078   1140   1145   Ljava/lang/Exception;
            //  1082   1087   1140   1145   Ljava/lang/Exception;
            //  1090   1102   1140   1145   Ljava/lang/Exception;
            //  1102   1116   1140   1145   Ljava/lang/Exception;
            //  1120   1125   1140   1145   Ljava/lang/Exception;
            //  1128   1140   1140   1145   Ljava/lang/Exception;
            //  1176   1203   1729   1734   Ljava/lang/Exception;
            //  1203   1235   2933   2937   Ljava/lang/Exception;
            //  1238   1263   2933   2937   Ljava/lang/Exception;
            //  1266   1291   2933   2937   Ljava/lang/Exception;
            //  1294   1316   2933   2937   Ljava/lang/Exception;
            //  1319   1344   2933   2937   Ljava/lang/Exception;
            //  1347   1372   2933   2937   Ljava/lang/Exception;
            //  1375   1393   2933   2937   Ljava/lang/Exception;
            //  1397   1402   2933   2937   Ljava/lang/Exception;
            //  1405   1417   2933   2937   Ljava/lang/Exception;
            //  1417   1435   2933   2937   Ljava/lang/Exception;
            //  1439   1444   2933   2937   Ljava/lang/Exception;
            //  1447   1459   2933   2937   Ljava/lang/Exception;
            //  1459   1484   2933   2937   Ljava/lang/Exception;
            //  1487   1505   2933   2937   Ljava/lang/Exception;
            //  1509   1514   2933   2937   Ljava/lang/Exception;
            //  1517   1529   2933   2937   Ljava/lang/Exception;
            //  1529   1554   2933   2937   Ljava/lang/Exception;
            //  1557   1578   2933   2937   Ljava/lang/Exception;
            //  1581   1602   2933   2937   Ljava/lang/Exception;
            //  1605   1626   2933   2937   Ljava/lang/Exception;
            //  1629   1650   2933   2937   Ljava/lang/Exception;
            //  1653   1667   1729   1734   Ljava/lang/Exception;
            //  1671   1676   1729   1734   Ljava/lang/Exception;
            //  1679   1691   1729   1734   Ljava/lang/Exception;
            //  1691   1705   1729   1734   Ljava/lang/Exception;
            //  1709   1714   1729   1734   Ljava/lang/Exception;
            //  1717   1729   1729   1734   Ljava/lang/Exception;
            //  1754   1781   2307   2312   Ljava/lang/Exception;
            //  1781   1813   2937   2941   Ljava/lang/Exception;
            //  1816   1841   2937   2941   Ljava/lang/Exception;
            //  1844   1869   2937   2941   Ljava/lang/Exception;
            //  1872   1894   2937   2941   Ljava/lang/Exception;
            //  1897   1922   2937   2941   Ljava/lang/Exception;
            //  1925   1950   2937   2941   Ljava/lang/Exception;
            //  1953   1971   2937   2941   Ljava/lang/Exception;
            //  1975   1980   2937   2941   Ljava/lang/Exception;
            //  1983   1995   2937   2941   Ljava/lang/Exception;
            //  1995   2013   2937   2941   Ljava/lang/Exception;
            //  2017   2022   2937   2941   Ljava/lang/Exception;
            //  2025   2037   2937   2941   Ljava/lang/Exception;
            //  2037   2062   2937   2941   Ljava/lang/Exception;
            //  2065   2083   2937   2941   Ljava/lang/Exception;
            //  2087   2092   2937   2941   Ljava/lang/Exception;
            //  2095   2107   2937   2941   Ljava/lang/Exception;
            //  2107   2132   2937   2941   Ljava/lang/Exception;
            //  2135   2156   2937   2941   Ljava/lang/Exception;
            //  2159   2180   2937   2941   Ljava/lang/Exception;
            //  2183   2204   2937   2941   Ljava/lang/Exception;
            //  2207   2228   2937   2941   Ljava/lang/Exception;
            //  2231   2245   2307   2312   Ljava/lang/Exception;
            //  2249   2254   2307   2312   Ljava/lang/Exception;
            //  2257   2269   2307   2312   Ljava/lang/Exception;
            //  2269   2283   2307   2312   Ljava/lang/Exception;
            //  2287   2292   2307   2312   Ljava/lang/Exception;
            //  2295   2307   2307   2312   Ljava/lang/Exception;
            //  2342   2369   2877   2882   Ljava/lang/Exception;
            //  2369   2399   2941   2945   Ljava/lang/Exception;
            //  2402   2426   2941   2945   Ljava/lang/Exception;
            //  2429   2453   2941   2945   Ljava/lang/Exception;
            //  2456   2480   2941   2945   Ljava/lang/Exception;
            //  2483   2507   2941   2945   Ljava/lang/Exception;
            //  2510   2534   2941   2945   Ljava/lang/Exception;
            //  2537   2554   2941   2945   Ljava/lang/Exception;
            //  2558   2563   2941   2945   Ljava/lang/Exception;
            //  2566   2578   2941   2945   Ljava/lang/Exception;
            //  2578   2595   2941   2945   Ljava/lang/Exception;
            //  2599   2604   2941   2945   Ljava/lang/Exception;
            //  2607   2619   2941   2945   Ljava/lang/Exception;
            //  2619   2643   2941   2945   Ljava/lang/Exception;
            //  2646   2663   2941   2945   Ljava/lang/Exception;
            //  2670   2682   2941   2945   Ljava/lang/Exception;
            //  2682   2706   2941   2945   Ljava/lang/Exception;
            //  2709   2729   2941   2945   Ljava/lang/Exception;
            //  2732   2752   2941   2945   Ljava/lang/Exception;
            //  2755   2775   2941   2945   Ljava/lang/Exception;
            //  2778   2798   2941   2945   Ljava/lang/Exception;
            //  2801   2815   2877   2882   Ljava/lang/Exception;
            //  2819   2824   2877   2882   Ljava/lang/Exception;
            //  2827   2839   2877   2882   Ljava/lang/Exception;
            //  2839   2853   2877   2882   Ljava/lang/Exception;
            //  2857   2862   2877   2882   Ljava/lang/Exception;
            //  2865   2877   2877   2882   Ljava/lang/Exception;
            // 
            // The error that occurred was:
            // 
            // java.lang.IndexOutOfBoundsException: Index: 1347, Size: 1347
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
