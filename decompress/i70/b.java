// 
// Decompiled by Procyon v0.6.0
// 

package i70;

import aa1.a;
import sg2.e;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class b extends BaseMigration
{
    public final /* synthetic */ int a;
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        switch (this.a) {
            default: {
                e.f((Object)databaseWrapper, "database");
                aa1.a.m(databaseWrapper, new String[] { "ad_event" });
                return;
            }
            case 2: {
                e.f((Object)databaseWrapper, "database");
                aa1.a.m(databaseWrapper, new String[] { "subreddit_v4", "subreddit_mutations", "recent_subreddits_v2" });
                return;
            }
            case 1: {
                e.f((Object)databaseWrapper, "database");
                aa1.a.e0(databaseWrapper, "account");
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
