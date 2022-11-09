// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.remote;

import av2.n;
import av2.a;
import com.reddit.data.meta.model.BadgePatchRequestBodyDataModel;
import av2.f;
import com.reddit.data.meta.model.BadgeDataModel;
import java.util.Map;
import nf2.c0;
import av2.t;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005H'¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u00020\u000f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH'¨\u0006\u0011" }, d2 = { "Lcom/reddit/data/meta/remote/RemoteMetaBadgesDataSource;", "", "", "subredditId", "userIdsCommaSeparated", "", "selected", "Lnf2/c0;", "", "Lcom/reddit/data/meta/model/BadgeDataModel;", "badges", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lnf2/c0;", "badgeId", "Lcom/reddit/data/meta/model/BadgePatchRequestBodyDataModel;", "patch", "Lnf2/a;", "modifyBadge", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteMetaBadgesDataSource
{
    @f("badges/{subredditId}")
    c0<Map<String, BadgeDataModel>> badges(@s("subredditId") final String p0, @t(encoded = true, value = "users") final String p1, @t("selected") final Boolean p2);
    
    @n("badges/{subredditId}/{badgeId}")
    nf2.a modifyBadge(@s("subredditId") final String p0, @s("badgeId") final String p1, @a final BadgePatchRequestBodyDataModel p2);
}
