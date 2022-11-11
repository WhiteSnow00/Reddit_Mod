// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import com.reddit.domain.richcontent.Gif;
import kf2.o;
import cj2.j;
import ff2.c0;
import com.reddit.domain.richcontent.GifImage;
import javax.inject.Inject;
import sg2.e;
import hg2.f;
import uy0.b;
import n20.a;
import yd0.d;

public final class RedditGifRepository implements d
{
    public final a a;
    public final RemoteGifDataSource b;
    public final b c;
    public final f d;
    
    @Inject
    public RedditGifRepository(final a a, final RemoteGifDataSource b, final b c) {
        e.f((Object)a, "backgroundThread");
        e.f((Object)b, "remote");
        e.f((Object)c, "apiKeysProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((rg2.a)new RedditGifRepository$giphyApiKey$2(this));
    }
    
    public static GifImage c(final GifImageDataModel gifImageDataModel) {
        final String a = gifImageDataModel.a;
        Integer value = null;
        Integer value2;
        if (a != null) {
            value2 = Integer.parseInt(a);
        }
        else {
            value2 = null;
        }
        final String b = gifImageDataModel.b;
        if (b != null) {
            value = Integer.parseInt(b);
        }
        return new GifImage(value2, value, gifImageDataModel.c, gifImageDataModel.d);
    }
    
    public final c0 a(final int n, final String s) {
        e.f((Object)s, "searchTerm");
        c0<GifResponseDataModel> c0;
        if (j.H0((CharSequence)s)) {
            c0 = this.b.trending(this.d.getValue(), "pg", n);
        }
        else {
            c0 = this.b.search(this.d.getValue(), "pg", s, n, "en");
        }
        final c0<Object> w = c0.w((kf2.o<? super GifResponseDataModel, ?>)new su.e((Object)this, 11));
        e.e((Object)w, "resultSingle\n      .map { it.toDomainModel() }");
        return nn0.a.V((c0)w, (n20.d)this.a);
    }
    
    public final c0<Gif> b(final String s) {
        e.f((Object)s, "gifId");
        final c0<Object> w = this.b.gifDetail(s, this.d.getValue()).w((kf2.o<? super GifDetailResponseDataModel, ?>)new nw.b((Object)this, 6));
        e.e((Object)w, "remote.gifDetail(gifId, \u2026ap { it.toDomainModel() }");
        return nn0.a.V((c0)w, (n20.d)this.a);
    }
}
