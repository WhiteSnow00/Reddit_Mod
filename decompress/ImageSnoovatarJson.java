// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.entity;

import al0.f0;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001¨\u0006\u0007" }, d2 = { "Lcom/reddit/data/snoovatar/entity/ImageSnoovatarJson;", "", "", "encodedImage", "copy", "<init>", "(Ljava/lang/String;)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class ImageSnoovatarJson
{
    public final String a;
    
    public ImageSnoovatarJson(@n(name = "image") final String a) {
        e.f((Object)a, "encodedImage");
        this.a = a;
    }
    
    public final ImageSnoovatarJson copy(@n(name = "image") final String s) {
        e.f((Object)s, "encodedImage");
        return new ImageSnoovatarJson(s);
    }
    
    @Override
    public final boolean equals(final Object o) {
        return this == o || (o instanceof ImageSnoovatarJson && e.a((Object)this.a, (Object)((ImageSnoovatarJson)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return f0.n(a.r("ImageSnoovatarJson(encodedImage="), this.a, ')');
    }
}
