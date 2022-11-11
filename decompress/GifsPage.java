// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import al0.f0;
import sg2.e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u00c6\u0003J;\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\bH\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001c" }, d2 = { "Lcom/reddit/domain/chat/model/GifsPage;", "", "gifs", "", "Lcom/reddit/domain/chat/model/ChatGif;", "hasNextPage", "", "provider", "", "endCursor", "(Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;)V", "getEndCursor", "()Ljava/lang/String;", "getGifs", "()Ljava/util/List;", "getHasNextPage", "()Z", "getProvider", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class GifsPage
{
    private final String endCursor;
    private final List<ChatGif> gifs;
    private final boolean hasNextPage;
    private final String provider;
    
    public GifsPage(final List<ChatGif> gifs, final boolean hasNextPage, final String provider, final String endCursor) {
        e.f((Object)gifs, "gifs");
        this.gifs = gifs;
        this.hasNextPage = hasNextPage;
        this.provider = provider;
        this.endCursor = endCursor;
    }
    
    public final List<ChatGif> component1() {
        return this.gifs;
    }
    
    public final boolean component2() {
        return this.hasNextPage;
    }
    
    public final String component3() {
        return this.provider;
    }
    
    public final String component4() {
        return this.endCursor;
    }
    
    public final GifsPage copy(final List<ChatGif> list, final boolean b, final String s, final String s2) {
        e.f((Object)list, "gifs");
        return new GifsPage(list, b, s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GifsPage)) {
            return false;
        }
        final GifsPage gifsPage = (GifsPage)o;
        return e.a((Object)this.gifs, (Object)gifsPage.gifs) && this.hasNextPage == gifsPage.hasNextPage && e.a((Object)this.provider, (Object)gifsPage.provider) && e.a((Object)this.endCursor, (Object)gifsPage.endCursor);
    }
    
    public final String getEndCursor() {
        return this.endCursor;
    }
    
    public final List<ChatGif> getGifs() {
        return this.gifs;
    }
    
    public final boolean getHasNextPage() {
        return this.hasNextPage;
    }
    
    public final String getProvider() {
        return this.provider;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.gifs.hashCode();
        int hasNextPage;
        if ((hasNextPage = (this.hasNextPage ? 1 : 0)) != 0) {
            hasNextPage = 1;
        }
        final String provider = this.provider;
        int hashCode2 = 0;
        int hashCode3;
        if (provider == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = provider.hashCode();
        }
        final String endCursor = this.endCursor;
        if (endCursor != null) {
            hashCode2 = endCursor.hashCode();
        }
        return ((hashCode * 31 + hasNextPage) * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("GifsPage(gifs=");
        r.append(this.gifs);
        r.append(", hasNextPage=");
        r.append(this.hasNextPage);
        r.append(", provider=");
        r.append(this.provider);
        r.append(", endCursor=");
        return f0.n(r, this.endCursor, ')');
    }
}
