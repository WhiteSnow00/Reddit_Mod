// 
// Decompiled by Procyon v0.6.0
// 

package ud2;

import android.bluetooth.BluetoothProfile;
import android.content.Intent;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import android.bluetooth.BluetoothDevice;
import ng2.h;
import android.os.Handler;
import android.os.Looper;
import td2.e;
import td2.d;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothAdapter;
import td2.c;
import android.content.Context;
import android.bluetooth.BluetoothProfile$ServiceListener;
import android.content.BroadcastReceiver;

public final class b extends BroadcastReceiver implements BluetoothProfile$ServiceListener
{
    public static final a q;
    public e f;
    public final b.b$d g;
    public final b.b$c h;
    public final Context i;
    public final c j;
    public final BluetoothAdapter k;
    public ud2.a l;
    public final td2.b m;
    public BluetoothHeadset n;
    public final d o;
    public boolean p;
    
    static {
        q = new a();
    }
    
    public b(final Context i, final td2.e j, final BluetoothAdapter k, final sd2.b b) {
        final Handler handler = new Handler(Looper.getMainLooper());
        final bu0.e e = new bu0.e(13);
        final oy0.b m = new oy0.b();
        final b.b$b o = new b.b$b(i);
        this.i = i;
        this.j = (c)j;
        this.k = k;
        this.l = null;
        this.m = (td2.b)m;
        this.n = null;
        this.o = (d)o;
        this.p = false;
        this.f = (e)b.e.b$e$e.a;
        this.g = new b.b$d(this, j, b, handler, e);
        this.h = new b.b$c(this, j, b, handler, e);
    }
    
    public final void a() {
        if (ng2.e.a((Object)this.f, (Object)e.b$e$a.a)) {
            ((ud2.c)this.h).b();
        }
        else {
            final c j = this.j;
            final StringBuilder t = a.t("Cannot deactivate when in the ");
            t.append(ng2.h.a((Class)this.f.getClass()).n());
            t.append(" state");
            j.a(t.toString());
        }
    }
    
    public final String b() {
        final BluetoothHeadset n = this.n;
        final String s = null;
        final String s2 = null;
        String s3 = s;
        if (n != null) {
            final List connectedDevices = n.getConnectedDevices();
            s3 = s;
            if (connectedDevices != null) {
                if (connectedDevices.size() > 1 && this.c()) {
                    while (true) {
                        for (final Object next : connectedDevices) {
                            if (n.isAudioConnected((BluetoothDevice)next)) {
                                final BluetoothDevice bluetoothDevice = (BluetoothDevice)next;
                                s3 = s2;
                                if (bluetoothDevice != null) {
                                    s3 = bluetoothDevice.getName();
                                }
                                final c j = this.j;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Device size > 1 with device name: ");
                                sb.append(s3);
                                j.d("BluetoothHeadsetManager", sb.toString());
                                return s3;
                            }
                        }
                        Object next = null;
                        continue;
                    }
                }
                if (connectedDevices.size() == 1) {
                    final Object s4 = CollectionsKt___CollectionsKt.S4(connectedDevices);
                    ng2.e.e(s4, "devices.first()");
                    s3 = ((BluetoothDevice)s4).getName();
                    final c i = this.j;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Device size 1 with device name: ");
                    sb2.append(s3);
                    i.d("BluetoothHeadsetManager", sb2.toString());
                }
                else {
                    this.j.d("BluetoothHeadsetManager", "Device size 0");
                    s3 = s;
                }
            }
        }
        return s3;
    }
    
    public final boolean c() {
        final BluetoothHeadset n = this.n;
        boolean booleanValue = false;
        if (n != null) {
            final List connectedDevices = n.getConnectedDevices();
            Boolean value;
            if (connectedDevices != null) {
                boolean b = false;
                Label_0077: {
                    if (!connectedDevices.isEmpty()) {
                        final Iterator iterator = connectedDevices.iterator();
                        while (iterator.hasNext()) {
                            if (n.isAudioConnected((BluetoothDevice)iterator.next())) {
                                b = true;
                                break Label_0077;
                            }
                        }
                    }
                    b = false;
                }
                value = b;
            }
            else {
                value = null;
            }
            booleanValue = booleanValue;
            if (value != null) {
                booleanValue = value;
            }
        }
        return booleanValue;
    }
    
    public final boolean d() {
        final BluetoothHeadset n = this.n;
        if (n != null) {
            final List connectedDevices = n.getConnectedDevices();
            Boolean value;
            if (connectedDevices != null) {
                value = (connectedDevices.isEmpty() ^ true);
            }
            else {
                value = null;
            }
            if (value != null) {
                return value;
            }
        }
        return false;
    }
    
    public final void e(final e f) {
        ng2.e.f((Object)f, "value");
        if (ng2.e.a((Object)this.f, (Object)f) ^ true) {
            this.f = f;
            final c j = this.j;
            final StringBuilder t = a.t("Headset state changed to ");
            t.append(ng2.h.a((Class)this.f.getClass()).n());
            j.d("BluetoothHeadsetManager", t.toString());
            if (ng2.e.a((Object)f, (Object)e.b$e$e.a)) {
                ((ud2.c)this.g).a();
            }
        }
    }
    
    public final void onReceive(final Context context, final Intent intent) {
        ng2.e.f((Object)context, "context");
        ng2.e.f((Object)intent, "intent");
        final String action = intent.getAction();
        final boolean a = ng2.e.a((Object)action, (Object)"android.bluetooth.headset.profile.action.CONNECTION_STATE_CHANGED");
        final boolean b = false;
        if (a || ng2.e.a((Object)action, (Object)"android.bluetooth.headset.profile.action.AUDIO_STATE_CHANGED")) {
            td2.a b2 = this.m.b(intent);
            Label_0142: {
                if (b2 != null) {
                    final Integer c = b2.c;
                    boolean b3 = false;
                    Label_0133: {
                        if (c != null) {
                            final int intValue = c.intValue();
                            if (intValue == 1032 || intValue == 1028 || intValue == 1056 || intValue == 1048 || intValue == 7936) {
                                b3 = true;
                                break Label_0133;
                            }
                        }
                        b3 = false;
                    }
                    if (b3) {
                        break Label_0142;
                    }
                }
                b2 = null;
            }
            if (b2 != null) {
                final int intExtra = intent.getIntExtra("android.bluetooth.profile.extra.STATE", 0);
                if (intExtra != 0) {
                    if (intExtra != 2) {
                        if (intExtra != 10) {
                            if (intExtra == 12) {
                                final c j = this.j;
                                final StringBuilder sb = new StringBuilder();
                                sb.append("Bluetooth audio connected on device ");
                                sb.append(b2);
                                j.d("BluetoothHeadsetManager", sb.toString());
                                ((ud2.c)this.g).a();
                                this.e((e)e.b$e$a.a);
                                final ud2.a l = this.l;
                                if (l != null) {
                                    l.b(null);
                                }
                            }
                        }
                        else {
                            final c i = this.j;
                            final StringBuilder sb2 = new StringBuilder();
                            sb2.append("Bluetooth audio disconnected on device ");
                            sb2.append(b2);
                            i.d("BluetoothHeadsetManager", sb2.toString());
                            ((ud2.c)this.h).a();
                            int n = b ? 1 : 0;
                            if (ng2.e.a((Object)this.f, (Object)e.b$e$a.a)) {
                                n = (b ? 1 : 0);
                                if (this.d()) {
                                    n = (b ? 1 : 0);
                                    if (!this.c()) {
                                        n = 1;
                                    }
                                }
                            }
                            if (n != 0) {
                                ((ud2.c)this.g).b();
                            }
                            final ud2.a k = this.l;
                            if (k != null) {
                                k.b(null);
                            }
                        }
                    }
                    else {
                        final c m = this.j;
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Bluetooth headset ");
                        sb3.append(b2);
                        sb3.append(" connected");
                        m.d("BluetoothHeadsetManager", sb3.toString());
                        if (!this.c()) {
                            this.e((e)e.b$e$d.a);
                        }
                        final ud2.a l2 = this.l;
                        if (l2 != null) {
                            l2.b(b2.b);
                        }
                    }
                }
                else {
                    final c j2 = this.j;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Bluetooth headset ");
                    sb4.append(b2);
                    sb4.append(" disconnected");
                    j2.d("BluetoothHeadsetManager", sb4.toString());
                    Object o;
                    if (this.c()) {
                        o = e.b$e$a.a;
                    }
                    else if (this.d()) {
                        o = e.b$e$d.a;
                    }
                    else {
                        o = e.b$e$e.a;
                    }
                    this.e((e)o);
                    final ud2.a l3 = this.l;
                    if (l3 != null) {
                        l3.b(null);
                    }
                }
            }
        }
    }
    
    public final void onServiceConnected(final int n, final BluetoothProfile bluetoothProfile) {
        ng2.e.f((Object)bluetoothProfile, "bluetoothProfile");
        final BluetoothHeadset n2 = (BluetoothHeadset)bluetoothProfile;
        this.n = n2;
        final List connectedDevices = n2.getConnectedDevices();
        ng2.e.e((Object)connectedDevices, "bluetoothProfile.connectedDevices");
        for (final BluetoothDevice bluetoothDevice : connectedDevices) {
            final c j = this.j;
            final StringBuilder sb = new StringBuilder();
            sb.append("Bluetooth ");
            ng2.e.e((Object)bluetoothDevice, "device");
            sb.append(bluetoothDevice.getName());
            sb.append(" connected");
            j.d("BluetoothHeadsetManager", sb.toString());
        }
        if (this.d()) {
            if (!this.c()) {
                this.e((e)e.b$e$d.a);
            }
            final ud2.a l = this.l;
            if (l != null) {
                l.b(this.b());
            }
        }
    }
    
    public final void onServiceDisconnected(final int n) {
        this.j.d("BluetoothHeadsetManager", "Bluetooth disconnected");
        this.e((e)e.b$e$e.a);
        final ud2.a l = this.l;
        if (l != null) {
            l.b(null);
        }
    }
    
    public static final class a
    {
    }
    
    public abstract static class e
    {
    }
}
