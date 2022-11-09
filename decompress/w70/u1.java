// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class u1 extends b
{
    public static final u1 c;
    
    static {
        c = new u1();
    }
    
    public u1() {
        super(76, 77);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `phoneCountryCode` TEXT");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `phoneMaskedNumber` TEXT");
    }
}
