// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.repository.RedditSubredditLeaderboardRepository;
import com.reddit.data.local.SubredditLeaderboardLocalDataSource;
import com.reddit.data.remote.c;
import d60.a0;
import r20.a;
import javax.inject.Provider;
import af2.d;

public final class f2 implements d
{
    public final /* synthetic */ int a;
    public final Provider b;
    public final Provider c;
    
    public final Object get() {
        switch (this.a) {
            default: {
                return new n2((a)this.b.get(), (a0)this.c.get());
            }
            case 0: {
                return new RedditSubredditLeaderboardRepository((c)this.b.get(), (SubredditLeaderboardLocalDataSource)this.c.get());
            }
        }
    }
}
