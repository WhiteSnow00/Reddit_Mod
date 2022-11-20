// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = false)
@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/model/PostType;", "", "(Ljava/lang/String;I)V", "UNKNOWN", "SELF", "SELF_IMAGE", "IMAGE", "VIDEO", "SUBMITTED_VIDEO", "WEBSITE", "CROSSPOST", "RPAN_VIDEO", "POLL", "MEDIA_GALLERY", "PREDICTION", "PREDICTION_TOURNAMENT", "LIVE_AUDIO", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
@Keep
public enum PostType
{
    private static final PostType[] $VALUES;
    
    CROSSPOST, 
    IMAGE, 
    LIVE_AUDIO, 
    MEDIA_GALLERY, 
    POLL, 
    PREDICTION, 
    PREDICTION_TOURNAMENT, 
    RPAN_VIDEO, 
    SELF, 
    SELF_IMAGE, 
    SUBMITTED_VIDEO, 
    UNKNOWN, 
    VIDEO, 
    WEBSITE;
    
    private static final PostType[] $values() {
        return new PostType[] { PostType.UNKNOWN, PostType.SELF, PostType.SELF_IMAGE, PostType.IMAGE, PostType.VIDEO, PostType.SUBMITTED_VIDEO, PostType.WEBSITE, PostType.CROSSPOST, PostType.RPAN_VIDEO, PostType.POLL, PostType.MEDIA_GALLERY, PostType.PREDICTION, PostType.PREDICTION_TOURNAMENT, PostType.LIVE_AUDIO };
    }
    
    static {
        $VALUES = $values();
    }
}
