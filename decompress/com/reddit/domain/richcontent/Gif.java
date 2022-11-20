// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.richcontent;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002" }, d2 = { "Lcom/reddit/domain/richcontent/Gif;", "", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class Gif
{
    public final String a;
    public final GifImage b;
    public final GifImage c;
    public final GifImage d;
    public final GifUser e;
    
    public Gif(final String a, final GifImage b, final GifImage c, final GifImage d, final GifUser e) {
        ng2.e.f((Object)a, "id");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public Gif(final String s, final GifImage gifImage, final GifImage gifImage2, final GifImage gifImage3, GifUser gifUser, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x10) != 0x0) {
            gifUser = null;
        }
        this(s, gifImage, gifImage2, gifImage3, gifUser);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Gif)) {
            return false;
        }
        final Gif gif = (Gif)o;
        return ng2.e.a((Object)this.a, (Object)gif.a) && ng2.e.a((Object)this.b, (Object)gif.b) && ng2.e.a((Object)this.c, (Object)gif.c) && ng2.e.a((Object)this.d, (Object)gif.d) && ng2.e.a((Object)this.e, (Object)gif.e);
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final GifImage b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final GifImage c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final GifImage d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final GifUser e = this.e;
        if (e != null) {
            hashCode2 = e.hashCode();
        }
        return (((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder t = a.t("Gif(id=");
        t.append(this.a);
        t.append(", downsizedImage=");
        t.append(this.b);
        t.append(", image=");
        t.append(this.c);
        t.append(", previewImage=");
        t.append(this.d);
        t.append(", user=");
        t.append(this.e);
        t.append(')');
        return t.toString();
    }
}
