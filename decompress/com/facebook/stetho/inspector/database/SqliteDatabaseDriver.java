// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import android.database.sqlite.SQLiteClosable;
import java.util.Collections;
import com.facebook.stetho.inspector.protocol.module.Database$ExecuteSQLResponse;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.io.File;
import java.util.List;
import android.database.sqlite.SQLiteException;
import com.facebook.stetho.common.Util;
import android.database.Cursor;
import com.facebook.stetho.inspector.protocol.module.BaseDatabaseDriver$ExecuteResultHandler;
import android.database.sqlite.SQLiteDatabase;
import android.content.Context;
import com.facebook.stetho.inspector.protocol.module.DatabaseDriver2;

public class SqliteDatabaseDriver extends DatabaseDriver2<SqliteDatabaseDriver.SqliteDatabaseDriver$SqliteDatabaseDescriptor>
{
    private static final String[] UNINTERESTING_FILENAME_SUFFIXES;
    private final DatabaseConnectionProvider mDatabaseConnectionProvider;
    private final DatabaseFilesProvider mDatabaseFilesProvider;
    
    static {
        UNINTERESTING_FILENAME_SUFFIXES = new String[] { "-journal", "-shm", "-uid", "-wal" };
    }
    
    @Deprecated
    public SqliteDatabaseDriver(final Context context) {
        this(context, (DatabaseFilesProvider)new DefaultDatabaseFilesProvider(context), (DatabaseConnectionProvider)new DefaultDatabaseConnectionProvider());
    }
    
    @Deprecated
    public SqliteDatabaseDriver(final Context context, final DatabaseFilesProvider databaseFilesProvider) {
        this(context, databaseFilesProvider, (DatabaseConnectionProvider)new DefaultDatabaseConnectionProvider());
    }
    
    public SqliteDatabaseDriver(final Context context, final DatabaseFilesProvider mDatabaseFilesProvider, final DatabaseConnectionProvider mDatabaseConnectionProvider) {
        super(context);
        this.mDatabaseFilesProvider = mDatabaseFilesProvider;
        this.mDatabaseConnectionProvider = mDatabaseConnectionProvider;
    }
    
    private <T> T executeInsert(final SQLiteDatabase sqLiteDatabase, final String s, final BaseDatabaseDriver$ExecuteResultHandler<T> baseDatabaseDriver$ExecuteResultHandler) {
        return (T)baseDatabaseDriver$ExecuteResultHandler.handleInsert(sqLiteDatabase.compileStatement(s).executeInsert());
    }
    
    private <T> T executeRawQuery(final SQLiteDatabase sqLiteDatabase, final String s, final BaseDatabaseDriver$ExecuteResultHandler<T> baseDatabaseDriver$ExecuteResultHandler) {
        sqLiteDatabase.execSQL(s);
        return (T)baseDatabaseDriver$ExecuteResultHandler.handleRawQuery();
    }
    
    private <T> T executeSelect(SQLiteDatabase rawQuery, final String s, final BaseDatabaseDriver$ExecuteResultHandler<T> baseDatabaseDriver$ExecuteResultHandler) {
        rawQuery = (SQLiteDatabase)rawQuery.rawQuery(s, (String[])null);
        try {
            return (T)baseDatabaseDriver$ExecuteResultHandler.handleSelect((Cursor)rawQuery);
        }
        finally {
            ((Cursor)rawQuery).close();
        }
    }
    
    private <T> T executeUpdateDelete(final SQLiteDatabase sqLiteDatabase, final String s, final BaseDatabaseDriver$ExecuteResultHandler<T> baseDatabaseDriver$ExecuteResultHandler) {
        return (T)baseDatabaseDriver$ExecuteResultHandler.handleUpdateDelete(sqLiteDatabase.compileStatement(s).executeUpdateDelete());
    }
    
    private static String getFirstWord(String substring) {
        final String trim = substring.trim();
        final int index = trim.indexOf(32);
        substring = trim;
        if (index >= 0) {
            substring = trim.substring(0, index);
        }
        return substring;
    }
    
    private SQLiteDatabase openDatabase(final SqliteDatabaseDriver.SqliteDatabaseDriver$SqliteDatabaseDescriptor sqliteDatabaseDriver$SqliteDatabaseDescriptor) throws SQLiteException {
        Util.throwIfNull((Object)sqliteDatabaseDriver$SqliteDatabaseDescriptor);
        return this.mDatabaseConnectionProvider.openDatabase(sqliteDatabaseDriver$SqliteDatabaseDescriptor.file);
    }
    
    private static String removeSuffix(final String s, final String[] array) {
        for (final String s2 : array) {
            if (s.endsWith(s2)) {
                return s.substring(0, s.length() - s2.length());
            }
        }
        return s;
    }
    
    public static List<File> tidyDatabaseList(final List<File> list) {
        final HashSet set = new HashSet((Collection<? extends E>)list);
        final ArrayList list2 = new ArrayList();
        for (final File file : list) {
            final String path = file.getPath();
            final String removeSuffix = removeSuffix(path, SqliteDatabaseDriver.UNINTERESTING_FILENAME_SUFFIXES);
            if (removeSuffix.equals(path) || !set.contains(new File(removeSuffix))) {
                list2.add(file);
            }
        }
        return list2;
    }
    
    public Database$ExecuteSQLResponse executeSQL(SqliteDatabaseDriver.SqliteDatabaseDriver$SqliteDatabaseDescriptor openDatabase, final String s, final BaseDatabaseDriver$ExecuteResultHandler<Database$ExecuteSQLResponse> baseDatabaseDriver$ExecuteResultHandler) throws SQLiteException {
        Util.throwIfNull((Object)s);
        Util.throwIfNull((Object)baseDatabaseDriver$ExecuteResultHandler);
        openDatabase = (SqliteDatabaseDriver.SqliteDatabaseDriver$SqliteDatabaseDescriptor)this.openDatabase(openDatabase);
        try {
            final String upperCase = getFirstWord(s).toUpperCase();
            int n = -1;
            switch (upperCase.hashCode()) {
                case 2012838315: {
                    if (upperCase.equals("DELETE")) {
                        n = 1;
                        break;
                    }
                    break;
                }
                case -591179561: {
                    if (upperCase.equals("EXPLAIN")) {
                        n = 5;
                        break;
                    }
                    break;
                }
                case -1785516855: {
                    if (upperCase.equals("UPDATE")) {
                        n = 0;
                        break;
                    }
                    break;
                }
                case -1852692228: {
                    if (upperCase.equals("SELECT")) {
                        n = 3;
                        break;
                    }
                    break;
                }
                case -1926899396: {
                    if (upperCase.equals("PRAGMA")) {
                        n = 4;
                        break;
                    }
                    break;
                }
                case -2130463047: {
                    if (upperCase.equals("INSERT")) {
                        n = 2;
                        break;
                    }
                    break;
                }
            }
            if (n == 0 || n == 1) {
                return this.executeUpdateDelete((SQLiteDatabase)openDatabase, s, baseDatabaseDriver$ExecuteResultHandler);
            }
            if (n == 2) {
                return this.executeInsert((SQLiteDatabase)openDatabase, s, baseDatabaseDriver$ExecuteResultHandler);
            }
            if (n != 3 && n != 4 && n != 5) {
                return this.executeRawQuery((SQLiteDatabase)openDatabase, s, baseDatabaseDriver$ExecuteResultHandler);
            }
            return this.executeSelect((SQLiteDatabase)openDatabase, s, baseDatabaseDriver$ExecuteResultHandler);
        }
        finally {
            ((SQLiteClosable)openDatabase).close();
        }
    }
    
    public List<SqliteDatabaseDriver.SqliteDatabaseDriver$SqliteDatabaseDescriptor> getDatabaseNames() {
        final ArrayList list = new ArrayList();
        final List<File> databaseFiles = this.mDatabaseFilesProvider.getDatabaseFiles();
        Collections.sort((List<Comparable>)databaseFiles);
        final Iterator<Object> iterator = tidyDatabaseList(databaseFiles).iterator();
        while (iterator.hasNext()) {
            list.add(new SqliteDatabaseDriver.SqliteDatabaseDriver$SqliteDatabaseDescriptor((File)iterator.next()));
        }
        return list;
    }
    
    public List<String> getTableNames(SqliteDatabaseDriver.SqliteDatabaseDriver$SqliteDatabaseDescriptor openDatabase) throws SQLiteException {
        openDatabase = (SqliteDatabaseDriver.SqliteDatabaseDriver$SqliteDatabaseDescriptor)this.openDatabase(openDatabase);
        try {
            final Cursor rawQuery = ((SQLiteDatabase)openDatabase).rawQuery("SELECT name FROM sqlite_master WHERE type IN (?, ?)", new String[] { "table", "view" });
            try {
                final ArrayList<String> list = new ArrayList<String>();
                while (rawQuery.moveToNext()) {
                    list.add(rawQuery.getString(0));
                }
                return list;
            }
            finally {
                rawQuery.close();
            }
        }
        finally {
            ((SQLiteClosable)openDatabase).close();
        }
    }
}
