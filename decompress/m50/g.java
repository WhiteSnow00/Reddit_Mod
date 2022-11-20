// 
// Decompiled by Procyon v0.6.0
// 

package m50;

import ne2.b;
import wa0.r;
import com.reddit.data.select_country.CountryCodeDataSource;
import wc0.e;
import javax.inject.Provider;
import com.reddit.data.onboardingtopic.RedditOnboardingChainingRepository;
import ne2.d;

public final class g implements d<RedditOnboardingChainingRepository>
{
    public final Provider<a> a;
    public final Provider<e> b;
    public final Provider<wc0.d> c;
    public final Provider<wc0.a> d;
    public final Provider<nb0.a> e;
    public final Provider<CountryCodeDataSource> f;
    public final Provider<r> g;
    
    public g(final Provider a, final Provider b, final Provider c, final Provider d, final b e, final Provider f, final b g) {
        this.a = (Provider<a>)a;
        this.b = (Provider<e>)b;
        this.c = (Provider<wc0.d>)c;
        this.d = (Provider<wc0.a>)d;
        this.e = (Provider<nb0.a>)e;
        this.f = (Provider<CountryCodeDataSource>)f;
        this.g = (Provider<r>)g;
    }
    
    public final Object get() {
        final Object value = this.a.get();
        ng2.e.e(value, "interestTopicsDataSource.get()");
        final a a = (a)value;
        final Object value2 = this.b.get();
        ng2.e.e(value2, "onboardingChainingPrefsDataSource.get()");
        final e e = (e)value2;
        final Object value3 = this.c.get();
        ng2.e.e(value3, "sharedPrefsDelayedAuthDataSource.get()");
        final wc0.d d = (wc0.d)value3;
        final Object value4 = this.d.get();
        ng2.e.e(value4, "memoryDataSource.get()");
        final wc0.a a2 = (wc0.a)value4;
        final Object value5 = this.e.get();
        ng2.e.e(value5, "growthFeatures.get()");
        final nb0.a a3 = (nb0.a)value5;
        final Object value6 = this.f.get();
        ng2.e.e(value6, "countryCodeDataSource.get()");
        final CountryCodeDataSource countryCodeDataSource = (CountryCodeDataSource)value6;
        final Object value7 = this.g.get();
        ng2.e.e(value7, "onboardingFeatures.get()");
        return new RedditOnboardingChainingRepository(a, e, d, a2, a3, countryCodeDataSource, (r)value7);
    }
}
