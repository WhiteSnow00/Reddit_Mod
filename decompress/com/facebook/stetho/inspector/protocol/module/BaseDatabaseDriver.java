// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.protocol.module;

import android.database.Cursor;
import java.util.List;
import android.database.sqlite.SQLiteException;
import android.content.Context;

public abstract class BaseDatabaseDriver<DESC>
{
    public Context mContext;
    
    public BaseDatabaseDriver(final Context mContext) {
        this.mContext = mContext;
    }
    
    public abstract Database.ExecuteSQLResponse executeSQL(final DESC p0, final String p1, final ExecuteResultHandler<Database.ExecuteSQLResponse> p2) throws SQLiteException;
    
    public Context getContext() {
        return this.mContext;
    }
    
    public abstract List<DESC> getDatabaseNames();
    
    public abstract List<String> getTableNames(final DESC p0);
    
    public interface ExecuteResultHandler<RESULT>
    {
        RESULT handleInsert(final long p0) throws SQLiteException;
        
        RESULT handleRawQuery() throws SQLiteException;
        
        RESULT handleSelect(final Cursor p0) throws SQLiteException;
        
        RESULT handleUpdateDelete(final int p0) throws SQLiteException;
    }
}
