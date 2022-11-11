// 
// Decompiled by Procyon v0.6.0
// 

package rc;

import lg.e0;
import android.text.TextUtils;
import android.util.Log;
import mc.f;
import java.util.regex.Matcher;
import java.util.Collection;
import java.util.ArrayList;
import ad.s;
import ad.d0;
import ad.c0;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
import mc.e;

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
            this.i(new s((byte[])list.get(1)));
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
    
    public static long j(String group) {
        final Matcher matcher = a.r.matcher(group.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        group = matcher.group(1);
        final int a = c0.a;
        return Long.parseLong(matcher.group(4)) * 10000L + (Long.parseLong(matcher.group(3)) * 1000000L + (Long.parseLong(matcher.group(2)) * 60L * 1000000L + Long.parseLong(group) * 60L * 60L * 1000000L));
    }
    
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
        //    21: new             Lad/s;
        //    24: dup            
        //    25: aload_1        
        //    26: iload_2        
        //    27: invokespecial   ad/s.<init>:([BI)V
        //    30: astore          7
        //    32: aload           4
        //    34: getfield        rc/a.m:Z
        //    37: ifne            47
        //    40: aload           4
        //    42: aload           7
        //    44: invokevirtual   rc/a.i:(Lad/s;)V
        //    47: aload           4
        //    49: getfield        rc/a.m:Z
        //    52: ifeq            64
        //    55: aload           4
        //    57: getfield        rc/a.n:Lrc/b;
        //    60: astore_1       
        //    61: goto            66
        //    64: aconst_null    
        //    65: astore_1       
        //    66: aload_0        
        //    67: astore          8
        //    69: aload           7
        //    71: invokevirtual   ad/s.d:()Ljava/lang/String;
        //    74: astore          9
        //    76: aload           9
        //    78: ifnull          1442
        //    81: aload           9
        //    83: ldc             "Format:"
        //    85: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //    88: ifeq            100
        //    91: aload           9
        //    93: invokestatic    rc/b.a:(Ljava/lang/String;)Lrc/b;
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
        //   163: invokestatic    ad/d0.c:(Z)V
        //   166: aload           9
        //   168: bipush          9
        //   170: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   173: ldc             ","
        //   175: aload_1        
        //   176: getfield        rc/b.e:I
        //   179: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   182: astore          4
        //   184: aload           4
        //   186: arraylength    
        //   187: aload_1        
        //   188: getfield        rc/b.e:I
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
        //   239: getfield        rc/b.a:I
        //   242: aaload         
        //   243: invokestatic    rc/a.j:(Ljava/lang/String;)J
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
        //   302: getfield        rc/b.b:I
        //   305: aaload         
        //   306: invokestatic    rc/a.j:(Ljava/lang/String;)J
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
        //   364: getfield        rc/a.o:Ljava/util/LinkedHashMap;
        //   367: astore          9
        //   369: iconst_m1      
        //   370: istore          14
        //   372: aload           9
        //   374: ifnull          407
        //   377: aload_1        
        //   378: getfield        rc/b.c:I
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
        //   399: checkcast       Lrc/c;
        //   402: astore          9
        //   404: goto            410
        //   407: aconst_null    
        //   408: astore          9
        //   410: aload           4
        //   412: aload_1        
        //   413: getfield        rc/b.d:I
        //   416: aaload         
        //   417: astore          15
        //   419: getstatic       rc/c$b.a:Ljava/util/regex/Pattern;
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
        //   462: invokestatic    rc/c$b.a:(Ljava/lang/String;)Landroid/graphics/PointF;
        //   465: astore          7
        //   467: aload           7
        //   469: ifnull          476
        //   472: aload           7
        //   474: astore          17
        //   476: getstatic       rc/c$b.d:Ljava/util/regex/Pattern;
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
        //   510: invokestatic    rc/c.a:(Ljava/lang/String;)I
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
        //   534: new             Lrc/c$b;
        //   537: astore          7
        //   539: getstatic       rc/c$b.a:Ljava/util/regex/Pattern;
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
        //   579: getfield        rc/a.p:F
        //   582: fstore          19
        //   584: aload           8
        //   586: getfield        rc/a.q:F
        //   589: fstore          20
        //   591: new             Landroid/text/SpannableString;
        //   594: dup            
        //   595: aload           7
        //   597: invokespecial   android/text/SpannableString.<init>:(Ljava/lang/CharSequence;)V
        //   600: astore          7
        //   602: new             Lmc/a$a;
        //   605: dup            
        //   606: invokespecial   mc/a$a.<init>:()V
        //   609: astore          8
        //   611: aload           8
        //   613: aload           7
        //   615: putfield        mc/a$a.a:Ljava/lang/CharSequence;
        //   618: aload           9
        //   620: ifnull          859
        //   623: aload           9
        //   625: getfield        rc/c.c:Ljava/lang/Integer;
        //   628: ifnull          662
        //   631: aload           7
        //   633: new             Landroid/text/style/ForegroundColorSpan;
        //   636: dup            
        //   637: aload           9
        //   639: getfield        rc/c.c:Ljava/lang/Integer;
        //   642: invokevirtual   java/lang/Integer.intValue:()I
        //   645: invokespecial   android/text/style/ForegroundColorSpan.<init>:(I)V
        //   648: iconst_0       
        //   649: aload           7
        //   651: invokevirtual   android/text/SpannableString.length:()I
        //   654: bipush          33
        //   656: invokevirtual   android/text/SpannableString.setSpan:(Ljava/lang/Object;III)V
        //   659: goto            662
        //   662: aload           9
        //   664: getfield        rc/c.d:F
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
        //   692: putfield        mc/a$a.k:F
        //   695: aload           8
        //   697: iconst_1       
        //   698: putfield        mc/a$a.j:I
        //   701: aload           9
        //   703: getfield        rc/c.e:Z
        //   706: istore_3       
        //   707: iload_3        
        //   708: ifeq            743
        //   711: aload           9
        //   713: getfield        rc/c.f:Z
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
        //   773: getfield        rc/c.f:Z
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
        //   802: getfield        rc/c.g:Z
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
        //   830: getfield        rc/c.h:Z
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
        //   875: getfield        rc/c.b:I
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
        //   984: invokestatic    d.w:(ILjava/lang/String;ILjava/lang/String;)V
        //   987: aconst_null    
        //   988: astore          7
        //   990: aload           8
        //   992: aload           7
        //   994: putfield        mc/a$a.c:Landroid/text/Layout$Alignment;
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
        //  1091: invokestatic    d.w:(ILjava/lang/String;ILjava/lang/String;)V
        //  1094: ldc_w           -2147483648
        //  1097: istore_2       
        //  1098: aload           8
        //  1100: iload_2        
        //  1101: putfield        mc/a$a.i:I
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
        //  1195: invokestatic    d.w:(ILjava/lang/String;ILjava/lang/String;)V
        //  1198: iload           22
        //  1200: istore_2       
        //  1201: aload           8
        //  1203: iload_2        
        //  1204: putfield        mc/a$a.g:I
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
        //  1238: putfield        mc/a$a.h:F
        //  1241: aload           8
        //  1243: aload           17
        //  1245: getfield        android/graphics/PointF.y:F
        //  1248: fload           20
        //  1250: fdiv           
        //  1251: putfield        mc/a$a.e:F
        //  1254: aload           8
        //  1256: iconst_0       
        //  1257: putfield        mc/a$a.f:I
        //  1260: goto            1378
        //  1263: aload           8
        //  1265: getfield        mc/a$a.i:I
        //  1268: istore          14
        //  1270: ldc_w           0.95
        //  1273: fstore          20
        //  1275: iload           14
        //  1277: ifeq            1315
        //  1280: iload           14
        //  1282: iconst_1       
        //  1283: if_icmpeq       1307
        //  1286: iload           14
        //  1288: iconst_2       
        //  1289: if_icmpeq       1299
        //  1292: ldc             -3.4028235E38
        //  1294: fstore          21
        //  1296: goto            1320
        //  1299: ldc_w           0.95
        //  1302: fstore          21
        //  1304: goto            1320
        //  1307: ldc_w           0.5
        //  1310: fstore          21
        //  1312: goto            1320
        //  1315: ldc_w           0.05
        //  1318: fstore          21
        //  1320: aload           8
        //  1322: fload           21
        //  1324: putfield        mc/a$a.h:F
        //  1327: iload_2        
        //  1328: ifeq            1360
        //  1331: iload_2        
        //  1332: iconst_1       
        //  1333: if_icmpeq       1352
        //  1336: fload           20
        //  1338: fstore          21
        //  1340: iload_2        
        //  1341: iconst_2       
        //  1342: if_icmpeq       1365
        //  1345: ldc             -3.4028235E38
        //  1347: fstore          21
        //  1349: goto            1365
        //  1352: ldc_w           0.5
        //  1355: fstore          21
        //  1357: goto            1365
        //  1360: ldc_w           0.05
        //  1363: fstore          21
        //  1365: aload           8
        //  1367: fload           21
        //  1369: putfield        mc/a$a.e:F
        //  1372: aload           8
        //  1374: iconst_0       
        //  1375: putfield        mc/a$a.f:I
        //  1378: aload           8
        //  1380: invokevirtual   mc/a$a.a:()Lmc/a;
        //  1383: astore          9
        //  1385: lload           10
        //  1387: aload           6
        //  1389: aload           5
        //  1391: invokestatic    rc/a.h:(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
        //  1394: istore_2       
        //  1395: lload           12
        //  1397: aload           6
        //  1399: aload           5
        //  1401: invokestatic    rc/a.h:(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
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
        //  1442: new             Lrc/d;
        //  1445: dup            
        //  1446: aload           5
        //  1448: aload           6
        //  1450: invokespecial   rc/d.<init>:(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
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
            Label_0167: {
                if (!equalsIgnoreCase) {
                    break Label_0167;
                }
                String d2;
                int c;
                int b;
                String[] split;
                String p;
                String p2;
                String d3;
                String concat;
                int n5;
                int n4;
                int n6;
                int c2;
                int b2;
                LinkedHashMap o;
                String[] split2;
                int length;
                c$a c$a;
                int i;
                Object[] array;
                int n7;
                int n8;
                int n9;
                int n10;
                int n11;
                int n12;
                int n13;
                int n14;
                String[] split3;
                int n15;
                int n16;
                int n17;
                String trim;
                int b3;
                int a;
                int c3;
                Integer c4;
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
                c c5;
                Block_23_Outer:Label_0688_Outer:Block_19_Outer:
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
                            p = lw0.b.P2(split[0].trim());
                            p.getClass();
                            if (p.equals("playresx")) {
                                break Label_0150;
                            }
                            if (!p.equals("playresy")) {
                                continue Label_0030_Outer;
                            }
                            break;
                        }
                        try {
                            this.q = Float.parseFloat(split[1].trim());
                            continue Block_23_Outer;
                            Label_0477: {
                                iftrue(Label_0491:)(p2.equals("bold"));
                            }
                            while (true) {
                                Label_0688:Label_0583_Outer:
                                while (true) {
                                Label_0583:
                                    while (true) {
                                        Label_0580: {
                                        Block_16_Outer:
                                            while (true) {
                                                Block_22:Block_26_Outer:
                                                while (true) {
                                                    Block_15: {
                                                        break Block_15;
                                                        concat = "Skipping 'Style:' line before 'Format:' line: ".concat(d3);
                                                        Block_27: {
                                                            while (true) {
                                                                Label_1263: {
                                                                Label_0309_Outer:
                                                                    while (true) {
                                                                        break Label_0784;
                                                                        Label_0670:
                                                                        n4 = n5;
                                                                        break Label_0688;
                                                                        Log.w("SsaDecoder", concat);
                                                                    Label_0309:
                                                                        while (true) {
                                                                            while (true) {
                                                                                Label_1260: {
                                                                                    Block_18: {
                                                                                        Block_8_Outer:Block_20_Outer:Label_0192_Outer:
                                                                                        while (true) {
                                                                                            break Label_1283;
                                                                                            Label_0632:
                                                                                            break Label_0688;
                                                                                            break Label_0580;
                                                                                            Label_0517:
                                                                                            iftrue(Label_0531:)(p2.equals("strikeout"));
                                                                                            while (true) {
                                                                                                Label_0239: {
                                                                                                Label_0192:
                                                                                                    while (true) {
                                                                                                    Label_0186:
                                                                                                        while (true) {
                                                                                                        Block_7:
                                                                                                            while (true) {
                                                                                                                Block_14: {
                                                                                                                    Block_21: {
                                                                                                                        while (true) {
                                                                                                                            while (true) {
                                                                                                                                break Label_0580;
                                                                                                                                Label_1304:
                                                                                                                                iftrue(Label_1326:)(!"[V4 Styles]".equalsIgnoreCase(d));
                                                                                                                                break Block_27;
                                                                                                                                Label_0457:
                                                                                                                                iftrue(Label_0471:)(p2.equals("name"));
                                                                                                                                break Block_14;
                                                                                                                                Label_0736:
                                                                                                                                iftrue(Label_1283:)(!d3.startsWith("Style:"));
                                                                                                                                break Block_21;
                                                                                                                                Label_0429:
                                                                                                                                n6 = 7;
                                                                                                                                break Label_0583;
                                                                                                                                break Label_0580;
                                                                                                                                Label_0415:
                                                                                                                                iftrue(Label_0429:)(p2.equals("alignment"));
                                                                                                                                continue Label_0583_Outer;
                                                                                                                            }
                                                                                                                            c2 = s.c;
                                                                                                                            b2 = s.b;
                                                                                                                            iftrue(Label_1295:)(c2 - b2 != 0 && (s.a[b2] & 0xFF) == 0x5B);
                                                                                                                            break Label_0239;
                                                                                                                            Label_1295:
                                                                                                                            this.o = o;
                                                                                                                            continue Label_0030_Outer;
                                                                                                                            Label_0795:
                                                                                                                            d0.c(d3.startsWith("Style:"));
                                                                                                                            split2 = TextUtils.split(d3.substring(6), ",");
                                                                                                                            length = split2.length;
                                                                                                                            i = c$a.i;
                                                                                                                            iftrue(Label_0890:)(length == i);
                                                                                                                            array = new Object[3];
                                                                                                                            array[n2] = i;
                                                                                                                            array[n3] = split2.length;
                                                                                                                            array[n7] = d3;
                                                                                                                            Log.w("SsaStyle", c0.n("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", array));
                                                                                                                            break Label_1260;
                                                                                                                            iftrue(Label_1304:)(!"[V4+ Styles]".equalsIgnoreCase(d));
                                                                                                                            break Block_7;
                                                                                                                            break Label_0580;
                                                                                                                            Label_1326:
                                                                                                                            iftrue(Label_0000:)(!"[Events]".equalsIgnoreCase(d));
                                                                                                                            return;
                                                                                                                            c$a = new c$a(n8, n9, n10, n11, n12, n13, n14, n4, split3.length);
                                                                                                                            break Label_0192;
                                                                                                                            n7 = 2;
                                                                                                                            n2 = 0;
                                                                                                                            n3 = 1;
                                                                                                                            break Label_0192;
                                                                                                                            Label_0436:
                                                                                                                            iftrue(Label_0450:)(p2.equals("fontsize"));
                                                                                                                            continue Block_8_Outer;
                                                                                                                        }
                                                                                                                        Label_0635:
                                                                                                                        n9 = n5;
                                                                                                                        break Label_0688;
                                                                                                                        switch([Lcom.strobel.decompiler.ast.Label;@bdba4e)(n6);
                                                                                                                        Label_0511:
                                                                                                                        n6 = 3;
                                                                                                                        continue Label_0583;
                                                                                                                        Label_0649:
                                                                                                                        n8 = n5;
                                                                                                                        break Label_0688;
                                                                                                                        split3 = TextUtils.split(d3.substring(7), ",");
                                                                                                                        n15 = n2;
                                                                                                                        n8 = (n16 = -1);
                                                                                                                        n17 = (n11 = n16);
                                                                                                                        n12 = (n13 = n11);
                                                                                                                        n14 = (n4 = n13);
                                                                                                                        n10 = n17;
                                                                                                                        n9 = n16;
                                                                                                                        n5 = n15;
                                                                                                                        break Label_0309;
                                                                                                                        Label_0538:
                                                                                                                        iftrue(Label_0552:)(p2.equals("underline"));
                                                                                                                        break Block_18;
                                                                                                                        try {
                                                                                                                            Label_0890:
                                                                                                                            trim = split2[c$a.a].trim();
                                                                                                                            b3 = c$a.b;
                                                                                                                            if (b3 != -1) {
                                                                                                                                a = rc.c.a(split2[b3].trim());
                                                                                                                            }
                                                                                                                            else {
                                                                                                                                a = -1;
                                                                                                                            }
                                                                                                                            c3 = c$a.c;
                                                                                                                            if (c3 != -1) {
                                                                                                                                c4 = rc.c.c(split2[c3].trim());
                                                                                                                            }
                                                                                                                            else {
                                                                                                                                c4 = null;
                                                                                                                            }
                                                                                                                            d4 = c$a.d;
                                                                                                                            Label_1066: {
                                                                                                                                if (d4 != -1) {
                                                                                                                                    trim2 = split2[d4].trim();
                                                                                                                                    try {
                                                                                                                                        float1 = Float.parseFloat(trim2);
                                                                                                                                        break Label_1066;
                                                                                                                                    }
                                                                                                                                    catch (final NumberFormatException ex) {
                                                                                                                                        sb = new StringBuilder(String.valueOf(trim2).length() + 29);
                                                                                                                                        sb.append("Failed to parse font size: '");
                                                                                                                                        sb.append(trim2);
                                                                                                                                        sb.append("'");
                                                                                                                                        e0.w0("SsaStyle", sb.toString(), (Throwable)ex);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                float1 = -3.4028235E38f;
                                                                                                                            }
                                                                                                                            e = c$a.e;
                                                                                                                            b4 = (e != -1 && rc.c.b(split2[e].trim()));
                                                                                                                            f = c$a.f;
                                                                                                                            b5 = (f != -1 && rc.c.b(split2[f].trim()));
                                                                                                                            g = c$a.g;
                                                                                                                            b6 = (g != -1 && rc.c.b(split2[g].trim()));
                                                                                                                            h = c$a.h;
                                                                                                                            c5 = new c(trim, a, c4, float1, b4, b5, b6, h != -1 && rc.c.b(split2[h].trim()));
                                                                                                                            break Label_1263;
                                                                                                                        }
                                                                                                                        catch (final RuntimeException ex2) {
                                                                                                                            e0.w0("SsaStyle", a.j(d3.length() + 36, "Skipping malformed 'Style:' line: '", d3, "'"), (Throwable)ex2);
                                                                                                                        }
                                                                                                                        break Label_1260;
                                                                                                                    }
                                                                                                                    iftrue(Label_0795:)(c$a != null);
                                                                                                                    break Block_22;
                                                                                                                }
                                                                                                                break Label_0580;
                                                                                                                Label_0642:
                                                                                                                n11 = n5;
                                                                                                                break Label_0688;
                                                                                                                p2 = lw0.b.P2(split3[n5].trim());
                                                                                                                p2.getClass();
                                                                                                                switch([Lcom.strobel.decompiler.ast.Label;@293f40)(p2.hashCode());
                                                                                                                Label_0412:
                                                                                                                break Label_0580;
                                                                                                                Label_0531:
                                                                                                                n6 = n7;
                                                                                                                continue Label_0583;
                                                                                                                Label_0729:
                                                                                                                n = n7;
                                                                                                                break Label_0186;
                                                                                                                d3 = s.d();
                                                                                                                iftrue(Label_1295:)(d3 == null);
                                                                                                                continue Block_20_Outer;
                                                                                                            }
                                                                                                            o = new LinkedHashMap();
                                                                                                            break Label_0186;
                                                                                                            Label_0694:
                                                                                                            iftrue(Label_0729:)(n8 == -1);
                                                                                                            continue Label_0192_Outer;
                                                                                                        }
                                                                                                        c$a = null;
                                                                                                        n7 = n;
                                                                                                        continue Label_0192;
                                                                                                    }
                                                                                                }
                                                                                                iftrue(Label_0736:)(!d3.startsWith("Format:"));
                                                                                                continue Label_0309_Outer;
                                                                                            }
                                                                                            o.put(c5.a, c5);
                                                                                            continue Block_16_Outer;
                                                                                        }
                                                                                        break Label_0580;
                                                                                        Label_0471:
                                                                                        n6 = 5;
                                                                                        continue Label_0583;
                                                                                        Label_0663:
                                                                                        n10 = n5;
                                                                                        break Label_0688;
                                                                                    }
                                                                                    break Label_0580;
                                                                                    Label_0552:
                                                                                    n6 = n3;
                                                                                    continue Label_0583;
                                                                                    Label_0677:
                                                                                    n14 = n5;
                                                                                    break Label_0688;
                                                                                }
                                                                                c5 = null;
                                                                                break Label_1263;
                                                                                iftrue(Label_0694:)(n5 >= split3.length);
                                                                                continue Block_26_Outer;
                                                                            }
                                                                            Label_0573:
                                                                            n6 = n2;
                                                                            continue Label_0583;
                                                                            ++n5;
                                                                            continue Label_0309;
                                                                        }
                                                                        Label_0772:
                                                                        concat = new String("Skipping 'Style:' line before 'Format:' line: ");
                                                                        continue Label_0688_Outer;
                                                                    }
                                                                }
                                                                iftrue(Label_1283:)(c5 == null);
                                                                continue Block_19_Outer;
                                                            }
                                                            Label_0656:
                                                            n12 = n5;
                                                            continue Label_0688;
                                                        }
                                                        Log.i("SsaDecoder", "[V4 Styles] are not supported");
                                                        continue Label_0030_Outer;
                                                    }
                                                    break Label_0580;
                                                    Label_0497:
                                                    iftrue(Label_0511:)(p2.equals("primarycolour"));
                                                    continue Label_0583_Outer;
                                                }
                                                iftrue(Label_0772:)(d3.length() == 0);
                                                continue Label_0688_Outer;
                                            }
                                            Label_0450:
                                            n6 = 6;
                                            continue Label_0583;
                                            this.p = Float.parseFloat(split[1].trim());
                                            continue Block_23_Outer;
                                            Label_0491:
                                            n6 = 4;
                                            continue Label_0583;
                                        }
                                        n6 = -1;
                                        continue Label_0583;
                                    }
                                    Label_0684:
                                    n13 = n5;
                                    continue Label_0688;
                                }
                                Label_0559:
                                iftrue(Label_0573:)(p2.equals("italic"));
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
