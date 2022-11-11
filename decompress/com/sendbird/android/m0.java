// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import lg.e0;
import com.sendbird.android.shadow.com.google.gson.JsonSyntaxException;
import fc2.j;
import fc2.g;
import al0.f0;
import sg2.e;
import fc2.i;

public final class m0
{
    public static final a d;
    public CommandType a;
    public String b;
    public String c;
    
    static {
        d = new a();
    }
    
    public m0(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: ldc             ""
        //     6: astore_2       
        //     7: aload_0        
        //     8: ldc             ""
        //    10: putfield        com/sendbird/android/m0.c:Ljava/lang/String;
        //    13: aload_1        
        //    14: ifnull          769
        //    17: aload_1        
        //    18: invokevirtual   java/lang/String.length:()I
        //    21: iconst_4       
        //    22: if_icmpgt       28
        //    25: goto            769
        //    28: aload_1        
        //    29: invokestatic    kotlin/text/b.B1:(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
        //    32: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //    35: astore_3       
        //    36: getstatic       com/sendbird/android/CommandType.Companion:Lcom/sendbird/android/CommandType$a;
        //    39: astore_1       
        //    40: aload_3        
        //    41: ifnull          759
        //    44: iconst_0       
        //    45: istore          4
        //    47: aload_3        
        //    48: iconst_0       
        //    49: iconst_4       
        //    50: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    53: astore          5
        //    55: aload           5
        //    57: ldc             "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //    59: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //    62: aload_1        
        //    63: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    66: pop            
        //    67: aload_0        
        //    68: aload           5
        //    70: invokestatic    com/sendbird/android/CommandType$a.a:(Ljava/lang/String;)Lcom/sendbird/android/CommandType;
        //    73: putfield        com/sendbird/android/m0.a:Lcom/sendbird/android/CommandType;
        //    76: aload_3        
        //    77: iconst_4       
        //    78: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //    81: astore_1       
        //    82: aload_1        
        //    83: ldc             "(this as java.lang.String).substring(startIndex)"
        //    85: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //    88: aload_0        
        //    89: aload_1        
        //    90: putfield        com/sendbird/android/m0.b:Ljava/lang/String;
        //    93: aload_0        
        //    94: getfield        com/sendbird/android/m0.a:Lcom/sendbird/android/CommandType;
        //    97: invokevirtual   com/sendbird/android/CommandType.isAckRequired:()Z
        //   100: ifne            113
        //   103: getstatic       com/sendbird/android/CommandType.EROR:Lcom/sendbird/android/CommandType;
        //   106: aload_0        
        //   107: getfield        com/sendbird/android/m0.a:Lcom/sendbird/android/CommandType;
        //   110: if_acmpne       116
        //   113: iconst_1       
        //   114: istore          4
        //   116: aload_2        
        //   117: astore          5
        //   119: iload           4
        //   121: ifeq            752
        //   124: aload_2        
        //   125: astore          5
        //   127: aload_0        
        //   128: invokevirtual   com/sendbird/android/m0.c:()Lfc2/g;
        //   131: instanceof      Lfc2/i;
        //   134: ifeq            752
        //   137: aload_0        
        //   138: invokevirtual   com/sendbird/android/m0.c:()Lfc2/g;
        //   141: invokevirtual   fc2/g.p:()Lfc2/i;
        //   144: astore          6
        //   146: aload           6
        //   148: ldc             "req_id"
        //   150: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //   153: istore          7
        //   155: aconst_null    
        //   156: astore          5
        //   158: iload           7
        //   160: ifne            169
        //   163: aload           5
        //   165: astore_1       
        //   166: goto            742
        //   169: aload           6
        //   171: ldc             "req_id"
        //   173: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   176: astore_3       
        //   177: aload_3        
        //   178: instanceof      Lfc2/k;
        //   181: istore          7
        //   183: iload           7
        //   185: ifeq            653
        //   188: aload           6
        //   190: ldc             "req_id"
        //   192: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   195: astore_3       
        //   196: aload_3        
        //   197: ldc             "this[key]"
        //   199: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   202: ldc             Ljava/lang/String;.class
        //   204: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   207: astore          6
        //   209: aload           6
        //   211: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //   214: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   217: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   220: ifeq            237
        //   223: aload_3        
        //   224: invokevirtual   fc2/g.e:()B
        //   227: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //   230: checkcast       Ljava/lang/String;
        //   233: astore_1       
        //   234: goto            677
        //   237: aload           6
        //   239: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //   242: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   245: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   248: ifeq            265
        //   251: aload_3        
        //   252: invokevirtual   fc2/g.z:()S
        //   255: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //   258: checkcast       Ljava/lang/String;
        //   261: astore_1       
        //   262: goto            677
        //   265: aload           6
        //   267: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   270: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   273: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   276: ifeq            293
        //   279: aload_3        
        //   280: invokevirtual   fc2/g.m:()I
        //   283: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   286: checkcast       Ljava/lang/String;
        //   289: astore_1       
        //   290: goto            677
        //   293: aload           6
        //   295: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   298: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   301: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   304: ifeq            321
        //   307: aload_3        
        //   308: invokevirtual   fc2/g.x:()J
        //   311: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   314: checkcast       Ljava/lang/String;
        //   317: astore_1       
        //   318: goto            677
        //   321: aload           6
        //   323: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   326: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   329: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   332: ifeq            349
        //   335: aload_3        
        //   336: invokevirtual   fc2/g.l:()F
        //   339: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   342: checkcast       Ljava/lang/String;
        //   345: astore_1       
        //   346: goto            677
        //   349: aload           6
        //   351: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   354: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   357: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   360: ifeq            377
        //   363: aload_3        
        //   364: invokevirtual   fc2/g.k:()D
        //   367: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   370: checkcast       Ljava/lang/String;
        //   373: astore_1       
        //   374: goto            677
        //   377: aload           6
        //   379: ldc             Ljava/math/BigDecimal;.class
        //   381: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   384: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   387: ifeq            419
        //   390: aload_3        
        //   391: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //   394: astore_1       
        //   395: aload_1        
        //   396: ifnull          407
        //   399: aload_1        
        //   400: checkcast       Ljava/lang/String;
        //   403: astore_1       
        //   404: goto            677
        //   407: new             Ljava/lang/NullPointerException;
        //   410: astore_1       
        //   411: aload_1        
        //   412: ldc             "null cannot be cast to non-null type kotlin.String"
        //   414: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   417: aload_1        
        //   418: athrow         
        //   419: aload           6
        //   421: ldc             Ljava/math/BigInteger;.class
        //   423: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   426: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   429: ifeq            461
        //   432: aload_3        
        //   433: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //   436: astore_1       
        //   437: aload_1        
        //   438: ifnull          449
        //   441: aload_1        
        //   442: checkcast       Ljava/lang/String;
        //   445: astore_1       
        //   446: goto            677
        //   449: new             Ljava/lang/NullPointerException;
        //   452: astore_1       
        //   453: aload_1        
        //   454: ldc             "null cannot be cast to non-null type kotlin.String"
        //   456: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   459: aload_1        
        //   460: athrow         
        //   461: aload           6
        //   463: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //   466: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   469: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   472: ifeq            489
        //   475: aload_3        
        //   476: invokevirtual   fc2/g.i:()C
        //   479: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   482: checkcast       Ljava/lang/String;
        //   485: astore_1       
        //   486: goto            677
        //   489: aload           6
        //   491: ldc             Ljava/lang/String;.class
        //   493: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   496: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   499: ifeq            526
        //   502: aload_3        
        //   503: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //   506: astore_1       
        //   507: aload_1        
        //   508: ifnull          514
        //   511: goto            677
        //   514: new             Ljava/lang/NullPointerException;
        //   517: astore_1       
        //   518: aload_1        
        //   519: ldc             "null cannot be cast to non-null type kotlin.String"
        //   521: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   524: aload_1        
        //   525: athrow         
        //   526: aload           6
        //   528: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   531: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   534: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   537: ifeq            554
        //   540: aload_3        
        //   541: invokevirtual   fc2/g.d:()Z
        //   544: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   547: checkcast       Ljava/lang/String;
        //   550: astore_1       
        //   551: goto            677
        //   554: aload           6
        //   556: ldc             Lfc2/i;.class
        //   558: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   561: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   564: ifeq            578
        //   567: aload_3        
        //   568: invokevirtual   fc2/g.p:()Lfc2/i;
        //   571: checkcast       Ljava/lang/String;
        //   574: astore_1       
        //   575: goto            677
        //   578: aload           6
        //   580: ldc             Lfc2/k;.class
        //   582: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   585: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   588: ifeq            602
        //   591: aload_3        
        //   592: invokevirtual   fc2/g.q:()Lfc2/k;
        //   595: checkcast       Ljava/lang/String;
        //   598: astore_1       
        //   599: goto            677
        //   602: aload           6
        //   604: ldc             Lfc2/f;.class
        //   606: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   609: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   612: ifeq            626
        //   615: aload_3        
        //   616: invokevirtual   fc2/g.n:()Lfc2/f;
        //   619: checkcast       Ljava/lang/String;
        //   622: astore_1       
        //   623: goto            677
        //   626: aload           5
        //   628: astore_1       
        //   629: aload           6
        //   631: ldc             Lfc2/h;.class
        //   633: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   636: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   639: ifeq            742
        //   642: aload_3        
        //   643: invokevirtual   fc2/g.o:()Lfc2/h;
        //   646: checkcast       Ljava/lang/String;
        //   649: astore_1       
        //   650: goto            677
        //   653: aload_3        
        //   654: instanceof      Lfc2/i;
        //   657: ifeq            692
        //   660: aload           6
        //   662: ldc             "req_id"
        //   664: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   667: astore_1       
        //   668: aload_1        
        //   669: ifnull          680
        //   672: aload_1        
        //   673: checkcast       Ljava/lang/String;
        //   676: astore_1       
        //   677: goto            742
        //   680: new             Ljava/lang/NullPointerException;
        //   683: astore_1       
        //   684: aload_1        
        //   685: ldc             "null cannot be cast to non-null type kotlin.String"
        //   687: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   690: aload_1        
        //   691: athrow         
        //   692: aload           5
        //   694: astore_1       
        //   695: aload_3        
        //   696: instanceof      Lfc2/f;
        //   699: ifeq            742
        //   702: aload           6
        //   704: ldc             "req_id"
        //   706: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   709: astore_1       
        //   710: aload_1        
        //   711: ifnull          722
        //   714: aload_1        
        //   715: checkcast       Ljava/lang/String;
        //   718: astore_1       
        //   719: goto            677
        //   722: new             Ljava/lang/NullPointerException;
        //   725: astore_1       
        //   726: aload_1        
        //   727: ldc             "null cannot be cast to non-null type kotlin.String"
        //   729: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   732: aload_1        
        //   733: athrow         
        //   734: astore_1       
        //   735: aload_1        
        //   736: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //   739: aload           5
        //   741: astore_1       
        //   742: aload_2        
        //   743: astore          5
        //   745: aload_1        
        //   746: ifnull          752
        //   749: aload_1        
        //   750: astore          5
        //   752: aload_0        
        //   753: aload           5
        //   755: putfield        com/sendbird/android/m0.c:Ljava/lang/String;
        //   758: return         
        //   759: new             Ljava/lang/NullPointerException;
        //   762: dup            
        //   763: ldc             "null cannot be cast to non-null type java.lang.String"
        //   765: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   768: athrow         
        //   769: aload_0        
        //   770: getstatic       com/sendbird/android/CommandType.NOOP:Lcom/sendbird/android/CommandType;
        //   773: putfield        com/sendbird/android/m0.a:Lcom/sendbird/android/CommandType;
        //   776: aload_0        
        //   777: ldc             "{}"
        //   779: putfield        com/sendbird/android/m0.b:Ljava/lang/String;
        //   782: return         
        //   783: astore_1       
        //   784: aload           5
        //   786: astore_1       
        //   787: goto            742
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  169    183    734    742    Ljava/lang/Exception;
        //  188    202    734    742    Ljava/lang/Exception;
        //  202    234    783    790    Ljava/lang/Exception;
        //  237    262    783    790    Ljava/lang/Exception;
        //  265    290    783    790    Ljava/lang/Exception;
        //  293    318    783    790    Ljava/lang/Exception;
        //  321    346    783    790    Ljava/lang/Exception;
        //  349    374    783    790    Ljava/lang/Exception;
        //  377    395    783    790    Ljava/lang/Exception;
        //  399    404    783    790    Ljava/lang/Exception;
        //  407    419    783    790    Ljava/lang/Exception;
        //  419    437    783    790    Ljava/lang/Exception;
        //  441    446    783    790    Ljava/lang/Exception;
        //  449    461    783    790    Ljava/lang/Exception;
        //  461    486    783    790    Ljava/lang/Exception;
        //  489    507    783    790    Ljava/lang/Exception;
        //  514    526    783    790    Ljava/lang/Exception;
        //  526    551    783    790    Ljava/lang/Exception;
        //  554    575    783    790    Ljava/lang/Exception;
        //  578    599    783    790    Ljava/lang/Exception;
        //  602    623    783    790    Ljava/lang/Exception;
        //  629    650    783    790    Ljava/lang/Exception;
        //  653    668    734    742    Ljava/lang/Exception;
        //  672    677    734    742    Ljava/lang/Exception;
        //  680    692    734    742    Ljava/lang/Exception;
        //  695    710    734    742    Ljava/lang/Exception;
        //  714    719    734    742    Ljava/lang/Exception;
        //  722    734    734    742    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0237:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2604)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:206)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:93)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:868)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createConstructor(AstBuilder.java:799)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:635)
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
    
    public m0(String a, final i i, String value) {
        this.c = "";
        CommandType.Companion.getClass();
        final CommandType a2 = CommandType$a.a(a);
        this.a = a2;
        Label_0105: {
            if (value == null) {
                if (a2.isAckRequired() || CommandType.EROR == this.a) {
                    synchronized (m0.d) {
                        value = String.valueOf(++o0.a);
                        break Label_0105;
                    }
                }
                value = "";
            }
        }
        this.c = value;
        i.p().K("req_id", this.c);
        a = o0.b.a(i);
        e.e((Object)a, "gson.toJson(_payload)");
        this.b = a;
    }
    
    public final String a() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        return f0.n(sb, this.b, '\n');
    }
    
    public final String b() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        com/sendbird/android/m0.a:Lcom/sendbird/android/CommandType;
        //     4: astore_1       
        //     5: getstatic       com/sendbird/android/n0.a:[I
        //     8: aload_1        
        //     9: invokevirtual   java/lang/Enum.ordinal:()I
        //    12: iaload         
        //    13: istore_2       
        //    14: aconst_null    
        //    15: astore_1       
        //    16: aconst_null    
        //    17: astore_3       
        //    18: iload_2        
        //    19: tableswitch {
        //                2: 87
        //                3: 87
        //                4: 87
        //                5: 87
        //                6: 87
        //                7: 87
        //                8: 87
        //                9: 87
        //               10: 87
        //               11: 87
        //               12: 87
        //               13: 87
        //               14: 87
        //          default: 84
        //        }
        //    84: goto            727
        //    87: aload_0        
        //    88: invokevirtual   com/sendbird/android/m0.c:()Lfc2/g;
        //    91: instanceof      Lfc2/i;
        //    94: ifeq            727
        //    97: aload_0        
        //    98: invokevirtual   com/sendbird/android/m0.c:()Lfc2/g;
        //   101: invokevirtual   fc2/g.p:()Lfc2/i;
        //   104: astore          4
        //   106: aload           4
        //   108: ldc_w           "channel_url"
        //   111: invokevirtual   fc2/i.P:(Ljava/lang/String;)Z
        //   114: ifne            122
        //   117: aload_3        
        //   118: astore_1       
        //   119: goto            717
        //   122: aload           4
        //   124: ldc_w           "channel_url"
        //   127: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   130: astore          5
        //   132: aload           5
        //   134: instanceof      Lfc2/k;
        //   137: istore          6
        //   139: iload           6
        //   141: ifeq            626
        //   144: aload           4
        //   146: ldc_w           "channel_url"
        //   149: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   152: astore          4
        //   154: aload           4
        //   156: ldc             "this[key]"
        //   158: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   161: ldc             Ljava/lang/String;.class
        //   163: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   166: astore          5
        //   168: aload           5
        //   170: getstatic       java/lang/Byte.TYPE:Ljava/lang/Class;
        //   173: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   176: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   179: ifeq            197
        //   182: aload           4
        //   184: invokevirtual   fc2/g.e:()B
        //   187: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //   190: checkcast       Ljava/lang/String;
        //   193: astore_1       
        //   194: goto            695
        //   197: aload           5
        //   199: getstatic       java/lang/Short.TYPE:Ljava/lang/Class;
        //   202: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   205: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   208: ifeq            226
        //   211: aload           4
        //   213: invokevirtual   fc2/g.z:()S
        //   216: invokestatic    java/lang/Short.valueOf:(S)Ljava/lang/Short;
        //   219: checkcast       Ljava/lang/String;
        //   222: astore_1       
        //   223: goto            695
        //   226: aload           5
        //   228: getstatic       java/lang/Integer.TYPE:Ljava/lang/Class;
        //   231: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   234: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   237: ifeq            255
        //   240: aload           4
        //   242: invokevirtual   fc2/g.m:()I
        //   245: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   248: checkcast       Ljava/lang/String;
        //   251: astore_1       
        //   252: goto            695
        //   255: aload           5
        //   257: getstatic       java/lang/Long.TYPE:Ljava/lang/Class;
        //   260: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   263: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   266: ifeq            284
        //   269: aload           4
        //   271: invokevirtual   fc2/g.x:()J
        //   274: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   277: checkcast       Ljava/lang/String;
        //   280: astore_1       
        //   281: goto            695
        //   284: aload           5
        //   286: getstatic       java/lang/Float.TYPE:Ljava/lang/Class;
        //   289: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   292: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   295: ifeq            313
        //   298: aload           4
        //   300: invokevirtual   fc2/g.l:()F
        //   303: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   306: checkcast       Ljava/lang/String;
        //   309: astore_1       
        //   310: goto            695
        //   313: aload           5
        //   315: getstatic       java/lang/Double.TYPE:Ljava/lang/Class;
        //   318: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   321: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   324: ifeq            342
        //   327: aload           4
        //   329: invokevirtual   fc2/g.k:()D
        //   332: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //   335: checkcast       Ljava/lang/String;
        //   338: astore_1       
        //   339: goto            695
        //   342: aload           5
        //   344: ldc             Ljava/math/BigDecimal;.class
        //   346: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   349: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   352: ifeq            385
        //   355: aload           4
        //   357: invokevirtual   fc2/g.a:()Ljava/math/BigDecimal;
        //   360: astore_1       
        //   361: aload_1        
        //   362: ifnull          373
        //   365: aload_1        
        //   366: checkcast       Ljava/lang/String;
        //   369: astore_1       
        //   370: goto            695
        //   373: new             Ljava/lang/NullPointerException;
        //   376: astore_1       
        //   377: aload_1        
        //   378: ldc             "null cannot be cast to non-null type kotlin.String"
        //   380: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   383: aload_1        
        //   384: athrow         
        //   385: aload           5
        //   387: ldc             Ljava/math/BigInteger;.class
        //   389: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   392: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   395: ifeq            428
        //   398: aload           4
        //   400: invokevirtual   fc2/g.c:()Ljava/math/BigInteger;
        //   403: astore_1       
        //   404: aload_1        
        //   405: ifnull          416
        //   408: aload_1        
        //   409: checkcast       Ljava/lang/String;
        //   412: astore_1       
        //   413: goto            695
        //   416: new             Ljava/lang/NullPointerException;
        //   419: astore_1       
        //   420: aload_1        
        //   421: ldc             "null cannot be cast to non-null type kotlin.String"
        //   423: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   426: aload_1        
        //   427: athrow         
        //   428: aload           5
        //   430: getstatic       java/lang/Character.TYPE:Ljava/lang/Class;
        //   433: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   436: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   439: ifeq            457
        //   442: aload           4
        //   444: invokevirtual   fc2/g.i:()C
        //   447: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   450: checkcast       Ljava/lang/String;
        //   453: astore_1       
        //   454: goto            695
        //   457: aload           5
        //   459: ldc             Ljava/lang/String;.class
        //   461: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   464: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   467: ifeq            495
        //   470: aload           4
        //   472: invokevirtual   fc2/g.C:()Ljava/lang/String;
        //   475: astore_1       
        //   476: aload_1        
        //   477: ifnull          483
        //   480: goto            695
        //   483: new             Ljava/lang/NullPointerException;
        //   486: astore_1       
        //   487: aload_1        
        //   488: ldc             "null cannot be cast to non-null type kotlin.String"
        //   490: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   493: aload_1        
        //   494: athrow         
        //   495: aload           5
        //   497: getstatic       java/lang/Boolean.TYPE:Ljava/lang/Class;
        //   500: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   503: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   506: ifeq            524
        //   509: aload           4
        //   511: invokevirtual   fc2/g.d:()Z
        //   514: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   517: checkcast       Ljava/lang/String;
        //   520: astore_1       
        //   521: goto            695
        //   524: aload           5
        //   526: ldc             Lfc2/i;.class
        //   528: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   531: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   534: ifeq            549
        //   537: aload           4
        //   539: invokevirtual   fc2/g.p:()Lfc2/i;
        //   542: checkcast       Ljava/lang/String;
        //   545: astore_1       
        //   546: goto            695
        //   549: aload           5
        //   551: ldc             Lfc2/k;.class
        //   553: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   556: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   559: ifeq            574
        //   562: aload           4
        //   564: invokevirtual   fc2/g.q:()Lfc2/k;
        //   567: checkcast       Ljava/lang/String;
        //   570: astore_1       
        //   571: goto            695
        //   574: aload           5
        //   576: ldc             Lfc2/f;.class
        //   578: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   581: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   584: ifeq            599
        //   587: aload           4
        //   589: invokevirtual   fc2/g.n:()Lfc2/f;
        //   592: checkcast       Ljava/lang/String;
        //   595: astore_1       
        //   596: goto            695
        //   599: aload_3        
        //   600: astore_1       
        //   601: aload           5
        //   603: ldc             Lfc2/h;.class
        //   605: invokestatic    sg2/h.a:(Ljava/lang/Class;)Lzg2/d;
        //   608: invokestatic    sg2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   611: ifeq            717
        //   614: aload           4
        //   616: invokevirtual   fc2/g.o:()Lfc2/h;
        //   619: checkcast       Ljava/lang/String;
        //   622: astore_1       
        //   623: goto            695
        //   626: aload           5
        //   628: instanceof      Lfc2/i;
        //   631: ifeq            667
        //   634: aload           4
        //   636: ldc_w           "channel_url"
        //   639: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   642: astore_1       
        //   643: aload_1        
        //   644: ifnull          655
        //   647: aload_1        
        //   648: checkcast       Ljava/lang/String;
        //   651: astore_1       
        //   652: goto            695
        //   655: new             Ljava/lang/NullPointerException;
        //   658: astore_1       
        //   659: aload_1        
        //   660: ldc             "null cannot be cast to non-null type kotlin.String"
        //   662: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   665: aload_1        
        //   666: athrow         
        //   667: aload_3        
        //   668: astore_1       
        //   669: aload           5
        //   671: instanceof      Lfc2/f;
        //   674: ifeq            717
        //   677: aload           4
        //   679: ldc_w           "channel_url"
        //   682: invokevirtual   fc2/i.L:(Ljava/lang/String;)Lfc2/g;
        //   685: astore_1       
        //   686: aload_1        
        //   687: ifnull          698
        //   690: aload_1        
        //   691: checkcast       Ljava/lang/String;
        //   694: astore_1       
        //   695: goto            717
        //   698: new             Ljava/lang/NullPointerException;
        //   701: astore_1       
        //   702: aload_1        
        //   703: ldc             "null cannot be cast to non-null type kotlin.String"
        //   705: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   708: aload_1        
        //   709: athrow         
        //   710: astore_1       
        //   711: aload_1        
        //   712: invokestatic    ec2/a.d:(Ljava/lang/Exception;)V
        //   715: aload_3        
        //   716: astore_1       
        //   717: aload_1        
        //   718: ifnull          724
        //   721: goto            727
        //   724: ldc             ""
        //   726: astore_1       
        //   727: aload_1        
        //   728: areturn        
        //   729: astore_1       
        //   730: aload_3        
        //   731: astore_1       
        //   732: goto            717
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  122    139    710    717    Ljava/lang/Exception;
        //  144    161    710    717    Ljava/lang/Exception;
        //  161    194    729    735    Ljava/lang/Exception;
        //  197    223    729    735    Ljava/lang/Exception;
        //  226    252    729    735    Ljava/lang/Exception;
        //  255    281    729    735    Ljava/lang/Exception;
        //  284    310    729    735    Ljava/lang/Exception;
        //  313    339    729    735    Ljava/lang/Exception;
        //  342    361    729    735    Ljava/lang/Exception;
        //  365    370    729    735    Ljava/lang/Exception;
        //  373    385    729    735    Ljava/lang/Exception;
        //  385    404    729    735    Ljava/lang/Exception;
        //  408    413    729    735    Ljava/lang/Exception;
        //  416    428    729    735    Ljava/lang/Exception;
        //  428    454    729    735    Ljava/lang/Exception;
        //  457    476    729    735    Ljava/lang/Exception;
        //  483    495    729    735    Ljava/lang/Exception;
        //  495    521    729    735    Ljava/lang/Exception;
        //  524    546    729    735    Ljava/lang/Exception;
        //  549    571    729    735    Ljava/lang/Exception;
        //  574    596    729    735    Ljava/lang/Exception;
        //  601    623    729    735    Ljava/lang/Exception;
        //  626    643    710    717    Ljava/lang/Exception;
        //  647    652    710    717    Ljava/lang/Exception;
        //  655    667    710    717    Ljava/lang/Exception;
        //  669    686    710    717    Ljava/lang/Exception;
        //  690    695    710    717    Ljava/lang/Exception;
        //  698    710    710    717    Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0197:
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
    
    public final g c() {
        g a;
        try {
            a = j.a(this.b);
        }
        catch (final JsonSyntaxException ex) {
            a = new i();
        }
        return a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b2;
        final boolean b = b2 = false;
        if (o != null) {
            if (e.a((Object)o.getClass(), (Object)m0.class) ^ true) {
                b2 = b;
            }
            else {
                final m0 m0 = (m0)o;
                b2 = b;
                if (this.a == m0.a) {
                    b2 = b;
                    if (e.a((Object)this.c, (Object)m0.c)) {
                        b2 = true;
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return e0.J(new Object[] { this.a, this.c });
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Command{command='");
        r.append(this.a);
        r.append("', payload='");
        r.append(this.b);
        r.append("', requestId='");
        return a.o(r, this.c, "'}");
    }
    
    public static final class a
    {
        public static m0 a() {
            SendBird.e();
            final i i = new i();
            i.J("active", (int)(SendBird.f() ? 1 : 0));
            return new m0("PING", i, null);
        }
    }
    
    public interface b
    {
        void a(final m0 p0, final SendBirdException p1);
    }
}
