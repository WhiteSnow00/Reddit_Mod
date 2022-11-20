// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class r extends b
{
    public static final r c;
    
    static {
        c = new r();
    }
    
    public r() {
        super(26, 27);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `canEditName` INTEGER NOT NULL DEFAULT 0");
    }
}
