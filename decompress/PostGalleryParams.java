// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.postsubmit.remote;

import androidx.appcompat.widget.s0;
import ah2.f;
import com.squareup.moshi.n;
import com.reddit.domain.model.postsubmit.GalleryItem;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(bv = {}, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\f\u001a\u00020\u0002\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u008d\u0001\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\u0007\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\t\u001a\u00020\u00052\b\b\u0003\u0010\n\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\f\u001a\u00020\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0003\u0010\u0011\u001a\u00020\u0005H\u00c6\u0001¨\u0006\u0015" }, d2 = { "Lcom/reddit/data/postsubmit/remote/PostGalleryParams;", "", "", "subreddit", "apiType", "", "showErrorList", "title", "text", "isSpoiler", "isNsfw", "flairId", "flairText", "discussionType", "", "Lcom/reddit/domain/model/postsubmit/GalleryItem;", "items", "validateOnSubmit", "copy", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "data_release" }, k = 1, mv = { 1, 7, 1 })
public final class PostGalleryParams
{
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final List<GalleryItem> k;
    public final boolean l;
    
    public PostGalleryParams(@n(name = "sr") final String a, @n(name = "api_type") final String b, @n(name = "show_error_list") final boolean c, @n(name = "title") final String d, @n(name = "text") final String e, @n(name = "spoiler") final boolean f, @n(name = "nsfw") final boolean g, @n(name = "flair_id") final String h, @n(name = "flair_text") final String i, @n(name = "discussion_type") final String j, @n(name = "items") final List<GalleryItem> k, @n(name = "validate_on_submit") final boolean l) {
        a.t(a, "subreddit", b, "apiType", d, "title", h, "flairId", i, "flairText");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
    }
    
    public final PostGalleryParams copy(@n(name = "sr") final String s, @n(name = "api_type") final String s2, @n(name = "show_error_list") final boolean b, @n(name = "title") final String s3, @n(name = "text") final String s4, @n(name = "spoiler") final boolean b2, @n(name = "nsfw") final boolean b3, @n(name = "flair_id") final String s5, @n(name = "flair_text") final String s6, @n(name = "discussion_type") final String s7, @n(name = "items") final List<GalleryItem> list, @n(name = "validate_on_submit") final boolean b4) {
        ah2.f.f((Object)s, "subreddit");
        ah2.f.f((Object)s2, "apiType");
        ah2.f.f((Object)s3, "title");
        ah2.f.f((Object)s5, "flairId");
        ah2.f.f((Object)s6, "flairText");
        return new PostGalleryParams(s, s2, b, s3, s4, b2, b3, s5, s6, s7, list, b4);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PostGalleryParams)) {
            return false;
        }
        final PostGalleryParams postGalleryParams = (PostGalleryParams)o;
        return ah2.f.a((Object)this.a, (Object)postGalleryParams.a) && ah2.f.a((Object)this.b, (Object)postGalleryParams.b) && this.c == postGalleryParams.c && ah2.f.a((Object)this.d, (Object)postGalleryParams.d) && ah2.f.a((Object)this.e, (Object)postGalleryParams.e) && this.f == postGalleryParams.f && this.g == postGalleryParams.g && ah2.f.a((Object)this.h, (Object)postGalleryParams.h) && ah2.f.a((Object)this.i, (Object)postGalleryParams.i) && ah2.f.a((Object)this.j, (Object)postGalleryParams.j) && ah2.f.a((Object)this.k, (Object)postGalleryParams.k) && this.l == postGalleryParams.l;
    }
    
    @Override
    public final int hashCode() {
        final int f = ag0.a.f(this.b, this.a.hashCode() * 31, 31);
        final int c = this.c ? 1 : 0;
        final int n = 1;
        int n2 = c;
        if (c != 0) {
            n2 = 1;
        }
        final int f2 = ag0.a.f(this.d, (f + n2) * 31, 31);
        final String e = this.e;
        final int n3 = 0;
        int hashCode;
        if (e == null) {
            hashCode = 0;
        }
        else {
            hashCode = e.hashCode();
        }
        int f3;
        if ((f3 = (this.f ? 1 : 0)) != 0) {
            f3 = 1;
        }
        int g;
        if ((g = (this.g ? 1 : 0)) != 0) {
            g = 1;
        }
        final int f4 = ag0.a.f(this.i, ag0.a.f(this.h, (((f2 + hashCode) * 31 + f3) * 31 + g) * 31, 31), 31);
        final String j = this.j;
        int hashCode2;
        if (j == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = j.hashCode();
        }
        final List<GalleryItem> k = this.k;
        int hashCode3;
        if (k == null) {
            hashCode3 = n3;
        }
        else {
            hashCode3 = k.hashCode();
        }
        int l = this.l ? 1 : 0;
        if (l != 0) {
            l = n;
        }
        return ((f4 + hashCode2) * 31 + hashCode3) * 31 + l;
    }
    
    @Override
    public final String toString() {
        final StringBuilder k = a.k("PostGalleryParams(subreddit=");
        k.append(this.a);
        k.append(", apiType=");
        k.append(this.b);
        k.append(", showErrorList=");
        k.append(this.c);
        k.append(", title=");
        k.append(this.d);
        k.append(", text=");
        k.append(this.e);
        k.append(", isSpoiler=");
        k.append(this.f);
        k.append(", isNsfw=");
        k.append(this.g);
        k.append(", flairId=");
        k.append(this.h);
        k.append(", flairText=");
        k.append(this.i);
        k.append(", discussionType=");
        k.append(this.j);
        k.append(", items=");
        k.append(this.k);
        k.append(", validateOnSubmit=");
        return s0.o(k, this.l, ')');
    }
}
