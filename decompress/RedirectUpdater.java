// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model.v2.live;

public interface RedirectUpdater
{
    void onFailure(final Throwable p0, final String p1);
    
    void onRedirect(final String p0);
}
