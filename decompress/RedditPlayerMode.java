// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.player.player;

import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lcom/reddit/video/player/player/RedditPlayerMode;", "", "()V", "MODE_AD", "", "MODE_GIF", "MODE_MEDIA_SUBMIT", "MODE_NO_UI", "MODE_VIDEO", "player_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class RedditPlayerMode
{
    public static final RedditPlayerMode INSTANCE;
    public static final String MODE_AD = "ad";
    public static final String MODE_GIF = "gif";
    public static final String MODE_MEDIA_SUBMIT = "mediaSubmit";
    public static final String MODE_NO_UI = "noUi";
    public static final String MODE_VIDEO = "video";
    
    static {
        INSTANCE = new RedditPlayerMode();
    }
    
    private RedditPlayerMode() {
    }
}
