// 
// Decompiled by Procyon v0.6.0
// 

package k50;

import sg2.e;
import se2.b;
import va0.s;
import com.reddit.data.select_country.CountryCodeDataSource;
import javax.inject.Provider;
import com.reddit.data.onboardingtopic.RedditOnboardingChainingRepository;
import se2.d;

public final class g implements d<RedditOnboardingChainingRepository>
{
    public final Provider<a> a;
    public final Provider<wc0.d> b;
    public final Provider<wc0.a> c;
    public final Provider<mb0.a> d;
    public final Provider<CountryCodeDataSource> e;
    public final Provider<s> f;
    
    public g(final Provider a, final Provider b, final Provider c, final b d, final Provider e, final b f) {
        this.a = (Provider<a>)a;
        this.b = (Provider<wc0.d>)b;
        this.c = (Provider<wc0.a>)c;
        this.d = (Provider<mb0.a>)d;
        this.e = (Provider<CountryCodeDataSource>)e;
        this.f = (Provider<s>)f;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        sg2.e.e(value, "interestTopicsDataSource.get()");
        final a a = (a)value;
        final Object value2 = this.b.get();
        sg2.e.e(value2, "onboardingChainingPrefsDataSource.get()");
        final wc0.d d = (wc0.d)value2;
        final Object value3 = this.c.get();
        sg2.e.e(value3, "memoryDataSource.get()");
        final wc0.a a2 = (wc0.a)value3;
        final Object value4 = this.d.get();
        sg2.e.e(value4, "growthFeatures.get()");
        final mb0.a a3 = (mb0.a)value4;
        final Object value5 = this.e.get();
        sg2.e.e(value5, "countryCodeDataSource.get()");
        final CountryCodeDataSource countryCodeDataSource = (CountryCodeDataSource)value5;
        final Object value6 = this.f.get();
        sg2.e.e(value6, "onboardingFeatures.get()");
        return new RedditOnboardingChainingRepository(a, d, a2, a3, countryCodeDataSource, (s)value6);
    }
}
