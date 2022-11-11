// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import java.util.Locale;
import ah2.f;
import kotlin.Metadata;
import com.reddit.search.domain.model.FilterPostType;
import zg2.l;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "Lcom/reddit/search/domain/model/FilterPostType;", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class RedditRemoteSearchGqlDataSource$getFilterInput$1$3$1 extends Lambda implements l<FilterPostType, CharSequence>
{
    public static final RedditRemoteSearchGqlDataSource$getFilterInput$1$3$1 INSTANCE;
    
    static {
        INSTANCE = new RedditRemoteSearchGqlDataSource$getFilterInput$1$3$1();
    }
    
    public RedditRemoteSearchGqlDataSource$getFilterInput$1$3$1() {
        super(1);
    }
    
    public final CharSequence invoke(final FilterPostType filterPostType) {
        f.f((Object)filterPostType, "it");
        final String lowerCase = ((Enum)filterPostType).name().toLowerCase(Locale.ROOT);
        f.e((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }
}
