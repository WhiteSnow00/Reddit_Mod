// 
// Decompiled by Procyon v0.6.0
// 

package com.android.billingclient.api;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import android.app.Activity;
import android.os.Looper;
import d7.a;
import java.util.concurrent.ExecutorService;
import android.content.Context;
import z1.f;
import android.os.Handler;

public final class d extends c
{
    public volatile int a;
    public final String b;
    public final Handler c;
    public volatile f d;
    public Context e;
    public volatile com.google.android.gms.internal.play_billing.d f;
    public volatile y g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public ExecutorService q;
    
    public d(final boolean p3, Context applicationContext, final q q) {
        String b;
        try {
            b = (String)a.class.getField("VERSION_NAME").get(null);
        }
        catch (final Exception ex) {
            b = "4.0.0";
        }
        this.a = 0;
        this.c = new Handler(Looper.getMainLooper());
        this.i = 0;
        this.b = b;
        applicationContext = applicationContext.getApplicationContext();
        this.e = applicationContext;
        this.d = new f(applicationContext, q);
        this.p = p3;
    }
    
    public final boolean a() {
        return this.a == 2 && this.f != null && this.g != null;
    }
    
    public final k b(final Activity p0, final j p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/android/billingclient/api/d.a:()Z
        //     4: ifne            18
        //     7: getstatic       com/android/billingclient/api/z.l:Lcom/android/billingclient/api/k;
        //    10: astore_1       
        //    11: aload_0        
        //    12: aload_1        
        //    13: invokevirtual   com/android/billingclient/api/d.d:(Lcom/android/billingclient/api/k;)V
        //    16: aload_1        
        //    17: areturn        
        //    18: aload_2        
        //    19: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //    22: pop            
        //    23: new             Ljava/util/ArrayList;
        //    26: dup            
        //    27: invokespecial   java/util/ArrayList.<init>:()V
        //    30: astore          19
        //    32: aload           19
        //    34: aload_2        
        //    35: getfield        com/android/billingclient/api/j.f:Ljava/util/ArrayList;
        //    38: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //    41: pop            
        //    42: iconst_0       
        //    43: istore          4
        //    45: aload           19
        //    47: iconst_0       
        //    48: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //    51: checkcast       Lcom/android/billingclient/api/SkuDetails;
        //    54: astore          18
        //    56: aload           18
        //    58: invokevirtual   com/android/billingclient/api/SkuDetails.a:()Ljava/lang/String;
        //    61: astore          16
        //    63: aload           16
        //    65: ldc             "subs"
        //    67: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    70: istore          11
        //    72: ldc             "BillingClient"
        //    74: astore          17
        //    76: iload           11
        //    78: ifeq            109
        //    81: aload_0        
        //    82: getfield        com/android/billingclient/api/d.h:Z
        //    85: ifeq            91
        //    88: goto            109
        //    91: ldc             "BillingClient"
        //    93: ldc             "Current client doesn't support subscriptions."
        //    95: invokestatic    com/google/android/gms/internal/play_billing/a.f:(Ljava/lang/String;Ljava/lang/String;)V
        //    98: getstatic       com/android/billingclient/api/z.n:Lcom/android/billingclient/api/k;
        //   101: astore_1       
        //   102: aload_0        
        //   103: aload_1        
        //   104: invokevirtual   com/android/billingclient/api/d.d:(Lcom/android/billingclient/api/k;)V
        //   107: aload_1        
        //   108: areturn        
        //   109: aload_2        
        //   110: getfield        com/android/billingclient/api/j.g:Z
        //   113: ifne            152
        //   116: aload_2        
        //   117: getfield        com/android/billingclient/api/j.b:Ljava/lang/String;
        //   120: ifnonnull       152
        //   123: aload_2        
        //   124: getfield        com/android/billingclient/api/j.d:Ljava/lang/String;
        //   127: ifnonnull       152
        //   130: aload_2        
        //   131: getfield        com/android/billingclient/api/j.e:I
        //   134: ifne            152
        //   137: aload_2        
        //   138: getfield        com/android/billingclient/api/j.a:Z
        //   141: ifeq            147
        //   144: goto            152
        //   147: iconst_0       
        //   148: istore_3       
        //   149: goto            154
        //   152: iconst_1       
        //   153: istore_3       
        //   154: iload_3        
        //   155: ifeq            186
        //   158: aload_0        
        //   159: getfield        com/android/billingclient/api/d.j:Z
        //   162: ifeq            168
        //   165: goto            186
        //   168: ldc             "BillingClient"
        //   170: ldc             "Current client doesn't support extra params for buy intent."
        //   172: invokestatic    com/google/android/gms/internal/play_billing/a.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   175: getstatic       com/android/billingclient/api/z.g:Lcom/android/billingclient/api/k;
        //   178: astore_1       
        //   179: aload_0        
        //   180: aload_1        
        //   181: invokevirtual   com/android/billingclient/api/d.d:(Lcom/android/billingclient/api/k;)V
        //   184: aload_1        
        //   185: areturn        
        //   186: aload           19
        //   188: invokevirtual   java/util/ArrayList.size:()I
        //   191: iconst_1       
        //   192: if_icmple       223
        //   195: aload_0        
        //   196: getfield        com/android/billingclient/api/d.o:Z
        //   199: ifeq            205
        //   202: goto            223
        //   205: ldc             "BillingClient"
        //   207: ldc             "Current client doesn't support multi-item purchases."
        //   209: invokestatic    com/google/android/gms/internal/play_billing/a.f:(Ljava/lang/String;Ljava/lang/String;)V
        //   212: getstatic       com/android/billingclient/api/z.o:Lcom/android/billingclient/api/k;
        //   215: astore_1       
        //   216: aload_0        
        //   217: aload_1        
        //   218: invokevirtual   com/android/billingclient/api/d.d:(Lcom/android/billingclient/api/k;)V
        //   221: aload_1        
        //   222: areturn        
        //   223: ldc             ""
        //   225: astore          13
        //   227: ldc             ""
        //   229: astore          15
        //   231: iload           4
        //   233: istore_3       
        //   234: iload_3        
        //   235: aload           19
        //   237: invokevirtual   java/util/ArrayList.size:()I
        //   240: if_icmpge       325
        //   243: aload           15
        //   245: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   248: astore          14
        //   250: aload           19
        //   252: iload_3        
        //   253: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   256: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   259: astore          15
        //   261: new             Ljava/lang/StringBuilder;
        //   264: dup            
        //   265: aload           14
        //   267: invokevirtual   java/lang/String.length:()I
        //   270: aload           15
        //   272: invokevirtual   java/lang/String.length:()I
        //   275: iadd           
        //   276: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   279: aload           14
        //   281: aload           15
        //   283: invokestatic    ph0/a.f:(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   286: astore          15
        //   288: aload           15
        //   290: astore          14
        //   292: iload_3        
        //   293: aload           19
        //   295: invokevirtual   java/util/ArrayList.size:()I
        //   298: iconst_1       
        //   299: isub           
        //   300: if_icmpge       315
        //   303: aload           15
        //   305: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   308: ldc             ", "
        //   310: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   313: astore          14
        //   315: iinc            3, 1
        //   318: aload           14
        //   320: astore          15
        //   322: goto            234
        //   325: ldc             "BillingClient"
        //   327: new             Ljava/lang/StringBuilder;
        //   330: dup            
        //   331: aload           15
        //   333: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   336: invokevirtual   java/lang/String.length:()I
        //   339: bipush          41
        //   341: iadd           
        //   342: aload           16
        //   344: invokevirtual   java/lang/String.length:()I
        //   347: iadd           
        //   348: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   351: ldc             "Constructing buy intent for "
        //   353: aload           15
        //   355: ldc             ", item type: "
        //   357: aload           16
        //   359: invokestatic    xm2/a.b:(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   362: invokestatic    com/google/android/gms/internal/play_billing/a.e:(Ljava/lang/String;Ljava/lang/String;)V
        //   365: aload_0        
        //   366: getfield        com/android/billingclient/api/d.j:Z
        //   369: ifeq            1326
        //   372: aload_0        
        //   373: getfield        com/android/billingclient/api/d.k:Z
        //   376: istore          12
        //   378: aload_0        
        //   379: getfield        com/android/billingclient/api/d.p:Z
        //   382: istore          11
        //   384: aload_0        
        //   385: getfield        com/android/billingclient/api/d.b:Ljava/lang/String;
        //   388: astore          14
        //   390: new             Landroid/os/Bundle;
        //   393: dup            
        //   394: invokespecial   android/os/Bundle.<init>:()V
        //   397: astore          20
        //   399: aload           20
        //   401: ldc             "playBillingLibraryVersion"
        //   403: aload           14
        //   405: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   408: aload_2        
        //   409: getfield        com/android/billingclient/api/j.e:I
        //   412: istore_3       
        //   413: iload_3        
        //   414: ifeq            425
        //   417: aload           20
        //   419: ldc             "prorationMode"
        //   421: iload_3        
        //   422: invokevirtual   android/os/BaseBundle.putInt:(Ljava/lang/String;I)V
        //   425: aload_2        
        //   426: getfield        com/android/billingclient/api/j.b:Ljava/lang/String;
        //   429: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   432: ifne            446
        //   435: aload           20
        //   437: ldc             "accountId"
        //   439: aload_2        
        //   440: getfield        com/android/billingclient/api/j.b:Ljava/lang/String;
        //   443: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   446: aload_2        
        //   447: getfield        com/android/billingclient/api/j.d:Ljava/lang/String;
        //   450: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   453: ifne            467
        //   456: aload           20
        //   458: ldc             "obfuscatedProfileId"
        //   460: aload_2        
        //   461: getfield        com/android/billingclient/api/j.d:Ljava/lang/String;
        //   464: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   467: aload_2        
        //   468: getfield        com/android/billingclient/api/j.g:Z
        //   471: ifeq            482
        //   474: aload           20
        //   476: ldc             "vr"
        //   478: iconst_1       
        //   479: invokevirtual   android/os/BaseBundle.putBoolean:(Ljava/lang/String;Z)V
        //   482: aconst_null    
        //   483: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   486: ifne            515
        //   489: aload           20
        //   491: ldc_w           "skusToReplace"
        //   494: new             Ljava/util/ArrayList;
        //   497: dup            
        //   498: iconst_1       
        //   499: anewarray       Ljava/lang/String;
        //   502: dup            
        //   503: iconst_0       
        //   504: aconst_null    
        //   505: aastore        
        //   506: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   509: invokespecial   java/util/ArrayList.<init>:(Ljava/util/Collection;)V
        //   512: invokevirtual   android/os/Bundle.putStringArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   515: aload_2        
        //   516: getfield        com/android/billingclient/api/j.c:Ljava/lang/String;
        //   519: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   522: ifne            537
        //   525: aload           20
        //   527: ldc_w           "oldSkuPurchaseToken"
        //   530: aload_2        
        //   531: getfield        com/android/billingclient/api/j.c:Ljava/lang/String;
        //   534: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   537: aconst_null    
        //   538: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   541: ifne            553
        //   544: aload           20
        //   546: ldc_w           "oldSkuPurchaseId"
        //   549: aconst_null    
        //   550: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   553: aconst_null    
        //   554: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   557: ifne            569
        //   560: aload           20
        //   562: ldc_w           "paymentsPurchaseParams"
        //   565: aconst_null    
        //   566: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   569: iload           12
        //   571: ifeq            588
        //   574: iload           11
        //   576: ifeq            588
        //   579: aload           20
        //   581: ldc_w           "enablePendingPurchases"
        //   584: iconst_1       
        //   585: invokevirtual   android/os/BaseBundle.putBoolean:(Ljava/lang/String;Z)V
        //   588: new             Ljava/util/ArrayList;
        //   591: dup            
        //   592: invokespecial   java/util/ArrayList.<init>:()V
        //   595: astore          25
        //   597: new             Ljava/util/ArrayList;
        //   600: dup            
        //   601: invokespecial   java/util/ArrayList.<init>:()V
        //   604: astore          23
        //   606: new             Ljava/util/ArrayList;
        //   609: dup            
        //   610: invokespecial   java/util/ArrayList.<init>:()V
        //   613: astore          21
        //   615: new             Ljava/util/ArrayList;
        //   618: dup            
        //   619: invokespecial   java/util/ArrayList.<init>:()V
        //   622: astore          24
        //   624: new             Ljava/util/ArrayList;
        //   627: dup            
        //   628: invokespecial   java/util/ArrayList.<init>:()V
        //   631: astore          22
        //   633: aload           19
        //   635: invokevirtual   java/util/ArrayList.size:()I
        //   638: istore          5
        //   640: iconst_0       
        //   641: istore          8
        //   643: iconst_0       
        //   644: istore          7
        //   646: iconst_0       
        //   647: istore          4
        //   649: iconst_0       
        //   650: istore_3       
        //   651: iconst_0       
        //   652: istore          6
        //   654: aload           17
        //   656: astore          14
        //   658: iload           6
        //   660: iload           5
        //   662: if_icmpge       888
        //   665: aload           19
        //   667: iload           6
        //   669: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //   672: checkcast       Lcom/android/billingclient/api/SkuDetails;
        //   675: astore          26
        //   677: aload           26
        //   679: getfield        com/android/billingclient/api/SkuDetails.b:Lorg/json/JSONObject;
        //   682: ldc_w           "skuDetailsToken"
        //   685: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //   688: invokevirtual   java/lang/String.isEmpty:()Z
        //   691: ifne            711
        //   694: aload           25
        //   696: aload           26
        //   698: getfield        com/android/billingclient/api/SkuDetails.b:Lorg/json/JSONObject;
        //   701: ldc_w           "skuDetailsToken"
        //   704: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //   707: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   710: pop            
        //   711: aload           26
        //   713: getfield        com/android/billingclient/api/SkuDetails.a:Ljava/lang/String;
        //   716: astore          27
        //   718: new             Lorg/json/JSONObject;
        //   721: astore          17
        //   723: aload           17
        //   725: aload           27
        //   727: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   730: aload           17
        //   732: ldc_w           "offer_id_token"
        //   735: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //   738: astore          17
        //   740: goto            749
        //   743: astore          17
        //   745: aload           13
        //   747: astore          17
        //   749: aload           26
        //   751: getfield        com/android/billingclient/api/SkuDetails.b:Lorg/json/JSONObject;
        //   754: ldc_w           "offer_id"
        //   757: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //   760: astore          27
        //   762: aload           26
        //   764: getfield        com/android/billingclient/api/SkuDetails.b:Lorg/json/JSONObject;
        //   767: ldc_w           "offer_type"
        //   770: invokevirtual   org/json/JSONObject.optInt:(Ljava/lang/String;)I
        //   773: istore          10
        //   775: aload           26
        //   777: getfield        com/android/billingclient/api/SkuDetails.b:Lorg/json/JSONObject;
        //   780: ldc_w           "serializedDocid"
        //   783: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //   786: astore          26
        //   788: aload           23
        //   790: aload           17
        //   792: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   795: pop            
        //   796: iload           8
        //   798: aload           17
        //   800: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   803: iconst_1       
        //   804: ixor           
        //   805: ior            
        //   806: istore          8
        //   808: aload           21
        //   810: aload           27
        //   812: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   815: pop            
        //   816: iload           7
        //   818: aload           27
        //   820: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   823: iconst_1       
        //   824: ixor           
        //   825: ior            
        //   826: istore          9
        //   828: aload           24
        //   830: iload           10
        //   832: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   835: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   838: pop            
        //   839: iload           10
        //   841: ifeq            850
        //   844: iconst_1       
        //   845: istore          7
        //   847: goto            853
        //   850: iconst_0       
        //   851: istore          7
        //   853: iload           4
        //   855: iload           7
        //   857: ior            
        //   858: istore          4
        //   860: iload_3        
        //   861: aload           26
        //   863: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   866: iconst_1       
        //   867: ixor           
        //   868: ior            
        //   869: istore_3       
        //   870: aload           22
        //   872: aload           26
        //   874: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //   877: pop            
        //   878: iinc            6, 1
        //   881: iload           9
        //   883: istore          7
        //   885: goto            658
        //   888: aload           25
        //   890: invokevirtual   java/util/ArrayList.isEmpty:()Z
        //   893: ifne            906
        //   896: aload           20
        //   898: ldc_w           "skuDetailsTokens"
        //   901: aload           25
        //   903: invokevirtual   android/os/Bundle.putStringArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   906: iload           8
        //   908: ifeq            939
        //   911: aload_0        
        //   912: getfield        com/android/billingclient/api/d.m:Z
        //   915: ifne            929
        //   918: getstatic       com/android/billingclient/api/z.h:Lcom/android/billingclient/api/k;
        //   921: astore_1       
        //   922: aload_0        
        //   923: aload_1        
        //   924: invokevirtual   com/android/billingclient/api/d.d:(Lcom/android/billingclient/api/k;)V
        //   927: aload_1        
        //   928: areturn        
        //   929: aload           20
        //   931: ldc_w           "SKU_OFFER_ID_TOKEN_LIST"
        //   934: aload           23
        //   936: invokevirtual   android/os/Bundle.putStringArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   939: iload           7
        //   941: ifeq            954
        //   944: aload           20
        //   946: ldc_w           "SKU_OFFER_ID_LIST"
        //   949: aload           21
        //   951: invokevirtual   android/os/Bundle.putStringArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   954: iload           4
        //   956: ifeq            969
        //   959: aload           20
        //   961: ldc_w           "SKU_OFFER_TYPE_LIST"
        //   964: aload           24
        //   966: invokevirtual   android/os/Bundle.putIntegerArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   969: iload_3        
        //   970: ifeq            983
        //   973: aload           20
        //   975: ldc_w           "SKU_SERIALIZED_DOCID_LIST"
        //   978: aload           22
        //   980: invokevirtual   android/os/Bundle.putStringArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //   983: aload           18
        //   985: getfield        com/android/billingclient/api/SkuDetails.b:Lorg/json/JSONObject;
        //   988: ldc_w           "packageName"
        //   991: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //   994: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   997: ifne            1024
        //  1000: aload           20
        //  1002: ldc_w           "skuPackageName"
        //  1005: aload           18
        //  1007: getfield        com/android/billingclient/api/SkuDetails.b:Lorg/json/JSONObject;
        //  1010: ldc_w           "packageName"
        //  1013: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //  1016: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //  1019: iconst_1       
        //  1020: istore_3       
        //  1021: goto            1026
        //  1024: iconst_0       
        //  1025: istore_3       
        //  1026: aconst_null    
        //  1027: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1030: ifne            1042
        //  1033: aload           20
        //  1035: ldc_w           "accountName"
        //  1038: aconst_null    
        //  1039: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //  1042: aload           19
        //  1044: invokevirtual   java/util/ArrayList.size:()I
        //  1047: istore          5
        //  1049: iconst_1       
        //  1050: istore          4
        //  1052: iload           5
        //  1054: iconst_1       
        //  1055: if_icmple       1170
        //  1058: new             Ljava/util/ArrayList;
        //  1061: dup            
        //  1062: aload           19
        //  1064: invokevirtual   java/util/ArrayList.size:()I
        //  1067: iconst_1       
        //  1068: isub           
        //  1069: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1072: astore          13
        //  1074: new             Ljava/util/ArrayList;
        //  1077: dup            
        //  1078: aload           19
        //  1080: invokevirtual   java/util/ArrayList.size:()I
        //  1083: iconst_1       
        //  1084: isub           
        //  1085: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1088: astore          17
        //  1090: iload           4
        //  1092: aload           19
        //  1094: invokevirtual   java/util/ArrayList.size:()I
        //  1097: if_icmpge       1150
        //  1100: aload           13
        //  1102: aload           19
        //  1104: iload           4
        //  1106: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1109: checkcast       Lcom/android/billingclient/api/SkuDetails;
        //  1112: getfield        com/android/billingclient/api/SkuDetails.b:Lorg/json/JSONObject;
        //  1115: ldc_w           "productId"
        //  1118: invokevirtual   org/json/JSONObject.optString:(Ljava/lang/String;)Ljava/lang/String;
        //  1121: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1124: pop            
        //  1125: aload           17
        //  1127: aload           19
        //  1129: iload           4
        //  1131: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1134: checkcast       Lcom/android/billingclient/api/SkuDetails;
        //  1137: invokevirtual   com/android/billingclient/api/SkuDetails.a:()Ljava/lang/String;
        //  1140: invokevirtual   java/util/ArrayList.add:(Ljava/lang/Object;)Z
        //  1143: pop            
        //  1144: iinc            4, 1
        //  1147: goto            1090
        //  1150: aload           20
        //  1152: ldc_w           "additionalSkus"
        //  1155: aload           13
        //  1157: invokevirtual   android/os/Bundle.putStringArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //  1160: aload           20
        //  1162: ldc_w           "additionalSkuTypes"
        //  1165: aload           17
        //  1167: invokevirtual   android/os/Bundle.putStringArrayList:(Ljava/lang/String;Ljava/util/ArrayList;)V
        //  1170: aload_1        
        //  1171: invokevirtual   android/app/Activity.getIntent:()Landroid/content/Intent;
        //  1174: ldc_w           "PROXY_PACKAGE"
        //  1177: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1180: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //  1183: ifne            1248
        //  1186: aload_1        
        //  1187: invokevirtual   android/app/Activity.getIntent:()Landroid/content/Intent;
        //  1190: ldc_w           "PROXY_PACKAGE"
        //  1193: invokevirtual   android/content/Intent.getStringExtra:(Ljava/lang/String;)Ljava/lang/String;
        //  1196: astore          13
        //  1198: aload           20
        //  1200: ldc_w           "proxyPackage"
        //  1203: aload           13
        //  1205: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //  1208: aload           20
        //  1210: ldc_w           "proxyPackageVersion"
        //  1213: aload_0        
        //  1214: getfield        com/android/billingclient/api/d.e:Landroid/content/Context;
        //  1217: invokevirtual   android/content/Context.getPackageManager:()Landroid/content/pm/PackageManager;
        //  1220: aload           13
        //  1222: iconst_0       
        //  1223: invokevirtual   android/content/pm/PackageManager.getPackageInfo:(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
        //  1226: getfield        android/content/pm/PackageInfo.versionName:Ljava/lang/String;
        //  1229: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //  1232: goto            1248
        //  1235: astore          13
        //  1237: aload           20
        //  1239: ldc_w           "proxyPackageVersion"
        //  1242: ldc_w           "package not found"
        //  1245: invokevirtual   android/os/BaseBundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //  1248: aload_0        
        //  1249: getfield        com/android/billingclient/api/d.n:Z
        //  1252: ifeq            1265
        //  1255: iload_3        
        //  1256: ifeq            1265
        //  1259: bipush          15
        //  1261: istore_3       
        //  1262: goto            1275
        //  1265: aload_0        
        //  1266: getfield        com/android/billingclient/api/d.k:Z
        //  1269: ifeq            1278
        //  1272: bipush          9
        //  1274: istore_3       
        //  1275: goto            1294
        //  1278: aload_2        
        //  1279: getfield        com/android/billingclient/api/j.g:Z
        //  1282: ifeq            1291
        //  1285: bipush          7
        //  1287: istore_3       
        //  1288: goto            1294
        //  1291: bipush          6
        //  1293: istore_3       
        //  1294: aload_0        
        //  1295: new             Lcom/android/billingclient/api/k0;
        //  1298: dup            
        //  1299: aload_0        
        //  1300: iload_3        
        //  1301: aload           18
        //  1303: aload           16
        //  1305: aload_2        
        //  1306: aload           20
        //  1308: invokespecial   com/android/billingclient/api/k0.<init>:(Lcom/android/billingclient/api/d;ILcom/android/billingclient/api/SkuDetails;Ljava/lang/String;Lcom/android/billingclient/api/j;Landroid/os/Bundle;)V
        //  1311: ldc2_w          5000
        //  1314: aconst_null    
        //  1315: aload_0        
        //  1316: getfield        com/android/billingclient/api/d.c:Landroid/os/Handler;
        //  1319: invokevirtual   com/android/billingclient/api/d.f:(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
        //  1322: astore_2       
        //  1323: goto            1356
        //  1326: ldc             "BillingClient"
        //  1328: astore          14
        //  1330: aload_0        
        //  1331: new             Lcom/android/billingclient/api/f0;
        //  1334: dup            
        //  1335: aload_0        
        //  1336: iconst_0       
        //  1337: aload           18
        //  1339: aload           16
        //  1341: invokespecial   com/android/billingclient/api/f0.<init>:(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V
        //  1344: ldc2_w          5000
        //  1347: aconst_null    
        //  1348: aload_0        
        //  1349: getfield        com/android/billingclient/api/d.c:Landroid/os/Handler;
        //  1352: invokevirtual   com/android/billingclient/api/d.f:(Ljava/util/concurrent/Callable;JLjava/lang/Runnable;Landroid/os/Handler;)Ljava/util/concurrent/Future;
        //  1355: astore_2       
        //  1356: getstatic       java/util/concurrent/TimeUnit.MILLISECONDS:Ljava/util/concurrent/TimeUnit;
        //  1359: astore          13
        //  1361: aload_2        
        //  1362: ldc2_w          5000
        //  1365: aload           13
        //  1367: invokeinterface java/util/concurrent/Future.get:(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
        //  1372: checkcast       Landroid/os/Bundle;
        //  1375: astore          13
        //  1377: aload           13
        //  1379: aload           14
        //  1381: invokestatic    com/google/android/gms/internal/play_billing/a.a:(Landroid/os/Bundle;Ljava/lang/String;)I
        //  1384: istore_3       
        //  1385: aload           13
        //  1387: aload           14
        //  1389: invokestatic    com/google/android/gms/internal/play_billing/a.d:(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
        //  1392: astore_2       
        //  1393: iload_3        
        //  1394: ifeq            1460
        //  1397: new             Ljava/lang/StringBuilder;
        //  1400: astore_1       
        //  1401: aload_1        
        //  1402: bipush          52
        //  1404: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1407: aload_1        
        //  1408: ldc_w           "Unable to buy item, Error response code: "
        //  1411: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1414: pop            
        //  1415: aload_1        
        //  1416: iload_3        
        //  1417: invokevirtual   java/lang/StringBuilder.append:(I)Ljava/lang/StringBuilder;
        //  1420: pop            
        //  1421: aload           14
        //  1423: aload_1        
        //  1424: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1427: invokestatic    com/google/android/gms/internal/play_billing/a.f:(Ljava/lang/String;Ljava/lang/String;)V
        //  1430: new             Lcom/android/billingclient/api/k$a;
        //  1433: astore_1       
        //  1434: aload_1        
        //  1435: invokespecial   com/android/billingclient/api/k$a.<init>:()V
        //  1438: aload_1        
        //  1439: iload_3        
        //  1440: putfield        com/android/billingclient/api/k$a.a:I
        //  1443: aload_1        
        //  1444: aload_2        
        //  1445: putfield        com/android/billingclient/api/k$a.b:Ljava/lang/String;
        //  1448: aload_1        
        //  1449: invokevirtual   com/android/billingclient/api/k$a.a:()Lcom/android/billingclient/api/k;
        //  1452: astore_1       
        //  1453: aload_0        
        //  1454: aload_1        
        //  1455: invokevirtual   com/android/billingclient/api/d.d:(Lcom/android/billingclient/api/k;)V
        //  1458: aload_1        
        //  1459: areturn        
        //  1460: new             Landroid/content/Intent;
        //  1463: astore_2       
        //  1464: aload_2        
        //  1465: aload_1        
        //  1466: ldc_w           Lcom/android/billingclient/api/ProxyBillingActivity;.class
        //  1469: invokespecial   android/content/Intent.<init>:(Landroid/content/Context;Ljava/lang/Class;)V
        //  1472: aload_2        
        //  1473: ldc_w           "BUY_INTENT"
        //  1476: aload           13
        //  1478: ldc_w           "BUY_INTENT"
        //  1481: invokevirtual   android/os/Bundle.getParcelable:(Ljava/lang/String;)Landroid/os/Parcelable;
        //  1484: checkcast       Landroid/app/PendingIntent;
        //  1487: invokevirtual   android/content/Intent.putExtra:(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;
        //  1490: pop            
        //  1491: aload_1        
        //  1492: aload_2        
        //  1493: invokevirtual   android/app/Activity.startActivity:(Landroid/content/Intent;)V
        //  1496: getstatic       com/android/billingclient/api/z.k:Lcom/android/billingclient/api/k;
        //  1499: areturn        
        //  1500: astore_1       
        //  1501: goto            1568
        //  1504: astore_1       
        //  1505: new             Ljava/lang/StringBuilder;
        //  1508: dup            
        //  1509: aload           15
        //  1511: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1514: invokevirtual   java/lang/String.length:()I
        //  1517: bipush          69
        //  1519: iadd           
        //  1520: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1523: astore_1       
        //  1524: aload_1        
        //  1525: ldc_w           "Exception while launching billing flow: ; for sku: "
        //  1528: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1531: pop            
        //  1532: aload_1        
        //  1533: aload           15
        //  1535: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1538: pop            
        //  1539: aload_1        
        //  1540: ldc_w           "; try to reconnect"
        //  1543: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1546: pop            
        //  1547: aload           14
        //  1549: aload_1        
        //  1550: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1553: invokestatic    com/google/android/gms/internal/play_billing/a.f:(Ljava/lang/String;Ljava/lang/String;)V
        //  1556: getstatic       com/android/billingclient/api/z.l:Lcom/android/billingclient/api/k;
        //  1559: astore_1       
        //  1560: aload_0        
        //  1561: aload_1        
        //  1562: invokevirtual   com/android/billingclient/api/d.d:(Lcom/android/billingclient/api/k;)V
        //  1565: aload_1        
        //  1566: areturn        
        //  1567: astore_1       
        //  1568: new             Ljava/lang/StringBuilder;
        //  1571: dup            
        //  1572: aload           15
        //  1574: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //  1577: invokevirtual   java/lang/String.length:()I
        //  1580: bipush          68
        //  1582: iadd           
        //  1583: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //  1586: astore_1       
        //  1587: aload_1        
        //  1588: ldc_w           "Time out while launching billing flow: ; for sku: "
        //  1591: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1594: pop            
        //  1595: aload_1        
        //  1596: aload           15
        //  1598: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1601: pop            
        //  1602: aload_1        
        //  1603: ldc_w           "; try to reconnect"
        //  1606: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1609: pop            
        //  1610: aload           14
        //  1612: aload_1        
        //  1613: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1616: invokestatic    com/google/android/gms/internal/play_billing/a.f:(Ljava/lang/String;Ljava/lang/String;)V
        //  1619: getstatic       com/android/billingclient/api/z.m:Lcom/android/billingclient/api/k;
        //  1622: astore_1       
        //  1623: aload_0        
        //  1624: aload_1        
        //  1625: invokevirtual   com/android/billingclient/api/d.d:(Lcom/android/billingclient/api/k;)V
        //  1628: aload_1        
        //  1629: areturn        
        //  1630: astore_1       
        //  1631: goto            1501
        //  1634: astore_1       
        //  1635: goto            1505
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                     
        //  -----  -----  -----  -----  ---------------------------------------------------------
        //  718    740    743    749    Lorg/json/JSONException;
        //  1208   1232   1235   1248   Landroid/content/pm/PackageManager$NameNotFoundException;
        //  1356   1361   1567   1568   Ljava/util/concurrent/TimeoutException;
        //  1356   1361   1567   1568   Ljava/util/concurrent/CancellationException;
        //  1356   1361   1504   1505   Ljava/lang/Exception;
        //  1361   1377   1500   1501   Ljava/util/concurrent/TimeoutException;
        //  1361   1377   1500   1501   Ljava/util/concurrent/CancellationException;
        //  1361   1377   1504   1505   Ljava/lang/Exception;
        //  1377   1393   1630   1634   Ljava/util/concurrent/TimeoutException;
        //  1377   1393   1630   1634   Ljava/util/concurrent/CancellationException;
        //  1377   1393   1634   1638   Ljava/lang/Exception;
        //  1397   1458   1630   1634   Ljava/util/concurrent/TimeoutException;
        //  1397   1458   1630   1634   Ljava/util/concurrent/CancellationException;
        //  1397   1458   1634   1638   Ljava/lang/Exception;
        //  1460   1496   1630   1634   Ljava/util/concurrent/TimeoutException;
        //  1460   1496   1630   1634   Ljava/util/concurrent/CancellationException;
        //  1460   1496   1634   1638   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1460:
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
    
    public final Handler c() {
        Handler c;
        if (Looper.myLooper() == null) {
            c = this.c;
        }
        else {
            c = new Handler(Looper.myLooper());
        }
        return c;
    }
    
    public final void d(final k k) {
        if (Thread.interrupted()) {
            return;
        }
        this.c.post((Runnable)new h0(0, (Object)this, (Object)k));
    }
    
    public final k e() {
        k k;
        if (this.a != 0 && this.a != 3) {
            k = z.j;
        }
        else {
            k = z.l;
        }
        return k;
    }
    
    public final <T> Future<T> f(final Callable<T> callable, long n, final Runnable runnable, final Handler handler) {
        n *= (long)0.95;
        if (this.q == null) {
            this.q = Executors.newFixedThreadPool(com.google.android.gms.internal.play_billing.a.a, (ThreadFactory)new v());
        }
        try {
            final Future<T> submit = this.q.submit(callable);
            handler.postDelayed((Runnable)new j0(0, (Object)submit, (Object)runnable), n);
            return submit;
        }
        catch (final Exception ex) {
            final String value = String.valueOf(ex);
            final StringBuilder sb = new StringBuilder(value.length() + 28);
            sb.append("Async task throws exception ");
            sb.append(value);
            com.google.android.gms.internal.play_billing.a.f("BillingClient", sb.toString());
            return null;
        }
    }
}
