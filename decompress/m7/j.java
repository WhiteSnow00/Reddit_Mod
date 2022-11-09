// 
// Decompiled by Procyon v0.6.0
// 

package m7;

import java.util.Iterator;
import mk2.e;
import java.util.LinkedHashSet;
import ah2.f;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.Map;

public final class j
{
    public final String a;
    public final Map<String, Object> b;
    public volatile UUID c;
    public int d;
    
    public j(final String a, final LinkedHashMap b, final UUID c) {
        f.g((Object)a, "key");
        f.g((Object)b, "_fields");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = -1;
    }
    
    public final LinkedHashSet a(final j j) {
        f.g((Object)j, "otherRecord");
        final LinkedHashSet set = new LinkedHashSet();
        for (final Map.Entry<String, V> entry : j.b.entrySet()) {
            final String s = entry.getKey();
            final V value = entry.getValue();
            final boolean containsKey = this.b.containsKey(s);
            final Object value2 = this.b.get(s);
            if (!containsKey || !f.a(value2, (Object)value)) {
                this.b.put(s, value);
                final StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append('.');
                sb.append(s);
                set.add(sb.toString());
                synchronized (this) {
                    final int d = this.d;
                    if (d == -1) {
                        continue;
                    }
                    this.d = e.Q((Object)value) - e.Q(value2) + d;
                    continue;
                }
                break;
            }
        }
        this.c = j.c;
        return set;
    }
    
    public final j.j$a b() {
        return new j.j$a(this.a, (Map)this.b, this.c);
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("Record(key='");
        k.append(this.a);
        k.append("', fields=");
        k.append(this.b);
        k.append(", mutationId=");
        k.append(this.c);
        k.append(')');
        return k.toString();
    }
}
