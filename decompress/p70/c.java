// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class c extends b
{
    public static final c c;
    
    static {
        c = new c();
    }
    
    public c() {
        super(12, 13);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("DELETE FROM `listing`");
        a.execSQL("ALTER TABLE `link` ADD COLUMN `subredditId` TEXT NOT NULL DEFAULT ''");
        a.execSQL("CREATE INDEX `index_link_subredditId` ON `link` (`subredditId`)");
    }
}
