// 
// Decompiled by Procyon v0.6.0
// 

package s1;

import q1.e;
import cg2.j;
import mg2.a;

public abstract class f
{
    public a<j> a;
    
    public abstract void a(final e p0);
    
    public a<j> b() {
        return this.a;
    }
    
    public final void c() {
        final a<j> b = this.b();
        if (b != null) {
            b.invoke();
        }
    }
    
    public void d(final a<j> a) {
        this.a = a;
    }
}
