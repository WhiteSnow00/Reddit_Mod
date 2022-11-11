// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import sg2.e;
import o5.a;
import k5.b;

public final class i extends b
{
    public static final i c;
    
    static {
        c = new i();
    }
    
    public i() {
        super(9, 10);
    }
    
    @Override
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `usdTotalAmount` TEXT DEFAULT NULL");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `usdPurchaseAmount` TEXT DEFAULT NULL");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `usdFeeAmount` TEXT DEFAULT NULL");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `usdNetworkFeeAmount` TEXT DEFAULT NULL");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `exchangeRate` TEXT DEFAULT NULL");
    }
}
