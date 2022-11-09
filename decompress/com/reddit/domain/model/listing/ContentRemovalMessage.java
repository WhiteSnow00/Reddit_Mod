// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.listing;

import ag0.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ah2.f;
import com.squareup.moshi.n;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001 B;\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0004H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0004H\u00c6\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\tH\u00c6\u0003¢\u0006\u0002\u0010\u000eJH\u0010\u0019\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0004H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!" }, d2 = { "Lcom/reddit/domain/model/listing/ContentRemovalMessage;", "", "itemId", "", "", "message", "title", "type", "lockComment", "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getItemId", "()Ljava/util/List;", "getLockComment", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMessage", "()Ljava/lang/String;", "getTitle", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/reddit/domain/model/listing/ContentRemovalMessage;", "equals", "other", "hashCode", "", "toString", "Type", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class ContentRemovalMessage
{
    private final List<String> itemId;
    private final Boolean lockComment;
    private final String message;
    private final String title;
    private final String type;
    
    public ContentRemovalMessage(@n(name = "item_id") final List<String> itemId, final String message, final String title, final String type, @n(name = "lock_comment") final Boolean lockComment) {
        f.f((Object)itemId, "itemId");
        f.f((Object)message, "message");
        f.f((Object)title, "title");
        f.f((Object)type, "type");
        this.itemId = itemId;
        this.message = message;
        this.title = title;
        this.type = type;
        this.lockComment = lockComment;
    }
    
    public final List<String> component1() {
        return this.itemId;
    }
    
    public final String component2() {
        return this.message;
    }
    
    public final String component3() {
        return this.title;
    }
    
    public final String component4() {
        return this.type;
    }
    
    public final Boolean component5() {
        return this.lockComment;
    }
    
    public final ContentRemovalMessage copy(@n(name = "item_id") final List<String> list, final String s, final String s2, final String s3, @n(name = "lock_comment") final Boolean b) {
        f.f((Object)list, "itemId");
        f.f((Object)s, "message");
        f.f((Object)s2, "title");
        f.f((Object)s3, "type");
        return new ContentRemovalMessage(list, s, s2, s3, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContentRemovalMessage)) {
            return false;
        }
        final ContentRemovalMessage contentRemovalMessage = (ContentRemovalMessage)o;
        return f.a((Object)this.itemId, (Object)contentRemovalMessage.itemId) && f.a((Object)this.message, (Object)contentRemovalMessage.message) && f.a((Object)this.title, (Object)contentRemovalMessage.title) && f.a((Object)this.type, (Object)contentRemovalMessage.type) && f.a((Object)this.lockComment, (Object)contentRemovalMessage.lockComment);
    }
    
    public final List<String> getItemId() {
        return this.itemId;
    }
    
    public final Boolean getLockComment() {
        return this.lockComment;
    }
    
    public final String getMessage() {
        return this.message;
    }
    
    public final String getTitle() {
        return this.title;
    }
    
    public final String getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.type, a.f(this.title, a.f(this.message, this.itemId.hashCode() * 31, 31), 31), 31);
        final Boolean lockComment = this.lockComment;
        int hashCode;
        if (lockComment == null) {
            hashCode = 0;
        }
        else {
            hashCode = lockComment.hashCode();
        }
        return f + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("ContentRemovalMessage(itemId=");
        k.append(this.itemId);
        k.append(", message=");
        k.append(this.message);
        k.append(", title=");
        k.append(this.title);
        k.append(", type=");
        k.append(this.type);
        k.append(", lockComment=");
        return d.m(k, this.lockComment, ')');
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/model/listing/ContentRemovalMessage$Type;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "COMMENT_USER", "COMMENT_SUBREDDIT", "MODMAIL_SUBREDDIT", "MODMAIL_USER", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Type
    {
        COMMENT_SUBREDDIT("public_as_subreddit"), 
        COMMENT_USER("public"), 
        MODMAIL_SUBREDDIT("private"), 
        MODMAIL_USER("private_exposed");
        
        private final String value;
        
        private Type(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
}
