// 
// Decompiled by Procyon v0.6.0
// 

package l6;

import androidx.room.RoomDatabase;
import c6.e;
import java.util.List;
import c6.f;
import java.util.UUID;
import c6.k;

public final class a extends d
{
    public final k g;
    public final UUID h;
    
    public a(final k g, final UUID h) {
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
            f.a(((k)o).b, ((k)o).c, ((k)o).e);
        }
        finally {
            ((RoomDatabase)o).m();
        }
    }
}
