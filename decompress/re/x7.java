// 
// Decompiled by Procyon v0.6.0
// 

package re;

import ke.x3;
import ke.i2;

public final class x7 extends w7
{
    public final i2 g;
    public final /* synthetic */ b h;
    
    public x7(final b h, final String s, final int n, final i2 g) {
        this.h = h;
        super(s, n);
        this.g = g;
    }
    
    public final int a() {
        return this.g.r();
    }
    
    public final boolean b() {
        return false;
    }
    
    public final boolean c() {
        return true;
    }
    
    public final boolean g(final Long p0, final Long p1, final x3 p2, final boolean p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: aload_0        
        //     4: getfield        re/x7.h:Lre/b;
        //     7: getfield        u5/w.f:Ljava/lang/Object;
        //    10: checkcast       Lre/h4;
        //    13: getfield        re/h4.l:Lre/f;
        //    16: aload_0        
        //    17: getfield        re/w7.a:Ljava/lang/String;
        //    20: getstatic       re/q2.U:Lre/p2;
        //    23: invokevirtual   re/f.H:(Ljava/lang/String;Lre/p2;)Z
        //    26: istore          5
        //    28: aload_0        
        //    29: getfield        re/x7.g:Lke/i2;
        //    32: invokevirtual   ke/i2.x:()Z
        //    35: istore          6
        //    37: aload_0        
        //    38: getfield        re/x7.g:Lke/i2;
        //    41: invokevirtual   ke/i2.y:()Z
        //    44: istore          7
        //    46: aload_0        
        //    47: getfield        re/x7.g:Lke/i2;
        //    50: invokevirtual   ke/i2.z:()Z
        //    53: istore          8
        //    55: iload           6
        //    57: ifne            79
        //    60: iload           7
        //    62: ifne            79
        //    65: iload           8
        //    67: ifeq            73
        //    70: goto            79
        //    73: iconst_0       
        //    74: istore          9
        //    76: goto            82
        //    79: iconst_1       
        //    80: istore          9
        //    82: aconst_null    
        //    83: astore          10
        //    85: aconst_null    
        //    86: astore          11
        //    88: aconst_null    
        //    89: astore          12
        //    91: aconst_null    
        //    92: astore          13
        //    94: aconst_null    
        //    95: astore          14
        //    97: iload           4
        //    99: ifeq            168
        //   102: iload           9
        //   104: ifne            168
        //   107: aload_0        
        //   108: getfield        re/x7.h:Lre/b;
        //   111: getfield        u5/w.f:Ljava/lang/Object;
        //   114: checkcast       Lre/h4;
        //   117: invokevirtual   re/h4.f:()Lre/c3;
        //   120: getfield        re/c3.s:Lre/a3;
        //   123: astore_2       
        //   124: aload_0        
        //   125: getfield        re/w7.b:I
        //   128: istore          9
        //   130: aload           14
        //   132: astore_1       
        //   133: aload_0        
        //   134: getfield        re/x7.g:Lke/i2;
        //   137: invokevirtual   ke/i2.A:()Z
        //   140: ifeq            154
        //   143: aload_0        
        //   144: getfield        re/x7.g:Lke/i2;
        //   147: invokevirtual   ke/i2.r:()I
        //   150: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   153: astore_1       
        //   154: aload_2        
        //   155: iload           9
        //   157: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   160: ldc             "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID"
        //   162: aload_1        
        //   163: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   166: iconst_1       
        //   167: ireturn        
        //   168: aload_0        
        //   169: getfield        re/x7.g:Lke/i2;
        //   172: invokevirtual   ke/i2.s:()Lke/d2;
        //   175: astore          14
        //   177: aload           14
        //   179: invokevirtual   ke/d2.x:()Z
        //   182: istore          7
        //   184: aload_3        
        //   185: invokevirtual   ke/x3.H:()Z
        //   188: ifeq            294
        //   191: aload           14
        //   193: invokevirtual   ke/d2.z:()Z
        //   196: ifne            247
        //   199: aload_0        
        //   200: getfield        re/x7.h:Lre/b;
        //   203: getfield        u5/w.f:Ljava/lang/Object;
        //   206: checkcast       Lre/h4;
        //   209: invokevirtual   re/h4.f:()Lre/c3;
        //   212: getfield        re/c3.n:Lre/a3;
        //   215: aload_0        
        //   216: getfield        re/x7.h:Lre/b;
        //   219: getfield        u5/w.f:Ljava/lang/Object;
        //   222: checkcast       Lre/h4;
        //   225: getfield        re/h4.r:Lre/x2;
        //   228: aload_3        
        //   229: invokevirtual   ke/x3.w:()Ljava/lang/String;
        //   232: invokevirtual   re/x2.f:(Ljava/lang/String;)Ljava/lang/String;
        //   235: ldc             "No number filter for long property. property"
        //   237: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   240: aload           13
        //   242: astore          12
        //   244: goto            683
        //   247: aload_3        
        //   248: invokevirtual   ke/x3.s:()J
        //   251: lstore          15
        //   253: aload           14
        //   255: invokevirtual   ke/d2.t:()Lke/g2;
        //   258: astore          12
        //   260: new             Ljava/math/BigDecimal;
        //   263: astore          11
        //   265: aload           11
        //   267: lload           15
        //   269: invokespecial   java/math/BigDecimal.<init>:(J)V
        //   272: aload           11
        //   274: aload           12
        //   276: dconst_0       
        //   277: invokestatic    re/w7.d:(Ljava/math/BigDecimal;Lke/g2;D)Ljava/lang/Boolean;
        //   280: astore          12
        //   282: aload           12
        //   284: iload           7
        //   286: invokestatic    re/w7.f:(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;
        //   289: astore          12
        //   291: goto            683
        //   294: aload_3        
        //   295: invokevirtual   ke/x3.G:()Z
        //   298: ifeq            408
        //   301: aload           14
        //   303: invokevirtual   ke/d2.z:()Z
        //   306: ifne            357
        //   309: aload_0        
        //   310: getfield        re/x7.h:Lre/b;
        //   313: getfield        u5/w.f:Ljava/lang/Object;
        //   316: checkcast       Lre/h4;
        //   319: invokevirtual   re/h4.f:()Lre/c3;
        //   322: getfield        re/c3.n:Lre/a3;
        //   325: aload_0        
        //   326: getfield        re/x7.h:Lre/b;
        //   329: getfield        u5/w.f:Ljava/lang/Object;
        //   332: checkcast       Lre/h4;
        //   335: getfield        re/h4.r:Lre/x2;
        //   338: aload_3        
        //   339: invokevirtual   ke/x3.w:()Ljava/lang/String;
        //   342: invokevirtual   re/x2.f:(Ljava/lang/String;)Ljava/lang/String;
        //   345: ldc             "No number filter for double property. property"
        //   347: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   350: aload           13
        //   352: astore          12
        //   354: goto            683
        //   357: aload_3        
        //   358: invokevirtual   ke/x3.r:()D
        //   361: dstore          17
        //   363: aload           14
        //   365: invokevirtual   ke/d2.t:()Lke/g2;
        //   368: astore          12
        //   370: new             Ljava/math/BigDecimal;
        //   373: astore          10
        //   375: aload           10
        //   377: dload           17
        //   379: invokespecial   java/math/BigDecimal.<init>:(D)V
        //   382: aload           10
        //   384: aload           12
        //   386: dload           17
        //   388: invokestatic    java/lang/Math.ulp:(D)D
        //   391: invokestatic    re/w7.d:(Ljava/math/BigDecimal;Lke/g2;D)Ljava/lang/Boolean;
        //   394: astore          12
        //   396: aload           12
        //   398: iload           7
        //   400: invokestatic    re/w7.f:(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;
        //   403: astore          12
        //   405: goto            683
        //   408: aload_3        
        //   409: invokevirtual   ke/x3.J:()Z
        //   412: ifeq            638
        //   415: aload           14
        //   417: invokevirtual   ke/d2.B:()Z
        //   420: ifne            603
        //   423: aload           14
        //   425: invokevirtual   ke/d2.z:()Z
        //   428: ifne            479
        //   431: aload_0        
        //   432: getfield        re/x7.h:Lre/b;
        //   435: getfield        u5/w.f:Ljava/lang/Object;
        //   438: checkcast       Lre/h4;
        //   441: invokevirtual   re/h4.f:()Lre/c3;
        //   444: getfield        re/c3.n:Lre/a3;
        //   447: aload_0        
        //   448: getfield        re/x7.h:Lre/b;
        //   451: getfield        u5/w.f:Ljava/lang/Object;
        //   454: checkcast       Lre/h4;
        //   457: getfield        re/h4.r:Lre/x2;
        //   460: aload_3        
        //   461: invokevirtual   ke/x3.w:()Ljava/lang/String;
        //   464: invokevirtual   re/x2.f:(Ljava/lang/String;)Ljava/lang/String;
        //   467: ldc             "No string or number filter defined. property"
        //   469: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   472: aload           13
        //   474: astore          12
        //   476: goto            683
        //   479: aload_3        
        //   480: invokevirtual   ke/x3.x:()Ljava/lang/String;
        //   483: invokestatic    re/i7.Z:(Ljava/lang/String;)Z
        //   486: ifeq            551
        //   489: aload_3        
        //   490: invokevirtual   ke/x3.x:()Ljava/lang/String;
        //   493: astore          10
        //   495: aload           14
        //   497: invokevirtual   ke/d2.t:()Lke/g2;
        //   500: astore          14
        //   502: aload           10
        //   504: invokestatic    re/i7.Z:(Ljava/lang/String;)Z
        //   507: ifne            513
        //   510: goto            539
        //   513: new             Ljava/math/BigDecimal;
        //   516: astore          11
        //   518: aload           11
        //   520: aload           10
        //   522: invokespecial   java/math/BigDecimal.<init>:(Ljava/lang/String;)V
        //   525: aload           11
        //   527: aload           14
        //   529: dconst_0       
        //   530: invokestatic    re/w7.d:(Ljava/math/BigDecimal;Lke/g2;D)Ljava/lang/Boolean;
        //   533: astore          10
        //   535: aload           10
        //   537: astore          12
        //   539: aload           12
        //   541: iload           7
        //   543: invokestatic    re/w7.f:(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;
        //   546: astore          12
        //   548: goto            683
        //   551: aload_0        
        //   552: getfield        re/x7.h:Lre/b;
        //   555: getfield        u5/w.f:Ljava/lang/Object;
        //   558: checkcast       Lre/h4;
        //   561: invokevirtual   re/h4.f:()Lre/c3;
        //   564: getfield        re/c3.n:Lre/a3;
        //   567: aload_0        
        //   568: getfield        re/x7.h:Lre/b;
        //   571: getfield        u5/w.f:Ljava/lang/Object;
        //   574: checkcast       Lre/h4;
        //   577: getfield        re/h4.r:Lre/x2;
        //   580: aload_3        
        //   581: invokevirtual   ke/x3.w:()Ljava/lang/String;
        //   584: invokevirtual   re/x2.f:(Ljava/lang/String;)Ljava/lang/String;
        //   587: ldc             "Invalid user property value for Numeric number filter. property, value"
        //   589: aload_3        
        //   590: invokevirtual   ke/x3.x:()Ljava/lang/String;
        //   593: invokevirtual   re/a3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   596: aload           13
        //   598: astore          12
        //   600: goto            683
        //   603: aload_3        
        //   604: invokevirtual   ke/x3.x:()Ljava/lang/String;
        //   607: aload           14
        //   609: invokevirtual   ke/d2.u:()Lke/l2;
        //   612: aload_0        
        //   613: getfield        re/x7.h:Lre/b;
        //   616: getfield        u5/w.f:Ljava/lang/Object;
        //   619: checkcast       Lre/h4;
        //   622: invokevirtual   re/h4.f:()Lre/c3;
        //   625: invokestatic    re/w7.e:(Ljava/lang/String;Lke/l2;Lre/c3;)Ljava/lang/Boolean;
        //   628: iload           7
        //   630: invokestatic    re/w7.f:(Ljava/lang/Boolean;Z)Ljava/lang/Boolean;
        //   633: astore          12
        //   635: goto            683
        //   638: aload_0        
        //   639: getfield        re/x7.h:Lre/b;
        //   642: getfield        u5/w.f:Ljava/lang/Object;
        //   645: checkcast       Lre/h4;
        //   648: invokevirtual   re/h4.f:()Lre/c3;
        //   651: getfield        re/c3.n:Lre/a3;
        //   654: aload_0        
        //   655: getfield        re/x7.h:Lre/b;
        //   658: getfield        u5/w.f:Ljava/lang/Object;
        //   661: checkcast       Lre/h4;
        //   664: getfield        re/h4.r:Lre/x2;
        //   667: aload_3        
        //   668: invokevirtual   ke/x3.w:()Ljava/lang/String;
        //   671: invokevirtual   re/x2.f:(Ljava/lang/String;)Ljava/lang/String;
        //   674: ldc             "User property has no value, property"
        //   676: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   679: aload           13
        //   681: astore          12
        //   683: aload_0        
        //   684: getfield        re/x7.h:Lre/b;
        //   687: getfield        u5/w.f:Ljava/lang/Object;
        //   690: checkcast       Lre/h4;
        //   693: invokevirtual   re/h4.f:()Lre/c3;
        //   696: getfield        re/c3.s:Lre/a3;
        //   699: astore          11
        //   701: aload           12
        //   703: ifnonnull       713
        //   706: ldc             "null"
        //   708: astore          10
        //   710: goto            717
        //   713: aload           12
        //   715: astore          10
        //   717: aload           11
        //   719: aload           10
        //   721: ldc             "Property filter result"
        //   723: invokevirtual   re/a3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   726: aload           12
        //   728: ifnonnull       733
        //   731: iconst_0       
        //   732: ireturn        
        //   733: aload_0        
        //   734: getstatic       java/lang/Boolean.TRUE:Ljava/lang/Boolean;
        //   737: putfield        re/w7.c:Ljava/lang/Boolean;
        //   740: iload           8
        //   742: ifeq            758
        //   745: aload           12
        //   747: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   750: ifeq            756
        //   753: goto            758
        //   756: iconst_1       
        //   757: ireturn        
        //   758: iload           4
        //   760: ifeq            773
        //   763: aload_0        
        //   764: getfield        re/x7.g:Lke/i2;
        //   767: invokevirtual   ke/i2.x:()Z
        //   770: ifeq            779
        //   773: aload_0        
        //   774: aload           12
        //   776: putfield        re/w7.d:Ljava/lang/Boolean;
        //   779: aload           12
        //   781: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   784: ifeq            897
        //   787: iload           9
        //   789: ifeq            897
        //   792: aload_3        
        //   793: invokevirtual   ke/x3.I:()Z
        //   796: ifeq            897
        //   799: aload_3        
        //   800: invokevirtual   ke/x3.t:()J
        //   803: lstore          15
        //   805: aload_1        
        //   806: ifnull          815
        //   809: aload_1        
        //   810: invokevirtual   java/lang/Long.longValue:()J
        //   813: lstore          15
        //   815: lload           15
        //   817: lstore          19
        //   819: iload           5
        //   821: ifeq            866
        //   824: lload           15
        //   826: lstore          19
        //   828: aload_0        
        //   829: getfield        re/x7.g:Lke/i2;
        //   832: invokevirtual   ke/i2.x:()Z
        //   835: ifeq            866
        //   838: lload           15
        //   840: lstore          19
        //   842: aload_0        
        //   843: getfield        re/x7.g:Lke/i2;
        //   846: invokevirtual   ke/i2.y:()Z
        //   849: ifne            866
        //   852: lload           15
        //   854: lstore          19
        //   856: aload_2        
        //   857: ifnull          866
        //   860: aload_2        
        //   861: invokevirtual   java/lang/Long.longValue:()J
        //   864: lstore          19
        //   866: aload_0        
        //   867: getfield        re/x7.g:Lke/i2;
        //   870: invokevirtual   ke/i2.y:()Z
        //   873: ifeq            888
        //   876: aload_0        
        //   877: lload           19
        //   879: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   882: putfield        re/w7.f:Ljava/lang/Long;
        //   885: goto            897
        //   888: aload_0        
        //   889: lload           19
        //   891: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   894: putfield        re/w7.e:Ljava/lang/Long;
        //   897: iconst_1       
        //   898: ireturn        
        //   899: astore          12
        //   901: aload           10
        //   903: astore          12
        //   905: goto            282
        //   908: astore          12
        //   910: aload           11
        //   912: astore          12
        //   914: goto            396
        //   917: astore          10
        //   919: goto            539
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                             
        //  -----  -----  -----  -----  ---------------------------------
        //  260    282    899    908    Ljava/lang/NumberFormatException;
        //  370    396    908    917    Ljava/lang/NumberFormatException;
        //  513    535    917    922    Ljava/lang/NumberFormatException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 396, Size: 396
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
