// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.welcomemessage.usecase;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Result$Error;
import java.io.IOException;
import com.reddit.domain.model.Result$Success;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.welcomemessage.WelcomeMessage;
import com.reddit.domain.model.Result;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import q20.b;
import com.reddit.domain.modtools.welcomemessage.WelcomeMessageRepository;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/modtools/welcomemessage/usecase/GetWelcomeMessageUseCase;", "", "", "subredditId", "Lcom/reddit/domain/model/Result;", "Lcom/reddit/domain/modtools/welcomemessage/WelcomeMessage;", "execute", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/welcomemessage/WelcomeMessageRepository;", "repository", "Lcom/reddit/domain/modtools/welcomemessage/WelcomeMessageRepository;", "Lq20/b;", "resourceProvider", "<init>", "(Lcom/reddit/domain/modtools/welcomemessage/WelcomeMessageRepository;Lq20/b;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class GetWelcomeMessageUseCase
{
    private final WelcomeMessageRepository repository;
    private final b resourceProvider;
    
    @Inject
    public GetWelcomeMessageUseCase(final WelcomeMessageRepository repository, final b resourceProvider) {
        f.f((Object)repository, "repository");
        f.f((Object)resourceProvider, "resourceProvider");
        this.repository = repository;
        this.resourceProvider = resourceProvider;
    }
    
    public final Object execute(final String s, c<? super Result<WelcomeMessage>> o) {
        Label_0050: {
            if (o instanceof GetWelcomeMessageUseCase$execute$1) {
                final GetWelcomeMessageUseCase$execute$1 getWelcomeMessageUseCase$execute$1 = (GetWelcomeMessageUseCase$execute$1)o;
                final int label = getWelcomeMessageUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    getWelcomeMessageUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    o = getWelcomeMessageUseCase$execute$1;
                    break Label_0050;
                }
            }
            o = new GetWelcomeMessageUseCase$execute$1(this, (c)o);
        }
        Object o2 = ((GetWelcomeMessageUseCase$execute$1)o).result;
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((GetWelcomeMessageUseCase$execute$1)o).label;
        Label_0107: {
            if (label2 == 0) {
                break Label_0107;
            }
            Label_0097: {
                if (label2 != 1) {
                    break Label_0097;
                }
                Object o3 = coroutine_SUSPENDED = (o = ((GetWelcomeMessageUseCase$execute$1)o).L$0);
                try {
                    aj2.c.Q0(o2);
                    Object o5 = null;
                    Label_0149: {
                        break Label_0149;
                        aj2.c.Q0(o2);
                        try {
                            final WelcomeMessageRepository repository = this.repository;
                            ((GetWelcomeMessageUseCase$execute$1)o).L$0 = this;
                            ((GetWelcomeMessageUseCase$execute$1)o).label = 1;
                            o2 = repository.getWelcomeMessage(s, (c<? super WelcomeMessage>)o);
                            if (o2 == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            o3 = this;
                            o = o3;
                            coroutine_SUSPENDED = o3;
                            WelcomeMessage welcomeMessage;
                            if ((welcomeMessage = (WelcomeMessage)o2) == null) {
                                o = o3;
                                coroutine_SUSPENDED = o3;
                                welcomeMessage = new(com.reddit.domain.modtools.welcomemessage.WelcomeMessage.class)();
                                o = o3;
                                coroutine_SUSPENDED = o3;
                                new WelcomeMessage("", "", "", false, false);
                            }
                            o = o3;
                            coroutine_SUSPENDED = o3;
                            o = o3;
                            coroutine_SUSPENDED = o3;
                            final Result$Success result$Success = new Result$Success((Object)welcomeMessage);
                            return;
                        }
                        catch (final IOException ex) {
                            o5 = this;
                        }
                        finally {
                            final Object o4 = this;
                        }
                    }
                    return new Result$Error(((GetWelcomeMessageUseCase)o5).resourceProvider.getString(2131953329), false, 2, (DefaultConstructorMarker)null);
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final CancellationException ex2) {
                    throw ex2;
                }
                catch (final IOException ex3) {
                    final Object o5 = o;
                    return new Result$Error(((GetWelcomeMessageUseCase)o5).resourceProvider.getString(2131953329), false, 2, (DefaultConstructorMarker)null);
                }
                finally {
                    final Object o4 = coroutine_SUSPENDED;
                    goto Label_0224;
                }
            }
        }
    }
}
