// 
// Decompiled by Procyon v0.6.0
// 

package j5;

import java.util.Iterator;
import n5.e;
import androidx.room.RoomDatabase;

public abstract class d<T> extends w
{
    public d(final RoomDatabase roomDatabase) {
        super(roomDatabase);
    }
    
    public abstract void d(final e p0, final T p1);
    
    public final int e(final T t) {
        final e a = this.a();
        try {
            this.d(a, t);
            return a.executeUpdateDelete();
        }
        finally {
            this.c(a);
        }
    }
    
    public final int f(final Iterable<? extends T> iterable) {
        final e a = this.a();
        try {
            final Iterator<? extends T> iterator = iterable.iterator();
            int n = 0;
            while (iterator.hasNext()) {
                this.d(a, iterator.next());
                n += a.executeUpdateDelete();
            }
            return n;
        }
        finally {
            this.c(a);
        }
    }
}
