// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class w1 extends b
{
    public static final w1 c;
    
    static {
        c = new w1();
    }
    
    public w1() {
        super(78, 79);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `userMyReddits` (\n`id` TEXT NOT NULL, `name` TEXT NOT NULL,\n`username` TEXT NOT NULL, PRIMARY KEY(`id`),\n FOREIGN KEY(`username`) REFERENCES `account`(`name`) ON UPDATE CASCADE ON DELETE CASCADE\n)");
    }
}
