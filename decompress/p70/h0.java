// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class h0 extends b
{
    public static final h0 c;
    
    static {
        c = new h0();
    }
    
    public h0() {
        super(40, 41);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `link_mutations` ADD COLUMN `isSubscribed` INTEGER");
    }
}
