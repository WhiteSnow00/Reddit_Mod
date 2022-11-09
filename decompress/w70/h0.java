// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class h0 extends b
{
    public static final h0 c;
    
    static {
        c = new h0();
    }
    
    public h0() {
        super(40, 41);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("ALTER TABLE `link_mutations` ADD COLUMN `isSubscribed` INTEGER");
    }
}
