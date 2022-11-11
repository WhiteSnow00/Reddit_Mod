// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.newcommunityprogressv2;

import if2.a;
import rg2.l;
import hg2.j;
import rg2.p;
import com.reddit.domain.model.mod.ModPermissions;
import com.reddit.domain.model.Subreddit;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JR\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\rH&¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/modtools/newcommunityprogressv2/NewCommunityProgressV2ActionsDelegate;", "", "Lcom/reddit/domain/modtools/newcommunityprogressv2/NewCommunityProgressV2Action;", "action", "Lcom/reddit/domain/model/Subreddit;", "subreddit", "Lcom/reddit/domain/model/mod/ModPermissions;", "modPermissions", "Lkotlin/Function2;", "", "", "Lhg2/j;", "messageHandler", "Lkotlin/Function1;", "Lif2/a;", "disposeOnDetach", "handleAction", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface NewCommunityProgressV2ActionsDelegate
{
    void handleAction(final NewCommunityProgressV2Action p0, final Subreddit p1, final ModPermissions p2, final p<? super Boolean, ? super String, j> p3, final l<? super a, j> p4);
}
