// 
// Decompiled by Procyon v0.6.0
// 

package he;

import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import com.google.android.gms.internal.firebase_auth_api.g;
import java.util.Collection;
import com.google.android.gms.internal.firebase-auth-api.zzaau;
import java.util.ArrayList;
import java.util.RandomAccess;

public final class h0 extends c implements RandomAccess, i0
{
    public final ArrayList g;
    
    static {
        new h0(10).f = false;
    }
    
    public h0() {
        this(10);
    }
    
    public h0(final int n) {
        final ArrayList g = new ArrayList(n);
        this.g = g;
    }
    
    public h0(final ArrayList g) {
        this.g = g;
    }
    
    public final void P(final zzaau zzaau) {
        this.a();
        this.g.add(zzaau);
        ++((AbstractList)this).modCount;
    }
    
    public final /* bridge */ void add(final int n, final Object o) {
        final String s = (String)o;
        this.a();
        this.g.add(n, s);
        ++((AbstractList)this).modCount;
    }
    
    public final boolean addAll(final int n, final Collection collection) {
        this.a();
        Collection v = collection;
        if (collection instanceof i0) {
            v = ((i0)collection).v();
        }
        final boolean addAll = this.g.addAll(n, v);
        ++((AbstractList)this).modCount;
        return addAll;
    }
    
    public final boolean addAll(final Collection collection) {
        return this.addAll(this.size(), collection);
    }
    
    public final void clear() {
        this.a();
        this.g.clear();
        ++((AbstractList)this).modCount;
    }
    
    public final String d(final int n) {
        final Object value = this.g.get(n);
        if (value instanceof String) {
            return (String)value;
        }
        if (value instanceof com.google.android.gms.internal.firebase_auth_api.zzaau) {
            final com.google.android.gms.internal.firebase_auth_api.zzaau zzaau = (com.google.android.gms.internal.firebase_auth_api.zzaau)value;
            final String zzr = zzaau.zzr(f0.a);
            if (zzaau.zzk()) {
                this.g.set(n, zzr);
            }
            return zzr;
        }
        final byte[] array = (byte[])value;
        final String s = new String(array, f0.a);
        final d2 a = com.google.android.gms.internal.firebase_auth_api.g.a;
        final int length = array.length;
        a.getClass();
        if (c2.a(0, length, array)) {
            this.g.set(n, s);
        }
        return s;
    }
    
    public final /* bridge */ Object get(final int n) {
        return this.d(n);
    }
    
    public final /* bridge */ e0 h(final int n) {
        if (n >= this.size()) {
            final ArrayList list = new ArrayList(n);
            list.addAll(this.g);
            return (e0)new h0(list);
        }
        throw new IllegalArgumentException();
    }
    
    public final Object remove(final int n) {
        this.a();
        final Object remove = this.g.remove(n);
        ++((AbstractList)this).modCount;
        String zzr;
        if (remove instanceof String) {
            zzr = (String)remove;
        }
        else if (remove instanceof com.google.android.gms.internal.firebase_auth_api.zzaau) {
            zzr = ((com.google.android.gms.internal.firebase_auth_api.zzaau)remove).zzr(f0.a);
        }
        else {
            zzr = new String((byte[])remove, f0.a);
        }
        return zzr;
    }
    
    public final Object set(final int n, Object set) {
        final String s = (String)set;
        this.a();
        set = this.g.set(n, s);
        String zzr;
        if (set instanceof String) {
            zzr = (String)set;
        }
        else if (set instanceof com.google.android.gms.internal.firebase_auth_api.zzaau) {
            zzr = ((com.google.android.gms.internal.firebase_auth_api.zzaau)set).zzr(f0.a);
        }
        else {
            zzr = new String((byte[])set, f0.a);
        }
        return zzr;
    }
    
    public final int size() {
        return this.g.size();
    }
    
    public final i0 t() {
        if (super.f) {
            return (i0)new w1((i0)this);
        }
        return (i0)this;
    }
    
    public final List v() {
        return Collections.unmodifiableList((List<?>)this.g);
    }
    
    public final Object w(final int n) {
        return this.g.get(n);
    }
}
