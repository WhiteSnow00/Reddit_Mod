// 
// Decompiled by Procyon v0.6.0
// 

package ee2;

import kf2.o;
import ff2.y;
import ff2.t;
import com.vanniktech.rxpermission.Permission;
import ff2.z;

public final class a implements z<Object, Permission>
{
    public final /* synthetic */ String[] a;
    public final /* synthetic */ c b;
    
    public a(final c b, final String[] a) {
        this.b = b;
        this.a = a;
    }
    
    public final t a(final t t) {
        final c b = this.b;
        final String[] a = this.a;
        b.getClass();
        for (int length = a.length, i = 0; i < length; ++i) {
            if (!b.b.containsKey(a[i])) {
                final t t2 = t.empty();
                return t.merge((y)t, (y)t2).flatMap((o)new b(b, a));
            }
        }
        final t t2 = t.just(c.c);
        return t.merge((y)t, (y)t2).flatMap((o)new b(b, a));
    }
}
