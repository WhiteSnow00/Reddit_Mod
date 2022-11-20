// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

public interface EventsStrategy<T> extends FileRollOverManager, EventsManager<T>
{
    FilesSender getFilesSender();
}
