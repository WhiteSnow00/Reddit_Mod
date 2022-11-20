// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import cg2.j;
import ng2.e;
import com.reddit.listing.common.ListingViewMode;
import com.reddit.data.repository.RedditPreferenceRepository;
import java.util.concurrent.Callable;

public final class g1 implements Callable
{
    public final RedditPreferenceRepository f;
    public final ListingViewMode g;
    
    public g1(final RedditPreferenceRepository f, final ListingViewMode g) {
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final Object call() {
        final RedditPreferenceRepository f = this.f;
        final ListingViewMode g = this.g;
        e.f((Object)f, "this$0");
        e.f((Object)g, "$viewMode");
        f.c.edit().putString("listingViewMode.globalDefault", g.toString()).apply();
        f.i.onNext(g);
        return j.a;
    }
}
