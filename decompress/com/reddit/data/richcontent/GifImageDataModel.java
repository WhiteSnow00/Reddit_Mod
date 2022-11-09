// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/data/richcontent/GifImageDataModel;", "", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class GifImageDataModel
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    
    public GifImageDataModel(final String a, final String b, final String c, final String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GifImageDataModel)) {
            return false;
        }
        final GifImageDataModel gifImageDataModel = (GifImageDataModel)o;
        return f.a((Object)this.a, (Object)gifImageDataModel.a) && f.a((Object)this.b, (Object)gifImageDataModel.b) && f.a((Object)this.c, (Object)gifImageDataModel.c) && f.a((Object)this.d, (Object)gifImageDataModel.d);
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final String b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final String c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final String d = this.d;
        if (d != null) {
            hashCode = d.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("GifImageDataModel(width=");
        k.append(this.a);
        k.append(", height=");
        k.append(this.b);
        k.append(", url=");
        k.append(this.c);
        k.append(", mp4=");
        return b.k(k, this.d, ')');
    }
}
