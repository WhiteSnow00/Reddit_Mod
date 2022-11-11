// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import sg2.e;
import o5.a;
import k5.b;

public final class c extends b
{
    public static final c c;
    
    static {
        c = new c();
    }
    
    public c() {
        super(3, 4);
    }
    
    @Override
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `points` ADD COLUMN `fetchedAt` INTEGER NOT NULL DEFAULT 0");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `recipient` TEXT");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `recipientId` TEXT");
    }
}
