// 
// Decompiled by Procyon v0.6.0
// 

package j70;

import cg.d;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import com.raizlabs.android.dbflow.sql.migration.BaseMigration;

public final class e extends BaseMigration
{
    public final int a;
    
    public e(final int a) {
        this.a = a;
    }
    
    public final void migrate(final DatabaseWrapper databaseWrapper) {
        switch (this.a) {
            default: {
                ng2.e.f((Object)databaseWrapper, "database");
                d.c0(databaseWrapper, new String[] { "ad_event" });
                return;
            }
            case 2: {
                ng2.e.f((Object)databaseWrapper, "database");
                d.c0(databaseWrapper, new String[] { "announcement" });
                return;
            }
            case 1: {
                ng2.e.f((Object)databaseWrapper, "database");
                d.M1(databaseWrapper, "category_click");
                return;
            }
            case 0: {
                ng2.e.f((Object)databaseWrapper, "database");
                d.c0(databaseWrapper, new String[] { "link", "image_resolution", "outbound_link" });
            }
        }
    }
}
