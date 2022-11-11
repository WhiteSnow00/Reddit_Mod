// 
// Decompiled by Procyon v0.6.0
// 

package com.facebook.stetho.inspector.elements.android;

import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.inspector.elements.DocumentProvider;
import com.facebook.stetho.common.android.HandlerUtil;
import android.os.Looper;
import com.facebook.stetho.common.Util;
import android.os.Handler;
import com.facebook.stetho.inspector.elements.DescriptorProvider;
import java.util.List;
import android.app.Application;
import com.facebook.stetho.common.ThreadBound;
import com.facebook.stetho.inspector.elements.DocumentProviderFactory;

public final class AndroidDocumentProviderFactory implements DocumentProviderFactory, ThreadBound
{
    private final Application mApplication;
    private final List<DescriptorProvider> mDescriptorProviders;
    private final Handler mHandler;
    
    public AndroidDocumentProviderFactory(final Application application, final List<DescriptorProvider> list) {
        this.mApplication = (Application)Util.throwIfNull((Object)application);
        this.mDescriptorProviders = (List)Util.throwIfNull((Object)list);
        this.mHandler = new Handler(Looper.getMainLooper());
    }
    
    public boolean checkThreadAccess() {
        return HandlerUtil.checkThreadAccess(this.mHandler);
    }
    
    public DocumentProvider create() {
        return (DocumentProvider)new AndroidDocumentProvider(this.mApplication, (List)this.mDescriptorProviders, (ThreadBound)this);
    }
    
    public <V> V postAndWait(final UncheckedCallable<V> uncheckedCallable) {
        return (V)HandlerUtil.postAndWait(this.mHandler, (UncheckedCallable)uncheckedCallable);
    }
    
    public void postAndWait(final Runnable runnable) {
        HandlerUtil.postAndWait(this.mHandler, runnable);
    }
    
    public void postDelayed(final Runnable runnable, final long n) {
        if (this.mHandler.postDelayed(runnable, n)) {
            return;
        }
        throw new RuntimeException("Handler.postDelayed() returned false");
    }
    
    public void removeCallbacks(final Runnable runnable) {
        this.mHandler.removeCallbacks(runnable);
    }
    
    public void verifyThreadAccess() {
        HandlerUtil.verifyThreadAccess(this.mHandler);
    }
}
