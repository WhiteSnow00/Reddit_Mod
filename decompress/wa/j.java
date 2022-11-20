// 
// Decompiled by Procyon v0.6.0
// 

package wa;

import xc.d$d;
import xc.a$b;
import com.google.android.exoplayer2.source.d;
import db.f;
import android.content.Context;

public final class j implements sg.j
{
    public final int f;
    public final Context g;
    
    public j(final Context g, final int f) {
        this.f = f;
        this.g = g;
    }
    
    public final Object get() {
        switch (this.f) {
            default: {
                return new d(this.g, new f());
            }
            case 0: {
                final Context g = this.g;
                final a$b a$b = new a$b();
                final xc.d.c u = xc.d.c.U;
                return new xc.d(new xc.d.c(new d$d(g)), a$b);
            }
        }
    }
}
