// 
// Decompiled by Procyon v0.6.0
// 

package sh2;

import java.util.List;
import kotlin.collections.EmptyList;
import java.util.Iterator;
import dh2.e$b;
import yh2.c;
import dh2.e;

public final class b implements e
{
    public final c f;
    
    public b(final c f) {
        this.f = f;
    }
    
    public final boolean W(final c c) {
        return e$b.b((e)this, c);
    }
    
    public final boolean isEmpty() {
        return false;
    }
    
    public final Iterator<dh2.c> iterator() {
        return ((List<dh2.c>)EmptyList.INSTANCE).iterator();
    }
    
    public final dh2.c l(final c c) {
        ng2.e.f((Object)c, "fqName");
        Object a;
        if (ng2.e.a((Object)c, (Object)this.f)) {
            a = sh2.a.a;
        }
        else {
            a = null;
        }
        return (dh2.c)a;
    }
}
