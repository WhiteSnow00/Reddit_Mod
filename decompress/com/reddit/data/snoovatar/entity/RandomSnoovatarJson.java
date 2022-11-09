// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import ak0.m;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u00c6\u0001¨\u0006\t" }, d2 = { "Lcom/reddit/data/snoovatar/entity/RandomSnoovatarJson;", "", "", "encodedImage", "", "accessoryIds", "copy", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class RandomSnoovatarJson
{
    public final String a;
    public final List<String> b;
    
    public RandomSnoovatarJson(@n(name = "image") final String a, @n(name = "accessory_ids") final List<String> b) {
        f.f((Object)a, "encodedImage");
        f.f((Object)b, "accessoryIds");
        this.a = a;
        this.b = b;
    }
    
    public final RandomSnoovatarJson copy(@n(name = "image") final String s, @n(name = "accessory_ids") final List<String> list) {
        f.f((Object)s, "encodedImage");
        f.f((Object)list, "accessoryIds");
        return new RandomSnoovatarJson(s, list);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RandomSnoovatarJson)) {
            return false;
        }
        final RandomSnoovatarJson randomSnoovatarJson = (RandomSnoovatarJson)o;
        return f.a((Object)this.a, (Object)randomSnoovatarJson.a) && f.a((Object)this.b, (Object)randomSnoovatarJson.b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("RandomSnoovatarJson(encodedImage=");
        k.append(this.a);
        k.append(", accessoryIds=");
        return m.n(k, (List)this.b, ')');
    }
}
