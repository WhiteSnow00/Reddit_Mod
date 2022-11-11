// 
// Decompiled by Procyon v0.6.0
// 

package pe;

public final class p4 implements Runnable
{
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        pe/p4.f:I
        //     4: istore_1       
        //     5: aconst_null    
        //     6: astore_2       
        //     7: aconst_null    
        //     8: astore_3       
        //     9: iload_1        
        //    10: tableswitch {
        //                0: 406
        //                1: 35
        //          default: 32
        //        }
        //    32: goto            1059
        //    35: aload_0        
        //    36: getfield        pe/p4.h:Ljava/lang/Object;
        //    39: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //    42: astore_3       
        //    43: aload_3        
        //    44: monitorenter   
        //    45: aload_0        
        //    46: getfield        pe/p4.i:Ljava/lang/Object;
        //    49: checkcast       Lpe/l6;
        //    52: getfield        z0/d1.f:Ljava/lang/Object;
        //    55: checkcast       Lpe/h4;
        //    58: invokevirtual   pe/h4.r:()Lpe/r3;
        //    61: invokevirtual   pe/r3.S:()Lpe/g;
        //    64: getstatic       com/google/android/gms/measurement/internal/zzah.zzb:Lcom/google/android/gms/measurement/internal/zzah;
        //    67: invokevirtual   pe/g.f:(Lcom/google/android/gms/measurement/internal/zzah;)Z
        //    70: ifne            177
        //    73: aload_0        
        //    74: getfield        pe/p4.i:Ljava/lang/Object;
        //    77: checkcast       Lpe/l6;
        //    80: getfield        z0/d1.f:Ljava/lang/Object;
        //    83: checkcast       Lpe/h4;
        //    86: invokevirtual   pe/h4.h:()Lpe/d3;
        //    89: getfield        pe/d3.p:Lpe/b3;
        //    92: ldc             "Analytics storage consent denied; will not get app instance id"
        //    94: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //    97: aload_0        
        //    98: getfield        pe/p4.i:Ljava/lang/Object;
        //   101: checkcast       Lpe/l6;
        //   104: getfield        z0/d1.f:Ljava/lang/Object;
        //   107: checkcast       Lpe/h4;
        //   110: invokevirtual   pe/h4.t:()Lpe/o5;
        //   113: getfield        pe/o5.l:Ljava/util/concurrent/atomic/AtomicReference;
        //   116: aconst_null    
        //   117: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   120: aload_0        
        //   121: getfield        pe/p4.i:Ljava/lang/Object;
        //   124: checkcast       Lpe/l6;
        //   127: getfield        z0/d1.f:Ljava/lang/Object;
        //   130: checkcast       Lpe/h4;
        //   133: invokevirtual   pe/h4.r:()Lpe/r3;
        //   136: getfield        pe/r3.k:Lpe/q3;
        //   139: aconst_null    
        //   140: invokevirtual   pe/q3.b:(Ljava/lang/String;)V
        //   143: aload_0        
        //   144: getfield        pe/p4.h:Ljava/lang/Object;
        //   147: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   150: aconst_null    
        //   151: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   154: aload_0        
        //   155: getfield        pe/p4.h:Ljava/lang/Object;
        //   158: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   161: astore_2       
        //   162: aload_2        
        //   163: invokevirtual   java/lang/Object.notify:()V
        //   166: goto            226
        //   169: astore_2       
        //   170: goto            389
        //   173: astore_2       
        //   174: goto            349
        //   177: aload_0        
        //   178: getfield        pe/p4.i:Ljava/lang/Object;
        //   181: checkcast       Lpe/l6;
        //   184: astore          4
        //   186: aload           4
        //   188: getfield        pe/l6.i:Lpe/u2;
        //   191: astore_2       
        //   192: aload_2        
        //   193: ifnonnull       231
        //   196: aload           4
        //   198: getfield        z0/d1.f:Ljava/lang/Object;
        //   201: checkcast       Lpe/h4;
        //   204: invokevirtual   pe/h4.h:()Lpe/d3;
        //   207: getfield        pe/d3.k:Lpe/b3;
        //   210: ldc             "Failed to get app instance id"
        //   212: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //   215: aload_0        
        //   216: getfield        pe/p4.h:Ljava/lang/Object;
        //   219: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   222: astore_2       
        //   223: goto            162
        //   226: aload_3        
        //   227: monitorexit    
        //   228: goto            388
        //   231: aload_0        
        //   232: getfield        pe/p4.g:Ljava/lang/Object;
        //   235: checkcast       Lpe/q7;
        //   238: invokestatic    lw0/b.R:(Ljava/lang/Object;)V
        //   241: aload_0        
        //   242: getfield        pe/p4.h:Ljava/lang/Object;
        //   245: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   248: aload_2        
        //   249: aload_0        
        //   250: getfield        pe/p4.g:Ljava/lang/Object;
        //   253: checkcast       Lpe/q7;
        //   256: invokeinterface pe/u2.k0:(Lpe/q7;)Ljava/lang/String;
        //   261: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   264: aload_0        
        //   265: getfield        pe/p4.h:Ljava/lang/Object;
        //   268: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   271: invokevirtual   java/util/concurrent/atomic/AtomicReference.get:()Ljava/lang/Object;
        //   274: checkcast       Ljava/lang/String;
        //   277: astore_2       
        //   278: aload_2        
        //   279: ifnull          328
        //   282: aload_0        
        //   283: getfield        pe/p4.i:Ljava/lang/Object;
        //   286: checkcast       Lpe/l6;
        //   289: getfield        z0/d1.f:Ljava/lang/Object;
        //   292: checkcast       Lpe/h4;
        //   295: invokevirtual   pe/h4.t:()Lpe/o5;
        //   298: getfield        pe/o5.l:Ljava/util/concurrent/atomic/AtomicReference;
        //   301: aload_2        
        //   302: invokevirtual   java/util/concurrent/atomic/AtomicReference.set:(Ljava/lang/Object;)V
        //   305: aload_0        
        //   306: getfield        pe/p4.i:Ljava/lang/Object;
        //   309: checkcast       Lpe/l6;
        //   312: getfield        z0/d1.f:Ljava/lang/Object;
        //   315: checkcast       Lpe/h4;
        //   318: invokevirtual   pe/h4.r:()Lpe/r3;
        //   321: getfield        pe/r3.k:Lpe/q3;
        //   324: aload_2        
        //   325: invokevirtual   pe/q3.b:(Ljava/lang/String;)V
        //   328: aload_0        
        //   329: getfield        pe/p4.i:Ljava/lang/Object;
        //   332: checkcast       Lpe/l6;
        //   335: invokevirtual   pe/l6.X:()V
        //   338: aload_0        
        //   339: getfield        pe/p4.h:Ljava/lang/Object;
        //   342: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   345: astore_2       
        //   346: goto            382
        //   349: aload_0        
        //   350: getfield        pe/p4.i:Ljava/lang/Object;
        //   353: checkcast       Lpe/l6;
        //   356: getfield        z0/d1.f:Ljava/lang/Object;
        //   359: checkcast       Lpe/h4;
        //   362: invokevirtual   pe/h4.h:()Lpe/d3;
        //   365: getfield        pe/d3.k:Lpe/b3;
        //   368: aload_2        
        //   369: ldc             "Failed to get app instance id"
        //   371: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   374: aload_0        
        //   375: getfield        pe/p4.h:Ljava/lang/Object;
        //   378: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   381: astore_2       
        //   382: aload_2        
        //   383: invokevirtual   java/lang/Object.notify:()V
        //   386: aload_3        
        //   387: monitorexit    
        //   388: return         
        //   389: aload_0        
        //   390: getfield        pe/p4.h:Ljava/lang/Object;
        //   393: checkcast       Ljava/util/concurrent/atomic/AtomicReference;
        //   396: invokevirtual   java/lang/Object.notify:()V
        //   399: aload_2        
        //   400: athrow         
        //   401: astore_2       
        //   402: aload_3        
        //   403: monitorexit    
        //   404: aload_2        
        //   405: athrow         
        //   406: aload_0        
        //   407: getfield        pe/p4.i:Ljava/lang/Object;
        //   410: checkcast       Lpe/u4;
        //   413: astore          5
        //   415: aload_0        
        //   416: getfield        pe/p4.h:Ljava/lang/Object;
        //   419: checkcast       Lpe/t;
        //   422: astore          4
        //   424: aload           5
        //   426: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   429: pop            
        //   430: aload           4
        //   432: astore_2       
        //   433: ldc             "_cmp"
        //   435: aload           4
        //   437: getfield        pe/t.f:Ljava/lang/String;
        //   440: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   443: ifeq            562
        //   446: aload           4
        //   448: getfield        pe/t.g:Lpe/r;
        //   451: astore          6
        //   453: aload           4
        //   455: astore_2       
        //   456: aload           6
        //   458: ifnull          562
        //   461: aload           6
        //   463: getfield        pe/r.f:Landroid/os/Bundle;
        //   466: invokevirtual   android/os/BaseBundle.size:()I
        //   469: ifne            478
        //   472: aload           4
        //   474: astore_2       
        //   475: goto            562
        //   478: aload           4
        //   480: getfield        pe/t.g:Lpe/r;
        //   483: getfield        pe/r.f:Landroid/os/Bundle;
        //   486: ldc             "_cis"
        //   488: invokevirtual   android/os/BaseBundle.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   491: astore          6
        //   493: ldc             "referrer broadcast"
        //   495: aload           6
        //   497: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   500: ifne            516
        //   503: aload           4
        //   505: astore_2       
        //   506: ldc             "referrer API"
        //   508: aload           6
        //   510: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   513: ifeq            562
        //   516: aload           5
        //   518: getfield        pe/u4.a:Lpe/g7;
        //   521: invokevirtual   pe/g7.h:()Lpe/d3;
        //   524: getfield        pe/d3.q:Lpe/b3;
        //   527: aload           4
        //   529: invokevirtual   pe/t.toString:()Ljava/lang/String;
        //   532: ldc             "Event has been filtered "
        //   534: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   537: new             Lpe/t;
        //   540: dup            
        //   541: ldc             "_cmpx"
        //   543: aload           4
        //   545: getfield        pe/t.g:Lpe/r;
        //   548: aload           4
        //   550: getfield        pe/t.h:Ljava/lang/String;
        //   553: aload           4
        //   555: getfield        pe/t.i:J
        //   558: invokespecial   pe/t.<init>:(Ljava/lang/String;Lpe/r;Ljava/lang/String;J)V
        //   561: astore_2       
        //   562: aload_0        
        //   563: getfield        pe/p4.i:Ljava/lang/Object;
        //   566: checkcast       Lpe/u4;
        //   569: astore          7
        //   571: aload_0        
        //   572: getfield        pe/p4.g:Ljava/lang/Object;
        //   575: checkcast       Lpe/q7;
        //   578: astore          6
        //   580: aload           7
        //   582: getfield        pe/u4.a:Lpe/g7;
        //   585: getfield        pe/g7.f:Lpe/b4;
        //   588: astore          4
        //   590: aload           4
        //   592: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   595: aload           4
        //   597: aload           6
        //   599: getfield        pe/q7.f:Ljava/lang/String;
        //   602: invokevirtual   pe/b4.Y:(Ljava/lang/String;)Z
        //   605: ifne            619
        //   608: aload           7
        //   610: aload_2        
        //   611: aload           6
        //   613: invokevirtual   pe/u4.o:(Lpe/t;Lpe/q7;)V
        //   616: goto            1058
        //   619: aload           7
        //   621: getfield        pe/u4.a:Lpe/g7;
        //   624: invokevirtual   pe/g7.h:()Lpe/d3;
        //   627: getfield        pe/d3.s:Lpe/b3;
        //   630: aload           6
        //   632: getfield        pe/q7.f:Ljava/lang/String;
        //   635: ldc             "EES config found for"
        //   637: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   640: aload           7
        //   642: getfield        pe/u4.a:Lpe/g7;
        //   645: getfield        pe/g7.f:Lpe/b4;
        //   648: astore          5
        //   650: aload           5
        //   652: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   655: aload           6
        //   657: getfield        pe/q7.f:Ljava/lang/String;
        //   660: astore          4
        //   662: aload           4
        //   664: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   667: ifeq            673
        //   670: goto            687
        //   673: aload           5
        //   675: getfield        pe/b4.o:Lpe/z3;
        //   678: aload           4
        //   680: invokevirtual   j0/g.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   683: checkcast       Lie/q0;
        //   686: astore_3       
        //   687: aload_3        
        //   688: ifnull          1028
        //   691: aload           7
        //   693: getfield        pe/u4.a:Lpe/g7;
        //   696: getfield        pe/g7.l:Lpe/i7;
        //   699: astore          4
        //   701: aload           4
        //   703: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   706: aload           4
        //   708: aload_2        
        //   709: getfield        pe/t.g:Lpe/r;
        //   712: invokevirtual   pe/r.q:()Landroid/os/Bundle;
        //   715: iconst_1       
        //   716: invokevirtual   pe/i7.k0:(Landroid/os/Bundle;Z)Ljava/util/HashMap;
        //   719: astore          8
        //   721: aload_2        
        //   722: getfield        pe/t.f:Ljava/lang/String;
        //   725: getstatic       pd/r.i:[Ljava/lang/String;
        //   728: getstatic       pd/r.g:[Ljava/lang/String;
        //   731: invokestatic    lq0/k.Z0:(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;
        //   734: astore          5
        //   736: aload           5
        //   738: astore          4
        //   740: aload           5
        //   742: ifnonnull       751
        //   745: aload_2        
        //   746: getfield        pe/t.f:Ljava/lang/String;
        //   749: astore          4
        //   751: new             Lie/b;
        //   754: astore          5
        //   756: aload           5
        //   758: aload_2        
        //   759: getfield        pe/t.i:J
        //   762: aload           4
        //   764: aload           8
        //   766: invokespecial   ie/b.<init>:(JLjava/lang/String;Ljava/util/HashMap;)V
        //   769: aload_3        
        //   770: aload           5
        //   772: invokevirtual   ie/q0.b:(Lie/b;)Z
        //   775: istore          9
        //   777: iload           9
        //   779: ifne            785
        //   782: goto            996
        //   785: aload_3        
        //   786: getfield        ie/q0.c:Lie/c;
        //   789: astore          4
        //   791: aload           4
        //   793: getfield        ie/c.b:Lie/b;
        //   796: aload           4
        //   798: getfield        ie/c.a:Lie/b;
        //   801: invokevirtual   ie/b.equals:(Ljava/lang/Object;)Z
        //   804: iconst_1       
        //   805: ixor           
        //   806: ifeq            864
        //   809: aload           7
        //   811: getfield        pe/u4.a:Lpe/g7;
        //   814: invokevirtual   pe/g7.h:()Lpe/d3;
        //   817: getfield        pe/d3.s:Lpe/b3;
        //   820: aload_2        
        //   821: getfield        pe/t.f:Ljava/lang/String;
        //   824: ldc_w           "EES edited event"
        //   827: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   830: aload           7
        //   832: getfield        pe/u4.a:Lpe/g7;
        //   835: getfield        pe/g7.l:Lpe/i7;
        //   838: astore_2       
        //   839: aload_2        
        //   840: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   843: aload           7
        //   845: aload_2        
        //   846: aload_3        
        //   847: getfield        ie/q0.c:Lie/c;
        //   850: getfield        ie/c.b:Lie/b;
        //   853: invokevirtual   pe/i7.d0:(Lie/b;)Lpe/t;
        //   856: aload           6
        //   858: invokevirtual   pe/u4.o:(Lpe/t;Lpe/q7;)V
        //   861: goto            872
        //   864: aload           7
        //   866: aload_2        
        //   867: aload           6
        //   869: invokevirtual   pe/u4.o:(Lpe/t;Lpe/q7;)V
        //   872: iconst_1       
        //   873: aload_3        
        //   874: getfield        ie/q0.c:Lie/c;
        //   877: getfield        ie/c.c:Ljava/util/ArrayList;
        //   880: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   883: ixor           
        //   884: ifeq            1058
        //   887: aload_3        
        //   888: getfield        ie/q0.c:Lie/c;
        //   891: getfield        ie/c.c:Ljava/util/ArrayList;
        //   894: invokevirtual   java/util/ArrayList.iterator:()Ljava/util/Iterator;
        //   897: astore_3       
        //   898: aload_3        
        //   899: invokeinterface java/util/Iterator.hasNext:()Z
        //   904: ifeq            1058
        //   907: aload_3        
        //   908: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   913: checkcast       Lie/b;
        //   916: astore_2       
        //   917: aload           7
        //   919: getfield        pe/u4.a:Lpe/g7;
        //   922: invokevirtual   pe/g7.h:()Lpe/d3;
        //   925: getfield        pe/d3.s:Lpe/b3;
        //   928: aload_2        
        //   929: getfield        ie/b.a:Ljava/lang/String;
        //   932: ldc_w           "EES logging created event"
        //   935: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   938: aload           7
        //   940: getfield        pe/u4.a:Lpe/g7;
        //   943: getfield        pe/g7.l:Lpe/i7;
        //   946: astore          4
        //   948: aload           4
        //   950: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   953: aload           7
        //   955: aload           4
        //   957: aload_2        
        //   958: invokevirtual   pe/i7.d0:(Lie/b;)Lpe/t;
        //   961: aload           6
        //   963: invokevirtual   pe/u4.o:(Lpe/t;Lpe/q7;)V
        //   966: goto            898
        //   969: astore_3       
        //   970: aload           7
        //   972: getfield        pe/u4.a:Lpe/g7;
        //   975: invokevirtual   pe/g7.h:()Lpe/d3;
        //   978: getfield        pe/d3.k:Lpe/b3;
        //   981: aload           6
        //   983: getfield        pe/q7.g:Ljava/lang/String;
        //   986: ldc_w           "EES error. appId, eventName"
        //   989: aload_2        
        //   990: getfield        pe/t.f:Ljava/lang/String;
        //   993: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   996: aload           7
        //   998: getfield        pe/u4.a:Lpe/g7;
        //  1001: invokevirtual   pe/g7.h:()Lpe/d3;
        //  1004: getfield        pe/d3.s:Lpe/b3;
        //  1007: aload_2        
        //  1008: getfield        pe/t.f:Ljava/lang/String;
        //  1011: ldc_w           "EES was not applied to event"
        //  1014: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1017: aload           7
        //  1019: aload_2        
        //  1020: aload           6
        //  1022: invokevirtual   pe/u4.o:(Lpe/t;Lpe/q7;)V
        //  1025: goto            1058
        //  1028: aload           7
        //  1030: getfield        pe/u4.a:Lpe/g7;
        //  1033: invokevirtual   pe/g7.h:()Lpe/d3;
        //  1036: getfield        pe/d3.s:Lpe/b3;
        //  1039: aload           6
        //  1041: getfield        pe/q7.f:Ljava/lang/String;
        //  1044: ldc_w           "EES not loaded for"
        //  1047: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1050: aload           7
        //  1052: aload_2        
        //  1053: aload           6
        //  1055: invokevirtual   pe/u4.o:(Lpe/t;Lpe/q7;)V
        //  1058: return         
        //  1059: aload_0        
        //  1060: getfield        pe/p4.i:Ljava/lang/Object;
        //  1063: checkcast       Lgg/p;
        //  1066: getfield        gg/p.c:Lgg/r;
        //  1069: astore_3       
        //  1070: aload_0        
        //  1071: getfield        pe/p4.h:Ljava/lang/Object;
        //  1074: checkcast       Ljava/util/List;
        //  1077: astore          4
        //  1079: aload_3        
        //  1080: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1083: pop            
        //  1084: aload           4
        //  1086: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1091: astore          4
        //  1093: aload           4
        //  1095: invokeinterface java/util/Iterator.hasNext:()Z
        //  1100: istore          9
        //  1102: iload           9
        //  1104: ifeq            1149
        //  1107: aload           4
        //  1109: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1114: checkcast       Landroid/content/Intent;
        //  1117: ldc_w           "split_id"
        //  1120: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1123: astore          5
        //  1125: aload_3        
        //  1126: getfield        gg/r.a:Lkg/f;
        //  1129: aload           5
        //  1131: invokevirtual   kg/f.a:(Ljava/lang/String;)Ljava/io/File;
        //  1134: invokevirtual   java/io/File.exists:()Z
        //  1137: istore          9
        //  1139: iload           9
        //  1141: ifne            1093
        //  1144: iconst_0       
        //  1145: istore_1       
        //  1146: goto            1151
        //  1149: iconst_1       
        //  1150: istore_1       
        //  1151: iload_1        
        //  1152: ifeq            1266
        //  1155: aload_0        
        //  1156: getfield        pe/p4.i:Ljava/lang/Object;
        //  1159: checkcast       Lgg/p;
        //  1162: astore_2       
        //  1163: aload_0        
        //  1164: getfield        pe/p4.g:Ljava/lang/Object;
        //  1167: checkcast       Llg/u;
        //  1170: astore          4
        //  1172: aload_2        
        //  1173: getfield        gg/p.a:Landroid/content/Context;
        //  1176: astore_2       
        //  1177: aload_2        
        //  1178: invokevirtual   android/content/Context.getApplicationContext:()Landroid/content/Context;
        //  1181: astore_3       
        //  1182: aload_3        
        //  1183: ifnull          1188
        //  1186: aload_3        
        //  1187: astore_2       
        //  1188: aload_2        
        //  1189: iconst_1       
        //  1190: invokestatic    kg/a.c:(Landroid/content/Context;Z)Z
        //  1193: istore          9
        //  1195: iload           9
        //  1197: ifne            1222
        //  1200: ldc_w           "SplitCompat"
        //  1203: ldc_w           "Emulating splits failed."
        //  1206: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //  1209: pop            
        //  1210: aload           4
        //  1212: bipush          -12
        //  1214: invokeinterface lg/u.a:(I)V
        //  1219: goto            2052
        //  1222: ldc_w           "SplitCompat"
        //  1225: ldc_w           "Splits installed."
        //  1228: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //  1231: pop            
        //  1232: aload           4
        //  1234: invokeinterface lg/u.zza:()V
        //  1239: goto            2052
        //  1242: astore_2       
        //  1243: ldc_w           "SplitCompat"
        //  1246: ldc_w           "Error emulating splits."
        //  1249: aload_2        
        //  1250: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1253: pop            
        //  1254: aload           4
        //  1256: bipush          -12
        //  1258: invokeinterface lg/u.a:(I)V
        //  1263: goto            2052
        //  1266: aload_0        
        //  1267: getfield        pe/p4.i:Ljava/lang/Object;
        //  1270: checkcast       Lgg/p;
        //  1273: astore          6
        //  1275: aload_0        
        //  1276: getfield        pe/p4.h:Ljava/lang/Object;
        //  1279: checkcast       Ljava/util/List;
        //  1282: astore          7
        //  1284: aload_0        
        //  1285: getfield        pe/p4.g:Ljava/lang/Object;
        //  1288: checkcast       Llg/u;
        //  1291: astore          4
        //  1293: aload           6
        //  1295: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1298: pop            
        //  1299: new             Ljava/io/RandomAccessFile;
        //  1302: astore          5
        //  1304: aload           6
        //  1306: getfield        gg/p.b:Lkg/f;
        //  1309: astore          8
        //  1311: aload           8
        //  1313: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1316: pop            
        //  1317: new             Ljava/io/File;
        //  1320: astore_3       
        //  1321: aload_3        
        //  1322: aload           8
        //  1324: invokevirtual   kg/f.h:()Ljava/io/File;
        //  1327: ldc_w           "lock.tmp"
        //  1330: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1333: aload           5
        //  1335: aload_3        
        //  1336: ldc_w           "rw"
        //  1339: invokespecial   java/io/RandomAccessFile.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1342: aload           5
        //  1344: invokevirtual   java/io/RandomAccessFile.getChannel:()Ljava/nio/channels/FileChannel;
        //  1347: astore          5
        //  1349: aload           5
        //  1351: invokevirtual   java/nio/channels/FileChannel.tryLock:()Ljava/nio/channels/FileLock;
        //  1354: astore_3       
        //  1355: goto            1361
        //  1358: astore_3       
        //  1359: aconst_null    
        //  1360: astore_3       
        //  1361: aload_3        
        //  1362: ifnull          1953
        //  1365: ldc_w           "SplitCompat"
        //  1368: ldc_w           "Copying splits."
        //  1371: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //  1374: pop            
        //  1375: aload           7
        //  1377: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1382: astore_2       
        //  1383: aload_2        
        //  1384: invokeinterface java/util/Iterator.hasNext:()Z
        //  1389: ifeq            1628
        //  1392: aload_2        
        //  1393: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1398: checkcast       Landroid/content/Intent;
        //  1401: astore          8
        //  1403: aload           8
        //  1405: ldc_w           "split_id"
        //  1408: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1411: astore          7
        //  1413: aload           6
        //  1415: getfield        gg/p.a:Landroid/content/Context;
        //  1418: invokevirtual   android/content/Context.getContentResolver:()Landroid/content/ContentResolver;
        //  1421: aload           8
        //  1423: invokevirtual   android/content/Intent.getData:()Landroid/net/Uri;
        //  1426: ldc_w           "r"
        //  1429: invokevirtual   android/content/ContentResolver.openAssetFileDescriptor:(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
        //  1432: astore          8
        //  1434: aload           6
        //  1436: getfield        gg/p.b:Lkg/f;
        //  1439: astore          10
        //  1441: aload           10
        //  1443: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1446: pop            
        //  1447: new             Ljava/io/File;
        //  1450: astore          11
        //  1452: aload           11
        //  1454: aload           10
        //  1456: invokevirtual   kg/f.h:()Ljava/io/File;
        //  1459: ldc_w           "unverified-splits"
        //  1462: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1465: aload           11
        //  1467: invokestatic    kg/f.f:(Ljava/io/File;)V
        //  1470: aload           11
        //  1472: aload           7
        //  1474: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1477: ldc_w           ".apk"
        //  1480: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //  1483: invokestatic    kg/f.e:(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
        //  1486: astore          10
        //  1488: aload           10
        //  1490: invokevirtual   java/io/File.exists:()Z
        //  1493: ifeq            1513
        //  1496: aload           10
        //  1498: invokevirtual   java/io/File.length:()J
        //  1501: aload           8
        //  1503: invokevirtual   android/content/res/AssetFileDescriptor.getLength:()J
        //  1506: lcmp           
        //  1507: ifeq            1513
        //  1510: goto            1521
        //  1513: aload           10
        //  1515: invokevirtual   java/io/File.exists:()Z
        //  1518: ifne            1383
        //  1521: aload           6
        //  1523: getfield        gg/p.b:Lkg/f;
        //  1526: aload           7
        //  1528: invokevirtual   kg/f.a:(Ljava/lang/String;)Ljava/io/File;
        //  1531: invokevirtual   java/io/File.exists:()Z
        //  1534: ifne            1383
        //  1537: new             Ljava/io/BufferedInputStream;
        //  1540: astore          7
        //  1542: aload           7
        //  1544: aload           8
        //  1546: invokevirtual   android/content/res/AssetFileDescriptor.createInputStream:()Ljava/io/FileInputStream;
        //  1549: invokespecial   java/io/BufferedInputStream.<init>:(Ljava/io/InputStream;)V
        //  1552: new             Ljava/io/FileOutputStream;
        //  1555: astore          8
        //  1557: aload           8
        //  1559: aload           10
        //  1561: invokespecial   java/io/FileOutputStream.<init>:(Ljava/io/File;)V
        //  1564: sipush          4096
        //  1567: newarray        B
        //  1569: astore          10
        //  1571: aload           7
        //  1573: aload           10
        //  1575: invokevirtual   java/io/InputStream.read:([B)I
        //  1578: istore_1       
        //  1579: iload_1        
        //  1580: ifle            1595
        //  1583: aload           8
        //  1585: aload           10
        //  1587: iconst_0       
        //  1588: iload_1        
        //  1589: invokevirtual   java/io/OutputStream.write:([BII)V
        //  1592: goto            1571
        //  1595: aload           8
        //  1597: invokevirtual   java/io/OutputStream.close:()V
        //  1600: aload           7
        //  1602: invokevirtual   java/io/InputStream.close:()V
        //  1605: goto            1383
        //  1608: astore_2       
        //  1609: aload           8
        //  1611: invokevirtual   java/io/OutputStream.close:()V
        //  1614: aload_2        
        //  1615: athrow         
        //  1616: astore_2       
        //  1617: aload           7
        //  1619: invokevirtual   java/io/InputStream.close:()V
        //  1622: aload_2        
        //  1623: athrow         
        //  1624: astore_2       
        //  1625: goto            1941
        //  1628: ldc_w           "SplitCompat"
        //  1631: ldc_w           "Splits copied."
        //  1634: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //  1637: pop            
        //  1638: aload           6
        //  1640: getfield        gg/p.b:Lkg/f;
        //  1643: astore_2       
        //  1644: aload_2        
        //  1645: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1648: pop            
        //  1649: new             Ljava/io/File;
        //  1652: astore          7
        //  1654: aload           7
        //  1656: aload_2        
        //  1657: invokevirtual   kg/f.h:()Ljava/io/File;
        //  1660: ldc_w           "unverified-splits"
        //  1663: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1666: aload           7
        //  1668: invokestatic    kg/f.f:(Ljava/io/File;)V
        //  1671: aload           7
        //  1673: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //  1676: astore_2       
        //  1677: aload           6
        //  1679: getfield        gg/p.c:Lgg/r;
        //  1682: aload_2        
        //  1683: invokevirtual   gg/r.b:([Ljava/io/File;)Z
        //  1686: ifeq            1868
        //  1689: aload           6
        //  1691: getfield        gg/p.c:Lgg/r;
        //  1694: aload_2        
        //  1695: invokevirtual   gg/r.a:([Ljava/io/File;)Z
        //  1698: istore          9
        //  1700: iload           9
        //  1702: ifeq            1868
        //  1705: aload           6
        //  1707: getfield        gg/p.b:Lkg/f;
        //  1710: astore          7
        //  1712: aload           7
        //  1714: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1717: pop            
        //  1718: new             Ljava/io/File;
        //  1721: astore_2       
        //  1722: aload_2        
        //  1723: aload           7
        //  1725: invokevirtual   kg/f.h:()Ljava/io/File;
        //  1728: ldc_w           "unverified-splits"
        //  1731: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1734: aload_2        
        //  1735: invokestatic    kg/f.f:(Ljava/io/File;)V
        //  1738: aload_2        
        //  1739: invokevirtual   java/io/File.listFiles:()[Ljava/io/File;
        //  1742: astore_2       
        //  1743: aload_2        
        //  1744: invokestatic    java/util/Arrays.sort:([Ljava/lang/Object;)V
        //  1747: aload_2        
        //  1748: arraylength    
        //  1749: istore_1       
        //  1750: iinc            1, -1
        //  1753: iload_1        
        //  1754: iflt            1838
        //  1757: aload_2        
        //  1758: iload_1        
        //  1759: aaload         
        //  1760: astore          7
        //  1762: aload           7
        //  1764: iconst_0       
        //  1765: iconst_1       
        //  1766: invokevirtual   java/io/File.setWritable:(ZZ)Z
        //  1769: pop            
        //  1770: aload           7
        //  1772: iconst_0       
        //  1773: iconst_0       
        //  1774: invokevirtual   java/io/File.setWritable:(ZZ)Z
        //  1777: pop            
        //  1778: aload_2        
        //  1779: iload_1        
        //  1780: aaload         
        //  1781: astore          7
        //  1783: aload           6
        //  1785: getfield        gg/p.b:Lkg/f;
        //  1788: astore          8
        //  1790: aload           8
        //  1792: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1795: pop            
        //  1796: new             Ljava/io/File;
        //  1799: astore          10
        //  1801: aload           10
        //  1803: aload           8
        //  1805: invokevirtual   kg/f.h:()Ljava/io/File;
        //  1808: ldc_w           "verified-splits"
        //  1811: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //  1814: aload           10
        //  1816: invokestatic    kg/f.f:(Ljava/io/File;)V
        //  1819: aload           7
        //  1821: aload           10
        //  1823: aload           7
        //  1825: invokevirtual   java/io/File.getName:()Ljava/lang/String;
        //  1828: invokestatic    kg/f.e:(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
        //  1831: invokevirtual   java/io/File.renameTo:(Ljava/io/File;)Z
        //  1834: pop            
        //  1835: goto            1750
        //  1838: ldc_w           "SplitCompat"
        //  1841: ldc_w           "Splits verified."
        //  1844: invokestatic    android/util/Log.i:(Ljava/lang/String;Ljava/lang/String;)I
        //  1847: pop            
        //  1848: iconst_0       
        //  1849: istore_1       
        //  1850: goto            1929
        //  1853: astore_2       
        //  1854: ldc_w           "SplitCompat"
        //  1857: ldc_w           "Cannot write verified split."
        //  1860: aload_2        
        //  1861: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1864: pop            
        //  1865: goto            1926
        //  1868: ldc_w           "SplitCompat"
        //  1871: ldc_w           "Split verification failed."
        //  1874: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;)I
        //  1877: pop            
        //  1878: goto            1893
        //  1881: astore_2       
        //  1882: ldc_w           "SplitCompat"
        //  1885: ldc_w           "Error verifying splits."
        //  1888: aload_2        
        //  1889: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1892: pop            
        //  1893: bipush          -11
        //  1895: istore_1       
        //  1896: goto            1929
        //  1899: astore_2       
        //  1900: ldc_w           "SplitCompat"
        //  1903: ldc_w           "Cannot access directory for unverified splits."
        //  1906: aload_2        
        //  1907: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1910: pop            
        //  1911: goto            1926
        //  1914: astore_2       
        //  1915: ldc_w           "SplitCompat"
        //  1918: ldc_w           "Error copying splits."
        //  1921: aload_2        
        //  1922: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1925: pop            
        //  1926: bipush          -13
        //  1928: istore_1       
        //  1929: iload_1        
        //  1930: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1933: astore_2       
        //  1934: aload_3        
        //  1935: invokevirtual   java/nio/channels/FileLock.release:()V
        //  1938: goto            1953
        //  1941: aload           5
        //  1943: ifnull          1951
        //  1946: aload           5
        //  1948: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //  1951: aload_2        
        //  1952: athrow         
        //  1953: aload_2        
        //  1954: astore_3       
        //  1955: aload           5
        //  1957: ifnull          1988
        //  1960: aload           5
        //  1962: invokevirtual   java/nio/channels/spi/AbstractInterruptibleChannel.close:()V
        //  1965: aload_2        
        //  1966: astore_3       
        //  1967: goto            1988
        //  1970: astore_2       
        //  1971: ldc_w           "SplitCompat"
        //  1974: ldc_w           "Error locking files."
        //  1977: aload_2        
        //  1978: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1981: pop            
        //  1982: bipush          -13
        //  1984: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1987: astore_3       
        //  1988: aload_3        
        //  1989: ifnonnull       1995
        //  1992: goto            2052
        //  1995: aload_3        
        //  1996: invokevirtual   java/lang/Integer.intValue:()I
        //  1999: ifne            2012
        //  2002: aload           4
        //  2004: invokeinterface lg/u.s:()V
        //  2009: goto            2052
        //  2012: aload           4
        //  2014: aload_3        
        //  2015: invokevirtual   java/lang/Integer.intValue:()I
        //  2018: invokeinterface lg/u.a:(I)V
        //  2023: goto            2052
        //  2026: astore_2       
        //  2027: ldc_w           "SplitCompat"
        //  2030: ldc_w           "Error checking verified files."
        //  2033: aload_2        
        //  2034: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  2037: pop            
        //  2038: aload_0        
        //  2039: getfield        pe/p4.g:Ljava/lang/Object;
        //  2042: checkcast       Llg/u;
        //  2045: bipush          -11
        //  2047: invokeinterface lg/u.a:(I)V
        //  2052: return         
        //  2053: astore          6
        //  2055: goto            1614
        //  2058: astore          6
        //  2060: goto            1622
        //  2063: astore_3       
        //  2064: goto            1951
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                             
        //  -----  -----  -----  -----  -------------------------------------------------
        //  45     154    173    382    Landroid/os/RemoteException;
        //  45     154    169    173    Any
        //  154    162    401    406    Any
        //  162    166    401    406    Any
        //  177    192    173    382    Landroid/os/RemoteException;
        //  177    192    169    173    Any
        //  196    215    173    382    Landroid/os/RemoteException;
        //  196    215    169    173    Any
        //  215    223    401    406    Any
        //  226    228    401    406    Any
        //  231    278    173    382    Landroid/os/RemoteException;
        //  231    278    169    173    Any
        //  282    328    173    382    Landroid/os/RemoteException;
        //  282    328    169    173    Any
        //  328    338    173    382    Landroid/os/RemoteException;
        //  328    338    169    173    Any
        //  338    346    401    406    Any
        //  349    374    169    173    Any
        //  374    382    401    406    Any
        //  382    388    401    406    Any
        //  389    401    401    406    Any
        //  402    404    401    406    Any
        //  691    736    969    996    Lcom/google/android/gms/internal/measurement/zzd;
        //  745    751    969    996    Lcom/google/android/gms/internal/measurement/zzd;
        //  751    777    969    996    Lcom/google/android/gms/internal/measurement/zzd;
        //  1059   1093   2026   2052   Ljava/lang/Exception;
        //  1093   1102   2026   2052   Ljava/lang/Exception;
        //  1107   1139   2026   2052   Ljava/lang/Exception;
        //  1172   1182   1242   1266   Ljava/lang/Exception;
        //  1188   1195   1242   1266   Ljava/lang/Exception;
        //  1299   1349   1970   1988   Ljava/lang/Exception;
        //  1349   1355   1358   1361   Ljava/nio/channels/OverlappingFileLockException;
        //  1349   1355   1624   1953   Any
        //  1365   1383   1914   1926   Ljava/lang/Exception;
        //  1365   1383   1624   1953   Any
        //  1383   1510   1914   1926   Ljava/lang/Exception;
        //  1383   1510   1624   1953   Any
        //  1513   1521   1914   1926   Ljava/lang/Exception;
        //  1513   1521   1624   1953   Any
        //  1521   1552   1914   1926   Ljava/lang/Exception;
        //  1521   1552   1624   1953   Any
        //  1552   1564   1616   1624   Any
        //  1564   1571   1608   1616   Any
        //  1571   1579   1608   1616   Any
        //  1583   1592   1608   1616   Any
        //  1595   1600   1616   1624   Any
        //  1600   1605   1914   1926   Ljava/lang/Exception;
        //  1600   1605   1624   1953   Any
        //  1609   1614   2053   2058   Any
        //  1614   1616   1616   1624   Any
        //  1617   1622   2058   2063   Any
        //  1622   1624   1914   1926   Ljava/lang/Exception;
        //  1622   1624   1624   1953   Any
        //  1628   1638   1914   1926   Ljava/lang/Exception;
        //  1628   1638   1624   1953   Any
        //  1638   1677   1899   1914   Ljava/io/IOException;
        //  1638   1677   1624   1953   Any
        //  1677   1700   1881   1893   Ljava/lang/Exception;
        //  1677   1700   1624   1953   Any
        //  1705   1750   1853   1868   Ljava/io/IOException;
        //  1705   1750   1624   1953   Any
        //  1762   1778   1853   1868   Ljava/io/IOException;
        //  1762   1778   1624   1953   Any
        //  1783   1835   1853   1868   Ljava/io/IOException;
        //  1783   1835   1624   1953   Any
        //  1838   1848   1624   1953   Any
        //  1854   1865   1624   1953   Any
        //  1868   1878   1624   1953   Any
        //  1882   1893   1624   1953   Any
        //  1900   1911   1624   1953   Any
        //  1915   1926   1624   1953   Any
        //  1929   1938   1624   1953   Any
        //  1946   1951   2063   2067   Any
        //  1951   1953   1970   1988   Ljava/lang/Exception;
        //  1960   1965   1970   1988   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 899, Size: 899
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
