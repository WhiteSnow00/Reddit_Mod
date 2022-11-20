// 
// Decompiled by Procyon v0.6.0
// 

package hd2;

import java.util.Iterator;
import qd2.h;
import oy0.b;
import java.util.Set;
import java.util.Collections;
import java.util.HashMap;
import rd2.a;
import com.tonyodev.fetch2core.Downloader;
import java.util.Map;
import qd2.e;

public final class c implements e
{
    public final Map<Downloader.a, a> f;
    public final Downloader.FileDownloaderType g;
    
    public c() {
        final Downloader.FileDownloaderType sequential = Downloader.FileDownloaderType.SEQUENTIAL;
        ng2.e.g((Object)sequential, "fileDownloaderType");
        this.g = sequential;
        final Map<Downloader.a, a> synchronizedMap = Collections.synchronizedMap(new HashMap<Downloader.a, a>());
        ng2.e.b((Object)synchronizedMap, "Collections.synchronized\u2026leResourceTransporter>())");
        this.f = synchronizedMap;
    }
    
    public final Set<Downloader.FileDownloaderType> C(final Downloader.b b) {
        Set set;
        try {
            set = b.y(b, (Downloader)this);
        }
        catch (final Exception ex) {
            set = zd.b.C0(this.g);
        }
        return set;
    }
    
    public final void G(final Downloader.b b) {
    }
    
    public final Downloader.a N(final Downloader.b p0, final h p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "interruptMonitor"
        //     3: invokestatic    ng2/e.g:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: new             Lrd2/a;
        //     9: dup            
        //    10: iconst_0       
        //    11: invokespecial   rd2/a.<init>:(I)V
        //    14: astore          15
        //    16: invokestatic    java/lang/System.nanoTime:()J
        //    19: pop2           
        //    20: aload_1        
        //    21: getfield        com/tonyodev/fetch2core/Downloader$b.b:Ljava/util/Map;
        //    24: astore          16
        //    26: aload           16
        //    28: ldc             "Range"
        //    30: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    35: checkcast       Ljava/lang/String;
        //    38: astore          12
        //    40: aload           12
        //    42: ifnull          48
        //    45: goto            52
        //    48: ldc             "bytes=0-"
        //    50: astore          12
        //    52: aload           12
        //    54: ldc             "="
        //    56: iconst_0       
        //    57: bipush          6
        //    59: invokestatic    kotlin/text/b.W0:(Ljava/lang/CharSequence;Ljava/lang/String;II)I
        //    62: istore_3       
        //    63: aload           12
        //    65: ldc             "-"
        //    67: iconst_0       
        //    68: bipush          6
        //    70: invokestatic    kotlin/text/b.W0:(Ljava/lang/CharSequence;Ljava/lang/String;II)I
        //    73: istore          4
        //    75: aload           12
        //    77: iload_3        
        //    78: iconst_1       
        //    79: iadd           
        //    80: iload           4
        //    82: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //    85: astore          13
        //    87: aload           13
        //    89: ldc             "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //    91: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //    94: aload           13
        //    96: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //    99: lstore          8
        //   101: aload           12
        //   103: iload           4
        //   105: iconst_1       
        //   106: iadd           
        //   107: aload           12
        //   109: invokevirtual   java/lang/String.length:()I
        //   112: invokevirtual   java/lang/String.substring:(II)Ljava/lang/String;
        //   115: astore          12
        //   117: aload           12
        //   119: ldc             "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"
        //   121: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   124: aload           12
        //   126: invokestatic    java/lang/Long.parseLong:(Ljava/lang/String;)J
        //   129: lstore          6
        //   131: goto            141
        //   134: astore          12
        //   136: ldc2_w          -1
        //   139: lstore          6
        //   141: new             Lkotlin/Pair;
        //   144: dup            
        //   145: lload           8
        //   147: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   150: lload           6
        //   152: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   155: invokespecial   kotlin/Pair.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //   158: astore          14
        //   160: aload           16
        //   162: ldc             "Authorization"
        //   164: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   169: checkcast       Ljava/lang/String;
        //   172: astore          12
        //   174: aload           12
        //   176: ifnull          182
        //   179: goto            186
        //   182: ldc             ""
        //   184: astore          12
        //   186: aload_1        
        //   187: getfield        com/tonyodev/fetch2core/Downloader$b.a:Ljava/lang/String;
        //   190: invokestatic    oy0/b.q:(Ljava/lang/String;)I
        //   193: istore_3       
        //   194: aload_1        
        //   195: getfield        com/tonyodev/fetch2core/Downloader$b.a:Ljava/lang/String;
        //   198: invokestatic    oy0/b.p:(Ljava/lang/String;)Ljava/lang/String;
        //   201: astore          13
        //   203: aload_1        
        //   204: getfield        com/tonyodev/fetch2core/Downloader$b.e:Lcom/tonyodev/fetch2core/Extras;
        //   207: invokevirtual   com/tonyodev/fetch2core/Extras.toMutableExtras:()Lcom/tonyodev/fetch2core/MutableExtras;
        //   210: astore          18
        //   212: aload_1        
        //   213: getfield        com/tonyodev/fetch2core/Downloader$b.b:Ljava/util/Map;
        //   216: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //   221: invokeinterface java/util/Set.iterator:()Ljava/util/Iterator;
        //   226: astore          17
        //   228: aload           17
        //   230: invokeinterface java/util/Iterator.hasNext:()Z
        //   235: ifeq            278
        //   238: aload           17
        //   240: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   245: checkcast       Ljava/util/Map$Entry;
        //   248: astore          19
        //   250: aload           18
        //   252: aload           19
        //   254: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   259: checkcast       Ljava/lang/String;
        //   262: aload           19
        //   264: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   269: checkcast       Ljava/lang/String;
        //   272: invokevirtual   com/tonyodev/fetch2core/MutableExtras.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   275: goto            228
        //   278: new             Lqd2/e$a;
        //   281: dup            
        //   282: invokespecial   qd2/e$a.<init>:()V
        //   285: astore          17
        //   287: aload           17
        //   289: new             Ljava/net/InetSocketAddress;
        //   292: dup            
        //   293: aload           13
        //   295: iload_3        
        //   296: invokespecial   java/net/InetSocketAddress.<init>:(Ljava/lang/String;I)V
        //   299: putfield        qd2/e$a.a:Ljava/net/InetSocketAddress;
        //   302: aload_1        
        //   303: getfield        com/tonyodev/fetch2core/Downloader$b.a:Ljava/lang/String;
        //   306: astore          13
        //   308: aload           13
        //   310: ldc             "url"
        //   312: invokestatic    ng2/e.g:(Ljava/lang/Object;Ljava/lang/String;)V
        //   315: aload           13
        //   317: invokestatic    android/net/Uri.parse:(Ljava/lang/String;)Landroid/net/Uri;
        //   320: astore          13
        //   322: aload           13
        //   324: ldc             "Uri.parse(url)"
        //   326: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   329: aload           13
        //   331: invokevirtual   android/net/Uri.getLastPathSegment:()Ljava/lang/String;
        //   334: astore          13
        //   336: aload           13
        //   338: ifnull          344
        //   341: goto            348
        //   344: ldc             "-1"
        //   346: astore          13
        //   348: aload           14
        //   350: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   353: checkcast       Ljava/lang/Number;
        //   356: invokevirtual   java/lang/Number.longValue:()J
        //   359: lstore          8
        //   361: aload           14
        //   363: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   366: checkcast       Ljava/lang/Number;
        //   369: invokevirtual   java/lang/Number.longValue:()J
        //   372: lstore          6
        //   374: aload           16
        //   376: ldc             "Client"
        //   378: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   383: checkcast       Ljava/lang/String;
        //   386: astore          14
        //   388: aload           14
        //   390: ifnull          396
        //   393: goto            411
        //   396: invokestatic    java/util/UUID.randomUUID:()Ljava/util/UUID;
        //   399: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   402: astore          14
        //   404: aload           14
        //   406: ldc             "UUID.randomUUID().toString()"
        //   408: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   411: aload           16
        //   413: ldc             "Page"
        //   415: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   420: checkcast       Ljava/lang/String;
        //   423: astore          19
        //   425: aload           19
        //   427: ifnull          451
        //   430: aload           19
        //   432: invokestatic    xi2/i.u0:(Ljava/lang/String;)Ljava/lang/Integer;
        //   435: astore          19
        //   437: aload           19
        //   439: ifnull          451
        //   442: aload           19
        //   444: invokevirtual   java/lang/Integer.intValue:()I
        //   447: istore_3       
        //   448: goto            453
        //   451: iconst_0       
        //   452: istore_3       
        //   453: aload           16
        //   455: ldc_w           "Size"
        //   458: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   463: checkcast       Ljava/lang/String;
        //   466: astore          16
        //   468: aload           16
        //   470: ifnull          495
        //   473: aload           16
        //   475: invokestatic    xi2/i.u0:(Ljava/lang/String;)Ljava/lang/Integer;
        //   478: astore          16
        //   480: aload           16
        //   482: ifnull          495
        //   485: aload           16
        //   487: invokevirtual   java/lang/Integer.intValue:()I
        //   490: istore          4
        //   492: goto            498
        //   495: iconst_0       
        //   496: istore          4
        //   498: aload           17
        //   500: new             Lcom/tonyodev/fetch2core/server/FileRequest;
        //   503: dup            
        //   504: iconst_1       
        //   505: aload           13
        //   507: lload           8
        //   509: lload           6
        //   511: aload           12
        //   513: aload           14
        //   515: aload           18
        //   517: iload_3        
        //   518: iload           4
        //   520: iconst_0       
        //   521: invokespecial   com/tonyodev/fetch2core/server/FileRequest.<init>:(ILjava/lang/String;JJLjava/lang/String;Ljava/lang/String;Lcom/tonyodev/fetch2core/Extras;IIZ)V
        //   524: putfield        qd2/e$a.b:Lcom/tonyodev/fetch2core/server/FileRequest;
        //   527: aload           17
        //   529: getfield        qd2/e$a.a:Ljava/net/InetSocketAddress;
        //   532: astore          13
        //   534: aload           13
        //   536: ldc_w           "socketAddress"
        //   539: invokestatic    ng2/e.g:(Ljava/lang/Object;Ljava/lang/String;)V
        //   542: aload           15
        //   544: getfield        rd2/a.c:Ljava/lang/Object;
        //   547: astore          12
        //   549: aload           12
        //   551: monitorenter   
        //   552: aload           15
        //   554: invokevirtual   rd2/a.b:()V
        //   557: aload           15
        //   559: getfield        rd2/a.e:Ljava/net/Socket;
        //   562: aload           13
        //   564: invokevirtual   java/net/Socket.connect:(Ljava/net/SocketAddress;)V
        //   567: new             Ljava/io/DataInputStream;
        //   570: astore          13
        //   572: aload           13
        //   574: aload           15
        //   576: getfield        rd2/a.e:Ljava/net/Socket;
        //   579: invokevirtual   java/net/Socket.getInputStream:()Ljava/io/InputStream;
        //   582: invokespecial   java/io/DataInputStream.<init>:(Ljava/io/InputStream;)V
        //   585: aload           15
        //   587: aload           13
        //   589: putfield        rd2/a.a:Ljava/io/DataInputStream;
        //   592: new             Ljava/io/DataOutputStream;
        //   595: astore          13
        //   597: aload           13
        //   599: aload           15
        //   601: getfield        rd2/a.e:Ljava/net/Socket;
        //   604: invokevirtual   java/net/Socket.getOutputStream:()Ljava/io/OutputStream;
        //   607: invokespecial   java/io/DataOutputStream.<init>:(Ljava/io/OutputStream;)V
        //   610: aload           15
        //   612: aload           13
        //   614: putfield        rd2/a.b:Ljava/io/DataOutputStream;
        //   617: getstatic       cg2/j.a:Lcg2/j;
        //   620: astore          13
        //   622: aload           12
        //   624: monitorexit    
        //   625: aload           17
        //   627: getfield        qd2/e$a.b:Lcom/tonyodev/fetch2core/server/FileRequest;
        //   630: astore          16
        //   632: aload           16
        //   634: ldc_w           "fileRequest"
        //   637: invokestatic    ng2/e.g:(Ljava/lang/Object;Ljava/lang/String;)V
        //   640: aload           15
        //   642: getfield        rd2/a.c:Ljava/lang/Object;
        //   645: astore          12
        //   647: aload           12
        //   649: monitorenter   
        //   650: aload           15
        //   652: invokevirtual   rd2/a.b:()V
        //   655: aload           15
        //   657: invokevirtual   rd2/a.c:()V
        //   660: aload           15
        //   662: getfield        rd2/a.b:Ljava/io/DataOutputStream;
        //   665: astore          14
        //   667: aconst_null    
        //   668: astore          13
        //   670: aload           14
        //   672: ifnull          1327
        //   675: aload           14
        //   677: aload           16
        //   679: invokevirtual   com/tonyodev/fetch2core/server/FileRequest.getToJsonString:()Ljava/lang/String;
        //   682: invokevirtual   java/io/DataOutputStream.writeUTF:(Ljava/lang/String;)V
        //   685: aload           15
        //   687: getfield        rd2/a.b:Ljava/io/DataOutputStream;
        //   690: astore          14
        //   692: aload           14
        //   694: ifnull          1315
        //   697: aload           14
        //   699: invokevirtual   java/io/DataOutputStream.flush:()V
        //   702: aload           12
        //   704: monitorexit    
        //   705: aload_2        
        //   706: invokeinterface qd2/h.L1:()Z
        //   711: ifne            1313
        //   714: aload           15
        //   716: getfield        rd2/a.c:Ljava/lang/Object;
        //   719: astore_2       
        //   720: aload_2        
        //   721: monitorenter   
        //   722: aload           15
        //   724: invokevirtual   rd2/a.b:()V
        //   727: aload           15
        //   729: invokevirtual   rd2/a.c:()V
        //   732: aload           15
        //   734: getfield        rd2/a.a:Ljava/io/DataInputStream;
        //   737: astore          12
        //   739: aload           12
        //   741: ifnull          1296
        //   744: aload           12
        //   746: invokevirtual   java/io/DataInputStream.readUTF:()Ljava/lang/String;
        //   749: astore          12
        //   751: aload           12
        //   753: ldc_w           "dataInput.readUTF()"
        //   756: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   759: aload           12
        //   761: invokevirtual   java/lang/String.toLowerCase:()Ljava/lang/String;
        //   764: astore          14
        //   766: aload           14
        //   768: ldc_w           "(this as java.lang.String).toLowerCase()"
        //   771: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   774: new             Lorg/json/JSONObject;
        //   777: astore          12
        //   779: aload           12
        //   781: aload           14
        //   783: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //   786: aload           12
        //   788: ldc_w           "status"
        //   791: invokevirtual   org/json/JSONObject.getInt:(Ljava/lang/String;)I
        //   794: istore          5
        //   796: aload           12
        //   798: ldc_w           "type"
        //   801: invokevirtual   org/json/JSONObject.getInt:(Ljava/lang/String;)I
        //   804: istore_3       
        //   805: aload           12
        //   807: ldc_w           "connection"
        //   810: invokevirtual   org/json/JSONObject.getInt:(Ljava/lang/String;)I
        //   813: istore          4
        //   815: aload           12
        //   817: ldc_w           "date"
        //   820: invokevirtual   org/json/JSONObject.getLong:(Ljava/lang/String;)J
        //   823: lstore          6
        //   825: aload           12
        //   827: ldc_w           "content-length"
        //   830: invokevirtual   org/json/JSONObject.getLong:(Ljava/lang/String;)J
        //   833: lstore          8
        //   835: aload           12
        //   837: ldc_w           "md5"
        //   840: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   843: astore          14
        //   845: aload           12
        //   847: ldc_w           "sessionid"
        //   850: invokevirtual   org/json/JSONObject.getString:(Ljava/lang/String;)Ljava/lang/String;
        //   853: astore          12
        //   855: aload           14
        //   857: ldc_w           "md5"
        //   860: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   863: aload           12
        //   865: ldc_w           "sessionId"
        //   868: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //   871: new             Lcom/tonyodev/fetch2core/server/FileResponse;
        //   874: dup            
        //   875: iload           5
        //   877: iload_3        
        //   878: iload           4
        //   880: lload           6
        //   882: lload           8
        //   884: aload           14
        //   886: aload           12
        //   888: invokespecial   com/tonyodev/fetch2core/server/FileResponse.<init>:(IIIJJLjava/lang/String;Ljava/lang/String;)V
        //   891: astore          12
        //   893: aload_2        
        //   894: monitorexit    
        //   895: aload           12
        //   897: invokevirtual   com/tonyodev/fetch2core/server/FileResponse.getStatus:()I
        //   900: istore_3       
        //   901: aload           12
        //   903: invokevirtual   com/tonyodev/fetch2core/server/FileResponse.getConnection:()I
        //   906: iconst_1       
        //   907: if_icmpne       936
        //   910: aload           12
        //   912: invokevirtual   com/tonyodev/fetch2core/server/FileResponse.getType:()I
        //   915: iconst_1       
        //   916: if_icmpne       936
        //   919: aload           12
        //   921: invokevirtual   com/tonyodev/fetch2core/server/FileResponse.getStatus:()I
        //   924: sipush          206
        //   927: if_icmpne       936
        //   930: iconst_1       
        //   931: istore          10
        //   933: goto            939
        //   936: iconst_0       
        //   937: istore          10
        //   939: aload           12
        //   941: invokevirtual   com/tonyodev/fetch2core/server/FileResponse.getContentLength:()J
        //   944: lstore          6
        //   946: aload           15
        //   948: getfield        rd2/a.c:Ljava/lang/Object;
        //   951: astore_2       
        //   952: aload_2        
        //   953: monitorenter   
        //   954: aload           15
        //   956: invokevirtual   rd2/a.b:()V
        //   959: aload           15
        //   961: invokevirtual   rd2/a.c:()V
        //   964: aload           15
        //   966: getfield        rd2/a.a:Ljava/io/DataInputStream;
        //   969: astore          14
        //   971: aload           14
        //   973: ifnull          1279
        //   976: aload_2        
        //   977: monitorexit    
        //   978: iload           10
        //   980: ifne            992
        //   983: aload           14
        //   985: invokestatic    oy0/b.h:(Ljava/io/InputStream;)Ljava/lang/String;
        //   988: astore_2       
        //   989: goto            994
        //   992: aconst_null    
        //   993: astore_2       
        //   994: new             Ljava/util/LinkedHashMap;
        //   997: dup            
        //   998: invokespecial   java/util/LinkedHashMap.<init>:()V
        //  1001: astore          16
        //  1003: new             Lorg/json/JSONObject;
        //  1006: astore          18
        //  1008: aload           18
        //  1010: aload           12
        //  1012: invokevirtual   com/tonyodev/fetch2core/server/FileResponse.getToJsonString:()Ljava/lang/String;
        //  1015: invokespecial   org/json/JSONObject.<init>:(Ljava/lang/String;)V
        //  1018: aload           18
        //  1020: invokevirtual   org/json/JSONObject.keys:()Ljava/util/Iterator;
        //  1023: astore          17
        //  1025: aload           17
        //  1027: ldc_w           "json.keys()"
        //  1030: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1033: aload           17
        //  1035: invokeinterface java/util/Iterator.hasNext:()Z
        //  1040: ifeq            1089
        //  1043: aload           17
        //  1045: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1050: checkcast       Ljava/lang/String;
        //  1053: astore          19
        //  1055: aload           19
        //  1057: ldc_w           "it"
        //  1060: invokestatic    ng2/e.b:(Ljava/lang/Object;Ljava/lang/String;)V
        //  1063: aload           16
        //  1065: aload           19
        //  1067: aload           18
        //  1069: aload           19
        //  1071: invokevirtual   org/json/JSONObject.get:(Ljava/lang/String;)Ljava/lang/Object;
        //  1074: invokevirtual   java/lang/Object.toString:()Ljava/lang/String;
        //  1077: invokestatic    cg/d.l3:(Ljava/lang/Object;)Ljava/util/List;
        //  1080: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1085: pop            
        //  1086: goto            1033
        //  1089: aload           16
        //  1091: ldc_w           "Content-MD5"
        //  1094: invokeinterface java/util/Map.containsKey:(Ljava/lang/Object;)Z
        //  1099: ifne            1121
        //  1102: aload           16
        //  1104: ldc_w           "Content-MD5"
        //  1107: aload           12
        //  1109: invokevirtual   com/tonyodev/fetch2core/server/FileResponse.getMd5:()Ljava/lang/String;
        //  1112: invokestatic    cg/d.l3:(Ljava/lang/Object;)Ljava/util/List;
        //  1115: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1120: pop            
        //  1121: aload           16
        //  1123: ldc_w           "Content-MD5"
        //  1126: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1129: checkcast       Ljava/util/List;
        //  1132: astore          12
        //  1134: aload           12
        //  1136: ifnull          1157
        //  1139: aload           12
        //  1141: invokestatic    kotlin/collections/CollectionsKt___CollectionsKt.U4:(Ljava/util/List;)Ljava/lang/Object;
        //  1144: checkcast       Ljava/lang/String;
        //  1147: astore          12
        //  1149: aload           12
        //  1151: ifnull          1157
        //  1154: goto            1161
        //  1157: ldc             ""
        //  1159: astore          12
        //  1161: iload_3        
        //  1162: sipush          206
        //  1165: if_icmpeq       1216
        //  1168: aload           16
        //  1170: ldc_w           "Accept-Ranges"
        //  1173: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //  1176: checkcast       Ljava/util/List;
        //  1179: astore          17
        //  1181: aload           17
        //  1183: ifnull          1196
        //  1186: aload           17
        //  1188: invokestatic    kotlin/collections/CollectionsKt___CollectionsKt.U4:(Ljava/util/List;)Ljava/lang/Object;
        //  1191: checkcast       Ljava/lang/String;
        //  1194: astore          13
        //  1196: aload           13
        //  1198: ldc_w           "bytes"
        //  1201: invokestatic    ng2/e.a:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //  1204: ifeq            1210
        //  1207: goto            1216
        //  1210: iconst_0       
        //  1211: istore          11
        //  1213: goto            1219
        //  1216: iconst_1       
        //  1217: istore          11
        //  1219: new             Lcom/tonyodev/fetch2core/Downloader$a;
        //  1222: dup            
        //  1223: iload_3        
        //  1224: iload           10
        //  1226: lload           6
        //  1228: aconst_null    
        //  1229: aload_1        
        //  1230: aload           12
        //  1232: aload           16
        //  1234: iload           11
        //  1236: aload_2        
        //  1237: invokespecial   com/tonyodev/fetch2core/Downloader$a.<init>:(IZJLjava/io/InputStream;Lcom/tonyodev/fetch2core/Downloader$b;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)V
        //  1240: pop            
        //  1241: new             Lcom/tonyodev/fetch2core/Downloader$a;
        //  1244: dup            
        //  1245: iload_3        
        //  1246: iload           10
        //  1248: lload           6
        //  1250: aload           14
        //  1252: aload_1        
        //  1253: aload           12
        //  1255: aload           16
        //  1257: iload           11
        //  1259: aload_2        
        //  1260: invokespecial   com/tonyodev/fetch2core/Downloader$a.<init>:(IZJLjava/io/InputStream;Lcom/tonyodev/fetch2core/Downloader$b;Ljava/lang/String;Ljava/util/Map;ZLjava/lang/String;)V
        //  1263: astore_1       
        //  1264: aload_0        
        //  1265: getfield        hd2/c.f:Ljava/util/Map;
        //  1268: aload_1        
        //  1269: aload           15
        //  1271: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //  1276: pop            
        //  1277: aload_1        
        //  1278: areturn        
        //  1279: ldc_w           "dataInput"
        //  1282: invokestatic    ng2/e.n:(Ljava/lang/String;)V
        //  1285: aconst_null    
        //  1286: athrow         
        //  1287: astore_1       
        //  1288: goto            1292
        //  1291: astore_1       
        //  1292: aload_2        
        //  1293: monitorexit    
        //  1294: aload_1        
        //  1295: athrow         
        //  1296: ldc_w           "dataInput"
        //  1299: invokestatic    ng2/e.n:(Ljava/lang/String;)V
        //  1302: aconst_null    
        //  1303: athrow         
        //  1304: astore_1       
        //  1305: goto            1309
        //  1308: astore_1       
        //  1309: aload_2        
        //  1310: monitorexit    
        //  1311: aload_1        
        //  1312: athrow         
        //  1313: aconst_null    
        //  1314: areturn        
        //  1315: ldc_w           "dataOutput"
        //  1318: invokestatic    ng2/e.n:(Ljava/lang/String;)V
        //  1321: aconst_null    
        //  1322: athrow         
        //  1323: astore_1       
        //  1324: goto            1336
        //  1327: ldc_w           "dataOutput"
        //  1330: invokestatic    ng2/e.n:(Ljava/lang/String;)V
        //  1333: aconst_null    
        //  1334: athrow         
        //  1335: astore_1       
        //  1336: aload           12
        //  1338: monitorexit    
        //  1339: aload_1        
        //  1340: athrow         
        //  1341: astore_1       
        //  1342: aload           12
        //  1344: monitorexit    
        //  1345: aload_1        
        //  1346: athrow         
        //  1347: astore          17
        //  1349: goto            1089
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  101    131    134    141    Ljava/lang/Exception;
        //  552    622    1341   1347   Any
        //  650    667    1335   1336   Any
        //  675    692    1335   1336   Any
        //  697    702    1335   1336   Any
        //  722    739    1308   1309   Any
        //  744    893    1308   1309   Any
        //  954    971    1291   1292   Any
        //  1003   1033   1347   1352   Ljava/lang/Exception;
        //  1033   1086   1347   1352   Ljava/lang/Exception;
        //  1279   1287   1287   1291   Any
        //  1296   1304   1304   1308   Any
        //  1315   1323   1323   1327   Any
        //  1327   1335   1323   1327   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_1033:
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
    
    public final Downloader.FileDownloaderType Q(final Downloader.b b, final Set<? extends Downloader.FileDownloaderType> set) {
        ng2.e.g((Object)set, "supportedFileDownloaderTypes");
        return this.g;
    }
    
    public final boolean c(final Downloader.b b, final String s) {
        ng2.e.g((Object)b, "request");
        ng2.e.g((Object)s, "hash");
        final int length = s.length();
        boolean contentEquals = true;
        if (length == 0) {
            return true;
        }
        final String s2 = b.s(b.c);
        if (s2 != null) {
            contentEquals = s2.contentEquals(s);
        }
        return contentEquals;
    }
    
    public final void close() {
        try {
            final Iterator<Object> iterator = this.f.entrySet().iterator();
            while (iterator.hasNext()) {
                iterator.next().getValue().a();
            }
            this.f.clear();
        }
        catch (final Exception ex) {}
    }
    
    public final void e(final Downloader.a a) {
        if (this.f.containsKey(a)) {
            final a a2 = this.f.get(a);
            this.f.remove(a);
            if (a2 != null) {
                a2.a();
            }
        }
    }
    
    public final void f(final Downloader.b b) {
    }
    
    public final void u(final Downloader.b b) {
    }
}
