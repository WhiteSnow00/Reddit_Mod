// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class w0 extends b
{
    public static final w0 c;
    
    static {
        c = new w0();
    }
    
    public w0() {
        super(54, 55);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `listing_discovery_unit` (`discoveryUnitId` TEXT NOT NULL, `listingPosition` INTEGER NOT NULL, `modelJson` TEXT NOT NULL, `modelType` INTEGER NOT NULL, `listingId` INTEGER NOT NULL, PRIMARY KEY(`discoveryUnitId`, `listingId`), FOREIGN KEY(`listingId`) REFERENCES `listing`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
    }
}
