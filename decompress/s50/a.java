// 
// Decompiled by Procyon v0.6.0
// 

package s50;

import com.reddit.type.PredictionCurrency;
import com.reddit.fragment.RedditorFragment;
import com.reddit.fragment.RedditorRankFragment$a$a;
import com.reddit.fragment.RedditorRankFragment$a;
import com.reddit.data.model.graphql.GqlDataToDomainModelMapperKt;
import ng2.e;
import jd0.k;
import com.reddit.fragment.RedditorRankFragment;

public final class a
{
    public static k a(final RedditorRankFragment redditorRankFragment) {
        e.f((Object)redditorRankFragment, "<this>");
        final RedditorRankFragment$a b = redditorRankFragment.b;
        if (b != null) {
            final RedditorRankFragment$a$a b2 = b.b;
            if (b2 != null) {
                final RedditorFragment a = b2.a;
                if (a != null) {
                    return new k(GqlDataToDomainModelMapperKt.toRedditor(a), redditorRankFragment.c, redditorRankFragment.d);
                }
            }
        }
        return null;
    }
    
    public final class a
    {
        public static final int[] a;
        
        static {
            final int[] a2 = new int[PredictionCurrency.values().length];
            a2[((Enum)PredictionCurrency.COINS).ordinal()] = 1;
            a2[((Enum)PredictionCurrency.TOKENS).ordinal()] = 2;
            a = a2;
        }
    }
}
