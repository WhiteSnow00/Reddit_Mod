// 
// Decompiled by Procyon v0.6.0
// 

package j70;

import cg.d;
import ng2.e;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class b extends BaseMigration
{
    public final int a;
    
    public b(final int a) {
        this.a = a;
    }
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        switch (this.a) {
            default: {
                e.f((Object)databaseWrapper, "database");
                d.c0(databaseWrapper, new String[] { "queries_v3" });
                return;
            }
            case 1: {
                e.f((Object)databaseWrapper, "database");
                d.c0(databaseWrapper, new String[] { "recent_subreddits", "subreddit_v2" });
                return;
            }
            case 0: {
                e.f((Object)databaseWrapper, "database");
                databaseWrapper.delete("listing", (String)null, (String[])null);
                databaseWrapper.delete("links", (String)null, (String[])null);
                databaseWrapper.delete("link_mutations", (String)null, (String[])null);
            }
        }
    }
}
