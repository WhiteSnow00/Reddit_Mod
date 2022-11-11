// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import z0.d1;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Looper;
import android.content.ServiceConnection;
import android.content.Intent;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;
import android.content.pm.Signature;
import java.security.MessageDigest;
import android.content.pm.PackageManager;
import com.google.android.gms.internal.measurement.y;
import android.content.Context;
import com.google.android.gms.internal.measurement.a0;
import ie.y9;
import android.content.pm.PackageManager$NameNotFoundException;
import lw0.b;
import android.util.Pair;
import android.content.SharedPreferences$Editor;
import md.f;
import android.os.Parcelable;
import qd.a;
import android.content.ComponentName;
import ud.c;
import java.util.ArrayList;

public final class l6 extends i3
{
    public final k6 h;
    public u2 i;
    public volatile Boolean j;
    public final d6 k;
    public final x6 l;
    public final ArrayList m;
    public final f6 n;
    
    public l6(final h4 h4) {
        super(h4);
        this.m = new ArrayList();
        this.l = new x6((c)h4.s);
        this.h = new k6(this);
        this.k = new d6((Object)this, (w4)h4, 0);
        this.n = new f6(this, (w4)h4);
    }
    
    public static void a0(final l6 l6, final ComponentName componentName) {
        l6.M();
        if (l6.i != null) {
            l6.i = null;
            ((h4)l6.f).h().s.b((Object)componentName, "Disconnected from device MeasurementService");
            l6.M();
            l6.b0();
        }
    }
    
    @Override
    public final boolean P() {
        return false;
    }
    
    public final void Q(final u2 p0, final a p1, final q7 p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   pe/l2.M:()V
        //     4: aload_0        
        //     5: invokevirtual   pe/i3.N:()V
        //     8: aload_0        
        //     9: getfield        z0/d1.f:Ljava/lang/Object;
        //    12: checkcast       Lpe/h4;
        //    15: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    18: pop            
        //    19: aload_0        
        //    20: getfield        z0/d1.f:Ljava/lang/Object;
        //    23: checkcast       Lpe/h4;
        //    26: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    29: pop            
        //    30: bipush          100
        //    32: istore          4
        //    34: iconst_0       
        //    35: istore          5
        //    37: iload           5
        //    39: sipush          1001
        //    42: if_icmpge       1995
        //    45: iload           4
        //    47: bipush          100
        //    49: if_icmpne       1995
        //    52: new             Ljava/util/ArrayList;
        //    55: dup            
        //    56: invokespecial   java/util/ArrayList.<init>:()V
        //    59: astore          6
        //    61: aload_0        
        //    62: getfield        z0/d1.f:Ljava/lang/Object;
        //    65: checkcast       Lpe/h4;
        //    68: invokevirtual   pe/h4.p:()Lpe/x2;
        //    71: astore          7
        //    73: ldc             "rowid"
        //    75: astore          8
        //    77: ldc             "Error reading entries from local database"
        //    79: astore          9
        //    81: aload           7
        //    83: invokevirtual   pe/l2.M:()V
        //    86: aload           7
        //    88: getfield        pe/x2.i:Z
        //    91: ifeq            97
        //    94: goto            172
        //    97: new             Ljava/util/ArrayList;
        //   100: dup            
        //   101: invokespecial   java/util/ArrayList.<init>:()V
        //   104: astore          10
        //   106: aload           7
        //   108: getfield        z0/d1.f:Ljava/lang/Object;
        //   111: checkcast       Lpe/h4;
        //   114: astore          11
        //   116: aload           11
        //   118: getfield        pe/h4.f:Landroid/content/Context;
        //   121: astore          12
        //   123: aload           11
        //   125: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   128: pop            
        //   129: aload           12
        //   131: ldc             "google_app_measurement_local.db"
        //   133: invokevirtual   android/content/Context.getDatabasePath:(Ljava/lang/String;)Ljava/io/File;
        //   136: invokevirtual   java/io/File.exists:()Z
        //   139: ifeq            1723
        //   142: iconst_0       
        //   143: istore          13
        //   145: iconst_5       
        //   146: istore          14
        //   148: iload           13
        //   150: iconst_5       
        //   151: if_icmpge       1693
        //   154: aload           7
        //   156: invokevirtual   pe/x2.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //   159: astore          12
        //   161: aload           12
        //   163: ifnonnull       175
        //   166: aload           7
        //   168: iconst_1       
        //   169: putfield        pe/x2.i:Z
        //   172: goto            1713
        //   175: aload           12
        //   177: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //   180: aload           12
        //   182: ldc             "messages"
        //   184: iconst_1       
        //   185: anewarray       Ljava/lang/String;
        //   188: dup            
        //   189: iconst_0       
        //   190: aload           8
        //   192: aastore        
        //   193: ldc             "type=?"
        //   195: iconst_1       
        //   196: anewarray       Ljava/lang/String;
        //   199: dup            
        //   200: iconst_0       
        //   201: ldc             "3"
        //   203: aastore        
        //   204: aconst_null    
        //   205: aconst_null    
        //   206: ldc             "rowid desc"
        //   208: ldc             "1"
        //   210: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   213: astore          15
        //   215: aload           15
        //   217: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   222: istore          16
        //   224: ldc2_w          -1
        //   227: lstore          17
        //   229: iload           16
        //   231: ifeq            254
        //   234: aload           15
        //   236: iconst_0       
        //   237: invokeinterface android/database/Cursor.getLong:(I)J
        //   242: lstore          19
        //   244: aload           15
        //   246: invokeinterface android/database/Cursor.close:()V
        //   251: goto            266
        //   254: aload           15
        //   256: invokeinterface android/database/Cursor.close:()V
        //   261: ldc2_w          -1
        //   264: lstore          19
        //   266: lload           19
        //   268: ldc2_w          -1
        //   271: lcmp           
        //   272: ifeq            307
        //   275: ldc             "rowid<?"
        //   277: astore          15
        //   279: iconst_1       
        //   280: anewarray       Ljava/lang/String;
        //   283: dup            
        //   284: iconst_0       
        //   285: lload           19
        //   287: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   290: aastore        
        //   291: astore          11
        //   293: goto            313
        //   296: goto            1327
        //   299: astore          11
        //   301: goto            1267
        //   304: goto            1287
        //   307: aconst_null    
        //   308: astore          15
        //   310: aconst_null    
        //   311: astore          11
        //   313: bipush          100
        //   315: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   318: astore          21
        //   320: aload           12
        //   322: ldc             "messages"
        //   324: iconst_3       
        //   325: anewarray       Ljava/lang/String;
        //   328: dup            
        //   329: iconst_0       
        //   330: aload           8
        //   332: aastore        
        //   333: dup            
        //   334: iconst_1       
        //   335: ldc             "type"
        //   337: aastore        
        //   338: dup            
        //   339: iconst_2       
        //   340: ldc             "entry"
        //   342: aastore        
        //   343: aload           15
        //   345: aload           11
        //   347: aconst_null    
        //   348: aconst_null    
        //   349: ldc             "rowid asc"
        //   351: aload           21
        //   353: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   356: astore          21
        //   358: lload           17
        //   360: lstore          19
        //   362: aload           12
        //   364: astore          11
        //   366: aload           21
        //   368: astore          15
        //   370: aload           21
        //   372: invokeinterface android/database/Cursor.moveToNext:()Z
        //   377: ifeq            1025
        //   380: aload           12
        //   382: astore          11
        //   384: aload           21
        //   386: astore          15
        //   388: aload           21
        //   390: iconst_0       
        //   391: invokeinterface android/database/Cursor.getLong:(I)J
        //   396: lstore          19
        //   398: aload           12
        //   400: astore          11
        //   402: aload           21
        //   404: astore          15
        //   406: aload           21
        //   408: iconst_1       
        //   409: invokeinterface android/database/Cursor.getInt:(I)I
        //   414: istore          4
        //   416: aload           12
        //   418: astore          11
        //   420: aload           21
        //   422: astore          15
        //   424: aload           21
        //   426: iconst_2       
        //   427: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   432: astore          22
        //   434: iload           4
        //   436: ifne            596
        //   439: aload           12
        //   441: astore          11
        //   443: aload           21
        //   445: astore          15
        //   447: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   450: astore          23
        //   452: aload           22
        //   454: arraylength    
        //   455: istore          4
        //   457: aload           23
        //   459: aload           22
        //   461: iconst_0       
        //   462: iload           4
        //   464: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   467: aload           23
        //   469: iconst_0       
        //   470: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   473: getstatic       pe/t.CREATOR:Landroid/os/Parcelable$Creator;
        //   476: aload           23
        //   478: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   483: checkcast       Lpe/t;
        //   486: astore          22
        //   488: aload           12
        //   490: astore          11
        //   492: aload           21
        //   494: astore          15
        //   496: aload           23
        //   498: invokevirtual   android/os/Parcel.recycle:()V
        //   501: aload           22
        //   503: ifnull          977
        //   506: aload           12
        //   508: astore          11
        //   510: aload           21
        //   512: astore          15
        //   514: aload           10
        //   516: aload           22
        //   518: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   521: pop            
        //   522: goto            977
        //   525: astore          22
        //   527: goto            572
        //   530: astore          22
        //   532: goto            572
        //   535: astore          11
        //   537: aload           7
        //   539: getfield        z0/d1.f:Ljava/lang/Object;
        //   542: checkcast       Lpe/h4;
        //   545: invokevirtual   pe/h4.h:()Lpe/d3;
        //   548: getfield        pe/d3.k:Lpe/b3;
        //   551: ldc             "Failed to load event from local database"
        //   553: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //   556: aload           12
        //   558: astore          11
        //   560: aload           21
        //   562: astore          15
        //   564: aload           23
        //   566: invokevirtual   android/os/Parcel.recycle:()V
        //   569: goto            977
        //   572: aload           12
        //   574: astore          11
        //   576: aload           21
        //   578: astore          15
        //   580: aload           23
        //   582: invokevirtual   android/os/Parcel.recycle:()V
        //   585: aload           12
        //   587: astore          11
        //   589: aload           21
        //   591: astore          15
        //   593: aload           22
        //   595: athrow         
        //   596: iload           4
        //   598: iconst_1       
        //   599: if_icmpne       754
        //   602: aload           12
        //   604: astore          11
        //   606: aload           21
        //   608: astore          15
        //   610: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   613: astore          23
        //   615: aload           23
        //   617: aload           22
        //   619: iconst_0       
        //   620: aload           22
        //   622: arraylength    
        //   623: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   626: aload           23
        //   628: iconst_0       
        //   629: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   632: getstatic       pe/j7.CREATOR:Landroid/os/Parcelable$Creator;
        //   635: aload           23
        //   637: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   642: checkcast       Lpe/j7;
        //   645: astore          22
        //   647: aload           12
        //   649: astore          11
        //   651: aload           21
        //   653: astore          15
        //   655: aload           23
        //   657: invokevirtual   android/os/Parcel.recycle:()V
        //   660: goto            706
        //   663: astore          22
        //   665: goto            730
        //   668: astore          11
        //   670: aload           7
        //   672: getfield        z0/d1.f:Ljava/lang/Object;
        //   675: checkcast       Lpe/h4;
        //   678: invokevirtual   pe/h4.h:()Lpe/d3;
        //   681: getfield        pe/d3.k:Lpe/b3;
        //   684: ldc_w           "Failed to load user property from local database"
        //   687: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //   690: aload           12
        //   692: astore          11
        //   694: aload           21
        //   696: astore          15
        //   698: aload           23
        //   700: invokevirtual   android/os/Parcel.recycle:()V
        //   703: aconst_null    
        //   704: astore          22
        //   706: aload           22
        //   708: ifnull          977
        //   711: aload           12
        //   713: astore          11
        //   715: aload           21
        //   717: astore          15
        //   719: aload           10
        //   721: aload           22
        //   723: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   726: pop            
        //   727: goto            977
        //   730: aload           12
        //   732: astore          11
        //   734: aload           21
        //   736: astore          15
        //   738: aload           23
        //   740: invokevirtual   android/os/Parcel.recycle:()V
        //   743: aload           12
        //   745: astore          11
        //   747: aload           21
        //   749: astore          15
        //   751: aload           22
        //   753: athrow         
        //   754: iload           4
        //   756: iconst_2       
        //   757: if_icmpne       912
        //   760: aload           12
        //   762: astore          11
        //   764: aload           21
        //   766: astore          15
        //   768: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   771: astore          23
        //   773: aload           23
        //   775: aload           22
        //   777: iconst_0       
        //   778: aload           22
        //   780: arraylength    
        //   781: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   784: aload           23
        //   786: iconst_0       
        //   787: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   790: getstatic       pe/c.CREATOR:Landroid/os/Parcelable$Creator;
        //   793: aload           23
        //   795: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   800: checkcast       Lpe/c;
        //   803: astore          22
        //   805: aload           12
        //   807: astore          11
        //   809: aload           21
        //   811: astore          15
        //   813: aload           23
        //   815: invokevirtual   android/os/Parcel.recycle:()V
        //   818: goto            864
        //   821: astore          22
        //   823: goto            888
        //   826: astore          11
        //   828: aload           7
        //   830: getfield        z0/d1.f:Ljava/lang/Object;
        //   833: checkcast       Lpe/h4;
        //   836: invokevirtual   pe/h4.h:()Lpe/d3;
        //   839: getfield        pe/d3.k:Lpe/b3;
        //   842: ldc_w           "Failed to load conditional user property from local database"
        //   845: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //   848: aload           12
        //   850: astore          11
        //   852: aload           21
        //   854: astore          15
        //   856: aload           23
        //   858: invokevirtual   android/os/Parcel.recycle:()V
        //   861: aconst_null    
        //   862: astore          22
        //   864: aload           22
        //   866: ifnull          977
        //   869: aload           12
        //   871: astore          11
        //   873: aload           21
        //   875: astore          15
        //   877: aload           10
        //   879: aload           22
        //   881: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   884: pop            
        //   885: goto            977
        //   888: aload           12
        //   890: astore          11
        //   892: aload           21
        //   894: astore          15
        //   896: aload           23
        //   898: invokevirtual   android/os/Parcel.recycle:()V
        //   901: aload           12
        //   903: astore          11
        //   905: aload           21
        //   907: astore          15
        //   909: aload           22
        //   911: athrow         
        //   912: iload           4
        //   914: iconst_3       
        //   915: if_icmpne       949
        //   918: aload           12
        //   920: astore          11
        //   922: aload           21
        //   924: astore          15
        //   926: aload           7
        //   928: getfield        z0/d1.f:Ljava/lang/Object;
        //   931: checkcast       Lpe/h4;
        //   934: invokevirtual   pe/h4.h:()Lpe/d3;
        //   937: getfield        pe/d3.n:Lpe/b3;
        //   940: ldc_w           "Skipping app launch break"
        //   943: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //   946: goto            977
        //   949: aload           12
        //   951: astore          11
        //   953: aload           21
        //   955: astore          15
        //   957: aload           7
        //   959: getfield        z0/d1.f:Ljava/lang/Object;
        //   962: checkcast       Lpe/h4;
        //   965: invokevirtual   pe/h4.h:()Lpe/d3;
        //   968: getfield        pe/d3.k:Lpe/b3;
        //   971: ldc_w           "Unknown record type in local database"
        //   974: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //   977: goto            362
        //   980: astore          11
        //   982: goto            995
        //   985: astore          11
        //   987: goto            1195
        //   990: astore          11
        //   992: goto            1010
        //   995: aload           11
        //   997: astore          24
        //   999: aload           12
        //  1001: astore          23
        //  1003: iload           5
        //  1005: istore          4
        //  1007: goto            1342
        //  1010: aload           21
        //  1012: astore          15
        //  1014: aload           8
        //  1016: astore          21
        //  1018: iload           5
        //  1020: istore          4
        //  1022: goto            1298
        //  1025: iload           5
        //  1027: istore          4
        //  1029: aload           8
        //  1031: astore          22
        //  1033: aload           12
        //  1035: astore          11
        //  1037: aload           21
        //  1039: astore          15
        //  1041: lload           19
        //  1043: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //  1046: astore          23
        //  1048: aload           12
        //  1050: astore          11
        //  1052: aload           21
        //  1054: astore          15
        //  1056: aload           12
        //  1058: ldc             "messages"
        //  1060: ldc_w           "rowid <= ?"
        //  1063: iconst_1       
        //  1064: anewarray       Ljava/lang/String;
        //  1067: dup            
        //  1068: iconst_0       
        //  1069: aload           23
        //  1071: aastore        
        //  1072: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //  1075: aload           10
        //  1077: invokevirtual   java/util/ArrayList.size:()I
        //  1080: if_icmpge       1111
        //  1083: aload           12
        //  1085: astore          11
        //  1087: aload           21
        //  1089: astore          15
        //  1091: aload           7
        //  1093: getfield        z0/d1.f:Ljava/lang/Object;
        //  1096: checkcast       Lpe/h4;
        //  1099: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1102: getfield        pe/d3.k:Lpe/b3;
        //  1105: ldc_w           "Fewer entries removed from local database than expected"
        //  1108: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //  1111: aload           12
        //  1113: astore          11
        //  1115: aload           21
        //  1117: astore          15
        //  1119: aload           12
        //  1121: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //  1124: aload           12
        //  1126: astore          11
        //  1128: aload           21
        //  1130: astore          15
        //  1132: aload           12
        //  1134: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1137: aload           21
        //  1139: invokeinterface android/database/Cursor.close:()V
        //  1144: aload           12
        //  1146: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1149: goto            1727
        //  1152: astore          24
        //  1154: aload           12
        //  1156: astore          23
        //  1158: aload           22
        //  1160: astore          8
        //  1162: goto            1342
        //  1165: astore          11
        //  1167: aload           21
        //  1169: astore          15
        //  1171: aload           22
        //  1173: astore          21
        //  1175: goto            1298
        //  1178: astore          11
        //  1180: goto            995
        //  1183: astore          11
        //  1185: goto            1010
        //  1188: astore          11
        //  1190: goto            995
        //  1193: astore          11
        //  1195: aload           21
        //  1197: astore          11
        //  1199: iload           5
        //  1201: istore          4
        //  1203: goto            1274
        //  1206: astore          11
        //  1208: goto            1010
        //  1211: astore          11
        //  1213: goto            296
        //  1216: astore          11
        //  1218: goto            304
        //  1221: astore          11
        //  1223: goto            1231
        //  1226: astore          11
        //  1228: aconst_null    
        //  1229: astore          15
        //  1231: aload           15
        //  1233: ifnull          1243
        //  1236: aload           15
        //  1238: invokeinterface android/database/Cursor.close:()V
        //  1243: aload           11
        //  1245: athrow         
        //  1246: astore          11
        //  1248: goto            1327
        //  1251: astore          11
        //  1253: goto            1287
        //  1256: astore_1       
        //  1257: goto            1317
        //  1260: astore          11
        //  1262: goto            1327
        //  1265: astore          11
        //  1267: aconst_null    
        //  1268: astore          11
        //  1270: iload           5
        //  1272: istore          4
        //  1274: aload           12
        //  1276: astore          21
        //  1278: aload           11
        //  1280: astore          12
        //  1282: goto            1475
        //  1285: astore          11
        //  1287: aconst_null    
        //  1288: astore          15
        //  1290: iload           5
        //  1292: istore          4
        //  1294: aload           8
        //  1296: astore          21
        //  1298: aload           11
        //  1300: astore          22
        //  1302: aload           12
        //  1304: astore          8
        //  1306: aload           15
        //  1308: astore          12
        //  1310: goto            1556
        //  1313: astore_1       
        //  1314: aconst_null    
        //  1315: astore          12
        //  1317: aconst_null    
        //  1318: astore_2       
        //  1319: goto            1671
        //  1322: astore          11
        //  1324: aconst_null    
        //  1325: astore          12
        //  1327: aconst_null    
        //  1328: astore          21
        //  1330: iload           5
        //  1332: istore          4
        //  1334: aload           12
        //  1336: astore          23
        //  1338: aload           11
        //  1340: astore          24
        //  1342: aload           23
        //  1344: ifnull          1376
        //  1347: aload           23
        //  1349: astore          11
        //  1351: aload           21
        //  1353: astore          15
        //  1355: aload           23
        //  1357: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //  1360: ifeq            1376
        //  1363: aload           23
        //  1365: astore          11
        //  1367: aload           21
        //  1369: astore          15
        //  1371: aload           23
        //  1373: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //  1376: aload           23
        //  1378: astore          11
        //  1380: aload           21
        //  1382: astore          15
        //  1384: aload           7
        //  1386: getfield        z0/d1.f:Ljava/lang/Object;
        //  1389: checkcast       Lpe/h4;
        //  1392: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1395: getfield        pe/d3.k:Lpe/b3;
        //  1398: aload           24
        //  1400: aload           9
        //  1402: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1405: aload           23
        //  1407: astore          11
        //  1409: aload           21
        //  1411: astore          15
        //  1413: aload           7
        //  1415: iconst_1       
        //  1416: putfield        pe/x2.i:Z
        //  1419: aload           21
        //  1421: ifnull          1431
        //  1424: aload           21
        //  1426: invokeinterface android/database/Cursor.close:()V
        //  1431: iload           14
        //  1433: istore          25
        //  1435: aload           8
        //  1437: astore          12
        //  1439: iload           4
        //  1441: istore          5
        //  1443: aload           23
        //  1445: ifnull          1649
        //  1448: aload           23
        //  1450: astore          21
        //  1452: aload           8
        //  1454: astore          12
        //  1456: iload           4
        //  1458: istore          5
        //  1460: goto            1640
        //  1463: astore          12
        //  1465: aconst_null    
        //  1466: astore          21
        //  1468: aconst_null    
        //  1469: astore          12
        //  1471: iload           5
        //  1473: istore          4
        //  1475: iload           14
        //  1477: i2l            
        //  1478: lstore          19
        //  1480: aload           21
        //  1482: astore          11
        //  1484: aload           12
        //  1486: astore          15
        //  1488: lload           19
        //  1490: invokestatic    android/os/SystemClock.sleep:(J)V
        //  1493: iinc            14, 20
        //  1496: aload           12
        //  1498: ifnull          1508
        //  1501: aload           12
        //  1503: invokeinterface android/database/Cursor.close:()V
        //  1508: iload           14
        //  1510: istore          25
        //  1512: aload           8
        //  1514: astore          12
        //  1516: iload           4
        //  1518: istore          5
        //  1520: aload           21
        //  1522: ifnull          1649
        //  1525: aload           8
        //  1527: astore          12
        //  1529: iload           4
        //  1531: istore          5
        //  1533: goto            1640
        //  1536: astore          22
        //  1538: aconst_null    
        //  1539: astore          11
        //  1541: aconst_null    
        //  1542: astore          12
        //  1544: iload           5
        //  1546: istore          4
        //  1548: aload           8
        //  1550: astore          21
        //  1552: aload           11
        //  1554: astore          8
        //  1556: aload           8
        //  1558: astore          11
        //  1560: aload           12
        //  1562: astore          15
        //  1564: aload           7
        //  1566: getfield        z0/d1.f:Ljava/lang/Object;
        //  1569: checkcast       Lpe/h4;
        //  1572: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1575: getfield        pe/d3.k:Lpe/b3;
        //  1578: aload           22
        //  1580: aload           9
        //  1582: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1585: aload           8
        //  1587: astore          11
        //  1589: aload           12
        //  1591: astore          15
        //  1593: aload           7
        //  1595: iconst_1       
        //  1596: putfield        pe/x2.i:Z
        //  1599: aload           12
        //  1601: ifnull          1611
        //  1604: aload           12
        //  1606: invokeinterface android/database/Cursor.close:()V
        //  1611: iload           14
        //  1613: istore          25
        //  1615: aload           21
        //  1617: astore          12
        //  1619: iload           4
        //  1621: istore          5
        //  1623: aload           8
        //  1625: ifnull          1649
        //  1628: iload           4
        //  1630: istore          5
        //  1632: aload           21
        //  1634: astore          12
        //  1636: aload           8
        //  1638: astore          21
        //  1640: aload           21
        //  1642: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1645: iload           14
        //  1647: istore          25
        //  1649: iinc            13, 1
        //  1652: aload           12
        //  1654: astore          8
        //  1656: iload           25
        //  1658: istore          14
        //  1660: goto            148
        //  1663: astore_1       
        //  1664: aload           15
        //  1666: astore_2       
        //  1667: aload           11
        //  1669: astore          12
        //  1671: aload_2        
        //  1672: ifnull          1681
        //  1675: aload_2        
        //  1676: invokeinterface android/database/Cursor.close:()V
        //  1681: aload           12
        //  1683: ifnull          1691
        //  1686: aload           12
        //  1688: invokevirtual   android/database/sqlite/SQLiteClosable.close:()V
        //  1691: aload_1        
        //  1692: athrow         
        //  1693: aload           7
        //  1695: getfield        z0/d1.f:Ljava/lang/Object;
        //  1698: checkcast       Lpe/h4;
        //  1701: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1704: getfield        pe/d3.n:Lpe/b3;
        //  1707: ldc_w           "Failed to read events from database in reasonable time"
        //  1710: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //  1713: aconst_null    
        //  1714: astore          8
        //  1716: iload           5
        //  1718: istore          4
        //  1720: goto            1731
        //  1723: iload           5
        //  1725: istore          4
        //  1727: aload           10
        //  1729: astore          8
        //  1731: aload           8
        //  1733: ifnull          1756
        //  1736: aload           6
        //  1738: aload           8
        //  1740: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //  1743: pop            
        //  1744: aload           8
        //  1746: invokeinterface java/util/List.size:()I
        //  1751: istore          5
        //  1753: goto            1759
        //  1756: iconst_0       
        //  1757: istore          5
        //  1759: aload_2        
        //  1760: ifnull          1777
        //  1763: iload           5
        //  1765: bipush          100
        //  1767: if_icmpge       1777
        //  1770: aload           6
        //  1772: aload_2        
        //  1773: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1776: pop            
        //  1777: aload           6
        //  1779: invokevirtual   java/util/ArrayList.size:()I
        //  1782: istore          25
        //  1784: iconst_0       
        //  1785: istore          14
        //  1787: iload           14
        //  1789: iload           25
        //  1791: if_icmpge       1978
        //  1794: aload           6
        //  1796: iload           14
        //  1798: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1801: checkcast       Lqd/a;
        //  1804: astore          8
        //  1806: aload           8
        //  1808: instanceof      Lpe/t;
        //  1811: ifeq            1855
        //  1814: aload_1        
        //  1815: aload           8
        //  1817: checkcast       Lpe/t;
        //  1820: aload_3        
        //  1821: invokeinterface pe/u2.a1:(Lpe/t;Lpe/q7;)V
        //  1826: goto            1972
        //  1829: astore          8
        //  1831: aload_0        
        //  1832: getfield        z0/d1.f:Ljava/lang/Object;
        //  1835: checkcast       Lpe/h4;
        //  1838: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1841: getfield        pe/d3.k:Lpe/b3;
        //  1844: aload           8
        //  1846: ldc_w           "Failed to send event to the service"
        //  1849: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1852: goto            1972
        //  1855: aload           8
        //  1857: instanceof      Lpe/j7;
        //  1860: ifeq            1904
        //  1863: aload_1        
        //  1864: aload           8
        //  1866: checkcast       Lpe/j7;
        //  1869: aload_3        
        //  1870: invokeinterface pe/u2.j1:(Lpe/j7;Lpe/q7;)V
        //  1875: goto            1972
        //  1878: astore          8
        //  1880: aload_0        
        //  1881: getfield        z0/d1.f:Ljava/lang/Object;
        //  1884: checkcast       Lpe/h4;
        //  1887: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1890: getfield        pe/d3.k:Lpe/b3;
        //  1893: aload           8
        //  1895: ldc_w           "Failed to send user property to the service"
        //  1898: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1901: goto            1972
        //  1904: aload           8
        //  1906: instanceof      Lpe/c;
        //  1909: ifeq            1953
        //  1912: aload_1        
        //  1913: aload           8
        //  1915: checkcast       Lpe/c;
        //  1918: aload_3        
        //  1919: invokeinterface pe/u2.R0:(Lpe/c;Lpe/q7;)V
        //  1924: goto            1972
        //  1927: astore          8
        //  1929: aload_0        
        //  1930: getfield        z0/d1.f:Ljava/lang/Object;
        //  1933: checkcast       Lpe/h4;
        //  1936: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1939: getfield        pe/d3.k:Lpe/b3;
        //  1942: aload           8
        //  1944: ldc_w           "Failed to send conditional user property to the service"
        //  1947: invokevirtual   pe/b3.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1950: goto            1972
        //  1953: aload_0        
        //  1954: getfield        z0/d1.f:Ljava/lang/Object;
        //  1957: checkcast       Lpe/h4;
        //  1960: invokevirtual   pe/h4.h:()Lpe/d3;
        //  1963: getfield        pe/d3.k:Lpe/b3;
        //  1966: ldc_w           "Discarding data. Unrecognized parcel type."
        //  1969: invokevirtual   pe/b3.a:(Ljava/lang/String;)V
        //  1972: iinc            14, 1
        //  1975: goto            1787
        //  1978: iload           4
        //  1980: iconst_1       
        //  1981: iadd           
        //  1982: istore          14
        //  1984: iload           5
        //  1986: istore          4
        //  1988: iload           14
        //  1990: istore          5
        //  1992: goto            37
        //  1995: return         
        //  1996: astore          11
        //  1998: goto            537
        //  2001: astore          11
        //  2003: goto            1195
        //  2006: astore          8
        //  2008: aload           21
        //  2010: astore          11
        //  2012: aload           22
        //  2014: astore          8
        //  2016: goto            1274
        //  2019: astore          11
        //  2021: goto            1267
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                                               
        //  -----  -----  -----  -----  -----------------------------------------------------------------------------------
        //  154    161    1536   1556   Landroid/database/sqlite/SQLiteFullException;
        //  154    161    1463   1475   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  154    161    1322   1327   Landroid/database/sqlite/SQLiteException;
        //  154    161    1313   1317   Any
        //  166    172    1285   1287   Landroid/database/sqlite/SQLiteFullException;
        //  166    172    1265   1267   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  166    172    1260   1265   Landroid/database/sqlite/SQLiteException;
        //  166    172    1256   1260   Any
        //  175    180    1285   1287   Landroid/database/sqlite/SQLiteFullException;
        //  175    180    1265   1267   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  175    180    1260   1265   Landroid/database/sqlite/SQLiteException;
        //  175    180    1256   1260   Any
        //  180    215    1226   1231   Any
        //  215    224    1221   1226   Any
        //  234    244    1221   1226   Any
        //  244    251    1285   1287   Landroid/database/sqlite/SQLiteFullException;
        //  244    251    1265   1267   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  244    251    1260   1265   Landroid/database/sqlite/SQLiteException;
        //  244    251    1256   1260   Any
        //  254    261    1285   1287   Landroid/database/sqlite/SQLiteFullException;
        //  254    261    1265   1267   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  254    261    1260   1265   Landroid/database/sqlite/SQLiteException;
        //  254    261    1256   1260   Any
        //  279    293    1216   307    Landroid/database/sqlite/SQLiteFullException;
        //  279    293    299    304    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  279    293    1211   299    Landroid/database/sqlite/SQLiteException;
        //  279    293    1256   1260   Any
        //  313    358    1216   307    Landroid/database/sqlite/SQLiteFullException;
        //  313    358    299    304    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  313    358    1211   299    Landroid/database/sqlite/SQLiteException;
        //  313    358    1256   1260   Any
        //  370    380    1206   1211   Landroid/database/sqlite/SQLiteFullException;
        //  370    380    1193   1195   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  370    380    1188   1193   Landroid/database/sqlite/SQLiteException;
        //  370    380    1663   1671   Any
        //  388    398    1206   1211   Landroid/database/sqlite/SQLiteFullException;
        //  388    398    1193   1195   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  388    398    1188   1193   Landroid/database/sqlite/SQLiteException;
        //  388    398    1663   1671   Any
        //  406    416    1206   1211   Landroid/database/sqlite/SQLiteFullException;
        //  406    416    1193   1195   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  406    416    1188   1193   Landroid/database/sqlite/SQLiteException;
        //  406    416    1663   1671   Any
        //  424    434    990    995    Landroid/database/sqlite/SQLiteFullException;
        //  424    434    985    990    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  424    434    980    985    Landroid/database/sqlite/SQLiteException;
        //  424    434    1663   1671   Any
        //  447    452    990    995    Landroid/database/sqlite/SQLiteFullException;
        //  447    452    985    990    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  447    452    980    985    Landroid/database/sqlite/SQLiteException;
        //  447    452    1663   1671   Any
        //  452    457    535    537    Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;
        //  452    457    530    535    Any
        //  457    488    1996   2001   Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;
        //  457    488    525    530    Any
        //  496    501    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  496    501    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  496    501    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  496    501    1663   1671   Any
        //  514    522    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  514    522    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  514    522    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  514    522    1663   1671   Any
        //  537    556    525    530    Any
        //  564    569    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  564    569    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  564    569    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  564    569    1663   1671   Any
        //  580    585    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  580    585    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  580    585    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  580    585    1663   1671   Any
        //  593    596    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  593    596    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  593    596    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  593    596    1663   1671   Any
        //  610    615    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  610    615    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  610    615    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  610    615    1663   1671   Any
        //  615    647    668    706    Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;
        //  615    647    663    754    Any
        //  655    660    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  655    660    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  655    660    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  655    660    1663   1671   Any
        //  670    690    663    754    Any
        //  698    703    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  698    703    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  698    703    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  698    703    1663   1671   Any
        //  719    727    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  719    727    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  719    727    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  719    727    1663   1671   Any
        //  738    743    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  738    743    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  738    743    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  738    743    1663   1671   Any
        //  751    754    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  751    754    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  751    754    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  751    754    1663   1671   Any
        //  768    773    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  768    773    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  768    773    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  768    773    1663   1671   Any
        //  773    805    826    864    Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException;
        //  773    805    821    912    Any
        //  813    818    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  813    818    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  813    818    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  813    818    1663   1671   Any
        //  828    848    821    912    Any
        //  856    861    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  856    861    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  856    861    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  856    861    1663   1671   Any
        //  877    885    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  877    885    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  877    885    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  877    885    1663   1671   Any
        //  896    901    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  896    901    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  896    901    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  896    901    1663   1671   Any
        //  909    912    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  909    912    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  909    912    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  909    912    1663   1671   Any
        //  926    946    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  926    946    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  926    946    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  926    946    1663   1671   Any
        //  957    977    1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  957    977    2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  957    977    1178   1183   Landroid/database/sqlite/SQLiteException;
        //  957    977    1663   1671   Any
        //  1041   1048   1183   1188   Landroid/database/sqlite/SQLiteFullException;
        //  1041   1048   2001   2006   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1041   1048   1178   1183   Landroid/database/sqlite/SQLiteException;
        //  1041   1048   1663   1671   Any
        //  1056   1083   1165   1178   Landroid/database/sqlite/SQLiteFullException;
        //  1056   1083   2006   2019   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1056   1083   1152   1165   Landroid/database/sqlite/SQLiteException;
        //  1056   1083   1663   1671   Any
        //  1091   1111   1165   1178   Landroid/database/sqlite/SQLiteFullException;
        //  1091   1111   2006   2019   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1091   1111   1152   1165   Landroid/database/sqlite/SQLiteException;
        //  1091   1111   1663   1671   Any
        //  1119   1124   1165   1178   Landroid/database/sqlite/SQLiteFullException;
        //  1119   1124   2006   2019   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1119   1124   1152   1165   Landroid/database/sqlite/SQLiteException;
        //  1119   1124   1663   1671   Any
        //  1132   1137   1165   1178   Landroid/database/sqlite/SQLiteFullException;
        //  1132   1137   2006   2019   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1132   1137   1152   1165   Landroid/database/sqlite/SQLiteException;
        //  1132   1137   1663   1671   Any
        //  1236   1243   1251   1256   Landroid/database/sqlite/SQLiteFullException;
        //  1236   1243   2019   2024   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1236   1243   1246   1251   Landroid/database/sqlite/SQLiteException;
        //  1236   1243   1256   1260   Any
        //  1243   1246   1251   1256   Landroid/database/sqlite/SQLiteFullException;
        //  1243   1246   2019   2024   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  1243   1246   1246   1251   Landroid/database/sqlite/SQLiteException;
        //  1243   1246   1256   1260   Any
        //  1355   1363   1663   1671   Any
        //  1371   1376   1663   1671   Any
        //  1384   1405   1663   1671   Any
        //  1413   1419   1663   1671   Any
        //  1488   1493   1663   1671   Any
        //  1564   1585   1663   1671   Any
        //  1593   1599   1663   1671   Any
        //  1814   1826   1829   1855   Landroid/os/RemoteException;
        //  1863   1875   1878   1904   Landroid/os/RemoteException;
        //  1912   1924   1927   1953   Landroid/os/RemoteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IndexOutOfBoundsException: Index: 907, Size: 907
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
    
    public final void R(final pe.c c) {
        this.M();
        this.N();
        super.f.getClass();
        final x2 p = ((h4)super.f).p();
        ((h4)((d1)p).f).y().getClass();
        final byte[] c2 = n7.C0((Parcelable)c);
        boolean t;
        if (c2.length > 131072) {
            ((h4)((d1)p).f).h().l.a("Conditional user property too long for local database. Sending directly to service");
            t = false;
        }
        else {
            t = p.T(2, c2);
        }
        this.Y(new h6(this, this.V(true), t, new pe.c(c)));
    }
    
    public final boolean S() {
        this.M();
        this.N();
        return this.i != null;
    }
    
    public final boolean T() {
        this.M();
        this.N();
        return !this.U() || ((h4)super.f).y().M0() >= (int)r2.e0.a(null);
    }
    
    public final boolean U() {
        this.M();
        this.N();
        if (this.j == null) {
            this.M();
            this.N();
            final r3 r = ((h4)super.f).r();
            r.M();
            final boolean contains = r.Q().contains("use_service");
            boolean b = false;
            Boolean value;
            if (!contains) {
                value = null;
            }
            else {
                value = r.Q().getBoolean("use_service", false);
            }
            boolean b2 = true;
            final boolean b3 = true;
            final boolean b4 = true;
            if (value != null && value) {
                b = b3;
            }
            else {
                super.f.getClass();
                final v2 o = ((h4)super.f).o();
                ((i3)o).N();
                Label_0437: {
                    Label_0435: {
                        if (o.p != 1) {
                            ((h4)super.f).h().s.a("Checking service availability");
                            final n7 y = ((h4)super.f).y();
                            y.getClass();
                            final int c = f.b.c(((h4)y.f).f, 12451000);
                            if (c != 0) {
                                if (c == 1) {
                                    ((h4)super.f).h().s.a("Service missing");
                                    break Label_0437;
                                }
                                if (c != 2) {
                                    if (c != 3) {
                                        if (c != 9) {
                                            if (c == 18) {
                                                ((h4)super.f).h().n.a("Service updating");
                                                break Label_0435;
                                            }
                                            ((h4)super.f).h().n.b((Object)c, "Unexpected service status");
                                        }
                                        else {
                                            ((h4)super.f).h().n.a("Service invalid");
                                        }
                                    }
                                    else {
                                        ((h4)super.f).h().n.a("Service disabled");
                                    }
                                    b2 = false;
                                    break Label_0437;
                                }
                                ((h4)super.f).h().r.a("Service container out of date");
                                if (((h4)super.f).y().M0() < 17443) {
                                    break Label_0437;
                                }
                                b = (value == null && b4);
                                b2 = false;
                                break Label_0437;
                            }
                            else {
                                ((h4)super.f).h().s.a("Service available");
                            }
                        }
                    }
                    b = true;
                }
                if (!b && ((h4)super.f).l.Z()) {
                    ((h4)super.f).h().k.a("No way to upload. Consider using the full version of Analytics");
                }
                else if (b2) {
                    final r3 r2 = ((h4)super.f).r();
                    r2.M();
                    final SharedPreferences$Editor edit = r2.Q().edit();
                    edit.putBoolean("use_service", b);
                    edit.apply();
                }
            }
            this.j = b;
        }
        return this.j;
    }
    
    public final q7 V(final boolean b) {
        super.f.getClass();
        Object o = ((h4)super.f).o();
        final String s = null;
        String k = null;
        Label_0332: {
            if (b) {
                final d3 h = ((h4)super.f).h();
                if (((h4)h.f).r().i != null) {
                    final p3 i = ((h4)h.f).r().i;
                    i.e.M();
                    i.e.M();
                    final long long1 = i.e.Q().getLong(i.a, 0L);
                    long abs;
                    if (long1 == 0L) {
                        i.a();
                        abs = 0L;
                    }
                    else {
                        ((h4)i.e.f).s.getClass();
                        abs = Math.abs(long1 - System.currentTimeMillis());
                    }
                    final long d = i.d;
                    Pair b2 = null;
                    Label_0286: {
                        if (abs >= d) {
                            if (abs > d + d) {
                                i.a();
                            }
                            else {
                                final String string = i.e.Q().getString(i.c, (String)null);
                                final long long2 = i.e.Q().getLong(i.b, 0L);
                                i.a();
                                if (string != null && long2 > 0L) {
                                    b2 = new Pair((Object)string, (Object)long2);
                                    break Label_0286;
                                }
                                b2 = r3.B;
                                break Label_0286;
                            }
                        }
                        b2 = null;
                    }
                    if (b2 != null) {
                        if (b2 != r3.B) {
                            k = a.k(String.valueOf(b2.second), ":", (String)b2.first);
                            break Label_0332;
                        }
                    }
                }
            }
            k = null;
        }
        ((l2)o).M();
        final String r = ((v2)o).R();
        final String s2 = ((v2)o).S();
        ((i3)o).N();
        final String j = ((v2)o).i;
        ((i3)o).N();
        final long n = ((v2)o).j;
        ((i3)o).N();
        b.R((Object)((v2)o).k);
        final String l = ((v2)o).k;
        ((h4)((d1)o).f).l.R();
        ((i3)o).N();
        ((l2)o).M();
        long m;
        if ((m = ((v2)o).l) == 0L) {
            final n7 y = ((h4)((d1)o).f).y();
            final Context f = ((h4)((d1)o).f).f;
            final String packageName = f.getPackageName();
            y.M();
            b.O(packageName);
            final PackageManager packageManager = f.getPackageManager();
            final MessageDigest u = n7.U();
            m = -1L;
            Label_0637: {
                if (u == null) {
                    ((h4)y.f).h().k.a("Could not get MD5 instance");
                }
                else {
                    if (packageManager != null) {
                        try {
                            if (!y.x0(f, packageName)) {
                                final Signature[] signatures = wd.c.a(f).b(64, ((h4)y.f).f.getPackageName()).signatures;
                                if (signatures != null && signatures.length > 0) {
                                    m = n7.N0(u.digest(signatures[0].toByteArray()));
                                    break Label_0637;
                                }
                                ((h4)y.f).h().n.a("Could not get signatures");
                                break Label_0637;
                            }
                        }
                        catch (final PackageManager$NameNotFoundException ex) {
                            ((h4)y.f).h().k.b((Object)ex, "Package name not found");
                        }
                    }
                    m = 0L;
                }
            }
            ((v2)o).l = m;
        }
        final boolean d2 = ((h4)((d1)o).f).d();
        final boolean t = ((h4)((d1)o).f).r().t;
        ((l2)o).M();
        Label_0786: {
            if (!((h4)((d1)o).f).d()) {
                final String s3 = s;
                break Label_0786;
            }
            ((y9)a0.g.f.zza()).zza();
            if (((h4)((d1)o).f).l.V(null, r2.a0)) {
                ((h4)((d1)o).f).h().s.a("Disabled IID for tests.");
                final String s3 = s;
                break Label_0786;
            }
            while (true) {
                try {
                    final Class<?> loadClass = ((h4)((d1)o).f).f.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                    String s3;
                    if (loadClass == null) {
                        s3 = s;
                    }
                    else {
                        try {
                            final Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, ((h4)((d1)o).f).f);
                            if (invoke != null) {
                                try {
                                    s3 = (String)loadClass.getDeclaredMethod("getFirebaseInstanceId", (Class[])new Class[0]).invoke(invoke, new Object[0]);
                                }
                                catch (final Exception ex2) {
                                    ((h4)((d1)o).f).h().p.a("Failed to retrieve Firebase Instance Id");
                                }
                            }
                        }
                        catch (final Exception ex3) {
                            ((h4)((d1)o).f).h().o.a("Failed to obtain Firebase Analytics instance");
                        }
                        s3 = null;
                    }
                    final h4 h2 = (h4)((d1)o).f;
                    final long a = h2.r().j.a();
                    long n2;
                    if (a == 0L) {
                        n2 = h2.L;
                    }
                    else {
                        n2 = Math.min(h2.L, a);
                    }
                    ((i3)o).N();
                    final int p = ((v2)o).p;
                    final Boolean u2 = ((h4)((d1)o).f).l.U("google_analytics_adid_collection_enabled");
                    final boolean b3 = u2 == null || u2;
                    final r3 r2 = ((h4)((d1)o).f).r();
                    r2.M();
                    final boolean boolean1 = r2.Q().getBoolean("deferred_analytics_collection", false);
                    ((i3)o).N();
                    final String r3 = ((v2)o).r;
                    final Boolean u3 = ((h4)((d1)o).f).l.U("google_analytics_default_allow_ad_personalization_signals");
                    Boolean value;
                    if (u3 == null) {
                        value = null;
                    }
                    else {
                        value = (u3 ^ true);
                    }
                    final long m2 = ((v2)o).m;
                    final List n3 = ((v2)o).n;
                    final String e = ((h4)((d1)o).f).r().S().e();
                    if (((v2)o).o == null) {
                        if (((h4)((d1)o).f).l.V(null, pe.r2.z0)) {
                            ((v2)o).o = ((h4)((d1)o).f).y().S();
                        }
                        else {
                            ((v2)o).o = "";
                        }
                    }
                    final String o2 = ((v2)o).o;
                    y.a();
                    if (((h4)((d1)o).f).l.V(null, pe.r2.u0)) {
                        ((l2)o).M();
                        if (((v2)o).t != 0L) {
                            ((h4)((d1)o).f).s.getClass();
                            final long currentTimeMillis = System.currentTimeMillis();
                            final long t2 = ((v2)o).t;
                            if (((v2)o).s != null && currentTimeMillis - t2 > 86400000L && ((v2)o).u == null) {
                                ((v2)o).T();
                            }
                        }
                        if (((v2)o).s == null) {
                            ((v2)o).T();
                        }
                        o = ((v2)o).s;
                    }
                    else {
                        o = null;
                    }
                    return new q7(r, s2, j, n, l, 68000L, m, k, d2, t ^ true, s3, n2, p, b3, boolean1, r3, value, m2, n3, e, o2, (String)o);
                }
                catch (final ClassNotFoundException ex4) {
                    continue;
                }
                break;
            }
        }
    }
    
    public final void W() {
        this.M();
        ((h4)super.f).h().s.b((Object)this.m.size(), "Processing queued up service tasks");
        for (final Runnable runnable : this.m) {
            try {
                runnable.run();
            }
            catch (final RuntimeException ex) {
                ((h4)super.f).h().k.b((Object)ex, "Task exception while flushing queue");
            }
        }
        this.m.clear();
        ((m)this.n).a();
    }
    
    public final void X() {
        this.M();
        final x6 l = this.l;
        ((mf1.a)l.a).getClass();
        l.b = SystemClock.elapsedRealtime();
        final d6 k = this.k;
        super.f.getClass();
        ((m)k).c((long)r2.J.a(null));
    }
    
    public final void Y(final Runnable runnable) throws IllegalStateException {
        this.M();
        if (this.S()) {
            runnable.run();
            return;
        }
        final int size = this.m.size();
        super.f.getClass();
        if (size >= 1000L) {
            ((h4)super.f).h().k.a("Discarding data. Max runnable queue size reached");
            return;
        }
        this.m.add(runnable);
        ((m)this.n).c(60000L);
        this.b0();
    }
    
    public final Boolean Z() {
        return this.j;
    }
    
    public final void b0() {
        this.M();
        this.N();
        if (this.S()) {
            return;
        }
        if (!this.U()) {
            if (!((h4)super.f).l.Z()) {
                super.f.getClass();
                final List queryIntentServices = ((h4)super.f).f.getPackageManager().queryIntentServices(new Intent().setClassName(((h4)super.f).f, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
                if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                    final Intent intent = new Intent("com.google.android.gms.measurement.START");
                    final h4 h4 = (h4)super.f;
                    final Context f = h4.f;
                    h4.getClass();
                    intent.setComponent(new ComponentName(f, "com.google.android.gms.measurement.AppMeasurementService"));
                    final k6 h5 = this.h;
                    h5.h.M();
                    final Context f2 = ((h4)h5.h.f).f;
                    final td.a b = td.a.b();
                    synchronized (h5) {
                        if (h5.f) {
                            ((h4)h5.h.f).h().s.a("Connection attempt already in progress");
                            monitorexit(h5);
                        }
                        else {
                            ((h4)h5.h.f).h().s.a("Using local app measurement service");
                            h5.f = true;
                            b.a(f2, intent, (ServiceConnection)h5.h.h, 129);
                        }
                        return;
                    }
                }
                ((h4)super.f).h().k.a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            }
            return;
        }
        final k6 h6 = this.h;
        h6.h.M();
        final Context f3 = ((h4)h6.h.f).f;
        synchronized (h6) {
            if (h6.f) {
                ((h4)h6.h.f).h().s.a("Connection attempt already in progress");
                monitorexit(h6);
            }
            else if (h6.g != null && (((pd.b)h6.g).f() || ((pd.b)h6.g).c())) {
                ((h4)h6.h.f).h().s.a("Already awaiting connection attempt");
                monitorexit(h6);
            }
            else {
                h6.g = new z2(f3, Looper.getMainLooper(), h6, h6);
                ((h4)h6.h.f).h().s.a("Connecting to remote service");
                h6.f = true;
                b.R((Object)h6.g);
                ((pd.b)h6.g).v();
            }
        }
    }
    
    public final void c0() {
        this.M();
        this.N();
        final k6 h = this.h;
        if (h.g != null && (((pd.b)h.g).c() || ((pd.b)h.g).f())) {
            ((pd.b)h.g).a();
        }
        h.g = null;
        while (true) {
            try {
                td.a.b().c(((h4)super.f).f, (ServiceConnection)this.h);
                this.i = null;
            }
            catch (final IllegalStateException | IllegalArgumentException ex) {
                continue;
            }
            break;
        }
    }
    
    public final void d0(final AtomicReference atomicReference) {
        this.M();
        this.N();
        this.Y(new p4(this, 1, atomicReference, this.V(false)));
    }
}
