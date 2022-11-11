// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

public class DefaultDatabaseConnectionProvider implements DatabaseConnectionProvider
{
    @SQLiteDatabaseCompat.SQLiteOpenOptions
    public int determineOpenOptions(final File file) {
        final String parent = file.getParent();
        final StringBuilder sb = new StringBuilder();
        sb.append(file.getName());
        sb.append("-wal");
        return new File(parent, sb.toString()).exists() ? 1 : 0;
    }
    
    @Override
    public SQLiteDatabase openDatabase(final File file) throws SQLiteException {
        return this.performOpen(file, this.determineOpenOptions(file));
    }
    
    public SQLiteDatabase performOpen(final File file, @SQLiteDatabaseCompat.SQLiteOpenOptions final int n) {
        final SQLiteDatabaseCompat instance = SQLiteDatabaseCompat.getInstance();
        final SQLiteDatabase openDatabase = SQLiteDatabase.openDatabase(file.getAbsolutePath(), (SQLiteDatabase$CursorFactory)null, instance.provideOpenFlags(n) | 0x0);
        instance.enableFeatures(n, openDatabase);
        return openDatabase;
    }
}
