// 
// Decompiled by Procyon v0.6.0
// 

package jc;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.google.android.exoplayer2.n;

public final class e
{
    public final int a;
    public final int b;
    public final n c;
    public final ImmutableMap<String, String> d;
    
    public e(final n c, final int a, final int b, final ImmutableMap immutableMap) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (ImmutableMap<String, String>)ImmutableMap.copyOf((Map)immutableMap);
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o != null && e.class == o.getClass()) {
            final e e = (e)o;
            if (this.a != e.a || this.b != e.b || !this.c.equals((Object)e.c) || !this.d.equals((Object)e.d)) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() + ((217 + this.a) * 31 + this.b) * 31) * 31;
    }
}
