// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class l1 extends b
{
    public static final l1 c;
    
    static {
        c = new l1();
    }
    
    public l1() {
        super(68, 69);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("\n      CREATE TABLE IF NOT EXISTS `userSocialLink`\n        (`id` TEXT NOT NULL,\n         `username` TEXT NOT NULL,\n         `url` TEXT NOT NULL,\n         `position` INTEGER NOT NULL,\n         `title` TEXT NOT NULL,\n         `handle` TEXT,\n         `type` TEXT NOT NULL,\n         PRIMARY KEY(`id`),\n         FOREIGN KEY(`username`) REFERENCES `account`(`name`) ON UPDATE CASCADE ON DELETE CASCADE\n        )\n    ");
    }
}
