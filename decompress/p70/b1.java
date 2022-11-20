// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class b1 extends b
{
    public static final b1 c;
    
    static {
        c = new b1();
    }
    
    public b1() {
        super(59, 60);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `acceptFollowers` INTEGER NOT NULL DEFAULT 1");
    }
}
