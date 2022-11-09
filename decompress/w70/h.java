// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class h extends b
{
    public static final h c;
    
    static {
        c = new h();
    }
    
    public h() {
        super(17, 18);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `stream_subreddit_state` (\n`subreddit` TEXT NOT NULL, \n`timestamp` INTEGER NOT NULL,\nPRIMARY KEY(`subreddit`)\n)");
    }
}
