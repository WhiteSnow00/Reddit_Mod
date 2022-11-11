// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase$CursorFactory;
import android.support.v4.media.a;
import android.content.SharedPreferences;
import java.io.File;
import android.content.Context;
import android.content.ContextWrapper;

class TwitterContext extends ContextWrapper
{
    private final String componentName;
    private final String componentPath;
    
    public TwitterContext(final Context context, final String componentName, final String componentPath) {
        super(context);
        this.componentName = componentName;
        this.componentPath = componentPath;
    }
    
    public File getCacheDir() {
        return new File(super.getCacheDir(), this.componentPath);
    }
    
    public File getDatabasePath(final String s) {
        final File file = new File(super.getDatabasePath(s).getParentFile(), this.componentPath);
        file.mkdirs();
        return new File(file, s);
    }
    
    public File getExternalCacheDir() {
        return new File(super.getExternalCacheDir(), this.componentPath);
    }
    
    public File getExternalFilesDir(final String s) {
        return new File(super.getExternalFilesDir(s), this.componentPath);
    }
    
    public File getFilesDir() {
        return new File(super.getFilesDir(), this.componentPath);
    }
    
    public SharedPreferences getSharedPreferences(final String s, final int n) {
        return super.getSharedPreferences(a.l(new StringBuilder(), this.componentName, ":", s), n);
    }
    
    public SQLiteDatabase openOrCreateDatabase(final String s, final int n, final SQLiteDatabase$CursorFactory sqLiteDatabase$CursorFactory) {
        return SQLiteDatabase.openOrCreateDatabase(this.getDatabasePath(s), sqLiteDatabase$CursorFactory);
    }
    
    public SQLiteDatabase openOrCreateDatabase(final String s, final int n, final SQLiteDatabase$CursorFactory sqLiteDatabase$CursorFactory, final DatabaseErrorHandler databaseErrorHandler) {
        return SQLiteDatabase.openOrCreateDatabase(this.getDatabasePath(s).getPath(), sqLiteDatabase$CursorFactory, databaseErrorHandler);
    }
}
