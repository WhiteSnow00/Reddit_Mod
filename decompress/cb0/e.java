// 
// Decompiled by Procyon v0.6.0
// 

package cb0;

import java.util.Iterator;
import ah2.f;
import qg2.j;
import java.util.List;

public final class e<T> implements i<T>
{
    public final List<i<T>> a;
    
    public e(final i<T>... array) {
        this.a = j.f1((Object[])array);
    }
    
    @Override
    public final List<T> a(List<? extends T> a, final cb0.j<T> j) {
        f.f((Object)a, "items");
        final Iterator<Object> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            a = iterator.next().a(a, (cb0.j<? extends T>)j);
        }
        return (List<T>)a;
    }
}
