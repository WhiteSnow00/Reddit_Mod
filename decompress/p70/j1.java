// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class j1 extends b
{
    public static final j1 c;
    
    static {
        c = new j1();
    }
    
    public j1() {
        super(66, 67);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `listing` ADD COLUMN `prune` INTEGER DEFAULT 0 NOT NULL");
    }
}
