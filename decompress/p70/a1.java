// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class a1 extends b
{
    public static final a1 c;
    
    static {
        c = new a1();
    }
    
    public a1() {
        super(58, 59);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `unsubmitted_pixels` ADD COLUMN `adImpressionId` TEXT");
    }
}
