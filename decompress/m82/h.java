// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import sg2.e;
import o5.a;
import k5.b;

public final class h extends b
{
    public static final h c;
    
    static {
        c = new h();
    }
    
    public h() {
        super(8, 9);
    }
    
    @Override
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `points` ADD COLUMN `ethAmount` TEXT DEFAULT NULL");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `ethAmount` TEXT DEFAULT NULL");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `feeAmount` TEXT DEFAULT NULL");
    }
}
