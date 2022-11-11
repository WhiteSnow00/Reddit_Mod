// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.practice_feed;

import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import kotlin.Metadata;
import com.reddit.domain.model.FlairRichTextItem;
import java.util.List;
import com.squareup.moshi.JsonAdapter;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/domain/model/FlairRichTextItem;", "kotlin.jvm.PlatformType", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class RemoteGqlPracticeFeedDataSource$richTextAdapter$2 extends Lambda implements a<JsonAdapter<List<? extends FlairRichTextItem>>>
{
    public final /* synthetic */ com.reddit.data.practice_feed.a this$0;
    
    public RemoteGqlPracticeFeedDataSource$richTextAdapter$2(final com.reddit.data.practice_feed.a this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final JsonAdapter<List<FlairRichTextItem>> invoke() {
        return (JsonAdapter<List<FlairRichTextItem>>)this.this$0.b.b((Type)a0.d((Class)List.class, new Type[] { FlairRichTextItem.class }));
    }
}
