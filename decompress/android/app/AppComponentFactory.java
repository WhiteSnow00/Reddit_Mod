// 
// Decompiled by Procyon v0.6.0
// 

package android.app;

import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.annotation.Nullable;
import android.content.Intent;
import android.annotation.NonNull;

public class AppComponentFactory
{
    static {
        throw new NoClassDefFoundError();
    }
    
    @NonNull
    public native Activity instantiateActivity(@NonNull final ClassLoader p0, @NonNull final String p1, @Nullable final Intent p2) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
    
    @NonNull
    public native Application instantiateApplication(@NonNull final ClassLoader p0, @NonNull final String p1) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
    
    @NonNull
    public native ContentProvider instantiateProvider(@NonNull final ClassLoader p0, @NonNull final String p1) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
    
    @NonNull
    public native BroadcastReceiver instantiateReceiver(@NonNull final ClassLoader p0, @NonNull final String p1, @Nullable final Intent p2) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
    
    @NonNull
    public native Service instantiateService(@NonNull final ClassLoader p0, @NonNull final String p1, @Nullable final Intent p2) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
}
