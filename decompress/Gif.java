// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.richcontent;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
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
        f.f((Object)a, "id");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
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
        return f.a((Object)this.a, (Object)gif.a) && f.a((Object)this.b, (Object)gif.b) && f.a((Object)this.c, (Object)gif.c) && f.a((Object)this.d, (Object)gif.d) && f.a((Object)this.e, (Object)gif.e);
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
        final StringBuilder k = a.k("Gif(id=");
        k.append(this.a);
        k.append(", downsizedImage=");
        k.append(this.b);
        k.append(", image=");
        k.append(this.c);
        k.append(", previewImage=");
        k.append(this.d);
        k.append(", user=");
        k.append(this.e);
        k.append(')');
        return k.toString();
    }
}
