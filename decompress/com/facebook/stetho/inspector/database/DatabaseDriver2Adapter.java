// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import com.facebook.stetho.inspector.protocol.module.DatabaseDescriptor;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import com.facebook.stetho.inspector.protocol.module.Database;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;

@Deprecated
public class DatabaseDriver2Adapter extends DatabaseDriver2<StringDatabaseDescriptor>
{
    private final Database.DatabaseDriver mLegacy;
    
    public DatabaseDriver2Adapter(final Database.DatabaseDriver mLegacy) {
        super(mLegacy.getContext());
        this.mLegacy = mLegacy;
    }
    
    public Database.ExecuteSQLResponse executeSQL(final StringDatabaseDescriptor stringDatabaseDescriptor, final String s, final BaseDatabaseDriver.ExecuteResultHandler executeResultHandler) throws SQLiteException {
        return this.mLegacy.executeSQL(stringDatabaseDescriptor.name, s, executeResultHandler);
    }
    
    public List<StringDatabaseDescriptor> getDatabaseNames() {
        final List<String> databaseNames = this.mLegacy.getDatabaseNames();
        final ArrayList list = new ArrayList<StringDatabaseDescriptor>(databaseNames.size());
        final Iterator iterator = databaseNames.iterator();
        while (iterator.hasNext()) {
            list.add(new StringDatabaseDescriptor(iterator.next().toString()));
        }
        return (List<StringDatabaseDescriptor>)list;
    }
    
    public List<String> getTableNames(final StringDatabaseDescriptor stringDatabaseDescriptor) {
        return this.mLegacy.getTableNames(stringDatabaseDescriptor.name);
    }
    
    public static class StringDatabaseDescriptor implements DatabaseDescriptor
    {
        public final String name;
        
        public StringDatabaseDescriptor(final String name) {
            this.name = name;
        }
        
        @Override
        public String name() {
            return this.name;
        }
    }
}
