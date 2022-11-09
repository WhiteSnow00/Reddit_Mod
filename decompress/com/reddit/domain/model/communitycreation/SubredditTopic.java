// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.communitycreation;

import ag0.a;
import ah2.f;
import ak0.m;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/communitycreation/SubredditTopic;", "", "id", "", "text", "isRecommended", "", "iconUrl", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getIconUrl", "()Ljava/lang/String;", "getId", "()Z", "getText", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class SubredditTopic
{
    private final String iconUrl;
    private final String id;
    private final boolean isRecommended;
    private final String text;
    
    public SubredditTopic(final String id, final String text, final boolean isRecommended, final String iconUrl) {
        m.y(id, "id", text, "text", iconUrl, "iconUrl");
        this.id = id;
        this.text = text;
        this.isRecommended = isRecommended;
        this.iconUrl = iconUrl;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.text;
    }
    
    public final boolean component3() {
        return this.isRecommended;
    }
    
    public final String component4() {
        return this.iconUrl;
    }
    
    public final SubredditTopic copy(final String s, final String s2, final boolean b, final String s3) {
        f.f((Object)s, "id");
        f.f((Object)s2, "text");
        f.f((Object)s3, "iconUrl");
        return new SubredditTopic(s, s2, b, s3);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SubredditTopic)) {
            return false;
        }
        final SubredditTopic subredditTopic = (SubredditTopic)o;
        return f.a((Object)this.id, (Object)subredditTopic.id) && f.a((Object)this.text, (Object)subredditTopic.text) && this.isRecommended == subredditTopic.isRecommended && f.a((Object)this.iconUrl, (Object)subredditTopic.iconUrl);
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final String getText() {
        return this.text;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.text, this.id.hashCode() * 31, 31);
        int isRecommended;
        if ((isRecommended = (this.isRecommended ? 1 : 0)) != 0) {
            isRecommended = 1;
        }
        return this.iconUrl.hashCode() + (f + isRecommended) * 31;
    }
    
    public final boolean isRecommended() {
        return this.isRecommended;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("SubredditTopic(id=");
        k.append(this.id);
        k.append(", text=");
        k.append(this.text);
        k.append(", isRecommended=");
        k.append(this.isRecommended);
        k.append(", iconUrl=");
        return b.k(k, this.iconUrl, ')');
    }
}
