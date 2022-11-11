// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.modtools.language.usecase;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.io.IOException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import com.reddit.domain.modtools.language.Language;
import java.util.List;
import com.reddit.domain.model.Result;
import lg2.c;
import javax.inject.Inject;
import sg2.e;
import m20.b;
import com.reddit.domain.modtools.language.LanguageRepository;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H\u0086@\u00f8\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e" }, d2 = { "Lcom/reddit/domain/modtools/language/usecase/LoadActiveLanguagesUseCase;", "", "Lcom/reddit/domain/model/Result;", "", "Lcom/reddit/domain/modtools/language/Language;", "execute", "(Llg2/c;)Ljava/lang/Object;", "Lcom/reddit/domain/modtools/language/LanguageRepository;", "languageRepository", "Lcom/reddit/domain/modtools/language/LanguageRepository;", "Lm20/b;", "resourceProvider", "<init>", "(Lcom/reddit/domain/modtools/language/LanguageRepository;Lm20/b;)V", "domain_release" }, k = 1, mv = { 1, 7, 1 })
public final class LoadActiveLanguagesUseCase
{
    private final LanguageRepository languageRepository;
    private final b resourceProvider;
    
    @Inject
    public LoadActiveLanguagesUseCase(final LanguageRepository languageRepository, final b resourceProvider) {
        e.f((Object)languageRepository, "languageRepository");
        e.f((Object)resourceProvider, "resourceProvider");
        this.languageRepository = languageRepository;
        this.resourceProvider = resourceProvider;
    }
    
    public final Object execute(final c<? super Result<? extends List<Language>>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof LoadActiveLanguagesUseCase$execute$1) {
                final LoadActiveLanguagesUseCase$execute$1 loadActiveLanguagesUseCase$execute$1 = (LoadActiveLanguagesUseCase$execute$1)c;
                final int label = loadActiveLanguagesUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    loadActiveLanguagesUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    o = loadActiveLanguagesUseCase$execute$1;
                    break Label_0047;
                }
            }
            o = new LoadActiveLanguagesUseCase$execute$1(this, (c)c);
        }
        Object o2 = ((LoadActiveLanguagesUseCase$execute$1)o).result;
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LoadActiveLanguagesUseCase$execute$1)o).label;
        boolean b = true;
        Label_0107: {
            if (label2 == 0) {
                break Label_0107;
            }
            Label_0097: {
                if (label2 != 1) {
                    break Label_0097;
                }
                Object o4;
                Object o3 = coroutine_SUSPENDED = (o4 = ((LoadActiveLanguagesUseCase$execute$1)o).L$0);
                try {
                    yd.b.k0(o2);
                    Label_0145: {
                        break Label_0145;
                        yd.b.k0(o2);
                        try {
                            o2 = this.languageRepository;
                            ((LoadActiveLanguagesUseCase$execute$1)o).L$0 = this;
                            ((LoadActiveLanguagesUseCase$execute$1)o).label = 1;
                            o2 = ((LanguageRepository)o2).getActiveLanguages((c<? super Result<? extends List<Language>>>)o);
                            if (o2 == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                            o3 = this;
                            o4 = o3;
                            coroutine_SUSPENDED = o3;
                            final Result result = (Result)(o2 = o2);
                            o4 = o3;
                            coroutine_SUSPENDED = o3;
                            if (!(result instanceof Result.Error)) {
                                return o2;
                            }
                            o4 = o3;
                            coroutine_SUSPENDED = o3;
                            if (((Result.Error)result).getError().length() != 0) {
                                b = false;
                            }
                            o2 = result;
                            if (b) {
                                o4 = o3;
                                coroutine_SUSPENDED = o3;
                                o2 = Result.Error.copy$default((Result.Error<Object>)result, ((LoadActiveLanguagesUseCase)o3).resourceProvider.getString(2131953262), false, null, 6, null);
                                return o2;
                            }
                            return o2;
                        }
                        catch (final IOException ex) {
                            o4 = this;
                        }
                        finally {
                            coroutine_SUSPENDED = this;
                        }
                    }
                    o2 = new Result.Error(((LoadActiveLanguagesUseCase)o4).resourceProvider.getString(2131953323), false, null, 6, null);
                    return o2;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                catch (final CancellationException ex2) {
                    throw ex2;
                }
                catch (final IOException ex3) {
                    return new Result.Error(((LoadActiveLanguagesUseCase)o4).resourceProvider.getString(2131953323), false, null, 6, null);
                }
                finally {
                    goto Label_0246;
                }
            }
        }
    }
}
