// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class y0 extends b
{
    public static final y0 c;
    
    static {
        c = new y0();
    }
    
    public y0() {
        super(56, 57);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `survey_local_demo` (`id` INTEGER NOT NULL, `triggerJsonName` TEXT NOT NULL, `desiredTriggerCount` INTEGER NOT NULL, PRIMARY KEY(`id`))");
    }
}
