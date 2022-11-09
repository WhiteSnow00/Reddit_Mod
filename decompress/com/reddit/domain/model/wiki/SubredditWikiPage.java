// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.wiki;

import ah2.f;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tH\u00c6\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e" }, d2 = { "Lcom/reddit/domain/model/wiki/SubredditWikiPage;", "", "name", "", "status", "Lcom/reddit/domain/model/wiki/SubredditWikiPageStatus;", "content", "Lcom/reddit/domain/model/wiki/SubredditWikiRichTextWrapper;", "revision", "Lcom/reddit/domain/model/wiki/SubredditWikiRevision;", "(Ljava/lang/String;Lcom/reddit/domain/model/wiki/SubredditWikiPageStatus;Lcom/reddit/domain/model/wiki/SubredditWikiRichTextWrapper;Lcom/reddit/domain/model/wiki/SubredditWikiRevision;)V", "getContent", "()Lcom/reddit/domain/model/wiki/SubredditWikiRichTextWrapper;", "getName", "()Ljava/lang/String;", "getRevision", "()Lcom/reddit/domain/model/wiki/SubredditWikiRevision;", "getStatus", "()Lcom/reddit/domain/model/wiki/SubredditWikiPageStatus;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditWikiPage
{
    private final SubredditWikiRichTextWrapper content;
    private final String name;
    private final SubredditWikiRevision revision;
    private final SubredditWikiPageStatus status;
    
    public SubredditWikiPage(final String name, final SubredditWikiPageStatus status, final SubredditWikiRichTextWrapper content, final SubredditWikiRevision revision) {
        f.f((Object)name, "name");
        f.f((Object)status, "status");
        this.name = name;
        this.status = status;
        this.content = content;
        this.revision = revision;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final SubredditWikiPageStatus component2() {
        return this.status;
    }
    
    public final SubredditWikiRichTextWrapper component3() {
        return this.content;
    }
    
    public final SubredditWikiRevision component4() {
        return this.revision;
    }
    
    public final SubredditWikiPage copy(final String s, final SubredditWikiPageStatus subredditWikiPageStatus, final SubredditWikiRichTextWrapper subredditWikiRichTextWrapper, final SubredditWikiRevision subredditWikiRevision) {
        f.f((Object)s, "name");
        f.f((Object)subredditWikiPageStatus, "status");
        return new SubredditWikiPage(s, subredditWikiPageStatus, subredditWikiRichTextWrapper, subredditWikiRevision);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditWikiPage)) {
            return false;
        }
        final SubredditWikiPage subredditWikiPage = (SubredditWikiPage)o;
        return f.a((Object)this.name, (Object)subredditWikiPage.name) && this.status == subredditWikiPage.status && f.a((Object)this.content, (Object)subredditWikiPage.content) && f.a((Object)this.revision, (Object)subredditWikiPage.revision);
    }
    
    public final SubredditWikiRichTextWrapper getContent() {
        return this.content;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final SubredditWikiRevision getRevision() {
        return this.revision;
    }
    
    public final SubredditWikiPageStatus getStatus() {
        return this.status;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.name.hashCode();
        final int hashCode2 = this.status.hashCode();
        final SubredditWikiRichTextWrapper content = this.content;
        int hashCode3 = 0;
        int hashCode4;
        if (content == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = content.hashCode();
        }
        final SubredditWikiRevision revision = this.revision;
        if (revision != null) {
            hashCode3 = revision.hashCode();
        }
        return ((hashCode2 + hashCode * 31) * 31 + hashCode4) * 31 + hashCode3;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditWikiPage(name=");
        k.append(this.name);
        k.append(", status=");
        k.append(this.status);
        k.append(", content=");
        k.append(this.content);
        k.append(", revision=");
        k.append(this.revision);
        k.append(')');
        return k.toString();
    }
}
