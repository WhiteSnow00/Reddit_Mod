// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import nf2.n;
import ah2.f;
import com.reddit.domain.model.listing.Listing;
import nf2.c0;
import zg2.p;
import zg2.q;
import zg2.a;
import zg2.l;
import tt.d;

public final class e implements d
{
    public final /* synthetic */ int a;
    public final pg2.d b;
    public final pg2.d c;
    
    public e(final l b, final a c) {
        this.a = 1;
        this.b = (pg2.d)b;
        this.c = (pg2.d)c;
    }
    
    public e(final q b, final p c) {
        this.a = 0;
        this.b = (pg2.d)b;
        this.c = (pg2.d)c;
    }
    
    public final c0 b(final Object o, final Object o2) {
        switch (this.a) {
            default: {
                final o2 o3 = (o2)o;
                final Listing listing = (Listing)o2;
                f.f((Object)o3, "key");
                f.f((Object)listing, "links");
                return (c0)((l)this.b).invoke((Object)listing);
            }
            case 0: {
                final g60.d d = (g60.d)o;
                final Listing listing2 = (Listing)o2;
                f.f((Object)d, "key");
                f.f((Object)listing2, "links");
                return (c0)((q)this.b).invoke((Object)listing2, (Object)d.a, (Object)d.b);
            }
        }
    }
    
    public final n c(final Object o) {
        switch (this.a) {
            default: {
                f.f((Object)o, "key");
                return (n)((a)this.c).invoke();
            }
            case 0: {
                final g60.d d = (g60.d)o;
                f.f((Object)d, "key");
                return (n)((p)this.c).invoke((Object)d.a, (Object)d.b);
            }
        }
    }
}
