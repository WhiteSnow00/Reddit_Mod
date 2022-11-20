// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class f0 extends b
{
    public static final f0 c;
    
    static {
        c = new f0();
    }
    
    public f0() {
        super(39, 40);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `account` ADD COLUMN `acceptPrivateMessages` INTEGER");
    }
}
