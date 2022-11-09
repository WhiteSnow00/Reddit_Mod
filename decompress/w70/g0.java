// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class g0 extends b
{
    public static final g0 c;
    
    static {
        c = new g0();
    }
    
    public g0() {
        super(3, 4);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `comment_mutations`\n      (`id` TEXT NOT NULL, `isCollapsed` INTEGER NOT NULL,\n       PRIMARY KEY(`id`))");
    }
}
