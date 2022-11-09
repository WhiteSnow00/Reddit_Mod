// 
// Decompiled by Procyon v0.6.0
// 

package X;

import java.lang.reflect.Field;
import java.lang.reflect.AccessibleObject;
import java.util.Iterator;
import android.net.ConnectivityManager$NetworkCallback;
import android.net.NetworkRequest$Builder;
import android.os.Handler;
import android.os.Looper;
import android.content.ClipboardManager;
import android.os.Build$VERSION;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.util.HashSet;
import com.bytedance.covode.number.Covode;
import android.content.Context;
import android.net.Network;
import java.util.Set;

public final class 0Rx
{
    public static volatile 0Rx LIZ;
    public Set<Network> LIZIZ;
    public boolean LIZJ;
    public Context LIZLLL;
    
    static {
        Covode.recordClassIndex(4465);
        0Rx.LIZ = new 0Rx();
    }
    
    public 0Rx() {
        this.LIZIZ = new HashSet<Network>();
    }
    
    public static NetworkInfo LIZ(final ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        }
        catch (final Exception ex) {
            4ch.LIZ((Throwable)ex);
            return 4MB.LIZ();
        }
    }
    
    public static Object LIZ(Context context, String declaredField) {
        MethodCollector.i(9704);
    Label_0161_Outer:
        while (true) {
            if (Build$VERSION.SDK_INT <= 27 && "clipboard".equals(declaredField)) {
                if (!2JT.LIZ) {
                    break Label_0161_Outer;
                }
                monitorenter(ClipboardManager.class);
                try {
                    final Object systemService = context.getSystemService((String)declaredField);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            declaredField = (Exception)ClipboardManager.class.getDeclaredField("mHandler");
                            ((AccessibleObject)declaredField).setAccessible(true);
                            ((Field)declaredField).set(systemService, new 2Lq((Handler)((Field)declaredField).get(systemService)));
                        }
                        catch (final Exception declaredField) {
                            6Nw.LIZ((Throwable)declaredField, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    2JT.LIZ = false;
                    monitorexit(ClipboardManager.class);
                    break Label_0176;
                }
                finally {
                    monitorexit(ClipboardManager.class);
                    MethodCollector.o(9704);
                }
            }
            while (true) {
                if (2JT.LIZIZ || !"connectivity".equals(declaredField)) {
                    break Label_0161;
                }
                try {
                    new 6G9().LIZ();
                    2JT.LIZIZ = true;
                    context = (Context)context.getSystemService((String)declaredField);
                    MethodCollector.o(9704);
                    return context;
                    context = (Context)context.getSystemService((String)declaredField);
                    continue Label_0161_Outer;
                    context = (Context)context.getSystemService((String)declaredField);
                    continue Label_0161_Outer;
                }
                finally {
                    continue;
                }
                break;
            }
            break;
        }
    }
    
    private boolean LIZJ() {
        final 1Dn lizj = 1hk.LIZLLL().LIZJ;
        return lizj != null && lizj.LIZJ;
    }
    
    public final void LIZ(final Context lizlll) {
        synchronized (this) {
            MethodCollector.i(9701);
            this.LIZLLL = lizlll;
            if (!this.LIZJ() || this.LIZJ) {
                MethodCollector.o(9701);
                return;
            }
            final ConnectivityManager connectivityManager = (ConnectivityManager)LIZ(1hk.LIZLLL().LIZIZ, "connectivity");
            if (connectivityManager == null) {
                1hk.LIZLLL().LIZJ.LIZJ = false;
                MethodCollector.o(9701);
                return;
            }
            final NetworkRequest$Builder addCapability = new NetworkRequest$Builder().addTransportType(0).addTransportType(1).addCapability(12);
            if (Build$VERSION.SDK_INT >= 28) {
                addCapability.addCapability(21);
            }
            if (Build$VERSION.SDK_INT >= 23) {
                addCapability.addCapability(16);
            }
            connectivityManager.registerNetworkCallback(addCapability.build(), (ConnectivityManager$NetworkCallback)new a((byte)0));
            this.LIZJ = true;
            MethodCollector.o(9701);
        }
    }
    
    public final void LIZ(final Network network) {
        this.LIZIZ.isEmpty();
        for (final Network network2 : this.LIZIZ) {
            if (network2.equals((Object)network)) {
                this.LIZIZ.remove(network2);
                break;
            }
        }
        this.LIZIZ.isEmpty();
    }
    
    public final boolean LIZ() {
        final boolean lizj = this.LIZJ();
        final boolean b = true;
        final boolean b2 = false;
        boolean b3;
        if (lizj) {
            b3 = (this.LIZIZ.isEmpty() ^ true);
        }
        else {
            try {
                final ConnectivityManager connectivityManager = (ConnectivityManager)LIZ(this.LIZLLL, "connectivity");
                b3 = b2;
                if (connectivityManager != null) {
                    final NetworkInfo liz = LIZ(connectivityManager);
                    b3 = (liz != null && liz.isConnected() && b);
                }
            }
            catch (final Exception ex) {
                0II.LIZ(ex);
                b3 = b2;
            }
        }
        return b3;
    }
    
    public final int LIZIZ() {
        if (this.LIZJ()) {
            if (this.LIZIZ.isEmpty()) {
                return -1;
            }
        }
        else if (!this.LIZ()) {
            return -1;
        }
        final ConnectivityManager connectivityManager = (ConnectivityManager)LIZ(this.LIZLLL, "connectivity");
        if (connectivityManager == null) {
            return -1;
        }
        final NetworkInfo liz = LIZ(connectivityManager);
        if (liz == null || !liz.isConnected()) {
            return -1;
        }
        final int type = liz.getType();
        if (type == 1) {
            return 0;
        }
        if (type != 0) {
            return 1;
        }
        switch (liz.getSubtype()) {
            default: {
                final String subtypeName = liz.getSubtypeName();
                if (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) {
                    return 3;
                }
                return 1;
            }
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16: {
                return 2;
            }
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17: {
                return 3;
            }
            case 13:
            case 18: {
                return 4;
            }
            case 20: {
                return 5;
            }
        }
    }
    
    public final class a extends ConnectivityManager$NetworkCallback
    {
        static {
            Covode.recordClassIndex(4466);
        }
        
        public final void onAvailable(final Network network) {
            super.onAvailable(network);
            final 0Rx liz = 0Rx.this;
            final boolean empty = liz.LIZIZ.isEmpty();
            final Iterator<Network> iterator = liz.LIZIZ.iterator();
            while (true) {
                while (iterator.hasNext()) {
                    if (iterator.next().equals((Object)network)) {
                        final boolean empty2 = liz.LIZIZ.isEmpty();
                        if (empty && (empty2 ^ true)) {
                            for (final 1Do 1Do : 1hk.LIZLLL().LIZLLL.LIZ.values()) {
                                if (1Do != null) {
                                    0Rg.LIZ(new 1hf(1Do));
                                }
                            }
                        }
                        return;
                    }
                }
                liz.LIZIZ.add(network);
                continue;
            }
        }
        
        public final void onLosing(final Network network, final int n) {
            super.onLosing(network, n);
            0Rx.this.LIZ(network);
        }
        
        public final void onLost(final Network network) {
            super.onLost(network);
            0Rx.this.LIZ(network);
        }
        
        public final void onUnavailable() {
            super.onUnavailable();
            0Rx.this.LIZIZ.clear();
        }
    }
}
