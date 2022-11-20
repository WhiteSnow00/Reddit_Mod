// 
// Decompiled by Procyon v0.6.0
// 

package s40;

import ng2.e;
import v90.p;
import d20.a;
import javax.inject.Provider;
import com.reddit.data.karma_statistics.RedditKarmaStatisticsRepository;

public final class d implements ne2.d<RedditKarmaStatisticsRepository>
{
    public final Provider<b> a;
    public final Provider<a> b;
    
    public d(final Provider a) {
        final p a2 = p.a.a;
        this.a = (Provider<b>)a;
        this.b = (Provider<a>)a2;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        e.e(value, "karmaStatisticsDataSource.get()");
        final b b = (b)value;
        final Object value2 = this.b.get();
        e.e(value2, "dispatcherProvider.get()");
        return new RedditKarmaStatisticsRepository(b, (a)value2);
    }
}
