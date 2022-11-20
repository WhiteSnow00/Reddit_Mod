// 
// Decompiled by Procyon v0.6.0
// 

package bd;

import android.text.TextUtils;
import java.util.regex.Matcher;
import zd.b;
import java.util.regex.Pattern;
import java.util.ArrayList;

public final class p
{
    public static final ArrayList<p.p$a> a;
    public static final Pattern b;
    
    static {
        a = new ArrayList<p.p$a>();
        b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");
    }
    
    public static boolean a(final String s, final String s2) {
        final boolean b = false;
        if (s == null) {
            return false;
        }
        int n = -1;
        switch (s) {
            case "audio/g711-mlaw": {
                n = 10;
                break;
            }
            case "audio/g711-alaw": {
                n = 9;
                break;
            }
            case "audio/mpeg": {
                n = 8;
                break;
            }
            case "audio/flac": {
                n = 7;
                break;
            }
            case "audio/eac3": {
                n = 6;
                break;
            }
            case "audio/raw": {
                n = 5;
                break;
            }
            case "audio/ac3": {
                n = 4;
                break;
            }
            case "audio/mp4a-latm": {
                n = 3;
                break;
            }
            case "audio/mpeg-L2": {
                n = 2;
                break;
            }
            case "audio/mpeg-L1": {
                n = 1;
                break;
            }
            case "audio/eac3-joc": {
                n = 0;
                break;
            }
            default:
                break;
        }
        switch (n) {
            default: {
                return false;
            }
            case 3: {
                if (s2 == null) {
                    return false;
                }
                final b g = g(s2);
                if (g == null) {
                    return false;
                }
                final int a = g.a();
                boolean b2 = b;
                if (a != 0) {
                    b2 = b;
                    if (a != 16) {
                        b2 = true;
                    }
                }
                return b2;
            }
            case 0:
            case 1:
            case 2:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                return true;
            }
        }
    }
    
    public static String b(final String s) {
        if (s == null) {
            return null;
        }
        final String[] r = c0.R(s);
        for (int length = r.length, i = 0; i < length; ++i) {
            final String e = e(r[i]);
            if (e != null && k(e)) {
                return e;
            }
        }
        return null;
    }
    
    public static String c(final String s, final String s2) {
        String string;
        final String s3 = string = null;
        if (s != null) {
            if (s2 == null) {
                string = s3;
            }
            else {
                final String[] r = c0.R(s);
                final StringBuilder sb = new StringBuilder();
                for (final String s4 : r) {
                    if (s2.equals(e(s4))) {
                        if (sb.length() > 0) {
                            sb.append(",");
                        }
                        sb.append(s4);
                    }
                }
                string = s3;
                if (sb.length() > 0) {
                    string = sb.toString();
                }
            }
        }
        return string;
    }
    
    public static int d(final String s, final String s2) {
        final int hashCode = s.hashCode();
        int n = -1;
        switch (hashCode) {
            case 1556697186: {
                if (!s.equals("audio/true-hd")) {
                    break;
                }
                n = 8;
                break;
            }
            case 1505942594: {
                if (!s.equals("audio/vnd.dts.hd")) {
                    break;
                }
                n = 7;
                break;
            }
            case 1504831518: {
                if (!s.equals("audio/mpeg")) {
                    break;
                }
                n = 6;
                break;
            }
            case 1504578661: {
                if (!s.equals("audio/eac3")) {
                    break;
                }
                n = 5;
                break;
            }
            case 187078297: {
                if (!s.equals("audio/ac4")) {
                    break;
                }
                n = 4;
                break;
            }
            case 187078296: {
                if (!s.equals("audio/ac3")) {
                    break;
                }
                n = 3;
                break;
            }
            case -53558318: {
                if (!s.equals("audio/mp4a-latm")) {
                    break;
                }
                n = 2;
                break;
            }
            case -1095064472: {
                if (!s.equals("audio/vnd.dts")) {
                    break;
                }
                n = 1;
                break;
            }
            case -2123537834: {
                if (!s.equals("audio/eac3-joc")) {
                    break;
                }
                n = 0;
                break;
            }
        }
        switch (n) {
            default: {
                return 0;
            }
            case 8: {
                return 14;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 9;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 17;
            }
            case 3: {
                return 5;
            }
            case 2: {
                if (s2 == null) {
                    return 0;
                }
                final b g = g(s2);
                if (g == null) {
                    return 0;
                }
                return g.a();
            }
            case 1: {
                return 7;
            }
            case 0: {
                return 18;
            }
        }
    }
    
    public static String e(String f) {
        final String s = null;
        if (f == null) {
            return null;
        }
        final String p1 = zd.b.p1(f.trim());
        if (p1.startsWith("avc1") || p1.startsWith("avc3")) {
            return "video/avc";
        }
        if (p1.startsWith("hev1") || p1.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (p1.startsWith("dvav") || p1.startsWith("dva1") || p1.startsWith("dvhe") || p1.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (p1.startsWith("av01")) {
            return "video/av01";
        }
        if (p1.startsWith("vp9") || p1.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (p1.startsWith("vp8") || p1.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (p1.startsWith("mp4a")) {
            f = s;
            if (p1.startsWith("mp4a.")) {
                final b g = g(p1);
                f = s;
                if (g != null) {
                    f = f(g.a);
                }
            }
            String s2;
            if ((s2 = f) == null) {
                s2 = "audio/mp4a-latm";
            }
            return s2;
        }
        if (p1.startsWith("mha1")) {
            return "audio/mha1";
        }
        if (p1.startsWith("mhm1")) {
            return "audio/mhm1";
        }
        if (p1.startsWith("ac-3") || p1.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (p1.startsWith("ec-3") || p1.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (p1.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (p1.startsWith("ac-4") || p1.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (p1.startsWith("dtsc")) {
            return "audio/vnd.dts";
        }
        if (p1.startsWith("dtse")) {
            return "audio/vnd.dts.hd;profile=lbr";
        }
        if (p1.startsWith("dtsh") || p1.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (p1.startsWith("dtsx")) {
            return "audio/vnd.dts.uhd;profile=p2";
        }
        if (p1.startsWith("opus")) {
            return "audio/opus";
        }
        if (p1.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (p1.startsWith("flac")) {
            return "audio/flac";
        }
        if (p1.startsWith("stpp")) {
            return "application/ttml+xml";
        }
        if (p1.startsWith("wvtt")) {
            return "text/vtt";
        }
        if (p1.contains("cea708")) {
            return "application/cea-708";
        }
        if (!p1.contains("eia608") && !p1.contains("cea608")) {
            for (int size = p.a.size(), i = 0; i < size; ++i) {
                p.a.get(i).getClass();
                if (p1.startsWith(null)) {
                    break;
                }
            }
            return null;
        }
        return "application/cea-608";
    }
    
    public static String f(final int n) {
        if (n == 32) {
            return "video/mp4v-es";
        }
        if (n == 33) {
            return "video/avc";
        }
        if (n != 35) {
            if (n != 64) {
                if (n == 163) {
                    return "video/wvc1";
                }
                if (n == 177) {
                    return "video/x-vnd.on2.vp9";
                }
                if (n == 165) {
                    return "audio/ac3";
                }
                if (n == 166) {
                    return "audio/eac3";
                }
                switch (n) {
                    default: {
                        switch (n) {
                            default: {
                                return null;
                            }
                            case 174: {
                                return "audio/ac4";
                            }
                            case 173: {
                                return "audio/opus";
                            }
                            case 170:
                            case 171: {
                                return "audio/vnd.dts.hd";
                            }
                            case 169:
                            case 172: {
                                return "audio/vnd.dts";
                            }
                        }
                        break;
                    }
                    case 106: {
                        return "video/mpeg";
                    }
                    case 105:
                    case 107: {
                        return "audio/mpeg";
                    }
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101: {
                        return "video/mpeg2";
                    }
                    case 102:
                    case 103:
                    case 104: {
                        break;
                    }
                }
            }
            return "audio/mp4a-latm";
        }
        return "video/hevc";
    }
    
    public static b g(String group) {
        final Matcher matcher = p.b.matcher(group);
        if (!matcher.matches()) {
            return null;
        }
        group = matcher.group(1);
        group.getClass();
        final String group2 = matcher.group(2);
        int int1 = 0;
        try {
            final int int2 = Integer.parseInt(group, 16);
            if (group2 != null) {
                int1 = Integer.parseInt(group2);
            }
            return new b(int2, int1);
        }
        catch (final NumberFormatException ex) {
            return null;
        }
    }
    
    public static String h(final String s) {
        if (s == null) {
            return null;
        }
        final int index = s.indexOf(47);
        if (index == -1) {
            return null;
        }
        return s.substring(0, index);
    }
    
    public static int i(final String s) {
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final int n = -1;
        if (empty) {
            return -1;
        }
        if (k(s)) {
            return 1;
        }
        if (m(s)) {
            return 2;
        }
        if (l(s)) {
            return 3;
        }
        if ("image".equals(h(s))) {
            return 4;
        }
        if ("application/id3".equals(s) || "application/x-emsg".equals(s) || "application/x-scte35".equals(s)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(s)) {
            return 6;
        }
        final int size = p.a.size();
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n;
            if (n2 >= size) {
                break;
            }
            p.a.get(n2).getClass();
            if (s.equals(null)) {
                n3 = 0;
                break;
            }
            ++n2;
        }
        return n3;
    }
    
    public static String j(final String s) {
        if (s == null) {
            return null;
        }
        final String[] r = c0.R(s);
        for (int length = r.length, i = 0; i < length; ++i) {
            final String e = e(r[i]);
            if (e != null && m(e)) {
                return e;
            }
        }
        return null;
    }
    
    public static boolean k(final String s) {
        return "audio".equals(h(s));
    }
    
    public static boolean l(final String s) {
        return "text".equals(h(s)) || "application/cea-608".equals(s) || "application/cea-708".equals(s) || "application/x-mp4-cea-608".equals(s) || "application/x-subrip".equals(s) || "application/ttml+xml".equals(s) || "application/x-quicktime-tx3g".equals(s) || "application/x-mp4-vtt".equals(s) || "application/x-rawcc".equals(s) || "application/vobsub".equals(s) || "application/pgs".equals(s) || "application/dvbsubs".equals(s);
    }
    
    public static boolean m(final String s) {
        return "video".equals(h(s));
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        
        public b(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        public final int a() {
            final int b = this.b;
            if (b == 2) {
                return 10;
            }
            if (b == 5) {
                return 11;
            }
            if (b == 29) {
                return 12;
            }
            if (b == 42) {
                return 16;
            }
            if (b == 22) {
                return 1073741824;
            }
            if (b != 23) {
                return 0;
            }
            return 15;
        }
    }
}
