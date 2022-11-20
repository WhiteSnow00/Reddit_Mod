// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import java.util.RandomAccess;
import java.util.AbstractList;

public final class w1 extends AbstractList implements RandomAccess, i0
{
    public final i0 f;
    
    public w1(final i0 f) {
        this.f = f;
    }
    
    public final void P(final zzaau zzaau) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final /* bridge */ Object get(final int n) {
        return ((h0)this.f).d(n);
    }
    
    @Override
    public final Iterator iterator() {
        return (Iterator)new v1(this);
    }
    
    @Override
    public final ListIterator listIterator(final int n) {
        return (ListIterator)new u1(this, n);
    }
    
    public final int size() {
        return ((List)this.f).size();
    }
    
    public final i0 t() {
        return (i0)this;
    }
    
    public final List v() {
        return this.f.v();
    }
    
    public final Object w(final int n) {
        return this.f.w(n);
    }
}
