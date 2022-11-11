// 
// Decompiled by Procyon v0.6.0
// 

package hm2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class d
{
    public static final Map<String, d> b;
    public final String a;
    
    static {
        final HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 67), new d(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(a("SHA-512", 64, 131), new d(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(a("SHAKE128", 32, 67), new d(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(a("SHAKE256", 64, 131), new d(67108868, "WOTSP_SHAKE256_W16"));
        b = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public d(final int n, final String a) {
        this.a = a;
    }
    
    public static String a(final String s, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("-");
        sb.append(n);
        sb.append("-");
        sb.append(16);
        sb.append("-");
        sb.append(n2);
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        return this.a;
    }
}
