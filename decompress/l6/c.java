// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import androidx.work.impl.WorkDatabase;
import androidx.room.RoomDatabase;
import java.util.Iterator;
import c6.e;
import java.util.List;
import c6.f;
import k6.t;
import c6.k;

public final class c extends d
{
    public final k g;
    public final String h;
    public final boolean i;
    
    public c(final k g, final String h, final boolean i) {
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public final void b() {
        Object o = this.g.c;
        ((RoomDatabase)o).c();
        try {
            final Iterator iterator = ((t)((WorkDatabase)o).x()).i(this.h).iterator();
            while (iterator.hasNext()) {
                d.a(this.g, (String)iterator.next());
            }
            ((RoomDatabase)o).q();
            ((RoomDatabase)o).m();
            if (this.i) {
                o = this.g;
                f.a(((k)o).b, ((k)o).c, ((k)o).e);
            }
        }
        finally {
            ((RoomDatabase)o).m();
        }
    }
}
