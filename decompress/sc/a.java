// 
// Decompiled by Procyon v0.6.0
// 

package sc;

import android.util.Log;
import android.text.TextUtils;
import nc.f;
import java.util.regex.Matcher;
import java.util.Collection;
import java.util.ArrayList;
import bd.s;
import bd.d0;
import bd.c0;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import nc.e;

public final class a extends e
{
    public static final Pattern r;
    public final boolean m;
    public final b n;
    public LinkedHashMap o;
    public float p;
    public float q;
    
    static {
        r = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    }
    
    public a(final List<byte[]> list) {
        this.p = -3.4028235E38f;
        this.q = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.m = true;
            final String o = c0.o(list.get(0));
            d0.c(o.startsWith("Format:"));
            final b a = b.a(o);
            a.getClass();
            this.n = a;
            this.i(new s(list.get(1)));
        }
        else {
            this.m = false;
            this.n = null;
        }
    }
    
    public static int h(final long n, final ArrayList list, final ArrayList list2) {
        int size = list.size();
        while (true) {
            int n2;
            do {
                n2 = size - 1;
                if (n2 < 0) {
                    final int n3 = 0;
                    list.add(n3, n);
                    ArrayList list3;
                    if (n3 == 0) {
                        list3 = new ArrayList();
                    }
                    else {
                        list3 = new ArrayList(list2.get(n3 - 1));
                    }
                    list2.add(n3, list3);
                    return n3;
                }
                if ((long)list.get(n2) == n) {
                    return n2;
                }
                size = n2;
            } while ((long)list.get(n2) >= n);
            final int n3 = n2 + 1;
            continue;
        }
    }
    
    public static long j(final String s) {
        final Matcher matcher = a.r.matcher(s.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        final String group = matcher.group(1);
        final int a = c0.a;
        return Long.parseLong(matcher.group(4)) * 10000L + (Long.parseLong(matcher.group(3)) * 1000000L + (Long.parseLong(matcher.group(2)) * 60L * 1000000L + Long.parseLong(group) * 60L * 60L * 1000000L));
    }
    
    @Override
    public final f g(final byte[] p0, final int p1, final boolean p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore          4
        //     3: new             Ljava/util/ArrayList;
        //     6: dup            
        //     7: invokespecial   java/util/ArrayList.<init>:()V
        //    10: astore          5
        //    12: new             Ljava/util/ArrayList;
        //    15: dup            
        //    16: invokespecial   java/util/ArrayList.<init>:()V
        //    19: astore          6
        //    21: new             Lbd/s;
        //    24: dup            
        //    25: aload_1        
        //    26: iload_2        
        //    27: invokespecial   bd/s.<init>:([BI)V
        //    30: astore          7
        //    32: aload           4
        //    34: getfield        sc/a.m:Z
        //    37: ifne            47
        //    40: aload           4
        //    42: aload           7
        //    44: invokevirtual   sc/a.i:(Lbd/s;)V
        //    47: aload           4
        //    49: getfield        sc/a.m:Z
        //    52: ifeq            64
        //    55: aload           4
        //    57: getfield        sc/a.n:Lsc/b;
        //    60: astore_1       
        //    61: goto            66
        //    64: aconst_null    
        //    65: astore_1       
        //    66: aload_0        
        //    67: astore          8
        //    69: aload           7
        //    71: invokevirtual   bd/s.d:()Ljava/lang/String;
        //    74: astore          9
        //    76: aload           9
        //    78: ifnull          1442
        //    81: aload           9
        //    83: ldc             "Format:"
        //    85: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    88: ifeq            100
        //    91: aload           9
        //    93: invokestatic    sc/b.a:(Ljava/lang/String;)Lsc/b;
        //    96: astore_1       
        //    97: goto            66
        //   100: aload           9
        //   102: ldc             "Dialogue:"
        //   104: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   107: ifeq            1439
        //   110: aload_1        
        //   111: ifnonnull       156
        //   114: aload           9
        //   116: invokevirtual   java/lang/String.length:()I
        //   119: ifeq            134
        //   122: ldc             "Skipping dialogue line before complete format: "
        //   124: aload           9
        //   126: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   129: astore          4
        //   131: goto            145
        //   134: new             Ljava/lang/String;
        //   137: dup            
        //   138: ldc             "Skipping dialogue line before complete format: "
        //   140: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   143: astore          4
        //   145: ldc             "SsaDecoder"
        //   147: aload           4
        //   149: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   152: pop            
        //   153: goto            1439
        //   156: aload           9
        //   158: ldc             "Dialogue:"
        //   160: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   163: invokestatic    bd/d0.c:(Z)V
        //   166: aload           9
        //   168: bipush          9
        //   170: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   173: ldc             ","
        //   175: aload_1        
        //   176: getfield        sc/b.e:I
        //   179: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   182: astore          4
        //   184: aload           4
        //   186: arraylength    
        //   187: aload_1        
        //   188: getfield        sc/b.e:I
        //   191: if_icmpeq       236
        //   194: aload           9
        //   196: invokevirtual   java/lang/String.length:()I
        //   199: ifeq            214
        //   202: ldc             "Skipping dialogue line with fewer columns than format: "
        //   204: aload           9
        //   206: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   209: astore          4
        //   211: goto            225
        //   214: new             Ljava/lang/String;
        //   217: dup            
        //   218: ldc             "Skipping dialogue line with fewer columns than format: "
        //   220: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   223: astore          4
        //   225: ldc             "SsaDecoder"
        //   227: aload           4
        //   229: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   232: pop            
        //   233: goto            1439
        //   236: aload           4
        //   238: aload_1        
        //   239: getfield        sc/b.a:I
        //   242: aaload         
        //   243: invokestatic    sc/a.j:(Ljava/lang/String;)J
        //   246: lstore          10
        //   248: lload           10
        //   250: ldc2_w          -9223372036854775807
        //   253: lcmp           
        //   254: ifne            299
        //   257: aload           9
        //   259: invokevirtual   java/lang/String.length:()I
        //   262: ifeq            277
        //   265: ldc             "Skipping invalid timing: "
        //   267: aload           9
        //   269: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   272: astore          4
        //   274: goto            288
        //   277: new             Ljava/lang/String;
        //   280: dup            
        //   281: ldc             "Skipping invalid timing: "
        //   283: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   286: astore          4
        //   288: ldc             "SsaDecoder"
        //   290: aload           4
        //   292: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   295: pop            
        //   296: goto            1439
        //   299: aload           4
        //   301: aload_1        
        //   302: getfield        sc/b.b:I
        //   305: aaload         
        //   306: invokestatic    sc/a.j:(Ljava/lang/String;)J
        //   309: lstore          12
        //   311: lload           12
        //   313: ldc2_w          -9223372036854775807
        //   316: lcmp           
        //   317: ifne            362
        //   320: aload           9
        //   322: invokevirtual   java/lang/String.length:()I
        //   325: ifeq            340
        //   328: ldc             "Skipping invalid timing: "
        //   330: aload           9
        //   332: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   335: astore          4
        //   337: goto            351
        //   340: new             Ljava/lang/String;
        //   343: dup            
        //   344: ldc             "Skipping invalid timing: "
        //   346: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   349: astore          4
        //   351: ldc             "SsaDecoder"
        //   353: aload           4
        //   355: invokestatic    android/util/Log.w:(Ljava/lang/String;Ljava/lang/String;)I
        //   358: pop            
        //   359: goto            1439
        //   362: aload           8
        //   364: getfield        sc/a.o:Ljava/util/LinkedHashMap;
        //   367: astore          9
        //   369: iconst_m1      
        //   370: istore          14
        //   372: aload           9
        //   374: ifnull          407
        //   377: aload_1        
        //   378: getfield        sc/b.c:I
        //   381: istore_2       
        //   382: iload_2        
        //   383: iconst_m1      
        //   384: if_icmpeq       407
        //   387: aload           9
        //   389: aload           4
        //   391: iload_2        
        //   392: aaload         
        //   393: invokevirtual   java/lang/String.trim:()Ljava/lang/String;
        //   396: invokevirtual   java/util/LinkedHashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   399: checkcast       Lsc/c;
        //   402: astore          9
        //   404: goto            410
        //   407: aconst_null    
        //   408: astore          9
        //   410: aload           4
        //   412: aload_1        
        //   413: getfield        sc/b.d:I
        //   416: aaload         
        //   417: astore          15
        //   419: getstatic       sc/c$b.a:Ljava/util/regex/Pattern;
        //   422: aload           15
        //   424: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   427: astore          16
        //   429: aconst_null    
        //   430: astore          17
        //   432: aload           16
        //   434: invokevirtual   java/util/regex/Matcher.find:()Z
        //   437: istore_3       
        //   438: aload           7
        //   440: astore          4
        //   442: iload_3        
        //   443: ifeq            534
        //   446: aload           16
        //   448: iconst_1       
        //   449: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   452: astore          18
        //   454: aload           18
        //   456: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   459: pop            
        //   460: aload           18
        //   462: invokestatic    sc/c$b.a:(Ljava/lang/String;)Landroid/graphics/PointF;
        //   465: astore          7
        //   467: aload           7
        //   469: ifnull          476
        //   472: aload           7
        //   474: astore          17
        //   476: getstatic       sc/c$b.d:Ljava/util/regex/Pattern;
        //   479: aload           18
        //   481: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   484: astore          7
        //   486: aload           7
        //   488: invokevirtual   java/util/regex/Matcher.find:()Z
        //   491: ifeq            517
        //   494: aload           7
        //   496: iconst_1       
        //   497: invokevirtual   java/util/regex/Matcher.group:(I)Ljava/lang/String;
        //   500: astore          7
        //   502: aload           7
        //   504: invokevirtual   java/lang/Object.getClass:()Ljava/lang/Class;
        //   507: pop            
        //   508: aload           7
        //   510: invokestatic    sc/c.a:(Ljava/lang/String;)I
        //   513: istore_2       
        //   514: goto            519
        //   517: iconst_m1      
        //   518: istore_2       
        //   519: iload_2        
        //   520: iconst_m1      
        //   521: if_icmpeq       527
        //   524: iload_2        
        //   525: istore          14
        //   527: aload           4
        //   529: astore          7
        //   531: goto            432
        //   534: new             Lsc/c$b;
        //   537: astore          7
        //   539: getstatic       sc/c$b.a:Ljava/util/regex/Pattern;
        //   542: aload           15
        //   544: invokevirtual   java/util/regex/Pattern.matcher:(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
        //   547: ldc             ""
        //   549: invokevirtual   java/util/regex/Matcher.replaceAll:(Ljava/lang/String;)Ljava/lang/String;
        //   552: ldc             "\\N"
        //   554: ldc             "\n"
        //   556: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   559: ldc             "\\n"
        //   561: ldc             "\n"
        //   563: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   566: ldc_w           "\\h"
        //   569: ldc_w           " "
        //   572: invokevirtual   java/lang/String.replace:(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
        //   575: astore          7
        //   577: aload           8
        //   579: getfield        sc/a.p:F
        //   582: fstore          19
        //   584: aload           8
        //   586: getfield        sc/a.q:F
        //   589: fstore          20
        //   591: new             Landroid/text/SpannableString;
        //   594: dup            
        //   595: aload           7
        //   597: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   600: astore          7
        //   602: new             Lnc/a$a;
        //   605: dup            
        //   606: invokespecial   nc/a$a.<init>:()V
        //   609: astore          8
        //   611: aload           8
        //   613: aload           7
        //   615: putfield        nc/a$a.a:Ljava/lang/CharSequence;
        //   618: aload           9
        //   620: ifnull          859
        //   623: aload           9
        //   625: getfield        sc/c.c:Ljava/lang/Integer;
        //   628: ifnull          662
        //   631: aload           7
        //   633: new             Landroid/text/style/ForegroundColorSpan;
        //   636: dup            
        //   637: aload           9
        //   639: getfield        sc/c.c:Ljava/lang/Integer;
        //   642: invokevirtual   java/lang/Integer.intValue:()I
        //   645: invokespecial   android/text/style/ForegroundColorSpan.<init>:(I)V
        //   648: iconst_0       
        //   649: aload           7
        //   651: invokevirtual   android/text/SpannableString.length:()I
        //   654: bipush          33
        //   656: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   659: goto            662
        //   662: aload           9
        //   664: getfield        sc/c.d:F
        //   667: fstore          21
        //   669: fload           21
        //   671: ldc             -3.4028235E38
        //   673: fcmpl          
        //   674: ifeq            701
        //   677: fload           20
        //   679: ldc             -3.4028235E38
        //   681: fcmpl          
        //   682: ifeq            701
        //   685: aload           8
        //   687: fload           21
        //   689: fload           20
        //   691: fdiv           
        //   692: putfield        nc/a$a.k:F
        //   695: aload           8
        //   697: iconst_1       
        //   698: putfield        nc/a$a.j:I
        //   701: aload           9
        //   703: getfield        sc/c.e:Z
        //   706: istore_3       
        //   707: iload_3        
        //   708: ifeq            743
        //   711: aload           9
        //   713: getfield        sc/c.f:Z
        //   716: ifeq            743
        //   719: aload           7
        //   721: new             Landroid/text/style/StyleSpan;
        //   724: dup            
        //   725: iconst_3       
        //   726: invokespecial   android/text/style/StyleSpan.<init>:(I)V
        //   729: iconst_0       
        //   730: aload           7
        //   732: invokevirtual   android/text/SpannableString.length:()I
        //   735: bipush          33
        //   737: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   740: goto            800
        //   743: iload_3        
        //   744: ifeq            771
        //   747: aload           7
        //   749: new             Landroid/text/style/StyleSpan;
        //   752: dup            
        //   753: iconst_1       
        //   754: invokespecial   android/text/style/StyleSpan.<init>:(I)V
        //   757: iconst_0       
        //   758: aload           7
        //   760: invokevirtual   android/text/SpannableString.length:()I
        //   763: bipush          33
        //   765: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   768: goto            800
        //   771: aload           9
        //   773: getfield        sc/c.f:Z
        //   776: ifeq            800
        //   779: aload           7
        //   781: new             Landroid/text/style/StyleSpan;
        //   784: dup            
        //   785: iconst_2       
        //   786: invokespecial   android/text/style/StyleSpan.<init>:(I)V
        //   789: iconst_0       
        //   790: aload           7
        //   792: invokevirtual   android/text/SpannableString.length:()I
        //   795: bipush          33
        //   797: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   800: aload           9
        //   802: getfield        sc/c.g:Z
        //   805: ifeq            828
        //   808: aload           7
        //   810: new             Landroid/text/style/UnderlineSpan;
        //   813: dup            
        //   814: invokespecial   android/text/style/UnderlineSpan.<init>:()V
        //   817: iconst_0       
        //   818: aload           7
        //   820: invokevirtual   android/text/SpannableString.length:()I
        //   823: bipush          33
        //   825: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   828: aload           9
        //   830: getfield        sc/c.h:Z
        //   833: ifeq            859
        //   836: aload           7
        //   838: new             Landroid/text/style/StrikethroughSpan;
        //   841: dup            
        //   842: invokespecial   android/text/style/StrikethroughSpan.<init>:()V
        //   845: iconst_0       
        //   846: aload           7
        //   848: invokevirtual   android/text/SpannableString.length:()I
        //   851: bipush          33
        //   853: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   856: goto            859
        //   859: iload           14
        //   861: iconst_m1      
        //   862: if_icmpeq       868
        //   865: goto            886
        //   868: aload           9
        //   870: ifnull          883
        //   873: aload           9
        //   875: getfield        sc/c.b:I
        //   878: istore          14
        //   880: goto            886
        //   883: iconst_m1      
        //   884: istore          14
        //   886: iload           14
        //   888: tableswitch {
        //               -2: 987
        //               -1: 948
        //                0: 967
        //                1: 959
        //                2: 951
        //                3: 967
        //                4: 959
        //                5: 951
        //                6: 967
        //                7: 959
        //                8: 951
        //          default: 948
        //        }
        //   948: goto            975
        //   951: getstatic       android/text/Layout$Alignment.ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;
        //   954: astore          7
        //   956: goto            990
        //   959: getstatic       android/text/Layout$Alignment.ALIGN_CENTER:Landroid/text/Layout$Alignment;
        //   962: astore          7
        //   964: goto            990
        //   967: getstatic       android/text/Layout$Alignment.ALIGN_NORMAL:Landroid/text/Layout$Alignment;
        //   970: astore          7
        //   972: goto            990
        //   975: bipush          30
        //   977: ldc_w           "Unknown alignment: "
        //   980: iload           14
        //   982: ldc             "SsaDecoder"
        //   984: invokestatic    ag0/a.u:(ILjava/lang/String;ILjava/lang/String;)V
        //   987: aconst_null    
        //   988: astore          7
        //   990: aload           8
        //   992: aload           7
        //   994: putfield        nc/a$a.c:Landroid/text/Layout$Alignment;
        //   997: ldc_w           -2147483648
        //  1000: istore          22
        //  1002: iload           14
        //  1004: tableswitch {
        //               -2: 1094
        //               -1: 1064
        //                0: 1077
        //                1: 1072
        //                2: 1067
        //                3: 1077
        //                4: 1072
        //                5: 1067
        //                6: 1077
        //                7: 1072
        //                8: 1067
        //          default: 1064
        //        }
        //  1064: goto            1082
        //  1067: iconst_2       
        //  1068: istore_2       
        //  1069: goto            1098
        //  1072: iconst_1       
        //  1073: istore_2       
        //  1074: goto            1098
        //  1077: iconst_0       
        //  1078: istore_2       
        //  1079: goto            1098
        //  1082: bipush          30
        //  1084: ldc_w           "Unknown alignment: "
        //  1087: iload           14
        //  1089: ldc             "SsaDecoder"
        //  1091: invokestatic    ag0/a.u:(ILjava/lang/String;ILjava/lang/String;)V
        //  1094: ldc_w           -2147483648
        //  1097: istore_2       
        //  1098: aload           8
        //  1100: iload_2        
        //  1101: putfield        nc/a$a.i:I
        //  1104: iload           22
        //  1106: istore_2       
        //  1107: iload           14
        //  1109: tableswitch {
        //               -2: 1201
        //               -1: 1168
        //                0: 1181
        //                1: 1181
        //                2: 1181
        //                3: 1176
        //                4: 1176
        //                5: 1176
        //                6: 1171
        //                7: 1171
        //                8: 1171
        //          default: 1168
        //        }
        //  1168: goto            1186
        //  1171: iconst_0       
        //  1172: istore_2       
        //  1173: goto            1201
        //  1176: iconst_1       
        //  1177: istore_2       
        //  1178: goto            1201
        //  1181: iconst_2       
        //  1182: istore_2       
        //  1183: goto            1201
        //  1186: bipush          30
        //  1188: ldc_w           "Unknown alignment: "
        //  1191: iload           14
        //  1193: ldc             "SsaDecoder"
        //  1195: invokestatic    ag0/a.u:(ILjava/lang/String;ILjava/lang/String;)V
        //  1198: iload           22
        //  1200: istore_2       
        //  1201: aload           8
        //  1203: iload_2        
        //  1204: putfield        nc/a$a.g:I
        //  1207: aload           17
        //  1209: ifnull          1263
        //  1212: fload           20
        //  1214: ldc             -3.4028235E38
        //  1216: fcmpl          
        //  1217: ifeq            1263
        //  1220: fload           19
        //  1222: ldc             -3.4028235E38
        //  1224: fcmpl          
        //  1225: ifeq            1263
        //  1228: aload           8
        //  1230: aload           17
        //  1232: getfield        android/graphics/PointF.x:F
        //  1235: fload           19
        //  1237: fdiv           
        //  1238: putfield        nc/a$a.h:F
        //  1241: aload           8
        //  1243: aload           17
        //  1245: getfield        android/graphics/PointF.y:F
        //  1248: fload           20
        //  1250: fdiv           
        //  1251: putfield        nc/a$a.e:F
        //  1254: aload           8
        //  1256: iconst_0       
        //  1257: putfield        nc/a$a.f:I
        //  1260: goto            1378
        //  1263: aload           8
        //  1265: getfield        nc/a$a.i:I
        //  1268: istore          14
        //  1270: ldc_w           0.95
        //  1273: fstore          21
        //  1275: iload           14
        //  1277: ifeq            1315
        //  1280: iload           14
        //  1282: iconst_1       
        //  1283: if_icmpeq       1307
        //  1286: iload           14
        //  1288: iconst_2       
        //  1289: if_icmpeq       1299
        //  1292: ldc             -3.4028235E38
        //  1294: fstore          19
        //  1296: goto            1320
        //  1299: ldc_w           0.95
        //  1302: fstore          19
        //  1304: goto            1320
        //  1307: ldc_w           0.5
        //  1310: fstore          19
        //  1312: goto            1320
        //  1315: ldc_w           0.05
        //  1318: fstore          19
        //  1320: aload           8
        //  1322: fload           19
        //  1324: putfield        nc/a$a.h:F
        //  1327: iload_2        
        //  1328: ifeq            1360
        //  1331: iload_2        
        //  1332: iconst_1       
        //  1333: if_icmpeq       1352
        //  1336: fload           21
        //  1338: fstore          19
        //  1340: iload_2        
        //  1341: iconst_2       
        //  1342: if_icmpeq       1365
        //  1345: ldc             -3.4028235E38
        //  1347: fstore          19
        //  1349: goto            1365
        //  1352: ldc_w           0.5
        //  1355: fstore          19
        //  1357: goto            1365
        //  1360: ldc_w           0.05
        //  1363: fstore          19
        //  1365: aload           8
        //  1367: fload           19
        //  1369: putfield        nc/a$a.e:F
        //  1372: aload           8
        //  1374: iconst_0       
        //  1375: putfield        nc/a$a.f:I
        //  1378: aload           8
        //  1380: invokevirtual   nc/a$a.a:()Lnc/a;
        //  1383: astore          9
        //  1385: lload           10
        //  1387: aload           6
        //  1389: aload           5
        //  1391: invokestatic    sc/a.h:(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
        //  1394: istore_2       
        //  1395: lload           12
        //  1397: aload           6
        //  1399: aload           5
        //  1401: invokestatic    sc/a.h:(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
        //  1404: istore          14
        //  1406: aload           4
        //  1408: astore          7
        //  1410: iload_2        
        //  1411: iload           14
        //  1413: if_icmpge       1439
        //  1416: aload           5
        //  1418: iload_2        
        //  1419: invokevirtual   java/util/ArrayList.get:(I)Ljava/lang/Object;
        //  1422: checkcast       Ljava/util/List;
        //  1425: aload           9
        //  1427: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1432: pop            
        //  1433: iinc            2, 1
        //  1436: goto            1406
        //  1439: goto            66
        //  1442: new             Lsc/d;
        //  1445: dup            
        //  1446: aload           5
        //  1448: aload           6
        //  1450: invokespecial   sc/d.<init>:(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
        //  1453: areturn        
        //  1454: astore          7
        //  1456: goto            476
        //  1459: astore          7
        //  1461: goto            527
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                        
        //  -----  -----  -----  -----  ----------------------------
        //  460    467    1454   1459   Ljava/lang/RuntimeException;
        //  476    514    1459   1464   Ljava/lang/RuntimeException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0476:
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
    
    public final void i(final s s) {
    Label_0030_Outer:
        while (true) {
            final String d = s.d();
            if (d == null) {
                return;
            }
            final boolean equalsIgnoreCase = "[Script Info]".equalsIgnoreCase(d);
            int n = 2;
            int n2 = 0;
            int n3 = 1;
            Label_0166: {
                if (!equalsIgnoreCase) {
                    break Label_0166;
                }
                String d2;
                int c;
                int b;
                String[] split;
                String o;
                String o2;
                String d3;
                int n4;
                int n5;
                LinkedHashMap o3;
                c c2;
                int n6;
                String[] split2;
                String[] split3;
                int length;
                Object o4;
                int i;
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                Object[] array;
                String concat;
                int c3;
                int b2;
                String trim;
                int b3;
                int a;
                int c4;
                Integer c5;
                int d4;
                String trim2;
                float float1;
                StringBuilder sb;
                int e;
                boolean b4;
                int f;
                boolean b5;
                int g;
                boolean b6;
                int h;
                int n15;
                int n16;
                int n17;
                Label_0238_Outer:Label_1276_Outer:Label_0777_Outer:
                while (true) {
                    Label_0150: {
                        while (true) {
                            d2 = s.d();
                            if (d2 == null) {
                                continue Label_0030_Outer;
                            }
                            c = s.c;
                            b = s.b;
                            if (c - b != 0 && (s.a[b] & 0xFF) == 0x5B) {
                                continue Label_0030_Outer;
                            }
                            split = d2.split(":");
                            if (split.length != 2) {
                                continue Label_0030_Outer;
                            }
                            o = mk2.e.O(split[0].trim());
                            o.getClass();
                            if (o.equals("playresx")) {
                                break Label_0150;
                            }
                            if (!o.equals("playresy")) {
                                continue Label_0030_Outer;
                            }
                            break;
                        }
                        try {
                            this.q = Float.parseFloat(split[1].trim());
                            continue Label_1276_Outer;
                            Label_0552: {
                                iftrue(Label_0565:)(o2.equals("italic"));
                            }
                            while (true) {
                            Label_0777:
                                while (true) {
                                    Label_1276:Label_0309_Outer:Label_0572_Outer:
                                    while (true) {
                                        Label_0572:Label_0680_Outer:
                                        while (true) {
                                        Label_0680:
                                            while (true) {
                                                Label_0309:Block_21_Outer:
                                                while (true) {
                                                    Block_10: {
                                                        Block_16: {
                                                            while (true) {
                                                                while (true) {
                                                                    Block_13: {
                                                                    Label_0575:
                                                                        while (true) {
                                                                            Block_11: {
                                                                            Label_1253:
                                                                                while (true) {
                                                                                Label_1256:
                                                                                    while (true) {
                                                                                    Label_0191:
                                                                                        while (true) {
                                                                                            Label_0185: {
                                                                                                Block_19: {
                                                                                                    break Block_19;
                                                                                                    while (true) {
                                                                                                        iftrue(Label_0729:)(!d3.startsWith("Format:"));
                                                                                                        break Block_10;
                                                                                                        n4 = 2;
                                                                                                        n2 = 0;
                                                                                                        n3 = 1;
                                                                                                        break Label_0191;
                                                                                                        Label_0525:
                                                                                                        n5 = n4;
                                                                                                        break Label_0575;
                                                                                                        Block_8: {
                                                                                                        Block_14_Outer:
                                                                                                            while (true) {
                                                                                                                Block_18: {
                                                                                                                    Block_23: {
                                                                                                                        while (true) {
                                                                                                                            while (true) {
                                                                                                                                Block_24: {
                                                                                                                                    while (true) {
                                                                                                                                        while (true) {
                                                                                                                                            o3.put(c2.a, c2);
                                                                                                                                            continue Label_1276;
                                                                                                                                            d3 = s.d();
                                                                                                                                            iftrue(Label_1288:)(d3 == null);
                                                                                                                                            break Block_8;
                                                                                                                                            iftrue(Label_0686:)(n6 >= split2.length);
                                                                                                                                            break Block_11;
                                                                                                                                            break Label_0572;
                                                                                                                                            Label_0565:
                                                                                                                                            n5 = n2;
                                                                                                                                            break Label_0575;
                                                                                                                                            Label_0788:
                                                                                                                                            d0.c(d3.startsWith("Style:"));
                                                                                                                                            split3 = TextUtils.split(d3.substring(6), ",");
                                                                                                                                            length = split3.length;
                                                                                                                                            i = ((c.a)o4).i;
                                                                                                                                            iftrue(Label_0883:)(length == i);
                                                                                                                                            break Block_24;
                                                                                                                                            o3 = new LinkedHashMap();
                                                                                                                                            break Label_0185;
                                                                                                                                            Label_0648:
                                                                                                                                            n7 = n6;
                                                                                                                                            break Label_0680;
                                                                                                                                            Label_0669:
                                                                                                                                            n8 = n6;
                                                                                                                                            break Label_0680;
                                                                                                                                            iftrue(Label_1276:)(c2 == null);
                                                                                                                                            continue Label_0309_Outer;
                                                                                                                                        }
                                                                                                                                        Label_0662:
                                                                                                                                        n9 = n6;
                                                                                                                                        break Label_0680;
                                                                                                                                        iftrue(Label_1297:)(!"[V4+ Styles]".equalsIgnoreCase(d));
                                                                                                                                        continue Label_0680_Outer;
                                                                                                                                    }
                                                                                                                                    o4 = new c.a(n10, n11, n12, n13, n7, n14, n8, n9, split2.length);
                                                                                                                                    continue Label_0191;
                                                                                                                                    break Label_0572;
                                                                                                                                    Label_0627:
                                                                                                                                    n11 = n6;
                                                                                                                                    ++n6;
                                                                                                                                    continue Label_0309;
                                                                                                                                    iftrue(Label_0788:)(o4 != null);
                                                                                                                                    Block_22: {
                                                                                                                                        break Block_22;
                                                                                                                                        this.p = Float.parseFloat(split[1].trim());
                                                                                                                                        continue Label_0238_Outer;
                                                                                                                                        n5 = -1;
                                                                                                                                        break Label_0575;
                                                                                                                                    }
                                                                                                                                    iftrue(Label_0765:)(d3.length() == 0);
                                                                                                                                    break Block_23;
                                                                                                                                    Label_0493:
                                                                                                                                    iftrue(Label_0506:)(o2.equals("primarycolour"));
                                                                                                                                    break Block_16;
                                                                                                                                    Label_0624:
                                                                                                                                    continue Label_0680;
                                                                                                                                    Label_0634:
                                                                                                                                    n13 = n6;
                                                                                                                                    continue Label_0680;
                                                                                                                                    Label_1288:
                                                                                                                                    this.o = o3;
                                                                                                                                    continue Label_0030_Outer;
                                                                                                                                }
                                                                                                                                array = new Object[3];
                                                                                                                                array[n2] = i;
                                                                                                                                array[n3] = split3.length;
                                                                                                                                array[n4] = d3;
                                                                                                                                Log.w("SsaStyle", c0.n("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", array));
                                                                                                                                break Label_1253;
                                                                                                                                Label_0474:
                                                                                                                                iftrue(Label_0487:)(o2.equals("bold"));
                                                                                                                                continue Label_0572_Outer;
                                                                                                                            }
                                                                                                                            Label_0532:
                                                                                                                            iftrue(Label_0545:)(o2.equals("underline"));
                                                                                                                            break Block_18;
                                                                                                                            Label_0448:
                                                                                                                            n5 = 6;
                                                                                                                            switch([Lcom.strobel.decompiler.ast.Label;@19faaf1)(n5);
                                                                                                                            Label_0455:
                                                                                                                            iftrue(Label_0468:)(o2.equals("name"));
                                                                                                                            continue Block_21_Outer;
                                                                                                                        }
                                                                                                                        Label_0641:
                                                                                                                        n10 = n6;
                                                                                                                        continue Label_0680;
                                                                                                                        Label_0412:
                                                                                                                        continue Label_0572;
                                                                                                                    }
                                                                                                                    concat = "Skipping 'Style:' line before 'Format:' line: ".concat(d3);
                                                                                                                    break Label_0777;
                                                                                                                }
                                                                                                                continue Label_0572;
                                                                                                                c2 = null;
                                                                                                                continue Label_1256;
                                                                                                                Label_0686:
                                                                                                                iftrue(Label_0722:)(n10 == -1);
                                                                                                                continue Block_14_Outer;
                                                                                                            }
                                                                                                            Label_0545:
                                                                                                            n5 = n3;
                                                                                                            continue Label_0575;
                                                                                                        }
                                                                                                        c3 = s.c;
                                                                                                        b2 = s.b;
                                                                                                        iftrue(Label_1288:)(c3 - b2 != 0 && (s.a[b2] & 0xFF) == 0x5B);
                                                                                                        continue Label_1276_Outer;
                                                                                                    }
                                                                                                    Label_0428:
                                                                                                    n5 = 7;
                                                                                                    continue Label_0575;
                                                                                                }
                                                                                                continue Label_0572;
                                                                                                Label_0722:
                                                                                                n = n4;
                                                                                            }
                                                                                            o4 = null;
                                                                                            n4 = n;
                                                                                            continue Label_0191;
                                                                                        }
                                                                                        Label_0676:
                                                                                        n14 = n6;
                                                                                        continue Label_0680;
                                                                                        try {
                                                                                            Label_0883:
                                                                                            trim = split3[((c.a)o4).a].trim();
                                                                                            b3 = ((c.a)o4).b;
                                                                                            if (b3 != -1) {
                                                                                                a = sc.c.a(split3[b3].trim());
                                                                                            }
                                                                                            else {
                                                                                                a = -1;
                                                                                            }
                                                                                            c4 = ((c.a)o4).c;
                                                                                            if (c4 != -1) {
                                                                                                c5 = sc.c.c(split3[c4].trim());
                                                                                            }
                                                                                            else {
                                                                                                c5 = null;
                                                                                            }
                                                                                            d4 = ((c.a)o4).d;
                                                                                            Label_1059: {
                                                                                                if (d4 != -1) {
                                                                                                    trim2 = split3[d4].trim();
                                                                                                    try {
                                                                                                        float1 = Float.parseFloat(trim2);
                                                                                                        break Label_1059;
                                                                                                    }
                                                                                                    catch (final NumberFormatException ex) {
                                                                                                        sb = new StringBuilder(String.valueOf(trim2).length() + 29);
                                                                                                        sb.append("Failed to parse font size: '");
                                                                                                        sb.append(trim2);
                                                                                                        sb.append("'");
                                                                                                        wi.b.n0("SsaStyle", sb.toString(), (Throwable)ex);
                                                                                                    }
                                                                                                }
                                                                                                float1 = -3.4028235E38f;
                                                                                            }
                                                                                            e = ((c.a)o4).e;
                                                                                            b4 = (e != -1 && sc.c.b(split3[e].trim()));
                                                                                            f = ((c.a)o4).f;
                                                                                            b5 = (f != -1 && sc.c.b(split3[f].trim()));
                                                                                            g = ((c.a)o4).g;
                                                                                            b6 = (g != -1 && sc.c.b(split3[g].trim()));
                                                                                            h = ((c.a)o4).h;
                                                                                            c2 = new c(trim, a, c5, float1, b4, b5, b6, h != -1 && sc.c.b(split3[h].trim()));
                                                                                            continue Label_1256;
                                                                                        }
                                                                                        catch (final RuntimeException ex2) {
                                                                                            wi.b.n0("SsaStyle", ag0.a.l(d3.length() + 36, "Skipping malformed 'Style:' line: '", d3, "'"), (Throwable)ex2);
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                    continue Label_1253;
                                                                                }
                                                                                continue Label_0572;
                                                                            }
                                                                            o2 = mk2.e.O(split2[n6].trim());
                                                                            o2.getClass();
                                                                            switch([Lcom.strobel.decompiler.ast.Label;@e8ab1e)(o2.hashCode());
                                                                            Label_0435:
                                                                            iftrue(Label_0448:)(o2.equals("fontsize"));
                                                                            break Block_13;
                                                                            Log.i("SsaDecoder", "[V4 Styles] are not supported");
                                                                            continue Label_0030_Outer;
                                                                            Label_1319:
                                                                            iftrue(Label_0000:)(!"[Events]".equalsIgnoreCase(d));
                                                                            return;
                                                                            Label_0487:
                                                                            n5 = 4;
                                                                            continue Label_0575;
                                                                            Label_0506:
                                                                            n5 = 3;
                                                                            continue Label_0575;
                                                                            Label_0468:
                                                                            n5 = 5;
                                                                            continue Label_0575;
                                                                        }
                                                                    }
                                                                    continue Label_0572;
                                                                    Label_0729:
                                                                    iftrue(Label_1276:)(!d3.startsWith("Style:"));
                                                                    continue Label_0777_Outer;
                                                                }
                                                                Label_1297:
                                                                iftrue(Label_1319:)(!"[V4 Styles]".equalsIgnoreCase(d));
                                                                continue;
                                                            }
                                                        }
                                                        continue Label_0572;
                                                    }
                                                    split2 = TextUtils.split(d3.substring(7), ",");
                                                    n15 = n2;
                                                    n10 = (n16 = -1);
                                                    n17 = (n13 = n16);
                                                    n7 = (n14 = n13);
                                                    n8 = (n9 = n14);
                                                    n12 = n17;
                                                    n11 = n16;
                                                    n6 = n15;
                                                    continue Label_0309;
                                                }
                                                Label_0655:
                                                n12 = n6;
                                                continue Label_0680;
                                            }
                                            Label_0415:
                                            iftrue(Label_0428:)(o2.equals("alignment"));
                                            continue Label_0572;
                                        }
                                        Log.w("SsaDecoder", concat);
                                        continue Label_1276;
                                    }
                                    Label_0765:
                                    concat = new String("Skipping 'Style:' line before 'Format:' line: ");
                                    continue Label_0777;
                                }
                                Label_0512:
                                iftrue(Label_0525:)(o2.equals("strikeout"));
                                continue;
                            }
                        }
                        catch (final NumberFormatException ex3) {
                            continue;
                        }
                    }
                    break;
                }
            }
        }
    }
}
