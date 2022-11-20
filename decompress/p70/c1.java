// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class c1 extends b
{
    public static final c1 c;
    
    static {
        c = new c1();
    }
    
    public c1() {
        super(5, 6);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `announcement` (`kindWithId` TEXT NOT NULL, \n`isHidden` INTEGER NOT NULL, PRIMARY KEY(`kindWithId`))");
    }
}
