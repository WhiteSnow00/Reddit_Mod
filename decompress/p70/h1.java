// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class h1 extends b
{
    public static final h1 c;
    
    static {
        c = new h1();
    }
    
    public h1() {
        super(64, 65);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `karma_statistics` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `timestamp` INTEGER NOT NULL, `karma` INTEGER NOT NULL)");
        a.execSQL("CREATE INDEX IF NOT EXISTS `index_karma_statistics_timestamp` ON `karma_statistics` (`timestamp`)");
    }
}
