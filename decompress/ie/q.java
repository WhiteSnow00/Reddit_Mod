// 
// Decompiled by Procyon v0.6.0
// 

package ie;

import k3.a;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;

public final class q implements p
{
    public final String f;
    public final ArrayList g;
    
    public q(final String f, final ArrayList list) {
        this.f = f;
        (this.g = new ArrayList()).addAll(list);
    }
    
    public final p a() {
        return (p)this;
    }
    
    public final String c() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }
    
    public final Boolean d() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }
    
    public final Iterator e() {
        return null;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q)) {
            return false;
        }
        final q q = (q)o;
        final String f = this.f;
        if (f != null) {
            if (f.equals(q.f)) {
                return this.g.equals(q.g);
            }
        }
        else if (q.f == null) {
            return this.g.equals(q.g);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final String f = this.f;
        int hashCode;
        if (f != null) {
            hashCode = f.hashCode();
        }
        else {
            hashCode = 0;
        }
        return this.g.hashCode() + hashCode * 31;
    }
    
    public final p i(final String s, final a a, final ArrayList list) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }
    
    public final Double u() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }
}
