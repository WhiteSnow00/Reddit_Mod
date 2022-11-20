// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;

public final class b extends j5.b
{
    public static final b c;
    
    static {
        c = new b();
    }
    
    public b() {
        super(11, 12);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE recent_subreddits ADD COLUMN isChatPostFeatureEnabled INTEGER");
        a.execSQL("ALTER TABLE subreddit ADD COLUMN isChatPostFeatureEnabled INTEGER");
    }
}
