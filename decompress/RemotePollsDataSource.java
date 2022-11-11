// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.meta.remote;

import av2.p;
import com.reddit.data.meta.model.polls.PollVoteResponseDataModel;
import av2.f;
import com.reddit.data.meta.model.polls.PollResponseDataModel;
import java.util.Map;
import nf2.c0;
import av2.t;
import av2.s;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H'J,\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¨\u0006\u000e" }, d2 = { "Lcom/reddit/data/meta/remote/RemotePollsDataSource;", "", "", "subredditId", "postIdsCommaSeparated", "Lnf2/c0;", "", "Lcom/reddit/data/meta/model/polls/PollResponseDataModel;", "polls", "pollId", "", "optionId", "Lcom/reddit/data/meta/model/polls/PollVoteResponseDataModel;", "vote", "data_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemotePollsDataSource
{
    @f("polls/{subredditId}")
    c0<Map<String, PollResponseDataModel>> polls(@s("subredditId") final String p0, @t("postIds") final String p1);
    
    @p("polls/{subredditId}/{pollId}/votes/me/{optionId}")
    c0<PollVoteResponseDataModel> vote(@s("subredditId") final String p0, @s("pollId") final String p1, @s("optionId") final int p2);
}
