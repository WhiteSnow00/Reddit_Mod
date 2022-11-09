// 
// Decompiled by Procyon v0.6.0
// 

package androidx.core.app;

import android.os.BaseBundle;
import java.util.ArrayDeque;
import android.os.IInterface;
import android.content.pm.ServiceInfo;
import java.util.Map;
import android.content.pm.ResolveInfo;
import android.os.Message;
import android.os.DeadObjectException;
import android.content.Intent;
import android.util.Log;
import android.os.HandlerThread;
import java.util.HashMap;
import android.os.Handler;
import android.content.ServiceConnection;
import android.os.Handler$Callback;
import android.os.IBinder;
import android.os.RemoteException;
import b.a;
import a4.s;
import java.util.Collections;
import a4.t0;
import m3.b;
import a4.t;
import a4.e;
import java.util.Collection;
import a4.v;
import a4.p;
import java.util.Iterator;
import a4.x;
import java.util.ArrayList;
import a4.q;
import java.util.List;
import a4.o;
import android.app.NotificationChannelGroup;
import a4.u;
import android.os.Build$VERSION;
import android.app.NotificationChannel;
import android.os.Bundle;
import android.app.Notification;
import android.content.ComponentName;
import android.provider.Settings$Secure;
import java.util.HashSet;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Set;

public final class NotificationManagerCompat
{
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int MAX_SIDE_CHANNEL_SDK_VERSION = 19;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static Set<String> sEnabledNotificationListenerPackages;
    private static String sEnabledNotificationListeners;
    private static final Object sEnabledNotificationListenersLock;
    private static final Object sLock;
    private static c sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    
    static {
        sEnabledNotificationListenersLock = new Object();
        NotificationManagerCompat.sEnabledNotificationListenerPackages = new HashSet<String>();
        sLock = new Object();
    }
    
    private NotificationManagerCompat(final Context mContext) {
        this.mContext = mContext;
        this.mNotificationManager = (NotificationManager)mContext.getSystemService("notification");
    }
    
    public static NotificationManagerCompat from(final Context context) {
        return new NotificationManagerCompat(context);
    }
    
    public static Set<String> getEnabledListenerPackages(Context sEnabledNotificationListenersLock) {
        final String string = Settings$Secure.getString(sEnabledNotificationListenersLock.getContentResolver(), "enabled_notification_listeners");
        sEnabledNotificationListenersLock = (Context)NotificationManagerCompat.sEnabledNotificationListenersLock;
        monitorenter(sEnabledNotificationListenersLock);
        Label_0100: {
            if (string == null) {
                break Label_0100;
            }
            try {
                if (!string.equals(NotificationManagerCompat.sEnabledNotificationListeners)) {
                    final String[] split = string.split(":", -1);
                    final HashSet sEnabledNotificationListenerPackages = new HashSet<String>(split.length);
                    for (int length = split.length, i = 0; i < length; ++i) {
                        final ComponentName unflattenFromString = ComponentName.unflattenFromString(split[i]);
                        if (unflattenFromString != null) {
                            sEnabledNotificationListenerPackages.add(unflattenFromString.getPackageName());
                        }
                    }
                    NotificationManagerCompat.sEnabledNotificationListenerPackages = (Set<String>)sEnabledNotificationListenerPackages;
                    NotificationManagerCompat.sEnabledNotificationListeners = string;
                }
                return NotificationManagerCompat.sEnabledNotificationListenerPackages;
            }
            finally {
                monitorexit(sEnabledNotificationListenersLock);
            }
        }
    }
    
    private void pushSideChannelQueue(final d d) {
        synchronized (NotificationManagerCompat.sLock) {
            if (NotificationManagerCompat.sSideChannelManager == null) {
                NotificationManagerCompat.sSideChannelManager = new c(this.mContext.getApplicationContext());
            }
            NotificationManagerCompat.sSideChannelManager.g.obtainMessage(0, (Object)d).sendToTarget();
        }
    }
    
    private static boolean useSideChannelForNotification(final Notification notification) {
        final Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && ((BaseBundle)extras).getBoolean("android.support.useSideChannel");
    }
    
    public boolean areNotificationsEnabled() {
        return this.mNotificationManager.areNotificationsEnabled();
    }
    
    public void cancel(final int n) {
        this.cancel(null, n);
    }
    
    public void cancel(final String s, final int n) {
        this.mNotificationManager.cancel(s, n);
    }
    
    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }
    
    public void createNotificationChannel(final NotificationChannel notificationChannel) {
        if (Build$VERSION.SDK_INT >= 26) {
            u.g(this.mNotificationManager, notificationChannel);
        }
    }
    
    public void createNotificationChannel(final NotificationChannelCompat notificationChannelCompat) {
        this.createNotificationChannel(notificationChannelCompat.getNotificationChannel());
    }
    
    public void createNotificationChannelGroup(final NotificationChannelGroup notificationChannelGroup) {
        if (Build$VERSION.SDK_INT >= 26) {
            o.f(this.mNotificationManager, notificationChannelGroup);
        }
    }
    
    public void createNotificationChannelGroup(final NotificationChannelGroupCompat notificationChannelGroupCompat) {
        this.createNotificationChannelGroup(notificationChannelGroupCompat.getNotificationChannelGroup());
    }
    
    public void createNotificationChannelGroups(final List<NotificationChannelGroup> list) {
        if (Build$VERSION.SDK_INT >= 26) {
            q.f(this.mNotificationManager, (List)list);
        }
    }
    
    public void createNotificationChannelGroupsCompat(final List<NotificationChannelGroupCompat> list) {
        if (Build$VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            final ArrayList list2 = new ArrayList(list.size());
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(((NotificationChannelGroupCompat)iterator.next()).getNotificationChannelGroup());
            }
            x.c(this.mNotificationManager, list2);
        }
    }
    
    public void createNotificationChannels(final List<NotificationChannel> list) {
        if (Build$VERSION.SDK_INT >= 26) {
            o.g(this.mNotificationManager, (List)list);
        }
    }
    
    public void createNotificationChannelsCompat(final List<NotificationChannelCompat> list) {
        if (Build$VERSION.SDK_INT >= 26 && !list.isEmpty()) {
            final ArrayList list2 = new ArrayList(list.size());
            final Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                list2.add(((NotificationChannelCompat)iterator.next()).getNotificationChannel());
            }
            p.h(this.mNotificationManager, list2);
        }
    }
    
    public void deleteNotificationChannel(final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            q.e(this.mNotificationManager, s);
        }
    }
    
    public void deleteNotificationChannelGroup(final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            v.e(this.mNotificationManager, s);
        }
    }
    
    public void deleteUnlistedNotificationChannels(final Collection<String> collection) {
        if (Build$VERSION.SDK_INT >= 26) {
            for (final NotificationChannel notificationChannel : this.mNotificationManager.getNotificationChannels()) {
                if (collection.contains(notificationChannel.getId())) {
                    continue;
                }
                if (Build$VERSION.SDK_INT >= 30 && collection.contains(e.b(notificationChannel))) {
                    continue;
                }
                this.mNotificationManager.deleteNotificationChannel(notificationChannel.getId());
            }
        }
    }
    
    public int getImportance() {
        return this.mNotificationManager.getImportance();
    }
    
    public NotificationChannel getNotificationChannel(final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            return t.b(this.mNotificationManager, s);
        }
        return null;
    }
    
    public NotificationChannel getNotificationChannel(final String s, final String s2) {
        if (Build$VERSION.SDK_INT >= 30) {
            return m3.b.a(this.mNotificationManager, s, s2);
        }
        return this.getNotificationChannel(s);
    }
    
    public NotificationChannelCompat getNotificationChannelCompat(final String s) {
        if (Build$VERSION.SDK_INT >= 26) {
            final NotificationChannel notificationChannel = this.getNotificationChannel(s);
            if (notificationChannel != null) {
                return new NotificationChannelCompat(notificationChannel);
            }
        }
        return null;
    }
    
    public NotificationChannelCompat getNotificationChannelCompat(final String s, final String s2) {
        if (Build$VERSION.SDK_INT >= 26) {
            final NotificationChannel notificationChannel = this.getNotificationChannel(s, s2);
            if (notificationChannel != null) {
                return new NotificationChannelCompat(notificationChannel);
            }
        }
        return null;
    }
    
    public NotificationChannelGroup getNotificationChannelGroup(final String s) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            return t0.c(this.mNotificationManager, s);
        }
        if (sdk_INT >= 26) {
            for (final NotificationChannelGroup notificationChannelGroup : this.getNotificationChannelGroups()) {
                if (notificationChannelGroup.getId().equals(s)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }
    
    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(final String s) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 28) {
            final NotificationChannelGroup notificationChannelGroup = this.getNotificationChannelGroup(s);
            if (notificationChannelGroup != null) {
                return new NotificationChannelGroupCompat(notificationChannelGroup);
            }
        }
        else if (sdk_INT >= 26) {
            final NotificationChannelGroup notificationChannelGroup2 = this.getNotificationChannelGroup(s);
            if (notificationChannelGroup2 != null) {
                return new NotificationChannelGroupCompat(notificationChannelGroup2, (List)this.getNotificationChannels());
            }
        }
        return null;
    }
    
    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        if (Build$VERSION.SDK_INT >= 26) {
            return p.g(this.mNotificationManager);
        }
        return Collections.emptyList();
    }
    
    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 26) {
            final List<NotificationChannelGroup> notificationChannelGroups = this.getNotificationChannelGroups();
            if (!notificationChannelGroups.isEmpty()) {
                Object o;
                if (sdk_INT >= 28) {
                    o = Collections.emptyList();
                }
                else {
                    o = this.getNotificationChannels();
                }
                final ArrayList list = new ArrayList<NotificationChannelGroupCompat>(notificationChannelGroups.size());
                for (final NotificationChannelGroup notificationChannelGroup : notificationChannelGroups) {
                    if (Build$VERSION.SDK_INT >= 28) {
                        list.add(new NotificationChannelGroupCompat(notificationChannelGroup));
                    }
                    else {
                        list.add(new NotificationChannelGroupCompat(notificationChannelGroup, (List)o));
                    }
                }
                return (List<NotificationChannelGroupCompat>)list;
            }
        }
        return Collections.emptyList();
    }
    
    public List<NotificationChannel> getNotificationChannels() {
        if (Build$VERSION.SDK_INT >= 26) {
            return s.c(this.mNotificationManager);
        }
        return Collections.emptyList();
    }
    
    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        if (Build$VERSION.SDK_INT >= 26) {
            final List<NotificationChannel> notificationChannels = this.getNotificationChannels();
            if (!notificationChannels.isEmpty()) {
                final ArrayList list = new ArrayList<NotificationChannelCompat>(notificationChannels.size());
                final Iterator iterator = notificationChannels.iterator();
                while (iterator.hasNext()) {
                    list.add(new NotificationChannelCompat((NotificationChannel)iterator.next()));
                }
                return (List<NotificationChannelCompat>)list;
            }
        }
        return Collections.emptyList();
    }
    
    public void notify(final int n, final Notification notification) {
        this.notify(null, n, notification);
    }
    
    public void notify(final String s, final int n, final Notification notification) {
        if (useSideChannelForNotification(notification)) {
            this.pushSideChannelQueue((d)new a(this.mContext.getPackageName(), n, s, notification));
            this.mNotificationManager.cancel(s, n);
        }
        else {
            this.mNotificationManager.notify(s, n, notification);
        }
    }
    
    public static final class a implements d
    {
        public final String a;
        public final int b;
        public final String c;
        public final Notification d;
        
        public a(final String a, final int b, final String c, final Notification d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        @Override
        public final void a(final b.a a) throws RemoteException {
            a.r0(this.a, this.b, this.c, this.d);
        }
        
        @Override
        public final String toString() {
            final StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.b);
            sb.append(", tag:");
            return a2.b.j(sb, this.c, "]");
        }
    }
    
    public static final class b
    {
        public final ComponentName a;
        public final IBinder b;
        
        public b(final ComponentName a, final IBinder b) {
            this.a = a;
            this.b = b;
        }
    }
    
    public static final class c implements Handler$Callback, ServiceConnection
    {
        public final Context f;
        public final Handler g;
        public final HashMap h;
        public Set<String> i;
        
        public c(final Context f) {
            this.h = new HashMap();
            this.i = new HashSet<String>();
            this.f = f;
            final HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            ((Thread)handlerThread).start();
            this.g = new Handler(handlerThread.getLooper(), (Handler$Callback)this);
        }
        
        public final void a(final a a) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                final StringBuilder k = a.k("Processing component ");
                k.append(a.a);
                k.append(", ");
                k.append(a.d.size());
                k.append(" queued tasks");
                Log.d("NotifManCompat", k.toString());
            }
            if (a.d.isEmpty()) {
                return;
            }
            boolean b;
            if (a.b) {
                b = true;
            }
            else {
                final boolean bindService = this.f.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(a.a), (ServiceConnection)this, 33);
                a.b = bindService;
                if (bindService) {
                    a.e = 0;
                }
                else {
                    final StringBuilder i = a.k("Unable to bind to listener ");
                    i.append(a.a);
                    Log.w("NotifManCompat", i.toString());
                    this.f.unbindService((ServiceConnection)this);
                }
                b = a.b;
            }
            if (b && a.c != null) {
                while (true) {
                    final d d = a.d.peek();
                    if (d == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Sending task ");
                            sb.append(d);
                            Log.d("NotifManCompat", sb.toString());
                        }
                        d.a(a.c);
                        a.d.remove();
                        continue;
                    }
                    catch (final RemoteException ex) {
                        final StringBuilder j = a.k("RemoteException communicating with ");
                        j.append(a.a);
                        Log.w("NotifManCompat", j.toString(), (Throwable)ex);
                    }
                    catch (final DeadObjectException ex2) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            final StringBuilder l = a.k("Remote service has died: ");
                            l.append(a.a);
                            Log.d("NotifManCompat", l.toString());
                        }
                    }
                    break;
                }
                if (!a.d.isEmpty()) {
                    this.b(a);
                }
                return;
            }
            this.b(a);
        }
        
        public final void b(final a a) {
            if (this.g.hasMessages(3, (Object)a.a)) {
                return;
            }
            final int e = a.e + 1;
            if ((a.e = e) > 6) {
                final StringBuilder k = a.k("Giving up on delivering ");
                k.append(a.d.size());
                k.append(" tasks to ");
                k.append(a.a);
                k.append(" after ");
                k.append(a.e);
                k.append(" retries");
                Log.w("NotifManCompat", k.toString());
                a.d.clear();
                return;
            }
            final int n = (1 << e - 1) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Scheduling retry for ");
                sb.append(n);
                sb.append(" ms");
                Log.d("NotifManCompat", sb.toString());
            }
            this.g.sendMessageDelayed(this.g.obtainMessage(3, (Object)a.a), (long)n);
        }
        
        public final boolean handleMessage(final Message message) {
            final int what = message.what;
            final b.a a = null;
            if (what == 0) {
                final d d = (d)message.obj;
                final Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(this.f);
                if (!enabledListenerPackages.equals(this.i)) {
                    this.i = enabledListenerPackages;
                    final List queryIntentServices = this.f.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    final HashSet set = new HashSet();
                    for (final ResolveInfo resolveInfo : queryIntentServices) {
                        if (!enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                            continue;
                        }
                        final ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        final ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            final StringBuilder sb = new StringBuilder();
                            sb.append("Permission present on component ");
                            sb.append(componentName);
                            sb.append(", not adding listener record.");
                            Log.w("NotifManCompat", sb.toString());
                        }
                        else {
                            set.add(componentName);
                        }
                    }
                    for (final ComponentName componentName2 : set) {
                        if (!this.h.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                final StringBuilder sb2 = new StringBuilder();
                                sb2.append("Adding listener record for ");
                                sb2.append(componentName2);
                                Log.d("NotifManCompat", sb2.toString());
                            }
                            this.h.put(componentName2, new a(componentName2));
                        }
                    }
                    final Iterator iterator3 = this.h.entrySet().iterator();
                    while (iterator3.hasNext()) {
                        final Map.Entry<Object, V> entry = (Map.Entry<Object, V>)iterator3.next();
                        if (!set.contains(entry.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                final StringBuilder k = a.k("Removing listener record for ");
                                k.append(entry.getKey());
                                Log.d("NotifManCompat", k.toString());
                            }
                            final a a2 = (a)entry.getValue();
                            if (a2.b) {
                                this.f.unbindService((ServiceConnection)this);
                                a2.b = false;
                            }
                            a2.c = null;
                            iterator3.remove();
                        }
                    }
                }
                for (final a a3 : this.h.values()) {
                    a3.d.add(d);
                    this.a(a3);
                }
                return true;
            }
            if (what == 1) {
                final b b = (b)message.obj;
                final ComponentName a4 = b.a;
                final IBinder b2 = b.b;
                final a a5 = this.h.get(a4);
                if (a5 != null) {
                    final int a6 = b.a.a.a;
                    Object c;
                    if (b2 == null) {
                        c = a;
                    }
                    else {
                        final IInterface queryLocalInterface = b2.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
                        if (queryLocalInterface != null && queryLocalInterface instanceof b.a) {
                            c = queryLocalInterface;
                        }
                        else {
                            c = new b.a.a.a(b2);
                        }
                    }
                    a5.c = (b.a)c;
                    a5.e = 0;
                    this.a(a5);
                }
                return true;
            }
            if (what == 2) {
                final a a7 = this.h.get(message.obj);
                if (a7 != null) {
                    if (a7.b) {
                        this.f.unbindService((ServiceConnection)this);
                        a7.b = false;
                    }
                    a7.c = null;
                }
                return true;
            }
            if (what != 3) {
                return false;
            }
            final a a8 = this.h.get(message.obj);
            if (a8 != null) {
                this.a(a8);
            }
            return true;
        }
        
        public final void onServiceConnected(final ComponentName componentName, final IBinder binder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Connected to service ");
                sb.append(componentName);
                Log.d("NotifManCompat", sb.toString());
            }
            this.g.obtainMessage(1, (Object)new b(componentName, binder)).sendToTarget();
        }
        
        public final void onServiceDisconnected(final ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                final StringBuilder sb = new StringBuilder();
                sb.append("Disconnected from service ");
                sb.append(componentName);
                Log.d("NotifManCompat", sb.toString());
            }
            this.g.obtainMessage(2, (Object)componentName).sendToTarget();
        }
        
        public static final class a
        {
            public final ComponentName a;
            public boolean b;
            public b.a c;
            public ArrayDeque<d> d;
            public int e;
            
            public a(final ComponentName a) {
                this.b = false;
                this.d = new ArrayDeque<d>();
                this.e = 0;
                this.a = a;
            }
        }
    }
    
    public interface d
    {
        void a(final a p0) throws RemoteException;
    }
}
