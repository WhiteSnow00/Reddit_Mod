// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class k0 extends b
{
    public static final k0 c;
    
    static {
        c = new k0();
    }
    
    public k0() {
        super(43, 44);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `unsubmitted_pixels` ADD COLUMN `uniqueId` INTEGER NOT NULL DEFAULT 0");
        a.execSQL("ALTER TABLE `unsubmitted_pixels` ADD COLUMN `adEventType` TEXT");
        a.execSQL("ALTER TABLE `unsubmitted_pixels` ADD COLUMN `timestampInMilliseconds` INTEGER NOT NULL DEFAULT 0");
    }
}
