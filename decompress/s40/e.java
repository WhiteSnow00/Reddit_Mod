// 
// Decompiled by Procyon v0.6.0
// 

package s40;

import v90.p;
import xd0.b;
import com.reddit.session.Session;
import vl0.a;
import javax.inject.Provider;
import com.reddit.data.karma_statistics.RedditKarmaStatisticsUpdater;
import ne2.d;

public final class e implements d<RedditKarmaStatisticsUpdater>
{
    public final Provider<a> a;
    public final Provider<Session> b;
    public final Provider<b> c;
    public final Provider<d20.a> d;
    
    public e(final Provider a, final Provider b, final Provider c) {
        final p a2 = p.a.a;
        this.a = (Provider<a>)a;
        this.b = (Provider<Session>)b;
        this.c = (Provider<b>)c;
        this.d = (Provider<d20.a>)a2;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        ng2.e.e(value, "karmaStatisticsRepository.get()");
        final a a = (a)value;
        final Object value2 = this.b.get();
        ng2.e.e(value2, "session.get()");
        final Session session = (Session)value2;
        final Object value3 = this.c.get();
        ng2.e.e(value3, "accountRepository.get()");
        final b b = (b)value3;
        final Object value4 = this.d.get();
        ng2.e.e(value4, "dispatcherProvider.get()");
        return new RedditKarmaStatisticsUpdater(a, session, b, (d20.a)value4);
    }
}
