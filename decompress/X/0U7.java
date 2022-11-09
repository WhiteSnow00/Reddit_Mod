// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.util.Map;
import java.util.HashMap;
import com.bytedance.covode.number.Covode;

public final class 0U7
{
    static {
        Covode.recordClassIndex(4692);
    }
    
    public static String LIZ(final Pka pka, final String s) {
        if (pka == null) {
            return null;
        }
        if (!pka.LIZ(s)) {
            return null;
        }
        final Pjt ljiiiizz = pka.LJIIIIZZ(s);
        if (ljiiiizz.LIZ() != Pmz.String) {
            return null;
        }
        try {
            return ljiiiizz.LJ();
        }
        finally {
            return null;
        }
    }
    
    public static void LIZ(final int n, final int n2, final String s, final Hya hya) {
        final HashMap hashMap = new HashMap();
        hashMap.put("code", n);
        hashMap.put("detail_code", n2);
        hashMap.put("message", s);
        final StringBuilder sb = new StringBuilder("code:");
        sb.append(n);
        sb.append(" detailCode:");
        sb.append(n2);
        sb.append(" msg:");
        sb.append(s);
        hashMap.put("msg", sb.toString());
        hya.LIZ((Map)hashMap);
    }
    
    public static void LIZ(final Object o, final Hya hya) {
        final HashMap hashMap = new HashMap();
        hashMap.put("code", 1);
        hashMap.put("data", o);
        hya.LIZ((Map)hashMap);
    }
    
    public static void LIZ(final String s, final Hya hya) {
        final HashMap hashMap = new HashMap();
        hashMap.put("code", 0);
        hashMap.put("error_msg", s);
        hya.LIZ((Map)hashMap);
    }
}
