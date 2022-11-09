// 
// Decompiled by Procyon v0.6.0
// 

package bc;

import java.util.List;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import android.os.Bundle;
import wi.b;
import com.google.common.collect.ImmutableList;
import sa.k;
import com.google.android.exoplayer2.f;

public final class u implements f
{
    public static final u i;
    public static final k j;
    public final int f;
    public final ImmutableList<t> g;
    public int h;
    
    static {
        i = new u(new t[0]);
        j = new k(10);
    }
    
    public u(final t... array) {
        this.g = (ImmutableList<t>)ImmutableList.copyOf((Object[])array);
        this.f = array.length;
        int n;
        for (int i = 0; i < ((AbstractCollection)this.g).size(); i = n) {
            int j;
            for (n = (j = i + 1); j < ((AbstractCollection)this.g).size(); ++j) {
                if (((List<t>)this.g).get(i).equals(this.g.get(j))) {
                    b.C("TrackGroupArray", "", (Throwable)new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
        }
    }
    
    public final t a(final int n) {
        return ((List<t>)this.g).get(n);
    }
    
    public final int b(final t t) {
        int index = this.g.indexOf((Object)t);
        if (index < 0) {
            index = -1;
        }
        return index;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && u.class == o.getClass()) {
            final u u = (u)o;
            if (this.f != u.f || !this.g.equals((Object)u.g)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        if (this.h == 0) {
            this.h = this.g.hashCode();
        }
        return this.h;
    }
    
    public final Bundle toBundle() {
        final Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(Integer.toString(0, 36), (ArrayList)bd.b.d((Collection<f>)this.g));
        return bundle;
    }
}
