// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import lc2.n$b;
import java.io.Serializable;
import lc2.l;
import lc2.d;
import lc2.w;
import java.util.concurrent.ThreadPoolExecutor;
import lc2.v;
import com.sendbird.android.shadow.okhttp3.internal.Internal;
import java.util.List;
import java.util.Collections;
import com.sendbird.android.shadow.okhttp3.Protocol;
import java.util.Collection;
import java.util.ArrayList;
import lc2.o;
import java.util.Random;
import java.text.SimpleDateFormat;
import lc2.a0;
import wc2.c;
import java.util.Iterator;
import fc2.f;
import lc2.w$a;
import java.util.concurrent.Callable;
import android.text.TextUtils;
import android.os.Build$VERSION;
import lc2.u;
import lc2.u$b;
import java.util.concurrent.TimeUnit;
import fc2.g;
import fc2.k;
import com.sendbird.android.log.Tag;
import java.util.concurrent.atomic.AtomicBoolean;
import lc2.e0;
import com.sendbird.android.utils.TimeoutLock;
import java.util.concurrent.atomic.AtomicReference;
import yc2.a;
import android.support.v4.media.b;

public final class p0 extends android.support.v4.media.b
{
    public static i p;
    public static s0 q;
    public static final a r;
    public SendBirdException f;
    public final AtomicReference<SendBird$ConnectionState> g;
    public TimeoutLock h;
    public e0 i;
    public c j;
    public final String k;
    public final String l;
    public final StringBuffer m;
    public final AtomicBoolean n;
    public final b o;
    
    static {
        p0.q = new s0();
        r = new a(Long.MAX_VALUE);
    }
    
    public p0(final String k, final String l, final SocketManager j) {
        final SendBird$ConnectionState closed = SendBird$ConnectionState.CLOSED;
        this.g = new AtomicReference<SendBird$ConnectionState>(closed);
        this.n = new AtomicBoolean(false);
        this.d1(closed);
        this.m = new StringBuffer();
        this.k = k;
        this.l = l;
        this.j = (c)j;
        this.o = new b();
    }
    
    public static void c1(final p0 p) {
        p.getClass();
        final Tag connection = Tag.CONNECTION;
        ec2.a.g(connection, 3, "-- done connectLock released ");
        p2.a(connection.tag(), "-- done connectLock released ", null);
        p.h.c();
    }
    
    public static boolean i1(final m0 m0) {
        final fc2.i p = m0.c().p();
        if (p.p().P("error")) {
            final g l = p.p().L("error");
            l.getClass();
            if (l instanceof k && p.p().L("error").d()) {
                return true;
            }
        }
        return false;
    }
    
    public static SendBirdException j1(final m0 m0) {
        if (!i1(m0)) {
            return null;
        }
        final int n = 0;
        final fc2.i p = m0.c().p();
        String c = null;
        Label_0072: {
            if (p.p().P("message")) {
                final g l = p.p().L("message");
                l.getClass();
                if (l instanceof k) {
                    c = p.p().L("message").C();
                    break Label_0072;
                }
            }
            c = "";
        }
        int i = n;
        if (p.p().P("code")) {
            final g j = p.p().L("code");
            j.getClass();
            i = n;
            if (j instanceof k) {
                i = p.p().L("code").m();
            }
        }
        return new SendBirdException(c, i);
    }
    
    public final void d1(final SendBird$ConnectionState sendBird$ConnectionState) {
        final AtomicReference<SendBird$ConnectionState> g = this.g;
        final SendBird$ConnectionState value = g.get();
        while (!g.compareAndSet(value, sendBird$ConnectionState)) {
            if (g.get() != value) {
                return;
            }
        }
    }
    
    public final void e1() throws SendBirdException {
        synchronized (this) {
            final Tag connection = Tag.CONNECTION;
            final StringBuilder sb = new StringBuilder();
            sb.append(">> Connection::connect user id : ");
            sb.append(this.k);
            ec2.a.g(connection, 3, sb.toString());
            final String tag = connection.tag();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(">> Connection::connect user id : ");
            sb2.append(this.k);
            p2.a(tag, sb2.toString(), null);
            Label_0298: {
                try {
                    try {
                        ec2.a.g(connection, 3, "connect await start");
                        p2.a(connection.tag(), "connect await start", null);
                        this.d1(SendBird$ConnectionState.CONNECTING);
                        this.h = new TimeoutLock(SendBird$Options.b + SendBird$Options.d, TimeUnit.SECONDS);
                        this.f1();
                        this.h.a();
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("connection state: ");
                        sb3.append(this.g.get());
                        sb3.append(", logiException: ");
                        sb3.append(this.f);
                        ec2.a.a(sb3.toString());
                        if (this.h1()) {
                            throw new SendBirdException("Connection has not made.", 800200);
                        }
                        if (this.f == null) {
                            ec2.a.g(connection, 3, "connect await end success");
                            p2.a(connection.tag(), "connect await end success", null);
                            this.d1(SendBird$ConnectionState.OPEN);
                            b.a(this.o);
                            this.f = null;
                            return;
                        }
                        throw new SendBirdException(((Throwable)this.f).getMessage(), this.f.getCode());
                    }
                    finally {}
                }
                catch (final SendBirdException ex) {
                    break Label_0298;
                }
                catch (final InterruptedException ex) {
                    break Label_0298;
                }
                catch (final TimeoutLock.TimeoutException ex) {
                    break Label_0298;
                }
                throw new SendBirdException(((Throwable)this.f).getMessage(), this.f.getCode());
            }
            final Tag connection2 = Tag.CONNECTION;
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("connect await end exception : ");
            final SendBirdException ex;
            sb4.append(ex);
            ec2.a.g(connection2, 4, sb4.toString());
            final String tag2 = connection2.tag();
            final StringBuilder sb5 = new StringBuilder();
            sb5.append("connect await end exception : ");
            sb5.append(ex);
            p2.c(LogLevel.INFO, tag2, sb5.toString(), null);
            this.g1();
            if (ex instanceof TimeoutLock.TimeoutException) {
                throw new SendBirdException("WebSocket Connection failure [TIMEOUT]", 800190);
            }
            if (ex instanceof InterruptedException) {
                final StringBuilder sb6 = new StringBuilder();
                sb6.append("-- interrupted instance : ");
                sb6.append(this);
                ec2.a.g(connection2, 3, sb6.toString());
                final String tag3 = connection2.tag();
                final StringBuilder sb7 = new StringBuilder();
                sb7.append("-- interrupted instance : ");
                sb7.append(this);
                p2.a(tag3, sb7.toString(), null);
                throw new SendBirdException("Connection has been canceled.", 800102);
            }
            throw ex;
            this.f = null;
        }
    }
    
    public final void f1() throws SendBirdException {
        final Tag connection = Tag.CONNECTION;
        ec2.a.g(connection, 3, ">> Connection::connect connectInternal()");
        p2.a(connection.tag(), ">> Connection::connect connectInternal()", null);
        final u$b u$b = new u$b();
        u$b.w = mc2.a.d((long)SendBird$Options.b, TimeUnit.SECONDS);
        u$b.x = mc2.a.d(0L, TimeUnit.MILLISECONDS);
        final u u = new u(u$b);
        final String k = this.k;
        final String l = this.l;
        if (SendBird.b() == null || SendBird.b().length() == 0) {
            throw new SendBirdException("Application ID is not set. Initialize SendBird class.", 800100);
        }
        if (SocketManager.s == null) {
            SendBird.b();
        }
        String s = SocketManager.r;
        if (s == null) {
            final StringBuilder r = a.r("wss://ws-");
            r.append(SendBird.b());
            r.append(".sendbird.com");
            s = r.toString();
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("++ wsHost : ");
        sb.append(s);
        ec2.a.g(connection, 3, sb.toString());
        final String tag = connection.tag();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("++ wsHost : ");
        sb2.append(s);
        p2.a(tag, sb2.toString(), null);
        final StringBuilder sb3 = new StringBuilder(s);
        sb3.append("/?p=Android");
        sb3.append("&pv=");
        sb3.append(String.valueOf(Build$VERSION.SDK_INT));
        sb3.append("&sv=");
        sb3.append("3.0.173");
        sb3.append("&ai=");
        sb3.append(SendBird.b());
        sb3.append("&SB-User-Agent=");
        sb3.append(API.urlEncodeUTF8(SendBird.g()));
        sb3.append("&include_extra_data=");
        final StringBuilder sb4 = new StringBuilder();
        sb4.append("premium_feature_list");
        sb4.append(",");
        sb4.append("file_upload_size_limit");
        sb4.append(",");
        sb4.append("application_attributes");
        sb4.append(",");
        sb4.append("emoji_hash");
        final StringBuilder sb5 = new StringBuilder();
        sb5.append("additionalData : ");
        sb5.append(sb4.toString());
        ec2.a.f(sb5.toString(), new Object[0]);
        sb3.append(API.urlEncodeUTF8(sb4.toString()));
        if (SendBird.d() != null && !TextUtils.isEmpty((CharSequence)com.sendbird.android.a.c().e())) {
            sb3.append("&key=");
            sb3.append(com.sendbird.android.a.c().e());
        }
        else {
            sb3.append("&user_id=");
            sb3.append(API.urlEncodeUTF8(k));
            if (l != null) {
                sb3.append("&access_token=");
                sb3.append(l);
            }
        }
        SendBird.e();
        sb3.append("&active=");
        sb3.append(SendBird.f() ? 1 : 0);
        SendBird.e();
        final StringBuilder sb6 = new StringBuilder();
        sb6.append("WS request: ");
        sb6.append(sb3.toString());
        ec2.a.g(connection, 3, sb6.toString());
        final String tag2 = connection.tag();
        final StringBuilder r2 = a.r("WS request: ");
        r2.append(sb3.toString());
        p2.a(tag2, r2.toString(), null);
        sg2.e.e((Object)e.a.submit((Callable<Object>)((k2)new com.sendbird.android.b(com.sendbird.android.a.c())).f), "taskExecutor.submit(task.callable)");
        final w$a w$a = new w$a();
        w$a.c.c("User-Agent", "Jand/3.0.173");
        w$a.c.c("Request-Sent-Timestamp", String.valueOf(System.currentTimeMillis()));
        w$a.d(sb3.toString());
        final wc2.c i = new wc2.c(w$a.a(), new android.support.v4.media.b() {
            public final void A0(String substring) {
                final b o = p0.this.o;
                o.getClass();
                final Tag pinger = Tag.PINGER;
                ec2.a.g(pinger, 3, ">> Pinger::onActive()");
                p2.a(pinger.tag(), ">> Pinger::onActive()", null);
                o.b = System.currentTimeMillis();
                o.b();
                p0.this.m.append(substring);
                while (true) {
                    final int index = p0.this.m.indexOf("\n");
                    if (index < 0) {
                        break;
                    }
                    substring = p0.this.m.substring(0, index);
                    p0.this.m.delete(0, index + 1);
                    final m0 m0 = new m0(substring);
                    final CommandType a = m0.a;
                    final CommandType logi = CommandType.LOGI;
                    if (a == logi) {
                        final p0 f = p0.this;
                        f.getClass();
                        if (m0.a == logi) {
                            final Tag connection = Tag.CONNECTION;
                            ec2.a.g(connection, 3, "LOGI RECEIVED: ");
                            p2.a(connection.tag(), "LOGI RECEIVED: ", null);
                            f.f = null;
                            final fc2.i p = m0.c().p();
                            if (p0.i1(m0)) {
                                f.f = p0.j1(m0);
                            }
                            else {
                                if (p.P("user_id")) {
                                    final StringBuilder r = a.r("++ LOGI user id : ");
                                    r.append(p.L("user_id").C());
                                    ec2.a.g(connection, 3, r.toString());
                                    final String tag = connection.tag();
                                    final StringBuilder r2 = a.r("++ LOGI user id : ");
                                    r2.append(p.L("user_id").C());
                                    p2.a(tag, r2.toString(), null);
                                    SendBird.e().c = new User(m0.c());
                                    final StringBuilder r3 = a.r("++ after LOGI user id : ");
                                    r3.append(SendBird.d().a);
                                    ec2.a.g(connection, 3, r3.toString());
                                    final String tag2 = connection.tag();
                                    final StringBuilder r4 = a.r("++ after LOGI user id : ");
                                    r4.append(SendBird.d().a);
                                    p2.a(tag2, r4.toString(), null);
                                }
                                if (p.P("key")) {
                                    com.sendbird.android.a.c().i(p.L("key").C());
                                }
                                if (p.P("ekey")) {
                                    SendBird.m = p.L("ekey").C();
                                }
                                Object q = p0.q;
                                long n = 0L;
                                Label_0596: {
                                    if (q == null) {
                                        q = new s0();
                                        ((s0)q).a(p);
                                        p0.q = (s0)q;
                                        final long g = ((s0)q).g;
                                        if (g <= 0L) {
                                            break Label_0596;
                                        }
                                        final a r5 = p0.r;
                                        synchronized (r5.a) {
                                            if (r5.b > g) {
                                                r5.b = g;
                                                break Label_0596;
                                            }
                                            break Label_0596;
                                        }
                                    }
                                    ((s0)q).a(p);
                                    final long g2 = p0.q.g;
                                    if (g2 <= 0L) {
                                        break Label_0596;
                                    }
                                    final a r6 = p0.r;
                                    q = r6.a;
                                    synchronized (q) {
                                        if (r6.b > g2) {
                                            r6.b = g2;
                                            monitorexit(q);
                                        }
                                        else {
                                            monitorexit(q);
                                        }
                                        q = p0.p;
                                        if (q == null) {
                                            p0.p = new i((g)p);
                                        }
                                        else {
                                            ((i)q).a((g)p);
                                        }
                                        if (SendBird.n) {
                                            q = p0.q;
                                            q.getClass();
                                            final fc2.i i = new fc2.i();
                                            i.J("ping_interval", ((s0)q).e / 1000);
                                            i.J("pong_timeout", ((s0)q).f / 1000);
                                            i.J("login_ts", ((s0)q).g);
                                            i.J("max_unread_cnt_on_super_group", ((s0)q).i);
                                            final long h = ((s0)q).h;
                                            if (h != 500L) {
                                                n = h / 1000;
                                            }
                                            i.J("bc_duration", n);
                                            q = ((s0)q).j;
                                            if (q != null) {
                                                i.F("reconnect", (g)q);
                                            }
                                            n2.c("KEY_CONNECTION_CONFIG", i.toString());
                                            final i p2 = p0.p;
                                            p2.getClass();
                                            q = new fc2.i();
                                            ((fc2.i)q).K("emoji_hash", p2.a);
                                            ((fc2.i)q).J("file_upload_size_limit", p2.b);
                                            ((fc2.i)q).I(Boolean.valueOf(p2.c), "use_reaction");
                                            if (!p2.d.isEmpty()) {
                                                final f f2 = new f();
                                                final Iterator iterator = p2.d.iterator();
                                                while (iterator.hasNext()) {
                                                    f2.I((String)iterator.next());
                                                }
                                                ((fc2.i)q).F("premium_feature_list", f2);
                                            }
                                            if (!p2.e.isEmpty()) {
                                                final f f3 = new f();
                                                final Iterator iterator2 = p2.e.iterator();
                                                while (iterator2.hasNext()) {
                                                    f3.I((String)iterator2.next());
                                                }
                                                ((fc2.i)q).F("application_attributes", f3);
                                            }
                                            ((fc2.i)q).I(Boolean.valueOf(p2.f), "disable_supergroup_mack");
                                            n2.c("KEY_CURRENT_APP_INFO", ((g)q).toString());
                                        }
                                    }
                                }
                            }
                        }
                    }
                    final p0 f4 = p0.this;
                    if (f4.j != null) {
                        ec2.a.h("onMessage instance : [%s] %s", new Object[] { m0.a, f4 });
                        p2.c(LogLevel.WARN, null, String.format("onMessage instance : [%s] %s", m0.a, p0.this), null);
                        final Tag connection2 = Tag.CONNECTION;
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Recv: ");
                        sb.append(substring);
                        ec2.a.g(connection2, 3, sb.toString());
                        final String tag3 = connection2.tag();
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Recv: ");
                        sb2.append(substring);
                        p2.a(tag3, sb2.toString(), null);
                        final SocketManager socketManager = (SocketManager)p0.this.j;
                        socketManager.getClass();
                        Label_1260: {
                            if (m0.c.length() > 0) {
                                synchronized (socketManager.p) {
                                    final Object o2 = socketManager.p.remove(m0.c);
                                    monitorexit(socketManager.p);
                                    substring = (String)o2;
                                    if (o2 != null) {
                                        ec2.a.a(">> AckSession::ackReceived()");
                                        ((com.sendbird.android.g)o2).a.c(true);
                                        substring = (String)o2;
                                    }
                                    break Label_1260;
                                }
                            }
                            substring = null;
                        }
                        final a1 a2 = a1$n.a;
                        final j4 j4 = new j4((com.sendbird.android.g)substring, m0);
                        a2.getClass();
                        ec2.a.b(">> EventController::processResponse[%s]", new Object[] { m0.a });
                        a2.a.a((com.sendbird.android.j2<Object>)new b1(a2, m0, j4));
                    }
                    if (m0.a != CommandType.LOGI) {
                        continue;
                    }
                    p0.c1(p0.this);
                }
            }
            
            public final void B0(final wc2.c i, final a0 a0) {
                p0.this.i = (e0)i;
                if (a0.j != null) {
                    final Tag connection = Tag.CONNECTION;
                    final StringBuilder r = a.r("WSClient onOpen. TLS version = ");
                    r.append(a0.j.a.javaName());
                    ec2.a.g(connection, 3, r.toString());
                    final String tag = connection.tag();
                    final StringBuilder r2 = a.r("WSClient onOpen. TLS version = ");
                    r2.append(a0.j.a.javaName());
                    p2.a(tag, r2.toString(), null);
                }
            }
            
            public final void w0(final int n) {
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("++ onClosed %s");
                    sb.append(p0.this.h1());
                    ec2.a.g(ec2.a.a.b, 5, sb.toString());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("++ onClosed %s");
                    sb2.append(p0.this.h1());
                    final String string = sb2.toString();
                    final ThreadLocal<SimpleDateFormat> a = p2.a;
                    final LogLevel warn = LogLevel.WARN;
                    p2.c(warn, null, string, null);
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("onClosed instance : ");
                    sb3.append(p0.this);
                    ec2.a.g(ec2.a.a.b, 5, sb3.toString());
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("onClosed instance : ");
                    sb4.append(p0.this);
                    p2.c(warn, null, sb4.toString(), null);
                    p0.this.k1();
                    final p0 f = p0.this;
                    final c j = f.j;
                    if (j != null) {
                        final boolean value = f.n.get();
                        final StringBuilder sb5 = new StringBuilder();
                        sb5.append("WS connection closed by server. ");
                        sb5.append(n);
                        ((SocketManager)j).l(value, new SendBirdException(sb5.toString(), 800200));
                        p0.this.j = null;
                    }
                }
                finally {
                    p0.c1(p0.this);
                }
            }
            
            public final void x0(final Throwable t) {
                try {
                    ec2.a.h("onFailed instance : %s", new Object[] { p0.this });
                    final p0 f = p0.this;
                    final ThreadLocal<SimpleDateFormat> a = p2.a;
                    final LogLevel warn = LogLevel.WARN;
                    p2.c(warn, null, String.format("onFailed instance : %s", f), null);
                    p0.this.k1();
                    ec2.a.h("onFailed handler : %s", new Object[] { p0.this.j });
                    p2.c(warn, null, String.format("onFailed handler : %s", p0.this.j), null);
                    final p0 f2 = p0.this;
                    final c j = f2.j;
                    if (j != null) {
                        ((SocketManager)j).l(f2.n.get(), new SendBirdException(t.getMessage(), 800120));
                        p0.this.j = null;
                    }
                }
                finally {
                    p0.c1(p0.this);
                }
            }
        }, new Random(), u.E);
        final u$b u$b2 = new u$b(u);
        u$b2.g = (n$b)new o();
        final ArrayList<Object> list = new ArrayList<Object>(wc2.c.u);
        final Protocol h2_PRIOR_KNOWLEDGE = Protocol.H2_PRIOR_KNOWLEDGE;
        if (!list.contains(h2_PRIOR_KNOWLEDGE) && !list.contains(Protocol.HTTP_1_1)) {
            final StringBuilder sb7 = new StringBuilder();
            sb7.append("protocols must contain h2_prior_knowledge or http/1.1: ");
            sb7.append(list);
            throw new IllegalArgumentException(sb7.toString());
        }
        if (list.contains(h2_PRIOR_KNOWLEDGE) && list.size() > 1) {
            final StringBuilder sb8 = new StringBuilder();
            sb8.append("protocols containing h2_prior_knowledge cannot use other protocols: ");
            sb8.append(list);
            throw new IllegalArgumentException(sb8.toString());
        }
        if (!list.contains(Protocol.HTTP_1_0)) {
            if (!list.contains(null)) {
                list.remove(Protocol.SPDY_3);
                u$b2.c = Collections.unmodifiableList((List<?>)list);
                final u u2 = new u(u$b2);
                final w a = i.a;
                a.getClass();
                final w$a w$a2 = new w$a(a);
                w$a2.c.c("Upgrade", "websocket");
                w$a2.c.c("Connection", "Upgrade");
                w$a2.c.c("Sec-WebSocket-Key", i.e);
                w$a2.c.c("Sec-WebSocket-Version", "13");
                final w a2 = w$a2.a();
                final d webSocketCall = Internal.instance.newWebSocketCall(u2, a2);
                i.f = webSocketCall;
                Object o = webSocketCall;
                ((xc2.u)((v)o).h).c = 0L;
                final wc2.b b = new wc2.b(i, a2);
                synchronized (o) {
                    if (!((v)o).l) {
                        ((v)o).l = true;
                        monitorexit(o);
                        ((v)o).g.c = sc2.f.a.j();
                        ((v)o).i.getClass();
                        final l f = ((v)o).f.f;
                        o = (v)o.new b(b);
                        synchronized (f) {
                            f.d.add(o);
                            monitorexit(f);
                            f.d();
                            this.i = (e0)i;
                            ((ThreadPoolExecutor)u.f.b()).shutdown();
                            return;
                        }
                    }
                    throw new IllegalStateException("Already Executed");
                }
            }
            throw new IllegalArgumentException("protocols must not contain null");
        }
        final StringBuilder sb9 = new StringBuilder();
        sb9.append("protocols must not contain http/1.0: ");
        sb9.append(list);
        throw new IllegalArgumentException(sb9.toString());
    }
    
    public final void g1() {
        final Tag connection = Tag.CONNECTION;
        final StringBuilder r = a.r("__ actural disconnect isConnecting :");
        final SendBird$ConnectionState value = this.g.get();
        final SendBird$ConnectionState connecting = SendBird$ConnectionState.CONNECTING;
        final boolean b = false;
        r.append(value == connecting);
        ec2.a.g(connection, 4, r.toString());
        final String tag = connection.tag();
        final StringBuilder r2 = a.r("__ actural disconnect isConnecting :");
        boolean b2 = b;
        if (this.g.get() == connecting) {
            b2 = true;
        }
        r2.append(b2);
        final String string = r2.toString();
        final ThreadLocal<SimpleDateFormat> a = p2.a;
        p2.c(LogLevel.INFO, tag, string, null);
        final TimeoutLock h = this.h;
        if (h != null) {
            h.c();
        }
        this.n.set(true);
        if (this.h1()) {
            ec2.a.g(connection, 3, "++ socket is already disconnected()");
            p2.a(connection.tag(), "++ socket is already disconnected()", null);
            return;
        }
        this.k1();
    }
    
    public final boolean h1() {
        return this.g.get() == SendBird$ConnectionState.CLOSED;
    }
    
    public final void k1() {
        if (this.i == null) {
            return;
        }
        final Tag connection = Tag.CONNECTION;
        ec2.a.g(connection, 4, ">> Connection::quit()");
        final String tag = connection.tag();
        final ThreadLocal<SimpleDateFormat> a = p2.a;
        p2.c(LogLevel.INFO, tag, ">> Connection::quit()", null);
        final b o = this.o;
        synchronized (o) {
            final Tag pinger = Tag.PINGER;
            ec2.a.g(pinger, 3, "[Pinger] stop()");
            p2.a(pinger.tag(), "[Pinger] stop()", null);
            final s4 a2 = o.a;
            Serializable value;
            if (a2 != null) {
                value = a2.a.get();
            }
            else {
                value = "timer is null";
            }
            if (6 >= ec2.a.a.a) {
                ec2.a.g(pinger, 6, String.format("Pinger stop %s", value));
            }
            final String tag2 = pinger.tag();
            final s4 a3 = o.a;
            Serializable value2;
            if (a3 != null) {
                value2 = a3.a.get();
            }
            else {
                value2 = "timer is null";
            }
            p2.c(LogLevel.ERROR, tag2, String.format("Pinger stop %s", value2), null);
            if (o.a != null) {
                final StringBuilder sb = new StringBuilder();
                sb.append(">> Pinger::stop() isRunning : ");
                sb.append(o.a.a.get());
                ec2.a.g(pinger, 3, sb.toString());
                final String tag3 = pinger.tag();
                final StringBuilder sb2 = new StringBuilder();
                sb2.append(">> Pinger::stop() isRunning : ");
                sb2.append(o.a.a.get());
                p2.a(tag3, sb2.toString(), null);
                o.a.c(false);
            }
            o.b();
            ec2.a.g(pinger, 3, "[Pinger] stop end()");
            p2.a(pinger.tag(), "[Pinger] stop end()", null);
            monitorexit(o);
            final e0 i = this.i;
            if (i != null) {
                ((v)((wc2.c)i).f).cancel();
            }
            try {
                final e0 j = this.i;
                if (j != null) {
                    ((wc2.c)j).b(1000, "");
                }
            }
            catch (final Exception ex) {
                ex.printStackTrace();
            }
            this.i = null;
            this.d1(SendBird$ConnectionState.CLOSED);
        }
    }
    
    public final void l1(final m0 m0) throws SendBirdException {
        final Tag connection = Tag.CONNECTION;
        final StringBuilder r = a.r("++ Send: ");
        r.append(m0.a());
        ec2.a.g(connection, 3, r.toString());
        final String tag = connection.tag();
        final StringBuilder r2 = a.r("++ Send: ");
        r2.append(m0.a());
        p2.a(tag, r2.toString(), null);
        final e0 i = this.i;
        if (i != null) {
            try {
                ((wc2.c)i).f(m0.a());
                return;
            }
            catch (final Exception ex) {
                throw new SendBirdException(ex.getMessage(), 800210);
            }
        }
        throw new SendBirdException("Connection closed.", 800200);
    }
    
    public final class b
    {
        public s4 a;
        public long b;
        public TimeoutLock c;
        public final AtomicBoolean d;
        
        public b() {
            this.d = new AtomicBoolean(true);
        }
        
        public static void a(final b b) {
            synchronized (b) {
                final Tag pinger = Tag.PINGER;
                ec2.a.g(pinger, 3, "[Pinger] start()");
                p2.a(pinger.tag(), "[Pinger] start()", null);
                b.d.set(true);
                final s4 a = b.a;
                if (a != null) {
                    a.a();
                    b.b();
                    monitorexit(b);
                }
                else {
                    (b.a = new s4(0L, p0.q.e, true, (s4.a)new q0(b), null)).b();
                }
            }
        }
        
        public final void b() {
            final Tag pinger = Tag.PINGER;
            final StringBuilder r = a.r("++ Pinger::done() lock : ");
            r.append(this.c);
            ec2.a.g(pinger, 3, r.toString());
            final String tag = pinger.tag();
            final StringBuilder r2 = a.r("++ Pinger::done() lock : ");
            r2.append(this.c);
            p2.a(tag, r2.toString(), null);
            final TimeoutLock c = this.c;
            if (c != null) {
                c.c();
                this.c = null;
            }
        }
    }
    
    public interface c
    {
    }
}
