// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import com.reddit.domain.model.Result;
import wu1.c;
import com.reddit.domain.model.search.TrendingQuery;
import com.reddit.domain.repository.Subplacement;
import com.reddit.domain.model.search.SearchCorrelation;
import java.util.List;
import af2.c0;
import af2.a;
import com.reddit.domain.model.search.Query;

public interface b0
{
    a a(final Query p0);
    
    c0<List<Query>> b();
    
    a c(final Query p0);
    
    c0<List<TrendingQuery>> d(final SearchCorrelation p0, final Subplacement p1);
    
    c0<Result<av1.a>> e(final String p0, final boolean p1, final SearchCorrelation p2, final boolean p3, final c p4);
}
