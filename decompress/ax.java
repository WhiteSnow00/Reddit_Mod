// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import android.content.pm.PackageItemInfo;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import android.content.pm.ProviderInfo;
import com.appsflyer.AFLogger;
import java.security.NoSuchAlgorithmException;
import android.content.pm.PackageManager$NameNotFoundException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.FutureTask;
import android.content.Context;

public abstract class ax<T>
{
    public final Context AFInAppEventType;
    public final String[] AFKeystoreWrapper;
    public final FutureTask<T> valueOf;
    public final String values;
    
    static {
        Covode.recordClassIndex(2628);
    }
    
    public ax(final Context afInAppEventType, final String values, final String... afKeystoreWrapper) {
        this.valueOf = new FutureTask<T>(new Callable<T>() {
            static {
                Covode.recordClassIndex(2629);
            }
            
            @Override
            public final T call() {
                if (ax.this.AFInAppEventParameterName()) {
                    return ax.this.values();
                }
                return null;
            }
        });
        this.AFInAppEventType = afInAppEventType;
        this.values = values;
        this.AFKeystoreWrapper = afKeystoreWrapper;
    }
    
    public final boolean AFInAppEventParameterName() {
        final boolean b = false;
        ProviderInfo resolveContentProvider = null;
        try {
            resolveContentProvider = this.AFInAppEventType.getPackageManager().resolveContentProvider(this.values, 128);
            boolean b2 = b;
            if (resolveContentProvider != null) {
                b2 = b;
                if (Arrays.asList(this.AFKeystoreWrapper).contains(ac.values(this.AFInAppEventType.getPackageManager(), ((PackageItemInfo)resolveContentProvider).packageName))) {
                    b2 = true;
                }
            }
            return b2;
        }
        catch (final CertificateException resolveContentProvider) {}
        catch (final PackageManager$NameNotFoundException resolveContentProvider) {}
        catch (final NoSuchAlgorithmException ex) {}
        AFLogger.valueOf(((Throwable)resolveContentProvider).getMessage(), (Throwable)resolveContentProvider);
        return false;
    }
    
    public T valueOf() {
        try {
            return this.valueOf.get(500L, TimeUnit.MILLISECONDS);
        }
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex) {}
        catch (final TimeoutException ex2) {}
        final ExecutionException ex;
        AFLogger.valueOf(ex.getMessage(), ex);
        return null;
    }
    
    public abstract T values();
}
