// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import java.util.List;
import java.util.Map;
import h1.b$a;
import ah2.f;
import h1.c;
import pg2.j;
import zg2.a;
import h1.b;

public final class i0 implements b
{
    public final a<j> a;
    public final /* synthetic */ b b;
    
    public i0(final c b, final a a) {
        this.a = (a<j>)a;
        this.b = (b)b;
    }
    
    public final boolean a(final Object o) {
        f.f(o, "value");
        return this.b.a(o);
    }
    
    public final b$a b(final String s, final a<?> a) {
        f.f((Object)s, "key");
        return this.b.b(s, (a)a);
    }
    
    public final Map<String, List<Object>> c() {
        return this.b.c();
    }
    
    public final Object d(final String s) {
        f.f((Object)s, "key");
        return this.b.d(s);
    }
}
