// 
// Decompiled by Procyon v0.6.0
// 

package j70;

import android.database.sqlite.SQLiteException;
import cg.d;
import ng2.e;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class c extends BaseMigration
{
    public final int a;
    
    public c(final int a) {
        this.a = a;
    }
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        Label_0113: {
            switch (this.a) {
                default: {
                    break Label_0113;
                }
                case 3: {
                    e.f((Object)databaseWrapper, "database");
                    d.M1(databaseWrapper, "moderatorsresponse");
                    return;
                }
                case 2: {
                    e.f((Object)databaseWrapper, "database");
                    d.c0(databaseWrapper, new String[] { "account_v2", "account_mutations", "user_subreddit" });
                    return;
                }
                case 1: {
                    e.f((Object)databaseWrapper, "database");
                    d.M1(databaseWrapper, "account");
                    return;
                }
                case 0: {
                    e.f((Object)databaseWrapper, "database");
                    try {
                        databaseWrapper.delete("queries", (String)null, (String[])null);
                        return;
                        e.f((Object)databaseWrapper, "database");
                        d.c0(databaseWrapper, new String[] { "recent_subreddits" });
                        return;
                    }
                    catch (final SQLiteException ex) {
                        return;
                    }
                    break;
                }
            }
        }
    }
}
