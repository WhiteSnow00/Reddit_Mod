// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.vault.feature.registration.masterkey;

import x82.r0;
import kotlin.Metadata;
import hg2.j;
import lg2.c;
import ej2.b0;
import rg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lej2/b0;", "Lhg2/j;", "<anonymous>" }, k = 3, mv = { 1, 7, 1 })
@mg2.c(c = "com.reddit.vault.feature.registration.masterkey.MasterKeyPresenter$backupWithMasterKey$1", f = "MasterKeyPresenter.kt", l = { 200, 206, 214, 221, 226 }, m = "invokeSuspend")
final class MasterKeyPresenter$backupWithMasterKey$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ boolean $changingPassword;
    public final /* synthetic */ r0 $state;
    public int I$0;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ MasterKeyPresenter this$0;
    
    public MasterKeyPresenter$backupWithMasterKey$1(final MasterKeyPresenter this$0, final r0 $state, final boolean $changingPassword, final c<? super MasterKeyPresenter$backupWithMasterKey$1> c) {
        this.this$0 = this$0;
        this.$state = $state;
        this.$changingPassword = $changingPassword;
        super(2, (c<Object>)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final MasterKeyPresenter$backupWithMasterKey$1 masterKeyPresenter$backupWithMasterKey$1 = new MasterKeyPresenter$backupWithMasterKey$1(this.this$0, this.$state, this.$changingPassword, (c<? super MasterKeyPresenter$backupWithMasterKey$1>)c);
        masterKeyPresenter$backupWithMasterKey$1.L$0 = l$0;
        return (c<j>)masterKeyPresenter$backupWithMasterKey$1;
    }
    
    @Override
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((MasterKeyPresenter$backupWithMasterKey$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(final Object p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: aload_0        
        //     5: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.label:I
        //     8: istore_3       
        //     9: iconst_0       
        //    10: istore          4
        //    12: iload_3        
        //    13: ifeq            221
        //    16: iload_3        
        //    17: iconst_1       
        //    18: if_icmpeq       202
        //    21: iload_3        
        //    22: iconst_2       
        //    23: if_icmpeq       162
        //    26: iload_3        
        //    27: iconst_3       
        //    28: if_icmpeq       122
        //    31: iload_3        
        //    32: iconst_4       
        //    33: if_icmpeq       77
        //    36: iload_3        
        //    37: iconst_5       
        //    38: if_icmpne       67
        //    41: aload_0        
        //    42: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //    45: checkcast       Lp92/m;
        //    48: astore          5
        //    50: aload_1        
        //    51: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //    54: aload_1        
        //    55: astore          6
        //    57: aload           5
        //    59: astore_1       
        //    60: aload           6
        //    62: astore          5
        //    64: goto            935
        //    67: new             Ljava/lang/IllegalStateException;
        //    70: dup            
        //    71: ldc             "call to 'resume' before 'invoke' with coroutine"
        //    73: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //    76: athrow         
        //    77: aload_0        
        //    78: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.I$0:I
        //    81: istore_3       
        //    82: aload_0        
        //    83: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$2:Ljava/lang/Object;
        //    86: checkcast       Lcom/reddit/vault/model/vault/Web3Keyfile;
        //    89: astore          5
        //    91: aload_0        
        //    92: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$1:Ljava/lang/Object;
        //    95: checkcast       Lx82/a;
        //    98: astore          6
        //   100: aload_0        
        //   101: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   104: checkcast       Lp92/m;
        //   107: astore          7
        //   109: aload_1        
        //   110: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   113: aload_1        
        //   114: astore          8
        //   116: aload           7
        //   118: astore_1       
        //   119: goto            740
        //   122: aload_0        
        //   123: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$2:Ljava/lang/Object;
        //   126: checkcast       Lx82/m;
        //   129: astore          6
        //   131: aload_0        
        //   132: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$1:Ljava/lang/Object;
        //   135: checkcast       Lx82/a;
        //   138: astore          5
        //   140: aload_0        
        //   141: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   144: checkcast       Lp92/m;
        //   147: astore          7
        //   149: aload_1        
        //   150: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   153: aload_1        
        //   154: astore          8
        //   156: aload           7
        //   158: astore_1       
        //   159: goto            570
        //   162: aload_0        
        //   163: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$2:Ljava/lang/Object;
        //   166: checkcast       Lx82/a;
        //   169: astore          5
        //   171: aload_0        
        //   172: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$1:Ljava/lang/Object;
        //   175: checkcast       Lp92/m;
        //   178: astore          8
        //   180: aload_0        
        //   181: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   184: checkcast       Lej2/b0;
        //   187: astore          6
        //   189: aload_1        
        //   190: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   193: aload_1        
        //   194: astore          6
        //   196: aload           8
        //   198: astore_1       
        //   199: goto            433
        //   202: aload_0        
        //   203: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   206: checkcast       Lej2/b0;
        //   209: astore          5
        //   211: aload_1        
        //   212: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   215: aload_1        
        //   216: astore          6
        //   218: goto            305
        //   221: aload_1        
        //   222: invokestatic    yd/b.k0:(Ljava/lang/Object;)V
        //   225: aload_0        
        //   226: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   229: checkcast       Lej2/b0;
        //   232: astore          5
        //   234: aload_0        
        //   235: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   238: astore_1       
        //   239: aload_0        
        //   240: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.$state:Lx82/r0;
        //   243: astore          6
        //   245: aload_0        
        //   246: aload           5
        //   248: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   251: aload_0        
        //   252: iconst_1       
        //   253: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.label:I
        //   256: aload_1        
        //   257: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   260: pop            
        //   261: aload           6
        //   263: instanceof      Lx82/b0;
        //   266: ifeq            289
        //   269: new             Lp92/m;
        //   272: dup            
        //   273: aload           6
        //   275: checkcast       Lx82/b0;
        //   278: getfield        x82/b0.f:Lx82/a;
        //   281: iconst_0       
        //   282: invokespecial   p92/m.<init>:(Lx82/a;Z)V
        //   285: astore_1       
        //   286: goto            295
        //   289: aload_1        
        //   290: aload_0        
        //   291: invokevirtual   com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.Ac:(Llg2/c;)Ljava/lang/Object;
        //   294: astore_1       
        //   295: aload_1        
        //   296: astore          6
        //   298: aload_1        
        //   299: aload_2        
        //   300: if_acmpne       305
        //   303: aload_2        
        //   304: areturn        
        //   305: aload           6
        //   307: checkcast       Lp92/m;
        //   310: astore_1       
        //   311: aload_1        
        //   312: getfield        p92/m.a:Lx82/a;
        //   315: astore          6
        //   317: aload           6
        //   319: ifnonnull       376
        //   322: aload_0        
        //   323: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   326: astore_1       
        //   327: aload_1        
        //   328: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.k:Lp92/e;
        //   331: getstatic       com/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus.Invisible:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;
        //   334: invokeinterface p92/e.tn:(Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;)V
        //   339: aload_1        
        //   340: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.v:Lab2/g;
        //   343: astore          5
        //   345: getstatic       e92/c.j:Le92/c$b;
        //   348: astore_1       
        //   349: aload           5
        //   351: new             Lcom/reddit/vault/data/exception/BackupFailedException;
        //   354: dup            
        //   355: invokespecial   com/reddit/vault/data/exception/BackupFailedException.<init>:()V
        //   358: aconst_null    
        //   359: bipush          6
        //   361: invokestatic    e92/c$a.b:(Ljava/lang/Exception;Lcom/reddit/vault/data/analytics/Noun;I)Le92/c;
        //   364: aconst_null    
        //   365: aconst_null    
        //   366: aconst_null    
        //   367: bipush          14
        //   369: invokestatic    ab2/g$a.a:(Lab2/g;Le92/c;Lcom/reddit/vault/feature/errors/ErrorScreen$a;Lcom/reddit/vault/navigation/NavStyle;Lab2/a$a;I)V
        //   372: getstatic       hg2/j.a:Lhg2/j;
        //   375: areturn        
        //   376: aload_0        
        //   377: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   380: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.n:Ly82/d;
        //   383: astore          8
        //   385: aload_0        
        //   386: aload           5
        //   388: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   391: aload_0        
        //   392: aload_1        
        //   393: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$1:Ljava/lang/Object;
        //   396: aload_0        
        //   397: aload           6
        //   399: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$2:Ljava/lang/Object;
        //   402: aload_0        
        //   403: iconst_2       
        //   404: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.label:I
        //   407: aload           8
        //   409: aload_0        
        //   410: invokeinterface y82/d.b:(Llg2/c;)Ljava/lang/Object;
        //   415: astore          8
        //   417: aload           8
        //   419: aload_2        
        //   420: if_acmpne       425
        //   423: aload_2        
        //   424: areturn        
        //   425: aload           6
        //   427: astore          5
        //   429: aload           8
        //   431: astore          6
        //   433: aload           6
        //   435: checkcast       Lx82/m;
        //   438: astore          6
        //   440: aload           6
        //   442: ifnonnull       481
        //   445: aload_0        
        //   446: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   449: astore_1       
        //   450: aload_1        
        //   451: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.k:Lp92/e;
        //   454: getstatic       com/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus.Invisible:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;
        //   457: invokeinterface p92/e.tn:(Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;)V
        //   462: aload_1        
        //   463: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.v:Lab2/g;
        //   466: getstatic       e92/c.j:Le92/c$b;
        //   469: aconst_null    
        //   470: aconst_null    
        //   471: aconst_null    
        //   472: bipush          14
        //   474: invokestatic    ab2/g$a.a:(Lab2/g;Le92/c;Lcom/reddit/vault/feature/errors/ErrorScreen$a;Lcom/reddit/vault/navigation/NavStyle;Lab2/a$a;I)V
        //   477: getstatic       hg2/j.a:Lhg2/j;
        //   480: areturn        
        //   481: aload_0        
        //   482: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   485: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.k:Lp92/e;
        //   488: getstatic       com/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus.Protecting:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;
        //   491: invokeinterface p92/e.tn:(Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;)V
        //   496: aload_0        
        //   497: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   500: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.y:La20/a;
        //   503: invokeinterface a20/a.c:()Lmj2/a;
        //   508: astore          7
        //   510: new             Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1$keyfile$1;
        //   513: dup            
        //   514: aload           6
        //   516: aload_0        
        //   517: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   520: aconst_null    
        //   521: invokespecial   com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1$keyfile$1.<init>:(Lx82/m;Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;Llg2/c;)V
        //   524: astore          8
        //   526: aload_0        
        //   527: aload_1        
        //   528: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   531: aload_0        
        //   532: aload           5
        //   534: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$1:Ljava/lang/Object;
        //   537: aload_0        
        //   538: aload           6
        //   540: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$2:Ljava/lang/Object;
        //   543: aload_0        
        //   544: iconst_3       
        //   545: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.label:I
        //   548: aload           7
        //   550: aload           8
        //   552: aload_0        
        //   553: invokestatic    ej2/g.l:(Lkotlin/coroutines/CoroutineContext;Lrg2/p;Llg2/c;)Ljava/lang/Object;
        //   556: astore          7
        //   558: aload           7
        //   560: astore          8
        //   562: aload           7
        //   564: aload_2        
        //   565: if_acmpne       570
        //   568: aload_2        
        //   569: areturn        
        //   570: aload           8
        //   572: checkcast       Lcom/reddit/vault/model/vault/Web3Keyfile;
        //   575: astore          8
        //   577: invokestatic    java/lang/System.currentTimeMillis:()J
        //   580: sipush          1000
        //   583: i2l            
        //   584: ldiv           
        //   585: l2i            
        //   586: istore_3       
        //   587: aload_0        
        //   588: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   591: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.s:Lcom/squareup/moshi/y;
        //   594: ldc             Lcom/reddit/vault/model/vault/Web3Keyfile;.class
        //   596: invokevirtual   com/squareup/moshi/y.a:(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;
        //   599: aload           8
        //   601: invokevirtual   com/squareup/moshi/JsonAdapter.toJson:(Ljava/lang/Object;)Ljava/lang/String;
        //   604: astore          7
        //   606: aload           7
        //   608: ldc             "moshi.adapter(Web3Keyfil\u2026ass.java).toJson(keyfile)"
        //   610: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   613: aload           7
        //   615: getstatic       cj2/a.b:Ljava/nio/charset/Charset;
        //   618: invokevirtual   java/lang/String.getBytes:(Ljava/nio/charset/Charset;)[B
        //   621: astore          9
        //   623: aload           9
        //   625: ldc_w           "this as java.lang.String).getBytes(charset)"
        //   628: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   631: bipush          8
        //   633: newarray        B
        //   635: astore          10
        //   637: aload           10
        //   639: invokestatic    java/nio/ByteBuffer.wrap:([B)Ljava/nio/ByteBuffer;
        //   642: getstatic       java/nio/ByteOrder.LITTLE_ENDIAN:Ljava/nio/ByteOrder;
        //   645: invokevirtual   java/nio/ByteBuffer.order:(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
        //   648: iload_3        
        //   649: invokevirtual   java/nio/ByteBuffer.putInt:(I)Ljava/nio/ByteBuffer;
        //   652: pop            
        //   653: aload_0        
        //   654: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   657: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.y:La20/a;
        //   660: invokeinterface a20/a.c:()Lmj2/a;
        //   665: astore          7
        //   667: new             Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1$signature$1;
        //   670: dup            
        //   671: aload           9
        //   673: aload           10
        //   675: aload           6
        //   677: aconst_null    
        //   678: invokespecial   com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1$signature$1.<init>:([B[BLx82/m;Llg2/c;)V
        //   681: astore          6
        //   683: aload_0        
        //   684: aload_1        
        //   685: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   688: aload_0        
        //   689: aload           5
        //   691: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$1:Ljava/lang/Object;
        //   694: aload_0        
        //   695: aload           8
        //   697: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$2:Ljava/lang/Object;
        //   700: aload_0        
        //   701: iload_3        
        //   702: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.I$0:I
        //   705: aload_0        
        //   706: iconst_4       
        //   707: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.label:I
        //   710: aload           7
        //   712: aload           6
        //   714: aload_0        
        //   715: invokestatic    ej2/g.l:(Lkotlin/coroutines/CoroutineContext;Lrg2/p;Llg2/c;)Ljava/lang/Object;
        //   718: astore          7
        //   720: aload           7
        //   722: aload_2        
        //   723: if_acmpne       728
        //   726: aload_2        
        //   727: areturn        
        //   728: aload           5
        //   730: astore          6
        //   732: aload           8
        //   734: astore          5
        //   736: aload           7
        //   738: astore          8
        //   740: aload           8
        //   742: checkcast       Lx82/f0;
        //   745: astore          10
        //   747: aload_0        
        //   748: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   751: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.l:Lcom/reddit/vault/data/remote/RemoteVaultDataSource;
        //   754: astore          8
        //   756: aload           6
        //   758: invokevirtual   x82/a.c:()Ljava/lang/String;
        //   761: astore          7
        //   763: getstatic       java/util/Locale.ROOT:Ljava/util/Locale;
        //   766: astore          6
        //   768: aload           6
        //   770: ldc_w           "ROOT"
        //   773: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   776: aload           7
        //   778: aload           6
        //   780: invokevirtual   java/lang/String.toLowerCase:(Ljava/util/Locale;)Ljava/lang/String;
        //   783: astore          6
        //   785: aload           6
        //   787: ldc_w           "this as java.lang.String).toLowerCase(locale)"
        //   790: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   793: new             Lcom/reddit/vault/model/SecureBackupBody;
        //   796: astore          7
        //   798: aload           10
        //   800: getfield        x82/f0.a:Ljava/math/BigInteger;
        //   803: invokevirtual   java/math/BigInteger.toByteArray:()[B
        //   806: astore          9
        //   808: aload           9
        //   810: ldc_w           "r.toByteArray()"
        //   813: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   816: aload           10
        //   818: getfield        x82/f0.b:Ljava/math/BigInteger;
        //   821: invokevirtual   java/math/BigInteger.toByteArray:()[B
        //   824: astore          11
        //   826: aload           11
        //   828: ldc_w           "s.toByteArray()"
        //   831: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   834: aload           9
        //   836: aload           11
        //   838: invokestatic    ig2/j.P0:([B[B)[B
        //   841: astore          9
        //   843: aload           10
        //   845: getfield        x82/f0.c:Ljava/math/BigInteger;
        //   848: invokevirtual   java/math/BigInteger.toByteArray:()[B
        //   851: astore          10
        //   853: aload           10
        //   855: ldc_w           "v.toByteArray()"
        //   858: invokestatic    sg2/e.e:(Ljava/lang/Object;Ljava/lang/String;)V
        //   861: aload           9
        //   863: aload           10
        //   865: invokestatic    ig2/j.P0:([B[B)[B
        //   868: astore          9
        //   870: new             Ljava/math/BigInteger;
        //   873: astore          10
        //   875: aload           10
        //   877: iconst_1       
        //   878: aload           9
        //   880: invokespecial   java/math/BigInteger.<init>:(I[B)V
        //   883: aload           7
        //   885: aload           5
        //   887: iload_3        
        //   888: aload           10
        //   890: invokespecial   com/reddit/vault/model/SecureBackupBody.<init>:(Lcom/reddit/vault/model/vault/Web3Keyfile;ILjava/math/BigInteger;)V
        //   893: aload_0        
        //   894: aload_1        
        //   895: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$0:Ljava/lang/Object;
        //   898: aload_0        
        //   899: aconst_null    
        //   900: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$1:Ljava/lang/Object;
        //   903: aload_0        
        //   904: aconst_null    
        //   905: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.L$2:Ljava/lang/Object;
        //   908: aload_0        
        //   909: iconst_5       
        //   910: putfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.label:I
        //   913: aload           8
        //   915: aload           6
        //   917: aload           7
        //   919: aload_0        
        //   920: invokeinterface com/reddit/vault/data/remote/RemoteVaultDataSource.secureBackupVault:(Ljava/lang/String;Lcom/reddit/vault/model/SecureBackupBody;Llg2/c;)Ljava/lang/Object;
        //   925: astore          5
        //   927: aload           5
        //   929: aload_2        
        //   930: if_acmpne       935
        //   933: aload_2        
        //   934: areturn        
        //   935: aload           5
        //   937: checkcast       Lnu2/w;
        //   940: invokevirtual   nu2/w.c:()Z
        //   943: istore          4
        //   945: goto            953
        //   948: astore          5
        //   950: iconst_0       
        //   951: istore          4
        //   953: iload           4
        //   955: ifeq            1100
        //   958: aload_0        
        //   959: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   962: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.q:Li82/a;
        //   965: getstatic       com/reddit/vault/data/analytics/Noun.VAULT_BACKUP_REDDIT:Lcom/reddit/vault/data/analytics/Noun;
        //   968: getstatic       com/reddit/vault/data/analytics/Action.COMPLETE:Lcom/reddit/vault/data/analytics/Action;
        //   971: aconst_null    
        //   972: aconst_null    
        //   973: aconst_null    
        //   974: aconst_null    
        //   975: aconst_null    
        //   976: aconst_null    
        //   977: sipush          252
        //   980: invokestatic    i82/a.a:(Li82/a;Lcom/reddit/vault/data/analytics/Noun;Lcom/reddit/vault/data/analytics/Action;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;I)V
        //   983: aload_0        
        //   984: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //   987: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.m:Ly82/a;
        //   990: getstatic       com/reddit/vault/domain/repository/RedditBackupState.BACKED_UP:Lcom/reddit/vault/domain/repository/RedditBackupState;
        //   993: invokeinterface y82/a.p:(Lcom/reddit/vault/domain/repository/RedditBackupState;)V
        //   998: aload_0        
        //   999: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.$changingPassword:Z
        //  1002: ifeq            1057
        //  1005: aload_0        
        //  1006: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //  1009: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.z:Lm92/a;
        //  1012: aload_0        
        //  1013: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.$state:Lx82/r0;
        //  1016: invokevirtual   x82/r0.c:()Lx82/p0;
        //  1019: invokevirtual   m92/a.a:(Lx82/p0;)V
        //  1022: aload_0        
        //  1023: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //  1026: astore_1       
        //  1027: aload_1        
        //  1028: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.t:Lz92/a;
        //  1031: getstatic       com/reddit/vault/feature/toast/ToastState.SUCCESS:Lcom/reddit/vault/feature/toast/ToastState;
        //  1034: aload_1        
        //  1035: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.u:Lfb2/m;
        //  1038: ldc_w           2131955153
        //  1041: invokeinterface fb2/m.c:(I)Ljava/lang/String;
        //  1046: aconst_null    
        //  1047: aconst_null    
        //  1048: aconst_null    
        //  1049: invokeinterface z92/a.a:(Lcom/reddit/vault/feature/toast/ToastState;Ljava/lang/String;Lx82/h;Ljava/math/BigInteger;Lrg2/a;)V
        //  1054: goto            1151
        //  1057: aload_1        
        //  1058: getfield        p92/m.b:Z
        //  1061: ifeq            1082
        //  1064: aload_0        
        //  1065: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //  1068: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.k:Lp92/e;
        //  1071: getstatic       com/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus.CreatedAndSecured:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;
        //  1074: invokeinterface p92/e.tn:(Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;)V
        //  1079: goto            1151
        //  1082: aload_0        
        //  1083: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //  1086: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.k:Lp92/e;
        //  1089: getstatic       com/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus.Protected:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;
        //  1092: invokeinterface p92/e.tn:(Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;)V
        //  1097: goto            1151
        //  1100: aload_0        
        //  1101: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //  1104: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.k:Lp92/e;
        //  1107: getstatic       com/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus.Invisible:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;
        //  1110: invokeinterface p92/e.tn:(Lcom/reddit/vault/feature/registration/masterkey/MasterKeyContract$VaultStatus;)V
        //  1115: aload_0        
        //  1116: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter$backupWithMasterKey$1.this$0:Lcom/reddit/vault/feature/registration/masterkey/MasterKeyPresenter;
        //  1119: getfield        com/reddit/vault/feature/registration/masterkey/MasterKeyPresenter.v:Lab2/g;
        //  1122: astore          5
        //  1124: getstatic       e92/c.j:Le92/c$b;
        //  1127: astore_1       
        //  1128: aload           5
        //  1130: new             Lcom/reddit/vault/data/exception/BackupFailedException;
        //  1133: dup            
        //  1134: invokespecial   com/reddit/vault/data/exception/BackupFailedException.<init>:()V
        //  1137: aconst_null    
        //  1138: bipush          6
        //  1140: invokestatic    e92/c$a.b:(Ljava/lang/Exception;Lcom/reddit/vault/data/analytics/Noun;I)Le92/c;
        //  1143: aconst_null    
        //  1144: aconst_null    
        //  1145: aconst_null    
        //  1146: bipush          14
        //  1148: invokestatic    ab2/g$a.a:(Lab2/g;Le92/c;Lcom/reddit/vault/feature/errors/ErrorScreen$a;Lcom/reddit/vault/navigation/NavStyle;Lab2/a$a;I)V
        //  1151: getstatic       hg2/j.a:Lhg2/j;
        //  1154: areturn        
        //  1155: astore_1       
        //  1156: aload           5
        //  1158: astore_1       
        //  1159: goto            953
        //  1162: astore          5
        //  1164: goto            950
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  50     54     1155   1162   Ljava/lang/Exception;
        //  756    927    948    950    Ljava/lang/Exception;
        //  935    945    1162   1167   Ljava/lang/Exception;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0935:
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
