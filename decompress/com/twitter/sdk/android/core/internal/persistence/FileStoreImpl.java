// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.persistence;

import com.twitter.sdk.android.core.Twitter;
import android.os.Environment;
import java.io.File;
import android.content.Context;

public class FileStoreImpl implements FileStore
{
    private final Context context;
    
    public FileStoreImpl(final Context context) {
        if (context != null) {
            this.context = context;
            return;
        }
        throw new IllegalArgumentException("Context must not be null");
    }
    
    public File getCacheDir() {
        return this.prepare(this.context.getCacheDir());
    }
    
    public File getExternalCacheDir() {
        if (this.isExternalStorageAvailable()) {
            return this.prepare(this.context.getExternalCacheDir());
        }
        return this.prepare(null);
    }
    
    public File getExternalFilesDir() {
        if (this.isExternalStorageAvailable()) {
            return this.prepare(this.context.getExternalFilesDir((String)null));
        }
        return this.prepare(null);
    }
    
    public File getFilesDir() {
        return this.prepare(this.context.getFilesDir());
    }
    
    public boolean isExternalStorageAvailable() {
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Twitter.getLogger().w("Twitter", "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
            return false;
        }
        return true;
    }
    
    public File prepare(final File file) {
        if (file != null) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            Twitter.getLogger().w("Twitter", "Couldn't create file");
        }
        else {
            Twitter.getLogger().d("Twitter", "Null File");
        }
        return null;
    }
}
