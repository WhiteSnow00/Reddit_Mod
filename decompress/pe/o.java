// 
// Decompiled by Procyon v0.6.0
// 

package pe;

import android.os.BaseBundle;
import java.util.Iterator;
import android.os.Bundle;
import android.text.TextUtils;
import lw0.b;

public final class o
{
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final r f;
    
    public o(final h4 h4, final String s, final String a, final String b, final long d, final long e, final r f) {
        lw0.b.O(a);
        lw0.b.O(b);
        lw0.b.R((Object)f);
        this.a = a;
        this.b = b;
        String c = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            c = null;
        }
        this.c = c;
        this.d = d;
        this.e = e;
        if (e != 0L && e > d) {
            h4.h().n.c((Object)d3.V(a), "Event created with reverse previous/current timestamps. appId, name", (Object)d3.V(b));
        }
        this.f = f;
    }
    
    public o(final h4 h4, final String s, String s2, String b, final long d, final Bundle bundle) {
        lw0.b.O(s2);
        lw0.b.O(b);
        this.a = s2;
        this.b = b;
        s2 = s;
        if (TextUtils.isEmpty((CharSequence)s)) {
            s2 = null;
        }
        this.c = s2;
        this.d = d;
        this.e = 0L;
        r f;
        if (bundle != null && !((BaseBundle)bundle).isEmpty()) {
            final Bundle bundle2 = new Bundle(bundle);
            final Iterator iterator = ((BaseBundle)bundle2).keySet().iterator();
            while (iterator.hasNext()) {
                b = (String)iterator.next();
                if (b == null) {
                    h4.h().k.a("Param name can't be null");
                    iterator.remove();
                }
                else {
                    final Object q = h4.y().Q(((BaseBundle)bundle2).get(b), b);
                    if (q == null) {
                        h4.h().n.b((Object)h4.r.e(b), "Param value can't be null");
                        iterator.remove();
                    }
                    else {
                        h4.y().d0(bundle2, b, q);
                    }
                }
            }
            f = new r(bundle2);
        }
        else {
            f = new r(new Bundle());
        }
        this.f = f;
    }
    
    public final o a(final h4 h4, final long n) {
        return new o(h4, this.c, this.a, this.b, this.d, n, this.f);
    }
    
    @Override
    public final String toString() {
        return a.o(d.r("Event{appId='", this.a, "', name='", this.b, "', params="), this.f.toString(), "}");
    }
}
