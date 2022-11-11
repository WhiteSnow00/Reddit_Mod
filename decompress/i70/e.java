// 
// Decompiled by Procyon v0.6.0
// 

package i70;

import aa1.a;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class e extends BaseMigration
{
    public final /* synthetic */ int a;
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        switch (this.a) {
            default: {
                sg2.e.f((Object)databaseWrapper, "database");
                aa1.a.m(databaseWrapper, new String[] { "recent_subreddits" });
                return;
            }
            case 2: {
                sg2.e.f((Object)databaseWrapper, "database");
                aa1.a.m(databaseWrapper, new String[] { "queries_v3" });
                return;
            }
            case 1: {
                sg2.e.f((Object)databaseWrapper, "database");
                aa1.a.e0(databaseWrapper, "multireddit");
                return;
            }
            case 0: {
                sg2.e.f((Object)databaseWrapper, "database");
                aa1.a.m(databaseWrapper, new String[] { "link", "image_resolution", "outbound_link" });
            }
        }
    }
}
