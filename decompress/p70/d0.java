// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class d0 extends b
{
    public static final d0 c;
    
    static {
        c = new d0();
    }
    
    public d0() {
        super(37, 38);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("DROP TABLE `experiment_exposure`");
    }
}
