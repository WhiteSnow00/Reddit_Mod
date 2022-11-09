// 
// Decompiled by Procyon v0.6.0
// 

package w70;

import ah2.f;
import o5.a;
import k5.b;

public final class k extends b
{
    public static final k c;
    
    static {
        c = new k();
    }
    
    public k() {
        super(1, 2);
    }
    
    @Override
    public final void a(final a a) {
        f.f((Object)a, "database");
        a.execSQL("CREATE TABLE IF NOT EXISTS `spans`\n          (`id` INTEGER NOT NULL, `startTime` INTEGER NOT NULL,\n           `endTime` INTEGER NOT NULL, `name` TEXT NOT NULL,\n           `service` TEXT NOT NULL, `parentId` INTEGER,\n           `traceId` INTEGER NOT NULL,\n           `dispatched` INTEGER NOT NULL,\n           `tags` TEXT NOT NULL,\n           PRIMARY KEY(`id`))");
    }
}
