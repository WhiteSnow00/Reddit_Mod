// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class a1 extends b
{
    public static final a1 c;
    
    static {
        c = new a1();
    }
    
    public a1() {
        super(58, 59);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `unsubmitted_pixels` ADD COLUMN `adImpressionId` TEXT");
    }
}
