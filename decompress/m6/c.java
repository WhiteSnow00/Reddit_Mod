// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import androidx.work.impl.WorkDatabase;
import androidx.room.RoomDatabase;
import java.util.Iterator;
import java.util.List;
import d6.e;
import l6.t;
import d6.j;

public final class c extends d
{
    public final /* synthetic */ j g;
    public final /* synthetic */ String h;
    public final /* synthetic */ boolean i;
    
    public c(final j g, final String h, final boolean i) {
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
                e.a(((j)o).b, ((j)o).c, (List)((j)o).e);
            }
        }
        finally {
            ((RoomDatabase)o).m();
        }
    }
}