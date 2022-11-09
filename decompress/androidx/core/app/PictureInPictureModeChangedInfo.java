// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.content.res.Configuration;

public final class PictureInPictureModeChangedInfo
{
    private final boolean mIsInPictureInPictureMode;
    private final Configuration mNewConfig;
    
    public PictureInPictureModeChangedInfo(final boolean mIsInPictureInPictureMode) {
        this.mIsInPictureInPictureMode = mIsInPictureInPictureMode;
        this.mNewConfig = null;
    }
    
    public PictureInPictureModeChangedInfo(final boolean mIsInPictureInPictureMode, final Configuration mNewConfig) {
        this.mIsInPictureInPictureMode = mIsInPictureInPictureMode;
        this.mNewConfig = mNewConfig;
    }
    
    public Configuration getNewConfig() {
        final Configuration mNewConfig = this.mNewConfig;
        if (mNewConfig != null) {
            return mNewConfig;
        }
        throw new IllegalStateException("PictureInPictureModeChangedInfo must be constructed with the constructor that takes a Configuration to call getNewConfig(). Are you running on an API 26 or higher device that makes this information available?");
    }
    
    public boolean isInPictureInPictureMode() {
        return this.mIsInPictureInPictureMode;
    }
}