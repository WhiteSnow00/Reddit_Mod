// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import o5.a;
import k5.b;

public final class e extends b
{
    public static final e c;
    
    static {
        c = new e();
    }
    
    public e() {
        super(5, 6);
    }
    
    @Override
    public final void a(final a a) {
        sg2.e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `avgTransactionSec` INTEGER");
    }
}
