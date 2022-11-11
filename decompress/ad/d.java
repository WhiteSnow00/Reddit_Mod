// 
// Decompiled by Procyon v0.6.0
// 

package ad;

import java.util.regex.Matcher;
import android.graphics.Color;
import android.text.TextUtils;
import aw.b;
import java.util.HashMap;
import java.util.regex.Pattern;

public final class d
{
    public static final Pattern a;
    public static final Pattern b;
    public static final Pattern c;
    public static final HashMap d;
    
    static {
        a = Pattern.compile("^rgb\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        b = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d{1,3})\\)$");
        c = Pattern.compile("^rgba\\((\\d{1,3}),(\\d{1,3}),(\\d{1,3}),(\\d*\\.?\\d*?)\\)$");
        final HashMap d2 = new HashMap();
        (d = d2).put("aliceblue", -984833);
        d2.put("antiquewhite", -332841);
        final Integer value = -16711681;
        d2.put("aqua", value);
        aw.b.p(-8388652, d2, "aquamarine", -983041, "azure", -657956, "beige", -6972, "bisque");
        aw.b.p(-16777216, d2, "black", -5171, "blanchedalmond", -16776961, "blue", -7722014, "blueviolet");
        aw.b.p(-5952982, d2, "brown", -2180985, "burlywood", -10510688, "cadetblue", -8388864, "chartreuse");
        aw.b.p(-2987746, d2, "chocolate", -32944, "coral", -10185235, "cornflowerblue", -1828, "cornsilk");
        d2.put("crimson", -2354116);
        d2.put("cyan", value);
        d2.put("darkblue", -16777077);
        d2.put("darkcyan", -16741493);
        d2.put("darkgoldenrod", -4684277);
        final Integer value2 = -5658199;
        d2.put("darkgray", value2);
        d2.put("darkgreen", -16751616);
        d2.put("darkgrey", value2);
        d2.put("darkkhaki", -4343957);
        aw.b.p(-7667573, d2, "darkmagenta", -11179217, "darkolivegreen", -29696, "darkorange", -6737204, "darkorchid");
        aw.b.p(-7667712, d2, "darkred", -1468806, "darksalmon", -7357297, "darkseagreen", -12042869, "darkslateblue");
        final Integer value3 = -13676721;
        d2.put("darkslategray", value3);
        d2.put("darkslategrey", value3);
        d2.put("darkturquoise", -16724271);
        d2.put("darkviolet", -7077677);
        d2.put("deeppink", -60269);
        d2.put("deepskyblue", -16728065);
        final Integer value4 = -9868951;
        d2.put("dimgray", value4);
        d2.put("dimgrey", value4);
        aw.b.p(-14774017, d2, "dodgerblue", -5103070, "firebrick", -1296, "floralwhite", -14513374, "forestgreen");
        final Integer value5 = -65281;
        d2.put("fuchsia", value5);
        d2.put("gainsboro", -2302756);
        d2.put("ghostwhite", -460545);
        d2.put("gold", -10496);
        d2.put("goldenrod", -2448096);
        final Integer value6 = -8355712;
        d2.put("gray", value6);
        d2.put("green", -16744448);
        d2.put("greenyellow", -5374161);
        d2.put("grey", value6);
        aw.b.p(-983056, d2, "honeydew", -38476, "hotpink", -3318692, "indianred", -11861886, "indigo");
        aw.b.p(-16, d2, "ivory", -989556, "khaki", -1644806, "lavender", -3851, "lavenderblush");
        aw.b.p(-8586240, d2, "lawngreen", -1331, "lemonchiffon", -5383962, "lightblue", -1015680, "lightcoral");
        d2.put("lightcyan", -2031617);
        d2.put("lightgoldenrodyellow", -329006);
        final Integer value7 = -2894893;
        d2.put("lightgray", value7);
        d2.put("lightgreen", -7278960);
        d2.put("lightgrey", value7);
        d2.put("lightpink", -18751);
        d2.put("lightsalmon", -24454);
        d2.put("lightseagreen", -14634326);
        d2.put("lightskyblue", -7876870);
        final Integer value8 = -8943463;
        d2.put("lightslategray", value8);
        d2.put("lightslategrey", value8);
        d2.put("lightsteelblue", -5192482);
        d2.put("lightyellow", -32);
        d2.put("lime", -16711936);
        d2.put("limegreen", -13447886);
        d2.put("linen", -331546);
        d2.put("magenta", value5);
        d2.put("maroon", -8388608);
        d2.put("mediumaquamarine", -10039894);
        aw.b.p(-16777011, d2, "mediumblue", -4565549, "mediumorchid", -7114533, "mediumpurple", -12799119, "mediumseagreen");
        aw.b.p(-8689426, d2, "mediumslateblue", -16713062, "mediumspringgreen", -12004916, "mediumturquoise", -3730043, "mediumvioletred");
        aw.b.p(-15132304, d2, "midnightblue", -655366, "mintcream", -6943, "mistyrose", -6987, "moccasin");
        aw.b.p(-8531, d2, "navajowhite", -16777088, "navy", -133658, "oldlace", -8355840, "olive");
        aw.b.p(-9728477, d2, "olivedrab", -23296, "orange", -47872, "orangered", -2461482, "orchid");
        aw.b.p(-1120086, d2, "palegoldenrod", -6751336, "palegreen", -5247250, "paleturquoise", -2396013, "palevioletred");
        aw.b.p(-4139, d2, "papayawhip", -9543, "peachpuff", -3308225, "peru", -16181, "pink");
        aw.b.p(-2252579, d2, "plum", -5185306, "powderblue", -8388480, "purple", -10079335, "rebeccapurple");
        aw.b.p(-65536, d2, "red", -4419697, "rosybrown", -12490271, "royalblue", -7650029, "saddlebrown");
        aw.b.p(-360334, d2, "salmon", -744352, "sandybrown", -13726889, "seagreen", -2578, "seashell");
        aw.b.p(-6270419, d2, "sienna", -4144960, "silver", -7876885, "skyblue", -9807155, "slateblue");
        final Integer value9 = -9404272;
        d2.put("slategray", value9);
        d2.put("slategrey", value9);
        d2.put("snow", -1286);
        d2.put("springgreen", -16711809);
        aw.b.p(-12156236, d2, "steelblue", -2968436, "tan", -16744320, "teal", -2572328, "thistle");
        aw.b.p(-40121, d2, "tomato", 0, "transparent", -12525360, "turquoise", -1146130, "violet");
        aw.b.p(-663885, d2, "wheat", -1, "white", -657931, "whitesmoke", -256, "yellow");
        d2.put("yellowgreen", -6632142);
    }
    
    public static int a(String s, final boolean b) {
        d0.c(TextUtils.isEmpty((CharSequence)s) ^ true);
        final String replace = s.replace(" ", "");
        if (replace.charAt(0) == '#') {
            final int n = (int)Long.parseLong(replace.substring(1), 16);
            int n2;
            if (replace.length() == 7) {
                n2 = (0xFF000000 | n);
            }
            else {
                if (replace.length() != 9) {
                    throw new IllegalArgumentException();
                }
                n2 = ((n & 0xFF) << 24 | n >>> 8);
            }
            return n2;
        }
        if (replace.startsWith("rgba")) {
            Pattern pattern;
            if (b) {
                pattern = ad.d.c;
            }
            else {
                pattern = ad.d.b;
            }
            final Matcher matcher = pattern.matcher(replace);
            if (matcher.matches()) {
                int int1;
                if (b) {
                    final String group = matcher.group(4);
                    group.getClass();
                    int1 = (int)(Float.parseFloat(group) * 255.0f);
                }
                else {
                    final String group2 = matcher.group(4);
                    group2.getClass();
                    int1 = Integer.parseInt(group2, 10);
                }
                final String group3 = matcher.group(1);
                group3.getClass();
                final int int2 = Integer.parseInt(group3, 10);
                final String group4 = matcher.group(2);
                group4.getClass();
                final int int3 = Integer.parseInt(group4, 10);
                s = matcher.group(3);
                s.getClass();
                return Color.argb(int1, int2, int3, Integer.parseInt(s, 10));
            }
        }
        else if (replace.startsWith("rgb")) {
            final Matcher matcher2 = ad.d.a.matcher(replace);
            if (matcher2.matches()) {
                final String group5 = matcher2.group(1);
                group5.getClass();
                final int int4 = Integer.parseInt(group5, 10);
                final String group6 = matcher2.group(2);
                group6.getClass();
                final int int5 = Integer.parseInt(group6, 10);
                s = matcher2.group(3);
                s.getClass();
                return Color.rgb(int4, int5, Integer.parseInt(s, 10));
            }
        }
        else {
            final Integer n3 = ad.d.d.get(lw0.b.P2(replace));
            if (n3 != null) {
                return n3;
            }
        }
        throw new IllegalArgumentException();
    }
}
