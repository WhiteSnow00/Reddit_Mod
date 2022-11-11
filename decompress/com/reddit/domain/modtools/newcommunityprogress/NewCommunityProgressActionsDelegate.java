// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.newcommunityprogress;

import if2.a;
import hg2.j;
import rg2.p;
import com.reddit.domain.model.mod.ModPermissions;
import com.reddit.domain.model.Subreddit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J$\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&J>\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\rH&JH\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0014\u001a\u00020\u000eH&¨\u0006\u0016" }, d2 = { "Lcom/reddit/domain/modtools/newcommunityprogress/NewCommunityProgressActionsDelegate;", "", "Lcom/reddit/domain/modtools/newcommunityprogress/NewCommunityProgressAction$Impression;", "action", "Lcom/reddit/domain/model/Subreddit;", "subreddit", "Lcom/reddit/domain/model/mod/ModPermissions;", "modPermissions", "Lif2/a;", "onViewShown", "Lcom/reddit/domain/modtools/newcommunityprogress/NewCommunityProgressAction$CollapseExpand;", "onViewCollapsedExpanded", "Lcom/reddit/domain/modtools/newcommunityprogress/NewCommunityProgressAction$CTAClick;", "Lkotlin/Function2;", "", "", "Lhg2/j;", "submitResultMessageHandler", "onCTAClicked", "Lcom/reddit/domain/modtools/newcommunityprogress/NewCommunityProgressAction$DismissClick;", "ctaClicked", "onDismissClicked", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface NewCommunityProgressActionsDelegate
{
    a onCTAClicked(final NewCommunityProgressAction$CTAClick p0, final Subreddit p1, final ModPermissions p2, final p<? super Boolean, ? super String, j> p3);
    
    a onDismissClicked(final NewCommunityProgressAction$DismissClick p0, final Subreddit p1, final ModPermissions p2, final p<? super Boolean, ? super String, j> p3, final boolean p4);
    
    a onViewCollapsedExpanded(final NewCommunityProgressAction$CollapseExpand p0, final Subreddit p1, final ModPermissions p2);
    
    a onViewShown(final NewCommunityProgressAction$Impression p0, final Subreddit p1, final ModPermissions p2);
    
    @Metadata(k = 3, mv = { 1, 7, 1 }, xi = 48)
    public static final class DefaultImpls
    {
    }
}
