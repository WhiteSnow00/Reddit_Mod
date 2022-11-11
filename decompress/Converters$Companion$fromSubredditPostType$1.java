// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.db.converters;

import ah2.f;
import kotlin.Metadata;
import com.reddit.common.subreddit.SubredditPostType;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lcom/reddit/common/subreddit/SubredditPostType;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class Converters$Companion$fromSubredditPostType$1 extends Lambda implements l<SubredditPostType, CharSequence>
{
    public static final Converters$Companion$fromSubredditPostType$1 INSTANCE;
    
    static {
        INSTANCE = new Converters$Companion$fromSubredditPostType$1();
    }
    
    public Converters$Companion$fromSubredditPostType$1() {
        super(1);
    }
    
    public final CharSequence invoke(final SubredditPostType subredditPostType) {
        f.f((Object)subredditPostType, "it");
        return ((Enum)subredditPostType).name();
    }
}
