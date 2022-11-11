// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.settings.usecase;

import rw1.d;
import java.util.Iterator;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import wu2.w;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import com.reddit.auth.model.Credentials;
import com.reddit.auth.model.Scope;
import com.reddit.auth.model.AccessTokenSuccess;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import tg2.c;
import javax.inject.Inject;
import ah2.f;
import ry.a;
import ry.b;
import com.reddit.session.q;
import ge0.v;

public final class UpdatePasswordUseCase
{
    public final v a;
    public final q b;
    public final ry.b c;
    public final ry.a d;
    
    @Inject
    public UpdatePasswordUseCase(final v a, final q b, final ry.b c, final ry.a d) {
        f.f((Object)a, "myAccountSettingsRepository");
        f.f((Object)b, "sessionManager");
        f.f((Object)c, "authRepository");
        f.f((Object)d, "accountRepository");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final Object a(a a, final c<? super b> c) {
        UpdatePasswordUseCase$execute$1 updatePasswordUseCase$execute$1 = null;
        Label_0048: {
            if (c instanceof UpdatePasswordUseCase$execute$1) {
                updatePasswordUseCase$execute$1 = (UpdatePasswordUseCase$execute$1)c;
                final int label = updatePasswordUseCase$execute$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    updatePasswordUseCase$execute$1.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            updatePasswordUseCase$execute$1 = new UpdatePasswordUseCase$execute$1(this, (c)c);
        }
        Object o = updatePasswordUseCase$execute$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = updatePasswordUseCase$execute$1.label;
        Object o2 = null;
        Label_0152: {
            if (label2 == 0) {
                break Label_0152;
            }
            Label_0128: {
                if (label2 == 1) {
                    break Label_0128;
                }
                Label_0118: {
                    if (label2 != 2) {
                        break Label_0118;
                    }
                    final String s = (String)updatePasswordUseCase$execute$1.L$2;
                    a = (a)updatePasswordUseCase$execute$1.L$1;
                    UpdatePasswordUseCase l$0 = (UpdatePasswordUseCase)updatePasswordUseCase$execute$1.L$0;
                    try {
                        aj2.c.Q0(o);
                        String s2 = s;
                        final String substring;
                        while (true) {
                            final ly.a a2 = (ly.a)o;
                            if (a2 instanceof AccessTokenSuccess) {
                                l$0.d.a(new Credentials(a.a, Scope.g, ((AccessTokenSuccess)a2).b, s2, ""));
                                l$0.b.e(((AccessTokenSuccess)a2).d * 1000, ((AccessTokenSuccess)a2).b);
                                o2 = UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$c.a;
                                return o2;
                            }
                            o2 = UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                            return o2;
                            Label_0466: {
                                s2 = substring;
                            }
                            final Object g;
                            o = g;
                            continue;
                        }
                        String s3 = null;
                    Label_0264:
                        while (true) {
                            Object next = null;
                            v a3;
                            String b;
                            String c2;
                            w w;
                            PostResponseWithErrors postResponseWithErrors = null;
                            String s4;
                            Iterator iterator;
                            String firstErrorMessage;
                            Block_10:Label_0299_Outer:Label_0214_Outer:
                            while (true) {
                                s3 = (String)next;
                                iftrue(Label_0352:)(s3 != null);
                                return UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                                Label_0352: {
                                    iftrue(Label_0367:)(kotlin.text.b.f2((CharSequence)s3, (CharSequence)";", false));
                                }
                                return UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                                aj2.c.Q0(o);
                                a3 = this.a;
                                b = a.b;
                                c2 = a.c;
                                updatePasswordUseCase$execute$1.L$0 = this;
                                updatePasswordUseCase$execute$1.L$1 = a;
                                updatePasswordUseCase$execute$1.label = 1;
                                o = a3.c(b, c2, (c)updatePasswordUseCase$execute$1);
                                iftrue(Label_0212:)(o != coroutine_SUSPENDED);
                                return coroutine_SUSPENDED;
                                Label_0233:
                                postResponseWithErrors = (PostResponseWithErrors)w.b;
                                s4 = null;
                                iftrue(Label_0261:)(postResponseWithErrors == null);
                                break Block_10;
                                Block_12: {
                                    while (true) {
                                        next = s4;
                                        iftrue(Label_0336:)(!iterator.hasNext());
                                        break Block_12;
                                        iftrue(Label_0279:)(firstErrorMessage == null);
                                        return new b.UpdatePasswordUseCase$b$d(firstErrorMessage);
                                        Label_0279:
                                        iterator = w.a.headers().values("set-cookie").iterator();
                                        continue Label_0214_Outer;
                                    }
                                    Label_0212:
                                    l$0 = this;
                                    while (true) {
                                        w = (w)o;
                                        iftrue(Label_0233:)(w.c());
                                        return UpdatePasswordUseCase.b.UpdatePasswordUseCase$b$a.a;
                                        a = (a)updatePasswordUseCase$execute$1.L$1;
                                        l$0 = (UpdatePasswordUseCase)updatePasswordUseCase$execute$1.L$0;
                                        aj2.c.Q0(o);
                                        continue;
                                    }
                                    Label_0261:
                                    firstErrorMessage = null;
                                    continue Label_0264;
                                }
                                next = iterator.next();
                                iftrue(Label_0299:)(!kotlin.text.b.f2((CharSequence)next, (CharSequence)"reddit_session", false));
                                continue Label_0299_Outer;
                            }
                            firstErrorMessage = postResponseWithErrors.getFirstErrorMessage();
                            continue Label_0264;
                        }
                        Label_0367: {
                            substring = s3.substring(0, kotlin.text.b.p2((CharSequence)s3, ";", 0, false, 6));
                        }
                        f.e((Object)substring, "this as java.lang.String\u2026ing(startIndex, endIndex)");
                        final d i = l$0.b.i(a.a);
                        final ry.b c3 = l$0.c;
                        final Scope g2 = Scope.g;
                        updatePasswordUseCase$execute$1.L$0 = l$0;
                        updatePasswordUseCase$execute$1.L$1 = a;
                        updatePasswordUseCase$execute$1.L$2 = substring;
                        updatePasswordUseCase$execute$1.label = 2;
                        final Object g = c3.g(i, g2, substring, (ContinuationImpl)updatePasswordUseCase$execute$1);
                        iftrue(Label_0466:)(g != coroutine_SUSPENDED);
                        return coroutine_SUSPENDED;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    catch (final Exception ex) {
                        bv2.a.a.f((Throwable)ex, "Error during password update", new Object[0]);
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
            f.f((Object)b, "currentPassword");
            f.f((Object)c, "newPassword");
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
            return f.a((Object)this.a, (Object)a.a) && f.a((Object)this.b, (Object)a.b) && f.a((Object)this.c, (Object)a.c);
        }
        
        @Override
        public final int hashCode() {
            return this.c.hashCode() + ag0.a.f(this.b, this.a.hashCode() * 31, 31);
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("Params(username=");
            k.append(this.a);
            k.append(", currentPassword=");
            k.append(this.b);
            k.append(", newPassword=");
            return b.k(k, this.c, ')');
        }
    }
    
    public abstract static class b
    {
    }
}
