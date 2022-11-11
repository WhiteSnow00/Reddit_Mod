// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import ie.g3;

public final class u7
{
    public g3 a;
    public Long b;
    public long c;
    
    public final g3 a(final g3 p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   ie/g3.y:()Ljava/lang/String;
        //     4: astore_3       
        //     5: aload_1        
        //     6: invokevirtual   ie/g3.z:()Lie/j6;
        //     9: astore          4
        //    11: aload_0        
        //    12: getfield        pe/u7.d:Lpe/b;
        //    15: getfield        pe/a7.g:Lpe/g7;
        //    18: invokevirtual   pe/g7.O:()Lpe/i7;
        //    21: pop            
        //    22: aload_1        
        //    23: ldc             "_eid"
        //    25: invokestatic    pe/i7.R:(Lie/g3;Ljava/lang/String;)Ljava/io/Serializable;
        //    28: checkcast       Ljava/lang/Long;
        //    31: astore          5
        //    33: aload_3        
        //    34: astore          6
        //    36: aload           4
        //    38: astore          7
        //    40: aload           5
        //    42: ifnull          932
        //    45: aload_3        
        //    46: ldc             "_ep"
        //    48: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    51: ifeq            793
        //    54: aload_0        
        //    55: getfield        pe/u7.d:Lpe/b;
        //    58: getfield        pe/a7.g:Lpe/g7;
        //    61: invokevirtual   pe/g7.O:()Lpe/i7;
        //    64: pop            
        //    65: aload_1        
        //    66: ldc             "_en"
        //    68: invokestatic    pe/i7.R:(Lie/g3;Ljava/lang/String;)Ljava/io/Serializable;
        //    71: checkcast       Ljava/lang/String;
        //    74: astore          8
        //    76: aload           8
        //    78: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    81: ifeq            109
        //    84: aload_0        
        //    85: getfield        pe/u7.d:Lpe/b;
        //    88: getfield        z0/d1.f:Ljava/lang/Object;
        //    91: checkcast       Lpe/h4;
        //    94: invokevirtual   pe/h4.h:()Lpe/d3;
        //    97: getfield        pe/d3.l:Lpe/b3;
        //   100: aload           5
        //   102: ldc             "Extra parameter without an event name. eventId"
        //   104: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   107: aconst_null    
        //   108: areturn        
        //   109: aload_0        
        //   110: getfield        pe/u7.a:Lie/g3;
        //   113: ifnull          139
        //   116: aload_0        
        //   117: getfield        pe/u7.b:Ljava/lang/Long;
        //   120: ifnull          139
        //   123: aload           5
        //   125: invokevirtual   java/lang/Long.longValue:()J
        //   128: aload_0        
        //   129: getfield        pe/u7.b:Ljava/lang/Long;
        //   132: invokevirtual   java/lang/Long.longValue:()J
        //   135: lcmp           
        //   136: ifeq            477
        //   139: aload_0        
        //   140: getfield        pe/u7.d:Lpe/b;
        //   143: getfield        pe/a7.g:Lpe/g7;
        //   146: getfield        pe/g7.h:Lpe/k;
        //   149: astore          9
        //   151: aload           9
        //   153: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   156: aload           9
        //   158: invokevirtual   z0/d1.M:()V
        //   161: aload           9
        //   163: invokevirtual   pe/b7.N:()V
        //   166: aload           9
        //   168: invokevirtual   pe/k.f0:()Landroid/database/sqlite/SQLiteDatabase;
        //   171: ldc             "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
        //   173: iconst_2       
        //   174: anewarray       Ljava/lang/String;
        //   177: dup            
        //   178: iconst_0       
        //   179: aload_2        
        //   180: aastore        
        //   181: dup            
        //   182: iconst_1       
        //   183: aload           5
        //   185: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //   188: aastore        
        //   189: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   192: astore          6
        //   194: aload           6
        //   196: astore          7
        //   198: aload           6
        //   200: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   205: ifne            244
        //   208: aload           6
        //   210: astore          7
        //   212: aload           9
        //   214: getfield        z0/d1.f:Ljava/lang/Object;
        //   217: checkcast       Lpe/h4;
        //   220: invokevirtual   pe/h4.h:()Lpe/d3;
        //   223: getfield        pe/d3.s:Lpe/b3;
        //   226: ldc             "Main event not found"
        //   228: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //   231: aload           6
        //   233: invokeinterface android/database/Cursor.close:()V
        //   238: aconst_null    
        //   239: astore          6
        //   241: goto            406
        //   244: aload           6
        //   246: astore          7
        //   248: aload           6
        //   250: iconst_0       
        //   251: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   256: astore_3       
        //   257: aload           6
        //   259: astore          7
        //   261: aload           6
        //   263: iconst_1       
        //   264: invokeinterface android/database/Cursor.getLong:(I)J
        //   269: lstore          10
        //   271: aload           6
        //   273: astore          7
        //   275: invokestatic    ie/g3.v:()Lie/f3;
        //   278: aload_3        
        //   279: invokestatic    pe/i7.f0:(Lie/b6;[B)Lie/b6;
        //   282: checkcast       Lie/f3;
        //   285: invokevirtual   ie/b6.j:()Lie/e6;
        //   288: checkcast       Lie/g3;
        //   291: astore_3       
        //   292: aload           6
        //   294: astore          7
        //   296: aload_3        
        //   297: lload           10
        //   299: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   302: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //   305: astore_3       
        //   306: aload           6
        //   308: invokeinterface android/database/Cursor.close:()V
        //   313: aload_3        
        //   314: astore          6
        //   316: goto            406
        //   319: astore_3       
        //   320: goto            367
        //   323: astore_3       
        //   324: aload           6
        //   326: astore          7
        //   328: aload           9
        //   330: getfield        z0/d1.f:Ljava/lang/Object;
        //   333: checkcast       Lpe/h4;
        //   336: invokevirtual   pe/h4.h:()Lpe/d3;
        //   339: getfield        pe/d3.k:Lpe/b3;
        //   342: aload_2        
        //   343: invokestatic    pe/d3.V:(Ljava/lang/String;)Lpe/c3;
        //   346: ldc             "Failed to merge main event. appId, eventId"
        //   348: aload           5
        //   350: aload_3        
        //   351: invokevirtual   pe/b3.d:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   354: goto            396
        //   357: astore_1       
        //   358: aconst_null    
        //   359: astore_2       
        //   360: goto            781
        //   363: astore_3       
        //   364: aconst_null    
        //   365: astore          6
        //   367: aload           6
        //   369: astore          7
        //   371: aload           9
        //   373: getfield        z0/d1.f:Ljava/lang/Object;
        //   376: checkcast       Lpe/h4;
        //   379: invokevirtual   pe/h4.h:()Lpe/d3;
        //   382: getfield        pe/d3.k:Lpe/b3;
        //   385: aload_3        
        //   386: ldc             "Error selecting main event"
        //   388: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   391: aload           6
        //   393: ifnull          403
        //   396: aload           6
        //   398: invokeinterface android/database/Cursor.close:()V
        //   403: aconst_null    
        //   404: astore          6
        //   406: aload           6
        //   408: ifnull          749
        //   411: aload           6
        //   413: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   416: astore          7
        //   418: aload           7
        //   420: ifnonnull       426
        //   423: goto            749
        //   426: aload_0        
        //   427: aload           7
        //   429: checkcast       Lie/g3;
        //   432: putfield        pe/u7.a:Lie/g3;
        //   435: aload_0        
        //   436: aload           6
        //   438: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   441: checkcast       Ljava/lang/Long;
        //   444: invokevirtual   java/lang/Long.longValue:()J
        //   447: putfield        pe/u7.c:J
        //   450: aload_0        
        //   451: getfield        pe/u7.d:Lpe/b;
        //   454: getfield        pe/a7.g:Lpe/g7;
        //   457: invokevirtual   pe/g7.O:()Lpe/i7;
        //   460: pop            
        //   461: aload_0        
        //   462: aload_0        
        //   463: getfield        pe/u7.a:Lie/g3;
        //   466: ldc             "_eid"
        //   468: invokestatic    pe/i7.R:(Lie/g3;Ljava/lang/String;)Ljava/io/Serializable;
        //   471: checkcast       Ljava/lang/Long;
        //   474: putfield        pe/u7.b:Ljava/lang/Long;
        //   477: aload_0        
        //   478: getfield        pe/u7.c:J
        //   481: lconst_1       
        //   482: lsub           
        //   483: lstore          10
        //   485: aload_0        
        //   486: lload           10
        //   488: putfield        pe/u7.c:J
        //   491: lload           10
        //   493: lconst_0       
        //   494: lcmp           
        //   495: ifgt            585
        //   498: aload_0        
        //   499: getfield        pe/u7.d:Lpe/b;
        //   502: getfield        pe/a7.g:Lpe/g7;
        //   505: getfield        pe/g7.h:Lpe/k;
        //   508: astore          6
        //   510: aload           6
        //   512: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   515: aload           6
        //   517: invokevirtual   z0/d1.M:()V
        //   520: aload           6
        //   522: getfield        z0/d1.f:Ljava/lang/Object;
        //   525: checkcast       Lpe/h4;
        //   528: invokevirtual   pe/h4.h:()Lpe/d3;
        //   531: getfield        pe/d3.s:Lpe/b3;
        //   534: aload_2        
        //   535: ldc             "Clearing complex main event info. appId"
        //   537: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   540: aload           6
        //   542: invokevirtual   pe/k.f0:()Landroid/database/sqlite/SQLiteDatabase;
        //   545: ldc             "delete from main_event_params where app_id=?"
        //   547: iconst_1       
        //   548: anewarray       Ljava/lang/String;
        //   551: dup            
        //   552: iconst_0       
        //   553: aload_2        
        //   554: aastore        
        //   555: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   558: goto            618
        //   561: astore_2       
        //   562: aload           6
        //   564: getfield        z0/d1.f:Ljava/lang/Object;
        //   567: checkcast       Lpe/h4;
        //   570: invokevirtual   pe/h4.h:()Lpe/d3;
        //   573: getfield        pe/d3.k:Lpe/b3;
        //   576: aload_2        
        //   577: ldc             "Error clearing complex main event"
        //   579: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   582: goto            618
        //   585: aload_0        
        //   586: getfield        pe/u7.d:Lpe/b;
        //   589: getfield        pe/a7.g:Lpe/g7;
        //   592: getfield        pe/g7.h:Lpe/k;
        //   595: astore          6
        //   597: aload           6
        //   599: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   602: aload           6
        //   604: aload_2        
        //   605: aload           5
        //   607: aload_0        
        //   608: getfield        pe/u7.c:J
        //   611: aload_0        
        //   612: getfield        pe/u7.a:Lie/g3;
        //   615: invokevirtual   pe/k.V:(Ljava/lang/String;Ljava/lang/Long;JLie/g3;)V
        //   618: new             Ljava/util/ArrayList;
        //   621: dup            
        //   622: invokespecial   java/util/ArrayList.<init>:()V
        //   625: astore_2       
        //   626: aload_0        
        //   627: getfield        pe/u7.a:Lie/g3;
        //   630: invokevirtual   ie/g3.z:()Lie/j6;
        //   633: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   638: astore          6
        //   640: aload           6
        //   642: invokeinterface java/util/Iterator.hasNext:()Z
        //   647: ifeq            695
        //   650: aload           6
        //   652: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   657: checkcast       Lie/k3;
        //   660: astore          7
        //   662: aload_0        
        //   663: getfield        pe/u7.d:Lpe/b;
        //   666: getfield        pe/a7.g:Lpe/g7;
        //   669: invokevirtual   pe/g7.O:()Lpe/i7;
        //   672: pop            
        //   673: aload_1        
        //   674: aload           7
        //   676: invokevirtual   ie/k3.x:()Ljava/lang/String;
        //   679: invokestatic    pe/i7.Q:(Lie/g3;Ljava/lang/String;)Lie/k3;
        //   682: ifnonnull       640
        //   685: aload_2        
        //   686: aload           7
        //   688: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   691: pop            
        //   692: goto            640
        //   695: aload_2        
        //   696: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   699: ifne            712
        //   702: aload_2        
        //   703: aload           4
        //   705: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   708: pop            
        //   709: goto            739
        //   712: aload_0        
        //   713: getfield        pe/u7.d:Lpe/b;
        //   716: getfield        z0/d1.f:Ljava/lang/Object;
        //   719: checkcast       Lpe/h4;
        //   722: invokevirtual   pe/h4.h:()Lpe/d3;
        //   725: getfield        pe/d3.l:Lpe/b3;
        //   728: aload           8
        //   730: ldc_w           "No unique parameters in main event. eventName"
        //   733: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   736: aload           4
        //   738: astore_2       
        //   739: aload           8
        //   741: astore          6
        //   743: aload_2        
        //   744: astore          7
        //   746: goto            932
        //   749: aload_0        
        //   750: getfield        pe/u7.d:Lpe/b;
        //   753: getfield        z0/d1.f:Ljava/lang/Object;
        //   756: checkcast       Lpe/h4;
        //   759: invokevirtual   pe/h4.h:()Lpe/d3;
        //   762: getfield        pe/d3.l:Lpe/b3;
        //   765: aload           8
        //   767: ldc_w           "Extra parameter without existing main event. eventName, eventId"
        //   770: aload           5
        //   772: invokevirtual   pe/b3.c:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        //   775: aconst_null    
        //   776: areturn        
        //   777: astore_1       
        //   778: aload           7
        //   780: astore_2       
        //   781: aload_2        
        //   782: ifnull          791
        //   785: aload_2        
        //   786: invokeinterface android/database/Cursor.close:()V
        //   791: aload_1        
        //   792: athrow         
        //   793: aload_0        
        //   794: aload           5
        //   796: putfield        pe/u7.b:Ljava/lang/Long;
        //   799: aload_0        
        //   800: aload_1        
        //   801: putfield        pe/u7.a:Lie/g3;
        //   804: aload_0        
        //   805: getfield        pe/u7.d:Lpe/b;
        //   808: getfield        pe/a7.g:Lpe/g7;
        //   811: invokevirtual   pe/g7.O:()Lpe/i7;
        //   814: pop            
        //   815: lconst_0       
        //   816: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   819: astore          6
        //   821: aload_1        
        //   822: ldc_w           "_epc"
        //   825: invokestatic    pe/i7.R:(Lie/g3;Ljava/lang/String;)Ljava/io/Serializable;
        //   828: astore          7
        //   830: aload           7
        //   832: ifnull          839
        //   835: aload           7
        //   837: astore          6
        //   839: aload           6
        //   841: checkcast       Ljava/lang/Long;
        //   844: invokevirtual   java/lang/Long.longValue:()J
        //   847: lstore          10
        //   849: aload_0        
        //   850: lload           10
        //   852: putfield        pe/u7.c:J
        //   855: lload           10
        //   857: lconst_0       
        //   858: lcmp           
        //   859: ifgt            895
        //   862: aload_0        
        //   863: getfield        pe/u7.d:Lpe/b;
        //   866: getfield        z0/d1.f:Ljava/lang/Object;
        //   869: checkcast       Lpe/h4;
        //   872: invokevirtual   pe/h4.h:()Lpe/d3;
        //   875: getfield        pe/d3.l:Lpe/b3;
        //   878: aload_3        
        //   879: ldc_w           "Complex event with zero extra param count. eventName"
        //   882: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   885: aload_3        
        //   886: astore          6
        //   888: aload           4
        //   890: astore          7
        //   892: goto            932
        //   895: aload_0        
        //   896: getfield        pe/u7.d:Lpe/b;
        //   899: getfield        pe/a7.g:Lpe/g7;
        //   902: getfield        pe/g7.h:Lpe/k;
        //   905: astore          6
        //   907: aload           6
        //   909: invokestatic    pe/g7.H:(Lpe/b7;)V
        //   912: aload           6
        //   914: aload_2        
        //   915: aload           5
        //   917: aload_0        
        //   918: getfield        pe/u7.c:J
        //   921: aload_1        
        //   922: invokevirtual   pe/k.V:(Ljava/lang/String;Ljava/lang/Long;JLie/g3;)V
        //   925: aload           4
        //   927: astore          7
        //   929: aload_3        
        //   930: astore          6
        //   932: aload_1        
        //   933: invokevirtual   ie/e6.o:()Lie/b6;
        //   936: checkcast       Lie/f3;
        //   939: astore_1       
        //   940: aload_1        
        //   941: aload           6
        //   943: invokevirtual   ie/f3.q:(Ljava/lang/String;)V
        //   946: aload_1        
        //   947: getfield        ie/b6.h:Z
        //   950: ifeq            965
        //   953: aload_1        
        //   954: invokevirtual   ie/b6.l:()V
        //   957: aload_1        
        //   958: iconst_0       
        //   959: putfield        ie/b6.h:Z
        //   962: goto            965
        //   965: aload_1        
        //   966: getfield        ie/b6.g:Lie/e6;
        //   969: checkcast       Lie/g3;
        //   972: invokestatic    ie/g3.D:(Lie/g3;)V
        //   975: aload_1        
        //   976: getfield        ie/b6.h:Z
        //   979: ifeq            991
        //   982: aload_1        
        //   983: invokevirtual   ie/b6.l:()V
        //   986: aload_1        
        //   987: iconst_0       
        //   988: putfield        ie/b6.h:Z
        //   991: aload_1        
        //   992: getfield        ie/b6.g:Lie/e6;
        //   995: checkcast       Lie/g3;
        //   998: aload           7
        //  1000: invokestatic    ie/g3.C:(Lie/g3;Ljava/lang/Iterable;)V
        //  1003: aload_1        
        //  1004: invokevirtual   ie/b6.j:()Lie/e6;
        //  1007: checkcast       Lie/g3;
        //  1010: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  166    194    363    367    Landroid/database/sqlite/SQLiteException;
        //  166    194    357    363    Any
        //  198    208    319    323    Landroid/database/sqlite/SQLiteException;
        //  198    208    777    781    Any
        //  212    231    319    323    Landroid/database/sqlite/SQLiteException;
        //  212    231    777    781    Any
        //  248    257    319    323    Landroid/database/sqlite/SQLiteException;
        //  248    257    777    781    Any
        //  261    271    319    323    Landroid/database/sqlite/SQLiteException;
        //  261    271    777    781    Any
        //  275    292    323    357    Ljava/io/IOException;
        //  275    292    319    323    Landroid/database/sqlite/SQLiteException;
        //  275    292    777    781    Any
        //  296    306    319    323    Landroid/database/sqlite/SQLiteException;
        //  296    306    777    781    Any
        //  328    354    319    323    Landroid/database/sqlite/SQLiteException;
        //  328    354    777    781    Any
        //  371    391    777    781    Any
        //  540    558    561    585    Landroid/database/sqlite/SQLiteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0244:
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
