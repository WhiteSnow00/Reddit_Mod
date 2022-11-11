// 
// Decompiled by Procyon v0.6.0
// 

package uj2;

import tj2.a;

public final class f extends e
{
    public final a c;
    public int d;
    
    public f(final i i, final a c) {
        sg2.e.f((Object)c, "json");
        super(i);
        this.c = c;
    }
    
    public final void a() {
        super.b = true;
        ++this.d;
    }
    
    public final void b() {
        int i = 0;
        super.b = false;
        super.a.c("\n");
        while (i < this.d) {
            final String g = this.c.a.g;
            sg2.e.f((Object)g, "v");
            super.a.c(g);
            ++i;
        }
    }
    
    public final void d() {
        this.c(' ');
    }
    
    public final void e() {
        --this.d;
    }
}
