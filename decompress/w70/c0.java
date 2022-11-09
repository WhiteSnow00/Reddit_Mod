// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class c0 extends b
{
    public static final c0 c;
    
    static {
        c = new c0();
    }
    
    public c0() {
        super(36, 37);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `acceptChats` INTEGER");
    }
}
