// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class m extends b
{
    public static final m c;
    
    static {
        c = new m();
    }
    
    public m() {
        super(21, 22);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `survey_status`\n(`surveyId` TEXT NOT NULL, `triggerCount` INTEGER NOT NULL, PRIMARY KEY(`surveyId`))");
    }
}
