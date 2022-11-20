// 
// Decompiled by Procyon v0.6.0
// 

package s50;

import com.reddit.data.predictions.RedditLocalPredictionsTournamentDataSource;
import ne2.d;

public final class b implements d<RedditLocalPredictionsTournamentDataSource>
{
    public final Object get() {
        return new RedditLocalPredictionsTournamentDataSource();
    }
    
    public static final class a
    {
        public static final b a;
        
        static {
            a = new b();
        }
    }
}
