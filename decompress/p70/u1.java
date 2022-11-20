// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class u1 extends b
{
    public static final u1 c;
    
    static {
        c = new u1();
    }
    
    public u1() {
        super(76, 77);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `phoneCountryCode` TEXT");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `phoneMaskedNumber` TEXT");
    }
}
