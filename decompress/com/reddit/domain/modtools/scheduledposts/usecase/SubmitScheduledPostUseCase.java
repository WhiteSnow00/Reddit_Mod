// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts.usecase;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Result$Error;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Link;
import com.reddit.domain.model.Result;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import q20.b;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/usecase/SubmitScheduledPostUseCase;", "", "", "scheduledPostId", "Lcom/reddit/domain/model/Result;", "Lcom/reddit/domain/model/Link;", "execute", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "scheduledPostRepository", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "Lq20/b;", "resourceProvider", "<init>", "(Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;Lq20/b;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class SubmitScheduledPostUseCase
{
    private final b resourceProvider;
    private final ScheduledPostRepository scheduledPostRepository;
    
    @Inject
    public SubmitScheduledPostUseCase(final ScheduledPostRepository scheduledPostRepository, final b resourceProvider) {
        f.f((Object)scheduledPostRepository, "scheduledPostRepository");
        f.f((Object)resourceProvider, "resourceProvider");
        this.scheduledPostRepository = scheduledPostRepository;
        this.resourceProvider = resourceProvider;
    }
    
    public final Object execute(String ex, final c<? super Result<Link>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof SubmitScheduledPostUseCase$execute$1) {
                final SubmitScheduledPostUseCase$execute$1 submitScheduledPostUseCase$execute$1 = (SubmitScheduledPostUseCase$execute$1)c;
                final int label = submitScheduledPostUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    submitScheduledPostUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    o = submitScheduledPostUseCase$execute$1;
                    break Label_0050;
                }
            }
            o = new SubmitScheduledPostUseCase$execute$1(this, (c)c);
        }
        Object o2 = ((SubmitScheduledPostUseCase$execute$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((SubmitScheduledPostUseCase$execute$1)o).label;
        boolean b = true;
        Label_0107: {
            if (label2 == 0) {
                break Label_0107;
            }
            Label_0097: {
                if (label2 != 1) {
                    break Label_0097;
                }
                SubmitScheduledPostUseCase submitScheduledPostUseCase = (SubmitScheduledPostUseCase)(ex = (CancellationException)((SubmitScheduledPostUseCase$execute$1)o).L$0);
                try {
                    aj2.c.Q0(o2);
                    Label_0146: {
                        break Label_0146;
                        aj2.c.Q0(o2);
                        try {
                            o2 = this.scheduledPostRepository;
                            ((SubmitScheduledPostUseCase$execute$1)o).L$0 = this;
                            ((SubmitScheduledPostUseCase$execute$1)o).label = 1;
                            o2 = ((ScheduledPostRepository)o2).submitScheduledPostNow((String)ex, (c<? super Result<Link>>)o);
                            if (o2 == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            submitScheduledPostUseCase = this;
                            final Result result = (Result)(o2 = o2);
                            if (!(result instanceof Result$Error)) {
                                return o2;
                            }
                            if (((Result$Error)result).getError().length() != 0) {
                                b = false;
                            }
                            o2 = result;
                            if (b) {
                                o2 = Result$Error.copy$default((Result$Error)result, submitScheduledPostUseCase.resourceProvider.getString(2131953268), false, 2, (Object)null);
                                return o2;
                            }
                            return o2;
                        }
                        finally {
                            ex = (CancellationException)this;
                        }
                    }
                    o2 = new Result$Error(((SubmitScheduledPostUseCase)ex).resourceProvider.getString(2131953268), false, 2, (DefaultConstructorMarker)null);
                    return o2;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final CancellationException ex) {
                    throw ex;
                }
                finally {
                    return new Result$Error(((SubmitScheduledPostUseCase)ex).resourceProvider.getString(2131953268), false, 2, (DefaultConstructorMarker)null);
                }
            }
        }
    }
}
