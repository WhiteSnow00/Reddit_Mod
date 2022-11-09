// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import android.os.SystemClock;
import java.util.Locale;
import android.os.Handler$Callback;
import java.io.IOException;
import java.io.Closeable;
import kc.f;
import java.util.Collections;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import java.util.List;
import android.os.Looper;
import android.os.Handler;
import java.math.BigDecimal;
import android.text.TextUtils;
import java.util.GregorianCalendar;
import j$.util.DesugarTimeZone;
import com.google.android.exoplayer2.ParserException;
import java.util.Arrays;
import android.app.UiModeManager;
import android.content.Context;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import java.util.regex.Matcher;
import mk2.e;
import android.net.Uri;
import wi.b;
import java.util.Formatter;
import ak0.m;
import ak0.n;
import android.os.Build;
import android.os.Build$VERSION;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class c0
{
    public static final int a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final byte[] f;
    public static final Pattern g;
    public static final Pattern h;
    public static final Pattern i;
    public static final Pattern j;
    public static HashMap<String, String> k;
    public static final String[] l;
    public static final String[] m;
    public static final int[] n;
    public static final int[] o;
    
    static {
        final int n2 = a = Build$VERSION.SDK_INT;
        final String s = b = Build.DEVICE;
        final String s2 = c = Build.MANUFACTURER;
        final String s3 = d = Build.MODEL;
        final StringBuilder q = ak0.m.q(ak0.n.f(s2, ak0.n.f(s3, ak0.n.f(s, 17))), s, ", ", s3, ", ");
        q.append(s2);
        q.append(", ");
        q.append(n2);
        e = q.toString();
        f = new byte[0];
        g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        i = Pattern.compile("%([A-Fa-f0-9]{2})");
        j = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
        l = new String[] { "alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", "id", "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn" };
        m = new String[] { "i-lux", "lb", "i-hak", "zh-hak", "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", "zh-hak", "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn" };
        n = new int[] { 0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108 };
        o = new int[] { 0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, 108, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, 144, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, 176, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243 };
    }
    
    public static String A(final StringBuilder sb, final Formatter formatter, long n) {
        long n2 = n;
        if (n == -9223372036854775807L) {
            n2 = 0L;
        }
        String s;
        if (n2 < 0L) {
            s = "-";
        }
        else {
            s = "";
        }
        final long n3 = (Math.abs(n2) + 500L) / 1000L;
        n = n3 % 60L;
        final long n4 = n3 / 60L % 60L;
        final long n5 = n3 / 3600L;
        sb.setLength(0);
        String s2;
        if (n5 > 0L) {
            s2 = formatter.format("%s%d:%02d:%02d", s, n5, n4, n).toString();
        }
        else {
            s2 = formatter.format("%s%02d:%02d", s, n4, n).toString();
        }
        return s2;
    }
    
    public static String B(String concat) {
        try {
            final Class<?> forName = Class.forName("android.os.SystemProperties");
            return (String)forName.getMethod("get", String.class).invoke(forName, concat);
        }
        catch (final Exception ex) {
            if (concat.length() != 0) {
                concat = "Failed to read system property ".concat(concat);
            }
            else {
                concat = new String("Failed to read system property ");
            }
            wi.b.C("Util", concat, (Throwable)ex);
            return null;
        }
    }
    
    public static byte[] C(final String s) {
        return s.getBytes(tg.b.c);
    }
    
    public static int D(final Uri uri) {
        final String scheme = uri.getScheme();
        if (scheme != null && mk2.e.w((CharSequence)"rtsp", scheme)) {
            return 3;
        }
        final String path = uri.getPath();
        int e;
        if (path == null) {
            e = 4;
        }
        else {
            e = E(path);
        }
        return e;
    }
    
    public static int E(String s) {
        s = mk2.e.O(s);
        if (s.endsWith(".mpd")) {
            return 0;
        }
        if (s.endsWith(".m3u8")) {
            return 2;
        }
        final Matcher matcher = c0.j.matcher(s);
        if (matcher.matches()) {
            s = matcher.group(2);
            if (s != null) {
                if (s.contains("format=mpd-time-csf")) {
                    return 0;
                }
                if (s.contains("format=m3u8-aapl")) {
                    return 2;
                }
            }
            return 1;
        }
        return 4;
    }
    
    public static int F(final Uri uri, final String s) {
        if (s == null) {
            return D(uri);
        }
        int n = -1;
        switch (s) {
            case "application/x-rtsp": {
                n = 3;
                break;
            }
            case "application/dash+xml": {
                n = 2;
                break;
            }
            case "application/vnd.ms-sstr+xml": {
                n = 1;
                break;
            }
            case "application/x-mpegURL": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                return 4;
            }
            case 3: {
                return 3;
            }
            case 2: {
                return 0;
            }
            case 1: {
                return 1;
            }
            case 0: {
                return 2;
            }
        }
    }
    
    public static boolean G(final s s, final s s2, final Inflater inflater) {
        final int n = s.c - s.b;
        if (n <= 0) {
            return false;
        }
        if (s2.a.length < n) {
            s2.a(n * 2);
        }
        Inflater inflater2;
        if ((inflater2 = inflater) == null) {
            inflater2 = new Inflater();
        }
        final byte[] a = s.a;
        final int b = s.b;
        inflater2.setInput(a, b, s.c - b);
        int n2 = 0;
        try {
            while (true) {
                final byte[] a2 = s2.a;
                final int n3 = n2 + inflater2.inflate(a2, n2, a2.length - n2);
                if (inflater2.finished()) {
                    s2.A(n3);
                    return true;
                }
                if (inflater2.needsDictionary() || inflater2.needsInput()) {
                    return false;
                }
                final byte[] a3 = s2.a;
                if ((n2 = n3) != a3.length) {
                    continue;
                }
                s2.a(a3.length * 2);
                n2 = n3;
            }
        }
        catch (final DataFormatException ex) {
            return false;
        }
        finally {
            inflater2.reset();
        }
    }
    
    public static boolean H(final int n) {
        return n == 3 || n == 2 || n == 268435456 || n == 536870912 || n == 805306368 || n == 4;
    }
    
    public static boolean I(final Context context) {
        final UiModeManager uiModeManager = (UiModeManager)context.getApplicationContext().getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 4;
    }
    
    public static long J(final long n) {
        long n2 = n;
        if (n != -9223372036854775807L) {
            if (n == Long.MIN_VALUE) {
                n2 = n;
            }
            else {
                n2 = n * 1000L;
            }
        }
        return n2;
    }
    
    public static String K(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ifnonnull       6
        //     4: aconst_null    
        //     5: areturn        
        //     6: aload_0        
        //     7: bipush          95
        //     9: bipush          45
        //    11: invokevirtual   java/lang/String.replace:(CC)Ljava/lang/String;
        //    14: astore_1       
        //    15: aload_0        
        //    16: astore_2       
        //    17: aload_1        
        //    18: invokevirtual   java/lang/String.isEmpty:()Z
        //    21: ifne            41
        //    24: aload_1        
        //    25: ldc_w           "und"
        //    28: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    31: ifeq            39
        //    34: aload_0        
        //    35: astore_2       
        //    36: goto            41
        //    39: aload_1        
        //    40: astore_2       
        //    41: aload_2        
        //    42: invokestatic    mk2/e.O:(Ljava/lang/String;)Ljava/lang/String;
        //    45: astore_2       
        //    46: aload_2        
        //    47: ldc_w           "-"
        //    50: iconst_2       
        //    51: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //    54: astore_0       
        //    55: iconst_0       
        //    56: istore_3       
        //    57: aload_0        
        //    58: iconst_0       
        //    59: aaload         
        //    60: astore          4
        //    62: getstatic       bd/c0.k:Ljava/util/HashMap;
        //    65: ifnonnull       188
        //    68: invokestatic    java/util/Locale.getISOLanguages:()[Ljava/lang/String;
        //    71: astore_1       
        //    72: new             Ljava/util/HashMap;
        //    75: dup            
        //    76: aload_1        
        //    77: arraylength    
        //    78: getstatic       bd/c0.l:[Ljava/lang/String;
        //    81: arraylength    
        //    82: iadd           
        //    83: invokespecial   java/util/HashMap.<init>:(I)V
        //    86: astore_0       
        //    87: aload_1        
        //    88: arraylength    
        //    89: istore          5
        //    91: iconst_0       
        //    92: istore          6
        //    94: iload           6
        //    96: iload           5
        //    98: if_icmpge       149
        //   101: aload_1        
        //   102: iload           6
        //   104: aaload         
        //   105: astore          7
        //   107: new             Ljava/util/Locale;
        //   110: astore          8
        //   112: aload           8
        //   114: aload           7
        //   116: invokespecial   java/util/Locale.<init>:(Ljava/lang/String;)V
        //   119: aload           8
        //   121: invokevirtual   java/util/Locale.getISO3Language:()Ljava/lang/String;
        //   124: astore          8
        //   126: aload           8
        //   128: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   131: ifne            143
        //   134: aload_0        
        //   135: aload           8
        //   137: aload           7
        //   139: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   142: pop            
        //   143: iinc            6, 1
        //   146: goto            94
        //   149: iconst_0       
        //   150: istore          6
        //   152: getstatic       bd/c0.l:[Ljava/lang/String;
        //   155: astore_1       
        //   156: iload           6
        //   158: aload_1        
        //   159: arraylength    
        //   160: if_icmpge       184
        //   163: aload_0        
        //   164: aload_1        
        //   165: iload           6
        //   167: aaload         
        //   168: aload_1        
        //   169: iload           6
        //   171: iconst_1       
        //   172: iadd           
        //   173: aaload         
        //   174: invokevirtual   java/util/HashMap.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   177: pop            
        //   178: iinc            6, 2
        //   181: goto            152
        //   184: aload_0        
        //   185: putstatic       bd/c0.k:Ljava/util/HashMap;
        //   188: getstatic       bd/c0.k:Ljava/util/HashMap;
        //   191: aload           4
        //   193: invokevirtual   java/util/HashMap.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   196: checkcast       Ljava/lang/String;
        //   199: astore          7
        //   201: aload           4
        //   203: astore_1       
        //   204: aload_2        
        //   205: astore_0       
        //   206: aload           7
        //   208: ifnull          254
        //   211: aload_2        
        //   212: aload           4
        //   214: invokevirtual   java/lang/String.length:()I
        //   217: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   220: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   223: astore_0       
        //   224: aload_0        
        //   225: invokevirtual   java/lang/String.length:()I
        //   228: ifeq            241
        //   231: aload           7
        //   233: aload_0        
        //   234: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   237: astore_0       
        //   238: goto            251
        //   241: new             Ljava/lang/String;
        //   244: dup            
        //   245: aload           7
        //   247: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   250: astore_0       
        //   251: aload           7
        //   253: astore_1       
        //   254: iload_3        
        //   255: istore          6
        //   257: ldc_w           "no"
        //   260: aload_1        
        //   261: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   264: ifne            294
        //   267: iload_3        
        //   268: istore          6
        //   270: ldc_w           "i"
        //   273: aload_1        
        //   274: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   277: ifne            294
        //   280: aload_0        
        //   281: astore_2       
        //   282: ldc             "zh"
        //   284: aload_1        
        //   285: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //   288: ifeq            377
        //   291: iload_3        
        //   292: istore          6
        //   294: getstatic       bd/c0.m:[Ljava/lang/String;
        //   297: astore_1       
        //   298: aload_0        
        //   299: astore_2       
        //   300: iload           6
        //   302: aload_1        
        //   303: arraylength    
        //   304: if_icmpge       377
        //   307: aload_0        
        //   308: aload_1        
        //   309: iload           6
        //   311: aaload         
        //   312: invokevirtual   java/lang/String.startsWith:(Ljava/lang/String;)Z
        //   315: ifeq            371
        //   318: aload_1        
        //   319: iload           6
        //   321: iconst_1       
        //   322: iadd           
        //   323: aaload         
        //   324: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   327: astore_2       
        //   328: aload_0        
        //   329: aload_1        
        //   330: iload           6
        //   332: aaload         
        //   333: invokevirtual   java/lang/String.length:()I
        //   336: invokevirtual   java/lang/String.substring:(I)Ljava/lang/String;
        //   339: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   342: astore_0       
        //   343: aload_0        
        //   344: invokevirtual   java/lang/String.length:()I
        //   347: ifeq            359
        //   350: aload_2        
        //   351: aload_0        
        //   352: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   355: astore_2       
        //   356: goto            377
        //   359: new             Ljava/lang/String;
        //   362: dup            
        //   363: aload_2        
        //   364: invokespecial   java/lang/String.<init>:(Ljava/lang/String;)V
        //   367: astore_2       
        //   368: goto            377
        //   371: iinc            6, 2
        //   374: goto            294
        //   377: aload_2        
        //   378: areturn        
        //   379: astore          7
        //   381: goto            143
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                
        //  -----  -----  -----  -----  ------------------------------------
        //  107    143    379    384    Ljava/util/MissingResourceException;
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:837)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2086)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
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
    
    public static Object[] L(final int n, final Object[] array) {
        d0.c(n <= array.length);
        return Arrays.copyOf(array, n);
    }
    
    public static long M(String s) throws ParserException {
        final Matcher matcher = c0.g.matcher(s);
        if (!matcher.matches()) {
            s = String.valueOf(s);
            if (s.length() != 0) {
                s = "Invalid date/time format: ".concat(s);
            }
            else {
                s = new String("Invalid date/time format: ");
            }
            throw ParserException.createForMalformedContainer(s, (Throwable)null);
        }
        s = matcher.group(9);
        int n = 0;
        if (s != null) {
            if (!matcher.group(9).equalsIgnoreCase("Z")) {
                final int n2 = n = Integer.parseInt(matcher.group(13)) + Integer.parseInt(matcher.group(12)) * 60;
                if ("-".equals(matcher.group(11))) {
                    n = n2 * -1;
                }
            }
        }
        final GregorianCalendar gregorianCalendar = new GregorianCalendar(DesugarTimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty((CharSequence)matcher.group(8))) {
            s = String.valueOf(matcher.group(8));
            if (s.length() != 0) {
                s = "0.".concat(s);
            }
            else {
                s = new String("0.");
            }
            gregorianCalendar.set(14, new BigDecimal(s).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        if (n != 0) {
            timeInMillis -= n * 60000;
        }
        return timeInMillis;
    }
    
    public static void N(final Handler handler, final Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
            return;
        }
        handler.post(runnable);
    }
    
    public static void O(final int n, final int n2, final List list) {
        if (n >= 0 && n2 <= list.size() && n <= n2) {
            if (n != n2) {
                list.subList(n, n2).clear();
            }
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static long P(final long n, final long n2, final long n3) {
        final long n4 = lcmp(n3, n2);
        if (n4 >= 0 && n3 % n2 == 0L) {
            return n / (n3 / n2);
        }
        if (n4 < 0 && n2 % n3 == 0L) {
            return n2 / n3 * n;
        }
        return (long)(n * (n2 / (double)n3));
    }
    
    public static void Q(final long[] array, long n) {
        final long n2 = lcmp(n, 1000000L);
        final int n3 = 0;
        final int n4 = 0;
        int i = 0;
        if (n2 >= 0 && n % 1000000L == 0L) {
            n /= 1000000L;
            while (i < array.length) {
                array[i] /= n;
                ++i;
            }
        }
        else if (n2 < 0 && 1000000L % n == 0L) {
            n = 1000000L / n;
            for (int j = n3; j < array.length; ++j) {
                array[j] *= n;
            }
        }
        else {
            final double n5 = 1000000L / (double)n;
            for (int k = n4; k < array.length; ++k) {
                array[k] *= (long)n5;
            }
        }
    }
    
    public static String[] R(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return new String[0];
        }
        return s.trim().split("(\\s*,\\s*)", -1);
    }
    
    public static boolean S(final SQLiteDatabase sqLiteDatabase, final String s) {
        boolean b = true;
        if (DatabaseUtils.queryNumEntries(sqLiteDatabase, "sqlite_master", "tbl_name = ?", new String[] { s }) <= 0L) {
            b = false;
        }
        return b;
    }
    
    public static String T(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length * 2);
        for (int i = 0; i < array.length; ++i) {
            sb.append(Character.forDigit(array[i] >> 4 & 0xF, 16));
            sb.append(Character.forDigit(array[i] & 0xF, 16));
        }
        return sb.toString();
    }
    
    public static long U(final long n) {
        long n2 = n;
        if (n != -9223372036854775807L) {
            if (n == Long.MIN_VALUE) {
                n2 = n;
            }
            else {
                n2 = n / 1000L;
            }
        }
        return n2;
    }
    
    public static boolean a(final Object o, final Object o2) {
        boolean equals;
        if (o == null) {
            equals = (o2 == null);
        }
        else {
            equals = o.equals(o2);
        }
        return equals;
    }
    
    public static int b(final long[] array, final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            binarySearch = ~n2;
        }
        else {
            while (++binarySearch < array.length && array[binarySearch] == n) {}
            if (b) {
                --binarySearch;
            }
        }
        return binarySearch;
    }
    
    public static int c(int n, final int[] array) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            n = -(n2 + 2);
        }
        else {
            while (--binarySearch >= 0 && array[binarySearch] == n) {}
            n = binarySearch;
        }
        return n;
    }
    
    public static int d(final List list, final Long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Collections.binarySearch(list, n);
        if (n2 < 0) {
            binarySearch = -(n2 + 2);
        }
        else {
            while (--binarySearch >= 0 && ((Comparable<Long>)list.get(binarySearch)).compareTo(n) == 0) {}
            ++binarySearch;
        }
        int max = binarySearch;
        if (b) {
            max = Math.max(0, binarySearch);
        }
        return max;
    }
    
    public static int e(final f f, final long n) {
        int n2 = f.f - 1;
        final int n3 = 0;
        int i = 0;
        while (i <= n2) {
            final int n4 = i + n2 >>> 1;
            if (f.b(n4) < n) {
                i = n4 + 1;
            }
            else {
                n2 = n4 - 1;
            }
        }
        final int n5 = n2 + 1;
        if (n5 < f.f && f.b(n5) == n) {
            n2 = n5;
        }
        else if (n2 == -1) {
            n2 = n3;
        }
        return n2;
    }
    
    public static int f(final long[] array, final long n, final boolean b) {
        int binarySearch;
        final int n2 = binarySearch = Arrays.binarySearch(array, n);
        if (n2 < 0) {
            binarySearch = -(n2 + 2);
        }
        else {
            while (--binarySearch >= 0 && array[binarySearch] == n) {}
            ++binarySearch;
        }
        int max = binarySearch;
        if (b) {
            max = Math.max(0, binarySearch);
        }
        return max;
    }
    
    public static void g(final Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        }
        catch (final IOException ex) {}
    }
    
    public static float h(final float n, final float n2, final float n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static int i(final int n, final int n2, final int n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static long j(final long n, final long n2, final long n3) {
        return Math.max(n2, Math.min(n, n3));
    }
    
    public static boolean k(final Object o, final Object[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (a(array[i], o)) {
                return true;
            }
        }
        return false;
    }
    
    public static Handler l(final Handler$Callback handler$Callback) {
        final Looper myLooper = Looper.myLooper();
        d0.g(myLooper);
        return new Handler(myLooper, handler$Callback);
    }
    
    public static Uri m(final Uri uri) {
        final String path = uri.getPath();
        if (path == null) {
            return uri;
        }
        final Matcher matcher = c0.j.matcher(mk2.e.O(path));
        Uri withAppendedPath = uri;
        if (matcher.matches()) {
            withAppendedPath = uri;
            if (matcher.group(1) == null) {
                withAppendedPath = Uri.withAppendedPath(uri, "Manifest");
            }
        }
        return withAppendedPath;
    }
    
    public static String n(final String s, final Object... array) {
        return String.format(Locale.US, s, array);
    }
    
    public static String o(final byte[] array) {
        return new String(array, tg.b.c);
    }
    
    public static int p(int a) {
        switch (a) {
            default: {
                return 0;
            }
            case 8: {
                a = c0.a;
                if (a >= 23) {
                    return 6396;
                }
                if (a >= 21) {
                    return 6396;
                }
                return 0;
            }
            case 7: {
                return 1276;
            }
            case 6: {
                return 252;
            }
            case 5: {
                return 220;
            }
            case 4: {
                return 204;
            }
            case 3: {
                return 28;
            }
            case 2: {
                return 12;
            }
            case 1: {
                return 4;
            }
        }
    }
    
    public static int q(final int n, final String s) {
        final String[] r = R(s);
        final int length = r.length;
        int i = 0;
        int n2 = 0;
        while (i < length) {
            int n3 = n2;
            if (n == bd.o.i(bd.o.e(r[i]))) {
                n3 = n2 + 1;
            }
            ++i;
            n2 = n3;
        }
        return n2;
    }
    
    public static String r(final int n, String string) {
        final String[] r = R(string);
        final int length = r.length;
        string = null;
        if (length == 0) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (final String s : r) {
            if (n == bd.o.i(bd.o.e(s))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(s);
            }
        }
        if (sb.length() > 0) {
            string = sb.toString();
        }
        return string;
    }
    
    public static int s(final int n) {
        if (n != 2 && n != 4) {
            if (n != 10) {
                if (n != 7) {
                    if (n != 8) {
                        switch (n) {
                            default: {
                                switch (n) {
                                    default: {
                                        return 6006;
                                    }
                                    case 24:
                                    case 25:
                                    case 26:
                                    case 27:
                                    case 28: {
                                        return 6002;
                                    }
                                }
                                break;
                            }
                            case 15: {
                                break;
                            }
                            case 17:
                            case 19:
                            case 20:
                            case 21:
                            case 22: {
                                return 6004;
                            }
                            case 16:
                            case 18: {
                                return 6005;
                            }
                        }
                    }
                    return 6003;
                }
                return 6005;
            }
            return 6004;
        }
        return 6005;
    }
    
    public static String t(final int n) {
        if (n == 0) {
            return "NO";
        }
        if (n == 1) {
            return "NO_UNSUPPORTED_TYPE";
        }
        if (n == 2) {
            return "NO_UNSUPPORTED_DRM";
        }
        if (n == 3) {
            return "NO_EXCEEDS_CAPABILITIES";
        }
        if (n == 4) {
            return "YES";
        }
        throw new IllegalStateException();
    }
    
    public static long u(final float n, final long n2) {
        if (n == 1.0f) {
            return n2;
        }
        return Math.round(n2 * (double)n);
    }
    
    public static long v(long currentTimeMillis) {
        if (currentTimeMillis == -9223372036854775807L) {
            currentTimeMillis = System.currentTimeMillis();
        }
        else {
            currentTimeMillis += SystemClock.elapsedRealtime();
        }
        return currentTimeMillis;
    }
    
    public static int w(final int n) {
        if (n == 8) {
            return 3;
        }
        if (n == 16) {
            return 2;
        }
        if (n == 24) {
            return 536870912;
        }
        if (n != 32) {
            return 0;
        }
        return 805306368;
    }
    
    public static int x(final int n, final int n2) {
        if (n != 2) {
            int n3 = n2;
            if (n != 3) {
                if (n != 4) {
                    if (n == 268435456) {
                        return n2 * 2;
                    }
                    if (n == 536870912) {
                        return n2 * 3;
                    }
                    if (n != 805306368) {
                        throw new IllegalArgumentException();
                    }
                }
                n3 = n2 * 4;
            }
            return n3;
        }
        return n2 * 2;
    }
    
    public static long y(final float n, final long n2) {
        if (n == 1.0f) {
            return n2;
        }
        return Math.round(n2 / (double)n);
    }
    
    public static int z(final int n) {
        if (n == 13) {
            return 1;
        }
        switch (n) {
            default: {
                return 3;
            }
            case 6: {
                return 2;
            }
            case 5:
            case 7:
            case 8:
            case 9:
            case 10: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 8;
            }
            case 2: {
                return 0;
            }
        }
    }
}
