// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.streaming;

import androidx.appcompat.widget.s0;
import a2.b;
import ag0.a;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\nH\u00c6\u0003J\t\u0010\u001f\u001a\u00020\nH\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003Jc\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010&\u001a\u00020\nH\u00d6\u0001J\t\u0010'\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015¨\u0006(" }, d2 = { "Lcom/reddit/domain/model/streaming/StreamCommunity;", "", "name", "", "description", "iconUrl", "rules", "", "Lcom/reddit/domain/model/streaming/CommunityRule;", "online", "", "viewing", "reasonToBroadcast", "broadcasterPrompt", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;IILjava/lang/String;Ljava/lang/String;)V", "getBroadcasterPrompt", "()Ljava/lang/String;", "getDescription", "getIconUrl", "getName", "getOnline", "()I", "getReasonToBroadcast", "getRules", "()Ljava/util/List;", "getViewing", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "temp_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class StreamCommunity
{
    private final String broadcasterPrompt;
    private final String description;
    private final String iconUrl;
    private final String name;
    private final int online;
    private final String reasonToBroadcast;
    private final List<CommunityRule> rules;
    private final int viewing;
    
    public StreamCommunity(final String name, final String description, final String iconUrl, final List<CommunityRule> rules, final int online, final int viewing, final String reasonToBroadcast, final String broadcasterPrompt) {
        f.f((Object)name, "name");
        f.f((Object)description, "description");
        f.f((Object)rules, "rules");
        f.f((Object)reasonToBroadcast, "reasonToBroadcast");
        this.name = name;
        this.description = description;
        this.iconUrl = iconUrl;
        this.rules = rules;
        this.online = online;
        this.viewing = viewing;
        this.reasonToBroadcast = reasonToBroadcast;
        this.broadcasterPrompt = broadcasterPrompt;
    }
    
    public final String component1() {
        return this.name;
    }
    
    public final String component2() {
        return this.description;
    }
    
    public final String component3() {
        return this.iconUrl;
    }
    
    public final List<CommunityRule> component4() {
        return this.rules;
    }
    
    public final int component5() {
        return this.online;
    }
    
    public final int component6() {
        return this.viewing;
    }
    
    public final String component7() {
        return this.reasonToBroadcast;
    }
    
    public final String component8() {
        return this.broadcasterPrompt;
    }
    
    public final StreamCommunity copy(final String s, final String s2, final String s3, final List<CommunityRule> list, final int n, final int n2, final String s4, final String s5) {
        f.f((Object)s, "name");
        f.f((Object)s2, "description");
        f.f((Object)list, "rules");
        f.f((Object)s4, "reasonToBroadcast");
        return new StreamCommunity(s, s2, s3, list, n, n2, s4, s5);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamCommunity)) {
            return false;
        }
        final StreamCommunity streamCommunity = (StreamCommunity)o;
        return f.a((Object)this.name, (Object)streamCommunity.name) && f.a((Object)this.description, (Object)streamCommunity.description) && f.a((Object)this.iconUrl, (Object)streamCommunity.iconUrl) && f.a((Object)this.rules, (Object)streamCommunity.rules) && this.online == streamCommunity.online && this.viewing == streamCommunity.viewing && f.a((Object)this.reasonToBroadcast, (Object)streamCommunity.reasonToBroadcast) && f.a((Object)this.broadcasterPrompt, (Object)streamCommunity.broadcasterPrompt);
    }
    
    public final String getBroadcasterPrompt() {
        return this.broadcasterPrompt;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getIconUrl() {
        return this.iconUrl;
    }
    
    public final String getName() {
        return this.name;
    }
    
    public final int getOnline() {
        return this.online;
    }
    
    public final String getReasonToBroadcast() {
        return this.reasonToBroadcast;
    }
    
    public final List<CommunityRule> getRules() {
        return this.rules;
    }
    
    public final int getViewing() {
        return this.viewing;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.description, this.name.hashCode() * 31, 31);
        final String iconUrl = this.iconUrl;
        final int n = 0;
        int hashCode;
        if (iconUrl == null) {
            hashCode = 0;
        }
        else {
            hashCode = iconUrl.hashCode();
        }
        final int f2 = a.f(this.reasonToBroadcast, s0.e(this.viewing, s0.e(this.online, b.a((List)this.rules, (f + hashCode) * 31, 31), 31), 31), 31);
        final String broadcasterPrompt = this.broadcasterPrompt;
        int hashCode2;
        if (broadcasterPrompt == null) {
            hashCode2 = n;
        }
        else {
            hashCode2 = broadcasterPrompt.hashCode();
        }
        return f2 + hashCode2;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("StreamCommunity(name=");
        k.append(this.name);
        k.append(", description=");
        k.append(this.description);
        k.append(", iconUrl=");
        k.append(this.iconUrl);
        k.append(", rules=");
        k.append(this.rules);
        k.append(", online=");
        k.append(this.online);
        k.append(", viewing=");
        k.append(this.viewing);
        k.append(", reasonToBroadcast=");
        k.append(this.reasonToBroadcast);
        k.append(", broadcasterPrompt=");
        return b.k(k, this.broadcasterPrompt, ')');
    }
}
