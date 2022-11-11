// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.wiki;

import al0.f0;
import sg2.e;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/model/wiki/SubredditWikiRichTextWrapper;", "", "richtext", "", "(Ljava/lang/String;)V", "getRichtext", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditWikiRichTextWrapper
{
    private final String richtext;
    
    public SubredditWikiRichTextWrapper(final String richtext) {
        this.richtext = richtext;
    }
    
    public final String component1() {
        return this.richtext;
    }
    
    public final SubredditWikiRichTextWrapper copy(final String s) {
        return new SubredditWikiRichTextWrapper(s);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof SubredditWikiRichTextWrapper && e.a((Object)this.richtext, (Object)((SubredditWikiRichTextWrapper)o).richtext));
    }
    
    public final String getRichtext() {
        return this.richtext;
    }
    
    @Override
    public int hashCode() {
        final String richtext = this.richtext;
        int hashCode;
        if (richtext == null) {
            hashCode = 0;
        }
        else {
            hashCode = richtext.hashCode();
        }
        return hashCode;
    }
    
    @Override
    public String toString() {
        return f0.n(a.r("SubredditWikiRichTextWrapper(richtext="), this.richtext, ')');
    }
}
