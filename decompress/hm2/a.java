// 
// Decompiled by Procyon v0.6.0
// 

package hm2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a
{
    public static final Map<String, a> c;
    public final int a;
    public final String b;
    
    static {
        final HashMap hashMap = new HashMap();
        al0.a.w(1, "XMSSMT_SHA2_20/2_256", hashMap, a("SHA-256", 32, 16, 67, 20, 2));
        al0.a.w(2, "XMSSMT_SHA2_20/4_256", hashMap, a("SHA-256", 32, 16, 67, 20, 4));
        al0.a.w(3, "XMSSMT_SHA2_40/2_256", hashMap, a("SHA-256", 32, 16, 67, 40, 2));
        al0.a.w(4, "XMSSMT_SHA2_40/4_256", hashMap, a("SHA-256", 32, 16, 67, 40, 2));
        al0.a.w(5, "XMSSMT_SHA2_40/8_256", hashMap, a("SHA-256", 32, 16, 67, 40, 4));
        al0.a.w(6, "XMSSMT_SHA2_60/3_256", hashMap, a("SHA-256", 32, 16, 67, 60, 8));
        al0.a.w(7, "XMSSMT_SHA2_60/6_256", hashMap, a("SHA-256", 32, 16, 67, 60, 6));
        al0.a.w(8, "XMSSMT_SHA2_60/12_256", hashMap, a("SHA-256", 32, 16, 67, 60, 12));
        al0.a.w(9, "XMSSMT_SHA2_20/2_512", hashMap, a("SHA-512", 64, 16, 131, 20, 2));
        al0.a.w(10, "XMSSMT_SHA2_20/4_512", hashMap, a("SHA-512", 64, 16, 131, 20, 4));
        al0.a.w(11, "XMSSMT_SHA2_40/2_512", hashMap, a("SHA-512", 64, 16, 131, 40, 2));
        al0.a.w(12, "XMSSMT_SHA2_40/4_512", hashMap, a("SHA-512", 64, 16, 131, 40, 4));
        al0.a.w(13, "XMSSMT_SHA2_40/8_512", hashMap, a("SHA-512", 64, 16, 131, 40, 8));
        al0.a.w(14, "XMSSMT_SHA2_60/3_512", hashMap, a("SHA-512", 64, 16, 131, 60, 3));
        al0.a.w(15, "XMSSMT_SHA2_60/6_512", hashMap, a("SHA-512", 64, 16, 131, 60, 6));
        al0.a.w(16, "XMSSMT_SHA2_60/12_512", hashMap, a("SHA-512", 64, 16, 131, 60, 12));
        al0.a.w(17, "XMSSMT_SHAKE_20/2_256", hashMap, a("SHAKE128", 32, 16, 67, 20, 2));
        al0.a.w(18, "XMSSMT_SHAKE_20/4_256", hashMap, a("SHAKE128", 32, 16, 67, 20, 4));
        al0.a.w(19, "XMSSMT_SHAKE_40/2_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 2));
        al0.a.w(20, "XMSSMT_SHAKE_40/4_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 4));
        al0.a.w(21, "XMSSMT_SHAKE_40/8_256", hashMap, a("SHAKE128", 32, 16, 67, 40, 8));
        al0.a.w(22, "XMSSMT_SHAKE_60/3_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 3));
        al0.a.w(23, "XMSSMT_SHAKE_60/6_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 6));
        al0.a.w(24, "XMSSMT_SHAKE_60/12_256", hashMap, a("SHAKE128", 32, 16, 67, 60, 12));
        al0.a.w(25, "XMSSMT_SHAKE_20/2_512", hashMap, a("SHAKE256", 64, 16, 131, 20, 2));
        al0.a.w(26, "XMSSMT_SHAKE_20/4_512", hashMap, a("SHAKE256", 64, 16, 131, 20, 4));
        al0.a.w(27, "XMSSMT_SHAKE_40/2_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 2));
        al0.a.w(28, "XMSSMT_SHAKE_40/4_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 4));
        al0.a.w(29, "XMSSMT_SHAKE_40/8_512", hashMap, a("SHAKE256", 64, 16, 131, 40, 8));
        al0.a.w(30, "XMSSMT_SHAKE_60/3_512", hashMap, a("SHAKE256", 64, 16, 131, 60, 3));
        al0.a.w(31, "XMSSMT_SHAKE_60/6_512", hashMap, a("SHAKE256", 64, 16, 131, 60, 6));
        hashMap.put(a("SHAKE256", 64, 16, 131, 60, 12), new a(32, "XMSSMT_SHAKE_60/12_512"));
        c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
    }
    
    public a(final int a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static String a(final String s, final int n, final int n2, final int n3, final int n4, final int n5) {
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
        sb.append("-");
        sb.append(n5);
        return sb.toString();
    }
    
    @Override
    public final String toString() {
        return this.b;
    }
}
