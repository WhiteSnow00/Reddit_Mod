// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import sg2.e;
import k5.b;

public final class a extends b
{
    public static final a c;
    
    static {
        c = new a();
    }
    
    public a() {
        super(1, 2);
    }
    
    @Override
    public final void a(final o5.a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `community` ADD COLUMN `subredditTitle` TEXT");
        a.execSQL("CREATE TABLE IF NOT EXISTS `structuredStyle`(\n        `subredditName` TEXT NOT NULL,\n        `highlightColor` TEXT,\n        `sidebarWidgetHeaderColor` TEXT,\n        `sidebarWidgetBackgroundColor` TEXT, \n        PRIMARY KEY(`subredditName`))");
    }
}
