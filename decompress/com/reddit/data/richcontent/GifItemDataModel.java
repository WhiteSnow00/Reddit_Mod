// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import al0.g7;
import sg2.e;
import java.util.Map;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/richcontent/GifItemDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class GifItemDataModel
{
    public final String a;
    public final Map<String, GifImageDataModel> b;
    public final GifUserDataModel c;
    
    public GifItemDataModel(final String a, final Map<String, GifImageDataModel> b, final GifUserDataModel c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GifItemDataModel)) {
            return false;
        }
        final GifItemDataModel gifItemDataModel = (GifItemDataModel)o;
        return e.a((Object)this.a, (Object)gifItemDataModel.a) && e.a((Object)this.b, (Object)gifItemDataModel.b) && e.a((Object)this.c, (Object)gifItemDataModel.c);
    }
    
    @Override
    public final int hashCode() {
        final int a = g7.a((Map)this.b, this.a.hashCode() * 31, 31);
        final GifUserDataModel c = this.c;
        int hashCode;
        if (c == null) {
            hashCode = 0;
        }
        else {
            hashCode = c.hashCode();
        }
        return a + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder r = a.r("GifItemDataModel(id=");
        r.append(this.a);
        r.append(", images=");
        r.append(this.b);
        r.append(", user=");
        r.append(this.c);
        r.append(')');
        return r.toString();
    }
}
