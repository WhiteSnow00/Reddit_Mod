// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import androidx.appcompat.widget.s0;
import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0007H\u00c6\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/chat/model/ChatGif;", "Lcom/reddit/domain/chat/model/Gif;", "id", "", "title", "url", "height", "", "width", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", "getHeight", "()I", "getId", "()Ljava/lang/String;", "getTitle", "getUrl", "getWidth", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChatGif extends Gif
{
    private final int height;
    private final String id;
    private final String title;
    private final String url;
    private final int width;
    
    public ChatGif(final String id, final String title, final String url, final int height, final int width) {
        f.f((Object)id, "id");
        f.f((Object)url, "url");
        super(null);
        this.id = id;
        this.title = title;
        this.url = url;
        this.height = height;
        this.width = width;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.url;
    }
    
    public final int component4() {
        return this.height;
    }
    
    public final int component5() {
        return this.width;
    }
    
    public final ChatGif copy(final String s, final String s2, final String s3, final int n, final int n2) {
        f.f((Object)s, "id");
        f.f((Object)s3, "url");
        return new ChatGif(s, s2, s3, n, n2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatGif)) {
            return false;
        }
        final ChatGif chatGif = (ChatGif)o;
        return f.a((Object)this.id, (Object)chatGif.id) && f.a((Object)this.title, (Object)chatGif.title) && f.a((Object)this.url, (Object)chatGif.url) && this.height == chatGif.height && this.width == chatGif.width;
    }
    
    public final int getHeight() {
        return this.height;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    public final int getWidth() {
        return this.width;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.id.hashCode();
        final String title = this.title;
        int hashCode2;
        if (title == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = title.hashCode();
        }
        return Integer.hashCode(this.width) + s0.e(this.height, a.f(this.url, (hashCode * 31 + hashCode2) * 31, 31), 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ChatGif(id=");
        k.append(this.id);
        k.append(", title=");
        k.append(this.title);
        k.append(", url=");
        k.append(this.url);
        k.append(", height=");
        k.append(this.height);
        k.append(", width=");
        return d.k(k, this.width, ')');
    }
}
