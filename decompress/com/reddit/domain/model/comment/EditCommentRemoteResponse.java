// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.comment;

import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J+\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/model/comment/EditCommentRemoteResponse;", "", "markdown", "", "html", "richtext", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "getMarkdown", "getRichtext", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class EditCommentRemoteResponse
{
    private final String html;
    private final String markdown;
    private final String richtext;
    
    public EditCommentRemoteResponse(final String markdown, final String html, final String richtext) {
        f.f((Object)markdown, "markdown");
        this.markdown = markdown;
        this.html = html;
        this.richtext = richtext;
    }
    
    public final String component1() {
        return this.markdown;
    }
    
    public final String component2() {
        return this.html;
    }
    
    public final String component3() {
        return this.richtext;
    }
    
    public final EditCommentRemoteResponse copy(final String s, final String s2, final String s3) {
        f.f((Object)s, "markdown");
        return new EditCommentRemoteResponse(s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EditCommentRemoteResponse)) {
            return false;
        }
        final EditCommentRemoteResponse editCommentRemoteResponse = (EditCommentRemoteResponse)o;
        return f.a((Object)this.markdown, (Object)editCommentRemoteResponse.markdown) && f.a((Object)this.html, (Object)editCommentRemoteResponse.html) && f.a((Object)this.richtext, (Object)editCommentRemoteResponse.richtext);
    }
    
    public final String getHtml() {
        return this.html;
    }
    
    public final String getMarkdown() {
        return this.markdown;
    }
    
    public final String getRichtext() {
        return this.richtext;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.markdown.hashCode();
        final String html = this.html;
        int hashCode2 = 0;
        int hashCode3;
        if (html == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = html.hashCode();
        }
        final String richtext = this.richtext;
        if (richtext != null) {
            hashCode2 = richtext.hashCode();
        }
        return (hashCode * 31 + hashCode3) * 31 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("EditCommentRemoteResponse(markdown=");
        k.append(this.markdown);
        k.append(", html=");
        k.append(this.html);
        k.append(", richtext=");
        return b.k(k, this.richtext, ')');
    }
}
