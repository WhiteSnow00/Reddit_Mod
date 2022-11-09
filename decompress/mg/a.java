// 
// Decompiled by Procyon v0.6.0
// 

package mg;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import android.util.Log;
import qd.d2;
import ng.d0;
import ng.x;
import ig.p;
import ig.r;
import xl0.d;
import com.google.android.play.core.splitinstall.zzo;
import android.content.pm.PackageManager$NameNotFoundException;
import com.google.android.play.core.internal.zzbt;
import android.content.Context;
import java.util.HashSet;
import ng.s;
import java.util.concurrent.atomic.AtomicReference;

public final class a
{
    public static final AtomicReference<a> e;
    public final f a;
    public final s b;
    public final HashSet c;
    public final c d;
    
    static {
        e = new AtomicReference<a>(null);
    }
    
    public a(final Context context) {
        this.c = new HashSet();
        try {
            final f a = new f(context);
            this.a = a;
            this.d = new c(a);
            this.b = new s(context);
        }
        catch (final PackageManager$NameNotFoundException ex) {
            throw new zzbt("Failed to initialize FileStorage", (Throwable)ex);
        }
    }
    
    public static boolean c(final Context context, final boolean b) {
        final AtomicReference<a> e = a.e;
        while (true) {
            while (!e.compareAndSet(null, new a(context))) {
                if (e.get() != null) {
                    final boolean b2 = false;
                    final a a = mg.a.e.get();
                    Block_5: {
                        if (b2) {
                            zzo.zza.zzb((x)new p(context, d.o(), new r(context, a.a), a.a));
                            final o o = new o(a);
                            final AtomicReference a2 = d0.a;
                            while (true) {
                                while (!a2.compareAndSet(null, o)) {
                                    if (a2.get() != null) {
                                        d.o().execute((Runnable)new d2((Object)context, 2));
                                        break Block_5;
                                    }
                                }
                                continue;
                            }
                        }
                    }
                    try {
                        a.b(context, b);
                        return true;
                    }
                    catch (final Exception ex) {
                        Log.e("SplitCompat", "Error installing additional splits", (Throwable)ex);
                        return false;
                    }
                }
            }
            final boolean b2 = true;
            continue;
        }
    }
    
    public final void a(final Set<String> set) throws IOException {
        final Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            f.d(this.a.a(iterator.next()));
        }
        final s b = this.b;
        b.getClass();
        synchronized (s.class) {
            b.a.getSharedPreferences("playcore_split_install_internal", 0).edit().putStringSet("modules_to_uninstall_if_emulated", (Set)new HashSet()).apply();
        }
    }
    
    public final void b(final Context p0, final boolean p1) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: monitorenter   
        //     2: iload_2        
        //     3: ifeq            16
        //     6: aload_0        
        //     7: getfield        mg/a.a:Lmg/f;
        //    10: invokevirtual   mg/f.c:()V
        //    13: goto            37
        //    16: invokestatic    xl0/d.o:()Ljava/util/concurrent/ThreadPoolExecutor;
        //    19: astore_3       
        //    20: new             Lmg/p;
        //    23: astore          4
        //    25: aload           4
        //    27: aload_0        
        //    28: invokespecial   mg/p.<init>:(Lmg/a;)V
        //    31: aload_3        
        //    32: aload           4
        //    34: invokevirtual   java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        //    37: aload_1        
        //    38: invokevirtual   android/content/Context.getPackageName:()Ljava/lang/String;
        //    41: astore_3       
        //    42: aload_1        
        //    43: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //    46: aload_3        
        //    47: iconst_0       
        //    48: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //    51: getfield        android/content/pm/PackageInfo.splitNames:[Ljava/lang/String;
        //    54: astore          4
        //    56: aload           4
        //    58: ifnonnull       74
        //    61: new             Ljava/util/ArrayList;
        //    64: astore          4
        //    66: aload           4
        //    68: invokespecial   java/util/ArrayList.<init>:()V
        //    71: goto            81
        //    74: aload           4
        //    76: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //    79: astore          4
        //    81: aload_0        
        //    82: getfield        mg/a.a:Lmg/f;
        //    85: invokevirtual   mg/f.b:()Ljava/util/HashSet;
        //    88: astore          5
        //    90: aload_0        
        //    91: getfield        mg/a.b:Lng/s;
        //    94: invokevirtual   ng/s.a:()Ljava/util/Set;
        //    97: astore          6
        //    99: new             Ljava/util/HashSet;
        //   102: astore          7
        //   104: aload           7
        //   106: invokespecial   java/util/HashSet.<init>:()V
        //   109: aload           5
        //   111: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   114: astore          8
        //   116: aload           8
        //   118: invokeinterface java/util/Iterator.hasNext:()Z
        //   123: ifeq            215
        //   126: aload           8
        //   128: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   133: checkcast       Lmg/q;
        //   136: invokevirtual   mg/q.b:()Ljava/lang/String;
        //   139: astore          9
        //   141: aload           4
        //   143: aload           9
        //   145: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   150: ifne            197
        //   153: getstatic       ng/e0.c:Ldg/k;
        //   156: astore_3       
        //   157: aload           9
        //   159: ldc             "config."
        //   161: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   164: ifeq            174
        //   167: ldc_w           ""
        //   170: astore_3       
        //   171: goto            186
        //   174: aload           9
        //   176: ldc_w           "\\.config\\."
        //   179: iconst_2       
        //   180: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   183: iconst_0       
        //   184: aaload         
        //   185: astore_3       
        //   186: aload           6
        //   188: aload_3        
        //   189: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //   194: ifeq            116
        //   197: aload           7
        //   199: aload           9
        //   201: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   204: pop            
        //   205: aload           8
        //   207: invokeinterface java/util/Iterator.remove:()V
        //   212: goto            116
        //   215: aconst_null    
        //   216: astore          9
        //   218: iload_2        
        //   219: ifeq            231
        //   222: aload_0        
        //   223: aload           7
        //   225: invokevirtual   mg/a.a:(Ljava/util/Set;)V
        //   228: goto            264
        //   231: aload           7
        //   233: invokevirtual   java/util/HashSet.isEmpty:()Z
        //   236: ifne            264
        //   239: invokestatic    xl0/d.o:()Ljava/util/concurrent/ThreadPoolExecutor;
        //   242: astore_3       
        //   243: new             Lqd/h1;
        //   246: astore          6
        //   248: aload           6
        //   250: aload_0        
        //   251: aload           7
        //   253: bipush          11
        //   255: invokespecial   qd/h1.<init>:(Ljava/lang/Object;Ljava/lang/Object;I)V
        //   258: aload_3        
        //   259: aload           6
        //   261: invokevirtual   java/util/concurrent/ThreadPoolExecutor.execute:(Ljava/lang/Runnable;)V
        //   264: new             Ljava/util/HashSet;
        //   267: astore_3       
        //   268: aload_3        
        //   269: invokespecial   java/util/HashSet.<init>:()V
        //   272: aload           5
        //   274: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   277: astore          6
        //   279: aload           6
        //   281: invokeinterface java/util/Iterator.hasNext:()Z
        //   286: ifeq            322
        //   289: aload           6
        //   291: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   296: checkcast       Lmg/q;
        //   299: invokevirtual   mg/q.b:()Ljava/lang/String;
        //   302: astore          7
        //   304: aload           7
        //   306: invokestatic    ng/e0.d:(Ljava/lang/String;)Z
        //   309: ifne            279
        //   312: aload_3        
        //   313: aload           7
        //   315: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   318: pop            
        //   319: goto            279
        //   322: aload           4
        //   324: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   329: astore          7
        //   331: aload           7
        //   333: invokeinterface java/util/Iterator.hasNext:()Z
        //   338: ifeq            371
        //   341: aload           7
        //   343: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   348: checkcast       Ljava/lang/String;
        //   351: astore          4
        //   353: aload           4
        //   355: invokestatic    ng/e0.d:(Ljava/lang/String;)Z
        //   358: ifne            331
        //   361: aload_3        
        //   362: aload           4
        //   364: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   367: pop            
        //   368: goto            331
        //   371: new             Ljava/util/HashSet;
        //   374: astore          7
        //   376: aload           7
        //   378: aload           5
        //   380: invokevirtual   java/util/HashSet.size:()I
        //   383: invokespecial   java/util/HashSet.<init>:(I)V
        //   386: aload           5
        //   388: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   391: astore          6
        //   393: aload           6
        //   395: invokeinterface java/util/Iterator.hasNext:()Z
        //   400: ifeq            495
        //   403: aload           6
        //   405: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   410: checkcast       Lmg/q;
        //   413: astore          5
        //   415: aload           5
        //   417: invokevirtual   mg/q.b:()Ljava/lang/String;
        //   420: astore          4
        //   422: getstatic       ng/e0.c:Ldg/k;
        //   425: astore          8
        //   427: aload           4
        //   429: ldc             "config."
        //   431: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   434: ifne            484
        //   437: aload           5
        //   439: invokevirtual   mg/q.b:()Ljava/lang/String;
        //   442: astore          4
        //   444: aload           4
        //   446: ldc             "config."
        //   448: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   451: ifeq            462
        //   454: ldc_w           ""
        //   457: astore          4
        //   459: goto            475
        //   462: aload           4
        //   464: ldc_w           "\\.config\\."
        //   467: iconst_2       
        //   468: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   471: iconst_0       
        //   472: aaload         
        //   473: astore          4
        //   475: aload_3        
        //   476: aload           4
        //   478: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //   481: ifeq            393
        //   484: aload           7
        //   486: aload           5
        //   488: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   491: pop            
        //   492: goto            393
        //   495: new             Lmg/n;
        //   498: astore          6
        //   500: aload           6
        //   502: aload_0        
        //   503: getfield        mg/a.a:Lmg/f;
        //   506: invokespecial   mg/n.<init>:(Lmg/f;)V
        //   509: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   512: tableswitch {
        //               48: 593
        //               49: 579
        //               50: 567
        //               51: 547
        //          default: 544
        //        }
        //   544: goto            605
        //   547: getstatic       android/os/Build$VERSION.PREVIEW_SDK_INT:I
        //   550: ifne            605
        //   553: new             Lh3/b;
        //   556: dup            
        //   557: bipush          11
        //   559: invokespecial   h3/b.<init>:(I)V
        //   562: astore          4
        //   564: goto            617
        //   567: new             Lah2/c;
        //   570: dup            
        //   571: invokespecial   ah2/c.<init>:()V
        //   574: astore          4
        //   576: goto            617
        //   579: new             Lv0/j;
        //   582: dup            
        //   583: bipush          7
        //   585: invokespecial   v0/j.<init>:(I)V
        //   588: astore          4
        //   590: goto            617
        //   593: new             Lx1/c;
        //   596: dup            
        //   597: invokespecial   x1/c.<init>:()V
        //   600: astore          4
        //   602: goto            617
        //   605: new             Lv0/j;
        //   608: astore          4
        //   610: aload           4
        //   612: bipush          8
        //   614: invokespecial   v0/j.<init>:(I)V
        //   617: aload_1        
        //   618: invokevirtual   android/content/Context.getClassLoader:()Ljava/lang/ClassLoader;
        //   621: astore          5
        //   623: iload_2        
        //   624: ifeq            644
        //   627: aload           4
        //   629: aload           5
        //   631: aload           6
        //   633: invokevirtual   mg/n.a:()Ljava/util/HashSet;
        //   636: invokeinterface ig/s.g:(Ljava/lang/ClassLoader;Ljava/util/HashSet;)V
        //   641: goto            756
        //   644: aload           7
        //   646: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   649: astore          8
        //   651: aload           8
        //   653: invokeinterface java/util/Iterator.hasNext:()Z
        //   658: ifeq            756
        //   661: aload           8
        //   663: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   668: checkcast       Lmg/q;
        //   671: astore          10
        //   673: new             Ljava/util/concurrent/atomic/AtomicBoolean;
        //   676: astore          11
        //   678: aload           11
        //   680: iconst_1       
        //   681: invokespecial   java/util/concurrent/atomic/AtomicBoolean.<init>:(Z)V
        //   684: new             Ljava/util/HashSet;
        //   687: astore_3       
        //   688: aload_3        
        //   689: invokespecial   java/util/HashSet.<init>:()V
        //   692: new             Lmg/h;
        //   695: astore          12
        //   697: aload           12
        //   699: aload           6
        //   701: aload           10
        //   703: aload_3        
        //   704: aload           11
        //   706: invokespecial   mg/h.<init>:(Lmg/n;Lmg/q;Ljava/util/HashSet;Ljava/util/concurrent/atomic/AtomicBoolean;)V
        //   709: aload           10
        //   711: aload           12
        //   713: invokestatic    mg/n.b:(Lmg/q;Lmg/k;)V
        //   716: aload           11
        //   718: invokevirtual   java/util/concurrent/atomic/AtomicBoolean.get:()Z
        //   721: ifeq            727
        //   724: goto            729
        //   727: aconst_null    
        //   728: astore_3       
        //   729: aload_3        
        //   730: ifnonnull       743
        //   733: aload           8
        //   735: invokeinterface java/util/Iterator.remove:()V
        //   740: goto            651
        //   743: aload           4
        //   745: aload           5
        //   747: aload_3        
        //   748: invokeinterface ig/s.g:(Ljava/lang/ClassLoader;Ljava/util/HashSet;)V
        //   753: goto            651
        //   756: new             Ljava/util/HashSet;
        //   759: astore          6
        //   761: aload           6
        //   763: invokespecial   java/util/HashSet.<init>:()V
        //   766: aload           7
        //   768: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //   771: astore          8
        //   773: aload           8
        //   775: invokeinterface java/util/Iterator.hasNext:()Z
        //   780: ifeq            996
        //   783: aload           8
        //   785: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   790: checkcast       Lmg/q;
        //   793: astore          11
        //   795: new             Ljava/util/zip/ZipFile;
        //   798: astore_3       
        //   799: aload_3        
        //   800: aload           11
        //   802: invokevirtual   mg/q.a:()Ljava/io/File;
        //   805: invokespecial   java/util/zip/ZipFile.<init>:(Ljava/io/File;)V
        //   808: aload_3        
        //   809: ldc_w           "classes.dex"
        //   812: invokevirtual   java/util/zip/ZipFile.getEntry:(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
        //   815: astore          10
        //   817: aload_3        
        //   818: invokevirtual   java/util/zip/ZipFile.close:()V
        //   821: aload           10
        //   823: ifnull          958
        //   826: aload_0        
        //   827: getfield        mg/a.a:Lmg/f;
        //   830: astore          10
        //   832: aload           11
        //   834: invokevirtual   mg/q.b:()Ljava/lang/String;
        //   837: astore_3       
        //   838: aload           10
        //   840: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   843: pop            
        //   844: new             Ljava/io/File;
        //   847: astore          12
        //   849: aload           12
        //   851: aload           10
        //   853: invokevirtual   mg/f.h:()Ljava/io/File;
        //   856: ldc_w           "dex"
        //   859: invokespecial   java/io/File.<init>:(Ljava/io/File;Ljava/lang/String;)V
        //   862: aload           12
        //   864: invokestatic    mg/f.f:(Ljava/io/File;)V
        //   867: aload           12
        //   869: aload_3        
        //   870: invokestatic    mg/f.e:(Ljava/io/File;Ljava/lang/String;)Ljava/io/File;
        //   873: astore_3       
        //   874: aload_3        
        //   875: invokestatic    mg/f.f:(Ljava/io/File;)V
        //   878: aload           4
        //   880: aload           5
        //   882: aload_3        
        //   883: aload           11
        //   885: invokevirtual   mg/q.a:()Ljava/io/File;
        //   888: iload_2        
        //   889: invokeinterface ig/s.v:(Ljava/lang/ClassLoader;Ljava/io/File;Ljava/io/File;Z)Z
        //   894: ifeq            900
        //   897: goto            958
        //   900: aload           11
        //   902: invokevirtual   mg/q.a:()Ljava/io/File;
        //   905: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   908: astore          11
        //   910: aload           11
        //   912: invokevirtual   java/lang/String.length:()I
        //   915: istore          13
        //   917: new             Ljava/lang/StringBuilder;
        //   920: astore_3       
        //   921: aload_3        
        //   922: iload           13
        //   924: bipush          24
        //   926: iadd           
        //   927: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   930: aload_3        
        //   931: ldc_w           "split was not installed "
        //   934: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   937: pop            
        //   938: aload_3        
        //   939: aload           11
        //   941: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   944: pop            
        //   945: ldc             "SplitCompat"
        //   947: aload_3        
        //   948: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   951: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   954: pop            
        //   955: goto            773
        //   958: aload           6
        //   960: aload           11
        //   962: invokevirtual   mg/q.a:()Ljava/io/File;
        //   965: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //   968: pop            
        //   969: goto            773
        //   972: astore_1       
        //   973: aload_3        
        //   974: astore          4
        //   976: goto            984
        //   979: astore_1       
        //   980: aload           9
        //   982: astore          4
        //   984: aload           4
        //   986: ifnull          994
        //   989: aload           4
        //   991: invokevirtual   java/util/zip/ZipFile.close:()V
        //   994: aload_1        
        //   995: athrow         
        //   996: aload_0        
        //   997: getfield        mg/a.d:Lmg/c;
        //  1000: aload_1        
        //  1001: aload           6
        //  1003: invokevirtual   mg/c.a:(Landroid/content/Context;Ljava/util/HashSet;)V
        //  1006: new             Ljava/util/HashSet;
        //  1009: astore_1       
        //  1010: aload_1        
        //  1011: invokespecial   java/util/HashSet.<init>:()V
        //  1014: aload           7
        //  1016: invokevirtual   java/util/HashSet.iterator:()Ljava/util/Iterator;
        //  1019: astore          4
        //  1021: aload           4
        //  1023: invokeinterface java/util/Iterator.hasNext:()Z
        //  1028: ifeq            1198
        //  1031: aload           4
        //  1033: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1038: checkcast       Lmg/q;
        //  1041: astore          7
        //  1043: aload           6
        //  1045: aload           7
        //  1047: invokevirtual   mg/q.a:()Ljava/io/File;
        //  1050: invokevirtual   java/util/HashSet.contains:(Ljava/lang/Object;)Z
        //  1053: ifeq            1132
        //  1056: aload           7
        //  1058: invokevirtual   mg/q.b:()Ljava/lang/String;
        //  1061: astore_3       
        //  1062: aload_3        
        //  1063: invokevirtual   java/lang/String.length:()I
        //  1066: istore          13
        //  1068: new             Ljava/lang/StringBuilder;
        //  1071: astore          9
        //  1073: aload           9
        //  1075: iload           13
        //  1077: bipush          30
        //  1079: iadd           
        //  1080: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1083: aload           9
        //  1085: ldc_w           "Split '"
        //  1088: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1091: pop            
        //  1092: aload           9
        //  1094: aload_3        
        //  1095: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1098: pop            
        //  1099: aload           9
        //  1101: ldc_w           "' installation emulated"
        //  1104: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1107: pop            
        //  1108: ldc             "SplitCompat"
        //  1110: aload           9
        //  1112: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1115: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //  1118: pop            
        //  1119: aload_1        
        //  1120: aload           7
        //  1122: invokevirtual   mg/q.b:()Ljava/lang/String;
        //  1125: invokevirtual   java/util/HashSet.add:(Ljava/lang/Object;)Z
        //  1128: pop            
        //  1129: goto            1021
        //  1132: aload           7
        //  1134: invokevirtual   mg/q.b:()Ljava/lang/String;
        //  1137: astore_3       
        //  1138: aload_3        
        //  1139: invokevirtual   java/lang/String.length:()I
        //  1142: istore          13
        //  1144: new             Ljava/lang/StringBuilder;
        //  1147: astore          9
        //  1149: aload           9
        //  1151: iload           13
        //  1153: bipush          35
        //  1155: iadd           
        //  1156: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1159: aload           9
        //  1161: ldc_w           "Split '"
        //  1164: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1167: pop            
        //  1168: aload           9
        //  1170: aload_3        
        //  1171: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1174: pop            
        //  1175: aload           9
        //  1177: ldc_w           "' installation not emulated."
        //  1180: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1183: pop            
        //  1184: ldc             "SplitCompat"
        //  1186: aload           9
        //  1188: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1191: invokestatic    android/util/Log.d:(Ljava/lang/String;Ljava/lang/String;)I
        //  1194: pop            
        //  1195: goto            1021
        //  1198: aload_0        
        //  1199: getfield        mg/a.c:Ljava/util/HashSet;
        //  1202: astore          4
        //  1204: aload           4
        //  1206: monitorenter   
        //  1207: aload_0        
        //  1208: getfield        mg/a.c:Ljava/util/HashSet;
        //  1211: aload_1        
        //  1212: invokeinterface java/util/Set.addAll:(Ljava/util/Collection;)Z
        //  1217: pop            
        //  1218: aload           4
        //  1220: monitorexit    
        //  1221: aload_0        
        //  1222: monitorexit    
        //  1223: return         
        //  1224: astore_1       
        //  1225: aload           4
        //  1227: monitorexit    
        //  1228: aload_1        
        //  1229: athrow         
        //  1230: astore          4
        //  1232: new             Ljava/io/IOException;
        //  1235: astore_1       
        //  1236: aload_1        
        //  1237: ldc_w           "Cannot load data for application '%s'"
        //  1240: iconst_1       
        //  1241: anewarray       Ljava/lang/Object;
        //  1244: dup            
        //  1245: iconst_0       
        //  1246: aload_3        
        //  1247: aastore        
        //  1248: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //  1251: aload           4
        //  1253: invokespecial   java/io/IOException.<init>:(Ljava/lang/String;Ljava/lang/Throwable;)V
        //  1256: aload_1        
        //  1257: athrow         
        //  1258: astore_1       
        //  1259: aload_0        
        //  1260: monitorexit    
        //  1261: aload_1        
        //  1262: athrow         
        //  1263: astore          4
        //  1265: goto            994
        //    Exceptions:
        //  throws java.io.IOException
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  6      13     1258   1263   Any
        //  16     37     1258   1263   Any
        //  37     42     1258   1263   Any
        //  42     56     1230   1258   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  42     56     1258   1263   Any
        //  61     71     1230   1258   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  61     71     1258   1263   Any
        //  74     81     1230   1258   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  74     81     1258   1263   Any
        //  81     116    1258   1263   Any
        //  116    167    1258   1263   Any
        //  174    186    1258   1263   Any
        //  186    197    1258   1263   Any
        //  197    212    1258   1263   Any
        //  222    228    1258   1263   Any
        //  231    264    1258   1263   Any
        //  264    279    1258   1263   Any
        //  279    319    1258   1263   Any
        //  322    331    1258   1263   Any
        //  331    368    1258   1263   Any
        //  371    393    1258   1263   Any
        //  393    454    1258   1263   Any
        //  462    475    1258   1263   Any
        //  475    484    1258   1263   Any
        //  484    492    1258   1263   Any
        //  495    544    1258   1263   Any
        //  547    564    1258   1263   Any
        //  567    576    1258   1263   Any
        //  579    590    1258   1263   Any
        //  593    602    1258   1263   Any
        //  605    617    1258   1263   Any
        //  617    623    1258   1263   Any
        //  627    641    1258   1263   Any
        //  644    651    1258   1263   Any
        //  651    724    1258   1263   Any
        //  733    740    1258   1263   Any
        //  743    753    1258   1263   Any
        //  756    773    1258   1263   Any
        //  773    795    1258   1263   Any
        //  795    808    979    984    Ljava/io/IOException;
        //  795    808    1258   1263   Any
        //  808    821    972    979    Ljava/io/IOException;
        //  808    821    1258   1263   Any
        //  826    897    1258   1263   Any
        //  900    955    1258   1263   Any
        //  958    969    1258   1263   Any
        //  989    994    1263   1268   Ljava/io/IOException;
        //  989    994    1258   1263   Any
        //  994    996    1258   1263   Any
        //  996    1021   1258   1263   Any
        //  1021   1129   1258   1263   Any
        //  1132   1195   1258   1263   Any
        //  1198   1207   1258   1263   Any
        //  1207   1221   1224   1230   Any
        //  1225   1228   1224   1230   Any
        //  1228   1230   1258   1263   Any
        //  1232   1258   1258   1263   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0994:
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
