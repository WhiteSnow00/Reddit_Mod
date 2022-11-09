// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.repository.RedditSubredditForkingRepository;
import com.reddit.data.local.LocalSubredditForkingDataSource;
import r20.a;
import d60.x;
import javax.inject.Provider;
import af2.d;

public final class e2 implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new k2((x)this.b.get(), (a)this.c.get());
            }
            case 0: {
                return new RedditSubredditForkingRepository((LocalSubredditForkingDataSource)this.b.get(), (e20.a)this.c.get());
            }
        }
    }
}
