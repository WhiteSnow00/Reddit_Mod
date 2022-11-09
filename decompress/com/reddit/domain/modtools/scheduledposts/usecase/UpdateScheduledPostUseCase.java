// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts.usecase;

import kotlin.text.Regex;
import java.util.concurrent.CancellationException;
import com.reddit.domain.model.ConverterRichTextResponse;
import com.reddit.domain.model.Result$Error;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.scheduledposts.SubredditScheduledPost;
import com.reddit.domain.model.Result;
import tg2.c;
import com.reddit.domain.modtools.scheduledposts.UpdateScheduledPostData;
import javax.inject.Inject;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import q20.b;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/usecase/UpdateScheduledPostUseCase;", "", "Lcom/reddit/domain/modtools/scheduledposts/UpdateScheduledPostData;", "updateData", "Lcom/reddit/domain/model/Result;", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost;", "execute", "(Lcom/reddit/domain/modtools/scheduledposts/UpdateScheduledPostData;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "scheduledPostRepository", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "Lq20/b;", "resourceProvider", "<init>", "(Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;Lq20/b;)V", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class UpdateScheduledPostUseCase
{
    public static final Companion Companion;
    private static final String FORMAT_ARGS_DOUBLE_PATTERN = "\"f\"\\s*:\\s*\\[\\s*\\[\\s*(\\d+)(?:\\.0)?,\\s*(\\d+)(?:\\.0)?,\\s*(\\d+)(?:\\.0)?\\s*\\]\\s*\\]";
    private static final String FORMAT_ARGS_INTEGER_REPLACEMENT = "\"f\":[[$1,$2,$3]]";
    private final b resourceProvider;
    private final ScheduledPostRepository scheduledPostRepository;
    
    static {
        Companion = new Companion(null);
    }
    
    @Inject
    public UpdateScheduledPostUseCase(final ScheduledPostRepository scheduledPostRepository, final b resourceProvider) {
        f.f((Object)scheduledPostRepository, "scheduledPostRepository");
        f.f((Object)resourceProvider, "resourceProvider");
        this.scheduledPostRepository = scheduledPostRepository;
        this.resourceProvider = resourceProvider;
    }
    
    public final Object execute(UpdateScheduledPostData ex, final c<? super Result<SubredditScheduledPost>> c) {
        UpdateScheduledPostUseCase$execute$1 updateScheduledPostUseCase$execute$1 = null;
        Label_0048: {
            if (c instanceof UpdateScheduledPostUseCase$execute$1) {
                updateScheduledPostUseCase$execute$1 = (UpdateScheduledPostUseCase$execute$1)c;
                final int label = updateScheduledPostUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updateScheduledPostUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            updateScheduledPostUseCase$execute$1 = new UpdateScheduledPostUseCase$execute$1(this, (c)c);
        }
        final Object result = updateScheduledPostUseCase$execute$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = updateScheduledPostUseCase$execute$1.label;
        boolean b = true;
        Label_0159: {
            if (label2 == 0) {
                break Label_0159;
            }
            Label_0120: {
                if (label2 == 1) {
                    break Label_0120;
                }
                Label_0110: {
                    if (label2 != 2) {
                        break Label_0110;
                    }
                    ex = (CancellationException)updateScheduledPostUseCase$execute$1.L$0;
                    Label_0344: {
                        try {
                            aj2.c.Q0(result);
                            final Object l$2 = result;
                            break Label_0344;
                        }
                        catch (final CancellationException ex) {
                            throw ex;
                            Label_0255: {
                                final Object o = ex;
                            }
                            ex = (CancellationException)this;
                            String body = null;
                            Object l$2 = body;
                            while (true) {
                            Block_10:
                                while (true) {
                                    break Label_0263;
                                    Label_0266:
                                    l$2 = null;
                                    Object o = ex;
                                    ex = (CancellationException)this;
                                    final Object convertMarkdownToRichText;
                                    Label_0240: {
                                        Block_12: {
                                            break Block_12;
                                            l$2 = updateScheduledPostUseCase$execute$1.L$2;
                                            final UpdateScheduledPostData updateScheduledPostData = (UpdateScheduledPostData)updateScheduledPostUseCase$execute$1.L$1;
                                            ex = (CancellationException)updateScheduledPostUseCase$execute$1.L$0;
                                            aj2.c.Q0(result);
                                            convertMarkdownToRichText = result;
                                            o = updateScheduledPostData;
                                            break Label_0240;
                                            Label_0236:
                                            o = ex;
                                            ex = (CancellationException)this;
                                            break Label_0240;
                                        }
                                        while (true) {
                                            try {
                                                final ScheduledPostRepository scheduledPostRepository = ((UpdateScheduledPostUseCase)ex).scheduledPostRepository;
                                                final UpdateScheduledPostData copy$default = UpdateScheduledPostData.copy$default((UpdateScheduledPostData)o, null, null, (String)l$2, SubredditScheduledPost.ContentType.RICH_TEXT, null, null, null, null, null, null, 1011, null);
                                                updateScheduledPostUseCase$execute$1.L$0 = ex;
                                                updateScheduledPostUseCase$execute$1.L$1 = null;
                                                updateScheduledPostUseCase$execute$1.L$2 = null;
                                                updateScheduledPostUseCase$execute$1.label = 2;
                                                l$2 = scheduledPostRepository.updateScheduledPost(copy$default, (c<? super Result<SubredditScheduledPost>>)updateScheduledPostUseCase$execute$1);
                                                if (l$2 == coroutine_SUSPENDED) {
                                                    return coroutine_SUSPENDED;
                                                }
                                                final Object o2 = ex;
                                                ex = (CancellationException)o2;
                                                final Result result2 = (Result)(l$2 = l$2);
                                                ex = (CancellationException)o2;
                                                if (result2 instanceof Result$Error) {
                                                    ex = (CancellationException)o2;
                                                    if (((Result$Error)result2).getError().length() != 0) {
                                                        b = false;
                                                    }
                                                    l$2 = result2;
                                                    if (b) {
                                                        ex = (CancellationException)o2;
                                                        l$2 = Result$Error.copy$default((Result$Error)result2, ((UpdateScheduledPostUseCase)o2).resourceProvider.getString(2131953268), false, 2, (Object)null);
                                                    }
                                                }
                                                return l$2;
                                            }
                                            finally {}
                                            return new Result$Error(((UpdateScheduledPostUseCase)ex).resourceProvider.getString(2131953268), false, 2, (DefaultConstructorMarker)null);
                                            iftrue(Label_0255:)(((UpdateScheduledPostData)ex).getBodyContentType() == SubredditScheduledPost.ContentType.RICH_TEXT);
                                            break Block_10;
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            continue;
                                        }
                                    }
                                    l$2 = ((Companion)l$2).getNormalizedOutput((ConverterRichTextResponse)convertMarkdownToRichText);
                                    continue;
                                }
                                l$2 = UpdateScheduledPostUseCase.Companion;
                                final ScheduledPostRepository scheduledPostRepository2 = this.scheduledPostRepository;
                                updateScheduledPostUseCase$execute$1.L$0 = this;
                                updateScheduledPostUseCase$execute$1.L$1 = ex;
                                updateScheduledPostUseCase$execute$1.L$2 = l$2;
                                updateScheduledPostUseCase$execute$1.label = 1;
                                Object convertMarkdownToRichText = scheduledPostRepository2.convertMarkdownToRichText(body, (c<? super ConverterRichTextResponse>)updateScheduledPostUseCase$execute$1);
                                iftrue(Label_0236:)(convertMarkdownToRichText != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                aj2.c.Q0(result);
                                body = ((UpdateScheduledPostData)ex).getBody();
                                iftrue(Label_0266:)(body == null);
                                continue;
                            }
                        }
                        finally {
                            return new Result$Error(((UpdateScheduledPostUseCase)ex).resourceProvider.getString(2131953268), false, 2, (DefaultConstructorMarker)null);
                        }
                    }
                }
            }
        }
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\u0006\u001a\u00020\u0004*\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/usecase/UpdateScheduledPostUseCase$Companion;", "", "()V", "FORMAT_ARGS_DOUBLE_PATTERN", "", "FORMAT_ARGS_INTEGER_REPLACEMENT", "getNormalizedOutput", "Lcom/reddit/domain/model/ConverterRichTextResponse;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        private final String getNormalizedOutput(final ConverterRichTextResponse converterRichTextResponse) {
            return new Regex("\"f\"\\s*:\\s*\\[\\s*\\[\\s*(\\d+)(?:\\.0)?,\\s*(\\d+)(?:\\.0)?,\\s*(\\d+)(?:\\.0)?\\s*\\]\\s*\\]").replace((CharSequence)converterRichTextResponse.getOutput().getRichTextString(), "\"f\":[[$1,$2,$3]]");
        }
    }
}
