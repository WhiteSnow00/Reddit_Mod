// 
// Decompiled by Procyon v0.6.0
// 

package com.bytedance.android.live.base.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import com.bytedance.covode.number.Covode;
import com.bytedance.android.livesdk.model.GameTag;
import java.util.List;
import com.google.gson.a.c;
import com.bytedance.android.livesdk.model.Hashtag;

public final class HashtagResponse
{
    @c(LIZ = "game_hashtag")
    public Hashtag gameHashTag;
    @c(LIZ = "game_tag_list")
    public List<GameTag> gameTagList;
    @c(LIZ = "hashtag")
    public List<Hashtag> hashtags;
    @c(LIZ = "third_party_hashtag")
    public List<Hashtag> obsHashTag;
    
    static {
        Covode.recordClassIndex(4903);
    }
    
    public HashtagResponse() {
        this(null, null, null, null, 15, null);
    }
    
    public HashtagResponse(final List<Hashtag> hashtags, final List<GameTag> gameTagList, final Hashtag gameHashTag, final List<Hashtag> obsHashTag) {
        this.hashtags = hashtags;
        this.gameTagList = gameTagList;
        this.gameHashTag = gameHashTag;
        this.obsHashTag = obsHashTag;
    }
}
