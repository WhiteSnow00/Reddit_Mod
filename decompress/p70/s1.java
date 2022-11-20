// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class s1 extends b
{
    public static final s1 c;
    
    static {
        c = new s1();
    }
    
    public s1() {
        super(74, 75);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("ALTER TABLE `subreddit` ADD COLUMN `canAssignLinkFlair` INTEGER");
    }
}
