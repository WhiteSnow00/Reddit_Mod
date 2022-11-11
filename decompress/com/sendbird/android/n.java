// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import ec2.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicInteger;

public final class n
{
    public final p4 a;
    public String b;
    
    public n(final String b) {
        this.a = new p4(v.a.a());
        new AtomicInteger(0);
        new AtomicLong(0L);
        new AtomicInteger();
        this.b = b;
    }
    
    public static void a(final SendBirdException ex) throws SendBirdException {
        final n b = SocketManager$d.a.b;
        if (b != null) {
            if (ex.isSessionExpirationError()) {
                ex.getCode();
                synchronized (b) {
                    SendBird.e();
                    a.a("updating session key. sessionHandler : null");
                    SendBird.e();
                    return;
                }
            }
            throw ex;
        }
        a.a("authentication is null.");
        throw new SendBirdException("Session refresh requires connection.", 800502);
    }
    
    public static void b() {
        a.a("revokeSessionFromUser");
        final SocketManager a = SocketManager$d.a;
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                SendBird.e();
                ec2.a.a("No session handler.");
            }
        };
        final boolean j = a.j();
        ec2.a.b("logout: %s, wasReconnecting: %s, connectionState: %s", new Object[] { Boolean.TRUE, j, a.g() });
        a.f(true, new o4(a, runnable, j));
    }
    
    @Override
    public final String toString() {
        return android.support.v4.media.a.k(a.r("Session{, accessToken='"), this.b, '\'', '}');
    }
}
