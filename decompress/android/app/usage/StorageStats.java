// 
// Decompiled by Procyon v0.6.0
// 

package android.app.usage;

import android.os.Parcelable;

public final class StorageStats implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public native long getAppBytes();
    
    public native long getCacheBytes();
    
    public native long getDataBytes();
}
