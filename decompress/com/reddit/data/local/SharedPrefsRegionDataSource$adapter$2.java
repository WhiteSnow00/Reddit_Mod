// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.local;

import com.squareup.moshi.a0;
import java.lang.reflect.Type;
import kotlin.Metadata;
import com.reddit.domain.model.Region;
import java.util.List;
import com.squareup.moshi.JsonAdapter;
import zg2.a;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "Lcom/squareup/moshi/JsonAdapter;", "", "Lcom/reddit/domain/model/Region;", "kotlin.jvm.PlatformType", "invoke" }, k = 3, mv = { 1, 7, 1 }, xi = 48)
final class SharedPrefsRegionDataSource$adapter$2 extends Lambda implements a<JsonAdapter<List<? extends Region>>>
{
    public final /* synthetic */ d this$0;
    
    public SharedPrefsRegionDataSource$adapter$2(final d this$0) {
        this.this$0 = this$0;
        super(0);
    }
    
    public final JsonAdapter<List<Region>> invoke() {
        return (JsonAdapter<List<Region>>)this.this$0.a.b((Type)a0.d((Class)List.class, new Type[] { Region.class }));
    }
}
