// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

import com.twitter.sdk.android.core.Session;

public interface SessionVerifier<T extends Session>
{
    void verifySession(final T p0);
}
