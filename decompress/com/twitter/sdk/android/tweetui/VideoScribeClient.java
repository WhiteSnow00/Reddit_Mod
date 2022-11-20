// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui;

import com.twitter.sdk.android.core.internal.scribe.ScribeItem;

public interface VideoScribeClient
{
    void impression(final ScribeItem p0);
    
    void play(final ScribeItem p0);
}
