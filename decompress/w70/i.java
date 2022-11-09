// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class i extends b
{
    public static final i c;
    
    static {
        c = new i();
    }
    
    public i() {
        super(18, 19);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `stream_subreddit_state` ADD COLUMN `type` TEXT NOT NULL DEFAULT 'VIEWER'");
    }
}
