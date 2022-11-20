// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.richcontent;

import p1.h;
import ng2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/domain/richcontent/GifImage;", "", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class GifImage
{
    public final Integer a;
    public final Integer b;
    public final String c;
    public final String d;
    
    public GifImage(final Integer a, final Integer b, final String c, final String d) {
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
        if (!(o instanceof GifImage)) {
            return false;
        }
        final GifImage gifImage = (GifImage)o;
        return e.a((Object)this.a, (Object)gifImage.a) && e.a((Object)this.b, (Object)gifImage.b) && e.a((Object)this.c, (Object)gifImage.c) && e.a((Object)this.d, (Object)gifImage.d);
    }
    
    @Override
    public final int hashCode() {
        final Integer a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Integer b = this.b;
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
        final StringBuilder t = a.t("GifImage(width=");
        t.append(this.a);
        t.append(", height=");
        t.append(this.b);
        t.append(", gifUrl=");
        t.append(this.c);
        t.append(", mp4Url=");
        return h.c(t, this.d, ')');
    }
}
