// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class i extends b
{
    public static final i c;
    
    static {
        c = new i();
    }
    
    public i() {
        super(18, 19);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `stream_subreddit_state` ADD COLUMN `type` TEXT NOT NULL DEFAULT 'VIEWER'");
    }
}
