// 
// Decompiled by Procyon v0.6.0
// 

package h60;

import android.database.Cursor;
import java.util.ArrayList;
import l5.c;
import j5.o;
import java.util.List;
import java.util.concurrent.Callable;

public final class z implements Callable<List<String>>
{
    public final /* synthetic */ o f;
    public final /* synthetic */ y g;
    
    public z(final y g, final o f) {
        this.g = g;
        this.f = f;
    }
    
    @Override
    public final Object call() throws Exception {
        final Cursor b = c.b(this.g.f, this.f, false);
        try {
            final ArrayList list = new ArrayList<String>(b.getCount());
            while (b.moveToNext()) {
                String string;
                if (b.isNull(0)) {
                    string = null;
                }
                else {
                    string = b.getString(0);
                }
                list.add(string);
            }
            return list;
        }
        finally {
            b.close();
        }
    }
    
    public final void finalize() {
        this.f.h();
    }
}
