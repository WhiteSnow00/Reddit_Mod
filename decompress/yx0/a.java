// 
// Decompiled by Procyon v0.6.0
// 

package yx0;

import ng2.e;
import ry.b;
import mr0.g;
import javax.inject.Provider;
import ne2.d;

public final class a implements d<com.reddit.matrix.data.datasource.remote.a>
{
    public final Provider<g> a;
    public final Provider<zx0.a> b;
    
    public a(final b a, final zx0.b b) {
        this.a = (Provider<g>)a;
        this.b = (Provider<zx0.a>)b;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        e.e(value, "graphQlClient.get()");
        final g g = (g)value;
        final Object value2 = this.b.get();
        e.e(value2, "userMapper.get()");
        return new com.reddit.matrix.data.datasource.remote.a(g, (zx0.a)value2);
    }
}
