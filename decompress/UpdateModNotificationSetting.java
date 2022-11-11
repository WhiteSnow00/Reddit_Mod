// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.pnsettings.usecase;

import java.util.concurrent.CancellationException;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import hg2.j;
import com.reddit.domain.model.Result;
import com.reddit.domain.model.UpdateResponse;
import lg2.c;
import rg2.l;
import javax.inject.Inject;
import sg2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m20.b;
import com.reddit.domain.modtools.pnsettings.ModNotificationSettingsRepository;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0019\b\u0007\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u001e\u0010\u0005\u001a\u001a\b\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002H\u0082@\u00f8\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ1\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 " }, d2 = { "Lcom/reddit/domain/modtools/pnsettings/usecase/UpdateModNotificationSetting;", "", "Lkotlin/Function1;", "Llg2/c;", "Lcom/reddit/domain/model/UpdateResponse;", "updateSetting", "Lcom/reddit/domain/model/Result;", "Lhg2/j;", "executeSafe", "(Lrg2/l;Llg2/c;)Ljava/lang/Object;", "", "subredditId", "settingName", "", "enabled", "updateToggleSetting", "(Ljava/lang/String;Ljava/lang/String;ZLlg2/c;)Ljava/lang/Object;", "", "currentValue", "updateRangeToggleSetting", "(Ljava/lang/String;Ljava/lang/String;ZILlg2/c;)Ljava/lang/Object;", "value", "updateRangeSetting", "(Ljava/lang/String;Ljava/lang/String;ILlg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/pnsettings/ModNotificationSettingsRepository;", "repository", "Lcom/reddit/domain/modtools/pnsettings/ModNotificationSettingsRepository;", "Lm20/b;", "resourceProvider", "<init>", "(Lcom/reddit/domain/modtools/pnsettings/ModNotificationSettingsRepository;Lm20/b;)V", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class UpdateModNotificationSetting
{
    public static final Companion Companion;
    private static final int THRESHOLD_AUTO = -1;
    private final ModNotificationSettingsRepository repository;
    private final b resourceProvider;
    
    static {
        Companion = new Companion(null);
    }
    
    @Inject
    public UpdateModNotificationSetting(final ModNotificationSettingsRepository repository, final b resourceProvider) {
        e.f((Object)repository, "repository");
        e.f((Object)resourceProvider, "resourceProvider");
        this.repository = repository;
        this.resourceProvider = resourceProvider;
    }
    
    private final Object executeSafe(final l<? super c<? super UpdateResponse>, ?> l, c<? super Result<j>> o) {
        Label_0050: {
            if (o instanceof UpdateModNotificationSetting$executeSafe$1) {
                final UpdateModNotificationSetting$executeSafe$1 updateModNotificationSetting$executeSafe$1 = (UpdateModNotificationSetting$executeSafe$1)o;
                final int label = updateModNotificationSetting$executeSafe$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updateModNotificationSetting$executeSafe$1.label = label + Integer.MIN_VALUE;
                    o = updateModNotificationSetting$executeSafe$1;
                    break Label_0050;
                }
            }
            o = new UpdateModNotificationSetting$executeSafe$1(this, (c)o);
        }
        Object o2 = ((UpdateModNotificationSetting$executeSafe$1)o).result;
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((UpdateModNotificationSetting$executeSafe$1)o).label;
        Label_0107: {
            if (label2 == 0) {
                break Label_0107;
            }
            Label_0097: {
                if (label2 != 1) {
                    break Label_0097;
                }
                Object o3 = coroutine_SUSPENDED = (o = ((UpdateModNotificationSetting$executeSafe$1)o).L$0);
                try {
                    yd.b.k0(o2);
                    Label_0141: {
                        break Label_0141;
                        yd.b.k0(o2);
                        try {
                            ((UpdateModNotificationSetting$executeSafe$1)o).L$0 = this;
                            ((UpdateModNotificationSetting$executeSafe$1)o).label = 1;
                            o2 = l.invoke((Object)o);
                            if (o2 == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            o3 = this;
                            o = o3;
                            coroutine_SUSPENDED = o3;
                            final UpdateResponse updateResponse = (UpdateResponse)o2;
                            final Result.Error error2;
                            if (updateResponse == null) {
                                o = o3;
                                coroutine_SUSPENDED = o3;
                                o = o3;
                                coroutine_SUSPENDED = o3;
                                final Result.Error error = new Result.Error(((UpdateModNotificationSetting)o3).resourceProvider.getString(2131953262), false, null, 6, null);
                                return error2;
                            }
                            o = o3;
                            coroutine_SUSPENDED = o3;
                            if (!updateResponse.getSuccess()) {
                                o = o3;
                                coroutine_SUSPENDED = o3;
                                String s;
                                if ((s = updateResponse.getErrorMessage()) == null) {
                                    o = o3;
                                    coroutine_SUSPENDED = o3;
                                    s = ((UpdateModNotificationSetting)o3).resourceProvider.getString(2131953262);
                                }
                                o = o3;
                                coroutine_SUSPENDED = o3;
                                final Result.Error error3 = new Result.Error(s, false, null, 6, null);
                                return error2;
                            }
                            o = o3;
                            coroutine_SUSPENDED = o3;
                            final Result.Success success = new Result.Success(j.a);
                            return error2;
                        }
                        catch (final IOException ex) {
                            o = this;
                        }
                        finally {
                            coroutine_SUSPENDED = this;
                        }
                    }
                    return new Result.Error(((UpdateModNotificationSetting)o).resourceProvider.getString(2131953323), false, null, 6, null);
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final CancellationException ex2) {
                    throw ex2;
                }
                catch (final IOException ex3) {
                    return new Result.Error(((UpdateModNotificationSetting)o).resourceProvider.getString(2131953323), false, null, 6, null);
                }
                finally {
                    goto Label_0289;
                }
            }
        }
    }
    
    public final Object updateRangeSetting(final String s, final String s2, final int n, final c<? super Result<j>> c) {
        return this.executeSafe((l<? super c<? super UpdateResponse>, ?>)new UpdateModNotificationSetting$updateRangeSetting$2(this, s, s2, n, (c)null), c);
    }
    
    public final Object updateRangeToggleSetting(final String s, final String s2, final boolean b, final int n, final c<? super Result<j>> c) {
        return this.executeSafe((l<? super c<? super UpdateResponse>, ?>)new UpdateModNotificationSetting$updateRangeToggleSetting$2(this, s, s2, b, n, (c)null), c);
    }
    
    public final Object updateToggleSetting(final String s, final String s2, final boolean b, final c<? super Result<j>> c) {
        return this.executeSafe((l<? super c<? super UpdateResponse>, ?>)new UpdateModNotificationSetting$updateToggleSetting$2(this, s, s2, b, (c)null), c);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0005" }, d2 = { "Lcom/reddit/domain/modtools/pnsettings/usecase/UpdateModNotificationSetting$Companion;", "", "()V", "THRESHOLD_AUTO", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
    }
}
