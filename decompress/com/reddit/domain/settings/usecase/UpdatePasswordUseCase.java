// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.settings.usecase;

import p1.h;
import java.util.Iterator;
import java.io.IOException;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ku2.w;
import com.reddit.auth.model.Credentials;
import com.reddit.auth.model.Scope;
import com.reddit.auth.model.AccessTokenSuccess;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import javax.inject.Inject;
import ng2.e;
import oy.a;
import oy.b;
import xd0.n;

public final class UpdatePasswordUseCase
{
    public final n a;
    public final com.reddit.session.n b;
    public final oy.b c;
    public final oy.a d;
    
    @Inject
    public UpdatePasswordUseCase(final n a, final com.reddit.session.n b, final oy.b c, final oy.a d) {
        e.f((Object)a, "myAccountSettingsRepository");
        e.f((Object)b, "sessionManager");
        e.f((Object)c, "authRepository");
        e.f((Object)d, "accountRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(a a, final c<? super b> c) {
        UpdatePasswordUseCase$execute$1 updatePasswordUseCase$execute$1 = null;
        Label_0049: {
            if (c instanceof UpdatePasswordUseCase$execute$1) {
                updatePasswordUseCase$execute$1 = (UpdatePasswordUseCase$execute$1)c;
                final int label = updatePasswordUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updatePasswordUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            updatePasswordUseCase$execute$1 = new UpdatePasswordUseCase$execute$1(this, (c)c);
        }
        Object o = updatePasswordUseCase$execute$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = updatePasswordUseCase$execute$1.label;
        Object o2 = null;
        Label_0157: {
            if (label2 == 0) {
                break Label_0157;
            }
            Label_0131: {
                if (label2 == 1) {
                    break Label_0131;
                }
                Label_0121: {
                    if (label2 != 2) {
                        break Label_0121;
                    }
                    String s = (String)updatePasswordUseCase$execute$1.L$2;
                    final a a2 = (a)updatePasswordUseCase$execute$1.L$1;
                    UpdatePasswordUseCase updatePasswordUseCase = (UpdatePasswordUseCase)updatePasswordUseCase$execute$1.L$0;
                    try {
                        cg.d.b4(o);
                        a a3 = a2;
                        Object next = null;
                    Label_0345:
                        while (true) {
                            Iterator iterator = null;
                            String s4 = null;
                            Label_0308: {
                                while (true) {
                                    while (true) {
                                    Label_0273:
                                        while (true) {
                                            while (true) {
                                                final iy.a a4 = (iy.a)o;
                                                if (a4 instanceof AccessTokenSuccess) {
                                                    updatePasswordUseCase.d.a(new Credentials(a3.a, Scope.g, ((AccessTokenSuccess)a4).b, s, ""));
                                                    updatePasswordUseCase.b.e(((AccessTokenSuccess)a4).d * 1000, ((AccessTokenSuccess)a4).b);
                                                    o2 = UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$c.a;
                                                    return o2;
                                                }
                                                o2 = UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                                                return o2;
                                                Label_0270: {
                                                    final String firstErrorMessage = null;
                                                }
                                                break Label_0273;
                                                final w w;
                                                Label_0288:
                                                iterator = w.a.headers().values("set-cookie").iterator();
                                                break Label_0308;
                                                w = (w)o;
                                                iftrue(Label_0242:)(w.c());
                                                return UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                final String firstErrorMessage;
                                                iftrue(Label_0288:)(firstErrorMessage == null);
                                                return new b.UpdatePasswordUseCase$b$d(firstErrorMessage);
                                                final String s2;
                                                Label_0376:
                                                final String substring = s2.substring(0, kotlin.text.b.T0((CharSequence)s2, ";", 0, false, 6));
                                                e.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                                                final UpdatePasswordUseCase l$0;
                                                final dw1.d h = l$0.b.h(a.a);
                                                final oy.b c2 = l$0.c;
                                                final Scope g = Scope.g;
                                                updatePasswordUseCase$execute$1.L$0 = l$0;
                                                updatePasswordUseCase$execute$1.L$1 = a;
                                                updatePasswordUseCase$execute$1.L$2 = substring;
                                                updatePasswordUseCase$execute$1.label = 2;
                                                final Object b = c2.b(h, g, substring, (ContinuationImpl)updatePasswordUseCase$execute$1);
                                                iftrue(Label_0480:)(b != coroutine_SUSPENDED);
                                                return coroutine_SUSPENDED;
                                                Label_0480:
                                                final String s3 = substring;
                                                o = b;
                                                final UpdatePasswordUseCase updatePasswordUseCase2 = l$0;
                                                final a a5 = a;
                                                s = s3;
                                                updatePasswordUseCase = updatePasswordUseCase2;
                                                a3 = a5;
                                                continue;
                                            }
                                            final PostResponseWithErrors postResponseWithErrors;
                                            final String firstErrorMessage = postResponseWithErrors.getFirstErrorMessage();
                                            continue Label_0273;
                                        }
                                        Label_0221: {
                                            final UpdatePasswordUseCase l$0 = this;
                                        }
                                        continue;
                                        a = (a)updatePasswordUseCase$execute$1.L$1;
                                        final UpdatePasswordUseCase l$0 = (UpdatePasswordUseCase)updatePasswordUseCase$execute$1.L$0;
                                        cg.d.b4(o);
                                        continue;
                                    }
                                    cg.d.b4(o);
                                    final n a6 = this.a;
                                    final String b2 = a.b;
                                    final String c3 = a.c;
                                    updatePasswordUseCase$execute$1.L$0 = this;
                                    updatePasswordUseCase$execute$1.L$1 = a;
                                    updatePasswordUseCase$execute$1.label = 1;
                                    o = a6.c(b2, c3, (c<? super w<PostResponseWithErrors>>)updatePasswordUseCase$execute$1);
                                    iftrue(Label_0221:)(o != coroutine_SUSPENDED);
                                    return coroutine_SUSPENDED;
                                    final PostResponseWithErrors postResponseWithErrors;
                                    Label_0242: {
                                        final w w;
                                        postResponseWithErrors = (PostResponseWithErrors)w.b;
                                    }
                                    s4 = null;
                                    iftrue(Label_0270:)(postResponseWithErrors == null);
                                    continue;
                                }
                                next = iterator.next();
                                iftrue(Label_0308:)(!kotlin.text.b.J0((CharSequence)next, (CharSequence)"reddit_session", false));
                                break Label_0345;
                                Label_0361: {
                                    final String s2;
                                    iftrue(Label_0376:)(kotlin.text.b.J0((CharSequence)s2, (CharSequence)";", false));
                                }
                                return UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                            }
                            next = s4;
                            iftrue(Label_0345:)(!iterator.hasNext());
                            continue;
                        }
                        final String s2 = (String)next;
                        iftrue(Label_0361:)(s2 != null);
                        return UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                    }
                    catch (final Exception ex) {
                        pu2.a.a.f((Throwable)ex, "Error during password update", new Object[0]);
                        o2 = UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                    }
                    catch (final IOException ex2) {
                        o2 = UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$b.a;
                    }
                }
            }
        }
        return o2;
    }
    
    public static final class a
    {
        public final String a;
        public final String b;
        public final String c;
        
        public a(final String a, final String b, final String c) {
            e.f((Object)b, "currentPassword");
            e.f((Object)c, "newPassword");
            this.a = a;
            this.b = b;
            this.c = c;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof a)) {
                return false;
            }
            final a a = (a)o;
            return e.a((Object)this.a, (Object)a.a) && e.a((Object)this.b, (Object)a.b) && e.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + aq2.a.e(this.b, this.a.hashCode() * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("Params(username=");
            t.append(this.a);
            t.append(", currentPassword=");
            t.append(this.b);
            t.append(", newPassword=");
            return h.c(t, this.c, ')');
        }
    }
    
    public abstract static class b
    {
    }
}
