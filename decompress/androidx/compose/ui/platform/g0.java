// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import h1.b$a;
import java.util.List;
import java.util.Map;
import ng2.e;
import h1.c;
import cg2.j;
import mg2.a;
import h1.b;

public final class g0 implements b
{
    public final a<j> a;
    public final b b;
    
    public g0(final c b, final a a) {
        this.a = (a<j>)a;
        this.b = (b)b;
    }
    
    public final boolean a(final Object o) {
        e.f(o, "value");
        return this.b.a(o);
    }
    
    public final Map<String, List<Object>> b() {
        return this.b.b();
    }
    
    public final b$a c(final String s, final a<?> a) {
        e.f((Object)s, "key");
        return this.b.c(s, (a)a);
    }
    
    public final Object e(final String s) {
        e.f((Object)s, "key");
        return this.b.e(s);
    }
}
