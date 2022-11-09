// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts.usecase;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Result$Error;
import com.reddit.domain.model.Result$Success;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.model.Result;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import q20.b;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/usecase/ConvertRichTextToMarkdownUseCase;", "", "", "rtJson", "Lcom/reddit/domain/model/Result;", "execute", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "scheduledPostRepository", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "Lq20/b;", "resourceProvider", "<init>", "(Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;Lq20/b;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class ConvertRichTextToMarkdownUseCase
{
    private final b resourceProvider;
    private final ScheduledPostRepository scheduledPostRepository;
    
    @Inject
    public ConvertRichTextToMarkdownUseCase(final ScheduledPostRepository scheduledPostRepository, final b resourceProvider) {
        f.f((Object)scheduledPostRepository, "scheduledPostRepository");
        f.f((Object)resourceProvider, "resourceProvider");
        this.scheduledPostRepository = scheduledPostRepository;
        this.resourceProvider = resourceProvider;
    }
    
    public final Object execute(String ex, final c<? super Result<String>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof ConvertRichTextToMarkdownUseCase$execute$1) {
                final ConvertRichTextToMarkdownUseCase$execute$1 convertRichTextToMarkdownUseCase$execute$1 = (ConvertRichTextToMarkdownUseCase$execute$1)c;
                final int label = convertRichTextToMarkdownUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    convertRichTextToMarkdownUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    o = convertRichTextToMarkdownUseCase$execute$1;
                    break Label_0050;
                }
            }
            o = new ConvertRichTextToMarkdownUseCase$execute$1(this, (c)c);
        }
        Object o2 = ((ConvertRichTextToMarkdownUseCase$execute$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((ConvertRichTextToMarkdownUseCase$execute$1)o).label;
        Label_0104: {
            if (label2 == 0) {
                break Label_0104;
            }
            Label_0094: {
                if (label2 != 1) {
                    break Label_0094;
                }
                ex = (CancellationException)((ConvertRichTextToMarkdownUseCase$execute$1)o).L$0;
                try {
                    aj2.c.Q0(o2);
                    Label_0143: {
                        break Label_0143;
                        aj2.c.Q0(o2);
                        try {
                            final ScheduledPostRepository scheduledPostRepository = this.scheduledPostRepository;
                            ((ConvertRichTextToMarkdownUseCase$execute$1)o).L$0 = this;
                            ((ConvertRichTextToMarkdownUseCase$execute$1)o).label = 1;
                            o2 = scheduledPostRepository.convertRichTextToMarkdown((String)ex, (c<? super String>)o);
                            if (o2 == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            final Result$Success result$Success = new Result$Success(o2);
                            return ex;
                        }
                        finally {
                            ex = (CancellationException)this;
                        }
                    }
                    ex = (CancellationException)new Result$Error(((ConvertRichTextToMarkdownUseCase)ex).resourceProvider.getString(2131953268), false, 2, (DefaultConstructorMarker)null);
                    return ex;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final CancellationException ex) {
                    throw ex;
                }
                finally {
                    return new Result$Error(((ConvertRichTextToMarkdownUseCase)ex).resourceProvider.getString(2131953268), false, 2, (DefaultConstructorMarker)null);
                }
            }
        }
    }
}
