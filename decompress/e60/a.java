// 
// Decompiled by Procyon v0.6.0
// 

package e60;

import sg2.e;
import v40.k;
import mr0.g;
import javax.inject.Provider;
import com.reddit.data.select_country.CountryCodeDataSource;
import se2.d;

public final class a implements d<CountryCodeDataSource>
{
    public final Provider<g> a;
    
    public a(final k a) {
        this.a = (Provider<g>)a;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        e.e(value, "graphQlClient.get()");
        return new CountryCodeDataSource((g)value);
    }
}
