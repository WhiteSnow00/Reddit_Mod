// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.pnsettings.usecase;

import java.util.concurrent.CancellationException;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.reddit.domain.model.Result$Error;
import com.reddit.domain.model.Result$Success;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.pnsettings.model.Row$Group;
import com.reddit.domain.model.Result;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import q20.b;
import com.reddit.domain.modtools.pnsettings.ModNotificationSettingsRepository;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f" }, d2 = { "Lcom/reddit/domain/modtools/pnsettings/usecase/GetModNotificationSettingsLayout;", "", "", "subredditId", "Lcom/reddit/domain/model/Result;", "Lcom/reddit/domain/modtools/pnsettings/model/Row$Group;", "execute", "(Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/pnsettings/ModNotificationSettingsRepository;", "repository", "Lcom/reddit/domain/modtools/pnsettings/ModNotificationSettingsRepository;", "Lq20/b;", "resourceProvider", "<init>", "(Lcom/reddit/domain/modtools/pnsettings/ModNotificationSettingsRepository;Lq20/b;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class GetModNotificationSettingsLayout
{
    private final ModNotificationSettingsRepository repository;
    private final b resourceProvider;
    
    @Inject
    public GetModNotificationSettingsLayout(final ModNotificationSettingsRepository repository, final b resourceProvider) {
        f.f((Object)repository, "repository");
        f.f((Object)resourceProvider, "resourceProvider");
        this.repository = repository;
        this.resourceProvider = resourceProvider;
    }
    
    public final Object execute(final String s, c<? super Result<Row$Group>> o) {
        Label_0050: {
            if (o instanceof GetModNotificationSettingsLayout$execute$1) {
                final GetModNotificationSettingsLayout$execute$1 getModNotificationSettingsLayout$execute$1 = (GetModNotificationSettingsLayout$execute$1)o;
                final int label = getModNotificationSettingsLayout$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    getModNotificationSettingsLayout$execute$1.label = label + Integer.MIN_VALUE;
                    o = getModNotificationSettingsLayout$execute$1;
                    break Label_0050;
                }
            }
            o = new GetModNotificationSettingsLayout$execute$1(this, (c)o);
        }
        Object o2 = ((GetModNotificationSettingsLayout$execute$1)o).result;
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((GetModNotificationSettingsLayout$execute$1)o).label;
        Label_0107: {
            if (label2 == 0) {
                break Label_0107;
            }
            Label_0097: {
                if (label2 != 1) {
                    break Label_0097;
                }
                Object o3 = coroutine_SUSPENDED = (o = ((GetModNotificationSettingsLayout$execute$1)o).L$0);
                try {
                    aj2.c.Q0(o2);
                    Label_0149: {
                        break Label_0149;
                        aj2.c.Q0(o2);
                        try {
                            final ModNotificationSettingsRepository repository = this.repository;
                            ((GetModNotificationSettingsLayout$execute$1)o).L$0 = this;
                            ((GetModNotificationSettingsLayout$execute$1)o).label = 1;
                            o2 = repository.getSettingsLayout(s, (c<? super Row$Group>)o);
                            if (o2 == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            o3 = this;
                            o = o3;
                            coroutine_SUSPENDED = o3;
                            final Row$Group row$Group = (Row$Group)o2;
                            final Result$Error result$Error;
                            if (row$Group != null) {
                                o = o3;
                                coroutine_SUSPENDED = o3;
                                o = o3;
                                coroutine_SUSPENDED = o3;
                                final Result$Success result$Success = new Result$Success((Object)row$Group);
                                return result$Error;
                            }
                            o = o3;
                            coroutine_SUSPENDED = o3;
                            final Result$Error result$Error2 = new Result$Error(((GetModNotificationSettingsLayout)o3).resourceProvider.getString(2131953268), false, 2, (DefaultConstructorMarker)null);
                            return result$Error;
                        }
                        catch (final IOException ex) {
                            o = this;
                        }
                        finally {
                            coroutine_SUSPENDED = this;
                        }
                    }
                    return new Result$Error(((GetModNotificationSettingsLayout)o).resourceProvider.getString(2131953329), false, 2, (DefaultConstructorMarker)null);
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final CancellationException ex2) {
                    throw ex2;
                }
                catch (final IOException ex3) {
                    return new Result$Error(((GetModNotificationSettingsLayout)o).resourceProvider.getString(2131953329), false, 2, (DefaultConstructorMarker)null);
                }
                finally {
                    goto Label_0223;
                }
            }
        }
    }
}
