// 
// Decompiled by Procyon v0.6.0
// 

package ye2;

import rg.f$a;
import java.util.Arrays;
import rg.f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

public final class a
{
    public static final a i;
    public Executor a;
    public String b;
    public String c;
    public Object[][] d;
    public List<Object> e;
    public Boolean f;
    public Integer g;
    public Integer h;
    
    static {
        i = new a();
    }
    
    public a() {
        this.e = Collections.emptyList();
        this.d = new Object[0][2];
    }
    
    public a(final a a) {
        this.e = Collections.emptyList();
        this.b = a.b;
        this.a = a.a;
        this.c = a.c;
        this.d = a.d;
        this.f = a.f;
        this.g = a.g;
        this.h = a.h;
        this.e = a.e;
    }
    
    @Override
    public final String toString() {
        final f$a b = rg.f.b((Object)this);
        Object class1 = null;
        b.b((Object)null, "deadline");
        b.b((Object)this.b, "authority");
        b.b((Object)null, "callCredentials");
        final Executor a = this.a;
        if (a != null) {
            class1 = a.getClass();
        }
        b.b(class1, "executor");
        b.b((Object)this.c, "compressorName");
        b.b((Object)Arrays.deepToString(this.d), "customOptions");
        b.c(String.valueOf(Boolean.TRUE.equals(this.f)), "waitForReady");
        b.b((Object)this.g, "maxInboundMessageSize");
        b.b((Object)this.h, "maxOutboundMessageSize");
        b.b((Object)this.e, "streamTracerFactories");
        return b.toString();
    }
}
