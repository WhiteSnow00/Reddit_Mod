// 
// Decompiled by Procyon v0.6.0
// 

package androidx.compose.ui.platform;

import oj2.g;
import android.database.ContentObserver;
import android.provider.Settings$Global;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import android.content.ContentResolver;
import oj2.e;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import pg2.j;
import tg2.c;
import pj2.f;
import zg2.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(bv = {}, d1 = { "\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@" }, d2 = { "Lpj2/f;", "", "Lpg2/j;", "<anonymous>" }, k = 3, mv = { 1, 6, 0 })
@ug2.c(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1", f = "WindowRecomposer.android.kt", l = { 116, 122 }, m = "invokeSuspend")
final class WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 extends SuspendLambda implements p<f<? super Float>, c<? super j>, Object>
{
    public final /* synthetic */ Uri $animationScaleUri;
    public final /* synthetic */ Context $applicationContext;
    public final /* synthetic */ e<j> $channel;
    public final /* synthetic */ v1 $contentObserver;
    public final /* synthetic */ ContentResolver $resolver;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    
    public WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(final ContentResolver $resolver, final Uri $animationScaleUri, final v1 $contentObserver, final e<j> $channel, final Context $applicationContext, final c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1> c) {
        this.$resolver = $resolver;
        this.$animationScaleUri = $animationScaleUri;
        this.$contentObserver = $contentObserver;
        this.$channel = $channel;
        this.$applicationContext = $applicationContext;
        super(2, (c)c);
    }
    
    public final c<j> create(final Object l$0, final c<?> c) {
        final WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1 = new WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1(this.$resolver, this.$animationScaleUri, this.$contentObserver, this.$channel, this.$applicationContext, (c<? super WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1>)c);
        windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1.L$0 = l$0;
        return (c<j>)windowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1;
    }
    
    public final Object invoke(final f<? super Float> f, final c<? super j> c) {
        return ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)this.create(f, c)).invokeSuspend(j.a);
    }
    
    public final Object invokeSuspend(Object emit) {
        Object coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label = this.label;
        Label_0091: {
            if (label == 0) {
                break Label_0091;
            }
            Label_0058: {
                if (label == 1) {
                    break Label_0058;
                }
                Label_0048: {
                    if (label != 2) {
                        break Label_0048;
                    }
                    Object iterator = this.L$1;
                    Object o = this.L$0;
                    try {
                        aj2.c.Q0(emit);
                        while (true) {
                            while (true) {
                                emit = this;
                                try {
                                    ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)emit).L$0 = o;
                                    ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)emit).L$1 = iterator;
                                    ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)emit).label = 1;
                                    final Object a = ((g)iterator).a((ContinuationImpl)emit);
                                    if (a == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    final g g = (g)iterator;
                                    iterator = o;
                                    o = g;
                                    final Object o2 = coroutine_SUSPENDED;
                                    coroutine_SUSPENDED = emit;
                                    try {
                                        if (a) {
                                            ((g)o).next();
                                            emit = new Float(Settings$Global.getFloat(((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)coroutine_SUSPENDED).$applicationContext.getContentResolver(), "animator_duration_scale", 1.0f));
                                            ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)coroutine_SUSPENDED).L$0 = iterator;
                                            ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)coroutine_SUSPENDED).L$1 = o;
                                            ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)coroutine_SUSPENDED).label = 2;
                                            emit = ((f)iterator).emit(emit, (c)coroutine_SUSPENDED);
                                            if (emit == o2) {
                                                return o2;
                                            }
                                            emit = coroutine_SUSPENDED;
                                            coroutine_SUSPENDED = o2;
                                        }
                                        ((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)coroutine_SUSPENDED).$resolver.unregisterContentObserver((ContentObserver)((WindowRecomposer_androidKt$getAnimationScaleFlowFor$1$1$1)coroutine_SUSPENDED).$contentObserver);
                                        return j.a;
                                    }
                                    finally {}
                                }
                                finally {}
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                aj2.c.Q0(emit);
                                o = this.L$0;
                                this.$resolver.registerContentObserver(this.$animationScaleUri, false, (ContentObserver)this.$contentObserver);
                                iterator = ((oj2.p)this.$channel).iterator();
                                continue;
                            }
                            o = this.L$1;
                            iterator = this.L$0;
                            aj2.c.Q0(emit);
                            final Object o2 = coroutine_SUSPENDED;
                            coroutine_SUSPENDED = this;
                            final Object a = emit;
                            continue;
                        }
                    }
                    finally {}
                }
            }
        }
        this.$resolver.unregisterContentObserver((ContentObserver)this.$contentObserver);
    }
}
