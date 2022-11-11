// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/chat/model/InviteLinkSettings;", "", "maxNumberUses", "Lcom/reddit/domain/chat/model/InviteLinkMaxUses;", "expires", "Lcom/reddit/domain/chat/model/InviteLinkExpirations;", "(Lcom/reddit/domain/chat/model/InviteLinkMaxUses;Lcom/reddit/domain/chat/model/InviteLinkExpirations;)V", "getExpires", "()Lcom/reddit/domain/chat/model/InviteLinkExpirations;", "getMaxNumberUses", "()Lcom/reddit/domain/chat/model/InviteLinkMaxUses;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class InviteLinkSettings
{
    private final InviteLinkExpirations expires;
    private final InviteLinkMaxUses maxNumberUses;
    
    public InviteLinkSettings(final InviteLinkMaxUses maxNumberUses, final InviteLinkExpirations expires) {
        e.f((Object)maxNumberUses, "maxNumberUses");
        e.f((Object)expires, "expires");
        this.maxNumberUses = maxNumberUses;
        this.expires = expires;
    }
    
    public final InviteLinkMaxUses component1() {
        return this.maxNumberUses;
    }
    
    public final InviteLinkExpirations component2() {
        return this.expires;
    }
    
    public final InviteLinkSettings copy(final InviteLinkMaxUses inviteLinkMaxUses, final InviteLinkExpirations inviteLinkExpirations) {
        e.f((Object)inviteLinkMaxUses, "maxNumberUses");
        e.f((Object)inviteLinkExpirations, "expires");
        return new InviteLinkSettings(inviteLinkMaxUses, inviteLinkExpirations);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InviteLinkSettings)) {
            return false;
        }
        final InviteLinkSettings inviteLinkSettings = (InviteLinkSettings)o;
        return this.maxNumberUses == inviteLinkSettings.maxNumberUses && this.expires == inviteLinkSettings.expires;
    }
    
    public final InviteLinkExpirations getExpires() {
        return this.expires;
    }
    
    public final InviteLinkMaxUses getMaxNumberUses() {
        return this.maxNumberUses;
    }
    
    @Override
    public int hashCode() {
        return this.expires.hashCode() + this.maxNumberUses.hashCode() * 31;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("InviteLinkSettings(maxNumberUses=");
        r.append(this.maxNumberUses);
        r.append(", expires=");
        r.append(this.expires);
        r.append(')');
        return r.toString();
    }
}
