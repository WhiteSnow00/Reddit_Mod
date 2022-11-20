// 
// Decompiled by Procyon v0.6.0
// 

package jd2;

import com.tonyodev.fetch2.EnqueueAction;
import ng2.e;

public final class b extends a
{
    public final int c;
    
    public b(final int c) {
        this.c = c;
        if (c != 1) {
            super(5, 6);
            return;
        }
        super(2, 3);
    }
    
    public final void a(final n5.a a) {
        switch (this.c) {
            default: {
                e.g((Object)a, "database");
                final StringBuilder sb = new StringBuilder();
                sb.append("ALTER TABLE 'requests' ");
                sb.append("ADD COLUMN '_enqueue_action' INTEGER NOT NULL DEFAULT ");
                sb.append(EnqueueAction.REPLACE_EXISTING.getValue());
                a.execSQL(sb.toString());
                return;
            }
            case 0: {
                e.g((Object)a, "database");
                a.execSQL("ALTER TABLE 'requests' ADD COLUMN '_extras' TEXT NOT NULL DEFAULT '{}'");
            }
        }
    }
}
