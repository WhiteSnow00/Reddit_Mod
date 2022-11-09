// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.foundation.text;

import z0.d$a$a;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import o0.n;
import kotlinx.coroutines.CoroutineStart;
import kotlin.coroutines.CoroutineContext;
import mj2.g;
import n0.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import mj2.b0;
import z0.e1;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import z1.v;
import o0.m;
import z0.p;
import z0.h0;
import a80.a;
import a2.b;
import z0.s;
import kotlin.coroutines.EmptyCoroutineContext;
import z0.d$a;
import ah2.f;
import n1.c;
import zg2.l;
import o0.j;
import kotlin.Metadata;
import j1.d;
import zg2.q;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {}, d1 = { "\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002" }, d2 = { "Lj1/d;", "invoke", "(Lj1/d;Lz0/d;I)Lj1/d;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
final class TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1 extends Lambda implements q<d, z0.d, Integer, d>
{
    public final /* synthetic */ j $interactionSource;
    public final /* synthetic */ l<c, pg2.j> $onTap;
    
    public TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1(final l<? super c, pg2.j> $onTap, final j $interactionSource) {
        this.$onTap = (l<c, pg2.j>)$onTap;
        this.$interactionSource = $interactionSource;
        super(3);
    }
    
    public final d invoke(d b, final z0.d d, final int n) {
        f.f((Object)b, "$this$composed");
        d.A(-102778667);
        d.A(773894976);
        d.A(-492369756);
        final Object b2 = d.B();
        final d$a$a a = d$a.a;
        Object p3 = b2;
        if (b2 == a) {
            p3 = b.p(s.i(EmptyCoroutineContext.INSTANCE, d), d);
        }
        d.I();
        final b0 f = ((z0.l)p3).f;
        d.I();
        d.A(-492369756);
        Object o;
        if ((o = d.B()) == a) {
            o = a80.a.n0(null);
            d.v(o);
        }
        d.I();
        final h0 h0 = (h0)o;
        final h0 v0 = a80.a.v0(this.$onTap, d);
        final j $interactionSource = this.$interactionSource;
        s.c($interactionSource, (l)new l<z0.q, p>() {
            public final p invoke(final z0.q q) {
                ah2.f.f((Object)q, "$this$DisposableEffect");
                return (p)new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$a((h0)h0, $interactionSource);
            }
        }, d);
        final d.a f2 = j1.d.a.f;
        final j $interactionSource2 = this.$interactionSource;
        b = SuspendingPointerInputFilterKt.b((d)f2, (Object)$interactionSource2, (zg2.p)new zg2.p<v, tg2.c<? super pg2.j>, Object>(v0) {
            public final /* synthetic */ j $interactionSource;
            public final /* synthetic */ e1<l<c, pg2.j>> $onTapState;
            public final /* synthetic */ h0<m> $pressedInteraction;
            public final /* synthetic */ b0 $scope;
            private /* synthetic */ Object L$0;
            public int label;
            
            public final tg2.c<pg2.j> create(final Object l$0, final tg2.c<?> c) {
                final zg2.p<v, tg2.c<? super pg2.j>, Object> p2 = (zg2.p<v, tg2.c<? super pg2.j>, Object>)new zg2.p<v, tg2.c<? super pg2.j>, Object>() {
                    public final /* synthetic */ j $interactionSource = this.$interactionSource;
                    public final /* synthetic */ e1<l<c, pg2.j>> $onTapState = this.$onTapState;
                    public final /* synthetic */ h0<m> $pressedInteraction = this.$pressedInteraction;
                    public final /* synthetic */ b0 $scope = this.$scope;
                    private /* synthetic */ Object L$0;
                    public int label;
                };
                p2.L$0 = l$0;
                return (tg2.c<pg2.j>)p2;
            }
            
            public final Object invoke(final v v, final tg2.c<? super pg2.j> c) {
                return ((TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2)this.create(v, c)).invokeSuspend(pg2.j.a);
            }
            
            public final Object invokeSuspend(final Object o) {
                final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                final int label = this.label;
                if (label != 0) {
                    if (label != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aj2.c.Q0(o);
                }
                else {
                    aj2.c.Q0(o);
                    final v v = (v)this.L$0;
                    final q<h, c, tg2.c<? super pg2.j>, Object> q = (q<h, c, tg2.c<? super pg2.j>, Object>)new q<h, c, tg2.c<? super pg2.j>, Object>(null) {
                        public final /* synthetic */ j $interactionSource;
                        public final /* synthetic */ h0<m> $pressedInteraction;
                        public final /* synthetic */ b0 $scope;
                        public /* synthetic */ long J$0;
                        private /* synthetic */ Object L$0;
                        public int label;
                        
                        public final Object invoke-d-4ec7I(final h l$0, final long j$0, final tg2.c<? super pg2.j> c) {
                            final q<h, c, tg2.c<? super pg2.j>, Object> q = (q<h, c, tg2.c<? super pg2.j>, Object>)new q<h, c, tg2.c<? super pg2.j>, Object>(c) {
                                public final /* synthetic */ j $interactionSource = this.$interactionSource;
                                public final /* synthetic */ h0<m> $pressedInteraction = this.$pressedInteraction;
                                public final /* synthetic */ b0 $scope = this.$scope;
                                public /* synthetic */ long J$0;
                                private /* synthetic */ Object L$0;
                                public int label;
                            };
                            q.L$0 = l$0;
                            q.J$0 = j$0;
                            return q.invokeSuspend(pg2.j.a);
                        }
                        
                        public final Object invokeSuspend(Object j0) {
                            final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                            final int label = this.label;
                            if (label != 0) {
                                if (label != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                aj2.c.Q0(j0);
                            }
                            else {
                                aj2.c.Q0(j0);
                                final h h = (h)this.L$0;
                                g.i(this.$scope, (CoroutineContext)null, (CoroutineStart)null, (zg2.p)new zg2.p<b0, tg2.c<? super pg2.j>, Object>(null) {
                                    public final /* synthetic */ j $interactionSource;
                                    public final /* synthetic */ long $it;
                                    public final /* synthetic */ h0<m> $pressedInteraction;
                                    public Object L$0;
                                    public int label;
                                    
                                    public final tg2.c<pg2.j> create(final Object o, final tg2.c<?> c) {
                                        return (tg2.c<pg2.j>)new zg2.p<b0, tg2.c<? super pg2.j>, Object>(c) {
                                            public final /* synthetic */ j $interactionSource = this.$interactionSource;
                                            public final /* synthetic */ long $it = this.$it;
                                            public final /* synthetic */ h0<m> $pressedInteraction = this.$pressedInteraction;
                                            public Object L$0;
                                            public int label;
                                        };
                                    }
                                    
                                    public final Object invoke(final b0 b0, final tg2.c<? super pg2.j> c) {
                                        return ((TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1)this.create(b0, c)).invokeSuspend(pg2.j.a);
                                    }
                                    
                                    public final Object invokeSuspend(Object value) {
                                        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        final int label = this.label;
                                        Label_0218: {
                                            Label_0161: {
                                                h0<m> h2 = null;
                                                Label_0153: {
                                                    h0<m> $pressedInteraction;
                                                    if (label != 0) {
                                                        if (label != 1) {
                                                            if (label == 2) {
                                                                final m m = (m)this.L$0;
                                                                aj2.c.Q0(value);
                                                                value = m;
                                                                break Label_0218;
                                                            }
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        else {
                                                            final h0 h0 = (h0)this.L$0;
                                                            aj2.c.Q0(value);
                                                            $pressedInteraction = h0;
                                                        }
                                                    }
                                                    else {
                                                        aj2.c.Q0(value);
                                                        final m i = this.$pressedInteraction.getValue();
                                                        if (i == null) {
                                                            break Label_0161;
                                                        }
                                                        final j $interactionSource = this.$interactionSource;
                                                        $pressedInteraction = this.$pressedInteraction;
                                                        final o0.l l = new o0.l(i);
                                                        h2 = $pressedInteraction;
                                                        if ($interactionSource == null) {
                                                            break Label_0153;
                                                        }
                                                        this.L$0 = $pressedInteraction;
                                                        this.label = 1;
                                                        if ($interactionSource.a((o0.h)l, (tg2.c<? super pg2.j>)this) == coroutine_SUSPENDED) {
                                                            return coroutine_SUSPENDED;
                                                        }
                                                    }
                                                    h2 = $pressedInteraction;
                                                }
                                                h2.setValue(null);
                                            }
                                            final Object l$0 = new m(this.$it);
                                            final j $interactionSource2 = this.$interactionSource;
                                            value = l$0;
                                            if ($interactionSource2 != null) {
                                                this.L$0 = l$0;
                                                this.label = 2;
                                                if ($interactionSource2.a((o0.h)l$0, (tg2.c<? super pg2.j>)this) == coroutine_SUSPENDED) {
                                                    return coroutine_SUSPENDED;
                                                }
                                                value = l$0;
                                            }
                                        }
                                        this.$pressedInteraction.setValue((m)value);
                                        return pg2.j.a;
                                    }
                                }, 3);
                                this.label = 1;
                                if ((j0 = h.j0((tg2.c<? super Boolean>)this)) == coroutine_SUSPENDED) {
                                    return coroutine_SUSPENDED;
                                }
                            }
                            g.i(this.$scope, (CoroutineContext)null, (CoroutineStart)null, (zg2.p)new zg2.p<b0, tg2.c<? super pg2.j>, Object>(null) {
                                public final /* synthetic */ j $interactionSource;
                                public final /* synthetic */ h0<m> $pressedInteraction;
                                public final /* synthetic */ boolean $success;
                                public Object L$0;
                                public int label;
                                
                                public final tg2.c<pg2.j> create(final Object o, final tg2.c<?> c) {
                                    return (tg2.c<pg2.j>)new zg2.p<b0, tg2.c<? super pg2.j>, Object>(c) {
                                        public final /* synthetic */ j $interactionSource = this.$interactionSource;
                                        public final /* synthetic */ h0<m> $pressedInteraction = this.$pressedInteraction;
                                        public final /* synthetic */ boolean $success = this.$success;
                                        public Object L$0;
                                        public int label;
                                    };
                                }
                                
                                public final Object invoke(final b0 b0, final tg2.c<? super pg2.j> c) {
                                    return ((TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2)this.create(b0, c)).invokeSuspend(pg2.j.a);
                                }
                                
                                public final Object invokeSuspend(final Object o) {
                                    final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
                                    final int label = this.label;
                                    h0<m> h2 = null;
                                    Label_0154: {
                                        h0<m> $pressedInteraction;
                                        if (label != 0) {
                                            if (label != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            final h0 h0 = (h0)this.L$0;
                                            aj2.c.Q0(o);
                                            $pressedInteraction = h0;
                                        }
                                        else {
                                            aj2.c.Q0(o);
                                            final m m = this.$pressedInteraction.getValue();
                                            if (m == null) {
                                                return pg2.j.a;
                                            }
                                            final boolean $success = this.$success;
                                            final j $interactionSource = this.$interactionSource;
                                            $pressedInteraction = this.$pressedInteraction;
                                            Object o2;
                                            if ($success) {
                                                o2 = new n(m);
                                            }
                                            else {
                                                o2 = new o0.l(m);
                                            }
                                            h2 = $pressedInteraction;
                                            if ($interactionSource == null) {
                                                break Label_0154;
                                            }
                                            this.L$0 = $pressedInteraction;
                                            this.label = 1;
                                            if ($interactionSource.a((o0.h)o2, (tg2.c<? super pg2.j>)this) == coroutine_SUSPENDED) {
                                                return coroutine_SUSPENDED;
                                            }
                                        }
                                        h2 = $pressedInteraction;
                                    }
                                    h2.setValue(null);
                                    return pg2.j.a;
                                }
                            }, 3);
                            return pg2.j.a;
                        }
                    };
                    final l<c, pg2.j> l = (l<c, pg2.j>)new l<c, pg2.j>() {
                        public final /* synthetic */ e1<l<c, pg2.j>> $onTapState = TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2.this.$onTapState;
                        
                        public final void invoke-k-4lQ0M(final long n) {
                            this.$onTapState.getValue().invoke((Object)new c(n));
                        }
                    };
                    this.label = 1;
                    if (TapGestureDetectorKt.d(v, (q<? super h, ? super c, ? super tg2.c<? super pg2.j>, ?>)q, (l<? super c, pg2.j>)l, (tg2.c<? super pg2.j>)this) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                return pg2.j.a;
            }
        });
        d.I();
        return b;
    }
}
