// 
// Decompiled by Procyon v0.6.0
// 

package c50;

import javax.inject.Inject;
import java.util.concurrent.TimeUnit;
import com.reddit.domain.model.FollowersPage;

public final class v0
{
    public FollowersPage a;
    
    static {
        TimeUnit.MINUTES.toMillis(2L);
    }
    
    @Inject
    public v0() {
    }
}
