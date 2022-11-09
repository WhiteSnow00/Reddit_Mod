// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class c extends b
{
    public static final c c;
    
    static {
        c = new c();
    }
    
    public c() {
        super(12, 13);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("DELETE FROM `listing`");
        a.execSQL("ALTER TABLE `link` ADD COLUMN `subredditId` TEXT NOT NULL DEFAULT ''");
        a.execSQL("CREATE INDEX `index_link_subredditId` ON `link` (`subredditId`)");
    }
}
