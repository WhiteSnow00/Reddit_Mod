// 
// Decompiled by Procyon v0.6.0
// 

package kotlinx.coroutines.flow;

import cj2.l;
import cj2.s;
import mg2.p;
import java.util.NoSuchElementException;
import cj2.f;
import xd.a;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import cg.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import gg2.c;
import cj2.e;

public final class FlowKt__ReduceKt
{
    public static final <T> Object a(e<? extends T> o, c<? super T> l$0) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1 = null;
        Label_0044: {
            if (l$0 instanceof FlowKt__ReduceKt$first$1) {
                flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1)l$0;
                final int label = flowKt__ReduceKt$first$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$first$1.label = label + Integer.MIN_VALUE;
                    break Label_0044;
                }
            }
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1((c)l$0);
        }
        final Object result = flowKt__ReduceKt$first$1.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__ReduceKt$first$1.label;
        Label_0191: {
            Label_0183: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$0 = flowKt__ReduceKt$first$1.L$1;
                        o = flowKt__ReduceKt$first$1.L$0;
                        try {
                            d.b4(result);
                            break Label_0191;
                        }
                        catch (final AbortFlowException ex) {
                            break Label_0183;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b4(result);
                l$0 = new Ref$ObjectRef();
                ((Ref$ObjectRef)l$0).element = a.l;
                final FlowKt__ReduceKt$a l$2 = new FlowKt__ReduceKt$a((Ref$ObjectRef)l$0);
                try {
                    flowKt__ReduceKt$first$1.L$0 = l$0;
                    flowKt__ReduceKt$first$1.L$1 = l$2;
                    flowKt__ReduceKt$first$1.label = 1;
                    if (((e)o).a((f)l$2, (c)flowKt__ReduceKt$first$1) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    o = l$0;
                    break Label_0191;
                }
                catch (final AbortFlowException ex) {
                    o = l$0;
                    l$0 = l$2;
                }
            }
            final AbortFlowException ex;
            if (ex.owner != l$0) {
                throw ex;
            }
        }
        final Object element = ((Ref$ObjectRef)o).element;
        if (element != a.l) {
            return element;
        }
        throw new NoSuchElementException("Expected at least one element");
    }
    
    public static final <T> Object b(e<? extends T> o, p<? super T, ? super c<? super Boolean>, ?> l$0, c<? super T> l$2) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3 = null;
        Label_0048: {
            if (l$2 instanceof FlowKt__ReduceKt$first$3) {
                flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3)l$2;
                final int label = flowKt__ReduceKt$first$3.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$first$3.label = label + Integer.MIN_VALUE;
                    break Label_0048;
                }
            }
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3((c)l$2);
        }
        final Object result = flowKt__ReduceKt$first$3.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__ReduceKt$first$3.label;
        Label_0221: {
            Label_0212: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        l$2 = flowKt__ReduceKt$first$3.L$2;
                        o = flowKt__ReduceKt$first$3.L$1;
                        l$0 = (p)flowKt__ReduceKt$first$3.L$0;
                        try {
                            d.b4(result);
                            break Label_0221;
                        }
                        catch (final AbortFlowException ex) {
                            break Label_0212;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b4(result);
                l$2 = new Ref$ObjectRef();
                ((Ref$ObjectRef)l$2).element = a.l;
                final FlowKt__ReduceKt$first$$inlined$collectWhile$2 l$3 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(l$0, (Ref$ObjectRef)l$2);
                try {
                    flowKt__ReduceKt$first$3.L$0 = l$0;
                    flowKt__ReduceKt$first$3.L$1 = l$2;
                    flowKt__ReduceKt$first$3.L$2 = l$3;
                    flowKt__ReduceKt$first$3.label = 1;
                    final Object a = ((e)o).a((f)l$3, (c)flowKt__ReduceKt$first$3);
                    o = l$2;
                    if (a == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    break Label_0221;
                }
                catch (final AbortFlowException ex) {
                    o = l$2;
                    l$2 = l$3;
                }
            }
            final AbortFlowException ex;
            if (ex.owner != l$2) {
                throw ex;
            }
        }
        final Object element = ((Ref$ObjectRef)o).element;
        if (element != a.l) {
            return element;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected at least one element matching the predicate ");
        sb.append(l$0);
        throw new NoSuchElementException(sb.toString());
    }
    
    public static final <T> Object c(e<? extends T> o, final c<? super T> c) {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$2 = null;
        Label_0046: {
            if (c instanceof FlowKt__ReduceKt$firstOrNull$1) {
                final FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1)c;
                final int label = flowKt__ReduceKt$firstOrNull$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$firstOrNull$1.label = label + Integer.MIN_VALUE;
                    flowKt__ReduceKt$firstOrNull$2 = flowKt__ReduceKt$firstOrNull$1;
                    break Label_0046;
                }
            }
            flowKt__ReduceKt$firstOrNull$2 = new FlowKt__ReduceKt$firstOrNull$1((c)c);
        }
        final Object result = flowKt__ReduceKt$firstOrNull$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = flowKt__ReduceKt$firstOrNull$2.label;
        Object o2 = null;
        Label_0178: {
            if (label2 != 0) {
                if (label2 == 1) {
                    o2 = flowKt__ReduceKt$firstOrNull$2.L$1;
                    o = flowKt__ReduceKt$firstOrNull$2.L$0;
                    try {
                        d.b4(result);
                        return ((Ref$ObjectRef)o).element;
                    }
                    catch (final AbortFlowException ex) {
                        break Label_0178;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            final Ref$ObjectRef l$0 = new Ref$ObjectRef();
            final FlowKt__ReduceKt$b l$2 = new FlowKt__ReduceKt$b(l$0);
            try {
                flowKt__ReduceKt$firstOrNull$2.L$0 = l$0;
                flowKt__ReduceKt$firstOrNull$2.L$1 = l$2;
                flowKt__ReduceKt$firstOrNull$2.label = 1;
                if (((e)o).a((f)l$2, (c)flowKt__ReduceKt$firstOrNull$2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                o = l$0;
                return ((Ref$ObjectRef)o).element;
            }
            catch (final AbortFlowException ex) {
                o = l$0;
                o2 = l$2;
            }
        }
        final AbortFlowException ex;
        if (ex.owner != o2) {
            throw ex;
        }
        return ((Ref$ObjectRef)o).element;
    }
    
    public static final Object d(s o, final p p3, final c c) {
        Object o2 = null;
        Label_0050: {
            if (c instanceof FlowKt__ReduceKt$firstOrNull$3) {
                final FlowKt__ReduceKt$firstOrNull$3 flowKt__ReduceKt$firstOrNull$3 = (FlowKt__ReduceKt$firstOrNull$3)c;
                final int label = flowKt__ReduceKt$firstOrNull$3.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$firstOrNull$3.label = label + Integer.MIN_VALUE;
                    o2 = flowKt__ReduceKt$firstOrNull$3;
                    break Label_0050;
                }
            }
            o2 = new FlowKt__ReduceKt$firstOrNull$3(c);
        }
        final Object result = ((FlowKt__ReduceKt$firstOrNull$3)o2).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FlowKt__ReduceKt$firstOrNull$3)o2).label;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = null;
        Label_0190: {
            if (label2 != 0) {
                if (label2 == 1) {
                    final FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2)((FlowKt__ReduceKt$firstOrNull$3)o2).L$1;
                    o = ((FlowKt__ReduceKt$firstOrNull$3)o2).L$0;
                    try {
                        d.b4(result);
                        return ((Ref$ObjectRef)o).element;
                    }
                    catch (final AbortFlowException ex) {
                        flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                        break Label_0190;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b4(result);
            final Ref$ObjectRef l$0 = new Ref$ObjectRef();
            final FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 l$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(p3, l$0);
            try {
                ((FlowKt__ReduceKt$firstOrNull$3)o2).L$0 = l$0;
                ((FlowKt__ReduceKt$firstOrNull$3)o2).L$1 = l$2;
                ((FlowKt__ReduceKt$firstOrNull$3)o2).label = 1;
                if (((AbstractFlow)o).a((f)l$2, (c)o2) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                o = l$0;
                return ((Ref$ObjectRef)o).element;
            }
            catch (final AbortFlowException ex) {
                o = l$0;
                flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3 = l$2;
            }
        }
        final AbortFlowException ex;
        if (ex.owner != flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$3) {
            throw ex;
        }
        return ((Ref$ObjectRef)o).element;
    }
    
    public static final Object e(final s s, final c c) {
        Object o = null;
        Label_0046: {
            if (c instanceof FlowKt__ReduceKt$single$1) {
                final FlowKt__ReduceKt$single$1 flowKt__ReduceKt$single$1 = (FlowKt__ReduceKt$single$1)c;
                final int label = flowKt__ReduceKt$single$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    flowKt__ReduceKt$single$1.label = label + Integer.MIN_VALUE;
                    o = flowKt__ReduceKt$single$1;
                    break Label_0046;
                }
            }
            o = new FlowKt__ReduceKt$single$1(c);
        }
        final Object result = ((FlowKt__ReduceKt$single$1)o).result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = ((FlowKt__ReduceKt$single$1)o).label;
        Object o2;
        if (label2 != 0) {
            if (label2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o2 = ((FlowKt__ReduceKt$single$1)o).L$0;
            d.b4(result);
        }
        else {
            d.b4(result);
            final Ref$ObjectRef l$0 = new Ref$ObjectRef();
            l$0.element = a.l;
            final l l = new l(l$0);
            ((FlowKt__ReduceKt$single$1)o).L$0 = l$0;
            ((FlowKt__ReduceKt$single$1)o).label = 1;
            if (s.a((f)l, (c)o) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
            o2 = l$0;
        }
        final Object element = ((Ref$ObjectRef)o2).element;
        if (element != a.l) {
            return element;
        }
        throw new NoSuchElementException("Flow is empty");
    }
}
