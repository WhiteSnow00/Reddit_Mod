// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.database;

import java.util.ArrayList;
import java.io.File;
import java.util.List;
import android.content.Context;

public final class DefaultDatabaseFilesProvider implements DatabaseFilesProvider
{
    private final Context mContext;
    
    public DefaultDatabaseFilesProvider(final Context mContext) {
        this.mContext = mContext;
    }
    
    @Override
    public List<File> getDatabaseFiles() {
        final ArrayList list = new ArrayList();
        final String[] databaseList = this.mContext.databaseList();
        for (int length = databaseList.length, i = 0; i < length; ++i) {
            list.add(this.mContext.getDatabasePath(databaseList[i]));
        }
        return list;
    }
}
