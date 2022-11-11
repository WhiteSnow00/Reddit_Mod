// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.gms.net;

import java.util.Arrays;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.InvocationTargetException;
import org.chromium.net.ExperimentalCronetEngine$Builder;
import org.chromium.net.ICronetEngineBuilder;
import lw0.b;
import org.chromium.net.CronetEngine$Builder;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import android.util.Log;
import qe.a;
import com.google.android.apps.common.proguard.UsedByReflection;
import android.content.Context;
import androidx.annotation.Keep;
import org.chromium.net.CronetProvider;

@Keep
public class PlayServicesCronetProvider extends CronetProvider
{
    private static final String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final String TAG = "PlayServicesCronet";
    
    @UsedByReflection("CronetAPI")
    public PlayServicesCronetProvider(final Context context) {
        super(context);
    }
    
    private void tryToInstallCronetProvider() {
        try {
            a.a(super.mContext);
        }
        catch (final GooglePlayServicesNotAvailableException ex) {
            if (Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        }
        catch (final GooglePlayServicesRepairableException ex2) {
            if (Log.isLoggable("PlayServicesCronet", 4)) {
                Log.i("PlayServicesCronet", "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }
    
    @Keep
    public CronetEngine$Builder createBuilder() {
        try {
            a.a(super.mContext);
            Object o = null;
            try {
                o = a.b;
                synchronized (o) {
                    final DynamiteModule c = a.c;
                    monitorexit(o);
                    b.R((Object)c);
                    o = c.a.getClassLoader();
                    b.R(o);
                    o = new ExperimentalCronetEngine$Builder((ICronetEngineBuilder)((ClassLoader)o).loadClass("org.chromium.net.impl.NativeCronetEngineBuilderImpl").asSubclass(ICronetEngineBuilder.class).getConstructor(Context.class).newInstance(super.mContext));
                }
            }
            catch (final InvocationTargetException o) {}
            catch (final InstantiationException o) {}
            catch (final IllegalAccessException o) {}
            catch (final NoSuchMethodException o) {}
            catch (final ClassNotFoundException ex) {}
            final ClassLoader classLoader = null;
            final ClassLoader classLoader2 = (ClassLoader)o;
            o = classLoader;
            if (classLoader2 == null) {
                b.S(o, "The value of the constructed builder should never be null");
                return (CronetEngine$Builder)o;
            }
            throw new RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", (Throwable)classLoader2);
        }
        catch (final GooglePlayServicesNotAvailableException ex2) {
            throw new IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", (Throwable)ex2);
        }
        catch (final GooglePlayServicesRepairableException ex3) {
            throw new IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", (Throwable)ex3);
        }
    }
    
    public boolean equals(final Object o) {
        boolean b = false;
        if (o != this) {
            if (!(o instanceof PlayServicesCronetProvider)) {
                return b;
            }
            if (!super.mContext.equals(((PlayServicesCronetProvider)o).mContext)) {
                return false;
            }
        }
        b = true;
        return b;
    }
    
    @Keep
    public String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }
    
    @Keep
    public String getVersion() {
        this.tryToInstallCronetProvider();
        synchronized (a.b) {
            return a.d;
        }
    }
    
    public int hashCode() {
        return Arrays.hashCode(new Object[] { PlayServicesCronetProvider.class, super.mContext });
    }
    
    @Keep
    public boolean isEnabled() {
        this.tryToInstallCronetProvider();
        synchronized (a.b) {
            final DynamiteModule c = a.c;
            monitorexit(a.b);
            return c != null;
        }
    }
}
