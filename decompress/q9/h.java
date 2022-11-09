// 
// Decompiled by Procyon v0.6.0
// 

package q9;

public final class h implements Runnable
{
    public final /* synthetic */ g f;
    
    public h(final g f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        q9/h.f:Lq9/g;
        //     4: astore_1       
        //     5: aload_1        
        //     6: getfield        q9/g.p:Lv7/a;
        //     9: ifnonnull       23
        //    12: aload_1        
        //    13: new             Lv7/a;
        //    16: dup            
        //    17: invokespecial   v7/a.<init>:()V
        //    20: putfield        q9/g.p:Lv7/a;
        //    23: new             Lq9/i;
        //    26: dup            
        //    27: aload_1        
        //    28: getfield        q9/g.p:Lv7/a;
        //    31: invokespecial   q9/i.<init>:(Lv7/a;)V
        //    34: astore_2       
        //    35: aload_1        
        //    36: aload_2        
        //    37: putfield        q9/g.o:Lq9/i;
        //    40: aload_2        
        //    41: new             Lq9/h$a;
        //    44: dup            
        //    45: aload_0        
        //    46: invokespecial   q9/h$a.<init>:(Lq9/h;)V
        //    49: putfield        q9/i.e:Lq9/i$a;
        //    52: aload_1        
        //    53: getfield        q9/g.a:Lt9/b;
        //    56: astore_3       
        //    57: new             Landroid/media/MediaMetadataRetriever;
        //    60: astore_2       
        //    61: aload_2        
        //    62: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //    65: aload_2        
        //    66: aload_3        
        //    67: getfield        t9/b.a:Ljava/io/FileDescriptor;
        //    70: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/io/FileDescriptor;)V
        //    73: aload_2        
        //    74: bipush          24
        //    76: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //    79: astore_3       
        //    80: aload_3        
        //    81: ifnonnull       102
        //    84: aload_2        
        //    85: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //    88: aconst_null    
        //    89: astore_2       
        //    90: aload_2        
        //    91: astore          4
        //    93: goto            322
        //    96: astore_3       
        //    97: aconst_null    
        //    98: astore_2       
        //    99: goto            302
        //   102: aload_3        
        //   103: invokestatic    java/lang/Integer.valueOf:(Ljava/lang/String;)Ljava/lang/Integer;
        //   106: astore          4
        //   108: aload_2        
        //   109: astore_3       
        //   110: aload           4
        //   112: astore_2       
        //   113: goto            288
        //   116: astore_3       
        //   117: goto            1598
        //   120: astore          4
        //   122: aload_2        
        //   123: astore_3       
        //   124: goto            151
        //   127: astore          4
        //   129: aload_2        
        //   130: astore_3       
        //   131: goto            198
        //   134: astore          4
        //   136: aload_2        
        //   137: astore_3       
        //   138: goto            245
        //   141: astore_3       
        //   142: aconst_null    
        //   143: astore_2       
        //   144: goto            117
        //   147: astore          4
        //   149: aconst_null    
        //   150: astore_3       
        //   151: aload_3        
        //   152: astore_2       
        //   153: aload_1        
        //   154: getfield        q9/g.p:Lv7/a;
        //   157: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   160: pop            
        //   161: aload_3        
        //   162: astore_2       
        //   163: ldc             "MediaMetadataRetriever"
        //   165: ldc             "getVideoRotation Exception"
        //   167: aload           4
        //   169: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   172: pop            
        //   173: aload_3        
        //   174: astore_2       
        //   175: iconst_0       
        //   176: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   179: astore          4
        //   181: aload           4
        //   183: astore_2       
        //   184: aload_3        
        //   185: ifnull          90
        //   188: aload           4
        //   190: astore_2       
        //   191: goto            285
        //   194: astore          4
        //   196: aconst_null    
        //   197: astore_3       
        //   198: aload_3        
        //   199: astore_2       
        //   200: aload_1        
        //   201: getfield        q9/g.p:Lv7/a;
        //   204: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   207: pop            
        //   208: aload_3        
        //   209: astore_2       
        //   210: ldc             "MediaMetadataRetriever"
        //   212: ldc             "getVideoRotation RuntimeException"
        //   214: aload           4
        //   216: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   219: pop            
        //   220: aload_3        
        //   221: astore_2       
        //   222: iconst_0       
        //   223: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   226: astore          4
        //   228: aload           4
        //   230: astore_2       
        //   231: aload_3        
        //   232: ifnull          90
        //   235: aload           4
        //   237: astore_2       
        //   238: goto            285
        //   241: astore          4
        //   243: aconst_null    
        //   244: astore_3       
        //   245: aload_3        
        //   246: astore_2       
        //   247: aload_1        
        //   248: getfield        q9/g.p:Lv7/a;
        //   251: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   254: pop            
        //   255: aload_3        
        //   256: astore_2       
        //   257: ldc             "MediaMetadataRetriever"
        //   259: ldc             "getVideoRotation IllegalArgumentException"
        //   261: aload           4
        //   263: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   266: pop            
        //   267: aload_3        
        //   268: astore_2       
        //   269: iconst_0       
        //   270: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   273: astore          4
        //   275: aload           4
        //   277: astore_2       
        //   278: aload_3        
        //   279: ifnull          90
        //   282: aload           4
        //   284: astore_2       
        //   285: goto            113
        //   288: aload_3        
        //   289: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   292: aload_2        
        //   293: astore          4
        //   295: goto            322
        //   298: astore_3       
        //   299: goto            99
        //   302: aload_1        
        //   303: getfield        q9/g.p:Lv7/a;
        //   306: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   309: pop            
        //   310: ldc             "g"
        //   312: ldc             "Failed to release mediaMetadataRetriever."
        //   314: aload_3        
        //   315: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   318: pop            
        //   319: goto            90
        //   322: aload_0        
        //   323: getfield        q9/h.f:Lq9/g;
        //   326: astore          5
        //   328: aload           5
        //   330: getfield        q9/g.a:Lt9/b;
        //   333: astore_1       
        //   334: new             Landroid/media/MediaMetadataRetriever;
        //   337: astore_2       
        //   338: aload_2        
        //   339: invokespecial   android/media/MediaMetadataRetriever.<init>:()V
        //   342: aload_2        
        //   343: astore_3       
        //   344: aload_2        
        //   345: aload_1        
        //   346: getfield        t9/b.a:Ljava/io/FileDescriptor;
        //   349: invokevirtual   android/media/MediaMetadataRetriever.setDataSource:(Ljava/io/FileDescriptor;)V
        //   352: aload_2        
        //   353: astore_3       
        //   354: aload_2        
        //   355: bipush          18
        //   357: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   360: astore          6
        //   362: aload_2        
        //   363: astore_3       
        //   364: aload_2        
        //   365: bipush          19
        //   367: invokevirtual   android/media/MediaMetadataRetriever.extractMetadata:(I)Ljava/lang/String;
        //   370: astore_1       
        //   371: aload_2        
        //   372: astore_3       
        //   373: aload           6
        //   375: ifnull          560
        //   378: aload_1        
        //   379: ifnonnull       387
        //   382: aload_2        
        //   383: astore_3       
        //   384: goto            560
        //   387: aload_2        
        //   388: astore_3       
        //   389: new             Landroid/util/Size;
        //   392: dup            
        //   393: aload           6
        //   395: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   398: aload_1        
        //   399: invokestatic    java/lang/Integer.parseInt:(Ljava/lang/String;)I
        //   402: invokespecial   android/util/Size.<init>:(II)V
        //   405: astore_1       
        //   406: aload_2        
        //   407: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   410: aload_1        
        //   411: astore_2       
        //   412: goto            588
        //   415: astore_2       
        //   416: aload           5
        //   418: getfield        q9/g.p:Lv7/a;
        //   421: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   424: pop            
        //   425: ldc             "g"
        //   427: ldc             "Failed to release mediaMetadataRetriever."
        //   429: aload_2        
        //   430: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   433: pop            
        //   434: aload_1        
        //   435: astore_2       
        //   436: goto            588
        //   439: astore_2       
        //   440: goto            458
        //   443: astore_1       
        //   444: goto            464
        //   447: astore_1       
        //   448: goto            498
        //   451: astore_1       
        //   452: goto            532
        //   455: astore_2       
        //   456: aconst_null    
        //   457: astore_3       
        //   458: goto            1562
        //   461: astore_1       
        //   462: aconst_null    
        //   463: astore_2       
        //   464: aload_2        
        //   465: astore_3       
        //   466: aload           5
        //   468: getfield        q9/g.p:Lv7/a;
        //   471: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   474: pop            
        //   475: aload_2        
        //   476: astore_3       
        //   477: ldc             "MediaMetadataRetriever"
        //   479: ldc             "getVideoResolution Exception"
        //   481: aload_1        
        //   482: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   485: pop            
        //   486: aload_2        
        //   487: ifnull          586
        //   490: aload_2        
        //   491: astore_3       
        //   492: goto            560
        //   495: astore_1       
        //   496: aconst_null    
        //   497: astore_2       
        //   498: aload_2        
        //   499: astore_3       
        //   500: aload           5
        //   502: getfield        q9/g.p:Lv7/a;
        //   505: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   508: pop            
        //   509: aload_2        
        //   510: astore_3       
        //   511: ldc             "MediaMetadataRetriever"
        //   513: ldc             "getVideoResolution RuntimeException"
        //   515: aload_1        
        //   516: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   519: pop            
        //   520: aload_2        
        //   521: ifnull          586
        //   524: aload_2        
        //   525: astore_3       
        //   526: goto            560
        //   529: astore_1       
        //   530: aconst_null    
        //   531: astore_2       
        //   532: aload_2        
        //   533: astore_3       
        //   534: aload           5
        //   536: getfield        q9/g.p:Lv7/a;
        //   539: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   542: pop            
        //   543: aload_2        
        //   544: astore_3       
        //   545: ldc             "MediaMetadataRetriever"
        //   547: ldc             "getVideoResolution IllegalArgumentException"
        //   549: aload_1        
        //   550: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   553: pop            
        //   554: aload_2        
        //   555: ifnull          586
        //   558: aload_2        
        //   559: astore_3       
        //   560: aload_3        
        //   561: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //   564: goto            586
        //   567: astore_2       
        //   568: aload           5
        //   570: getfield        q9/g.p:Lv7/a;
        //   573: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   576: pop            
        //   577: ldc             "g"
        //   579: ldc             "Failed to release mediaMetadataRetriever."
        //   581: aload_2        
        //   582: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //   585: pop            
        //   586: aconst_null    
        //   587: astore_2       
        //   588: aload_2        
        //   589: ifnull          1522
        //   592: aload           4
        //   594: ifnonnull       600
        //   597: goto            1522
        //   600: aload_0        
        //   601: getfield        q9/h.f:Lq9/g;
        //   604: astore_3       
        //   605: aload_3        
        //   606: getfield        q9/g.c:Lr9/a;
        //   609: ifnonnull       623
        //   612: aload_3        
        //   613: new             Lr9/a;
        //   616: dup            
        //   617: invokespecial   r9/a.<init>:()V
        //   620: putfield        q9/g.c:Lr9/a;
        //   623: aload_0        
        //   624: getfield        q9/h.f:Lq9/g;
        //   627: astore          5
        //   629: aload           5
        //   631: getfield        q9/g.h:Lcom/daasuu/mp4compose/FillMode;
        //   634: ifnonnull       645
        //   637: aload           5
        //   639: getstatic       com/daasuu/mp4compose/FillMode.PRESERVE_ASPECT_FIT:Lcom/daasuu/mp4compose/FillMode;
        //   642: putfield        q9/g.h:Lcom/daasuu/mp4compose/FillMode;
        //   645: aload           5
        //   647: getfield        q9/g.h:Lcom/daasuu/mp4compose/FillMode;
        //   650: astore_1       
        //   651: getstatic       com/daasuu/mp4compose/FillMode.CUSTOM:Lcom/daasuu/mp4compose/FillMode;
        //   654: astore_3       
        //   655: aload_1        
        //   656: aload_3        
        //   657: if_acmpne       675
        //   660: aload           5
        //   662: new             Ljava/lang/IllegalAccessException;
        //   665: dup            
        //   666: ldc             "FillMode.CUSTOM must need fillModeCustomItem."
        //   668: invokespecial   java/lang/IllegalAccessException.<init>:(Ljava/lang/String;)V
        //   671: invokestatic    q9/g.a:(Lq9/g;Ljava/lang/Exception;)V
        //   674: return         
        //   675: aload           5
        //   677: getfield        q9/g.d:Landroid/util/Size;
        //   680: ifnonnull       769
        //   683: aload_1        
        //   684: aload_3        
        //   685: if_acmpne       697
        //   688: aload           5
        //   690: aload_2        
        //   691: putfield        q9/g.d:Landroid/util/Size;
        //   694: goto            769
        //   697: aload           5
        //   699: getfield        q9/g.f:Lcom/daasuu/mp4compose/Rotation;
        //   702: invokevirtual   com/daasuu/mp4compose/Rotation.getRotation:()I
        //   705: istore          7
        //   707: aload           4
        //   709: invokevirtual   java/lang/Integer.intValue:()I
        //   712: iload           7
        //   714: iadd           
        //   715: invokestatic    com/daasuu/mp4compose/Rotation.fromInt:(I)Lcom/daasuu/mp4compose/Rotation;
        //   718: astore_3       
        //   719: aload_3        
        //   720: getstatic       com/daasuu/mp4compose/Rotation.ROTATION_90:Lcom/daasuu/mp4compose/Rotation;
        //   723: if_acmpeq       747
        //   726: aload_3        
        //   727: getstatic       com/daasuu/mp4compose/Rotation.ROTATION_270:Lcom/daasuu/mp4compose/Rotation;
        //   730: if_acmpne       736
        //   733: goto            747
        //   736: aload_0        
        //   737: getfield        q9/h.f:Lq9/g;
        //   740: aload_2        
        //   741: putfield        q9/g.d:Landroid/util/Size;
        //   744: goto            769
        //   747: aload_0        
        //   748: getfield        q9/h.f:Lq9/g;
        //   751: new             Landroid/util/Size;
        //   754: dup            
        //   755: aload_2        
        //   756: invokevirtual   android/util/Size.getHeight:()I
        //   759: aload_2        
        //   760: invokevirtual   android/util/Size.getWidth:()I
        //   763: invokespecial   android/util/Size.<init>:(II)V
        //   766: putfield        q9/g.d:Landroid/util/Size;
        //   769: aload_0        
        //   770: getfield        q9/h.f:Lq9/g;
        //   773: astore_3       
        //   774: aload_3        
        //   775: getfield        q9/g.i:F
        //   778: fstore          8
        //   780: fload           8
        //   782: ldc             0.125
        //   784: fcmpg          
        //   785: ifge            797
        //   788: aload_3        
        //   789: ldc             0.125
        //   791: putfield        q9/g.i:F
        //   794: goto            811
        //   797: fload           8
        //   799: ldc             8.0
        //   801: fcmpl          
        //   802: ifle            811
        //   805: aload_3        
        //   806: ldc             8.0
        //   808: putfield        q9/g.i:F
        //   811: aload_3        
        //   812: getfield        q9/g.m:Landroid/opengl/EGLContext;
        //   815: ifnonnull       825
        //   818: aload_3        
        //   819: getstatic       android/opengl/EGL14.EGL_NO_CONTEXT:Landroid/opengl/EGLContext;
        //   822: putfield        q9/g.m:Landroid/opengl/EGLContext;
        //   825: aload_3        
        //   826: getfield        q9/g.p:Lv7/a;
        //   829: astore_3       
        //   830: getstatic       q9/g.r:I
        //   833: istore          7
        //   835: ldc             "rotation = "
        //   837: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   840: astore_1       
        //   841: aload_0        
        //   842: getfield        q9/h.f:Lq9/g;
        //   845: getfield        q9/g.f:Lcom/daasuu/mp4compose/Rotation;
        //   848: invokevirtual   com/daasuu/mp4compose/Rotation.getRotation:()I
        //   851: istore          7
        //   853: aload_1        
        //   854: aload           4
        //   856: invokevirtual   java/lang/Integer.intValue:()I
        //   859: iload           7
        //   861: iadd           
        //   862: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   865: pop            
        //   866: aload_1        
        //   867: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   870: astore_1       
        //   871: aload_3        
        //   872: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   875: pop            
        //   876: ldc             "g"
        //   878: aload_1        
        //   879: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   882: pop            
        //   883: aload_0        
        //   884: getfield        q9/h.f:Lq9/g;
        //   887: getfield        q9/g.p:Lv7/a;
        //   890: astore_3       
        //   891: ldc             "rotation = "
        //   893: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   896: astore_1       
        //   897: aload_0        
        //   898: getfield        q9/h.f:Lq9/g;
        //   901: getfield        q9/g.f:Lcom/daasuu/mp4compose/Rotation;
        //   904: invokevirtual   com/daasuu/mp4compose/Rotation.getRotation:()I
        //   907: istore          7
        //   909: aload_1        
        //   910: aload           4
        //   912: invokevirtual   java/lang/Integer.intValue:()I
        //   915: iload           7
        //   917: iadd           
        //   918: invokestatic    com/daasuu/mp4compose/Rotation.fromInt:(I)Lcom/daasuu/mp4compose/Rotation;
        //   921: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //   924: pop            
        //   925: aload_1        
        //   926: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   929: astore_1       
        //   930: aload_3        
        //   931: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   934: pop            
        //   935: ldc             "g"
        //   937: aload_1        
        //   938: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   941: pop            
        //   942: aload_0        
        //   943: getfield        q9/h.f:Lq9/g;
        //   946: getfield        q9/g.p:Lv7/a;
        //   949: astore_3       
        //   950: ldc             "inputResolution width = "
        //   952: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   955: astore_1       
        //   956: aload_1        
        //   957: aload_2        
        //   958: invokevirtual   android/util/Size.getWidth:()I
        //   961: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   964: pop            
        //   965: aload_1        
        //   966: ldc             " height = "
        //   968: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   971: pop            
        //   972: aload_1        
        //   973: aload_2        
        //   974: invokevirtual   android/util/Size.getHeight:()I
        //   977: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //   980: pop            
        //   981: aload_1        
        //   982: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   985: astore_1       
        //   986: aload_3        
        //   987: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   990: pop            
        //   991: ldc             "g"
        //   993: aload_1        
        //   994: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //   997: pop            
        //   998: aload_0        
        //   999: getfield        q9/h.f:Lq9/g;
        //  1002: getfield        q9/g.p:Lv7/a;
        //  1005: astore_3       
        //  1006: ldc             "outputResolution width = "
        //  1008: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1011: astore_1       
        //  1012: aload_1        
        //  1013: aload_0        
        //  1014: getfield        q9/h.f:Lq9/g;
        //  1017: getfield        q9/g.d:Landroid/util/Size;
        //  1020: invokevirtual   android/util/Size.getWidth:()I
        //  1023: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1026: pop            
        //  1027: aload_1        
        //  1028: ldc             " height = "
        //  1030: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1033: pop            
        //  1034: aload_1        
        //  1035: aload_0        
        //  1036: getfield        q9/h.f:Lq9/g;
        //  1039: getfield        q9/g.d:Landroid/util/Size;
        //  1042: invokevirtual   android/util/Size.getHeight:()I
        //  1045: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1048: pop            
        //  1049: aload_1        
        //  1050: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1053: astore_1       
        //  1054: aload_3        
        //  1055: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1058: pop            
        //  1059: ldc             "g"
        //  1061: aload_1        
        //  1062: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //  1065: pop            
        //  1066: aload_0        
        //  1067: getfield        q9/h.f:Lq9/g;
        //  1070: getfield        q9/g.p:Lv7/a;
        //  1073: astore_3       
        //  1074: ldc             "fillMode = "
        //  1076: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1079: astore_1       
        //  1080: aload_1        
        //  1081: aload_0        
        //  1082: getfield        q9/h.f:Lq9/g;
        //  1085: getfield        q9/g.h:Lcom/daasuu/mp4compose/FillMode;
        //  1088: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1091: pop            
        //  1092: aload_1        
        //  1093: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1096: astore_1       
        //  1097: aload_3        
        //  1098: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1101: pop            
        //  1102: ldc             "g"
        //  1104: aload_1        
        //  1105: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //  1108: pop            
        //  1109: aload_0        
        //  1110: getfield        q9/h.f:Lq9/g;
        //  1113: astore_3       
        //  1114: aload_3        
        //  1115: getfield        q9/g.e:I
        //  1118: ifge            1213
        //  1121: aload_3        
        //  1122: getfield        q9/g.d:Landroid/util/Size;
        //  1125: invokevirtual   android/util/Size.getWidth:()I
        //  1128: istore          9
        //  1130: aload_0        
        //  1131: getfield        q9/h.f:Lq9/g;
        //  1134: getfield        q9/g.d:Landroid/util/Size;
        //  1137: invokevirtual   android/util/Size.getHeight:()I
        //  1140: istore          7
        //  1142: iload           9
        //  1144: i2d            
        //  1145: ldc2_w          7.5
        //  1148: dmul           
        //  1149: iload           7
        //  1151: i2d            
        //  1152: dmul           
        //  1153: d2i            
        //  1154: istore          7
        //  1156: aload_3        
        //  1157: getfield        q9/g.p:Lv7/a;
        //  1160: astore_1       
        //  1161: new             Ljava/lang/StringBuilder;
        //  1164: astore          5
        //  1166: aload           5
        //  1168: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1171: aload           5
        //  1173: ldc             "bitrate="
        //  1175: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1178: pop            
        //  1179: aload           5
        //  1181: iload           7
        //  1183: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1186: pop            
        //  1187: aload           5
        //  1189: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1192: astore          5
        //  1194: aload_1        
        //  1195: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1198: pop            
        //  1199: ldc             "g"
        //  1201: aload           5
        //  1203: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //  1206: pop            
        //  1207: aload_3        
        //  1208: iload           7
        //  1210: putfield        q9/g.e:I
        //  1213: aload_0        
        //  1214: getfield        q9/h.f:Lq9/g;
        //  1217: astore          10
        //  1219: aload           10
        //  1221: getfield        q9/g.o:Lq9/i;
        //  1224: astore_1       
        //  1225: aload           10
        //  1227: getfield        q9/g.a:Lt9/b;
        //  1230: astore          11
        //  1232: aload           10
        //  1234: getfield        q9/g.b:Ljava/lang/String;
        //  1237: astore_3       
        //  1238: aload           10
        //  1240: getfield        q9/g.d:Landroid/util/Size;
        //  1243: astore          6
        //  1245: aload           10
        //  1247: getfield        q9/g.c:Lr9/a;
        //  1250: astore          5
        //  1252: aload           10
        //  1254: getfield        q9/g.e:I
        //  1257: istore          7
        //  1259: aload           10
        //  1261: getfield        q9/g.f:Lcom/daasuu/mp4compose/Rotation;
        //  1264: invokevirtual   com/daasuu/mp4compose/Rotation.getRotation:()I
        //  1267: aload           4
        //  1269: invokevirtual   java/lang/Integer.intValue:()I
        //  1272: iadd           
        //  1273: invokestatic    com/daasuu/mp4compose/Rotation.fromInt:(I)Lcom/daasuu/mp4compose/Rotation;
        //  1276: astore          4
        //  1278: aload_0        
        //  1279: getfield        q9/h.f:Lq9/g;
        //  1282: astore          12
        //  1284: aload           12
        //  1286: getfield        q9/g.h:Lcom/daasuu/mp4compose/FillMode;
        //  1289: astore          10
        //  1291: aload           12
        //  1293: getfield        q9/g.i:F
        //  1296: fstore          8
        //  1298: aload           12
        //  1300: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1303: pop            
        //  1304: aload_0        
        //  1305: getfield        q9/h.f:Lq9/g;
        //  1308: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1311: pop            
        //  1312: aload_0        
        //  1313: getfield        q9/h.f:Lq9/g;
        //  1316: astore          12
        //  1318: aload           12
        //  1320: getfield        q9/g.j:J
        //  1323: lstore          13
        //  1325: aload           12
        //  1327: getfield        q9/g.k:J
        //  1330: lstore          15
        //  1332: aload_1        
        //  1333: aload           11
        //  1335: aload_3        
        //  1336: aload           6
        //  1338: aload           5
        //  1340: iload           7
        //  1342: aload           4
        //  1344: aload_2        
        //  1345: aload           10
        //  1347: fload           8
        //  1349: lload           13
        //  1351: lload           15
        //  1353: aload           12
        //  1355: getfield        q9/g.l:Lcom/daasuu/mp4compose/VideoFormatMimeType;
        //  1358: aload           12
        //  1360: getfield        q9/g.m:Landroid/opengl/EGLContext;
        //  1363: invokevirtual   q9/i.a:(Lt9/b;Ljava/lang/String;Landroid/util/Size;Lr9/a;ILcom/daasuu/mp4compose/Rotation;Landroid/util/Size;Lcom/daasuu/mp4compose/FillMode;FJJLcom/daasuu/mp4compose/VideoFormatMimeType;Landroid/opengl/EGLContext;)V
        //  1366: aload_0        
        //  1367: getfield        q9/h.f:Lq9/g;
        //  1370: astore_2       
        //  1371: aload_2        
        //  1372: getfield        q9/g.g:Lq9/g$b;
        //  1375: ifnull          1415
        //  1378: aload_2        
        //  1379: getfield        q9/g.o:Lq9/i;
        //  1382: getfield        q9/i.h:Z
        //  1385: ifeq            1403
        //  1388: aload_0        
        //  1389: getfield        q9/h.f:Lq9/g;
        //  1392: getfield        q9/g.g:Lq9/g$b;
        //  1395: invokeinterface q9/g$b.onCanceled:()V
        //  1400: goto            1415
        //  1403: aload_0        
        //  1404: getfield        q9/h.f:Lq9/g;
        //  1407: getfield        q9/g.g:Lq9/g$b;
        //  1410: invokeinterface q9/g$b.onCompleted:()V
        //  1415: aload_0        
        //  1416: getfield        q9/h.f:Lq9/g;
        //  1419: getfield        q9/g.n:Ljava/util/concurrent/ExecutorService;
        //  1422: invokeinterface java/util/concurrent/ExecutorService.shutdown:()V
        //  1427: aload_0        
        //  1428: getfield        q9/h.f:Lq9/g;
        //  1431: aconst_null    
        //  1432: putfield        q9/g.o:Lq9/i;
        //  1435: return         
        //  1436: astore_2       
        //  1437: goto            1441
        //  1440: astore_2       
        //  1441: aload_2        
        //  1442: instanceof      Landroid/media/MediaCodec$CodecException;
        //  1445: ifeq            1485
        //  1448: aload_0        
        //  1449: getfield        q9/h.f:Lq9/g;
        //  1452: getfield        q9/g.p:Lv7/a;
        //  1455: astore_3       
        //  1456: getstatic       q9/g.r:I
        //  1459: istore          7
        //  1461: aload_3        
        //  1462: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1465: pop            
        //  1466: ldc             "g"
        //  1468: ldc_w           "This devicel cannot codec with that setting. Check width, height, bitrate and video format."
        //  1471: aload_2        
        //  1472: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1475: pop            
        //  1476: aload_0        
        //  1477: getfield        q9/h.f:Lq9/g;
        //  1480: aload_2        
        //  1481: invokestatic    q9/g.a:(Lq9/g;Ljava/lang/Exception;)V
        //  1484: return         
        //  1485: aload_0        
        //  1486: getfield        q9/h.f:Lq9/g;
        //  1489: getfield        q9/g.p:Lv7/a;
        //  1492: astore_3       
        //  1493: getstatic       q9/g.r:I
        //  1496: istore          7
        //  1498: aload_3        
        //  1499: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1502: pop            
        //  1503: ldc             "g"
        //  1505: ldc_w           "Unable to compose the engine"
        //  1508: aload_2        
        //  1509: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1512: pop            
        //  1513: aload_0        
        //  1514: getfield        q9/h.f:Lq9/g;
        //  1517: aload_2        
        //  1518: invokestatic    q9/g.a:(Lq9/g;Ljava/lang/Exception;)V
        //  1521: return         
        //  1522: aload_0        
        //  1523: getfield        q9/h.f:Lq9/g;
        //  1526: astore_3       
        //  1527: ldc_w           "File type unsupported, path: "
        //  1530: invokestatic    a.k:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1533: astore_2       
        //  1534: aload_2        
        //  1535: aload_0        
        //  1536: getfield        q9/h.f:Lq9/g;
        //  1539: getfield        q9/g.a:Lt9/b;
        //  1542: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
        //  1545: pop            
        //  1546: aload_3        
        //  1547: new             Ljava/lang/UnsupportedOperationException;
        //  1550: dup            
        //  1551: aload_2        
        //  1552: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1555: invokespecial   java/lang/UnsupportedOperationException.<init>:(Ljava/lang/String;)V
        //  1558: invokestatic    q9/g.a:(Lq9/g;Ljava/lang/Exception;)V
        //  1561: return         
        //  1562: aload_3        
        //  1563: ifnull          1592
        //  1566: aload_3        
        //  1567: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //  1570: goto            1592
        //  1573: astore_3       
        //  1574: aload           5
        //  1576: getfield        q9/g.p:Lv7/a;
        //  1579: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1582: pop            
        //  1583: ldc             "g"
        //  1585: ldc             "Failed to release mediaMetadataRetriever."
        //  1587: aload_3        
        //  1588: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1591: pop            
        //  1592: aload_2        
        //  1593: athrow         
        //  1594: astore_3       
        //  1595: goto            117
        //  1598: aload_2        
        //  1599: ifnull          1627
        //  1602: aload_2        
        //  1603: invokevirtual   android/media/MediaMetadataRetriever.release:()V
        //  1606: goto            1627
        //  1609: astore_2       
        //  1610: aload_1        
        //  1611: getfield        q9/g.p:Lv7/a;
        //  1614: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //  1617: pop            
        //  1618: ldc             "g"
        //  1620: ldc             "Failed to release mediaMetadataRetriever."
        //  1622: aload_2        
        //  1623: invokestatic    android/util/Log.e:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
        //  1626: pop            
        //  1627: aload_3        
        //  1628: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  57     65     241    245    Ljava/lang/IllegalArgumentException;
        //  57     65     194    198    Ljava/lang/RuntimeException;
        //  57     65     147    151    Ljava/lang/Exception;
        //  57     65     141    147    Any
        //  65     80     134    141    Ljava/lang/IllegalArgumentException;
        //  65     80     127    134    Ljava/lang/RuntimeException;
        //  65     80     120    127    Ljava/lang/Exception;
        //  65     80     116    117    Any
        //  84     88     96     99     Ljava/lang/RuntimeException;
        //  102    108    134    141    Ljava/lang/IllegalArgumentException;
        //  102    108    127    134    Ljava/lang/RuntimeException;
        //  102    108    120    127    Ljava/lang/Exception;
        //  102    108    116    117    Any
        //  153    161    1594   1598   Any
        //  163    173    1594   1598   Any
        //  175    181    1594   1598   Any
        //  200    208    1594   1598   Any
        //  210    220    1594   1598   Any
        //  222    228    1594   1598   Any
        //  247    255    1594   1598   Any
        //  257    267    1594   1598   Any
        //  269    275    1594   1598   Any
        //  288    292    298    302    Ljava/lang/RuntimeException;
        //  334    342    529    532    Ljava/lang/IllegalArgumentException;
        //  334    342    495    498    Ljava/lang/RuntimeException;
        //  334    342    461    464    Ljava/lang/Exception;
        //  334    342    455    458    Any
        //  344    352    451    455    Ljava/lang/IllegalArgumentException;
        //  344    352    447    451    Ljava/lang/RuntimeException;
        //  344    352    443    447    Ljava/lang/Exception;
        //  344    352    439    443    Any
        //  354    362    451    455    Ljava/lang/IllegalArgumentException;
        //  354    362    447    451    Ljava/lang/RuntimeException;
        //  354    362    443    447    Ljava/lang/Exception;
        //  354    362    439    443    Any
        //  364    371    451    455    Ljava/lang/IllegalArgumentException;
        //  364    371    447    451    Ljava/lang/RuntimeException;
        //  364    371    443    447    Ljava/lang/Exception;
        //  364    371    439    443    Any
        //  389    406    451    455    Ljava/lang/IllegalArgumentException;
        //  389    406    447    451    Ljava/lang/RuntimeException;
        //  389    406    443    447    Ljava/lang/Exception;
        //  389    406    439    443    Any
        //  406    410    415    439    Ljava/lang/RuntimeException;
        //  466    475    439    443    Any
        //  477    486    439    443    Any
        //  500    509    439    443    Any
        //  511    520    439    443    Any
        //  534    543    439    443    Any
        //  545    554    439    443    Any
        //  560    564    567    586    Ljava/lang/RuntimeException;
        //  1109   1142   1440   1441   Ljava/lang/Exception;
        //  1156   1213   1440   1441   Ljava/lang/Exception;
        //  1213   1332   1440   1441   Ljava/lang/Exception;
        //  1332   1366   1436   1440   Ljava/lang/Exception;
        //  1566   1570   1573   1592   Ljava/lang/RuntimeException;
        //  1602   1606   1609   1627   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0198:
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
}
