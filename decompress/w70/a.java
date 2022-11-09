// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import k5.b;

public final class a extends b
{
    public static final a c;
    
    static {
        c = new a();
    }
    
    public a() {
        super(10, 11);
    }
    
    @Override
    public final void a(final o5.a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `category_click` \n(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `categoryId` TEXT NOT NULL, \n`clicks` INTEGER NOT NULL)");
        a.execSQL("CREATE UNIQUE INDEX `index_category_click_categoryId` ON `category_click` (`categoryId`)");
    }
}
