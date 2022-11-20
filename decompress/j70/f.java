// 
// Decompiled by Procyon v0.6.0
// 

package j70;

import cg.d;
import ng2.e;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class f extends BaseMigration
{
    public final int a;
    
    public f(final int a) {
        this.a = a;
    }
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        switch (this.a) {
            default: {
                e.f((Object)databaseWrapper, "database");
                d.c0(databaseWrapper, new String[] { "comments" });
                return;
            }
            case 2: {
                e.f((Object)databaseWrapper, "database");
                d.c0(databaseWrapper, new String[] { "links", "listing", "link_mutations" });
                return;
            }
            case 1: {
                e.f((Object)databaseWrapper, "database");
                d.M1(databaseWrapper, "multireddit");
                return;
            }
            case 0: {
                e.f((Object)databaseWrapper, "database");
                d.c0(databaseWrapper, new String[] { "subreddit", "queries_v2" });
            }
        }
    }
}
