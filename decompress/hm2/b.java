// 
// Decompiled by Procyon v0.6.0
// 

package hm2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b
{
    public static final Map<String, b> c;
    public final int a;
    public final String b;
    
    static {
        final HashMap hashMap = new HashMap();
        hashMap.put(a("SHA-256", 32, 16, 67, 10), new b(1, "XMSS_SHA2_10_256"));
        hashMap.put(a("SHA-256", 32, 16, 67, 16), new b(2, "XMSS_SHA2_16_256"));
        hashMap.put(a("SHA-256", 32, 16, 67, 20), new b(3, "XMSS_SHA2_20_256"));
        hashMap.put(a("SHA-512", 64, 16, 131, 10), new b(4, "XMSS_SHA2_10_512"));
        hashMap.put(a("SHA-512", 64, 16, 131, 16), new b(5, "XMSS_SHA2_16_512"));
        hashMap.put(a("SHA-512", 64, 16, 131, 20), new b(6, "XMSS_SHA2_20_512"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 10), new b(7, "XMSS_SHAKE_10_256"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 16), new b(8, "XMSS_SHAKE_16_256"));
        hashMap.put(a("SHAKE128", 32, 16, 67, 20), new b(9, "XMSS_SHAKE_20_256"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 10), new b(10, "XMSS_SHAKE_10_512"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 16), new b(11, "XMSS_SHAKE_16_512"));
        hashMap.put(a("SHAKE256", 64, 16, 131, 20), new b(12, "XMSS_SHAKE_20_512"));
        c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public b(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static String a(final String s, final int n, final int n2, final int n3, final int n4) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("-");
        sb.append(n);
        sb.append("-");
        sb.append(n2);
        sb.append("-");
        sb.append(n3);
        sb.append("-");
        sb.append(n4);
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
}
