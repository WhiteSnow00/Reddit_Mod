// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.tweetui.internal;

import android.view.View;

public interface HighlightedClickableSpan
{
    boolean isSelected();
    
    void onClick(final View p0);
    
    void select(final boolean p0);
}
