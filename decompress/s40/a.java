// 
// Decompiled by Procyon v0.6.0
// 

package s40;

import ng2.e;
import v90.p;
import javax.inject.Provider;
import com.reddit.data.karma_statistics.CompactKarmaStatisticsWorker$a;
import ne2.d;

public final class a implements d<CompactKarmaStatisticsWorker$a>
{
    public final Provider<d20.a> a;
    public final Provider<vl0.a> b;
    
    public a(final Provider b) {
        final p a = p.a.a;
        this.a = (Provider<d20.a>)a;
        this.b = (Provider<vl0.a>)b;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        e.e(value, "dispatcherProvider.get()");
        final d20.a a = (d20.a)value;
        final Object value2 = this.b.get();
        e.e(value2, "karmaStatisticsRepository.get()");
        return new CompactKarmaStatisticsWorker$a(a, (vl0.a)value2);
    }
}
