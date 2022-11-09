// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.remote.RemoteGqlGeoDataSource;
import javax.inject.Provider;
import com.reddit.data.repository.RedditGeoRepository;
import af2.d;

public final class c0 implements d<RedditGeoRepository>
{
    public final Provider<RemoteGqlGeoDataSource> a;
    
    public c0(final Provider<RemoteGqlGeoDataSource> a) {
        this.a = a;
    }
    
    public final Object get() {
        return new RedditGeoRepository((RemoteGqlGeoDataSource)this.a.get());
    }
}
