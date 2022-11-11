// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

public interface DatabaseConnectionProvider
{
    SQLiteDatabase openDatabase(final File p0) throws SQLiteException;
}
