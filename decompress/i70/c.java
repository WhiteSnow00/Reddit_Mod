// 
// Decompiled by Procyon v0.6.0
// 

package i70;

import android.database.sqlite.SQLiteException;
import aa1.a;
import sg2.e;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class c extends BaseMigration
{
    public final /* synthetic */ int a;
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        Label_0086: {
            switch (this.a) {
                default: {
                    break Label_0086;
                }
                case 2: {
                    e.f((Object)databaseWrapper, "database");
                    aa1.a.m(databaseWrapper, new String[] { "announcement" });
                    return;
                }
                case 1: {
                    e.f((Object)databaseWrapper, "database");
                    aa1.a.e0(databaseWrapper, "subreddit_v3");
                    return;
                }
                case 0: {
                    e.f((Object)databaseWrapper, "database");
                    try {
                        databaseWrapper.delete("queries", (String)null, (String[])null);
                        return;
                        e.f((Object)databaseWrapper, "database");
                        aa1.a.m(databaseWrapper, new String[] { "comments" });
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
