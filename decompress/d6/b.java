// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import androidx.work.impl.utils.futures.a;
import androidx.lifecycle.x;
import c6.j;

public final class b implements j
{
    public final x<j.a> c;
    public final a<c> d;
    
    public b() {
        this.c = (x<j.a>)new x();
        this.d = (a<c>)new a();
        this.a((j.a)j.b);
    }
    
    public final void a(final j.a a) {
        this.c.i((Object)a);
        if (a instanceof c) {
            this.d.i((Object)a);
        }
        else if (a instanceof j.a.a) {
            this.d.j(((j.a.a)a).a);
        }
    }
}
