// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import nf2.n;
import ah2.f;
import com.reddit.domain.model.listing.Listing;
import nf2.c0;
import zg2.q;
import zg2.p;
import tt.d;

public final class l implements d
{
    public final /* synthetic */ int a;
    public final p b;
    public final pg2.d c;
    
    public l(final zg2.l c, final p b) {
        this.a = 0;
        this.b = b;
        this.c = (pg2.d)c;
    }
    
    public l(final q c, final p b) {
        this.a = 1;
        this.c = (pg2.d)c;
        this.b = b;
    }
    
    public final c0 b(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final o2 o3 = (o2)o;
                final Listing listing = (Listing)o2;
                f.f((Object)o3, "key");
                f.f((Object)listing, "links");
                final q q = (q)this.c;
                final String k = o3.k;
                f.c((Object)k);
                return (c0)q.invoke((Object)listing, (Object)k, (Object)o3.d);
            }
            case 0: {
                final k i = (k)o;
                final Listing listing2 = (Listing)o2;
                f.f((Object)i, "key");
                f.f((Object)listing2, "links");
                return (c0)this.b.invoke((Object)i.a, (Object)listing2);
            }
        }
    }
    
    public final n c(final Object o) {
        switch (this.a) {
            default: {
                final o2 o2 = (o2)o;
                f.f((Object)o2, "key");
                final p b = this.b;
                final String k = o2.k;
                f.c((Object)k);
                return (n)b.invoke((Object)k, (Object)o2.d);
            }
            case 0: {
                final k i = (k)o;
                f.f((Object)i, "key");
                return (n)((zg2.l)this.c).invoke((Object)i.a);
            }
        }
    }
}
