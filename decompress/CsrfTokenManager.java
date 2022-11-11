// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.snoovatar.repository.util;

import okhttp3.ResponseBody;
import java.io.Serializable;
import a70.b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import wu2.w;
import zg2.p;
import ah2.f;
import kotlinx.coroutines.flow.StateFlowImpl;
import jw0.a;
import tg2.c;
import zg2.l;

public final class CsrfTokenManager
{
    public final l<c<? super String>, Object> a;
    public final jw0.a b;
    public final StateFlowImpl c;
    
    public CsrfTokenManager(final l<? super c<? super String>, ?> a, final jw0.a b) {
        f.f((Object)b, "redditLogger");
        this.a = (l<c<? super String>, Object>)a;
        this.b = b;
        this.c = o72.f.f((Object)"");
    }
    
    public final <T> Object a(final p<? super String, ? super c<? super w<T>>, ?> l$1, jw0.a l$2, final c<? super a<T>> c) {
        CsrfTokenManager$ensureValidToken.CsrfTokenManager$ensureValidToken$1 csrfTokenManager$ensureValidToken$1 = null;
        Label_0052: {
            if (c instanceof CsrfTokenManager$ensureValidToken.CsrfTokenManager$ensureValidToken$1) {
                csrfTokenManager$ensureValidToken$1 = (CsrfTokenManager$ensureValidToken.CsrfTokenManager$ensureValidToken$1)c;
                final int label = csrfTokenManager$ensureValidToken$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    csrfTokenManager$ensureValidToken$1.label = label + Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            csrfTokenManager$ensureValidToken$1 = new CsrfTokenManager$ensureValidToken.CsrfTokenManager$ensureValidToken$1(this, (c)c);
        }
        Object o = csrfTokenManager$ensureValidToken$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = csrfTokenManager$ensureValidToken$1.label;
        boolean b = false;
        Label_0412: {
            p l$3 = null;
            CsrfTokenManager l$4 = null;
            Label_0362: {
                Label_0321: {
                    if (label2 != 0) {
                        if (label2 != 1) {
                            if (label2 == 2) {
                                l$2 = (jw0.a)csrfTokenManager$ensureValidToken$1.L$2;
                                l$3 = (p)csrfTokenManager$ensureValidToken$1.L$1;
                                l$4 = (CsrfTokenManager)csrfTokenManager$ensureValidToken$1.L$0;
                                aj2.c.Q0(o);
                                break Label_0362;
                            }
                            if (label2 == 3) {
                                l$2 = (jw0.a)csrfTokenManager$ensureValidToken$1.L$0;
                                aj2.c.Q0(o);
                                break Label_0412;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        else {
                            l$2 = (jw0.a)csrfTokenManager$ensureValidToken$1.L$2;
                            l$3 = (p)csrfTokenManager$ensureValidToken$1.L$1;
                            l$4 = (CsrfTokenManager)csrfTokenManager$ensureValidToken$1.L$0;
                            aj2.c.Q0(o);
                        }
                    }
                    else {
                        aj2.c.Q0(o);
                        final String s = (String)this.c.getValue();
                        if (s.length() > 0) {
                            b = true;
                        }
                        if (!b) {
                            l$3 = l$1;
                            l$4 = this;
                            break Label_0321;
                        }
                        csrfTokenManager$ensureValidToken$1.L$0 = this;
                        csrfTokenManager$ensureValidToken$1.L$1 = l$1;
                        csrfTokenManager$ensureValidToken$1.L$2 = l$2;
                        csrfTokenManager$ensureValidToken$1.label = 1;
                        o = this.b(s, l$1, (c)csrfTokenManager$ensureValidToken$1);
                        if (o == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        l$3 = l$1;
                        l$4 = this;
                    }
                    final Pair pair = (Pair)o;
                    final Object component1 = pair.component1();
                    final b b2 = (b)pair.component2();
                    if (!(b2 instanceof a70.a)) {
                        return new a(component1, b2);
                    }
                }
                csrfTokenManager$ensureValidToken$1.L$0 = l$4;
                csrfTokenManager$ensureValidToken$1.L$1 = l$3;
                csrfTokenManager$ensureValidToken$1.L$2 = l$2;
                csrfTokenManager$ensureValidToken$1.label = 2;
                o = l$4.c((c<? super String>)csrfTokenManager$ensureValidToken$1);
                if (o == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            final String s2 = (String)o;
            csrfTokenManager$ensureValidToken$1.L$0 = l$2;
            csrfTokenManager$ensureValidToken$1.L$1 = null;
            csrfTokenManager$ensureValidToken$1.L$2 = null;
            csrfTokenManager$ensureValidToken$1.label = 3;
            if ((o = l$4.b(s2, l$3, (c)csrfTokenManager$ensureValidToken$1)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Pair pair2 = (Pair)o;
        final Object component2 = pair2.component1();
        final b b3 = (b)pair2.component2();
        if (b3 instanceof a70.a) {
            l$2.c((Throwable)new RuntimeException("New CSRF token is incorrect (or resolving errors failed)."));
            final a70.a a = (a70.a)b3;
            return new a(component2, new a70.c(a.a, a.b));
        }
        return new a(component2, b3);
    }
    
    public final Serializable b(String string, final p p3, final c c) {
        CsrfTokenManager$executeAndProcessError$1 csrfTokenManager$executeAndProcessError$2 = null;
        Label_0054: {
            if (c instanceof CsrfTokenManager$executeAndProcessError$1) {
                final CsrfTokenManager$executeAndProcessError$1 csrfTokenManager$executeAndProcessError$1 = (CsrfTokenManager$executeAndProcessError$1)c;
                final int label = csrfTokenManager$executeAndProcessError$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    csrfTokenManager$executeAndProcessError$1.label = label + Integer.MIN_VALUE;
                    csrfTokenManager$executeAndProcessError$2 = csrfTokenManager$executeAndProcessError$1;
                    break Label_0054;
                }
            }
            csrfTokenManager$executeAndProcessError$2 = new CsrfTokenManager$executeAndProcessError$1(this, (c<? super CsrfTokenManager$executeAndProcessError$1>)c);
        }
        final Object result = csrfTokenManager$executeAndProcessError$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = csrfTokenManager$executeAndProcessError$2.label;
        final boolean b = true;
        CsrfTokenManager csrfTokenManager;
        Object invoke;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            csrfTokenManager = (CsrfTokenManager)csrfTokenManager$executeAndProcessError$2.L$0;
            aj2.c.Q0(result);
            invoke = result;
        }
        else {
            aj2.c.Q0(result);
            csrfTokenManager$executeAndProcessError$2.L$0 = this;
            csrfTokenManager$executeAndProcessError$2.label = 1;
            invoke = p3.invoke((Object)string, (Object)csrfTokenManager$executeAndProcessError$2);
            if (invoke == coroutine_SUSPENDED) {
                return (Serializable)coroutine_SUSPENDED;
            }
            csrfTokenManager = this;
        }
        final w w = (w)invoke;
        final Object b2 = w.b;
        csrfTokenManager.getClass();
        final boolean c2 = w.c();
        final Object o = null;
        string = null;
        Object c3;
        if (c2) {
            c3 = o;
        }
        else {
            final int a = w.a();
            final ResponseBody c4 = w.c;
            if (c4 != null) {
                string = c4.string();
            }
            if (a == 400) {
                int n = b ? 1 : 0;
                if (string != null) {
                    if (string.length() == 0) {
                        n = (b ? 1 : 0);
                    }
                    else {
                        n = 0;
                    }
                }
                if (n != 0) {
                    c3 = a70.a.c;
                    return (Serializable)new Pair(b2, c3);
                }
            }
            c3 = new a70.c(a, string);
        }
        return (Serializable)new Pair(b2, c3);
    }
    
    public final Object c(final c<? super String> c) {
        CsrfTokenManager$fetchNewCsrfToken.CsrfTokenManager$fetchNewCsrfToken$1 csrfTokenManager$fetchNewCsrfToken$2 = null;
        Label_0047: {
            if (c instanceof CsrfTokenManager$fetchNewCsrfToken.CsrfTokenManager$fetchNewCsrfToken$1) {
                final CsrfTokenManager$fetchNewCsrfToken.CsrfTokenManager$fetchNewCsrfToken$1 csrfTokenManager$fetchNewCsrfToken$1 = (CsrfTokenManager$fetchNewCsrfToken.CsrfTokenManager$fetchNewCsrfToken$1)c;
                final int label = csrfTokenManager$fetchNewCsrfToken$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    csrfTokenManager$fetchNewCsrfToken$1.label = label + Integer.MIN_VALUE;
                    csrfTokenManager$fetchNewCsrfToken$2 = csrfTokenManager$fetchNewCsrfToken$1;
                    break Label_0047;
                }
            }
            csrfTokenManager$fetchNewCsrfToken$2 = new CsrfTokenManager$fetchNewCsrfToken.CsrfTokenManager$fetchNewCsrfToken$1(this, (c)c);
        }
        Object o = csrfTokenManager$fetchNewCsrfToken$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = csrfTokenManager$fetchNewCsrfToken$2.label;
        CsrfTokenManager csrfTokenManager;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            csrfTokenManager = (CsrfTokenManager)csrfTokenManager$fetchNewCsrfToken$2.L$0;
            aj2.c.Q0(o);
        }
        else {
            aj2.c.Q0(o);
            final l<c<? super String>, Object> a = this.a;
            csrfTokenManager$fetchNewCsrfToken$2.L$0 = this;
            csrfTokenManager$fetchNewCsrfToken$2.label = 1;
            o = a.invoke((Object)csrfTokenManager$fetchNewCsrfToken$2);
            if (o == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            csrfTokenManager = this;
        }
        final String value = (String)o;
        csrfTokenManager.c.setValue((Object)value);
        return value;
    }
    
    public static final class a<T>
    {
        public final T a;
        public final b b;
        
        public a(final T a, final b b) {
            this.a = a;
            this.b = b;
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
            return f.a((Object)this.a, (Object)a.a) && f.a((Object)this.b, (Object)a.b);
        }
        
        @Override
        public final int hashCode() {
            final T a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = a.hashCode();
            }
            final b b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder k = a.k("Response(body=");
            k.append(this.a);
            k.append(", error=");
            k.append(this.b);
            k.append(')');
            return k.toString();
        }
    }
}
