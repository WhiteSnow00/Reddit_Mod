// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class g0 extends b
{
    public static final g0 c;
    
    static {
        c = new g0();
    }
    
    public g0() {
        super(3, 4);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `comment_mutations`\n      (`id` TEXT NOT NULL, `isCollapsed` INTEGER NOT NULL,\n       PRIMARY KEY(`id`))");
    }
}
