// 
// Decompiled by Procyon v0.6.0
// 

package sc;

import java.util.regex.Matcher;
import android.graphics.PointF;
import bd.c0;
import java.util.regex.Pattern;
import android.graphics.Color;
import com.google.common.primitives.Ints;
import bd.d0;
import wi.b;
import ag0.a;
import ak0.n;
import android.util.Log;

public final class c
{
    public final String a;
    public final int b;
    public final Integer c;
    public final float d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    
    public c(final String a, final int b, final Integer c, final float d, final boolean e, final boolean f, final boolean g, final boolean h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static int a(String o) {
        while (true) {
            try {
                final int int1 = Integer.parseInt(((String)o).trim());
                boolean b = false;
                switch (int1) {
                    default: {
                        b = false;
                        break;
                    }
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9: {
                        b = true;
                        break;
                    }
                }
                if (b) {
                    return int1;
                }
                o = String.valueOf(o);
                if (((String)o).length() != 0) {
                    o = "Ignoring unknown alignment: ".concat((String)o);
                }
                else {
                    o = new String("Ignoring unknown alignment: ");
                }
                Log.w("SsaStyle", (String)o);
                return -1;
            }
            catch (final NumberFormatException ex) {
                continue;
            }
            break;
        }
    }
    
    public static boolean b(final String s) {
        boolean b = false;
        try {
            final int int1 = Integer.parseInt(s);
            if (int1 == 1 || int1 == -1) {
                b = true;
            }
            return b;
        }
        catch (final NumberFormatException ex) {
            wi.b.n0("SsaStyle", ag0.a.l(n.f(s, 33), "Failed to parse boolean value: '", s, "'"), (Throwable)ex);
            return false;
        }
    }
    
    public static Integer c(final String s) {
        try {
            long n;
            if (s.startsWith("&H")) {
                n = Long.parseLong(s.substring(2), 16);
            }
            else {
                n = Long.parseLong(s);
            }
            d0.c(n <= 4294967295L);
            return Color.argb(Ints.s2((n >> 24 & 0xFFL) ^ 0xFFL), Ints.s2(n & 0xFFL), Ints.s2(n >> 8 & 0xFFL), Ints.s2(n >> 16 & 0xFFL));
        }
        catch (final IllegalArgumentException ex) {
            wi.b.n0("SsaStyle", ag0.a.l(n.f(s, 36), "Failed to parse color expression: '", s, "'"), (Throwable)ex);
            return null;
        }
    }
    
    public static final class a
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        
        public a(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
            this.f = f;
            this.g = g;
            this.h = h;
            this.i = i;
        }
    }
    
    public static final class b
    {
        public static final Pattern a;
        public static final Pattern b;
        public static final Pattern c;
        public static final Pattern d;
        
        static {
            a = Pattern.compile("\\{([^}]*)\\}");
            b = Pattern.compile(c0.n("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            c = Pattern.compile(c0.n("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            d = Pattern.compile("\\\\an(\\d+)");
        }
        
        public static PointF a(String s) {
            final Matcher matcher = sc.c.b.b.matcher(s);
            final Matcher matcher2 = sc.c.b.c.matcher(s);
            final boolean find = matcher.find();
            final boolean find2 = matcher2.find();
            String s2;
            if (find) {
                if (find2) {
                    final StringBuilder sb = new StringBuilder(s.length() + 82);
                    sb.append("Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='");
                    sb.append(s);
                    sb.append("'");
                    Log.i("SsaStyle.Overrides", sb.toString());
                }
                s = matcher.group(1);
                s2 = matcher.group(2);
            }
            else {
                if (!find2) {
                    return null;
                }
                s = matcher2.group(1);
                s2 = matcher2.group(2);
            }
            s.getClass();
            final float float1 = Float.parseFloat(s.trim());
            s2.getClass();
            return new PointF(float1, Float.parseFloat(s2.trim()));
        }
    }
}
