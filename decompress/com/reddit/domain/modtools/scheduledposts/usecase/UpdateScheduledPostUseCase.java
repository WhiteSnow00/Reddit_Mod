// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.scheduledposts.usecase;

import kotlin.text.Regex;
import java.util.concurrent.CancellationException;
import java.util.Map;
import com.reddit.domain.model.ConverterRichTextResponse;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.scheduledposts.SubredditScheduledPost;
import com.reddit.domain.model.Result;
import lg2.c;
import com.reddit.domain.modtools.scheduledposts.UpdateScheduledPostData;
import javax.inject.Inject;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.modtools.scheduledposts.ScheduledPostRepository;
import m20.b;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010" }, d2 = { "Lcom/reddit/domain/modtools/scheduledposts/usecase/UpdateScheduledPostUseCase;", "", "Lcom/reddit/domain/modtools/scheduledposts/UpdateScheduledPostData;", "updateData", "Lcom/reddit/domain/model/Result;", "Lcom/reddit/domain/modtools/scheduledposts/SubredditScheduledPost;", "execute", "(Lcom/reddit/domain/modtools/scheduledposts/UpdateScheduledPostData;Llg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "scheduledPostRepository", "Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;", "Lm20/b;", "resourceProvider", "<init>", "(Lcom/reddit/domain/modtools/scheduledposts/ScheduledPostRepository;Lm20/b;)V", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 })
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
        e.f((Object)scheduledPostRepository, "scheduledPostRepository");
        e.f((Object)resourceProvider, "resourceProvider");
        this.scheduledPostRepository = scheduledPostRepository;
        this.resourceProvider = resourceProvider;
    }
    
    public final Object execute(UpdateScheduledPostData ex, final c<? super Result<SubredditScheduledPost>> c) {
        Object updateScheduledPost = null;
        Label_0048: {
            if (c instanceof UpdateScheduledPostUseCase$execute$1) {
                updateScheduledPost = c;
                final int label = ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            updateScheduledPost = new UpdateScheduledPostUseCase$execute$1(this, (c)c);
        }
        final Object result = ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).label;
        boolean b = true;
        Label_0161: {
            if (label2 == 0) {
                break Label_0161;
            }
            Label_0122: {
                if (label2 == 1) {
                    break Label_0122;
                }
                Label_0112: {
                    if (label2 != 2) {
                        break Label_0112;
                    }
                    ex = (CancellationException)((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$0;
                    Label_0354: {
                        try {
                            yd.b.k0(result);
                            updateScheduledPost = result;
                            break Label_0354;
                        }
                        catch (final CancellationException ex) {
                            throw ex;
                            String access$getNormalizedOutput = null;
                            String s;
                            Object o2 = null;
                            Object o;
                            String s2;
                            Companion companion;
                            Object convertMarkdownToRichText;
                            ScheduledPostRepository scheduledPostRepository;
                            String body;
                            ScheduledPostRepository scheduledPostRepository2;
                            UpdateScheduledPostData copy$default;
                            Object o3;
                            Result<Object> copy$default2;
                            UpdateScheduledPostData updateScheduledPostData;
                            Block_10_Outer:Block_12_Outer:Block_9_Outer:
                            while (true) {
                                while (true) {
                                    while (true) {
                                        while (true) {
                                            Label_0285: {
                                                while (true) {
                                                    s = access$getNormalizedOutput;
                                                    o = o2;
                                                    s2 = s;
                                                    break Label_0285;
                                                    Label_0238: {
                                                        o2 = ex;
                                                    }
                                                    ex = (CancellationException)this;
                                                    access$getNormalizedOutput = companion.getNormalizedOutput((ConverterRichTextResponse)convertMarkdownToRichText);
                                                    continue Block_10_Outer;
                                                    companion = UpdateScheduledPostUseCase.Companion;
                                                    scheduledPostRepository = this.scheduledPostRepository;
                                                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$0 = this;
                                                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$1 = ex;
                                                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$2 = companion;
                                                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).label = 1;
                                                    convertMarkdownToRichText = scheduledPostRepository.convertMarkdownToRichText(body, (c<? super ConverterRichTextResponse>)updateScheduledPost);
                                                    iftrue(Label_0238:)(convertMarkdownToRichText != coroutine_SUSPENDED);
                                                    return coroutine_SUSPENDED;
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                    Label_0257:
                                                    o2 = ex;
                                                    ex = (CancellationException)this;
                                                    access$getNormalizedOutput = body;
                                                    continue Block_10_Outer;
                                                }
                                                try {
                                                    scheduledPostRepository2 = ((UpdateScheduledPostUseCase)ex).scheduledPostRepository;
                                                    copy$default = UpdateScheduledPostData.copy$default((UpdateScheduledPostData)o, null, null, s2, SubredditScheduledPost.ContentType.RICH_TEXT, null, null, null, null, null, null, 1011, null);
                                                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$0 = ex;
                                                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$1 = null;
                                                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$2 = null;
                                                    ((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).label = 2;
                                                    updateScheduledPost = scheduledPostRepository2.updateScheduledPost(copy$default, (c<? super Result<SubredditScheduledPost>>)updateScheduledPost);
                                                    if (updateScheduledPost == coroutine_SUSPENDED) {
                                                        return coroutine_SUSPENDED;
                                                    }
                                                    o3 = ex;
                                                    ex = (CancellationException)o3;
                                                    updateScheduledPost = (copy$default2 = (Result<Object>)updateScheduledPost);
                                                    ex = (CancellationException)o3;
                                                    if (updateScheduledPost instanceof Result.Error) {
                                                        ex = (CancellationException)o3;
                                                        if (((Result.Error<Object>)updateScheduledPost).getError().length() != 0) {
                                                            b = false;
                                                        }
                                                        copy$default2 = (Result<Object>)updateScheduledPost;
                                                        if (b) {
                                                            ex = (CancellationException)o3;
                                                            copy$default2 = Result.Error.copy$default((Result.Error<Object>)updateScheduledPost, ((UpdateScheduledPostUseCase)o3).resourceProvider.getString(2131953262), false, null, 6, null);
                                                        }
                                                    }
                                                    return copy$default2;
                                                }
                                                finally {}
                                            }
                                            iftrue(Label_0257:)(((UpdateScheduledPostData)ex).getBodyContentType() == SubredditScheduledPost.ContentType.RICH_TEXT);
                                            continue Block_12_Outer;
                                        }
                                        Label_0278: {
                                            s2 = null;
                                        }
                                        o = ex;
                                        ex = (CancellationException)this;
                                        continue Block_9_Outer;
                                    }
                                    yd.b.k0(result);
                                    body = ((UpdateScheduledPostData)ex).getBody();
                                    iftrue(Label_0278:)(body == null);
                                    continue;
                                }
                                companion = (Companion)((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$2;
                                updateScheduledPostData = (UpdateScheduledPostData)((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$1;
                                ex = (CancellationException)((UpdateScheduledPostUseCase$execute$1)updateScheduledPost).L$0;
                                yd.b.k0(result);
                                convertMarkdownToRichText = result;
                                o2 = updateScheduledPostData;
                                continue Block_10_Outer;
                            }
                        }
                        finally {
                            return new Result.Error(((UpdateScheduledPostUseCase)ex).resourceProvider.getString(2131953262), false, null, 6, null);
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
