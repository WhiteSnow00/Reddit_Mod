// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class c0 extends b
{
    public static final c0 c;
    
    static {
        c = new c0();
    }
    
    public c0() {
        super(36, 37);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `acceptChats` INTEGER");
    }
}
