// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import sg2.e;
import ec2.a;

public final class m implements Runnable
{
    public final /* synthetic */ k f;
    
    public m(final k f) {
        this.f = f;
    }
    
    @Override
    public final void run() {
        final k f = this.f;
        f.getClass();
        SendBird.k(SendBird$AppState.BACKGROUND);
        final StringBuilder sb = new StringBuilder();
        sb.append("++ getConnectionState(): ");
        sb.append(SendBird.c());
        a.a(sb.toString());
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("++ ConnectManager.getInstance().isReconnecting(): ");
        final SocketManager a = SocketManager$d.a;
        e.e((Object)a, "SocketManager.getInstance()");
        sb2.append(a.j());
        ec2.a.a(sb2.toString());
        if (SendBird.c() == SendBird$ConnectionState.CLOSED && !a.j()) {
            f.g = false;
        }
        else {
            a.f(false, (o4)null);
            f.g = true;
        }
    }
}
