// 
// Decompiled by Procyon v0.6.0
// 

package p70;

import ng2.e;
import n5.a;
import j5.b;

public final class m extends b
{
    public static final m c;
    
    static {
        c = new m();
    }
    
    public m() {
        super(21, 22);
    }
    
    public final void a(final a a) {
        e.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `survey_status`\n(`surveyId` TEXT NOT NULL, `triggerCount` INTEGER NOT NULL, PRIMARY KEY(`surveyId`))");
    }
}
