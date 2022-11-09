// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import com.reddit.data.remote.RemoteAccountPreferenceDataSource;
import javax.inject.Provider;
import com.reddit.data.repository.RedditCoroutinePersonalizationRepository;
import af2.d;

public final class x implements d<RedditCoroutinePersonalizationRepository>
{
    public final Provider<RemoteAccountPreferenceDataSource> a;
    
    public x(final Provider<RemoteAccountPreferenceDataSource> a) {
        this.a = a;
    }
    
    public final Object get() {
        return new RedditCoroutinePersonalizationRepository((RemoteAccountPreferenceDataSource)this.a.get());
    }
}
