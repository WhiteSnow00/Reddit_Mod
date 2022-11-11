// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video;

import android.net.Uri;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0006H&¨\u0006\u0007" }, d2 = { "Lcom/reddit/video/creation/video/VideoDurationChecker;", "", "getDurationMillis", "", "uri", "Landroid/net/Uri;", "", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public interface VideoDurationChecker
{
    long getDurationMillis(final Uri p0);
    
    long getDurationMillis(final String p0);
}
