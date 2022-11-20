// 
// Decompiled by Procyon v0.6.0
// 

package s60;

import com.reddit.data.snoovatar.repository.RedditStorefrontCache;
import ne2.d;

public final class c implements d<RedditStorefrontCache>
{
    public final Object get() {
        return new RedditStorefrontCache();
    }
    
    public static final class a
    {
        public static final c a;
        
        static {
            a = new c();
        }
    }
}
