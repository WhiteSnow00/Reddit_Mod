// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import ak0.m;
import ag0.a;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\tH\u00c6\u0003J\t\u0010 \u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0001J\u0013\u0010#\u001a\u00020\u000b2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010'\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006(" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressModuleV2;", "", "id", "", "displayText", "description", "progress", "Lcom/reddit/domain/model/tagging/CommunityCompletionProgress;", "badge", "Lcom/reddit/domain/model/tagging/CommunityProgressBadge;", "isLastAvailable", "", "cards", "", "Lcom/reddit/domain/model/tagging/NewCommunityProgressV2Card;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/reddit/domain/model/tagging/CommunityCompletionProgress;Lcom/reddit/domain/model/tagging/CommunityProgressBadge;ZLjava/util/List;)V", "getBadge", "()Lcom/reddit/domain/model/tagging/CommunityProgressBadge;", "getCards", "()Ljava/util/List;", "getDescription", "()Ljava/lang/String;", "getDisplayText", "getId", "()Z", "getProgress", "()Lcom/reddit/domain/model/tagging/CommunityCompletionProgress;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NewCommunityProgressModuleV2
{
    private final CommunityProgressBadge badge;
    private final List<NewCommunityProgressV2Card> cards;
    private final String description;
    private final String displayText;
    private final String id;
    private final boolean isLastAvailable;
    private final CommunityCompletionProgress progress;
    
    public NewCommunityProgressModuleV2(final String id, final String displayText, final String description, final CommunityCompletionProgress progress, final CommunityProgressBadge badge, final boolean isLastAvailable, final List<NewCommunityProgressV2Card> cards) {
        f.f((Object)id, "id");
        f.f((Object)displayText, "displayText");
        f.f((Object)description, "description");
        f.f((Object)progress, "progress");
        f.f((Object)badge, "badge");
        f.f((Object)cards, "cards");
        this.id = id;
        this.displayText = displayText;
        this.description = description;
        this.progress = progress;
        this.badge = badge;
        this.isLastAvailable = isLastAvailable;
        this.cards = cards;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.displayText;
    }
    
    public final String component3() {
        return this.description;
    }
    
    public final CommunityCompletionProgress component4() {
        return this.progress;
    }
    
    public final CommunityProgressBadge component5() {
        return this.badge;
    }
    
    public final boolean component6() {
        return this.isLastAvailable;
    }
    
    public final List<NewCommunityProgressV2Card> component7() {
        return this.cards;
    }
    
    public final NewCommunityProgressModuleV2 copy(final String s, final String s2, final String s3, final CommunityCompletionProgress communityCompletionProgress, final CommunityProgressBadge communityProgressBadge, final boolean b, final List<NewCommunityProgressV2Card> list) {
        f.f((Object)s, "id");
        f.f((Object)s2, "displayText");
        f.f((Object)s3, "description");
        f.f((Object)communityCompletionProgress, "progress");
        f.f((Object)communityProgressBadge, "badge");
        f.f((Object)list, "cards");
        return new NewCommunityProgressModuleV2(s, s2, s3, communityCompletionProgress, communityProgressBadge, b, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewCommunityProgressModuleV2)) {
            return false;
        }
        final NewCommunityProgressModuleV2 newCommunityProgressModuleV2 = (NewCommunityProgressModuleV2)o;
        return f.a((Object)this.id, (Object)newCommunityProgressModuleV2.id) && f.a((Object)this.displayText, (Object)newCommunityProgressModuleV2.displayText) && f.a((Object)this.description, (Object)newCommunityProgressModuleV2.description) && f.a((Object)this.progress, (Object)newCommunityProgressModuleV2.progress) && f.a((Object)this.badge, (Object)newCommunityProgressModuleV2.badge) && this.isLastAvailable == newCommunityProgressModuleV2.isLastAvailable && f.a((Object)this.cards, (Object)newCommunityProgressModuleV2.cards);
    }
    
    public final CommunityProgressBadge getBadge() {
        return this.badge;
    }
    
    public final List<NewCommunityProgressV2Card> getCards() {
        return this.cards;
    }
    
    public final String getDescription() {
        return this.description;
    }
    
    public final String getDisplayText() {
        return this.displayText;
    }
    
    public final String getId() {
        return this.id;
    }
    
    public final CommunityCompletionProgress getProgress() {
        return this.progress;
    }
    
    @Override
    public int hashCode() {
        final int f = a.f(this.description, a.f(this.displayText, this.id.hashCode() * 31, 31), 31);
        final int hashCode = this.progress.hashCode();
        final int hashCode2 = this.badge.hashCode();
        int isLastAvailable;
        if ((isLastAvailable = (this.isLastAvailable ? 1 : 0)) != 0) {
            isLastAvailable = 1;
        }
        return this.cards.hashCode() + ((hashCode2 + (hashCode + f) * 31) * 31 + isLastAvailable) * 31;
    }
    
    public final boolean isLastAvailable() {
        return this.isLastAvailable;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("NewCommunityProgressModuleV2(id=");
        k.append(this.id);
        k.append(", displayText=");
        k.append(this.displayText);
        k.append(", description=");
        k.append(this.description);
        k.append(", progress=");
        k.append(this.progress);
        k.append(", badge=");
        k.append(this.badge);
        k.append(", isLastAvailable=");
        k.append(this.isLastAvailable);
        k.append(", cards=");
        return m.n(k, (List)this.cards, ')');
    }
}
