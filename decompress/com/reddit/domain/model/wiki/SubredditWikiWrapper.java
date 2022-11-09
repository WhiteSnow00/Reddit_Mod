// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.wiki;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014" }, d2 = { "Lcom/reddit/domain/model/wiki/SubredditWikiWrapper;", "", "id", "", "wiki", "Lcom/reddit/domain/model/wiki/SubredditWiki;", "(Ljava/lang/String;Lcom/reddit/domain/model/wiki/SubredditWiki;)V", "getId", "()Ljava/lang/String;", "getWiki", "()Lcom/reddit/domain/model/wiki/SubredditWiki;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditWikiWrapper
{
    private final String id;
    private final SubredditWiki wiki;
    
    public SubredditWikiWrapper(final String id, final SubredditWiki wiki) {
        f.f((Object)id, "id");
        f.f((Object)wiki, "wiki");
        this.id = id;
        this.wiki = wiki;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final SubredditWiki component2() {
        return this.wiki;
    }
    
    public final SubredditWikiWrapper copy(final String s, final SubredditWiki subredditWiki) {
        f.f((Object)s, "id");
        f.f((Object)subredditWiki, "wiki");
        return new SubredditWikiWrapper(s, subredditWiki);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditWikiWrapper)) {
            return false;
        }
        final SubredditWikiWrapper subredditWikiWrapper = (SubredditWikiWrapper)o;
        return f.a((Object)this.id, (Object)subredditWikiWrapper.id) && f.a((Object)this.wiki, (Object)subredditWikiWrapper.wiki);
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final SubredditWiki getWiki() {
        return this.wiki;
    }
    
    @Override
    public int hashCode() {
        return this.wiki.hashCode() + this.id.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditWikiWrapper(id=");
        k.append(this.id);
        k.append(", wiki=");
        k.append(this.wiki);
        k.append(')');
        return k.toString();
    }
}
