// 
// Decompiled by Procyon v0.6.0
// 

package j5;

import java.util.Iterator;
import androidx.room.RoomDatabase;

public abstract class e<T> extends w
{
    public e(final RoomDatabase roomDatabase) {
        super(roomDatabase);
    }
    
    public abstract void d(final n5.e p0, final T p1);
    
    public final void e(final Iterable<? extends T> iterable) {
        final n5.e a = this.a();
        try {
            final Iterator<? extends T> iterator = iterable.iterator();
            while (iterator.hasNext()) {
                this.d(a, iterator.next());
                a.executeInsert();
            }
        }
        finally {
            this.c(a);
        }
    }
    
    public final void f(final T t) {
        final n5.e a = this.a();
        try {
            this.d(a, t);
            a.executeInsert();
        }
        finally {
            this.c(a);
        }
    }
    
    public final void g(final T[] array) {
        final n5.e a = this.a();
        try {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.d(a, array[i]);
                a.executeInsert();
            }
        }
        finally {
            this.c(a);
        }
    }
    
    public final long h(final T t) {
        final n5.e a = this.a();
        try {
            this.d(a, t);
            return a.executeInsert();
        }
        finally {
            this.c(a);
        }
    }
}
