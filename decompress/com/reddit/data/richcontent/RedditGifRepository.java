// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import com.reddit.domain.richcontent.Gif;
import a4.u1;
import sf2.o;
import kj2.j;
import nf2.c0;
import com.reddit.domain.richcontent.GifImage;
import javax.inject.Inject;
import pg2.f;
import cz0.b;
import r20.a;
import he0.d;

public final class RedditGifRepository implements d
{
    public final a a;
    public final RemoteGifDataSource b;
    public final b c;
    public final f d;
    
    @Inject
    public RedditGifRepository(final a a, final RemoteGifDataSource b, final b c) {
        ah2.f.f((Object)a, "backgroundThread");
        ah2.f.f((Object)b, "remote");
        ah2.f.f((Object)c, "apiKeysProvider");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = kotlin.a.b((zg2.a)new RedditGifRepository$giphyApiKey.RedditGifRepository$giphyApiKey$2(this));
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
    
    @Override
    public final c0 a(final int n, final String s) {
        ah2.f.f((Object)s, "searchTerm");
        c0<GifResponseDataModel> c0;
        if (j.X1((CharSequence)s)) {
            c0 = this.b.trending((String)this.d.getValue(), "pg", n);
        }
        else {
            c0 = this.b.search((String)this.d.getValue(), "pg", s, n, "en");
        }
        final c0 w = c0.w((o)new he0.b((Object)this, 11));
        ah2.f.e((Object)w, "resultSingle\n      .map { it.toDomainModel() }");
        return u1.j1(w, (r20.d)this.a);
    }
    
    @Override
    public final c0<Gif> b(final String s) {
        ah2.f.f((Object)s, "gifId");
        final c0 w = this.b.gifDetail(s, (String)this.d.getValue()).w((o)new com.reddit.comment.ui.presentation.b((Object)this, 5));
        ah2.f.e((Object)w, "remote.gifDetail(gifId, \u2026ap { it.toDomainModel() }");
        return (c0<Gif>)u1.j1(w, (r20.d)this.a);
    }
}
