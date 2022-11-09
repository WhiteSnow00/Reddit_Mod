// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class p0 extends b
{
    public static final p0 c;
    
    static {
        c = new p0();
    }
    
    public p0() {
        super(48, 49);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `crowdsource_tagging_questions` (`id` TEXT NOT NULL, `subredditName` TEXT NOT NULL, `ordinal` INTEGER NOT NULL, `questionJson` TEXT NOT NULL, PRIMARY KEY(`id`))");
    }
}
