// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ag0.a;
import ah2.f;
import ak0.m;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/ChatReaction;", "", "key", "", "imageUrl", "altText", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAltText", "()Ljava/lang/String;", "getImageUrl", "getKey", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ChatReaction
{
    private final String altText;
    private final String imageUrl;
    private final String key;
    
    public ChatReaction(@n(name = "key") final String key, @n(name = "url") final String imageUrl, @n(name = "alt_text") final String altText) {
        m.y(key, "key", imageUrl, "imageUrl", altText, "altText");
        this.key = key;
        this.imageUrl = imageUrl;
        this.altText = altText;
    }
    
    public final String component1() {
        return this.key;
    }
    
    public final String component2() {
        return this.imageUrl;
    }
    
    public final String component3() {
        return this.altText;
    }
    
    public final ChatReaction copy(@n(name = "key") final String s, @n(name = "url") final String s2, @n(name = "alt_text") final String s3) {
        f.f((Object)s, "key");
        f.f((Object)s2, "imageUrl");
        f.f((Object)s3, "altText");
        return new ChatReaction(s, s2, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChatReaction)) {
            return false;
        }
        final ChatReaction chatReaction = (ChatReaction)o;
        return f.a((Object)this.key, (Object)chatReaction.key) && f.a((Object)this.imageUrl, (Object)chatReaction.imageUrl) && f.a((Object)this.altText, (Object)chatReaction.altText);
    }
    
    public final String getAltText() {
        return this.altText;
    }
    
    public final String getImageUrl() {
        return this.imageUrl;
    }
    
    public final String getKey() {
        return this.key;
    }
    
    @Override
    public int hashCode() {
        return this.altText.hashCode() + a.f(this.imageUrl, this.key.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ChatReaction(key=");
        k.append(this.key);
        k.append(", imageUrl=");
        k.append(this.imageUrl);
        k.append(", altText=");
        return b.k(k, this.altText, ')');
    }
}
