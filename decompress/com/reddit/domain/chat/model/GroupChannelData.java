// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import al0.f0;
import sg2.e;
import com.squareup.moshi.n;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012" }, d2 = { "Lcom/reddit/domain/chat/model/GroupChannelData;", "", "welcomeText", "", "creationReason", "(Ljava/lang/String;Ljava/lang/String;)V", "getCreationReason", "()Ljava/lang/String;", "getWelcomeText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class GroupChannelData
{
    private final String creationReason;
    private final String welcomeText;
    
    public GroupChannelData(@n(name = "welcome_text") final String welcomeText, @n(name = "creation_reason") final String creationReason) {
        this.welcomeText = welcomeText;
        this.creationReason = creationReason;
    }
    
    public final String component1() {
        return this.welcomeText;
    }
    
    public final String component2() {
        return this.creationReason;
    }
    
    public final GroupChannelData copy(@n(name = "welcome_text") final String s, @n(name = "creation_reason") final String s2) {
        return new GroupChannelData(s, s2);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GroupChannelData)) {
            return false;
        }
        final GroupChannelData groupChannelData = (GroupChannelData)o;
        return e.a((Object)this.welcomeText, (Object)groupChannelData.welcomeText) && e.a((Object)this.creationReason, (Object)groupChannelData.creationReason);
    }
    
    public final String getCreationReason() {
        return this.creationReason;
    }
    
    public final String getWelcomeText() {
        return this.welcomeText;
    }
    
    @Override
    public int hashCode() {
        final String welcomeText = this.welcomeText;
        int hashCode = 0;
        int hashCode2;
        if (welcomeText == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = welcomeText.hashCode();
        }
        final String creationReason = this.creationReason;
        if (creationReason != null) {
            hashCode = creationReason.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("GroupChannelData(welcomeText=");
        r.append(this.welcomeText);
        r.append(", creationReason=");
        return f0.n(r, this.creationReason, ')');
    }
}
