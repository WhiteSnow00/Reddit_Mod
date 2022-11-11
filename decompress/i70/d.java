// 
// Decompiled by Procyon v0.6.0
// 

package i70;

import aa1.a;
import sg2.e;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class d extends BaseMigration
{
    public final /* synthetic */ int a;
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        switch (this.a) {
            default: {
                e.f((Object)databaseWrapper, "database");
                aa1.a.m(databaseWrapper, new String[] { "links", "listing", "link_mutations" });
                return;
            }
            case 1: {
                e.f((Object)databaseWrapper, "database");
                aa1.a.e0(databaseWrapper, "category_click");
                return;
            }
            case 0: {
                e.f((Object)databaseWrapper, "database");
                aa1.a.e0(databaseWrapper, "queries");
            }
        }
    }
}
