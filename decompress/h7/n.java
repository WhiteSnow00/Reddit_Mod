// 
// Decompiled by Procyon v0.6.0
// 

package h7;

import kotlin.collections.c;
import kotlin.collections.EmptySet;
import aw.b;
import sg2.e;
import com.apollographql.apollo.api.a;
import java.util.Map;
import java.util.Set;
import java.util.List;

public final class n<T>
{
    public final k<?, ?, ?> a;
    public final T b;
    public final List<f> c;
    public final Set<String> d;
    public final boolean e;
    public final Map<String, Object> f;
    public final com.apollographql.apollo.api.a g;
    
    public n() {
        throw null;
    }
    
    public n(final k<?, ?, ?> a, final T b, final List<f> c, final Set<String> d, final boolean e, final Map<String, ?> f, final com.apollographql.apollo.api.a g) {
        sg2.e.g((Object)a, "operation");
        sg2.e.g((Object)d, "dependentKeys");
        sg2.e.g((Object)f, "extensions");
        sg2.e.g((Object)g, "executionContext");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (Map<String, Object>)f;
        this.g = g;
    }
    
    public final boolean a() {
        final List<f> c = this.c;
        return (c == null || c.isEmpty()) ^ true;
    }
    
    public final a<T> b() {
        final a a = new a(this.a);
        a.b = (T)this.b;
        a.c = this.c;
        a.d = this.d;
        a.e = this.e;
        a.f = this.f;
        final com.apollographql.apollo.api.a g = this.g;
        sg2.e.g((Object)g, "executionContext");
        a.g = g;
        return a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof n)) {
            return false;
        }
        final k<?, ?, ?> a = this.a;
        final n n = (n)o;
        return sg2.e.a((Object)a, (Object)n.a) && sg2.e.a((Object)this.b, (Object)n.b) && sg2.e.a((Object)this.c, (Object)n.c) && sg2.e.a((Object)this.d, (Object)n.d) && this.e == n.e && sg2.e.a((Object)this.f, (Object)n.f) && sg2.e.a((Object)this.g, (Object)n.g);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final T b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final List<f> c = this.c;
        if (c != null) {
            hashCode2 = c.hashCode();
        }
        return this.f.hashCode() + (Boolean.hashCode(this.e) + aw.b.d((Set)this.d, ((hashCode * 31 + hashCode3) * 31 + hashCode2) * 31, 31)) * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("Response(operation=");
        r.append(this.a);
        r.append(", data=");
        r.append(this.b);
        r.append(", errors=");
        r.append(this.c);
        r.append(", dependentKeys=");
        r.append(this.d);
        r.append(", isFromCache=");
        r.append(this.e);
        r.append(", extensions=");
        r.append(this.f);
        r.append(", executionContext=");
        r.append(this.g);
        r.append(')');
        return r.toString();
    }
    
    public static final class a<T>
    {
        public final k<?, ?, ?> a;
        public T b;
        public List<f> c;
        public Set<String> d;
        public boolean e;
        public Map<String, ?> f;
        public com.apollographql.apollo.api.a g;
        
        public a(final k<?, ?, ?> a) {
            e.g((Object)a, "operation");
            this.a = a;
            final int a2 = com.apollographql.apollo.api.a.a;
            this.g = (com.apollographql.apollo.api.a)d.b;
        }
        
        public final n<T> a() {
            final k<?, ?, ?> a = this.a;
            final T b = this.b;
            final List<f> c = this.c;
            Object o = this.d;
            if (o == null) {
                o = EmptySet.INSTANCE;
            }
            final boolean e = this.e;
            Map<String, ?> map = this.f;
            if (map == null) {
                map = kotlin.collections.c.V0();
            }
            return new n<T>(a, b, c, (Set<String>)o, e, map, this.g);
        }
    }
}
