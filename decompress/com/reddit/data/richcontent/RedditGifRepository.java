// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.richcontent;

import com.reddit.domain.richcontent.Gif;
import q20.d;
import ff2.o;
import xi2.j;
import af2.c0;
import com.reddit.domain.richcontent.GifImage;
import javax.inject.Inject;
import ng2.e;
import cg2.f;
import wy0.b;
import q20.a;
import yd0.c;

public final class RedditGifRepository implements c
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
        this.d = kotlin.a.b((mg2.a)new RedditGifRepository$giphyApiKey$2(this));
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
        c0 c0;
        if (j.B0((CharSequence)s)) {
            c0 = this.b.trending((String)this.d.getValue(), "pg", n);
        }
        else {
            c0 = this.b.search((String)this.d.getValue(), "pg", s, n, "en");
        }
        final c0 w = c0.w((o)new su.e((Object)this, 12));
        e.e((Object)w, "resultSingle\n      .map { it.toDomainModel() }");
        return px1.a.K0((c0)w, (d)this.a);
    }
    
    public final c0<Gif> b(final String s) {
        e.f((Object)s, "gifId");
        final c0 w = this.b.gifDetail(s, (String)this.d.getValue()).w((o)new l10.f((Object)this, 10));
        e.e((Object)w, "remote.gifDetail(gifId, \u2026ap { it.toDomainModel() }");
        return px1.a.K0((c0)w, (d)this.a);
    }
}
