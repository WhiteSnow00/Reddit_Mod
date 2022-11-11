// 
// Decompiled by Procyon v0.6.0
// 

package uj2;

import java.util.Map;
import kotlin.collections.c;
import tj2.j;
import tj2.g;
import kotlin.collections.CollectionsKt___CollectionsKt;
import sg2.e;
import tj2.a;
import java.util.List;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.internal.JsonTreeDecoder;

public final class k extends JsonTreeDecoder
{
    public final JsonObject j;
    public final List<String> k;
    public final int l;
    public int m;
    
    public k(final a a, final JsonObject j) {
        e.f((Object)a, "json");
        e.f((Object)j, "value");
        super(a, j, (String)null, (qj2.e)null);
        this.j = j;
        final List q4 = CollectionsKt___CollectionsKt.q4((Iterable)j.keySet());
        this.k = q4;
        this.l = q4.size() * 2;
        this.m = -1;
    }
    
    public final g O(final String s) {
        e.f((Object)s, "tag");
        Object o;
        if (this.m % 2 == 0) {
            o = new j(s, true);
        }
        else {
            o = c.W0((Map)this.j, (Object)s);
        }
        return (g)o;
    }
    
    public final String Q(final qj2.e e, int n) {
        e.f((Object)e, "desc");
        n /= 2;
        return this.k.get(n);
    }
    
    public final g T() {
        return this.j;
    }
    
    public final JsonObject V() {
        return this.j;
    }
    
    public final void d(final qj2.e e) {
        e.f((Object)e, "descriptor");
    }
    
    public final int e(final qj2.e e) {
        e.f((Object)e, "descriptor");
        int m = this.m;
        if (m < this.l - 1) {
            ++m;
            return this.m = m;
        }
        return -1;
    }
}
