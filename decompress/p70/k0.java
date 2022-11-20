// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class k0 extends b
{
    public static final k0 c;
    
    static {
        c = new k0();
    }
    
    public k0() {
        super(43, 44);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `unsubmitted_pixels` ADD COLUMN `uniqueId` INTEGER NOT NULL DEFAULT 0");
        a.execSQL("ALTER TABLE `unsubmitted_pixels` ADD COLUMN `adEventType` TEXT");
        a.execSQL("ALTER TABLE `unsubmitted_pixels` ADD COLUMN `timestampInMilliseconds` INTEGER NOT NULL DEFAULT 0");
    }
}
