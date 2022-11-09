// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.languageselection;

import pg2.j;
import java.util.List;
import zg2.p;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.Result;
import javax.inject.Inject;
import pg2.f;
import android.content.Context;
import e20.a;
import q20.b;
import of0.t1;
import bc0.c;

public final class LanguageSelectionUseCaseImpl implements c
{
    public final t1 a;
    public final b b;
    public final a c;
    public final ContentLanguagesDataSource d;
    public final bt0.a e;
    public final zg2.a<Context> f;
    public final f g;
    
    @Inject
    public LanguageSelectionUseCaseImpl(final t1 a, final b b, final a c, final ContentLanguagesDataSource d, final bt0.a e, final zg2.a<? extends Context> f) {
        ah2.f.f((Object)a, "userLocationUseCase");
        ah2.f.f((Object)b, "resourceProvider");
        ah2.f.f((Object)c, "dispatcherProvider");
        ah2.f.f((Object)d, "dataSource");
        ah2.f.f((Object)e, "appSettings");
        ah2.f.f((Object)f, "getContext");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = (zg2.a<Context>)f;
        this.g = kotlin.a.b((zg2.a)new LanguageSelectionUseCaseImpl$userLanguages$2(this));
    }
    
    public final Object a(final tg2.c<? super Result<bc0.b>> c) {
        Object o = null;
        Label_0047: {
            if (c instanceof LanguageSelectionUseCaseImpl$execute$1) {
                final LanguageSelectionUseCaseImpl$execute$1 languageSelectionUseCaseImpl$execute$1 = (LanguageSelectionUseCaseImpl$execute$1)c;
                final int label = languageSelectionUseCaseImpl$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    languageSelectionUseCaseImpl$execute$1.label = label + Integer.MIN_VALUE;
                    o = languageSelectionUseCaseImpl$execute$1;
                    break Label_0047;
                }
            }
            o = new LanguageSelectionUseCaseImpl$execute$1(this, (tg2.c)c);
        }
        final Object result = ((LanguageSelectionUseCaseImpl$execute$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LanguageSelectionUseCaseImpl$execute$1)o).label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final uj2.a c2 = this.c.c();
            final LanguageSelectionUseCaseImpl$execute$2 languageSelectionUseCaseImpl$execute$2 = new LanguageSelectionUseCaseImpl$execute$2(this, (tg2.c)null);
            ((LanguageSelectionUseCaseImpl$execute$1)o).label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (p)languageSelectionUseCaseImpl$execute$2, (tg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((Result)l).unbox-impl();
    }
    
    public final Object b(final List<String> list, final tg2.c<? super Result<j>> c) {
        Object o = null;
        Label_0050: {
            if (c instanceof LanguageSelectionUseCaseImpl$send$1) {
                final LanguageSelectionUseCaseImpl$send$1 languageSelectionUseCaseImpl$send$1 = (LanguageSelectionUseCaseImpl$send$1)c;
                final int label = languageSelectionUseCaseImpl$send$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    languageSelectionUseCaseImpl$send$1.label = label + Integer.MIN_VALUE;
                    o = languageSelectionUseCaseImpl$send$1;
                    break Label_0050;
                }
            }
            o = new LanguageSelectionUseCaseImpl$send$1(this, (tg2.c)c);
        }
        final Object result = ((LanguageSelectionUseCaseImpl$send$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((LanguageSelectionUseCaseImpl$send$1)o).label;
        Object l;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aj2.c.Q0(result);
            l = result;
        }
        else {
            aj2.c.Q0(result);
            final uj2.a c2 = this.c.c();
            final LanguageSelectionUseCaseImpl$send$2 languageSelectionUseCaseImpl$send$2 = new LanguageSelectionUseCaseImpl$send$2(this, (List)list, (tg2.c)null);
            ((LanguageSelectionUseCaseImpl$send$1)o).label = 1;
            if ((l = mj2.g.l((CoroutineContext)c2, (p)languageSelectionUseCaseImpl$send$2, (tg2.c)o)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        return ((Result)l).unbox-impl();
    }
}
