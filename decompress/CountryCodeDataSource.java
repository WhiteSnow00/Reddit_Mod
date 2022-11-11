// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.select_country;

import java.util.Iterator;
import com.reddit.queries.CountryCodeNamesQuery$b;
import java.util.ArrayList;
import ig2.m;
import com.reddit.queries.CountryCodeNamesQuery$Data;
import okhttp3.OkHttpClient;
import java.util.Map;
import com.reddit.network.common.RetryAlgo;
import mr0.e;
import h7.k;
import mr0.e$a;
import com.reddit.queries.CountryCodeNamesQuery;
import yd.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import be0.a;
import java.util.List;
import com.reddit.domain.model.Result;
import lg2.c;
import javax.inject.Inject;
import mr0.g;

public final class CountryCodeDataSource
{
    public final g a;
    
    @Inject
    public CountryCodeDataSource(final g a) {
        this.a = a;
    }
    
    public final Object a(final c<? super Result<? extends List<a>>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof CountryCodeDataSource$getCountryCodes$1) {
                final CountryCodeDataSource$getCountryCodes$1 countryCodeDataSource$getCountryCodes$1 = (CountryCodeDataSource$getCountryCodes$1)c;
                final int label = countryCodeDataSource$getCountryCodes$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    countryCodeDataSource$getCountryCodes$1.label = label + Integer.MIN_VALUE;
                    o = countryCodeDataSource$getCountryCodes$1;
                    break Label_0047;
                }
            }
            o = new CountryCodeDataSource$getCountryCodes$1(this, (c)c);
        }
        final Object result = ((CountryCodeDataSource$getCountryCodes$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((CountryCodeDataSource$getCountryCodes$1)o).label;
        Object b;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yd.b.k0(result);
            b = result;
        }
        else {
            yd.b.k0(result);
            final g a = this.a;
            final CountryCodeNamesQuery countryCodeNamesQuery = new CountryCodeNamesQuery();
            ((CountryCodeDataSource$getCountryCodes$1)o).label = 1;
            if ((b = e$a.b(14, (k)countryCodeNamesQuery, (e)a, (RetryAlgo)null, (Map)null, (c)o, (OkHttpClient)null)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final List a2 = ((CountryCodeNamesQuery$Data)b).a;
        final ArrayList list = new ArrayList<a>(m.c3((Iterable)a2, 10));
        for (final CountryCodeNamesQuery$b countryCodeNamesQuery$b : a2) {
            list.add(new a(countryCodeNamesQuery$b.b, countryCodeNamesQuery$b.c));
        }
        return new Result.Success(list);
    }
}
