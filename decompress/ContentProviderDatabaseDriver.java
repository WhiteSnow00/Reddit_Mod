// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver;
import java.util.ArrayList;
import java.util.Collections;
import android.database.sqlite.SQLiteException;
import android.database.Cursor;
import com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver$ExecuteResultHandler;
import java.util.Iterator;
import android.content.Context;
import java.util.List;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;

public class ContentProviderDatabaseDriver extends DatabaseDriver2<ContentProviderDatabaseDriver.ContentProviderDatabaseDriver$ContentProviderDatabaseDescriptor>
{
    private static final String sDatabaseName = "content-providers";
    private final ContentProviderSchema[] mContentProviderSchemas;
    private List<String> mTableNames;
    
    public ContentProviderDatabaseDriver(final Context context, final ContentProviderSchema... mContentProviderSchemas) {
        super(context);
        this.mContentProviderSchemas = mContentProviderSchemas;
    }
    
    private String fetchTableName(final String s) {
        for (final String s2 : this.mTableNames) {
            if (s.contains(s2)) {
                return s2;
            }
        }
        return "";
    }
    
    public Database$ExecuteSQLResponse executeSQL(ContentProviderDatabaseDriver.ContentProviderDatabaseDriver$ContentProviderDatabaseDescriptor query, final String s, final BaseDatabaseDriver$ExecuteResultHandler<Database$ExecuteSQLResponse> baseDatabaseDriver$ExecuteResultHandler) throws SQLiteException {
        final ContentProviderSchema contentProviderSchema = this.mContentProviderSchemas[this.mTableNames.indexOf(this.fetchTableName(s))];
        query = (ContentProviderDatabaseDriver.ContentProviderDatabaseDriver$ContentProviderDatabaseDescriptor)((BaseDatabaseDriver)this).mContext.getContentResolver().query(contentProviderSchema.getUri(), contentProviderSchema.getProjection(), (String)null, (String[])null, (String)null);
        try {
            return (Database$ExecuteSQLResponse)baseDatabaseDriver$ExecuteResultHandler.handleSelect((Cursor)query);
        }
        finally {
            ((Cursor)query).close();
        }
    }
    
    public List<ContentProviderDatabaseDriver.ContentProviderDatabaseDriver$ContentProviderDatabaseDescriptor> getDatabaseNames() {
        return Collections.singletonList(new ContentProviderDatabaseDriver.ContentProviderDatabaseDriver$ContentProviderDatabaseDescriptor());
    }
    
    public List<String> getTableNames(final ContentProviderDatabaseDriver.ContentProviderDatabaseDriver$ContentProviderDatabaseDescriptor contentProviderDatabaseDriver$ContentProviderDatabaseDescriptor) {
        if (this.mTableNames == null) {
            this.mTableNames = new ArrayList<String>();
            final ContentProviderSchema[] mContentProviderSchemas = this.mContentProviderSchemas;
            for (int length = mContentProviderSchemas.length, i = 0; i < length; ++i) {
                this.mTableNames.add(mContentProviderSchemas[i].getTableName());
            }
        }
        return this.mTableNames;
    }
}
