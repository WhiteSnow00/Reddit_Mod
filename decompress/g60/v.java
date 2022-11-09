// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import ca0.k0;
import com.reddit.data.remote.RemoteCategoryDataSource;
import r20.a;
import javax.inject.Provider;
import com.reddit.data.repository.RedditCategoryRepository;
import af2.d;

public final class v implements d<RedditCategoryRepository>
{
    public final Provider<a> a;
    public final Provider<RemoteCategoryDataSource> b;
    
    public v(final Provider b) {
        final k0 a = k0.a.a;
        this.a = (Provider<a>)a;
        this.b = (Provider<RemoteCategoryDataSource>)b;
    }
    
    public final Object get() {
        return new RedditCategoryRepository((a)this.a.get(), (RemoteCategoryDataSource)this.b.get());
    }
}
