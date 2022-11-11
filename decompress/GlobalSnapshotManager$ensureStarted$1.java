// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ae.b;
import i1.f$a;
import oj2.g;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import oj2.e;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import mj2.b0;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@" }, d2 = { "Lmj2/b0;", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.ui.platform.GlobalSnapshotManager$ensureStarted$1", f = "GlobalSnapshotManager.android.kt", l = { 63 }, m = "invokeSuspend")
final class GlobalSnapshotManager$ensureStarted$1 extends SuspendLambda implements p<b0, c<? super j>, Object>
{
    public final /* synthetic */ e<j> $channel;
    public Object L$0;
    public Object L$1;
    public int label;
    
    public GlobalSnapshotManager$ensureStarted$1(final e<j> $channel, final c<? super GlobalSnapshotManager$ensureStarted$1> c) {
        this.$channel = $channel;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object o, final c<?> c) {
        return (c<j>)new GlobalSnapshotManager$ensureStarted$1(this.$channel, (c<? super GlobalSnapshotManager$ensureStarted$1>)c);
    }
    
    public final Object invoke(final b0 b0, final c<? super j> c) {
        return ((GlobalSnapshotManager$ensureStarted$1)this.create(b0, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object o) {
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Label_0070: {
            if (label == 0) {
                break Label_0070;
            }
            Label_0060: {
                if (label != 1) {
                    break Label_0060;
                }
                final g g = (g)this.L$1;
                Object $channel;
                final Object o2 = $channel = this.L$0;
                try {
                    aj2.c.Q0(o);
                    $channel = o2;
                    GlobalSnapshotManager$ensureStarted$1 globalSnapshotManager$ensureStarted$1 = this;
                    Object iterator = coroutine_SUSPENDED;
                    coroutine_SUSPENDED = g;
                    while (true) {
                        while (true) {
                            try {
                                if (o) {
                                    final j j = (j)((g)coroutine_SUSPENDED).next();
                                    f$a.d();
                                    final g g2 = (g)coroutine_SUSPENDED;
                                    o = $channel;
                                    coroutine_SUSPENDED = iterator;
                                    iterator = g2;
                                }
                                b.r((oj2.p)$channel, (Throwable)null);
                                return j.a;
                            }
                            finally {}
                            final e<j> l$0;
                            $channel = l$0;
                            globalSnapshotManager$ensureStarted$1.L$0 = l$0;
                            $channel = l$0;
                            globalSnapshotManager$ensureStarted$1.L$1 = iterator;
                            $channel = l$0;
                            globalSnapshotManager$ensureStarted$1.label = 1;
                            $channel = l$0;
                            final Object a = ((g)iterator).a((ContinuationImpl)globalSnapshotManager$ensureStarted$1);
                            if (a == coroutine_SUSPENDED) {
                                break;
                            }
                            $channel = a;
                            final e<j> e = l$0;
                            final g g3 = (g)iterator;
                            iterator = coroutine_SUSPENDED;
                            o = $channel;
                            $channel = e;
                            coroutine_SUSPENDED = g3;
                        }
                        return coroutine_SUSPENDED;
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        aj2.c.Q0(o);
                        final e<j> l$0 = (e<j>)($channel = this.$channel);
                        iterator = ((oj2.p)l$0).iterator();
                        globalSnapshotManager$ensureStarted$1 = this;
                        continue;
                    }
                }
                finally {
                    try {}
                    finally {
                        b.r((oj2.p)$channel, (Throwable)o);
                    }
                }
            }
        }
    }
}
