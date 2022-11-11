// 
// Decompiled by Procyon v0.6.0
// 

package m82;

import sg2.e;
import o5.a;

public final class b extends k5.b
{
    public static final b c;
    
    static {
        c = new b();
    }
    
    public b() {
        super(2, 3);
    }
    
    @Override
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `transaction` ADD COLUMN `pendingSubtype` TEXT");
    }
}
