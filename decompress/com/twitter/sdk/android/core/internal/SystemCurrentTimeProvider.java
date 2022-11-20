// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal;

public class SystemCurrentTimeProvider implements CurrentTimeProvider
{
    public long getCurrentTimeMillis() {
        return System.currentTimeMillis();
    }
}
