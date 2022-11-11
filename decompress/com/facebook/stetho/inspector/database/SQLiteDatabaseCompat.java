// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase;

public abstract class SQLiteDatabaseCompat
{
    public static final int ENABLE_FOREIGN_KEY_CONSTRAINTS = 2;
    public static final int ENABLE_WRITE_AHEAD_LOGGING = 1;
    private static final SQLiteDatabaseCompat sInstance;
    
    static {
        sInstance = (SQLiteDatabaseCompat)new SQLiteDatabaseCompat.SQLiteDatabaseCompat$JellyBeanAndBeyondImpl((SQLiteDatabaseCompat$1)null);
    }
    
    public static SQLiteDatabaseCompat getInstance() {
        return SQLiteDatabaseCompat.sInstance;
    }
    
    public abstract void enableFeatures(@SQLiteOpenOptions final int p0, final SQLiteDatabase p1);
    
    public abstract int provideOpenFlags(@SQLiteOpenOptions final int p0);
    
    public @interface SQLiteOpenOptions {
    }
}
