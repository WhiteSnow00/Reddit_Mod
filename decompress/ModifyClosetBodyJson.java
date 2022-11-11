// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import sg2.e;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u0005\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u00c6\u0001¨\u0006\b" }, d2 = { "Lcom/reddit/data/snoovatar/entity/ModifyClosetBodyJson;", "", "", "", "accessoryIds", "copy", "<init>", "(Ljava/util/List;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ModifyClosetBodyJson
{
    public final List<String> a;
    
    public ModifyClosetBodyJson(@n(name = "accessory_ids") final List<String> a) {
        e.f((Object)a, "accessoryIds");
        this.a = a;
    }
    
    public final ModifyClosetBodyJson copy(@n(name = "accessory_ids") final List<String> list) {
        e.f((Object)list, "accessoryIds");
        return new ModifyClosetBodyJson(list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ModifyClosetBodyJson && e.a((Object)this.a, (Object)((ModifyClosetBodyJson)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return d.o(a.r("ModifyClosetBodyJson(accessoryIds="), (List)this.a, ')');
    }
}
