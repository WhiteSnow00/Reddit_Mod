// 
// Decompiled by Procyon v0.6.0
// 

package j70;

import ng2.e;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class d extends BaseMigration
{
    public final int a;
    
    public d(final int a) {
        this.a = a;
    }
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        switch (this.a) {
            default: {
                e.f((Object)databaseWrapper, "database");
                cg.d.c0(databaseWrapper, new String[] { "category_click_v2" });
                return;
            }
            case 2: {
                e.f((Object)databaseWrapper, "database");
                cg.d.c0(databaseWrapper, new String[] { "subreddit_v4", "subreddit_mutations", "recent_subreddits_v2" });
                return;
            }
            case 1: {
                e.f((Object)databaseWrapper, "database");
                cg.d.M1(databaseWrapper, "subreddit_v3");
                return;
            }
            case 0: {
                e.f((Object)databaseWrapper, "database");
                cg.d.M1(databaseWrapper, "queries");
            }
        }
    }
}
