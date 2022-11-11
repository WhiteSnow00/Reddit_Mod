// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts.usecase;

import rg2.p;
import kotlin.coroutines.CoroutineContext;
import ej2.g;
import com.reddit.domain.modtools.scheduledposts.SubredditScheduledPost;
import com.reddit.domain.model.Result;
import lg2.c;
import com.reddit.domain.model.mod.SchedulePostModel;
import com.reddit.domain.model.SubmitParameters;
import javax.inject.Inject;
import sg2.e;
import xd0.g0;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import m20.b;
import a20.a;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/usecase/CreateScheduledPostUseCase;", "", "Lcom/reddit/domain/model/SubmitParameters;", "submitParameters", "Lcom/reddit/domain/model/mod/SchedulePostModel;", "schedulePostModel", "Lcom/reddit/domain/model/Result;", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost;", "execute", "(Lcom/reddit/domain/model/SubmitParameters;Lcom/reddit/domain/model/mod/SchedulePostModel;Llg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "scheduledPostRepository", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "Lxd0/g0;", "subredditRepository", "Lm20/b;", "resourceProvider", "La20/a;", "dispatcherProvider", "<init>", "(Lxd0/g0;Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;Lm20/b;La20/a;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class CreateScheduledPostUseCase
{
    private final a dispatcherProvider;
    private final b resourceProvider;
    private final ScheduledPostRepository scheduledPostRepository;
    private final g0 subredditRepository;
    
    @Inject
    public CreateScheduledPostUseCase(final g0 subredditRepository, final ScheduledPostRepository scheduledPostRepository, final b resourceProvider, final a dispatcherProvider) {
        e.f((Object)subredditRepository, "subredditRepository");
        e.f((Object)scheduledPostRepository, "scheduledPostRepository");
        e.f((Object)resourceProvider, "resourceProvider");
        e.f((Object)dispatcherProvider, "dispatcherProvider");
        this.subredditRepository = subredditRepository;
        this.scheduledPostRepository = scheduledPostRepository;
        this.resourceProvider = resourceProvider;
        this.dispatcherProvider = dispatcherProvider;
    }
    
    public final Object execute(final SubmitParameters submitParameters, final SchedulePostModel schedulePostModel, final c<? super Result<SubredditScheduledPost>> c) {
        return g.l((CoroutineContext)this.dispatcherProvider.c(), (p)new CreateScheduledPostUseCase$execute$2(this, submitParameters, schedulePostModel, (c)null), (c)c);
    }
}
