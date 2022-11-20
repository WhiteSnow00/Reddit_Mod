// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ng2.e;
import com.reddit.domain.model.sociallink.SocialLinkType;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\bH\u00c6\u0003JC\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d" }, d2 = { "Lcom/reddit/domain/model/SocialLinkInput;", "", "url", "", "title", "handle", "id", "type", "Lcom/reddit/domain/model/sociallink/SocialLinkType;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/sociallink/SocialLinkType;)V", "getHandle", "()Ljava/lang/String;", "getId", "getTitle", "getType", "()Lcom/reddit/domain/model/sociallink/SocialLinkType;", "getUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SocialLinkInput
{
    private final String handle;
    private final String id;
    private final String title;
    private final SocialLinkType type;
    private final String url;
    
    public SocialLinkInput(final String url, final String title, final String handle, final String id, final SocialLinkType type) {
        e.f((Object)type, "type");
        this.url = url;
        this.title = title;
        this.handle = handle;
        this.id = id;
        this.type = type;
    }
    
    public SocialLinkInput(final String s, final String s2, final String s3, String s4, final SocialLinkType socialLinkType, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x8) != 0x0) {
            s4 = null;
        }
        this(s, s2, s3, s4, socialLinkType);
    }
    
    public static SocialLinkInput copy$default(final SocialLinkInput socialLinkInput, String url, String title, String handle, String id, SocialLinkType type, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            url = socialLinkInput.url;
        }
        if ((n & 0x2) != 0x0) {
            title = socialLinkInput.title;
        }
        if ((n & 0x4) != 0x0) {
            handle = socialLinkInput.handle;
        }
        if ((n & 0x8) != 0x0) {
            id = socialLinkInput.id;
        }
        if ((n & 0x10) != 0x0) {
            type = socialLinkInput.type;
        }
        return socialLinkInput.copy(url, title, handle, id, type);
    }
    
    public final String component1() {
        return this.url;
    }
    
    public final String component2() {
        return this.title;
    }
    
    public final String component3() {
        return this.handle;
    }
    
    public final String component4() {
        return this.id;
    }
    
    public final SocialLinkType component5() {
        return this.type;
    }
    
    public final SocialLinkInput copy(final String s, final String s2, final String s3, final String s4, final SocialLinkType socialLinkType) {
        e.f((Object)socialLinkType, "type");
        return new SocialLinkInput(s, s2, s3, s4, socialLinkType);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SocialLinkInput)) {
            return false;
        }
        final SocialLinkInput socialLinkInput = (SocialLinkInput)o;
        return e.a((Object)this.url, (Object)socialLinkInput.url) && e.a((Object)this.title, (Object)socialLinkInput.title) && e.a((Object)this.handle, (Object)socialLinkInput.handle) && e.a((Object)this.id, (Object)socialLinkInput.id) && this.type == socialLinkInput.type;
    }
    
    public final String getHandle() {
        return this.handle;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final SocialLinkType getType() {
        return this.type;
    }
    
    public final String getUrl() {
        return this.url;
    }
    
    @Override
    public int hashCode() {
        final String url = this.url;
        int hashCode = 0;
        int hashCode2;
        if (url == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = url.hashCode();
        }
        final String title = this.title;
        int hashCode3;
        if (title == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = title.hashCode();
        }
        final String handle = this.handle;
        int hashCode4;
        if (handle == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = handle.hashCode();
        }
        final String id = this.id;
        if (id != null) {
            hashCode = id.hashCode();
        }
        return this.type.hashCode() + (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode) * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("SocialLinkInput(url=");
        t.append(this.url);
        t.append(", title=");
        t.append(this.title);
        t.append(", handle=");
        t.append(this.handle);
        t.append(", id=");
        t.append(this.id);
        t.append(", type=");
        t.append(this.type);
        t.append(')');
        return t.toString();
    }
}
