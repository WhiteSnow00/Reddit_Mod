// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import sg2.e;
import o5.a;
import k5.b;

public final class g extends b
{
    public static final g c;
    
    static {
        c = new g();
    }
    
    public g() {
        super(7, 8);
    }
    
    @Override
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `successMessage` TEXT");
    }
}
