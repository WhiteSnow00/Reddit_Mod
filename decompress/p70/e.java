// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import n5.a;
import j5.b;

public final class e extends b
{
    public static final e c;
    
    static {
        c = new e();
    }
    
    public e() {
        super(14, 15);
    }
    
    public final void a(final a a) {
        ng2.e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS unsubmitted_pixels (`url` TEXT NOT NULL, PRIMARY KEY(`url`))");
    }
}
