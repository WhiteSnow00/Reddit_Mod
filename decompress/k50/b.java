// 
// Decompiled by Procyon v0.6.0
// 

package k50;

import sg2.e;
import v40.k;
import mr0.g;
import javax.inject.Provider;
import com.reddit.data.onboardingtopic.InterestTopicsGraphQlDataSource;
import se2.d;

public final class b implements d<InterestTopicsGraphQlDataSource>
{
    public final Provider<g> a;
    public final Provider<c> b;
    
    public b(final k a) {
        final k50.d a2 = k50.d.a;
        this.a = (Provider<g>)a;
        this.b = (Provider<c>)a2;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        e.e(value, "graphQlClient.get()");
        final g g = (g)value;
        final Object value2 = this.b.get();
        e.e(value2, "interestTopicsMapper.get()");
        return new InterestTopicsGraphQlDataSource(g, (c)value2);
    }
}
