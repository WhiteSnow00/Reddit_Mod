// 
// Decompiled by Procyon v0.6.0
// 

package b60;

import b5.k;
import cg2.j;
import ng2.e;
import com.reddit.data.repository.RedditPreferenceRepository;
import java.util.concurrent.Callable;

public final class b1 implements Callable
{
    public final int f;
    public final RedditPreferenceRepository g;
    public final boolean h;
    
    public b1(final RedditPreferenceRepository g, final boolean h, final int f) {
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    @Override
    public final Object call() {
        switch (this.f) {
            default: {
                final RedditPreferenceRepository g = this.g;
                final boolean h = this.h;
                e.f((Object)g, "this$0");
                g.b.f(h);
                return j.a;
            }
            case 0: {
                final RedditPreferenceRepository g2 = this.g;
                final boolean h2 = this.h;
                e.f((Object)g2, "this$0");
                k.u(g2.c, "trendingNotificationsSeen", h2);
                return j.a;
            }
        }
    }
}
