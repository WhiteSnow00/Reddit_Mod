// 
// Decompiled by Procyon v0.6.0
// 

package ia;

import java.util.regex.Pattern;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import mg.d0;
import ha.b;
import java.util.Set;
import ka.d;

public final class a implements d
{
    public static final String c;
    public static final Set<b> d;
    public static final a e;
    public final String a;
    public final String b;
    
    static {
        c = d0.x0("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        final String x0 = d0.x0("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        final String x2 = d0.x0("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        d = Collections.unmodifiableSet((Set<? extends b>)new HashSet<b>(Arrays.asList(new b("proto"), new b("json"))));
        e = new a(x0, x2);
    }
    
    public a(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public static a a(final byte[] array) {
        final String s = new String(array, Charset.forName("UTF-8"));
        if (!s.startsWith("1$")) {
            throw new IllegalArgumentException("Version marker missing from extras");
        }
        final String[] split = s.substring(2).split(Pattern.quote("\\"), 2);
        if (split.length != 2) {
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        final String s2 = split[0];
        if (!s2.isEmpty()) {
            String s3;
            if ((s3 = split[1]).isEmpty()) {
                s3 = null;
            }
            return new a(s2, s3);
        }
        throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
    }
    
    public final byte[] b() {
        final String b = this.b;
        byte[] bytes;
        if (b == null && this.a == null) {
            bytes = null;
        }
        else {
            final String a = this.a;
            String s;
            if ((s = b) == null) {
                s = "";
            }
            bytes = String.format("%s%s%s%s", "1$", a, "\\", s).getBytes(Charset.forName("UTF-8"));
        }
        return bytes;
    }
}
