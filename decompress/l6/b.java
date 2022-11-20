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

public final class b extends d
{
    public final k g;
    public final String h;
    
    public b(final k g, final String h) {
        this.g = g;
        this.h = h;
    }
    
    public final void b() {
        Object o = this.g.c;
        ((RoomDatabase)o).c();
        try {
            final Iterator iterator = ((t)((WorkDatabase)o).x()).j(this.h).iterator();
            while (iterator.hasNext()) {
                d.a(this.g, (String)iterator.next());
            }
            ((RoomDatabase)o).q();
            ((RoomDatabase)o).m();
            o = this.g;
            f.a(((k)o).b, ((k)o).c, ((k)o).e);
        }
        finally {
            ((RoomDatabase)o).m();
        }
    }
}
