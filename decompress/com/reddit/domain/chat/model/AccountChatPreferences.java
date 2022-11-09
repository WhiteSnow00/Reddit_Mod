// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import com.squareup.moshi.n;
import com.reddit.data.common.SafeEnum;
import kotlin.Metadata;
import com.squareup.moshi.o;

@o(generateAdapter = true)
@Metadata(d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/chat/model/AccountChatPreferences;", "", "invitePolicy", "Lcom/reddit/domain/chat/model/AccountChatPreferences$InvitePolicy;", "(Lcom/reddit/domain/chat/model/AccountChatPreferences$InvitePolicy;)V", "getInvitePolicy", "()Lcom/reddit/domain/chat/model/AccountChatPreferences$InvitePolicy;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InvitePolicy", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class AccountChatPreferences
{
    private final InvitePolicy invitePolicy;
    
    public AccountChatPreferences(@SafeEnum(defaultValue = "anybody") @n(name = "invite_policy") final InvitePolicy invitePolicy) {
        f.f((Object)invitePolicy, "invitePolicy");
        this.invitePolicy = invitePolicy;
    }
    
    public final InvitePolicy component1() {
        return this.invitePolicy;
    }
    
    public final AccountChatPreferences copy(@SafeEnum(defaultValue = "anybody") @n(name = "invite_policy") final InvitePolicy invitePolicy) {
        f.f((Object)invitePolicy, "invitePolicy");
        return new AccountChatPreferences(invitePolicy);
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof AccountChatPreferences && this.invitePolicy == ((AccountChatPreferences)o).invitePolicy);
    }
    
    public final InvitePolicy getInvitePolicy() {
        return this.invitePolicy;
    }
    
    @Override
    public int hashCode() {
        return this.invitePolicy.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("AccountChatPreferences(invitePolicy=");
        k.append(this.invitePolicy);
        k.append(')');
        return k.toString();
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/reddit/domain/chat/model/AccountChatPreferences$InvitePolicy;", "", "(Ljava/lang/String;I)V", "ANYBODY", "ACCOUNTS_OLDER_THAN_30_DAYS", "NOBODY", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum InvitePolicy
    {
        @n(name = "account_age_30_days")
        ACCOUNTS_OLDER_THAN_30_DAYS, 
        @n(name = "anybody")
        ANYBODY, 
        @n(name = "nobody")
        NOBODY;
    }
}
