// 
// Decompiled by Procyon v0.6.0
// 

package xc;

import android.os.BaseBundle;
import com.google.common.collect.ImmutableCollection$a;
import com.google.common.primitives.Ints;
import java.util.Collections;
import java.util.List;
import com.google.common.collect.ImmutableList$a;
import com.google.common.collect.ImmutableList;
import ak0.o;
import java.util.ArrayList;
import java.util.Collection;
import bd.b;
import android.os.Bundle;
import java.util.Map;
import bc.t;
import com.google.common.collect.ImmutableMap;
import ia.c;
import com.google.android.exoplayer2.f;

public final class k implements f
{
    public static final k g;
    public static final c h;
    public final ImmutableMap<t, a> f;
    
    static {
        g = new k(ImmutableMap.of());
        h = new c(9);
    }
    
    public k(final ImmutableMap immutableMap) {
        this.f = (ImmutableMap<t, a>)ImmutableMap.copyOf((Map)immutableMap);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o != null && k.class == o.getClass() && this.f.equals((Object)((k)o).f));
    }
    
    @Override
    public final int hashCode() {
        return this.f.hashCode();
    }
    
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), (ArrayList)b.d((Collection<f>)this.f.values()));
        return bundle;
    }
    
    public static final class a implements f
    {
        public static final o h;
        public final t f;
        public final ImmutableList<Integer> g;
        
        static {
            h = new o(5);
        }
        
        public a(final t f) {
            this.f = f;
            final ImmutableList$a immutableList$a = new ImmutableList$a();
            for (int i = 0; i < f.f; ++i) {
                ((ImmutableCollection$a)immutableList$a).c((Object)i);
            }
            this.g = (ImmutableList<Integer>)immutableList$a.f();
        }
        
        public a(final t f, final List<Integer> list) {
            if (!list.isEmpty() && (Collections.min((Collection<? extends Integer>)list) < 0 || Collections.max((Collection<? extends Integer>)list) >= f.f)) {
                throw new IndexOutOfBoundsException();
            }
            this.f = f;
            this.g = (ImmutableList<Integer>)ImmutableList.copyOf((Collection)list);
        }
        
        @Override
        public final boolean equals(final Object o) {
            boolean b = true;
            if (this == o) {
                return true;
            }
            if (o != null && a.class == o.getClass()) {
                final a a = (a)o;
                if (!this.f.equals(a.f) || !this.g.equals((Object)a.g)) {
                    b = false;
                }
                return b;
            }
            return false;
        }
        
        @Override
        public final int hashCode() {
            return this.g.hashCode() * 31 + this.f.hashCode();
        }
        
        public final Bundle toBundle() {
            final Bundle bundle = new Bundle();
            bundle.putBundle(Integer.toString(0, 36), this.f.toBundle());
            ((BaseBundle)bundle).putIntArray(Integer.toString(1, 36), Ints.v2((Collection)this.g));
            return bundle;
        }
    }
}
