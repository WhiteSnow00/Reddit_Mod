// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.content.res.Configuration;

public final class MultiWindowModeChangedInfo
{
    private final boolean mIsInMultiWindowMode;
    private final Configuration mNewConfig;
    
    public MultiWindowModeChangedInfo(final boolean mIsInMultiWindowMode) {
        this.mIsInMultiWindowMode = mIsInMultiWindowMode;
        this.mNewConfig = null;
    }
    
    public MultiWindowModeChangedInfo(final boolean mIsInMultiWindowMode, final Configuration mNewConfig) {
        this.mIsInMultiWindowMode = mIsInMultiWindowMode;
        this.mNewConfig = mNewConfig;
    }
    
    public Configuration getNewConfig() {
        final Configuration mNewConfig = this.mNewConfig;
        if (mNewConfig != null) {
            return mNewConfig;
        }
        throw new IllegalStateException("MultiWindowModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }
    
    public boolean isInMultiWindowMode() {
        return this.mIsInMultiWindowMode;
    }
}
