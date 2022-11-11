// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import ru2.f;
import ff2.c0;
import ru2.t;
import ru2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H'J@\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u0002H'J\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¨\u0006\u0010" }, d2 = { "Lcom/reddit/data/richcontent/RemoteGifDataSource;", "", "", "apiKey", "rating", "", "offset", "Lff2/c0;", "Lcom/reddit/data/richcontent/GifResponseDataModel;", "trending", "searchTerm", "language", "search", "userSubredditDisplayName", "Lcom/reddit/data/richcontent/GifDetailResponseDataModel;", "gifDetail", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteGifDataSource
{
    @f("gifs/{gif_id}")
    c0<GifDetailResponseDataModel> gifDetail(@s("gif_id") final String p0, @t("api_key") final String p1);
    
    @f("gifs/search")
    c0<GifResponseDataModel> search(@t("api_key") final String p0, @t("rating") final String p1, @t("q") final String p2, @t("offset") final int p3, @t("language") final String p4);
    
    @f("gifs/trending")
    c0<GifResponseDataModel> trending(@t("api_key") final String p0, @t("rating") final String p1, @t("offset") final int p2);
}
