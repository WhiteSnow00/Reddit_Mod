// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import java.io.IOException;

public interface FileRollOverManager
{
    void cancelTimeBasedFileRollOver();
    
    boolean rollFileOver() throws IOException;
    
    void scheduleTimeBasedRollOverIfNeeded();
}
