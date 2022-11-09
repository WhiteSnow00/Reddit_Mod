// 
// Decompiled by Procyon v0.6.0
// 

package g60;

import java.io.Serializable;
import com.reddit.domain.model.GeoAutocompleteSuggestion;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import i60.q;
import pg2.j;
import com.reddit.domain.model.UpdateResponse;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import com.reddit.data.local.a;
import com.reddit.data.remote.CrowdsourceTaggingDataSource;
import ge0.h;

public final class z implements h
{
    public final CrowdsourceTaggingDataSource a;
    public final a b;
    
    @Inject
    public z(final CrowdsourceTaggingDataSource a, final a b) {
        f.f((Object)a, "dataSource");
        f.f((Object)b, "databaseDataSource");
        this.a = a;
        this.b = b;
    }
    
    public final Object a(final String s, final String s2, final String s3, final c<? super UpdateResponse> c) {
        return this.a.d(s, s2, s3, c);
    }
    
    public final Object b(final String s, final int n, final c c) {
        return this.a.a(s, n, c);
    }
    
    public final Object c(final String s, final c<? super j> c) {
        Object o = this.b.a.z1(new q(s, System.currentTimeMillis()), (c<? super Long>)c);
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (o != coroutine_SUSPENDED) {
            o = j.a;
        }
        if (o == coroutine_SUSPENDED) {
            return o;
        }
        return j.a;
    }
    
    public final Object d(final String s, final c<? super GeoAutocompleteSuggestion> c) {
        return this.a.b(s, c);
    }
    
    public final Serializable e(final c c) {
        return this.b.a(c);
    }
    
    public final Object f(final String s, final String s2, final GeoAutocompleteSuggestion geoAutocompleteSuggestion, final c<? super UpdateResponse> c) {
        return this.a.c(s, s2, geoAutocompleteSuggestion, c);
    }
}
