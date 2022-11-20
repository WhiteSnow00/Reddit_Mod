// 
// Decompiled by Procyon v0.6.0
// 

package com.twilio.audioswitch;

import kotlin.Metadata;
import android.media.AudioDeviceInfo;
import ud2.b$e$e;
import android.content.BroadcastReceiver;
import android.bluetooth.BluetoothProfile;
import sd2.a$c;
import sd2.a$d;
import sd2.a$b;
import ud2.b$e$c;
import ud2.b$e$d;
import sd2.a$a;
import android.media.AudioFocusRequest;
import a4.t;
import android.os.Build$VERSION;
import java.util.Iterator;
import dg2.m;
import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import java.util.Map;
import java.util.LinkedHashMap;
import dg2.s;
import sd2.g;
import android.bluetooth.BluetoothAdapter;
import android.media.AudioManager$OnAudioFocusChangeListener;
import android.media.AudioManager;
import ng2.e;
import sd2.d;
import android.content.Context;
import sd2.h;
import java.util.ArrayList;
import cg2.j;
import sd2.a;
import java.util.List;
import mg2.p;
import sd2.b;
import td2.c;
import cg2.f;

public final class AudioSwitch
{
    public static final f o;
    public c a;
    public final sd2.b b;
    public final vd2.b c;
    public p<? super List<? extends sd2.a>, ? super sd2.a, j> d;
    public sd2.a e;
    public sd2.a f;
    public boolean g;
    public final ArrayList<sd2.a> h;
    public ud2.b i;
    public final List<Class<? extends sd2.a>> j;
    public State k;
    public final sd2.f l;
    public final h m;
    public final ArrayList n;
    
    static {
        new b();
        o = kotlin.a.b((mg2.a)AudioSwitch$Companion$defaultPreferredDeviceList$2.INSTANCE);
    }
    
    public AudioSwitch() {
        throw null;
    }
    
    public AudioSwitch(Context applicationContext, final List list) {
        final d a = sd2.d.a;
        ng2.e.f((Object)list, "preferredDeviceList");
        applicationContext = applicationContext.getApplicationContext();
        ng2.e.e((Object)applicationContext, "context.applicationContext");
        final int n = 0;
        final td2.e a2 = new td2.e(false);
        final Object systemService = applicationContext.getSystemService("audio");
        if (systemService == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
        }
        final sd2.b b = new sd2.b(applicationContext, a2, (AudioManager)systemService, (AudioManager$OnAudioFocusChangeListener)a);
        final vd2.b c = new vd2.b(applicationContext, a2);
        final ud2.b.a q = ud2.b.q;
        final BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        q.getClass();
        ud2.b i;
        if (defaultAdapter != null) {
            i = new ud2.b(applicationContext, a2, defaultAdapter, b);
        }
        else {
            a2.d("BluetoothHeadsetManager", "Bluetooth is not supported on this device");
            i = null;
        }
        this.a = (c)new td2.e(false);
        final ArrayList<sd2.a> list2 = new ArrayList<sd2.a>();
        this.h = list2;
        this.k = State.STOPPED;
        this.l = new sd2.f(this);
        this.m = new h(this);
        this.n = list2;
        this.a = (c)a2;
        this.b = b;
        this.c = c;
        this.i = i;
        final Map q2 = zd.b.Q((s)new g(list));
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (final Map.Entry<K, Number> entry : q2.entrySet()) {
            final int intValue = entry.getValue().intValue();
            boolean b2 = true;
            if (intValue <= 1) {
                b2 = false;
            }
            if (b2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            List k = null;
            Label_0461: {
                if (!list.isEmpty()) {
                    final f o = AudioSwitch.o;
                    if (!ng2.e.a((Object)list, (Object)o.getValue())) {
                        final ArrayList j5 = CollectionsKt___CollectionsKt.J5((Collection)o.getValue());
                        j5.removeAll(list);
                        final Iterator iterator2 = list.iterator();
                        int n2 = n;
                        while (true) {
                            k = j5;
                            if (!iterator2.hasNext()) {
                                break Label_0461;
                            }
                            final Object next = iterator2.next();
                            if (n2 < 0) {
                                cg.d.a4();
                                throw null;
                            }
                            j5.add(n2, next);
                            ++n2;
                        }
                    }
                }
                k = (List)AudioSwitch.o.getValue();
            }
            this.j = k;
            a2.d("AudioSwitch", "AudioSwitch(1.1.5)");
            final StringBuilder sb = new StringBuilder();
            sb.append("Preferred device list = ");
            final ArrayList list3 = new ArrayList<String>(dg2.m.u4((Iterable)k, 10));
            final Iterator iterator3 = k.iterator();
            while (iterator3.hasNext()) {
                list3.add(((Class)iterator3.next()).getSimpleName());
            }
            sb.append(list3);
            a2.d("AudioSwitch", sb.toString());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
    
    public final void a() {
        final int n = sd2.e.c[this.k.ordinal()];
        if (n != 1) {
            if (n != 2) {
                if (n == 3) {
                    throw new IllegalStateException();
                }
            }
            else {
                final sd2.a e = this.e;
                if (e != null) {
                    this.b(e);
                }
            }
        }
        else {
            final sd2.b b = this.b;
            b.a = b.g.getMode();
            b.b = b.g.isMicrophoneMute();
            b.c = b.g.isSpeakerphoneOn();
            this.b.g.setMicrophoneMute(false);
            final sd2.b b2 = this.b;
            b2.h.getClass();
            if (Build$VERSION.SDK_INT >= 26) {
                final sd2.c i = b2.i;
                final AudioManager$OnAudioFocusChangeListener j = b2.j;
                i.getClass();
                final AudioFocusRequest a = sd2.c.a(j);
                b2.d = a;
                t.l(b2.g, a);
            }
            else {
                b2.g.requestAudioFocus(b2.j, 0, 2);
            }
            b2.g.setMode(3);
            final sd2.a e2 = this.e;
            if (e2 != null) {
                this.b(e2);
            }
            this.k = State.ACTIVATED;
        }
    }
    
    public final void b(final sd2.a a) {
        if (a instanceof a$a) {
            this.b.g.setSpeakerphoneOn(false);
            final ud2.b i = this.i;
            if (i != null) {
                if (i.o.a()) {
                    if (!ng2.e.a((Object)i.f, (Object)b$e$d.a) && !ng2.e.a((Object)i.f, (Object)b$e$c.a)) {
                        final c j = i.j;
                        final StringBuilder t = a.t("Cannot activate when in the ");
                        t.append(ng2.h.a((Class)i.f.getClass()).n());
                        t.append(" state");
                        j.a(t.toString());
                    }
                    else {
                        ((ud2.c)i.g).b();
                    }
                }
                else {
                    i.j.a("Bluetooth unsupported, permissions not granted");
                }
            }
        }
        else {
            if (!(a instanceof a$b)) {
                if (!(a instanceof a$d)) {
                    if (!(a instanceof a$c)) {
                        return;
                    }
                    this.b.g.setSpeakerphoneOn(true);
                    final ud2.b k = this.i;
                    if (k != null) {
                        k.a();
                    }
                    return;
                }
            }
            this.b.g.setSpeakerphoneOn(false);
            final ud2.b l = this.i;
            if (l != null) {
                l.a();
            }
        }
    }
    
    public final void c() {
        final ud2.b i = this.i;
        if (i != null) {
            if (i.o.a()) {
                i.l = null;
                i.k.closeProfileProxy(1, (BluetoothProfile)i.n);
                if (i.p) {
                    i.i.unregisterReceiver((BroadcastReceiver)i);
                    i.p = false;
                }
            }
            else {
                i.j.a("Bluetooth unsupported, permissions not granted");
            }
        }
        final vd2.b c = this.c;
        c.a = null;
        c.b.unregisterReceiver((BroadcastReceiver)c);
        this.d = null;
        this.k = State.STOPPED;
    }
    
    public final void d() {
        if (sd2.e.d[this.k.ordinal()] == 1) {
            final ud2.b i = this.i;
            if (i != null) {
                i.a();
            }
            final sd2.b b = this.b;
            b.g.setMode(b.a);
            b.g.setMicrophoneMute(b.b);
            b.g.setSpeakerphoneOn(b.c);
            b.h.getClass();
            if (Build$VERSION.SDK_INT >= 26) {
                final AudioFocusRequest d = b.d;
                if (d != null) {
                    a4.s.k(b.g, d);
                }
            }
            else {
                b.g.abandonAudioFocus(b.j);
            }
            this.k = State.STARTED;
        }
    }
    
    public final void e(final String s) {
        final ArrayList<sd2.a> h = this.h;
        final ArrayList list = new ArrayList<sd2.a>(dg2.m.u4((Iterable)h, 10));
        final Iterator<sd2.a> iterator = h.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next());
        }
        final a a = new a(list, this.e);
        this.h.clear();
        final Iterator<Object> iterator2 = this.j.iterator();
        sd2.a a2;
        int n;
        while (true) {
            final boolean hasNext = iterator2.hasNext();
            a2 = null;
            final sd2.a a3 = null;
            final boolean b = true;
            n = 0;
            if (!hasNext) {
                break;
            }
            final Class clazz = iterator2.next();
            if (ng2.e.a((Object)clazz, (Object)a$a.class)) {
                final ud2.b i = this.i;
                if (i == null) {
                    continue;
                }
                Object o;
                if (i.o.a()) {
                    o = a3;
                    if (ng2.e.a((Object)i.f, (Object)b$e$e.a) ^ true) {
                        String b2;
                        if (s != null) {
                            b2 = s;
                        }
                        else {
                            b2 = i.b();
                        }
                        if (b2 != null) {
                            o = new a$a(b2);
                        }
                        else {
                            o = new a$a(0);
                        }
                    }
                }
                else {
                    i.j.a("Bluetooth unsupported, permissions not granted");
                    o = a3;
                }
                if (o == null) {
                    continue;
                }
                this.h.add((sd2.a)o);
            }
            else if (ng2.e.a((Object)clazz, (Object)a$d.class)) {
                if (!this.g) {
                    continue;
                }
                this.h.add((sd2.a)new a$d(0));
            }
            else if (ng2.e.a((Object)clazz, (Object)a$b.class)) {
                final sd2.b b3 = this.b;
                final boolean hasSystemFeature = b3.e.getPackageManager().hasSystemFeature("android.hardware.telephony");
                if (hasSystemFeature) {
                    b3.f.d("AudioDeviceManager", "Earpiece available");
                }
                if (!hasSystemFeature || this.g) {
                    continue;
                }
                this.h.add((sd2.a)new a$b(0));
            }
            else {
                if (!ng2.e.a((Object)clazz, (Object)a$c.class)) {
                    continue;
                }
                final sd2.b b4 = this.b;
                b4.h.getClass();
                int n2 = 0;
                Label_0529: {
                    if (b4.e.getPackageManager().hasSystemFeature("android.hardware.audio.output")) {
                        for (final AudioDeviceInfo audioDeviceInfo : b4.g.getDevices(2)) {
                            ng2.e.e((Object)audioDeviceInfo, "device");
                            if (audioDeviceInfo.getType() == 2) {
                                b4.f.d("AudioDeviceManager", "Speakerphone available");
                                n2 = (b ? 1 : 0);
                                break Label_0529;
                            }
                        }
                        n2 = 0;
                    }
                    else {
                        b4.f.d("AudioDeviceManager", "Speakerphone available");
                        n2 = (b ? 1 : 0);
                    }
                }
                if (n2 == 0) {
                    continue;
                }
                this.h.add((sd2.a)new a$c(0));
            }
        }
        final c a4 = this.a;
        final StringBuilder t = a.t("Available AudioDevice list updated: ");
        t.append(this.n);
        a4.d("AudioSwitch", t.toString());
        final ArrayList<sd2.a> h2 = this.h;
        final sd2.a f = this.f;
        boolean contains = false;
        Label_0686: {
            Label_0683: {
                if (f != null) {
                    if (f instanceof a$a) {
                        while (true) {
                            for (final sd2.a next : h2) {
                                if (next instanceof a$a) {
                                    final sd2.a f2 = next;
                                    if (f2 != null) {
                                        this.f = f2;
                                        contains = true;
                                        break Label_0686;
                                    }
                                    break Label_0683;
                                }
                            }
                            sd2.a next = null;
                            continue;
                        }
                    }
                    contains = h2.contains(f);
                    break Label_0686;
                }
            }
            contains = false;
        }
        if (!contains) {
            this.f = null;
        }
        final c a5 = this.a;
        final StringBuilder t2 = a.t("Current user selected AudioDevice = ");
        t2.append(this.f);
        a5.d("AudioSwitch", t2.toString());
        sd2.a f3 = this.f;
        if (f3 == null) {
            f3 = a2;
            if (this.h.size() > 0) {
                final sd2.a value = this.h.get(0);
                ng2.e.e((Object)value, "mutableAudioDevices[0]");
                final sd2.a a6 = f3 = value;
                if (a6 instanceof a$a) {
                    final ud2.b k = this.i;
                    f3 = a6;
                    if (k != null) {
                        int a7;
                        if (k.o.a()) {
                            a7 = (ng2.e.a((Object)k.f, (Object)b$e$c.a) ? 1 : 0);
                        }
                        else {
                            k.j.a("Bluetooth unsupported, permissions not granted");
                            a7 = n;
                        }
                        f3 = a6;
                        if (a7 == 1) {
                            f3 = this.h.get(1);
                        }
                    }
                }
            }
        }
        this.e = f3;
        if (this.k == State.ACTIVATED) {
            this.a();
        }
        if (ng2.e.a((Object)new a(this.h, this.e), (Object)a) ^ true) {
            final p<? super List<? extends sd2.a>, ? super sd2.a, j> d = this.d;
            if (d != null) {
                final j l = (j)d.invoke((Object)this.h, (Object)this.e);
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006" }, d2 = { "Lcom/twilio/audioswitch/AudioSwitch$State;", "", "(Ljava/lang/String;I)V", "STARTED", "ACTIVATED", "STOPPED", "audioswitch_release" }, k = 1, mv = { 1, 4, 1 })
    public enum State
    {
        private static final State[] $VALUES;
        
        ACTIVATED, 
        STARTED, 
        STOPPED;
    }
    
    public static final class a
    {
        public final List<sd2.a> a;
        public final sd2.a b;
        
        public a(final ArrayList a, final sd2.a b) {
            e.f((Object)a, "audioDeviceList");
            this.a = a;
            this.b = b;
        }
        
        @Override
        public final boolean equals(final Object o) {
            if (this != o) {
                if (o instanceof a) {
                    final a a = (a)o;
                    if (ng2.e.a((Object)this.a, (Object)a.a) && ng2.e.a((Object)this.b, (Object)a.b)) {
                        return true;
                    }
                }
                return false;
            }
            return true;
        }
        
        @Override
        public final int hashCode() {
            final List<sd2.a> a = this.a;
            int hashCode = 0;
            int hashCode2;
            if (a != null) {
                hashCode2 = a.hashCode();
            }
            else {
                hashCode2 = 0;
            }
            final sd2.a b = this.b;
            if (b != null) {
                hashCode = b.hashCode();
            }
            return hashCode2 * 31 + hashCode;
        }
        
        @Override
        public final String toString() {
            final StringBuilder t = a.t("AudioDeviceState(audioDeviceList=");
            t.append(this.a);
            t.append(", selectedAudioDevice=");
            t.append(this.b);
            t.append(")");
            return t.toString();
        }
    }
    
    public static final class b
    {
    }
}
