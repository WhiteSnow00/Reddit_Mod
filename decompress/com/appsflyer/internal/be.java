// 
// Decompiled by Procyon v0.6.0
// 

package com.appsflyer.internal;

import java.util.concurrent.ThreadFactory;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.TimeUnit;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import android.content.Context;

public final class be implements bf
{
    public final int AFInAppEventParameterName;
    public bd AFInAppEventType;
    public Context AFKeystoreWrapper;
    public y AFVersionDeclaration;
    public av valueOf;
    public ExecutorService values;
    
    static {
        Covode.recordClassIndex(2636);
    }
    
    public be() {
        this.AFInAppEventParameterName = (int)TimeUnit.SECONDS.toMillis(30L);
    }
    
    @Override
    public final bd AFInAppEventParameterName() {
        if (this.AFInAppEventType == null) {
            this.AFInAppEventType = new bd();
        }
        return this.AFInAppEventType;
    }
    
    @Override
    public final o AFInAppEventType() {
        final Context afKeystoreWrapper = this.AFKeystoreWrapper;
        if (afKeystoreWrapper != null) {
            return new o(afKeystoreWrapper);
        }
        throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
    }
    
    @Override
    public final av valueOf() {
        if (this.valueOf == null) {
            if (this.AFInAppEventType == null) {
                this.AFInAppEventType = new bd();
            }
            final bd afInAppEventType = this.AFInAppEventType;
            final Context afKeystoreWrapper = this.AFKeystoreWrapper;
            if (afKeystoreWrapper == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            final bh bh = new bh(afKeystoreWrapper);
            final Context afKeystoreWrapper2 = this.AFKeystoreWrapper;
            if (afKeystoreWrapper2 == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            final bc bc = new bc(ai.values(afKeystoreWrapper2));
            if (this.values == null) {
                this.values = PThreadExecutorsUtils.newCachedThreadPool((ThreadFactory)new DefaultThreadFactory("r/internal/be"));
            }
            final ExecutorService values = this.values;
            if (this.AFVersionDeclaration == null) {
                final bj bj = new bj(this.AFInAppEventParameterName);
                if (this.values == null) {
                    this.values = PThreadExecutorsUtils.newCachedThreadPool((ThreadFactory)new DefaultThreadFactory("r/internal/be"));
                }
                this.AFVersionDeclaration = new y(bj, this.values);
            }
            final y afVersionDeclaration = this.AFVersionDeclaration;
            final Context afKeystoreWrapper3 = this.AFKeystoreWrapper;
            if (afKeystoreWrapper3 == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            this.valueOf = new av(afInAppEventType, bh, bc, values, new bg(afVersionDeclaration, new o(afKeystoreWrapper3)));
        }
        return this.valueOf;
    }
}
