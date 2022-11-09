// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;

public final class b extends k5.b
{
    public static final b c;
    
    static {
        c = new b();
    }
    
    public b() {
        super(11, 12);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE recent_subreddits ADD COLUMN isChatPostFeatureEnabled INTEGER");
        a.execSQL("ALTER TABLE subreddit ADD COLUMN isChatPostFeatureEnabled INTEGER");
    }
}
