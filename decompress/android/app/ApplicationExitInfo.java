// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import android.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import android.annotation.NonNull;
import android.os.Parcelable;

public final class ApplicationExitInfo implements Parcelable
{
    static {
        throw new NoClassDefFoundError();
    }
    
    public native int getImportance();
    
    public native int getPid();
    
    @NonNull
    public native String getProcessName();
    
    public native long getPss();
    
    public native int getReason();
    
    public native long getRss();
    
    public native long getTimestamp();
    
    @Nullable
    public native InputStream getTraceInputStream() throws IOException;
    
    @Override
    public native String toString();
}
