// 
// Decompiled by Procyon v0.6.0
// 

package m6;

import androidx.room.RoomDatabase;
import java.util.List;
import d6.e;
import java.util.UUID;
import d6.j;

public final class a extends d
{
    public final /* synthetic */ j g;
    public final /* synthetic */ UUID h;
    
    public a(final j g, final UUID h) {
        this.g = g;
        this.h = h;
    }
    
    public final void b() {
        Object o = this.g.c;
        ((RoomDatabase)o).c();
        try {
            d.a(this.g, this.h.toString());
            ((RoomDatabase)o).q();
            ((RoomDatabase)o).m();
            o = this.g;
            e.a(((j)o).b, ((j)o).c, (List)((j)o).e);
        }
        finally {
            ((RoomDatabase)o).m();
        }
    }
}
