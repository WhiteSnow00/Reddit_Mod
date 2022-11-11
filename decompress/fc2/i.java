// 
// Decompiled by Procyon v0.6.0
// 

package fc2;

import java.util.Map;
import java.util.Set;
import com.sendbird.android.shadow.com.google.gson.internal.LinkedTreeMap;

public final class i extends g
{
    public final LinkedTreeMap<String, g> f;
    
    public i() {
        this.f = new LinkedTreeMap<String, g>();
    }
    
    public final void F(final String s, final g g) {
        g f = g;
        if (g == null) {
            f = h.f;
        }
        this.f.put(s, f);
    }
    
    public final void I(final Boolean b, final String s) {
        g f;
        if (b == null) {
            f = h.f;
        }
        else {
            f = new k((Object)b);
        }
        this.F(s, f);
    }
    
    public final void J(final String s, final Number n) {
        g f;
        if (n == null) {
            f = h.f;
        }
        else {
            f = new k((Object)n);
        }
        this.F(s, f);
    }
    
    public final void K(final String s, final String s2) {
        g f;
        if (s2 == null) {
            f = h.f;
        }
        else {
            f = new k((Object)s2);
        }
        this.F(s, f);
    }
    
    public final g L(final String s) {
        return this.f.get(s);
    }
    
    public final f M(final String s) {
        return this.f.get(s);
    }
    
    public final i N(final String s) {
        return this.f.get(s);
    }
    
    public final boolean P(final String s) {
        return this.f.containsKey(s);
    }
    
    public final Set<Map.Entry<String, g>> entrySet() {
        return this.f.entrySet();
    }
    
    public final boolean equals(final Object o) {
        return o == this || (o instanceof i && ((i)o).f.equals(this.f));
    }
    
    public final int hashCode() {
        return this.f.hashCode();
    }
}
