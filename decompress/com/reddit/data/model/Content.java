// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.model;

import ah2.f;
import java.util.List;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J?\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b" }, d2 = { "Lcom/reddit/data/model/Content;", "", "markdown", "", "richtextMedia", "", "Lcom/reddit/data/model/MediaAsset;", "richtext", "html", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getHtml", "()Ljava/lang/String;", "getMarkdown", "getRichtext", "getRichtextMedia", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class Content
{
    private final String html;
    private final String markdown;
    private final String richtext;
    private final List<MediaAsset> richtextMedia;
    
    public Content(final String markdown, final List<MediaAsset> richtextMedia, final String richtext, final String html) {
        this.markdown = markdown;
        this.richtextMedia = richtextMedia;
        this.richtext = richtext;
        this.html = html;
    }
    
    public final String component1() {
        return this.markdown;
    }
    
    public final List<MediaAsset> component2() {
        return this.richtextMedia;
    }
    
    public final String component3() {
        return this.richtext;
    }
    
    public final String component4() {
        return this.html;
    }
    
    public final Content copy(final String s, final List<MediaAsset> list, final String s2, final String s3) {
        return new Content(s, list, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Content)) {
            return false;
        }
        final Content content = (Content)o;
        return f.a((Object)this.markdown, (Object)content.markdown) && f.a((Object)this.richtextMedia, (Object)content.richtextMedia) && f.a((Object)this.richtext, (Object)content.richtext) && f.a((Object)this.html, (Object)content.html);
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
    
    public final List<MediaAsset> getRichtextMedia() {
        return this.richtextMedia;
    }
    
    @Override
    public int hashCode() {
        final String markdown = this.markdown;
        int hashCode = 0;
        int hashCode2;
        if (markdown == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = markdown.hashCode();
        }
        final List<MediaAsset> richtextMedia = this.richtextMedia;
        int hashCode3;
        if (richtextMedia == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = richtextMedia.hashCode();
        }
        final String richtext = this.richtext;
        int hashCode4;
        if (richtext == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = richtext.hashCode();
        }
        final String html = this.html;
        if (html != null) {
            hashCode = html.hashCode();
        }
        return ((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Content(markdown=");
        k.append(this.markdown);
        k.append(", richtextMedia=");
        k.append(this.richtextMedia);
        k.append(", richtext=");
        k.append(this.richtext);
        k.append(", html=");
        return b.k(k, this.html, ')');
    }
}
