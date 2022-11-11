// 
// Decompiled by Procyon v0.6.0
// 

package fb;

import java.util.List;
import java.util.Map;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;
import ad.s;
import cb.w;
import cb.g;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;

public final class b extends TagPayloadReader
{
    public long b;
    public long[] c;
    public long[] d;
    
    public b() {
        super((w)new g());
        this.b = -9223372036854775807L;
        this.c = new long[0];
        this.d = new long[0];
    }
    
    public static Serializable b(int i, final s s) {
        if (i == 0) {
            return Double.longBitsToDouble(s.k());
        }
        boolean b = false;
        final int n = 0;
        if (i == 1) {
            if (s.r() == 1) {
                b = true;
            }
            return b;
        }
        if (i == 2) {
            return d(s);
        }
        if (i == 3) {
            final HashMap hashMap = new HashMap();
            while (true) {
                final String d = d(s);
                i = s.r();
                if (i == 9) {
                    break;
                }
                final Serializable b2 = b(i, s);
                if (b2 == null) {
                    continue;
                }
                hashMap.put(d, b2);
            }
            return hashMap;
        }
        if (i == 8) {
            return c(s);
        }
        if (i == 10) {
            final int u = s.u();
            final ArrayList list = new ArrayList<Serializable>(u);
            Serializable b3;
            for (i = n; i < u; ++i) {
                b3 = b(s.r(), s);
                if (b3 != null) {
                    list.add(b3);
                }
            }
            return list;
        }
        if (i != 11) {
            return null;
        }
        final Date date = new Date((long)Double.longBitsToDouble(s.k()));
        s.C(2);
        return date;
    }
    
    public static HashMap<String, Object> c(final s s) {
        final int u = s.u();
        final HashMap hashMap = new HashMap<String, Serializable>(u);
        for (int i = 0; i < u; ++i) {
            final String d = d(s);
            final Serializable b = b(s.r(), s);
            if (b != null) {
                hashMap.put(d, b);
            }
        }
        return (HashMap<String, Object>)hashMap;
    }
    
    public static String d(final s s) {
        final int w = s.w();
        final int b = s.b;
        s.C(w);
        return new String(s.a, b, w);
    }
    
    public final boolean a(final long n, final s s) {
        if (s.r() != 2) {
            return false;
        }
        if (!"onMetaData".equals(d(s))) {
            return false;
        }
        if (s.c - s.b == 0) {
            return false;
        }
        if (s.r() != 8) {
            return false;
        }
        final HashMap<String, Object> c = c(s);
        final Object value = c.get("duration");
        if (value instanceof Double) {
            final double doubleValue = (double)value;
            if (doubleValue > 0.0) {
                this.b = (long)(doubleValue * 1000000.0);
            }
        }
        final Object value2 = c.get("keyframes");
        if (value2 instanceof Map) {
            final Map map = (Map)value2;
            final Object value3 = map.get("filepositions");
            final Object value4 = map.get("times");
            if (value3 instanceof List && value4 instanceof List) {
                final List list = (List)value3;
                final List list2 = (List)value4;
                final int size = list2.size();
                this.c = new long[size];
                this.d = new long[size];
                for (int i = 0; i < size; ++i) {
                    final Object value5 = list.get(i);
                    final Object value6 = list2.get(i);
                    if (!(value6 instanceof Double) || !(value5 instanceof Double)) {
                        this.c = new long[0];
                        this.d = new long[0];
                        break;
                    }
                    this.c[i] = (long)((double)value6 * 1000000.0);
                    this.d[i] = ((Double)value5).longValue();
                }
            }
        }
        return false;
    }
}
