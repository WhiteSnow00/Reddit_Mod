// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver$ExecuteResultHandler;
import com.facebook.stetho.inspector.protocol.module.Database$DatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;

@Deprecated
public class DatabaseDriver2Adapter extends DatabaseDriver2<DatabaseDriver2Adapter.DatabaseDriver2Adapter$StringDatabaseDescriptor>
{
    private final Database$DatabaseDriver mLegacy;
    
    public DatabaseDriver2Adapter(final Database$DatabaseDriver mLegacy) {
        super(((BaseDatabaseDriver)mLegacy).getContext());
        this.mLegacy = mLegacy;
    }
    
    public Database$ExecuteSQLResponse executeSQL(final DatabaseDriver2Adapter.DatabaseDriver2Adapter$StringDatabaseDescriptor databaseDriver2Adapter$StringDatabaseDescriptor, final String s, final BaseDatabaseDriver$ExecuteResultHandler baseDatabaseDriver$ExecuteResultHandler) throws SQLiteException {
        return ((BaseDatabaseDriver)this.mLegacy).executeSQL((Object)databaseDriver2Adapter$StringDatabaseDescriptor.name, s, baseDatabaseDriver$ExecuteResultHandler);
    }
    
    public List<DatabaseDriver2Adapter.DatabaseDriver2Adapter$StringDatabaseDescriptor> getDatabaseNames() {
        final List databaseNames = ((BaseDatabaseDriver)this.mLegacy).getDatabaseNames();
        final ArrayList list = new ArrayList<DatabaseDriver2Adapter.DatabaseDriver2Adapter$StringDatabaseDescriptor>(databaseNames.size());
        final Iterator iterator = databaseNames.iterator();
        while (iterator.hasNext()) {
            list.add(new DatabaseDriver2Adapter.DatabaseDriver2Adapter$StringDatabaseDescriptor(iterator.next().toString()));
        }
        return (List<DatabaseDriver2Adapter.DatabaseDriver2Adapter$StringDatabaseDescriptor>)list;
    }
    
    public List<String> getTableNames(final DatabaseDriver2Adapter.DatabaseDriver2Adapter$StringDatabaseDescriptor databaseDriver2Adapter$StringDatabaseDescriptor) {
        return ((BaseDatabaseDriver)this.mLegacy).getTableNames((Object)databaseDriver2Adapter$StringDatabaseDescriptor.name);
    }
}
