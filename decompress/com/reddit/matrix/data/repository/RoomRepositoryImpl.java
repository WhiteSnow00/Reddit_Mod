// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.matrix.data.repository;

import kotlinx.coroutines.JobSupport;
import java.util.concurrent.CancellationException;
import cg2.j;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import java.util.List;
import mg2.p;
import kotlinx.coroutines.CoroutineStart;
import zi2.g;
import javax.inject.Inject;
import kotlin.collections.EmptyList;
import mg.d0;
import kotlin.coroutines.CoroutineContext;
import zi2.h;
import org.matrix.android.sdk.api.session.room.timeline.Timeline;
import java.util.LinkedHashMap;
import mo2.a;
import kotlinx.coroutines.flow.StateFlowImpl;
import ej2.f;
import fy0.c;
import sy0.b;
import fy0.e;
import zi2.c0;
import fy0.d;

public final class RoomRepositoryImpl implements d
{
    public final c0 a;
    public final e b;
    public final n12.d c;
    public final b d;
    public final c e;
    public final y10.c f;
    public final f g;
    public final StateFlowImpl h;
    public final StateFlowImpl i;
    public final StateFlowImpl j;
    public final StateFlowImpl k;
    public a l;
    public boolean m;
    public final StateFlowImpl n;
    public final LinkedHashMap o;
    public final LinkedHashMap p;
    public Timeline q;
    public final RoomRepositoryImpl$timelineListener.RoomRepositoryImpl$timelineListener$1 r;
    
    @Inject
    public RoomRepositoryImpl(final d20.a a, final c0 a2, final e b, final n12.d c, final b d, final c e, final y10.c f) {
        ng2.e.f((Object)b, "userSessionRepository");
        ng2.e.f((Object)e, "userRepository");
        this.a = a2;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = d0.c(((JobSupport)zi2.h.b()).plus((CoroutineContext)a.c()));
        this.h = xd.a.h((Object)null);
        this.i = xd.a.h((Object)null);
        this.j = xd.a.h((Object)null);
        this.k = xd.a.h((Object)null);
        this.n = xd.a.h((Object)EmptyList.INSTANCE);
        this.o = new LinkedHashMap();
        this.p = new LinkedHashMap();
        this.r = new RoomRepositoryImpl$timelineListener.RoomRepositoryImpl$timelineListener$1(this);
    }
    
    public final void a(final ey0.b b) {
        ng2.e.f((Object)b, "message");
        zi2.g.g((c0)this.g, null, null, (p)new RoomRepositoryImpl$deleteMessage.RoomRepositoryImpl$deleteMessage$1(b, this, (gg2.c)null), 3);
    }
    
    public final void b() {
        zi2.g.g((c0)this.g, null, null, (p)new RoomRepositoryImpl$readAllMessages.RoomRepositoryImpl$readAllMessages$1(this, (gg2.c)null), 3);
    }
    
    public final void c(final ey0.b b) {
        ng2.e.f((Object)b, "message");
        zi2.g.g((c0)this.g, null, null, (p)new RoomRepositoryImpl$retryMessageSend.RoomRepositoryImpl$retryMessageSend$1(b, this, (gg2.c)null), 3);
    }
    
    public final void d(final List<String> list) {
        ng2.e.f((Object)list, "filePaths");
        zi2.g.g((c0)this.g, null, null, (p)new RoomRepositoryImpl$sendImages.RoomRepositoryImpl$sendImages$1(this, (List)list, (gg2.c)null), 3);
    }
    
    public final void e(final String s) {
        ng2.e.f((Object)s, "message");
        if (s.length() == 0) {
            return;
        }
        zi2.g.g((c0)this.g, null, null, (p)new RoomRepositoryImpl$sendMessage.RoomRepositoryImpl$sendMessage$1(this, s, (gg2.c)null), 3);
    }
    
    public final void f(final String s) {
        ng2.e.f((Object)s, "roomId");
        zi2.g.g((c0)this.g, null, null, (p)new RoomRepositoryImpl$setCurrentRoom.RoomRepositoryImpl$setCurrentRoom$1(this, s, (gg2.c)null), 3);
    }
    
    public final Object g(final ga1.f f, final ga1.d d, final gg2.c<? super Boolean> c) {
        RoomRepositoryImpl$submitMessageReportForm$1 roomRepositoryImpl$submitMessageReportForm$2 = null;
        Label_0054: {
            if (c instanceof RoomRepositoryImpl$submitMessageReportForm$1) {
                final RoomRepositoryImpl$submitMessageReportForm$1 roomRepositoryImpl$submitMessageReportForm$1 = (RoomRepositoryImpl$submitMessageReportForm$1)c;
                final int label = roomRepositoryImpl$submitMessageReportForm$1.label;
                if ((label & Integer.MIN_VALUE) != 0x0) {
                    roomRepositoryImpl$submitMessageReportForm$1.label = label + Integer.MIN_VALUE;
                    roomRepositoryImpl$submitMessageReportForm$2 = roomRepositoryImpl$submitMessageReportForm$1;
                    break Label_0054;
                }
            }
            roomRepositoryImpl$submitMessageReportForm$2 = new RoomRepositoryImpl$submitMessageReportForm$1(this, (gg2.c)c);
        }
        final Object result = roomRepositoryImpl$submitMessageReportForm$2.result;
        final CoroutineSingletons coroutine_SUSPENDED = CoroutineSingletons.COROUTINE_SUSPENDED;
        final int label2 = roomRepositoryImpl$submitMessageReportForm$2.label;
        Object o = null;
        Label_0240: {
            Label_0222: {
                if (label2 != 0) {
                    if (label2 == 1) {
                        Label_0232: {
                            try {
                                cg.d.b4(result);
                                break Label_0222;
                            }
                            finally {
                                break Label_0232;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        final Throwable t;
                        o = Result.constructor-impl((Object)cg.d.B1(t));
                        break Label_0240;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cg.d.b4(result);
                Object l = this.l;
                if (l != null) {
                    if (!ng2.e.a((Object)((a)l).a(), (Object)f.g)) {
                        l = null;
                    }
                    if (l != null) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(d.a);
                        sb.append(':');
                        sb.append(d.b);
                        final String string = sb.toString();
                        final String h = f.h;
                        roomRepositoryImpl$submitMessageReportForm$2.label = 1;
                        if (((ap2.a)l).t(h, string, (gg2.c)roomRepositoryImpl$submitMessageReportForm$2) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        break Label_0222;
                    }
                }
                return Boolean.FALSE;
            }
            o = Result.constructor-impl((Object)cg2.j.a);
        }
        final Throwable exceptionOrNull-impl = Result.exceptionOrNull-impl(o);
        if (exceptionOrNull-impl != null && exceptionOrNull-impl instanceof CancellationException) {
            throw exceptionOrNull-impl;
        }
        final Throwable exceptionOrNull-impl2 = Result.exceptionOrNull-impl(o);
        if (exceptionOrNull-impl2 != null) {
            pu2.a.a.f(exceptionOrNull-impl2, "Failed to send report form to Matrix", new Object[0]);
        }
        return Result.isSuccess-impl(o);
    }
}
