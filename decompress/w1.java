// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import r20.d;
import kj2.j;
import java.util.Locale;
import java.util.TimeZone;
import java.util.List;
import javax.inject.Inject;
import ah2.f;
import d60.e;
import r20.a;
import ge0.b0;

public final class w1 implements b0
{
    public final a a;
    public final e b;
    
    @Inject
    public w1(final a a, final e b) {
        f.f((Object)a, "backgroundThread");
        f.f((Object)b, "remote");
        this.a = a;
        this.b = b;
    }
    
    public final nf2.a a(final String s, final String s2, final List list, String id) {
        f.f((Object)list, "authTokens");
        f.f((Object)s, "pushToken");
        final long currentTimeMillis = System.currentTimeMillis();
        id = TimeZone.getDefault().getID();
        final String string = Locale.getDefault().toString();
        f.e((Object)string, "getDefault().toString()");
        final String a2 = j.a2(string, "_", "-", false);
        final e b = this.b;
        f.e((Object)id, "timezoneName");
        return o72.f.t(b.a(list, s, s2, currentTimeMillis, id, a2), (d)this.a);
    }
}
