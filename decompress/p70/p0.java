// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class p0 extends b
{
    public static final p0 c;
    
    static {
        c = new p0();
    }
    
    public p0() {
        super(48, 49);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `crowdsource_tagging_questions` (`id` TEXT NOT NULL, `subredditName` TEXT NOT NULL, `ordinal` INTEGER NOT NULL, `questionJson` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
