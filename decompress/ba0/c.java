// 
// Decompiled by Procyon v0.6.0
// 

package ba0;

import java.util.Iterator;
import h.t;
import java.util.Map;
import com.reddit.discoveryunits.ui.DiscoveryUnit;
import hg2.j;
import javax.inject.Inject;
import sg2.e;
import java.util.LinkedHashMap;
import cw0.a;

public final class c
{
    public final a a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    
    @Inject
    public c(final a a) {
        e.f((Object)a, "redditLogger");
        this.a = a;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
    }
    
    public final void a(final String s, final String s2) {
        e.f((Object)s2, "value");
        synchronized (this.b) {
            this.b.put(s, s2);
            final j a = j.a;
        }
    }
    
    public final void b(final DiscoveryUnit discoveryUnit, final String s, final String s2) {
        e.f((Object)s2, "value");
        synchronized (this.c) {
            final LinkedHashMap c = this.c;
            Object value;
            if ((value = c.get(discoveryUnit)) == null) {
                value = new LinkedHashMap<String, String>();
                c.put(discoveryUnit, value);
            }
            ((Map<String, String>)value).put(s, s2);
            final j a = j.a;
        }
    }
    
    public final LinkedHashMap c(final DiscoveryUnit discoveryUnit) {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (this.b) {
            final t t = new t((Map)this.b);
            final Map u = discoveryUnit.u;
            if (u != null) {
                for (final Map.Entry<String, V> entry : u.entrySet()) {
                    final String s = entry.getKey();
                    final String s2 = (String)entry.getValue();
                    final String e = t.e(s2);
                    if (e == null) {
                        final a a = this.a;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("\n              Failed to map discovery unit parameter, missing mapping in template mappings!\n              missing mapping for discovery unit parameter ");
                        sb.append(s);
                        sb.append(" => ");
                        sb.append(s2);
                        sb.append("\n              template mappings => ");
                        sb.append(this.b);
                        sb.append("\n              ");
                        a.b((Throwable)new RuntimeException(kotlin.text.a.x0(sb.toString())));
                        return null;
                    }
                    linkedHashMap.put(s, e);
                }
            }
            return linkedHashMap;
        }
    }
    
    public final String d(final DiscoveryUnit discoveryUnit) {
        synchronized (this.c) {
            Map map;
            if ((map = this.c.get(discoveryUnit)) == null) {
                map = new LinkedHashMap();
            }
            final String e = new t((Map)map).e(discoveryUnit.o);
            if (e == null) {
                synchronized (this.b) {
                    final String e2 = new t((Map)this.b).e(discoveryUnit.o);
                    sg2.e.c((Object)e2);
                    return e2;
                }
            }
            return e;
        }
    }
    
    public final String e(final DiscoveryUnit discoveryUnit) {
        final String j = discoveryUnit.j;
        if (j != null) {
            synchronized (this.b) {
                return new t((Map)this.b).e(j);
            }
        }
        return null;
    }
}
