// 
// Decompiled by Procyon v0.6.0
// 

package com.sendbird.android;

import android.util.Log;
import java.util.concurrent.CountDownLatch;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.ArrayList;
import dc2.a;
import dc2.d;
import java.util.concurrent.Callable;

public final class y implements Callable<String>
{
    public final /* synthetic */ d f;
    public final /* synthetic */ a g;
    public final /* synthetic */ z h;
    
    public y(final z h, final h0$a f, final h0$b g) {
        this.h = h;
        this.f = (d)f;
        this.g = (a)g;
    }
    
    @Override
    public final Object call() throws Exception {
        final String token = this.f.getToken();
        final ArrayList list = new ArrayList();
        final ArrayList list2 = new ArrayList();
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        final AtomicReference atomicReference2 = new AtomicReference<String>(token);
        Label_0520: {
            while (true) {
                CountDownLatch countDownLatch = null;
                Label_0248: {
                    long a;
                    f2 a2;
                    w w;
                    try {
                        ec2.a.b("++ changeLogs token=%s", new Object[] { token });
                        if (!TextUtils.isEmpty((CharSequence)token)) {
                            break Label_0311;
                        }
                        a = this.f.a();
                        ec2.a.b("++ changeLogs default timestamp=%s", new Object[] { a });
                        if (a <= 0L) {
                            return atomicReference2.get();
                        }
                        countDownLatch = new CountDownLatch(1);
                        a2 = this.h.a;
                        w = new w(atomicReference, atomicReference2, atomicBoolean, list, list2, countDownLatch);
                        final SendBird h = SendBird.h;
                        if (a2 == null) {
                            SendBird.i((Runnable)new x3(w));
                            break Label_0248;
                        }
                    }
                    catch (final Exception ex) {
                        break Label_0520;
                    }
                    Label_0186: {
                        break Label_0186;
                        while (true) {
                            final AtomicBoolean atomicBoolean2 = atomicBoolean;
                            if (!atomicBoolean2.get() || atomicReference.get() != null) {
                                return atomicReference2.get();
                            }
                            list.clear();
                            list2.clear();
                            final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                            final String s = atomicReference2.get();
                            final f2 a3 = this.h.a;
                            final x x = new x(atomicReference, atomicReference2, atomicBoolean2, list, list2, countDownLatch2);
                            final SendBird h2 = SendBird.h;
                            if (a3 == null) {
                                SendBird.i((Runnable)new w3(x));
                            }
                            else {
                                sg2.e.e((Object)e.a.submit((Callable<Object>)((k2)new a4((SendBird$g)x, (Long)null, s, a3.a, a3.b, a3.c)).f), "taskExecutor.submit(task.callable)");
                            }
                            countDownLatch2.await();
                            if (atomicReference.get() != null) {
                                throw (SendBirdException)atomicReference.get();
                            }
                            final a g = this.g;
                            if (g == null) {
                                continue;
                            }
                            g.a((String)atomicReference2.get(), list, list2);
                        }
                    }
                    sg2.e.e((Object)e.a.submit((Callable<Object>)((k2)new a4((SendBird$g)w, Long.valueOf(a), (String)null, a2.a, a2.b, a2.c)).f), "taskExecutor.submit(task.callable)");
                }
                countDownLatch.await();
                if (atomicReference.get() != null) {
                    throw (SendBirdException)atomicReference.get();
                }
                final a g2 = this.g;
                if (g2 != null) {
                    g2.a((String)atomicReference2.get(), list, list2);
                }
                continue;
            }
            return atomicReference2.get();
        }
        final Exception ex;
        ec2.a.g(ec2.a.a.b, 5, Log.getStackTraceString((Throwable)ex));
        return atomicReference2.get();
    }
}
