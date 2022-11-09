// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.wiki;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/wiki/SubredditWiki;", "", "index", "Lcom/reddit/domain/model/wiki/SubredditWikiIndex;", "page", "Lcom/reddit/domain/model/wiki/SubredditWikiPage;", "(Lcom/reddit/domain/model/wiki/SubredditWikiIndex;Lcom/reddit/domain/model/wiki/SubredditWikiPage;)V", "getIndex", "()Lcom/reddit/domain/model/wiki/SubredditWikiIndex;", "getPage", "()Lcom/reddit/domain/model/wiki/SubredditWikiPage;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditWiki
{
    private final SubredditWikiIndex index;
    private final SubredditWikiPage page;
    
    public SubredditWiki(final SubredditWikiIndex index, final SubredditWikiPage page) {
        this.index = index;
        this.page = page;
    }
    
    public final SubredditWikiIndex component1() {
        return this.index;
    }
    
    public final SubredditWikiPage component2() {
        return this.page;
    }
    
    public final SubredditWiki copy(final SubredditWikiIndex subredditWikiIndex, final SubredditWikiPage subredditWikiPage) {
        return new SubredditWiki(subredditWikiIndex, subredditWikiPage);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditWiki)) {
            return false;
        }
        final SubredditWiki subredditWiki = (SubredditWiki)o;
        return f.a((Object)this.index, (Object)subredditWiki.index) && f.a((Object)this.page, (Object)subredditWiki.page);
    }
    
    public final SubredditWikiIndex getIndex() {
        return this.index;
    }
    
    public final SubredditWikiPage getPage() {
        return this.page;
    }
    
    @Override
    public int hashCode() {
        final SubredditWikiIndex index = this.index;
        int hashCode = 0;
        int hashCode2;
        if (index == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = index.hashCode();
        }
        final SubredditWikiPage page = this.page;
        if (page != null) {
            hashCode = page.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditWiki(index=");
        k.append(this.index);
        k.append(", page=");
        k.append(this.page);
        k.append(')');
        return k.toString();
    }
}
