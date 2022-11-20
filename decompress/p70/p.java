// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class p extends b
{
    public static final p c;
    
    static {
        c = new p();
    }
    
    public p() {
        super(24, 25);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `canCreateSubreddit` INTEGER NOT NULL DEFAULT 0");
    }
}
