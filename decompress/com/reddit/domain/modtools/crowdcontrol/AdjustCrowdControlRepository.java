// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.crowdcontrol;

import com.reddit.domain.model.mod.CrowdControlFilterLevel;
import tg2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H¦@\u00f8\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f" }, d2 = { "Lcom/reddit/domain/modtools/crowdcontrol/AdjustCrowdControlRepository;", "", "", "postId", "Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;", "controlLevel", "", "updateCrowdControlLevelOnPost", "(Ljava/lang/String;Lcom/reddit/domain/model/mod/CrowdControlFilterLevel;Ltg2/c;)Ljava/lang/Object;", "isFilterEnabled", "updateCrowdControlFilterOnPost", "(Ljava/lang/String;ZLtg2/c;)Ljava/lang/Object;", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public interface AdjustCrowdControlRepository
{
    Object updateCrowdControlFilterOnPost(final String p0, final boolean p1, final c<? super Boolean> p2);
    
    Object updateCrowdControlLevelOnPost(final String p0, final CrowdControlFilterLevel p1, final c<? super Boolean> p2);
}
