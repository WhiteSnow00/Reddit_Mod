// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.newcommunityprogressv2;

import aq2.a;
import mq0.k;
import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Subreddit;
import com.reddit.domain.model.tagging.NewCommunityProgressModuleV2;
import com.reddit.listing.model.Listable$Type;
import java.util.List;
import kotlin.Metadata;
import com.reddit.listing.model.Listable;

@Metadata(d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c2\u0003J\t\u0010 \u001a\u00020\u0007H\u00c6\u0003J\t\u0010!\u001a\u00020\tH\u00c6\u0003J\t\u0010\"\u001a\u00020\u000bH\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u00c6\u0003J\t\u0010$\u001a\u00020\u0010H\u00c6\u0003JU\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u00c6\u0001J\u0013\u0010&\u001a\u00020\u00102\b\u0010'\u001a\u0004\u0018\u00010(H\u00d6\u0003J\b\u0010)\u001a\u00020\u0005H\u0016J\t\u0010*\u001a\u00020\u000bH\u00d6\u0001J\t\u0010+\u001a\u00020,H\u00d6\u0001R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006." }, d2 = { "Lcom/reddit/domain/modtools/newcommunityprogressv2/NewCommunityProgressV2UiModel;", "Lcom/reddit/listing/model/Listable;", "listableType", "Lcom/reddit/listing/model/Listable$Type;", "uniqueId", "", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "module", "Lcom/reddit/domain/model/tagging/NewCommunityProgressModuleV2;", "firstNonCompletedCardIndex", "", "cards", "", "Lcom/reddit/domain/modtools/newcommunityprogressv2/NewCommunityProgressV2CardUiModel;", "expanded", "", "(Lcom/reddit/listing/model/Listable$Type;JLcom/reddit/domain/model/Subreddit;Lcom/reddit/domain/model/tagging/NewCommunityProgressModuleV2;ILjava/util/List;Z)V", "getCards", "()Ljava/util/List;", "getExpanded", "()Z", "getFirstNonCompletedCardIndex", "()I", "getListableType", "()Lcom/reddit/listing/model/Listable$Type;", "getModule", "()Lcom/reddit/domain/model/tagging/NewCommunityProgressModuleV2;", "getSubreddit", "()Lcom/reddit/domain/model/Subreddit;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "getUniqueID", "hashCode", "toString", "", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NewCommunityProgressV2UiModel implements Listable
{
    public static final NewCommunityProgressV2UiModel.NewCommunityProgressV2UiModel$Companion Companion;
    public static final int POSITION_IN_FEED = 0;
    private final List<NewCommunityProgressV2CardUiModel> cards;
    private final boolean expanded;
    private final int firstNonCompletedCardIndex;
    private final Listable$Type listableType;
    private final NewCommunityProgressModuleV2 module;
    private final Subreddit subreddit;
    private final long uniqueId;
    
    static {
        Companion = new NewCommunityProgressV2UiModel.NewCommunityProgressV2UiModel$Companion((DefaultConstructorMarker)null);
    }
    
    public NewCommunityProgressV2UiModel(final Listable$Type listableType, final long uniqueId, final Subreddit subreddit, final NewCommunityProgressModuleV2 module, final int firstNonCompletedCardIndex, final List<? extends NewCommunityProgressV2CardUiModel> cards, final boolean expanded) {
        e.f((Object)listableType, "listableType");
        e.f((Object)subreddit, "subreddit");
        e.f((Object)module, "module");
        e.f((Object)cards, "cards");
        this.listableType = listableType;
        this.uniqueId = uniqueId;
        this.subreddit = subreddit;
        this.module = module;
        this.firstNonCompletedCardIndex = firstNonCompletedCardIndex;
        this.cards = (List<NewCommunityProgressV2CardUiModel>)cards;
        this.expanded = expanded;
    }
    
    public NewCommunityProgressV2UiModel(Listable$Type mod_NEW_COMMUNITY_PROGRESS_V2_CAROUSEL, long a, final Subreddit subreddit, final NewCommunityProgressModuleV2 newCommunityProgressModuleV2, final int n, final List list, boolean b, final int n2, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x1) != 0x0) {
            mod_NEW_COMMUNITY_PROGRESS_V2_CAROUSEL = Listable$Type.MOD_NEW_COMMUNITY_PROGRESS_V2_CAROUSEL;
        }
        if ((n2 & 0x2) != 0x0) {
            a = k.a.a();
        }
        if ((n2 & 0x40) != 0x0) {
            b = true;
        }
        this(mod_NEW_COMMUNITY_PROGRESS_V2_CAROUSEL, a, subreddit, newCommunityProgressModuleV2, n, list, b);
    }
    
    private final long component2() {
        return this.uniqueId;
    }
    
    public static NewCommunityProgressV2UiModel copy$default(final NewCommunityProgressV2UiModel newCommunityProgressV2UiModel, Listable$Type listableType, long uniqueId, Subreddit subreddit, NewCommunityProgressModuleV2 module, int firstNonCompletedCardIndex, List cards, boolean expanded, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            listableType = newCommunityProgressV2UiModel.getListableType();
        }
        if ((n & 0x2) != 0x0) {
            uniqueId = newCommunityProgressV2UiModel.uniqueId;
        }
        if ((n & 0x4) != 0x0) {
            subreddit = newCommunityProgressV2UiModel.subreddit;
        }
        if ((n & 0x8) != 0x0) {
            module = newCommunityProgressV2UiModel.module;
        }
        if ((n & 0x10) != 0x0) {
            firstNonCompletedCardIndex = newCommunityProgressV2UiModel.firstNonCompletedCardIndex;
        }
        if ((n & 0x20) != 0x0) {
            cards = newCommunityProgressV2UiModel.cards;
        }
        if ((n & 0x40) != 0x0) {
            expanded = newCommunityProgressV2UiModel.expanded;
        }
        return newCommunityProgressV2UiModel.copy(listableType, uniqueId, subreddit, module, firstNonCompletedCardIndex, cards, expanded);
    }
    
    public final Listable$Type component1() {
        return this.getListableType();
    }
    
    public final Subreddit component3() {
        return this.subreddit;
    }
    
    public final NewCommunityProgressModuleV2 component4() {
        return this.module;
    }
    
    public final int component5() {
        return this.firstNonCompletedCardIndex;
    }
    
    public final List<NewCommunityProgressV2CardUiModel> component6() {
        return this.cards;
    }
    
    public final boolean component7() {
        return this.expanded;
    }
    
    public final NewCommunityProgressV2UiModel copy(final Listable$Type listable$Type, final long n, final Subreddit subreddit, final NewCommunityProgressModuleV2 newCommunityProgressModuleV2, final int n2, final List<? extends NewCommunityProgressV2CardUiModel> list, final boolean b) {
        e.f((Object)listable$Type, "listableType");
        e.f((Object)subreddit, "subreddit");
        e.f((Object)newCommunityProgressModuleV2, "module");
        e.f((Object)list, "cards");
        return new NewCommunityProgressV2UiModel(listable$Type, n, subreddit, newCommunityProgressModuleV2, n2, list, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewCommunityProgressV2UiModel)) {
            return false;
        }
        final NewCommunityProgressV2UiModel newCommunityProgressV2UiModel = (NewCommunityProgressV2UiModel)o;
        return this.getListableType() == newCommunityProgressV2UiModel.getListableType() && this.uniqueId == newCommunityProgressV2UiModel.uniqueId && e.a((Object)this.subreddit, (Object)newCommunityProgressV2UiModel.subreddit) && e.a((Object)this.module, (Object)newCommunityProgressV2UiModel.module) && this.firstNonCompletedCardIndex == newCommunityProgressV2UiModel.firstNonCompletedCardIndex && e.a((Object)this.cards, (Object)newCommunityProgressV2UiModel.cards) && this.expanded == newCommunityProgressV2UiModel.expanded;
    }
    
    public final List<NewCommunityProgressV2CardUiModel> getCards() {
        return this.cards;
    }
    
    public final boolean getExpanded() {
        return this.expanded;
    }
    
    public final int getFirstNonCompletedCardIndex() {
        return this.firstNonCompletedCardIndex;
    }
    
    public Listable$Type getListableType() {
        return this.listableType;
    }
    
    public final NewCommunityProgressModuleV2 getModule() {
        return this.module;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    public long getUniqueID() {
        return this.uniqueId;
    }
    
    @Override
    public int hashCode() {
        final int b = ph0.a.b((List)this.cards, a.c(this.firstNonCompletedCardIndex, (this.module.hashCode() + (this.subreddit.hashCode() + b.b(this.uniqueId, this.getListableType().hashCode() * 31, 31)) * 31) * 31, 31), 31);
        int expanded;
        if ((expanded = (this.expanded ? 1 : 0)) != 0) {
            expanded = 1;
        }
        return b + expanded;
    }
    
    @Override
    public String toString() {
        final StringBuilder t = a.t("NewCommunityProgressV2UiModel(listableType=");
        t.append(this.getListableType());
        t.append(", uniqueId=");
        t.append(this.uniqueId);
        t.append(", subreddit=");
        t.append(this.subreddit);
        t.append(", module=");
        t.append(this.module);
        t.append(", firstNonCompletedCardIndex=");
        t.append(this.firstNonCompletedCardIndex);
        t.append(", cards=");
        t.append(this.cards);
        t.append(", expanded=");
        return d.n(t, this.expanded, ')');
    }
}
