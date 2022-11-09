// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import j0.i;
import a4.u1;
import androidx.work.WorkInfo$State;
import android.database.Cursor;
import java.util.Iterator;
import l5.c;
import j0.h$a;
import j5.o;
import ak0.n;
import j0.h$c;
import java.util.ArrayList;
import j0.b;
import j5.w;
import j5.e;
import androidx.room.RoomDatabase;

public final class t implements r
{
    public final RoomDatabase a;
    public final t$a b;
    public final t$b c;
    public final t$c d;
    public final t$d e;
    public final t$e f;
    public final t$f g;
    public final t$g h;
    public final t$h i;
    public final t$i j;
    
    public t(final RoomDatabase a) {
        this.a = a;
        this.b = new e<q>(a) {
            public final String b() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }
            
            @Override
            public final void d(final n5.e p0, final Object p1) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: checkcast       Ll6/q;
                //     4: astore_2       
                //     5: aload_2        
                //     6: getfield        l6/q.a:Ljava/lang/String;
                //     9: astore_3       
                //    10: iconst_1       
                //    11: istore          4
                //    13: aload_3        
                //    14: ifnonnull       27
                //    17: aload_1        
                //    18: iconst_1       
                //    19: invokeinterface n5/c.bindNull:(I)V
                //    24: goto            35
                //    27: aload_1        
                //    28: iconst_1       
                //    29: aload_3        
                //    30: invokeinterface n5/c.bindString:(ILjava/lang/String;)V
                //    35: aload_1        
                //    36: iconst_2       
                //    37: aload_2        
                //    38: getfield        l6/q.b:Landroidx/work/WorkInfo$State;
                //    41: invokestatic    l6/x.f:(Landroidx/work/WorkInfo$State;)I
                //    44: i2l            
                //    45: invokeinterface n5/c.bindLong:(IJ)V
                //    50: aload_2        
                //    51: getfield        l6/q.c:Ljava/lang/String;
                //    54: astore_3       
                //    55: aload_3        
                //    56: ifnonnull       69
                //    59: aload_1        
                //    60: iconst_3       
                //    61: invokeinterface n5/c.bindNull:(I)V
                //    66: goto            77
                //    69: aload_1        
                //    70: iconst_3       
                //    71: aload_3        
                //    72: invokeinterface n5/c.bindString:(ILjava/lang/String;)V
                //    77: aload_2        
                //    78: getfield        l6/q.d:Ljava/lang/String;
                //    81: astore_3       
                //    82: aload_3        
                //    83: ifnonnull       96
                //    86: aload_1        
                //    87: iconst_4       
                //    88: invokeinterface n5/c.bindNull:(I)V
                //    93: goto            104
                //    96: aload_1        
                //    97: iconst_4       
                //    98: aload_3        
                //    99: invokeinterface n5/c.bindString:(ILjava/lang/String;)V
                //   104: aload_2        
                //   105: getfield        l6/q.e:Landroidx/work/b;
                //   108: invokestatic    androidx/work/b.d:(Landroidx/work/b;)[B
                //   111: astore_3       
                //   112: aload_3        
                //   113: ifnonnull       126
                //   116: aload_1        
                //   117: iconst_5       
                //   118: invokeinterface n5/c.bindNull:(I)V
                //   123: goto            134
                //   126: aload_1        
                //   127: iconst_5       
                //   128: aload_3        
                //   129: invokeinterface n5/c.bindBlob:(I[B)V
                //   134: aload_2        
                //   135: getfield        l6/q.f:Landroidx/work/b;
                //   138: invokestatic    androidx/work/b.d:(Landroidx/work/b;)[B
                //   141: astore_3       
                //   142: aload_3        
                //   143: ifnonnull       157
                //   146: aload_1        
                //   147: bipush          6
                //   149: invokeinterface n5/c.bindNull:(I)V
                //   154: goto            166
                //   157: aload_1        
                //   158: bipush          6
                //   160: aload_3        
                //   161: invokeinterface n5/c.bindBlob:(I[B)V
                //   166: aload_1        
                //   167: bipush          7
                //   169: aload_2        
                //   170: getfield        l6/q.g:J
                //   173: invokeinterface n5/c.bindLong:(IJ)V
                //   178: aload_1        
                //   179: bipush          8
                //   181: aload_2        
                //   182: getfield        l6/q.h:J
                //   185: invokeinterface n5/c.bindLong:(IJ)V
                //   190: aload_1        
                //   191: bipush          9
                //   193: aload_2        
                //   194: getfield        l6/q.i:J
                //   197: invokeinterface n5/c.bindLong:(IJ)V
                //   202: aload_1        
                //   203: bipush          10
                //   205: aload_2        
                //   206: getfield        l6/q.k:I
                //   209: i2l            
                //   210: invokeinterface n5/c.bindLong:(IJ)V
                //   215: aload_2        
                //   216: getfield        l6/q.l:Landroidx/work/BackoffPolicy;
                //   219: astore_3       
                //   220: getstatic       l6/x$a.b:[I
                //   223: aload_3        
                //   224: invokevirtual   java/lang/Enum.ordinal:()I
                //   227: iaload         
                //   228: istore          5
                //   230: iload           5
                //   232: iconst_1       
                //   233: if_icmpeq       288
                //   236: iload           5
                //   238: iconst_2       
                //   239: if_icmpne       248
                //   242: iconst_1       
                //   243: istore          5
                //   245: goto            291
                //   248: new             Ljava/lang/StringBuilder;
                //   251: dup            
                //   252: invokespecial   java/lang/StringBuilder.<init>:()V
                //   255: astore_1       
                //   256: aload_1        
                //   257: ldc             "Could not convert "
                //   259: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   262: pop            
                //   263: aload_1        
                //   264: aload_3        
                //   265: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   268: pop            
                //   269: aload_1        
                //   270: ldc             " to int"
                //   272: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   275: pop            
                //   276: new             Ljava/lang/IllegalArgumentException;
                //   279: dup            
                //   280: aload_1        
                //   281: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   284: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
                //   287: athrow         
                //   288: iconst_0       
                //   289: istore          5
                //   291: aload_1        
                //   292: bipush          11
                //   294: iload           5
                //   296: i2l            
                //   297: invokeinterface n5/c.bindLong:(IJ)V
                //   302: aload_1        
                //   303: bipush          12
                //   305: aload_2        
                //   306: getfield        l6/q.m:J
                //   309: invokeinterface n5/c.bindLong:(IJ)V
                //   314: aload_1        
                //   315: bipush          13
                //   317: aload_2        
                //   318: getfield        l6/q.n:J
                //   321: invokeinterface n5/c.bindLong:(IJ)V
                //   326: aload_1        
                //   327: bipush          14
                //   329: aload_2        
                //   330: getfield        l6/q.o:J
                //   333: invokeinterface n5/c.bindLong:(IJ)V
                //   338: aload_1        
                //   339: bipush          15
                //   341: aload_2        
                //   342: getfield        l6/q.p:J
                //   345: invokeinterface n5/c.bindLong:(IJ)V
                //   350: aload_1        
                //   351: bipush          16
                //   353: aload_2        
                //   354: getfield        l6/q.q:Z
                //   357: i2l            
                //   358: invokeinterface n5/c.bindLong:(IJ)V
                //   363: aload_2        
                //   364: getfield        l6/q.r:Landroidx/work/OutOfQuotaPolicy;
                //   367: astore_3       
                //   368: getstatic       l6/x$a.d:[I
                //   371: aload_3        
                //   372: invokevirtual   java/lang/Enum.ordinal:()I
                //   375: iaload         
                //   376: istore          5
                //   378: iload           5
                //   380: iconst_1       
                //   381: if_icmpeq       436
                //   384: iload           5
                //   386: iconst_2       
                //   387: if_icmpne       396
                //   390: iconst_1       
                //   391: istore          5
                //   393: goto            439
                //   396: new             Ljava/lang/StringBuilder;
                //   399: dup            
                //   400: invokespecial   java/lang/StringBuilder.<init>:()V
                //   403: astore_1       
                //   404: aload_1        
                //   405: ldc             "Could not convert "
                //   407: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   410: pop            
                //   411: aload_1        
                //   412: aload_3        
                //   413: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   416: pop            
                //   417: aload_1        
                //   418: ldc             " to int"
                //   420: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   423: pop            
                //   424: new             Ljava/lang/IllegalArgumentException;
                //   427: dup            
                //   428: aload_1        
                //   429: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   432: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
                //   435: athrow         
                //   436: iconst_0       
                //   437: istore          5
                //   439: aload_1        
                //   440: bipush          17
                //   442: iload           5
                //   444: i2l            
                //   445: invokeinterface n5/c.bindLong:(IJ)V
                //   450: aload_2        
                //   451: getfield        l6/q.j:Lc6/b;
                //   454: astore_3       
                //   455: aload_3        
                //   456: ifnull          932
                //   459: aload_3        
                //   460: getfield        c6/b.a:Landroidx/work/NetworkType;
                //   463: astore_2       
                //   464: getstatic       l6/x$a.c:[I
                //   467: aload_2        
                //   468: invokevirtual   java/lang/Enum.ordinal:()I
                //   471: iaload         
                //   472: istore          6
                //   474: iload           6
                //   476: iconst_1       
                //   477: if_icmpeq       587
                //   480: iload           4
                //   482: istore          5
                //   484: iload           6
                //   486: iconst_2       
                //   487: if_icmpeq       590
                //   490: iload           6
                //   492: iconst_3       
                //   493: if_icmpeq       581
                //   496: iload           6
                //   498: iconst_4       
                //   499: if_icmpeq       575
                //   502: iload           6
                //   504: iconst_5       
                //   505: if_icmpeq       569
                //   508: getstatic       android/os/Build$VERSION.SDK_INT:I
                //   511: bipush          30
                //   513: if_icmplt       529
                //   516: aload_2        
                //   517: getstatic       androidx/work/NetworkType.TEMPORARILY_UNMETERED:Landroidx/work/NetworkType;
                //   520: if_acmpne       529
                //   523: iconst_5       
                //   524: istore          5
                //   526: goto            590
                //   529: new             Ljava/lang/StringBuilder;
                //   532: dup            
                //   533: invokespecial   java/lang/StringBuilder.<init>:()V
                //   536: astore_1       
                //   537: aload_1        
                //   538: ldc             "Could not convert "
                //   540: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   543: pop            
                //   544: aload_1        
                //   545: aload_2        
                //   546: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
                //   549: pop            
                //   550: aload_1        
                //   551: ldc             " to int"
                //   553: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
                //   556: pop            
                //   557: new             Ljava/lang/IllegalArgumentException;
                //   560: dup            
                //   561: aload_1        
                //   562: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
                //   565: invokespecial   java/lang/IllegalArgumentException.<init>:(Ljava/lang/String;)V
                //   568: athrow         
                //   569: iconst_4       
                //   570: istore          5
                //   572: goto            590
                //   575: iconst_3       
                //   576: istore          5
                //   578: goto            590
                //   581: iconst_2       
                //   582: istore          5
                //   584: goto            590
                //   587: iconst_0       
                //   588: istore          5
                //   590: aload_1        
                //   591: bipush          18
                //   593: iload           5
                //   595: i2l            
                //   596: invokeinterface n5/c.bindLong:(IJ)V
                //   601: aload_1        
                //   602: bipush          19
                //   604: aload_3        
                //   605: getfield        c6/b.b:Z
                //   608: i2l            
                //   609: invokeinterface n5/c.bindLong:(IJ)V
                //   614: aload_1        
                //   615: bipush          20
                //   617: aload_3        
                //   618: getfield        c6/b.c:Z
                //   621: i2l            
                //   622: invokeinterface n5/c.bindLong:(IJ)V
                //   627: aload_1        
                //   628: bipush          21
                //   630: aload_3        
                //   631: getfield        c6/b.d:Z
                //   634: i2l            
                //   635: invokeinterface n5/c.bindLong:(IJ)V
                //   640: aload_1        
                //   641: bipush          22
                //   643: aload_3        
                //   644: getfield        c6/b.e:Z
                //   647: i2l            
                //   648: invokeinterface n5/c.bindLong:(IJ)V
                //   653: aload_1        
                //   654: bipush          23
                //   656: aload_3        
                //   657: getfield        c6/b.f:J
                //   660: invokeinterface n5/c.bindLong:(IJ)V
                //   665: aload_1        
                //   666: bipush          24
                //   668: aload_3        
                //   669: getfield        c6/b.g:J
                //   672: invokeinterface n5/c.bindLong:(IJ)V
                //   677: aload_3        
                //   678: getfield        c6/b.h:Lc6/c;
                //   681: astore          7
                //   683: aload           7
                //   685: getfield        c6/c.a:Ljava/util/HashSet;
                //   688: invokevirtual   java/util/HashSet.size:()I
                //   691: istore          5
                //   693: aconst_null    
                //   694: astore          8
                //   696: aconst_null    
                //   697: astore_2       
                //   698: aconst_null    
                //   699: astore          9
                //   701: iload           5
                //   703: ifne            709
                //   706: goto            872
                //   709: new             Ljava/io/ByteArrayOutputStream;
                //   712: dup            
                //   713: invokespecial   java/io/ByteArrayOutputStream.<init>:()V
                //   716: astore          10
                //   718: aload           9
                //   720: astore_2       
                //   721: new             Ljava/io/ObjectOutputStream;
                //   724: astore_3       
                //   725: aload           9
                //   727: astore_2       
                //   728: aload_3        
                //   729: aload           10
                //   731: invokespecial   java/io/ObjectOutputStream.<init>:(Ljava/io/OutputStream;)V
                //   734: aload_3        
                //   735: aload           7
                //   737: getfield        c6/c.a:Ljava/util/HashSet;
                //   740: invokevirtual   java/util/HashSet.size:()I
                //   743: invokevirtual   java/io/ObjectOutputStream.writeInt:(I)V
                //   746: aload           7
                //   748: getfield        c6/c.a:Ljava/util/HashSet;
                //   751: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
                //   754: astore_2       
                //   755: aload_2        
                //   756: invokeinterface java/util/Iterator.hasNext:()Z
                //   761: ifeq            799
                //   764: aload_2        
                //   765: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
                //   770: checkcast       Lc6/c$a;
                //   773: astore          9
                //   775: aload_3        
                //   776: aload           9
                //   778: getfield        c6/c$a.a:Landroid/net/Uri;
                //   781: invokevirtual   android/net/Uri.toString:()Ljava/lang/String;
                //   784: invokevirtual   java/io/ObjectOutputStream.writeUTF:(Ljava/lang/String;)V
                //   787: aload_3        
                //   788: aload           9
                //   790: getfield        c6/c$a.b:Z
                //   793: invokevirtual   java/io/ObjectOutputStream.writeBoolean:(Z)V
                //   796: goto            755
                //   799: aload_3        
                //   800: invokevirtual   java/io/ObjectOutputStream.close:()V
                //   803: goto            853
                //   806: astore_1       
                //   807: goto            815
                //   810: astore          9
                //   812: goto            818
                //   815: goto            901
                //   818: goto            830
                //   821: astore_1       
                //   822: goto            899
                //   825: astore          9
                //   827: aload           8
                //   829: astore_3       
                //   830: aload_3        
                //   831: astore_2       
                //   832: aload           9
                //   834: invokevirtual   java/lang/Throwable.printStackTrace:()V
                //   837: aload_3        
                //   838: ifnull          853
                //   841: aload_3        
                //   842: invokevirtual   java/io/ObjectOutputStream.close:()V
                //   845: goto            853
                //   848: astore_2       
                //   849: aload_2        
                //   850: invokevirtual   java/lang/Throwable.printStackTrace:()V
                //   853: aload           10
                //   855: invokevirtual   java/io/ByteArrayOutputStream.close:()V
                //   858: goto            866
                //   861: astore_2       
                //   862: aload_2        
                //   863: invokevirtual   java/lang/Throwable.printStackTrace:()V
                //   866: aload           10
                //   868: invokevirtual   java/io/ByteArrayOutputStream.toByteArray:()[B
                //   871: astore_2       
                //   872: aload_2        
                //   873: ifnonnull       887
                //   876: aload_1        
                //   877: bipush          25
                //   879: invokeinterface n5/c.bindNull:(I)V
                //   884: goto            996
                //   887: aload_1        
                //   888: bipush          25
                //   890: aload_2        
                //   891: invokeinterface n5/c.bindBlob:(I[B)V
                //   896: goto            996
                //   899: aload_2        
                //   900: astore_3       
                //   901: aload_3        
                //   902: ifnull          917
                //   905: aload_3        
                //   906: invokevirtual   java/io/ObjectOutputStream.close:()V
                //   909: goto            917
                //   912: astore_2       
                //   913: aload_2        
                //   914: invokevirtual   java/lang/Throwable.printStackTrace:()V
                //   917: aload           10
                //   919: invokevirtual   java/io/ByteArrayOutputStream.close:()V
                //   922: goto            930
                //   925: astore_2       
                //   926: aload_2        
                //   927: invokevirtual   java/lang/Throwable.printStackTrace:()V
                //   930: aload_1        
                //   931: athrow         
                //   932: aload_1        
                //   933: bipush          18
                //   935: invokeinterface n5/c.bindNull:(I)V
                //   940: aload_1        
                //   941: bipush          19
                //   943: invokeinterface n5/c.bindNull:(I)V
                //   948: aload_1        
                //   949: bipush          20
                //   951: invokeinterface n5/c.bindNull:(I)V
                //   956: aload_1        
                //   957: bipush          21
                //   959: invokeinterface n5/c.bindNull:(I)V
                //   964: aload_1        
                //   965: bipush          22
                //   967: invokeinterface n5/c.bindNull:(I)V
                //   972: aload_1        
                //   973: bipush          23
                //   975: invokeinterface n5/c.bindNull:(I)V
                //   980: aload_1        
                //   981: bipush          24
                //   983: invokeinterface n5/c.bindNull:(I)V
                //   988: aload_1        
                //   989: bipush          25
                //   991: invokeinterface n5/c.bindNull:(I)V
                //   996: return         
                //    Exceptions:
                //  Try           Handler
                //  Start  End    Start  End    Type                 
                //  -----  -----  -----  -----  ---------------------
                //  721    725    825    830    Ljava/io/IOException;
                //  721    725    821    825    Any
                //  728    734    825    830    Ljava/io/IOException;
                //  728    734    821    825    Any
                //  734    755    810    815    Ljava/io/IOException;
                //  734    755    806    810    Any
                //  755    796    810    815    Ljava/io/IOException;
                //  755    796    806    810    Any
                //  799    803    848    853    Ljava/io/IOException;
                //  832    837    821    825    Any
                //  841    845    848    853    Ljava/io/IOException;
                //  853    858    861    866    Ljava/io/IOException;
                //  905    909    912    917    Ljava/io/IOException;
                //  917    922    925    930    Ljava/io/IOException;
                // 
                // The error that occurred was:
                // 
                // java.lang.IllegalStateException: Expression is linked from several locations: Label_0799:
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
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformCall(AstMethodBodyBuilder.java:1151)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:993)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformByteCode(AstMethodBodyBuilder.java:548)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformExpression(AstMethodBodyBuilder.java:534)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformNode(AstMethodBodyBuilder.java:377)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.transformBlock(AstMethodBodyBuilder.java:318)
                //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:213)
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
        };
        this.c = new w(a) {
            public final String b() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.d = new w(a) {
            public final String b() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.e = new w(a) {
            public final String b() {
                return "UPDATE workspec SET period_start_time=? WHERE id=?";
            }
        };
        this.f = new w(a) {
            public final String b() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.g = new w(a) {
            public final String b() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.h = new w(a) {
            public final String b() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.i = new w(a) {
            public final String b() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.j = new w(a) {
            public final String b() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
    }
    
    public final void a(final b<String, ArrayList<androidx.work.b>> b) {
        final h$c h$c = (h$c)b.keySet();
        if (h$c.isEmpty()) {
            return;
        }
        if (((i)b).h > 999) {
            b b2 = new b(999);
            int n;
            int n2;
            for (int h = ((i)b).h, i = n = 0; i < h; i = n2) {
                ((i)b2).put((Object)((i)b).j(i), (Object)((i)b).n(i));
                n2 = i + 1;
                final int n3 = n + 1;
                i = n2;
                if ((n = n3) == 999) {
                    this.a((b<String, ArrayList<androidx.work.b>>)b2);
                    b2 = new b(999);
                    n = 0;
                }
            }
            if (n > 0) {
                this.a((b<String, ArrayList<androidx.work.b>>)b2);
            }
            return;
        }
        final StringBuilder k = a.k("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        final o a = o.a(n.e(h$c, k, ")") + 0, k.toString());
        final Iterator iterator = h$c.iterator();
        int n4 = 1;
        while (true) {
            final h$a h$a = (h$a)iterator;
            if (!h$a.hasNext()) {
                break;
            }
            final String s = (String)h$a.next();
            if (s == null) {
                a.bindNull(n4);
            }
            else {
                a.bindString(n4, s);
            }
            ++n4;
        }
        final Cursor b3 = l5.c.b(this.a, a, false);
        try {
            final int a2 = l5.b.a(b3, "work_spec_id");
            if (a2 == -1) {
                return;
            }
            while (b3.moveToNext()) {
                if (!b3.isNull(a2)) {
                    final ArrayList list = (ArrayList)((i)b).getOrDefault((Object)b3.getString(a2), (Object)null);
                    if (list == null) {
                        continue;
                    }
                    list.add(androidx.work.b.a(b3.getBlob(0)));
                }
            }
        }
        finally {
            b3.close();
        }
    }
    
    public final void b(final b<String, ArrayList<String>> b) {
        final h$c h$c = (h$c)b.keySet();
        if (h$c.isEmpty()) {
            return;
        }
        if (((i)b).h > 999) {
            b b2 = new b(999);
            int n;
            int n2;
            for (int h = ((i)b).h, i = n = 0; i < h; i = n2) {
                ((i)b2).put((Object)((i)b).j(i), (Object)((i)b).n(i));
                n2 = i + 1;
                final int n3 = n + 1;
                i = n2;
                if ((n = n3) == 999) {
                    this.b((b<String, ArrayList<String>>)b2);
                    b2 = new b(999);
                    n = 0;
                }
            }
            if (n > 0) {
                this.b((b<String, ArrayList<String>>)b2);
            }
            return;
        }
        final StringBuilder k = a.k("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        final o a = o.a(n.e(h$c, k, ")") + 0, k.toString());
        final Iterator iterator = h$c.iterator();
        int n4 = 1;
        while (true) {
            final h$a h$a = (h$a)iterator;
            if (!h$a.hasNext()) {
                break;
            }
            final String s = (String)h$a.next();
            if (s == null) {
                a.bindNull(n4);
            }
            else {
                a.bindString(n4, s);
            }
            ++n4;
        }
        final Cursor b3 = l5.c.b(this.a, a, false);
        try {
            final int a2 = l5.b.a(b3, "work_spec_id");
            if (a2 == -1) {
                return;
            }
            while (b3.moveToNext()) {
                if (!b3.isNull(a2)) {
                    final ArrayList list = (ArrayList)((i)b).getOrDefault((Object)b3.getString(a2), (Object)null);
                    if (list == null) {
                        continue;
                    }
                    list.add(b3.getString(0));
                }
            }
        }
        finally {
            b3.close();
        }
    }
    
    public final void c(final String s) {
        this.a.b();
        final n5.e a = this.c.a();
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.c.c(a);
        }
    }
    
    public final ArrayList d() {
        final o a = o.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        a.bindLong(1, 200);
        this.a.b();
        final Cursor b = l5.c.b(this.a, a, false);
        try {
            final int b2 = l5.b.b(b, "required_network_type");
            final int b3 = l5.b.b(b, "requires_charging");
            final int b4 = l5.b.b(b, "requires_device_idle");
            final int b5 = l5.b.b(b, "requires_battery_not_low");
            final int b6 = l5.b.b(b, "requires_storage_not_low");
            final int b7 = l5.b.b(b, "trigger_content_update_delay");
            final int b8 = l5.b.b(b, "trigger_max_content_delay");
            final int b9 = l5.b.b(b, "content_uri_triggers");
            final int b10 = l5.b.b(b, "id");
            final int b11 = l5.b.b(b, "state");
            final int b12 = l5.b.b(b, "worker_class_name");
            final int b13 = l5.b.b(b, "input_merger_class_name");
            final int b14 = l5.b.b(b, "input");
            final int b15 = l5.b.b(b, "output");
            try {
                final int b16 = l5.b.b(b, "initial_delay");
                final int b17 = l5.b.b(b, "interval_duration");
                final int b18 = l5.b.b(b, "flex_duration");
                final int b19 = l5.b.b(b, "run_attempt_count");
                final int b20 = l5.b.b(b, "backoff_policy");
                final int b21 = l5.b.b(b, "backoff_delay_duration");
                final int b22 = l5.b.b(b, "period_start_time");
                final int b23 = l5.b.b(b, "minimum_retention_duration");
                final int b24 = l5.b.b(b, "schedule_requested_at");
                final int b25 = l5.b.b(b, "run_in_foreground");
                final int b26 = l5.b.b(b, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(b.getCount());
                while (b.moveToNext()) {
                    final String string = b.getString(b10);
                    final String string2 = b.getString(b12);
                    final c6.b j = new c6.b();
                    j.a = x.c(b.getInt(b2));
                    j.b = (b.getInt(b3) != 0);
                    j.c = (b.getInt(b4) != 0);
                    j.d = (b.getInt(b5) != 0);
                    j.e = (b.getInt(b6) != 0);
                    j.f = b.getLong(b7);
                    j.g = b.getLong(b8);
                    j.h = x.a(b.getBlob(b9));
                    final q q = new q(string, string2);
                    q.b = x.e(b.getInt(b11));
                    q.d = b.getString(b13);
                    q.e = androidx.work.b.a(b.getBlob(b14));
                    q.f = androidx.work.b.a(b.getBlob(b15));
                    q.g = b.getLong(b16);
                    q.h = b.getLong(b17);
                    q.i = b.getLong(b18);
                    q.k = b.getInt(b19);
                    q.l = x.b(b.getInt(b20));
                    q.m = b.getLong(b21);
                    q.n = b.getLong(b22);
                    q.o = b.getLong(b23);
                    q.p = b.getLong(b24);
                    q.q = (b.getInt(b25) != 0);
                    q.r = x.d(b.getInt(b26));
                    q.j = j;
                    list.add(q);
                }
                b.close();
                a.h();
                return list;
            }
            finally {}
        }
        finally {}
        b.close();
        a.h();
    }
    
    public final ArrayList e(int b) {
        final o a = o.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        a.bindLong(1, b);
        this.a.b();
        final Cursor b2 = l5.c.b(this.a, a, false);
        try {
            final int b3 = l5.b.b(b2, "required_network_type");
            final int b4 = l5.b.b(b2, "requires_charging");
            final int b5 = l5.b.b(b2, "requires_device_idle");
            final int b6 = l5.b.b(b2, "requires_battery_not_low");
            final int b7 = l5.b.b(b2, "requires_storage_not_low");
            final int b8 = l5.b.b(b2, "trigger_content_update_delay");
            final int b9 = l5.b.b(b2, "trigger_max_content_delay");
            final int b10 = l5.b.b(b2, "content_uri_triggers");
            final int b11 = l5.b.b(b2, "id");
            final int b12 = l5.b.b(b2, "state");
            final int b13 = l5.b.b(b2, "worker_class_name");
            final int b14 = l5.b.b(b2, "input_merger_class_name");
            final int b15 = l5.b.b(b2, "input");
            final int b16 = l5.b.b(b2, "output");
            try {
                final int b17 = l5.b.b(b2, "initial_delay");
                final int b18 = l5.b.b(b2, "interval_duration");
                final int b19 = l5.b.b(b2, "flex_duration");
                final int b20 = l5.b.b(b2, "run_attempt_count");
                b = l5.b.b(b2, "backoff_policy");
                final int b21 = l5.b.b(b2, "backoff_delay_duration");
                final int b22 = l5.b.b(b2, "period_start_time");
                final int b23 = l5.b.b(b2, "minimum_retention_duration");
                final int b24 = l5.b.b(b2, "schedule_requested_at");
                final int b25 = l5.b.b(b2, "run_in_foreground");
                final int b26 = l5.b.b(b2, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(b2.getCount());
                while (b2.moveToNext()) {
                    final String string = b2.getString(b11);
                    final String string2 = b2.getString(b13);
                    final c6.b j = new c6.b();
                    j.a = x.c(b2.getInt(b3));
                    j.b = (b2.getInt(b4) != 0);
                    j.c = (b2.getInt(b5) != 0);
                    j.d = (b2.getInt(b6) != 0);
                    j.e = (b2.getInt(b7) != 0);
                    j.f = b2.getLong(b8);
                    j.g = b2.getLong(b9);
                    j.h = x.a(b2.getBlob(b10));
                    final q q = new q(string, string2);
                    q.b = x.e(b2.getInt(b12));
                    q.d = b2.getString(b14);
                    q.e = androidx.work.b.a(b2.getBlob(b15));
                    q.f = androidx.work.b.a(b2.getBlob(b16));
                    q.g = b2.getLong(b17);
                    q.h = b2.getLong(b18);
                    q.i = b2.getLong(b19);
                    q.k = b2.getInt(b20);
                    q.l = x.b(b2.getInt(b));
                    q.m = b2.getLong(b21);
                    q.n = b2.getLong(b22);
                    q.o = b2.getLong(b23);
                    q.p = b2.getLong(b24);
                    q.q = (b2.getInt(b25) != 0);
                    q.r = x.d(b2.getInt(b26));
                    q.j = j;
                    list.add(q);
                }
                b2.close();
                a.h();
                return list;
            }
            finally {}
        }
        finally {}
        b2.close();
        a.h();
    }
    
    public final ArrayList f() {
        final o a = o.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        this.a.b();
        final Cursor b = l5.c.b(this.a, a, false);
        try {
            final int b2 = l5.b.b(b, "required_network_type");
            final int b3 = l5.b.b(b, "requires_charging");
            final int b4 = l5.b.b(b, "requires_device_idle");
            final int b5 = l5.b.b(b, "requires_battery_not_low");
            final int b6 = l5.b.b(b, "requires_storage_not_low");
            final int b7 = l5.b.b(b, "trigger_content_update_delay");
            final int b8 = l5.b.b(b, "trigger_max_content_delay");
            final int b9 = l5.b.b(b, "content_uri_triggers");
            final int b10 = l5.b.b(b, "id");
            final int b11 = l5.b.b(b, "state");
            final int b12 = l5.b.b(b, "worker_class_name");
            final int b13 = l5.b.b(b, "input_merger_class_name");
            final int b14 = l5.b.b(b, "input");
            final int b15 = l5.b.b(b, "output");
            try {
                final int b16 = l5.b.b(b, "initial_delay");
                final int b17 = l5.b.b(b, "interval_duration");
                final int b18 = l5.b.b(b, "flex_duration");
                final int b19 = l5.b.b(b, "run_attempt_count");
                final int b20 = l5.b.b(b, "backoff_policy");
                final int b21 = l5.b.b(b, "backoff_delay_duration");
                final int b22 = l5.b.b(b, "period_start_time");
                final int b23 = l5.b.b(b, "minimum_retention_duration");
                final int b24 = l5.b.b(b, "schedule_requested_at");
                final int b25 = l5.b.b(b, "run_in_foreground");
                final int b26 = l5.b.b(b, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(b.getCount());
                while (b.moveToNext()) {
                    final String string = b.getString(b10);
                    final String string2 = b.getString(b12);
                    final c6.b j = new c6.b();
                    j.a = x.c(b.getInt(b2));
                    j.b = (b.getInt(b3) != 0);
                    j.c = (b.getInt(b4) != 0);
                    j.d = (b.getInt(b5) != 0);
                    j.e = (b.getInt(b6) != 0);
                    j.f = b.getLong(b7);
                    j.g = b.getLong(b8);
                    j.h = x.a(b.getBlob(b9));
                    final q q = new q(string, string2);
                    q.b = x.e(b.getInt(b11));
                    q.d = b.getString(b13);
                    q.e = androidx.work.b.a(b.getBlob(b14));
                    q.f = androidx.work.b.a(b.getBlob(b15));
                    q.g = b.getLong(b16);
                    q.h = b.getLong(b17);
                    q.i = b.getLong(b18);
                    q.k = b.getInt(b19);
                    q.l = x.b(b.getInt(b20));
                    q.m = b.getLong(b21);
                    q.n = b.getLong(b22);
                    q.o = b.getLong(b23);
                    q.p = b.getLong(b24);
                    q.q = (b.getInt(b25) != 0);
                    q.r = x.d(b.getInt(b26));
                    q.j = j;
                    list.add(q);
                }
                b.close();
                a.h();
                return list;
            }
            finally {}
        }
        finally {}
        b.close();
        a.h();
    }
    
    public final ArrayList g() {
        final o a = o.a(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.a.b();
        final Cursor b = l5.c.b(this.a, a, false);
        try {
            final int b2 = l5.b.b(b, "required_network_type");
            final int b3 = l5.b.b(b, "requires_charging");
            final int b4 = l5.b.b(b, "requires_device_idle");
            final int b5 = l5.b.b(b, "requires_battery_not_low");
            final int b6 = l5.b.b(b, "requires_storage_not_low");
            final int b7 = l5.b.b(b, "trigger_content_update_delay");
            final int b8 = l5.b.b(b, "trigger_max_content_delay");
            final int b9 = l5.b.b(b, "content_uri_triggers");
            final int b10 = l5.b.b(b, "id");
            final int b11 = l5.b.b(b, "state");
            final int b12 = l5.b.b(b, "worker_class_name");
            final int b13 = l5.b.b(b, "input_merger_class_name");
            final int b14 = l5.b.b(b, "input");
            final int b15 = l5.b.b(b, "output");
            try {
                final int b16 = l5.b.b(b, "initial_delay");
                final int b17 = l5.b.b(b, "interval_duration");
                final int b18 = l5.b.b(b, "flex_duration");
                final int b19 = l5.b.b(b, "run_attempt_count");
                final int b20 = l5.b.b(b, "backoff_policy");
                final int b21 = l5.b.b(b, "backoff_delay_duration");
                final int b22 = l5.b.b(b, "period_start_time");
                final int b23 = l5.b.b(b, "minimum_retention_duration");
                final int b24 = l5.b.b(b, "schedule_requested_at");
                final int b25 = l5.b.b(b, "run_in_foreground");
                final int b26 = l5.b.b(b, "out_of_quota_policy");
                final ArrayList list = new ArrayList<q>(b.getCount());
                while (b.moveToNext()) {
                    final String string = b.getString(b10);
                    final String string2 = b.getString(b12);
                    final c6.b j = new c6.b();
                    j.a = x.c(b.getInt(b2));
                    j.b = (b.getInt(b3) != 0);
                    j.c = (b.getInt(b4) != 0);
                    j.d = (b.getInt(b5) != 0);
                    j.e = (b.getInt(b6) != 0);
                    j.f = b.getLong(b7);
                    j.g = b.getLong(b8);
                    j.h = x.a(b.getBlob(b9));
                    final q q = new q(string, string2);
                    q.b = x.e(b.getInt(b11));
                    q.d = b.getString(b13);
                    q.e = androidx.work.b.a(b.getBlob(b14));
                    q.f = androidx.work.b.a(b.getBlob(b15));
                    q.g = b.getLong(b16);
                    q.h = b.getLong(b17);
                    q.i = b.getLong(b18);
                    q.k = b.getInt(b19);
                    q.l = x.b(b.getInt(b20));
                    q.m = b.getLong(b21);
                    q.n = b.getLong(b22);
                    q.o = b.getLong(b23);
                    q.p = b.getLong(b24);
                    q.q = (b.getInt(b25) != 0);
                    q.r = x.d(b.getInt(b26));
                    q.j = j;
                    list.add(q);
                }
                b.close();
                a.h();
                return list;
            }
            finally {}
        }
        finally {}
        b.close();
        a.h();
    }
    
    public final WorkInfo$State h(final String s) {
        final o a = o.a(1, "SELECT state FROM workspec WHERE id=?");
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        this.a.b();
        final RoomDatabase a2 = this.a;
        WorkInfo$State e = null;
        final Cursor b = l5.c.b(a2, a, false);
        try {
            if (b.moveToFirst()) {
                e = x.e(b.getInt(0));
            }
            return e;
        }
        finally {
            b.close();
            a.h();
        }
    }
    
    public final ArrayList i(String b) {
        final o a = o.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (b == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, b);
        }
        this.a.b();
        b = (String)l5.c.b(this.a, a, false);
        try {
            final ArrayList<String> list = new ArrayList<String>(((Cursor)b).getCount());
            while (((Cursor)b).moveToNext()) {
                list.add(((Cursor)b).getString(0));
            }
            return list;
        }
        finally {
            ((Cursor)b).close();
            a.h();
        }
    }
    
    public final ArrayList j(String b) {
        final o a = o.a(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (b == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, b);
        }
        this.a.b();
        b = (String)l5.c.b(this.a, a, false);
        try {
            final ArrayList<String> list = new ArrayList<String>(((Cursor)b).getCount());
            while (((Cursor)b).moveToNext()) {
                list.add(((Cursor)b).getString(0));
            }
            return list;
        }
        finally {
            ((Cursor)b).close();
            a.h();
        }
    }
    
    public final q k(final String s) {
        final o a = o.a(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        this.a.b();
        final Cursor b = l5.c.b(this.a, a, false);
        try {
            final int b2 = l5.b.b(b, "required_network_type");
            final int b3 = l5.b.b(b, "requires_charging");
            final int b4 = l5.b.b(b, "requires_device_idle");
            final int b5 = l5.b.b(b, "requires_battery_not_low");
            final int b6 = l5.b.b(b, "requires_storage_not_low");
            final int b7 = l5.b.b(b, "trigger_content_update_delay");
            final int b8 = l5.b.b(b, "trigger_max_content_delay");
            final int b9 = l5.b.b(b, "content_uri_triggers");
            final int b10 = l5.b.b(b, "id");
            final int b11 = l5.b.b(b, "state");
            final int b12 = l5.b.b(b, "worker_class_name");
            final int b13 = l5.b.b(b, "input_merger_class_name");
            final int b14 = l5.b.b(b, "input");
            final int b15 = l5.b.b(b, "output");
            try {
                final int b16 = l5.b.b(b, "initial_delay");
                final int b17 = l5.b.b(b, "interval_duration");
                final int b18 = l5.b.b(b, "flex_duration");
                final int b19 = l5.b.b(b, "run_attempt_count");
                final int b20 = l5.b.b(b, "backoff_policy");
                final int b21 = l5.b.b(b, "backoff_delay_duration");
                final int b22 = l5.b.b(b, "period_start_time");
                final int b23 = l5.b.b(b, "minimum_retention_duration");
                final int b24 = l5.b.b(b, "schedule_requested_at");
                final int b25 = l5.b.b(b, "run_in_foreground");
                final int b26 = l5.b.b(b, "out_of_quota_policy");
                q q;
                if (b.moveToFirst()) {
                    final String string = b.getString(b10);
                    final String string2 = b.getString(b12);
                    final c6.b j = new c6.b();
                    j.a = x.c(b.getInt(b2));
                    j.b = (b.getInt(b3) != 0);
                    j.c = (b.getInt(b4) != 0);
                    j.d = (b.getInt(b5) != 0);
                    j.e = (b.getInt(b6) != 0);
                    j.f = b.getLong(b7);
                    j.g = b.getLong(b8);
                    j.h = x.a(b.getBlob(b9));
                    q = new q(string, string2);
                    q.b = x.e(b.getInt(b11));
                    q.d = b.getString(b13);
                    q.e = androidx.work.b.a(b.getBlob(b14));
                    q.f = androidx.work.b.a(b.getBlob(b15));
                    q.g = b.getLong(b16);
                    q.h = b.getLong(b17);
                    q.i = b.getLong(b18);
                    q.k = b.getInt(b19);
                    q.l = x.b(b.getInt(b20));
                    q.m = b.getLong(b21);
                    q.n = b.getLong(b22);
                    q.o = b.getLong(b23);
                    q.p = b.getLong(b24);
                    q.q = (b.getInt(b25) != 0);
                    q.r = x.d(b.getInt(b26));
                    q.j = j;
                }
                else {
                    q = null;
                }
                b.close();
                a.h();
                return q;
            }
            finally {}
        }
        finally {}
        b.close();
        a.h();
    }
    
    public final ArrayList l(String b) {
        final o a = o.a(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (b == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, b);
        }
        this.a.b();
        b = (String)l5.c.b(this.a, a, false);
        try {
            final int b2 = l5.b.b((Cursor)b, "id");
            final int b3 = l5.b.b((Cursor)b, "state");
            final ArrayList<q.b> list = new ArrayList<q.b>(((Cursor)b).getCount());
            while (((Cursor)b).moveToNext()) {
                final q.b b4 = new q.b();
                b4.a = ((Cursor)b).getString(b2);
                b4.b = x.e(((Cursor)b).getInt(b3));
                list.add(b4);
            }
            return list;
        }
        finally {
            ((Cursor)b).close();
            a.h();
        }
    }
    
    public final int m(final String s) {
        this.a.b();
        final n5.e a = this.f.a();
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        this.a.c();
        try {
            final int executeUpdateDelete = a.executeUpdateDelete();
            this.a.q();
            return executeUpdateDelete;
        }
        finally {
            this.a.m();
            this.f.c(a);
        }
    }
    
    public final int n(final long n, final String s) {
        this.a.b();
        final n5.e a = this.h.a();
        a.bindLong(1, n);
        if (s == null) {
            a.bindNull(2);
        }
        else {
            a.bindString(2, s);
        }
        this.a.c();
        try {
            final int executeUpdateDelete = a.executeUpdateDelete();
            this.a.q();
            return executeUpdateDelete;
        }
        finally {
            this.a.m();
            this.h.c(a);
        }
    }
    
    public final void o() {
        this.a.b();
        final n5.e a = this.j.a();
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.j.c(a);
        }
    }
    
    public final int p(final String s) {
        this.a.b();
        final n5.e a = this.g.a();
        if (s == null) {
            a.bindNull(1);
        }
        else {
            a.bindString(1, s);
        }
        this.a.c();
        try {
            final int executeUpdateDelete = a.executeUpdateDelete();
            this.a.q();
            return executeUpdateDelete;
        }
        finally {
            this.a.m();
            this.g.c(a);
        }
    }
    
    public final void q(final String s, final androidx.work.b b) {
        this.a.b();
        final n5.e a = this.d.a();
        final byte[] d = androidx.work.b.d(b);
        if (d == null) {
            a.bindNull(1);
        }
        else {
            a.bindBlob(1, d);
        }
        if (s == null) {
            a.bindNull(2);
        }
        else {
            a.bindString(2, s);
        }
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.d.c(a);
        }
    }
    
    public final void r(final long n, final String s) {
        this.a.b();
        final n5.e a = this.e.a();
        a.bindLong(1, n);
        if (s == null) {
            a.bindNull(2);
        }
        else {
            a.bindString(2, s);
        }
        this.a.c();
        try {
            a.executeUpdateDelete();
            this.a.q();
        }
        finally {
            this.a.m();
            this.e.c(a);
        }
    }
    
    public final int s(final WorkInfo$State workInfo$State, final String... array) {
        this.a.b();
        final StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        u1.v(array.length, sb);
        sb.append(")");
        final n5.e f = this.a.f(sb.toString());
        f.bindLong(1, x.f(workInfo$State));
        final int length = array.length;
        int n = 2;
        for (final String s : array) {
            if (s == null) {
                f.bindNull(n);
            }
            else {
                f.bindString(n, s);
            }
            ++n;
        }
        this.a.c();
        try {
            final int executeUpdateDelete = f.executeUpdateDelete();
            this.a.q();
            return executeUpdateDelete;
        }
        finally {
            this.a.m();
        }
    }
}
