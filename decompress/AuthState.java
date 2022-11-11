// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.identity;

import com.twitter.sdk.android.core.Twitter;
import android.app.Activity;
import java.util.concurrent.atomic.AtomicReference;

class AuthState
{
    public final AtomicReference<AuthHandler> authHandlerRef;
    
    public AuthState() {
        this.authHandlerRef = new AtomicReference<AuthHandler>(null);
    }
    
    public boolean beginAuthorize(final Activity activity, final AuthHandler authHandler) {
        final boolean authorizeInProgress = this.isAuthorizeInProgress();
        boolean b = false;
        int n = 0;
        if (authorizeInProgress) {
            Twitter.getLogger().w("Twitter", "Authorize already in progress");
        }
        else if (authHandler.authorize(activity)) {
            final AtomicReference<AuthHandler> authHandlerRef = this.authHandlerRef;
            while (true) {
                while (!authHandlerRef.compareAndSet(null, authHandler)) {
                    if (authHandlerRef.get() != null) {
                        b = (n != 0);
                        if (n == 0) {
                            Twitter.getLogger().w("Twitter", "Failed to update authHandler, authorize already in progress.");
                            b = (n != 0);
                            return b;
                        }
                        return b;
                    }
                }
                n = 1;
                continue;
            }
        }
        return b;
    }
    
    public void endAuthorize() {
        this.authHandlerRef.set(null);
    }
    
    public AuthHandler getAuthHandler() {
        return this.authHandlerRef.get();
    }
    
    public boolean isAuthorizeInProgress() {
        return this.authHandlerRef.get() != null;
    }
}
