// 
// Decompiled by Procyon v0.6.0
// 

package tc;

import com.google.common.collect.ImmutableSet;
import java.util.regex.Pattern;

public final class b
{
    public static final Pattern d;
    public static final ImmutableSet<String> e;
    public static final ImmutableSet<String> f;
    public static final ImmutableSet<String> g;
    public static final ImmutableSet<String> h;
    public final int a;
    public final int b;
    public final int c;
    
    static {
        d = Pattern.compile("\\s+");
        e = ImmutableSet.of((Object)"auto", (Object)"none");
        f = ImmutableSet.of((Object)"dot", (Object)"sesame", (Object)"circle");
        g = ImmutableSet.of((Object)"filled", (Object)"open");
        h = ImmutableSet.of((Object)"after", (Object)"before", (Object)"outside");
    }
    
    public b(final int a, final int b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
