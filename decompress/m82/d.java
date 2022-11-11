// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import sg2.e;
import o5.a;
import k5.b;

public final class d extends b
{
    public static final d c;
    
    static {
        c = new d();
    }
    
    public d() {
        super(4, 5);
    }
    
    @Override
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `points` ADD COLUMN `isLocalUser` INTEGER NOT NULL DEFAULT 0");
    }
}
