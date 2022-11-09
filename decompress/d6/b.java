// 
// Decompiled by Procyon v0.6.0
// 

package d6;

import androidx.work.impl.utils.futures.a;
import c6.i$a;
import androidx.lifecycle.x;
import c6.i;

public final class b implements i
{
    public final x<i$a> c;
    public final a<i$a.c> d;
    
    public b() {
        this.c = new x<i$a>();
        this.d = new a<i$a.c>();
        this.a(i.b);
    }
    
    public final void a(final i$a i$a) {
        this.c.i(i$a);
        if (i$a instanceof i$a.c) {
            this.d.i((i$a.c)i$a);
        }
        else if (i$a instanceof i$a.a) {
            this.d.j(((i$a.a)i$a).a);
        }
    }
}
