// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.tagging;

import ak0.m;
import ag0.a;
import ah2.f;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018" }, d2 = { "Lcom/reddit/domain/model/tagging/NewCommunityProgressModule;", "", "id", "", "displayName", "cards", "", "Lcom/reddit/domain/model/tagging/NewCommunityProgressCard;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getCards", "()Ljava/util/List;", "getDisplayName", "()Ljava/lang/String;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NewCommunityProgressModule
{
    private final List<NewCommunityProgressCard> cards;
    private final String displayName;
    private final String id;
    
    public NewCommunityProgressModule(final String id, final String displayName, final List<NewCommunityProgressCard> cards) {
        f.f((Object)id, "id");
        f.f((Object)displayName, "displayName");
        f.f((Object)cards, "cards");
        this.id = id;
        this.displayName = displayName;
        this.cards = cards;
    }
    
    public final String component1() {
        return this.id;
    }
    
    public final String component2() {
        return this.displayName;
    }
    
    public final List<NewCommunityProgressCard> component3() {
        return this.cards;
    }
    
    public final NewCommunityProgressModule copy(final String s, final String s2, final List<NewCommunityProgressCard> list) {
        f.f((Object)s, "id");
        f.f((Object)s2, "displayName");
        f.f((Object)list, "cards");
        return new NewCommunityProgressModule(s, s2, list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewCommunityProgressModule)) {
            return false;
        }
        final NewCommunityProgressModule newCommunityProgressModule = (NewCommunityProgressModule)o;
        return f.a((Object)this.id, (Object)newCommunityProgressModule.id) && f.a((Object)this.displayName, (Object)newCommunityProgressModule.displayName) && f.a((Object)this.cards, (Object)newCommunityProgressModule.cards);
    }
    
    public final List<NewCommunityProgressCard> getCards() {
        return this.cards;
    }
    
    public final String getDisplayName() {
        return this.displayName;
    }
    
    public final String getId() {
        return this.id;
    }
    
    @Override
    public int hashCode() {
        return this.cards.hashCode() + a.f(this.displayName, this.id.hashCode() * 31, 31);
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("NewCommunityProgressModule(id=");
        k.append(this.id);
        k.append(", displayName=");
        k.append(this.displayName);
        k.append(", cards=");
        return m.n(k, (List)this.cards, ')');
    }
}
