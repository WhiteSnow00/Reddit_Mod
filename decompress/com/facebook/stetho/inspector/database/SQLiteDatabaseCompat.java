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
        sInstance = new JellyBeanAndBeyondImpl(null);
    }
    
    public static SQLiteDatabaseCompat getInstance() {
        return SQLiteDatabaseCompat.sInstance;
    }
    
    public abstract void enableFeatures(@SQLiteOpenOptions final int p0, final SQLiteDatabase p1);
    
    public abstract int provideOpenFlags(@SQLiteOpenOptions final int p0);
    
    public static class IceCreamSandwichImpl extends SQLiteDatabaseCompat
    {
        private IceCreamSandwichImpl() {
        }
        
        @Override
        public void enableFeatures(@SQLiteOpenOptions final int n, final SQLiteDatabase sqLiteDatabase) {
            if ((n & 0x1) != 0x0) {
                sqLiteDatabase.enableWriteAheadLogging();
            }
            if ((n & 0x2) != 0x0) {
                sqLiteDatabase.execSQL("PRAGMA foreign_keys = ON");
            }
        }
        
        @Override
        public int provideOpenFlags(@SQLiteOpenOptions final int n) {
            return 0;
        }
    }
    
    public static class JellyBeanAndBeyondImpl extends SQLiteDatabaseCompat
    {
        private JellyBeanAndBeyondImpl() {
        }
        
        @Override
        public void enableFeatures(@SQLiteOpenOptions final int n, final SQLiteDatabase sqLiteDatabase) {
            if ((n & 0x2) != 0x0) {
                sqLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }
        }
        
        @Override
        public int provideOpenFlags(@SQLiteOpenOptions int n) {
            if ((n & 0x1) != 0x0) {
                n = 536870912;
            }
            else {
                n = 0;
            }
            return n;
        }
    }
    
    public @interface SQLiteOpenOptions {
    }
}
