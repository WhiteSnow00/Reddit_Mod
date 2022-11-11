// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.newcommunityprogress;

import al0.g7;
import lq0.h;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Subreddit;
import com.reddit.listing.model.Listable$Type;
import com.reddit.domain.model.tagging.NewCommunityProgressModule;
import kotlin.Metadata;
import com.reddit.listing.model.Listable;

@Metadata(d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 #2\u00020\u0001:\u0001#B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c2\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u000bH\u00c6\u0003J;\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J\b\u0010\u001e\u001a\u00020\u0005H\u0016J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$" }, d2 = { "Lcom/reddit/domain/modtools/newcommunityprogress/NewCommunityProgressUiModel;", "Lcom/reddit/listing/model/Listable;", "listableType", "Lcom/reddit/listing/model/Listable$Type;", "uniqueId", "", "subreddit", "Lcom/reddit/domain/model/Subreddit;", "communityProgressModule", "Lcom/reddit/domain/model/tagging/NewCommunityProgressModule;", "expanded", "", "(Lcom/reddit/listing/model/Listable$Type;JLcom/reddit/domain/model/Subreddit;Lcom/reddit/domain/model/tagging/NewCommunityProgressModule;Z)V", "getCommunityProgressModule", "()Lcom/reddit/domain/model/tagging/NewCommunityProgressModule;", "getExpanded", "()Z", "getListableType", "()Lcom/reddit/listing/model/Listable$Type;", "getSubreddit", "()Lcom/reddit/domain/model/Subreddit;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "getUniqueID", "hashCode", "", "toString", "", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class NewCommunityProgressUiModel implements Listable
{
    public static final Companion Companion;
    public static final int POSITION_IN_FEED = 0;
    private final NewCommunityProgressModule communityProgressModule;
    private final boolean expanded;
    private final Listable$Type listableType;
    private final Subreddit subreddit;
    private final long uniqueId;
    
    static {
        Companion = new Companion(null);
    }
    
    public NewCommunityProgressUiModel(final Listable$Type listableType, final long uniqueId, final Subreddit subreddit, final NewCommunityProgressModule communityProgressModule, final boolean expanded) {
        e.f((Object)listableType, "listableType");
        e.f((Object)subreddit, "subreddit");
        e.f((Object)communityProgressModule, "communityProgressModule");
        this.listableType = listableType;
        this.uniqueId = uniqueId;
        this.subreddit = subreddit;
        this.communityProgressModule = communityProgressModule;
        this.expanded = expanded;
    }
    
    private final long component2() {
        return this.uniqueId;
    }
    
    public final Listable$Type component1() {
        return this.getListableType();
    }
    
    public final Subreddit component3() {
        return this.subreddit;
    }
    
    public final NewCommunityProgressModule component4() {
        return this.communityProgressModule;
    }
    
    public final boolean component5() {
        return this.expanded;
    }
    
    public final NewCommunityProgressUiModel copy(final Listable$Type listable$Type, final long n, final Subreddit subreddit, final NewCommunityProgressModule newCommunityProgressModule, final boolean b) {
        e.f((Object)listable$Type, "listableType");
        e.f((Object)subreddit, "subreddit");
        e.f((Object)newCommunityProgressModule, "communityProgressModule");
        return new NewCommunityProgressUiModel(listable$Type, n, subreddit, newCommunityProgressModule, b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewCommunityProgressUiModel)) {
            return false;
        }
        final NewCommunityProgressUiModel newCommunityProgressUiModel = (NewCommunityProgressUiModel)o;
        return this.getListableType() == newCommunityProgressUiModel.getListableType() && this.uniqueId == newCommunityProgressUiModel.uniqueId && e.a((Object)this.subreddit, (Object)newCommunityProgressUiModel.subreddit) && e.a((Object)this.communityProgressModule, (Object)newCommunityProgressUiModel.communityProgressModule) && this.expanded == newCommunityProgressUiModel.expanded;
    }
    
    public final NewCommunityProgressModule getCommunityProgressModule() {
        return this.communityProgressModule;
    }
    
    public final boolean getExpanded() {
        return this.expanded;
    }
    
    public Listable$Type getListableType() {
        return this.listableType;
    }
    
    public final Subreddit getSubreddit() {
        return this.subreddit;
    }
    
    public long getUniqueID() {
        return this.uniqueId;
    }
    
    @Override
    public int hashCode() {
        final int b = b.b(this.uniqueId, this.getListableType().hashCode() * 31, 31);
        final int hashCode = this.subreddit.hashCode();
        final int hashCode2 = this.communityProgressModule.hashCode();
        int expanded;
        if ((expanded = (this.expanded ? 1 : 0)) != 0) {
            expanded = 1;
        }
        return (hashCode2 + (hashCode + b) * 31) * 31 + expanded;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("NewCommunityProgressUiModel(listableType=");
        r.append(this.getListableType());
        r.append(", uniqueId=");
        r.append(this.uniqueId);
        r.append(", subreddit=");
        r.append(this.subreddit);
        r.append(", communityProgressModule=");
        r.append(this.communityProgressModule);
        r.append(", expanded=");
        return g7.m(r, this.expanded, ')');
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/modtools/newcommunityprogress/NewCommunityProgressUiModel$Companion;", "", "()V", "POSITION_IN_FEED", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
