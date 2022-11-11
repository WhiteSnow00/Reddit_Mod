// 
// Decompiled by Procyon v0.6.0
// 

package d9;

import java.util.Iterator;
import k9.j;
import java.util.Map;
import java.util.Collections;
import java.util.WeakHashMap;
import java.util.ArrayList;
import g9.c;
import java.util.Set;

public final class o
{
    public final Set<c> a;
    public final ArrayList b;
    public boolean c;
    
    public o() {
        this.a = Collections.newSetFromMap(new WeakHashMap<c, Boolean>());
        this.b = new ArrayList();
    }
    
    public final boolean a(final c c) {
        final boolean b = true;
        if (c == null) {
            return true;
        }
        final boolean remove = this.a.remove(c);
        boolean b2 = b;
        if (!this.b.remove(c)) {
            b2 = (remove && b);
        }
        if (b2) {
            c.clear();
        }
        return b2;
    }
    
    public final void b() {
        for (final c c : j.e((Set)this.a)) {
            if (!c.d() && !c.c()) {
                c.clear();
                if (!this.c) {
                    c.j();
                }
                else {
                    this.b.add(c);
                }
            }
        }
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{numRequests=");
        sb.append(this.a.size());
        sb.append(", isPaused=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
